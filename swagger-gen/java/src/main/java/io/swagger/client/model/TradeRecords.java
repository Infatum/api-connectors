/*
 * Bybit API
 * ## REST API for the Bybit Exchange. 
 *
 * OpenAPI spec version: 1.0.0
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
import io.swagger.client.model.TradeRecordsInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Get the trade records of a order response
 */
@ApiModel(description = "Get the trade records of a order response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-10T14:10:24.237+08:00")
public class TradeRecords {
  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("trade_list")
  private List<TradeRecordsInfo> tradeList = null;

  public TradeRecords orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public TradeRecords tradeList(List<TradeRecordsInfo> tradeList) {
    this.tradeList = tradeList;
    return this;
  }

  public TradeRecords addTradeListItem(TradeRecordsInfo tradeListItem) {
    if (this.tradeList == null) {
      this.tradeList = new ArrayList<TradeRecordsInfo>();
    }
    this.tradeList.add(tradeListItem);
    return this;
  }

   /**
   * Get tradeList
   * @return tradeList
  **/
  @ApiModelProperty(value = "")
  public List<TradeRecordsInfo> getTradeList() {
    return tradeList;
  }

  public void setTradeList(List<TradeRecordsInfo> tradeList) {
    this.tradeList = tradeList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeRecords tradeRecords = (TradeRecords) o;
    return Objects.equals(this.orderId, tradeRecords.orderId) &&
        Objects.equals(this.tradeList, tradeRecords.tradeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, tradeList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeRecords {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    tradeList: ").append(toIndentedString(tradeList)).append("\n");
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

