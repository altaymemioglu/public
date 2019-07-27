/**
 * 
 */

angular.module('hotel').controller('customerCtrl', ['$scope', '$http', function($scope, $http){
	$scope.fillCustomerList = function () {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/customer/customers'
		}).then(function successCallback(response) {
			$scope.customers = response.data._embedded.customers;
		});
	}

	$scope.fillCustomerList();
	
	$scope.save = function () {
		var token = $("meta[name='_csrf']").attr("content");
	    var header = $("meta[name='_csrf_header']").attr("content");
		$http({
			method : 'POST',
			url : 'http://localhost:8080/customer/services/save',
			data : $scope.customer,
		    headers : {
		        'Content-Type' : 'application/json',
		        'X-CSRF-TOKEN' : token
		    }
		}).then(function successCallback(response) {
			$scope.customer = response.data;
			$scope.fillCustomerList();
		});
	};
	
	$scope.remove = function (cust) {
		var token = $("meta[name='_csrf']").attr("content");
	    var header = $("meta[name='_csrf_header']").attr("content");
		$http({
			method : 'POST',
			url : 'http://localhost:8080/customer/services/remove',
			data : cust,
		    headers : {
		        'Content-Type' : 'application/json',
		        'X-CSRF-TOKEN' : token
		    }
		}).then(function successCallback(response) {
			$scope.customer =null;
			$scope.fillCustomerList();
		});
	};
}]);