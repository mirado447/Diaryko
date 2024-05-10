package com.journal.diaryko.endpoint.rest.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Journal
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-09T14:05:23.262763200+03:00[Africa/Nairobi]", comments = "Generator version: 7.5.0")
public class Journal {

  private String id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate createAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate updateAt;

  private String title;

  private String content;

  private String idUser;

  public Journal id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Journal createAt(LocalDate createAt) {
    this.createAt = createAt;
    return this;
  }

  /**
   * Get createAt
   * @return createAt
  */
  @Valid 
  @Schema(name = "create_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create_at")
  public LocalDate getCreateAt() {
    return createAt;
  }

  public void setCreateAt(LocalDate createAt) {
    this.createAt = createAt;
  }

  public Journal updateAt(LocalDate updateAt) {
    this.updateAt = updateAt;
    return this;
  }

  /**
   * Get updateAt
   * @return updateAt
  */
  @Valid 
  @Schema(name = "update_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("update_at")
  public LocalDate getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(LocalDate updateAt) {
    this.updateAt = updateAt;
  }

  public Journal title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Journal content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  
  @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Journal idUser(String idUser) {
    this.idUser = idUser;
    return this;
  }

  /**
   * Get idUser
   * @return idUser
  */
  
  @Schema(name = "id_user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id_user")
  public String getIdUser() {
    return idUser;
  }

  public void setIdUser(String idUser) {
    this.idUser = idUser;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Journal journal = (Journal) o;
    return Objects.equals(this.id, journal.id) &&
        Objects.equals(this.createAt, journal.createAt) &&
        Objects.equals(this.updateAt, journal.updateAt) &&
        Objects.equals(this.title, journal.title) &&
        Objects.equals(this.content, journal.content) &&
        Objects.equals(this.idUser, journal.idUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createAt, updateAt, title, content, idUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Journal {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    idUser: ").append(toIndentedString(idUser)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

