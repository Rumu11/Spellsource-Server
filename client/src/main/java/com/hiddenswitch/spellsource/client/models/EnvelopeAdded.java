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
import com.hiddenswitch.spellsource.client.models.ChatMessage;
import com.hiddenswitch.spellsource.client.models.Friend;
import com.hiddenswitch.spellsource.client.models.Invite;
import com.hiddenswitch.spellsource.client.models.Match;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Indicates one of the records should be added to the client&#39;s ephemeral collections. 
 */
@ApiModel(description = "Indicates one of the records should be added to the client's ephemeral collections. ")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class EnvelopeAdded implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("chatMessage")
  private ChatMessage chatMessage = null;

  @JsonProperty("friend")
  private Friend friend = null;

  @JsonProperty("invite")
  private Invite invite = null;

  @JsonProperty("match")
  private Match match = null;

  public EnvelopeAdded chatMessage(ChatMessage chatMessage) {
    this.chatMessage = chatMessage;
    return this;
  }

   /**
   * Get chatMessage
   * @return chatMessage
  **/
  @ApiModelProperty(value = "")
  public ChatMessage getChatMessage() {
    return chatMessage;
  }

  public void setChatMessage(ChatMessage chatMessage) {
    this.chatMessage = chatMessage;
  }

  public EnvelopeAdded friend(Friend friend) {
    this.friend = friend;
    return this;
  }

   /**
   * Get friend
   * @return friend
  **/
  @ApiModelProperty(value = "")
  public Friend getFriend() {
    return friend;
  }

  public void setFriend(Friend friend) {
    this.friend = friend;
  }

  public EnvelopeAdded invite(Invite invite) {
    this.invite = invite;
    return this;
  }

   /**
   * Get invite
   * @return invite
  **/
  @ApiModelProperty(value = "")
  public Invite getInvite() {
    return invite;
  }

  public void setInvite(Invite invite) {
    this.invite = invite;
  }

  public EnvelopeAdded match(Match match) {
    this.match = match;
    return this;
  }

   /**
   * Get match
   * @return match
  **/
  @ApiModelProperty(value = "")
  public Match getMatch() {
    return match;
  }

  public void setMatch(Match match) {
    this.match = match;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeAdded envelopeAdded = (EnvelopeAdded) o;
    return Objects.equals(this.chatMessage, envelopeAdded.chatMessage) &&
        Objects.equals(this.friend, envelopeAdded.friend) &&
        Objects.equals(this.invite, envelopeAdded.invite) &&
        Objects.equals(this.match, envelopeAdded.match);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chatMessage, friend, invite, match);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeAdded {\n");
    
    sb.append("    chatMessage: ").append(toIndentedString(chatMessage)).append("\n");
    sb.append("    friend: ").append(toIndentedString(friend)).append("\n");
    sb.append("    invite: ").append(toIndentedString(invite)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
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

