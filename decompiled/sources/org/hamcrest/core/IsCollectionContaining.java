package org.hamcrest.core;

import java.util.ArrayList;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeDiagnosingMatcher;

/* JADX INFO: loaded from: classes13.dex */
public class IsCollectionContaining<T> extends TypeSafeDiagnosingMatcher<Iterable<? super T>> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Matcher<? super T> f91779r0;

    public IsCollectionContaining(Matcher<? super T> matcher) {
        this.f91779r0 = matcher;
    }

    @Factory
    public static <T> Matcher<Iterable<? super T>> hasItem(Matcher<? super T> matcher) {
        return new IsCollectionContaining(matcher);
    }

    @Factory
    public static <T> Matcher<Iterable<T>> hasItems(Matcher<? super T>... matcherArr) {
        ArrayList arrayList = new ArrayList(matcherArr.length);
        for (Matcher<? super T> matcher : matcherArr) {
            arrayList.add(new IsCollectionContaining(matcher));
        }
        return AllOf.allOf(arrayList);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText("a collection containing ").appendDescriptionOf(this.f91779r0);
    }

    @Factory
    public static <T> Matcher<Iterable<? super T>> hasItem(T t10) {
        return new IsCollectionContaining(IsEqual.equalTo(t10));
    }

    @Override // org.hamcrest.TypeSafeDiagnosingMatcher
    public boolean matchesSafely(Iterable<? super T> iterable, Description description) {
        boolean z10 = false;
        for (T t10 : iterable) {
            Matcher<? super T> matcher = this.f91779r0;
            if (matcher.matches(t10)) {
                return true;
            }
            if (z10) {
                description.appendText(", ");
            }
            matcher.describeMismatch(t10, description);
            z10 = true;
        }
        return false;
    }

    @Factory
    public static <T> Matcher<Iterable<T>> hasItems(T... tArr) {
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t10 : tArr) {
            arrayList.add(hasItem(t10));
        }
        return AllOf.allOf(arrayList);
    }
}
