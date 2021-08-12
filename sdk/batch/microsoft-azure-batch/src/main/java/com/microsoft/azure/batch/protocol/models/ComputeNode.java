/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Compute Node in the Batch service.
 */
public class ComputeNode {
    /**
     * The ID of the Compute Node.
     * Every Compute Node that is added to a Pool is assigned a unique ID.
     * Whenever a Compute Node is removed from a Pool, all of its local files
     * are deleted, and the ID is reclaimed and could be reused for new Compute
     * Nodes.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The URL of the Compute Node.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * The current state of the Compute Node.
     * The low-priority Compute Node has been preempted. Tasks which were
     * running on the Compute Node when it was preempted will be rescheduled
     * when another Compute Node becomes available. Possible values include:
     * 'idle', 'rebooting', 'reimaging', 'running', 'unusable', 'creating',
     * 'starting', 'waitingForStartTask', 'startTaskFailed', 'unknown',
     * 'leavingPool', 'offline', 'preempted'.
     */
    @JsonProperty(value = "state")
    private ComputeNodeState state;

    /**
     * Whether the Compute Node is available for Task scheduling.
     * Possible values include: 'enabled', 'disabled'.
     */
    @JsonProperty(value = "schedulingState")
    private SchedulingState schedulingState;

    /**
     * The time at which the Compute Node entered its current state.
     */
    @JsonProperty(value = "stateTransitionTime")
    private DateTime stateTransitionTime;

    /**
     * The last time at which the Compute Node was started.
     * This property may not be present if the Compute Node state is unusable.
     */
    @JsonProperty(value = "lastBootTime")
    private DateTime lastBootTime;

    /**
     * The time at which this Compute Node was allocated to the Pool.
     * This is the time when the Compute Node was initially allocated and
     * doesn't change once set. It is not updated when the Compute Node is
     * service healed or preempted.
     */
    @JsonProperty(value = "allocationTime")
    private DateTime allocationTime;

    /**
     * The IP address that other Nodes can use to communicate with this Compute
     * Node.
     * Every Compute Node that is added to a Pool is assigned a unique IP
     * address. Whenever a Compute Node is removed from a Pool, all of its
     * local files are deleted, and the IP address is reclaimed and could be
     * reused for new Compute Nodes.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /**
     * An identifier which can be passed when adding a Task to request that the
     * Task be scheduled on this Compute Node.
     * Note that this is just a soft affinity. If the target Compute Node is
     * busy or unavailable at the time the Task is scheduled, then the Task
     * will be scheduled elsewhere.
     */
    @JsonProperty(value = "affinityId")
    private String affinityId;

    /**
     * The size of the virtual machine hosting the Compute Node.
     * For information about available sizes of virtual machines in Pools, see
     * Choose a VM size for Compute Nodes in an Azure Batch Pool
     * (https://docs.microsoft.com/azure/batch/batch-pool-vm-sizes).
     */
    @JsonProperty(value = "vmSize")
    private String vmSize;

    /**
     * The total number of Job Tasks completed on the Compute Node. This
     * includes Job Manager Tasks and normal Tasks, but not Job Preparation,
     * Job Release or Start Tasks.
     */
    @JsonProperty(value = "totalTasksRun")
    private Integer totalTasksRun;

    /**
     * The total number of currently running Job Tasks on the Compute Node.
     * This includes Job Manager Tasks and normal Tasks, but not Job
     * Preparation, Job Release or Start Tasks.
     */
    @JsonProperty(value = "runningTasksCount")
    private Integer runningTasksCount;

    /**
     * The total number of scheduling slots used by currently running Job Tasks
     * on the Compute Node. This includes Job Manager Tasks and normal Tasks,
     * but not Job Preparation, Job Release or Start Tasks.
     */
    @JsonProperty(value = "runningTaskSlotsCount")
    private Integer runningTaskSlotsCount;

    /**
     * The total number of Job Tasks which completed successfully (with
     * exitCode 0) on the Compute Node. This includes Job Manager Tasks and
     * normal Tasks, but not Job Preparation, Job Release or Start Tasks.
     */
    @JsonProperty(value = "totalTasksSucceeded")
    private Integer totalTasksSucceeded;

