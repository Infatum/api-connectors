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

/**
 * LinearPrevFundingResp
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-30T17:38:14.773+08:00")
public class LinearPrevFundingResp {
  @SerializedName("exec_fee")
  private Double execFee = null;

  @SerializedName("exec_time")
  private String execTime = null;

  @SerializedName("funding_rate")
  private Double fundingRate = null;

  @SerializedName("side")
  private String side = null;

  @SerializedName("size")
  private Double size = null;

  @SerializedName("symbol")
  private String symbol = null;

  public LinearPrevFundingResp execFee(Double execFee) {
    this.execFee = execFee;
    return this;
  }

   /**
   * Get execFee
   * @return execFee
  **/
  @ApiModelProperty(value = "")
  public Double getExecFee() {
    return execFee;
  }

  public void setExecFee(Double execFee) {
    this.execFee = execFee;
  }

  public LinearPrevFundingResp execTime(String execTime) {
    this.execTime = execTime;
    return this;
  }

   /**
   * Get execTime
   * @return execTime
  **/
  @ApiModelProperty(value = "")
  public String getExecTime() {
    return execTime;
  }

  public void setExecTime(String execTime) {
    this.execTime = execTime;
  }

  public LinearPrevFundingResp fundingRate(Double fundingRate) {
    this.fundingRate = fundingRate;
    return this;
  }

   /**
   * Get fundingRate
   * @return fundingRate
  **/
  @ApiModelProperty(value = "")
  public Double getFundingRate() {
    return fundingRate;
  }

  public void setFundingRate(Double fundingRate) {
    this.fundingRate = fundingRate;
  }

  public LinearPrevFundingResp side(String side) {
    this.side = side;
    return this;
  }

   /**
   * Get side
   * @return side
  **/
  @ApiModelProperty(value = "")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public LinearPrevFundingResp size(Double size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Double getSize() {
    return size;
  }

  public void setSize(Double size) {
    this.size = size;
  }

  public LinearPrevFundingResp symbol(String symbol) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinearPrevFundingResp linearPrevFundingResp = (LinearPrevFundingResp) o;
    return Objects.equals(this.execFee, linearPrevFundingResp.execFee) &&
        Objects.equals(this.execTime, linearPrevFundingResp.execTime) &&
        Objects.equals(this.fundingRate, linearPrevFundingResp.fundingRate) &&
        Objects.equals(this.side, linearPrevFundingResp.side) &&
        Objects.equals(this.size, linearPrevFundingResp.size) &&
        Objects.equals(this.symbol, linearPrevFundingResp.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(execFee, execTime, fundingRate, side, size, symbol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinearPrevFundingResp {\n");
    
    sb.append("    execFee: ").append(toIndentedString(execFee)).append("\n");
    sb.append("    execTime: ").append(toIndentedString(execTime)).append("\n");
    sb.append("    fundingRate: ").append(toIndentedString(fundingRate)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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

