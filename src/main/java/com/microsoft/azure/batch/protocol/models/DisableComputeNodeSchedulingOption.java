/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DisableComputeNodeSchedulingOption.
 */
public enum DisableComputeNodeSchedulingOption {
    /** Enum value requeue. */
    REQUEUE("requeue"),

    /** Enum value terminate. */
    TERMINATE("terminate"),

    /** Enum value taskcompletion. */
    TASKCOMPLETION("taskcompletion");

    /** The actual serialized value for a DisableComputeNodeSchedulingOption instance. */
    private String value;

    DisableComputeNodeSchedulingOption(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DisableComputeNodeSchedulingOption instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DisableComputeNodeSchedulingOption object, or null if unable to parse.
     */
    @JsonCreator
    public static DisableComputeNodeSchedulingOption fromString(String value) {
        DisableComputeNodeSchedulingOption[] items = DisableComputeNodeSchedulingOption.values();
        for (DisableComputeNodeSchedulingOption item : items) {
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
