package com.google.firebase.appcheck.internal;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.r1;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultTokenRefresher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultFirebaseAppCheck f47613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f47614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f47615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile ScheduledFuture<?> f47616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile long f47617e = -1;

    public DefaultTokenRefresher(@NonNull DefaultFirebaseAppCheck defaultFirebaseAppCheck, @Lightweight Executor executor, @Blocking ScheduledExecutorService scheduledExecutorService) {
        this.f47613a = (DefaultFirebaseAppCheck) Preconditions.checkNotNull(defaultFirebaseAppCheck);
        this.f47614b = executor;
        this.f47615c = scheduledExecutorService;
    }

    public void cancel() {
        if (this.f47616d == null || this.f47616d.isDone()) {
            return;
        }
        this.f47616d.cancel(false);
    }

    public void scheduleRefresh(long j10) {
        cancel();
        this.f47617e = -1L;
        this.f47616d = this.f47615c.schedule(new r1(this, 8), Math.max(0L, j10), TimeUnit.MILLISECONDS);
    }
}
