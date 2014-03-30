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
	href="${resource(dir: 'css', file: 'dashboard.css')}"
	type="text/css">
<script src="${resource(dir: 'js', file: 'holder.js')}">
	
</script>

    <!-- Custom styles for this template -->
    <link href="dashboard.css" rel="stylesheet">
      <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
</script>
<script>
    $(document).ready(function () {
$("#searchtext").hide();
        $("#search").click(function () {
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
	document.getElementById("month").innerHTML= itoa(date.getMonth()) + "Hello
	document.getElementById("month").innerHTML= "Hello"
}
String function itoa(int month) {
	switch(month) {
	case 0:
		return "January";
	case 1:
		return "February";
	case 2:
		return "March;
	case 3:
		return "April;
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

   

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 sidebar">
          <ul class="nav nav-sidebar">
            <li ><a href="index">Dashboard</a></li>
            <li><g:remoteLink controller="Doctor" update="PatientTable" action="ReportButton">Reports</g:remoteLink></li>
            <%--<li><g:remoteLink controller="Doctor" update="PatientTable" action="Appointment">Get Appointment</g:remoteLink></li>
             --%>
			<li><a href="changePassword">Change Password</a></li>
          <li >
					<div class="bis_calendar row">
					<table class="table">
						<tr class="monthAndYear">
							<td style="width: 50%">
								<div class="well well-lg">
									<table class="table" border="0">
										<tr>
											<td colspan="7" class="monthAndYear">
												<div class="visualyear" id="month">
													<h4>January</h4>
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
												<td><g:remoteLink update="PatientTable"	action="GetDate" params="[Year: "${it.getAt(Calendar.YEAR)}", Month: "${it.getAt(Calendar.MONTH)}", Day: "${it.getAt(Calendar.DAY_OF_MONTH)}"]">

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
         
         <table class="table table-striped">
                  <tr id="searchtext">
                  <th><g:remoteField name="FN" action="FNfunc" update="PatientTable"/></th>
                  <th><g:remoteField name="LN" action="LNfunc" update="PatientTable"/></th>
                   <th><g:remoteField name="A" action="Afunc" update="PatientTable" /></th>
                  <th>	<g:remoteField name="M" action="Mfunc" update="PatientTable"/></th>
                  <th>	<g:remoteField name="MOB" action="MOBfunc" update="PatientTable"/></th>
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
									<td>
										<g:link style="color:blue" controller="Doctor" action="getReport" params="${[patientId:it.id]}">
										Download Report
										</g:link>
									</td>
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
