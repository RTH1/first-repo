// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight;

import com.azure.core.util.Context;

/** Samples for Clusters List. */
public final class ClustersListSamples {
    /**
     * Sample code: Get All Hadoop on Linux clusters.
     *
     * @param manager Entry point to HDInsightManager.
     */
    public static void getAllHadoopOnLinuxClusters(com.azure.resourcemanager.hdinsight.HDInsightManager manager) {
        manager.clusters().list(Context.NONE);
    }
}
