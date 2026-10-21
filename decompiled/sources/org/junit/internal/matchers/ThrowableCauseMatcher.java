package org.junit.internal.matchers;

import java.lang.Throwable;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: classes13.dex */
public class ThrowableCauseMatcher<T extends Throwable> extends org.hamcrest.TypeSafeMatcher<T> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Matcher<?> f91859r0;

    public ThrowableCauseMatcher(Matcher<?> matcher) {
        this.f91859r0 = matcher;
    }

    @Factory
    public static <T extends Throwable> Matcher<T> hasCause(Matcher<?> matcher) {
        return new ThrowableCauseMatcher(matcher);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText("exception with cause ");
        description.appendDescriptionOf(this.f91859r0);
    }

    @Override // org.hamcrest.TypeSafeMatcher
    public void describeMismatchSafely(T t10, Description description) {
        description.appendText("cause ");
        this.f91859r0.describeMismatch(t10.getCause(), description);
    }

    @Override // org.hamcrest.TypeSafeMatcher
    public boolean matchesSafely(T t10) {
        return this.f91859r0.matches(t10.getCause());
    }
}
