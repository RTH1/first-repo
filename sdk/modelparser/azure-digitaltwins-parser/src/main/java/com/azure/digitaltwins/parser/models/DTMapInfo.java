// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) Code Generator

package com.azure.digitaltwins.parser.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import java.util.regex.Pattern;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.azure.digitaltwins.parser.ContextHistory;
import com.azure.digitaltwins.parser.VersionedContext;
import com.azure.digitaltwins.parser.Dtmi;

/**
 * Class {@link DTMapInfo} corresponds to an element of type Map in a DTDL model.
 */
public class DTMapInfo extends DTComplexSchemaInfo implements TypeChecker, PropertyValueConstrainer, PropertyInstanceBinder, Equatable<DTMapInfo> {
    private static final Map<Integer, String> BAD_TYPE_ACTION_FORMAT = new HashMap<>();

    private static final Map<Integer, String> BAD_TYPE_CAUSE_FORMAT = new HashMap<>();

    private static final Map<Integer, Set<DTEntityKind>> CONCRETE_KINDS = new HashMap<>();

    private static final HashSet<String> VERSION_LESS_TYPES = new HashSet<>();

    private DTMapKeyInfo mapKey;

    private Set<Integer> mapKeyAllowedVersionsV2 = new HashSet<>(Arrays.asList(2));

    private Set<Integer> mapKeyAllowedVersionsV3 = new HashSet<>(Arrays.asList(3));

    private List<String> mapKeyInstanceProperties = null;

    private List<ValueConstraints> mapKeyValueConstraints = null;

    private DTMapValueInfo mapValue;

    private Set<Integer> mapValueAllowedVersionsV2 = new HashSet<>(Arrays.asList(2));

    private Set<Integer> mapValueAllowedVersionsV3 = new HashSet<>(Arrays.asList(3));

    private List<String> mapValueInstanceProperties = null;

    private List<ValueConstraints> mapValueValueConstraints = null;

    static {
        VERSION_LESS_TYPES.add("dtmi:dtdl:class:ComplexSchema");
        VERSION_LESS_TYPES.add("dtmi:dtdl:class:Entity");
        VERSION_LESS_TYPES.add("dtmi:dtdl:class:Map");
        VERSION_LESS_TYPES.add("dtmi:dtdl:class:Schema");

        CONCRETE_KINDS.put(2, new HashSet<>());
        CONCRETE_KINDS.get(2).add(DTEntityKind.MAP);

        CONCRETE_KINDS.put(3, new HashSet<>());
        CONCRETE_KINDS.get(3).add(DTEntityKind.MAP);

        BAD_TYPE_ACTION_FORMAT.put(2, "Provide a value for property '{property}' with @type Map.");
        BAD_TYPE_ACTION_FORMAT.put(3, "Provide a value for property '{property}' with @type Map.");

        BAD_TYPE_CAUSE_FORMAT.put(2, "{primaryId:p} property '{property}' has value{secondaryId:e} that does not have @type of Map.");
        BAD_TYPE_CAUSE_FORMAT.put(3, "{primaryId:p} property '{property}' has value{secondaryId:e} that does not have @type of Map.");
    }

    /**
     * Get The value of the 'mapKey' property of the DTDL element that corresponds to this object.
     * @return mapKey.
     */
    public DTMapKeyInfo getMapKey() {
        return this.mapKey
    }

    /**
     * Get The value of the 'mapValue' property of the DTDL element that corresponds to this object.
     * @return mapValue.
     */
    public DTMapValueInfo getMapValue() {
        return this.mapValue
    }

    /**
     * Set The value of the 'mapKey' property of the DTDL element that corresponds to this object.
     * @param value Property value.
     */
    void setMapKey(DTMapKeyInfo value) {
        this.mapKey = value;
    }

    /**
     * Set The value of the 'mapValue' property of the DTDL element that corresponds to this object.
     * @param value Property value.
     */
    void setMapValue(DTMapValueInfo value) {
        this.mapValue = value;
    }
}
