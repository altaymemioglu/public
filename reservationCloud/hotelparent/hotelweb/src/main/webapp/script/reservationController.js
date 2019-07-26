/**
 * 
 */

angular.module('hotel').controller('reservationCtrl', ['$scope', '$http', function($scope, $http){
	 $scope.startdate ='';
     $scope.enddate ='';
	
	$scope.fillRoomList = function () {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/reservationboot/rooms'
		}).then(function successCallback(response) {
			$scope.rooms = response.data._embedded.rooms;
		});
	}
	
	$scope.getreservations = function (room) {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/reservationboot/rooms/'+room.id+'/reservations'
		}).then(function successCallback(response) {
			$scope.selectedRoom = room;
			$scope.reservations = response.data._embedded.reservations;
		});
	}

	$scope.fillRoomList();
	
	$scope.reservate = function (room) {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/reservationboot/services/room/reservate?roomid='+room.id
					+'&customerid=1&startdate='+$scope.startdate+'&enddate='+$scope.enddate
		}).then(function successCallback(response) {
			$scope.getreservations();
		});
	};
}]);