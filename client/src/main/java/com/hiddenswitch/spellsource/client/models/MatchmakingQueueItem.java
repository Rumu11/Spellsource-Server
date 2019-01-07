/*
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more.  To get started, create a user account and make sure to include the entirety of the returned login token as the X-Auth-Token header. You can reuse this token, or login for a new one.  ClientToServerMessage and ServerToClientMessage are used for the realtime game state and actions two-way websocket interface for actually playing a game. Envelope is used for the realtime API services.  For the routes that correspond to the paths in this file, visit the Gateway.java file in the Spellsource-Server GitHub repository located in this definition file. 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: ben@hiddenswitch.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hiddenswitch.spellsource.client.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hiddenswitch.spellsource.client.models.MatchmakingQueueItemRequires;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * A queue the user can enter to play a match in. 
 */
@ApiModel(description = "A queue the user can enter to play a match in. ")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class MatchmakingQueueItem implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("tooltip")
  private String tooltip = null;

  @JsonProperty("queueId")
  private String queueId = null;

  @JsonProperty("requires")
  private MatchmakingQueueItemRequires requires = null;

  public MatchmakingQueueItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The renderable name of the queue 
   * @return name
  **/
  @ApiModelProperty(value = "The renderable name of the queue ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MatchmakingQueueItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A detailed description for this queue. 
   * @return description
  **/
  @ApiModelProperty(value = "A detailed description for this queue. ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MatchmakingQueueItem tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

   /**
   * A tooltip for this queue. 
   * @return tooltip
  **/
  @ApiModelProperty(value = "A tooltip for this queue. ")
  public String getTooltip() {
    return tooltip;
  }

  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  public MatchmakingQueueItem queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }

   /**
   * The ID of the queue the user should put a MatchmakingQueuePutRequest into. 
   * @return queueId
  **/
  @ApiModelProperty(value = "The ID of the queue the user should put a MatchmakingQueuePutRequest into. ")
  public String getQueueId() {
    return queueId;
  }

  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  public MatchmakingQueueItem requires(MatchmakingQueueItemRequires requires) {
    this.requires = requires;
    return this;
  }

   /**
   * Get requires
   * @return requires
  **/
  @ApiModelProperty(value = "")
  public MatchmakingQueueItemRequires getRequires() {
    return requires;
  }

  public void setRequires(MatchmakingQueueItemRequires requires) {
    this.requires = requires;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchmakingQueueItem matchmakingQueueItem = (MatchmakingQueueItem) o;
    return Objects.equals(this.name, matchmakingQueueItem.name) &&
        Objects.equals(this.description, matchmakingQueueItem.description) &&
        Objects.equals(this.tooltip, matchmakingQueueItem.tooltip) &&
        Objects.equals(this.queueId, matchmakingQueueItem.queueId) &&
        Objects.equals(this.requires, matchmakingQueueItem.requires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, tooltip, queueId, requires);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchmakingQueueItem {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    requires: ").append(toIndentedString(requires)).append("\n");
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

