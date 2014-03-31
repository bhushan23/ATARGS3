<html>
	<head>
		<title>
			Scan My Appointments
		</title>
		<g:javascript library="jquery" />
		<r:layoutResources />
	</head>
	<body>
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
							class="btn btn-info">Click here</g:link><br><br>
						 Make CT appointments unavailable  &nbsp: &nbsp<g:link  action="cancelCTApp" class="btn btn-danger">OK</g:link>
						<br>
						<br>
						Make MRI appointments unavailable : &nbsp<g:link  action="cancelMRIApp" class="btn btn-danger">OK</g:link> 
	</body>
</html>