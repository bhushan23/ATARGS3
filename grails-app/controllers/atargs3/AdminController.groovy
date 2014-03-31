
package atargs3

import groovy.sql.Sql

import atargs3.Reception

import java.text.SimpleDateFormat
class AdminController {
	
	def beforeInterceptor =[action:this.&checkuserlogin]
	
	def checkuserlogin(){
		print "admin beforeinceptor "+session['usertype']
	if(!String.valueOf(session['usertype']).equals("ADMIN") )
		{
			print "no authenticated user"
			redirect(controller:'Login',action:'login')
		}
	
		print "after admin beforeinceptor"
	}
	def index() {
		def db=new Sql(dataSource)
		
		Date lower=new Date()
		Date upper=lower+1
		
		lower.putAt(Calendar.HOUR_OF_DAY, 0)
		upper.putAt(Calendar.HOUR_OF_DAY, 0)
		lower.putAt(Calendar.MINUTE, 0)
		upper.putAt(Calendar.MINUTE, 0)
		lower.putAt(Calendar.SECOND, 0)
		upper.putAt(Calendar.SECOND, 0)
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
		SimpleDateFormat sdf1=new SimpleDateFormat("HH:mm:ss")
		lower=sdf.parse(sdf.format(lower))
		upper=sdf.parse(sdf.format(upper))
		Date d=new Date()
		
		//d=sdf1.parse(sdf.format(d))
		print d.getTimeString()
		def result=db.rows("Select * from patient_details Where confirmed_date>=${lower} AND confirmed_date < ${upper}")
		int i=0
		String str
		
		print(result.size)
		while(i<result.size){
			print(result.size)
			str=result[i].scanof
			result[i].scanof=""
		   def scan=str.split(";")
		   int j=0
		   if(!scan[0].equalsIgnoreCase("")){
			   while(j<scan.length){
				   def getValue=ScanInformation.get(Integer.parseInt(scan[j]))
				   result[i].scanof=result[i].scanof.concat(getValue.info+";")
				   j++
			   }
		   }
			i++;
		}
		[result:result]
		
	}
	static scaffold=Admin
	
	def dataSource
	def db
	int i,k
	def getNewApp() {
		db=new Sql(dataSource)
		ArrayList result=db.rows("Select * from patient_details Where confirmed_date is null")
		/*i=0
		while(i<result.size){
			
			if(result[i].confirmed_flag==1){
				result.remove(i)
			}
			else
			i++
			
		}*/
		[res:result]
		
	}
	
	def confirmApp(){
		String[] a=params.get("p").toString().split(",")
		def temp=PatientDetails.get(a[0]);
		def confirmed_priority=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(a[1])
		def db=new Sql(dataSource)
		ArrayList result=db.rows("Select * from patient_details Where machine = ${temp.machine} AND confirmed_date = ${confirmed_priority}")
		if(result.isEmpty()){		//exclusive priority
			temp.confirmedDate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(a[1])
			temp.save();
			print "Appointment confirmed"
			SendsmsController.smslane_single_no("91"+temp.mobile,"your Appointment of date ${temp.confirmedDate} has been confirmed. Please Come 15 minutes before your appointment. Please bring Form provided by your Referral Doctor. ")
			//send sms regarding confirmation appointment date
			redirect(action:"getNewApp");
		}
		//temp.confirmedFlag=1
		else{
			result=db.rows("Select confirmed_date from patient_details Where machine = ${temp.machine} AND confirmed_date is not null")
			if(!result.isEmpty()){
				Date[] prio=new Date[3]
				prio[0]=temp.priority1
				prio[1]=temp.priority2
				prio[2]=temp.priority3
				i=0
				while(i<3){
					j=0
					while(j<result.size){
						if(result[j].confirmed_date==prio[i])
							break
						else
							j++
					}
					if(j<result.size)
					i++
					else
					break				//one of the 3 priorities gets confirmed
					
				}
				if(i<3){				//one of the 3 priorities gets confirmed
					temp.confirmedDate=prio[i]   // priority i gets confirmed
					temp.save()
					print "Appointment confirmed"
					SendsmsController.smslane_single_no("91"+temp.mobile,"your Appointment of date ${temp.confirmedDate} has been confirmed. Please Come 15 minutes before your appointment. Please bring Form provided by your Referral Doctor. ")
					//send sms regarding confirmation appointment date
					redirect(action:"getNewApp")
				}
				else{
					//send sms that patient has to get appointment again
					print "Sorry"
					SendsmsController.smslane_single_no("91"+temp.mobile,"Sorry,your appointment for ${temp.machine} scan has not been confirmed.Please call the customer care.")
					temp.delete();
					redirect(action:"getNewApp")
				}
				}
		}

	}
	
