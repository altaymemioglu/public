/**
 * 
 */

angular.module('hotel').controller('reservationCtrl', ['$scope', '$http', function($scope, $http){
	$scope.fillRoomList = function () {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/reservation/rooms'
		}).then(function successCallback(response) {
			$scope.rooms = response.data._embedded.rooms;
		});
	}
	
	$scope.getreservations = function (roomid) {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/reservation/rooms/'+roomid+'/reservations'
		}).then(function successCallback(response) {
			$scope.reservations = response.data._embedded.reservations;
		});
	}

	$scope.fillRoomList();
	
	$scope.reservate = function () {
		var token = $("meta[name='_csrf']").attr("content");
	    var header = $("meta[name='_csrf_header']").attr("content");
		$http({
			method : 'POST',
			url : 'http://localhost:8080/reservation/rest/services/room/reservate',
			data : $scope.rooms,
		    headers : {
		        'Content-Type' : 'application/json',
		        'X-CSRF-TOKEN' : token
		    }
		}).then(function successCallback(response) {
			
		});
	};
}]);