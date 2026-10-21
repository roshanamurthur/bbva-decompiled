package org.junit.internal.requests;

import org.junit.internal.runners.ErrorReportingRunner;
import org.junit.runner.Request;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.NoTestsRemainException;

/* JADX INFO: loaded from: classes13.dex */
public final class FilterRequest extends Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Request f91866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Filter f91867b;

    public FilterRequest(Request request, Filter filter) {
        this.f91866a = request;
        this.f91867b = filter;
    }

    @Override // org.junit.runner.Request
    public Runner getRunner() {
        Filter filter = this.f91867b;
        Request request = this.f91866a;
        try {
            Runner runner = request.getRunner();
            filter.apply(runner);
            return runner;
        } catch (NoTestsRemainException unused) {
            return new ErrorReportingRunner((Class<?>) Filter.class, new Exception(String.format("No tests found matching %s from %s", filter.describe(), request.toString())));
        }
    }
}
