<html>
	<head>
		<title>
			Scan My Appointments
		</title>
		<g:javascript library="jquery" />
		<r:layoutResources />
	</head>
	<body>
		<table class="table table-striped" >
							<tr>
								<th>First Name</th>
								<th>Last Name</th>
								<th>Age</th>
								<th>Machine</th>
								<th>Appointment Timing</th>
								<th>Mobile</th>
								<th>View/Edit Appointment</th>
							</tr>
							<g:each in="${result}">
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
										${it.confirmed_date}
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
						</table>
						 Make CT appointments unavailable  &nbsp: &nbsp<g:link  action="cancelCTApp" class="btn btn-danger">OK</g:link>
						<br>
						<br>
						Make MRI appointments unavailable : &nbsp<g:link  action="cancelMRIApp" class="btn btn-danger">OK</g:link> 
	</body>
</html>