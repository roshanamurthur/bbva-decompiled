package org.hamcrest.core;

import java.util.ArrayList;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeDiagnosingMatcher;

/* JADX INFO: loaded from: classes13.dex */
public class CombinableMatcher<T> extends TypeSafeDiagnosingMatcher<T> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Matcher<? super T> f91769r0;

    public static final class CombinableBothMatcher<X> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matcher<? super X> f91770a;

        public CombinableBothMatcher(Matcher<? super X> matcher) {
            this.f91770a = matcher;
        }

        public CombinableMatcher<X> and(Matcher<? super X> matcher) {
            return new CombinableMatcher(this.f91770a).and(matcher);
        }
    }

    public static final class CombinableEitherMatcher<X> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matcher<? super X> f91771a;

        public CombinableEitherMatcher(Matcher<? super X> matcher) {
            this.f91771a = matcher;
        }

        public CombinableMatcher<X> or(Matcher<? super X> matcher) {
            return new CombinableMatcher(this.f91771a).or(matcher);
        }
    }

    public CombinableMatcher(Matcher<? super T> matcher) {
        this.f91769r0 = matcher;
    }

    @Factory
    public static <LHS> CombinableBothMatcher<LHS> both(Matcher<? super LHS> matcher) {
        return new CombinableBothMatcher<>(matcher);
    }

    @Factory
    public static <LHS> CombinableEitherMatcher<LHS> either(Matcher<? super LHS> matcher) {
        return new CombinableEitherMatcher<>(matcher);
    }

    public CombinableMatcher<T> and(Matcher<? super T> matcher) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f91769r0);
        arrayList.add(matcher);
        return new CombinableMatcher<>(new AllOf(arrayList));
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendDescriptionOf(this.f91769r0);
    }

    @Override // org.hamcrest.TypeSafeDiagnosingMatcher
    public boolean matchesSafely(T t10, Description description) {
        Matcher<? super T> matcher = this.f91769r0;
        if (matcher.matches(t10)) {
            return true;
        }
        matcher.describeMismatch(t10, description);
        return false;
    }

    public CombinableMatcher<T> or(Matcher<? super T> matcher) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f91769r0);
        arrayList.add(matcher);
        return new CombinableMatcher<>(new AnyOf(arrayList));
    }
}