	def rejectApp() {
		def id = params["p"]
		def pd = PatientDetails.get(Integer.parseInt(id))
		SendsmsController.smslane_single_no("91"+pd.mobile,"Sorry,your appointment for ${pd.machine} scan has been confirmed.Please call the customer care.")
		pd.delete();
		redirect(action:"getNewApp");
		//send sms that patient has to get appointment again

	}
	
	def manageApp(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
		db=new Sql(dataSource)
		ArrayList result=db.rows("Select * from patient_details Where confirmed_date is not null")
		i=0
		
		while(i<result.size){
			k=(sdf.format(sdf.parse(result[i].confirmed_date.toString()))).compareTo(sdf.format(new Date()))
			if(k<0){
				result.remove(i)
			}
			else
			i++
		}
		[confirmedPatients:result]
	}
	
	
	
	int j,l
	def changeApp(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
		String[] a=params.get("p").toString().split(",")
		def temp=PatientDetails.get(a[0]);
		db=new Sql(dataSource)
		i=1
		ArrayList result=new ArrayList()
		while(i<4){
		result=db.rows("Select confirmed_date from patient_details Where machine = ${temp.machine} AND confirmed_date = ${sdf.parse(a[i])}")
		if(result.isEmpty())
		break
		else
		i++
		}
		/*if(!result.isEmpty()){
		i=1
		while(i<4){
			j=0
			while(j<result.size){
				if(result[j].confirmed_date==sdf.parse(a[i]))
					break
				else
					j++
			}
			if(j<result.size)
			i++
			else
			break				//one of the 3 priorities gets confirmed
			
		}
		if(i<4){				//one of the 3 priorities gets confirmed
			temp.confirmedDate=sdf.parse(a[i])   // priority i gets confirmed
			temp.save()
			print "Appointment changed"
			//send sms regarding change of appointment date
			redirect(action:"manageApp")
		}
		else{
			//send sms that patient has to get appointment again
			print "Sorry"
			temp.delete();
			redirect(action:"manageApp")
		}
		}*/
		
		if(i<4){				//one of the 3 priorities gets confirmed
			temp.confirmedDate=sdf.parse(a[i])   // priority i gets confirmed
			temp.save()
			print "Appointment changed"
			SendsmsController.smslane_single_no("91"+temp.mobile,"Sorry,your appointment for ${temp.machine} scan has  been changed.Your appointment has been scheduled at ${temp.confirmedDate}.")
			//send sms regarding change of appointment date
			redirect(action:"manageApp")
		}
		else{
			//send sms that patient has to get appointment again
			print "Sorry"
			SendsmsController.smslane_single_no("91"+temp.mobile,"Sorry,your appointment for ${temp.machine} scan has been rejected.Please call the customer care.")
			temp.delete();
			redirect(action:"manageApp")
		}

		
		
	}
	
	def manageReceptionAccounts(){
		def db_recp=new Sql(dataSource)
		def temp=db_recp.rows("Select * from Reception ")
		[notConfirmed:temp]
		
		//def temp1=db_recp.rows("Select * from Reception Where confirmed_flag is null")
	}
	
	def confirmReceptionAcc(){
		def temp=Reception.get(params["p"])
		temp.confirmedFlag=1
		temp.save()
		redirect(action:"manageReceptionAccounts")
	}
	
