var app = angular.module("hotel", ["ngRoute"]);

app.config(function($routeProvider) {
    $routeProvider
    .when("/reservation", {
        templateUrl : "reservation",
        controller : "reservationCtrl"
    })
    .when("/customer", {
        templateUrl : "customer",
        controller : "customerCtrl"
    })
    .when("/checkin", {
        templateUrl : "checkin",
        controller : "checkinCtrl"
    })
    .when("/checkout", {
        templateUrl : "checkout",
        controller : "checkoutCtrl"
    })
    .when("/help", {
        templateUrl : "help",
        controller : "helpCtrl"
    })
    ;
});

app.controller('customerCtrl', function ($scope,$http) {});
app.controller('checkinCtrl', function ($scope,$http) {});
app.controller('checkoutCtrl', function ($scope,$http) {});
app.controller('helpCtrl', function ($scope,$http) {});

app.controller('reservationCtrl', function ($scope,$http) {

	$http({
		method : 'GET',
		url : 'http://localhost:8080/reservation/rest/services/getallrooms'
	}).then(function successCallback(response) {
		$scope.rooms = response.data;
	});
		
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
});
