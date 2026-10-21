package com.airbnb.lottie.utils;

import com.airbnb.lottie.LottieLogger;

/* JADX INFO: loaded from: classes2.dex */
public class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static LottieLogger f26197a = new LogcatLogger();

    public static void debug(String str) {
        f26197a.debug(str);
    }

    public static void error(String str, Throwable th2) {
        f26197a.error(str, th2);
    }

    public static void setInstance(LottieLogger lottieLogger) {
        f26197a = lottieLogger;
    }

    public static void warning(String str) {
        f26197a.warning(str);
    }

    public static void debug(String str, Throwable th2) {
        f26197a.debug(str, th2);
    }

    public static void warning(String str, Throwable th2) {
        f26197a.warning(str, th2);
    }
}
