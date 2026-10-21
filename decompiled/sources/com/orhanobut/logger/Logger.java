package com.orhanobut.logger;

import oi.b;

/* JADX INFO: loaded from: classes11.dex */
public final class Logger {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f63723a = new b();

    public static void d(String str, Object... objArr) {
        f63723a.d(str, objArr);
    }

    public static void e(String str, Object... objArr) {
        f63723a.e(null, str, objArr);
    }

    public static void i(String str, Object... objArr) {
        f63723a.i(str, objArr);
    }

    public static Settings init() {
        return init("PRETTYLOGGER");
    }

    public static void json(String str) {
        f63723a.json(str);
    }

    public static void log(int i10, String str, String str2, Throwable th2) {
        f63723a.log(i10, str, str2, th2);
    }

    public static void resetSettings() {
        f63723a.resetSettings();
    }

    public static Printer t(String str) {
        b bVar = f63723a;
        bVar.t(str, bVar.f85407d.getMethodCount());
        return bVar;
    }

    public static void v(String str, Object... objArr) {
        f63723a.v(str, objArr);
    }

    public static void w(String str, Object... objArr) {
        f63723a.w(str, objArr);
    }

    public static void wtf(String str, Object... objArr) {
        f63723a.wtf(str, objArr);
    }

    public static void xml(String str) {
        f63723a.xml(str);
    }

    public static void d(Object obj) {
        f63723a.d(obj);
    }

    public static void e(Throwable th2, String str, Object... objArr) {
        f63723a.e(th2, str, objArr);
    }

    public static Settings init(String str) {
        b bVar = new b();
        f63723a = bVar;
        return bVar.init(str);
    }

    public static Printer t(int i10) {
        b bVar = f63723a;
        bVar.t(null, i10);
        return bVar;
    }

    public static Printer t(String str, int i10) {
        b bVar = f63723a;
        bVar.t(str, i10);
        return bVar;
    }
}
