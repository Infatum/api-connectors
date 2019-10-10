/**
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

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Set Trading-Stop Condition response
 **/
@ApiModel(description = "Set Trading-Stop Condition response")
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

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getUserId() {
    return userId;
  }
  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSide() {
    return side;
  }
  public void setSide(String side) {
    this.side = side;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getSize() {
    return size;
  }
  public void setSize(BigDecimal size) {
    this.size = size;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPositionValue() {
    return positionValue;
  }
  public void setPositionValue(Double positionValue) {
    this.positionValue = positionValue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getEntryPrice() {
    return entryPrice;
  }
  public void setEntryPrice(Double entryPrice) {
    this.entryPrice = entryPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getRiskId() {
    return riskId;
  }
  public void setRiskId(BigDecimal riskId) {
    this.riskId = riskId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getAutoAddMargin() {
    return autoAddMargin;
  }
  public void setAutoAddMargin(Double autoAddMargin) {
    this.autoAddMargin = autoAddMargin;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLeverage() {
    return leverage;
  }
  public void setLeverage(Double leverage) {
    this.leverage = leverage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPositionMargin() {
    return positionMargin;
  }
  public void setPositionMargin(Double positionMargin) {
    this.positionMargin = positionMargin;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLiqPrice() {
    return liqPrice;
  }
  public void setLiqPrice(Double liqPrice) {
    this.liqPrice = liqPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getBustPrice() {
    return bustPrice;
  }
  public void setBustPrice(Double bustPrice) {
    this.bustPrice = bustPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getOccClosingFee() {
    return occClosingFee;
  }
  public void setOccClosingFee(Double occClosingFee) {
    this.occClosingFee = occClosingFee;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getOccFundingFee() {
    return occFundingFee;
  }
  public void setOccFundingFee(Double occFundingFee) {
    this.occFundingFee = occFundingFee;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTakeProfit() {
    return takeProfit;
  }
  public void setTakeProfit(Double takeProfit) {
    this.takeProfit = takeProfit;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getStopLoss() {
    return stopLoss;
  }
  public void setStopLoss(Double stopLoss) {
    this.stopLoss = stopLoss;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTrailingStop() {
    return trailingStop;
  }
  public void setTrailingStop(Double trailingStop) {
    this.trailingStop = trailingStop;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPositionStatus() {
    return positionStatus;
  }
  public void setPositionStatus(String positionStatus) {
    this.positionStatus = positionStatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getDeleverageIndicator() {
    return deleverageIndicator;
  }
  public void setDeleverageIndicator(BigDecimal deleverageIndicator) {
    this.deleverageIndicator = deleverageIndicator;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOcCalcData() {
    return ocCalcData;
  }
  public void setOcCalcData(String ocCalcData) {
    this.ocCalcData = ocCalcData;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getOrderMargin() {
    return orderMargin;
  }
  public void setOrderMargin(Double orderMargin) {
    this.orderMargin = orderMargin;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getWalletBalance() {
    return walletBalance;
  }
  public void setWalletBalance(Double walletBalance) {
    this.walletBalance = walletBalance;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getRealisedPnl() {
    return realisedPnl;
  }
  public void setRealisedPnl(Double realisedPnl) {
    this.realisedPnl = realisedPnl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getCumRealisedPnl() {
    return cumRealisedPnl;
  }
  public void setCumRealisedPnl(Double cumRealisedPnl) {
    this.cumRealisedPnl = cumRealisedPnl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getCumCommission() {
    return cumCommission;
  }
  public void setCumCommission(BigDecimal cumCommission) {
    this.cumCommission = cumCommission;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getCrossSeq() {
    return crossSeq;
  }
  public void setCrossSeq(BigDecimal crossSeq) {
    this.crossSeq = crossSeq;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPositionSeq() {
    return positionSeq;
  }
  public void setPositionSeq(BigDecimal positionSeq) {
    this.positionSeq = positionSeq;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradingStopRes tradingStopRes = (TradingStopRes) o;
    return (this.id == null ? tradingStopRes.id == null : this.id.equals(tradingStopRes.id)) &&
        (this.userId == null ? tradingStopRes.userId == null : this.userId.equals(tradingStopRes.userId)) &&
        (this.symbol == null ? tradingStopRes.symbol == null : this.symbol.equals(tradingStopRes.symbol)) &&
        (this.side == null ? tradingStopRes.side == null : this.side.equals(tradingStopRes.side)) &&
        (this.size == null ? tradingStopRes.size == null : this.size.equals(tradingStopRes.size)) &&
        (this.positionValue == null ? tradingStopRes.positionValue == null : this.positionValue.equals(tradingStopRes.positionValue)) &&
        (this.entryPrice == null ? tradingStopRes.entryPrice == null : this.entryPrice.equals(tradingStopRes.entryPrice)) &&
        (this.riskId == null ? tradingStopRes.riskId == null : this.riskId.equals(tradingStopRes.riskId)) &&
        (this.autoAddMargin == null ? tradingStopRes.autoAddMargin == null : this.autoAddMargin.equals(tradingStopRes.autoAddMargin)) &&
        (this.leverage == null ? tradingStopRes.leverage == null : this.leverage.equals(tradingStopRes.leverage)) &&
        (this.positionMargin == null ? tradingStopRes.positionMargin == null : this.positionMargin.equals(tradingStopRes.positionMargin)) &&
        (this.liqPrice == null ? tradingStopRes.liqPrice == null : this.liqPrice.equals(tradingStopRes.liqPrice)) &&
        (this.bustPrice == null ? tradingStopRes.bustPrice == null : this.bustPrice.equals(tradingStopRes.bustPrice)) &&
        (this.occClosingFee == null ? tradingStopRes.occClosingFee == null : this.occClosingFee.equals(tradingStopRes.occClosingFee)) &&
        (this.occFundingFee == null ? tradingStopRes.occFundingFee == null : this.occFundingFee.equals(tradingStopRes.occFundingFee)) &&
        (this.takeProfit == null ? tradingStopRes.takeProfit == null : this.takeProfit.equals(tradingStopRes.takeProfit)) &&
        (this.stopLoss == null ? tradingStopRes.stopLoss == null : this.stopLoss.equals(tradingStopRes.stopLoss)) &&
        (this.trailingStop == null ? tradingStopRes.trailingStop == null : this.trailingStop.equals(tradingStopRes.trailingStop)) &&
        (this.positionStatus == null ? tradingStopRes.positionStatus == null : this.positionStatus.equals(tradingStopRes.positionStatus)) &&
        (this.deleverageIndicator == null ? tradingStopRes.deleverageIndicator == null : this.deleverageIndicator.equals(tradingStopRes.deleverageIndicator)) &&
        (this.ocCalcData == null ? tradingStopRes.ocCalcData == null : this.ocCalcData.equals(tradingStopRes.ocCalcData)) &&
        (this.orderMargin == null ? tradingStopRes.orderMargin == null : this.orderMargin.equals(tradingStopRes.orderMargin)) &&
        (this.walletBalance == null ? tradingStopRes.walletBalance == null : this.walletBalance.equals(tradingStopRes.walletBalance)) &&
        (this.realisedPnl == null ? tradingStopRes.realisedPnl == null : this.realisedPnl.equals(tradingStopRes.realisedPnl)) &&
        (this.cumRealisedPnl == null ? tradingStopRes.cumRealisedPnl == null : this.cumRealisedPnl.equals(tradingStopRes.cumRealisedPnl)) &&
        (this.cumCommission == null ? tradingStopRes.cumCommission == null : this.cumCommission.equals(tradingStopRes.cumCommission)) &&
        (this.crossSeq == null ? tradingStopRes.crossSeq == null : this.crossSeq.equals(tradingStopRes.crossSeq)) &&
        (this.positionSeq == null ? tradingStopRes.positionSeq == null : this.positionSeq.equals(tradingStopRes.positionSeq)) &&
        (this.createdAt == null ? tradingStopRes.createdAt == null : this.createdAt.equals(tradingStopRes.createdAt)) &&
        (this.updatedAt == null ? tradingStopRes.updatedAt == null : this.updatedAt.equals(tradingStopRes.updatedAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    result = 31 * result + (this.side == null ? 0: this.side.hashCode());
    result = 31 * result + (this.size == null ? 0: this.size.hashCode());
    result = 31 * result + (this.positionValue == null ? 0: this.positionValue.hashCode());
    result = 31 * result + (this.entryPrice == null ? 0: this.entryPrice.hashCode());
    result = 31 * result + (this.riskId == null ? 0: this.riskId.hashCode());
    result = 31 * result + (this.autoAddMargin == null ? 0: this.autoAddMargin.hashCode());
    result = 31 * result + (this.leverage == null ? 0: this.leverage.hashCode());
    result = 31 * result + (this.positionMargin == null ? 0: this.positionMargin.hashCode());
    result = 31 * result + (this.liqPrice == null ? 0: this.liqPrice.hashCode());
    result = 31 * result + (this.bustPrice == null ? 0: this.bustPrice.hashCode());
    result = 31 * result + (this.occClosingFee == null ? 0: this.occClosingFee.hashCode());
    result = 31 * result + (this.occFundingFee == null ? 0: this.occFundingFee.hashCode());
    result = 31 * result + (this.takeProfit == null ? 0: this.takeProfit.hashCode());
    result = 31 * result + (this.stopLoss == null ? 0: this.stopLoss.hashCode());
    result = 31 * result + (this.trailingStop == null ? 0: this.trailingStop.hashCode());
    result = 31 * result + (this.positionStatus == null ? 0: this.positionStatus.hashCode());
    result = 31 * result + (this.deleverageIndicator == null ? 0: this.deleverageIndicator.hashCode());
    result = 31 * result + (this.ocCalcData == null ? 0: this.ocCalcData.hashCode());
    result = 31 * result + (this.orderMargin == null ? 0: this.orderMargin.hashCode());
    result = 31 * result + (this.walletBalance == null ? 0: this.walletBalance.hashCode());
    result = 31 * result + (this.realisedPnl == null ? 0: this.realisedPnl.hashCode());
    result = 31 * result + (this.cumRealisedPnl == null ? 0: this.cumRealisedPnl.hashCode());
    result = 31 * result + (this.cumCommission == null ? 0: this.cumCommission.hashCode());
    result = 31 * result + (this.crossSeq == null ? 0: this.crossSeq.hashCode());
    result = 31 * result + (this.positionSeq == null ? 0: this.positionSeq.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradingStopRes {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  positionValue: ").append(positionValue).append("\n");
    sb.append("  entryPrice: ").append(entryPrice).append("\n");
    sb.append("  riskId: ").append(riskId).append("\n");
    sb.append("  autoAddMargin: ").append(autoAddMargin).append("\n");
    sb.append("  leverage: ").append(leverage).append("\n");
    sb.append("  positionMargin: ").append(positionMargin).append("\n");
    sb.append("  liqPrice: ").append(liqPrice).append("\n");
    sb.append("  bustPrice: ").append(bustPrice).append("\n");
    sb.append("  occClosingFee: ").append(occClosingFee).append("\n");
    sb.append("  occFundingFee: ").append(occFundingFee).append("\n");
    sb.append("  takeProfit: ").append(takeProfit).append("\n");
    sb.append("  stopLoss: ").append(stopLoss).append("\n");
    sb.append("  trailingStop: ").append(trailingStop).append("\n");
    sb.append("  positionStatus: ").append(positionStatus).append("\n");
    sb.append("  deleverageIndicator: ").append(deleverageIndicator).append("\n");
    sb.append("  ocCalcData: ").append(ocCalcData).append("\n");
    sb.append("  orderMargin: ").append(orderMargin).append("\n");
    sb.append("  walletBalance: ").append(walletBalance).append("\n");
    sb.append("  realisedPnl: ").append(realisedPnl).append("\n");
    sb.append("  cumRealisedPnl: ").append(cumRealisedPnl).append("\n");
    sb.append("  cumCommission: ").append(cumCommission).append("\n");
    sb.append("  crossSeq: ").append(crossSeq).append("\n");
    sb.append("  positionSeq: ").append(positionSeq).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
