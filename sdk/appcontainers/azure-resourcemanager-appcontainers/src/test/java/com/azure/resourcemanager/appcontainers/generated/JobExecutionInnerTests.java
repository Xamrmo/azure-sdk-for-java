// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.JobExecutionInner;
import com.azure.resourcemanager.appcontainers.models.ContainerExecutionStatus;
import com.azure.resourcemanager.appcontainers.models.ContainerResources;
import com.azure.resourcemanager.appcontainers.models.EnvironmentVar;
import com.azure.resourcemanager.appcontainers.models.ExecutionStatus;
import com.azure.resourcemanager.appcontainers.models.JobExecutionContainer;
import com.azure.resourcemanager.appcontainers.models.JobExecutionTemplate;
import com.azure.resourcemanager.appcontainers.models.ReplicaExecutionStatus;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class JobExecutionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobExecutionInner model = BinaryData.fromString(
            "{\"name\":\"txpnrupza\",\"id\":\"rdixt\",\"type\":\"kidswys\",\"properties\":{\"status\":\"Succeeded\",\"startTime\":\"2021-09-17T17:15:37Z\",\"endTime\":\"2021-10-21T15:00:18Z\",\"template\":{\"containers\":[{\"image\":\"utvlxhr\",\"name\":\"hvmblcouqehbhbc\",\"command\":[\"iryr\",\"ndo\",\"pmbltoormkfql\"],\"args\":[\"dykalsygaolnjpnn\",\"m\",\"ksibjgsjjxx\",\"hmrnadzyqegxy\"],\"env\":[{},{},{},{}],\"resources\":{\"cpu\":17.229341989191948,\"memory\":\"wbjijkgq\",\"ephemeralStorage\":\"h\"}}],\"initContainers\":[{\"image\":\"znj\",\"name\":\"jvaannggiycwkd\",\"command\":[\"wxwfekaumrr\",\"mbzmqk\"],\"args\":[\"bnxwbjsidbirkf\",\"kso\",\"dgo\"],\"env\":[{},{}],\"resources\":{\"cpu\":9.06822637742738,\"memory\":\"hbguzo\",\"ephemeralStorage\":\"yewnfnzhhhqos\"}},{\"image\":\"fjkutycyarnroo\",\"name\":\"uabzoghkt\",\"command\":[\"czhcoeocnh\",\"qr\"],\"args\":[\"jzcfyjzptwr\",\"ohapqinfsz\",\"yglqdhmrjzral\"],\"env\":[{}],\"resources\":{\"cpu\":46.62900167875854,\"memory\":\"sjoqcjenkyhfqzvs\",\"ephemeralStorage\":\"fxjelg\"}},{\"image\":\"pzqjhhhq\",\"name\":\"w\",\"command\":[\"acoyvivbsizusjs\",\"lbscmnlz\",\"jiu\"],\"args\":[\"gmvflnwyvqkx\"],\"env\":[{},{}],\"resources\":{\"cpu\":49.010491721008606,\"memory\":\"yl\",\"ephemeralStorage\":\"wxzut\"}}]},\"detailedStatus\":{\"replicas\":[{\"name\":\"hghmupgxyj\",\"containers\":[{},{},{}]},{\"name\":\"abbujftabenb\",\"containers\":[{}]},{\"name\":\"pxzuca\",\"containers\":[{},{},{},{}]},{\"name\":\"wwnlzafwxudgnh\",\"containers\":[{},{},{}]}]}}}")
            .toObject(JobExecutionInner.class);
        Assertions.assertEquals("txpnrupza", model.name());
        Assertions.assertEquals("rdixt", model.id());
        Assertions.assertEquals("kidswys", model.type());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-17T17:15:37Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-21T15:00:18Z"), model.endTime());
        Assertions.assertEquals("utvlxhr", model.template().containers().get(0).image());
        Assertions.assertEquals("hvmblcouqehbhbc", model.template().containers().get(0).name());
        Assertions.assertEquals("iryr", model.template().containers().get(0).command().get(0));
        Assertions.assertEquals("dykalsygaolnjpnn", model.template().containers().get(0).args().get(0));
        Assertions.assertEquals(17.229341989191948D, model.template().containers().get(0).resources().cpu());
        Assertions.assertEquals("wbjijkgq", model.template().containers().get(0).resources().memory());
        Assertions.assertEquals("znj", model.template().initContainers().get(0).image());
        Assertions.assertEquals("jvaannggiycwkd", model.template().initContainers().get(0).name());
        Assertions.assertEquals("wxwfekaumrr", model.template().initContainers().get(0).command().get(0));
        Assertions.assertEquals("bnxwbjsidbirkf", model.template().initContainers().get(0).args().get(0));
        Assertions.assertEquals(9.06822637742738D, model.template().initContainers().get(0).resources().cpu());
        Assertions.assertEquals("hbguzo", model.template().initContainers().get(0).resources().memory());
        Assertions.assertEquals("hghmupgxyj", model.detailedStatus().replicas().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobExecutionInner model = new JobExecutionInner().withName("txpnrupza")
            .withId("rdixt")
            .withType("kidswys")
            .withStartTime(OffsetDateTime.parse("2021-09-17T17:15:37Z"))
            .withEndTime(OffsetDateTime.parse("2021-10-21T15:00:18Z"))
            .withTemplate(new JobExecutionTemplate()
                .withContainers(Arrays.asList(new JobExecutionContainer().withImage("utvlxhr")
                    .withName("hvmblcouqehbhbc")
                    .withCommand(Arrays.asList("iryr", "ndo", "pmbltoormkfql"))
                    .withArgs(Arrays.asList("dykalsygaolnjpnn", "m", "ksibjgsjjxx", "hmrnadzyqegxy"))
                    .withEnv(Arrays.asList(new EnvironmentVar(), new EnvironmentVar(), new EnvironmentVar(),
                        new EnvironmentVar()))
                    .withResources(new ContainerResources().withCpu(17.229341989191948D).withMemory("wbjijkgq"))))
                .withInitContainers(Arrays.asList(
                    new JobExecutionContainer().withImage("znj")
                        .withName("jvaannggiycwkd")
                        .withCommand(Arrays.asList("wxwfekaumrr", "mbzmqk"))
                        .withArgs(Arrays.asList("bnxwbjsidbirkf", "kso", "dgo"))
                        .withEnv(Arrays.asList(new EnvironmentVar(), new EnvironmentVar()))
                        .withResources(new ContainerResources().withCpu(9.06822637742738D).withMemory("hbguzo")),
                    new JobExecutionContainer().withImage("fjkutycyarnroo")
                        .withName("uabzoghkt")
                        .withCommand(Arrays.asList("czhcoeocnh", "qr"))
                        .withArgs(Arrays.asList("jzcfyjzptwr", "ohapqinfsz", "yglqdhmrjzral"))
                        .withEnv(Arrays.asList(new EnvironmentVar()))
                        .withResources(
                            new ContainerResources().withCpu(46.62900167875854D).withMemory("sjoqcjenkyhfqzvs")),
                    new JobExecutionContainer().withImage("pzqjhhhq")
                        .withName("w")
                        .withCommand(Arrays.asList("acoyvivbsizusjs", "lbscmnlz", "jiu"))
                        .withArgs(Arrays.asList("gmvflnwyvqkx"))
                        .withEnv(Arrays.asList(new EnvironmentVar(), new EnvironmentVar()))
                        .withResources(new ContainerResources().withCpu(49.010491721008606D).withMemory("yl")))))
            .withDetailedStatus(new ExecutionStatus().withReplicas(Arrays.asList(
                new ReplicaExecutionStatus().withName("hghmupgxyj")
                    .withContainers(Arrays.asList(new ContainerExecutionStatus(), new ContainerExecutionStatus(),
                        new ContainerExecutionStatus())),
                new ReplicaExecutionStatus().withName("abbujftabenb")
                    .withContainers(Arrays.asList(new ContainerExecutionStatus())),
                new ReplicaExecutionStatus().withName("pxzuca")
                    .withContainers(Arrays.asList(new ContainerExecutionStatus(), new ContainerExecutionStatus(),
                        new ContainerExecutionStatus(), new ContainerExecutionStatus())),
                new ReplicaExecutionStatus().withName("wwnlzafwxudgnh")
                    .withContainers(Arrays.asList(new ContainerExecutionStatus(), new ContainerExecutionStatus(),
                        new ContainerExecutionStatus())))));
        model = BinaryData.fromObject(model).toObject(JobExecutionInner.class);
        Assertions.assertEquals("txpnrupza", model.name());
        Assertions.assertEquals("rdixt", model.id());
        Assertions.assertEquals("kidswys", model.type());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-17T17:15:37Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-21T15:00:18Z"), model.endTime());
        Assertions.assertEquals("utvlxhr", model.template().containers().get(0).image());
        Assertions.assertEquals("hvmblcouqehbhbc", model.template().containers().get(0).name());
        Assertions.assertEquals("iryr", model.template().containers().get(0).command().get(0));
        Assertions.assertEquals("dykalsygaolnjpnn", model.template().containers().get(0).args().get(0));
        Assertions.assertEquals(17.229341989191948D, model.template().containers().get(0).resources().cpu());
        Assertions.assertEquals("wbjijkgq", model.template().containers().get(0).resources().memory());
        Assertions.assertEquals("znj", model.template().initContainers().get(0).image());
        Assertions.assertEquals("jvaannggiycwkd", model.template().initContainers().get(0).name());
        Assertions.assertEquals("wxwfekaumrr", model.template().initContainers().get(0).command().get(0));
        Assertions.assertEquals("bnxwbjsidbirkf", model.template().initContainers().get(0).args().get(0));
        Assertions.assertEquals(9.06822637742738D, model.template().initContainers().get(0).resources().cpu());
        Assertions.assertEquals("hbguzo", model.template().initContainers().get(0).resources().memory());
        Assertions.assertEquals("hghmupgxyj", model.detailedStatus().replicas().get(0).name());
    }
}
