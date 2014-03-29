package atargs3

import groovy.sql.Sql

import java.lang.String;
import java.text.SimpleDateFormat

class PatientDetailsController {
	//static def defaulIndex = "patientIndex"
	boolean log; //if bit is set, all information is printed on stdout
	def dataSource, docList
	def db; //Database
	static int maxDays //Max Days for which calendar is to be shown
	static def machine, patientGender //Selected machine by the user
	static int timeRequired,is_timereq_multipleof60; //Time taken by the selected machine 
	static int starttime, endtime,is_starttime_Decimal,is_endtime_Decimal,starttime_min,endTime_inMin //Center start time and end time (In minutes from midnight).
	Date p1, p2, p3;
	static int counter = 0;
	static def fname, lname, gen, address, email, mobile;
	static def patient;
	static int age;
	int time_req,total_no_of_slots   //k is no_of_slots in 1 hour,time_req is the time required for a single CT or MRI scan
	float k
	def historyMN, historyAddress, historyCity, historyState, historyClinicalHistory,historyPincode
	//static scaffold = PatientDetails

	/*ORGANISED CODE*/
	/*STEP 1: SHOW PATIENT INDEX PAGE*/
	def patientIndex() {
		p1 = new Date();
		p2 = new Date();
		p3 = new Date();
		p1.putAt(Calendar.HOUR_OF_DAY,0)
		p2.putAt(Calendar.HOUR_OF_DAY,0)
		p3.putAt(Calendar.HOUR_OF_DAY,0)

		p1.putAt(Calendar.MINUTE,0)
		p2.putAt(Calendar.MINUTE,0)
		p3.putAt(Calendar.MINUTE,0)

		p1.putAt(Calendar.SECOND,0)
		p2.putAt(Calendar.SECOND,0)
		p3.putAt(Calendar.SECOND,0)
		
		log = 1;
		db = new Sql(dataSource)
		maxDays = 21
	}
	/*STEP 2: SHOW REQUIRNMENTS PAGE*/
	/*PURPOSE: Displays information required before making Scan. Also provide place to select machine*/
	def requirnment() {
		/*sendMail {     
			multipart true
  to "adnan0052@yahoo.com"     
  subject "SSSUp"     
  body 'How are you?' 
  attachBytes 'C:/Users/Vrushali/Desktop/Output','text', new File('C:/Users/Vrushali/Desktop/Output').readBytes()
  
}*/
		p1 = new Date();
		p2 = new Date();
		p3 = new Date();
		p1.putAt(Calendar.HOUR_OF_DAY,0)
		p2.putAt(Calendar.HOUR_OF_DAY,0)
		p3.putAt(Calendar.HOUR_OF_DAY,0)

		p1.putAt(Calendar.MINUTE,0)
		p2.putAt(Calendar.MINUTE,0)
		p3.putAt(Calendar.MINUTE,0)

		p1.putAt(Calendar.SECOND,0)
		p2.putAt(Calendar.SECOND,0)
		p3.putAt(Calendar.SECOND,0)
		
		log = 1;
		db = new Sql(dataSource)
		maxDays = 21
		if(log) println "Schedule an appointment clicked. Waiting for machine to select";
		counter = 0;
	}
	
	/*PURPOSE: Sets the machine variable with proper value. Also gets the time required by the machine from 'ADMIN SETTINGS'
	 * and sets appropriate field
	 */
	def setMachine() {
		db = new Sql(dataSource) //for testing purpose. can be removed at later stages
	//Set the machine in proper variable
		if(log) println "Some button selecting machine is clicked. Extracting params information and setting machine"
		machine = params["machine"].toString();
		if(log) println "${machine} is selected and set. Qyerying time required...";
		
	//Set other machine properties such as: time required in 'timeRequired'
		String entryField;
		if (machine == 'MRI')
			entryField = new String("mriInterval")
		else
			entryField = new String("ctInterval")
		def val = AdminSettings.findByEntry("${entryField}")
		
		timeRequired = Integer.parseInt(val["value"])
		if (log) println "The time taken by machine is ${timeRequired} minutes. Redirecting to SelectDate...";
		redirect (action: "SelectDate")
	}
	
