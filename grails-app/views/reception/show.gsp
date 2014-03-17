
<%@ page import="atargs3.Reception" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<r:require modules="bootstrap" />
		<%--<g:set var="entityName" value="${message(code: 'reception.label', default: 'Reception')}" />
		--%><title><g:message code="SignUp Receiptionist" /></title>
		
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
	
		<div id="show-reception" class="content scaffold-show" role="main">
			<h1><g:message code="Verify details"  /></h1>
			<g:if test="${flash.message}">
			<%--<div class="message" role="status">${flash.message}</div>
			--%></g:if>
				<g:if test="${flash.message}">
					<div class="alert alert-success" role="status">
						Account Successfully created
					</div>
				</g:if>
				<table class="table table-striped">
				<tr>
				<g:if test="${receptionInstance?.firstname}">
				<td>
					<span id="firstname-label" class="property-label"><g:message code="reception.firstname.label" default="Firstname" /></span>
					</td><td>
						<span class="property-value" aria-labelledby="firstname-label"><g:fieldValue bean="${receptionInstance}" field="firstname"/></span>
					
				</td>
				</g:if>
			</tr>
			<tr>
				<g:if test="${receptionInstance?.lastname}">
				<td>
					<span id="lastname-label" class="property-label"><g:message code="reception.lastname.label" default="Lastname" /></span>
					</td><td>
						<span class="property-value" aria-labelledby="lastname-label"><g:fieldValue bean="${receptionInstance}" field="lastname"/></span>
					
				</td>
				</g:if>
			</tr>
			<tr>
				<g:if test="${receptionInstance?.username}">
				<td>
					<span id="username-label" class="property-label"><g:message code="reception.username.label" default="Username" /></span>
					</td><td>
						<span class="property-value" aria-labelledby="username-label"><g:fieldValue bean="${receptionInstance}" field="username"/></span>
					
				</td>
				</g:if>
			</tr><tr>
				<g:if test="${receptionInstance?.password}">
				<td>
					<span id="password-label" class="property-label"><g:message code="reception.password.label" default="Password" /></span>
					</td><td>
						<span class="property-value" aria-labelledby="password-label"><g:fieldValue bean="${receptionInstance}" field="password"/></span>
					
				</td>
				</g:if>
			</tr><tr>
				<g:if test="${receptionInstance?.address}">
				<td>
					<span id="address-label" class="property-label"><g:message code="reception.address.label" default="Address" /></span>
					</td><td>
						<span class="property-value" aria-labelledby="address-label"><g:fieldValue bean="${receptionInstance}" field="address"/></span>
					
				</td>
				</g:if>
			</tr>
			<tr>
				<g:if test="${receptionInstance?.mobile}">
				<td>
					<span id="mobile-label" class="property-label"><g:message code="reception.mobile.label" default="Mobile" /></span>
					</td><td>
						<span class="property-value" aria-labelledby="mobile-label"><g:fieldValue bean="${receptionInstance}" field="mobile"/></span>
					
				</td>
				</g:if>
			</tr>
			
			
			</table>
			<g:form url="[resource:receptionInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="btn btn-info" action="edit" resource="${receptionInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="btn btn-danger"  action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				<g:link  class="btn btn-primary" controller="login" action="completesignup" ><g:message code="complete sign up" /></g:link>
						</fieldset>
			</g:form>
		</div>
		</div>
		</div>
	</body>
</html>
