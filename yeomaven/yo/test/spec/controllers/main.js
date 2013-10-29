'use strict';

var $httpBackend;

describe('Controller: MainCtrl', function () {

  // load the controller's module
  beforeEach(module('yoApp'));

  var MainCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope, $httpBackend) {
    $httpBackend.whenGET('./rest/books').respond([]);
    scope = $rootScope.$new();
    MainCtrl = $controller('MainCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
})
;
