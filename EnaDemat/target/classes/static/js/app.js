var app = angular.module("EnaDemat",[]);
app.controller("EnaDematController", function($scope,$http){
	$scope.utilisateurs = [];
	$http.get("/allUsers")
	.success(function(data){
		$scope.utilisateurs = data;
	});
});