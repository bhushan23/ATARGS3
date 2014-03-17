<html>
	<head>
		<meta name="layout" content="main">
		<title>Upload New Document</title>
		
		
	</head>
	<body>
		<div class="nav" role="navigation">
			<ul><li><g:link class="list" action="list">Document List</g:link></li></ul>
		</div>
		<div class="content scaffold" role="main">
			<h1>Upload New Document</h1>
			<g:if test="${flash.message}"><div class="message" role="status">${flash.message}</div></g:if>
			
			
			
			<g:uploadForm action="upload">
			
			<td valign='top' style='text-align:left;' width='20%'>
				<label for='pid'>pid:</label>
			</td>
			<input id="pid" type='text' name='pid' value='${patient?.pid}' />
			
				
				
				<td valign='top' style='text-align:left;' width='20%' height="50%">
				<label for='sum'>Enter Summary:</label>
			</td>
			<input id="sum" type='text' name='sum' value='${patient?.summary}' height="60%"/>
			<fieldset class="form">
                    <input type="file" name="file" accept="*.pdf"/>
					<g:submitButton name="upload" class="custombutton" value="Upload" />
				</fieldset>
			</g:uploadForm>
		</div>
	</body>
</html>
