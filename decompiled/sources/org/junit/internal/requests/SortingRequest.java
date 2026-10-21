package org.junit.internal.requests;

import java.util.Comparator;
import org.junit.runner.Description;
import org.junit.runner.Request;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Sorter;

/* JADX INFO: loaded from: classes13.dex */
public class SortingRequest extends Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Request f91870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator<Description> f91871b;

    public SortingRequest(Request request, Comparator<Description> comparator) {
        this.f91870a = request;
        this.f91871b = comparator;
    }

    @Override // org.junit.runner.Request
    public Runner getRunner() {
        Runner runner = this.f91870a.getRunner();
        new Sorter(this.f91871b).apply(runner);
        return runner;
    }
}
