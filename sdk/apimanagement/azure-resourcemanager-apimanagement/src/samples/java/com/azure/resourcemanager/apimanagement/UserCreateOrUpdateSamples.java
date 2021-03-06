// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.resourcemanager.apimanagement.models.Confirmation;

/** Samples for User CreateOrUpdate. */
public final class UserCreateOrUpdateSamples {
    /*
     * operationId: User_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateUser
     */
    /**
     * Sample code: ApiManagementCreateUser.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateUser(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .users()
            .define("5931a75ae4bbd512288c680b")
            .withExistingService("rg1", "apimService1")
            .withEmail("foobar@outlook.com")
            .withFirstName("foo")
            .withLastName("bar")
            .withConfirmation(Confirmation.SIGNUP)
            .create();
    }
}
