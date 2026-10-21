package com.huawei.secure.android.common.util;

import android.app.Activity;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes10.dex */
public class ScreenUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50670a = "ScreenUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f50671b = 524288;

    public static class a implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Method f50672a;

        public a(Method method) {
            this.f50672a = method;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            Method method = this.f50672a;
            if (method == null) {
                return null;
            }
            method.setAccessible(true);
            return null;
        }
    }

    private static void a(Activity activity, int i10) {
        if (activity == null || activity.isFinishing()) {
            LogsUtil.e("", "activity is null");
        } else {
            activity.getWindow().addFlags(i10);
        }
    }

    private static void b(Activity activity, int i10) {
        if (activity == null || activity.isFinishing()) {
            LogsUtil.e("", "activity is null");
        } else {
            activity.getWindow().clearFlags(i10);
        }
    }

    public static void disableScreenshots(Activity activity) {
        a(activity, 8192);
    }

    public static void enableScreenshots(Activity activity) {
        b(activity, 8192);
    }

    public static void hideOverlayWindows(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            Window window = activity.getWindow();
            Method declaredMethod = Class.forName("android.view.Window").getDeclaredMethod("addPrivateFlags", Integer.TYPE);
            AccessController.doPrivileged(new a(declaredMethod));
            declaredMethod.invoke(window, 524288);
        } catch (ClassNotFoundException unused) {
            LogsUtil.e(f50670a, "hideOverlayWindows ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            LogsUtil.e(f50670a, "hideOverlayWindows IllegalAccessException");
        } catch (NoSuchMethodException unused3) {
            LogsUtil.e(f50670a, "hideOverlayWindows NoSuchMethodException");
        } catch (InvocationTargetException unused4) {
            LogsUtil.e(f50670a, "hideOverlayWindows InvocationTargetException");
        }
    }
}
