package org.hamcrest;

import org.hamcrest.internal.ReflectiveTypeFinder;

/* JADX INFO: loaded from: classes13.dex */
public abstract class TypeSafeDiagnosingMatcher<T> extends BaseMatcher<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final ReflectiveTypeFinder f91764q0 = new ReflectiveTypeFinder("matchesSafely", 2, 0);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Class<?> f91765p0;

    public TypeSafeDiagnosingMatcher(Class<?> cls) {
        this.f91765p0 = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.hamcrest.BaseMatcher, org.hamcrest.Matcher
    public final void describeMismatch(Object obj, Description description) {
        if (obj == 0 || !this.f91765p0.isInstance(obj)) {
            super.describeMismatch(obj, description);
        } else {
            matchesSafely(obj, description);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.hamcrest.Matcher
    public final boolean matches(Object obj) {
        return obj != 0 && this.f91765p0.isInstance(obj) && matchesSafely(obj, new Description.NullDescription());
    }

    public abstract boolean matchesSafely(T t10, Description description);

    public TypeSafeDiagnosingMatcher(ReflectiveTypeFinder reflectiveTypeFinder) {
        this.f91765p0 = reflectiveTypeFinder.findExpectedType(getClass());
    }

    public TypeSafeDiagnosingMatcher() {
        this(f91764q0);
    }
}
