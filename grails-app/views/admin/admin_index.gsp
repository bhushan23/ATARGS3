<%--
<%@ page import="atargs3.Admin"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'admin.label', default: 'Admin')}" />
<r:require modules="bootstrap" />
<title>Admin DashBoard</title>

</head>
<body>
	<div class="container">

		<br />
		<div class="hero-unit">
					<g:if test="${flash.message}">
					<div class="message" role="status">
						${flash.message}
					</div>
				</g:if>

				<div class="pagination">
					<g:paginate total="${adminInstanceCount ?: 0}" />
				</div>
			<g:link controller="Admin" action="getNewApp" class="btn  btn-info">View New Appointments </g:link>
			<g:link controller="Admin" action="manageApp" class="btn  btn-info">Manage Confirmed Appointments</g:link>
			<g:link controller="Admin" action="manageReceptionAccounts" class="btn  btn-info">Manage Reception Accounts</g:link>
			<g:link controller="Admin" action="manageDoctorAccounts" class="btn  btn-info">Manage Doctor Accounts</g:link>
			<g:link controller="Admin" action="uploadReport" class="btn  btn-info">Upload Reports</g:link>
			</div>
		
		</div>
		
<div align="left">	
		<g:link controller='Document'>Upload Report</g:link><br><br>
		</div>
		<div align="center">
		<g:form url="[controller:'Patient',action:'not']">
		<div >
 <span class="button"><g:actionSubmit  value="            Notify Patient            " action="noti" /> 
 </span>
 </div><br>
		</g:form>
				
		<g:form url="[controller:'Patient',action:'dispose']">
		<div >
 <span class="button"><g:actionSubmit  value="Dispose Expired Records" action="dispose" /> 
 </span>
 </div><br>
		</g:form>
		<g:form  url="[controller:'Document',action:'download']" >
		<td valign='top' style='text-align:left;' width='20%'>

 
 </td>
		</g:form>
		</div>

</body>
</html>
--%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon" href="../../docs-assets/ico/favicon.ico">
<meta name="layout" content="main">
<r:require modules="bootstrap" />
<r:layoutResources />
<title>Dashboard Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'dashboard.css')}" type="text/css">
<script src="${resource(dir: 'js', file: 'holder.js')}">
	
</script>

<!-- Custom styles for this template -->
<link href="dashboard.css" rel="stylesheet">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
	
</script>
<script>
	$(document).ready(function() {
		$("#searchtext").hide();
		$("#search").click(function() {
			$("#searchtext").toggle();
		});
	});
</script>

</head>

<body>



	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 sidebar">
				<ul class="nav nav-sidebar">
					<li class="active"><a href="#">Overview</a></li>
					<li><a href="getNewApp">New Appointments</a></li>
					
					<li><a href="manageReceptionAccounts">Manage Reception
							Accounts</a></li>
					<li><a href="manageDoctorAccounts">Manage Doctor Accounts</a></li>
					<li><a href="uploadReport">Upload Reports</a></li>
					<li id="search"><a href="#">Search</a></li>
				</ul>

			</div>
			<div class="col-sm-9 col-sm-offset-3 main">
				<h1 class="page-header">Dashboard</h1>
				<h2 class="sub-header">Today's Appointments</h2>
				<div class="table-responsive">

					<table class="table table-striped">
						<tr id="searchtext">

							<th><g:remoteField name="A" action="Afunc"
									update="PatientTable" /></th>
							<th><g:remoteField name="FN" action="FNfunc"
									update="PatientTable" /></th>
							<th><g:remoteField name="LN" action="LNfunc"
									update="PatientTable" /></th>
							<th><g:remoteField name="M" action="Mfunc"
									update="PatientTable" /></th>
							<th><g:remoteField name="MOB" action="MOBfunc"
									update="PatientTable" /></th>
						</tr>
						<thead>

							<tr>
								<th>ID</th>
								<th>First Name</th>
								<th>Last Name</th>
								<th>Age</th>
								<th>Machine</th>
								<th>Mobile No.</th>
							</tr>
						</thead>
						<tbody>
							<g:each in="${result}">
								<tr>
									<td>
										${it.id}
									</td>
									<td>
										${it.firstname}
									</td>
									<td>
										${it.lastname}
									</td>
									<td>
										${it.age}
									</td>
									<td>
										${it.machine}
									</td>
									<td>
										${it.mobile}
									</td>
								</tr>
							</g:each>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>

</body>
</html>
