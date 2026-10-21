package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class BlockingAnalyticsEventLogger implements AnalyticsEventReceiver, AnalyticsEventLogger {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CrashlyticsOriginAnalyticsEventLogger f47707p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f47708q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f47709r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Object f47710s0 = new Object();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public CountDownLatch f47711t0;

    public BlockingAnalyticsEventLogger(@NonNull CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger, int i10, TimeUnit timeUnit) {
        this.f47707p0 = crashlyticsOriginAnalyticsEventLogger;
        this.f47708q0 = i10;
        this.f47709r0 = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(@NonNull String str, @Nullable Bundle bundle) {
        synchronized (this.f47710s0) {
            try {
                Logger.getLogger().v("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f47711t0 = new CountDownLatch(1);
                this.f47707p0.logEvent(str, bundle);
                Logger.getLogger().v("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f47711t0.await(this.f47708q0, this.f47709r0)) {
                        Logger.getLogger().v("App exception callback received from Analytics listener.");
                    } else {
                        Logger.getLogger().w("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    Logger.getLogger().e("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f47711t0 = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = this.f47711t0;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
