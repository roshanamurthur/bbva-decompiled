package com.google.android.datatransport.runtime.logging;

import android.os.Build;
import android.util.Log;
import androidx.camera.core.processing.f;

/* JADX INFO: loaded from: classes9.dex */
public final class Logging {
    public static String a(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.d("TRuntime.", str);
        }
        String strD = f.d("TRuntime.", str);
        return strD.length() > 23 ? strD.substring(0, 23) : strD;
    }

    public static void d(String str, String str2) {
        a(str);
    }

    public static void e(String str, String str2, Throwable th2) {
        a(str);
    }

    public static void i(String str, String str2, Object obj) {
        if (Log.isLoggable(a(str), 4)) {
            String.format(str2, obj);
        }
    }

    public static void w(String str, String str2, Object obj) {
        String strA = a(str);
        if (Log.isLoggable(strA, 5)) {
            Log.w(strA, String.format(str2, obj));
        }
    }

    public static void d(String str, String str2, Object obj) {
        if (Log.isLoggable(a(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        if (Log.isLoggable(a(str), 3)) {
            String.format(str2, obj, obj2);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        if (Log.isLoggable(a(str), 3)) {
            String.format(str2, objArr);
        }
    }
}
