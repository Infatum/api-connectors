/*
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * OpenAPI spec version: 0.2.12
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Get the orderbook response
 */
@ApiModel(description = "Get the orderbook response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-30T17:38:14.773+08:00")
public class KlineRes {
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("interval")
  private String interval = null;

  @SerializedName("open_time")
  private BigDecimal openTime = null;

  @SerializedName("open")
  private String open = null;

  @SerializedName("high")
  private String high = null;

  @SerializedName("low")
  private String low = null;

  @SerializedName("close")
  private String close = null;

  @SerializedName("volume")
  private String volume = null;

  public KlineRes symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public KlineRes interval(String interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @ApiModelProperty(value = "")
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public KlineRes openTime(BigDecimal openTime) {
    this.openTime = openTime;
    return this;
  }

   /**
   * Get openTime
   * @return openTime
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOpenTime() {
    return openTime;
  }

  public void setOpenTime(BigDecimal openTime) {
    this.openTime = openTime;
  }

  public KlineRes open(String open) {
    this.open = open;
    return this;
  }

   /**
   * Get open
   * @return open
  **/
  @ApiModelProperty(value = "")
  public String getOpen() {
    return open;
  }

  public void setOpen(String open) {
    this.open = open;
  }

  public KlineRes high(String high) {
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  @ApiModelProperty(value = "")
  public String getHigh() {
    return high;
  }

  public void setHigh(String high) {
    this.high = high;
  }

  public KlineRes low(String low) {
    this.low = low;
    return this;
  }

   /**
   * Get low
   * @return low
  **/
  @ApiModelProperty(value = "")
  public String getLow() {
    return low;
  }

  public void setLow(String low) {
    this.low = low;
  }

  public KlineRes close(String close) {
    this.close = close;
    return this;
  }

   /**
   * Get close
   * @return close
  **/
  @ApiModelProperty(value = "")
  public String getClose() {
    return close;
  }

  public void setClose(String close) {
    this.close = close;
  }

  public KlineRes volume(String volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @ApiModelProperty(value = "")
  public String getVolume() {
    return volume;
  }

  public void setVolume(String volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KlineRes klineRes = (KlineRes) o;
    return Objects.equals(this.symbol, klineRes.symbol) &&
        Objects.equals(this.interval, klineRes.interval) &&
        Objects.equals(this.openTime, klineRes.openTime) &&
        Objects.equals(this.open, klineRes.open) &&
        Objects.equals(this.high, klineRes.high) &&
        Objects.equals(this.low, klineRes.low) &&
        Objects.equals(this.close, klineRes.close) &&
        Objects.equals(this.volume, klineRes.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, interval, openTime, open, high, low, close, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KlineRes {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    openTime: ").append(toIndentedString(openTime)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

