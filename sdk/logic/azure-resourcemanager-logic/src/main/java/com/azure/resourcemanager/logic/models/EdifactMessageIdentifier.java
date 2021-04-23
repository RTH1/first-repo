// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Edifact message identifier. */
@Fluent
public final class EdifactMessageIdentifier {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EdifactMessageIdentifier.class);

    /*
     * The message id on which this envelope settings has to be applied.
     */
    @JsonProperty(value = "messageId", required = true)
    private String messageId;

    /**
     * Get the messageId property: The message id on which this envelope settings has to be applied.
     *
     * @return the messageId value.
     */
    public String messageId() {
        return this.messageId;
    }

    /**
     * Set the messageId property: The message id on which this envelope settings has to be applied.
     *
     * @param messageId the messageId value to set.
     * @return the EdifactMessageIdentifier object itself.
     */
    public EdifactMessageIdentifier withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (messageId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property messageId in model EdifactMessageIdentifier"));
        }
    }
}
