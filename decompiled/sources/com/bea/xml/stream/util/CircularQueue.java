package com.bea.xml.stream.util;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import oc.a;
import org.koin.core.instance.InstanceFactory;

/* JADX INFO: loaded from: classes9.dex */
public final class CircularQueue extends AbstractCollection {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f37902p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f37903q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f37904r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f37905s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f37906t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f37907u0;
    public Object[] v0;

    public CircularQueue() {
        this(256);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        int i10 = this.f37902p0;
        int i11 = this.f37905s0;
        if (i10 == i11) {
            if (i11 == this.f37906t0) {
                return false;
            }
            Object[] objArr = this.v0;
            int i12 = i11 + i11;
            this.f37905s0 = i12;
            this.f37907u0 = i12 - 1;
            Object[] objArr2 = new Object[i12];
            this.v0 = objArr2;
            int i13 = this.f37904r0;
            System.arraycopy(objArr, i13, objArr2, 0, i11 - i13);
            int i14 = this.f37904r0;
            if (i14 != 0) {
                System.arraycopy(objArr, 0, this.v0, i11 - i14, i14);
            }
            this.f37904r0 = 0;
            this.f37903q0 = this.f37902p0;
        }
        this.f37902p0++;
        Object[] objArr3 = this.v0;
        int i15 = this.f37903q0;
        objArr3[i15] = obj;
        this.f37903q0 = this.f37907u0 & (i15 + 1);
        return true;
    }

    public int capacity() {
        return this.f37905s0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill(this.v0, (Object) null);
        this.f37902p0 = 0;
        this.f37903q0 = 0;
        this.f37904r0 = 0;
    }

    public Object clone() {
        CircularQueue circularQueue = new CircularQueue();
        circularQueue.f37902p0 = 0;
        circularQueue.f37903q0 = 0;
        circularQueue.f37904r0 = 0;
        circularQueue.f37902p0 = this.f37902p0;
        circularQueue.f37903q0 = this.f37903q0;
        circularQueue.f37904r0 = this.f37904r0;
        circularQueue.f37905s0 = this.f37905s0;
        circularQueue.f37906t0 = this.f37906t0;
        circularQueue.f37907u0 = this.f37907u0;
        int length = this.v0.length;
        Object[] objArr = new Object[length];
        circularQueue.v0 = objArr;
        System.arraycopy(this.v0, 0, objArr, 0, length);
        return circularQueue;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f37902p0 == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a(this);
    }

    public Object peek() {
        if (this.f37902p0 == 0) {
            return null;
        }
        return this.v0[this.f37904r0];
    }

    public Object remove() {
        int i10 = this.f37902p0;
        if (i10 == 0) {
            return null;
        }
        this.f37902p0 = i10 - 1;
        Object[] objArr = this.v0;
        int i11 = this.f37904r0;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f37904r0 = this.f37907u0 & (i11 + 1);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f37902p0;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" - capacity: '");
        stringBuffer.append(capacity());
        stringBuffer.append("' size: '");
        stringBuffer.append(size());
        stringBuffer.append("'");
        StringBuffer stringBuffer2 = new StringBuffer(stringBuffer.toString());
        if (this.f37902p0 > 0) {
            stringBuffer2.append(" elements:");
            for (int i10 = 0; i10 < this.f37902p0; i10++) {
                stringBuffer2.append(InstanceFactory.ERROR_SEPARATOR);
                stringBuffer2.append(this.v0[(this.f37904r0 + i10) & this.f37907u0].toString());
            }
        }
        return stringBuffer2.toString();
    }

    public CircularQueue(int i10) {
        this(i10, 1073741824);
    }

    public CircularQueue(int i10, int i11) {
        this.f37902p0 = 0;
        this.f37903q0 = 0;
        this.f37904r0 = 0;
        if (i10 > i11) {
            throw new IllegalArgumentException("Capacity greater than maximum");
        }
        if (i11 <= 1073741824) {
            this.f37905s0 = 1;
            while (true) {
                int i12 = this.f37905s0;
                if (i12 >= i10) {
                    break;
                } else {
                    this.f37905s0 = i12 << 1;
                }
            }
            this.f37906t0 = 1;
            while (true) {
                int i13 = this.f37906t0;
                if (i13 >= i11) {
                    int i14 = this.f37905s0;
                    this.f37907u0 = i14 - 1;
                    this.v0 = new Object[i14];
                    return;
                }
                this.f37906t0 = i13 << 1;
            }
        } else {
            throw new IllegalArgumentException("Maximum capacity greater than allowed");
        }
    }
}
