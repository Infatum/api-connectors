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
 * OrderListData.h
 *
 * Get order list response
 */

#ifndef IO_SWAGGER_CLIENT_MODEL_OrderListData_H_
#define IO_SWAGGER_CLIENT_MODEL_OrderListData_H_


#include "../ModelBase.h"

#include "OrderRes.h"
#include <vector>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// Get order list response
/// </summary>
class  OrderListData
    : public ModelBase
{
public:
    OrderListData();
    virtual ~OrderListData();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// OrderListData members

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<OrderRes>>& getData();
    bool dataIsSet() const;
    void unsetData();
    void setData(std::vector<std::shared_ptr<OrderRes>> value);

protected:
    std::vector<std::shared_ptr<OrderRes>> m_Data;
    bool m_DataIsSet;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_MODEL_OrderListData_H_ */
