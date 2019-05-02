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
					<h3 class="name">Reservations</h3>
					<p class="description">istanbul / Turkey</p>
					<p>You can manage reservations from this section. Please feel
						free to make multiple room selection. Simply press reservation
						button to relate with an existing customer record!</p>

				</div>
			</div>
			
			<div class="col-sm-6 col-md-5 col-lg-4 item">
				<div class="box">
					<div data-ng-app="hotel" data-ng-controller="reservationCtrl">
						<table class="table table-hover">
							<thead>
								<tr class="table-info">
									<th></th>
									<th style="display: none;">id</th>
									<th>Floor</th>
									<th>Number</th>
									<th>Capacity</th>
									<th>Type</th>
									<th>Reserved</th>
								</tr>
							</thead>
							<tbody>
								<tr data-ng-repeat="room in rooms">
									<td><input type="checkbox" data-ng-model="room.isChecked"/></td>
									<th style="display: none;">{{room.id}}</th>
									<th>{{room.floor}}</th>
									<th>{{room.number}}</th>
									<th>{{room.capacity}}</th>
									<th>{{room.attribute}}</th>
									<th>{{room.reserved}}</th>
								</tr>
							</tbody>
						</table>
						<button class="btn btn-lg btn-block btn-primary" data-ng-click="reservate()">Reservate</button>
					</div>
				</div>
			</div>
			
		</div>
	</div>
</div>