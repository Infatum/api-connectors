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
 * Get the last funding Rate
 */
@ApiModel(description = "Get the last funding Rate")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-30T17:38:14.773+08:00")
public class FundingRate {
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("funding_rate")
  private String fundingRate = null;

  @SerializedName("funding_rate_timestamp")
  private BigDecimal fundingRateTimestamp = null;

  public FundingRate symbol(String symbol) {
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

  public FundingRate fundingRate(String fundingRate) {
    this.fundingRate = fundingRate;
    return this;
  }

   /**
   * Get fundingRate
   * @return fundingRate
  **/
  @ApiModelProperty(value = "")
  public String getFundingRate() {
    return fundingRate;
  }

  public void setFundingRate(String fundingRate) {
    this.fundingRate = fundingRate;
  }

  public FundingRate fundingRateTimestamp(BigDecimal fundingRateTimestamp) {
    this.fundingRateTimestamp = fundingRateTimestamp;
    return this;
  }

   /**
   * Get fundingRateTimestamp
   * @return fundingRateTimestamp
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getFundingRateTimestamp() {
    return fundingRateTimestamp;
  }

  public void setFundingRateTimestamp(BigDecimal fundingRateTimestamp) {
    this.fundingRateTimestamp = fundingRateTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundingRate fundingRate = (FundingRate) o;
    return Objects.equals(this.symbol, fundingRate.symbol) &&
        Objects.equals(this.fundingRate, fundingRate.fundingRate) &&
        Objects.equals(this.fundingRateTimestamp, fundingRate.fundingRateTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, fundingRate, fundingRateTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundingRate {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    fundingRate: ").append(toIndentedString(fundingRate)).append("\n");
    sb.append("    fundingRateTimestamp: ").append(toIndentedString(fundingRateTimestamp)).append("\n");
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

