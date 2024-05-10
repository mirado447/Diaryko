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
 * Video
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-09T14:05:23.262763200+03:00[Africa/Nairobi]", comments = "Generator version: 7.5.0")
public class Video {

  private String id;

  private String filename;

  private String typeMime;

  private Integer fileSize;

  private String filepath;

  private Integer durationSecond;

  public Video id(String id) {
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

  public Video filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * Get filename
   * @return filename
  */
  
  @Schema(name = "filename", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public Video typeMime(String typeMime) {
    this.typeMime = typeMime;
    return this;
  }

  /**
   * Get typeMime
   * @return typeMime
  */
  
  @Schema(name = "type_mime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type_mime")
  public String getTypeMime() {
    return typeMime;
  }

  public void setTypeMime(String typeMime) {
    this.typeMime = typeMime;
  }

  public Video fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * Get fileSize
   * @return fileSize
  */
  
  @Schema(name = "file_size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_size")
  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  public Video filepath(String filepath) {
    this.filepath = filepath;
    return this;
  }

  /**
   * Get filepath
   * @return filepath
  */
  
  @Schema(name = "filepath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filepath")
  public String getFilepath() {
    return filepath;
  }

  public void setFilepath(String filepath) {
    this.filepath = filepath;
  }

  public Video durationSecond(Integer durationSecond) {
    this.durationSecond = durationSecond;
    return this;
  }

  /**
   * Get durationSecond
   * @return durationSecond
  */
  
  @Schema(name = "duration_second", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration_second")
  public Integer getDurationSecond() {
    return durationSecond;
  }

  public void setDurationSecond(Integer durationSecond) {
    this.durationSecond = durationSecond;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Video video = (Video) o;
    return Objects.equals(this.id, video.id) &&
        Objects.equals(this.filename, video.filename) &&
        Objects.equals(this.typeMime, video.typeMime) &&
        Objects.equals(this.fileSize, video.fileSize) &&
        Objects.equals(this.filepath, video.filepath) &&
        Objects.equals(this.durationSecond, video.durationSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, filename, typeMime, fileSize, filepath, durationSecond);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Video {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    typeMime: ").append(toIndentedString(typeMime)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    filepath: ").append(toIndentedString(filepath)).append("\n");
    sb.append("    durationSecond: ").append(toIndentedString(durationSecond)).append("\n");
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

