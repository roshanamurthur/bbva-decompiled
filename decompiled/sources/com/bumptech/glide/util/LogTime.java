package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes9.dex */
public final class LogTime {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f38912a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double getElapsedMillis(long j10) {
        return (getLogTime() - j10) * f38912a;
    }

    @TargetApi(17)
    public static long getLogTime() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
