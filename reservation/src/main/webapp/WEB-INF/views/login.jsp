<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

		<div id="preamble" data-ng-controller="loginCtrl">
			<h3><span>What is Paradise Hotel?</span></h3>
			<p class="p2"><span>Paradise Hotel is a web based demo application which uses RESTfull web services and AngularJS. It stores data within PostgreSQL using Hibernate. Implemented on Spring framework.</span></p>
			<p><label for="username">User Name   :</label><input name="username"/></p>
			<p><label for="password">Password    :</label><input name="password"/></p>
			<button data-ng-click="">logIn</button>
		</div>
	</div>
	
		<div id="linkList">
		<div id="linkList2">
		<p><h1>Paradise Hotel</h1></div>
	</div>
</div>

<script>

var app = angular.module("hotel",[]);

app.controller("welcomeCtrl", function ($scope,$http) {
    	$http({
		method : 'GET',
		url : 'http://localhost:8080/reservation/rest/services/welcome'
	}).then(function successCallback(response) {
		$scope.welcome = response.data;
	});
});

app.controller("loginCtrl", function ($scope,$http) {

});
</script>

</body>
</html>
