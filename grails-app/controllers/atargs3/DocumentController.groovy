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
	int sergood=0,serpoor=0,sersat=0;
	int stagood=0,stapoor=0,stasat=0;
	int techgood=0,techpoor=0,techsat=0;
	int usegood=0,usepoor=0,usesat=0;
	
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
	def feedback(){
		mid=request.getParameter('otp')
		print("dfss "+mid)
		
		def db = new Sql(dataSource)
		def resultid=db.rows("SELECT id from patient_details where otp='$mid'")
		if(resultid&&mid!="")
		{
			
		render(view:'feedback')
		}
		else
		{
		render(view:'getReport')
		flash.messageOTP="Check your OTP or else you have downloaded once"
		
		}
	}
	int ppid
	
	def savefeedback()
	{
		def db = new Sql(dataSource)
		
		        String str2=request.getParameter("radio2");
				String str3=request.getParameter("radio3");
				String str4=request.getParameter("radio4");
				String str1=request.getParameter("radio1");
		
				print("hiihello  "+str1+" "+str2+" "+str3+" "+str4)
				String comment=request.getParameter("ta")
				print "comment"+comment
		
				if(str2.equals(null)||str1.equals(null) ||str3.equals(null)||str4.equals(null)){
					
					flash.messageFB= "Please fill the feedback form completely"
					render(view:'feedback')
				
				}
		
				else{
					
					
					ppid=Integer.parseInt(mid);
					print"hereeeeeeeeeeeeeeeeeeeeeeee mid"+mid
		            def result11=db.rows("select id from patient_details WHERE otp='$ppid'")
					
					if(!result11)
					{
						
					   flash.messageDL="You have downloaded once"
						 render(view:'feedback')
			
						
					}
					else{
					String fid = result11['id']
					print "fid"+fid
		
					def sfid=fid.substring(1, fid.length()-1)
					int fiid=Integer.parseInt(sfid)
					print "sfid"+sfid
					db.execute("INSERT into Feedback(pid,service,staff_Behaviour,technician_Proc,useful,comments,version) values('$fiid','$str2','$str3','$str4','$str1','$comment',0)")
		
		
					//def url = createLink(controller="document",action:"download")
					//render(contentType: 'text/html', text:"<script> window.location.href='$url'</script>")
					
					redirect(action:'download')
					
					}
					
		
		
		
				
					
					
				}
				
		}

	def download() {
		
		def db = new Sql(dataSource)
		
		def result1=db.rows("select docid from patient_details where otp='$mid'")
		
		String sid = result1['docid']
		print "sid is:"+sid
		def ssid=sid.substring(1, sid.length()-1)
		int iid=Integer.parseInt(ssid)
		

		Document documentInstance = Document.get(iid)
		if ( documentInstance == null) {
			flash.message = "Document not found."
			redirect (action:'list')
			return
		} else {
		
			response.setContentType("APPLICATION/OCTET-STREAM")
			response.setHeader("Content-Disposition", "Attachment;Filename=\"${documentInstance.filename}\"")
			def file = new File(documentInstance.full_Path)
			def fileInputStream = new FileInputStream(file)
			def outputStream = response.getOutputStream()
							//response.end()
			

			byte[] buffer = new byte[4096];
			int len;
			while ((len = fileInputStream.read(buffer)) > 0) {
				outputStream.write(buffer, 0, len);
			}
			outputStream.close();
			def result2=db.rows("select id from patient_details where otp='$ppid'")
			String siid = result2['id']
			def siiid=siid.substring(1, siid.length()-1)
			int cid=Integer.parseInt(siiid)
			db.execute("Update patient_details set otp='' where id='$cid'")
			
			
			
			//response.reset();
			
			
			
			outputStream.flush()
			outputStream.close()
		//	response.outputStream.flush()
		//	response.outputStream.close()
			fileInputStream.close()
			
			

	}
		
		
	
}

}

