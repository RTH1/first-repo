// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ActionsRequired. */
public final class ActionsRequired extends ExpandableStringEnum<ActionsRequired> {
    /** Static value None for ActionsRequired. */
    public static final ActionsRequired NONE = fromString("None");

    /** Static value Recreate for ActionsRequired. */
    public static final ActionsRequired RECREATE = fromString("Recreate");

    /**
     * Creates or finds a ActionsRequired from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ActionsRequired.
     */
    @JsonCreator
    public static ActionsRequired fromString(String name) {
        return fromString(name, ActionsRequired.class);
    }

    /** @return known ActionsRequired values. */
    public static Collection<ActionsRequired> values() {
        return values(ActionsRequired.class);
    }
}
