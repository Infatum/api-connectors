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
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Set Trading-Stop Condition response
 */
@ApiModel(description = "Set Trading-Stop Condition response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-27T16:42:38.839+08:00")
public class TradingStopRes {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("user_id")
  private BigDecimal userId = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("side")
  private String side = null;

  @SerializedName("size")
  private BigDecimal size = null;

  @SerializedName("position_value")
  private Double positionValue = null;

  @SerializedName("entry_price")
  private Double entryPrice = null;

  @SerializedName("risk_id")
  private BigDecimal riskId = null;

  @SerializedName("auto_add_margin")
  private Double autoAddMargin = null;

  @SerializedName("leverage")
  private Double leverage = null;

  @SerializedName("position_margin")
  private Double positionMargin = null;

  @SerializedName("liq_price")
  private Double liqPrice = null;

  @SerializedName("bust_price")
  private Double bustPrice = null;

  @SerializedName("occ_closing_fee")
  private Double occClosingFee = null;

  @SerializedName("occ_funding_fee")
  private Double occFundingFee = null;

  @SerializedName("take_profit")
  private Double takeProfit = null;

  @SerializedName("stop_loss")
  private Double stopLoss = null;

  @SerializedName("trailing_stop")
  private Double trailingStop = null;

  @SerializedName("position_status")
  private String positionStatus = null;

  @SerializedName("deleverage_indicator")
  private BigDecimal deleverageIndicator = null;

  @SerializedName("oc_calc_data")
  private String ocCalcData = null;

  @SerializedName("order_margin")
  private Double orderMargin = null;

  @SerializedName("wallet_balance")
  private Double walletBalance = null;

  @SerializedName("realised_pnl")
  private Double realisedPnl = null;

  @SerializedName("cum_realised_pnl")
  private Double cumRealisedPnl = null;

  @SerializedName("cum_commission")
  private BigDecimal cumCommission = null;

  @SerializedName("cross_seq")
  private BigDecimal crossSeq = null;

