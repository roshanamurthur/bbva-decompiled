package org.junit.internal.matchers;

import java.lang.Throwable;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.junit.internal.Throwables;

/* JADX INFO: loaded from: classes13.dex */
public class StacktracePrintingMatcher<T extends Throwable> extends org.hamcrest.TypeSafeMatcher<T> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Matcher<T> f91858r0;

    public StacktracePrintingMatcher(Matcher<T> matcher) {
        this.f91858r0 = matcher;
    }

    @Factory
    public static <T extends Exception> Matcher<T> isException(Matcher<T> matcher) {
        return new StacktracePrintingMatcher(matcher);
    }

    @Factory
    public static <T extends Throwable> Matcher<T> isThrowable(Matcher<T> matcher) {
        return new StacktracePrintingMatcher(matcher);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        this.f91858r0.describeTo(description);
    }

    @Override // org.hamcrest.TypeSafeMatcher
    public void describeMismatchSafely(T t10, Description description) {
        this.f91858r0.describeMismatch(t10, description);
        description.appendText("\nStacktrace was: ");
        description.appendText(Throwables.getStacktrace(t10));
    }

    @Override // org.hamcrest.TypeSafeMatcher
    public boolean matchesSafely(T t10) {
        return this.f91858r0.matches(t10);
    }
}
