package org.hamcrest.core;

import androidx.camera.camera2.internal.h0;
import java.util.Iterator;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

/* JADX INFO: compiled from: ShortcutCombination.java */
/* JADX INFO: loaded from: classes13.dex */
public abstract class a<T> extends BaseMatcher<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Iterable<Matcher<? super T>> f91785p0;

    public a(Iterable<Matcher<? super T>> iterable) {
        this.f91785p0 = iterable;
    }

    @Override // org.hamcrest.SelfDescribing
    public abstract void describeTo(Description description);

    public void describeTo(Description description, String str) {
        description.appendList("(", h0.b(" ", str, " "), ")", this.f91785p0);
    }

    @Override // org.hamcrest.Matcher
    public abstract boolean matches(Object obj);

    public boolean matches(Object obj, boolean z10) {
        Iterator<Matcher<? super T>> it = this.f91785p0.iterator();
        while (it.hasNext()) {
            if (it.next().matches(obj) == z10) {
                return z10;
            }
        }
        return !z10;
    }
}
