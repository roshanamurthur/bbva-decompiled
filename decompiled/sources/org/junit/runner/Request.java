package org.junit.runner;

import java.util.Comparator;
import org.junit.internal.builders.AllDefaultPossibilitiesBuilder;
import org.junit.internal.requests.ClassRequest;
import org.junit.internal.requests.FilterRequest;
import org.junit.internal.requests.OrderingRequest;
import org.junit.internal.requests.SortingRequest;
import org.junit.internal.runners.ErrorReportingRunner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.Ordering;
import org.junit.runners.model.InitializationError;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Request {

    public static class a extends Request {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runner f91977a;

        public a(Runner runner) {
            this.f91977a = runner;
        }

        @Override // org.junit.runner.Request
        public final Runner getRunner() {
            return this.f91977a;
        }
    }

    public static Request aClass(Class<?> cls) {
        return new ClassRequest(cls);
    }

    public static Request classWithoutSuiteMethod(Class<?> cls) {
        return new ClassRequest(cls, false);
    }

    public static Request classes(Computer computer, Class<?>... clsArr) {
        try {
            return runner(computer.getSuite(new AllDefaultPossibilitiesBuilder(), clsArr));
        } catch (InitializationError e5) {
            return runner(new ErrorReportingRunner(e5, clsArr));
        }
    }

    public static Request errorReport(Class<?> cls, Throwable th2) {
        return runner(new ErrorReportingRunner(cls, th2));
    }

    public static Request method(Class<?> cls, String str) {
        return aClass(cls).filterWith(Description.createTestDescription(cls, str));
    }

    public static Request runner(Runner runner) {
        return new a(runner);
    }

    public Request filterWith(Filter filter) {
        return new FilterRequest(this, filter);
    }

    public abstract Runner getRunner();

    public Request orderWith(Ordering ordering) {
        return new OrderingRequest(this, ordering);
    }

    public Request sortWith(Comparator<Description> comparator) {
        return new SortingRequest(this, comparator);
    }

    public Request filterWith(Description description) {
        return filterWith(Filter.matchMethodDescription(description));
    }

    public static Request classes(Class<?>... clsArr) {
        return classes(new Computer(), clsArr);
    }
}
