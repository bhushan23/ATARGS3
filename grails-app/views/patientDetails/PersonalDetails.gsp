<!DOCTYPE html>
<html>	
<head>
<meta name="layout" content="main" />
<r:require modules="bootstrap" />
<meta name="layout" content="main" />
</head>
<body>

    <div class="container">
<br>
<br>
<br>
        <div class="masthead">
            <h3 class="text-muted">Schedule an Appointment</h3>
            
        </div>
		
        <!-- Jumbotron -->
        <div class="jumbotron">
            <h1>Personal Details
        </div>
		<table>
		<tr>
		<td>
		<g:if test="${flash.messageSal}">
									<div class="alert alert-danger">
										${flash.messageSal}
									</div>
		</g:if>
		</td>
		<td>
		<g:if test="${flash.messageFN}">
									<div class="alert alert-danger">
										${flash.messageFN}
									</div>
		</g:if>
		</td>
		<td>
		<g:if test="${flash.messageLN}">
									<div class="alert alert-danger">
										${flash.messageLN}
									</div>
		</g:if>
		</td>
		<td>
		<g:if test="${flash.messageAGE}">
									<div class="alert alert-danger">
										${flash.messageAGE}
									</div>
		</g:if>
		</td>
		<td>
		<g:if test="${flash.messageMOB}">
									<div class="alert alert-danger">
										${flash.messageMOB}
									</div>
		</g:if>
		</td>
		<td>
		<g:if test="${flash.messageEMAIL}">
									<div class="alert alert-danger">
										${flash.messageEMAIL}
									</div>
		</g:if>
		</td>
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
                                <td colspan="2">
                                    <input type="radio" name="salutation" value="Mr" />Mr.
                                    <input type="radio" name="salutation" value="Mrs" />Mrs.
                                    <input type="radio" name="salutation" value="Miss" />Miss.
                                </td>
                            </tr>
                            <tr>
                                <td>Firstname</td>
                                <td>
                                    <input type="text" name="firstname" value=${tempFN}></td>
                            </tr>
                            <tr>
                                <td>Middlename</td>
                                <td>
                                    <input type="text" name="middlename" value=${historyMN}></td>
                            </tr>
                            <tr>
                                <td>Lastname</td>
                                <td>
                                    <input type="text" name="lastname" value=${tempLN}></td>
                            </tr>
                            <tr>
                                <td>Age</td>
                                <td>
                                    <input type="text" name="age" value=${tempAGE}></td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        Contact Details
                    </div>
                    <div class="panel-body">
                        <table>
                            <tr>
                                <td>Mobile No.</td>
                                <td>
                                    <input type="text" name="mobile" value=${tempMOB}></td>
                            </tr>
                            <tr>
                                <td>Email</td>
                                <td>
                                    <input type="email" name="email" value=${email}></td>
                            </tr>
                            <tr>
                                <td>Address</td>
                                <td>
                                    <input type="text" name="address" value=${historyAddress}></td>
                            </tr>
                            <tr>
                                <td>Pincode</td>
                                <td>
                                    <input type="text" name="pincode" value=${historyPincode}></td>
                            </tr>
                            <tr>
                                <td>City</td>
                                <td>
                                    <input type="text" name="city" value=${historyCity}></td>
                            </tr>
                            <tr>
                                <td>State</td>
                                <td>
                                    <input type="text" name="state" value=${historyState}></td>
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
                            Referral Doctor 
                            <select name="referral" >
                         <g:each in="${doctors}">
									<option value="${it.id}">
										${it.firstname} ${it.lastname }
									</option>
				
								</g:each>
						
									<option value="0">
										Doctor Not Listed
									</option>
						
						
						</select>
                            <br />
                            Clinical History <br />
                            <textarea name="history" rows="4" cols="40" style="width:100%">${historyClinicalHistory}</textarea>
                             </div>
                    </div>
					
                </div>
                <div class="row" >
                <br>
                <br>
                </div>
            <div class="row" >
            <div class="col-sm-4">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        Select applicable ${machine} Scan
                    </div>
                    <div class="panel-body">
                        <table>
                            <tr>
                                <td>
                                	<input type="checkbox" name="scanpart" value="1" /> Abdomen/Pelvis <br />
                                	<input type="checkbox" name="scanpart" value="2" /> Angiogram <br />
                                    <input type="checkbox" name="scanpart" value="3" /> Brain <br />
                                    <input type="checkbox" name="scanpart" value="4" /> Chest <br />
                                    <input type="checkbox" name="scanpart" value="5" /> Joints <br />
                                    <input type="checkbox" name="scanpart" value="6" /> Neck <br />
                                    <input type="checkbox" name="scanpart" value="7" /> Orbits <br />
                                   	<input type="checkbox" name="scanpart" value="8" /> Spine <br />
                                    <input type="checkbox" name="scanpart" value="9" /> Others <br />
                                   
                                   
                                   
                                   
                                    
                                    
                                    
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        Tick the checkbox if you have history of the disease :
                    </div>
                    <div class="panel-body">
                    <ul style="list-style: none;">
                    <li><input type="checkbox" name="diseasehistory" value="10"/>&nbsp Allergic reaction to CT contrast (Gadolinium based)</li>
                    <li><input type="checkbox" name="diseasehistory" value="11"/>&nbsp Claustrophobia</li>
                    <li><input type="checkbox" name="diseasehistory" value="12"/>&nbsp Diabetes</li>
                    <li><input type="checkbox" name="diseasehistory" value="13"/>&nbsp Drug Allergy</li>
                    <li><input type="checkbox" name="diseasehistory" value="14"/>&nbsp Kidney Disease</li>
                    <li><input type="checkbox" name="diseasehistory" value="15"/>&nbsp Liver Disease</li>
                    <li><input type="checkbox" name="diseasehistory" value="16"/>&nbsp Latex Allergy</li>
                 	</ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-8">
                <p>The following items may be harmful to you during the scan or may interfere with the examination. Please tick if any of the following is applicable.</p>
                <ol>
                    <li>
                        <input type="checkbox" name="harmful" value="17"/>&nbsp Cardiac pacemaker or implanted cardioverter defibrillator/ICD</li>
           
                    <li>
                        <input type="checkbox" name="harmful" value="18"/>&nbsp Implanted drug pump (for chemotherapy medicine, pain medicine)</li>
                    <li>
                        <input type="checkbox" name="harmful" value="19"/>&nbsp External drug pump (for Insulin or other medicine)</li>
                   
                   
                    <li>
                        <input type="checkbox" name="harmful" value="20"/>&nbsp Artificial joint and /or limb</li>
                    <li>
                        <input type="checkbox" name="harmful" value="21"/>&nbsp Artificial eye and/or eyelid spring</li>
                    <li>
                        <input type="checkbox" name="harmful" value="22"/>&nbsp Eye injury from a metal object (metal shavings, metal slivers)</li>
                    <li>
                        <input type="checkbox" name="harmful" value="23"/>&nbsp Ear (Cochlear) implant, middle ear implant</li>
                    <li>
                        <input type="checkbox" name="harmful" value="24"/>&nbsp Hearing aid(s)</li>
                    <li>
                        <input type="checkbox" name="harmful" value="25"/>&nbsp False teeth/dentures, metallic removable dental work, braces, retainers</li>
                 
                    <li>
                        <input type="checkbox" name="harmful" value="26"/>&nbsp Injured by a metal object (shrapnel, bullet, BB) and required medical attention</li>
           
                    <li>
                        <input type="checkbox" name="harmful" value="27"/>&nbsp Body piercing, tattoo or permanent makeup</li>
                    <li>
                        <input type="checkbox" name="harmful" value="28"/>&nbsp Wig, hair implants</li>
                </ol>
                <p><input type="checkbox" name="pregnant" value="Yes"/>&nbsp (If female) Are you pregnant?</p>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4">
            	<h3>Your Consent...</h3>
                <p>&nbsp I agree with all the terms and conditions. I agree that I have been informed about all the
                risks involved in performing MRI/CT Scan. I agree with anaesthesia/sedation as may be necessary.</p>
                <p>Note : This is just a request to perform the scan/imaging. The date and time given to you for appointment may change
                    and administrator can change/reject the appointment without further notice.
                </p>
                <p>All rights reserved. Dispute under Pune Jurisdiction.</p>
				<input type="submit" value="I, Agree" class="btn btn-info"/></h1>
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
