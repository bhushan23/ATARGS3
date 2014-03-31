<html>
<head>
<title>Scan My Appointments</title>
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
</body>
</html>