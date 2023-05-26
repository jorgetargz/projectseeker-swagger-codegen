/*
 * Project Seeker API
 * Project Seeker API
 *
 * OpenAPI spec version: 1.0
 * Contact: jorgetargz@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * OfferInfoDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-05-26T20:15:53.324572324Z[GMT]")public class OfferInfoDTO   {
  @JsonProperty("freelancerId")
  private String freelancerId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("budget")
  private Double budget = null;

  @JsonProperty("status")
  private String status = null;

  public OfferInfoDTO freelancerId(String freelancerId) {
    this.freelancerId = freelancerId;
    return this;
  }

  /**
   * Get freelancerId
   * @return freelancerId
   **/
  @JsonProperty("freelancerId")
  @Schema(description = "")
  public String getFreelancerId() {
    return freelancerId;
  }

  public void setFreelancerId(String freelancerId) {
    this.freelancerId = freelancerId;
  }

  public OfferInfoDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @JsonProperty("description")
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OfferInfoDTO budget(Double budget) {
    this.budget = budget;
    return this;
  }

  /**
   * Get budget
   * @return budget
   **/
  @JsonProperty("budget")
  @Schema(description = "")
  public Double getBudget() {
    return budget;
  }

  public void setBudget(Double budget) {
    this.budget = budget;
  }

  public OfferInfoDTO status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @JsonProperty("status")
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferInfoDTO offerInfoDTO = (OfferInfoDTO) o;
    return Objects.equals(this.freelancerId, offerInfoDTO.freelancerId) &&
        Objects.equals(this.description, offerInfoDTO.description) &&
        Objects.equals(this.budget, offerInfoDTO.budget) &&
        Objects.equals(this.status, offerInfoDTO.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freelancerId, description, budget, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferInfoDTO {\n");
    
    sb.append("    freelancerId: ").append(toIndentedString(freelancerId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
