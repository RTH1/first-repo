// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MigrationState. */
public final class MigrationState extends ExpandableStringEnum<MigrationState> {
    /** Static value InProgress for MigrationState. */
    public static final MigrationState IN_PROGRESS = fromString("InProgress");

    /** Static value Completed for MigrationState. */
    public static final MigrationState COMPLETED = fromString("Completed");

    /**
     * Creates or finds a MigrationState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MigrationState.
     */
    @JsonCreator
    public static MigrationState fromString(String name) {
        return fromString(name, MigrationState.class);
    }

    /** @return known MigrationState values. */
    public static Collection<MigrationState> values() {
        return values(MigrationState.class);
    }
}
