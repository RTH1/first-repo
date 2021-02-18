/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Outputs;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.ResourceTestStatus;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Output;

class OutputsImpl extends WrapperImpl<OutputsInner> implements Outputs {
    private final StreamAnalyticsManager manager;

    OutputsImpl(StreamAnalyticsManager manager) {
        super(manager.inner().outputs());
        this.manager = manager;
    }

    public StreamAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public OutputImpl define(String name) {
        return wrapModel(name);
    }

    private OutputImpl wrapModel(OutputInner inner) {
        return  new OutputImpl(inner, manager());
    }

    private OutputImpl wrapModel(String name) {
        return new OutputImpl(name, this.manager());
    }

    @Override
    public Observable<ResourceTestStatus> testAsync(String resourceGroupName, String jobName, String outputName) {
        OutputsInner client = this.inner();
        return client.testAsync(resourceGroupName, jobName, outputName)
        .map(new Func1<ResourceTestStatusInner, ResourceTestStatus>() {
            @Override
            public ResourceTestStatus call(ResourceTestStatusInner inner) {
                return new ResourceTestStatusImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Output> listByStreamingJobAsync(final String resourceGroupName, final String jobName) {
        OutputsInner client = this.inner();
        return client.listByStreamingJobAsync(resourceGroupName, jobName)
        .flatMapIterable(new Func1<Page<OutputInner>, Iterable<OutputInner>>() {
            @Override
            public Iterable<OutputInner> call(Page<OutputInner> page) {
                return page.items();
            }
        })
        .map(new Func1<OutputInner, Output>() {
            @Override
            public Output call(OutputInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Output> getAsync(String resourceGroupName, String jobName, String outputName) {
        OutputsInner client = this.inner();
        return client.getAsync(resourceGroupName, jobName, outputName)
        .flatMap(new Func1<OutputInner, Observable<Output>>() {
            @Override
            public Observable<Output> call(OutputInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Output)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String jobName, String outputName) {
        OutputsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, jobName, outputName).toCompletable();
    }

}