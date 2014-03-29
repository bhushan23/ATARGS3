package atargs3

import groovy.sql.Sql


class AdminSettingsController {
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
	static String smscode;
static String smsuser;
static String smspass;
static boolean smsservice;
static boolean emailservice;
	static String confirmedsms;
	def index() {
		redirect(view:"ControlPanel")
	}
	def dataSource
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
		print params["sms"]
		def db = new Sql(dataSource)
	
		db.execute("UPDATE admin_settings SET value='${params["smsuser"]}' WHERE entry='smsuser'")
		db.execute("UPDATE admin_settings SET value='${params["smspass"]}' WHERE entry='smspass'")
		
		db.execute("UPDATE admin_settings SET value='${params["sms"]}' WHERE entry='smsfacility'")
		
		db.execute("UPDATE admin_settings SET value='${params["start"]}' WHERE entry='centerStartTime'")
		db.execute("UPDATE admin_settings SET value='${params["end"]}' WHERE entry='centerEndTime'")
		
		db.execute("UPDATE admin_settings SET value='${params["mriinterval"]}' WHERE entry='mriInterval'")
		db.execute("UPDATE admin_settings SET value='${params["ctinterval"]}' WHERE entry='ctInterval'")
		
		db.execute("UPDATE admin_settings SET value='${params["smscode"]}' WHERE entry='smscode'")
		db.execute("UPDATE admin_settings SET value='${params["confirmedmsg"]}' WHERE entry='confirmmsg'")
		smscode=String.valueOf(params['smscode'])
		confirmedsms=String.valueOf(params['confirmedmsg'])
		smsuser=String.valueOf(params['smsuser'])
		smspass=String.valueOf(params['smspass'])
		print "updated values \nSMSUSER ${smsuser} \n SMSPASS ${smspass}    ${smscode}"
		
		
		redirect (controller: 'Admin', view:'index')
	}
}
