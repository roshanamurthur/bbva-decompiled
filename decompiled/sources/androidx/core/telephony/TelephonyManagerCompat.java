package androidx.core.telephony;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class TelephonyManagerCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f20104a;

    @RequiresApi(23)
    public static class a {
        @SuppressLint({"MissingPermission"})
        @Nullable
        @RequiresPermission("android.permission.READ_PHONE_STATE")
        @DoNotInline
        public static String a(TelephonyManager telephonyManager, int i10) {
            return telephonyManager.getDeviceId(i10);
        }
    }

    @RequiresApi(26)
    public static class b {
        @SuppressLint({"MissingPermission"})
        @Nullable
        @RequiresPermission("android.permission.READ_PHONE_STATE")
        @DoNotInline
        public static String a(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    @RequiresApi(30)
    public static class c {
        @DoNotInline
        public static int a(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    @Nullable
    @RequiresPermission("android.permission.READ_PHONE_STATE")
    @SuppressLint({"MissingPermission"})
    public static String getImei(@NonNull TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 26) {
            return b.a(telephonyManager);
        }
        int subscriptionId = getSubscriptionId(telephonyManager);
        return (subscriptionId == Integer.MAX_VALUE || subscriptionId == -1) ? telephonyManager.getDeviceId() : a.a(telephonyManager, SubscriptionManagerCompat.getSlotIndex(subscriptionId));
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int getSubscriptionId(@NonNull TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return c.a(telephonyManager);
        }
        try {
            if (f20104a == null) {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", new Class[0]);
                f20104a = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f20104a.invoke(telephonyManager, new Object[0]);
            if (num == null || num.intValue() == -1) {
                return Integer.MAX_VALUE;
            }
            return num.intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return Integer.MAX_VALUE;
        }
    }
}
