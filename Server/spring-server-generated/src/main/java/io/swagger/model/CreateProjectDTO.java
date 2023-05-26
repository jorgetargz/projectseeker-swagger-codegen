package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateProjectDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-26T20:13:25.761825281Z[GMT]")


public class CreateProjectDTO   {
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

  public CreateProjectDTO title(String title) {
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

  public CreateProjectDTO description(String description) {
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

  public CreateProjectDTO skills(List<String> skills) {
    this.skills = skills;
    return this;
  }

  public CreateProjectDTO addSkillsItem(String skillsItem) {
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

  public CreateProjectDTO minBudget(Double minBudget) {
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

  public CreateProjectDTO maxBudget(Double maxBudget) {
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

  public CreateProjectDTO startDate(LocalDate startDate) {
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

  public CreateProjectDTO deadlineDate(LocalDate deadlineDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProjectDTO createProjectDTO = (CreateProjectDTO) o;
    return Objects.equals(this.title, createProjectDTO.title) &&
        Objects.equals(this.description, createProjectDTO.description) &&
        Objects.equals(this.skills, createProjectDTO.skills) &&
        Objects.equals(this.minBudget, createProjectDTO.minBudget) &&
        Objects.equals(this.maxBudget, createProjectDTO.maxBudget) &&
        Objects.equals(this.startDate, createProjectDTO.startDate) &&
        Objects.equals(this.deadlineDate, createProjectDTO.deadlineDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, skills, minBudget, maxBudget, startDate, deadlineDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProjectDTO {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    minBudget: ").append(toIndentedString(minBudget)).append("\n");
    sb.append("    maxBudget: ").append(toIndentedString(maxBudget)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    deadlineDate: ").append(toIndentedString(deadlineDate)).append("\n");
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
