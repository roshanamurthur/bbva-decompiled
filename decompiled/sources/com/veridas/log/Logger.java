package com.veridas.log;

/* JADX INFO: loaded from: classes11.dex */
public interface Logger {
    void d(String str, String str2);

    void d(String str, String str2, Throwable th2);

    void d(String str, String str2, Object... objArr);

    void e(String str, String str2);

    void e(String str, String str2, Throwable th2);

    void e(String str, String str2, Object... objArr);

    void i(String str, String str2);

    void i(String str, String str2, Throwable th2);

    void i(String str, String str2, Object... objArr);

    void v(String str, String str2);

    void v(String str, String str2, Throwable th2);

    void v(String str, String str2, Object... objArr);

    void w(String str, String str2);

    void w(String str, String str2, Throwable th2);

    void w(String str, String str2, Object... objArr);

    void w(String str, Throwable th2);

    void wtf(String str, String str2);

    void wtf(String str, String str2, Throwable th2);

    void wtf(String str, String str2, Object... objArr);

    void wtf(String str, Throwable th2);
}
