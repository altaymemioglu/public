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
					<h3 class="name">Reservations</h3>
					<p class="description">istanbul / Turkey</p>
					<p>You can manage reservations from this section. Please feel
						free to make multiple room selection. Simply press reservation
						button to relate with an existing customer record!</p>

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
									<th>Number</th>
									<th>Floor</th>
									<th>Capacity</th>
									<th>Type</th>
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
  											Reservation
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
		        <h5 class="modal-title" id="exampleModalLabel">Reservations for Room <span class="badge badge-secondary">{{selectedRoom.number}}</span></h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
								<table class="table table-striped table-hover" id="reservationTable">
									<thead class="thead-dark">
										<tr>
											<th style="display: none;">id</th>
											<th>Start Date</th>
											<th>End Date</th>
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
		      	<button type="button" class="btn btn-primary" data-ng-click="reservate(selectedRoom)">Reservate</button>
		        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
		      </div>
		    </div>
		  </div>
		</div>

</div>