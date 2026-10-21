package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class SplitInstallHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.play.core.splitinstall.internal.zzu f46255a = new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallHelper");

    public static void loadLibrary(@NonNull Context context, @NonNull String str) throws UnsatisfiedLinkError {
        synchronized (zzn.class) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e5) {
                String str2 = context.getApplicationInfo().nativeLibraryDir + "/" + System.mapLibraryName(str);
                if (!new File(str2).exists()) {
                    throw e5;
                }
                System.load(str2);
            }
        }
    }

    public static void updateAppInfo(@NonNull Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 25 || i10 >= 28) {
            return;
        }
        com.google.android.play.core.splitinstall.internal.zzu zzuVar = f46255a;
        zzuVar.zzd("Calling dispatchPackageBroadcast", new Object[0]);
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method method = cls.getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mAppThread");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objInvoke);
            obj.getClass().getMethod("dispatchPackageBroadcast", Integer.TYPE, String[].class).invoke(obj, 3, new String[]{context.getPackageName()});
            zzuVar.zzd("Called dispatchPackageBroadcast", new Object[0]);
        } catch (Exception e5) {
            zzuVar.zzc(e5, "Update app info with dispatchPackageBroadcast failed!", new Object[0]);
        }
    }
}
