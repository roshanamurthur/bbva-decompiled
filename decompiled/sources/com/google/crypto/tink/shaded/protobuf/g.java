package com.google.crypto.tink.shaded.protobuf;

import androidx.appcompat.widget.o1;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: DoubleArrayList.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g extends a<Double> implements Internal.DoubleList, RandomAccess, k0 {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final g f47220s0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public double[] f47221q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f47222r0;

    static {
        g gVar = new g(new double[0], 0);
        f47220s0 = gVar;
        gVar.makeImmutable();
    }

    public g() {
        this(new double[10], 0);
    }

    public final void a(int i10) {
        if (i10 < 0 || i10 >= this.f47222r0) {
            StringBuilder sbC = o1.c("Index:", i10, ", Size:");
            sbC.append(this.f47222r0);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        ensureIsMutable();
        if (i10 < 0 || i10 > (i11 = this.f47222r0)) {
            StringBuilder sbC = o1.c("Index:", i10, ", Size:");
            sbC.append(this.f47222r0);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        double[] dArr = this.f47221q0;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[androidx.datastore.preferences.protobuf.e.b(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f47221q0, i10, dArr2, i10 + 1, this.f47222r0 - i10);
            this.f47221q0 = dArr2;
        }
        this.f47221q0[i10] = dDoubleValue;
        this.f47222r0++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        Charset charset = Internal.f47106a;
        collection.getClass();
        if (!(collection instanceof g)) {
            return super.addAll(collection);
        }
        g gVar = (g) collection;
        int i10 = gVar.f47222r0;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f47222r0;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f47221q0;
        if (i12 > dArr.length) {
            this.f47221q0 = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(gVar.f47221q0, 0, this.f47221q0, this.f47222r0, gVar.f47222r0);
        this.f47222r0 = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.DoubleList
    public final void addDouble(double d2) {
        ensureIsMutable();
        int i10 = this.f47222r0;
        double[] dArr = this.f47221q0;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[androidx.datastore.preferences.protobuf.e.b(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f47221q0 = dArr2;
        }
        double[] dArr3 = this.f47221q0;
        int i11 = this.f47222r0;
        this.f47222r0 = i11 + 1;
        dArr3[i11] = d2;
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
        if (!(obj instanceof g)) {
            return super.equals(obj);
        }
        g gVar = (g) obj;
        if (this.f47222r0 != gVar.f47222r0) {
            return false;
        }
        double[] dArr = gVar.f47221q0;
        for (int i10 = 0; i10 < this.f47222r0; i10++) {
            if (Double.doubleToLongBits(this.f47221q0[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return Double.valueOf(getDouble(i10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.DoubleList
    public final double getDouble(int i10) {
        a(i10);
        return this.f47221q0[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashLong = 1;
        for (int i10 = 0; i10 < this.f47222r0; i10++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(Double.doubleToLongBits(this.f47221q0[i10]));
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f47222r0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f47221q0[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        ensureIsMutable();
        a(i10);
        double[] dArr = this.f47221q0;
        double d2 = dArr[i10];
        int i11 = this.f47222r0;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f47222r0--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f47221q0;
        System.arraycopy(dArr, i11, dArr, i10, this.f47222r0 - i11);
        this.f47222r0 -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return Double.valueOf(setDouble(i10, ((Double) obj).doubleValue()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.DoubleList
    public final double setDouble(int i10, double d2) {
        ensureIsMutable();
        a(i10);
        double[] dArr = this.f47221q0;
        double d3 = dArr[i10];
        dArr[i10] = d2;
        return d3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47222r0;
    }

    public g(double[] dArr, int i10) {
        this.f47221q0 = dArr;
        this.f47222r0 = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Double> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f47222r0) {
            return new g(Arrays.copyOf(this.f47221q0, i10), this.f47222r0);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
