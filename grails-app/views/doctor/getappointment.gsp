
<%@ page import="atargs3.Doctor"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<r:require modules="bootstrap" />

<g:set var="entityName"
	value="${message(code: 'doctor.label', default: 'Doctor')}" />
<title><g:message code="default.list.label" args="[entityName]" /></title>

<g:javascript library="jquery" />


</head>

<body>
	<div class="container">
		<div class="hero-unit">


			<div class="row row-offcanvas row-offcanvas-right">

				<div class="col-xs-12 col-sm-9">

					<div class="row row-offcanvas row-offcanvas-right">

						<legend>
							<h1>Book an Appointment</h1>
						</legend>

						<br />
						<g:remoteField name="FN" action="FNfunc" update="PatientTable" />
						<g:remoteField name="LN" action="LNfunc" update="PatientTable" />
						<g:remoteField name="A" action="Afunc" update="PatientTable" />
						<g:remoteField name="M" action="Mfunc" update="PatientTable" />
						<g:remoteField name="MOB" action="MOBfunc" update="PatientTable" />
						<br>


						<div class="well">
							<g:form >
								<input type="date" id="suggestdate" name="suggestdate"></input>

								<g:actionSubmit  action="informptbysms" class="btn btn-warning" value="Suggest Appointment Via SMS"/> 
							</g:form>
							<g:link action="getaptnow" class="btn  btn-info">Get Appointment Now</g:link>

						</div>
						<div id="PatientTable"></div>
					</div>
				</div>
			</div>
		</div>

	</div>


</body>
</html>
