// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The audio routing group request. */
@Fluent
public final class AudioRoutingGroupRequest {
    /*
     * The audio routing mode.
     */
    @JsonProperty(value = "audioRoutingMode")
    private AudioRoutingMode audioRoutingMode;

    /*
     * The target identities that would be receivers in the audio routing
     * group.
     */
    @JsonProperty(value = "targets")
    private List<CommunicationIdentifierModel> targets;

    /**
     * Get the audioRoutingMode property: The audio routing mode.
     *
     * @return the audioRoutingMode value.
     */
    public AudioRoutingMode getAudioRoutingMode() {
        return this.audioRoutingMode;
    }

    /**
     * Set the audioRoutingMode property: The audio routing mode.
     *
     * @param audioRoutingMode the audioRoutingMode value to set.
     * @return the AudioRoutingGroupRequest object itself.
     */
    public AudioRoutingGroupRequest setAudioRoutingMode(AudioRoutingMode audioRoutingMode) {
        this.audioRoutingMode = audioRoutingMode;
        return this;
    }

    /**
     * Get the targets property: The target identities that would be receivers in the audio routing group.
     *
     * @return the targets value.
     */
    public List<CommunicationIdentifierModel> getTargets() {
        return this.targets;
    }

    /**
     * Set the targets property: The target identities that would be receivers in the audio routing group.
     *
     * @param targets the targets value to set.
     * @return the AudioRoutingGroupRequest object itself.
     */
    public AudioRoutingGroupRequest setTargets(List<CommunicationIdentifierModel> targets) {
        this.targets = targets;
        return this;
    }
}
