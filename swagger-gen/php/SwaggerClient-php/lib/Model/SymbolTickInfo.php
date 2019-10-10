<?php
/**
 * SymbolTickInfo
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Bybit API
 *
 * ## REST API for the Bybit Exchange.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.8
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
use \Swagger\Client\ObjectSerializer;

/**
 * SymbolTickInfo Class Doc Comment
 *
 * @category Class
 * @description Get the orderbook response
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class SymbolTickInfo implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'SymbolTickInfo';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'symbol' => 'string',
        'bid_price' => 'string',
        'ask_price' => 'string',
        'last_price' => 'string',
        'last_tick_direction' => 'string',
        'prev_price_24h' => 'string',
        'price_24h_pcnt' => 'string',
        'high_price_24h' => 'string',
        'low_price_24h' => 'string',
        'prev_price_1h' => 'string',
        'price_1h_pcnt' => 'string',
        'mark_price' => 'string',
        'index_price' => 'string',
        'open_interest' => 'float',
        'open_value' => 'string',
        'total_turnover' => 'string',
        'turnover_24h' => 'string',
        'total_volume' => 'float',
        'volume_24h' => 'float',
        'funding_rate' => 'string',
        'predicted_funding_rate' => 'string',
        'next_funding_time' => 'string',
        'countdown_hour' => 'float'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'symbol' => null,
        'bid_price' => null,
        'ask_price' => null,
        'last_price' => null,
        'last_tick_direction' => null,
        'prev_price_24h' => null,
        'price_24h_pcnt' => null,
        'high_price_24h' => null,
        'low_price_24h' => null,
        'prev_price_1h' => null,
        'price_1h_pcnt' => null,
        'mark_price' => null,
        'index_price' => null,
        'open_interest' => 'int32',
        'open_value' => null,
        'total_turnover' => null,
        'turnover_24h' => null,
        'total_volume' => 'int64',
        'volume_24h' => 'int64',
        'funding_rate' => null,
        'predicted_funding_rate' => null,
        'next_funding_time' => null,
        'countdown_hour' => 'int32'
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'symbol' => 'symbol',
        'bid_price' => 'bid_price',
        'ask_price' => 'ask_price',
        'last_price' => 'last_price',
        'last_tick_direction' => 'last_tick_direction',
        'prev_price_24h' => 'prev_price_24h',
        'price_24h_pcnt' => 'price_24h_pcnt',
        'high_price_24h' => 'high_price_24h',
        'low_price_24h' => 'low_price_24h',
        'prev_price_1h' => 'prev_price_1h',
        'price_1h_pcnt' => 'price_1h_pcnt',
        'mark_price' => 'mark_price',
        'index_price' => 'index_price',
        'open_interest' => 'open_interest',
        'open_value' => 'open_value',
        'total_turnover' => 'total_turnover',
        'turnover_24h' => 'turnover_24h',
        'total_volume' => 'total_volume',
        'volume_24h' => 'volume_24h',
        'funding_rate' => 'funding_rate',
        'predicted_funding_rate' => 'predicted_funding_rate',
        'next_funding_time' => 'next_funding_time',
        'countdown_hour' => 'countdown_hour'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'symbol' => 'setSymbol',
        'bid_price' => 'setBidPrice',
        'ask_price' => 'setAskPrice',
        'last_price' => 'setLastPrice',
        'last_tick_direction' => 'setLastTickDirection',
        'prev_price_24h' => 'setPrevPrice24h',
        'price_24h_pcnt' => 'setPrice24hPcnt',
        'high_price_24h' => 'setHighPrice24h',
        'low_price_24h' => 'setLowPrice24h',
        'prev_price_1h' => 'setPrevPrice1h',
        'price_1h_pcnt' => 'setPrice1hPcnt',
        'mark_price' => 'setMarkPrice',
        'index_price' => 'setIndexPrice',
        'open_interest' => 'setOpenInterest',
        'open_value' => 'setOpenValue',
        'total_turnover' => 'setTotalTurnover',
        'turnover_24h' => 'setTurnover24h',
        'total_volume' => 'setTotalVolume',
        'volume_24h' => 'setVolume24h',
        'funding_rate' => 'setFundingRate',
        'predicted_funding_rate' => 'setPredictedFundingRate',
        'next_funding_time' => 'setNextFundingTime',
        'countdown_hour' => 'setCountdownHour'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'symbol' => 'getSymbol',
        'bid_price' => 'getBidPrice',
        'ask_price' => 'getAskPrice',
        'last_price' => 'getLastPrice',
        'last_tick_direction' => 'getLastTickDirection',
        'prev_price_24h' => 'getPrevPrice24h',
        'price_24h_pcnt' => 'getPrice24hPcnt',
        'high_price_24h' => 'getHighPrice24h',
        'low_price_24h' => 'getLowPrice24h',
        'prev_price_1h' => 'getPrevPrice1h',
        'price_1h_pcnt' => 'getPrice1hPcnt',
        'mark_price' => 'getMarkPrice',
        'index_price' => 'getIndexPrice',
        'open_interest' => 'getOpenInterest',
        'open_value' => 'getOpenValue',
        'total_turnover' => 'getTotalTurnover',
        'turnover_24h' => 'getTurnover24h',
        'total_volume' => 'getTotalVolume',
        'volume_24h' => 'getVolume24h',
        'funding_rate' => 'getFundingRate',
        'predicted_funding_rate' => 'getPredictedFundingRate',
        'next_funding_time' => 'getNextFundingTime',
        'countdown_hour' => 'getCountdownHour'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$swaggerModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['symbol'] = isset($data['symbol']) ? $data['symbol'] : null;
        $this->container['bid_price'] = isset($data['bid_price']) ? $data['bid_price'] : null;
        $this->container['ask_price'] = isset($data['ask_price']) ? $data['ask_price'] : null;
        $this->container['last_price'] = isset($data['last_price']) ? $data['last_price'] : null;
        $this->container['last_tick_direction'] = isset($data['last_tick_direction']) ? $data['last_tick_direction'] : null;
        $this->container['prev_price_24h'] = isset($data['prev_price_24h']) ? $data['prev_price_24h'] : null;
        $this->container['price_24h_pcnt'] = isset($data['price_24h_pcnt']) ? $data['price_24h_pcnt'] : null;
        $this->container['high_price_24h'] = isset($data['high_price_24h']) ? $data['high_price_24h'] : null;
        $this->container['low_price_24h'] = isset($data['low_price_24h']) ? $data['low_price_24h'] : null;
        $this->container['prev_price_1h'] = isset($data['prev_price_1h']) ? $data['prev_price_1h'] : null;
        $this->container['price_1h_pcnt'] = isset($data['price_1h_pcnt']) ? $data['price_1h_pcnt'] : null;
        $this->container['mark_price'] = isset($data['mark_price']) ? $data['mark_price'] : null;
        $this->container['index_price'] = isset($data['index_price']) ? $data['index_price'] : null;
        $this->container['open_interest'] = isset($data['open_interest']) ? $data['open_interest'] : null;
        $this->container['open_value'] = isset($data['open_value']) ? $data['open_value'] : null;
        $this->container['total_turnover'] = isset($data['total_turnover']) ? $data['total_turnover'] : null;
        $this->container['turnover_24h'] = isset($data['turnover_24h']) ? $data['turnover_24h'] : null;
        $this->container['total_volume'] = isset($data['total_volume']) ? $data['total_volume'] : null;
        $this->container['volume_24h'] = isset($data['volume_24h']) ? $data['volume_24h'] : null;
        $this->container['funding_rate'] = isset($data['funding_rate']) ? $data['funding_rate'] : null;
        $this->container['predicted_funding_rate'] = isset($data['predicted_funding_rate']) ? $data['predicted_funding_rate'] : null;
        $this->container['next_funding_time'] = isset($data['next_funding_time']) ? $data['next_funding_time'] : null;
        $this->container['countdown_hour'] = isset($data['countdown_hour']) ? $data['countdown_hour'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets symbol
     *
     * @return string
     */
    public function getSymbol()
    {
        return $this->container['symbol'];
    }

    /**
     * Sets symbol
     *
     * @param string $symbol symbol
     *
     * @return $this
     */
    public function setSymbol($symbol)
    {
        $this->container['symbol'] = $symbol;

        return $this;
    }

    /**
     * Gets bid_price
     *
     * @return string
     */
    public function getBidPrice()
    {
        return $this->container['bid_price'];
    }

    /**
     * Sets bid_price
     *
     * @param string $bid_price bid_price
     *
     * @return $this
     */
    public function setBidPrice($bid_price)
    {
        $this->container['bid_price'] = $bid_price;

        return $this;
    }

    /**
     * Gets ask_price
     *
     * @return string
     */
    public function getAskPrice()
    {
        return $this->container['ask_price'];
    }

    /**
     * Sets ask_price
     *
     * @param string $ask_price ask_price
     *
     * @return $this
     */
    public function setAskPrice($ask_price)
    {
        $this->container['ask_price'] = $ask_price;

        return $this;
    }

    /**
     * Gets last_price
     *
     * @return string
     */
    public function getLastPrice()
    {
        return $this->container['last_price'];
    }

    /**
     * Sets last_price
     *
     * @param string $last_price last_price
     *
     * @return $this
     */
    public function setLastPrice($last_price)
    {
        $this->container['last_price'] = $last_price;

        return $this;
    }

    /**
     * Gets last_tick_direction
     *
     * @return string
     */
    public function getLastTickDirection()
    {
        return $this->container['last_tick_direction'];
    }

    /**
     * Sets last_tick_direction
     *
     * @param string $last_tick_direction last_tick_direction
     *
     * @return $this
     */
    public function setLastTickDirection($last_tick_direction)
    {
        $this->container['last_tick_direction'] = $last_tick_direction;

        return $this;
    }

    /**
     * Gets prev_price_24h
     *
     * @return string
     */
    public function getPrevPrice24h()
    {
        return $this->container['prev_price_24h'];
    }

    /**
     * Sets prev_price_24h
     *
     * @param string $prev_price_24h prev_price_24h
     *
     * @return $this
     */
    public function setPrevPrice24h($prev_price_24h)
    {
        $this->container['prev_price_24h'] = $prev_price_24h;

        return $this;
    }

    /**
     * Gets price_24h_pcnt
     *
     * @return string
     */
    public function getPrice24hPcnt()
    {
        return $this->container['price_24h_pcnt'];
    }

    /**
     * Sets price_24h_pcnt
     *
     * @param string $price_24h_pcnt price_24h_pcnt
     *
     * @return $this
     */
    public function setPrice24hPcnt($price_24h_pcnt)
    {
        $this->container['price_24h_pcnt'] = $price_24h_pcnt;

        return $this;
    }

    /**
     * Gets high_price_24h
     *
     * @return string
     */
    public function getHighPrice24h()
    {
        return $this->container['high_price_24h'];
    }

    /**
     * Sets high_price_24h
     *
     * @param string $high_price_24h high_price_24h
     *
     * @return $this
     */
    public function setHighPrice24h($high_price_24h)
    {
        $this->container['high_price_24h'] = $high_price_24h;

        return $this;
    }

    /**
     * Gets low_price_24h
     *
     * @return string
     */
    public function getLowPrice24h()
    {
        return $this->container['low_price_24h'];
    }

    /**
     * Sets low_price_24h
     *
     * @param string $low_price_24h low_price_24h
     *
     * @return $this
     */
    public function setLowPrice24h($low_price_24h)
    {
        $this->container['low_price_24h'] = $low_price_24h;

        return $this;
    }

    /**
     * Gets prev_price_1h
     *
     * @return string
     */
    public function getPrevPrice1h()
    {
        return $this->container['prev_price_1h'];
    }

    /**
     * Sets prev_price_1h
     *
     * @param string $prev_price_1h prev_price_1h
     *
     * @return $this
     */
    public function setPrevPrice1h($prev_price_1h)
    {
        $this->container['prev_price_1h'] = $prev_price_1h;

        return $this;
    }

    /**
     * Gets price_1h_pcnt
     *
     * @return string
     */
    public function getPrice1hPcnt()
    {
        return $this->container['price_1h_pcnt'];
    }

    /**
     * Sets price_1h_pcnt
     *
     * @param string $price_1h_pcnt price_1h_pcnt
     *
     * @return $this
     */
    public function setPrice1hPcnt($price_1h_pcnt)
    {
        $this->container['price_1h_pcnt'] = $price_1h_pcnt;

        return $this;
    }

    /**
     * Gets mark_price
     *
     * @return string
     */
    public function getMarkPrice()
    {
        return $this->container['mark_price'];
    }

    /**
     * Sets mark_price
     *
     * @param string $mark_price mark_price
     *
     * @return $this
     */
    public function setMarkPrice($mark_price)
    {
        $this->container['mark_price'] = $mark_price;

        return $this;
    }

    /**
     * Gets index_price
     *
     * @return string
     */
    public function getIndexPrice()
    {
        return $this->container['index_price'];
    }

    /**
     * Sets index_price
     *
     * @param string $index_price index_price
     *
     * @return $this
     */
    public function setIndexPrice($index_price)
    {
        $this->container['index_price'] = $index_price;

        return $this;
    }

    /**
     * Gets open_interest
     *
     * @return float
     */
    public function getOpenInterest()
    {
        return $this->container['open_interest'];
    }

    /**
     * Sets open_interest
     *
     * @param float $open_interest open_interest
     *
     * @return $this
     */
    public function setOpenInterest($open_interest)
    {
        $this->container['open_interest'] = $open_interest;

        return $this;
    }

    /**
     * Gets open_value
     *
     * @return string
     */
    public function getOpenValue()
    {
        return $this->container['open_value'];
    }

    /**
     * Sets open_value
     *
     * @param string $open_value open_value
     *
     * @return $this
     */
    public function setOpenValue($open_value)
    {
        $this->container['open_value'] = $open_value;

        return $this;
    }

    /**
     * Gets total_turnover
     *
     * @return string
     */
    public function getTotalTurnover()
    {
        return $this->container['total_turnover'];
    }

    /**
     * Sets total_turnover
     *
     * @param string $total_turnover total_turnover
     *
     * @return $this
     */
    public function setTotalTurnover($total_turnover)
    {
        $this->container['total_turnover'] = $total_turnover;

        return $this;
    }

    /**
     * Gets turnover_24h
     *
     * @return string
     */
    public function getTurnover24h()
    {
        return $this->container['turnover_24h'];
    }

    /**
     * Sets turnover_24h
     *
     * @param string $turnover_24h turnover_24h
     *
     * @return $this
     */
    public function setTurnover24h($turnover_24h)
    {
        $this->container['turnover_24h'] = $turnover_24h;

        return $this;
    }

    /**
     * Gets total_volume
     *
     * @return float
     */
    public function getTotalVolume()
    {
        return $this->container['total_volume'];
    }

    /**
     * Sets total_volume
     *
     * @param float $total_volume total_volume
     *
     * @return $this
     */
    public function setTotalVolume($total_volume)
    {
        $this->container['total_volume'] = $total_volume;

        return $this;
    }

    /**
     * Gets volume_24h
     *
     * @return float
     */
    public function getVolume24h()
    {
        return $this->container['volume_24h'];
    }

    /**
     * Sets volume_24h
     *
     * @param float $volume_24h volume_24h
     *
     * @return $this
     */
    public function setVolume24h($volume_24h)
    {
        $this->container['volume_24h'] = $volume_24h;

        return $this;
    }

    /**
     * Gets funding_rate
     *
     * @return string
     */
    public function getFundingRate()
    {
        return $this->container['funding_rate'];
    }

    /**
     * Sets funding_rate
     *
     * @param string $funding_rate funding_rate
     *
     * @return $this
     */
    public function setFundingRate($funding_rate)
    {
        $this->container['funding_rate'] = $funding_rate;

        return $this;
    }

    /**
     * Gets predicted_funding_rate
     *
     * @return string
     */
    public function getPredictedFundingRate()
    {
        return $this->container['predicted_funding_rate'];
    }

    /**
     * Sets predicted_funding_rate
     *
     * @param string $predicted_funding_rate predicted_funding_rate
     *
     * @return $this
     */
    public function setPredictedFundingRate($predicted_funding_rate)
    {
        $this->container['predicted_funding_rate'] = $predicted_funding_rate;

        return $this;
    }

    /**
     * Gets next_funding_time
     *
     * @return string
     */
    public function getNextFundingTime()
    {
        return $this->container['next_funding_time'];
    }

    /**
     * Sets next_funding_time
     *
     * @param string $next_funding_time next_funding_time
     *
     * @return $this
     */
    public function setNextFundingTime($next_funding_time)
    {
        $this->container['next_funding_time'] = $next_funding_time;

        return $this;
    }

    /**
     * Gets countdown_hour
     *
     * @return float
     */
    public function getCountdownHour()
    {
        return $this->container['countdown_hour'];
    }

    /**
     * Sets countdown_hour
     *
     * @param float $countdown_hour countdown_hour
     *
     * @return $this
     */
    public function setCountdownHour($countdown_hour)
    {
        $this->container['countdown_hour'] = $countdown_hour;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


