// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

/** Samples for Jobs GetByResourceGroup. */
public final class JobsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/databox/resource-manager/Microsoft.DataBox/stable/2021-03-01/examples/JobsGet.json
     */
    /**
     * Sample code: JobsGet.
     *
     * @param manager Entry point to DataBoxManager.
     */
    public static void jobsGet(com.azure.resourcemanager.databox.DataBoxManager manager) {
        manager
            .jobs()
            .getByResourceGroupWithResponse("SdkRg5154", "SdkJob952", "details", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/databox/resource-manager/Microsoft.DataBox/stable/2021-03-01/examples/JobsGetCmk.json
     */
    /**
     * Sample code: JobsGetCmk.
     *
     * @param manager Entry point to DataBoxManager.
     */
    public static void jobsGetCmk(com.azure.resourcemanager.databox.DataBoxManager manager) {
        manager
            .jobs()
            .getByResourceGroupWithResponse("SdkRg7937", "SdkJob1735", "details", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/databox/resource-manager/Microsoft.DataBox/stable/2021-03-01/examples/JobsGetExport.json
     */
    /**
     * Sample code: JobsGetExport.
     *
     * @param manager Entry point to DataBoxManager.
     */
    public static void jobsGetExport(com.azure.resourcemanager.databox.DataBoxManager manager) {
        manager
            .jobs()
            .getByResourceGroupWithResponse("SdkRg8091", "SdkJob6429", "details", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/databox/resource-manager/Microsoft.DataBox/stable/2021-03-01/examples/JobsGetCopyStuck.json
     */
    /**
     * Sample code: JobsGetCopyStuck.
     *
     * @param manager Entry point to DataBoxManager.
     */
    public static void jobsGetCopyStuck(com.azure.resourcemanager.databox.DataBoxManager manager) {
        manager
            .jobs()
            .getByResourceGroupWithResponse(
                "dmstestresource", "TJx-637505258985313014", "details", com.azure.core.util.Context.NONE);
    }
}
