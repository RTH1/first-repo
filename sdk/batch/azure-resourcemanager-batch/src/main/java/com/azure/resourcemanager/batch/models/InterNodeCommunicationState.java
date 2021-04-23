// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for InterNodeCommunicationState. */
public enum InterNodeCommunicationState {
    /** Enum value Enabled. */
    ENABLED("Enabled"),

    /** Enum value Disabled. */
    DISABLED("Disabled");

    /** The actual serialized value for a InterNodeCommunicationState instance. */
    private final String value;

    InterNodeCommunicationState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a InterNodeCommunicationState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed InterNodeCommunicationState object, or null if unable to parse.
     */
    @JsonCreator
    public static InterNodeCommunicationState fromString(String value) {
        InterNodeCommunicationState[] items = InterNodeCommunicationState.values();
        for (InterNodeCommunicationState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
