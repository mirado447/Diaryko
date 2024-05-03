package com.journal.diaryko.endpoint.rest.model;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Audio
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-03T07:38:36.366062500+03:00[Africa/Nairobi]")


public class Audio   {
  @JsonProperty("id")
  private String id = ;

  @JsonProperty("filename")
  private String filename = ;

  @JsonProperty("type_mime")
  private String typeMime = ;

  @JsonProperty("file_size")
  private Integer fileSize = ;

  @JsonProperty("filepath")
  private String filepath = ;

  @JsonProperty("duration_second")
  private Integer durationSecond = ;

  public Audio id(String id) {
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

  public Audio filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * Get filename
   * @return filename
  **/
  @ApiModelProperty(value = "")


  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public Audio typeMime(String typeMime) {
    this.typeMime = typeMime;
    return this;
  }

  /**
   * Get typeMime
   * @return typeMime
  **/
  @ApiModelProperty(value = "")


  public String getTypeMime() {
    return typeMime;
  }

  public void setTypeMime(String typeMime) {
    this.typeMime = typeMime;
  }

  public Audio fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * Get fileSize
   * @return fileSize
  **/
  @ApiModelProperty(value = "")


  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  public Audio filepath(String filepath) {
    this.filepath = filepath;
    return this;
  }

  /**
   * Get filepath
   * @return filepath
  **/
  @ApiModelProperty(value = "")


  public String getFilepath() {
    return filepath;
  }

  public void setFilepath(String filepath) {
    this.filepath = filepath;
  }

  public Audio durationSecond(Integer durationSecond) {
    this.durationSecond = durationSecond;
    return this;
  }

  /**
   * Get durationSecond
   * @return durationSecond
  **/
  @ApiModelProperty(value = "")


  public Integer getDurationSecond() {
    return durationSecond;
  }

  public void setDurationSecond(Integer durationSecond) {
    this.durationSecond = durationSecond;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Audio audio = (Audio) o;
    return Objects.equals(this.id, audio.id)Objects.equals(this.filename, audio.filename)Objects.equals(this.typeMime, audio.typeMime)Objects.equals(this.fileSize, audio.fileSize)Objects.equals(this.filepath, audio.filepath)Objects.equals(this.durationSecond, audio.durationSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idfilenametypeMimefileSizefilepathdurationSecond);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Audio {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

