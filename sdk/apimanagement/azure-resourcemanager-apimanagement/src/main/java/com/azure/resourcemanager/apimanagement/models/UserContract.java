// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.UserContractInner;
import com.azure.resourcemanager.apimanagement.fluent.models.UserIdentityContractInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of UserContract. */
public interface UserContract {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the state property: Account state. Specifies whether the user is active or not. Blocked users are unable to
     * sign into the developer portal or call any APIs of subscribed products. Default state is Active.
     *
     * @return the state value.
     */
    UserState state();

    /**
     * Gets the note property: Optional note about a user set by the administrator.
     *
     * @return the note value.
     */
    String note();

    /**
     * Gets the identities property: Collection of user identities.
     *
     * @return the identities value.
     */
    List<UserIdentityContract> identities();

    /**
     * Gets the firstName property: First name.
     *
     * @return the firstName value.
     */
    String firstName();

    /**
     * Gets the lastName property: Last name.
     *
     * @return the lastName value.
     */
    String lastName();

    /**
     * Gets the email property: Email address.
     *
     * @return the email value.
     */
    String email();

    /**
     * Gets the registrationDate property: Date of user registration. The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the registrationDate value.
     */
    OffsetDateTime registrationDate();

    /**
     * Gets the groups property: Collection of groups user is part of.
     *
     * @return the groups value.
     */
    List<GroupContractProperties> groups();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.UserContractInner object.
     *
     * @return the inner object.
     */
    UserContractInner innerModel();

