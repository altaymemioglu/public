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
<div class="features-boxed"  data-ng-app="hotel" data-ng-controller="employeeCtrl">
	<div class="container">
		<div class="row justify-content-center features">
			<div class="col-sm-6 col-md-5 col-lg-4 item">
				<div class="box">
					<h3 class="name"><spring:message code="employee.leftpane.header1"/></h3>
					<p class="description"><spring:message code="employee.leftpane.header2"/></p>
					<p><spring:message code="employee.leftpane.content1"/></p>

				</div>
			</div>
			<div class="col-sm-6 col-md-5 col-lg-4 item">
				<div class="box">
					<div>
						<label for="name"><spring:message code="employee.centerpane.label1"/>:</label> 
						<input name="name" class="form-control input-sm" data-ng-model="employee.name"/>
						<p/>
						<label for="surname"><spring:message code="employee.centerpane.label2"/>:</label>
						<input name="surname" class="form-control input-sm" data-ng-model="employee.surname"/>
						<p/>
						<button class="btn btn-sm btn-block btn-primary" data-ng-click="save()">Save</button>
						<p/>
						<table class="table table-striped table-hover" id="employeeTable">
							<thead class="thead-dark">
								<tr>
									<th style="display: none;">id</th>
									<th><spring:message code="employee.centerpane.employees.header1"/></th>
									<th><spring:message code="employee.centerpane.employees.header2"/></th>
									<th></th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<tr data-ng-repeat="emp in employees" class="clickable-row">
									<th style="display: none;">{{emp.id}}</th>
									<th>{{emp.name}}</th>
									<th>{{emp.surname}}</th>
									<th>
										<button type="button" class="btn btn-sm btn-block btn-primary" 
												data-toggle="modal" data-target="#exampleModal" data-ng-click="activities(emp)">
  											<spring:message code="employee.centerpane.employees.detailsbutton"/>
										</button>
									</th>
									<th>
										<button class="btn btn-sm btn-block btn-secondary" data-ng-click="remove(emp)">
											<spring:message code="employee.centerpane.employees.removebutton"/>
										</button>
									</th>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel"><spring:message code="employee.modal1.header"/></h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
						<table class="table table-striped table-hover" id="checkInTable">
							<thead class="thead-dark">
								<tr>
									<th style="display: none;">id</th>
									<th><spring:message code="employee.modal1.checkins.header1"/></th>
									<th><spring:message code="employee.modal1.checkins.header2"/></th>
									<th><spring:message code="employee.modal1.checkins.header3"/></th>
								</tr>
							</thead>
							<tbody>
								<tr data-ng-repeat="checkin in activity.checkIns" class="clickable-row">
									<th style="display: none;">{{checkin.id}}</th>
									<th>{{checkin.roomid}}</th>
									<th>{{checkin.customerid}}</th>
									<th>{{checkin.time}}</th>
								</tr>
							</tbody>
						</table>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal"><spring:message code="employee.modal1.closebutton"/></button>
      </div>
    </div>
  </div>
</div>
	
</div>