	def deleteReceptionAcc(){
		def temp=Reception.get(params["p"])
		temp.delete();
		redirect(action:"manageReceptionAccounts")
	}
	
	def manageDoctorAccounts(){
		def db_recp=new Sql(dataSource)
		def temp=db_recp.rows("Select * from doctor ")
		[notConfirmed:temp]
		
		//def temp1=db_recp.rows("Select * from Reception Where confirmed_flag is null")
	}
	
	def confirmDoctorAcc(){
		def temp=Doctor.get(params["p"])
		temp.confirmedFlag=1
		temp.save()
		redirect(action:"manageDoctorAccounts")
	}
	
	def deleteDoctorAcc(){
		def temp=Doctor.get(params["p"])
		temp.delete();
		redirect(action:"manageDoctorAccounts")
	}
	
	def entry
	def editApp(){
		
		entry=PatientDetails.get(params.get("p"))
		def db=new Sql(dataSource)
		def result=db.rows("Select * from patient_details Where id=${params.get("p")}")
		[req_entry:result]
		
	}
	
	def saveAppChanges(){
		print(params)
		
		entry.firstname=params["firstname"]
		entry.middlename=params["middlename"]
		entry.lastname=params["lastname"]
		entry.gender=params["gender"]
		entry.age=Integer.parseInt(String.valueOf(params["age"]))
		entry.mobile=params["mobile"]
		entry.email=params["email"]
		entry.address=params["address"]
		entry.pincode=params["pincode"]
		entry.city=params["city"]
		entry.state=params["state"]
		entry.machine=params["machine"]
		entry.disease=params["diseasehistory"]
		entry.scanof=params["scanpart"]
		entry.harmfulitems=params["harmful"]
		entry.pregnant=params["pregnant"]
		entry.clinicalhistory=params["history"]
		entry.save()
		redirect(action:"index")
		
	}
	
	
	def viaSMS(){
		def db=new Sql(dataSource)
		
		Date lower=new Date()
		Date upper=lower+1
		
		lower.putAt(Calendar.HOUR_OF_DAY, 0)
		upper.putAt(Calendar.HOUR_OF_DAY, 0)
		lower.putAt(Calendar.MINUTE, 0)
		upper.putAt(Calendar.MINUTE, 0)
		lower.putAt(Calendar.SECOND, 0)
		upper.putAt(Calendar.SECOND, 0)
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
		lower=sdf.parse(sdf.format(lower))
		upper=sdf.parse(sdf.format(upper))

		def result=db.rows("Select * from patient_details Where appointmenttype = 'viaSMS' AND confirmed_date >= ${lower} AND confirmed_date <= ${upper}")
		[appViaSms:result]
	}
	def smsEntry
	int uid
	def editSmsApp(){
		smsEntry=PatientDetails.get(params.get("p"))
		uid=Integer.parseInt(params.get("p"))
		def db=new Sql(dataSource)
		def result=db.rows("Select * from patient_details Where id=${params.get("p")}")
		def result1=db.rows("Select * from doctor")
		[req_entry:result,doctors:result1]
		
	}
	
