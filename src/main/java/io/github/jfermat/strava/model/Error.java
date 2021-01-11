/*
 * Strava API v3
 * The [Swagger Playground](https://developers.strava.com/playground) is the easiest way to familiarize yourself with the Strava API by submitting HTTP requests and observing the responses before you write any client code. It will show what a response will look like with different endpoints depending on the authorization scope you receive from your athletes. To use the Playground, go to https://www.strava.com/settings/api and change your “Authorization Callback Domain” to developers.strava.com. Please note, we only support Swagger 2.0. There is a known issue where you can only select one scope at a time. For more information, please check the section “client code” at https://developers.strava.com/docs.
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.github.jfermat.strava.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Error
 */


public class Error {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("field")
  private String field = null;

  @JsonProperty("resource")
  private String resource = null;

  public Error code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The code associated with this error.
   * @return code
  **/
  @Schema(description = "The code associated with this error.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error field(String field) {
    this.field = field;
    return this;
  }

   /**
   * The specific field or aspect of the resource associated with this error.
   * @return field
  **/
  @Schema(description = "The specific field or aspect of the resource associated with this error.")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public Error resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * The type of resource associated with this error.
   * @return resource
  **/
  @Schema(description = "The type of resource associated with this error.")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.field, error.field) &&
        Objects.equals(this.resource, error.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, field, resource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
