package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes2.dex */
public class AFa1iSDK {

    public static final class AFa1vSDK {
        public final String AFInAppEventType;
        public final String AFKeystoreWrapper;
        public final String values;

        public AFa1vSDK(@NonNull String str, @Nullable String str2, @Nullable String str3) {
            this.AFKeystoreWrapper = str;
            this.AFInAppEventType = str2;
            this.values = str3;
        }
    }

    private static boolean values(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }

    public final AFa1vSDK valueOf(@NonNull Context context) {
        String str;
        String simOperatorName;
        String str2 = "unknown";
        String networkOperatorName = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                for (Network network : connectivityManager.getAllNetworks()) {
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                    if (values(networkInfo)) {
                        if (1 != networkInfo.getType()) {
                            if (networkInfo.getType() != 0) {
                                break;
                            }
                            str2 = "MOBILE";
                            break;
                        }
                        str2 = "WIFI";
                        break;
                    }
                }
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            simOperatorName = telephonyManager.getSimOperatorName();
            try {
                networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (networkOperatorName == null || networkOperatorName.isEmpty()) {
                    if (2 == telephonyManager.getPhoneType()) {
                        networkOperatorName = "CDMA";
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                str = networkOperatorName;
                networkOperatorName = simOperatorName;
                AFLogger.afErrorLog("Exception while collecting network info. ", th);
                String str3 = str;
                simOperatorName = networkOperatorName;
                networkOperatorName = str3;
            }
        } catch (Throwable th3) {
            th = th3;
            str = null;
        }
        return new AFa1vSDK(str2, networkOperatorName, simOperatorName);
    }
}
