// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.fluent.models.DomainTopicInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of the List Domain Topics operation. */
@Fluent
public final class DomainTopicsListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DomainTopicsListResult.class);

    /*
     * A collection of Domain Topics.
     */
    @JsonProperty(value = "value")
    private List<DomainTopicInner> value;

    /*
     * A link for the next page of domain topics.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A collection of Domain Topics.
     *
     * @return the value value.
     */
    public List<DomainTopicInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of Domain Topics.
     *
     * @param value the value value to set.
     * @return the DomainTopicsListResult object itself.
     */
    public DomainTopicsListResult withValue(List<DomainTopicInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A link for the next page of domain topics.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A link for the next page of domain topics.
     *
     * @param nextLink the nextLink value to set.
     * @return the DomainTopicsListResult object itself.
     */
    public DomainTopicsListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
