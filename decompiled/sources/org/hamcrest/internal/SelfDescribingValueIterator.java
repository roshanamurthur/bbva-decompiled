package org.hamcrest.internal;

import java.util.Iterator;
import org.hamcrest.SelfDescribing;

/* JADX INFO: loaded from: classes13.dex */
public class SelfDescribingValueIterator<T> implements Iterator<SelfDescribing> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Iterator<T> f91792p0;

    public SelfDescribingValueIterator(Iterator<T> it) {
        this.f91792p0 = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f91792p0.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f91792p0.remove();
    }

    @Override // java.util.Iterator
    public SelfDescribing next() {
        return new SelfDescribingValue(this.f91792p0.next());
    }
}
