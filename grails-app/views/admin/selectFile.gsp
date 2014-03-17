<html>
	<head>
		<meta name="layout" content="main">
		<title>Upload Report</title>
		<r:require modules="bootstrap" />
		<script type="text/javascript">
        function Checkfiles()
        {
        var fup = document.getElementById('myfile');
        var fileName = fup.value;
        var ext = fileName.substring(fileName.lastIndexOf('.') + 1);
        if(ext == "pdf" )
        {
        return true;
        } 
        else
        {
        alert("Upload pdf files only");
        fup.focus();
        return false;
        }
        }
    </script>
	</head>
	<body>
			
			<div class="container">

		<br />
		<div class="hero-unit">
		
			<h2>Enter the file to be uploaded : </h2>
			<%--<g:if test="${flash.message}"><div class="message" role="status">${flash.message}</div></g:if>
			
			--%>
			
			<g:uploadForm action="upload">
			<fieldset class="form">
                    <input type="file" name="file" id="myfile"/>
                    <br/>
					<g:submitButton name="upload" class="custombutton" value="Upload" class="btn btn-large btn-info" onclick="return Checkfiles(this);"/>
				</fieldset>
			</g:uploadForm>
		</div>
		</div>
	</body>
</html>
