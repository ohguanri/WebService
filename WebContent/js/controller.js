/**
 * 
 */

var myApp = angular.module('Demo',[]);

//myApp.controller('loginController', function($scope, $http){
//	
//	$http.get('http://localhost:8080/WebService/rest/login/showUsers')
//		.then(function(response){
//			$scope.userList =  response.data;
//		});
//	
//	
//	
//});


myApp.controller('loginController', function($scope, $http){
	
	$scope.submit = function(){

		$http.post('rest/login/authenticate', $scope.userName, $scope.password)
		
		
		
//		if ($scope.userName=='admin' && $scope.password=='admin') {
//			alert('Welcome Admin..');
//		} else
//		if ($scope.userName=='user' && $scope.password=='user') {
//			alert('Welcome User..');
//		} else {
//			alert('Invalid..');
//		}
		
	}
});