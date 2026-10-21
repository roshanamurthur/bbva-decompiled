package com.google.firebase.appcheck.internal;

import com.google.firebase.appcheck.internal.util.Clock;

/* JADX INFO: loaded from: classes10.dex */
public class RetryManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f47626b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f47627c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clock.DefaultClock f47625a = new Clock.DefaultClock();

    public boolean canRetry() {
        return this.f47627c <= this.f47625a.currentTimeMillis();
    }

    public void resetBackoffOnSuccess() {
        this.f47626b = 0L;
        this.f47627c = -1L;
    }

    public void updateBackoffOnFailure(int i10) {
        this.f47626b++;
        Clock.DefaultClock defaultClock = this.f47625a;
        if (i10 == 400 || i10 == 403 || i10 == 404) {
            this.f47627c = defaultClock.currentTimeMillis() + 86400000;
            return;
        }
        this.f47627c = Math.min((long) (Math.pow(2.0d, this.f47626b * ((Math.random() * 0.5d) + 1.0d)) * 1000.0d), 14400000L) + defaultClock.currentTimeMillis();
    }
}