	def PersonalDetails={}
	
	def savePersonalDetails() {
		
		String tempMOB=params["mobile"]
		String tempFN=params["firstname"]
		String tempLN=params["lastname"]
		String tempAGE=params["age"]
		String email=params["email"]
		historyMN=params["middlename"]
		historyAddress=params["address"]
		historyPincode=params["pincode"]
		historyCity=params["city"]
		historyState=params["state"]
		historyClinicalHistory=params["history"]
		//int s=params["a"].toString().split(",").size()
		
		
		//disease=
		//print(params.a[0])
		//print("hii"+ params["a"].toString().split(",").size())
		//print(params["pregnant"])
		boolean redirectFlag=false
		if(tempFN.equals(""))
		{
			flash.messageFN="Enter First Name."
			redirectFlag=true
		}
		if(tempLN.equals(""))
		{
			flash.messageLN="Enter Last Name."
			redirectFlag=true
		}
		if(!tempAGE.isNumber()||tempAGE.equals(""))
		{
			flash.messageAGE="Enter Age."
			redirectFlag=true
		}
		if(tempMOB.length()<10)
		{
			flash.messageMOB="Enter 10-digit Mobile Number."
			redirectFlag=true
		}
		if(!email.equals("")&&!redirectFlag)
		{
			try{
			sendMail {
				to params["email"]
				subject "BookMyScan Appointment"
				body "Hello ${tempFN} ${tempLN},\nYour Appointment awaits Confirmation : \n${p1.toString()}\n${p2.toString()}\n${p3.toString()}\nYour e-mail id has been successfully registered."
			}
			}catch(Exception e){
			System.out.println(e.printStackTrace());
				flash.messageEMAIL="Enter Correct e-Mail ID or Check Internet Connection."
				redirectFlag=true
			}
		
		}
		if(redirectFlag)
		{
			render(view:"PersonalDetails", model:[machine:machine,doctors:docList,tempMOB:tempMOB,tempFN:tempFN,tempLN:tempLN,tempAGE:tempAGE,email:email,historyMN:historyMN,historyAddress:historyAddress, historyCity:historyCity, historyState:historyState, historyClinicalHistory:historyClinicalHistory,historyPincode:historyPincode])
			return
		}

		PatientDetails pd = new PatientDetails();
		pd?.salutation=params["salutation"]
		pd?.firstname = params["firstname"]
		pd?.middlename = params["middlename"]
		pd?.lastname = params["lastname"]
		pd?.age = Integer.parseInt(params["age"])
		pd?.gender = "Male"
		pd?.address = params["address"]
		pd?.pincode = params["pincode"]
		pd?.city = params["city"]
		pd?.state = params["state"]
		pd?.machine = machine
		pd?.email = params["email"]
		pd?.mobile = params["mobile"]
		pd?.priority1 = p1
		pd?.priority2 = p2
		pd?.priority3 = p3
		pd?.appointmenttype = 1;
		pd?.doc_id=Integer.parseInt( params["referral"])
		
		//String[] disease=params["diseasehistory"].toString().split(",")
		//print("hgfffff "+params["diseasehistory"].length  )
		
		int i
		if(params["diseasehistory"]!=null)
		if(params["diseasehistory"].toString().split(",").size()==1)
			pd?.disease=params["diseasehistory"]
		else if(params["diseasehistory"].length > 0){
			String str=""
			i=0
			while(i<params["diseasehistory"].length){
				str=str.concat(params["diseasehistory"][i])+"; "
				i++
			}
			pd?.disease=str
		}
		//String[] harmfulItems=params["harmful"].toString().split(",")
		if(params["harmful"]!=null)
		if(params["harmful"].class.toString().equalsIgnoreCase("java.lang.String"))
			pd?.harmfulitems=params["harmful"]
		else if(params["harmful"].length > 0){
			String str=""
			i=0
			while(i<params["harmful"].length){
				str=str.concat(params["harmful"][i])+";\n"
				i++
			}
			pd?.harmfulitems=str
		}
		
		//String[] scan=params["scanpart"].toString().split(",")
		if(params["scanpart"]!=null)
		if(params["scanpart"].toString().split(",").size()==1)
			pd?.scanof=params["scanpart"]
		else if(params["scanpart"].length > 0){
			String str=""
			i=0
			while(i<params["scanpart"].length){
				str=str.concat(params["scanpart"][i])+"; "
				i++
			}
			pd?.scanof=str
		}
		
		if(params["pregnant"].toString().equalsIgnoreCase("Yes"))
		pd?.pregnant="Yes"
		
		pd?.save();
		//log.info "Patient Details Saved Successfully"
		//redirect (action: 'mriof')
		render(view:'finish')
		
	}
	def mriof() {
		[machine:machine]
	}
	def questionare() {
	
	}
	def consent() {
		
	}
	def finish() {
		
	}
	/*UNORGANISED CODE*/
	/*def SelectDate() {
		def start = new Date();
		def last = new Date();
		last = last + 21;
		def day = start.getAt(Calendar.DAY_OF_WEEK)
		def prestart = start
		
		while (day != Calendar.SUNDAY)	{
			prestart--;
			day--;
		}
		
		//Extract StartTime and EndTime		
		def t1 = AdminSettings.findByEntry("centerStartTime")
		def t2 = AdminSettings.findByEntry("centerEndTime")

		String t11 = t1.value.toString()
		String t22 = t2.value.toString()

		starttime = Integer.parseInt(t11.split(":")[0]) * 60 + Integer.parseInt(t11.split(":")[1])
		endtime = Integer.parseInt(t22.split(":")[0]) * 60 + Integer.parseInt(t22.split(":")[1])
		
		//Working hours in mins and total slots in a normal day
		int workinghours = endtime - starttime
		int totalSlots = workinghours / timeRequired;

		//Array of free slots in all the available days
		def freeslots = new int[maxDays];
		Date d = new Date()
		d.putAt(Calendar.HOUR, 0)
		d.putAt(Calendar.MINUTE, 0)
		
		for (int i = 0 ; i < 21; i++){
			freeslots[i] = totalSlots - PatientDetails.countByConfirmedDateBetween(d, d + 1);
			d++;
		}
		
		//Exception of today for the above
		Date today = new Date();
		int starttime = today.getAt(Calendar.HOUR_OF_DAY) * 60;
		starttime += 180; //skipping 3 hours
		workinghours = endtime - starttime
	
		totalSlots = workinghours / timeRequired;
		today.putAt(Calendar.HOUR_OF_DAY, today.getAt(Calendar.HOUR_OF_DAY) + 3)
		freeslots[0] = totalSlots - PatientDetails.countByConfirmedDateBetween(today, d + 1);
		time_req = timeRequired
		k = time_req/60;
		[limits: [prestart, start, last], counter: counter, free: freeslots]
	}
	
	def SelectTime() {
		//Process the date selected and present time slots of that day
		
		//Step One: Process the date selected
		int year = Integer.parseInt(params["Year"])
		int month = Integer.parseInt(params["Month"])
		int day = Integer.parseInt(params["Day"])

		Date d1 = new Date(year - 1900, month, day)
		print d1
		Date d2 = d1 + 1
		print d2

		if (!p1.getAt(Calendar.HOUR))
			p1 = d1;
		else if (!p2.getAt(Calendar.HOUR))
			p2 = d1;
		else if (!p3.getAt(Calendar.HOUR))
			p3 = d1;
		else
			print "Possible error in SelectTimeFunction"

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
		def lower = sdf.format(d1)
		def upper = sdf.format(d2)
		def db = new Sql(dataSource)
		def items = db.rows("SELECT * FROM patient_details WHERE machine = ${machine} AND confirmed_date >= ${lower} AND confirmed_date <= ${upper}")
		def items_p1 = db.rows("SELECT * FROM patient_details WHERE machine = ${machine} AND priority1 >= ${lower} AND priority1 <= ${upper}")
		def arr = new int[24*k]
		for(int i=0;i<24*k;i++)
			arr[i]=0
		int n

		print "hello123 "+items
		for (int i = 0; i < items.size; i++)	{
			String[] str = items[i]["confirmed_date"].toString().substring(11, 16).split(":")
			print items[i]["confirmed_date"]
			n= Integer.parseInt(str[0])*k+Integer.parseInt(str[1])/time_req
			arr[n]=1;

		}
		print arr
		def arr_asterisk = new int[24*k]
		for(int i=0;i<24*k;i++)
			arr_asterisk[i]=0
		for (int i = 0; i < items_p1.size; i++)	{
			String[] str = items_p1[i]["priority1"].toString().substring(11, 16).split(":")
			print "hello  "+items_p1[i]["id"]
			n= Integer.parseInt(str[0])*k+Integer.parseInt(str[1])/time_req
			arr_asterisk[n]=1;

		}

		print "**********************************************"
		print arr_asterisk

		int cur_time=0
		String str=new Date().toString().substring(8, 10)
		print str
		if(new Date().toString().substring(8, 10).equalsIgnoreCase(d1.toString().substring(8, 10))){
			print "hiii123"
			cur_time=Integer.parseInt(new Date().toString().substring(11, 13))+3
			print cur_time
			if(cur_time==24)
			 cur_time=0
		}
		int o=60/time_req
		print "o is :  "+o
		print starttime/60
		[view:"SelectTime",map:[busy_asterisk:arr_asterisk,busy:arr],m:time_req,i:o,cur_time:cur_time,start_time:starttime/60,end_time:endtime/60]

	}*/
	
	
	def index() {
		p1 = new Date();
		p2 = new Date();
		p3 = new Date();
		p1.putAt(Calendar.HOUR_OF_DAY,0)
		p2.putAt(Calendar.HOUR_OF_DAY,0)
		p3.putAt(Calendar.HOUR_OF_DAY,0)

		p1.putAt(Calendar.MINUTE,0)
		p2.putAt(Calendar.MINUTE,0)
		p3.putAt(Calendar.MINUTE,0)

		p1.putAt(Calendar.SECOND,0)
		p2.putAt(Calendar.SECOND,0)
		p3.putAt(Calendar.SECOND,0)

	//	redirect(action:"SelectDate")
	}
	
