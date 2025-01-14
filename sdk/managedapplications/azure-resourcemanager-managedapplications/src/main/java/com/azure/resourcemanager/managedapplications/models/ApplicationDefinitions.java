// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managedapplications.fluent.models.ApplicationDefinitionInner;

/** Resource collection API of ApplicationDefinitions. */
public interface ApplicationDefinitions {
    /**
     * Gets the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed application definition along with {@link Response}.
     */
    Response<ApplicationDefinition> getByResourceGroupWithResponse(
        String resourceGroupName, String applicationDefinitionName, Context context);

    /**
     * Gets the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed application definition.
     */
    ApplicationDefinition getByResourceGroup(String resourceGroupName, String applicationDefinitionName);

    /**
     * Deletes the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String applicationDefinitionName);

    /**
     * Deletes the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String applicationDefinitionName, Context context);

    /**
     * Lists the managed application definitions in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed application definitions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ApplicationDefinition> listByResourceGroup(String resourceGroupName);

    /**
     * Lists the managed application definitions in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed application definitions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ApplicationDefinition> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed application definition along with {@link Response}.
     */
    Response<ApplicationDefinition> getByIdWithResponse(
        String resourceGroupName, String applicationDefinitionName, Context context);

    /**
     * Gets the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed application definition.
     */
    ApplicationDefinition getById(String resourceGroupName, String applicationDefinitionName);

    /**
     * Deletes the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String resourceGroupName, String applicationDefinitionName);

    /**
     * Deletes the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String resourceGroupName, String applicationDefinitionName, Context context);

    /**
     * Creates a new managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param parameters Parameters supplied to the create or update a managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application definition.
     */
    ApplicationDefinition createOrUpdateById(
        String resourceGroupName, String applicationDefinitionName, ApplicationDefinitionInner parameters);

    /**
     * Creates a new managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param parameters Parameters supplied to the create or update a managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application definition.
     */
    ApplicationDefinition createOrUpdateById(
        String resourceGroupName,
        String applicationDefinitionName,
        ApplicationDefinitionInner parameters,
        Context context);

    /**
     * Begins definition for a new ApplicationDefinition resource.
     *
     * @param name resource name.
     * @return the first stage of the new ApplicationDefinition definition.
     */
    ApplicationDefinition.DefinitionStages.Blank define(String name);
}
