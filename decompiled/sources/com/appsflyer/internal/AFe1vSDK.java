package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1vSDK {
    private static final long AFInAppEventType = TimeUnit.HOURS.toSeconds(24);
    private final AFb1tSDK AFInAppEventParameterName;
    private final AFb1cSDK AFKeystoreWrapper;

    public AFe1vSDK(AFb1cSDK aFb1cSDK, AFb1tSDK aFb1tSDK) {
        this.AFKeystoreWrapper = aFb1cSDK;
        this.AFInAppEventParameterName = aFb1tSDK;
    }

    public final long AFInAppEventParameterName() {
        String strValueOf = this.AFKeystoreWrapper.valueOf("com.appsflyer.rc.cache.max-age-fallback");
        if (strValueOf == null) {
            return AFInAppEventType;
        }
        try {
            return Long.parseLong(strValueOf);
        } catch (NumberFormatException e5) {
            StringBuilder sb2 = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
            sb2.append(e5.getMessage());
            AFLogger.afErrorLog(sb2.toString(), e5);
            return AFInAppEventType;
        }
    }

    public final boolean AFInAppEventType() {
        if (this.AFInAppEventParameterName.AFInAppEventParameterName == null) {
            AFLogger.afInfoLog("CFG: active config is missing - fetching from CDN");
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        AFb1tSDK aFb1tSDK = this.AFInAppEventParameterName;
        return jCurrentTimeMillis - aFb1tSDK.values > TimeUnit.SECONDS.toMillis(aFb1tSDK.AFInAppEventType);
    }

    public final boolean valueOf() {
        return Boolean.parseBoolean(this.AFKeystoreWrapper.valueOf("com.appsflyer.rc.staging"));
    }

    public final boolean values() {
        return Boolean.parseBoolean(this.AFKeystoreWrapper.valueOf("com.appsflyer.rc.sandbox"));
    }
}
