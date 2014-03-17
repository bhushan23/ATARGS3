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
                                    <input type="radio" name="salution" value="Mr" />Mr.
                                    <input type="radio" name="salution" value="Mrs" />Mrs.
                                    <input type="radio" name="salution" value="Miss" />Miss.
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
                                	<input type="checkbox" name="scanpart" value="Abdomen/Pelvis" /> Abdomen/Pelvis <br />
                                	<input type="checkbox" name="scanpart" value="Angiogram" /> Angiogram <br />
                                    <input type="checkbox" name="scanpart" value="Brain" /> Brain <br />
                                    <input type="checkbox" name="scanpart" value="Chest" /> Chest <br />
                                    <input type="checkbox" name="scanpart" value="Joints" /> Joints <br />
                                    <input type="checkbox" name="scanpart" value="Neck" /> Neck <br />
                                    <input type="checkbox" name="scanpart" value="Orbits" /> Orbits <br />
                                   	<input type="checkbox" name="scanpart" value="Spine" /> Spine <br />
                                    <input type="checkbox" name="scanpart" value="Others" /> Others <br />
                                   
                                   
                                   
                                   
                                    
                                    
                                    
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
                    <li><input type="checkbox" name="diseasehistory" value="Allergic reaction to CT contrast (Gadolinium based)"/>&nbsp Allergic reaction to CT contrast (Gadolinium based)</li>
                    <li><input type="checkbox" name="diseasehistory" value="Claustrophobia"/>&nbsp Claustrophobia</li>
                    <li><input type="checkbox" name="diseasehistory" value="Diabetes"/>&nbsp Diabetes</li>
                    <li><input type="checkbox" name="diseasehistory" value="Drug Allergy"/>&nbsp Drug Allergy</li>
                    <li><input type="checkbox" name="diseasehistory" value="Kidney Disease"/>&nbsp Kidney Disease</li>
                    <li><input type="checkbox" name="diseasehistory" value="Liver Disease"/>&nbsp Liver Disease</li>
                    <li><input type="checkbox" name="diseasehistory" value="Latex Allergy"/>&nbsp Latex Allergy</li>
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
                        <input type="checkbox" name="harmful" value="Cardiac pacemaker or implanted cardioverter defibrillator/ICD"/>&nbsp Cardiac pacemaker or implanted cardioverter defibrillator/ICD</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Internal electrodes or wires (pacing wires, DBS or VNS wires)"/>&nbsp Internal electrodes or wires (pacing wires, DBS or VNS wires)</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Artificial heart value, coil, filter and/or stent (Gianturco coil, IVC filter)"/>&nbsp Artificial heart value, coil, filter and/or stent (Gianturco coil, IVC filter)</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Aneurysm clip(s)"/>&nbsp Aneurysm clip(s)</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Neurostimulator-TENS Unit, Biostimulator, bone growth stimulator, DBS, VNS"/>&nbsp Neurostimulator-TENS Unit, Biostimulator, bone growth stimulator, DBS, VNS</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Implanted drug pump (for chemotherapy medicine, pain medicine)"/>&nbsp Implanted drug pump (for chemotherapy medicine, pain medicine)</li>
                    <li>
                        <input type="checkbox" name="harmful" value="External drug pump (for Insulin or other medicine)"/>&nbsp External drug pump (for Insulin or other medicine)</li>
                    <li>
                        <input type="checkbox" name="harmful" value="IV access port (Port-a-Cath, Broviac, PICC line, Swan-Gantz, Thermodilution)"/>&nbsp IV access port (Port-a-Cath, Broviac, PICC line, Swan-Gantz, Thermodilution)</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Implanted post surgical hardware (pins, rods, screws, plates, wires)"/>&nbsp Implanted post surgical hardware (pins, rods, screws, plates, wires)</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Artificial joint and /or limb"/>&nbsp Artificial joint and /or limb</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Artificial eye and/or eyelid spring"/>&nbsp Artificial eye and/or eyelid spring</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Eye injury from a metal object (metal shavings, metal slivers)"/>&nbsp Eye injury from a metal object (metal shavings, metal slivers)</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Ear (Cochlear) implant, middle ear implant"/>&nbsp Ear (Cochlear) implant, middle ear implant</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Hearing aid(s)"/>&nbsp Hearing aid(s)</li>
                    <li>
                        <input type="checkbox" name="harmful" value="False teeth/dentures, metallic removable dental work, braces, retainers"/>&nbsp False teeth/dentures, metallic removable dental work, braces, retainers</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Any type of implant held in place by a magnet"/>&nbsp Any type of implant held in place by a magnet</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Injured by a metal object (shrapnel, bullet, BB) and required medical attention"/>&nbsp Injured by a metal object (shrapnel, bullet, BB) and required medical attention</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Medication patch (nitroglycerine, nicotine, contraceptive, estrogen)"/>&nbsp Medication patch (nitroglycerine, nicotine, contraceptive, estrogen)</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Shunt or Sophy adjustable and programmable pressure valve"/>&nbsp Shunt or Sophy adjustable and programmable pressure valve</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Spinal fixation device, spinal fusion and/or halo vest, spinal cord stimulator"/>&nbsp Spinal fixation device, spinal fusion and/or halo vest, spinal cord stimulator</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Surgical clips, staples or surgical mesh"/>&nbsp Surgical clips, staples or surgical mesh</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Tissue expander (breast)"/>&nbsp Tissue expander (breast)</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Penile implant"/>&nbsp Penile implant</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Pessary, IUD, Diaphragm"/>&nbsp Pessary, IUD, Diaphragm</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Radiation seeds (cancer treatment)"/>&nbsp Radiation seeds (cancer treatment)</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Body piercing, tattoo or permanent makeup"/>&nbsp Body piercing, tattoo or permanent makeup</li>
                    <li>
                        <input type="checkbox" name="harmful" value="Wig, hair implants"/>
                        &nbsp Wig, hair implants</li>
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
