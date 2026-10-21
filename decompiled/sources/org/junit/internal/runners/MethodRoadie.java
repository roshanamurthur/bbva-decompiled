package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import jn.b;
import org.junit.After;
import org.junit.Before;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class MethodRoadie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f91887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RunNotifier f91888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Description f91889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TestMethod f91890d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MethodRoadie.this.runTestMethod();
        }
    }

    public MethodRoadie(Object obj, TestMethod testMethod, RunNotifier runNotifier, Description description) {
        this.f91887a = obj;
        this.f91888b = runNotifier;
        this.f91889c = description;
        this.f91890d = testMethod;
    }

    public final void a() {
        Iterator<Method> it = this.f91890d.f91896b.getAnnotatedMethods(After.class).iterator();
        while (it.hasNext()) {
            try {
                it.next().invoke(this.f91887a, new Object[0]);
            } catch (InvocationTargetException e5) {
                addFailure(e5.getTargetException());
            } catch (Throwable th2) {
                addFailure(th2);
            }
        }
    }

    public void addFailure(Throwable th2) {
        this.f91888b.fireTestFailure(new Failure(this.f91889c, th2));
    }

    public final void b() throws jn.a {
        try {
            try {
                Iterator<Method> it = this.f91890d.f91896b.getAnnotatedMethods(Before.class).iterator();
                while (it.hasNext()) {
                    it.next().invoke(this.f91887a, new Object[0]);
                }
            } catch (InvocationTargetException e5) {
                throw e5.getTargetException();
            }
        } catch (AssumptionViolatedException unused) {
            throw new jn.a();
        } catch (Throwable th2) {
            addFailure(th2);
            throw new jn.a();
        }
    }

    public void run() {
        TestMethod testMethod = this.f91890d;
        boolean zIsIgnored = testMethod.isIgnored();
        Description description = this.f91889c;
        RunNotifier runNotifier = this.f91888b;
        if (zIsIgnored) {
            runNotifier.fireTestIgnored(description);
            return;
        }
        runNotifier.fireTestStarted(description);
        try {
            long timeout = testMethod.getTimeout();
            if (timeout > 0) {
                runBeforesThenTestThenAfters(new b(this, timeout));
            } else {
                runTest();
            }
        } finally {
            runNotifier.fireTestFinished(description);
        }
    }

    public void runBeforesThenTestThenAfters(Runnable runnable) {
        try {
            try {
                b();
                runnable.run();
            } catch (jn.a unused) {
            } catch (Exception unused2) {
                throw new RuntimeException("test should never throw an exception to this level");
            }
            a();
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }

    public void runTest() {
        runBeforesThenTestThenAfters(new a());
    }

    public void runTestMethod() {
        TestMethod testMethod = this.f91890d;
        try {
            testMethod.invoke(this.f91887a);
            if (testMethod.getExpectedException() != null) {
                addFailure(new AssertionError("Expected exception: ".concat(testMethod.getExpectedException().getName())));
            }
        } catch (InvocationTargetException e5) {
            Throwable targetException = e5.getTargetException();
            if (targetException instanceof AssumptionViolatedException) {
                return;
            }
            if (testMethod.getExpectedException() == null) {
                addFailure(targetException);
                return;
            }
            if (!testMethod.getExpectedException().isAssignableFrom(targetException.getClass())) {
                addFailure(new Exception("Unexpected exception, expected<" + testMethod.getExpectedException().getName() + "> but was<" + targetException.getClass().getName() + ">", targetException));
            }
        } catch (Throwable th2) {
            addFailure(th2);
        }
    }
}
