angular.module('starter.controllers', [])

.controller('AppCtrl', function($scope, $ionicModal, $timeout) {

})

.controller('PlaylistCtrl', function($scope, $stateParams, $ionicPlatform, $timeout) {

  $scope.showAlert = function () {
    CordovaCroutonsPlugin.showAlert("Sample Message...",function () {
      console.log('showAlert Success');
    },function (err) {
      console.error(err);
    });
  };
  $scope.showConfirm = function () {
    CordovaCroutonsPlugin.showConfirm("Sample Message...",function () {
      console.log('showConfirm Success');
    },function (err) {
      console.error(err);
    });
  };
  $scope.showInfo = function () {
    CordovaCroutonsPlugin.showInfo("Sample Message...",function () {
      console.log('showInfo Success');
    },function (err) {
      console.error(err);
    });
  };
  $scope.cancelAll = function () {
    CordovaCroutonsPlugin.cancelAll(function () {
      console.log('cancelAll Success');
    },function (err) {
      console.error(err);
    });
  };

});
