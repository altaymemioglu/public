/**
 * 
 */

angular.module('hotel').controller('employeeCtrl', ['$scope', '$http', function($scope, $http){
	$scope.fillEmployeeList = function () {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/employee/employees'
		}).then(function successCallback(response) {
			$scope.employees = response.data._embedded.employees;
		});
	}

	$scope.fillEmployeeList();
	
	$scope.save = function () {
		var token = $("meta[name='_csrf']").attr("content");
	    var header = $("meta[name='_csrf_header']").attr("content");
		$http({
			method : 'POST',
			url : 'http://localhost:8080/employee/services/save',
			data : $scope.employee,
		    headers : {
		        'Content-Type' : 'application/json',
		        'X-CSRF-TOKEN' : token
		    }
		}).then(function successCallback(response) {
			$scope.employee = response.data;
			$scope.fillEmployeeList();
		});
	};
	
	$scope.remove = function (emp) {
		var token = $("meta[name='_csrf']").attr("content");
	    var header = $("meta[name='_csrf_header']").attr("content");
		$http({
			method : 'POST',
			url : 'http://localhost:8080/employee/services/remove',
			data : emp,
		    headers : {
		        'Content-Type' : 'application/json',
		        'X-CSRF-TOKEN' : token
		    }
		}).then(function successCallback(response) {
			$scope.employee =null;
			$scope.fillEmployeeList();
		});
	};
	
	$scope.activities = function (emp) {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/employee/activities?employeeid='+emp.id
		}).then(function successCallback(response) {
			$scope.activity = response.data;
		});
	}
}]);