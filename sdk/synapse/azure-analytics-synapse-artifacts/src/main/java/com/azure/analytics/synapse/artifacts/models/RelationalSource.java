// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity source for various relational databases. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("RelationalSource")
@Fluent
public final class RelationalSource extends CopySource {
    /*
     * Database query. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /*
     * Specifies the additional columns to be added to source data. Type: array
     * of objects(AdditionalColumns) (or Expression with resultType array of
     * objects).
     */
    @JsonProperty(value = "additionalColumns")
    private Object additionalColumns;

    /**
     * Get the query property: Database query. Type: string (or Expression with resultType string).
     *
     * @return the query value.
     */
    public Object getQuery() {
        return this.query;
    }

    /**
     * Set the query property: Database query. Type: string (or Expression with resultType string).
     *
     * @param query the query value to set.
     * @return the RelationalSource object itself.
     */
    public RelationalSource setQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     *
     * @return the additionalColumns value.
     */
    public Object getAdditionalColumns() {
        return this.additionalColumns;
    }

    /**
     * Set the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     *
     * @param additionalColumns the additionalColumns value to set.
     * @return the RelationalSource object itself.
     */
    public RelationalSource setAdditionalColumns(Object additionalColumns) {
        this.additionalColumns = additionalColumns;
        return this;
    }
}
