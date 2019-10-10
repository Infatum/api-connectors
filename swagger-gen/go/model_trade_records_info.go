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

// Get the trade records of a order response
type TradeRecordsInfo struct {
	ClosedSize float32 `json:"closed_size,omitempty"`
	CrossSeq float32 `json:"cross_seq,omitempty"`
	ExecFee string `json:"exec_fee,omitempty"`
	ExecId string `json:"exec_id,omitempty"`
	ExecPrice string `json:"exec_price,omitempty"`
	ExecQty float32 `json:"exec_qty,omitempty"`
	ExecTime string `json:"exec_time,omitempty"`
	ExecType string `json:"exec_type,omitempty"`
	ExecValue string `json:"exec_value,omitempty"`
	FeeRate string `json:"fee_rate,omitempty"`
	LastLiquidityInd string `json:"last_liquidity_ind,omitempty"`
	LeavesQty float32 `json:"leaves_qty,omitempty"`
	NthFill float32 `json:"nth_fill,omitempty"`
	OrderId string `json:"order_id,omitempty"`
	OrderPrice string `json:"order_price,omitempty"`
	OrderQty float32 `json:"order_qty,omitempty"`
	OrderType string `json:"order_type,omitempty"`
	Side string `json:"side,omitempty"`
	Symbol string `json:"symbol,omitempty"`
	UserId float32 `json:"user_id,omitempty"`
}
