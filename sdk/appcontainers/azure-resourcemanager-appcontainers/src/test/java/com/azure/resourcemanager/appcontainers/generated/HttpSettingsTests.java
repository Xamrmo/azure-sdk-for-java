// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ForwardProxy;
import com.azure.resourcemanager.appcontainers.models.ForwardProxyConvention;
import com.azure.resourcemanager.appcontainers.models.HttpSettings;
import com.azure.resourcemanager.appcontainers.models.HttpSettingsRoutes;
import org.junit.jupiter.api.Assertions;

public final class HttpSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HttpSettings model = BinaryData.fromString(
            "{\"requireHttps\":false,\"routes\":{\"apiPrefix\":\"jzzvdud\"},\"forwardProxy\":{\"convention\":\"NoProxy\",\"customHostHeaderName\":\"fhotw\",\"customProtoHeaderName\":\"ynpwlbj\"}}")
            .toObject(HttpSettings.class);
        Assertions.assertEquals(false, model.requireHttps());
        Assertions.assertEquals("jzzvdud", model.routes().apiPrefix());
        Assertions.assertEquals(ForwardProxyConvention.NO_PROXY, model.forwardProxy().convention());
        Assertions.assertEquals("fhotw", model.forwardProxy().customHostHeaderName());
        Assertions.assertEquals("ynpwlbj", model.forwardProxy().customProtoHeaderName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HttpSettings model = new HttpSettings().withRequireHttps(false)
            .withRoutes(new HttpSettingsRoutes().withApiPrefix("jzzvdud"))
            .withForwardProxy(new ForwardProxy().withConvention(ForwardProxyConvention.NO_PROXY)
                .withCustomHostHeaderName("fhotw")
                .withCustomProtoHeaderName("ynpwlbj"));
        model = BinaryData.fromObject(model).toObject(HttpSettings.class);
        Assertions.assertEquals(false, model.requireHttps());
        Assertions.assertEquals("jzzvdud", model.routes().apiPrefix());
        Assertions.assertEquals(ForwardProxyConvention.NO_PROXY, model.forwardProxy().convention());
        Assertions.assertEquals("fhotw", model.forwardProxy().customHostHeaderName());
        Assertions.assertEquals("ynpwlbj", model.forwardProxy().customProtoHeaderName());
    }
}
