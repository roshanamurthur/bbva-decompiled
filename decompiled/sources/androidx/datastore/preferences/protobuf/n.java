package androidx.datastore.preferences.protobuf;

import androidx.appcompat.widget.o1;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: FloatArrayList.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends a<Float> implements Internal.FloatList, RandomAccess, i0 {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final n f21083s0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float[] f21084q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f21085r0;

    static {
        n nVar = new n(new float[0], 0);
        f21083s0 = nVar;
        nVar.makeImmutable();
    }

    public n() {
        this(new float[10], 0);
    }

    public final void a(int i10) {
        if (i10 < 0 || i10 >= this.f21085r0) {
            StringBuilder sbC = o1.c("Index:", i10, ", Size:");
            sbC.append(this.f21085r0);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        ensureIsMutable();
        if (i10 < 0 || i10 > (i11 = this.f21085r0)) {
            StringBuilder sbC = o1.c("Index:", i10, ", Size:");
            sbC.append(this.f21085r0);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        float[] fArr = this.f21084q0;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[e.b(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f21084q0, i10, fArr2, i10 + 1, this.f21085r0 - i10);
            this.f21084q0 = fArr2;
        }
        this.f21084q0[i10] = fFloatValue;
        this.f21085r0++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        ensureIsMutable();
        Charset charset = Internal.f20943a;
        collection.getClass();
        if (!(collection instanceof n)) {
            return super.addAll(collection);
        }
        n nVar = (n) collection;
        int i10 = nVar.f21085r0;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f21085r0;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f21084q0;
        if (i12 > fArr.length) {
            this.f21084q0 = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(nVar.f21084q0, 0, this.f21084q0, this.f21085r0, nVar.f21085r0);
        this.f21085r0 = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public final void addFloat(float f6) {
        ensureIsMutable();
        int i10 = this.f21085r0;
        float[] fArr = this.f21084q0;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[e.b(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f21084q0 = fArr2;
        }
        float[] fArr3 = this.f21084q0;
        int i11 = this.f21085r0;
        this.f21085r0 = i11 + 1;
        fArr3[i11] = f6;
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return super.equals(obj);
        }
        n nVar = (n) obj;
        if (this.f21085r0 != nVar.f21085r0) {
            return false;
        }
        float[] fArr = nVar.f21084q0;
        for (int i10 = 0; i10 < this.f21085r0; i10++) {
            if (Float.floatToIntBits(this.f21084q0[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return Float.valueOf(getFloat(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public final float getFloat(int i10) {
        a(i10);
        return this.f21084q0[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f21085r0; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f21084q0[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        ensureIsMutable();
        for (int i10 = 0; i10 < this.f21085r0; i10++) {
            if (obj.equals(Float.valueOf(this.f21084q0[i10]))) {
                float[] fArr = this.f21084q0;
                System.arraycopy(fArr, i10 + 1, fArr, i10, (this.f21085r0 - i10) - 1);
                this.f21085r0--;
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
        float[] fArr = this.f21084q0;
        System.arraycopy(fArr, i11, fArr, i10, this.f21085r0 - i11);
        this.f21085r0 -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return Float.valueOf(setFloat(i10, ((Float) obj).floatValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public final float setFloat(int i10, float f6) {
        ensureIsMutable();
        a(i10);
        float[] fArr = this.f21084q0;
        float f10 = fArr[i10];
        fArr[i10] = f6;
        return f10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21085r0;
    }

    public n(float[] fArr, int i10) {
        this.f21084q0 = fArr;
        this.f21085r0 = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Float> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f21085r0) {
            return new n(Arrays.copyOf(this.f21084q0, i10), this.f21085r0);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        ensureIsMutable();
        a(i10);
        float[] fArr = this.f21084q0;
        float f6 = fArr[i10];
        int i11 = this.f21085r0;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f21085r0--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f6);
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
