
		
		
<!DOCTYPE html>
<html>
	<head>
    <meta name="layout" content="main">
<r:require modules="bootstrap" />
<r:layoutResources />
		<title>Feedback</title>
		<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'dashboard.css')}" type="text/css">
<script src="${resource(dir: 'js', file: 'holder.js')}">
	
</script>

<!-- Custom styles for this template -->
<link href="dashboard.css" rel="stylesheet">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
	
</script>
		</head>
		<body>
		<g:if test="${flash.messageFB}">
									<div class="alert alert-danger">
										${flash.messageFB}
									</div>
		</g:if>
		
		<g:if test="${flash.messageDL}">
									<div class="alert alert-danger">
										${flash.messageDL}
									</div>
		</g:if>
		
		<center><h1 class="text-muted">FeedBack Form</h1></center>
		 <g:form controller="document"action="savefeedback">
		 <div class="table-responsive">

					<table 	class="table table-striped">
					<thead>

							<tr>
								
								
								
							</tr>
						</thead>
		<tbody>
		<tr>
		 <td><label for='radio2'>How did you find the service at the front desk?</label></td>
		 
		
		 <td><input type="radio" value="Poor" name="radio2">&nbsp Poor
                <input type="radio" value="Satisfactory" name="radio2">&nbsp Satisfactory
                <input type="radio" value="Good" name="radio2">&nbsp Good</td>
         
         </tr>
         <tr>
         <td>
		 <label for='radio3'>How was the staff behaviour?</label>
		 </td>
		 
		 
		 <td><input type="radio" value="Poor" name="radio3">&nbsp Poor
                <input type="radio" value="Satisfactory" name="radio3">&nbsp Satisfactory
                <input type="radio" value="Good" name="radio3">&nbsp Good</td>
         </tr>
         
         <tr>
         <td>
		 <label for='radio4'>Did the technician explain the procedure?</label>
		 </td>
		 <td>
		 <input type="radio" value="Poor" name="radio4">&nbsp Poor
                <input type="radio" value="Satisfactory" name="radio4">&nbsp Satisfactory
                <input type="radio" value="Good" name="radio4">&nbsp Good</td>
         </tr>
       
         <tr>
         <td>
		 <label for='radio1'>Was the online appointment scheduling and reporting useful?</label>
		 </td>
		 <td>
		 <input type="radio" value="Poor" name="radio1">&nbsp Poor
                <input type="radio" value="Satisfactory" name="radio1">&nbsp Satisfactory
                <input type="radio" value="Good" name="radio1">&nbsp Good</td>
         </tr>
          
          <tr>
          <td>
		 <label for='ta'>Any Comments/Suggestions</label>
		 </td>
		 
		 <td>
		 <g:textArea id="ta" name="ta" width="200" height="300"></g:textArea>
		 </td>
		 </tr>
	
   
   </table> 
   </div>
   <g:submitButton name="submit" class="btn btn-success" value="SUBMIT" action="savefeedback" />
</g:form>
		<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
		</body>
		</html>