    /**
     * A list of Tasks whose state has recently changed.
     * This property is present only if at least one Task has run on this
     * Compute Node since it was assigned to the Pool.
     */
    @JsonProperty(value = "recentTasks")
    private List<TaskInformation> recentTasks;

    /**
     * The Task specified to run on the Compute Node as it joins the Pool.
     */
    @JsonProperty(value = "startTask")
    private StartTask startTask;

    /**
     * Runtime information about the execution of the StartTask on the Compute
     * Node.
     */
    @JsonProperty(value = "startTaskInfo")
    private StartTaskInformation startTaskInfo;

    /**
     * The list of Certificates installed on the Compute Node.
     * For Windows Nodes, the Batch service installs the Certificates to the
     * specified Certificate store and location. For Linux Compute Nodes, the
     * Certificates are stored in a directory inside the Task working directory
     * and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the
     * Task to query for this location. For Certificates with visibility of
     * 'remoteUser', a 'certs' directory is created in the user's home
     * directory (e.g., /home/{user-name}/certs) and Certificates are placed in
     * that directory.
     */
    @JsonProperty(value = "certificateReferences")
    private List<CertificateReference> certificateReferences;

    /**
     * The list of errors that are currently being encountered by the Compute
     * Node.
     */
    @JsonProperty(value = "errors")
    private List<ComputeNodeError> errors;

    /**
     * Whether this Compute Node is a dedicated Compute Node. If false, the
     * Compute Node is a low-priority Compute Node.
     */
    @JsonProperty(value = "isDedicated")
    private Boolean isDedicated;

    /**
     * The endpoint configuration for the Compute Node.
     */
    @JsonProperty(value = "endpointConfiguration")
    private ComputeNodeEndpointConfiguration endpointConfiguration;

    /**
     * Information about the Compute Node agent version and the time the
     * Compute Node upgraded to a new version.
     */
    @JsonProperty(value = "nodeAgentInfo")
    private NodeAgentInformation nodeAgentInfo;

    /**
     * Info about the current state of the virtual machine.
     */
    @JsonProperty(value = "virtualMachineInfo")
    private VirtualMachineInfo virtualMachineInfo;

    /**
     * Get every Compute Node that is added to a Pool is assigned a unique ID. Whenever a Compute Node is removed from a Pool, all of its local files are deleted, and the ID is reclaimed and could be reused for new Compute Nodes.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set every Compute Node that is added to a Pool is assigned a unique ID. Whenever a Compute Node is removed from a Pool, all of its local files are deleted, and the ID is reclaimed and could be reused for new Compute Nodes.
     *
     * @param id the id value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the low-priority Compute Node has been preempted. Tasks which were running on the Compute Node when it was preempted will be rescheduled when another Compute Node becomes available. Possible values include: 'idle', 'rebooting', 'reimaging', 'running', 'unusable', 'creating', 'starting', 'waitingForStartTask', 'startTaskFailed', 'unknown', 'leavingPool', 'offline', 'preempted'.
     *
     * @return the state value
     */
    public ComputeNodeState state() {
        return this.state;
    }

    /**
     * Set the low-priority Compute Node has been preempted. Tasks which were running on the Compute Node when it was preempted will be rescheduled when another Compute Node becomes available. Possible values include: 'idle', 'rebooting', 'reimaging', 'running', 'unusable', 'creating', 'starting', 'waitingForStartTask', 'startTaskFailed', 'unknown', 'leavingPool', 'offline', 'preempted'.
     *
     * @param state the state value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withState(ComputeNodeState state) {
        this.state = state;
        return this;
    }

    /**
     * Get possible values include: 'enabled', 'disabled'.
     *
     * @return the schedulingState value
     */
    public SchedulingState schedulingState() {
        return this.schedulingState;
    }

    /**
     * Set possible values include: 'enabled', 'disabled'.
     *
     * @param schedulingState the schedulingState value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withSchedulingState(SchedulingState schedulingState) {
        this.schedulingState = schedulingState;
        return this;
    }

    /**
     * Get the stateTransitionTime value.
     *
     * @return the stateTransitionTime value
     */
    public DateTime stateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Set the stateTransitionTime value.
     *
     * @param stateTransitionTime the stateTransitionTime value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withStateTransitionTime(DateTime stateTransitionTime) {
        this.stateTransitionTime = stateTransitionTime;
        return this;
    }

