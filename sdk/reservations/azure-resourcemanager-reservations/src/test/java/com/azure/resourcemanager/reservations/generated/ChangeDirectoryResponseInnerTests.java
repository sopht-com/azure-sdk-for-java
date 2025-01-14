// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.reservations.fluent.models.ChangeDirectoryResponseInner;
import com.azure.resourcemanager.reservations.models.ChangeDirectoryResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ChangeDirectoryResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ChangeDirectoryResponseInner model =
            BinaryData
                .fromString(
                    "{\"reservationOrder\":{\"id\":\"rlkdmtncvokotl\",\"name\":\"d\",\"isSucceeded\":false,\"error\":\"y\"},\"reservations\":[{\"id\":\"jlt\",\"name\":\"bnnhadoocrkvcik\",\"isSucceeded\":false,\"error\":\"amqgxqquezikyw\"},{\"id\":\"xkalla\",\"name\":\"elwuipi\",\"isSucceeded\":false,\"error\":\"kzivgvvcnayrh\"},{\"id\":\"nxxmueedndrdv\",\"name\":\"kwqqtchealmf\",\"isSucceeded\":false,\"error\":\"aygdvwvgpioh\"},{\"id\":\"xrtfudxep\",\"name\":\"yqagvrvm\",\"isSucceeded\":false,\"error\":\"kghimdblxgwimfnj\"}]}")
                .toObject(ChangeDirectoryResponseInner.class);
        Assertions.assertEquals("rlkdmtncvokotl", model.reservationOrder().id());
        Assertions.assertEquals("d", model.reservationOrder().name());
        Assertions.assertEquals(false, model.reservationOrder().isSucceeded());
        Assertions.assertEquals("y", model.reservationOrder().error());
        Assertions.assertEquals("jlt", model.reservations().get(0).id());
        Assertions.assertEquals("bnnhadoocrkvcik", model.reservations().get(0).name());
        Assertions.assertEquals(false, model.reservations().get(0).isSucceeded());
        Assertions.assertEquals("amqgxqquezikyw", model.reservations().get(0).error());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ChangeDirectoryResponseInner model =
            new ChangeDirectoryResponseInner()
                .withReservationOrder(
                    new ChangeDirectoryResult()
                        .withId("rlkdmtncvokotl")
                        .withName("d")
                        .withIsSucceeded(false)
                        .withError("y"))
                .withReservations(
                    Arrays
                        .asList(
                            new ChangeDirectoryResult()
                                .withId("jlt")
                                .withName("bnnhadoocrkvcik")
                                .withIsSucceeded(false)
                                .withError("amqgxqquezikyw"),
                            new ChangeDirectoryResult()
                                .withId("xkalla")
                                .withName("elwuipi")
                                .withIsSucceeded(false)
                                .withError("kzivgvvcnayrh"),
                            new ChangeDirectoryResult()
                                .withId("nxxmueedndrdv")
                                .withName("kwqqtchealmf")
                                .withIsSucceeded(false)
                                .withError("aygdvwvgpioh"),
                            new ChangeDirectoryResult()
                                .withId("xrtfudxep")
                                .withName("yqagvrvm")
                                .withIsSucceeded(false)
                                .withError("kghimdblxgwimfnj")));
        model = BinaryData.fromObject(model).toObject(ChangeDirectoryResponseInner.class);
        Assertions.assertEquals("rlkdmtncvokotl", model.reservationOrder().id());
        Assertions.assertEquals("d", model.reservationOrder().name());
        Assertions.assertEquals(false, model.reservationOrder().isSucceeded());
        Assertions.assertEquals("y", model.reservationOrder().error());
        Assertions.assertEquals("jlt", model.reservations().get(0).id());
        Assertions.assertEquals("bnnhadoocrkvcik", model.reservations().get(0).name());
        Assertions.assertEquals(false, model.reservations().get(0).isSucceeded());
        Assertions.assertEquals("amqgxqquezikyw", model.reservations().get(0).error());
    }
}
