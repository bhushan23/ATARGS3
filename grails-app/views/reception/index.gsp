

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
<title>Reception Dashboard</title>



<!-- Bootstrap core CSS -->

<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'dashboard.css')}" type="text/css">
<script src="${resource(dir: 'js', file: 'holder.js')}">
	
</script>

<!-- Custom styles for this template -->

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

<script type="text/javascript">
function showmonth() {
	alert("I am called");
	var date = new Date()
	var datestr = date.toLocaleDateString();
	var month1 = itoa(date.getMonth());
	alert(month1)
	document.getElementById("month").innerHTML= itoa(date.getMonth()) + "Hello"
	document.getElementById("month").innerHTML= "Hello"
}
String function itoa(int month) {
	switch(month) {
	case 0:
		return "January";
	case 1:
		return "February";
	case 2:
		return "March";
	case 3:
		return "April";
	case 4:
		return "May";
	case 5:
		return "June";
	case 6:
		return "July";
	case 7:
		return "August";
	case 8:
		return "September"
	case 9:
		return "October";
	case 10:
		return "November";
	case 11:
		return "December";
	}
}
window.onload =showmonth;
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
$(function () {
    $(".tooltipdate").tooltip({
        title : 'Suresh Put here some no. of  vacant slots'
    });
});
</script>
</head>

<body>
	<g:set var="months"
		value="${new java.text.DateFormatSymbols().months} " />
	<g:set var="today" value="${new Date()}" />


	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 sidebar">
				<ul class="nav nav-sidebar">
					<li><a href="index">Dashboard</a></li>

					<li><a href="getNewApp">New Appointments</a></li>


					<li><a href="uploadReport">Upload Reports</a></li>
					<li><a href="viaSMS">Appointments taken via SMS </a></li>
					<li ><a href="changePassword">Change Password </a> </li>
					<li><a href="patientHistory">Patient History </a> </li>

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
																${currentmonth }
																<g:if test="${nxtmonth == 1}">
     													- ${nextmonth }
																</g:if>
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
													<g:if test="${free[i] == 0}">
														<td style="background-color: #FF6666">

															<div class="tooltipdate" data-toggle="tooltip"
																title="No slots available">

																${it.getAt([Calendar.DATE])}
															</div>
													</g:if>
													<g:else>
														<td><g:remoteLink update="AppointmentTable"
																action="ShowApp" params="[Year: "${it.getAt(Calendar.YEAR)}", Month: "${it.getAt(Calendar.MONTH)}", Day: "${it.getAt(Calendar.DAY_OF_MONTH)}"]">

																<div class="tooltipdate" data-toggle="tooltip"
																	title="Slots Available: ${free[i] }">



																	${it.getAt([Calendar.DATE])}

																</div>

															</g:remoteLink>
															<div style="background-color: #F66666">
																<div
																	style="background-color:#0FF333 ; width:${free[i] /totalNoOfIntervals *100}%; height:8px;">
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
				<%--
                <h2 class="sub-header">Today's Appointments</h2>
          --%>
				<div class="table-responsive">

					<table class="table table-striped">
						<tr id="searchtext">
							<th><g:remoteField name="FN" action="FNfunc"
									update="AppointmentTable" /></th>
							<th><g:remoteField name="LN" action="LNfunc"
									update="AppointmentTable" /></th>
							<th><g:remoteField name="A" action="Afunc"
									update="AppointmentTable" /></th>
							<th><g:remoteField name="M" action="Mfunc"
									update="AppointmentTable" /></th>
							<th><g:remoteField name="MOB" action="MOBfunc"
									update="AppointmentTable" /></th>
						</tr>
					</table>
					<div id="AppointmentTable">

						<table class="table table-striped">




							<thead>

								<tr>

									<th>First Name</th>
									<th>Last Name</th>
									<th>Appointment Time</th>
									<th>Scan Machine</th>
									<th>Scan of</th>
									<th>Mobile No</th>
									<th>View/Edit Appointment</th>
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
													<span class="button"> <g:link params="${[p:it.id]}" action="editApp">
       									View/Edit</g:link>
													</span>
												</div>
											</g:form></td>
									</tr>
								</g:each>
							</tbody>
						</table>
						To take backup of tomorrow's appointments &nbsp: &nbsp
						<g:link controller="Login" action="takeBackup"
							class="btn btn-info">Click here</g:link>
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
