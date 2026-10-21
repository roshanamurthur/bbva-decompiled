package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes10.dex */
public class Logger {
    public static final String TAG = "FirebaseCrashlytics";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f47703c = new Logger(TAG);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47705b = 4;

    public Logger(String str) {
        this.f47704a = str;
    }

    public static Logger getLogger() {
        return f47703c;
    }

    public void d(String str, Throwable th2) {
    }

    public void e(String str, Throwable th2) {
    }

    public void i(String str, Throwable th2) {
    }

    public void log(int i10, String str) {
        log(i10, str, false);
    }

    public void v(String str, Throwable th2) {
    }

    public void w(String str, Throwable th2) {
        int i10 = this.f47705b;
        String str2 = this.f47704a;
        if (i10 <= 5 || Log.isLoggable(str2, 5)) {
            Log.w(str2, str, th2);
        }
    }

    public void d(String str) {
        d(str, null);
    }

    public void e(String str) {
        e(str, null);
    }

    public void i(String str) {
        i(str, null);
    }

    public void log(int i10, String str, boolean z10) {
        String str2 = this.f47704a;
        if (z10 || this.f47705b <= i10 || Log.isLoggable(str2, i10)) {
            Log.println(i10, str2, str);
        }
    }

    public void v(String str) {
        v(str, null);
    }

    public void w(String str) {
        w(str, null);
    }
}
