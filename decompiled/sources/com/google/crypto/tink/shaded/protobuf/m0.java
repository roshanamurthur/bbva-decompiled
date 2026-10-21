package com.google.crypto.tink.shaded.protobuf;

import androidx.appcompat.widget.o1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: ProtobufArrayList.java */
/* JADX INFO: loaded from: classes10.dex */
public final class m0<E> extends a<E> implements RandomAccess {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final m0<Object> f47238s0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public E[] f47239q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f47240r0;

    static {
        m0<Object> m0Var = new m0<>(new Object[0], 0);
        f47238s0 = m0Var;
        m0Var.makeImmutable();
    }

    public m0(E[] eArr, int i10) {
        this.f47239q0 = eArr;
        this.f47240r0 = i10;
    }

    public final void a(int i10) {
        if (i10 < 0 || i10 >= this.f47240r0) {
            StringBuilder sbC = o1.c("Index:", i10, ", Size:");
            sbC.append(this.f47240r0);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e5) {
        ensureIsMutable();
        int i10 = this.f47240r0;
        E[] eArr = this.f47239q0;
        if (i10 == eArr.length) {
            this.f47239q0 = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f47239q0;
        int i11 = this.f47240r0;
        this.f47240r0 = i11 + 1;
        eArr2[i11] = e5;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        a(i10);
        return this.f47239q0[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f47240r0) {
            return new m0(Arrays.copyOf(this.f47239q0, i10), this.f47240r0);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        ensureIsMutable();
        a(i10);
        E[] eArr = this.f47239q0;
        E e5 = eArr[i10];
        int i11 = this.f47240r0;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f47240r0--;
        ((AbstractList) this).modCount++;
        return e5;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.List
    public final E set(int i10, E e5) {
        ensureIsMutable();
        a(i10);
        E[] eArr = this.f47239q0;
        E e7 = eArr[i10];
        eArr[i10] = e5;
        ((AbstractList) this).modCount++;
        return e7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47240r0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.List
    public final void add(int i10, E e5) {
        int i11;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i11 = this.f47240r0)) {
            E[] eArr = this.f47239q0;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) new Object[androidx.datastore.preferences.protobuf.e.b(i11, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i10);
                System.arraycopy(this.f47239q0, i10, eArr2, i10 + 1, this.f47240r0 - i10);
                this.f47239q0 = eArr2;
            }
            this.f47239q0[i10] = e5;
            this.f47240r0++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbC = o1.c("Index:", i10, ", Size:");
        sbC.append(this.f47240r0);
        throw new IndexOutOfBoundsException(sbC.toString());
    }
}
