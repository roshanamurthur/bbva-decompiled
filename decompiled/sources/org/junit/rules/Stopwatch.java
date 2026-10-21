package org.junit.rules;

import java.util.concurrent.TimeUnit;
import org.junit.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes13.dex */
public class Stopwatch implements TestRule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f91938a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile long f91939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f91940c;

    public static class a {
    }

    public class b extends TestWatcher {
        public b() {
        }

        @Override // org.junit.rules.TestWatcher
        public final void failed(Throwable th2, Description description) {
            Stopwatch stopwatch = Stopwatch.this;
            stopwatch.f91938a.getClass();
            stopwatch.f91940c = System.nanoTime();
            stopwatch.failed(stopwatch.a(), th2, description);
        }

        @Override // org.junit.rules.TestWatcher
        public final void finished(Description description) {
            Stopwatch stopwatch = Stopwatch.this;
            stopwatch.finished(stopwatch.a(), description);
        }

        @Override // org.junit.rules.TestWatcher
        public final void skipped(AssumptionViolatedException assumptionViolatedException, Description description) {
            Stopwatch stopwatch = Stopwatch.this;
            stopwatch.f91938a.getClass();
            stopwatch.f91940c = System.nanoTime();
            stopwatch.skipped(stopwatch.a(), assumptionViolatedException, description);
        }

        @Override // org.junit.rules.TestWatcher
        public final void starting(Description description) {
            Stopwatch stopwatch = Stopwatch.this;
            stopwatch.f91938a.getClass();
            stopwatch.f91939b = System.nanoTime();
            stopwatch.f91940c = 0L;
        }

        @Override // org.junit.rules.TestWatcher
        public final void succeeded(Description description) {
            Stopwatch stopwatch = Stopwatch.this;
            stopwatch.f91938a.getClass();
            stopwatch.f91940c = System.nanoTime();
            stopwatch.succeeded(stopwatch.a(), description);
        }
    }

    public final long a() {
        if (this.f91939b == 0) {
            throw new IllegalStateException("Test has not started");
        }
        long jNanoTime = this.f91940c;
        if (jNanoTime == 0) {
            this.f91938a.getClass();
            jNanoTime = System.nanoTime();
        }
        return jNanoTime - this.f91939b;
    }

    @Override // org.junit.rules.TestRule
    public final Statement apply(Statement statement, Description description) {
        return new b().apply(statement, description);
    }

    public long runtime(TimeUnit timeUnit) {
        return timeUnit.convert(a(), TimeUnit.NANOSECONDS);
    }

    public void finished(long j10, Description description) {
    }

    public void succeeded(long j10, Description description) {
    }

    public void failed(long j10, Throwable th2, Description description) {
    }

    public void skipped(long j10, AssumptionViolatedException assumptionViolatedException, Description description) {
    }
}
