package com.appsflyer.internal;

import android.content.pm.PackageItemInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1cSDK {
    private static String valueOf = "253";
    public final AFb1fSDK AFInAppEventType;
    private Bundle AFKeystoreWrapper = null;
    public final AFb1bSDK values;

    public AFb1cSDK(AFb1bSDK aFb1bSDK, AFb1fSDK aFb1fSDK) {
        this.values = aFb1bSDK;
        this.AFInAppEventType = aFb1fSDK;
    }

    @Nullable
    public static String AFInAppEventParameterName() {
        StringBuilder sb2 = new StringBuilder("version: 6.12.1 (build ");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }

    public static String values() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    public final boolean AFInAppEventType(String str) {
        String strValueOf = valueOf(str);
        if (strValueOf != null) {
            return Boolean.parseBoolean(strValueOf);
        }
        return false;
    }

    public final String AFKeystoreWrapper() {
        String string = AppsFlyerProperties.getInstance().getString("channel");
        if (string == null) {
            string = valueOf("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    @Nullable
    public final String valueOf(String str) {
        Object obj;
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = ((PackageItemInfo) this.values.AFInAppEventParameterName.getPackageManager().getApplicationInfo(this.values.AFInAppEventParameterName.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.AFKeystoreWrapper;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Could not load manifest metadata!");
            sb2.append(th2.getMessage());
            AFLogger.afErrorLog(sb2.toString(), th2);
            return null;
        }
    }
}
