angular.module('appStartup', ['ui.router'])
    .config(function ($stateProvider, $urlRouterProvider, $locationProvider) {
        $locationProvider.html5Mode(true);
        
        $stateProvider.state('not-found', {
            url: '/404',
            template: 'error 404'
        });

        $stateProvider.state('new-startup', {
            url: "/",
            templateUrl: function ($stateParams) {
                return '/static/views/new-startup.html';
            }
        });


        $urlRouterProvider.otherwise('/index');
    })
    .controller('NewStartupFormController', function ($scope) {
        $scope.formData = {};
        $scope.wasFilled = {};
        $scope.$watch('formData', function (newValue, oldValue) {
            for (var field in $scope.formData) {
                $scope.wasFilled[field] = $scope.wasFilled[field] || $scope.formData[field];
            }
        }, true);
    });
