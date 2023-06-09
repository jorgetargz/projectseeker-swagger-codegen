/* 
 * Project Seeker API
 *
 * Project Seeker API
 *
 * OpenAPI spec version: 1.0
 * Contact: jorgetargz@gmail.com
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
    /// AddDeviceDTO
    /// </summary>
    [DataContract]
        public partial class AddDeviceDTO :  IEquatable<AddDeviceDTO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AddDeviceDTO" /> class.
        /// </summary>
        /// <param name="firebaseId">firebaseId.</param>
        /// <param name="deviceModel">deviceModel.</param>
        /// <param name="deviceToken">deviceToken.</param>
        public AddDeviceDTO(string firebaseId = default(string), string deviceModel = default(string), string deviceToken = default(string))
        {
            this.FirebaseId = firebaseId;
            this.DeviceModel = deviceModel;
            this.DeviceToken = deviceToken;
        }
        
        /// <summary>
        /// Gets or Sets FirebaseId
        /// </summary>
        [DataMember(Name="firebaseId", EmitDefaultValue=false)]
        public string FirebaseId { get; set; }

        /// <summary>
        /// Gets or Sets DeviceModel
        /// </summary>
        [DataMember(Name="deviceModel", EmitDefaultValue=false)]
        public string DeviceModel { get; set; }

        /// <summary>
        /// Gets or Sets DeviceToken
        /// </summary>
        [DataMember(Name="deviceToken", EmitDefaultValue=false)]
        public string DeviceToken { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AddDeviceDTO {\n");
            sb.Append("  FirebaseId: ").Append(FirebaseId).Append("\n");
            sb.Append("  DeviceModel: ").Append(DeviceModel).Append("\n");
            sb.Append("  DeviceToken: ").Append(DeviceToken).Append("\n");
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
            return this.Equals(input as AddDeviceDTO);
        }

        /// <summary>
        /// Returns true if AddDeviceDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of AddDeviceDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AddDeviceDTO input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.FirebaseId == input.FirebaseId ||
                    (this.FirebaseId != null &&
                    this.FirebaseId.Equals(input.FirebaseId))
                ) && 
                (
                    this.DeviceModel == input.DeviceModel ||
                    (this.DeviceModel != null &&
                    this.DeviceModel.Equals(input.DeviceModel))
                ) && 
                (
                    this.DeviceToken == input.DeviceToken ||
                    (this.DeviceToken != null &&
                    this.DeviceToken.Equals(input.DeviceToken))
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
                if (this.FirebaseId != null)
                    hashCode = hashCode * 59 + this.FirebaseId.GetHashCode();
                if (this.DeviceModel != null)
                    hashCode = hashCode * 59 + this.DeviceModel.GetHashCode();
                if (this.DeviceToken != null)
                    hashCode = hashCode * 59 + this.DeviceToken.GetHashCode();
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
