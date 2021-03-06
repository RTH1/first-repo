// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub;

import com.azure.core.util.Context;
import com.azure.resourcemanager.iothub.models.RoutingMessage;
import com.azure.resourcemanager.iothub.models.RoutingSource;
import com.azure.resourcemanager.iothub.models.TestAllRoutesInput;
import java.util.HashMap;
import java.util.Map;

/** Samples for IotHubResource TestAllRoutes. */
public final class IotHubResourceTestAllRoutesSamples {
    /**
     * Sample code: IotHubResource_TestAllRoutes.
     *
     * @param iotHubManager Entry point to IotHubManager. Use this API to manage the IoT hubs in your Azure
     *     subscription.
     */
    public static void iotHubResourceTestAllRoutes(com.azure.resourcemanager.iothub.IotHubManager iotHubManager) {
        iotHubManager
            .iotHubResources()
            .testAllRoutesWithResponse(
                "testHub",
                "myResourceGroup",
                new TestAllRoutesInput()
                    .withRoutingSource(RoutingSource.DEVICE_MESSAGES)
                    .withMessage(
                        new RoutingMessage()
                            .withBody("Body of message")
                            .withAppProperties(mapOf("key1", "value1"))
                            .withSystemProperties(mapOf("key1", "value1"))),
                Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
