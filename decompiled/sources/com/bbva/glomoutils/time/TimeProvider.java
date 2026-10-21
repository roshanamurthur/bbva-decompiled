package com.bbva.glomoutils.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: compiled from: TimeProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/bbva/glomoutils/time/TimeProvider;", "", "()V", "millisTime", "", "getMillisTime", "()J", "nanoTime", "getNanoTime", "gl-utils_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TimeProvider {
    public final long getMillisTime() {
        return System.currentTimeMillis();
    }

    public final long getNanoTime() {
        return TimeUnit.MILLISECONDS.toNanos(getMillisTime());
    }
}
