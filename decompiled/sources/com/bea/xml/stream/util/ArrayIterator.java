package com.bea.xml.stream.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
public final class ArrayIterator implements Iterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Object[] f37899p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f37900q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f37901r0;

    public ArrayIterator(Object[] objArr) {
        this(objArr, 0, objArr.length);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37901r0 < this.f37900q0;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f37901r0;
        if (i10 >= this.f37900q0) {
            throw new NoSuchElementException();
        }
        this.f37901r0 = i10 + 1;
        return this.f37899p0[i10];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public ArrayIterator(Object[] objArr, int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i10 > objArr.length) {
            throw new IllegalArgumentException();
        }
        if (i11 > objArr.length - i10) {
            throw new IllegalArgumentException();
        }
        this.f37899p0 = objArr;
        this.f37901r0 = i10;
        this.f37900q0 = i11 + i10;
    }
}
