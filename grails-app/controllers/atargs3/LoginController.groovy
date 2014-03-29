package atargs3

import grails.plugin.jxl.builder.ExcelBuilder
import groovy.sql.Sql

import java.text.SimpleDateFormat

class LoginController {
	static def UserLoggedin=null;

	def login(){
	}

	def loginAsReceptionist(){
	}
	def loginAsDoctor(){
	}
	def admin_login_function(){
		String plainpass=params['password']
		String hashedpass=	 org.apache.commons.codec.digest.DigestUtils.sha256Hex(plainpass);
		//String hashedpass='admin'
		printf hashedpass
		def temp = Admin.findWhere(username:params['username'],password:hashedpass)
		
		if(temp==null){
			flash.message="Invalid Username/Password"
			redirect(action:'login')
		}
		else{

		
			session.UserLoggedin= temp
			session['usertype']="ADMIN"
			print session.UserLoggedin
			flash.message="Logged in as Admin"
			redirect(controller:'Admin',action:'index')
		}
	}
	def doctor_login_function(){
		
		def temp=Doctor.findByUsername(params['username'])
		if(temp==null) {
			flash.message="Invalid Username/Password"
			redirect(action:'loginAsDoctor')
	
				}
		
		else if(temp.confirmedFlag==1){
			String plainpass=params['password']
			String hashedpass=	 org.apache.commons.codec.digest.DigestUtils.sha256Hex(plainpass);
			UserLoggedin= Doctor.findWhere(username:params['username'],password:hashedpass)
			session.UserLoggedin= UserLoggedin
			session['usertype']="DOCTOR"
			print session.UserLoggedin
			if (UserLoggedin) {
				flash.message="Logged in as Doctor"
				redirect(controller:'Doctor',action:'index')
			}
			else{
				flash.message="Incorrect Username Password Pair try Again"
				redirect(action:'loginAsDoctor')
			}
		}
		else{
			flash.message="Account not yet confirmed"
			redirect(action:'loginAsDoctor')
		}
	}

	def receptionist_login_function(){

		def temp=Reception.findByUsername(params['username'])
		if(temp==null) {
			flash.message="Invalid Username/Password "
			redirect(action:'loginAsReceptionist')
		}
		else if(temp.confirmedFlag==1){
			String plainpass=params['password']
			String hashedpass=	 org.apache.commons.codec.digest.DigestUtils.sha256Hex(plainpass);
			//String hashedpass=plainpass
			UserLoggedin= Reception.findWhere(username:params['username'],password:hashedpass)
			session.UserLoggedin= UserLoggedin
			session['usertype']="RECEPTIONIST"
			print session.UserLoggedin
			if (UserLoggedin) {
				flash.message="Logged in as receptionist"
				redirect(controller:'Reception',action:'index')
			}
			else{
				flash.message="Incorrect Username Password try Again"
				redirect(action:'loginAsReceptionist')
			}
		}
		else{
			flash.message="Account not yet confirmed"
			redirect(action:'loginAsReceptionist')
		}
	}


	def doLogin = {
		String user_is =params['username']

		def temp=Admin.findByUsername(user_is)
		
		


		if(temp)
			admin_login_function()
		else{
			def temp1=Doctor.findByUsername(user_is)
			if(temp1)
			doctor_login_function()
			
			else{
				def temp2=Reception.findByUsername(user_is)
				if(temp2)
			receptionist_login_function()
			}
				}
			}
	def dataSource
	def logout() {
		
	session.UserLoggedin=null
	session['usertype']=null;
	redirect(uri: "/")


		
	}
	def SignupAsDoctor() {
		UserLoggedin ="GuestUser"
		session.UserLoggedin= UserLoggedin
		session['usertype']='GuestUser';
		//print UserLoggedin
		redirect(controller:'Doctor',action:'create')
	}

	def SignupAsReceptionist() {
		UserLoggedin ="GuestUser"// Admin.findWhere(username:'admin',password:'admin')
		session.UserLoggedin= UserLoggedin
		session['usertype']='GuestUserRec';
		//print UserLoggedin
		redirect(controller:'Reception',action:'create')
	}

	def loggedinhomepage() {
		String cur_user= session.UserLoggedin
		if(String.valueOf(session['usertype']).equals("GuestUser")){
			redirect(controller:'Doctor',action:'create')
			
		}
		else if(String.valueOf(session['usertype']).equals("GuestUserRec")){
			redirect(controller:'Reception',action:'create')
			
		}
		else{
		String user=Admin.findWhere(username:cur_user)
		if(user!="admin"){
			user=Reception.findWhere(username:cur_user)
			if(user==null) {
				user=Doctor.findWhere(username:cur_user)
				if(user != null)
					redirect(controller:'Doctor',action:'index')
			}
			else {
				redirect(controller:'Reception',action:'index')
			}
		}
		else
			redirect(controller:'admin',action:'index')
		}
	}
	def index() {
	}
	def completesignup(){
		
		session.UserLoggedin=null
		redirect(uri: "/")
	}
	
	def takeBackup(){
		print "hello"
		int i=0
		
		def db=new Sql(dataSource)
		List result=db.rows("Select * from patient_details where confirmed_date is not null")
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd")
		//sdf.parse()
		Date d=new Date()
		d=d+1
		//d=sdf.parse(sdf.format(d))
		//print sdf.format(result[i].confirmed_date)+"   "+sdf.format(d)
		
		while(i<result.size()){
		
			if(sdf.format(result[i].confirmed_date).equalsIgnoreCase(sdf.format(d))){
				print result[i].firstname
				i++
			}
			else
				result.remove(i)
				
			
		}
		i=0
		String path=new String()
		String fileName=new String()
		fileName=sdf.format(d)
		path=fileName+".xls"
	
		response.setHeader("Content-disposition", "attachment;filename=${path}")
		response.setContentType("application/excel")
		new ExcelBuilder().workbook(response.outputStream) {
			sheet('0') {
				cell(0,0,'First Name').bold()
				cell(1,0,'Last Name').bold()
				cell(2,0,'Machine').bold()
				cell(3,0,'Appointment Time').bold()
				cell(4,0,'Mobile No.').bold()
				while(i<result.size()){
				cell(0,i+1,result[i].firstname)		//column,row
				cell(1,i+1,result[i].lastname)
				cell(2,i+1,result[i].machine)
				cell(3,i+1,result[i].confirmed_date.toString().substring(11, result[i].confirmed_date.toString().size()-2))
				cell(4,i+1,result[i].mobile)
				i++
				}
				for(int x=0;x<5;x++)
				sheet.setColumnView(x, 20);
			}
			
		}
/*
		File file = new File(path)
	if(file.isFile()){
	response.setContentType("application/excel")
	response.setHeader("Content-disposition", "attachment;filename=${file.getName()}")
	response.outputStream << file.newInputStream()

	}*/
	}
}

