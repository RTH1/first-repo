// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Settings for Extended Groups username and group download. */
@Fluent
public final class CacheUsernameDownloadSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CacheUsernameDownloadSettings.class);

    /*
     * Whether or not Extended Groups is enabled.
     */
    @JsonProperty(value = "extendedGroups")
    private Boolean extendedGroups;

    /*
     * This setting determines how the cache gets username and group names for
     * clients.
     */
    @JsonProperty(value = "usernameSource")
    private UsernameSource usernameSource;

    /*
     * The URI of the file containing group information (in /etc/group file
     * format). This field must be populated when 'usernameSource' is set to
     * 'File'.
     */
    @JsonProperty(value = "groupFileURI")
    private String groupFileUri;

    /*
     * The URI of the file containing user information (in /etc/passwd file
     * format). This field must be populated when 'usernameSource' is set to
     * 'File'.
     */
    @JsonProperty(value = "userFileURI")
    private String userFileUri;

    /*
     * The fully qualified domain name or IP address of the LDAP server to use.
     */
    @JsonProperty(value = "ldapServer")
    private String ldapServer;

    /*
     * The base distinguished name for the LDAP domain.
     */
    @JsonProperty(value = "ldapBaseDN")
    private String ldapBaseDN;

    /*
     * Whether or not the LDAP connection should be encrypted.
     */
    @JsonProperty(value = "encryptLdapConnection")
    private Boolean encryptLdapConnection;

    /*
     * Determines if the certificates must be validated by a certificate
     * authority. When true, caCertificateURI must be provided.
     */
    @JsonProperty(value = "requireValidCertificate")
    private Boolean requireValidCertificate;

    /*
     * Determines if the certificate should be automatically downloaded. This
     * applies to 'caCertificateURI' only if 'requireValidCertificate' is true.
     */
    @JsonProperty(value = "autoDownloadCertificate")
    private Boolean autoDownloadCertificate;

    /*
     * The URI of the CA certificate to validate the LDAP secure connection.
     * This field must be populated when 'requireValidCertificate' is set to
     * true.
     */
    @JsonProperty(value = "caCertificateURI")
    private String caCertificateUri;

    /*
     * Indicates whether or not the HPC Cache has performed the username
     * download successfully.
     */
    @JsonProperty(value = "usernameDownloaded", access = JsonProperty.Access.WRITE_ONLY)
    private UsernameDownloadedType usernameDownloaded;

    /*
     * When present, these are the credentials for the secure LDAP connection.
     */
    @JsonProperty(value = "credentials")
    private CacheUsernameDownloadSettingsCredentials credentials;

    /**
     * Get the extendedGroups property: Whether or not Extended Groups is enabled.
     *
     * @return the extendedGroups value.
     */
    public Boolean extendedGroups() {
        return this.extendedGroups;
    }

    /**
     * Set the extendedGroups property: Whether or not Extended Groups is enabled.
     *
     * @param extendedGroups the extendedGroups value to set.
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withExtendedGroups(Boolean extendedGroups) {
        this.extendedGroups = extendedGroups;
        return this;
    }

    /**
     * Get the usernameSource property: This setting determines how the cache gets username and group names for clients.
     *
     * @return the usernameSource value.
     */
    public UsernameSource usernameSource() {
        return this.usernameSource;
    }

    /**
     * Set the usernameSource property: This setting determines how the cache gets username and group names for clients.
     *
     * @param usernameSource the usernameSource value to set.
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withUsernameSource(UsernameSource usernameSource) {
        this.usernameSource = usernameSource;
        return this;
    }

    /**
     * Get the groupFileUri property: The URI of the file containing group information (in /etc/group file format). This
     * field must be populated when 'usernameSource' is set to 'File'.
     *
     * @return the groupFileUri value.
     */
    public String groupFileUri() {
        return this.groupFileUri;
    }

    /**
     * Set the groupFileUri property: The URI of the file containing group information (in /etc/group file format). This
     * field must be populated when 'usernameSource' is set to 'File'.
     *
     * @param groupFileUri the groupFileUri value to set.
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withGroupFileUri(String groupFileUri) {
        this.groupFileUri = groupFileUri;
        return this;
    }

    /**
     * Get the userFileUri property: The URI of the file containing user information (in /etc/passwd file format). This
     * field must be populated when 'usernameSource' is set to 'File'.
     *
     * @return the userFileUri value.
     */
    public String userFileUri() {
        return this.userFileUri;
    }

    /**
     * Set the userFileUri property: The URI of the file containing user information (in /etc/passwd file format). This
     * field must be populated when 'usernameSource' is set to 'File'.
     *
     * @param userFileUri the userFileUri value to set.
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withUserFileUri(String userFileUri) {
        this.userFileUri = userFileUri;
        return this;
    }

    /**
     * Get the ldapServer property: The fully qualified domain name or IP address of the LDAP server to use.
     *
     * @return the ldapServer value.
     */
    public String ldapServer() {
        return this.ldapServer;
    }

    /**
     * Set the ldapServer property: The fully qualified domain name or IP address of the LDAP server to use.
     *
     * @param ldapServer the ldapServer value to set.
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withLdapServer(String ldapServer) {
        this.ldapServer = ldapServer;
        return this;
    }

    /**
     * Get the ldapBaseDN property: The base distinguished name for the LDAP domain.
     *
     * @return the ldapBaseDN value.
     */
    public String ldapBaseDN() {
        return this.ldapBaseDN;
    }

    /**
     * Set the ldapBaseDN property: The base distinguished name for the LDAP domain.
     *
     * @param ldapBaseDN the ldapBaseDN value to set.
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withLdapBaseDN(String ldapBaseDN) {
        this.ldapBaseDN = ldapBaseDN;
        return this;
    }

    /**
     * Get the encryptLdapConnection property: Whether or not the LDAP connection should be encrypted.
     *
     * @return the encryptLdapConnection value.
     */
    public Boolean encryptLdapConnection() {
        return this.encryptLdapConnection;
    }

    /**
     * Set the encryptLdapConnection property: Whether or not the LDAP connection should be encrypted.
     *
     * @param encryptLdapConnection the encryptLdapConnection value to set.
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withEncryptLdapConnection(Boolean encryptLdapConnection) {
        this.encryptLdapConnection = encryptLdapConnection;
        return this;
    }

    /**
     * Get the requireValidCertificate property: Determines if the certificates must be validated by a certificate
     * authority. When true, caCertificateURI must be provided.
     *
     * @return the requireValidCertificate value.
     */
    public Boolean requireValidCertificate() {
        return this.requireValidCertificate;
    }

    /**
     * Set the requireValidCertificate property: Determines if the certificates must be validated by a certificate
     * authority. When true, caCertificateURI must be provided.
     *
     * @param requireValidCertificate the requireValidCertificate value to set.
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withRequireValidCertificate(Boolean requireValidCertificate) {
        this.requireValidCertificate = requireValidCertificate;
        return this;
    }

    /**
     * Get the autoDownloadCertificate property: Determines if the certificate should be automatically downloaded. This
     * applies to 'caCertificateURI' only if 'requireValidCertificate' is true.
     *
     * @return the autoDownloadCertificate value.
     */
    public Boolean autoDownloadCertificate() {
        return this.autoDownloadCertificate;
    }

    /**
     * Set the autoDownloadCertificate property: Determines if the certificate should be automatically downloaded. This
     * applies to 'caCertificateURI' only if 'requireValidCertificate' is true.
     *
     * @param autoDownloadCertificate the autoDownloadCertificate value to set.
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withAutoDownloadCertificate(Boolean autoDownloadCertificate) {
        this.autoDownloadCertificate = autoDownloadCertificate;
        return this;
    }

    /**
     * Get the caCertificateUri property: The URI of the CA certificate to validate the LDAP secure connection. This
     * field must be populated when 'requireValidCertificate' is set to true.
     *
     * @return the caCertificateUri value.
     */
    public String caCertificateUri() {
        return this.caCertificateUri;
    }

    /**
     * Set the caCertificateUri property: The URI of the CA certificate to validate the LDAP secure connection. This
     * field must be populated when 'requireValidCertificate' is set to true.
     *
     * @param caCertificateUri the caCertificateUri value to set.
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withCaCertificateUri(String caCertificateUri) {
        this.caCertificateUri = caCertificateUri;
        return this;
    }

    /**
     * Get the usernameDownloaded property: Indicates whether or not the HPC Cache has performed the username download
     * successfully.
     *
     * @return the usernameDownloaded value.
     */
    public UsernameDownloadedType usernameDownloaded() {
        return this.usernameDownloaded;
    }

    /**
     * Get the credentials property: When present, these are the credentials for the secure LDAP connection.
     *
     * @return the credentials value.
     */
    public CacheUsernameDownloadSettingsCredentials credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: When present, these are the credentials for the secure LDAP connection.
     *
     * @param credentials the credentials value to set.
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withCredentials(CacheUsernameDownloadSettingsCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (credentials() != null) {
            credentials().validate();
        }
    }
}