<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		
	<style type="text/css">
body {
	padding-top: 40px;
	padding-bottom: 40px;
	background-color: #f5f5f5;
}

.form-signin {
	max-width: 600px;
	padding: 19px 29px 29px;
	margin: 0 auto 20px;
	background-color: #fff;
	border: 1px solid #e5e5e5;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	border-radius: 5px;
	-webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	-moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
}

.form-signin .form-signin-heading,.form-signin .checkbox {
	margin-bottom: 10px;
}

.form-signin input[type="text"],.form-signin input[type="password"] {
	font-size: 16px;
	height: auto;
	margin-bottom: 15px;
	padding: 7px 9px;
}
</style>
	</head>
	<body>
	<div class="container">
<br>
<br>
	<div class="form-signin">
					<div class="input">
						
						<g:if test="${flash.message}">
								<div class="alert alert-danger">
									${flash.message}
								</div>
							
						</g:if>
		<legend><h2>Create New Refferal Doctor Account</h2></legend>
		<div id="create-doctor" class="content scaffold-create" role="main">
			
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${doctorInstance}">
			<ul class="alert alert-danger" role="alert">
				<g:eachError bean="${doctorInstance}" var="error">
				<li   <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>> <g:message error="Invalid ${error.field} "/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:form url="[resource:doctorInstance, action:'save']" >
				<fieldset class="form">
					<g:render template="form"/>
				</fieldset>
				<fieldset class="buttons">
				
					<g:submitButton	 style="width:150px" name="create" class="save btn btn-large btn-info" value="Create" />
				</fieldset>
			</g:form>
		</div>
		</div>
	
		
		</div>
		</div>
	</body>
</html>
