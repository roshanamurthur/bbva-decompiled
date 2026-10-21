package org.junit.internal.matchers;

import java.lang.reflect.Method;
import org.hamcrest.BaseMatcher;
import org.junit.internal.MethodSorter;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class TypeSafeMatcher<T> extends BaseMatcher<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Class<?> f91861p0;

    public TypeSafeMatcher() {
        for (Class<?> superclass = getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Method method : MethodSorter.getDeclaredMethods(superclass)) {
                if ("matchesSafely".equals(method.getName()) && method.getParameterTypes().length == 1 && !method.isSynthetic()) {
                    this.f91861p0 = method.getParameterTypes()[0];
                    return;
                }
            }
        }
        throw new Error("Cannot determine correct type for matchesSafely() method.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.hamcrest.Matcher
    public final boolean matches(Object obj) {
        return obj != 0 && this.f91861p0.isInstance(obj) && matchesSafely(obj);
    }

    public abstract boolean matchesSafely(T t10);

    /* JADX WARN: Multi-variable type inference failed */
    public TypeSafeMatcher(Class<T> cls) {
        this.f91861p0 = cls;
    }
}
