/**
 * 
 */

angular.module('hotel').controller('reservationCtrl', ['$scope', '$http', function($scope, $http){
	$scope.fillRoomList = function () {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/reservation/rest/services/getallrooms'
		}).then(function successCallback(response) {
			$scope.rooms = response.data;
		});
	}

	$scope.fillRoomList();
	
	$scope.reservate = function () {
		var token = $("meta[name='_csrf']").attr("content");
	    var header = $("meta[name='_csrf_header']").attr("content");
		$http({
			method : 'POST',
			url : 'http://localhost:8080/reservation/rest/services/reservate',
			data : $scope.rooms,
		    headers : {
		        'Content-Type' : 'application/json',
		        'X-CSRF-TOKEN' : token
		    }
		}).then(function successCallback(response) {
			
		});
	};
}]);