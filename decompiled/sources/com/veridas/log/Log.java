package com.veridas.log;

/* JADX INFO: loaded from: classes11.dex */
public class Log {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Log f67220b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AndroidLogger f67221a = null;

    public static Log a() {
        if (f67220b == null) {
            Log log = new Log();
            f67220b = log;
            log.f67221a = new AndroidLogger();
        }
        return f67220b;
    }

    public static void d(String str, String str2) {
        a().f67221a.d(str, str2);
    }

    public static void e(String str, String str2) {
        a().f67221a.e(str, str2);
    }

    public static void i(String str, String str2) {
        a().f67221a.i(str, str2);
    }

    public static void v(String str, String str2) {
        a().f67221a.v(str, str2);
    }

    public static void w(String str, String str2) {
        a().f67221a.w(str, str2);
    }

    public static void wtf(String str, String str2) {
        a().f67221a.wtf(str, str2);
    }

    public static void d(String str, String str2, Object... objArr) {
        a().f67221a.d(str, str2, objArr);
    }

    public static void e(String str, String str2, Object... objArr) {
        a().f67221a.e(str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        a().f67221a.i(str, str2, objArr);
    }

    public static void v(String str, String str2, Object... objArr) {
        a().f67221a.v(str, str2, objArr);
    }

    public static void w(String str, String str2, Object... objArr) {
        a().f67221a.w(str, str2, objArr);
    }

    public static void wtf(String str, String str2, Object... objArr) {
        a().f67221a.wtf(str, str2, objArr);
    }

    public static void d(String str, String str2, Throwable th2) {
        a().f67221a.d(str, str2, th2);
    }

    public static void e(String str, String str2, Throwable th2) {
        a().f67221a.e(str, str2, th2);
    }

    public static void i(String str, String str2, Throwable th2) {
        a().f67221a.i(str, str2, th2);
    }

    public static void v(String str, String str2, Throwable th2) {
        a().f67221a.v(str, str2, th2);
    }

    public static void w(String str, String str2, Throwable th2) {
        a().f67221a.w(str, str2, th2);
    }

    public static void wtf(String str, String str2, Throwable th2) {
        a().f67221a.wtf(str, str2, th2);
    }

    public static void e(String str, Throwable th2) {
        a().f67221a.e(str, th2.getMessage(), th2);
    }

    public static void w(String str, Throwable th2) {
        a().f67221a.w(str, th2);
    }

    public static void wtf(String str, Throwable th2) {
        a().f67221a.wtf(str, th2);
    }
}
