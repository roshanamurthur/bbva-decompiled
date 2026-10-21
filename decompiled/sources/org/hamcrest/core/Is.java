package org.hamcrest.core;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: classes13.dex */
public class Is<T> extends BaseMatcher<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Matcher<T> f91777p0;

    public Is(Matcher<T> matcher) {
        this.f91777p0 = matcher;
    }

    @Factory
    public static <T> Matcher<T> is(Matcher<T> matcher) {
        return new Is(matcher);
    }

    @Factory
    public static <T> Matcher<T> isA(Class<T> cls) {
        return is(IsInstanceOf.instanceOf(cls));
    }

    @Override // org.hamcrest.BaseMatcher, org.hamcrest.Matcher
    public void describeMismatch(Object obj, Description description) {
        this.f91777p0.describeMismatch(obj, description);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText("is ").appendDescriptionOf(this.f91777p0);
    }

    @Override // org.hamcrest.Matcher
    public boolean matches(Object obj) {
        return this.f91777p0.matches(obj);
    }

    @Factory
    public static <T> Matcher<T> is(T t10) {
        return is(IsEqual.equalTo(t10));
    }

    @Factory
    @Deprecated
    public static <T> Matcher<T> is(Class<T> cls) {
        return is(IsInstanceOf.instanceOf(cls));
    }
}
