<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main" />
<r:require modules="bootstrap" />
<meta name="layout" content="main" />
</head>
<body>

	<div class="container">
		<br> <br> <br>
		<div class="masthead">
			<h3 class="text-muted">Schedule an Appointment</h3>

		</div>

		<!-- Jumbotron -->
		<div class="jumbotron">
			<h1>Personal Details
		</div>
		<table>
			<tr>
				<td><g:if test="${flash.messageSal}">
						<div class="alert alert-danger">
							${flash.messageSal}
						</div>
					</g:if></td>
				<td><g:if test="${flash.messageFN}">
						<div class="alert alert-danger">
							${flash.messageFN}
						</div>
					</g:if></td>
				<td><g:if test="${flash.messageLN}">
						<div class="alert alert-danger">
							${flash.messageLN}
						</div>
					</g:if></td>
				<td><g:if test="${flash.messageAGE}">
						<div class="alert alert-danger">
							${flash.messageAGE}
						</div>
					</g:if></td>
				<td><g:if test="${flash.messageMOB}">
						<div class="alert alert-danger">
							${flash.messageMOB}
						</div>
					</g:if></td>
				<td><g:if test="${flash.messageEMAIL}">
						<div class="alert alert-danger">
							${flash.messageEMAIL}
						</div>
					</g:if></td>
			</tr>
		</table>
		<g:form action="savePersonalDetails">
			<div class="row">
				<div class="col-sm-4">

					<div class="panel panel-info">
						<div class="panel-heading">
							<h3 class="panel-title">Personal Details</h3>
						</div>
						<div class="panel-body">
							<table style="width: 100%">
								<tr>
									<td colspan="2"><input type="radio" name="salutation"
										value="Mr" />Mr. <input type="radio" name="salutation"
										value="Mrs" />Mrs. <input type="radio" name="salutation"
										value="Miss" />Miss.</td>
								</tr>
								<tr>
									<td>Firstname</td>
									<td><input type="text" name="firstname" value=${tempFN}></td>
								</tr>
								<tr>
									<td>Middlename</td>
									<td><input type="text" name="middlename"
										value=${historyMN}></td>
								</tr>
								<tr>
									<td>Lastname</td>
									<td><input type="text" name="lastname" value=${tempLN}></td>
								</tr>
								<tr>
									<td>Age</td>
									<td><input type="text" name="age" value=${tempAGE}></td>
								</tr>
							</table>
						</div>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="panel panel-primary">
						<div class="panel-heading">Contact Details</div>
						<div class="panel-body">
							<table>
								<tr>
									<td>Mobile No.</td>
									<td><input type="number" name="mobile" minlength="10"
										maxlength="10" value=${tempMOB}></td>
								</tr>
								<tr>
									<td>Email</td>
									<td><input type="email" name="email" maxlength="210"
										value=${email}></td>
								</tr>
								<tr>
									<td>Address</td>
									<td><input type="text" name="address" maxlength="210"
										value=${historyAddress}></td>
								</tr>
								<tr>
									<td>Pincode</td>
									<td><input type="text" name="pincode" maxlength="200"
										value=${historyPincode}></td>
								</tr>
								<tr>
									<td>City</td>
									<td><input type="text" name="city" maxlength="200"
										value=${historyCity}></td>
								</tr>
								<tr>
									<td>State</td>
									<td><select name="state">
											<option value="Maharashtra">Maharashtra</option>
											<option value="Andaman and Nicobar Islands">Andaman
												and Nicobar</option>
											<option value="Andhra Pradesh">Andhra Pradesh</option>
											<option value="Arunachal Pradesh">Arunachal Pradesh</option>
											<option value="Assam">Assam</option>
											<option value="Bihar">Bihar</option>
											<option value="Chandigarh">Chandigarh</option>
											<option value="Chhatisgarh">Chhattisgarh</option>
											<option value="Dadra and Nagar Haveli">Dadra and
												Nagar Haveli</option>
											<option value="Daman and Diu">Daman and Diu</option>
											<option value="Delhi">Delhi</option>
											<option value="Goa">Goa</option>
											<option value="Gujarat">Gujarat</option>
											<option value="Haryana">Haryana</option>
											<option value="Himachal Pradesh">Himachal Pradesh</option>
											<option value="Jammu and Kashmir">Jammu and Kashmir</option>
											<option value="Jharkhand">Jharkhand</option>
											<option value="Karnataka">Karnataka</option>
											<option value="Kerala">Kerala</option>
											<option value="Lakshadweep">Lakshadweep</option>
											<option value="Madhya Pradesh">Madhya Pradesh</option>
											<option value="Manipur">Manipur</option>
											<option value="Meghalaya">Meghalaya</option>
											<option value="Mizoram">Mizoram</option>
											<option value="Nagaland">Nagaland</option>
											<option value="Orissa">Orissa</option>
											<option value="Pondicherry">Pondicherry</option>
											<option value="Punjab">Punjab</option>
											<option value="Rajasthan">Rajasthan</option>
											<option value="Sikkim">Sikkim</option>
											<option value="Tamil Nadu">Tamil Nadu</option>
											<option value="Tripura">Tripura</option>
											<option value="Uttar Pradesh">Uttar Pradesh</option>
											<option value="Uttaranchal">Uttaranchal</option>
											<option value="West Bengal">West Bengal</option>
									</select>
								</tr>

							</table>
						</div>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="panel panel-success">
						<div class="panel-heading">
							<h3 class="panel-title">Clinical</h3>
						</div>
						<div class="panel-body">
							Referral Doctor <select name="referral">
								<g:each in="${doctors}">
									<option value="${it.id}">
										${it.firstname}
										${it.lastname }
									</option>

								</g:each>

								<option value="0">Doctor Not Listed</option>


							</select> <br /> Clinical History <br />
							<textarea name="history" rows="4" cols="40" style="width: 100%">${historyClinicalHistory}</textarea>
						</div>
					</div>

				</div>
				<div class="row">
					<br> <br>
				</div>
				<div class="row">
					<div class="col-sm-4">
						<div class="panel panel-primary">
							<div class="panel-heading">
								Select applicable
								${machine}
								Scan
							</div>
							<div class="panel-body">
								<table>
									<tr>
										<td><g:if test="${checkBoxInfo[0] == 1}">
												<input type="checkbox" name="scanpart" value="1" checked /> Abdomen/Pelvis <br />
											</g:if> <g:else>
												<input type="checkbox" name="scanpart" value="1" /> Abdomen/Pelvis <br />
											</g:else> <g:if test="${checkBoxInfo[1] == 1}">
												<input type="checkbox" name="scanpart" value="2" checked /> Angiogram <br />
											</g:if> <g:else>
												<input type="checkbox" name="scanpart" value="2" /> Angiogram <br />
											</g:else> <g:if test="${checkBoxInfo[2] == 1}">
												<input type="checkbox" name="scanpart" value="3" checked /> Brain <br />
											</g:if> <g:else>
												<input type="checkbox" name="scanpart" value="3" /> Brain <br />
											</g:else> <g:if test="${checkBoxInfo[3] == 1}">
												<input type="checkbox" name="scanpart" value="4" checked /> Chest <br />
											</g:if> <g:else>
												<input type="checkbox" name="scanpart" value="4" /> Chest <br />
											</g:else> <g:if test="${checkBoxInfo[4] == 1}">
												<input type="checkbox" name="scanpart" value="5" checked /> Joints <br />
											</g:if> <g:else>
												<input type="checkbox" name="scanpart" value="5" /> Joints <br />
											</g:else> <g:if test="${checkBoxInfo[5] == 1}">
												<input type="checkbox" name="scanpart" value="6" checked /> Neck <br />
											</g:if> <g:else>
												<input type="checkbox" name="scanpart" value="6" /> Neck <br />
											</g:else> <g:if test="${checkBoxInfo[6] == 1}">
												<input type="checkbox" name="scanpart" value="7" checked /> Orbits <br />
											</g:if> <g:else>
												<input type="checkbox" name="scanpart" value="7" /> Orbits <br />
											</g:else> <g:if test="${checkBoxInfo[7] == 1}">
												<input type="checkbox" name="scanpart" value="8" checked /> Spine <br />
											</g:if> <g:else>
												<input type="checkbox" name="scanpart" value="8" /> Spine <br />
											</g:else> <g:if test="${checkBoxInfo[8] == 1}">
												<input type="checkbox" name="scanpart" value="9" checked /> Others <br />
											</g:if> <g:else>
												<input type="checkbox" name="scanpart" value="9" /> Others <br />
											</g:else></td>
									</tr>
								</table>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="panel panel-primary">
							<div class="panel-heading">Tick the checkbox if you have
								history of the disease :</div>
							<div class="panel-body">
								<g:if test="${checkBoxInfo[9] == 1}">
									<input type="checkbox" name="diseasehistory" value="10" checked />&nbsp Allergic reaction to CT contrast (Gadolinium based)<br />
								</g:if>
								<g:else>
									<input type="checkbox" name="diseasehistory" value="10" />&nbsp Allergic reaction to CT contrast (Gadolinium based)<br />
								</g:else>
								<g:if test="${checkBoxInfo[10] == 1}">
									<input type="checkbox" name="diseasehistory" value="11" checked />&nbsp Claustrophobia<br />
								</g:if>
								<g:else>
									<input type="checkbox" name="diseasehistory" value="11" />&nbsp Claustrophobia<br />
								</g:else>
								<g:if test="${checkBoxInfo[11] == 1}">
									<input type="checkbox" name="diseasehistory" value="12" checked />&nbsp Diabetes<br />
								</g:if>
								<g:else>
									<input type="checkbox" name="diseasehistory" value="12" />&nbsp Diabetes<br />
								</g:else>
								<g:if test="${checkBoxInfo[12] == 1}">
									<input type="checkbox" name="diseasehistory" value="13" checked />&nbsp Drug Allergy<br />
								</g:if>
								<g:else>
									<input type="checkbox" name="diseasehistory" value="13" />&nbsp Drug Allergy<br />
								</g:else>
								<g:if test="${checkBoxInfo[13] == 1}">
									<input type="checkbox" name="diseasehistory" value="14" checked />&nbsp Kidney Disease<br />
								</g:if>
								<g:else>
									<input type="checkbox" name="diseasehistory" value="14" />&nbsp Kidney Disease<br />
								</g:else>
								<g:if test="${checkBoxInfo[14] == 1}">
									<input type="checkbox" name="diseasehistory" value="15" checked />&nbsp Liver Disease<br />
								</g:if>
								<g:else>
									<input type="checkbox" name="diseasehistory" value="15" />&nbsp Liver Disease<br />
								</g:else>
								<g:if test="${checkBoxInfo[15] == 1}">
									<input type="checkbox" name="diseasehistory" value="16" checked />&nbsp Latex Allergy<br />
								</g:if>
								<g:else>
									<input type="checkbox" name="diseasehistory" value="16" />&nbsp Latex Allergy<br />
								</g:else>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-lg-8">
						<p>The following items may be harmful to you during the scan
							or may interfere with the examination. Please tick if any of the
							following is applicable.</p>
						<g:if test="${checkBoxInfo[16] == 1}">
							<input type="checkbox" name="harmful" value="17" checked />&nbsp Cardiac pacemaker or implanted cardioverter defibrillator/ICD<br />
						</g:if>
						<g:else>
							<input type="checkbox" name="harmful" value="17" />&nbsp Cardiac pacemaker or implanted cardioverter defibrillator/ICD<br />
						</g:else>
						<g:if test="${checkBoxInfo[17] == 1}">
							<input type="checkbox" name="harmful" value="18" checked />&nbsp Implanted drug pump (for chemotherapy medicine, pain medicine)<br />
						</g:if>
						<g:else>
							<input type="checkbox" name="harmful" value="18" />&nbsp Implanted drug pump (for chemotherapy medicine, pain medicine)<br />
						</g:else>
						<g:if test="${checkBoxInfo[18] == 1}">
							<input type="checkbox" name="harmful" value="19" checked />&nbsp External drug pump (for Insulin or other medicine)<br />
						</g:if>
						<g:else>
							<input type="checkbox" name="harmful" value="19" />&nbsp External drug pump (for Insulin or other medicine)<br />
						</g:else>
						<g:if test="${checkBoxInfo[19] == 1}">
							<input type="checkbox" name="harmful" value="20" checked />&nbsp Artificial joint and /or limb<br />
						</g:if>
						<g:else>
							<input type="checkbox" name="harmful" value="20" />&nbsp Artificial joint and /or limb<br />
						</g:else>
						<g:if test="${checkBoxInfo[20] == 1}">
							<input type="checkbox" name="harmful" value="21" checked />&nbsp Artificial eye and/or eyelid spring<br />
						</g:if>
						<g:else>
							<input type="checkbox" name="harmful" value="21" />&nbsp Artificial eye and/or eyelid spring<br />
						</g:else>
						<g:if test="${checkBoxInfo[21] == 1}">
							<input type="checkbox" name="harmful" value="22" checked />&nbsp Eye injury from a metal object (metal shavings, metal slivers)<br />
						</g:if>
						<g:else>
							<input type="checkbox" name="harmful" value="22" />&nbsp Eye injury from a metal object (metal shavings, metal slivers)<br />
						</g:else>
						<g:if test="${checkBoxInfo[22] == 1}">
							<input type="checkbox" name="harmful" value="23" checked />&nbsp Ear (Cochlear) implant, middle ear implant<br />
						</g:if>
						<g:else>
							<input type="checkbox" name="harmful" value="23" />&nbsp Ear (Cochlear) implant, middle ear implant<br />
						</g:else>
						<g:if test="${checkBoxInfo[23] == 1}">
							<input type="checkbox" name="harmful" value="24" checked />&nbsp Hearing aid(s)<br />
						</g:if>
						<g:else>
							<input type="checkbox" name="harmful" value="24" />&nbsp Hearing aid(s)<br />
						</g:else>
						<g:if test="${checkBoxInfo[24] == 1}">
							<input type="checkbox" name="harmful" value="25" checked />&nbsp False teeth/dentures, metallic removable dental work, braces, retainers<br />
						</g:if>
						<g:else>
							<input type="checkbox" name="harmful" value="25" />&nbsp False teeth/dentures, metallic removable dental work, braces, retainers<br />
						</g:else>
						<g:if test="${checkBoxInfo[25] == 1}">
							<input type="checkbox" name="harmful" value="26" checked />&nbsp Injured by a metal object (shrapnel, bullet, BB) and required medical attention<br />
						</g:if>
						<g:else>
							<input type="checkbox" name="harmful" value="26" />&nbsp Injured by a metal object (shrapnel, bullet, BB) and required medical attention<br />
						</g:else>
						<g:if test="${checkBoxInfo[26] == 1}">
							<input type="checkbox" name="harmful" value="27" checked />&nbsp Body piercing, tattoo or permanent makeup<br />
						</g:if>
						<g:else>
							<input type="checkbox" name="harmful" value="27" />&nbsp Body piercing, tattoo or permanent makeup<br />
						</g:else>
						<g:if test="${checkBoxInfo[27] == 1}">
							<input type="checkbox" name="harmful" value="28" checked />&nbsp Wig, hair implants<br />
						</g:if>
						<g:else>
							<input type="checkbox" name="harmful" value="28" />&nbsp Wig, hair implants<br />
						</g:else>
						<br>
						<br>
						<p>
							<g:if test="${historyPregnant=='Yes' }">
								<input type="checkbox" name="pregnant" value="Yes" checked />&nbsp
											(If female) Are you pregnant?
											</g:if>
							<g:else>
								<input type="checkbox" name="pregnant" value="Yes" />&nbsp
											(If female) Are you pregnant?
											</g:else>
						</p>
					</div>
				</div>
				<div class="row">
					<div class="col-lg-4">
						<h3>Your Consent...</h3>
						<p>&nbsp I agree with all the terms and conditions. I agree
							that I have been informed about all the risks involved in
							performing MRI/CT Scan. I agree with anaesthesia/sedation as may
							be necessary.</p>
						<p>Note : This is just a request to perform the scan/imaging.
							The date and time given to you for appointment may change and
							administrator can change/reject the appointment without further
							notice.</p>
						<p>All rights reserved. Dispute under Pune Jurisdiction.</p>
						<input type="submit" value="I, Agree" class="btn btn-info" />
						</h1>
					</div>
				</div>
		</g:form>
	</div>

	<hr>

	<footer>
		<p>&copy; Poona Diagnostic Services</p>
	</footer>

	</div>
	<!--/.container-->


</body>

</html>