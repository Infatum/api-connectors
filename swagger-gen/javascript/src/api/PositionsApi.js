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
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.BybitApi) {
      root.BybitApi = {};
    }
    root.BybitApi.PositionsApi = factory(root.BybitApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * Positions service.
   * @module api/PositionsApi
   * @version 1.0.0
   */

  /**
   * Constructs a new PositionsApi. 
   * @alias module:api/PositionsApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the positionsChangeMargin operation.
     * @callback module:api/PositionsApi~positionsChangeMarginCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update margin.
     * @param {String} symbol Contract type which you want update its margin
     * @param {String} margin New margin you want set
     * @param {module:api/PositionsApi~positionsChangeMarginCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.positionsChangeMargin = function(symbol, margin, callback) {
      var postBody = null;

      // verify the required parameter 'symbol' is set
      if (symbol === undefined || symbol === null) {
        throw new Error("Missing the required parameter 'symbol' when calling positionsChangeMargin");
      }

      // verify the required parameter 'margin' is set
      if (margin === undefined || margin === null) {
        throw new Error("Missing the required parameter 'margin' when calling positionsChangeMargin");
      }


      var pathParams = {
      };
      var queryParams = {
        'symbol': symbol,
        'margin': margin,
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = [];
      var returnType = Object;

      return this.apiClient.callApi(
        '/position/change-position-margin', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the positionsMyPosition operation.
     * @callback module:api/PositionsApi~positionsMyPositionCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get my position list.
     * @param {module:api/PositionsApi~positionsMyPositionCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.positionsMyPosition = function(callback) {
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = [];
      var returnType = Object;

      return this.apiClient.callApi(
        '/position/list', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the positionsSaveLeverage operation.
     * @callback module:api/PositionsApi~positionsSaveLeverageCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Change user leverage.
     * @param {String} symbol A symbol which you want change its leverage
     * @param {String} leverage New leverage you want set
     * @param {module:api/PositionsApi~positionsSaveLeverageCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.positionsSaveLeverage = function(symbol, leverage, callback) {
      var postBody = null;

      // verify the required parameter 'symbol' is set
      if (symbol === undefined || symbol === null) {
        throw new Error("Missing the required parameter 'symbol' when calling positionsSaveLeverage");
      }

      // verify the required parameter 'leverage' is set
      if (leverage === undefined || leverage === null) {
        throw new Error("Missing the required parameter 'leverage' when calling positionsSaveLeverage");
      }


      var pathParams = {
      };
      var queryParams = {
        'symbol': symbol,
        'leverage': leverage,
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = [];
      var returnType = Object;

      return this.apiClient.callApi(
        '/user/leverage/save', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the positionsTradingStop operation.
     * @callback module:api/PositionsApi~positionsTradingStopCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Set Trading-Stop Condition.
     * @param {String} symbol Contract type
     * @param {Object} opts Optional parameters
     * @param {String} opts.takeProfit Not less than 0, 0 means cancel TP
     * @param {String} opts.stopLoss Not less than 0, 0 means cancel SL
     * @param {String} opts.trailingStop Not less than 0, 0 means cancel TS
     * @param {module:api/PositionsApi~positionsTradingStopCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.positionsTradingStop = function(symbol, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'symbol' is set
      if (symbol === undefined || symbol === null) {
        throw new Error("Missing the required parameter 'symbol' when calling positionsTradingStop");
      }


      var pathParams = {
      };
      var queryParams = {
        'symbol': symbol,
        'take_profit': opts['takeProfit'],
        'stop_loss': opts['stopLoss'],
        'trailing_stop': opts['trailingStop'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = [];
      var returnType = Object;

      return this.apiClient.callApi(
        '/open-api/position/trading-stop', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the positionsUserLeverage operation.
     * @callback module:api/PositionsApi~positionsUserLeverageCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get user leverage setting.
     * @param {module:api/PositionsApi~positionsUserLeverageCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.positionsUserLeverage = function(callback) {
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = [];
      var returnType = Object;

      return this.apiClient.callApi(
        '/user/leverage', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
