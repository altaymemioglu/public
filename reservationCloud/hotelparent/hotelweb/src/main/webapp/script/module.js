/**
 * 
 */

var app = angular.module("hotel", ["ngRoute"]);

app.config(function($routeProvider) {
	$routeProvider
	.when("/reservation", {
		templateUrl : "reservation",
		controller : "reservationCtrl"
	})
	.when("/customer", {
		templateUrl : "customer",
		controller : "customerCtrl"
	})
	.when("/checkin", {
		templateUrl : "checkin",
		controller : "checkinCtrl"
	})
	.when("/checkout", {
		templateUrl : "checkout",
		controller : "checkoutCtrl"
	})
	.when("/help", {
		templateUrl : "help",
		controller : "helpCtrl"
	})
	.when("/home", {
		templateUrl : "home",
		controller : "homeCtrl"
	})
	.when("/employee", {
		templateUrl : "employee",
		controller : "employeeCtrl"
	})
	.otherwise({
		redirectTo : "home"
	})
	;
});