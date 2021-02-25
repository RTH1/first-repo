/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineScaleSetVMInstanceView;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2020_10_01_preview.BootDiagnosticsInstanceView;
import java.util.List;
import com.microsoft.azure.management.compute.v2020_10_01_preview.DiskInstanceView;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineExtensionInstanceView;
import com.microsoft.azure.management.compute.v2020_10_01_preview.MaintenanceRedeployStatus;
import com.microsoft.azure.management.compute.v2020_10_01_preview.InstanceViewStatus;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineAgentInstanceView;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineHealthStatus;

class VirtualMachineScaleSetVMInstanceViewImpl extends WrapperImpl<VirtualMachineScaleSetVMInstanceViewInner> implements VirtualMachineScaleSetVMInstanceView {
    private final ComputeManager manager;
    VirtualMachineScaleSetVMInstanceViewImpl(VirtualMachineScaleSetVMInstanceViewInner inner, ComputeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public String assignedHost() {
        return this.inner().assignedHost();
    }

    @Override
    public BootDiagnosticsInstanceView bootDiagnostics() {
        return this.inner().bootDiagnostics();
    }

    @Override
    public List<DiskInstanceView> disks() {
        return this.inner().disks();
    }

    @Override
    public List<VirtualMachineExtensionInstanceView> extensions() {
        return this.inner().extensions();
    }

    @Override
    public MaintenanceRedeployStatus maintenanceRedeployStatus() {
        return this.inner().maintenanceRedeployStatus();
    }

    @Override
    public String placementGroupId() {
        return this.inner().placementGroupId();
    }

    @Override
    public Integer platformFaultDomain() {
        return this.inner().platformFaultDomain();
    }

    @Override
    public Integer platformUpdateDomain() {
        return this.inner().platformUpdateDomain();
    }

    @Override
    public String rdpThumbPrint() {
        return this.inner().rdpThumbPrint();
    }

    @Override
    public List<InstanceViewStatus> statuses() {
        return this.inner().statuses();
    }

    @Override
    public VirtualMachineAgentInstanceView vmAgent() {
        return this.inner().vmAgent();
    }

    @Override
    public VirtualMachineHealthStatus vmHealth() {
        return this.inner().vmHealth();
    }

}
