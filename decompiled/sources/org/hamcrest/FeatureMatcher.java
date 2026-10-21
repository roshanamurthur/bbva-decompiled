package org.hamcrest;

import org.hamcrest.internal.ReflectiveTypeFinder;

/* JADX INFO: loaded from: classes13.dex */
public abstract class FeatureMatcher<T, U> extends TypeSafeDiagnosingMatcher<T> {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final ReflectiveTypeFinder f91759u0 = new ReflectiveTypeFinder("featureValueOf", 1, 0);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Matcher<? super U> f91760r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f91761s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f91762t0;

    public FeatureMatcher(Matcher<? super U> matcher, String str, String str2) {
        super(f91759u0);
        this.f91760r0 = matcher;
        this.f91761s0 = str;
        this.f91762t0 = str2;
    }

    @Override // org.hamcrest.SelfDescribing
    public final void describeTo(Description description) {
        description.appendText(this.f91761s0).appendText(" ").appendDescriptionOf(this.f91760r0);
    }

    public abstract U featureValueOf(T t10);

    @Override // org.hamcrest.TypeSafeDiagnosingMatcher
    public boolean matchesSafely(T t10, Description description) {
        U uFeatureValueOf = featureValueOf(t10);
        Matcher<? super U> matcher = this.f91760r0;
        if (matcher.matches(uFeatureValueOf)) {
            return true;
        }
        description.appendText(this.f91762t0).appendText(" ");
        matcher.describeMismatch(uFeatureValueOf, description);
        return false;
    }
}
