package com.bbva.tohu.android.core.utils;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public class LogTohu {
    private static int d(String str, String str2) {
        return 0;
    }

    public static int e(String str, String str2, Throwable th2) {
        return Log.e(str, str2, th2);
    }

    public static int i(String str, String str2, Object... objArr) {
        return Log.i(str, secureFormat(str2, objArr));
    }

    private static String notNullMsg(String str) {
        return str == null ? "" : str;
    }

    private static String secureFormat(String str, Object[] objArr) {
        if (str == null) {
            return "";
        }
        return objArr.length == 0 ? str : String.format(str, objArr);
    }

    public static int v(String str, String str2, Object... objArr) {
        return Log.v(str, secureFormat(str2, objArr));
    }

    public static int w(String str, String str2, Object... objArr) {
        return Log.w(str, secureFormat(str2, objArr));
    }

    public static int d(String str, String str2, Throwable th2) {
        return 0;
    }

    public static int e(String str, String str2, Object... objArr) {
        return Log.e(str, secureFormat(str2, objArr));
    }

    public static int i(String str, String str2, Throwable th2) {
        return Log.i(str, str2, th2);
    }

    public static int v(String str, String str2, Throwable th2) {
        return Log.v(str, str2, th2);
    }

    public static int w(String str, String str2, Throwable th2) {
        return Log.w(str, str2, th2);
    }

    public static int d(String str, String str2, Object... objArr) {
        return d(str, secureFormat(str2, objArr));
    }

    public static int w(String str, Throwable th2) {
        return Log.w(str, th2);
    }
}
