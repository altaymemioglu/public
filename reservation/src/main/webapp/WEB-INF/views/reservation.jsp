<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<script>
    $('.input-group.date').datepicker({
        format: "yyyy/mm/dd",
        startDate: "1980-01-01",
        endDate: "2099-01-01",
        todayBtn: "linked",
        autoclose: true,
        todayHighlight: true
    });
</script>

<p />
.
<p />
.
<p />
.
<p />
.
<div class="features-boxed"  data-ng-app="hotel" data-ng-controller="reservationCtrl">
	<div class="container">
		<div class="row justify-content-center features">
			<div class="col-sm-6 col-md-5 col-lg-4 item">
				<div class="box">
					<h3 class="name"><spring:message code="reservation.leftpane.header1"/></h3>
					<p class="description"><spring:message code="reservation.leftpane.header2"/></p>
					<p><spring:message code="reservation.leftpane.content1"/></p>

				</div>
			</div>
			
			<div class="col-sm-6 col-md-5 col-lg-4 item">
				<div class="box">
					<div>
						<table class="table table-striped table-hover">
							<caption>List of reservations</caption>
							<thead class="thead-dark">
								<tr>
									<th style="display: none;">id</th>
									<th><spring:message code="reservation.centerpane.rooms.header1"/></th>
									<th><spring:message code="reservation.centerpane.rooms.header2"/></th>
									<th><spring:message code="reservation.centerpane.rooms.header3"/></th>
									<th><spring:message code="reservation.centerpane.rooms.header4"/></th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<tr data-ng-repeat="room in rooms">
									<th style="display: none;">{{room.id}}</th>
									<th><span class="badge badge-lg badge-secondary">{{room.number}}</span></th>
									<th>{{room.floor}}</th>
									<th>{{room.capacity}}</th>
									<th>{{room.attribute}}</th>
									<th>
										<button type="button" class="btn btn-sm btn-block btn-primary" 
												data-toggle="modal" data-target="#exampleModal" 
												data-ng-click="getreservations(room)">
  											<spring:message code="reservation.centerpane.rooms.reservatebutton"/>
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
		        <h5 class="modal-title" id="exampleModalLabel"><spring:message code="reservation.modal1.header"/> <span class="badge badge-secondary">{{selectedRoom.number}}</span></h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
								<table class="table table-striped table-hover" id="reservationTable">
									<thead class="thead-dark">
										<tr>
											<th style="display: none;">id</th>
											<th><spring:message code="reservation.modal1.dates.header1"/></th>
											<th><spring:message code="reservation.modal1.dates.header2"/></th>
										</tr>
									</thead>
									<tbody>
										<tr data-ng-repeat="reservation in reservations" class="clickable-row">
											<th style="display: none;">{{reservation.id}}</th>
											<th>{{reservation.startDate}}</th>
											<th>{{reservation.endDate}}</th>
										</tr>
									</tbody>
								</table>
		      </div>
		      <div class="modal-footer">
		      	<div class="input-group date">
		            <input data-ng-model="startdate" type="text" class="form-control"><span class="input-group-addon"><i class="glyphicon glyphicon-th"></i></span>
		        </div>
				<div class="input-group date">
		            <input data-ng-model="enddate" type="text" class="form-control"><span class="input-group-addon"><i class="glyphicon glyphicon-th"></i></span>
		        </div>
		      	<button type="button" class="btn btn-primary" data-ng-click="reservate(selectedRoom)"><spring:message code="reservation.modal1.reservatebutton"/></button>
		        <button type="button" class="btn btn-secondary" data-dismiss="modal"><spring:message code="reservation.modal1.closebutton"/></button>
		      </div>
		    </div>
		  </div>
		</div>

</div>