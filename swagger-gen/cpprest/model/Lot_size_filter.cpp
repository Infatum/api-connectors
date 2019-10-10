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



#include "Lot_size_filter.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Lot_size_filter::Lot_size_filter()
{
    m_Min_trading_qtyIsSet = false;
    m_Max_trading_qtyIsSet = false;
    m_Qty_stepIsSet = false;
}

Lot_size_filter::~Lot_size_filter()
{
}

void Lot_size_filter::validate()
{
    // TODO: implement validation
}

web::json::value Lot_size_filter::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Min_trading_qtyIsSet)
    {
        val[utility::conversions::to_string_t("min_trading_qty")] = ModelBase::toJson(m_Min_trading_qty);
    }
    if(m_Max_trading_qtyIsSet)
    {
        val[utility::conversions::to_string_t("max_trading_qty")] = ModelBase::toJson(m_Max_trading_qty);
    }
    if(m_Qty_stepIsSet)
    {
        val[utility::conversions::to_string_t("qty_step")] = ModelBase::toJson(m_Qty_step);
    }

    return val;
}

void Lot_size_filter::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("min_trading_qty")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("min_trading_qty")];
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Object> newItem(nullptr);
            newItem->fromJson(fieldValue);
            setMinTradingQty( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("max_trading_qty")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("max_trading_qty")];
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Object> newItem(nullptr);
            newItem->fromJson(fieldValue);
            setMaxTradingQty( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("qty_step")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("qty_step")];
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Object> newItem(nullptr);
            newItem->fromJson(fieldValue);
            setQtyStep( newItem );
        }
    }
}

void Lot_size_filter::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Min_trading_qtyIsSet)
    {
        if (m_Min_trading_qty.get())
        {
            m_Min_trading_qty->toMultipart(multipart, utility::conversions::to_string_t("min_trading_qty."));
        }
        
    }
    if(m_Max_trading_qtyIsSet)
    {
        if (m_Max_trading_qty.get())
        {
            m_Max_trading_qty->toMultipart(multipart, utility::conversions::to_string_t("max_trading_qty."));
        }
        
    }
    if(m_Qty_stepIsSet)
    {
        if (m_Qty_step.get())
        {
            m_Qty_step->toMultipart(multipart, utility::conversions::to_string_t("qty_step."));
        }
        
    }
}

void Lot_size_filter::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("min_trading_qty")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("min_trading_qty")))
        {
            std::shared_ptr<Object> newItem(nullptr);
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("min_trading_qty."));
            setMinTradingQty( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("max_trading_qty")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("max_trading_qty")))
        {
            std::shared_ptr<Object> newItem(nullptr);
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("max_trading_qty."));
            setMaxTradingQty( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("qty_step")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("qty_step")))
        {
            std::shared_ptr<Object> newItem(nullptr);
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("qty_step."));
            setQtyStep( newItem );
        }
    }
}

std::shared_ptr<Object> Lot_size_filter::getMinTradingQty() const
{
    return m_Min_trading_qty;
}


void Lot_size_filter::setMinTradingQty(std::shared_ptr<Object> value)
{
    m_Min_trading_qty = value;
    m_Min_trading_qtyIsSet = true;
}
bool Lot_size_filter::minTradingQtyIsSet() const
{
    return m_Min_trading_qtyIsSet;
}

void Lot_size_filter::unsetMin_trading_qty()
{
    m_Min_trading_qtyIsSet = false;
}

std::shared_ptr<Object> Lot_size_filter::getMaxTradingQty() const
{
    return m_Max_trading_qty;
}


void Lot_size_filter::setMaxTradingQty(std::shared_ptr<Object> value)
{
    m_Max_trading_qty = value;
    m_Max_trading_qtyIsSet = true;
}
bool Lot_size_filter::maxTradingQtyIsSet() const
{
    return m_Max_trading_qtyIsSet;
}

void Lot_size_filter::unsetMax_trading_qty()
{
    m_Max_trading_qtyIsSet = false;
}

std::shared_ptr<Object> Lot_size_filter::getQtyStep() const
{
    return m_Qty_step;
}


void Lot_size_filter::setQtyStep(std::shared_ptr<Object> value)
{
    m_Qty_step = value;
    m_Qty_stepIsSet = true;
}
bool Lot_size_filter::qtyStepIsSet() const
{
    return m_Qty_stepIsSet;
}

void Lot_size_filter::unsetQty_step()
{
    m_Qty_stepIsSet = false;
}

}
}
}
}

