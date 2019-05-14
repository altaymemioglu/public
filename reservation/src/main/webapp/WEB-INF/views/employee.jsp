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
					<h3 class="name">Employee Operations</h3>
					<p class="description">Wellcome!</p>
					<p>You can refer to this page for managing employee records! Create and update the details of the employee from here!</p>

				</div>
			</div>
			<div class="col-sm-6 col-md-5 col-lg-4 item">
				<div class="box">
					<div>
						<label for="name">Name:</label> 
						<input name="name" class="form-control input-sm" data-ng-model="employee.name"/>
						<p/>
						<label for="surname">Surname:</label>
						<input name="surname" class="form-control input-sm" data-ng-model="employee.surname"/>
						<p/>
						<button class="btn btn-sm btn-block btn-primary" data-ng-click="save()">Save</button>
						<p/>
						<table class="table table-striped table-hover" id="employeeTable">
							<thead class="thead-dark">
								<tr>
									<th style="display: none;">id</th>
									<th>Name</th>
									<th>Surname</th>
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
  											Details
										</button>
									</th>
									<th>
										<button class="btn btn-sm btn-block btn-secondary" data-ng-click="remove(emp)">
											Remove
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
        <h5 class="modal-title" id="exampleModalLabel">Employee's Recent Activities</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
						<table class="table table-striped table-hover" id="checkInTable">
							<thead class="thead-dark">
								<tr>
									<th style="display: none;">id</th>
									<th>Room Id</th>
									<th>Customer Id</th>
									<th>Time</th>
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
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
	
</div>