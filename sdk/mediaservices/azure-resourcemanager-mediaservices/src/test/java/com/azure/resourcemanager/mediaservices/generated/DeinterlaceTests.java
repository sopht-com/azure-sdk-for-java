// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.Deinterlace;
import com.azure.resourcemanager.mediaservices.models.DeinterlaceMode;
import com.azure.resourcemanager.mediaservices.models.DeinterlaceParity;
import org.junit.jupiter.api.Assertions;

public final class DeinterlaceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Deinterlace model =
            BinaryData.fromString("{\"parity\":\"BottomFieldFirst\",\"mode\":\"Off\"}").toObject(Deinterlace.class);
        Assertions.assertEquals(DeinterlaceParity.BOTTOM_FIELD_FIRST, model.parity());
        Assertions.assertEquals(DeinterlaceMode.OFF, model.mode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Deinterlace model =
            new Deinterlace().withParity(DeinterlaceParity.BOTTOM_FIELD_FIRST).withMode(DeinterlaceMode.OFF);
        model = BinaryData.fromObject(model).toObject(Deinterlace.class);
        Assertions.assertEquals(DeinterlaceParity.BOTTOM_FIELD_FIRST, model.parity());
        Assertions.assertEquals(DeinterlaceMode.OFF, model.mode());
    }
}
