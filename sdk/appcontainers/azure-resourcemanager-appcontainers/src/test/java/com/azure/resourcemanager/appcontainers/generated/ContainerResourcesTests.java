// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ContainerResources;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ContainerResourcesTests {
    @Test
    public void testDeserialize() {
        ContainerResources model =
            BinaryData
                .fromString(
                    "{\"cpu\":4.018076144198646,\"memory\":\"byuqerpqlp\",\"ephemeralStorage\":\"cciuqgbdbutau\"}")
                .toObject(ContainerResources.class);
        Assertions.assertEquals(4.018076144198646D, model.cpu());
        Assertions.assertEquals("byuqerpqlp", model.memory());
    }

    @Test
    public void testSerialize() {
        ContainerResources model = new ContainerResources().withCpu(4.018076144198646D).withMemory("byuqerpqlp");
        model = BinaryData.fromObject(model).toObject(ContainerResources.class);
        Assertions.assertEquals(4.018076144198646D, model.cpu());
        Assertions.assertEquals("byuqerpqlp", model.memory());
    }
}
