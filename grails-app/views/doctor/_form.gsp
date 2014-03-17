<%@ page import="atargs3.Doctor" %>


<table class="table table-striped">
<tr> 
<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'firstname', 'error')} required">
	<td style="width:200px"><label for="firstname">
		<g:message code="doctor.firstname.label" default="Firstname" />
		<span class="required-indicator">*</span>
	</label></td>
	<td><g:textField  class="input-small" name="firstname" required="" value="${doctorInstance?.firstname}"/>
	</td>
</div>
<tr>
<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'lastname', 'error')} required">
	<td><label for="lastname">
		<g:message code="doctor.lastname.label" default="Lastname" />
		<span class="required-indicator">*</span>
	</label></td><td>
	<input type="text" class="input-block-level" name="lastname" required="" style="width:60%" value="${doctorInstance?.lastname}"/></td>
</div>
</tr>
<tr>
<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'username', 'error')} required">
<td>	<label for="username">
		<g:message code="doctor.username.label" default="Username" />
		<span class="required-indicator">*</span>
	</label>
</td><td>	<g:textField name="username" required="" value="${doctorInstance?.username}" style="height:100%"/></td>
</div>

<tr>
<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'password', 'error')} required">
<td>	<label for="password">
		<g:message code="doctor.password.label" default="Password" />
		<span class="required-indicator">*</span>
	</label>
</td><td>

<g:passwordField name="password" required="" value="${doctorInstance?.password}" style="height:100%"/>
</td></div></tr>

<tr>
<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'address', 'error')} required">
<td>	<label for="address">
		<g:message code="doctor.address.label" default="Address" />
		<span class="required-indicator">*</span>
	</label>
</td><td>	<g:textField name="address" maxlength="250" required="" value="${doctorInstance?.address}" style="height:100%"/></td>
</div></tr>

<tr>
<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'mobile', 'error')} required">
<td>	<label for="mobile">
		<g:message code="doctor.mobile.label" default="Mobile" />
		<span class="required-indicator">*</span>
	</label>
</td><td>	<g:textField name="mobile" maxlength="10" required="" value="${doctorInstance?.mobile}" style="height:100%"/></td>
</div>
</tr>

<tr>
<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'email', 'error')} ">
<td>	<label for="email">
		<g:message code="doctor.email.label" default="Email" />
		
	</label>
</td><td>	<g:field type="email" name="email" value="${doctorInstance?.email}"  style="width:60%" class="input-block-level"/></td>
</div></tr>

<!-- 
<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'patients', 'error')} ">
	<label for="patients">
		<g:message code="doctor.patients.label" default="Patients" />
		
	</label>
	-->
	<tr><td></td><td>
<ul class="one-to-many">
<g:each in="${doctorInstance?.patients?}" var="p">
    <li><g:link controller="patientDetails" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></li>
</g:each>
<!-- 
<li class="add">
<g:link controller="patientDetails" action="create" params="['doctor.id': doctorInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'patientDetails.label', default: 'PatientDetails')])}</g:link>
</li>-->
</ul>
</td>
</tr>
<!-- </div> -->
</table>