<html>
	<head>
		<title>
			Scan My Patient
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
								<th>Mobile</th>
							</tr>
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
						</table>
	</body>
</html>