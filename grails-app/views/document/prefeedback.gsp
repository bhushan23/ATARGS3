<html>
<body>
		<g:form   >
		<td valign='top' style='text-align:left;' width='20%'>
<label for='pid'>Enter your otp:</label>
<input id="otp" type='text' name='otp' value='${patient?.otp}' />
<g:actionSubmit value="download" action="feedback" /> 
</g:form>
</body>
</html>