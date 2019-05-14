
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
					<h3 class="name">Employee Operations</h3>
					<p class="description">Wellcome!</p>
					<p>You can refer to this page for managing employee records! Create and update the details of the employee from here!</p>

				</div>
			</div>
			<div class="col-sm-6 col-md-5 col-lg-4 item">
				<div class="box">
					<div data-ng-app="hotel" data-ng-controller="employeeCtrl">
						<input id="name" data-ng-model="employee.name"/>
						<p/>
						<input id="surname" data-ng-model="employee.surname"/>
						<p/>
						<button class="btn btn-lg btn-block btn-primary" data-ng-click="save()">Save</button>
						<p/>
						<table class="table table-hover">
							<thead>
								<tr class="table-info">
									<th style="display: none;">id</th>
									<th>Name</th>
									<th>Surname</th>
								</tr>
							</thead>
							<tbody>
								<tr data-ng-repeat="emp in employees">
									<th style="display: none;">{{emp.id}}</th>
									<th>{{emp.name}}</th>
									<th>{{emp.surname}}</th>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>