	def done(){							//action for saving sms changes
		
		smsEntry.firstname=params["firstname"]
		smsEntry.middlename=params["middlename"]
		smsEntry.lastname=params["lastname"]
		smsEntry.gender=params["gender"]
		smsEntry.age=Integer.parseInt(String.valueOf(params["age"]))
		smsEntry.mobile=params["mobile"]
		smsEntry.email=params["email"]
		smsEntry.address=params["address"]
		smsEntry.pincode=params["pincode"]
		smsEntry.city=params["city"]
		smsEntry.state=params["state"]
		smsEntry.machine=params["machine"]
		smsEntry.doc_id=Integer.parseInt( String.valueOf(params["referral"]))
		
		int i
		if(params["diseasehistory"]!=null)
		if(params["diseasehistory"].toString().split(",").size()==1)
			smsEntry?.disease=params["diseasehistory"]
		else if(params["diseasehistory"].length > 0){
			String str=""
			i=0
			while(i<params["diseasehistory"].length){
				str=str.concat(params["diseasehistory"][i])+"; "
				i++
			}
			smsEntry?.disease=str
		}
		//String[] harmfulItems=params["harmful"].toString().split(",")
		if(params["harmful"]!=null)
		if(params["harmful"].toString().split(",").size()==1)
			smsEntry?.harmfulitems=params["harmful"]
		else if(params["harmful"].length > 0){
			String str=""
			i=0
			while(i<params["harmful"].length){
				str=str.concat(params["harmful"][i])+";\n"
				i++
			}
			smsEntry?.harmfulitems=str
		}
		
		//String[] scan=params["scanpart"].toString().split(",")
		if(params["scanpart"]!=null)
		if(params["scanpart"].toString().split(",").size()==1)
			smsEntry?.scanof=params["scanpart"]
		else if(params["scanpart"].length > 0){
			String str=""
			i=0
			while(i<params["scanpart"].length){
				str=str.concat(params["scanpart"][i])+"; "
				i++
			}
			smsEntry?.scanof=str
		}
		
		if(params["pregnant"].toString().equalsIgnoreCase("Yes"))
		smsEntry?.pregnant="Yes"
		
		if(params["history"]!=null)
			smsEntry.clinicalhistory=params["history"]
		
		smsEntry.save()
		
		redirect(action:"index")
	}
	
	
	
	def not(){
	
}
def notifymanually()
{
	String mobile=params["mobile"]
	String msg=params["msg"]
	if(mobile.length()==12)
	{
		print "sending message"
		SendsmsController.smslane_single_no(mobile,msg)
	}
	else
	print "sending failed  12 char mobile no. needed"

}
	
	
	def uploadReport(){
		def db=new Sql(dataSource)
		def result=db.rows("Select * from patient_details Where file is null")
		[uploadReports:result]
	}
	
	def entryToBeUpdated    //db entry where report is to be uploaded
	def selectFile(){
		entryToBeUpdated=PatientDetails.get(params.get("p"))
		print params.get("p")
		int ppid=Integer.parseInt(String.valueOf(params.get("p")))
		print ppid
		String name=entryToBeUpdated["firstname"]
		String temp=name.substring(1, name.length()-1)
		print temp
		int otp,val=0
		for(int i=0;i<temp.length();i++){
			val=val+(int)temp.charAt(i);
		}
		if(ppid<1000)
			otp=(val*ppid*ppid)/11;
		else if(ppid>1000 && ppid<2000)
			otp=(val*ppid*ppid)/13;
		else if(ppid>2000 && ppid<3000)
			otp=(val*ppid*ppid)/15;
		else
			otp=(val*ppid*ppid)/31;
			
		entryToBeUpdated.otp=String.valueOf(otp)
		entryToBeUpdated.save()
	}
	
	def upload(){
		
			def file = request.getFile('file')
			//print "hello  "+file
			if(file.empty) {
				flash.message = "File cannot be empty"
			} else {

				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Calendar f =Calendar.getInstance();
				java.util.Date issue=f.getTime();
				f.add(Calendar.DAY_OF_YEAR, 7);
				java.util.Date due=f.getTime();
				String strIss=sdf.format(issue);
				String strDue=sdf.format(due);
				//print "Date 1   "+ strIss

				Date siss=sdf.parse(strIss)
				Date sdue=sdf.parse(strDue)

				
			/*	Date siss=sdf.parse(strIss)
				Date sdue=sdf.parse(strDue)*/


				def documentInstance = new Document()
				documentInstance.filename = file.originalFilename
				//print "hello123  "+documentInstance.filename
				documentInstance.fullPath = grailsApplication.config.uploadFolder + documentInstance.filename
				file.transferTo(new File(documentInstance.fullPath))
				documentInstance.save()
				//print documentInstance.filename

				//db.execute("UPDATE patient_details set file='$documentInstance.fullPath',exp_Date='$sdue',summary='$sum' where id='$ppid'")
				
				entryToBeUpdated.file= documentInstance.fullPath
				entryToBeUpdated.expDate=sdue
				entryToBeUpdated.save()
				redirect(action:"uploadReport")
				
			}
				
	
	}
	def cancelApp(){
		//def date=params.canAllApp as Date
		//date = date instanceof Date ? date : new Date(date as Long)
		print params.canAllApp
	}
	
