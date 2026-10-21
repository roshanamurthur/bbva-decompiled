package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import jn.a;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class ClassRoadie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RunNotifier f91872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TestClass f91873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Description f91874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f91875d;

    public ClassRoadie(RunNotifier runNotifier, TestClass testClass, Description description, Runnable runnable) {
        this.f91872a = runNotifier;
        this.f91873b = testClass;
        this.f91874c = description;
        this.f91875d = runnable;
    }

    public final void a() {
        Iterator<Method> it = this.f91873b.getAnnotatedMethods(AfterClass.class).iterator();
        while (it.hasNext()) {
            try {
                it.next().invoke(null, new Object[0]);
            } catch (InvocationTargetException e5) {
                addFailure(e5.getTargetException());
            } catch (Throwable th2) {
                addFailure(th2);
            }
        }
    }

    public void addFailure(Throwable th2) {
        this.f91872a.fireTestFailure(new Failure(this.f91874c, th2));
    }

    public final void b() throws a {
        try {
            try {
                Iterator<Method> it = this.f91873b.getAnnotatedMethods(BeforeClass.class).iterator();
                while (it.hasNext()) {
                    it.next().invoke(null, new Object[0]);
                }
            } catch (InvocationTargetException e5) {
                throw e5.getTargetException();
            }
        } catch (AssumptionViolatedException unused) {
            throw new a();
        } catch (Throwable th2) {
            addFailure(th2);
            throw new a();
        }
    }

    public void runProtected() {
        try {
            b();
            runUnprotected();
        } catch (a unused) {
        } finally {
            a();
        }
    }

    public void runUnprotected() {
        this.f91875d.run();
    }
}
