package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class MethodValidator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f91892a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TestClass f91893b;

    public MethodValidator(TestClass testClass) {
        this.f91893b = testClass;
    }

    public final void a(Class<? extends Annotation> cls, boolean z10) {
        for (Method method : this.f91893b.getAnnotatedMethods(cls)) {
            boolean zIsStatic = Modifier.isStatic(method.getModifiers());
            ArrayList arrayList = this.f91892a;
            if (zIsStatic != z10) {
                arrayList.add(new Exception("Method " + method.getName() + "() " + (z10 ? "should" : "should not") + " be static"));
            }
            if (!Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
                arrayList.add(new Exception("Class " + method.getDeclaringClass().getName() + " should be public"));
            }
            if (!Modifier.isPublic(method.getModifiers())) {
                arrayList.add(new Exception("Method " + method.getName() + " should be public"));
            }
            if (method.getReturnType() != Void.TYPE) {
                arrayList.add(new Exception("Method " + method.getName() + "should have a return type of void"));
            }
            if (method.getParameterTypes().length != 0) {
                arrayList.add(new Exception("Method " + method.getName() + " should have no parameters"));
            }
        }
    }

    public void assertValid() throws InitializationError {
        ArrayList arrayList = this.f91892a;
        if (!arrayList.isEmpty()) {
            throw new InitializationError(arrayList);
        }
    }

    public void validateInstanceMethods() {
        a(After.class, false);
        a(Before.class, false);
        a(Test.class, false);
        if (this.f91893b.getAnnotatedMethods(Test.class).size() == 0) {
            this.f91892a.add(new Exception("No runnable methods"));
        }
    }

    public List<Throwable> validateMethodsForDefaultRunner() {
        validateNoArgConstructor();
        validateStaticMethods();
        validateInstanceMethods();
        return this.f91892a;
    }

    public void validateNoArgConstructor() {
        try {
            this.f91893b.getConstructor();
        } catch (Exception e5) {
            this.f91892a.add(new Exception("Test class should have public zero-argument constructor", e5));
        }
    }

    public void validateStaticMethods() {
        a(BeforeClass.class, true);
        a(AfterClass.class, true);
    }
}
