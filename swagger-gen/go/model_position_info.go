/*
 * Bybit API
 *
 * ## REST API for the Bybit Exchange. 
 *
 * API version: 1.0.0
 * Contact: support@bybit.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package swagger

// PositionInfo.
type PositionInfo struct {
	Id float32 `json:"id,omitempty"`
	UserId float32 `json:"user_id,omitempty"`
	RiskId float32 `json:"risk_id,omitempty"`
	Symbol string `json:"symbol,omitempty"`
	Side string `json:"side,omitempty"`
	Size float32 `json:"size,omitempty"`
	PositionValue float32 `json:"position_value,omitempty"`
	EntryPrice float32 `json:"entry_price,omitempty"`
	Leverage float32 `json:"leverage,omitempty"`
	AutoAddMargin float32 `json:"auto_add_margin,omitempty"`
	PositionMargin float32 `json:"position_margin,omitempty"`
	LiqPrice float32 `json:"liq_price,omitempty"`
	BustPrice float32 `json:"bust_price,omitempty"`
	OccClosingFee float32 `json:"occ_closing_fee,omitempty"`
	OccFundingFee float32 `json:"occ_funding_fee,omitempty"`
	TakeProfit float32 `json:"take_profit,omitempty"`
	StopLoss float32 `json:"stop_loss,omitempty"`
	TrailingStop float32 `json:"trailing_stop,omitempty"`
	PositionStatus string `json:"position_status,omitempty"`
	DeleverageIndicator string `json:"deleverage_indicator,omitempty"`
	OcCalcData string `json:"oc_calc_data,omitempty"`
	OrderMargin float32 `json:"order_margin,omitempty"`
	WalletBalance float32 `json:"wallet_balance,omitempty"`
	UnrealisedPnl float32 `json:"unrealised_pnl,omitempty"`
	RealisedPnl float32 `json:"realised_pnl,omitempty"`
	CumRealisedPnl float32 `json:"cum_realised_pnl,omitempty"`
	CumCommission float32 `json:"cum_commission,omitempty"`
	CrossSeq float32 `json:"cross_seq,omitempty"`
	PositionSeq float32 `json:"position_seq,omitempty"`
	CreatedAt string `json:"created_at,omitempty"`
	UpdatedAt string `json:"updated_at,omitempty"`
}
