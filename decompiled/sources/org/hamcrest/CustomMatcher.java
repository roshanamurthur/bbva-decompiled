package org.hamcrest;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CustomMatcher<T> extends BaseMatcher<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f91757p0;

    public CustomMatcher(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Description should be non null!");
        }
        this.f91757p0 = str;
    }

    @Override // org.hamcrest.SelfDescribing
    public final void describeTo(Description description) {
        description.appendText(this.f91757p0);
    }
}
