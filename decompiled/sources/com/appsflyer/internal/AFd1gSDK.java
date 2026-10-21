package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.bbva.ethermobilesdk.devicechecker.emulator.EmulatorApi;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1gSDK extends AFd1eSDK {
    private static long AppsFlyer2dXConversionCallback = 6533378919008962864L;
    private static int init = 1;
    private static int onInstallConversionFailureNative;
    private final String AFVersionDeclaration;
    private final AFe1tSDK afErrorLogForExcManagerOnly;
    private final AFb1bSDK afWarnLog;
    private final AFb1cSDK getLevel;

    public AFd1gSDK(@NonNull String str, @NonNull AFc1zSDK aFc1zSDK) {
        super(new AFe1qSDK(aFc1zSDK.onAppOpenAttributionNative().AFInAppEventParameterName), aFc1zSDK, str);
        this.getLevel = aFc1zSDK.AFInAppEventParameterName();
        this.afWarnLog = aFc1zSDK.onAppOpenAttributionNative();
        this.AFVersionDeclaration = str;
        this.afErrorLogForExcManagerOnly = aFc1zSDK.afRDLog();
    }

    private static void AFInAppEventType(String str, int i10, Object[] objArr) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (AFg1nSDK.AFInAppEventParameterName) {
            try {
                char[] cArrValueOf = AFg1nSDK.valueOf(AppsFlyer2dXConversionCallback, cArr, i10);
                AFg1nSDK.AFKeystoreWrapper = 4;
                while (true) {
                    int i11 = AFg1nSDK.AFKeystoreWrapper;
                    if (i11 < cArrValueOf.length) {
                        AFg1nSDK.AFInAppEventType = i11 - 4;
                        int i12 = AFg1nSDK.AFKeystoreWrapper;
                        cArrValueOf[i12] = (char) (((long) (cArrValueOf[i12] ^ cArrValueOf[i12 % 4])) ^ (((long) AFg1nSDK.AFInAppEventType) * AppsFlyer2dXConversionCallback));
                        AFg1nSDK.AFKeystoreWrapper++;
                    } else {
                        str2 = new String(cArrValueOf, 4, cArrValueOf.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str2;
    }

    private void AFLogger$LogLevel() {
        int i10 = init + 115;
        onInstallConversionFailureNative = i10 % 128;
        int i11 = i10 % 2;
        this.AFLogger$LogLevel.valueOf("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        int i12 = init + 11;
        onInstallConversionFailureNative = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1eSDK, com.appsflyer.internal.AFd1nSDK
    public final boolean afRDLog() {
        int i10 = onInstallConversionFailureNative + 61;
        int i11 = i10 % 128;
        init = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 111;
        onInstallConversionFailureNative = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 67 / 0;
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final void valueOf() {
        super.valueOf();
        ResponseNetwork responseNetwork = ((AFd1nSDK) this).AFLogger;
        if (responseNetwork != null) {
            int i10 = init + 45;
            onInstallConversionFailureNative = i10 % 128;
            int i11 = i10 % 2;
            if (!responseNetwork.isSuccessful()) {
                return;
            }
            int i12 = onInstallConversionFailureNative + 121;
            init = i12 % 128;
            int i13 = i12 % 2;
            AFLogger$LogLevel();
            if (i13 == 0) {
                int i14 = 99 / 0;
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    public final void values(AFa1qSDK aFa1qSDK) throws Throwable {
        int i10 = onInstallConversionFailureNative + 27;
        init = i10 % 128;
        if (i10 % 2 == 0) {
            super.values(aFa1qSDK);
            Context context = this.afWarnLog.AFInAppEventParameterName;
            AFa1dSDK.valueOf();
            throw null;
        }
        super.values(aFa1qSDK);
        Context context2 = this.afWarnLog.AFInAppEventParameterName;
        AFa1dSDK aFa1dSDKValueOf = AFa1dSDK.valueOf();
        if (context2 == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        if (aFa1dSDKValueOf.AFKeystoreWrapper()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        PackageManager packageManager = context2.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            aFa1qSDK.AFInAppEventParameterName("app_version_code", Integer.toString(packageInfo.versionCode));
            aFa1qSDK.AFInAppEventParameterName("app_version_name", packageInfo.versionName);
            aFa1qSDK.AFInAppEventParameterName("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            aFa1qSDK.AFInAppEventParameterName("installDate", AFa1dSDK.values(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th2);
        }
        this.afErrorLogForExcManagerOnly.valueOf(aFa1qSDK.AFInAppEventType());
        String strValues = AFa1dSDK.values();
        if (strValues != null) {
            aFa1qSDK.AFInAppEventParameterName("appUserId", strValues);
        }
        try {
            aFa1qSDK.AFInAppEventParameterName("model", Build.MODEL);
            Object[] objArr = new Object[1];
            AFInAppEventType("祪龊叕刣礈雈䇔䧝巎", ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr);
            aFa1qSDK.AFInAppEventParameterName(((String) objArr[0]).intern(), Build.BRAND);
        } catch (Throwable th3) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th3);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i11 = onInstallConversionFailureNative + 39;
            init = i11 % 128;
            int i12 = i11 % 2;
            aFa1qSDK.AFInAppEventParameterName(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            int i13 = init + 119;
            onInstallConversionFailureNative = i13 % 128;
            int i14 = i13 % 2;
        }
        AFc1uSDK.AFa1wSDK aFa1wSDKValues = AFa1bSDK.values(context2.getContentResolver());
        if (aFa1wSDKValues != null) {
            int i15 = init + 91;
            onInstallConversionFailureNative = i15 % 128;
            if (i15 % 2 != 0) {
                aFa1qSDK.AFInAppEventParameterName("amazon_aid", aFa1wSDKValues.AFInAppEventParameterName);
                aFa1qSDK.AFInAppEventParameterName("amazon_aid_limit", String.valueOf(aFa1wSDKValues.AFInAppEventType));
                int i16 = 80 / 0;
            } else {
                aFa1qSDK.AFInAppEventParameterName("amazon_aid", aFa1wSDKValues.AFInAppEventParameterName);
                aFa1qSDK.AFInAppEventParameterName("amazon_aid_limit", String.valueOf(aFa1wSDKValues.AFInAppEventType));
            }
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            aFa1qSDK.AFInAppEventParameterName("advertiserId", string);
        }
        aFa1qSDK.AFInAppEventParameterName("devkey", ((AFd1nSDK) this).afRDLog.AFInAppEventType);
        aFa1qSDK.AFInAppEventParameterName("uid", AFa1aSDK.AFInAppEventParameterName(this.afWarnLog, this.AFLogger$LogLevel));
        aFa1qSDK.AFInAppEventParameterName("af_gcm_token", this.AFVersionDeclaration);
        aFa1qSDK.AFInAppEventParameterName("launch_counter", Integer.toString(this.AFLogger$LogLevel.AFInAppEventType("appsFlyerCount", 0)));
        aFa1qSDK.AFInAppEventParameterName(EmulatorApi.SDK, Integer.toString(Build.VERSION.SDK_INT));
        String strAFKeystoreWrapper = this.getLevel.AFKeystoreWrapper();
        if (strAFKeystoreWrapper != null) {
            aFa1qSDK.AFInAppEventParameterName("channel", strAFKeystoreWrapper);
        }
    }
}
