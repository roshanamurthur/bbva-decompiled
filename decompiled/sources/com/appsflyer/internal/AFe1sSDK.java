package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFd1tSDK.AnonymousClass5;
import com.google.firebase.iid.ServiceStarter;
import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1sSDK {

    @VisibleForTesting
    public static String AFKeystoreWrapper;
    public final AFb1fSDK values;

    static {
        StringBuilder sb2 = new StringBuilder("https://%sregister.%s/api/v");
        sb2.append(AFa1dSDK.values);
        AFKeystoreWrapper = sb2.toString();
    }

    public AFe1sSDK(@NonNull Context context) {
        this.values = AFa1dSDK.valueOf().valueOf(context);
    }

    public static boolean AFInAppEventParameterName(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
            return AFa1cSDK.AFInAppEventParameterName(context, new Intent(ServiceStarter.ACTION_MESSAGING_EVENT, null, context, FirebaseMessagingServiceListener.class));
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th2) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", th2);
        }
    }

    public static boolean AFInAppEventType(@NonNull AFb1fSDK aFb1fSDK) {
        return aFb1fSDK.AFKeystoreWrapper("sentRegisterRequestToAF");
    }

    public static void AFKeystoreWrapper(String str) {
        AFc1zSDK aFc1zSDKAFInAppEventParameterName = AFa1dSDK.valueOf().AFInAppEventParameterName();
        AFd1gSDK aFd1gSDK = new AFd1gSDK(str, aFc1zSDKAFInAppEventParameterName);
        AFd1tSDK level = aFc1zSDKAFInAppEventParameterName.getLevel();
        level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1gSDK));
    }

    @Nullable
    public final AFb1oSDK AFKeystoreWrapper() {
        String string;
        String string2;
        String strValueOf = this.values.valueOf("afUninstallToken", (String) null);
        long jValues = this.values.values("afUninstallToken_received_time", 0L);
        boolean zAFKeystoreWrapper = this.values.AFKeystoreWrapper("afUninstallToken_queued");
        this.values.valueOf("afUninstallToken_queued", false);
        if (strValueOf == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit = string2.split(",");
            strValueOf = strArrSplit[strArrSplit.length - 1];
        }
        if (jValues == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit2 = string.split(",");
            if (strArrSplit2.length >= 2) {
                try {
                    jValues = Long.parseLong(strArrSplit2[strArrSplit2.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (strValueOf != null) {
            return new AFb1oSDK(strValueOf, jValues, zAFKeystoreWrapper);
        }
        return null;
    }
}
