// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.SecurityAlertPolicyState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Workspace managed Sql server security alert policy. */
@Fluent
public final class ServerSecurityAlertPolicyInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerSecurityAlertPolicyInner.class);

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private ServerSecurityAlertPolicyProperties innerProperties;

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private ServerSecurityAlertPolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the state property: Specifies the state of the policy, whether it is enabled or disabled or a policy has not
     * been applied yet on the specific server.
     *
     * @return the state value.
     */
    public SecurityAlertPolicyState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Specifies the state of the policy, whether it is enabled or disabled or a policy has not
     * been applied yet on the specific server.
     *
     * @param state the state value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withState(SecurityAlertPolicyState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerSecurityAlertPolicyProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the disabledAlerts property: Specifies an array of alerts that are disabled. Allowed values are:
     * Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly, Data_Exfiltration, Unsafe_Action.
     *
     * @return the disabledAlerts value.
     */
    public List<String> disabledAlerts() {
        return this.innerProperties() == null ? null : this.innerProperties().disabledAlerts();
    }

    /**
     * Set the disabledAlerts property: Specifies an array of alerts that are disabled. Allowed values are:
     * Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly, Data_Exfiltration, Unsafe_Action.
     *
     * @param disabledAlerts the disabledAlerts value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withDisabledAlerts(List<String> disabledAlerts) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerSecurityAlertPolicyProperties();
        }
        this.innerProperties().withDisabledAlerts(disabledAlerts);
        return this;
    }

    /**
     * Get the emailAddresses property: Specifies an array of e-mail addresses to which the alert is sent.
     *
     * @return the emailAddresses value.
     */
    public List<String> emailAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().emailAddresses();
    }

    /**
     * Set the emailAddresses property: Specifies an array of e-mail addresses to which the alert is sent.
     *
     * @param emailAddresses the emailAddresses value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withEmailAddresses(List<String> emailAddresses) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerSecurityAlertPolicyProperties();
        }
        this.innerProperties().withEmailAddresses(emailAddresses);
        return this;
    }

    /**
     * Get the emailAccountAdmins property: Specifies that the alert is sent to the account administrators.
     *
     * @return the emailAccountAdmins value.
     */
    public Boolean emailAccountAdmins() {
        return this.innerProperties() == null ? null : this.innerProperties().emailAccountAdmins();
    }

    /**
     * Set the emailAccountAdmins property: Specifies that the alert is sent to the account administrators.
     *
     * @param emailAccountAdmins the emailAccountAdmins value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withEmailAccountAdmins(Boolean emailAccountAdmins) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerSecurityAlertPolicyProperties();
        }
        this.innerProperties().withEmailAccountAdmins(emailAccountAdmins);
        return this;
    }

    /**
     * Get the storageEndpoint property: Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     *
     * @return the storageEndpoint value.
     */
    public String storageEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().storageEndpoint();
    }

    /**
     * Set the storageEndpoint property: Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     *
     * @param storageEndpoint the storageEndpoint value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withStorageEndpoint(String storageEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerSecurityAlertPolicyProperties();
        }
        this.innerProperties().withStorageEndpoint(storageEndpoint);
        return this;
    }

    /**
     * Get the storageAccountAccessKey property: Specifies the identifier key of the Threat Detection audit storage
     * account.
     *
     * @return the storageAccountAccessKey value.
     */
    public String storageAccountAccessKey() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountAccessKey();
    }

    /**
     * Set the storageAccountAccessKey property: Specifies the identifier key of the Threat Detection audit storage
     * account.
     *
     * @param storageAccountAccessKey the storageAccountAccessKey value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withStorageAccountAccessKey(String storageAccountAccessKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerSecurityAlertPolicyProperties();
        }
        this.innerProperties().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    /**
     * Get the retentionDays property: Specifies the number of days to keep in the Threat Detection audit logs.
     *
     * @return the retentionDays value.
     */
    public Integer retentionDays() {
        return this.innerProperties() == null ? null : this.innerProperties().retentionDays();
    }

    /**
     * Set the retentionDays property: Specifies the number of days to keep in the Threat Detection audit logs.
     *
     * @param retentionDays the retentionDays value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withRetentionDays(Integer retentionDays) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerSecurityAlertPolicyProperties();
        }
        this.innerProperties().withRetentionDays(retentionDays);
        return this;
    }

    /**
     * Get the creationTime property: Specifies the UTC creation time of the policy.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTime();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
