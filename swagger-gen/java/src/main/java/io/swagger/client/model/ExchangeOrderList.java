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
 * Asset Exchange Records
 */
@ApiModel(description = "Asset Exchange Records")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-30T17:38:14.773+08:00")
public class ExchangeOrderList {
  @SerializedName("from_coin")
  private String fromCoin = null;

  @SerializedName("to_coin")
  private String toCoin = null;

  @SerializedName("from_amount")
  private BigDecimal fromAmount = null;

  @SerializedName("to_amount")
  private BigDecimal toAmount = null;

  @SerializedName("exchange_rate")
  private BigDecimal exchangeRate = null;

  @SerializedName("from_fee")
  private BigDecimal fromFee = null;

  @SerializedName("created_at")
  private String createdAt = null;

  public ExchangeOrderList fromCoin(String fromCoin) {
    this.fromCoin = fromCoin;
    return this;
  }

   /**
   * Get fromCoin
   * @return fromCoin
  **/
  @ApiModelProperty(value = "")
  public String getFromCoin() {
    return fromCoin;
  }

  public void setFromCoin(String fromCoin) {
    this.fromCoin = fromCoin;
  }

  public ExchangeOrderList toCoin(String toCoin) {
    this.toCoin = toCoin;
    return this;
  }

   /**
   * Get toCoin
   * @return toCoin
  **/
  @ApiModelProperty(value = "")
  public String getToCoin() {
    return toCoin;
  }

  public void setToCoin(String toCoin) {
    this.toCoin = toCoin;
  }

  public ExchangeOrderList fromAmount(BigDecimal fromAmount) {
    this.fromAmount = fromAmount;
    return this;
  }

   /**
   * Get fromAmount
   * @return fromAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getFromAmount() {
    return fromAmount;
  }

  public void setFromAmount(BigDecimal fromAmount) {
    this.fromAmount = fromAmount;
  }

  public ExchangeOrderList toAmount(BigDecimal toAmount) {
    this.toAmount = toAmount;
    return this;
  }

   /**
   * Get toAmount
   * @return toAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getToAmount() {
    return toAmount;
  }

  public void setToAmount(BigDecimal toAmount) {
    this.toAmount = toAmount;
  }

  public ExchangeOrderList exchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * Get exchangeRate
   * @return exchangeRate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public ExchangeOrderList fromFee(BigDecimal fromFee) {
    this.fromFee = fromFee;
    return this;
  }

   /**
   * Get fromFee
   * @return fromFee
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getFromFee() {
    return fromFee;
  }

  public void setFromFee(BigDecimal fromFee) {
    this.fromFee = fromFee;
  }

  public ExchangeOrderList createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeOrderList exchangeOrderList = (ExchangeOrderList) o;
    return Objects.equals(this.fromCoin, exchangeOrderList.fromCoin) &&
        Objects.equals(this.toCoin, exchangeOrderList.toCoin) &&
        Objects.equals(this.fromAmount, exchangeOrderList.fromAmount) &&
        Objects.equals(this.toAmount, exchangeOrderList.toAmount) &&
        Objects.equals(this.exchangeRate, exchangeOrderList.exchangeRate) &&
        Objects.equals(this.fromFee, exchangeOrderList.fromFee) &&
        Objects.equals(this.createdAt, exchangeOrderList.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromCoin, toCoin, fromAmount, toAmount, exchangeRate, fromFee, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeOrderList {\n");
    
    sb.append("    fromCoin: ").append(toIndentedString(fromCoin)).append("\n");
    sb.append("    toCoin: ").append(toIndentedString(toCoin)).append("\n");
    sb.append("    fromAmount: ").append(toIndentedString(fromAmount)).append("\n");
    sb.append("    toAmount: ").append(toIndentedString(toAmount)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    fromFee: ").append(toIndentedString(fromFee)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

