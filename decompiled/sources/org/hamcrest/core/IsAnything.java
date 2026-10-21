package org.hamcrest.core;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: classes13.dex */
public class IsAnything<T> extends BaseMatcher<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f91778p0;

    public IsAnything() {
        this("ANYTHING");
    }

    @Factory
    public static Matcher<Object> anything() {
        return new IsAnything();
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText(this.f91778p0);
    }

    @Override // org.hamcrest.Matcher
    public boolean matches(Object obj) {
        return true;
    }

    public IsAnything(String str) {
        this.f91778p0 = str;
    }

    @Factory
    public static Matcher<Object> anything(String str) {
        return new IsAnything(str);
    }
}
