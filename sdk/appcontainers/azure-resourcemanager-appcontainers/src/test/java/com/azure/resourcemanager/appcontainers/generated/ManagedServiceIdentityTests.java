// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ManagedServiceIdentity;
import com.azure.resourcemanager.appcontainers.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.appcontainers.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedServiceIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedServiceIdentity model = BinaryData.fromString(
            "{\"principalId\":\"a48bee7a-ec22-4313-bfd5-d9af92b4ff2e\",\"tenantId\":\"9529ca00-5f90-47e2-abab-e6fc52c0c7a6\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"wgxhn\":{\"principalId\":\"6e2421e4-b763-4a85-9d29-a6d823227b53\",\"clientId\":\"35316ff8-50d8-41ab-b5f6-160f742aee80\"},\"x\":{\"principalId\":\"f39cbe12-3855-4e0f-9270-0cfcac855f06\",\"clientId\":\"5a1a96a1-b988-43fe-94b4-154f97bce62a\"}}}")
            .toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedServiceIdentity model = new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
            .withUserAssignedIdentities(mapOf("wgxhn", new UserAssignedIdentity(), "x", new UserAssignedIdentity()));
        model = BinaryData.fromObject(model).toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.type());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
