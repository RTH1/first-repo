// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment What-if properties.
 */
@Fluent
public final class DeploymentWhatIfProperties extends DeploymentProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(DeploymentWhatIfProperties.class);

    /*
     * Optional What-If operation settings.
     */
    @JsonProperty(value = "whatIfSettings")
    private DeploymentWhatIfSettings whatIfSettings;

    /**
     * Get the whatIfSettings property: Optional What-If operation settings.
     * 
     * @return the whatIfSettings value.
     */
    public DeploymentWhatIfSettings whatIfSettings() {
        return this.whatIfSettings;
    }

    /**
     * Set the whatIfSettings property: Optional What-If operation settings.
     * 
     * @param whatIfSettings the whatIfSettings value to set.
     * @return the DeploymentWhatIfProperties object itself.
     */
    public DeploymentWhatIfProperties withWhatIfSettings(DeploymentWhatIfSettings whatIfSettings) {
        this.whatIfSettings = whatIfSettings;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentWhatIfProperties withTemplate(Object template) {
        super.withTemplate(template);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentWhatIfProperties withTemplateLink(TemplateLink templateLink) {
        super.withTemplateLink(templateLink);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentWhatIfProperties withParameters(Object parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentWhatIfProperties withParametersLink(ParametersLink parametersLink) {
        super.withParametersLink(parametersLink);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentWhatIfProperties withMode(DeploymentMode mode) {
        super.withMode(mode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentWhatIfProperties withDebugSetting(DebugSetting debugSetting) {
        super.withDebugSetting(debugSetting);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentWhatIfProperties withOnErrorDeployment(OnErrorDeployment onErrorDeployment) {
        super.withOnErrorDeployment(onErrorDeployment);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (whatIfSettings() != null) {
            whatIfSettings().validate();
        }
    }
}
