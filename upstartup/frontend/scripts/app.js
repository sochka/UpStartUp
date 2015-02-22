angular.module('appStartup', ['ui.router'])
    .config(function ($stateProvider, $urlRouterProvider, $locationProvider) {
        $locationProvider.html5Mode(true);

        $stateProvider.state('not-found', {
            url: '/404',
            template: 'error 404'
        });

        $stateProvider.state('list', {
            url: '/list',
            controller: 'ListController',
            templateUrl: '/static/views/list.html'
        });
        $stateProvider.state('new-startup', {
            url: "/",
            controller: "NewStartupFormController",
            templateUrl: function ($stateParams) {
                return '/static/views/new-startup.html';
            }
        });


        $urlRouterProvider.otherwise('/index');
    })
    .controller('NewStartupFormController', function ($scope, $http) {
        $scope.formData = {};
        $scope.wasFilled = {};
        $scope.$watch('formData', function (newValue, oldValue) {
            for (var field in $scope.formData) {
                $scope.wasFilled[field] = $scope.wasFilled[field] || $scope.formData[field];
            }
        }, true);

        $scope.saveData = function () {
            
            $http.put('/api/startup/add/', $scope.formData).then(function (result) {
                $scope.formData['Created At'] = (new Date()).toISOString();
                $scope.formData['Updated At'] = (new Date()).toISOString();
            }, function (error) {

            });
        }
    })
    .controller('ListController', function ($http, $scope) {
        $scope.startups = [];
        $http.get('/api/startup/').success(function (data) {
            $scope.startups = data.results;
            console.dir(data.results);
        })
    });
