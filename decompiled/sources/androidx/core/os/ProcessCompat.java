package androidx.core.os;

import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class ProcessCompat {

    @RequiresApi(17)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Object f20004a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f20005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static boolean f20006c;
    }

    @RequiresApi(24)
    public static class b {
        public static boolean a(int i10) {
            return Process.isApplicationUid(i10);
        }
    }

    public static boolean isApplicationUid(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            return b.a(i10);
        }
        try {
            synchronized (a.f20004a) {
                try {
                    if (!a.f20006c) {
                        a.f20006c = true;
                        a.f20005b = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Method method = a.f20005b;
            if (method == null) {
                return true;
            }
            Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i10));
            if (bool != null) {
                return bool.booleanValue();
            }
            throw new NullPointerException();
        } catch (Exception e5) {
            e5.printStackTrace();
            return true;
        }
    }
}
