
<%@ page import="atargs3.Doctor"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'doctor.label', default: 'Doctor')}" />
<title>Confirm Account Details</title>
<r:require modules="bootstrap" />
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


		<div class="form-signin">


			<div id="show-doctor" class="content scaffold-show" role="main">
				<h1>
					<g:message code="Confirm Details" args="[entityName]" />
				</h1>
				<hr />
				<g:if test="${flash.message}">
					<div class="alert alert-success" role="status">
						Account Successfully created
					</div>
				</g:if>

				<table class="table table-striped">
					<g:if test="${doctorInstance?.firstname}">
						<tr>
							<td style="width: 50%"><span id="firstname-label"
								class="property-label"> <g:message
										code="doctor.firstname.label" default="Firstname" /></span></td>
							<td><span class="property-value"
								aria-labelledby="firstname-label"> <g:fieldValue
										bean="${doctorInstance}" field="firstname" /></span></td>
						</tr>
					</g:if>


					<g:if test="${doctorInstance?.lastname}">
						<tr>
							<td><span id="lastname-label" class="property-label"><g:message
										code="doctor.lastname.label" default="Lastname" /></span></td>
							<td><span class="property-value"
								aria-labelledby="lastname-label"><g:fieldValue
										bean="${doctorInstance}" field="lastname" /></span></td>
						</tr>
					</g:if>

					<g:if test="${doctorInstance?.username}">
						<tr>
							<td><span id="username-label" class="property-label"><g:message
										code="doctor.username.label" default="Username" /></span></td>
							<td><span class="property-value"
								aria-labelledby="username-label"><g:fieldValue
										bean="${doctorInstance}" field="username" /></span></td>
						</tr>

					</g:if>

					<g:if test="${doctorInstance?.password}">

						<tr>
							<td><span id="password-label" class="property-label"><g:message
										code="doctor.password.label" default="Password" /></span></td>
							<td><span class="property-value"
								aria-labelledby="password-label"><g:fieldValue
										bean="${doctorInstance}" field="password" /></span></td>
						</tr>

					</g:if>

					<g:if test="${doctorInstance?.address}">
					<tr>
						<td><span id="address-label"
							class="property-label"><g:message
									code="Address" /></span> </td>
									<td><span
							class="property-value" aria-labelledby="address-label"><g:fieldValue
									bean="${doctorInstance}" field="address" /></span></td>
									</tr>
					</g:if>

					<g:if test="${doctorInstance?.mobile}">
						<tr><td> <span id="mobile-label"
							class="property-label"><g:message
									code="doctor.mobile.label" default="Mobile" /></span> </td><td><span
							class="property-value" aria-labelledby="mobile-label"><g:fieldValue
									bean="${doctorInstance}" field="mobile" /></span></td>
							</tr>
					</g:if>

					<g:if test="${doctorInstance?.email}">
					<tr>
						<td><span id="email-label"
							class="property-label"><g:message
									code="doctor.email.label" default="Email" /></span></td><td> <span
							class="property-value" aria-labelledby="email-label"><g:fieldValue
									bean="${doctorInstance}" field="email" /></span></td>
									</tr>
					</g:if>

					<g:if test="${doctorInstance?.patients}">
					<tr>
						<li class="fieldcontain"><span id="patients-label"
							class="property-label"><g:message
									code="doctor.patients.label" default="Patients" /></span> <g:each
								in="${doctorInstance.patients}" var="p">
								<span class="property-value" aria-labelledby="patients-label"><g:link
										controller="patientDetails" action="show" id="${p.id}">
										${p?.encodeAsHTML()}
									</g:link></span>
							</g:each></li>
							</tr>
					</g:if>

					
					
						</table>
						<g:form url="[resource:doctorInstance, action:'delete']"
						method="DELETE">
						<fieldset class="buttons">
							<g:link class="btn btn-info" action="edit" resource="${doctorInstance}">
								<g:message code="default.button.edit.label" default="Edit" />
							</g:link>
							<g:actionSubmit class="btn btn-danger" action="delete"
								value="${message(code: 'default.button.delete.label', default: 'Delete')}"
								onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
							<g:link class="btn btn-primary" controller="login" action="completesignup">
								<g:message code="complete sign up" />
							</g:link>
						</fieldset>
	
					</g:form>
					</div>
					</div>
					</div>
</body>
</html>
