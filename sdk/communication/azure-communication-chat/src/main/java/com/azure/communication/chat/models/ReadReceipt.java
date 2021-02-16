// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.models;

import com.azure.communication.common.CommunicationUserIdentifier;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The ReadReceipt model. */
@Fluent
public final class ReadReceipt {
    /*
     * Read receipt sender id.
     */
    @JsonProperty(value = "sender", access = JsonProperty.Access.WRITE_ONLY)
    private CommunicationUserIdentifier sender;

    /*
     * Id for the chat message that has been read. This id is generated by the
     * server.
     */
    @JsonProperty(value = "chatMessageId", access = JsonProperty.Access.WRITE_ONLY)
    private String chatMessageId;

    /*
     * Read receipt timestamp. The timestamp is in ISO8601 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "readOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime readOn;

    /**
     * Get the sender property: Read receipt sender.
     *
     * @return the sender value.
     */
    public CommunicationUserIdentifier getSender() {
        return this.sender;
    }

    /**
     * Set the sender property: Read receipt sender.
     *
     * @param sender the sender value to set.
     * @return the ChatThreadMember object itself.
     */
    public ReadReceipt setSender(CommunicationUserIdentifier sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Get the chatMessageId property: Id for the chat message that has been read. This id is generated by the server.
     *
     * @return the chatMessageId value.
     */
    public String getChatMessageId() {
        return this.chatMessageId;
    }

    /**
     * Set the chatMessageId property: Id for the chat message that has been read. This id is generated by the server.
     *
     * @param chatMessageId the chatMessageId value to set.
     * @return the ChatThreadMember object itself.
     */
    public ReadReceipt setChatMessageId(String chatMessageId) {
        this.chatMessageId = chatMessageId;
        return this;
    }

    /**
     * Get the readOn property: Read receipt timestamp. The timestamp is in ISO8601 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the readOn value.
     */
    public OffsetDateTime getReadOn() {
        return this.readOn;
    }

    /**
     * Set the readOn property: Read receipt timestamp. The timestamp is in ISO8601 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param readOn the readOn value to set.
     * @return the ChatThreadMember object itself.
     */
    public ReadReceipt setReadOn(OffsetDateTime readOn) {
        this.readOn = readOn;
        return this;
    }
}