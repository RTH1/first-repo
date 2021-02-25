/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Identifies an object.
 */
public class NameIdentifierInner {
    /**
     * Name of the object.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get name of the object.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the object.
     *
     * @param name the name value to set
     * @return the NameIdentifierInner object itself.
     */
    public NameIdentifierInner withName(String name) {
        this.name = name;
        return this;
    }

}
