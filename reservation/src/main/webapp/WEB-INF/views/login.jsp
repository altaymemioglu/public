<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href='../reservation/css/style.css'/>
<body>
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
</div>
	<button>${loginButtonLabel}</button>
</body>
</html>