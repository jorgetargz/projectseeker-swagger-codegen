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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
/**
 * CreateProjectDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-26T20:12:02.644429048Z[GMT]")
public class CreateProjectDTO {
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
