package com.bbva.services;

import com.bbva.cellscore.app.AppLifecycleBuilder;
import com.bbva.component.ay.crashlytics.FirebaseCrashlyticsTracker;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.glomoutils.mobileservices.craslytics.Crashlytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GoogleCrashlytics.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¨\u0006\u0012"}, d2 = {"Lcom/bbva/services/GoogleCrashlytics;", "Lcom/bbva/glomoutils/mobileservices/craslytics/Crashlytics;", "()V", "addTracker", "", "appLifecycle", "Lcom/bbva/cellscore/app/AppLifecycleBuilder;", "enabled", "", LogKeysKt.LOG, "message", "", "recordException", "throwable", "", "setCustomKey", "key", "value", "gl-mobile-services_googleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GoogleCrashlytics implements Crashlytics {
    public GoogleCrashlytics() {
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);
    }

    @Override // com.bbva.glomoutils.mobileservices.craslytics.Crashlytics
    public void addTracker(@NotNull AppLifecycleBuilder appLifecycle, boolean enabled) {
        Intrinsics.checkNotNullParameter(appLifecycle, "appLifecycle");
        appLifecycle.addTracker(new FirebaseCrashlyticsTracker(enabled));
    }

    @Override // com.bbva.glomoutils.mobileservices.craslytics.Crashlytics
    public void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        FirebaseCrashlytics.getInstance().log(message);
    }

    @Override // com.bbva.glomoutils.mobileservices.craslytics.Crashlytics
    public void recordException(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        FirebaseCrashlytics.getInstance().recordException(throwable);
    }

    @Override // com.bbva.glomoutils.mobileservices.craslytics.Crashlytics
    public void setCustomKey(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        FirebaseCrashlytics.getInstance().setCustomKey(key, value);
    }

    @Override // com.bbva.glomoutils.mobileservices.craslytics.Crashlytics
    public void setCustomKey(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        FirebaseCrashlytics.getInstance().setCustomKey(key, value);
    }
}
