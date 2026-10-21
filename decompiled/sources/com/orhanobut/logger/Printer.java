package com.orhanobut.logger;

/* JADX INFO: loaded from: classes11.dex */
public interface Printer {
    void d(Object obj);

    void d(String str, Object... objArr);

    void e(String str, Object... objArr);

    void e(Throwable th2, String str, Object... objArr);

    Settings getSettings();

    void i(String str, Object... objArr);

    Settings init(String str);

    void json(String str);

    void log(int i10, String str, String str2, Throwable th2);

    void resetSettings();

    Printer t(String str, int i10);

    void v(String str, Object... objArr);

    void w(String str, Object... objArr);

    void wtf(String str, Object... objArr);

    void xml(String str);
}
