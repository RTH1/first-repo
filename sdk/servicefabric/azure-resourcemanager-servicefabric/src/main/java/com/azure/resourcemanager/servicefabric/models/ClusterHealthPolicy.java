// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Defines a health policy used to evaluate the health of the cluster or of a cluster node. */
@Fluent
public final class ClusterHealthPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterHealthPolicy.class);

    /*
     * The maximum allowed percentage of unhealthy nodes before reporting an
     * error. For example, to allow 10% of nodes to be unhealthy, this value
     * would be 10.
     *
     * The percentage represents the maximum tolerated percentage of nodes that
     * can be unhealthy before the cluster is considered in error.
     * If the percentage is respected but there is at least one unhealthy node,
     * the health is evaluated as Warning.
     * The percentage is calculated by dividing the number of unhealthy nodes
     * over the total number of nodes in the cluster.
     * The computation rounds up to tolerate one failure on small numbers of
     * nodes. Default percentage is zero.
     *
     * In large clusters, some nodes will always be down or out for repairs, so
     * this percentage should be configured to tolerate that.
     *
     */
    @JsonProperty(value = "maxPercentUnhealthyNodes")
    private Integer maxPercentUnhealthyNodes;

    /*
     * The maximum allowed percentage of unhealthy applications before
     * reporting an error. For example, to allow 10% of applications to be
     * unhealthy, this value would be 10.
     *
     * The percentage represents the maximum tolerated percentage of
     * applications that can be unhealthy before the cluster is considered in
     * error.
     * If the percentage is respected but there is at least one unhealthy
     * application, the health is evaluated as Warning.
     * This is calculated by dividing the number of unhealthy applications over
     * the total number of application instances in the cluster, excluding
     * applications of application types that are included in the
     * ApplicationTypeHealthPolicyMap.
     * The computation rounds up to tolerate one failure on small numbers of
     * applications. Default percentage is zero.
     *
     */
    @JsonProperty(value = "maxPercentUnhealthyApplications")
    private Integer maxPercentUnhealthyApplications;

    /*
     * Defines the application health policy map used to evaluate the health of
     * an application or one of its children entities.
     */
    @JsonProperty(value = "applicationHealthPolicies")
    private Map<String, ApplicationHealthPolicy> applicationHealthPolicies;

    /**
     * Get the maxPercentUnhealthyNodes property: The maximum allowed percentage of unhealthy nodes before reporting an
     * error. For example, to allow 10% of nodes to be unhealthy, this value would be 10.
     *
     * <p>The percentage represents the maximum tolerated percentage of nodes that can be unhealthy before the cluster
     * is considered in error. If the percentage is respected but there is at least one unhealthy node, the health is
     * evaluated as Warning. The percentage is calculated by dividing the number of unhealthy nodes over the total
     * number of nodes in the cluster. The computation rounds up to tolerate one failure on small numbers of nodes.
     * Default percentage is zero.
     *
     * <p>In large clusters, some nodes will always be down or out for repairs, so this percentage should be configured
     * to tolerate that.
     *
     * @return the maxPercentUnhealthyNodes value.
     */
    public Integer maxPercentUnhealthyNodes() {
        return this.maxPercentUnhealthyNodes;
    }

    /**
     * Set the maxPercentUnhealthyNodes property: The maximum allowed percentage of unhealthy nodes before reporting an
     * error. For example, to allow 10% of nodes to be unhealthy, this value would be 10.
     *
     * <p>The percentage represents the maximum tolerated percentage of nodes that can be unhealthy before the cluster
     * is considered in error. If the percentage is respected but there is at least one unhealthy node, the health is
     * evaluated as Warning. The percentage is calculated by dividing the number of unhealthy nodes over the total
     * number of nodes in the cluster. The computation rounds up to tolerate one failure on small numbers of nodes.
     * Default percentage is zero.
     *
     * <p>In large clusters, some nodes will always be down or out for repairs, so this percentage should be configured
     * to tolerate that.
     *
     * @param maxPercentUnhealthyNodes the maxPercentUnhealthyNodes value to set.
     * @return the ClusterHealthPolicy object itself.
     */
    public ClusterHealthPolicy withMaxPercentUnhealthyNodes(Integer maxPercentUnhealthyNodes) {
        this.maxPercentUnhealthyNodes = maxPercentUnhealthyNodes;
        return this;
    }

    /**
     * Get the maxPercentUnhealthyApplications property: The maximum allowed percentage of unhealthy applications before
     * reporting an error. For example, to allow 10% of applications to be unhealthy, this value would be 10.
     *
     * <p>The percentage represents the maximum tolerated percentage of applications that can be unhealthy before the
     * cluster is considered in error. If the percentage is respected but there is at least one unhealthy application,
     * the health is evaluated as Warning. This is calculated by dividing the number of unhealthy applications over the
     * total number of application instances in the cluster, excluding applications of application types that are
     * included in the ApplicationTypeHealthPolicyMap. The computation rounds up to tolerate one failure on small
     * numbers of applications. Default percentage is zero.
     *
     * @return the maxPercentUnhealthyApplications value.
     */
    public Integer maxPercentUnhealthyApplications() {
        return this.maxPercentUnhealthyApplications;
    }

    /**
     * Set the maxPercentUnhealthyApplications property: The maximum allowed percentage of unhealthy applications before
     * reporting an error. For example, to allow 10% of applications to be unhealthy, this value would be 10.
     *
     * <p>The percentage represents the maximum tolerated percentage of applications that can be unhealthy before the
     * cluster is considered in error. If the percentage is respected but there is at least one unhealthy application,
     * the health is evaluated as Warning. This is calculated by dividing the number of unhealthy applications over the
     * total number of application instances in the cluster, excluding applications of application types that are
     * included in the ApplicationTypeHealthPolicyMap. The computation rounds up to tolerate one failure on small
     * numbers of applications. Default percentage is zero.
     *
     * @param maxPercentUnhealthyApplications the maxPercentUnhealthyApplications value to set.
     * @return the ClusterHealthPolicy object itself.
     */
    public ClusterHealthPolicy withMaxPercentUnhealthyApplications(Integer maxPercentUnhealthyApplications) {
        this.maxPercentUnhealthyApplications = maxPercentUnhealthyApplications;
        return this;
    }

    /**
     * Get the applicationHealthPolicies property: Defines the application health policy map used to evaluate the health
     * of an application or one of its children entities.
     *
     * @return the applicationHealthPolicies value.
     */
    public Map<String, ApplicationHealthPolicy> applicationHealthPolicies() {
        return this.applicationHealthPolicies;
    }

    /**
     * Set the applicationHealthPolicies property: Defines the application health policy map used to evaluate the health
     * of an application or one of its children entities.
     *
     * @param applicationHealthPolicies the applicationHealthPolicies value to set.
     * @return the ClusterHealthPolicy object itself.
     */
    public ClusterHealthPolicy withApplicationHealthPolicies(
        Map<String, ApplicationHealthPolicy> applicationHealthPolicies) {
        this.applicationHealthPolicies = applicationHealthPolicies;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (applicationHealthPolicies() != null) {
            applicationHealthPolicies()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
