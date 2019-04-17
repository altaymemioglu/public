/**
 * This JavaScript file holds the functions for reaching HotelReservation Rest
 * services from angularjs
 */

var hotelApp = angular.module("hotelApp", []);

var messageController = function($scope, $http) {
	$http({
		method : 'GET',
		url : 'http://localhost:8080/reservation/rest/services/welcome'
	}).then(function successCallback(response) {
		$scope.message = response.data;
	});
}

hotelApp.controller("messageController", messageController);

var roomController = function($scope, $http) {
	$http({
		method : 'GET',
		url : 'http://localhost:8080/reservation/rest/services/getallrooms'
	}).then(function successCallback(response) {
		$scope.rooms = response.data;
	});
		
     // This property will be bound to checkbox in table header
     $scope.allItemsSelected = false;

     // This executes when entity in table is checked
     $scope.selectRoom = function () {
         // If any entity is not checked, then uncheck the "allItemsSelected" checkbox
         for (var i = 0; i < $scope.rooms.length; i++) {
             if (!$scope.rooms[i].checked) {
                 $scope.allItemsSelected = false;
                 return;
             }
         }
         //If not the check the "allItemsSelected" checkbox
         $scope.allItemsSelected = true;
     };

     // This executes when checkbox in table header is checked
     $scope.selectAll = function () {
         // Loop through all the entities and set their isChecked property
         for (var i = 0; i < $scope.rooms.length; i++) {
             $scope.rooms[i].checked = $scope.allItemsSelected;
         }
     };

}

hotelApp.controller("roomController", roomController);