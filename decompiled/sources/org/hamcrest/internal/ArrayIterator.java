package org.hamcrest.internal;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class ArrayIterator implements Iterator<Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Object f91786p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f91787q0 = 0;

    public ArrayIterator(Object obj) {
        if (!obj.getClass().isArray()) {
            throw new IllegalArgumentException("not an array");
        }
        this.f91786p0 = obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f91787q0 < Array.getLength(this.f91786p0);
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f91787q0;
        this.f91787q0 = i10 + 1;
        return Array.get(this.f91786p0, i10);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("cannot remove items from an array");
    }
}
