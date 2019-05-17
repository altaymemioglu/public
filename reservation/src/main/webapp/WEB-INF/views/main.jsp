<!DOCTYPE html>
<html data-ng-app="hotel">

<head>
 <meta name="_csrf" content="${_csrf.token}"/>
 <!-- default header name is X-CSRF-TOKEN -->
 <meta name="_csrf_header" content="${_csrf.headerName}"/>
<script data-require="jquery@*" data-semver="3.2.1"	src="https://cdn.jsdelivr.net/npm/jquery@3.2.1/dist/jquery.min.js"></script>
<link data-require="bootstrap@*" data-semver="4.1.3" rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" />
<script data-require="bootstrap@*" data-semver="4.1.3" src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://bootswatch.com/4/journal/bootstrap.css" />
<link href="style/datepicker3.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<script	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>
<script src="script/module.js"></script>
<script src="script/checkinController.js"></script>
<script src="script/checkoutController.js"></script>
<script src="script/customerController.js"></script>
<script src="script/helpController.js"></script>
<script src="script/reservationController.js"></script>
<script src="script/welcomeController.js"></script>
<script src="script/employeeController.js"></script>
<script src="script/bootstrap-datepicker.js"></script>
</head>
<body
	background="https://www.htihospitality.tech/wp-content/uploads/2017/09/google-hotel-background-landing-page2.png">
	<div class="navbar navbar-expand-lg fixed-top navbar-light bg-light">
		<div class="container">
			<a href="#!welcome" class="navbar-brand">Paradise Hotel</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
						id="themes">Menu <span class="caret"></span></a>
						<div class="dropdown-menu" aria-labelledby="themes">
							<a class="dropdown-item" href="#!welcome">Default</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="#!checkin">CheckIn</a>
							<a class="dropdown-item" href="#!checkout">CheckOut</a>
							<a class="dropdown-item" href="#!reservation">Reservation</a>
							<a class="dropdown-item" href="#!customer">Customer</a>
							<a class="dropdown-item" href="#!employee">Employee</a>
						</div></li>
					<li class="nav-item"><a class="nav-link" href="#!help">Help</a>
					</li>
				</ul>

				<ul class="nav navbar-nav ml-auto">
					<li class="nav-item">
						<form id="logoutform" action="/reservation/logout" method="post">
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" /> <a class="nav-link"
								href="javascript:{}"
								onclick="document.getElementById('logoutform').submit(); return false;">Log
								Out</a>
						</form>
					</li>
				</ul>
				
			</div>
		</div>
	</div>

	<div class="bs-docs-section clearfix">
		<div class="row">
			<div class="col-sm-6">
				<div data-ng-view></div>
			</div>
		</div>
	</div>

	<script>

</script>
</body>
</html>