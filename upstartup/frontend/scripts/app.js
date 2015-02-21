angular.module('appStartup', [])
    .controller('NewStartupFormController', function ($scope) {
        $scope.formData = {};
        $scope.wasFilled = {};
        $scope.$watch('formData', function (newValue, oldValue) {
            for (var field in $scope.formData) {
                $scope.wasFilled[field] = $scope.wasFilled[field] || $scope.formData[field];
            }
        }, true);
    });
