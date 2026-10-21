package com.huawei.secure.android.common.activity.protect;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50616a = "Reflection";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Object f50617b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f50618c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f50619d = -21;

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
                Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                Class cls = (Class) declaredMethod.invoke(null, "dalvik.system.VMRuntime");
                Method method = (Method) declaredMethod2.invoke(cls, "getRuntime", null);
                f50618c = (Method) declaredMethod2.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class});
                f50617b = method.invoke(null, new Object[0]);
            } catch (Throwable th2) {
                com.huawei.secure.android.common.activity.a.a(f50616a, "reflect failed : " + th2.getMessage());
            }
        }
    }

    public static int a(Context context) {
        if (Build.VERSION.SDK_INT >= 28 && !a()) {
            return f50619d;
        }
        return 0;
    }

    public static boolean a(String str) {
        return a(str);
    }

    public static boolean a(String... strArr) {
        Method method;
        Object obj = f50617b;
        if (obj != null && (method = f50618c) != null) {
            try {
                method.invoke(obj, strArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a() {
        return a("L");
    }
}
