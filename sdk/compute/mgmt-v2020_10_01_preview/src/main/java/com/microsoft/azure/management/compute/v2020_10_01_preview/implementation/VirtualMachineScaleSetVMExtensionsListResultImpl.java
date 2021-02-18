/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineScaleSetVMExtensionsListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class VirtualMachineScaleSetVMExtensionsListResultImpl extends WrapperImpl<VirtualMachineScaleSetVMExtensionsListResultInner> implements VirtualMachineScaleSetVMExtensionsListResult {
    private final ComputeManager manager;
    VirtualMachineScaleSetVMExtensionsListResultImpl(VirtualMachineScaleSetVMExtensionsListResultInner inner, ComputeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public List<VirtualMachineScaleSetVMExtensionInner> value() {
        return this.inner().value();
    }

}