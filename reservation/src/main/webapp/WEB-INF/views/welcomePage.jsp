<!DOCTYPE html>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<p />
.
<p />
.
<p />
.
<p />
.
<div class="features-boxed">
	<div class="container">
		<div class="row justify-content-center features">
			<div class="col-sm-6 col-md-5 col-lg-4 item">
				<div class="box">
					<h3 class="name"><spring:message code="welcome.leftpane.header1"/></h3>
					<p class="description"><spring:message code="welcome.leftpane.header2"/></p>
					<p><spring:message code="welcome.leftpane.content1"/></p>

				</div>
			</div>
			<div class="col-sm-6 col-md-5 col-lg-4 item">
				<div class="box">
					<p class="description"><spring:message code="welcome.centerpane.header1"/></p>
					<p><spring:message code="welcome.centerpane.header2"/></p>
					<p/>
					<p><spring:message code="welcome.centerpane.content1"/></p>
					<p><spring:message code="welcome.centerpane.content2"/></p>
				</div>
			</div>
		</div>
	</div>
</div>