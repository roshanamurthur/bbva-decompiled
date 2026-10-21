package org.junit.internal.runners.model;

import java.util.Iterator;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

/* JADX INFO: loaded from: classes13.dex */
public class EachTestNotifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RunNotifier f91897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Description f91898b;

    public EachTestNotifier(RunNotifier runNotifier, Description description) {
        this.f91897a = runNotifier;
        this.f91898b = description;
    }

    public void addFailedAssumption(AssumptionViolatedException assumptionViolatedException) {
        this.f91897a.fireTestAssumptionFailed(new Failure(this.f91898b, assumptionViolatedException));
    }

    public void addFailure(Throwable th2) {
        if (!(th2 instanceof org.junit.runners.model.MultipleFailureException)) {
            this.f91897a.fireTestFailure(new Failure(this.f91898b, th2));
        } else {
            Iterator<Throwable> it = ((org.junit.runners.model.MultipleFailureException) th2).getFailures().iterator();
            while (it.hasNext()) {
                addFailure(it.next());
            }
        }
    }

    public void fireTestFinished() {
        this.f91897a.fireTestFinished(this.f91898b);
    }

    public void fireTestIgnored() {
        this.f91897a.fireTestIgnored(this.f91898b);
    }

    public void fireTestStarted() {
        this.f91897a.fireTestStarted(this.f91898b);
    }

    public void fireTestSuiteFinished() {
        this.f91897a.fireTestSuiteFinished(this.f91898b);
    }

    public void fireTestSuiteStarted() {
        this.f91897a.fireTestSuiteStarted(this.f91898b);
    }
}
