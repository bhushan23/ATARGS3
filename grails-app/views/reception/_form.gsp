<%@ page import="atargs3.Reception" %>


<table class="table table-striped">
<tr>
<div class="fieldcontain ${hasErrors(bean: receptionInstance, field: 'firstname', 'error')} required">
	<td><label for="firstname">
		<g:message code="reception.firstname.label" default="Firstname" />
		<span class="required-indicator">*</span>
	</label></td>
	<td><g:textField name="firstname" required="" value="${receptionInstance?.firstname}"/></td>
</div>
</tr>

<tr><div class="fieldcontain ${hasErrors(bean: receptionInstance, field: 'lastname', 'error')} required">
	<td><label for="lastname">
		<g:message code="reception.lastname.label" default="Lastname" />
		<span class="required-indicator">*</span>
	</label></td>
	<td><g:textField name="lastname" required="" value="${receptionInstance?.lastname}"/></td>
</div></tr>

<tr><div class="fieldcontain ${hasErrors(bean: receptionInstance, field: 'username', 'error')} required">
	<td><label for="username">
		<g:message code="reception.username.label" default="Username" />
		<span class="required-indicator">*</span>
	</label></td>
	<td><g:textField name="username" required="" value="${receptionInstance?.username}"/></td>
</div></tr>

<tr><div class="fieldcontain ${hasErrors(bean: receptionInstance, field: 'password', 'error')} required">
	<td><label for="password">
		<g:message code="reception.password.label" default="Password" />
		<span class="required-indicator">*</span>
	</label></td>
	<td><g:passwordField name="password" required="" value="${receptionInstance?.password}"/></td>
</div></tr>

<tr><div class="fieldcontain ${hasErrors(bean: receptionInstance, field: 'address', 'error')} required">
	<td><label for="address">
		<g:message code="reception.address.label" default="Address" />
		<span class="required-indicator">*</span>
	</label></td>
	<td><g:textField name="address" maxlength="250" required="" value="${receptionInstance?.address}"/></td>
</div></tr>

<tr><div class="fieldcontain ${hasErrors(bean: receptionInstance, field: 'mobile', 'error')} required">
	<td><label for="mobile">
		<g:message code="reception.mobile.label" default="Mobile" />
		<span class="required-indicator">*</span>
	</label></td>
	<td><g:textField name="mobile" maxlength="10" required="" value="${receptionInstance?.mobile}"/></td>
</div></tr>
</table>




