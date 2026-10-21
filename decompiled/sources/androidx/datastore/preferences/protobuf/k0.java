package androidx.datastore.preferences.protobuf;

import androidx.appcompat.widget.o1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: ProtobufArrayList.java */
/* JADX INFO: loaded from: classes2.dex */
public final class k0<E> extends a<E> implements RandomAccess {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final k0<Object> f21073s0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public E[] f21074q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f21075r0;

    static {
        k0<Object> k0Var = new k0<>(new Object[0], 0);
        f21073s0 = k0Var;
        k0Var.makeImmutable();
    }

    public k0(E[] eArr, int i10) {
        this.f21074q0 = eArr;
        this.f21075r0 = i10;
    }

    public final void a(int i10) {
        if (i10 < 0 || i10 >= this.f21075r0) {
            StringBuilder sbC = o1.c("Index:", i10, ", Size:");
            sbC.append(this.f21075r0);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e5) {
        ensureIsMutable();
        int i10 = this.f21075r0;
        E[] eArr = this.f21074q0;
        if (i10 == eArr.length) {
            this.f21074q0 = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f21074q0;
        int i11 = this.f21075r0;
        this.f21075r0 = i11 + 1;
        eArr2[i11] = e5;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        a(i10);
        return this.f21074q0[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final Internal.ProtobufList mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f21075r0) {
            return new k0(Arrays.copyOf(this.f21074q0, i10), this.f21075r0);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        ensureIsMutable();
        a(i10);
        E[] eArr = this.f21074q0;
        E e5 = eArr[i10];
        int i11 = this.f21075r0;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f21075r0--;
        ((AbstractList) this).modCount++;
        return e5;
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.List
    public final E set(int i10, E e5) {
        ensureIsMutable();
        a(i10);
        E[] eArr = this.f21074q0;
        E e7 = eArr[i10];
        eArr[i10] = e5;
        ((AbstractList) this).modCount++;
        return e7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21075r0;
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.List
    public final void add(int i10, E e5) {
        int i11;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i11 = this.f21075r0)) {
            E[] eArr = this.f21074q0;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) new Object[e.b(i11, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i10);
                System.arraycopy(this.f21074q0, i10, eArr2, i10 + 1, this.f21075r0 - i10);
                this.f21074q0 = eArr2;
            }
            this.f21074q0[i10] = e5;
            this.f21075r0++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbC = o1.c("Index:", i10, ", Size:");
        sbC.append(this.f21075r0);
        throw new IndexOutOfBoundsException(sbC.toString());
    }
}
