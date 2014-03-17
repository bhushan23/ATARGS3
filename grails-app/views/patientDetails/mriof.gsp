<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
 
    <title>Poona Diagnostice Service- Schedule an Appointments</title>
    <r:require modules="bootstrap"/>
    <meta name="layout" content="main" />
    <r:layoutResources/>
 </head>

<body>
    <div class="navbar navbar-top navbar-inverse" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">PDS</a>
            </div>
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li><a href="#">Home</a></li>
                    <li class="active"><a href="PatientIndex.html">For Patients</a></li>
                    <li><a href="#about">For Referring Physicans</a></li>
                    <li><a href="#about">Meet Our Experts</a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="#contact">Contact Us</a></li>
                </ul>
            </div>
            <!-- /.nav-collapse -->
        </div>
        <!-- /.container -->
    </div>
    <!-- /.navbar -->
    <div class="container">

        <div class="masthead">
            <h3 class="text-muted">Schedule an Appointment</h3>
            <ul class="nav nav-justified">
                <li><a href="MainForm.html">Date and Time</a></li>
                <li ><a href="#">Personal Details</a></li>
                <li class="active"><a href="mriof">Scan of</a></li>
                <li><a href="#">Questionnaire</a></li>
                <li><a href="#">Consent and Undertaking</a></li>
                <li><a href="#">Finish</a></li>
            </ul>
        </div>
		<div class="progress progress-striped active" style="margin:0px;height:5px">
			<div class="progress-bar progress-bar-info" style="width: 34%">	</div>
		</div>
        
        <!-- Jumbotron -->
        <div class="jumbotron">
            <h1>${machine } of
            <g:link action="questionare" class="btn btn-info"> Next Step &raquo;</g:link></h1>
            <h4>Step 3 of 6</h4>
            <h5>Edit Personal Details | Questionnaire </h5>

        </div>
        <div class="row" >
            <div class="col-sm-4">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        Select which is applicable
                    </div>
                    <div class="panel-body">
                        <table>
                            <tr>
                                <td>
                                    <input type="checkbox" name="brain" value="brain" /> Brain <br />
                                    <input type="checkbox" name="spine" value="spine" /> Spine <br />
                                    <input type="checkbox" name="joints" value="joints" /> Joints <br />
                                    <input type="checkbox" name="orbits" value="orbits" /> Orbits <br />
                                    <input type="checkbox" name="neck" value="neck" /> Neck <br />
                                    <input type="checkbox" name="chest" value="chest" /> Chest <br />
                                    <input type="checkbox" name="abdompelv" value="andompelv" /> Abdomen/Pelvis <br />
                                    <input type="checkbox" name="others" value="others" /> Others <br />
                                    <input type="checkbox" name="mrangio" value="mrangio" /> Angiogram <br />
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
            
        </div>
        <hr>

        <footer onmouseover="hide()">
            <p>&copy; Company 2013</p>
        </footer>

    </div>
    <!--/.container-->


</body>
</html>