	def SelectMachine() {
		counter = 0;
	}

	def SelectDate() {
		def machineInterval;
		/*if (!counter) {
			machine = params["machine"]

			if(machine.toString().equalsIgnoreCase("MRI"))	{
				machineInterval = "mriInterval";
			}
			else {
				machineInterval = "ctInterval";
			}

			def temp = AdminSettings.findByEntry(machineInterval)
			time_req = Integer.parseInt(temp.value)
			k = 60 /time_req		//no. of slots in 1 hour
			println "${machine} machine is selected and time req is :" + time_req
		}*/
		//Display Calendar

		time_req=timeRequired
		if((time_req/60).toString().contains("."))
		is_timereq_multipleof60=0
		else
		is_timereq_multipleof60=1
		k = 60 /time_req		//no. of slots in 1 hour
		println "${machine} machine is selected and time req is :" + time_req
		
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
		Date d = new Date()
		d.putAt(Calendar.HOUR_OF_DAY, 0)
		d.putAt(Calendar.MINUTE, 0)
		d.putAt(Calendar.SECOND, 0)
		def t1 = AdminSettings.findByEntry("centerStartTime")
		def t2 = AdminSettings.findByEntry("centerEndTime")

		String t11 = t1.value.toString()
		String t22 = t2.value.toString()



		starttime = Integer.parseInt(t11.split(":")[0]) * 60 + Integer.parseInt(t11.split(":")[1])
		endtime = Integer.parseInt(t22.split(":")[0]) * 60 + Integer.parseInt(t22.split(":")[1])
		starttime_min=Integer.parseInt(t11.split(":")[1])
		int workinghours = endtime - starttime
		int intervals = workinghours / time_req;
	
		print "intervals is :"+intervals+"  "+PatientDetails.countByConfirmedDateBetweenAndMachine(d, d + 1,machine)

		print d
		for (int i = 0 ; i < 21; i++){
			freeslots[i] = intervals - PatientDetails.countByConfirmedDateBetweenAndMachine(d, d + 1,machine);
		
			d++;
		}
		print "   "+freeslots
		Date today = new Date();
		int k=starttime
		int starttime = today.getAt(Calendar.HOUR_OF_DAY) * 60;
		starttime += 180;
		workinghours = endtime - starttime
		if(workinghours<0)
			workinghours=0
		println starttime
		println endtime
		println workinghours
		int totalNoOfIntervals=intervals
		if(k<(today.getAt(Calendar.HOUR_OF_DAY) * 60+today.getAt(Calendar.MINUTE) ))
		intervals = workinghours / time_req;
		today.putAt(Calendar.HOUR_OF_DAY, today.getAt(Calendar.HOUR_OF_DAY) + 3)
		d = new Date()
		d.putAt(Calendar.HOUR_OF_DAY, 0)
		d.putAt(Calendar.MINUTE, 0)
		d.putAt(Calendar.SECOND, 0)
		String str=today.toString()
		print str
		print (d+1)
		print PatientDetails.countByConfirmedDateBetweenAndMachine(today, d + 1,machine)
		print intervals
		freeslots[0] = intervals - PatientDetails.countByConfirmedDateBetweenAndMachine(today, d + 1,machine);
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
		[limits: [prestart, start, last], counter: counter, free: freeslots,totalNoOfIntervals:totalNoOfIntervals,currentmonth:currentmonth,nextmonth:nextmonth.format("MMMM"),nxtmonth:nxtmonth]
		
	}

