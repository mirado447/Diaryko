package com.journal.diaryko.endpoint.rest.model;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Photo
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-03T07:38:36.366062500+03:00[Africa/Nairobi]")


public class Photo   {
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

  public Photo id(String id) {
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

  public Photo filename(String filename) {
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

  public Photo typeMime(String typeMime) {
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

  public Photo fileSize(Integer fileSize) {
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

  public Photo filepath(String filepath) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Photo photo = (Photo) o;
    return Objects.equals(this.id, photo.id)Objects.equals(this.filename, photo.filename)Objects.equals(this.typeMime, photo.typeMime)Objects.equals(this.fileSize, photo.fileSize)Objects.equals(this.filepath, photo.filepath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idfilenametypeMimefileSizefilepath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Photo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    typeMime: ").append(toIndentedString(typeMime)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    filepath: ").append(toIndentedString(filepath)).append("\n");
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

