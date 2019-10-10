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
    /// Get the last funding fee
    /// </summary>
    [DataContract]
    public partial class FundingPredicted :  IEquatable<FundingPredicted>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FundingPredicted" /> class.
        /// </summary>
        /// <param name="predictedFundingRate">predictedFundingRate.</param>
        /// <param name="predictedFundingFee">predictedFundingFee.</param>
        public FundingPredicted(double? predictedFundingRate = default(double?), double? predictedFundingFee = default(double?))
        {
            this.PredictedFundingRate = predictedFundingRate;
            this.PredictedFundingFee = predictedFundingFee;
        }
        
        /// <summary>
        /// Gets or Sets PredictedFundingRate
        /// </summary>
        [DataMember(Name="predicted_funding_rate", EmitDefaultValue=false)]
        public double? PredictedFundingRate { get; set; }

        /// <summary>
        /// Gets or Sets PredictedFundingFee
        /// </summary>
        [DataMember(Name="predicted_funding_fee", EmitDefaultValue=false)]
        public double? PredictedFundingFee { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FundingPredicted {\n");
            sb.Append("  PredictedFundingRate: ").Append(PredictedFundingRate).Append("\n");
            sb.Append("  PredictedFundingFee: ").Append(PredictedFundingFee).Append("\n");
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
            return this.Equals(input as FundingPredicted);
        }

        /// <summary>
        /// Returns true if FundingPredicted instances are equal
        /// </summary>
        /// <param name="input">Instance of FundingPredicted to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FundingPredicted input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.PredictedFundingRate == input.PredictedFundingRate ||
                    (this.PredictedFundingRate != null &&
                    this.PredictedFundingRate.Equals(input.PredictedFundingRate))
                ) && 
                (
                    this.PredictedFundingFee == input.PredictedFundingFee ||
                    (this.PredictedFundingFee != null &&
                    this.PredictedFundingFee.Equals(input.PredictedFundingFee))
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
                if (this.PredictedFundingRate != null)
                    hashCode = hashCode * 59 + this.PredictedFundingRate.GetHashCode();
                if (this.PredictedFundingFee != null)
                    hashCode = hashCode * 59 + this.PredictedFundingFee.GetHashCode();
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
