


package atargs3

import groovy.sql.Sql
import atargs3.SendsmsController

import java.text.SimpleDateFormat

class ReceptionController {

	def beforeInterceptor =[action:this.&checkuserlogin]
	def FN="^"
	def LN="^"
	def A="^"
	def M="^"
	def MOB="^"
	def FN2="^"
	def LN2="^"
	def A2="^"
	def M2="^"
	def MOB2="^"
	Date lower, upper
	def db
	def dataSource
	String queryDate
	static boolean todayFlag

	def FNfunc(){
		FN="^"+params.value
		def myPatients
		if(todayFlag)
			myPatients = db.rows("Select * from patient_details Where confirmed_date>=${lower} AND confirmed_date < ${upper} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		else
			myPatients = db.rows("Select * from patient_details where confirmed_date REGEXP ${queryDate} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		render(view:"ScanMyAppointments",model:[result:myPatients])
	}

	def LNfunc(){
		LN="^"+params.value
		def myPatients
		if(todayFlag)
			myPatients = db.rows("Select * from patient_details Where confirmed_date>=${lower} AND confirmed_date < ${upper} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		else
			myPatients = db.rows("Select * from patient_details where confirmed_date REGEXP ${queryDate} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		render(view:"ScanMyAppointments",model:[result:myPatients])
	}

	def Afunc(){
		A="^"+params.value
		def myPatients
		if(todayFlag)
			myPatients = db.rows("Select * from patient_details Where confirmed_date>=${lower} AND confirmed_date < ${upper} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		else
			myPatients = db.rows("Select * from patient_details where confirmed_date REGEXP ${queryDate} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		render(view:"ScanMyAppointments",model:[result:myPatients])
	}

	def Mfunc(){
		M="^"+params.value
		def myPatients
		if(todayFlag)
			myPatients = db.rows("Select * from patient_details Where confirmed_date>=${lower} AND confirmed_date < ${upper} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		else
			myPatients = db.rows("Select * from patient_details where confirmed_date REGEXP ${queryDate} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		render(view:"ScanMyAppointments",model:[result:myPatients])
	}

	def MOBfunc(){
		MOB="^"+params.value
		def myPatients
		if(todayFlag)
			myPatients = db.rows("Select * from patient_details Where confirmed_date>=${lower} AND confirmed_date < ${upper} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		else
			myPatients = db.rows("Select * from patient_details where confirmed_date REGEXP ${queryDate} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		render(view:"ScanMyAppointments",model:[result:myPatients])
	}
	def create(){
	}
	def checkuserlogin(){
		if(!String.valueOf(session['usertype']).equals("RECEPTIONIST")  && !String.valueOf(session['usertype']).equals("GuestUserRec") ) {
			print "no authenticated user"
			redirect(controller:'Login',action:'loginAsReceptionist')
		}
	}

	def index() {
		if(String.valueOf(session['usertype']).equals("GuestUserRec"))
			redirect(action:'create')
		todayFlag=true

		db=new Sql(dataSource)

		lower=new Date()
		upper=lower+1

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

		def start = new Date();
		def last = new Date();
		last = last + 21;
		def day = start.getAt(Calendar.DAY_OF_WEEK)
		def prestart = start

		while (day != Calendar.SUNDAY)	{
			prestart--;
			day--;
		}
		def freeslots = new int[21];
		d = new Date()
		d.putAt(Calendar.HOUR, 0)
		d.putAt(Calendar.MINUTE, 0)
		d.putAt(Calendar.SECOND, 0)
		def t1 = AdminSettings.findByEntry("centerStartTime")
		def t2 = AdminSettings.findByEntry("centerEndTime")

		String t11 = t1.value.toString()
		String t22 = t2.value.toString()

		int time_req=60

		int starttime = Integer.parseInt(t11.split(":")[0]) * 60 + Integer.parseInt(t11.split(":")[1])
		int endtime = Integer.parseInt(t22.split(":")[0]) * 60 + Integer.parseInt(t22.split(":")[1])
		int starttime_min=Integer.parseInt(t11.split(":")[1])
		int workinghours = endtime - starttime
		int intervals = workinghours / time_req;
		int totalNoOfIntervals=intervals
		for ( i = 0 ; i < 21; i++){
			freeslots[i] = intervals - PatientDetails.countByConfirmedDateBetween(d, d + 1);

			d++;
		}
		print("hiii "+freeslots+"  "+intervals)
		Date today = new Date();
		starttime = today.getAt(Calendar.HOUR_OF_DAY) * 60;
		starttime += 180;
		workinghours = endtime - starttime
		if(workinghours<0)
			workinghours=0
		println starttime
		println endtime
		println workinghours
		intervals = workinghours / time_req;
		d = new Date()
		d.putAt(Calendar.HOUR_OF_DAY, 0)
		d.putAt(Calendar.MINUTE, 0)
		d.putAt(Calendar.SECOND, 0)
		today.putAt(Calendar.HOUR_OF_DAY, today.getAt(Calendar.HOUR_OF_DAY) + 3)
		freeslots[0] = intervals - PatientDetails.countByConfirmedDateBetween(today, d + 1);
		if(intervals==0)
			freeslots[0]=0
		def currentmonth = new Date().format("MMMM")
		def nextmonth=new Date()
		int nxtmonth=0
		if((new Date().format("MM")).equalsIgnoreCase((new Date()+21).format("MM")))
			print("hello")
		else
			nxtmonth=1

		nextmonth.putAt(Calendar.MONTH, new Date().getAt(Calendar.MONTH)+1)

		[limits: [prestart, start, last],  free: freeslots ,totalNoOfIntervals:totalNoOfIntervals, result:result,currentmonth:currentmonth,nextmonth:nextmonth.format("MMMM"),nxtmonth:nxtmonth]

	}

	static scaffold=Reception


	int i,k


	def getNewApp() {
		if(String.valueOf(session['usertype']).equals("GuestUserRec"))
			redirect(action:'create')
		db=new Sql(dataSource)
		ArrayList result=db.rows("Select * from patient_details Where confirmed_date is null")

		[res:result]
	}

	def confirmApp(){
		if(String.valueOf(session['usertype']).equals("GuestUserRec"))
			redirect(action:'create')
		String[] a=  String.valueOf(params["p"]).split(",")//         params.get("p").toString().split(",")
		def temp=PatientDetails.get(a[0]);
		def confirmed_priority=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(a[1])
		db=new Sql(dataSource)
		ArrayList result=db.rows("Select * from patient_details Where machine = ${temp.machine} AND confirmed_date = ${confirmed_priority}")
		if(result.isEmpty()){		//exclusive priority
			temp.confirmedDate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(a[1])
			temp.save();
			print "Appointment confirmed"

			//send sms regarding confirmation appointment date
			String nois="91"+temp.mobile;
			print "sending confirmation to this no "+nois
			String msgis="your Appointment of date ${temp.confirmedDate} has been confirmed.Please bring Form provided by your Referral Doctor"
			SendsmsController.smslane_single_no(nois,msgis)

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
					//send sms regarding confirmation of appointment date
					SendsmsController.smslane_single_no("91"+temp.mobile,"your Appointment of date has been confirmed.Please bring Form provided by your Referral Doctor. ")
					redirect(action:"getNewApp")
				}
				else{
					//send sms that patient has to get appointment again
					print "Sorry"
					SendsmsController.smslane_single_no("91"+temp.mobile,"Sorry,your appointment for scan has not been confirmed.Please call the customer care.")
					temp.delete();
					redirect(action:"getNewApp")
				}
			}
		}

	}

	def rejectApp() {
		if(String.valueOf(session['usertype']).equals("GuestUserRec"))
			redirect(action:'create')
		def id = params["p"]
		def pd = PatientDetails.get(Integer.parseInt(id))
		SendsmsController.smslane_single_no("91"+pd.mobile,"Sorry,your appointment for ${pd.machine} scan has been confirmed.Please call the customer care.")
		pd.delete();

		redirect(action:"getNewApp");
		//send sms that patient has to get appointment again

	}

	def manageApp(){
		if(String.valueOf(session['usertype']).equals("GuestUserRec"))
			redirect(action:'create')
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
		if(String.valueOf(session['usertype']).equals("GuestUserRec"))
			redirect(action:'create')
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




	def uploadReport(){
		if(String.valueOf(session['usertype']).equals("GuestUserRec"))
			redirect(action:'create')
		def db=new Sql(dataSource)
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
		Date d=new Date()
		d=sdf.parse(sdf.format(d))
		println d
		def result=db.rows("Select * from patient_details Where file is null And confirmed_date < ${d}")
		[uploadReports:result]
	}

	def entryToBeUpdated    //db entry where report is to be uploaded
	def selectFile(){
		entryToBeUpdated=PatientDetails.get(params.get("p"));
	}

	def upload(){
		def temp=Doctor.get(entryToBeUpdated.doc_id)
		println "eureka = "+entryToBeUpdated.id
		if(String.valueOf(session['usertype']).equals("GuestUserRec"))
			redirect(action:'create')
		String temp1,temp2,temp3
		int val1=0,val2=0,val3=0,otp;
		def db = new Sql(dataSource)
		def sum = params['sum']
		if(sum.equals(""))
		{
			flash.messageSUMMARY="Enter Summary."
			render(view:"selectFile")
			return
		}

		entryToBeUpdated.summary=sum
		def file = request.getFile('file')
		//def file = request.getFile('file')
		println "Here : ${file.originalFilename}"
		def ofname=file.originalFilename
		String tobemail=ofname
		println "Here the file to be mailed"+tobemail
		def webRootDir=servletContext.getRealPath("/")
		println "webrt"+webRootDir
		def userDir=new File(webRootDir,"/UploadCheck")
		userDir.mkdirs()
		println "userDir"+userDir
		File f1=new File(userDir,file.originalFilename)
		//file.transferTo(f1)
		print "f1"
		print f1



		if(file.empty) {
			flash.message = "File cannot be empty"
		} else {

			/*					SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yy");
			 Calendar f =Calendar.getInstance();
			 java.util.Date issue=f.getTime();
			 f.add(Calendar.DAY_OF_YEAR, 7);
			 java.util.Date due=f.getTime();
			 String strIss=sdf.format(issue);
			 String strDue=sdf.format(due);
			 java.sql.Date siss=new Date(issue.getTime());
			 java.sql.Date sdue=new Date(due.getTime());
			 */

			def documentInstance = new Document()
			documentInstance.filename = ofname
			documentInstance.full_Path = f1

			//file.transferTo(new File(documentInstance.full_Path))
			file.transferTo(f1)
			documentInstance.save()
			print documentInstance.filename
			print documentInstance.full_Path
			print documentInstance.id

			String s=documentInstance.full_Path
			print "s"+s


			//print res12
			//db.execute("UPDATE patient set docid='$documentInstance.id',exp_Date='$sdue',summary='$sum' where id='$ppid'")

			def fname=entryToBeUpdated.firstname
			def lname=entryToBeUpdated.lastname
			def mob=entryToBeUpdated.mobile
			//def result = db.rows("SELECT firstname FROM patient_details WHERE id='$ppid'")
			//String name = result['firstname']
			//print name

			temp1=fname.substring(0, fname.length())
			//print temp
			for(int i=0;i<temp1.length();i++){
				val1=val1+(int)temp1.charAt(i);
			}
			temp2=lname.substring(0, lname.length())
			//print temp
			for(int i=0;i<temp2.length();i++){
				val2=val2+(int)temp2.charAt(i);
			}
			temp3=mob.substring(0, mob.length())
			//print temp
			for(int i=0;i<temp3.length();i++){
				val3=val3+(int)temp3.charAt(i);
			}

			otp=(val1*val2)+val3;

			//db.execute("UPDATE patient set otp='$otp' where id='$ppid'")


			entryToBeUpdated.file= documentInstance.full_Path
			//			entryToBeUpdated.expDate=sdue
			entryToBeUpdated.docid=documentInstance.id
			entryToBeUpdated.otp=otp

			//				def result11 = db.rows("SELECT contact FROM patient WHERE id='$ppid'")
			//				String res211= result11['contact']
			//				String msisdn=res211.substring(1, res211.length()-1)
			//				entryToBeUpdated.mobile

			try{
				sendMail {
					multipart true
					to  temp.email
					subject "Report of  ${entryToBeUpdated.firstname}  ${entryToBeUpdated.lastname} Sent from Atargs"
					body "This is the detailed ${entryToBeUpdated.machine} report of ${entryToBeUpdated.firstname}  ${entryToBeUpdated.lastname}.Please check it.\nThank you\nPOONA HOSPITAL"

					//attachBytes 'Marks1','application/pdf', new File('/home/amr/Desktop/ADS TA Marks Sem 1 AY 13-14.pdf').readBytes()
					attachBytes tobemail,'application/pdf',f1.readBytes()
				}
			}catch(Exception e){
				System.out.println(e.printStackTrace());
				flash.messageEMAIL="Check Internet Connection."
				if(!sum.equals(""))
				flash.messageSUMMARY=false
				render(view:"selectFile")
				return
			}

			SendsmsController.smslane_single_no("91"+entryToBeUpdated.mobile,"Your Report is ready.You can download it by using the foll otp(one time password ${otp}) ")
			if(temp!=null)
				SendsmsController.smslane_single_no("91"+temp.mobile,"Report of your patient ${entryToBeUpdated.firstname}  ${entryToBeUpdated.lastname} is ready.Summary:${sum}.You can download it. ")

			entryToBeUpdated.save()

			redirect(action:"uploadReport")

		}


	}



	def cancelAllApp(){


	}

	def entry
	def editApp(){

		entry=PatientDetails.get(params.get("p"))
		def db=new Sql(dataSource)
		def result=db.rows("Select * from patient_details Where id=${params.get("p")}")
		def checkBoxInfo=new int[28]
		print("hiiii   "+entry.scanof.concat(entry.disease).concat(entry.harmfulitems))
		//print("hiii   "+entry.scanof.class.toString())
		def checked=entry.scanof.concat(entry.disease).concat(entry.harmfulitems).split(";")
		print(checked[0].class.toString())
		int i=0
		while(i<checked.length && !checked[0].equalsIgnoreCase("")){
			checkBoxInfo[Integer.parseInt(checked[i])-1]=1
			i++;
		}
		print("hello "+checkBoxInfo+"  sdf"+result)
		[req_entry:result,checkBoxInfo:checkBoxInfo]

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


		if(params["pregnant"]==null)
			entry?.pregnant="-"
		else if(params["pregnant"].toString().equalsIgnoreCase("Yes"))
			entry?.pregnant="Yes"
		entry.clinicalhistory=params["history"].toString().trim()
		int i
		if(params["diseasehistory"]!=null){
			if(params["diseasehistory"].toString().split(",").size()==1)
				entry.disease=params["diseasehistory"]+";"
			else if(params["diseasehistory"].length > 0){
				String str=""
				i=0
				while(i<(params["diseasehistory"].length)){
					str=str.concat(params["diseasehistory"][i])+";"
					i++
				}

				entry.disease=str
			}
		}
		else
			entry.disease=""
		//String[] harmfulItems=params["harmful"].toString().split(",")
		//print("fghfdfs   "+params["harmful"].class.toString())
		if(params["harmful"]!=null){
			if(params["harmful"].class.toString().equalsIgnoreCase("class java.lang.String"))
				entry.harmfulitems=params["harmful"]+";"
			else if(params["harmful"].length > 0){
				String str=""
				i=0
				while(i<(params["harmful"].length)){
					str=str.concat(params["harmful"][i])+";"
					i++
				}

				entry.harmfulitems=str
			}
		}
		else
			entry.harmfulitems=""

		//String[] scan=params["scanpart"].toString().split(",")
		if(params["scanpart"]!=null){
			if(params["scanpart"].toString().split(",").size()==1)
				entry.scanof=params["scanpart"]+";"
			else if(params["scanpart"].length > 0){
				String str=""
				i=0
				while(i<(params["scanpart"].length)){
					str=str.concat(params["scanpart"][i])+";"
					i++
				}

				entry.scanof=str
			}
		}
		else
			entry.scanof=""
		entry.save()
		redirect(action:"index")

	}

	def viaSMS(){
		if(String.valueOf(session['usertype']).equals("GuestUserRec"))
			redirect(action:'create')
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
		def checkBoxInfo=new int[28]
		print("hiiii   "+smsEntry.scanof.concat(smsEntry.disease).concat(smsEntry.harmfulitems))
		//print("hiii   "+entry.scanof.class.toString())
		def checked=smsEntry.scanof.concat(smsEntry.disease).concat(smsEntry.harmfulitems).split(";")
		print(checked[0].class.toString())
		int i=0
		while(i<checked.length && !checked[0].equalsIgnoreCase("")){
			checkBoxInfo[Integer.parseInt(checked[i])-1]=1
			i++;
		}
		[req_entry:result,doctors:result1,checkBoxInfo:checkBoxInfo]

	}

	def done(){							//action for saving sms changes

		printf("hiiii "+params)
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
		if(params["diseasehistory"]!=null){
			if(params["diseasehistory"].toString().split(",").size()==1)
				smsEntry.disease=params["diseasehistory"]+";"
			else if(params["diseasehistory"].length > 0){
				String str=""
				i=0
				while(i<(params["diseasehistory"].length)){
					str=str.concat(params["diseasehistory"][i])+";"
					i++
				}

				smsEntry.disease=str
			}
		}
		else
			smsEntry.disease=""
		//String[] harmfulItems=params["harmful"].toString().split(",")
		//print("fghfdfs   "+params["harmful"].class.toString())
		if(params["harmful"]!=null){
			if(params["harmful"].class.toString().equalsIgnoreCase("class java.lang.String"))
				smsEntry.harmfulitems=params["harmful"]+";"
			else if(params["harmful"].length > 0){
				String str=""
				i=0
				while(i<(params["harmful"].length)){
					str=str.concat(params["harmful"][i])+";"
					i++
				}

				smsEntry.harmfulitems=str
			}
		}
		else
			smsEntry.harmfulitems=""

		//String[] scan=params["scanpart"].toString().split(",")
		if(params["scanpart"]!=null){
			if(params["scanpart"].toString().split(",").size()==1)
				smsEntry.scanof=params["scanpart"]+";"
			else if(params["scanpart"].length > 0){
				String str=""
				i=0
				while(i<(params["scanpart"].length)){
					str=str.concat(params["scanpart"][i])+";"
					i++
				}

				smsEntry.scanof=str
			}
		}
		else
			smsEntry.scanof=""

		print("hiiiii "+params["pregnant"])
		if(params["pregnant"]==null)
			smsEntry?.pregnant="-"
		else if(params["pregnant"].toString().equalsIgnoreCase("Yes"))
			smsEntry?.pregnant="Yes"

		if(params["history"]!=null)
			smsEntry.clinicalhistory=params["history"].toString().trim()

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

	String cancelDate
	def myPatients
	def ShowApp(){
		db=new Sql(dataSource)
		todayFlag=false
		FN="^"
		LN="^"
		A="^"
		M="^"
		MOB="^"
		String day=""+params["Day"], month=""+(Integer.parseInt(params["Month"])+1), year=params["Year"]
		if(Integer.parseInt(params["Month"])+1<=9)
			month="0"+month
		if(Integer.parseInt(params["Day"])<=9)
			day="0"+Integer.parseInt(params["Day"])
		queryDate="^"+year+"-"+month+"-"+day
		cancelDate=""+year+"-"+month+"-"+day
		print("helloooo"+cancelDate)
		myPatients=db.rows("Select * from patient_details where confirmed_date REGEXP ${queryDate}")
		render(view:"ScanMyAppointments",model:[result:myPatients])
	}

	String reqMachine
	def cancelCTApp(){
		db=new Sql(dataSource)
		reqMachine="CT"
		myPatients=db.rows("Select * from patient_details where machine = ${reqMachine} And confirmed_date REGEXP ${queryDate}")
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd")

		//store date in Database
		def dateCancelled=db.rows("Select * from holidays where machine = ${reqMachine} And holiday = ${cancelDate}")
		if(dateCancelled.isEmpty()){
			Holidays h=new Holidays()
			h?.holiday=cancelDate
			h?.machine=reqMachine
			h?.save()
		}

		Date today=new Date()

		today.putAt(Calendar.HOUR_OF_DAY, 0)
		today.putAt(Calendar.MINUTE, 0)
		today.putAt(Calendar.SECOND, 0)

		today=sdf.parse(sdf.format(today))


		i=0
		int j=0
		String prio
		while(i<myPatients.size){

			if(sdf1.format(myPatients[i].confirmed_date).equalsIgnoreCase(cancelDate)){
				def app=PatientDetails.get(myPatients[i].id)
				while(j<3){
					if(j==0)
						prio=sdf1.format(app.priority1)
					else if(j==1)
						prio=sdf1.format(app.priority2)
					else
						prio=sdf1.format(app.priority3)

					def checkIfCancelled=db.rows("Select * from holidays Where machine = ${reqMachine} And ${prio} = holiday")
					if(sdf1.parse(prio) <= sdf1.parse(sdf1.format(today)) || !checkIfCancelled.isEmpty())
						j++
					else
						break
				}
				if(j<3){
					if(j==0)
						app.confirmedDate=app.priority1
					else if(j==1)
						app.confirmedDate=app.priority2
					else
						app.confirmedDate=app.priority3

					app.save()
					SendsmsController.smslane_single_no("91"+app.mobile,"Sorry,your appointment for ${app.machine} scan has  been changed.Your appointment has been scheduled at ${app.confirmedDate}.")
				}
				else{
					//reject app
					print("App rejected")

					SendsmsController.smslane_single_no("91"+app.mobile,"Sorry,your appointment for ${app.machine} scan has been rejected.Please call the customer care.")
					app.delete();

				}
			}
			i++
		}

		redirect(action:"index");


	}

	def cancelMRIApp(){
		db=new Sql(dataSource)
		reqMachine="MRI"
		myPatients=db.rows("Select * from patient_details where machine = ${reqMachine} And confirmed_date REGEXP ${queryDate}")
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd")

		//store date in Database
		def dateCancelled=db.rows("Select * from holidays where machine = ${reqMachine} And holiday = ${cancelDate}")
		if(dateCancelled.isEmpty()){
			Holidays h=new Holidays()
			h?.holiday=cancelDate
			h?.machine=reqMachine
			h?.save()
		}

		Date today=new Date()

		today.putAt(Calendar.HOUR_OF_DAY, 0)
		today.putAt(Calendar.MINUTE, 0)
		today.putAt(Calendar.SECOND, 0)

		today=sdf.parse(sdf.format(today))


		i=0
		int j=0
		String prio
		while(i<myPatients.size){

			if(sdf1.format(myPatients[i].confirmed_date).equalsIgnoreCase(cancelDate)){
				def app=PatientDetails.get(myPatients[i].id)
				while(j<3){
					if(j==0)
						prio=sdf1.format(app.priority1)
					else if(j==1)
						prio=sdf1.format(app.priority2)
					else
						prio=sdf1.format(app.priority3)

					def checkIfCancelled=db.rows("Select * from holidays Where machine = ${reqMachine} And ${prio} = holiday")
					if(sdf1.parse(prio) <= sdf1.parse(sdf1.format(today)) || !checkIfCancelled.isEmpty())
						j++
					else
						break
				}
				if(j<3){
					if(j==0)
						app.confirmedDate=app.priority1
					else if(j==1)
						app.confirmedDate=app.priority2
					else
						app.confirmedDate=app.priority3

					app.save()
					SendsmsController.smslane_single_no("91"+app.mobile,"Sorry,your appointment for ${app.machine} scan has  been changed.Your appointment has been scheduled at ${app.confirmedDate}.")
				}
				else{
					//reject app
					print("App rejected")

					SendsmsController.smslane_single_no("91"+app.mobile,"Sorry,your appointment for ${app.machine} scan has been rejected.Please call the customer care.")
					app.delete();

				}
			}
			i++
		}

		redirect(action:"index");


	}
	def changePassword(){


	}
	def passwordChanged(){
		print("dfdf "+session.UserLoggedin)
		def temp=Reception.findByUsername(session.UserLoggedin)
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
			}}else{
			flash.messageCurPass="Password Not matched"
			redirect(action:"changePassword")
		}

	}

	def patientHistory(){
		
		FN2="^"
		LN2="^"
		A2="^"
		M2="^"
		MOB2="^"
		
		Date currentDate=new Date()


		currentDate.putAt(Calendar.HOUR_OF_DAY, 0)

		currentDate.putAt(Calendar.MINUTE, 0)

		currentDate.putAt(Calendar.SECOND, 0)

		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

		currentDate=sdf.parse(sdf.format(currentDate))

		def db=new Sql(dataSource)
		def result=db.rows("Select * from patient_details Where file is not null")
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
		[history:result]
	}
	
	def FNfunc2(){
		FN2="^"+params.value
		def myPatients
		myPatients = db.rows("Select * from patient_details Where firstname REGEXP ${FN2} and lastname REGEXP ${LN2} and age REGEXP ${A2} and machine REGEXP ${M2} and mobile REGEXP ${MOB2} and file != 'null'")
		render(view:"ScanMyPatientHistory",model:[result:myPatients])
	}

	def LNfunc2(){
		LN2="^"+params.value
		def myPatients
		myPatients = db.rows("Select * from patient_details Where firstname REGEXP ${FN2} and lastname REGEXP ${LN2} and age REGEXP ${A2} and machine REGEXP ${M2} and mobile REGEXP ${MOB2} and file != 'null'")
		render(view:"ScanMyPatientHistory",model:[result:myPatients])
	}

	def Afunc2(){
		A2="^"+params.value
		def myPatients
		myPatients = db.rows("Select * from patient_details Where firstname REGEXP ${FN2} and lastname REGEXP ${LN2} and age REGEXP ${A2} and machine REGEXP ${M2} and mobile REGEXP ${MOB2} and file != 'null'")
		render(view:"ScanMyPatientHistory",model:[result:myPatients])
	}

	def Mfunc2(){
		M2="^"+params.value
		def myPatients
		myPatients = db.rows("Select * from patient_details Where firstname REGEXP ${FN2} and lastname REGEXP ${LN2} and age REGEXP ${A2} and machine REGEXP ${M2} and mobile REGEXP ${MOB2} and file != 'null'")
		render(view:"ScanMyPatientHistory",model:[result:myPatients])
	}

	def MOBfunc2(){
		MOB2="^"+params.value
		def myPatients
		myPatients = db.rows("Select * from patient_details Where firstname REGEXP ${FN2} and lastname REGEXP ${LN2} and age REGEXP ${A2} and machine REGEXP ${M2} and mobile REGEXP ${MOB2} and file != 'null'")
		render(view:"ScanMyPatientHistory",model:[result:myPatients])
	}


}
