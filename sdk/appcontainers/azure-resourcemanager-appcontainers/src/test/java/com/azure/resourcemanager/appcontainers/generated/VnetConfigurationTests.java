// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.VnetConfiguration;
import org.junit.jupiter.api.Assertions;

public final class VnetConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VnetConfiguration model = BinaryData.fromString(
            "{\"internal\":false,\"infrastructureSubnetId\":\"yrplrohkpigqfus\",\"dockerBridgeCidr\":\"kzmkwklsnoxaxmqe\",\"platformReservedCidr\":\"lhhjnh\",\"platformReservedDnsIP\":\"ydyynfsvkh\"}")
            .toObject(VnetConfiguration.class);
        Assertions.assertEquals(false, model.internal());
        Assertions.assertEquals("yrplrohkpigqfus", model.infrastructureSubnetId());
        Assertions.assertEquals("kzmkwklsnoxaxmqe", model.dockerBridgeCidr());
        Assertions.assertEquals("lhhjnh", model.platformReservedCidr());
        Assertions.assertEquals("ydyynfsvkh", model.platformReservedDnsIp());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VnetConfiguration model = new VnetConfiguration().withInternal(false)
            .withInfrastructureSubnetId("yrplrohkpigqfus")
            .withDockerBridgeCidr("kzmkwklsnoxaxmqe")
            .withPlatformReservedCidr("lhhjnh")
            .withPlatformReservedDnsIp("ydyynfsvkh");
        model = BinaryData.fromObject(model).toObject(VnetConfiguration.class);
        Assertions.assertEquals(false, model.internal());
        Assertions.assertEquals("yrplrohkpigqfus", model.infrastructureSubnetId());
        Assertions.assertEquals("kzmkwklsnoxaxmqe", model.dockerBridgeCidr());
        Assertions.assertEquals("lhhjnh", model.platformReservedCidr());
        Assertions.assertEquals("ydyynfsvkh", model.platformReservedDnsIp());
    }
}
