package com.huawei.secure.android.common.activity.protect;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50610a = "ExceptionHandler";

    public final void a(Throwable th2) {
        com.huawei.secure.android.common.activity.a.b(f50610a, "bandageExceptionHappened ");
        try {
            onBandageExceptionHappened(th2);
        } catch (Throwable unused) {
            com.huawei.secure.android.common.activity.a.a(f50610a, "bandageExceptionHappened");
        }
    }

    public abstract void onBandageExceptionHappened(Throwable th2);

    public abstract void onUncaughtExceptionHappened(Thread thread, Throwable th2);

    public final void uncaughtExceptionHappened(Thread thread, Throwable th2) {
        com.huawei.secure.android.common.activity.a.b(f50610a, "uncaughtExceptionHappened ");
        try {
            onUncaughtExceptionHappened(thread, th2);
        } catch (Throwable unused) {
            com.huawei.secure.android.common.activity.a.a(f50610a, "uncaughtExceptionHappened");
        }
    }
}