	def cancelAllApp(){
	
		
	}
	
	def feedres(){
		def db=new Sql(dataSource)
		//def myPatients = db.rows("SELECT * FROM feedback")
		//[patientList:myPatients]
		def fblist=new String[12]
	def sergood=db.rows("SELECT count(service) from feedback where service='good'")
	String strsergood=sergood['count(service)']
	strsergood=strsergood.substring(1, strsergood.length()-1)
	fblist[0]=strsergood
	//[gsergood:strsergood]
	
	def sersat=db.rows("SELECT count(service) from feedback where service='satisfactory'")
	String strsersat=sersat['count(service)']
	strsersat=strsersat.substring(1, strsersat.length()-1)
	fblist[1]=strsersat
	//[gsersat:strsersat]
	
	def serpoor=db.rows("SELECT count(service) from feedback where service='poor'")
	String strserpoor=serpoor['count(service)']
	strserpoor=strserpoor.substring(1, strserpoor.length()-1)
	fblist[2]=strserpoor
	//[gserpoor:strserpoor]
	
	def stagood=db.rows("SELECT count(staff_behaviour) from feedback where staff_behaviour='good'")
	String strstagood=stagood['count(staff_behaviour)']
	strstagood=strstagood.substring(1, strstagood.length()-1)
	fblist[3]=strstagood
	
	def stasat=db.rows("SELECT count(staff_behaviour) from feedback where staff_behaviour='satisfactory'")
	String strstasat=stasat['count(staff_behaviour)']
	strstasat=strstasat.substring(1, strstasat.length()-1)
	fblist[4]=strstasat
	
	def stapoor=db.rows("SELECT count(staff_behaviour) from feedback where staff_behaviour='poor'")
	String strstapoor=stapoor['count(staff_behaviour)']
	strstapoor=strstapoor.substring(1, strstapoor.length()-1)
	fblist[5]=strstapoor
	
	def tecgood=db.rows("SELECT count(technician_proc) from feedback where technician_proc='good'")
	String strtecgood=tecgood['count(technician_proc)']
	strtecgood=strtecgood.substring(1, strtecgood.length()-1)
	fblist[6]=strtecgood
	
	def tecsta=db.rows("SELECT count(technician_proc) from feedback where technician_proc='satisfactory'")
	String strtecsta=tecsta['count(technician_proc)']
	strtecsta=strtecsta.substring(1, strtecsta.length()-1)
	fblist[7]=strtecsta
	
	def tecpoor=db.rows("SELECT count(technician_proc) from feedback where technician_proc='poor'")
	String strtecpoor=tecpoor['count(technician_proc)']
	strtecpoor=strtecpoor.substring(1, strtecpoor.length()-1)
	fblist[8]=strtecpoor
	
	def usegood=db.rows("SELECT count(useful) from feedback where useful='good'")
	String strusegood=usegood['count(useful)']
	strusegood=strusegood.substring(1, strusegood.length()-1)
	fblist[9]=strusegood
	
	def usesta=db.rows("SELECT count(useful) from feedback where useful='satisfactory'")
	String strusesta=usesta['count(useful)']
	strusesta=strusesta.substring(1, strusesta.length()-1)
	fblist[10]=strusesta
	
	def usepoor=db.rows("SELECT count(useful) from feedback where useful='poor'")
	String strusepoor=usepoor['count(useful)']
	strusepoor=strusepoor.substring(1, strusepoor.length()-1)
	fblist[11]=strusepoor
	
	
	
	[gfblist:fblist]
	}
	def ControlPanel() {
		def db=new Sql(dataSource)
		def startTime=AdminSettings.findByEntry("centerStartTime")
		def endTime=AdminSettings.findByEntry("centerEndTime")
		def username=AdminSettings.findByEntry("smsUser")
		def password=AdminSettings.findByEntry("smspass")
		def mriInterval=AdminSettings.findByEntry("mriInterval")
		def ctInterval=AdminSettings.findByEntry("ctInterval")
		def smscode1=AdminSettings.findByEntry("smscode")
		def confirmedmsg1=AdminSettings.findByEntry("confirmmsg")
		[startTime:startTime.value,endTime:endTime.value,username:username.value,password:password.value,mriInterval:mriInterval.value,ctInterval:ctInterval.value,smscode1:smscode1.value,confirmedmsg1:confirmedmsg1.value]
	}
	
