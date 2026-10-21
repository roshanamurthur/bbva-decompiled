package org.hamcrest.internal;

import ad.d;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes13.dex */
public class ReflectiveTypeFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91790c;

    public ReflectiveTypeFinder(String str, int i10, int i11) {
        this.f91788a = str;
        this.f91789b = i10;
        this.f91790c = i11;
    }

    public boolean canObtainExpectedTypeFrom(Method method) {
        return method.getName().equals(this.f91788a) && method.getParameterTypes().length == this.f91789b && !method.isSynthetic();
    }

    public Class<?> expectedTypeFrom(Method method) {
        return method.getParameterTypes()[this.f91790c];
    }

    public Class<?> findExpectedType(Class<?> cls) {
        while (cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (canObtainExpectedTypeFrom(method)) {
                    return expectedTypeFrom(method);
                }
            }
            cls = cls.getSuperclass();
        }
        throw new Error(d.f(new StringBuilder("Cannot determine correct type for "), this.f91788a, "() method."));
    }
}
