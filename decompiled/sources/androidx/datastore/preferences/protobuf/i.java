package androidx.datastore.preferences.protobuf;

import androidx.appcompat.widget.o1;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: DoubleArrayList.java */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends a<Double> implements Internal.DoubleList, RandomAccess, i0 {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final i f21066s0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public double[] f21067q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f21068r0;

    static {
        i iVar = new i(new double[0], 0);
        f21066s0 = iVar;
        iVar.makeImmutable();
    }

    public i() {
        this(new double[10], 0);
    }

    public final void a(int i10) {
        if (i10 < 0 || i10 >= this.f21068r0) {
            StringBuilder sbC = o1.c("Index:", i10, ", Size:");
            sbC.append(this.f21068r0);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        ensureIsMutable();
        if (i10 < 0 || i10 > (i11 = this.f21068r0)) {
            StringBuilder sbC = o1.c("Index:", i10, ", Size:");
            sbC.append(this.f21068r0);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        double[] dArr = this.f21067q0;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[e.b(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f21067q0, i10, dArr2, i10 + 1, this.f21068r0 - i10);
            this.f21067q0 = dArr2;
        }
        this.f21067q0[i10] = dDoubleValue;
        this.f21068r0++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        Charset charset = Internal.f20943a;
        collection.getClass();
        if (!(collection instanceof i)) {
            return super.addAll(collection);
        }
        i iVar = (i) collection;
        int i10 = iVar.f21068r0;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f21068r0;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f21067q0;
        if (i12 > dArr.length) {
            this.f21067q0 = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(iVar.f21067q0, 0, this.f21067q0, this.f21068r0, iVar.f21068r0);
        this.f21068r0 = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public final void addDouble(double d2) {
        ensureIsMutable();
        int i10 = this.f21068r0;
        double[] dArr = this.f21067q0;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[e.b(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f21067q0 = dArr2;
        }
        double[] dArr3 = this.f21067q0;
        int i11 = this.f21068r0;
        this.f21068r0 = i11 + 1;
        dArr3[i11] = d2;
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return super.equals(obj);
        }
        i iVar = (i) obj;
        if (this.f21068r0 != iVar.f21068r0) {
            return false;
        }
        double[] dArr = iVar.f21067q0;
        for (int i10 = 0; i10 < this.f21068r0; i10++) {
            if (Double.doubleToLongBits(this.f21067q0[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return Double.valueOf(getDouble(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public final double getDouble(int i10) {
        a(i10);
        return this.f21067q0[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashLong = 1;
        for (int i10 = 0; i10 < this.f21068r0; i10++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(Double.doubleToLongBits(this.f21067q0[i10]));
        }
        return iHashLong;
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        ensureIsMutable();
        for (int i10 = 0; i10 < this.f21068r0; i10++) {
            if (obj.equals(Double.valueOf(this.f21067q0[i10]))) {
                double[] dArr = this.f21067q0;
                System.arraycopy(dArr, i10 + 1, dArr, i10, (this.f21068r0 - i10) - 1);
                this.f21068r0--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f21067q0;
        System.arraycopy(dArr, i11, dArr, i10, this.f21068r0 - i11);
        this.f21068r0 -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return Double.valueOf(setDouble(i10, ((Double) obj).doubleValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public final double setDouble(int i10, double d2) {
        ensureIsMutable();
        a(i10);
        double[] dArr = this.f21067q0;
        double d3 = dArr[i10];
        dArr[i10] = d2;
        return d3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21068r0;
    }

    public i(double[] dArr, int i10) {
        this.f21067q0 = dArr;
        this.f21068r0 = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Double> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f21068r0) {
            return new i(Arrays.copyOf(this.f21067q0, i10), this.f21068r0);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        ensureIsMutable();
        a(i10);
        double[] dArr = this.f21067q0;
        double d2 = dArr[i10];
        int i11 = this.f21068r0;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f21068r0--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
