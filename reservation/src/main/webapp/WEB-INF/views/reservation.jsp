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
					<table class="table table-hover" data-ng-controller="reservationCtrl">
						<thead>
							<tr class="table-info">
								<th><input type="checkbox" data-ng-model="allItemsSelected"
									data-ng-change="selectAll()"></th>
								<th style="display: none;">id</th>
								<th>Floor</th>
								<th>Number</th>
								<th>Capacity</th>
								<th>Type</th>
								<th>Reserved</th>
							</tr>
						</thead>
						<tbody>
							<tr data-ng-repeat="room in rooms"
								data-ng-class="{selected: room.checked}" data-ng-class-odd="odd"
								data-ng-class-even="even">
								<td><input type="checkbox" data-ng-model="room.checked"
									data-ng-change="selectRoom()"></td>
								<th style="display: none;">{{room.id}}</th>
								<th>{{room.floor}}</th>
								<th>{{room.number}}</th>
								<th>{{room.capacity}}</th>
								<th>{{room.attribute}}</th>
								<th>{{room.reserved}}</th>
							</tr>
						</tbody>
					</table>
					<button class="btn btn-lg btn-block btn-primary"
						data-ng-click="reservate()">Reservate</button>
				</div>
			</div>
		</div>
	</div>
</div>