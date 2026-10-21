package com.google.crypto.tink.shaded.protobuf;

import androidx.appcompat.widget.o1;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: BooleanArrayList.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d extends a<Boolean> implements Internal.BooleanList, RandomAccess, k0 {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final d f47187s0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean[] f47188q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f47189r0;

    static {
        d dVar = new d(new boolean[0], 0);
        f47187s0 = dVar;
        dVar.makeImmutable();
    }

    public d() {
        this(new boolean[10], 0);
    }

    public final void a(int i10) {
        if (i10 < 0 || i10 >= this.f47189r0) {
            StringBuilder sbC = o1.c("Index:", i10, ", Size:");
            sbC.append(this.f47189r0);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ensureIsMutable();
        if (i10 < 0 || i10 > (i11 = this.f47189r0)) {
            StringBuilder sbC = o1.c("Index:", i10, ", Size:");
            sbC.append(this.f47189r0);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        boolean[] zArr = this.f47188q0;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[androidx.datastore.preferences.protobuf.e.b(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f47188q0, i10, zArr2, i10 + 1, this.f47189r0 - i10);
            this.f47188q0 = zArr2;
        }
        this.f47188q0[i10] = zBooleanValue;
        this.f47189r0++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        ensureIsMutable();
        Charset charset = Internal.f47106a;
        collection.getClass();
        if (!(collection instanceof d)) {
            return super.addAll(collection);
        }
        d dVar = (d) collection;
        int i10 = dVar.f47189r0;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f47189r0;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f47188q0;
        if (i12 > zArr.length) {
            this.f47188q0 = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(dVar.f47188q0, 0, this.f47188q0, this.f47189r0, dVar.f47189r0);
        this.f47189r0 = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public final void addBoolean(boolean z10) {
        ensureIsMutable();
        int i10 = this.f47189r0;
        boolean[] zArr = this.f47188q0;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[androidx.datastore.preferences.protobuf.e.b(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f47188q0 = zArr2;
        }
        boolean[] zArr3 = this.f47188q0;
        int i11 = this.f47189r0;
        this.f47189r0 = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return super.equals(obj);
        }
        d dVar = (d) obj;
        if (this.f47189r0 != dVar.f47189r0) {
            return false;
        }
        boolean[] zArr = dVar.f47188q0;
        for (int i10 = 0; i10 < this.f47189r0; i10++) {
            if (this.f47188q0[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return Boolean.valueOf(getBoolean(i10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public final boolean getBoolean(int i10) {
        a(i10);
        return this.f47188q0[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashBoolean = 1;
        for (int i10 = 0; i10 < this.f47189r0; i10++) {
            iHashBoolean = (iHashBoolean * 31) + Internal.hashBoolean(this.f47188q0[i10]);
        }
        return iHashBoolean;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f47189r0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f47188q0[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        ensureIsMutable();
        a(i10);
        boolean[] zArr = this.f47188q0;
        boolean z10 = zArr[i10];
        int i11 = this.f47189r0;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f47189r0--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f47188q0;
        System.arraycopy(zArr, i11, zArr, i10, this.f47189r0 - i11);
        this.f47189r0 -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return Boolean.valueOf(setBoolean(i10, ((Boolean) obj).booleanValue()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public final boolean setBoolean(int i10, boolean z10) {
        ensureIsMutable();
        a(i10);
        boolean[] zArr = this.f47188q0;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47189r0;
    }

    public d(boolean[] zArr, int i10) {
        this.f47188q0 = zArr;
        this.f47189r0 = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: merged with bridge method [inline-methods] */
    public final Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f47189r0) {
            return new d(Arrays.copyOf(this.f47188q0, i10), this.f47189r0);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