    /**
     * Get this property may not be present if the Compute Node state is unusable.
     *
     * @return the lastBootTime value
     */
    public DateTime lastBootTime() {
        return this.lastBootTime;
    }

    /**
     * Set this property may not be present if the Compute Node state is unusable.
     *
     * @param lastBootTime the lastBootTime value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withLastBootTime(DateTime lastBootTime) {
        this.lastBootTime = lastBootTime;
        return this;
    }

    /**
     * Get this is the time when the Compute Node was initially allocated and doesn't change once set. It is not updated when the Compute Node is service healed or preempted.
     *
     * @return the allocationTime value
     */
    public DateTime allocationTime() {
        return this.allocationTime;
    }

    /**
     * Set this is the time when the Compute Node was initially allocated and doesn't change once set. It is not updated when the Compute Node is service healed or preempted.
     *
     * @param allocationTime the allocationTime value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withAllocationTime(DateTime allocationTime) {
        this.allocationTime = allocationTime;
        return this;
    }

    /**
     * Get every Compute Node that is added to a Pool is assigned a unique IP address. Whenever a Compute Node is removed from a Pool, all of its local files are deleted, and the IP address is reclaimed and could be reused for new Compute Nodes.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set every Compute Node that is added to a Pool is assigned a unique IP address. Whenever a Compute Node is removed from a Pool, all of its local files are deleted, and the IP address is reclaimed and could be reused for new Compute Nodes.
     *
     * @param ipAddress the ipAddress value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get note that this is just a soft affinity. If the target Compute Node is busy or unavailable at the time the Task is scheduled, then the Task will be scheduled elsewhere.
     *
     * @return the affinityId value
     */
    public String affinityId() {
        return this.affinityId;
    }

    /**
     * Set note that this is just a soft affinity. If the target Compute Node is busy or unavailable at the time the Task is scheduled, then the Task will be scheduled elsewhere.
     *
     * @param affinityId the affinityId value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withAffinityId(String affinityId) {
        this.affinityId = affinityId;
        return this;
    }

    /**
     * Get for information about available sizes of virtual machines in Pools, see Choose a VM size for Compute Nodes in an Azure Batch Pool (https://docs.microsoft.com/azure/batch/batch-pool-vm-sizes).
     *
     * @return the vmSize value
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set for information about available sizes of virtual machines in Pools, see Choose a VM size for Compute Nodes in an Azure Batch Pool (https://docs.microsoft.com/azure/batch/batch-pool-vm-sizes).
     *
     * @param vmSize the vmSize value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the totalTasksRun value.
     *
     * @return the totalTasksRun value
     */
    public Integer totalTasksRun() {
        return this.totalTasksRun;
    }

    /**
     * Set the totalTasksRun value.
     *
     * @param totalTasksRun the totalTasksRun value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withTotalTasksRun(Integer totalTasksRun) {
        this.totalTasksRun = totalTasksRun;
        return this;
    }

    /**
     * Get the runningTasksCount value.
     *
     * @return the runningTasksCount value
     */
    public Integer runningTasksCount() {
        return this.runningTasksCount;
    }

    /**
     * Set the runningTasksCount value.
     *
     * @param runningTasksCount the runningTasksCount value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withRunningTasksCount(Integer runningTasksCount) {
        this.runningTasksCount = runningTasksCount;
        return this;
    }

    /**
     * Get the runningTaskSlotsCount value.
     *
     * @return the runningTaskSlotsCount value
     */
    public Integer runningTaskSlotsCount() {
        return this.runningTaskSlotsCount;
    }

    /**
     * Set the runningTaskSlotsCount value.
     *
     * @param runningTaskSlotsCount the runningTaskSlotsCount value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withRunningTaskSlotsCount(Integer runningTaskSlotsCount) {
        this.runningTaskSlotsCount = runningTaskSlotsCount;
        return this;
    }

    /**
     * Get the totalTasksSucceeded value.
     *
     * @return the totalTasksSucceeded value
     */
    public Integer totalTasksSucceeded() {
        return this.totalTasksSucceeded;
    }

