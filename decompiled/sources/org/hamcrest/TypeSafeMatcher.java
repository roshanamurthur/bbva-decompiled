package org.hamcrest;

import org.hamcrest.internal.ReflectiveTypeFinder;

/* JADX INFO: loaded from: classes13.dex */
public abstract class TypeSafeMatcher<T> extends BaseMatcher<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final ReflectiveTypeFinder f91766q0 = new ReflectiveTypeFinder("matchesSafely", 1, 0);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Class<?> f91767p0;

    public TypeSafeMatcher() {
        this(f91766q0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.hamcrest.BaseMatcher, org.hamcrest.Matcher
    public final void describeMismatch(Object obj, Description description) {
        if (obj == 0) {
            super.describeMismatch(obj, description);
        } else if (this.f91767p0.isInstance(obj)) {
            describeMismatchSafely(obj, description);
        } else {
            description.appendText("was a ").appendText(obj.getClass().getName()).appendText(" (").appendValue(obj).appendText(")");
        }
    }

    public void describeMismatchSafely(T t10, Description description) {
        super.describeMismatch(t10, description);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.hamcrest.Matcher
    public final boolean matches(Object obj) {
        return obj != 0 && this.f91767p0.isInstance(obj) && matchesSafely(obj);
    }

    public abstract boolean matchesSafely(T t10);

    public TypeSafeMatcher(Class<?> cls) {
        this.f91767p0 = cls;
    }

    public TypeSafeMatcher(ReflectiveTypeFinder reflectiveTypeFinder) {
        this.f91767p0 = reflectiveTypeFinder.findExpectedType(getClass());
    }
}
