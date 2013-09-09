'use strict';

angular.module('yoApp')
  .controller('MainCtrl', function ($scope, $resource) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
    var Book = $resource('./rest/books/:isbn');
    $scope.books = Book.query();
  });
