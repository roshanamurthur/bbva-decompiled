package com.google.firebase.appcheck.internal;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.internal.util.Clock;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import sf.d;

/* JADX INFO: loaded from: classes10.dex */
public final class TokenRefreshManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultTokenRefresher f47631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clock f47632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f47633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f47634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile long f47635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f47636f;

    public TokenRefreshManager(@NonNull Context context, @NonNull DefaultFirebaseAppCheck defaultFirebaseAppCheck, @Lightweight Executor executor, @Blocking ScheduledExecutorService scheduledExecutorService) {
        Context context2 = (Context) Preconditions.checkNotNull(context);
        DefaultTokenRefresher defaultTokenRefresher = new DefaultTokenRefresher((DefaultFirebaseAppCheck) Preconditions.checkNotNull(defaultFirebaseAppCheck), executor, scheduledExecutorService);
        Clock.DefaultClock defaultClock = new Clock.DefaultClock();
        this.f47631a = defaultTokenRefresher;
        this.f47632b = defaultClock;
        this.f47635e = -1L;
        BackgroundDetector.initialize((Application) context2.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new d(this, defaultTokenRefresher, defaultClock));
    }

    public final boolean a() {
        return this.f47636f && !this.f47633c && this.f47634d > 0 && this.f47635e != -1;
    }

    public void maybeScheduleTokenRefresh(@NonNull AppCheckToken appCheckToken) {
        DefaultAppCheckToken defaultAppCheckTokenConstructFromRawToken = appCheckToken instanceof DefaultAppCheckToken ? (DefaultAppCheckToken) appCheckToken : DefaultAppCheckToken.constructFromRawToken(appCheckToken.getToken());
        this.f47635e = defaultAppCheckTokenConstructFromRawToken.f47596b + ((long) (defaultAppCheckTokenConstructFromRawToken.f47597c * 0.5d)) + PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        if (this.f47635e > defaultAppCheckTokenConstructFromRawToken.getExpireTimeMillis()) {
            this.f47635e = defaultAppCheckTokenConstructFromRawToken.getExpireTimeMillis() - 60000;
        }
        if (a()) {
            this.f47631a.scheduleRefresh(this.f47635e - this.f47632b.currentTimeMillis());
        }
    }

    public void onListenerCountChanged(int i10) {
        if (this.f47634d == 0 && i10 > 0) {
            this.f47634d = i10;
            if (a()) {
                this.f47631a.scheduleRefresh(this.f47635e - this.f47632b.currentTimeMillis());
            }
        } else if (this.f47634d > 0 && i10 == 0) {
            this.f47631a.cancel();
        }
        this.f47634d = i10;
    }

    public void setIsAutoRefreshEnabled(boolean z10) {
        this.f47636f = z10;
    }
}
