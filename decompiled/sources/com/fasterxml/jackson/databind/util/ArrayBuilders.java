package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.HashSet;

/* JADX INFO: loaded from: classes9.dex */
public final class ArrayBuilders {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BooleanBuilder f43485a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuilder f43486b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ShortBuilder f43487c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IntBuilder f43488d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LongBuilder f43489e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FloatBuilder f43490f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DoubleBuilder f43491g = null;

    public static final class BooleanBuilder extends PrimitiveArrayBuilder<boolean[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final boolean[] _constructArray(int i10) {
            return new boolean[i10];
        }
    }

    public static final class ByteBuilder extends PrimitiveArrayBuilder<byte[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final byte[] _constructArray(int i10) {
            return new byte[i10];
        }
    }

    public static final class DoubleBuilder extends PrimitiveArrayBuilder<double[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final double[] _constructArray(int i10) {
            return new double[i10];
        }
    }

    public static final class FloatBuilder extends PrimitiveArrayBuilder<float[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final float[] _constructArray(int i10) {
            return new float[i10];
        }
    }

    public static final class IntBuilder extends PrimitiveArrayBuilder<int[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final int[] _constructArray(int i10) {
            return new int[i10];
        }
    }

    public static final class LongBuilder extends PrimitiveArrayBuilder<long[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final long[] _constructArray(int i10) {
            return new long[i10];
        }
    }

    public static final class ShortBuilder extends PrimitiveArrayBuilder<short[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final short[] _constructArray(int i10) {
            return new short[i10];
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f43492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f43493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f43494c;

        public a(Class cls, int i10, Object obj) {
            this.f43492a = cls;
            this.f43493b = i10;
            this.f43494c = obj;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!ClassUtil.hasClass(obj, this.f43492a)) {
                return false;
            }
            int length = Array.getLength(obj);
            int i10 = this.f43493b;
            if (length != i10) {
                return false;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj2 = Array.get(this.f43494c, i11);
                Object obj3 = Array.get(obj, i11);
                if (obj2 != obj3 && obj2 != null && !obj2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static <T> HashSet<T> arrayToSet(T[] tArr) {
        if (tArr == null) {
            return new HashSet<>();
        }
        HashSet<T> hashSet = new HashSet<>(tArr.length);
        for (T t10 : tArr) {
            hashSet.add(t10);
        }
        return hashSet;
    }

    public static Object getArrayComparator(Object obj) {
        return new a(obj.getClass(), Array.getLength(obj), obj);
    }

    public static <T> T[] insertInListNoDup(T[] tArr, T t10) {
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (tArr[i10] == t10) {
                if (i10 == 0) {
                    return tArr;
                }
                T[] tArr2 = (T[]) ((Object[]) androidx.collection.a.b(tArr, length));
                System.arraycopy(tArr, 0, tArr2, 1, i10);
                tArr2[0] = t10;
                int i11 = i10 + 1;
                int i12 = length - i11;
                if (i12 > 0) {
                    System.arraycopy(tArr, i11, tArr2, i11, i12);
                }
                return tArr2;
            }
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + 1));
        if (length > 0) {
            System.arraycopy(tArr, 0, tArr3, 1, length);
        }
        tArr3[0] = t10;
        return tArr3;
    }

    public BooleanBuilder getBooleanBuilder() {
        if (this.f43485a == null) {
            this.f43485a = new BooleanBuilder();
        }
        return this.f43485a;
    }

    public ByteBuilder getByteBuilder() {
        if (this.f43486b == null) {
            this.f43486b = new ByteBuilder();
        }
        return this.f43486b;
    }

    public DoubleBuilder getDoubleBuilder() {
        if (this.f43491g == null) {
            this.f43491g = new DoubleBuilder();
        }
        return this.f43491g;
    }

    public FloatBuilder getFloatBuilder() {
        if (this.f43490f == null) {
            this.f43490f = new FloatBuilder();
        }
        return this.f43490f;
    }

    public IntBuilder getIntBuilder() {
        if (this.f43488d == null) {
            this.f43488d = new IntBuilder();
        }
        return this.f43488d;
    }

    public LongBuilder getLongBuilder() {
        if (this.f43489e == null) {
            this.f43489e = new LongBuilder();
        }
        return this.f43489e;
    }

    public ShortBuilder getShortBuilder() {
        if (this.f43487c == null) {
            this.f43487c = new ShortBuilder();
        }
        return this.f43487c;
    }
}
