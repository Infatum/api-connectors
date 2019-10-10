/**
 * Bybit API
 * ## REST API for the Bybit Exchange. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.8
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.BybitApi);
  }
}(this, function(expect, BybitApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new BybitApi.OrderListBase();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('OrderListBase', function() {
    it('should create an instance of OrderListBase', function() {
      // uncomment below and update the code to test OrderListBase
      //var instance = new BybitApi.OrderListBase();
      //expect(instance).to.be.a(BybitApi.OrderListBase);
    });

    it('should have the property retCode (base name: "ret_code")', function() {
      // uncomment below and update the code to test the property retCode
      //var instance = new BybitApi.OrderListBase();
      //expect(instance).to.be();
    });

    it('should have the property retMsg (base name: "ret_msg")', function() {
      // uncomment below and update the code to test the property retMsg
      //var instance = new BybitApi.OrderListBase();
      //expect(instance).to.be();
    });

    it('should have the property extCode (base name: "ext_code")', function() {
      // uncomment below and update the code to test the property extCode
      //var instance = new BybitApi.OrderListBase();
      //expect(instance).to.be();
    });

    it('should have the property extInfo (base name: "ext_info")', function() {
      // uncomment below and update the code to test the property extInfo
      //var instance = new BybitApi.OrderListBase();
      //expect(instance).to.be();
    });

    it('should have the property result (base name: "result")', function() {
      // uncomment below and update the code to test the property result
      //var instance = new BybitApi.OrderListBase();
      //expect(instance).to.be();
    });

    it('should have the property timeNow (base name: "time_now")', function() {
      // uncomment below and update the code to test the property timeNow
      //var instance = new BybitApi.OrderListBase();
      //expect(instance).to.be();
    });

  });

}));
