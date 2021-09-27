// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for PropertyChangeType.
 */
public enum PropertyChangeType {
    /**
     * Enum value Create.
     */
    CREATE("Create"),

    /**
     * Enum value Delete.
     */
    DELETE("Delete"),

    /**
     * Enum value Modify.
     */
    MODIFY("Modify"),

    /**
     * Enum value Array.
     */
    ARRAY("Array");

    /**
     * The actual serialized value for a PropertyChangeType instance.
     */
    private final String value;

    PropertyChangeType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PropertyChangeType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed PropertyChangeType object, or null if unable to parse.
     */
    @JsonCreator
    public static PropertyChangeType fromString(String value) {
        PropertyChangeType[] items = PropertyChangeType.values();
        for (PropertyChangeType item : items) {
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
