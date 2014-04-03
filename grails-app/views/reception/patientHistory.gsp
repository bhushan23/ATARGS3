

<!DOCTYPE html>
<html lang="en">
<head>

<meta name="layout" content="main">
<r:require modules="bootstrap" />
<r:layoutResources />
<title>New Appointments</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'dashboard.css')}" type="text/css">
<script src="${resource(dir: 'js', file: 'holder.js')}">
	
</script>

<script type="text/javascript">
	function clearSearch() {
		document.getElementById("fn").value = "";
		document.getElementById("ln").value = "";
		document.getElementById("age").value = "";
		document.getElementById("mac").value = "";
		document.getElementById("mob").value = "";
	}
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
			<div class="col-sm-2 sidebar">
				<ul class="nav nav-sidebar">
					<li><a href="index">Dashboard</a></li>
					<li><a href="getNewApp">New Appointments</a></li>

					<li><a href="uploadReport">Upload Reports</a></li>
					<li><a href="viaSMS">Appointments taken via SMS</a></li>
					<li><a href="changePassword">Change Password </a></li>
					<li><a href="patientHistory">Patient History </a></li>
				</ul>

			</div>

			<div class="col-sm-10 col-sm-offset-2 main">
				<h1 class="page-header">Patient History</h1>

				<div class="table-responsive">

					<table>
						<%--						<tr id="searchtext">--%>
						<td><g:remoteField name="FN" action="FNfunc2" id="fn"
								update="PatientHistoryTable" placeholder="first name" size="11" />
							<g:remoteField name="LN" action="LNfunc2" id="ln"
								update="PatientHistoryTable" placeholder="surname" size="10" />
							<g:remoteField name="A" action="Afunc2" id="age"
								update="PatientHistoryTable" placeholder="age" size="21" /> <g:remoteField
								id="mac" name="M" action="Mfunc2" update="PatientHistoryTable"
								placeholder="m/c" size="24" /> <g:remoteField name="MOB" id="mob"
								action="MOBfunc2" update="PatientHistoryTable"
								placeholder="mobile" size="12" /> <g:submitToRemote
								before="clearSearch()" class="btn-warning"
								update="PatientHistoryTable" value="Reset"
								action="resetSearchPatHist" /></td>
						</tr>
					</table>

					<div id="PatientHistoryTable">
						<table class="table table-striped">




							<thead>

								<tr>

									<th>First Name</th>
									<th>Last Name</th>
									<th>Appointment Time</th>
									<th>Scan Machine</th>
									<th>Scan of</th>
									<th>Mobile No</th>
									<th>Report</th>
								</tr>
							</thead>
							<tbody>
								<g:each in="${result}">
									<tr>

										<td>
											${it.firstname}
										</td>
										<td>
											${it.lastname}
										</td>
										<td>
											${it.confirmed_date}
										</td>
										<td>
											${it.machine}
										</td>
										<td>
											${it.scanof}
										</td>
										<td>
											${it.mobile}
										</td>

										<td><g:form action="editApp" method="post">
												<div class="buttons">
													<span class="button"> <g:link params="${[p:it.id]}"
															action="editApp">
       									View</g:link>
													</span>
												</div>
											</g:form></td>
									</tr>
								</g:each>
							</tbody>
						</table>
					</div>
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