	def saveChanges() {
		print params
		
		
		float sf=Float.parseFloat(String.valueOf(params['start']).replace(':','.'))
		float ef=Float.parseFloat(String.valueOf(params['end']).replace(':','.'))
		print 'Float cobversion is'+sf
		if(params['start'].equals(params['end'])){
		flash.message="Opening and Closing time should be different"
		redirect(action:'ControlPanel');	
		}else if(ef<sf){
		flash.message="Please check the entered closing time.Center should close after its opening time. "
		redirect(action:'ControlPanel');
		}else if(!params['smsservice']){
		flash.message="Please check Yes or No SMS Messagin service"
		redirect(action:'ControlPanel');
		
	}else{
		
			def db = new Sql(dataSource)
	
		db.execute("UPDATE admin_settings SET value='${params["smsuser"]}' WHERE entry='smsuser'")
		db.execute("UPDATE admin_settings SET value='${params["smspass"]}' WHERE entry='smspass'")
		
		db.execute("UPDATE admin_settings SET value='${params["start"]}' WHERE entry='centerStartTime'")
		db.execute("UPDATE admin_settings SET value='${params["end"]}' WHERE entry='centerEndTime'")
		
		db.execute("UPDATE admin_settings SET value='${params["mriinterval"]}' WHERE entry='mriInterval'")
		db.execute("UPDATE admin_settings SET value='${params["ctinterval"]}' WHERE entry='ctInterval'")
		
		db.execute("UPDATE admin_settings SET value='${params["smscode"]}' WHERE entry='smscode'")
		db.execute("UPDATE admin_settings SET value='${params["confirmedmsg"]}' WHERE entry='confirmmsg'")
		
		
		db.execute("UPDATE admin_settings SET value='${params["smsservice"]}' WHERE entry='smsservice'")
		db.execute("UPDATE admin_settings SET value='${params["emailservice"]}' WHERE entry='emailservice'")
		
		AdminSettingsController.smsservice=String.valueOf(params['smscode'])
		AdminSettingsController.emailservice=String.valueOf(params['smscode'])
		
		AdminSettingsController.smscode=String.valueOf(params['smscode'])
		AdminSettingsController.confirmedsms=String.valueOf(params['confirmedmsg'])
			AdminSettingsController.smsuser=String.valueOf(params['smsuser'])
			AdminSettingsController.smspass=String.valueOf(params['smspass'])
	
		
		
		redirect (controller: 'Admin', view:'index')
		}
		}
	
	def changePassword(){


	
		}
def passwordChanged(){
	print("dfdf "+session.UserLoggedin)
	def temp=Admin.findByUsername(session.UserLoggedin)
	String plaincurpass=params['curpassword']
	 String plainnewpass=params['newpassword']
	 String plainconfirmedpass=params['confirmpassword']
	if(plainnewpass.equals(plainconfirmedpass)){ 
	 String hashedcurpass=	 org.apache.commons.codec.digest.DigestUtils.sha256Hex(plaincurpass);

	
	 if(!temp.password.equals(hashedcurpass)){
		 
		 flash.messageCurPass="Current Password entered is incorrect"
		 redirect(action:'changePassword')
	 }
	
	 else{
	 temp.password=plainnewpass
	 temp.save();
	 
	 redirect(action:"index");
	 }
	 }
	 else{
 flash.messageCurPass="Password Not matched"
	 	redirect(action:"changePassword")
	 }
}
}