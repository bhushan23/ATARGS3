package atargs3
import atargs3.PatientDetails;

import groovy.sql.Sql
import java.awt.List;
import java.text.SimpleDateFormat
import java.util.Formatter.DateTime


class SMSReceiverController {
def dataSource
	def confirm1(){
		String sender=String.valueOf(params['who'])
		String msg=String.valueOf(params['what'])
		//print "got msg from $sender: $msg"
		String shortcode=AdminSettingsController.smscode;
		String confirmmsg=AdminSettingsController.confirmedsms;
		shortcode=shortcode.toUpperCase();
		if(msg!=null){
			if(msg.startsWith(shortcode) && msg.length()<=shortcode.length()+2){
				if(sender.length()!=10){
					sender=sender.substring(2, sender.length())
				}
				String[] ar=msg.split(" ")
				String choice= ar[1]
				String getpriority="priority"+choice
				def temp=PatientDetails.findWhere(mobile:"${sender}")
				if(temp==null)
				render("We don't have any appointment booked from this mobile number.Please call customer care")
				else{


					if(temp.confirmedDate==null) {
						if(temp.appointmenttype.equals("viaSMS")){

							def apt=PatientDetails.findWhere(confirmedDate:temp.priority1)
							if(apt==null){	
								temp.confirmedDate=temp.priority1
									render("Your Appointment of Date '${temp.confirmedDate}' has been confirmed."+AdminSettingsController.confirmedsms)
							}//apt 1 is not confirmed
							else{
										 apt=PatientDetails.findWhere(confirmedDate:temp.priority2)
											if(apt==null){
												//appointment priority 2 available
												temp.confirmedDate=temp.priority2
												render("Your Appointment of Date '${temp.confirmedDate}' has been confirmed."+AdminSettingsController.confirmedsms)
										
											}else {
													apt=PatientDetails.findWhere(confirmedDate:temp.priority3)
													if(apt==null){
														//appointment priority 3 available
														temp.confirmedDate=temp.priority3
															render("Your Appointment of Date '${temp.confirmedDate}' has been confirmed."+AdminSettingsController.confirmedsms)
												
													}else{
													//Appointment not available please TRY AGAIN
													render("Sorry. Your Previous Priorities are NOT AVAILABLE Please BOOK APPOINTMENT AGAIN")
													}
											}
								 
								 
								}
									}else{
							render("You have already booked your appointment using the Online Booking Facility. You will be shortly informed about the confirmation of your Appointment")
						}
					}else{

						render("Your Appointment has confirmed as '${temp.confirmedDate}'")
					}
				}
			}else

				render("Invalid message")
		}else{
			render("Invalid message")
		}
	}
	def confirm2(){
		String sender=String.valueOf(params['who'])
		String msg=String.valueOf(params['what'])
		print "got msg from $sender: $msg"
	String shortcode=AdminSettingsController.smscode;
		shortcode=shortcode.toUpperCase();
		if(msg!=null){
			if(msg.startsWith(shortcode) && msg.length()<=shortcode.length()+2){
				if(sender.length()!=10){
					sender=sender.substring(2, sender.length())
				}
				print sender
				String[] ar=msg.split(" ")
				String choice= ar[1]
				String getpriority="priority"+choice
				def temp=PatientDetails.findWhere(mobile:"${sender}")
				if(temp==null)
					render("We don't have any appointment booked from this mobile number. Please call customer care")
				else{


					if(temp.confirmedDate==null) {
						if(temp.appointmenttype.equals("viaSMS")){

							def apt=PatientDetails.findWhere(confirmedDate:temp.priority2)
							if(apt==null){
								//appointment priority 2 available
								temp.confirmedDate=temp.priority2
								
								render("Your Appointment of Date '${temp.confirmedDate}' has been confirmed."+AdminSettingsController.confirmedsms)
						
							}else {
									apt=PatientDetails.findWhere(confirmedDate:temp.priority3)
									if(apt==null){
										//appointment priority 3 available
										temp.confirmedDate=temp.priority3
										
										render("Your Appointment of Date '${temp.confirmedDate}' has been confirmed."+AdminSettingsController.confirmedsms)
								
									}else{
									//Appointment not available please TRY AGAIN
									render("Sorry. Your Previous Priorities are NOT AVAILABLE. Please BOOK APPOINTMENT AGAIN")
									}
							
							
							
								}
						}else{
							render("You have already booked your appointment using the Online Booking Facility. You will be shortly informed about the confirmation of your Appointment")
						}
					}else{

						render("Your Appointment has confirmed as '${temp.confirmedDate}'")
					}
				
			
		}
	}else{	
		render("Invalid message")
	}
		}else{
			render("Invalid message")
		}
			
						
}
	def confirm3(){
		String sender=String.valueOf(params['who'])
		String msg=String.valueOf(params['what'])
		print "got msg from $sender: $msg"
String shortcode=AdminSettingsController.smscode;
		shortcode=shortcode.toUpperCase();
		if(msg!=null){
			if(msg.startsWith(shortcode) && msg.length()<=shortcode.length()+2){
				if(sender.length()!=10){
					sender=sender.substring(2, sender.length())
				}
				print sender
				String[] ar=msg.split(" ")
				String choice= ar[1]
				String getpriority="priority"+choice
				def temp=PatientDetails.findWhere(mobile:"${sender}")
				if(temp==null)
					render("We don't have any appointment booked from this mobile number.Please call customer care")
				else{


					if(temp.confirmedDate==null) {
						if(temp.appointmenttype.equals("viaSMS")){


							temp.confirmedDate=temp.priority3
							render("Your Appointment of Date '${temp.confirmedDate}' has been confirmed "+AdminSettingsController.confirmedsms)
						}else{
							render("You have already booked your appointment using the Online Booking Facility. You will be shortly informed about the confirmation of your Appointment")
						}
					}else{

						render("Your Appointment has confirmed as '${temp.confirmedDate}'")
					}
				}
			}else

				render("Invalid message")
		}else{
			render("Invalid message")
		}
	}

