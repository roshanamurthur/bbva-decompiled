package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1kSDK extends AFd1uSDK<Void> {

    @Nullable
    private final Throwable afDebugLog;

    @Nullable
    private final AFc1gSDK<String> afInfoLog;
    private final AFb1fSDK afRDLog;

    public AFe1kSDK(AFd1hSDK aFd1hSDK, AFb1fSDK aFb1fSDK) {
        super(AFd1vSDK.GCDSDK, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, "GCD-CHECK");
        this.afDebugLog = aFd1hSDK.afInfoLog();
        this.afInfoLog = ((AFd1nSDK) aFd1hSDK).AFLogger;
        this.afRDLog = aFb1fSDK;
    }

    @Nullable
    private Map<String, Object> afDebugLog() {
        String strValueOf = this.afRDLog.valueOf("attributionId", (String) null);
        if (strValueOf == null) {
            return null;
        }
        try {
            new AFc1iSDK();
            return AFc1iSDK.AFInAppEventType(strValueOf);
        } catch (JSONException e5) {
            StringBuilder sb2 = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb2.append(e5.getMessage());
            AFLogger.afErrorLog(sb2.toString(), e5);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final long AFKeystoreWrapper() {
        return 1000L;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    @NonNull
    public final AFd1ySDK values() throws Exception {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.afRDLog.AFInAppEventType("appsFlyerCount", 0))));
        long jValues = this.afRDLog.values("appsflyerConversionDataCacheExpiration", 0L);
        if (jValues != 0 && System.currentTimeMillis() - jValues > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.afRDLog.valueOf("sixtyDayConversionData", true);
            this.afRDLog.values("attributionId", (String) null);
            this.afRDLog.AFInAppEventType("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> mapAfDebugLog = afDebugLog();
        if (mapAfDebugLog != null) {
            try {
                if (!mapAfDebugLog.containsKey("is_first_launch")) {
                    mapAfDebugLog.put("is_first_launch", Boolean.FALSE);
                }
                AFe1pSDK.AFInAppEventType(mapAfDebugLog);
            } catch (Exception e5) {
                StringBuilder sb2 = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb2.append(e5.getLocalizedMessage());
                AFLogger.afErrorLog(sb2.toString(), e5);
            }
            return AFd1ySDK.SUCCESS;
        }
        try {
            if (this.afDebugLog != null) {
                StringBuilder sb3 = new StringBuilder("Launch exception: ");
                sb3.append(this.afDebugLog.getMessage());
                AFe1pSDK.AFInAppEventType(sb3.toString());
                return AFd1ySDK.SUCCESS;
            }
            AFc1gSDK<String> aFc1gSDK = this.afInfoLog;
            if (aFc1gSDK != null && !aFc1gSDK.isSuccessful()) {
                StringBuilder sb4 = new StringBuilder("Launch status code: ");
                sb4.append(this.afInfoLog.getStatusCode());
                AFe1pSDK.AFInAppEventType(sb4.toString());
                return AFd1ySDK.SUCCESS;
            }
            return AFd1ySDK.FAILURE;
        } catch (Exception e7) {
            StringBuilder sb5 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb5.append(e7.getLocalizedMessage());
            AFLogger.afErrorLog(sb5.toString(), e7);
        }
    }
}