  @SerializedName("position_seq")
  private BigDecimal positionSeq = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  public TradingStopRes id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public TradingStopRes userId(BigDecimal userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUserId() {
    return userId;
  }

  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  public TradingStopRes symbol(String symbol) {
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

  public TradingStopRes side(String side) {
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

  public TradingStopRes size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public TradingStopRes positionValue(Double positionValue) {
    this.positionValue = positionValue;
    return this;
  }

   /**
   * Get positionValue
   * @return positionValue
  **/
  @ApiModelProperty(value = "")
  public Double getPositionValue() {
    return positionValue;
  }

  public void setPositionValue(Double positionValue) {
    this.positionValue = positionValue;
  }

  public TradingStopRes entryPrice(Double entryPrice) {
    this.entryPrice = entryPrice;
    return this;
  }

   /**
   * Get entryPrice
   * @return entryPrice
  **/
  @ApiModelProperty(value = "")
  public Double getEntryPrice() {
    return entryPrice;
  }

  public void setEntryPrice(Double entryPrice) {
    this.entryPrice = entryPrice;
  }

  public TradingStopRes riskId(BigDecimal riskId) {
    this.riskId = riskId;
    return this;
  }

   /**
   * Get riskId
   * @return riskId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRiskId() {
    return riskId;
  }

  public void setRiskId(BigDecimal riskId) {
    this.riskId = riskId;
  }

  public TradingStopRes autoAddMargin(Double autoAddMargin) {
    this.autoAddMargin = autoAddMargin;
    return this;
  }

   /**
   * Get autoAddMargin
   * @return autoAddMargin
  **/
  @ApiModelProperty(value = "")
  public Double getAutoAddMargin() {
    return autoAddMargin;
  }

  public void setAutoAddMargin(Double autoAddMargin) {
    this.autoAddMargin = autoAddMargin;
  }

  public TradingStopRes leverage(Double leverage) {
    this.leverage = leverage;
    return this;
  }

   /**
   * Get leverage
   * @return leverage
  **/
  @ApiModelProperty(value = "")
  public Double getLeverage() {
    return leverage;
  }

  public void setLeverage(Double leverage) {
    this.leverage = leverage;
  }

  public TradingStopRes positionMargin(Double positionMargin) {
    this.positionMargin = positionMargin;
    return this;
  }

   /**
   * Get positionMargin
   * @return positionMargin
  **/
  @ApiModelProperty(value = "")
  public Double getPositionMargin() {
    return positionMargin;
  }

  public void setPositionMargin(Double positionMargin) {
    this.positionMargin = positionMargin;
  }

  public TradingStopRes liqPrice(Double liqPrice) {
    this.liqPrice = liqPrice;
    return this;
  }

   /**
   * Get liqPrice
   * @return liqPrice
  **/
  @ApiModelProperty(value = "")
  public Double getLiqPrice() {
    return liqPrice;
  }

  public void setLiqPrice(Double liqPrice) {
    this.liqPrice = liqPrice;
  }

  public TradingStopRes bustPrice(Double bustPrice) {
    this.bustPrice = bustPrice;
    return this;
  }

   /**
   * Get bustPrice
   * @return bustPrice
  **/
  @ApiModelProperty(value = "")
  public Double getBustPrice() {
    return bustPrice;
  }

  public void setBustPrice(Double bustPrice) {
    this.bustPrice = bustPrice;
  }

  public TradingStopRes occClosingFee(Double occClosingFee) {
    this.occClosingFee = occClosingFee;
    return this;
  }

   /**
   * Get occClosingFee
   * @return occClosingFee
  **/
  @ApiModelProperty(value = "")
  public Double getOccClosingFee() {
    return occClosingFee;
  }

  public void setOccClosingFee(Double occClosingFee) {
    this.occClosingFee = occClosingFee;
  }

  public TradingStopRes occFundingFee(Double occFundingFee) {
    this.occFundingFee = occFundingFee;
    return this;
  }

   /**
   * Get occFundingFee
   * @return occFundingFee
  **/
  @ApiModelProperty(value = "")
  public Double getOccFundingFee() {
    return occFundingFee;
  }

  public void setOccFundingFee(Double occFundingFee) {
    this.occFundingFee = occFundingFee;
  }

  public TradingStopRes takeProfit(Double takeProfit) {
    this.takeProfit = takeProfit;
    return this;
  }

   /**
   * Get takeProfit
   * @return takeProfit
  **/
  @ApiModelProperty(value = "")
  public Double getTakeProfit() {
    return takeProfit;
  }

  public void setTakeProfit(Double takeProfit) {
    this.takeProfit = takeProfit;
  }

  public TradingStopRes stopLoss(Double stopLoss) {
    this.stopLoss = stopLoss;
    return this;
  }

   /**
   * Get stopLoss
   * @return stopLoss
  **/
  @ApiModelProperty(value = "")
  public Double getStopLoss() {
    return stopLoss;
  }

  public void setStopLoss(Double stopLoss) {
    this.stopLoss = stopLoss;
  }

  public TradingStopRes trailingStop(Double trailingStop) {
    this.trailingStop = trailingStop;
    return this;
  }

   /**
   * Get trailingStop
   * @return trailingStop
  **/
  @ApiModelProperty(value = "")
  public Double getTrailingStop() {
    return trailingStop;
  }

  public void setTrailingStop(Double trailingStop) {
    this.trailingStop = trailingStop;
  }

  public TradingStopRes positionStatus(String positionStatus) {
    this.positionStatus = positionStatus;
    return this;
  }

   /**
   * Get positionStatus
   * @return positionStatus
  **/
  @ApiModelProperty(value = "")
  public String getPositionStatus() {
    return positionStatus;
  }

  public void setPositionStatus(String positionStatus) {
    this.positionStatus = positionStatus;
  }

  public TradingStopRes deleverageIndicator(BigDecimal deleverageIndicator) {
    this.deleverageIndicator = deleverageIndicator;
    return this;
  }

   /**
   * Get deleverageIndicator
   * @return deleverageIndicator
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDeleverageIndicator() {
    return deleverageIndicator;
  }

  public void setDeleverageIndicator(BigDecimal deleverageIndicator) {
    this.deleverageIndicator = deleverageIndicator;
  }

  public TradingStopRes ocCalcData(String ocCalcData) {
    this.ocCalcData = ocCalcData;
    return this;
  }

   /**
   * Get ocCalcData
   * @return ocCalcData
  **/
  @ApiModelProperty(value = "")
  public String getOcCalcData() {
    return ocCalcData;
  }

  public void setOcCalcData(String ocCalcData) {
    this.ocCalcData = ocCalcData;
  }

  public TradingStopRes orderMargin(Double orderMargin) {
    this.orderMargin = orderMargin;
    return this;
  }

   /**
   * Get orderMargin
   * @return orderMargin
  **/
  @ApiModelProperty(value = "")
  public Double getOrderMargin() {
    return orderMargin;
  }

  public void setOrderMargin(Double orderMargin) {
    this.orderMargin = orderMargin;
  }

  public TradingStopRes walletBalance(Double walletBalance) {
    this.walletBalance = walletBalance;
    return this;
  }

   /**
   * Get walletBalance
   * @return walletBalance
  **/
  @ApiModelProperty(value = "")
  public Double getWalletBalance() {
    return walletBalance;
  }

  public void setWalletBalance(Double walletBalance) {
    this.walletBalance = walletBalance;
  }

  public TradingStopRes realisedPnl(Double realisedPnl) {
    this.realisedPnl = realisedPnl;
    return this;
  }

   /**
   * Get realisedPnl
   * @return realisedPnl
  **/
  @ApiModelProperty(value = "")
  public Double getRealisedPnl() {
    return realisedPnl;
  }

  public void setRealisedPnl(Double realisedPnl) {
    this.realisedPnl = realisedPnl;
  }

  public TradingStopRes cumRealisedPnl(Double cumRealisedPnl) {
    this.cumRealisedPnl = cumRealisedPnl;
    return this;
  }

   /**
   * Get cumRealisedPnl
   * @return cumRealisedPnl
  **/
  @ApiModelProperty(value = "")
  public Double getCumRealisedPnl() {
    return cumRealisedPnl;
  }

  public void setCumRealisedPnl(Double cumRealisedPnl) {
    this.cumRealisedPnl = cumRealisedPnl;
  }

  public TradingStopRes cumCommission(BigDecimal cumCommission) {
    this.cumCommission = cumCommission;
    return this;
  }

   /**
   * Get cumCommission
   * @return cumCommission
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCumCommission() {
    return cumCommission;
  }

  public void setCumCommission(BigDecimal cumCommission) {
    this.cumCommission = cumCommission;
  }

  public TradingStopRes crossSeq(BigDecimal crossSeq) {
    this.crossSeq = crossSeq;
    return this;
  }

   /**
   * Get crossSeq
   * @return crossSeq
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCrossSeq() {
    return crossSeq;
  }

  public void setCrossSeq(BigDecimal crossSeq) {
    this.crossSeq = crossSeq;
  }

  public TradingStopRes positionSeq(BigDecimal positionSeq) {
    this.positionSeq = positionSeq;
    return this;
  }

   /**
   * Get positionSeq
   * @return positionSeq
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPositionSeq() {
    return positionSeq;
  }

  public void setPositionSeq(BigDecimal positionSeq) {
    this.positionSeq = positionSeq;
  }

  public TradingStopRes createdAt(String createdAt) {
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

  public TradingStopRes updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradingStopRes tradingStopRes = (TradingStopRes) o;
    return Objects.equals(this.id, tradingStopRes.id) &&
        Objects.equals(this.userId, tradingStopRes.userId) &&
        Objects.equals(this.symbol, tradingStopRes.symbol) &&
        Objects.equals(this.side, tradingStopRes.side) &&
        Objects.equals(this.size, tradingStopRes.size) &&
        Objects.equals(this.positionValue, tradingStopRes.positionValue) &&
        Objects.equals(this.entryPrice, tradingStopRes.entryPrice) &&
        Objects.equals(this.riskId, tradingStopRes.riskId) &&
        Objects.equals(this.autoAddMargin, tradingStopRes.autoAddMargin) &&
        Objects.equals(this.leverage, tradingStopRes.leverage) &&
        Objects.equals(this.positionMargin, tradingStopRes.positionMargin) &&
        Objects.equals(this.liqPrice, tradingStopRes.liqPrice) &&
        Objects.equals(this.bustPrice, tradingStopRes.bustPrice) &&
        Objects.equals(this.occClosingFee, tradingStopRes.occClosingFee) &&
        Objects.equals(this.occFundingFee, tradingStopRes.occFundingFee) &&
        Objects.equals(this.takeProfit, tradingStopRes.takeProfit) &&
        Objects.equals(this.stopLoss, tradingStopRes.stopLoss) &&
        Objects.equals(this.trailingStop, tradingStopRes.trailingStop) &&
        Objects.equals(this.positionStatus, tradingStopRes.positionStatus) &&
        Objects.equals(this.deleverageIndicator, tradingStopRes.deleverageIndicator) &&
        Objects.equals(this.ocCalcData, tradingStopRes.ocCalcData) &&
        Objects.equals(this.orderMargin, tradingStopRes.orderMargin) &&
        Objects.equals(this.walletBalance, tradingStopRes.walletBalance) &&
        Objects.equals(this.realisedPnl, tradingStopRes.realisedPnl) &&
        Objects.equals(this.cumRealisedPnl, tradingStopRes.cumRealisedPnl) &&
        Objects.equals(this.cumCommission, tradingStopRes.cumCommission) &&
        Objects.equals(this.crossSeq, tradingStopRes.crossSeq) &&
        Objects.equals(this.positionSeq, tradingStopRes.positionSeq) &&
        Objects.equals(this.createdAt, tradingStopRes.createdAt) &&
        Objects.equals(this.updatedAt, tradingStopRes.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, symbol, side, size, positionValue, entryPrice, riskId, autoAddMargin, leverage, positionMargin, liqPrice, bustPrice, occClosingFee, occFundingFee, takeProfit, stopLoss, trailingStop, positionStatus, deleverageIndicator, ocCalcData, orderMargin, walletBalance, realisedPnl, cumRealisedPnl, cumCommission, crossSeq, positionSeq, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradingStopRes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    positionValue: ").append(toIndentedString(positionValue)).append("\n");
    sb.append("    entryPrice: ").append(toIndentedString(entryPrice)).append("\n");
    sb.append("    riskId: ").append(toIndentedString(riskId)).append("\n");
    sb.append("    autoAddMargin: ").append(toIndentedString(autoAddMargin)).append("\n");
    sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
    sb.append("    positionMargin: ").append(toIndentedString(positionMargin)).append("\n");
    sb.append("    liqPrice: ").append(toIndentedString(liqPrice)).append("\n");
    sb.append("    bustPrice: ").append(toIndentedString(bustPrice)).append("\n");
    sb.append("    occClosingFee: ").append(toIndentedString(occClosingFee)).append("\n");
    sb.append("    occFundingFee: ").append(toIndentedString(occFundingFee)).append("\n");
    sb.append("    takeProfit: ").append(toIndentedString(takeProfit)).append("\n");
    sb.append("    stopLoss: ").append(toIndentedString(stopLoss)).append("\n");
    sb.append("    trailingStop: ").append(toIndentedString(trailingStop)).append("\n");
    sb.append("    positionStatus: ").append(toIndentedString(positionStatus)).append("\n");
    sb.append("    deleverageIndicator: ").append(toIndentedString(deleverageIndicator)).append("\n");
    sb.append("    ocCalcData: ").append(toIndentedString(ocCalcData)).append("\n");
    sb.append("    orderMargin: ").append(toIndentedString(orderMargin)).append("\n");
    sb.append("    walletBalance: ").append(toIndentedString(walletBalance)).append("\n");
    sb.append("    realisedPnl: ").append(toIndentedString(realisedPnl)).append("\n");
    sb.append("    cumRealisedPnl: ").append(toIndentedString(cumRealisedPnl)).append("\n");
    sb.append("    cumCommission: ").append(toIndentedString(cumCommission)).append("\n");
    sb.append("    crossSeq: ").append(toIndentedString(crossSeq)).append("\n");
    sb.append("    positionSeq: ").append(toIndentedString(positionSeq)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

