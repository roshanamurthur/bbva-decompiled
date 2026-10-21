package com.bbva.androidtoolkit.utils;

import androidx.annotation.NonNull;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;
import org.jetbrains.annotations.NonNls;

/* JADX INFO: loaded from: classes2.dex */
public class Tracer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f26549a = false;

    public static void a() {
        if (f26549a) {
            return;
        }
        init(true);
    }

    public static void d(@NonNls String str) {
        a();
        Logger.t("Tracer").d(str);
    }

    public static void e(@NonNls String str) {
        a();
        Logger.t("Tracer").e(str, new Object[0]);
    }

    public static void i(@NonNls String str) {
        a();
        Logger.t("Tracer").i(str, new Object[0]);
    }

    public static void init(boolean z10) {
        Logger.init().logLevel(z10 ? LogLevel.FULL : LogLevel.NONE);
        f26549a = true;
    }

    public static void json(@NonNls String str) {
        a();
        Logger.t("Tracer").json(str);
    }

    public static void v(@NonNls String str) {
        a();
        Logger.t("Tracer").v(str, new Object[0]);
    }

    public static void w(@NonNls String str) {
        a();
        Logger.t("Tracer").w(str, new Object[0]);
    }

    public static void wtf(@NonNls String str) {
        a();
        Logger.t("Tracer").wtf(str, new Object[0]);
    }

    public static void xml(@NonNls String str) {
        a();
        Logger.t("Tracer").xml(str);
    }

    public static void d(@NonNls String str, @NonNls String str2) {
        a();
        Logger.t(str).d(str2);
    }

    public static void e(Throwable th2, @NonNls String str) {
        a();
        Logger.t("Tracer").e(th2, str, new Object[0]);
    }

    public static void i(@NonNls String str, @NonNls String str2) {
        a();
        Logger.t(str).i(str2, new Object[0]);
    }

    public static void json(@NonNls String str, @NonNls String str2) {
        a();
        Logger.t(str).json(str2);
    }

    public static void v(@NonNls String str, @NonNls String str2) {
        a();
        Logger.t(str).v(str2, new Object[0]);
    }

    public static void w(@NonNls String str, @NonNls String str2) {
        a();
        Logger.t(str).w(str2, new Object[0]);
    }

    public static void wtf(@NonNls String str, @NonNls String str2) {
        a();
        Logger.t(str).wtf(str2, new Object[0]);
    }

    public static void xml(@NonNls String str, @NonNls String str2) {
        a();
        Logger.t(str).xml(str2);
    }

    public static void init(@NonNull String str, boolean z10) {
        Logger.init(str).logLevel(z10 ? LogLevel.FULL : LogLevel.NONE);
        f26549a = true;
    }

    public static void e(@NonNls String str, Throwable th2, @NonNls String str2) {
        a();
        Logger.t(str).e(th2, str2, new Object[0]);
    }
}
