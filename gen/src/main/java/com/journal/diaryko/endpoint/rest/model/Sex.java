package com.journal.diaryko.endpoint.rest.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets Sex
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-07T13:28:20.746321300+03:00[Africa/Nairobi]", comments = "Generator version: 7.5.0")
public enum Sex {
  
  M("M"),
  
  F("F"),
  
  OTHER("OTHER");

  private String value;

  Sex(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Sex fromValue(String value) {
    for (Sex b : Sex.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

