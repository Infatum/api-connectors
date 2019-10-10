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
 * Symbols.h
 *
 * Get symbol information.
 */

#ifndef IO_SWAGGER_CLIENT_MODEL_Symbols_H_
#define IO_SWAGGER_CLIENT_MODEL_Symbols_H_


#include "../ModelBase.h"

#include "SymbolInfo.h"
#include <cpprest/details/basic_types.h>
#include <vector>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// Get symbol information.
/// </summary>
class  Symbols
    : public ModelBase
{
public:
    Symbols();
    virtual ~Symbols();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Symbols members

    /// <summary>
    /// 
    /// </summary>
    double getRetCode() const;
    bool retCodeIsSet() const;
    void unsetRet_code();
    void setRetCode(double value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getRetMsg() const;
    bool retMsgIsSet() const;
    void unsetRet_msg();
    void setRetMsg(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getExtCode() const;
    bool extCodeIsSet() const;
    void unsetExt_code();
    void setExtCode(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getExtInfo() const;
    bool extInfoIsSet() const;
    void unsetExt_info();
    void setExtInfo(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<SymbolInfo>>& getResult();
    bool resultIsSet() const;
    void unsetResult();
    void setResult(std::vector<std::shared_ptr<SymbolInfo>> value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTimeNow() const;
    bool timeNowIsSet() const;
    void unsetTime_now();
    void setTimeNow(utility::string_t value);

protected:
    double m_Ret_code;
    bool m_Ret_codeIsSet;
    utility::string_t m_Ret_msg;
    bool m_Ret_msgIsSet;
    utility::string_t m_Ext_code;
    bool m_Ext_codeIsSet;
    utility::string_t m_Ext_info;
    bool m_Ext_infoIsSet;
    std::vector<std::shared_ptr<SymbolInfo>> m_Result;
    bool m_ResultIsSet;
    utility::string_t m_Time_now;
    bool m_Time_nowIsSet;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_MODEL_Symbols_H_ */
