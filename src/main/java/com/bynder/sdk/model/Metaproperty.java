/*
 * Copyright (c) 2017 Bynder B.V. All rights reserved.
 *
 * Licensed under the MIT License. See LICENSE file in the project root for full license
 * information.
 */
package com.bynder.sdk.model;

import com.bynder.sdk.api.BynderApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Metaproperty model returned by {@link BynderApi#getMetaproperties(Map)}.
 */
public class Metaproperty {

    /**
     * Child metaproperty options.
     */
    private final List<MetapropertyOption> options = new ArrayList<>();
    /**
     * Id of the metaproperty.
     */
    private String id;
    /**
     * Name of the metaproperty.
     */
    private String name;
    /**
     * Label of the metaproperty.
     */
    private String label;
    /**
     * True if metaproperty option has filterable turned on.
     */
    private Boolean isFilterable;
    /**
     * Order in which the metaproperty should appear.
     */
    private int zindex;
    /**
     * Metaproperty type.
     */
    private String type;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLabel() {
        return label;
    }

    public List<MetapropertyOption> getOptions() {
        return options;
    }

    public Boolean isFilterable() {
        return isFilterable;
    }

    public int getZindex() {
        return zindex;
    }

    public String getType() {
        return type;
    }
}
