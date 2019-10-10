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
    root.BybitApi.TradingStopRes = factory(root.BybitApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The TradingStopRes model module.
   * @module model/TradingStopRes
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>TradingStopRes</code>.
   * Set Trading-Stop Condition response
   * @alias module:model/TradingStopRes
   * @class
   */
  var exports = function() {
    var _this = this;































  };

  /**
   * Constructs a <code>TradingStopRes</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TradingStopRes} obj Optional instance to populate.
   * @return {module:model/TradingStopRes} The populated <code>TradingStopRes</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'Number');
      }
      if (data.hasOwnProperty('user_id')) {
        obj['user_id'] = ApiClient.convertToType(data['user_id'], 'Number');
      }
      if (data.hasOwnProperty('symbol')) {
        obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
      }
      if (data.hasOwnProperty('side')) {
        obj['side'] = ApiClient.convertToType(data['side'], 'String');
      }
      if (data.hasOwnProperty('size')) {
        obj['size'] = ApiClient.convertToType(data['size'], 'Number');
      }
      if (data.hasOwnProperty('position_value')) {
        obj['position_value'] = ApiClient.convertToType(data['position_value'], 'Number');
      }
      if (data.hasOwnProperty('entry_price')) {
        obj['entry_price'] = ApiClient.convertToType(data['entry_price'], 'Number');
      }
      if (data.hasOwnProperty('risk_id')) {
        obj['risk_id'] = ApiClient.convertToType(data['risk_id'], 'Number');
      }
      if (data.hasOwnProperty('auto_add_margin')) {
        obj['auto_add_margin'] = ApiClient.convertToType(data['auto_add_margin'], 'Number');
      }
      if (data.hasOwnProperty('leverage')) {
        obj['leverage'] = ApiClient.convertToType(data['leverage'], 'Number');
      }
      if (data.hasOwnProperty('position_margin')) {
        obj['position_margin'] = ApiClient.convertToType(data['position_margin'], 'Number');
      }
      if (data.hasOwnProperty('liq_price')) {
        obj['liq_price'] = ApiClient.convertToType(data['liq_price'], 'Number');
      }
      if (data.hasOwnProperty('bust_price')) {
        obj['bust_price'] = ApiClient.convertToType(data['bust_price'], 'Number');
      }
      if (data.hasOwnProperty('occ_closing_fee')) {
        obj['occ_closing_fee'] = ApiClient.convertToType(data['occ_closing_fee'], 'Number');
      }
      if (data.hasOwnProperty('occ_funding_fee')) {
        obj['occ_funding_fee'] = ApiClient.convertToType(data['occ_funding_fee'], 'Number');
      }
      if (data.hasOwnProperty('take_profit')) {
        obj['take_profit'] = ApiClient.convertToType(data['take_profit'], 'Number');
      }
      if (data.hasOwnProperty('stop_loss')) {
        obj['stop_loss'] = ApiClient.convertToType(data['stop_loss'], 'Number');
      }
      if (data.hasOwnProperty('trailing_stop')) {
        obj['trailing_stop'] = ApiClient.convertToType(data['trailing_stop'], 'Number');
      }
      if (data.hasOwnProperty('position_status')) {
        obj['position_status'] = ApiClient.convertToType(data['position_status'], 'String');
      }
      if (data.hasOwnProperty('deleverage_indicator')) {
        obj['deleverage_indicator'] = ApiClient.convertToType(data['deleverage_indicator'], 'Number');
      }
      if (data.hasOwnProperty('oc_calc_data')) {
        obj['oc_calc_data'] = ApiClient.convertToType(data['oc_calc_data'], 'String');
      }
      if (data.hasOwnProperty('order_margin')) {
        obj['order_margin'] = ApiClient.convertToType(data['order_margin'], 'Number');
      }
      if (data.hasOwnProperty('wallet_balance')) {
        obj['wallet_balance'] = ApiClient.convertToType(data['wallet_balance'], 'Number');
      }
      if (data.hasOwnProperty('realised_pnl')) {
        obj['realised_pnl'] = ApiClient.convertToType(data['realised_pnl'], 'Number');
      }
      if (data.hasOwnProperty('cum_realised_pnl')) {
        obj['cum_realised_pnl'] = ApiClient.convertToType(data['cum_realised_pnl'], 'Number');
      }
      if (data.hasOwnProperty('cum_commission')) {
        obj['cum_commission'] = ApiClient.convertToType(data['cum_commission'], 'Number');
      }
      if (data.hasOwnProperty('cross_seq')) {
        obj['cross_seq'] = ApiClient.convertToType(data['cross_seq'], 'Number');
      }
      if (data.hasOwnProperty('position_seq')) {
        obj['position_seq'] = ApiClient.convertToType(data['position_seq'], 'Number');
      }
      if (data.hasOwnProperty('created_at')) {
        obj['created_at'] = ApiClient.convertToType(data['created_at'], 'String');
      }
      if (data.hasOwnProperty('updated_at')) {
        obj['updated_at'] = ApiClient.convertToType(data['updated_at'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {Number} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {Number} user_id
   */
  exports.prototype['user_id'] = undefined;
  /**
   * @member {String} symbol
   */
  exports.prototype['symbol'] = undefined;
  /**
   * @member {String} side
   */
  exports.prototype['side'] = undefined;
  /**
   * @member {Number} size
   */
  exports.prototype['size'] = undefined;
  /**
   * @member {Number} position_value
   */
  exports.prototype['position_value'] = undefined;
  /**
   * @member {Number} entry_price
   */
  exports.prototype['entry_price'] = undefined;
  /**
   * @member {Number} risk_id
   */
  exports.prototype['risk_id'] = undefined;
  /**
   * @member {Number} auto_add_margin
   */
  exports.prototype['auto_add_margin'] = undefined;
  /**
   * @member {Number} leverage
   */
  exports.prototype['leverage'] = undefined;
  /**
   * @member {Number} position_margin
   */
  exports.prototype['position_margin'] = undefined;
  /**
   * @member {Number} liq_price
   */
  exports.prototype['liq_price'] = undefined;
  /**
   * @member {Number} bust_price
   */
  exports.prototype['bust_price'] = undefined;
  /**
   * @member {Number} occ_closing_fee
   */
  exports.prototype['occ_closing_fee'] = undefined;
  /**
   * @member {Number} occ_funding_fee
   */
  exports.prototype['occ_funding_fee'] = undefined;
  /**
   * @member {Number} take_profit
   */
  exports.prototype['take_profit'] = undefined;
  /**
   * @member {Number} stop_loss
   */
  exports.prototype['stop_loss'] = undefined;
  /**
   * @member {Number} trailing_stop
   */
  exports.prototype['trailing_stop'] = undefined;
  /**
   * @member {String} position_status
   */
  exports.prototype['position_status'] = undefined;
  /**
   * @member {Number} deleverage_indicator
   */
  exports.prototype['deleverage_indicator'] = undefined;
  /**
   * @member {String} oc_calc_data
   */
  exports.prototype['oc_calc_data'] = undefined;
  /**
   * @member {Number} order_margin
   */
  exports.prototype['order_margin'] = undefined;
  /**
   * @member {Number} wallet_balance
   */
  exports.prototype['wallet_balance'] = undefined;
  /**
   * @member {Number} realised_pnl
   */
  exports.prototype['realised_pnl'] = undefined;
  /**
   * @member {Number} cum_realised_pnl
   */
  exports.prototype['cum_realised_pnl'] = undefined;
  /**
   * @member {Number} cum_commission
   */
  exports.prototype['cum_commission'] = undefined;
  /**
   * @member {Number} cross_seq
   */
  exports.prototype['cross_seq'] = undefined;
  /**
   * @member {Number} position_seq
   */
  exports.prototype['position_seq'] = undefined;
  /**
   * @member {String} created_at
   */
  exports.prototype['created_at'] = undefined;
  /**
   * @member {String} updated_at
   */
  exports.prototype['updated_at'] = undefined;



  return exports;
}));


