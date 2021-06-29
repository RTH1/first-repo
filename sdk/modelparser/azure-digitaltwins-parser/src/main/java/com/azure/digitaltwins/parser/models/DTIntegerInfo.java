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
 * Class {@link DTIntegerInfo} corresponds to an element of type Integer in a DTDL model.
 */
public class DTIntegerInfo extends DTNumericSchemaInfo implements TypeChecker, Equatable<DTIntegerInfo> {
    private static final Map<Integer, String> BAD_TYPE_ACTION_FORMAT = new HashMap<>();

    private static final Map<Integer, String> BAD_TYPE_CAUSE_FORMAT = new HashMap<>();

    private static final Map<Integer, Set<DTEntityKind>> CONCRETE_KINDS = new HashMap<>();

    private static final HashSet<String> VERSION_LESS_TYPES = new HashSet<>();

    static {
        VERSION_LESS_TYPES.add("dtmi:dtdl:class:Entity");
        VERSION_LESS_TYPES.add("dtmi:dtdl:class:Integer");
        VERSION_LESS_TYPES.add("dtmi:dtdl:class:NumericSchema");
        VERSION_LESS_TYPES.add("dtmi:dtdl:class:PrimitiveSchema");
        VERSION_LESS_TYPES.add("dtmi:dtdl:class:Schema");

        CONCRETE_KINDS.put(2, new HashSet<>());
        CONCRETE_KINDS.get(2).add(DTEntityKind.INTEGER);

        CONCRETE_KINDS.put(3, new HashSet<>());
        CONCRETE_KINDS.get(3).add(DTEntityKind.INTEGER);

        BAD_TYPE_ACTION_FORMAT.put(2, "Choose the following value for property '{property}': integer.");
        BAD_TYPE_ACTION_FORMAT.put(3, "Choose the following value for property '{property}': integer.");

        BAD_TYPE_CAUSE_FORMAT.put(2, "{primaryId:p} property '{property}' has value{secondaryId:e} that is not a standard value for this property.");
        BAD_TYPE_CAUSE_FORMAT.put(3, "{primaryId:p} property '{property}' has value{secondaryId:e} that is not a standard value for this property.");
    }
}
