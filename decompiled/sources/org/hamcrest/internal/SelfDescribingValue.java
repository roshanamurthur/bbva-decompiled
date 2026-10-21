package org.hamcrest.internal;

import org.hamcrest.Description;
import org.hamcrest.SelfDescribing;

/* JADX INFO: loaded from: classes13.dex */
public class SelfDescribingValue<T> implements SelfDescribing {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final T f91791p0;

    public SelfDescribingValue(T t10) {
        this.f91791p0 = t10;
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendValue(this.f91791p0);
    }
}
