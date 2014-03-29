
<!DOCTYPE html>
<html lang="en">
<head>

<meta name="layout" content="main">
<r:require modules="bootstrap" />
<r:layoutResources />
<title>Feedback</title>

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
					
					<li><a href="manageReceptionAccounts">Manage Reception Accounts</a></li>
					<li><a href="manageDoctorAccounts">Manage Doctor Accounts</a></li>
					
					<li><a href="feedres">Feedback</a></li>
					<li><a href="ControlPanel">Settings</a></li>
				</ul>
			</div>

		<div class="col-sm-10 col-sm-offset-2 main">
			<h1 class="page-header">Feedback</h1>
			
				<div class="table-responsive">

					<table 	class="table table-striped">
						
						<thead>

							<tr>
								
								<th></th>
								<th>Good</th>
								<th>Satisfactory</th>
								<th>Poor</th>
							</tr>
							<tr>
							<td>Service</td>
							<td>${gfblist[0]}</td>
							<td>${gfblist[1]}</td>
							<td>${gfblist[2]}</td>
							</tr>
							<tr>
							<td>Staff Behavior</td>
							<td>  ${gfblist[3]}</td>
							<td>  ${gfblist[4]}</td>
							<td>  ${gfblist[5]}</td>
							</tr>
							<tr>
							<td>Technician</td>
							<td>  ${gfblist[6]}</td>
							<td>  ${gfblist[7]}</td>
							<td>  ${gfblist[8]}</td>
							</tr>
							<tr>
							<td>Usefulness</td>
							<td>  ${gfblist[9]}</td>
							<td>  ${gfblist[10]}</td>
							<td>  ${gfblist[11]}</td>
							</tr>
						</thead>
						<tbody>
							<g:each in="${patientList}">
								<tr>
									<td>
										${it.service}
									</td>
									<td>
										${it.staff_behaviour}
									</td>
									<td>
										${it.technician_proc}
									</td>
									<td>
										${it.useful}
									</td>
					
							</tr>
							${service}
							<tr>
							
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

