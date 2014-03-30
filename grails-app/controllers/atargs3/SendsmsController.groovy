package atargs3

import java.io.*;
class SendsmsController {

	static def smslane_single_no(String msisdn,String msg)
	{
	
	if(AdminSettingsController.smsservice){
		print "sending to "+msisdn+" and msg is "+msg
		String user,password,sid,fl
	
		user=AdminSettingsController.smsuser
		password=AdminSettingsController.smspass
		if(user==null || password==null){
			//could not send message
			//redirect(controller:'Reception',action:'index')
		}else{
	//user="xyz123"
	//password="156470"
		print user+"   "+password
	
		sid="WebSMS"
		fl="0"
		String data = URLEncoder.encode("user", "UTF-8") + "=" + URLEncoder.encode(user, "UTF-8");
		data += "&" + URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode(password, "UTF-8");
		data += "&" + URLEncoder.encode("msisdn", "UTF-8") + "=" + URLEncoder.encode(msisdn, "UTF-8");
		data += "&" + URLEncoder.encode("msg", "UTF-8") + "=" + URLEncoder.encode(msg, "UTF-8");
		data += "&" + URLEncoder.encode("sid", "UTF-8") + "=" + URLEncoder.encode(sid, "UTF-8");
		data += "&" + URLEncoder.encode("fl", "UTF-8") + "=" + URLEncoder.encode(fl, "UTF-8");
		//Push the HTTP Request
		URL url = new URL("http://smslane.com/vendorsms/pushsms.aspx");
		URLConnection conn = url.openConnection();
	
		conn.setDoOutput(true);
		OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
		wr.write(data);
		wr.flush();
		
		//Read The Response
		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line;
		def retval
		while ((line = rd.readLine()) != null) {
		// Process line...
		retval += line;
		}
		wr.close();
		rd.close();
		System.out.println(retval);
		def rsp = retval;
		print rsp
	
		}
	}else{

	print "SMS service is not started"
	}
}
	
}
