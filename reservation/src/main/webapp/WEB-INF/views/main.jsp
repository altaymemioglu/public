<!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>
<link rel="stylesheet" href='../reservation/css/style.css'/>
<body data-ng-app="hotel">

<div id="container">
	<div id="intro">
		<div id="pageHeader" data-ng-controller="welcomeCtrl">
			<h1><span>{{welcome.text}}</span></h1>
		</div>

		<div id="preamble">
			<h3><span>What is Paradise Hotel?</span></h3>
			<p class="p2"><span>Paradise Hotel is a web based demo application which uses RESTfull web services and AngularJS. It stores data within PostgreSQL using Hibernate. Implemented on Spring framework.</span></p>
		</div>
		
	</div>

	<div id="supportingText">
		<div id="explanation">
			<h3><span>Currently Viewing:</span></h3>
			<div data-ng-view>
				
			</div>
		</div>

		<div id="participation">

		</div>

		<div id="benefits">

		</div>
		<div id="footer">

		</div>

	</div>

	
	<div id="linkList">
		<div id="linkList2">
		<p><h1>Paradise Hotel</h1>
			<div id="lselect">
				<ul>
					<li><a href="#!reservation">Reservation</a></li>
					<li><a href="#!checkin">Check In</a></li>
					<li><a href="#!checkout">Check Out</a></li>
				</ul>
			</div>
		</div>
	</div>

</div>

<script>
var app = angular.module("hotel", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/reservation", {
        templateUrl : "reservation.do",
        controller : "reservationCtrl"
    })
    .when("/checkout", {
        templateUrl : "checkout.do",
        controller : "checkoutCtrl"
    })
    .when("/checkin", {
        templateUrl : "checkin.do",
        controller : "checkinCtrl"
    });
});

app.controller("reservationCtrl", function ($scope) {
    $scope.msg = "Reservation >";
});

app.controller("checkinCtrl", function ($scope) {
    $scope.msg = "Check In >";
});

app.controller("checkoutCtrl", function ($scope) {
    $scope.msg = "Check Out >";
});

app.controller("welcomeCtrl", function ($scope,$http) {
    	$http({
		method : 'GET',
		url : 'http://localhost:8080/reservation/rest/services/welcome'
	}).then(function successCallback(response) {
		$scope.welcome = response.data;
	});
});

app.controller('roomCtrl', function ($scope,$http) {

	$http({
		method : 'GET',
		url : 'http://localhost:8080/reservation/rest/services/getallrooms'
	}).then(function successCallback(response) {
		$scope.rooms = response.data;
	});
		
     $scope.allItemsSelected = false;

     $scope.selectRoom = function () {
         for (var i = 0; i < $scope.rooms.length; i++) {
             if (!$scope.rooms[i].checked) {
                 $scope.allItemsSelected = false;
                 return;
             }
         }
         $scope.allItemsSelected = true;
     };

     $scope.selectAll = function () {

         for (var i = 0; i < $scope.rooms.length; i++) {
             $scope.rooms[i].checked = $scope.allItemsSelected;
         }
     };
});
</script>

</body>
</html>
