package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.OfferInfoDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProjectInfoDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-26T20:13:25.761825281Z[GMT]")


public class ProjectInfoDTO   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("skills")
  @Valid
  private List<String> skills = null;

  @JsonProperty("minBudget")
  private Double minBudget = null;

  @JsonProperty("maxBudget")
  private Double maxBudget = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("deadlineDate")
  private LocalDate deadlineDate = null;

  @JsonProperty("realEndDate")
  private LocalDate realEndDate = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("selectedFreelancerId")
  private String selectedFreelancerId = null;

  @JsonProperty("offers")
  @Valid
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
  
    @Valid
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
  
    @Valid
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
  
    @Valid
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
      @Valid
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
