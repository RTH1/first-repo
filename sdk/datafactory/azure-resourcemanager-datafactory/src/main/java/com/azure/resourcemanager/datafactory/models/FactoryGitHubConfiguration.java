// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Factory's GitHub repo information. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("FactoryGitHubConfiguration")
@Fluent
public final class FactoryGitHubConfiguration extends FactoryRepoConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FactoryGitHubConfiguration.class);

    /*
     * GitHub Enterprise host name. For example: https://github.mydomain.com
     */
    @JsonProperty(value = "hostName")
    private String hostname;

    /*
     * GitHub bring your own app client id.
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /*
     * GitHub bring your own app client secret information.
     */
    @JsonProperty(value = "clientSecret")
    private GitHubClientSecret clientSecret;

    /**
     * Get the hostname property: GitHub Enterprise host name. For example: https://github.mydomain.com.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: GitHub Enterprise host name. For example: https://github.mydomain.com.
     *
     * @param hostname the hostname value to set.
     * @return the FactoryGitHubConfiguration object itself.
     */
    public FactoryGitHubConfiguration withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the clientId property: GitHub bring your own app client id.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: GitHub bring your own app client id.
     *
     * @param clientId the clientId value to set.
     * @return the FactoryGitHubConfiguration object itself.
     */
    public FactoryGitHubConfiguration withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: GitHub bring your own app client secret information.
     *
     * @return the clientSecret value.
     */
    public GitHubClientSecret clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: GitHub bring your own app client secret information.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the FactoryGitHubConfiguration object itself.
     */
    public FactoryGitHubConfiguration withClientSecret(GitHubClientSecret clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FactoryGitHubConfiguration withAccountName(String accountName) {
        super.withAccountName(accountName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FactoryGitHubConfiguration withRepositoryName(String repositoryName) {
        super.withRepositoryName(repositoryName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FactoryGitHubConfiguration withCollaborationBranch(String collaborationBranch) {
        super.withCollaborationBranch(collaborationBranch);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FactoryGitHubConfiguration withRootFolder(String rootFolder) {
        super.withRootFolder(rootFolder);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FactoryGitHubConfiguration withLastCommitId(String lastCommitId) {
        super.withLastCommitId(lastCommitId);
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
        if (clientSecret() != null) {
            clientSecret().validate();
        }
    }
}
