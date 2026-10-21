package com.noknok.android.client.utils;

import android.content.Context;
import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.location.LocationServices;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes11.dex */
public class MobileServicesAvailabilityChecker {
    public static boolean isGMSAvailable(Context context) {
        try {
            int i10 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
            int iIntValue = ((Integer) GoogleApiAvailability.class.getDeclaredMethod("isGooglePlayServicesAvailable", Context.class).invoke(GoogleApiAvailability.class.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]), context)).intValue();
            int i11 = ConnectionResult.UNKNOWN;
            return iIntValue == ConnectionResult.class.getDeclaredField(NotifyProvisionResult.SUCCESS_RESULT).getInt(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    public static boolean isGMSLocationLibraryAvailable(Context context) {
        try {
            Api<Api.ApiOptions.NoOptions> api = LocationServices.API;
            LocationServices.class.getDeclaredMethod("getFusedLocationProviderClient", Context.class).invoke(null, context);
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    public static boolean isHMSAvailable(Context context) {
        try {
            Class<?> cls = Class.forName("com.huawei.hms.api.HuaweiApiAvailability");
            return ((Integer) cls.getDeclaredMethod("isHuaweiMobileServicesAvailable", Context.class).invoke(cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]), context)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    public static boolean isHMSLocationLibraryAvailable(Context context) {
        try {
            Class.forName("com.huawei.hms.location.LocationServices").getDeclaredMethod("getFusedLocationProviderClient", Context.class).invoke(null, context);
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    public static boolean isPlayIntegrityLibraryAvailable(Context context) {
        return true;
    }
}
