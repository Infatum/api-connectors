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



#include "LeverageInfo.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

LeverageInfo::LeverageInfo()
{
    m_Leverage = 0.0;
    m_LeverageIsSet = false;
}

LeverageInfo::~LeverageInfo()
{
}

void LeverageInfo::validate()
{
    // TODO: implement validation
}

web::json::value LeverageInfo::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_LeverageIsSet)
    {
        val[utility::conversions::to_string_t("leverage")] = ModelBase::toJson(m_Leverage);
    }

    return val;
}

void LeverageInfo::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("leverage")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("leverage")];
        if(!fieldValue.is_null())
        {
            setLeverage(ModelBase::doubleFromJson(fieldValue));
        }
    }
}

void LeverageInfo::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_LeverageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("leverage"), m_Leverage));
    }
}

void LeverageInfo::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("leverage")))
    {
        setLeverage(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("leverage"))));
    }
}

double LeverageInfo::getLeverage() const
{
    return m_Leverage;
}


void LeverageInfo::setLeverage(double value)
{
    m_Leverage = value;
    m_LeverageIsSet = true;
}
bool LeverageInfo::leverageIsSet() const
{
    return m_LeverageIsSet;
}

void LeverageInfo::unsetLeverage()
{
    m_LeverageIsSet = false;
}

}
}
}
}

