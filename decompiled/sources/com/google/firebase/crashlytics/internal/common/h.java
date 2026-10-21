package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f47819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SettingsProvider f47820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f47821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CrashlyticsNativeComponent f47822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f47823e = new AtomicBoolean(false);

    /* JADX INFO: compiled from: CrashlyticsUncaughtExceptionHandler.java */
    public interface a {
    }

    public h(c cVar, SettingsProvider settingsProvider, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.f47819a = cVar;
        this.f47820b = settingsProvider;
        this.f47821c = uncaughtExceptionHandler;
        this.f47822d = crashlyticsNativeComponent;
    }

    public final boolean a(Thread thread, Throwable th2) {
        if (thread == null) {
            Logger.getLogger().e("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th2 == null) {
            Logger.getLogger().e("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f47822d.hasCrashDataForCurrentSession()) {
            return true;
        }
        Logger.getLogger().d("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f47821c;
        AtomicBoolean atomicBoolean = this.f47823e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th2)) {
                    a aVar = this.f47819a;
                    ((c) aVar).f47784a.h(this.f47820b, thread, th2, false);
                } else {
                    Logger.getLogger().d("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e5) {
                Logger.getLogger().e("An error occurred in the uncaught exception handler", e5);
            }
        } finally {
            Logger.getLogger().d("Completed exception processing. Invoking default exception handler.");
            uncaughtExceptionHandler.uncaughtException(thread, th2);
            atomicBoolean.set(false);
        }
    }
}
