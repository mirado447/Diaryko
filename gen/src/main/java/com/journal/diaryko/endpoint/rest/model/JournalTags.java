package com.journal.diaryko.endpoint.rest.model;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JournalTags
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-03T07:38:36.366062500+03:00[Africa/Nairobi]")


public class JournalTags   {
  @JsonProperty("id")
  private String id = ;

  @JsonProperty("tag_id")
  private String tagId = ;

  @JsonProperty("journal_entries_id")
  private String journalEntriesId = ;

  public JournalTags id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


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
  **/
  @ApiModelProperty(value = "")


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
  **/
  @ApiModelProperty(value = "")


  public String getJournalEntriesId() {
    return journalEntriesId;
  }

  public void setJournalEntriesId(String journalEntriesId) {
    this.journalEntriesId = journalEntriesId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JournalTags journalTags = (JournalTags) o;
    return Objects.equals(this.id, journalTags.id)Objects.equals(this.tagId, journalTags.tagId)Objects.equals(this.journalEntriesId, journalTags.journalEntriesId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idtagIdjournalEntriesId);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

