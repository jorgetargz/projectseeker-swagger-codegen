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
/**
 * ProfileDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-26T20:12:02.644429048Z[GMT]")
public class ProfileDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("firebaseId")
  private String firebaseId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("activeRole")
  private String activeRole = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("availability")
  private String availability = null;

  @SerializedName("rating")
  private Double rating = null;

  @SerializedName("skills")
  private List<String> skills = null;

  public ProfileDTO id(String id) {
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

  public ProfileDTO firebaseId(String firebaseId) {
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

  public ProfileDTO name(String name) {
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

  public ProfileDTO email(String email) {
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

  public ProfileDTO phone(String phone) {
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

  public ProfileDTO activeRole(String activeRole) {
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

  public ProfileDTO title(String title) {
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

  public ProfileDTO description(String description) {
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

  public ProfileDTO availability(String availability) {
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

  public ProfileDTO rating(Double rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/
  @Schema(description = "")
  public Double getRating() {
    return rating;
  }

  public void setRating(Double rating) {
    this.rating = rating;
  }

  public ProfileDTO skills(List<String> skills) {
    this.skills = skills;
    return this;
  }

  public ProfileDTO addSkillsItem(String skillsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileDTO profileDTO = (ProfileDTO) o;
    return Objects.equals(this.id, profileDTO.id) &&
        Objects.equals(this.firebaseId, profileDTO.firebaseId) &&
        Objects.equals(this.name, profileDTO.name) &&
        Objects.equals(this.email, profileDTO.email) &&
        Objects.equals(this.phone, profileDTO.phone) &&
        Objects.equals(this.activeRole, profileDTO.activeRole) &&
        Objects.equals(this.title, profileDTO.title) &&
        Objects.equals(this.description, profileDTO.description) &&
        Objects.equals(this.availability, profileDTO.availability) &&
        Objects.equals(this.rating, profileDTO.rating) &&
        Objects.equals(this.skills, profileDTO.skills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firebaseId, name, email, phone, activeRole, title, description, availability, rating, skills);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firebaseId: ").append(toIndentedString(firebaseId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    activeRole: ").append(toIndentedString(activeRole)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
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
