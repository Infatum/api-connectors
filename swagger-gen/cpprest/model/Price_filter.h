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
 * Price_filter.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_MODEL_Price_filter_H_
#define IO_SWAGGER_CLIENT_MODEL_Price_filter_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  Price_filter
    : public ModelBase
{
public:
    Price_filter();
    virtual ~Price_filter();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Price_filter members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getMinPrice() const;
    bool minPriceIsSet() const;
    void unsetMin_price();
    void setMinPrice(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getMaxPrice() const;
    bool maxPriceIsSet() const;
    void unsetMax_price();
    void setMaxPrice(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTickSize() const;
    bool tickSizeIsSet() const;
    void unsetTick_size();
    void setTickSize(utility::string_t value);

protected:
    utility::string_t m_Min_price;
    bool m_Min_priceIsSet;
    utility::string_t m_Max_price;
    bool m_Max_priceIsSet;
    utility::string_t m_Tick_size;
    bool m_Tick_sizeIsSet;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_MODEL_Price_filter_H_ */
