package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.room.TypeConverter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class Data {
    public static final Data EMPTY;

    @SuppressLint({"MinMaxConstant"})
    public static final int MAX_DATA_BYTES = 10240;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f24288a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f24289a = new HashMap();

        @NonNull
        public Data build() throws Throwable {
            Data data = new Data(this.f24289a);
            Data.toByteArrayInternal(data);
            return data;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder put(@NonNull String str, @Nullable Object obj) {
            HashMap map = this.f24289a;
            if (obj == null) {
                map.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    map.put(str, obj);
                } else if (cls == boolean[].class) {
                    map.put(str, Data.convertPrimitiveBooleanArray((boolean[]) obj));
                } else if (cls == byte[].class) {
                    map.put(str, Data.convertPrimitiveByteArray((byte[]) obj));
                } else if (cls == int[].class) {
                    map.put(str, Data.convertPrimitiveIntArray((int[]) obj));
                } else if (cls == long[].class) {
                    map.put(str, Data.convertPrimitiveLongArray((long[]) obj));
                } else if (cls == float[].class) {
                    map.put(str, Data.convertPrimitiveFloatArray((float[]) obj));
                } else {
                    if (cls != double[].class) {
                        throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                    }
                    map.put(str, Data.convertPrimitiveDoubleArray((double[]) obj));
                }
            }
            return this;
        }

        @NonNull
        public Builder putAll(@NonNull Data data) {
            putAll(data.f24288a);
            return this;
        }

        @NonNull
        public Builder putBoolean(@NonNull String str, boolean z10) {
            this.f24289a.put(str, Boolean.valueOf(z10));
            return this;
        }

        @NonNull
        public Builder putBooleanArray(@NonNull String str, @NonNull boolean[] zArr) {
            this.f24289a.put(str, Data.convertPrimitiveBooleanArray(zArr));
            return this;
        }

        @NonNull
        public Builder putByte(@NonNull String str, byte b10) {
            this.f24289a.put(str, Byte.valueOf(b10));
            return this;
        }

        @NonNull
        public Builder putByteArray(@NonNull String str, @NonNull byte[] bArr) {
            this.f24289a.put(str, Data.convertPrimitiveByteArray(bArr));
            return this;
        }

        @NonNull
        public Builder putDouble(@NonNull String str, double d2) {
            this.f24289a.put(str, Double.valueOf(d2));
            return this;
        }

        @NonNull
        public Builder putDoubleArray(@NonNull String str, @NonNull double[] dArr) {
            this.f24289a.put(str, Data.convertPrimitiveDoubleArray(dArr));
            return this;
        }

        @NonNull
        public Builder putFloat(@NonNull String str, float f6) {
            this.f24289a.put(str, Float.valueOf(f6));
            return this;
        }

        @NonNull
        public Builder putFloatArray(@NonNull String str, @NonNull float[] fArr) {
            this.f24289a.put(str, Data.convertPrimitiveFloatArray(fArr));
            return this;
        }

        @NonNull
        public Builder putInt(@NonNull String str, int i10) {
            this.f24289a.put(str, Integer.valueOf(i10));
            return this;
        }

        @NonNull
        public Builder putIntArray(@NonNull String str, @NonNull int[] iArr) {
            this.f24289a.put(str, Data.convertPrimitiveIntArray(iArr));
            return this;
        }

        @NonNull
        public Builder putLong(@NonNull String str, long j10) {
            this.f24289a.put(str, Long.valueOf(j10));
            return this;
        }

        @NonNull
        public Builder putLongArray(@NonNull String str, @NonNull long[] jArr) {
            this.f24289a.put(str, Data.convertPrimitiveLongArray(jArr));
            return this;
        }

        @NonNull
        public Builder putString(@NonNull String str, @Nullable String str2) {
            this.f24289a.put(str, str2);
            return this;
        }

        @NonNull
        public Builder putStringArray(@NonNull String str, @NonNull String[] strArr) {
            this.f24289a.put(str, strArr);
            return this;
        }

        @NonNull
        public Builder putAll(@NonNull Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    static {
        Logger.tagWithPrefix("Data");
        EMPTY = new Builder().build();
    }

    public Data() {
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Boolean[] convertPrimitiveBooleanArray(@NonNull boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i10 = 0; i10 < zArr.length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Byte[] convertPrimitiveByteArray(@NonNull byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Double[] convertPrimitiveDoubleArray(@NonNull double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Float[] convertPrimitiveFloatArray(@NonNull float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Integer[] convertPrimitiveIntArray(@NonNull int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Long[] convertPrimitiveLongArray(@NonNull long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i10 = 0; i10 < jArr.length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean[] convertToPrimitiveArray(@NonNull Boolean[] boolArr) {
        boolean[] zArr = new boolean[boolArr.length];
        for (int i10 = 0; i10 < boolArr.length; i10++) {
            zArr[i10] = boolArr[i10].booleanValue();
        }
        return zArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x0030
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @androidx.annotation.NonNull
    @androidx.room.TypeConverter
    public static androidx.work.Data fromByteArray(@androidx.annotation.NonNull byte[] r5) {
        /*
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L4c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L40
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L40
            int r5 = r2.readInt()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
        L19:
            if (r5 <= 0) goto L2d
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            java.lang.Object r4 = r2.readObject()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            int r5 = r5 + (-1)
            goto L19
        L29:
            r5 = move-exception
            goto L37
        L2b:
            r5 = r2
            goto L40
        L2d:
            r2.close()     // Catch: java.io.IOException -> L30
        L30:
            r1.close()     // Catch: java.io.IOException -> L46
            goto L46
        L34:
            r0 = move-exception
            r2 = r5
            r5 = r0
        L37:
            if (r2 == 0) goto L3c
            r2.close()     // Catch: java.io.IOException -> L3c
        L3c:
            r1.close()     // Catch: java.io.IOException -> L3f
        L3f:
            throw r5
        L40:
            if (r5 == 0) goto L30
            r5.close()     // Catch: java.io.IOException -> L30
            goto L30
        L46:
            androidx.work.Data r5 = new androidx.work.Data
            r5.<init>(r0)
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.fromByteArray(byte[]):androidx.work.Data");
    }

    @NonNull
    @TypeConverter
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static byte[] toByteArrayInternal(@NonNull Data data) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(data.size());
                    for (Map.Entry entry : data.f24288a.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException unused3) {
                    objectOutputStream = objectOutputStream2;
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused5) {
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException unused7) {
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused8) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Data.class != obj.getClass()) {
            return false;
        }
        HashMap map = this.f24288a;
        Set<String> setKeySet = map.keySet();
        HashMap map2 = ((Data) obj).f24288a;
        if (!setKeySet.equals(map2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = map.get(str);
            Object obj3 = map2.get(str);
            if (obj2 == null || obj3 == null) {
                if (obj2 != obj3) {
                    return false;
                }
            } else {
                if (!(((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean getBoolean(@NonNull String str, boolean z10) {
        Object obj = this.f24288a.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z10;
    }

    @Nullable
    public boolean[] getBooleanArray(@NonNull String str) {
        Object obj = this.f24288a.get(str);
        if (obj instanceof Boolean[]) {
            return convertToPrimitiveArray((Boolean[]) obj);
        }
        return null;
    }

    public byte getByte(@NonNull String str, byte b10) {
        Object obj = this.f24288a.get(str);
        return obj instanceof Byte ? ((Byte) obj).byteValue() : b10;
    }

    @Nullable
    public byte[] getByteArray(@NonNull String str) {
        Object obj = this.f24288a.get(str);
        if (obj instanceof Byte[]) {
            return convertToPrimitiveArray((Byte[]) obj);
        }
        return null;
    }

    public double getDouble(@NonNull String str, double d2) {
        Object obj = this.f24288a.get(str);
        return obj instanceof Double ? ((Double) obj).doubleValue() : d2;
    }

    @Nullable
    public double[] getDoubleArray(@NonNull String str) {
        Object obj = this.f24288a.get(str);
        if (obj instanceof Double[]) {
            return convertToPrimitiveArray((Double[]) obj);
        }
        return null;
    }

    public float getFloat(@NonNull String str, float f6) {
        Object obj = this.f24288a.get(str);
        return obj instanceof Float ? ((Float) obj).floatValue() : f6;
    }

    @Nullable
    public float[] getFloatArray(@NonNull String str) {
        Object obj = this.f24288a.get(str);
        if (obj instanceof Float[]) {
            return convertToPrimitiveArray((Float[]) obj);
        }
        return null;
    }

    public int getInt(@NonNull String str, int i10) {
        Object obj = this.f24288a.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i10;
    }

    @Nullable
    public int[] getIntArray(@NonNull String str) {
        Object obj = this.f24288a.get(str);
        if (obj instanceof Integer[]) {
            return convertToPrimitiveArray((Integer[]) obj);
        }
        return null;
    }

    @NonNull
    public Map<String, Object> getKeyValueMap() {
        return Collections.unmodifiableMap(this.f24288a);
    }

    public long getLong(@NonNull String str, long j10) {
        Object obj = this.f24288a.get(str);
        return obj instanceof Long ? ((Long) obj).longValue() : j10;
    }

    @Nullable
    public long[] getLongArray(@NonNull String str) {
        Object obj = this.f24288a.get(str);
        if (obj instanceof Long[]) {
            return convertToPrimitiveArray((Long[]) obj);
        }
        return null;
    }

    @Nullable
    public String getString(@NonNull String str) {
        Object obj = this.f24288a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Nullable
    public String[] getStringArray(@NonNull String str) {
        Object obj = this.f24288a.get(str);
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return null;
    }

    public <T> boolean hasKeyWithValueOfType(@NonNull String str, @NonNull Class<T> cls) {
        Object obj = this.f24288a.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    public int hashCode() {
        return this.f24288a.hashCode() * 31;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public int size() {
        return this.f24288a.size();
    }

    @NonNull
    public byte[] toByteArray() {
        return toByteArrayInternal(this);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        HashMap map = this.f24288a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = map.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public Data(@NonNull Data data) {
        this.f24288a = new HashMap(data.f24288a);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Data(@NonNull Map<String, ?> map) {
        this.f24288a = new HashMap(map);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static byte[] convertToPrimitiveArray(@NonNull Byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = bArr[i10].byteValue();
        }
        return bArr2;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static int[] convertToPrimitiveArray(@NonNull Integer[] numArr) {
        int[] iArr = new int[numArr.length];
        for (int i10 = 0; i10 < numArr.length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static long[] convertToPrimitiveArray(@NonNull Long[] lArr) {
        long[] jArr = new long[lArr.length];
        for (int i10 = 0; i10 < lArr.length; i10++) {
            jArr[i10] = lArr[i10].longValue();
        }
        return jArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static float[] convertToPrimitiveArray(@NonNull Float[] fArr) {
        float[] fArr2 = new float[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr2[i10] = fArr[i10].floatValue();
        }
        return fArr2;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static double[] convertToPrimitiveArray(@NonNull Double[] dArr) {
        double[] dArr2 = new double[dArr.length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            dArr2[i10] = dArr[i10].doubleValue();
        }
        return dArr2;
    }
}
