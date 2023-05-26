package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ModifyFreelancerProfileDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-26T20:13:25.761825281Z[GMT]")


public class ModifyFreelancerProfileDTO   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("skills")
  @Valid
  private List<String> skills = null;

  @JsonProperty("availability")
  private String availability = null;

  public ModifyFreelancerProfileDTO title(String title) {
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

  public ModifyFreelancerProfileDTO description(String description) {
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

  public ModifyFreelancerProfileDTO skills(List<String> skills) {
    this.skills = skills;
    return this;
  }

  public ModifyFreelancerProfileDTO addSkillsItem(String skillsItem) {
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

  public ModifyFreelancerProfileDTO availability(String availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
   **/
  @Schema(description = "")
  
    public String getAvailability() {
    return availability;
  }

  public void setAvailability(String availability) {
    this.availability = availability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyFreelancerProfileDTO modifyFreelancerProfileDTO = (ModifyFreelancerProfileDTO) o;
    return Objects.equals(this.title, modifyFreelancerProfileDTO.title) &&
        Objects.equals(this.description, modifyFreelancerProfileDTO.description) &&
        Objects.equals(this.skills, modifyFreelancerProfileDTO.skills) &&
        Objects.equals(this.availability, modifyFreelancerProfileDTO.availability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, skills, availability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyFreelancerProfileDTO {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
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
