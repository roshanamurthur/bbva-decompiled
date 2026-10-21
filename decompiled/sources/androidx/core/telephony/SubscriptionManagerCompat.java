package androidx.core.telephony;

import android.os.Build;
import android.telephony.SubscriptionManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(22)
public class SubscriptionManagerCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f20103a;

    @RequiresApi(29)
    public static class a {
        @DoNotInline
        public static int a(int i10) {
            return SubscriptionManager.getSlotIndex(i10);
        }
    }

    public static int getSlotIndex(int i10) {
        if (i10 == -1) {
            return -1;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            return a.a(i10);
        }
        try {
            if (f20103a == null) {
                if (i11 >= 26) {
                    f20103a = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", Integer.TYPE);
                } else {
                    f20103a = SubscriptionManager.class.getDeclaredMethod("getSlotId", Integer.TYPE);
                }
                f20103a.setAccessible(true);
            }
            Integer num = (Integer) f20103a.invoke(null, Integer.valueOf(i10));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}