	def cancel(){
		String sender=String.valueOf(params['who'])
		String msg=String.valueOf(params['what'])
		String shortcode=AdminSettingsController.smscode;
		print "got msg from $sender: $msg"
		if(msg!=null){

			if(sender.length()!=10){
				sender=sender.substring(2, sender.length())
			}
			print sender

			def temp=PatientDetails.findWhere(mobile:"${sender}")
			if(temp==null)
				render("We don't have any appointment booked from this mobile number.Please call customer care")
			else{
				PatientDetails.executeUpdate("delete PatientDetails p where p.mobile =:sender1",[sender1:sender])
				render("Your Appointment has been Canceled. To book an appointment type ${shortcode} {date E.g. 2014-01-24} Machine {MRI or CT}")
			}
		}
		else
			render("Invalid Message. Please take care of Message Format")
	}

	def getbydate(){
		boolean insert_into_db=true;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
		String sender=String.valueOf(params['who'])
		String msg=String.valueOf(params['what'])
		print "got msg from $sender: $msg"
		String shortcode=AdminSettingsController.smscode;
		shortcode=shortcode.toUpperCase();
		if(sender.length()!=10){
			sender=sender.substring(2, sender.length())
		}
		print sender
		msg=msg.replaceAll(" ","")
		msg=msg.toUpperCase()
		print "||| now msg is "+msg
		if(msg.startsWith(shortcode) && msg.length() >= shortcode.length()+8){
			
			def temp1=PatientDetails.findWhere(mobile:"${sender}")
			if(temp1==null || temp1['confirmedDate']==null) {
				String[] ar=new String[3]
				ar[0]=msg.substring(shortcode.length(), msg.length())
				print "sub is "+ar[0]
				print "||| Date is "+ar[0]
				String[] startdate=new String[3]
				if(ar[0].contains("-"))
				 startdate=ar[0].split('-')
				 else if(ar[0].contains("/"))
				 startdate=ar[0].split('/')
				 startdate[2]=startdate[2].substring(0,2);
				String machineselected=msg.substring(shortcode.length()+10)
				print "||| mschine "+machineselected
				if(msg.contains("MRI") || msg.contains("CT")){//machineselected =="MRI" || machineselected =="CT" ){
					int flag=1
					int year1 = Integer.parseInt(startdate[0] )
					int month1 = Integer.parseInt(startdate[1] )
					int day1 = Integer.parseInt(startdate[2])

					Date d1 = new Date(year1 - 1900, month1-1, day1)

					
					def lower = sdf.format(d1)
					Calendar calendar = Calendar.getInstance();
					print d1
					print sdf.format(d1)
					def admins=AdminSettings.findWhere(entry:"centerStartTime")
					def adminend=AdminSettings.findWhere(entry:"centerEndTime")

					String startat=admins['value']
					print startat
					String[] starting=String.valueOf(startat).split(":")

					int starthour=Integer.parseInt(starting[0])
					int startmin=Integer.parseInt(starting[1])

					//ending time
					String endat=adminend['value']
					print endat
					String[] ending=String.valueOf(endat).split(":")

					int endhour=Integer.parseInt(ending[0])
					int endtmin=Integer.parseInt(ending[1])

					//

					calendar.setTime(d1);

					calendar.set(Calendar.HOUR_OF_DAY, starthour);
					calendar.set(Calendar.MINUTE, startmin);
					
					d1 = calendar.getTime();

					def udate=sdf.format(d1);
					print d1
					print sdf.format(d1)
					int count_max_app=0;
					Date[] prio=new Date[3]
					Date cur_date=new Date()
					Date comp_date=new Date()
					
					if(cur_date.day == d1.day){
						print "same day"
					
						if(cur_date.hours+3 >=endhour){
							calendar.add(Calendar.DAY_OF_MONTH, 1);
							calendar.set(Calendar.HOUR, starthour);
							
						}	
						else
						calendar.set(Calendar.HOUR, cur_date.hours+3);
						d1 = calendar.getTime();

					}
			
					
					if(cur_date > d1){

						render("Date you have requested has already passed. Please Message valid date.$cur_date and $d1")
					}

					else {
						
						

						//def items = db.rows("SELECT * FROM patient_details WHERE confirmed_date >= ${lower} AND confirmed_date <= ${upper}")

						for(int i=0;i<3 && flag==1;){
							if(count_max_app==30){
								render("Currently No appointments available")
							insert_into_db=false;
									break;
							}	
							count_max_app++;
							
										print count_max_app
							if(d1.hours >= endhour)
							{
								calendar.setTime(d1);
								calendar.add(Calendar.DAY_OF_MONTH, 1);
								calendar.set(Calendar.HOUR_OF_DAY, starthour);
								calendar.set(Calendar.MINUTE, startmin);

								d1 = calendar.getTime();


								print sdf.format(d1)
							}else{
							
					
								print "working on $d1"
								def temp=PatientDetails.findByConfirmedDate(d1) //.findbyconfirmed_date("$udate")
								if(temp==null){
									print "free slot found at $d1  this is priority $i"
									udate=sdf.format(d1);
									print udate+"   dfgf"

									print "d1 is :"+d1
									prio[i]=sdf.parse(udate)
									//Date d3=sdf.parse(sdf.format(d1))
									//prio_date[i]=new DateTime(d3)
									//print "hh"+d3
									i++
									calendar.setTime(d1);
									calendar.add(Calendar.HOUR, 1);
									d1 = calendar.getTime();
								}
								else
								{
									print "busy slot $d1"
									calendar.setTime(d1);
									calendar.add(Calendar.HOUR, 1);
									d1 = calendar.getTime();
									udate=sdf.format(d1);

								}

							}

						}

						if(insert_into_db){
						//Sql.execute("insert into patient_details (firstname,lastname,age,gender,machine,address,mobile,priority1,priority2,priority3,email) values (enterincenter,enterincenter,10,Male,${machineselected},enterincenter,${sender},${prio_date[0]},${prio_date[1]},${prio_date[2]})")
						//	PatientDetails newpat=new PatientDetails(firstname:'enterincenter',lastname:'enterincenter',age:'10',gender:'Male',machine:'$machineselected',address:'enterincenter',mobile:'$sender',priority1:'$prio_date[0]',priority2:'$prio_date[1]',priority3:'$prio_date[2]',email:'a@a.com').save();
						print prio
						/*	PatientDetails pda = new PatientDetails(firstname:"Suresh", lastname:"Sarda", age:21, gender:"Male", machine:"MRI", address:"Pune", email:"suresh@gmail.com", mobile:"${sender}", priority1:"${prio[0]}",
						 priority2:"${prio[1]}", priority3:"${prio[2]}");
						 */
						if(temp1!=null && temp1['confirmedDate']==null){
							
							temp1.priority1 = prio[0]
							temp1.priority2 = prio[1]
							temp1.priority3 = prio[2]
							temp1.appointmenttype="viaSMS"
							temp1.save();
							print "updated values"
							render("Reply ${shortcode} 1 for ${prio[0]} \nReply ${shortcode} 2 for ${prio[1]} \n Reply ${shortcode} 3 for ${prio[2]} ")
						}
						else{
						PatientDetails pd = new PatientDetails();
						pd?.firstname = "fname"
						pd?.middlename = "mname"
						pd?.lastname ="lname"
						pd?.age = 40
						pd?.gender = "Male"
						pd?.address = ""
						pd?.machine = machineselected
						//pd?.email = "email@em.com"
						pd?.mobile = sender
						print(machineselected+"  "+sender)
						pd?.priority1 = sdf.parse(sdf.format(prio[0]))
						pd?.priority2 = sdf.parse(sdf.format(prio[1]))
						pd?.priority3 = sdf.parse(sdf.format(prio[2]))
						pd?.appointmenttype="viaSMS"
						pd?.doc_id=0
					//	pd?.docid=null
						pd?.save()

						print "patient saved123"
						render("Reply ${shortcode} 1 for ${prio[0]} \nReply ${shortcode} 2 for ${prio[1]} \n Reply ${shortcode} 3 for ${prio[2]} ")
						}
						}
					}

				}
				else
				{
					render("Please input Correct MSG eg. ${shortcode} 2014-01-01 MRI ${sender}  ${msg}")
				}
			}else{
				render("We have encountered an appointment from this number. To get another appointment please proceed previous appointment or call customer care")
			}
		
		}else{
			render("Please input correct Message e.g. "+shortcode+" 2014-01-14 MRI")
			
		}

	}

