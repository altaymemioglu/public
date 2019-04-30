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
	$scope.allItemsSelected = false;

	$scope.selectRoom = function () {
		for (var i = 0; i < $scope.rooms.length; i++) {
			if (!$scope.rooms[i].checked) {
				$scope.allItemsSelected = false;
				return;
			}
		}
		$scope.allItemsSelected = true;
	};

	$scope.selectAll = function () {

		for (var i = 0; i < $scope.rooms.length; i++) {
			$scope.rooms[i].checked = $scope.allItemsSelected;
		}
	};

	$scope.reservate = function () {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/reservation/rest/services/reservate'
		}).then(function successCallback(response) {
			$scope.rooms = response.data;
		});
	};
}]);