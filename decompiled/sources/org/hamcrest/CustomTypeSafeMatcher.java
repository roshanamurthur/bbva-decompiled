package org.hamcrest;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CustomTypeSafeMatcher<T> extends TypeSafeMatcher<T> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f91758r0;

    public CustomTypeSafeMatcher(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Description must be non null!");
        }
        this.f91758r0 = str;
    }

    @Override // org.hamcrest.SelfDescribing
    public final void describeTo(Description description) {
        description.appendText(this.f91758r0);
    }
}
