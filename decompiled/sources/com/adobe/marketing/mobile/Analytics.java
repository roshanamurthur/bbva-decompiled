package com.adobe.marketing.mobile;

import androidx.camera.core.impl.utils.a;
import androidx.camera.core.impl.utils.c;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public class Analytics {
    private static final String EXTENSION_VERSION = "1.2.10";
    private static final String OPERATING_SYSTEM = "AND";
    private static final String TAG = "Analytics";
    private static AnalyticsCore analyticsCore;

    private Analytics() {
    }

    public static void clearQueue() {
        AnalyticsCore analyticsCore2 = analyticsCore;
        if (analyticsCore2 == null) {
            return;
        }
        analyticsCore2.clearQueue();
    }

    public static String extensionVersion() {
        return EXTENSION_VERSION;
    }

    public static String getFormattedVersion(String str) {
        String str2;
        String str3;
        String str4;
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length != 3) {
            return "000000";
        }
        if (strArrSplit[0].length() == 1) {
            str2 = "0" + strArrSplit[0];
        } else {
            str2 = strArrSplit[0];
        }
        if (strArrSplit[1].length() == 1) {
            str3 = "0" + strArrSplit[1];
        } else {
            str3 = strArrSplit[1];
        }
        if (strArrSplit[2].length() == 1) {
            str4 = "0" + strArrSplit[2];
        } else {
            str4 = strArrSplit[2];
        }
        return a.b(str2, str3, str4);
    }

    public static void getQueueSize(AdobeCallback<Long> adobeCallback) {
        AnalyticsCore analyticsCore2 = analyticsCore;
        if (analyticsCore2 == null) {
            returnExtensionNotInitializedError(adobeCallback);
        } else {
            analyticsCore2.getQueueSize(adobeCallback);
        }
    }

    public static void getTrackingIdentifier(AdobeCallback<String> adobeCallback) {
        AnalyticsCore analyticsCore2 = analyticsCore;
        if (analyticsCore2 == null) {
            returnExtensionNotInitializedError(adobeCallback);
        } else {
            analyticsCore2.getTrackingIdentifier(adobeCallback);
        }
    }

    public static String getVersionString(String str, String str2) {
        String str3;
        String[] strArrSplit = str.split(Constant.DASH_STRING);
        if (strArrSplit.length == 2) {
            str = strArrSplit[0];
            str3 = strArrSplit[1];
        } else {
            str3 = "N";
        }
        return c.a(OPERATING_SYSTEM, str3, getFormattedVersion(str2), getFormattedVersion(str));
    }

    public static void getVisitorIdentifier(AdobeCallback<String> adobeCallback) {
        AnalyticsCore analyticsCore2 = analyticsCore;
        if (analyticsCore2 == null) {
            returnExtensionNotInitializedError(adobeCallback);
        } else {
            analyticsCore2.getVisitorIdentifier(adobeCallback);
        }
    }

    public static void registerExtension() throws InvalidInitException {
        Core core = MobileCore.getCore();
        if (core == null) {
            throw new InvalidInitException();
        }
        try {
            analyticsCore = new AnalyticsCore(core.eventHub, new AnalyticsModuleDetails(), getVersionString(MobileCore.extensionVersion(), EXTENSION_VERSION));
        } catch (Exception unused) {
            throw new InvalidInitException();
        }
    }

    public static void resetAnalyticsCore() {
        analyticsCore = null;
    }

    private static void returnExtensionNotInitializedError(AdobeCallback<?> adobeCallback) {
        if (adobeCallback == null) {
            return;
        }
        AdobeCallbackWithError adobeCallbackWithError = adobeCallback instanceof AdobeCallbackWithError ? (AdobeCallbackWithError) adobeCallback : null;
        if (adobeCallbackWithError != null) {
            adobeCallbackWithError.fail(AdobeError.EXTENSION_NOT_INITIALIZED);
        }
    }

    public static void sendQueuedHits() {
        AnalyticsCore analyticsCore2 = analyticsCore;
        if (analyticsCore2 == null) {
            return;
        }
        analyticsCore2.sendQueuedHits();
    }

    public static void setVisitorIdentifier(String str) {
        AnalyticsCore analyticsCore2 = analyticsCore;
        if (analyticsCore2 == null) {
            return;
        }
        analyticsCore2.updateVisitorIdentifier(str);
    }
}
