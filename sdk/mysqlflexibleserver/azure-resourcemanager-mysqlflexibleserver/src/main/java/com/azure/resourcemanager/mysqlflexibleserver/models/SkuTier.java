// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SkuTier. */
public final class SkuTier extends ExpandableStringEnum<SkuTier> {
    /** Static value Burstable for SkuTier. */
    public static final SkuTier BURSTABLE = fromString("Burstable");

    /** Static value GeneralPurpose for SkuTier. */
    public static final SkuTier GENERAL_PURPOSE = fromString("GeneralPurpose");

    /** Static value MemoryOptimized for SkuTier. */
    public static final SkuTier MEMORY_OPTIMIZED = fromString("MemoryOptimized");

    /**
     * Creates or finds a SkuTier from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SkuTier.
     */
    @JsonCreator
    public static SkuTier fromString(String name) {
        return fromString(name, SkuTier.class);
    }

    /** @return known SkuTier values. */
    public static Collection<SkuTier> values() {
        return values(SkuTier.class);
    }
}