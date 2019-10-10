/* 
 * Bybit API
 *
 * ## REST API for the Bybit Exchange. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// Get the trade records of a order response
    /// </summary>
    [DataContract]
    public partial class TradeRecords :  IEquatable<TradeRecords>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TradeRecords" /> class.
        /// </summary>
        /// <param name="orderId">orderId.</param>
        /// <param name="tradeList">tradeList.</param>
        public TradeRecords(string orderId = default(string), List<TradeRecordsInfo> tradeList = default(List<TradeRecordsInfo>))
        {
            this.OrderId = orderId;
            this.TradeList = tradeList;
        }
        
        /// <summary>
        /// Gets or Sets OrderId
        /// </summary>
        [DataMember(Name="order_id", EmitDefaultValue=false)]
        public string OrderId { get; set; }

        /// <summary>
        /// Gets or Sets TradeList
        /// </summary>
        [DataMember(Name="trade_list", EmitDefaultValue=false)]
        public List<TradeRecordsInfo> TradeList { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TradeRecords {\n");
            sb.Append("  OrderId: ").Append(OrderId).Append("\n");
            sb.Append("  TradeList: ").Append(TradeList).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as TradeRecords);
        }

        /// <summary>
        /// Returns true if TradeRecords instances are equal
        /// </summary>
        /// <param name="input">Instance of TradeRecords to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TradeRecords input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.OrderId == input.OrderId ||
                    (this.OrderId != null &&
                    this.OrderId.Equals(input.OrderId))
                ) && 
                (
                    this.TradeList == input.TradeList ||
                    this.TradeList != null &&
                    this.TradeList.SequenceEqual(input.TradeList)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.OrderId != null)
                    hashCode = hashCode * 59 + this.OrderId.GetHashCode();
                if (this.TradeList != null)
                    hashCode = hashCode * 59 + this.TradeList.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
