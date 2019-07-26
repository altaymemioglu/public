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
<div class="features-boxed" data-ng-app="hotel" data-ng-controller="customerCtrl">
	<div class="container">
		<div class="row justify-content-center features">
			<div class="col-sm-6 col-md-5 col-lg-4 item">
				<div class="box">
					<h3 class="name"><spring:message code="customer.leftpane.header1"/></h3>
					<p class="description"><spring:message code="customer.leftpane.header2"/></p>
					<p><spring:message code="customer.leftpane.content1"/></p>

				</div>
			</div>
			<div class="col-sm-6 col-md-5 col-lg-4 item">
				<div class="box">
					<div>
						<label for="name"><spring:message code="customer.centerpane.label1"/>:</label> 
						<input name="name" class="form-control input-sm" data-ng-model="customer.name"/>
						<p/>
						<label for="surname"><spring:message code="customer.centerpane.label2"/>:</label>
						<input name="surname" class="form-control input-sm" data-ng-model="customer.surname"/>
						<p/>
						<button class="btn btn-sm btn-block btn-primary" data-ng-click="save()">
							<spring:message code="customer.centerpane.savebutton"/>
						</button>
						<p/>
						<table class="table table-striped table-hover" id="customerTable">
							<thead class="thead-dark">
								<tr>
									<th style="display: none;">id</th>
									<th><spring:message code="customer.centerpane.customers.header1"/></th>
									<th><spring:message code="customer.centerpane.customers.header2"/></th>
									<th></th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<tr data-ng-repeat="cust in customers" class="clickable-row">
									<th style="display: none;">{{cust.id}}</th>
									<th>{{cust.name}}</th>
									<th>{{cust.surname}}</th>
									<th>
										<button type="button" class="btn btn-sm btn-block btn-primary" 
												data-toggle="modal" data-target="#exampleModal" data-ng-click="">
  											<spring:message code="customer.centerpane.customers.detailsbutton"/>
										</button>
									</th>
									<th>
										<button class="btn btn-sm btn-block btn-secondary" data-ng-click="remove(cust)">
											<spring:message code="customer.centerpane.customers.removebutton"/>
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
	        <h5 class="modal-title" id="exampleModalLabel"><spring:message code="customer.modal1.header"/></h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">

	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal"><spring:message code="customer.modal1.closebutton"/></button>
	      </div>
	    </div>
	  </div>
	</div>
	
</div>