    /**
     * Set the totalTasksSucceeded value.
     *
     * @param totalTasksSucceeded the totalTasksSucceeded value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withTotalTasksSucceeded(Integer totalTasksSucceeded) {
        this.totalTasksSucceeded = totalTasksSucceeded;
        return this;
    }

    /**
     * Get this property is present only if at least one Task has run on this Compute Node since it was assigned to the Pool.
     *
     * @return the recentTasks value
     */
    public List<TaskInformation> recentTasks() {
        return this.recentTasks;
    }

    /**
     * Set this property is present only if at least one Task has run on this Compute Node since it was assigned to the Pool.
     *
     * @param recentTasks the recentTasks value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withRecentTasks(List<TaskInformation> recentTasks) {
        this.recentTasks = recentTasks;
        return this;
    }

    /**
     * Get the startTask value.
     *
     * @return the startTask value
     */
    public StartTask startTask() {
        return this.startTask;
    }

    /**
     * Set the startTask value.
     *
     * @param startTask the startTask value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withStartTask(StartTask startTask) {
        this.startTask = startTask;
        return this;
    }

    /**
     * Get the startTaskInfo value.
     *
     * @return the startTaskInfo value
     */
    public StartTaskInformation startTaskInfo() {
        return this.startTaskInfo;
    }

    /**
     * Set the startTaskInfo value.
     *
     * @param startTaskInfo the startTaskInfo value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withStartTaskInfo(StartTaskInformation startTaskInfo) {
        this.startTaskInfo = startTaskInfo;
        return this;
    }

    /**
     * Get for Windows Nodes, the Batch service installs the Certificates to the specified Certificate store and location. For Linux Compute Nodes, the Certificates are stored in a directory inside the Task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the Task to query for this location. For Certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g., /home/{user-name}/certs) and Certificates are placed in that directory.
     *
     * @return the certificateReferences value
     */
    public List<CertificateReference> certificateReferences() {
        return this.certificateReferences;
    }

    /**
     * Set for Windows Nodes, the Batch service installs the Certificates to the specified Certificate store and location. For Linux Compute Nodes, the Certificates are stored in a directory inside the Task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the Task to query for this location. For Certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g., /home/{user-name}/certs) and Certificates are placed in that directory.
     *
     * @param certificateReferences the certificateReferences value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withCertificateReferences(List<CertificateReference> certificateReferences) {
        this.certificateReferences = certificateReferences;
        return this;
    }

    /**
     * Get the errors value.
     *
     * @return the errors value
     */
    public List<ComputeNodeError> errors() {
        return this.errors;
    }

    /**
     * Set the errors value.
     *
     * @param errors the errors value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withErrors(List<ComputeNodeError> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the isDedicated value.
     *
     * @return the isDedicated value
     */
    public Boolean isDedicated() {
        return this.isDedicated;
    }

    /**
     * Set the isDedicated value.
     *
     * @param isDedicated the isDedicated value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withIsDedicated(Boolean isDedicated) {
        this.isDedicated = isDedicated;
        return this;
    }

    /**
     * Get the endpointConfiguration value.
     *
     * @return the endpointConfiguration value
     */
    public ComputeNodeEndpointConfiguration endpointConfiguration() {
        return this.endpointConfiguration;
    }

    /**
     * Set the endpointConfiguration value.
     *
     * @param endpointConfiguration the endpointConfiguration value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withEndpointConfiguration(ComputeNodeEndpointConfiguration endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
        return this;
    }

    /**
     * Get the nodeAgentInfo value.
     *
     * @return the nodeAgentInfo value
     */
    public NodeAgentInformation nodeAgentInfo() {
        return this.nodeAgentInfo;
    }

    /**
     * Set the nodeAgentInfo value.
     *
     * @param nodeAgentInfo the nodeAgentInfo value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withNodeAgentInfo(NodeAgentInformation nodeAgentInfo) {
        this.nodeAgentInfo = nodeAgentInfo;
        return this;
    }

    /**
     * Get the virtualMachineInfo value.
     *
     * @return the virtualMachineInfo value
     */
    public VirtualMachineInfo virtualMachineInfo() {
        return this.virtualMachineInfo;
    }

    /**
     * Set the virtualMachineInfo value.
     *
     * @param virtualMachineInfo the virtualMachineInfo value to set
     * @return the ComputeNode object itself.
     */
    public ComputeNode withVirtualMachineInfo(VirtualMachineInfo virtualMachineInfo) {
        this.virtualMachineInfo = virtualMachineInfo;
        return this;
    }

}
