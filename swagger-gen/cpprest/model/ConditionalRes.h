/**
 * Bybit API
 * ## REST API for the Bybit Exchange. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.8.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/*
 * ConditionalRes.h
 *
 * Place new conditional order response
 */

#ifndef IO_SWAGGER_CLIENT_MODEL_ConditionalRes_H_
#define IO_SWAGGER_CLIENT_MODEL_ConditionalRes_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// Place new conditional order response
/// </summary>
class  ConditionalRes
    : public ModelBase
{
public:
    ConditionalRes();
    virtual ~ConditionalRes();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ConditionalRes members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getStopOrderId() const;
    bool stopOrderIdIsSet() const;
    void unsetStop_order_id();
    void setStopOrderId(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    double getUserId() const;
    bool userIdIsSet() const;
    void unsetUser_id();
    void setUserId(double value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getStopOrderStatus() const;
    bool stopOrderStatusIsSet() const;
    void unsetStop_order_status();
    void setStopOrderStatus(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getSymbol() const;
    bool symbolIsSet() const;
    void unsetSymbol();
    void setSymbol(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getSide() const;
    bool sideIsSet() const;
    void unsetSide();
    void setSide(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getOrderType() const;
    bool orderTypeIsSet() const;
    void unsetOrder_type();
    void setOrderType(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    double getPrice() const;
    bool priceIsSet() const;
    void unsetPrice();
    void setPrice(double value);
    /// <summary>
    /// 
    /// </summary>
    double getQty() const;
    bool qtyIsSet() const;
    void unsetQty();
    void setQty(double value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTimeInForce() const;
    bool timeInForceIsSet() const;
    void unsetTime_in_force();
    void setTimeInForce(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getStopOrderType() const;
    bool stopOrderTypeIsSet() const;
    void unsetStop_order_type();
    void setStopOrderType(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    double getBasePrice() const;
    bool basePriceIsSet() const;
    void unsetBase_price();
    void setBasePrice(double value);
    /// <summary>
    /// 
    /// </summary>
    double getStopPx() const;
    bool stopPxIsSet() const;
    void unsetStop_px();
    void setStopPx(double value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getOrderLinkId() const;
    bool orderLinkIdIsSet() const;
    void unsetOrder_link_id();
    void setOrderLinkId(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getCreatedAt() const;
    bool createdAtIsSet() const;
    void unsetCreated_at();
    void setCreatedAt(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getUpdatedAt() const;
    bool updatedAtIsSet() const;
    void unsetUpdated_at();
    void setUpdatedAt(utility::string_t value);

protected:
    utility::string_t m_Stop_order_id;
    bool m_Stop_order_idIsSet;
    double m_User_id;
    bool m_User_idIsSet;
    utility::string_t m_Stop_order_status;
    bool m_Stop_order_statusIsSet;
    utility::string_t m_Symbol;
    bool m_SymbolIsSet;
    utility::string_t m_Side;
    bool m_SideIsSet;
    utility::string_t m_Order_type;
    bool m_Order_typeIsSet;
    double m_Price;
    bool m_PriceIsSet;
    double m_Qty;
    bool m_QtyIsSet;
    utility::string_t m_Time_in_force;
    bool m_Time_in_forceIsSet;
    utility::string_t m_Stop_order_type;
    bool m_Stop_order_typeIsSet;
    double m_Base_price;
    bool m_Base_priceIsSet;
    double m_Stop_px;
    bool m_Stop_pxIsSet;
    utility::string_t m_Order_link_id;
    bool m_Order_link_idIsSet;
    utility::string_t m_Created_at;
    bool m_Created_atIsSet;
    utility::string_t m_Updated_at;
    bool m_Updated_atIsSet;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_MODEL_ConditionalRes_H_ */
