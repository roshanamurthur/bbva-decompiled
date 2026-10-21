package com.google.firebase.appcheck.internal.util;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class Logger {
    public static final String TAG = "FirebaseAppCheck";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f47637c = new Logger(TAG);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47639b = 4;

    public Logger(@NonNull String str) {
        this.f47638a = str;
    }

    @NonNull
    public static Logger getLogger() {
        return f47637c;
    }

    public void d(@NonNull String str, @Nullable Throwable th2) {
    }

    public void e(@NonNull String str, @Nullable Throwable th2) {
    }

    public void i(@NonNull String str, @Nullable Throwable th2) {
    }

    public void log(int i10, @NonNull String str) {
        log(i10, str, false);
    }

    public void v(@NonNull String str, @Nullable Throwable th2) {
    }

    public void w(@NonNull String str, @Nullable Throwable th2) {
        int i10 = this.f47639b;
        String str2 = this.f47638a;
        if (i10 <= 5 || Log.isLoggable(str2, 5)) {
            Log.w(str2, str, th2);
        }
    }

    public void d(@NonNull String str) {
        d(str, null);
    }

    public void e(@NonNull String str) {
        e(str, null);
    }

    public void i(@NonNull String str) {
        i(str, null);
    }

    public void log(int i10, @NonNull String str, boolean z10) {
        String str2 = this.f47638a;
        if (z10 || this.f47639b <= i10 || Log.isLoggable(str2, i10)) {
            Log.println(i10, str2, str);
        }
    }

    public void v(@NonNull String str) {
        v(str, null);
    }

    public void w(@NonNull String str) {
        w(str, null);
    }
}
