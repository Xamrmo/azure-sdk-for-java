// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.DiagnosticsCollectionInner;
import com.azure.resourcemanager.appcontainers.fluent.models.DiagnosticsInner;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataProviderMetadata;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataProviderMetadataPropertyBagItem;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataTableResponseObject;
import com.azure.resourcemanager.appcontainers.models.DiagnosticRendering;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsDataApiResponse;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsDefinition;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsProperties;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsStatus;
import com.azure.resourcemanager.appcontainers.models.DiagnosticSupportTopic;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DiagnosticsCollectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiagnosticsCollectionInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"metadata\":{\"id\":\"wfansnvpdi\",\"name\":\"ikostbzbkiwbuqny\",\"description\":\"hzfylsgcrpfbc\",\"author\":\"ezzcez\",\"category\":\"fwyfwlwxjwet\",\"supportTopicList\":[{},{},{},{}],\"analysisTypes\":[\"clafzvaylpt\",\"sqqw\",\"tcmwqkchc\",\"waxfewzjkj\"],\"type\":\"fdeqvhpsyl\",\"score\":14.799225},\"dataset\":[{\"table\":{},\"renderingProperties\":{}},{\"table\":{},\"renderingProperties\":{}}],\"status\":{\"message\":\"xzjrgy\",\"statusId\":2102626781},\"dataProviderMetadata\":{\"providerName\":\"xs\",\"propertyBag\":[{}]}},\"id\":\"ujgicgaaoe\",\"name\":\"ttaqutdew\",\"type\":\"mxswvruunzz\"},{\"properties\":{\"metadata\":{\"id\":\"kfkimrtixok\",\"name\":\"qyinl\",\"description\":\"epqw\",\"author\":\"xmonstshi\",\"category\":\"gvelfc\",\"supportTopicList\":[{},{},{}],\"analysisTypes\":[\"birdsvuwcobiegs\"],\"type\":\"ninwjizc\",\"score\":47.859776},\"dataset\":[{\"table\":{},\"renderingProperties\":{}},{\"table\":{},\"renderingProperties\":{}}],\"status\":{\"message\":\"tbxqmuluxlxq\",\"statusId\":1178102371},\"dataProviderMetadata\":{\"providerName\":\"sbycucrwnamikz\",\"propertyBag\":[{},{},{}]}},\"id\":\"bsmswziqgf\",\"name\":\"hokzrusw\",\"type\":\"vhczznvfby\"},{\"properties\":{\"metadata\":{\"id\":\"jww\",\"name\":\"z\",\"description\":\"mwmxqhndvnoamld\",\"author\":\"haohdjhhflzokxc\",\"category\":\"pelnjetag\",\"supportTopicList\":[{}],\"analysisTypes\":[\"atftgzpnpbsw\",\"e\",\"loccsrmozihm\",\"pgawtxxpkyjcxcjx\"],\"type\":\"ytfmpc\",\"score\":76.57327},\"dataset\":[{\"table\":{},\"renderingProperties\":{}},{\"table\":{},\"renderingProperties\":{}}],\"status\":{\"message\":\"gnoxuztrksx\",\"statusId\":1615864463},\"dataProviderMetadata\":{\"providerName\":\"cpfnznthjtwkja\",\"propertyBag\":[{},{}]}},\"id\":\"uzvoamktcqiosm\",\"name\":\"bzahgxqd\",\"type\":\"yrtltlaprltzkat\"}],\"nextLink\":\"jm\"}")
            .toObject(DiagnosticsCollectionInner.class);
        Assertions.assertEquals("clafzvaylpt", model.value().get(0).properties().metadata().analysisTypes().get(0));
        Assertions.assertEquals("xzjrgy", model.value().get(0).properties().status().message());
        Assertions.assertEquals(2102626781, model.value().get(0).properties().status().statusId());
        Assertions.assertEquals("xs", model.value().get(0).properties().dataProviderMetadata().providerName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiagnosticsCollectionInner model = new DiagnosticsCollectionInner().withValue(Arrays.asList(
            new DiagnosticsInner().withProperties(new DiagnosticsProperties()
                .withMetadata(new DiagnosticsDefinition()
                    .withSupportTopicList(Arrays.asList(new DiagnosticSupportTopic(), new DiagnosticSupportTopic(),
                        new DiagnosticSupportTopic(), new DiagnosticSupportTopic()))
                    .withAnalysisTypes(Arrays.asList("clafzvaylpt", "sqqw", "tcmwqkchc", "waxfewzjkj")))
                .withDataset(Arrays.asList(
                    new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                        .withRenderingProperties(new DiagnosticRendering()),
                    new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                        .withRenderingProperties(new DiagnosticRendering())))
                .withStatus(new DiagnosticsStatus().withMessage("xzjrgy").withStatusId(2102626781))
                .withDataProviderMetadata(new DiagnosticDataProviderMetadata().withProviderName("xs")
                    .withPropertyBag(Arrays.asList(new DiagnosticDataProviderMetadataPropertyBagItem())))),
            new DiagnosticsInner()
                .withProperties(
                    new DiagnosticsProperties()
                        .withMetadata(new DiagnosticsDefinition()
                            .withSupportTopicList(Arrays.asList(new DiagnosticSupportTopic(),
                                new DiagnosticSupportTopic(), new DiagnosticSupportTopic()))
                            .withAnalysisTypes(Arrays.asList("birdsvuwcobiegs")))
                        .withDataset(Arrays.asList(
                            new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                                .withRenderingProperties(new DiagnosticRendering()),
                            new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                                .withRenderingProperties(new DiagnosticRendering())))
                        .withStatus(new DiagnosticsStatus().withMessage("tbxqmuluxlxq").withStatusId(1178102371))
                        .withDataProviderMetadata(
                            new DiagnosticDataProviderMetadata().withProviderName("sbycucrwnamikz")
                                .withPropertyBag(
                                    Arrays.asList(new DiagnosticDataProviderMetadataPropertyBagItem(),
                                        new DiagnosticDataProviderMetadataPropertyBagItem(),
                                        new DiagnosticDataProviderMetadataPropertyBagItem())))),
            new DiagnosticsInner().withProperties(new DiagnosticsProperties()
                .withMetadata(
                    new DiagnosticsDefinition().withSupportTopicList(Arrays.asList(new DiagnosticSupportTopic()))
                        .withAnalysisTypes(Arrays.asList("atftgzpnpbsw", "e", "loccsrmozihm", "pgawtxxpkyjcxcjx")))
                .withDataset(Arrays.asList(
                    new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                        .withRenderingProperties(new DiagnosticRendering()),
                    new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                        .withRenderingProperties(new DiagnosticRendering())))
                .withStatus(new DiagnosticsStatus().withMessage("gnoxuztrksx").withStatusId(1615864463))
                .withDataProviderMetadata(new DiagnosticDataProviderMetadata().withProviderName("cpfnznthjtwkja")
                    .withPropertyBag(Arrays.asList(new DiagnosticDataProviderMetadataPropertyBagItem(),
                        new DiagnosticDataProviderMetadataPropertyBagItem()))))));
        model = BinaryData.fromObject(model).toObject(DiagnosticsCollectionInner.class);
        Assertions.assertEquals("clafzvaylpt", model.value().get(0).properties().metadata().analysisTypes().get(0));
        Assertions.assertEquals("xzjrgy", model.value().get(0).properties().status().message());
        Assertions.assertEquals(2102626781, model.value().get(0).properties().status().statusId());
        Assertions.assertEquals("xs", model.value().get(0).properties().dataProviderMetadata().providerName());
    }
}
