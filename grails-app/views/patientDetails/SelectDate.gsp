
<!DOCTYPE html>
<html>
<head>
<g:javascript library="jquery" />
<meta name="layout" content="main" />
<r:require modules="bootstrap" />
<r:layoutResources />
<meta name="layout" content="main" />
 

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

<body onload="showmonth('sdas');">
	
	<div class="container" >
<br>
<br>
<br>
		<div class="masthead">
			<h3 class="text-muted">Schedule an Appointment</h3>
			
		</div>
		

		<!-- Jumbotron -->
		<div class="jumbotron jumbo">
			<h1>Date and Time</h1>
			<h3>Select three priorities for your appointment</h3>
			<!--<g:link action="PersonalDetails" class="btn btn-info"> Next Step &raquo;</g:link></h1>-->
		</div>

		<!-- Example row of columns -->
		<div class="row" id="content">
			<div class="col-lg-12">
				
				
				<g:if test="${counter == 0}"> <h3 class="alert alert-success"> Please Select Your First Priority </h3></g:if>
				<g:elseif test="${counter == 1}"><h3 class="alert alert-success">First Priority Saved. Select Second Priority </h3></g:elseif>
				<g:elseif test="${counter == 2}"> <h3 class="alert alert-success"> Second Priority Saved. Select Third Priority </h3></g:elseif>
				<g:else> <h3 class="alert alert-danger">Please reset and start over again. There seems to be some problem </h3></g:else>
			

				<div class="bis_calendar row">
					<table class="table" border="0">
						<tr class="monthAndYear">
							<td style="width: 50%">
								<div class="well well-lg">
									<table class="table" border="0">
										<tr>
											<td colspan="7" class="monthAndYear">
												<div class="visualyear" id="month">
													<h4>${currentmonth } 
													<g:if test="${nxtmonth == 1}">
     													- ${nextmonth }
													</g:if></h4>
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
												<td><g:remoteLink controller="PatientDetails"
														action="SelectTime" update="SelectTimeSection"
														params="[Year: "${it.getAt(Calendar.YEAR)}", Month: "${it.getAt(Calendar.MONTH)}", Day: "${it.getAt(Calendar.DAY_OF_MONTH)}"]">

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
							<td><div id="SelectTimeSection"></div></td>
						</tr>
					</table>

				</div>



		<hr>



		</div>

		<footer>
			<p>&copy; Poona Diagnostic Services</p>
		</footer>

	</div>
	<!--/.container-->




	<script>
        function CannotSkip() {
            alert("Cannont Skip Steps. You will have to proceed serially.");
        }
    </script>

</body>
</html>
