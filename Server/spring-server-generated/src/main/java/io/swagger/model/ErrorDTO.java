package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-26T20:13:25.761825281Z[GMT]")


public class ErrorDTO   {
  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("httpErrorCode")
  private Integer httpErrorCode = null;

  @JsonProperty("firebaseError")
  private String firebaseError = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("description")
  private String description = null;

  public ErrorDTO timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public ErrorDTO httpErrorCode(Integer httpErrorCode) {
    this.httpErrorCode = httpErrorCode;
    return this;
  }

  /**
   * Get httpErrorCode
   * @return httpErrorCode
   **/
  @Schema(description = "")
  
    public Integer getHttpErrorCode() {
    return httpErrorCode;
  }

  public void setHttpErrorCode(Integer httpErrorCode) {
    this.httpErrorCode = httpErrorCode;
  }

  public ErrorDTO firebaseError(String firebaseError) {
    this.firebaseError = firebaseError;
    return this;
  }

  /**
   * Get firebaseError
   * @return firebaseError
   **/
  @Schema(description = "")
  
    public String getFirebaseError() {
    return firebaseError;
  }

  public void setFirebaseError(String firebaseError) {
    this.firebaseError = firebaseError;
  }

  public ErrorDTO message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(description = "")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(description = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDTO errorDTO = (ErrorDTO) o;
    return Objects.equals(this.timestamp, errorDTO.timestamp) &&
        Objects.equals(this.httpErrorCode, errorDTO.httpErrorCode) &&
        Objects.equals(this.firebaseError, errorDTO.firebaseError) &&
        Objects.equals(this.message, errorDTO.message) &&
        Objects.equals(this.description, errorDTO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, httpErrorCode, firebaseError, message, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDTO {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    httpErrorCode: ").append(toIndentedString(httpErrorCode)).append("\n");
    sb.append("    firebaseError: ").append(toIndentedString(firebaseError)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
