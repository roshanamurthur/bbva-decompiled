package com.noknok.android.client.appsdk.common;

import android.content.Context;
import android.os.Build;
import com.noknok.android.client.appsdk.IAppSDK;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.MobileServicesAvailabilityChecker;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes11.dex */
public class Fido2Helper {
    public static String getFido2ProxyName(Context context) {
        try {
            Class.forName("com.noknok.android.client.appsdk.fido2.Fido2AppSDKProxy");
            if (MobileServicesAvailabilityChecker.isGMSAvailable(context)) {
                return "com.noknok.android.client.appsdk.fido2.Fido2AppSDKProxy";
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("com.noknok.android.client.appsdk.hms.fido2.Fido2AppSDKProxy");
            if (MobileServicesAvailabilityChecker.isHMSAvailable(context)) {
                return "com.noknok.android.client.appsdk.hms.fido2.Fido2AppSDKProxy";
            }
            return null;
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    public static boolean isFido2ModuleAvailable(Context context) {
        return getFido2ProxyName(context) != null;
    }

    public static boolean isPlatformAuthenticatorSupported(ActivityProxy activityProxy) {
        String fido2ProxyName;
        if (Build.VERSION.SDK_INT < 24 || (fido2ProxyName = getFido2ProxyName(activityProxy.getApplicationContext())) == null) {
            return false;
        }
        try {
            Class<?> cls = Class.forName(fido2ProxyName);
            return ((Boolean) cls.getMethod("hasPlatformAuthenticator", ActivityProxy.class).invoke(cls.getConstructor(IAppSDK.ClientLocation.class).newInstance(IAppSDK.ClientLocation.LOCAL_CLIENT), activityProxy)).booleanValue();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }
}
