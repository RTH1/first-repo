// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The locator used for joining or taking action on a call. */
@Fluent
public final class CallLocatorModel {
    /*
     * The group call id
     */
    @JsonProperty(value = "groupCallId")
    private String groupCallId;

    /*
     * The server call id.
     */
    @JsonProperty(value = "serverCallId")
    private String serverCallId;

    /*
     * The call locator kind.
     */
    @JsonProperty(value = "kind")
    private CallLocatorKindModel kind;

    /**
     * Get the groupCallId property: The group call id.
     *
     * @return the groupCallId value.
     */
    public String getGroupCallId() {
        return this.groupCallId;
    }

    /**
     * Set the groupCallId property: The group call id.
     *
     * @param groupCallId the groupCallId value to set.
     * @return the CallLocatorModel object itself.
     */
    public CallLocatorModel setGroupCallId(String groupCallId) {
        this.groupCallId = groupCallId;
        return this;
    }

    /**
     * Get the serverCallId property: The server call id.
     *
     * @return the serverCallId value.
     */
    public String getServerCallId() {
        return this.serverCallId;
    }

    /**
     * Set the serverCallId property: The server call id.
     *
     * @param serverCallId the serverCallId value to set.
     * @return the CallLocatorModel object itself.
     */
    public CallLocatorModel setServerCallId(String serverCallId) {
        this.serverCallId = serverCallId;
        return this;
    }

    /**
     * Get the kind property: The call locator kind.
     *
     * @return the kind value.
     */
    public CallLocatorKindModel getKind() {
        return this.kind;
    }

    /**
     * Set the kind property: The call locator kind.
     *
     * @param kind the kind value to set.
     * @return the CallLocatorModel object itself.
     */
    public CallLocatorModel setKind(CallLocatorKindModel kind) {
        this.kind = kind;
        return this;
    }
}
