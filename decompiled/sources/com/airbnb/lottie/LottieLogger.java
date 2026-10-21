package com.airbnb.lottie;

/* JADX INFO: loaded from: classes2.dex */
public interface LottieLogger {
    void debug(String str);

    void debug(String str, Throwable th2);

    void error(String str, Throwable th2);

    void warning(String str);

    void warning(String str, Throwable th2);
}
