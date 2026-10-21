package com.fasterxml.jackson.databind.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
public class ArrayIterator<T> implements Iterator<T>, Iterable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final T[] f43495p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f43496q0 = 0;

    public ArrayIterator(T[] tArr) {
        this.f43495p0 = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f43496q0 < this.f43495p0.length;
    }

    @Override // java.util.Iterator
    public T next() {
        int i10 = this.f43496q0;
        T[] tArr = this.f43495p0;
        if (i10 >= tArr.length) {
            throw new NoSuchElementException();
        }
        this.f43496q0 = i10 + 1;
        return tArr[i10];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this;
    }
}
