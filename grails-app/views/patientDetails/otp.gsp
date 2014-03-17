<html>
<head>
</head>
<body>
<g:form url="[controller:'Patient',action:'func']">
		<td valign='top' style='text-align:left;' width='20%'>
<label for='pid'>pid:</label>
</td>
<input id="pid" type='text' name='pid' value='${patient?.pid}' />

		
		<div class="buttons">
 <span class="button"><g:actionSubmit value="generate" action="func" /> 
 </span>
 </div>
		</g:form>
		
</body>
</html>