// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.digitaltwins.AzureDigitalTwinsManager;
import com.azure.resourcemanager.digitaltwins.models.DigitalTwinsDescription;
import com.azure.resourcemanager.digitaltwins.models.DigitalTwinsIdentityType;
import com.azure.resourcemanager.digitaltwins.models.PublicNetworkAccess;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DigitalTwinsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"createdTime\":\"2021-09-27T17:09:21Z\",\"lastUpdatedTime\":\"2021-02-01T20:47:43Z\",\"provisioningState\":\"Deleted\",\"hostName\":\"ghxpkdw\",\"privateEndpointConnections\":[],\"publicNetworkAccess\":\"Disabled\"},\"identity\":{\"type\":\"SystemAssigned,UserAssigned\",\"principalId\":\"umnyqu\",\"tenantId\":\"deoj\",\"userAssignedIdentities\":{}},\"location\":\"khsmtxpsiebt\",\"tags\":{\"htldwk\":\"pesapskrdqmhjj\",\"otogtwrupqs\":\"zxuutkncwscwsvl\",\"cykvceo\":\"vnm\",\"vnotyfjfcnj\":\"eil\"},\"id\":\"k\",\"name\":\"nxdhbt\",\"type\":\"kphywpnvjto\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        AzureDigitalTwinsManager manager =
            AzureDigitalTwinsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DigitalTwinsDescription> response = manager.digitalTwins().list(Context.NONE);

        Assertions.assertEquals("khsmtxpsiebt", response.iterator().next().location());
        Assertions.assertEquals("pesapskrdqmhjj", response.iterator().next().tags().get("htldwk"));
        Assertions
            .assertEquals(
                DigitalTwinsIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, response.iterator().next().publicNetworkAccess());
    }
}
