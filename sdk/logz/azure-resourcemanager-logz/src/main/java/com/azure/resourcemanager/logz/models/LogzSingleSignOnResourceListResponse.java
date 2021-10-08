// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logz.fluent.models.LogzSingleSignOnResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response of a list operation. */
@Fluent
public final class LogzSingleSignOnResourceListResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LogzSingleSignOnResourceListResponse.class);

    /*
     * Results of a list operation.
     */
    @JsonProperty(value = "value")
    private List<LogzSingleSignOnResourceInner> value;

    /*
     * Link to the next set of results, if any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Results of a list operation.
     *
     * @return the value value.
     */
    public List<LogzSingleSignOnResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Results of a list operation.
     *
     * @param value the value value to set.
     * @return the LogzSingleSignOnResourceListResponse object itself.
     */
    public LogzSingleSignOnResourceListResponse withValue(List<LogzSingleSignOnResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results, if any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results, if any.
     *
     * @param nextLink the nextLink value to set.
     * @return the LogzSingleSignOnResourceListResponse object itself.
     */
    public LogzSingleSignOnResourceListResponse withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}