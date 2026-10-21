package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.Ignore;
import org.junit.Test;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class TestMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f91895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TestClass f91896b;

    public TestMethod(Method method, TestClass testClass) {
        this.f91895a = method;
        this.f91896b = testClass;
    }

    public Class<? extends Throwable> getExpectedException() {
        Test test = (Test) this.f91895a.getAnnotation(Test.class);
        if (test == null || test.expected() == Test.None.class) {
            return null;
        }
        return test.expected();
    }

    public long getTimeout() {
        Test test = (Test) this.f91895a.getAnnotation(Test.class);
        if (test == null) {
            return 0L;
        }
        return test.timeout();
    }

    public void invoke(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f91895a.invoke(obj, new Object[0]);
    }

    public boolean isIgnored() {
        return this.f91895a.getAnnotation(Ignore.class) != null;
    }
}
