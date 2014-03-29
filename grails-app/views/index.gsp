!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'carousel.css')}" type="text/css">
<script src="${resource(dir: 'js', file: 'holder.js')}">
	
</script>
<meta name="layout" content="main" />
<r:require modules="bootstrap" />
<r:layoutResources />
<title>Welcome to Center</title>


</head>



<body>



	<!-- Carousel
    ================================================== -->
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner">
			<div class="item active">
				<img src='${resource(dir: "images", file: "using_internet.jpg")}'
					alt="Smiley face" height="600" width="600" />
				<div class="container">
					<div class="carousel-caption" >
					
						<h1>Get Appointment Online</h1>
						<p>Now we provide online appointment booking for MRI and CT	scan</p>
						<p>You can choose date and timing for your appointment </p>
						<p> as per your convenience</p>
				
						<g:link class="btn btn-primary btn-lg" style="width:200px"
							controller="patientDetails" action="requirnment">Get Appointment</g:link>



						
					</div>
				</div>
			</div>
			<div class="item">
				<img src='${resource(dir: "images", file: "mobile.gif")}'
					alt="Smiley face" height="600" width="600" />
				
				<div class="container">
				
					<div class="carousel-caption">
						<h1 >Get Appointment via SMS</h1>
						<p >Book and confirm your appointment via SMS</p>
						<p >Message <b style="color:#000000" >ATARG YYYY-MM-DD MACHINE (MRI or CT) </b> to 56263456 </p>
				<p >Example <b style="color:#000000" >ATARG 2014-01-09 MRI </b> to 56263456 </p>
					
						<p>
							<g:link class="btn btn-lg btn-primary" controller="learnmore" action="sms" role="button">Learn
								more</g:link>
						</p>
					</div>
				</div>
			</div>
			<div class="item">
				<img src='${resource(dir: "images", file: "nexuspdf.jpg")}'
					alt="Smiley face" height="600" width="600" />
				<div class="container">
					<div class="carousel-caption">
						<h1>Get Scan Report on any device</h1>
						<p>Get your Report on any device in PDF format </p>
						<p>
						<g:link class="btn btn-primary btn-lg" style="width:200px" controller="Document" action="getReport">   Get Report    </g:link>

						</p>
					</div>
				</div>
			</div>
		</div>
		<a class="left carousel-control" href="#myCarousel" data-slide="prev"><span
			class="glyphicon glyphicon-chevron-left"></span></a> <a
			class="right carousel-control" href="#myCarousel" data-slide="next"><span
			class="glyphicon glyphicon-chevron-right"></span></a>
	</div>
	<!-- /.carousel -->




	<!-- Marketing messaging and featurettes
    ================================================== -->
	<!-- Wrap the rest of the page in another container to center all the content. -->


		<!-- FOOTER -->
		<footer>
			<p>&copy;              Poona Diagnostic Services</p>
		</footer>

	</div>
	<!-- /.container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>

</body>
</html>
