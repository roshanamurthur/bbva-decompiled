package org.junit.runner.notification;

import org.junit.runner.Description;
import org.junit.runner.Result;

/* JADX INFO: compiled from: SynchronizedRunListener.java */
/* JADX INFO: loaded from: classes13.dex */
@RunListener.ThreadSafe
public final class a extends RunListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RunListener f92006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f92007b;

    public a(RunListener runListener, Object obj) {
        this.f92006a = runListener;
        this.f92007b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f92006a.equals(((a) obj).f92006a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f92006a.hashCode();
    }

    @Override // org.junit.runner.notification.RunListener
    public final void testAssumptionFailure(Failure failure) {
        synchronized (this.f92007b) {
            this.f92006a.testAssumptionFailure(failure);
        }
    }

    @Override // org.junit.runner.notification.RunListener
    public final void testFailure(Failure failure) throws Exception {
        synchronized (this.f92007b) {
            this.f92006a.testFailure(failure);
        }
    }

    @Override // org.junit.runner.notification.RunListener
    public final void testFinished(Description description) throws Exception {
        synchronized (this.f92007b) {
            this.f92006a.testFinished(description);
        }
    }

    @Override // org.junit.runner.notification.RunListener
    public final void testIgnored(Description description) throws Exception {
        synchronized (this.f92007b) {
            this.f92006a.testIgnored(description);
        }
    }

    @Override // org.junit.runner.notification.RunListener
    public final void testRunFinished(Result result) throws Exception {
        synchronized (this.f92007b) {
            this.f92006a.testRunFinished(result);
        }
    }

    @Override // org.junit.runner.notification.RunListener
    public final void testRunStarted(Description description) throws Exception {
        synchronized (this.f92007b) {
            this.f92006a.testRunStarted(description);
        }
    }

    @Override // org.junit.runner.notification.RunListener
    public final void testStarted(Description description) throws Exception {
        synchronized (this.f92007b) {
            this.f92006a.testStarted(description);
        }
    }

    @Override // org.junit.runner.notification.RunListener
    public final void testSuiteFinished(Description description) throws Exception {
        synchronized (this.f92007b) {
            this.f92006a.testSuiteFinished(description);
        }
    }

    @Override // org.junit.runner.notification.RunListener
    public final void testSuiteStarted(Description description) throws Exception {
        synchronized (this.f92007b) {
            this.f92006a.testSuiteStarted(description);
        }
    }

    public final String toString() {
        return this.f92006a.toString() + " (with synchronization wrapper)";
    }
}
