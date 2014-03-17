/*package atargs3
 import groovy.sql.Sql
 import java.text.SimpleDateFormat
 import java.sql.Date;
 import java.text.SimpleDateFormat;
 import java.util.Calendar;
 import java.text.SimpleDateFormat
 class DocumentController {
 def scaffold=Document
 static allowedMethods = [save: "POST"]
 def dataSource
 def red(){
 render (view:'main')
 }
 def getReport(){
 }
 def index() {
 redirect(action: "list", params: params)
 }
 def list() {
 params.max = 10
 [documentInstanceList: Document.list(params), documentInstanceTotal: Document.count()]
 }
 def create() {
 }
 def upload() {
 def id = params['pid']
 def sum = params['sum']
 int ppid=Integer.parseInt(id);
 print ppid
 def db = new Sql(dataSource)
 def result1=db.rows("SELECT Is_Paid from patient where id='$ppid'")
 String res= result1['Is_Paid']
 String res1=res.substring(1, res.length()-1)
 print res1
 if(res1.equals("true")){
 def file = request.getFile('file')
 if(file.empty) {
 flash.message = "File cannot be empty"
 } else {
 SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yy");
 Calendar f =Calendar.getInstance();
 java.util.Date issue=f.getTime();
 f.add(Calendar.DAY_OF_YEAR, 7);
 java.util.Date due=f.getTime();
 String strIss=sdf.format(issue);
 String strDue=sdf.format(due);
 java.sql.Date siss=new Date(issue.getTime());
 java.sql.Date sdue=new Date(due.getTime());
 def documentInstance = new Document()
 documentInstance.filename = file.originalFilename
 documentInstance.fullPath = grailsApplication.config.uploadFolder + documentInstance.filename
 file.transferTo(new File(documentInstance.fullPath))
 documentInstance.save()
 print documentInstance.filename
 db.execute("UPDATE patient set file='$documentInstance.fullPath',exp_Date='$sdue',summary='$sum' where id='$ppid'")
 }
 redirect (action:'list')
 }
 else{
 render(view:'notPaid')
 }
 }
 def moneyPay(){
 redirect(controller:'Patient',action:'moneyPay')
 }
 def download(long did) {
 print "hiii"+params.otp
 def db = new Sql(dataSource)
 //def id = params['otp']
 def id=request.getParameter('otp')
 int ppid=Integer.parseInt(id);
 def result=db.rows("select file from patient_details where otp='$ppid'")
 String fl = result['file']
 if(fl.equals("[]"))
 render(view:'otperror')
 else{
 def filename=fl.substring(1, fl.length()-1)
 print filename
 def result1=db.rows("select id from document where full_path='$filename'")
 String sid = result1['id']
 def ssid=sid.substring(1, sid.length()-1)
 int iid=Integer.parseInt(ssid)
 Document documentInstance = Document.get(iid)
 if ( documentInstance == null) {
 flash.message = "Document not found."
 redirect (action:'list')
 } else {
 response.setContentType("APPLICATION/OCTET-STREAM")
 response.setHeader("Content-Disposition", "Attachment;Filename=\"${documentInstance.filename}\"")
 def file = new File(documentInstance.fullPath)
 def fileInputStream = new FileInputStream(file)
 def outputStream = response.getOutputStream()
 byte[] buffer = new byte[4096];
 int len;
 while ((len = fileInputStream.read(buffer)) > 0) {
 outputStream.write(buffer, 0, len);
 }
 def result2=db.rows("select id from patient_details where otp='$ppid'")
 String siid = result2['id']
 def siiid=siid.substring(1, siid.length()-1)
 int cid=Integer.parseInt(siiid)
 db.execute("Update patient_details set otp='' where id='$cid'")
 outputStream.flush()
 outputStream.close()
 fileInputStream.close()
 }
 }
 }
 }
 */


package atargs3

