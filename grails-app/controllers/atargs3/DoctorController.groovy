package atargs3

import groovy.sql.Sql;

class DoctorController {
	
	def beforeInterceptor =[action:this.&checkuserlogin]
	def db
	def dataSource
	String username
	String[] ar
	def myId
	def FN="^"
	def LN="^"
	def A="^"
	def M="^"
	def MOB="^"
	String queryDate
	static boolean todayFlag
	def create(){
		
	}
	def checkuserlogin(){
		print session['usertype']
		 if(!String.valueOf(session['usertype']).equals("DOCTOR") && !String.valueOf(session['usertype']).equals("GuestUser") )
		{
			print "no authenticated user"
			redirect(controller:'Login',action:'loginAsDoctor')
		}
	
		
	}

    def index() { 
		if(String.valueOf(session['usertype']).equals("GuestUser"))
		redirect(action:'create')

		todayFlag=true
		db=new Sql(dataSource)
		username = String.valueOf(session.UserLoggedin)
		print username
		ar = username.split(":")
		
		def me = db.rows("SELECT id FROM doctor WHERE username=${username}")
		myId = me['id']
		def myPatients = db.rows("SELECT * FROM patient_details WHERE doc_id=${myId[0]}")
		
		
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
		Date d=new Date()
		d.putAt(Calendar.HOUR, 0)
		d.putAt(Calendar.MINUTE, 0)
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

		for (int i = 0 ; i < 21; i++){
			freeslots[i] = intervals - PatientDetails.countByConfirmedDateBetween(d, d + 1);

			d++;
		}
		Date today = new Date();
		starttime = today.getAt(Calendar.HOUR_OF_DAY) * 60;
		starttime += 180;
		workinghours = endtime - starttime
		println starttime
		println endtime
		println workinghours
		intervals = workinghours / time_req;
		today.putAt(Calendar.HOUR_OF_DAY, today.getAt(Calendar.HOUR_OF_DAY) + 3)
		freeslots[0] = intervals - PatientDetails.countByConfirmedDateBetween(today, d + 1);
		[limits: [prestart, start, last],  free: freeslots ,	patientList:myPatients]
	}
	static scaffold=Doctor
	
	def FNfunc(){
		FN="^"+params.value
		def myPatients
		if(todayFlag)
		myPatients = db.rows("Select * from patient_details Where doc_id=${myId[0]} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		else
		myPatients = db.rows("Select * from patient_details where doc_id=${myId[0]} and confirmed_date REGEXP ${queryDate} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		render(view:"ScanMyPatients",model:[patientList:myPatients])
	}
	
	def LNfunc(){
		LN="^"+params.value
		def myPatients
		if(todayFlag)
		myPatients = db.rows("Select * from patient_details Where doc_id=${myId[0]} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		else
		myPatients = db.rows("Select * from patient_details where doc_id=${myId[0]} and confirmed_date REGEXP ${queryDate} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		render(view:"ScanMyPatients",model:[patientList:myPatients])
	}
	
	def Afunc(){
		A="^"+params.value
		def myPatients
		if(todayFlag)
		myPatients = db.rows("Select * from patient_details Where doc_id=${myId[0]} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		else
		myPatients = db.rows("Select * from patient_details where doc_id=${myId[0]} and confirmed_date REGEXP ${queryDate} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		render(view:"ScanMyPatients",model:[patientList:myPatients])
	}
	
	def Mfunc(){
		M="^"+params.value
		def myPatients
		if(todayFlag)
		myPatients = db.rows("Select * from patient_details Where doc_id=${myId[0]} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		else
		myPatients = db.rows("Select * from patient_details where doc_id=${myId[0]} and confirmed_date REGEXP ${queryDate} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		render(view:"ScanMyPatients",model:[patientList:myPatients])
	}
	
	def MOBfunc(){
		MOB="^"+params.value
		def myPatients
		if(todayFlag)
		myPatients = db.rows("Select * from patient_details Where doc_id=${myId[0]} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		else
		myPatients = db.rows("Select * from patient_details where doc_id=${myId[0]} and confirmed_date REGEXP ${queryDate} and firstname REGEXP ${FN} and lastname REGEXP ${LN} and age REGEXP ${A} and machine REGEXP ${M} and mobile REGEXP ${MOB}")
		render(view:"ScanMyPatients",model:[patientList:myPatients])
	}
def getappointment(){
	
}
def informptbysms(){
	if(String.valueOf(session['usertype']).equals("GuestUser"))
	redirect(action:'create')

	//Get 3 optimum dates and suggest those to patient and tempararily put all three as full
	//inform 3 dates to patient via his number
	print params;
		String datec=String.valueOf(params['suggestdate'])
		print datec;


		db=new Sql(dataSource)
		def temp=db.rows("SELECT * FROM patient_details WHERE DATE_FORMAT(priority1, '%Y-%m-%d') =?", "like '${datec}%'")
	if(temp.size()==0)
	{
		
		println "SMS for current daate 3 slots" 
	}else{
	print "getting time"
print temp
		}
}
def getaptnow(){
	//
	
	}
	def getReport(){
		if(String.valueOf(session['usertype']).equals("GuestUser"))
		redirect(action:'create')

		println params.patientId
		def temp=PatientDetails.findById(params.patientId)
		def fl=new File(temp.file)
		println fl.name+" "+fl.absolutePath+" "+fl.size()
		response.setContentType("application/pdf")
		response.setHeader("Content-disposition", "attachment;fileName=\"${fl.name}\"")
		response.outputStream<<fl.bytes
		
	}
	def GetDate()
	{
		if(String.valueOf(session['usertype']).equals("GuestUser"))
		redirect(action:'create')

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
	def myPatients=db.rows("Select * from patient_details where doc_id=${myId[0]} and confirmed_date REGEXP ${queryDate}")
	render(view:"ScanMyPatients",model:[patientList:myPatients])
	}
	
	def ReportButton()
	{
		def myPatients=db.rows("Select * from patient_details where doc_id=${myId[0]} and file regexp '^'")
		render(view:"ScanMyPatients",model:[patientList:myPatients])
	}
	
	def Appointment()
	{
		
	}
	
	def changePassword(){
	
	
}
def passwordChanged(){
	print("dfdf "+session.UserLoggedin)
	def temp=Doctor.findByUsername(session.UserLoggedin)
	String plaincurpass=params['curpassword']
	 String plainnewpass=params['newpassword']
	 String plainconfirmedpass=params['confirmpassword']
	if(plainnewpass.equals(plainconfirmedpass)){ 
	 String hashedcurpass=	 org.apache.commons.codec.digest.DigestUtils.sha256Hex(plaincurpass);
	 String hashednewpass=	 org.apache.commons.codec.digest.DigestUtils.sha256Hex(plainnewpass);
	
	 if(!temp.password.equals(hashedcurpass)){
		 
		 flash.messageCurPass="Current Password entered is incorrect"
		 redirect(action:'changePassword')
	 }
	
	 else{
	 temp.password=hashednewpass
	 print("hiii  "+hashednewpass)
	 temp.save();
	 
	 redirect(action:"index");
	 }}else{
 flash.messageCurPass="Password Not matched"
	 	redirect(action:"changePassword")
	 }
}
}