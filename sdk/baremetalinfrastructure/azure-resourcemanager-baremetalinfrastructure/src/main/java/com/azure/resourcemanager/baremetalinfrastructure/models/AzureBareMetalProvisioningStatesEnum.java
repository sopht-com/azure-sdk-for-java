// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AzureBareMetalProvisioningStatesEnum. */
public final class AzureBareMetalProvisioningStatesEnum
    extends ExpandableStringEnum<AzureBareMetalProvisioningStatesEnum> {
    /** Static value Accepted for AzureBareMetalProvisioningStatesEnum. */
    public static final AzureBareMetalProvisioningStatesEnum ACCEPTED = fromString("Accepted");

    /** Static value Creating for AzureBareMetalProvisioningStatesEnum. */
    public static final AzureBareMetalProvisioningStatesEnum CREATING = fromString("Creating");

    /** Static value Updating for AzureBareMetalProvisioningStatesEnum. */
    public static final AzureBareMetalProvisioningStatesEnum UPDATING = fromString("Updating");

    /** Static value Failed for AzureBareMetalProvisioningStatesEnum. */
    public static final AzureBareMetalProvisioningStatesEnum FAILED = fromString("Failed");

    /** Static value Succeeded for AzureBareMetalProvisioningStatesEnum. */
    public static final AzureBareMetalProvisioningStatesEnum SUCCEEDED = fromString("Succeeded");

    /** Static value Deleting for AzureBareMetalProvisioningStatesEnum. */
    public static final AzureBareMetalProvisioningStatesEnum DELETING = fromString("Deleting");

    /** Static value Migrating for AzureBareMetalProvisioningStatesEnum. */
    public static final AzureBareMetalProvisioningStatesEnum MIGRATING = fromString("Migrating");

    /**
     * Creates or finds a AzureBareMetalProvisioningStatesEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AzureBareMetalProvisioningStatesEnum.
     */
    @JsonCreator
    public static AzureBareMetalProvisioningStatesEnum fromString(String name) {
        return fromString(name, AzureBareMetalProvisioningStatesEnum.class);
    }

    /** @return known AzureBareMetalProvisioningStatesEnum values. */
    public static Collection<AzureBareMetalProvisioningStatesEnum> values() {
        return values(AzureBareMetalProvisioningStatesEnum.class);
    }
}