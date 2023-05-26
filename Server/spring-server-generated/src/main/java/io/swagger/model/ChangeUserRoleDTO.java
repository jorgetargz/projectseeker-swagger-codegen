package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ChangeUserRoleDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-26T20:13:25.761825281Z[GMT]")


public class ChangeUserRoleDTO   {
  @JsonProperty("activeRole")
  private String activeRole = null;

  public ChangeUserRoleDTO activeRole(String activeRole) {
    this.activeRole = activeRole;
    return this;
  }

  /**
   * Get activeRole
   * @return activeRole
   **/
  @Schema(description = "")
  
    public String getActiveRole() {
    return activeRole;
  }

  public void setActiveRole(String activeRole) {
    this.activeRole = activeRole;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeUserRoleDTO changeUserRoleDTO = (ChangeUserRoleDTO) o;
    return Objects.equals(this.activeRole, changeUserRoleDTO.activeRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeUserRoleDTO {\n");
    
    sb.append("    activeRole: ").append(toIndentedString(activeRole)).append("\n");
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
