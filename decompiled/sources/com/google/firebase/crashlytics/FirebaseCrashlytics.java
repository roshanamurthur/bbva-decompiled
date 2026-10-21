package com.google.firebase.crashlytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

/* JADX INFO: loaded from: classes10.dex */
public class FirebaseCrashlytics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public final CrashlyticsCore f47693a;

    public FirebaseCrashlytics(@NonNull CrashlyticsCore crashlyticsCore) {
        this.f47693a = crashlyticsCore;
    }

    @NonNull
    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) FirebaseApp.getInstance().get(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    @NonNull
    public Task<Boolean> checkForUnsentReports() {
        return this.f47693a.checkForUnsentReports();
    }

    public void deleteUnsentReports() {
        this.f47693a.deleteUnsentReports();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f47693a.didCrashOnPreviousExecution();
    }

    public void log(@NonNull String str) {
        this.f47693a.log(str);
    }

    public void recordException(@NonNull Throwable th2) {
        if (th2 == null) {
            Logger.getLogger().w("A null value was passed to recordException. Ignoring.");
        } else {
            this.f47693a.logException(th2);
        }
    }

    public void sendUnsentReports() {
        this.f47693a.sendUnsentReports();
    }

    public void setCrashlyticsCollectionEnabled(boolean z10) {
        this.f47693a.setCrashlyticsCollectionEnabled(Boolean.valueOf(z10));
    }

    public void setCustomKey(@NonNull String str, boolean z10) {
        this.f47693a.setCustomKey(str, Boolean.toString(z10));
    }

    public void setCustomKeys(@NonNull CustomKeysAndValues customKeysAndValues) {
        this.f47693a.setCustomKeys(customKeysAndValues.f47691a);
    }

    public void setUserId(@NonNull String str) {
        this.f47693a.setUserId(str);
    }

    public void setCrashlyticsCollectionEnabled(@Nullable Boolean bool) {
        this.f47693a.setCrashlyticsCollectionEnabled(bool);
    }

    public void setCustomKey(@NonNull String str, double d2) {
        this.f47693a.setCustomKey(str, Double.toString(d2));
    }

    public void setCustomKey(@NonNull String str, float f6) {
        this.f47693a.setCustomKey(str, Float.toString(f6));
    }

    public void setCustomKey(@NonNull String str, int i10) {
        this.f47693a.setCustomKey(str, Integer.toString(i10));
    }

    public void setCustomKey(@NonNull String str, long j10) {
        this.f47693a.setCustomKey(str, Long.toString(j10));
    }

    public void setCustomKey(@NonNull String str, @NonNull String str2) {
        this.f47693a.setCustomKey(str, str2);
    }
}
