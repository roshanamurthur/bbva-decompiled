package org.hamcrest.core;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeDiagnosingMatcher;

/* JADX INFO: loaded from: classes13.dex */
public class Every<T> extends TypeSafeDiagnosingMatcher<Iterable<T>> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Matcher<? super T> f91776r0;

    public Every(Matcher<? super T> matcher) {
        this.f91776r0 = matcher;
    }

    @Factory
    public static <U> Matcher<Iterable<U>> everyItem(Matcher<U> matcher) {
        return new Every(matcher);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText("every item is ").appendDescriptionOf(this.f91776r0);
    }

    @Override // org.hamcrest.TypeSafeDiagnosingMatcher
    public boolean matchesSafely(Iterable<T> iterable, Description description) {
        for (T t10 : iterable) {
            Matcher<? super T> matcher = this.f91776r0;
            if (!matcher.matches(t10)) {
                description.appendText("an item ");
                matcher.describeMismatch(t10, description);
                return false;
            }
        }
        return true;
    }
}