	def SelectTime() {
		is_starttime_Decimal=0
		is_endtime_Decimal=0
		//Process the date selected and present time slots of that day
		//Step One: Process the date selected
		int year = Integer.parseInt(params["Year"])
		int month = Integer.parseInt(params["Month"])
		int day = Integer.parseInt(params["Day"])

		Date d1 = new Date(year - 1900, month, day)
		print d1
		Date d2 = d1 + 1
		print d2

		
		print "helloooo  "+p1
		if (!p1.getAt(Calendar.HOUR_OF_DAY)){
			p1 = d1;
			print "p1 is "+p1
		}
		else if (!p2.getAt(Calendar.HOUR_OF_DAY)){
			p2 = d1;
			print "p2 is  "+p2
		}
		else if (!p3.getAt(Calendar.HOUR_OF_DAY)){
			p3 = d1;
			print "p3 is  hii "+p3
		}
		else
			print "Possible error in SelectTimeFunction"

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
		def lower = sdf.format(d1)
		def upper = sdf.format(d2)
		def db = new Sql(dataSource)
		def items = db.rows("SELECT * FROM patient_details WHERE machine = ${machine} AND confirmed_date >= ${lower} AND confirmed_date <= ${upper}")
		def items_p1 = db.rows("SELECT * FROM patient_details WHERE machine = ${machine} AND priority1 >= ${lower} AND priority1 <= ${upper} And confirmed_date is null")
		def arr = new int[24*k]
		int n

		for (int i = 0; i < items.size; i++)	{
			String[] str = items[i]["confirmed_date"].toString().substring(11, 16).split(":")
		n= Integer.parseInt(str[0])*k+Integer.parseInt(str[1])/time_req
			arr[n]=1;

		}
		print arr
		def arr_asterisk = new int[24*k]
		for (int i = 0; i < items_p1.size; i++)	{
			String[] str = items_p1[i]["priority1"].toString().substring(11, 16).split(":")
			print "hello"
			n= Integer.parseInt(str[0])*k+Integer.parseInt(str[1])/time_req
			arr_asterisk[n]=1;

		}

		print "**********************************************"
		print arr_asterisk

		int cur_time=0
		String str=new Date().toString().substring(8, 10)
		print str
		if(new Date().toString().substring(8, 10).equalsIgnoreCase(d1.toString().substring(8, 10))){
			print "hiii123"
			cur_time=Integer.parseInt(new Date().toString().substring(11, 13))+3
			print cur_time
			if(cur_time==24)
			 cur_time=0
		}
		int o=60/time_req
		print o
		int start=starttime/60
		int end=endtime/60
		/*if((starttime/60).toString().contains("."))
		is_starttime_Decimal=1
		if((endtime/60).toString().contains("."))
		is_endtime_Decimal=1*/
		print endtime/60
		print time_req
		print "asd  "+starttime_min
		[view:"SelectTime",map:[busy_asterisk:arr_asterisk,busy:arr],m:time_req,i:o,cur_time:cur_time,start_time:start,end_time:end,startFlag:is_starttime_Decimal,start_min:starttime_min,is_timereq_multipleof60:is_timereq_multipleof60,endTime_inMin:endtime]

	}
	def TimeSelected() {


		/*int selected = Integer.parseInt(params["slot"])
		 println "The Selected Slot is: ${selected}"
		 if (counter == 0)	{
		 p1.putAt(Calendar.HOUR, selected)
		 println p1
		 counter++;
		 }
		 else if (counter == 1) {
		 p2.putAt(Calendar.HOUR, selected)
		 if (p1 != p2)
		 counter++;
		 }
		 else if (counter == 2) {
		 p3.putAt(Calendar.HOUR, selected)
		 if (p1 != p3 && p2 != p3)
		 counter++;
		 }
		 println "The value of counter is ${counter} *****"
		 if (counter <= 2)
		 redirect(action:"SelectDate")
		 else
		 redirect(action:"PersonalDetails")*/
		String[] a=params.get("slot").toString().split(",")
		println "The Selected Slot is: "+a[0]+":"+a[1]
		if (counter == 0)	{
			p1.putAt(Calendar.HOUR_OF_DAY, Integer.parseInt(a[0]))
			p1.putAt(Calendar.MINUTE, Integer.parseInt(a[1]))
			print p1
			counter++;
		}
		else if (counter == 1) {
			p2.putAt(Calendar.HOUR_OF_DAY, Integer.parseInt(a[0]))
			p2.putAt(Calendar.MINUTE, Integer.parseInt(a[1]))
			print p2
			if (p1 != p2)
				counter++;
			else
				flash.message="You have already selected this date.Please select another one."
		}
		else if (counter == 2) {
			print "p3 is  "+p3
			p3.putAt(Calendar.HOUR_OF_DAY, Integer.parseInt(a[0]))
			p3.putAt(Calendar.MINUTE, Integer.parseInt(a[1]))
			print p3
			if (p1 != p3 && p2 != p3)
				counter++;
			else
				flash.message="You have already selected this date.Please select another one."
		}
		println "The value of counter is ${counter} *****"
		if (counter <= 2)
			redirect(action:"SelectDate")
		else
		{
			def db=new Sql(dataSource)
			docList=db.rows("Select * from doctor")
			render(view:"PersonalDetails", model:[machine:machine,doctors:docList])
		}

	}

