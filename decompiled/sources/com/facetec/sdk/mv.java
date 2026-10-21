package com.facetec.sdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
final class mv<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f42633a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class[] f42634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f42635e;

    public mv(Class<?> cls, String str, Class... clsArr) {
        this.f42633a = cls;
        this.f42635e = str;
        this.f42634d = clsArr;
    }

    private Object d(T t10, Object... objArr) throws InvocationTargetException {
        Method methodA = a(t10.getClass());
        if (methodA == null) {
            return null;
        }
        try {
            return methodA.invoke(t10, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    private Object e(T t10, Object... objArr) throws InvocationTargetException {
        Method methodA = a(t10.getClass());
        if (methodA != null) {
            try {
                return methodA.invoke(t10, objArr);
            } catch (IllegalAccessException e5) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(String.valueOf(methodA)));
                assertionError.initCause(e5);
                throw assertionError;
            }
        }
        StringBuilder sb2 = new StringBuilder("Method ");
        sb2.append(this.f42635e);
        sb2.append(" not supported for object ");
        sb2.append(t10);
        throw new AssertionError(sb2.toString());
    }

    public final Object a(T t10, Object... objArr) {
        try {
            return e(t10, objArr);
        } catch (InvocationTargetException e5) {
            Throwable targetException = e5.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final boolean c(T t10) {
        return a(t10.getClass()) != null;
    }

    public final Object c(T t10, Object... objArr) {
        try {
            return d(t10, objArr);
        } catch (InvocationTargetException e5) {
            Throwable targetException = e5.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private static Method e(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    private Method a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f42635e;
        if (str == null) {
            return null;
        }
        Method methodE = e(cls, str, this.f42634d);
        if (methodE == null || (cls2 = this.f42633a) == null || cls2.isAssignableFrom(methodE.getReturnType())) {
            return methodE;
        }
        return null;
    }
}
