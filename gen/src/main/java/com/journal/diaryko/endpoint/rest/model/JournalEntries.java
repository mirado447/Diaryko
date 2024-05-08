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
 * JournalEntries
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-07T13:28:20.746321300+03:00[Africa/Nairobi]", comments = "Generator version: 7.5.0")
public class JournalEntries {

  private String id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate creationDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate updateDate;

  private String title;

  private String content;

  public JournalEntries id(String id) {
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

  public JournalEntries creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  */
  @Valid 
  @Schema(name = "creation_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creation_date")
  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public JournalEntries updateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Get updateDate
   * @return updateDate
  */
  @Valid 
  @Schema(name = "update_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("update_date")
  public LocalDate getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
  }

  public JournalEntries title(String title) {
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

  public JournalEntries content(String content) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JournalEntries journalEntries = (JournalEntries) o;
    return Objects.equals(this.id, journalEntries.id) &&
        Objects.equals(this.creationDate, journalEntries.creationDate) &&
        Objects.equals(this.updateDate, journalEntries.updateDate) &&
        Objects.equals(this.title, journalEntries.title) &&
        Objects.equals(this.content, journalEntries.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creationDate, updateDate, title, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JournalEntries {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

