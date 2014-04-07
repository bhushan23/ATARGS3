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
<title>Dashboard</title>

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

<style>
#emptyldate {
	background-color: #F66666;
}

#calendar {
	width: 100%;
	height: 100%;
}

#datePassed {
	background-color: #666666;
	display: table-cell;
	vertical-align: middle;
}

#dateActive {
	background-color: #dddddd;
	text-align: center;
}

#dateActive:hover {
	background-color: #BBBBBB;
	border: 1px solid black;
}

#defaultlink {
	color: black;
}

#days {
	background-color: #aaaaaa;
}

a {
	text-decoration: none;
	color: #000000;
}
</style>
<script type="text/javascript">
	$(function() {
		$(".tooltipdate").tooltip({
			title : 'Suresh Put here some no. of  vacant slots'
		});
	});
</script>

</head>

<body>



	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 sidebar">
				<ul class="nav nav-sidebar">
					
					
					<li><g:remoteLink controller="Doctor" update="PatientTable"
							action="ReportButton" before="clearSearch()">Reports</g:remoteLink></li>
					<li><a href="#" id="search">Search</a></li>
					<%--<li><g:remoteLink controller="Doctor" update="PatientTable" action="Appointment">Get Appointment</g:remoteLink></li>
             --%>
					<li><a href="changePassword">Change Password</a></li>
					<li><g:remoteLink controller="Doctor" update="PatientTable"
							action="dashboard" before="clearSearch()">Bird's Eye View</g:remoteLink></li>
					<li>
						<div class="bis_calendar row">
							<table class="table">
								<tr class="monthAndYear">
									<td style="width: 50%">
										<div class="well well-lg">
											<table class="table" border="0">
												<tr>
													<td colspan="7" class="monthAndYear">
														<div class="visualyear" id="month">
															<h4>
																<script>
																	var month = [
																			"Jan",
																			"Feb",
																			"Mar",
																			"Apr",
																			"May",
																			"June",
																			"July",
																			"Aug",
																			"Sep",
																			"Oct",
																			"Nov",
																			"Dec" ];
																	var from = new Date();
																	var to = new Date();

																	document
																			.write(month[from
																					.getMonth()]);
																	to
																			.setDate(to
																					.getDate() + 21);
																	if (from
																			.getMonth() != to
																			.getMonth()) {
																		document
																				.write(" - "
																						+ month[to
																								.getMonth()]);
																	}
																</script>
															</h4>
														</div>
													</td>
												</tr>
												<!-- show DAYS OF WEEK HEADER -->
												<tr class="days-month">
													<td>S</td>
													<td>M</td>
													<td>T</td>
													<td>W</td>
													<td>T</td>
													<td>F</td>
													<td>S</td>
												</tr>
												<!-- previous days which are passed and cannot be selected. SHOW INACTIVE -->
												<g:each in="${limits[0]..<limits[1] }">
													<g:if
														test="${it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SUNDAY}">
														<tr>
													</g:if>
													<td id="datePassed">
														<div id="dateoncal">
															<p>
																${it.getAt([Calendar.DATE])}
															</p>
														</div>
													</td>
													<g:if
														test="${it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SATURDAY}">
														</tr>
													</g:if>
												</g:each>
												<!-- Days which are yet to come. SHOW ACTIVE -->
												<g:set var="i" value="${0}" />
												<g:each in="${limits[1]..<limits[2] }">
													<g:if
														test="${it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SUNDAY}">
														<tr>
													</g:if>
													<g:if test="${free[i] == 8}">
														<td style="background-color: #FF6666">

															<div class="tooltipdate" data-toggle="tooltip"
																title="No slots available">

																${it.getAt([Calendar.DATE])}
															</div>
													</g:if>
													<g:else>
														<td><g:remoteLink update="PatientTable" before="clearSearch()"
																action="GetDate" params="${[Year: it.getAt(Calendar.YEAR), Month: it.getAt(Calendar.MONTH), Day: it.getAt(Calendar.DAY_OF_MONTH)]}">

																<div class="tooltipdate" data-toggle="tooltip"
																	title="Slots Available: ${free[i] }">



																	${it.getAt([Calendar.DATE])}

																</div>

															</g:remoteLink>
															<div style="background-color: #F66666">
																<div
																	style="background-color:#0FF333 ; width:${free[i] /12 *100}%; height:8px;">
																</div>
															</div></td>
													</g:else>
													<g:if
														test="${it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SATURDAY}">
														</tr>
													</g:if>
													<g:set var="i" value="${i + 1}" />
												</g:each>

											</table>
										</div>
									</td>

								</tr>
							</table>

						</div>

					</li>
				</ul>

			</div>
			<div class="col-sm-9 col-sm-offset-3 main">
				<h1 class="page-header">Dashboard</h1>
				<h2 class="sub-header">Patients</h2>
				<div class="table-responsive">

					<table>
						<tr id="searchtext">
							<td><g:remoteField name="FN" action="FNfunc" id="fn"
									update="PatientTable" placeholder="first name" size="14" /> <g:remoteField
									name="LN" action="LNfunc" update="PatientTable" id="ln"
									placeholder="surname" size="13" /> <g:remoteField name="A" id="age"
									action="Afunc" update="PatientTable" placeholder="age" size="5" />
								<g:remoteField name="M" action="Mfunc" update="PatientTable" id="mac"
									placeholder="m/c" size="17	" /> <g:remoteField name="MOB" id="mob"
									action="MOBfunc" update="PatientTable" placeholder="mobile"
									size="15" /> <g:submitToRemote before="clearSearch()"
									class="btn-warning" update="PatientTable" value="Reset"
									action="resetSearch" /></td>
						</tr>
					</table>
					<div id="PatientTable">

						<table class="table table-striped">




							<thead>

								<tr>

									<th>First Name</th>
									<th>Last Name</th>
									<th>Age</th>
									<th>Scan Machine</th>
									<th>Mobile No</th>
									<th>Reports</th>

								</tr>
							</thead>
							<tbody>
								<g:each in="${patientList}">
									<tr>

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
										<g:if test="${it.file!=null}">
											<td><g:link style="color:blue" controller="Doctor"
													action="getReport" params="${[patientId:it.id]}">
										Download Report
										</g:link></td>
										</g:if>

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
