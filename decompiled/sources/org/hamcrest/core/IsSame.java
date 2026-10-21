package org.hamcrest.core;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: classes13.dex */
public class IsSame<T> extends BaseMatcher<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final T f91784p0;

    public IsSame(T t10) {
        this.f91784p0 = t10;
    }

    @Factory
    public static <T> Matcher<T> sameInstance(T t10) {
        return new IsSame(t10);
    }

    @Factory
    public static <T> Matcher<T> theInstance(T t10) {
        return new IsSame(t10);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText("sameInstance(").appendValue(this.f91784p0).appendText(")");
    }

    @Override // org.hamcrest.Matcher
    public boolean matches(Object obj) {
        return obj == this.f91784p0;
    }
}
