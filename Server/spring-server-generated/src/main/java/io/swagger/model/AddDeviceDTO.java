package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AddDeviceDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-26T20:13:25.761825281Z[GMT]")


public class AddDeviceDTO   {
  @JsonProperty("firebaseId")
  private String firebaseId = null;

  @JsonProperty("deviceModel")
  private String deviceModel = null;

  @JsonProperty("deviceToken")
  private String deviceToken = null;

  public AddDeviceDTO firebaseId(String firebaseId) {
    this.firebaseId = firebaseId;
    return this;
  }

  /**
   * Get firebaseId
   * @return firebaseId
   **/
  @Schema(description = "")
  
    public String getFirebaseId() {
    return firebaseId;
  }

  public void setFirebaseId(String firebaseId) {
    this.firebaseId = firebaseId;
  }

  public AddDeviceDTO deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

  /**
   * Get deviceModel
   * @return deviceModel
   **/
  @Schema(description = "")
  
    public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public AddDeviceDTO deviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
    return this;
  }

  /**
   * Get deviceToken
   * @return deviceToken
   **/
  @Schema(description = "")
  
    public String getDeviceToken() {
    return deviceToken;
  }

  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddDeviceDTO addDeviceDTO = (AddDeviceDTO) o;
    return Objects.equals(this.firebaseId, addDeviceDTO.firebaseId) &&
        Objects.equals(this.deviceModel, addDeviceDTO.deviceModel) &&
        Objects.equals(this.deviceToken, addDeviceDTO.deviceToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firebaseId, deviceModel, deviceToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDeviceDTO {\n");
    
    sb.append("    firebaseId: ").append(toIndentedString(firebaseId)).append("\n");
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    sb.append("    deviceToken: ").append(toIndentedString(deviceToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