	def index() {


		String sender=String.valueOf(params['who'])
		String msg=String.valueOf(params['what'])
		print "got msg from $sender: $msg"
		if(msg==null || msg.length()!=7)
			render ("To book an Appointment has not confirmed Please call Customer Care 918983062202")
		else {
			String[] splits = msg.split(" ")
			String choice
			if(splits[1]!=null)
				choice=splits[1]
			else
				choice=splits[0]

			String[] list=sender.split("91")
			if(list[1].length()==10) {
				String senderc=list[1]

				def temp = PatientDetails.findWhere(mobile:senderc)
				if(temp==null)
					render ("Your Appointment has not been confirmed. Please call Customer Care 918983062202")
				else{
					String to_confirm="priority"+choice
					switch(Integer.parseInt(choice)){
						case 1:
							temp.confirmedDate=temp.priority1
							break;
						case 2:
							temp.confirmedDate=temp.priority2
							break;
						case 3:
							temp.confirmedDate=temp.priority1
							break;
						default:
							render("Your Appointment has not been confirmed. Please call Customer Care 918983062202")
					}

					String confirmeddate=String.valueOf(temp.confirmedDate);
					render("Your Appointment for choice $choice confirmed ${list[1]} $confirmeddate")

				}
			}

		}
	}
}
