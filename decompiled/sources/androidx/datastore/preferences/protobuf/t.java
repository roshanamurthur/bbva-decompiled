package androidx.datastore.preferences.protobuf;

import androidx.appcompat.widget.o1;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: LongArrayList.java */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends a<Long> implements Internal.LongList, RandomAccess, i0 {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final t f21142s0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public long[] f21143q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f21144r0;

    static {
        t tVar = new t(new long[0], 0);
        f21142s0 = tVar;
        tVar.makeImmutable();
    }

    public t() {
        this(new long[10], 0);
    }

    public final void a(int i10) {
        if (i10 < 0 || i10 >= this.f21144r0) {
            StringBuilder sbC = o1.c("Index:", i10, ", Size:");
            sbC.append(this.f21144r0);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        ensureIsMutable();
        if (i10 < 0 || i10 > (i11 = this.f21144r0)) {
            StringBuilder sbC = o1.c("Index:", i10, ", Size:");
            sbC.append(this.f21144r0);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        long[] jArr = this.f21143q0;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[e.b(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f21143q0, i10, jArr2, i10 + 1, this.f21144r0 - i10);
            this.f21143q0 = jArr2;
        }
        this.f21143q0[i10] = jLongValue;
        this.f21144r0++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        Charset charset = Internal.f20943a;
        collection.getClass();
        if (!(collection instanceof t)) {
            return super.addAll(collection);
        }
        t tVar = (t) collection;
        int i10 = tVar.f21144r0;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f21144r0;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f21143q0;
        if (i12 > jArr.length) {
            this.f21143q0 = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(tVar.f21143q0, 0, this.f21143q0, this.f21144r0, tVar.f21144r0);
        this.f21144r0 = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public final void addLong(long j10) {
        ensureIsMutable();
        int i10 = this.f21144r0;
        long[] jArr = this.f21143q0;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[e.b(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f21143q0 = jArr2;
        }
        long[] jArr3 = this.f21143q0;
        int i11 = this.f21144r0;
        this.f21144r0 = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return super.equals(obj);
        }
        t tVar = (t) obj;
        if (this.f21144r0 != tVar.f21144r0) {
            return false;
        }
        long[] jArr = tVar.f21143q0;
        for (int i10 = 0; i10 < this.f21144r0; i10++) {
            if (this.f21143q0[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return Long.valueOf(getLong(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public final long getLong(int i10) {
        a(i10);
        return this.f21143q0[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashLong = 1;
        for (int i10 = 0; i10 < this.f21144r0; i10++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(this.f21143q0[i10]);
        }
        return iHashLong;
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        ensureIsMutable();
        for (int i10 = 0; i10 < this.f21144r0; i10++) {
            if (obj.equals(Long.valueOf(this.f21143q0[i10]))) {
                long[] jArr = this.f21143q0;
                System.arraycopy(jArr, i10 + 1, jArr, i10, (this.f21144r0 - i10) - 1);
                this.f21144r0--;
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
        long[] jArr = this.f21143q0;
        System.arraycopy(jArr, i11, jArr, i10, this.f21144r0 - i11);
        this.f21144r0 -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return Long.valueOf(setLong(i10, ((Long) obj).longValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public final long setLong(int i10, long j10) {
        ensureIsMutable();
        a(i10);
        long[] jArr = this.f21143q0;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21144r0;
    }

    public t(long[] jArr, int i10) {
        this.f21143q0 = jArr;
        this.f21144r0 = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f21144r0) {
            return new t(Arrays.copyOf(this.f21143q0, i10), this.f21144r0);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        ensureIsMutable();
        a(i10);
        long[] jArr = this.f21143q0;
        long j10 = jArr[i10];
        int i11 = this.f21144r0;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f21144r0--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
