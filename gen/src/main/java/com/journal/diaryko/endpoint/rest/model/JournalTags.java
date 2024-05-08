package com.journal.diaryko.endpoint.rest.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * JournalTags
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-07T13:28:20.746321300+03:00[Africa/Nairobi]", comments = "Generator version: 7.5.0")
public class JournalTags {

  private String id;

  private String tagId;

  private String journalEntriesId;

  public JournalTags id(String id) {
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

  public JournalTags tagId(String tagId) {
    this.tagId = tagId;
    return this;
  }

  /**
   * Get tagId
   * @return tagId
  */
  
  @Schema(name = "tag_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tag_id")
  public String getTagId() {
    return tagId;
  }

  public void setTagId(String tagId) {
    this.tagId = tagId;
  }

  public JournalTags journalEntriesId(String journalEntriesId) {
    this.journalEntriesId = journalEntriesId;
    return this;
  }

  /**
   * Get journalEntriesId
   * @return journalEntriesId
  */
  
  @Schema(name = "journal_entries_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("journal_entries_id")
  public String getJournalEntriesId() {
    return journalEntriesId;
  }

  public void setJournalEntriesId(String journalEntriesId) {
    this.journalEntriesId = journalEntriesId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JournalTags journalTags = (JournalTags) o;
    return Objects.equals(this.id, journalTags.id) &&
        Objects.equals(this.tagId, journalTags.tagId) &&
        Objects.equals(this.journalEntriesId, journalTags.journalEntriesId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tagId, journalEntriesId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JournalTags {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
    sb.append("    journalEntriesId: ").append(toIndentedString(journalEntriesId)).append("\n");
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