import groovy.sql.Sql
import java.text.SimpleDateFormat
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class DocumentController {
	def mid
	def scaffold=Document
	static allowedMethods = [save: "POST"]
	def dataSource
	
	def red(){
		render (view:'main')
	}
	def index() {
		redirect(action: "list", params: params)
	}

	def list() {
		params.max = 10
		[documentInstanceList: Document.list(params), documentInstanceTotal: Document.count()]
	}

	def create() {
	}

	def getReport(){
	}

	def upload() {
		//					print "helllllloooo"
		//				def var=params.filename
		//			print var;
		def id = params['pid']
		def sum = params['sum']
		int ppid=Integer.parseInt(id);
		print ppid

		def db = new Sql(dataSource)
		def result1=db.rows("SELECT Is_Paid from patient where id='$ppid'")

		String res= result1['Is_Paid']
		String res1=res.substring(1, res.length()-1)
		print res1
		if(res1.equals("true")){


			def file = request.getFile('file')
			//def file = request.getFile('file')
			println "Here : ${file.originalFilename}"
			def ofname=file.originalFilename
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

				SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yy");
				Calendar f =Calendar.getInstance();
				java.util.Date issue=f.getTime();
				f.add(Calendar.DAY_OF_YEAR, 7);
				java.util.Date due=f.getTime();
				String strIss=sdf.format(issue);
				String strDue=sdf.format(due);

				java.sql.Date siss=new Date(issue.getTime());
				java.sql.Date sdue=new Date(due.getTime());



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

				def result12=db.rows("SELECT full_path from document where id=1")
				String res12=result12['full_path']
				String res121=res12.substring(1,res12.length()-1)
				print res12
				//print res12
				db.execute("UPDATE patient set docid='$documentInstance.id',exp_Date='$sdue',summary='$sum' where id='$ppid'")

			}
			redirect (action:'list')
		}
		else{
			render(view:'notPaid')
		}
	}
	def moneyPay(){
		redirect(controller:'Patient',action:'moneyPay')
	}
	def download() {
		//print "hiii"+params.otp
		def db = new Sql(dataSource)

		//int ppid=Integer.parseInt(id);
		/*def result=db.rows("select file from patient_details where otp='$mid'")
		 String fl = result['file']
		 if(fl.equals("[]"))
		 render(view:'otperror')
		 else{
		 def filename=fl.substring(1, fl.length()-1)
		 print filename
		 */

		//	def result1=db.rows("select id from document where full_path='$filename'")
		//	String sid = result1['id']
		//	def ssid=sid.substring(1, sid.length()-1)
		//	int iid=Integer.parseInt(ssid)
		//def iid=1
		String str2=request.getParameter("radio2");
		String str3=request.getParameter("radio3");
		String str4=request.getParameter("radio4");
		String str1=request.getParameter("radio1");


		String comment=request.getParameter("ta")
		print "comment"+comment

		if(str2.equals(null)||str1.equals(null)||str3.equals(null)||str4.equals(null)){
			render "Please fill the  feedback form completely!!"
		}

		else{

			int ppid=Integer.parseInt(mid);

			def result11=db.rows("select id from patient_details WHERE otp='$ppid'")
			String fid = result11['id']
			print "fid"+fid

			def sfid=fid.substring(1, fid.length()-1)
			int fiid=Integer.parseInt(sfid)
			print "sfid"+sfid
			db.execute("INSERT into Feedback(pid,service,staff_Behaviour,technician_Proc,useful,comments,version) values('$fiid','$str2','$str3','$str4','$str1','$comment',0)")


			def result1=db.rows("select docid from patient_details where otp='$mid'")
			String sid = result1['docid']
			def ssid=sid.substring(1, sid.length()-1)
			int iid=Integer.parseInt(ssid)

			Document documentInstance = Document.get(iid)
			if ( documentInstance == null) {
				flash.message = "Document not found."
				redirect (action:'list')
			} else {
				response.setContentType("APPLICATION/OCTET-STREAM")
				response.setHeader("Content-Disposition", "Attachment;Filename=\"${documentInstance.filename}\"")
				def file = new File(documentInstance.full_Path)
				def fileInputStream = new FileInputStream(file)
				def outputStream = response.getOutputStream()


				byte[] buffer = new byte[4096];
				int len;
				while ((len = fileInputStream.read(buffer)) > 0) {
					outputStream.write(buffer, 0, len);
				}

				def result2=db.rows("select id from patient_details where otp='$ppid'")
				String siid = result2['id']
				def siiid=siid.substring(1, siid.length()-1)
				int cid=Integer.parseInt(siiid)
				db.execute("Update patient_details set otp='' where id='$cid'")

				outputStream.flush()
				outputStream.close()
				fileInputStream.close()

			}
		}
	}
	def feedback(){
		mid=request.getParameter('otp')

		render(view:'feedback')

	}
	def prefeedback() {
		
	}
}



