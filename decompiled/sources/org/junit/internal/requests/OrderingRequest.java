package org.junit.internal.requests;

import in.a;
import org.junit.internal.runners.ErrorReportingRunner;
import org.junit.runner.Request;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.InvalidOrderingException;
import org.junit.runner.manipulation.Ordering;

/* JADX INFO: loaded from: classes13.dex */
public class OrderingRequest extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Request f91868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ordering f91869d;

    public OrderingRequest(Request request, Ordering ordering) {
        this.f91868c = request;
        this.f91869d = ordering;
    }

    @Override // in.a
    public Runner createRunner() {
        Ordering ordering = this.f91869d;
        Runner runner = this.f91868c.getRunner();
        try {
            ordering.apply(runner);
            return runner;
        } catch (InvalidOrderingException e5) {
            return new ErrorReportingRunner(ordering.getClass(), e5);
        }
    }
}