    /** The entirety of the UserContract definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The UserContract definition stages. */
    interface DefinitionStages {
        /** The first stage of the UserContract definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the UserContract definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param serviceName The name of the API Management service.
             * @return the next definition stage.
             */
            WithCreate withExistingService(String resourceGroupName, String serviceName);
        }
        /**
         * The stage of the UserContract definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithState,
                DefinitionStages.WithNote,
                DefinitionStages.WithIdentities,
                DefinitionStages.WithEmail,
                DefinitionStages.WithFirstName,
                DefinitionStages.WithLastName,
                DefinitionStages.WithPassword,
                DefinitionStages.WithAppType,
                DefinitionStages.WithConfirmation,
                DefinitionStages.WithNotify,
                DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            UserContract create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            UserContract create(Context context);
        }
        /** The stage of the UserContract definition allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: Account state. Specifies whether the user is active or not. Blocked users
             * are unable to sign into the developer portal or call any APIs of subscribed products. Default state is
             * Active..
             *
             * @param state Account state. Specifies whether the user is active or not. Blocked users are unable to sign
             *     into the developer portal or call any APIs of subscribed products. Default state is Active.
             * @return the next definition stage.
             */
            WithCreate withState(UserState state);
        }
        /** The stage of the UserContract definition allowing to specify note. */
        interface WithNote {
            /**
             * Specifies the note property: Optional note about a user set by the administrator..
             *
             * @param note Optional note about a user set by the administrator.
             * @return the next definition stage.
             */
            WithCreate withNote(String note);
        }
        /** The stage of the UserContract definition allowing to specify identities. */
        interface WithIdentities {
            /**
             * Specifies the identities property: Collection of user identities..
             *
             * @param identities Collection of user identities.
             * @return the next definition stage.
             */
            WithCreate withIdentities(List<UserIdentityContractInner> identities);
        }
        /** The stage of the UserContract definition allowing to specify email. */
        interface WithEmail {
            /**
             * Specifies the email property: Email address. Must not be empty and must be unique within the service
             * instance..
             *
             * @param email Email address. Must not be empty and must be unique within the service instance.
             * @return the next definition stage.
             */
            WithCreate withEmail(String email);
        }
        /** The stage of the UserContract definition allowing to specify firstName. */
        interface WithFirstName {
            /**
             * Specifies the firstName property: First name..
             *
             * @param firstName First name.
             * @return the next definition stage.
             */
            WithCreate withFirstName(String firstName);
        }
        /** The stage of the UserContract definition allowing to specify lastName. */
        interface WithLastName {
            /**
             * Specifies the lastName property: Last name..
             *
             * @param lastName Last name.
             * @return the next definition stage.
             */
            WithCreate withLastName(String lastName);
        }
        /** The stage of the UserContract definition allowing to specify password. */
        interface WithPassword {
            /**
             * Specifies the password property: User Password. If no value is provided, a default password is
             * generated..
             *
             * @param password User Password. If no value is provided, a default password is generated.
             * @return the next definition stage.
             */
            WithCreate withPassword(String password);
        }
        /** The stage of the UserContract definition allowing to specify appType. */
        interface WithAppType {
            /**
             * Specifies the appType property: Determines the type of application which send the create user request.
             * Default is legacy portal..
             *
             * @param appType Determines the type of application which send the create user request. Default is legacy
             *     portal.
             * @return the next definition stage.
             */
            WithCreate withAppType(AppType appType);
        }
        /** The stage of the UserContract definition allowing to specify confirmation. */
        interface WithConfirmation {
            /**
             * Specifies the confirmation property: Determines the type of confirmation e-mail that will be sent to the
             * newly created user..
             *
             * @param confirmation Determines the type of confirmation e-mail that will be sent to the newly created
             *     user.
             * @return the next definition stage.
             */
            WithCreate withConfirmation(Confirmation confirmation);
        }
        /** The stage of the UserContract definition allowing to specify notify. */
        interface WithNotify {
            /**
             * Specifies the notify property: Send an Email notification to the User..
             *
             * @param notify Send an Email notification to the User.
             * @return the next definition stage.
             */
            WithCreate withNotify(Boolean notify);
        }
        /** The stage of the UserContract definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. Not required when creating an entity, but required
             * when updating an entity..
             *
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an
             *     entity.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }
    /**
     * Begins update for the UserContract resource.
     *
     * @return the stage of resource update.
     */
    UserContract.Update update();

    /** The template for UserContract update. */
    interface Update
        extends UpdateStages.WithState,
            UpdateStages.WithNote,
            UpdateStages.WithIdentities,
            UpdateStages.WithEmail,
            UpdateStages.WithPassword,
            UpdateStages.WithFirstName,
            UpdateStages.WithLastName,
            UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        UserContract apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        UserContract apply(Context context);
    }
    /** The UserContract update stages. */
    interface UpdateStages {
        /** The stage of the UserContract update allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: Account state. Specifies whether the user is active or not. Blocked users
             * are unable to sign into the developer portal or call any APIs of subscribed products. Default state is
             * Active..
             *
             * @param state Account state. Specifies whether the user is active or not. Blocked users are unable to sign
             *     into the developer portal or call any APIs of subscribed products. Default state is Active.
             * @return the next definition stage.
             */
            Update withState(UserState state);
        }
        /** The stage of the UserContract update allowing to specify note. */
        interface WithNote {
            /**
             * Specifies the note property: Optional note about a user set by the administrator..
             *
             * @param note Optional note about a user set by the administrator.
             * @return the next definition stage.
             */
            Update withNote(String note);
        }
        /** The stage of the UserContract update allowing to specify identities. */
        interface WithIdentities {
            /**
             * Specifies the identities property: Collection of user identities..
             *
             * @param identities Collection of user identities.
             * @return the next definition stage.
             */
            Update withIdentities(List<UserIdentityContractInner> identities);
        }
        /** The stage of the UserContract update allowing to specify email. */
        interface WithEmail {
            /**
             * Specifies the email property: Email address. Must not be empty and must be unique within the service
             * instance..
             *
             * @param email Email address. Must not be empty and must be unique within the service instance.
             * @return the next definition stage.
             */
            Update withEmail(String email);
        }
        /** The stage of the UserContract update allowing to specify password. */
        interface WithPassword {
            /**
             * Specifies the password property: User Password..
             *
             * @param password User Password.
             * @return the next definition stage.
             */
            Update withPassword(String password);
        }
        /** The stage of the UserContract update allowing to specify firstName. */
        interface WithFirstName {
            /**
             * Specifies the firstName property: First name..
             *
             * @param firstName First name.
             * @return the next definition stage.
             */
            Update withFirstName(String firstName);
        }
        /** The stage of the UserContract update allowing to specify lastName. */
        interface WithLastName {
            /**
             * Specifies the lastName property: Last name..
             *
             * @param lastName Last name.
             * @return the next definition stage.
             */
            Update withLastName(String lastName);
        }
        /** The stage of the UserContract update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. ETag should match the current entity state from the
             * header response of the GET request or it should be * for unconditional update..
             *
             * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of
             *     the GET request or it should be * for unconditional update.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    UserContract refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    UserContract refresh(Context context);

    /**
     * Retrieves a redirection URL containing an authentication token for signing a given user into the developer
     * portal.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return generate SSO Url operations response details.
     */
    GenerateSsoUrlResult generateSsoUrl();

    /**
     * Retrieves a redirection URL containing an authentication token for signing a given user into the developer
     * portal.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return generate SSO Url operations response details.
     */
    Response<GenerateSsoUrlResult> generateSsoUrlWithResponse(Context context);

    /**
     * Gets the Shared Access Authorization Token for the User.
     *
     * @param parameters Create Authorization Token parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Shared Access Authorization Token for the User.
     */
    UserTokenResult getSharedAccessToken(UserTokenParameters parameters);

    /**
     * Gets the Shared Access Authorization Token for the User.
     *
     * @param parameters Create Authorization Token parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Shared Access Authorization Token for the User.
     */
    Response<UserTokenResult> getSharedAccessTokenWithResponse(UserTokenParameters parameters, Context context);
}