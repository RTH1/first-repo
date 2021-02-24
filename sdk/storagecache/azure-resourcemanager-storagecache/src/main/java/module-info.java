// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.storagecache {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.storagecache;
    exports com.azure.resourcemanager.storagecache.fluent;
    exports com.azure.resourcemanager.storagecache.fluent.models;
    exports com.azure.resourcemanager.storagecache.models;

    opens com.azure.resourcemanager.storagecache.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.storagecache.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}