#import <Foundation/Foundation.h>
#import "SWGObject.h"

/**
* Bybit API
* ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
*
* OpenAPI spec version: 0.2.10
* Contact: support@bybit.com
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/





@protocol SWGLinearPrevFundingRateResp
@end

@interface SWGLinearPrevFundingRateResp : SWGObject


@property(nonatomic) NSNumber* fundingRate;

@property(nonatomic) NSString* fundingRateTimestamp;

@property(nonatomic) NSString* symbol;

@end