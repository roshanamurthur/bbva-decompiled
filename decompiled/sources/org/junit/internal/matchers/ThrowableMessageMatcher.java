package org.junit.internal.matchers;

import java.lang.Throwable;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: classes13.dex */
public class ThrowableMessageMatcher<T extends Throwable> extends org.hamcrest.TypeSafeMatcher<T> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Matcher<String> f91860r0;

    public ThrowableMessageMatcher(Matcher<String> matcher) {
        this.f91860r0 = matcher;
    }

    @Factory
    public static <T extends Throwable> Matcher<T> hasMessage(Matcher<String> matcher) {
        return new ThrowableMessageMatcher(matcher);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText("exception with message ");
        description.appendDescriptionOf(this.f91860r0);
    }

    @Override // org.hamcrest.TypeSafeMatcher
    public void describeMismatchSafely(T t10, Description description) {
        description.appendText("message ");
        this.f91860r0.describeMismatch(t10.getMessage(), description);
    }

    @Override // org.hamcrest.TypeSafeMatcher
    public boolean matchesSafely(T t10) {
        return this.f91860r0.matches(t10.getMessage());
    }
}
