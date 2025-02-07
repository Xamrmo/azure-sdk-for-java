// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of ContainerAppsBuildsByContainerApps.
 */
public interface ContainerAppsBuildsByContainerApps {
    /**
     * List Container Apps Build resources by Container App.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App the Build is associated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Container Apps Build Resource list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<ContainerAppsBuildResource> list(String resourceGroupName, String containerAppName);

    /**
     * List Container Apps Build resources by Container App.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App the Build is associated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Container Apps Build Resource list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<ContainerAppsBuildResource> list(String resourceGroupName, String containerAppName, Context context);
}
