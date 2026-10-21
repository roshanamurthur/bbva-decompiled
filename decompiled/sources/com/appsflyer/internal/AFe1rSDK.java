package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1rSDK extends AFd1nSDK<Map<String, Object>> {
    private static final List<String> afInfoLog = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private final AFe1lSDK AFLogger$LogLevel;
    private final AFb1fSDK AFVersionDeclaration;

    @Nullable
    private Map<String, Object> afErrorLogForExcManagerOnly;
    private final AFc1qSDK afWarnLog;
    private final AFb1cSDK getLevel;

    @Nullable
    private String init;

    public AFe1rSDK(@NonNull AFc1zSDK aFc1zSDK) {
        super(AFd1vSDK.GCDSDK, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, "GCD-FETCH");
        this.afWarnLog = aFc1zSDK.AFInAppEventType();
        this.AFVersionDeclaration = aFc1zSDK.AFKeystoreWrapper();
        this.AFLogger$LogLevel = aFc1zSDK.AFLogger();
        this.getLevel = aFc1zSDK.AFInAppEventParameterName();
        this.valueOf.add(AFd1vSDK.CONVERSION);
        this.valueOf.add(AFd1vSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1nSDK<Map<String, Object>> AFKeystoreWrapper(@NonNull String str) {
        String strConcat;
        String strValues = AFa1dSDK.values(this.AFVersionDeclaration, this.getLevel.AFKeystoreWrapper());
        if (strValues == null || strValues.trim().isEmpty()) {
            strConcat = "";
        } else if (afInfoLog.contains(strValues.toLowerCase(Locale.getDefault()))) {
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", strValues));
            strConcat = "";
        } else {
            strConcat = Constant.DASH_STRING.concat(strValues);
        }
        AFc1nSDK<Map<String, Object>> aFc1nSDKAFInAppEventType = this.afWarnLog.AFInAppEventType(strConcat, str);
        StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
        sb2.append(aFc1nSDKAFInAppEventType.valueOf.AFInAppEventParameterName);
        AFc1pSDK.AFKeystoreWrapper(sb2.toString());
        return aFc1nSDKAFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    @Nullable
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afRDLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final void valueOf() {
        super.valueOf();
        Map<String, Object> map = this.afErrorLogForExcManagerOnly;
        String str = this.init;
        if (map != null) {
            AFe1pSDK.AFInAppEventType(map);
        } else if (str == null || str.isEmpty()) {
            AFe1pSDK.AFInAppEventType("Unknown error");
        } else {
            AFe1pSDK.AFInAppEventType(str);
        }
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    @NonNull
    public final AFd1ySDK values() throws Exception {
        AFd1ySDK aFd1ySDKValues;
        AFd1ySDK aFd1ySDK;
        if (((AFd1nSDK) this).afRDLog.values()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.init = "'isStopTracking' enabled";
            throw new AFd1rSDK();
        }
        AFd1ySDK aFd1ySDK2 = AFd1ySDK.FAILURE;
        int i10 = 0;
        while (i10 <= 2) {
            boolean z10 = i10 >= 2;
            this.AFLogger$LogLevel.getLevel = System.currentTimeMillis();
            try {
                try {
                    aFd1ySDKValues = super.values();
                    ResponseNetwork responseNetwork = ((AFd1nSDK) this).AFLogger;
                    if (responseNetwork != null) {
                        int statusCode = responseNetwork.getStatusCode();
                        boolean z11 = statusCode == 403 || statusCode >= 500;
                        if (responseNetwork.isSuccessful() || statusCode == 404) {
                            Map<String, Object> map = (Map) responseNetwork.getBody();
                            int statusCode2 = responseNetwork.getStatusCode();
                            Boolean bool = (Boolean) map.get("iscache");
                            if (statusCode2 == 404) {
                                map.remove("error_reason");
                                map.remove("status_code");
                                map.put("af_status", "Organic");
                                map.put("af_message", "organic install");
                            }
                            if (bool != null && !bool.booleanValue()) {
                                this.AFVersionDeclaration.AFInAppEventType("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (map.containsKey("af_siteid")) {
                                if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                    StringBuilder sb2 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                    sb2.append(map.get(AFInAppEventParameterName.AF_CHANNEL));
                                    AFLogger.afDebugLog(sb2.toString());
                                } else {
                                    AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                }
                            }
                            map.put("is_first_launch", Boolean.FALSE);
                            this.AFVersionDeclaration.values("attributionId", new JSONObject(map).toString());
                            if (!this.AFVersionDeclaration.AFKeystoreWrapper("sixtyDayConversionData")) {
                                map.put("is_first_launch", Boolean.TRUE);
                            }
                            this.afErrorLogForExcManagerOnly = map;
                            aFd1ySDK = AFd1ySDK.SUCCESS;
                        } else {
                            if (!z10) {
                                if (!z11) {
                                }
                            }
                            this.init = "Error connection to server: ".concat(String.valueOf(statusCode));
                            aFd1ySDK = AFd1ySDK.FAILURE;
                        }
                        this.AFLogger$LogLevel.values(i10);
                        AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                        return aFd1ySDK;
                    }
                } catch (AFd1wSDK e5) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.init = "AppsFlyer dev key is missing";
                    throw e5;
                } catch (Exception e7) {
                    StringBuilder sb3 = new StringBuilder("[GCD] Error: ");
                    sb3.append(e7.getMessage());
                    AFLogger.afErrorLog(sb3.toString(), e7);
                    aFd1ySDKValues = AFd1ySDK.FAILURE;
                    if (z10) {
                        this.init = e7.getMessage();
                        throw e7;
                    }
                }
                this.AFLogger$LogLevel.values(i10);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                aFd1ySDK2 = aFd1ySDKValues;
                i10++;
            } catch (Throwable th2) {
                this.AFLogger$LogLevel.values(i10);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                throw th2;
            }
        }
        return aFd1ySDK2;
    }
}
