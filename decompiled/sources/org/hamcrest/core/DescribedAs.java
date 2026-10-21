package org.hamcrest.core;

import java.util.regex.Pattern;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: classes13.dex */
public class DescribedAs<T> extends BaseMatcher<T> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Pattern f91772s0 = Pattern.compile("%([0-9]+)");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f91773p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Matcher<T> f91774q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Object[] f91775r0;

    public DescribedAs(String str, Matcher<T> matcher, Object[] objArr) {
        this.f91773p0 = str;
        this.f91774q0 = matcher;
        this.f91775r0 = (Object[]) objArr.clone();
    }

    @Factory
    public static <T> Matcher<T> describedAs(String str, Matcher<T> matcher, Object... objArr) {
        return new DescribedAs(str, matcher, objArr);
    }

    @Override // org.hamcrest.BaseMatcher, org.hamcrest.Matcher
    public void describeMismatch(Object obj, Description description) {
        this.f91774q0.describeMismatch(obj, description);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        Pattern pattern = f91772s0;
        String str = this.f91773p0;
        java.util.regex.Matcher matcher = pattern.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            description.appendText(str.substring(iEnd, matcher.start()));
            description.appendValue(this.f91775r0[Integer.parseInt(matcher.group(1))]);
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            description.appendText(str.substring(iEnd));
        }
    }

    @Override // org.hamcrest.Matcher
    public boolean matches(Object obj) {
        return this.f91774q0.matches(obj);
    }
}
