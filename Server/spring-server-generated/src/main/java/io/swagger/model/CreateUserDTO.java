package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateUserDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-26T20:13:25.761825281Z[GMT]")


public class CreateUserDTO   {
  @JsonProperty("firebaseId")
  private String firebaseId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("activeRole")
  private String activeRole = null;

  public CreateUserDTO firebaseId(String firebaseId) {
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

  public CreateUserDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateUserDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @Schema(description = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateUserDTO phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   **/
  @Schema(description = "")
  
    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CreateUserDTO activeRole(String activeRole) {
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
    CreateUserDTO createUserDTO = (CreateUserDTO) o;
    return Objects.equals(this.firebaseId, createUserDTO.firebaseId) &&
        Objects.equals(this.name, createUserDTO.name) &&
        Objects.equals(this.email, createUserDTO.email) &&
        Objects.equals(this.phone, createUserDTO.phone) &&
        Objects.equals(this.activeRole, createUserDTO.activeRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firebaseId, name, email, phone, activeRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserDTO {\n");
    
    sb.append("    firebaseId: ").append(toIndentedString(firebaseId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
