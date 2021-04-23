// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.streamanalytics.fluent.models.OutputInner;

/** An immutable client-side representation of Output. */
public interface Output {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the datasource property: Describes the data source that output will be written to. Required on PUT
     * (CreateOrReplace) requests.
     *
     * @return the datasource value.
     */
    OutputDataSource datasource();

    /**
     * Gets the timeWindow property: The timeWindow property.
     *
     * @return the timeWindow value.
     */
    String timeWindow();

    /**
     * Gets the sizeWindow property: The sizeWindow property.
     *
     * @return the sizeWindow value.
     */
    Float sizeWindow();

    /**
     * Gets the serialization property: Describes how data from an input is serialized or how data is serialized when
     * written to an output. Required on PUT (CreateOrReplace) requests.
     *
     * @return the serialization value.
     */
    Serialization serialization();

    /**
     * Gets the diagnostics property: Describes conditions applicable to the Input, Output, or the job overall, that
     * warrant customer attention.
     *
     * @return the diagnostics value.
     */
    Diagnostics diagnostics();

    /**
     * Gets the etag property: The current entity tag for the output. This is an opaque string. You can use it to detect
     * whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers
     * for write operations for optimistic concurrency.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the name property: Resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the inner com.azure.resourcemanager.streamanalytics.fluent.models.OutputInner object.
     *
     * @return the inner object.
     */
    OutputInner innerModel();

    /** The entirety of the Output definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Output definition stages. */
    interface DefinitionStages {
        /** The first stage of the Output definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Output definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, jobName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param jobName The name of the streaming job.
             * @return the next definition stage.
             */
            WithCreate withExistingStreamingjob(String resourceGroupName, String jobName);
        }
        /**
         * The stage of the Output definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithDatasource,
                DefinitionStages.WithTimeWindow,
                DefinitionStages.WithSizeWindow,
                DefinitionStages.WithSerialization,
                DefinitionStages.WithName,
                DefinitionStages.WithIfMatch,
                DefinitionStages.WithIfNoneMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Output create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Output create(Context context);
        }
        /** The stage of the Output definition allowing to specify datasource. */
        interface WithDatasource {
            /**
             * Specifies the datasource property: Describes the data source that output will be written to. Required on
             * PUT (CreateOrReplace) requests..
             *
             * @param datasource Describes the data source that output will be written to. Required on PUT
             *     (CreateOrReplace) requests.
             * @return the next definition stage.
             */
            WithCreate withDatasource(OutputDataSource datasource);
        }
        /** The stage of the Output definition allowing to specify timeWindow. */
        interface WithTimeWindow {
            /**
             * Specifies the timeWindow property: The timeWindow property..
             *
             * @param timeWindow The timeWindow property.
             * @return the next definition stage.
             */
            WithCreate withTimeWindow(String timeWindow);
        }
        /** The stage of the Output definition allowing to specify sizeWindow. */
        interface WithSizeWindow {
            /**
             * Specifies the sizeWindow property: The sizeWindow property..
             *
             * @param sizeWindow The sizeWindow property.
             * @return the next definition stage.
             */
            WithCreate withSizeWindow(Float sizeWindow);
        }
        /** The stage of the Output definition allowing to specify serialization. */
        interface WithSerialization {
            /**
             * Specifies the serialization property: Describes how data from an input is serialized or how data is
             * serialized when written to an output. Required on PUT (CreateOrReplace) requests..
             *
             * @param serialization Describes how data from an input is serialized or how data is serialized when
             *     written to an output. Required on PUT (CreateOrReplace) requests.
             * @return the next definition stage.
             */
            WithCreate withSerialization(Serialization serialization);
        }
        /** The stage of the Output definition allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: Resource name.
             *
             * @param name Resource name.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }
        /** The stage of the Output definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The ETag of the output. Omit this value to always overwrite the current
             * output. Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes..
             *
             * @param ifMatch The ETag of the output. Omit this value to always overwrite the current output. Specify
             *     the last-seen ETag value to prevent accidentally overwriting concurrent changes.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
        /** The stage of the Output definition allowing to specify ifNoneMatch. */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: Set to '*' to allow a new output to be created, but to prevent
             * updating an existing output. Other values will result in a 412 Pre-condition Failed response..
             *
             * @param ifNoneMatch Set to '*' to allow a new output to be created, but to prevent updating an existing
             *     output. Other values will result in a 412 Pre-condition Failed response.
             * @return the next definition stage.
             */
            WithCreate withIfNoneMatch(String ifNoneMatch);
        }
    }
    /**
     * Begins update for the Output resource.
     *
     * @return the stage of resource update.
     */
    Output.Update update();

    /** The template for Output update. */
    interface Update
        extends UpdateStages.WithDatasource,
            UpdateStages.WithTimeWindow,
            UpdateStages.WithSizeWindow,
            UpdateStages.WithSerialization,
            UpdateStages.WithName,
            UpdateStages.WithifMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Output apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Output apply(Context context);
    }
    /** The Output update stages. */
    interface UpdateStages {
        /** The stage of the Output update allowing to specify datasource. */
        interface WithDatasource {
            /**
             * Specifies the datasource property: Describes the data source that output will be written to. Required on
             * PUT (CreateOrReplace) requests..
             *
             * @param datasource Describes the data source that output will be written to. Required on PUT
             *     (CreateOrReplace) requests.
             * @return the next definition stage.
             */
            Update withDatasource(OutputDataSource datasource);
        }
        /** The stage of the Output update allowing to specify timeWindow. */
        interface WithTimeWindow {
            /**
             * Specifies the timeWindow property: The timeWindow property..
             *
             * @param timeWindow The timeWindow property.
             * @return the next definition stage.
             */
            Update withTimeWindow(String timeWindow);
        }
        /** The stage of the Output update allowing to specify sizeWindow. */
        interface WithSizeWindow {
            /**
             * Specifies the sizeWindow property: The sizeWindow property..
             *
             * @param sizeWindow The sizeWindow property.
             * @return the next definition stage.
             */
            Update withSizeWindow(Float sizeWindow);
        }
        /** The stage of the Output update allowing to specify serialization. */
        interface WithSerialization {
            /**
             * Specifies the serialization property: Describes how data from an input is serialized or how data is
             * serialized when written to an output. Required on PUT (CreateOrReplace) requests..
             *
             * @param serialization Describes how data from an input is serialized or how data is serialized when
             *     written to an output. Required on PUT (CreateOrReplace) requests.
             * @return the next definition stage.
             */
            Update withSerialization(Serialization serialization);
        }
        /** The stage of the Output update allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: Resource name.
             *
             * @param name Resource name.
             * @return the next definition stage.
             */
            Update withName(String name);
        }
        /** The stage of the Output update allowing to specify ifMatch. */
        interface WithifMatch {
            /**
             * Specifies the ifMatch property: The ETag of the output. Omit this value to always overwrite the current
             * output. Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes..
             *
             * @param ifMatch The ETag of the output. Omit this value to always overwrite the current output. Specify
             *     the last-seen ETag value to prevent accidentally overwriting concurrent changes.
             * @return the next definition stage.
             */
            Update ifMatch(String ifMatch);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Output refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Output refresh(Context context);
}
