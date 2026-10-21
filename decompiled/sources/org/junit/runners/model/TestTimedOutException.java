package org.junit.runners.model;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class TestTimedOutException extends Exception {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final TimeUnit f92057p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f92058q0;

    public TestTimedOutException(long j10, TimeUnit timeUnit) {
        super(String.format("test timed out after %d %s", Long.valueOf(j10), timeUnit.name().toLowerCase()));
        this.f92057p0 = timeUnit;
        this.f92058q0 = j10;
    }

    public TimeUnit getTimeUnit() {
        return this.f92057p0;
    }

    public long getTimeout() {
        return this.f92058q0;
    }
}
