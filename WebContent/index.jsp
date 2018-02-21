<!DOCTYPE html>
<html>
<header>
<script	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
<!-- 
<script	src="app/controller/myApp.js"></script>
<script	src="app/controller/myCtrl.js"></script> -->
</header>
<body>
<div class="container">
		<div ng-app="myApp" ng-controller="myCtrl">
		<div class="text-center alert alert-info"><h1>Spring Web Service</h1></div>
		<div class="row">
		  <div class="col-6">
			<button class="btn btn-info" ng-click="getUserList()">Get User List</button>
			<button class="btn btn-info" ng-click="getCountryList()">Get Country List</button>
			<button class="btn btn-info" ng-click="getCountryListById()">Get Country List By id</button>
				<div ng-if="data">
					<hr>
					<h4>User List</h4>
					<div class="table-responsive">
						<table class="table">
							<tr>
								<th>Id</th>
								<th>Email</th>
								<th>Pass</th>
							</tr>
							<tr ng-repeat="users in data">
								<td>{{users.userid}}</td>
								<td>{{users.email}}</td>
								<td>{{users.pass}}</td>
							</tr>
						</table>
					</div>
				</div>
				<div ng-if="country">
					<hr>
					<h4>Country List</h4>
					<div class="table-responsive">
						<table class="table">
							<tr>
								<!-- <th>Country Id</th> -->
								<th>Country Name</th>
								<th>Country Capital</th>
							</tr>
							<tr ng-repeat="countries in country">
								<!-- <td>{{countries.countryid}}</td> -->
								<td>{{countries.countryname}}</td>
								<td>{{countries.countrycapital}}</td>
							</tr>
						</table>
					</div>
				</div>
				<div ng-if="countryList">
					<hr>
					<h4>Country List By id</h4>
					<div class="table-responsive">			
						<table class="table">
							<tr>
								<th>Country Id</th>
								<th>Country Name</th>
								<th>Country Capital</th>
							</tr>
							<tr>
								<td>{{countryList.countryid}}</td>
								<td>{{countryList.countryname}}</td>
								<td>{{countryList.countrycapital}}</td>
							</tr>
						</table>
					</div>
				</div>
		  </div>
		  <div class="col-6">
		  	<form name="userForm" ng-submit="saveuser()">
		  		<div class="form-group">
					<label>User ID:</label>
   	                <input type="text" ng-model="user.userid" class="form-control">
		  		</div>
				 <div class="form-group">
					<label>User Email:</label> 
					<input type="text" ng-model="user.email" class="form-control">
		  		</div>
				<div class="form-group">
					<label>User Password:</label> 
					<input type="text" ng-model="user.pass" class="form-control">
		  		</div>
				<div class="form-group">
		  			<button class="btn btn-success" type="submit">Save</button>
		  		</div>
			</form>
		  </div>
		</div>
	</div>
 </div>
	<script type="text/javascript">
		var app = angular.module("myApp", []);
		var baseURL = "http://localhost:8080/";
		app.controller("myCtrl", function($scope, $http) {
			$scope.getUserList = function() {
				$http({
					method : "GET",
					url : baseURL+"SpringRestService/user"
				}).then(function(response) {
					$scope.data = response.data;
				});
			};

			$scope.getCountryList = function() {
				$http({
					method : "GET",
					url : baseURL+"SpringRestService/country"
				}).then(function(response) {
					$scope.country = response.data;
				});
			};

			$scope.getCountryListById = function() {

				$http({
					method : "GET",
					url : baseURL+"SpringRestService/country/1"
				}).then(function(response) {
					$scope.countryList = response.data;
				});
			};

			$scope.saveuser = function() {
				$http({
					method : "POST",
					url : baseURL+"SpringRestService/saveuser",
					data : $scope.user
				});
			};
		});
	</script>

</body>
</html>
