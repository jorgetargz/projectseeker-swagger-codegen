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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.OfferInfoDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
/**
 * ProjectInfoDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-26T20:12:02.644429048Z[GMT]")
public class ProjectInfoDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("clientId")
  private String clientId = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("skills")
  private List<String> skills = null;

  @SerializedName("minBudget")
  private Double minBudget = null;

  @SerializedName("maxBudget")
  private Double maxBudget = null;

  @SerializedName("startDate")
  private LocalDate startDate = null;

  @SerializedName("deadlineDate")
  private LocalDate deadlineDate = null;

  @SerializedName("realEndDate")
  private LocalDate realEndDate = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("selectedFreelancerId")
  private String selectedFreelancerId = null;

  @SerializedName("offers")
  private List<OfferInfoDTO> offers = null;

  public ProjectInfoDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProjectInfoDTO clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @Schema(description = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public ProjectInfoDTO title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ProjectInfoDTO description(String description) {
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

  public ProjectInfoDTO skills(List<String> skills) {
    this.skills = skills;
    return this;
  }

  public ProjectInfoDTO addSkillsItem(String skillsItem) {
    if (this.skills == null) {
      this.skills = new ArrayList<String>();
    }
    this.skills.add(skillsItem);
    return this;
  }

   /**
   * Get skills
   * @return skills
  **/
  @Schema(description = "")
  public List<String> getSkills() {
    return skills;
  }

  public void setSkills(List<String> skills) {
    this.skills = skills;
  }

  public ProjectInfoDTO minBudget(Double minBudget) {
    this.minBudget = minBudget;
    return this;
  }

   /**
   * Get minBudget
   * @return minBudget
  **/
  @Schema(description = "")
  public Double getMinBudget() {
    return minBudget;
  }

  public void setMinBudget(Double minBudget) {
    this.minBudget = minBudget;
  }

  public ProjectInfoDTO maxBudget(Double maxBudget) {
    this.maxBudget = maxBudget;
    return this;
  }

   /**
   * Get maxBudget
   * @return maxBudget
  **/
  @Schema(description = "")
  public Double getMaxBudget() {
    return maxBudget;
  }

  public void setMaxBudget(Double maxBudget) {
    this.maxBudget = maxBudget;
  }

  public ProjectInfoDTO startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @Schema(description = "")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public ProjectInfoDTO deadlineDate(LocalDate deadlineDate) {
    this.deadlineDate = deadlineDate;
    return this;
  }

   /**
   * Get deadlineDate
   * @return deadlineDate
  **/
  @Schema(description = "")
  public LocalDate getDeadlineDate() {
    return deadlineDate;
  }

  public void setDeadlineDate(LocalDate deadlineDate) {
    this.deadlineDate = deadlineDate;
  }

  public ProjectInfoDTO realEndDate(LocalDate realEndDate) {
    this.realEndDate = realEndDate;
    return this;
  }

   /**
   * Get realEndDate
   * @return realEndDate
  **/
  @Schema(description = "")
  public LocalDate getRealEndDate() {
    return realEndDate;
  }

  public void setRealEndDate(LocalDate realEndDate) {
    this.realEndDate = realEndDate;
  }

  public ProjectInfoDTO status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ProjectInfoDTO selectedFreelancerId(String selectedFreelancerId) {
    this.selectedFreelancerId = selectedFreelancerId;
    return this;
  }

   /**
   * Get selectedFreelancerId
   * @return selectedFreelancerId
  **/
  @Schema(description = "")
  public String getSelectedFreelancerId() {
    return selectedFreelancerId;
  }

  public void setSelectedFreelancerId(String selectedFreelancerId) {
    this.selectedFreelancerId = selectedFreelancerId;
  }

  public ProjectInfoDTO offers(List<OfferInfoDTO> offers) {
    this.offers = offers;
    return this;
  }

  public ProjectInfoDTO addOffersItem(OfferInfoDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<OfferInfoDTO>();
    }
    this.offers.add(offersItem);
    return this;
  }

   /**
   * Get offers
   * @return offers
  **/
  @Schema(description = "")
  public List<OfferInfoDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<OfferInfoDTO> offers) {
    this.offers = offers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectInfoDTO projectInfoDTO = (ProjectInfoDTO) o;
    return Objects.equals(this.id, projectInfoDTO.id) &&
        Objects.equals(this.clientId, projectInfoDTO.clientId) &&
        Objects.equals(this.title, projectInfoDTO.title) &&
        Objects.equals(this.description, projectInfoDTO.description) &&
        Objects.equals(this.skills, projectInfoDTO.skills) &&
        Objects.equals(this.minBudget, projectInfoDTO.minBudget) &&
        Objects.equals(this.maxBudget, projectInfoDTO.maxBudget) &&
        Objects.equals(this.startDate, projectInfoDTO.startDate) &&
        Objects.equals(this.deadlineDate, projectInfoDTO.deadlineDate) &&
        Objects.equals(this.realEndDate, projectInfoDTO.realEndDate) &&
        Objects.equals(this.status, projectInfoDTO.status) &&
        Objects.equals(this.selectedFreelancerId, projectInfoDTO.selectedFreelancerId) &&
        Objects.equals(this.offers, projectInfoDTO.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, title, description, skills, minBudget, maxBudget, startDate, deadlineDate, realEndDate, status, selectedFreelancerId, offers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectInfoDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    minBudget: ").append(toIndentedString(minBudget)).append("\n");
    sb.append("    maxBudget: ").append(toIndentedString(maxBudget)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    deadlineDate: ").append(toIndentedString(deadlineDate)).append("\n");
    sb.append("    realEndDate: ").append(toIndentedString(realEndDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    selectedFreelancerId: ").append(toIndentedString(selectedFreelancerId)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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
