// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataTableResponseColumn;
import org.junit.jupiter.api.Assertions;

public final class DiagnosticDataTableResponseColumnTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiagnosticDataTableResponseColumn model = BinaryData
            .fromString(
                "{\"columnName\":\"tuwkffdj\",\"dataType\":\"sysidfvclglxnf\",\"columnType\":\"jtkbusqogsfika\"}")
            .toObject(DiagnosticDataTableResponseColumn.class);
        Assertions.assertEquals("tuwkffdj", model.columnName());
        Assertions.assertEquals("sysidfvclglxnf", model.dataType());
        Assertions.assertEquals("jtkbusqogsfika", model.columnType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiagnosticDataTableResponseColumn model = new DiagnosticDataTableResponseColumn().withColumnName("tuwkffdj")
            .withDataType("sysidfvclglxnf")
            .withColumnType("jtkbusqogsfika");
        model = BinaryData.fromObject(model).toObject(DiagnosticDataTableResponseColumn.class);
        Assertions.assertEquals("tuwkffdj", model.columnName());
        Assertions.assertEquals("sysidfvclglxnf", model.dataType());
        Assertions.assertEquals("jtkbusqogsfika", model.columnType());
    }
}
