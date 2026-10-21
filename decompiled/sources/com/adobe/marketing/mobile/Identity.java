package com.adobe.marketing.mobile;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Identity {
    private static final String EXTENSION_VERSION = "1.3.2";
    private static final String NULL_CONTEXT_MESSAGE = "Context must be set before calling SDK methods";
    private static final String TAG = "Identity";
    private static IdentityCore identityCore;

    private Identity() {
    }

    public static void appendVisitorInfoForURL(String str, AdobeCallback<String> adobeCallback) {
        if (identityCore == null) {
            Log.error(TAG, "appendVisitorInfoForURL : Unable to append Visitor information to URL because (%s)", NULL_CONTEXT_MESSAGE);
            returnExtensionNotInitializedError(adobeCallback);
        } else {
            Log.trace(TAG, "appendVisitorInfoForURL : Processing a request to append Adobe visitor data to a URL string.", new Object[0]);
            identityCore.appendToURL(str, adobeCallback);
        }
    }

    public static String extensionVersion() {
        return EXTENSION_VERSION;
    }

    public static void getExperienceCloudId(AdobeCallback<String> adobeCallback) {
        if (identityCore == null) {
            Log.error(TAG, "getExperienceCloudId : Unable to get ECID because (%s)", NULL_CONTEXT_MESSAGE);
            returnExtensionNotInitializedError(adobeCallback);
        } else {
            Log.trace(TAG, "getExperienceCloudId : Processing the request to get ECID.", new Object[0]);
            identityCore.getExperienceCloudId(adobeCallback);
        }
    }

    public static void getIdentifiers(AdobeCallback<List<VisitorID>> adobeCallback) {
        if (identityCore == null) {
            Log.error(TAG, "getIdentifiers : Unable to get Visitor identifiers because (%s)", NULL_CONTEXT_MESSAGE);
            returnExtensionNotInitializedError(adobeCallback);
        } else {
            Log.trace(TAG, "getIdentifiers : Processing a request to get all customer identifiers.", new Object[0]);
            identityCore.getIdentifiers(adobeCallback);
        }
    }

    public static void getUrlVariables(AdobeCallback<String> adobeCallback) {
        if (identityCore == null) {
            Log.error(TAG, "getUrlVariables : Unable to retrieve Visitor information as URL query parameter string because (%s)", NULL_CONTEXT_MESSAGE);
            returnExtensionNotInitializedError(adobeCallback);
        } else {
            Log.trace(TAG, "getUrlVariables : Processing the request to get Visitor information as URL query parameters.", new Object[0]);
            identityCore.getUrlVariables(adobeCallback);
        }
    }

    public static void registerExtension() throws InvalidInitException {
        Core core = MobileCore.getCore();
        if (core == null) {
            throw new InvalidInitException();
        }
        try {
            identityCore = new IdentityCore(core.eventHub, new IdentityModuleDetails());
        } catch (Exception unused) {
            throw new InvalidInitException();
        }
    }

    public static void resetIdentityCore() {
        identityCore = null;
    }

    private static void returnExtensionNotInitializedError(AdobeCallback adobeCallback) {
        if (adobeCallback == null) {
            return;
        }
        AdobeCallbackWithError adobeCallbackWithError = adobeCallback instanceof AdobeCallbackWithError ? (AdobeCallbackWithError) adobeCallback : null;
        if (adobeCallbackWithError != null) {
            adobeCallbackWithError.fail(AdobeError.EXTENSION_NOT_INITIALIZED);
        }
    }

    public static void syncIdentifier(String str, String str2, VisitorID.AuthenticationState authenticationState) {
        if (identityCore == null) {
            Log.error(TAG, "syncIdentifier : Unable to sync Visitor identifiers because (%s)", NULL_CONTEXT_MESSAGE);
        } else if (StringUtils.isNullOrEmpty(str)) {
            Log.warning(TAG, "syncIdentifier : Unable to sync Visitor identifier due to null or empty identifierType", new Object[0]);
        } else {
            Log.trace(TAG, "syncIdentifier : Processing a request to sync Visitor identifier.", new Object[0]);
            identityCore.syncIdentifier(str, str2, authenticationState);
        }
    }

    public static void syncIdentifiers(Map<String, String> map) {
        if (identityCore == null) {
            Log.error(TAG, "syncIdentifiers(ids) : Unable to sync Visitor identifiers because (%s).", NULL_CONTEXT_MESSAGE);
        } else if (map == null || map.isEmpty()) {
            Log.warning(TAG, "syncIdentifiers(ids) : Unable to sync Visitor identifiers, provided map was null or empty.", new Object[0]);
        } else {
            Log.trace(TAG, "syncIdentifiers(ids) : Processing a request to sync Visitor identifiers.", new Object[0]);
            identityCore.syncIdentifiers(map);
        }
    }

    public static void syncIdentifiers(Map<String, String> map, VisitorID.AuthenticationState authenticationState) {
        if (identityCore == null) {
            Log.error(TAG, "syncIdentifiers(ids, state) : Unable to sync Visitor identifiers because (%s)", NULL_CONTEXT_MESSAGE);
        } else if (map != null && !map.isEmpty()) {
            Log.trace(TAG, "syncIdentifiers(ids, state) : Processing a request to sync Visitor identifiers.", new Object[0]);
            identityCore.syncIdentifiers(map, authenticationState);
        } else {
            Log.warning(TAG, "syncIdentifiers(ids, state) : Unable to sync Visitor identifiers, provided map was null or empty", new Object[0]);
        }
    }
}
