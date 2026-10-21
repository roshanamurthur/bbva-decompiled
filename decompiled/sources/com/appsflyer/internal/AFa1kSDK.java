package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFd1tSDK.AnonymousClass5;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFa1kSDK implements Runnable {

    @VisibleForTesting
    private static String AFKeystoreWrapper = "https://%ssdk-services.%s/validate-android-signature";
    private static String valueOf;
    private final String AFInAppEventParameterName;
    private final Intent AFInAppEventType;
    private final String AFLogger;
    private final Map<String, String> AFLogger$LogLevel;
    private final String afDebugLog;
    private final String afErrorLog;
    private final String afInfoLog;
    private final String afRDLog;
    private final WeakReference<Context> values;

    static {
        StringBuilder sb2 = new StringBuilder("https://%svalidate.%s/api/v");
        sb2.append(AFa1dSDK.AFKeystoreWrapper);
        sb2.append("/androidevent?buildnumber=6.12.1&app_id=");
        valueOf = sb2.toString();
    }

    public AFa1kSDK(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, @Nullable Intent intent) {
        this.values = new WeakReference<>(context);
        this.AFInAppEventParameterName = str;
        this.afDebugLog = str2;
        this.AFLogger = str4;
        this.afInfoLog = str5;
        this.afRDLog = str6;
        this.AFLogger$LogLevel = map;
        this.afErrorLog = str3;
        this.AFInAppEventType = intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void AFInAppEventParameterName(boolean z10, String str, String str2, String str3, String str4) {
        if (AFa1dSDK.AFInAppEventParameterName != null) {
            StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("Validate callback parameters: ", str, " ", str2, " ");
            sbC.append(str3);
            AFLogger.afDebugLog(sbC.toString());
            if (z10) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFa1dSDK.AFInAppEventParameterName.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFa1dSDK.AFInAppEventParameterName;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.AFInAppEventParameterName;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.values.get();
            if (context == null) {
                return;
            }
            HashMap map = new HashMap();
            map.put("public-key", this.afDebugLog);
            map.put("sig-data", this.AFLogger);
            map.put("signature", this.afErrorLog);
            Object map2 = new HashMap(map);
            Object obj = this.AFLogger$LogLevel;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format(valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
            sb2.append(context.getPackageName());
            String string = sb2.toString();
            String strValueOf = AFa1dSDK.valueOf().AFInAppEventParameterName().AFKeystoreWrapper().valueOf("referrer", "");
            AFa1qSDK aFf1zSDK = new AFf1zSDK();
            aFf1zSDK.AFLogger = strValueOf;
            AFa1dSDK aFa1dSDKValueOf = AFa1dSDK.valueOf();
            Map<String, Object> mapValues = aFa1dSDKValueOf.values(aFf1zSDK);
            mapValues.put(FirebaseAnalytics.Param.PRICE, this.afInfoLog);
            mapValues.put("currency", this.afRDLog);
            mapValues.put("receipt_data", map2);
            if (obj != null) {
                mapValues.put("extra_prms", obj);
            }
            mapValues.putAll(aFa1dSDKValueOf.AFInAppEventParameterName().AFVersionDeclaration().AFKeystoreWrapper());
            AFInAppEventType(context, (AFf1zSDK) aFf1zSDK.AFInAppEventType(mapValues).valueOf(string));
            map.put("dev_key", this.AFInAppEventParameterName);
            map.put("app_id", context.getPackageName());
            map.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            String string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string2 != null) {
                map.put("advertiserId", string2);
            }
            AFe1dSDK aFe1dSDK = (AFe1dSDK) new AFe1dSDK().AFInAppEventType(map).valueOf(String.format(AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
            final AFd1eSDK aFd1eSDKAFInAppEventType = AFInAppEventType(context, aFe1dSDK);
            aFe1dSDK.AFInAppEventType = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1kSDK.1
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i10, @NonNull String str2) {
                    ResponseNetwork responseNetwork;
                    if (i10 == 50 && (responseNetwork = ((AFd1nSDK) aFd1eSDKAFInAppEventType).AFLogger) != null) {
                        str2 = responseNetwork.toString();
                    }
                    AFa1kSDK.AFInAppEventParameterName(false, AFa1kSDK.this.AFLogger, AFa1kSDK.this.afInfoLog, AFa1kSDK.this.afRDLog, str2);
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFd1nSDK) aFd1eSDKAFInAppEventType).AFLogger.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        AFa1kSDK.AFInAppEventParameterName(jSONObject.optBoolean("result"), AFa1kSDK.this.AFLogger, AFa1kSDK.this.afInfoLog, AFa1kSDK.this.afRDLog, jSONObject.toString());
                    } catch (Exception e5) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e5)), e5);
                        AFa1kSDK.AFInAppEventParameterName(false, AFa1kSDK.this.AFLogger, AFa1kSDK.this.afInfoLog, AFa1kSDK.this.afRDLog, e5.getMessage());
                    }
                }
            };
        } catch (Throwable th2) {
            if (AFa1dSDK.AFInAppEventParameterName != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th2);
                AFInAppEventParameterName(false, this.AFLogger, this.afInfoLog, this.afRDLog, th2.getMessage());
            }
            AFLogger.afErrorLog(th2.getMessage(), th2);
        }
    }

    private static AFd1eSDK AFInAppEventType(Context context, @NonNull AFe1cSDK aFe1cSDK) {
        AFa1dSDK.valueOf().AFInAppEventType(context);
        AFc1zSDK aFc1zSDKAFInAppEventParameterName = AFa1dSDK.valueOf().AFInAppEventParameterName();
        aFe1cSDK.valueOf(aFc1zSDKAFInAppEventParameterName.AFInAppEventParameterName().AFInAppEventType.AFInAppEventType("appsFlyerCount", 0));
        AFd1eSDK aFd1eSDK = new AFd1eSDK(aFe1cSDK, aFc1zSDKAFInAppEventParameterName);
        AFd1tSDK level = aFc1zSDKAFInAppEventParameterName.getLevel();
        level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1eSDK));
        return aFd1eSDK;
    }
}
