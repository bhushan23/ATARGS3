

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
					<li  ><a href="changePassword">Change Password </a> </li>
					<li><a href="patientHistory">Patient History </a> </li>
				</ul>

			</div>

		<div class="col-sm-10 col-sm-offset-2 main">
			<h1 class="page-header">Patient History</h1>
			
				<div class="table-responsive">

					<table class="table table-striped">
            
           
         
           
              <thead>
                 
                <tr>
              
                  <th>First Name</th>
                  <th>Last Name</th>
                  <th>Appointment Time</th> 
                  <th>Scan Machine</th>
                  <th>Scan of</th>
                  <th>Mobile No</th>
                  <th>View Report</th>
                </tr>
              </thead>
              <tbody>
               <g:each in="${history}">
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
									
									<td>
										<g:form action="editApp" method="post" >
        								<div class="buttons">
 										<span class="button">
       									<g:link params="[p:"${it.id}"]" action="editApp">
       									View</g:link>
        								</span>
										</div>
										</g:form>
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