	def PersonalDetails() {
		
	}


	def ContactDetails() {
		fname = params["firstname"]
		lname = params["lastname"]
		age = Integer.parseInt(params["age"])
		gen = params["gender"]
		

	}
	def FinalPage() {
		PatientDetails pd = new PatientDetails();
		pd?.firstname = fname
		pd?.lastname = lname
		pd?.age = age
		pd?.gender = gen
		pd?.address = params["address"]
		pd?.machine = machine
		pd?.email = params["email"]
		pd?.mobile = params["mobile"]
		pd?.priority1 = p1
		pd?.priority2 = p2
		pd?.priority3 = p3
		
		/*PatientDetails pda = new PatientDetails(firstname:"Suresh", lastname:"Sarda", age:21, gender:"Male", machine:"MRI", address:"Pune", email:"suresh@gmail.com", mobile:"8983138683", priority1:"${p1}",
		 priority2:"${p2}", priority3:"${p3}");
		 pda.save();*/
		/*
		 pd["firstname"] = fname
		 pd["lastname"] = lname
		 pd["age"] = age
		 pd["gender"] = gen
		 pd["address"] = params["address"]
		 pd["mobile"] = params["mobile"]
		 pd["email"] = params["email"]
		 pd["machine"] = machine
		 pd["p1"] = p1
		 pd["p2"] = p2
		 pd["p3"] = p3*/
		pd.save();
		print "Saved in database"

	}

	def procedurePreparation() {
		
	}
	def datetime() {

	}
}
