/**
 * 
 */

angular.module('hotel').controller('employeeCtrl', ['$scope', '$http', function($scope, $http){
	$scope.fillEmployeeList = function () {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/reservation/rest/services/getallemployees'
		}).then(function successCallback(response) {
			$scope.employees = response.data;
		});
	}

	$scope.fillEmployeeList();
	
	$scope.save = function () {
		var token = $("meta[name='_csrf']").attr("content");
	    var header = $("meta[name='_csrf_header']").attr("content");
		$http({
			method : 'POST',
			url : 'http://localhost:8080/reservation/rest/services/saveemployee',
			data : $scope.employee,
		    headers : {
		        'Content-Type' : 'application/json',
		        'X-CSRF-TOKEN' : token
		    }
		}).then(function successCallback(response) {
			
		});
	};
}]);