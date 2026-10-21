package org.hamcrest.core;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: classes13.dex */
public class IsNot<T> extends BaseMatcher<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Matcher<T> f91783p0;

    public IsNot(Matcher<T> matcher) {
        this.f91783p0 = matcher;
    }

    @Factory
    public static <T> Matcher<T> not(Matcher<T> matcher) {
        return new IsNot(matcher);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText("not ").appendDescriptionOf(this.f91783p0);
    }

    @Override // org.hamcrest.Matcher
    public boolean matches(Object obj) {
        return !this.f91783p0.matches(obj);
    }

    @Factory
    public static <T> Matcher<T> not(T t10) {
        return not(IsEqual.equalTo(t10));
    }
}
