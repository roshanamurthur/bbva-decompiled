package com.google.crypto.tink.shaded.protobuf;

import androidx.appcompat.widget.o1;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: IntArrayList.java */
/* JADX INFO: loaded from: classes10.dex */
public final class n extends a<Integer> implements Internal.IntList, RandomAccess, k0 {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final n f47241s0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int[] f47242q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f47243r0;

    static {
        n nVar = new n(new int[0], 0);
        f47241s0 = nVar;
        nVar.makeImmutable();
    }

    public n() {
        this(new int[10], 0);
    }

    public final void a(int i10) {
        if (i10 < 0 || i10 >= this.f47243r0) {
            StringBuilder sbC = o1.c("Index:", i10, ", Size:");
            sbC.append(this.f47243r0);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        ensureIsMutable();
        if (i10 < 0 || i10 > (i11 = this.f47243r0)) {
            StringBuilder sbC = o1.c("Index:", i10, ", Size:");
            sbC.append(this.f47243r0);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        int[] iArr = this.f47242q0;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[androidx.datastore.preferences.protobuf.e.b(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f47242q0, i10, iArr2, i10 + 1, this.f47243r0 - i10);
            this.f47242q0 = iArr2;
        }
        this.f47242q0[i10] = iIntValue;
        this.f47243r0++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        Charset charset = Internal.f47106a;
        collection.getClass();
        if (!(collection instanceof n)) {
            return super.addAll(collection);
        }
        n nVar = (n) collection;
        int i10 = nVar.f47243r0;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f47243r0;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f47242q0;
        if (i12 > iArr.length) {
            this.f47242q0 = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(nVar.f47242q0, 0, this.f47242q0, this.f47243r0, nVar.f47243r0);
        this.f47243r0 = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.IntList
    public final void addInt(int i10) {
        ensureIsMutable();
        int i11 = this.f47243r0;
        int[] iArr = this.f47242q0;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[androidx.datastore.preferences.protobuf.e.b(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f47242q0 = iArr2;
        }
        int[] iArr3 = this.f47242q0;
        int i12 = this.f47243r0;
        this.f47243r0 = i12 + 1;
        iArr3[i12] = i10;
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
        if (!(obj instanceof n)) {
            return super.equals(obj);
        }
        n nVar = (n) obj;
        if (this.f47243r0 != nVar.f47243r0) {
            return false;
        }
        int[] iArr = nVar.f47242q0;
        for (int i10 = 0; i10 < this.f47243r0; i10++) {
            if (this.f47242q0[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.IntList
    public final int getInt(int i10) {
        a(i10);
        return this.f47242q0[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f47243r0; i11++) {
            i10 = (i10 * 31) + this.f47242q0[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f47243r0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f47242q0[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        ensureIsMutable();
        a(i10);
        int[] iArr = this.f47242q0;
        int i11 = iArr[i10];
        int i12 = this.f47243r0;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f47243r0--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f47242q0;
        System.arraycopy(iArr, i11, iArr, i10, this.f47243r0 - i11);
        this.f47243r0 -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return Integer.valueOf(setInt(i10, ((Integer) obj).intValue()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.IntList
    public final int setInt(int i10, int i11) {
        ensureIsMutable();
        a(i10);
        int[] iArr = this.f47242q0;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47243r0;
    }

    public n(int[] iArr, int i10) {
        this.f47242q0 = iArr;
        this.f47243r0 = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f47243r0) {
            return new n(Arrays.copyOf(this.f47242q0, i10), this.f47243r0);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
