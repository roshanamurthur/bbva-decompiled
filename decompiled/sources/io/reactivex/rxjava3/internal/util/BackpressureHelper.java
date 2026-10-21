package io.reactivex.rxjava3.internal.util;

import androidx.camera.core.impl.v;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class BackpressureHelper {
    public BackpressureHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static long add(@NonNull AtomicLong atomicLong, long j10) {
        long j11;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j11, addCap(j11, j10)));
        return j11;
    }

    public static long addCancel(@NonNull AtomicLong atomicLong, long j10) {
        long j11;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j11, addCap(j11, j10)));
        return j11;
    }

    public static long addCap(long j10, long j11) {
        long j12 = j10 + j11;
        if (j12 < 0) {
            return Long.MAX_VALUE;
        }
        return j12;
    }

    public static long multiplyCap(long j10, long j11) {
        long j12 = j10 * j11;
        if (((j10 | j11) >>> 31) == 0 || j12 / j10 == j11) {
            return j12;
        }
        return Long.MAX_VALUE;
    }

    public static long produced(@NonNull AtomicLong atomicLong, long j10) {
        long j11;
        long j12;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j12 = j11 - j10;
            if (j12 < 0) {
                RxJavaPlugins.onError(new IllegalStateException(v.c("More produced than requested: ", j12)));
                j12 = 0;
            }
        } while (!atomicLong.compareAndSet(j11, j12));
        return j12;
    }

    public static long producedCancel(@NonNull AtomicLong atomicLong, long j10) {
        long j11;
        long j12;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j12 = j11 - j10;
            if (j12 < 0) {
                RxJavaPlugins.onError(new IllegalStateException(v.c("More produced than requested: ", j12)));
                j12 = 0;
            }
        } while (!atomicLong.compareAndSet(j11, j12));
        return j12;
    }
}
