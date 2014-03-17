<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>Poona Diagnostice Services- Schedule an Appointment</title>
	<r:require modules="bootstrap"/>
	<r:layoutResources/>
	<meta name="layout" content="main" />
</head>

<body>
    <br>
    <br>
    <br>
    <div class="container">

        <div class="masthead">
            <h3 class="text-muted">Schedule an Appointment</h3>
            <ul class="nav nav-justified">
                <li class="active"><a href="#">Date and Time</a></li>
                <li><a href="personal.html" onclick="CannotSkip()">Personal Details</a></li>
                <li><a href="#" onclick="CannotSkip()">Scan of</a></li>
                <li><a href="#" onclick="CannotSkip()">Questionare</a></li>
                <li><a href="#" onclick="CannotSkip()">Consent and Undertaking</a></li>
                <li><a href="#" onclick="CannotSkip()">Finish</a></li>
            </ul>
        </div>
<div class="progress progress-striped active" style="margin:0px;height:5px">
			<div class="progress-bar progress-bar-info" style="width: 51%">	</div>
		</div>
        
        <!-- Jumbotron -->
        <div class="jumbotron">
            <h1>Questionnaire<g:link action="consent" class="btn btn-info"> Next Step &raquo;</g:link></h1>
            <h4>Step 4 of 6</h4>
            <h5>Scan of | Consent and Undertaking</h5>

        </div>

        <!-- Example row of columns -->
        <div class="row">
            <div class="col-lg-8">
                <p>The following items may be harmful to you during the scan or may interfere with the examination. Please tick if any of the following is applicable.</p>
                <ol>
                    <li>
                        <input type="checkbox" name="1" />&nbsp Cardiac pacemaker or implanted cardioverter defibrillator/ICD</li>
                    <li>
                        <input type="checkbox" name="2" />&nbsp Internal electrodes or wires (pacing wires, DBS or VNS wires)</li>
                    <li>
                        <input type="checkbox" name="3" />&nbsp Artificial heart value, coil, filter and/or stent (Gianturco coil, IVC filter)</li>
                    <li>
                        <input type="checkbox" name="4" />&nbsp Aneurysm clip(s)</li>
                    <li>
                        <input type="checkbox" name="5" />&nbsp Neurostimulator-TENS Unit, Biostimulator, bone growth stimulator, DBS, VNS</li>
                    <li>
                        <input type="checkbox" name="6" />&nbsp Implanted drug pump (for chemotherapy medicine, pain medicine)</li>
                    <li>
                        <input type="checkbox" name="7" />&nbsp External drug pump (for Insulin or other medicine)</li>
                    <li>
                        <input type="checkbox" name="8" />&nbsp IV access port (Port-a-Cath, Broviac, PICC line, Swan-Gantz, Thermodilution)</li>
                    <li>
                        <input type="checkbox" name="9" />&nbsp Implanted post surgical hardware (pins, rods, screws, plates, wires)</li>
                    <li>
                        <input type="checkbox" name="10" />&nbsp Artificial joint and /or limb</li>
                    <li>
                        <input type="checkbox" name="11" />&nbsp Artificial eye and/or eyelid spring</li>
                    <li>
                        <input type="checkbox" name="12" />&nbsp Eye injury from a metal object (metal shavings, metal slivers)</li>
                    <li>
                        <input type="checkbox" name="13" />&nbsp Ear (Cochlear) implant, middle ear implant</li>
                    <li>
                        <input type="checkbox" name="14" />&nbsp Hearing aid(s)</li>
                    <li>
                        <input type="checkbox" name="15" />&nbsp False teeth/dentures, metallic removable dental work, braces, retainers</li>
                    <li>
                        <input type="checkbox" name="16" />&nbsp Any type of implant held in place by a magnet</li>
                    <li>
                        <input type="checkbox" name="17" />&nbsp Injured by a metal object (shrapnel, bullet, BB) and required medical attention</li>
                    <li>
                        <input type="checkbox" name="18" />&nbsp Medication patch (nitroglycerine, nicotine, contraceptive, estrogen)</li>
                    <li>
                        <input type="checkbox" name="19" />&nbsp Shunt or Sophy adjustable and programmable pressure valve</li>
                    <li>
                        <input type="checkbox" name="20" />&nbsp Spinal fixation device, spinal fusion and/or halo vest, spinal cord stimulator</li>
                    <li>
                        <input type="checkbox" name="21" />&nbsp Surgical clips, staples or surgical mesh</li>
                    <li>
                        <input type="checkbox" name="22" />&nbsp Tissue expander (breast)</li>
                    <li>
                        <input type="checkbox" name="23" />&nbsp Penile implant</li>
                    <li>
                        <input type="checkbox" name="24" />&nbsp Pessary, IUD, Diaphragm</li>
                    <li>
                        <input type="checkbox" name="25" />&nbsp Radiation seeds (cancer treatment)</li>
                    <li>
                        <input type="checkbox" name="26" />&nbsp Body piercing, tattoo or permanent makeup</li>
                    <li>
                        <input type="checkbox" name="27" />
                        &nbsp Wig, hair implants</li>
                </ol>
                <p>Tick the checkbox if you have history of the disease : </p>
                <ol>
                    <li><input type="checkbox" name="1" />&nbsp Kidney Disease</li>
                    <li><input type="checkbox" name="2" />&nbsp Diabetes</li>
                    <li><input type="checkbox" name="3" />&nbsp Liver Disease</li>
                    <li><input type="checkbox" name="4" />&nbsp Claustrophobia</li>
                    <li><input type="checkbox" name="5" />&nbsp Drug Allergy</li>
                    <li><input type="checkbox" name="6" />&nbsp Latex Allergy</li>
                    <li><input type="checkbox" name="7" />&nbsp Allergic reaction to CT contrast (Gadolinium based)</li>

                </ol>
                <p> Display only if the patient is female.</p>
                <p><input type="checkbox" name="1" />&nbsp (If female) Are you pregnant?</p>
            </div>
        </div>

        <hr>

        <footer>
            <p>&copy; 2013 Poona Diagnostic Services</p>
        </footer>

    </div>
    <!--/.container-->



    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="..\..\js\bootstrap.min.js"></script>
    <script src="..\..\js\offcanvas.js"></script>
    <script>
        function CannotSkip() {
            alert("Cannont Skip Steps. You will have to proceed serially.");
        }
    </script>
</body>
</html>
