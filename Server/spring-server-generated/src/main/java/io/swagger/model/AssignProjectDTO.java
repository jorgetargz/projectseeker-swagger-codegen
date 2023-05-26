package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AssignProjectDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-26T20:13:25.761825281Z[GMT]")


public class AssignProjectDTO   {
  @JsonProperty("projectId")
  private String projectId = null;

  @JsonProperty("freelancerId")
  private String freelancerId = null;

  public AssignProjectDTO projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
   **/
  @Schema(description = "")
  
    public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public AssignProjectDTO freelancerId(String freelancerId) {
    this.freelancerId = freelancerId;
    return this;
  }

  /**
   * Get freelancerId
   * @return freelancerId
   **/
  @Schema(description = "")
  
    public String getFreelancerId() {
    return freelancerId;
  }

  public void setFreelancerId(String freelancerId) {
    this.freelancerId = freelancerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignProjectDTO assignProjectDTO = (AssignProjectDTO) o;
    return Objects.equals(this.projectId, assignProjectDTO.projectId) &&
        Objects.equals(this.freelancerId, assignProjectDTO.freelancerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, freelancerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignProjectDTO {\n");
    
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    freelancerId: ").append(toIndentedString(freelancerId)).append("\n");
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
