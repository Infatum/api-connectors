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
    instance = new BybitApi.ConditionalRes();
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

  describe('ConditionalRes', function() {
    it('should create an instance of ConditionalRes', function() {
      // uncomment below and update the code to test ConditionalRes
      //var instance = new BybitApi.ConditionalRes();
      //expect(instance).to.be.a(BybitApi.ConditionalRes);
    });

    it('should have the property stopOrderId (base name: "stop_order_id")', function() {
      // uncomment below and update the code to test the property stopOrderId
      //var instance = new BybitApi.ConditionalRes();
      //expect(instance).to.be();
    });

    it('should have the property userId (base name: "user_id")', function() {
      // uncomment below and update the code to test the property userId
      //var instance = new BybitApi.ConditionalRes();
      //expect(instance).to.be();
    });

    it('should have the property stopOrderStatus (base name: "stop_order_status")', function() {
      // uncomment below and update the code to test the property stopOrderStatus
      //var instance = new BybitApi.ConditionalRes();
      //expect(instance).to.be();
    });

    it('should have the property symbol (base name: "symbol")', function() {
      // uncomment below and update the code to test the property symbol
      //var instance = new BybitApi.ConditionalRes();
      //expect(instance).to.be();
    });

    it('should have the property side (base name: "side")', function() {
      // uncomment below and update the code to test the property side
      //var instance = new BybitApi.ConditionalRes();
      //expect(instance).to.be();
    });

    it('should have the property orderType (base name: "order_type")', function() {
      // uncomment below and update the code to test the property orderType
      //var instance = new BybitApi.ConditionalRes();
      //expect(instance).to.be();
    });

    it('should have the property price (base name: "price")', function() {
      // uncomment below and update the code to test the property price
      //var instance = new BybitApi.ConditionalRes();
      //expect(instance).to.be();
    });

    it('should have the property qty (base name: "qty")', function() {
      // uncomment below and update the code to test the property qty
      //var instance = new BybitApi.ConditionalRes();
      //expect(instance).to.be();
    });

    it('should have the property timeInForce (base name: "time_in_force")', function() {
      // uncomment below and update the code to test the property timeInForce
      //var instance = new BybitApi.ConditionalRes();
      //expect(instance).to.be();
    });

    it('should have the property stopOrderType (base name: "stop_order_type")', function() {
      // uncomment below and update the code to test the property stopOrderType
      //var instance = new BybitApi.ConditionalRes();
      //expect(instance).to.be();
    });

    it('should have the property basePrice (base name: "base_price")', function() {
      // uncomment below and update the code to test the property basePrice
      //var instance = new BybitApi.ConditionalRes();
      //expect(instance).to.be();
    });

    it('should have the property stopPx (base name: "stop_px")', function() {
      // uncomment below and update the code to test the property stopPx
      //var instance = new BybitApi.ConditionalRes();
      //expect(instance).to.be();
    });

    it('should have the property orderLinkId (base name: "order_link_id")', function() {
      // uncomment below and update the code to test the property orderLinkId
      //var instance = new BybitApi.ConditionalRes();
      //expect(instance).to.be();
    });

    it('should have the property createdAt (base name: "created_at")', function() {
      // uncomment below and update the code to test the property createdAt
      //var instance = new BybitApi.ConditionalRes();
      //expect(instance).to.be();
    });

    it('should have the property updatedAt (base name: "updated_at")', function() {
      // uncomment below and update the code to test the property updatedAt
      //var instance = new BybitApi.ConditionalRes();
      //expect(instance).to.be();
    });

  });

}));
