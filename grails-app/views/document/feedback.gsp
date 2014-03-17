<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title></title>
		</head>
		<body>
		<center><h1>FeedBack Form</h1></center><br><br>
		 <g:form controller="document"action="download">
		<div>
		 <label for='radio2'>How did you find the service at the front desk?</label>
		 </div>
		 <div>
		 <input type="radio" value="poor" name="radio2">poor</input>
                <input type="radio" value="satisfactory" name="radio2">satisfactory</input>
                <input type="radio" value="good" name="radio2">good</input>
         </div>
         <br>         
         <div>
		 <label for='radio3'>How was the staff behaviour?</label>
		 </div>
		 <div>
		 <input type="radio" value="poor" name="radio3">poor</input>
                <input type="radio" value="satisfactory" name="radio3">satisfactory</input>
                <input type="radio" value="good" name="radio3">good</input>
         </div>
         <br>  
         <div>
		 <label for='radio4'>Did the technician explain the procedure?</label>
		 </div>
		 <div>
		 <input type="radio" value="poor" name="radio4">poor</input>
                <input type="radio" value="satisfactory" name="radio4">satisfactory</input>
                <input type="radio" value="good" name="radio4">good</input>
         </div>
         <br>  
         <div>
		 <label for='radio1'>Was the online appointment scheduling and reporting useful?</label>
		 </div>
		 <div>
		 <input type="radio" value="poor" name="radio1">poor</input>
                <input type="radio" value="satisfactory" name="radio1">satisfactory</input>
                <input type="radio" value="good" name="radio1">good</input>
         </div>
         <br>  
          
		 <label for='ta'>Any Comments/Suggestions</label>
		 
		 <g:textArea id="ta" name="ta" width="200" height="300"></g:textArea>
 <div> 
   <g:submitButton name="submit" value="SUBMIT" action="download" /></div>  
</g:form>
		
		</body>
		</html>