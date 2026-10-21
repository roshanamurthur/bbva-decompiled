package org.junit.rules;

import java.util.concurrent.TimeUnit;
import org.junit.internal.runners.statements.FailOnTimeout;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes13.dex */
public class Timeout implements TestRule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f91954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeUnit f91955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f91956c;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f91957a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f91958b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TimeUnit f91959c = TimeUnit.SECONDS;

        public Timeout build() {
            return new Timeout(this);
        }

        public boolean getLookingForStuckThread() {
            return this.f91957a;
        }

        public TimeUnit getTimeUnit() {
            return this.f91959c;
        }

        public long getTimeout() {
            return this.f91958b;
        }

        public Builder withLookingForStuckThread(boolean z10) {
            this.f91957a = z10;
            return this;
        }

        public Builder withTimeout(long j10, TimeUnit timeUnit) {
            this.f91958b = j10;
            this.f91959c = timeUnit;
            return this;
        }
    }

    public class a extends Statement {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Exception f91960a;

        public a(Exception exc) {
            this.f91960a = exc;
        }

        @Override // org.junit.runners.model.Statement
        public final void evaluate() throws Throwable {
            throw new RuntimeException("Invalid parameters for Timeout", this.f91960a);
        }
    }

    @Deprecated
    public Timeout(int i10) {
        this(i10, TimeUnit.MILLISECONDS);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Timeout millis(long j10) {
        return new Timeout(j10, TimeUnit.MILLISECONDS);
    }

    public static Timeout seconds(long j10) {
        return new Timeout(j10, TimeUnit.SECONDS);
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(Statement statement, Description description) {
        try {
            return createFailOnTimeoutStatement(statement);
        } catch (Exception e5) {
            return new a(e5);
        }
    }

    public Statement createFailOnTimeoutStatement(Statement statement) throws Exception {
        return FailOnTimeout.builder().withTimeout(this.f91954a, this.f91955b).withLookingForStuckThread(this.f91956c).build(statement);
    }

    public final boolean getLookingForStuckThread() {
        return this.f91956c;
    }

    public final long getTimeout(TimeUnit timeUnit) {
        return timeUnit.convert(this.f91954a, this.f91955b);
    }

    public Timeout(long j10, TimeUnit timeUnit) {
        this.f91954a = j10;
        this.f91955b = timeUnit;
        this.f91956c = false;
    }

    public Timeout(Builder builder) {
        this.f91954a = builder.getTimeout();
        this.f91955b = builder.getTimeUnit();
        this.f91956c = builder.getLookingForStuckThread();
    }
}
