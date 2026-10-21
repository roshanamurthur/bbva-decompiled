package com.bea.xml.stream.util;

import java.util.AbstractCollection;
import java.util.EmptyStackException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class Stack extends AbstractCollection {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Object[] f37910p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f37911q0;

    public Stack() {
        this(15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        push(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Object[] objArr = this.f37910p0;
        while (true) {
            int i10 = this.f37911q0;
            if (i10 <= 0) {
                return;
            }
            int i11 = i10 - 1;
            this.f37911q0 = i11;
            objArr[i11] = null;
        }
    }

    public Object clone() {
        int i10 = this.f37911q0;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f37910p0, 0, objArr, 0, i10);
        int i11 = this.f37911q0;
        Stack stack = new Stack();
        stack.f37910p0 = objArr;
        stack.f37911q0 = i11;
        return stack;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f37911q0 == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        int i10 = this.f37911q0;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f37910p0, 0, objArr, 0, i10);
        return new ArrayIterator(objArr);
    }

    public Object peek() {
        try {
            return this.f37910p0[this.f37911q0 - 1];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new EmptyStackException();
        }
    }

    public Object pop() {
        try {
            Object[] objArr = this.f37910p0;
            int i10 = this.f37911q0 - 1;
            this.f37911q0 = i10;
            Object obj = objArr[i10];
            objArr[i10] = null;
            return obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (this.f37911q0 < 0) {
                this.f37911q0 = 0;
            }
            throw new EmptyStackException();
        }
    }

    public void push(Object obj) {
        int i10 = this.f37911q0;
        Object[] objArr = this.f37910p0;
        if (i10 == objArr.length) {
            if (i10 == 0) {
                this.f37910p0 = new Object[1];
            } else {
                Object[] objArr2 = new Object[i10 * 2];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                this.f37910p0 = objArr2;
            }
        }
        Object[] objArr3 = this.f37910p0;
        int i11 = this.f37911q0;
        this.f37911q0 = i11 + 1;
        objArr3[i11] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f37911q0;
    }

    public Stack(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        this.f37910p0 = new Object[i10];
        this.f37911q0 = 0;
    }
}
