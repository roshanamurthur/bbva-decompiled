package com.mypinpad.tsdk.isolation;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;

/* JADX INFO: loaded from: classes10.dex */
public final class bbi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54433a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54434b = 1;

    public static class a extends ObjectInputStream {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final HashSet f54435r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f54436s0 = 0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f54437t0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Class f54438p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f54439q0;

        static {
            HashSet hashSet = new HashSet();
            f54435r0 = hashSet;
            androidx.constraintlayout.core.parser.a.d(hashSet, "java.util.TreeMap", "java.lang.Integer", "java.lang.Number", "org.bouncycastle.pqc.crypto.xmss.BDS");
            androidx.constraintlayout.core.parser.a.d(hashSet, "java.util.ArrayList", "org.bouncycastle.pqc.crypto.xmss.XMSSNode", "[B", "java.util.LinkedList");
            androidx.constraintlayout.core.parser.a.d(hashSet, "java.util.Stack", "java.util.Vector", "[Ljava.lang.Object;", "org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
            int i10 = f54437t0;
            int i11 = ((i10 | 125) << 1) - (i10 ^ 125);
            f54436s0 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 84 / 0;
            }
        }

        public a(Class cls, ByteArrayInputStream byteArrayInputStream) throws IOException {
            super(byteArrayInputStream);
            this.f54439q0 = false;
            this.f54438p0 = cls;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003d  */
        /* JADX WARN: Code duplicated, block: B:12:0x0051  */
        /* JADX WARN: Code duplicated, block: B:14:0x005b  */
        /* JADX WARN: Code duplicated, block: B:20:0x008a  */
        /* JADX WARN: Code duplicated, block: B:9:0x002d  */
        @Override // java.io.ObjectInputStream
        public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
            Object[] objArr = {this, objectStreamClass};
            System.identityHashCode(this);
            a aVar = (a) objArr[0];
            ObjectStreamClass objectStreamClass2 = (ObjectStreamClass) objArr[1];
            int i10 = f54436s0 + 35;
            f54437t0 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 34 / 0;
                if (aVar.f54439q0) {
                    if (!f54435r0.contains(objectStreamClass2.getName())) {
                        throw new InvalidClassException("unexpected class: ", objectStreamClass2.getName());
                    }
                } else {
                    if (objectStreamClass2.getName().equals(aVar.f54438p0.getName())) {
                        throw new InvalidClassException("unexpected class: ", objectStreamClass2.getName());
                    }
                    aVar.f54439q0 = true;
                    int i12 = f54437t0;
                    int i13 = i12 ^ 103;
                    int i14 = (i12 & 103) << 1;
                    int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                    f54436s0 = i15 % 128;
                    int i16 = i15 % 2;
                }
            } else if (aVar.f54439q0) {
                if (!f54435r0.contains(objectStreamClass2.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass2.getName());
                }
            } else {
                if (objectStreamClass2.getName().equals(aVar.f54438p0.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass2.getName());
                }
                aVar.f54439q0 = true;
                int i17 = f54437t0;
                int i18 = i17 ^ 103;
                int i19 = (i17 & 103) << 1;
                int i110 = (i18 ^ i19) + ((i19 & i18) << 1);
                f54436s0 = i110 % 128;
                int i111 = i110 % 2;
            }
            Class<?> clsResolveClass = super.resolveClass(objectStreamClass2);
            int i20 = f54436s0;
            int i21 = ((i20 ^ 37) | (i20 & 37)) << 1;
            int i22 = -(((~i20) & 37) | (i20 & (-38)));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            f54437t0 = i23 % 128;
            if (i23 % 2 == 0) {
                int i24 = 62 / 0;
            }
            return clsResolveClass;
        }
    }

    public static /* synthetic */ Object a(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int i10 = f54434b;
        int i11 = ((i10 ^ 90) + ((i10 & 90) << 1)) - 1;
        f54433a = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int i12 = f54434b;
        int i13 = i12 & 101;
        int i14 = (i13 - (~(-(-((i12 ^ 101) | i13))))) - 1;
        f54433a = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 87 / 0;
        }
        return bArr2;
    }

    public static /* synthetic */ Integer b(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int i10 = f54434b;
        int i11 = ((i10 | 126) << 1) - (i10 ^ 126);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f54433a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = 0;
        while (true) {
            iIntValue >>= 1;
            if (iIntValue == 0) {
                break;
            }
            int i15 = f54434b;
            int i16 = (i15 & (-18)) | ((~i15) & 17);
            int i17 = -(-((17 & i15) << 1));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            int i19 = i18 % 128;
            f54433a = i19;
            int i20 = i18 % 2;
            i14++;
            int i21 = i19 + 19;
            f54434b = i21 % 128;
            int i22 = i21 % 2;
        }
        int i23 = f54434b;
        int i24 = i23 & 105;
        int i25 = ((i23 ^ 105) | i24) << 1;
        int i26 = -((i23 | 105) & (~i24));
        int i27 = (i25 & i26) + (i26 | i25);
        f54433a = i27 % 128;
        if (i27 % 2 == 0) {
            return Integer.valueOf(i14);
        }
        int i28 = 17 / 0;
        return Integer.valueOf(i14);
    }

    public static /* synthetic */ Long c(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f54433a;
        int i11 = (i10 & (-22)) | ((~i10) & 21);
        int i12 = -(-((i10 & 21) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        f54434b = i14;
        int i15 = i13 % 2;
        long j10 = jLongValue >> iIntValue;
        int i16 = i14 ^ 85;
        int i17 = ((((i14 & 85) | i16) << 1) - (~(-i16))) - 1;
        f54433a = i17 % 128;
        if (i17 % 2 == 0) {
            return Long.valueOf(j10);
        }
        throw null;
    }

    public static /* synthetic */ Object d(Object[] objArr) {
        byte[][] bArr = (byte[][]) objArr[0];
        int i10 = f54434b;
        int i11 = i10 & 37;
        int i12 = -(-(i10 | 37));
        int i13 = (i11 & i12) + (i12 | i11);
        f54433a = i13 % 128;
        int i14 = i13 % 2;
        if (((Boolean) setOnFocusChangeListener(new Object[]{bArr}, -1436239977, 1436239985, (int) System.currentTimeMillis())).booleanValue()) {
            throw new NullPointerException("in has null pointers");
        }
        byte[][] bArr2 = new byte[bArr.length][];
        int i15 = f54433a;
        int i16 = i15 ^ 73;
        int i17 = (i15 & 73) << 1;
        int i18 = (i16 & i17) + (i17 | i16);
        f54434b = i18 % 128;
        int i19 = i18 % 2;
        int i20 = 0;
        while (i20 < bArr.length) {
            int i21 = f54434b;
            int i22 = (i21 ^ 23) + ((i21 & 23) << 1);
            f54433a = i22 % 128;
            int i23 = i22 % 2;
            byte[] bArr3 = new byte[bArr[i20].length];
            bArr2[i20] = bArr3;
            byte[] bArr4 = bArr[i20];
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            int i24 = ((i20 | (-60)) << 1) - (i20 ^ (-60));
            i20 = (i24 & 61) + (i24 | 61);
            int i25 = f54434b;
            int i26 = i25 & 3;
            int i27 = i26 + ((i25 ^ 3) | i26);
            f54433a = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = f54433a;
        int i30 = i29 ^ 3;
        int i31 = ((i29 & 3) | i30) << 1;
        int i32 = -i30;
        int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
        f54434b = i33 % 128;
        if (i33 % 2 != 0) {
            return bArr2;
        }
        throw null;
    }

    public static /* synthetic */ void e(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i10 = f54433a;
        int i11 = i10 + 41;
        f54434b = i11 % 128;
        int i12 = i11 % 2;
        if (bArr2 == null) {
            throw new NullPointerException("src == null");
        }
        if (iIntValue < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        int length = bArr2.length;
        int i13 = (length * 971) + (iIntValue * (-1939));
        int i14 = ~length;
        int i15 = ~((i14 ^ iIntValue) | (i14 & iIntValue));
        int i16 = ~iIntValue;
        int i17 = i16 & i14;
        int i18 = ((~i16) & length) | i17;
        int i19 = i16 & length;
        int i20 = (i18 & i19) | (i18 ^ i19);
        int i21 = ~i20;
        int i22 = (i20 | i21) & i21;
        int i23 = i15 ^ i22;
        int i24 = i15 & i22;
        int i25 = -(-(((i23 & i24) | (i23 ^ i24)) * (-970)));
        int i26 = ((i13 | i25) << 1) - (i13 ^ i25);
        int i27 = -(~(i21 * 1940));
        int i28 = ((i26 & i27) + (i27 | i26)) - 1;
        int i29 = (i14 | i16) & (~i17);
        int i30 = ~((i29 & i17) | (i29 ^ i17));
        int i31 = ~((length ^ i16) | i19);
        int i32 = ((~i31) & i30) | ((~i30) & i31);
        int i33 = i31 & i30;
        int i34 = ((i33 & i32) | (i32 ^ i33)) * 970;
        if ((i28 ^ i34) + ((i34 & i28) << 1) > bArr.length) {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
        int i35 = i10 + 31;
        f54434b = i35 % 128;
        int i36 = i35 % 2;
        int i37 = 0;
        while (i37 < bArr2.length) {
            int i38 = f54434b + 15;
            f54433a = i38 % 128;
            if (i38 % 2 != 0) {
                bArr[iIntValue >>> i37] = bArr2[i37];
                i37 = ((i37 & 121) + (i37 | 121)) - 1;
            } else {
                int i39 = iIntValue & i37;
                bArr[(i39 - (~((iIntValue ^ i37) | i39))) - 1] = bArr2[i37];
                int i40 = i37 & 1;
                int i41 = (i37 | 1) & (~i40);
                int i42 = i40 << 1;
                i37 = (i41 & i42) + (i41 | i42);
            }
        }
        int i43 = f54434b;
        int i44 = (i43 | 39) << 1;
        int i45 = -(i43 ^ 39);
        int i46 = (i44 & i45) + (i45 | i44);
        f54433a = i46 % 128;
        if (i46 % 2 != 0) {
            int i47 = 22 / 0;
        }
    }

    public static /* synthetic */ Object f(Object[] objArr) throws ClassNotFoundException, IOException {
        byte[] bArr = (byte[]) objArr[0];
        Class cls = (Class) objArr[1];
        a aVar = new a(cls, new ByteArrayInputStream(bArr));
        Object object = aVar.readObject();
        if (aVar.available() != 0) {
            throw new IOException("unexpected data found at end of ObjectInputStream");
        }
        if (!cls.isInstance(object)) {
            throw new IOException("unexpected class found in ObjectInputStream");
        }
        int i10 = f54433a + 126;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        int i12 = i11 % 128;
        f54434b = i12;
        if (i11 % 2 == 0) {
            int i13 = 41 / 0;
        }
        int i14 = (i12 ^ 7) + ((i12 & 7) << 1);
        f54433a = i14 % 128;
        if (i14 % 2 == 0) {
            return object;
        }
        throw null;
    }

    public static /* synthetic */ Object g(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i10 = f54433a;
        int i11 = i10 & 27;
        int i12 = (~i11) & (i10 | 27);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f54434b = i14 % 128;
        int i15 = i14 % 2;
        if (bArr == null) {
            throw new NullPointerException("src == null");
        }
        if (iIntValue < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (iIntValue2 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        }
        int i16 = iIntValue2 * 881;
        int i17 = -(~(-(-(iIntValue * 881))));
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        int i19 = (i18 ^ (-1)) + (i18 << 1);
        int i20 = ~iIntValue2;
        int i21 = ~iIntValue;
        int i22 = i20 & i21;
        int i23 = (~i22) & (i20 | i21);
        int i24 = ~((i22 & i23) | (i23 ^ i22));
        int i25 = ~iIntValue2;
        int i26 = i25 & iIntValue;
        int i27 = ((i25 | iIntValue) & (~i26)) | i26;
        int i28 = (i27 | (~i27)) & (~i27);
        int i29 = i24 & i28;
        int i30 = (i24 | i28) & (~i29);
        int i31 = (i30 & i29) | (i30 ^ i29);
        int i32 = ~(i21 | iIntValue);
        int i33 = -(~(-(-(((i31 & i32) | (i31 ^ i32)) * (-880)))));
        int i34 = ((-1) << 1) - (((i19 & i33) + (i19 | i33)) ^ (-1));
        int i35 = i20 ^ i21;
        int i36 = i20 & i21;
        int i37 = (i36 & i35) | (i35 ^ i36);
        int i38 = (i37 | (~i37)) & (~i37);
        int i39 = iIntValue & i38;
        int i40 = ((i38 | iIntValue) & (~i39)) | i39;
        int i41 = iIntValue2 ^ iIntValue;
        int i42 = iIntValue2 & iIntValue;
        int i43 = ~((i41 & i42) | (i41 ^ i42));
        int i44 = -(-(((i40 & i43) | (i40 ^ i43)) * (-880)));
        int i45 = i34 ^ i44;
        int i46 = (((i34 & i44) | i45) << 1) - i45;
        int i47 = (~i42) & (iIntValue2 | iIntValue);
        int i48 = -(-((~((i47 & i42) | (i47 ^ i42))) * 880));
        int i49 = i46 ^ i48;
        int i50 = ((i46 & i48) | i49) << 1;
        int i51 = -i49;
        if (((i50 | i51) << 1) - (i50 ^ i51) > bArr.length) {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
        byte[] bArr2 = new byte[iIntValue2];
        int i52 = i10 + 91;
        f54434b = i52 % 128;
        int i53 = i52 % 2;
        int i54 = 0;
        while (i54 < iIntValue2) {
            int i55 = f54434b;
            int i56 = i55 & 23;
            int i57 = ((((i55 ^ 23) | i56) << 1) - (~(-((~i56) & (i55 | 23))))) - 1;
            f54433a = i57 % 128;
            int i58 = i57 % 2;
            int i59 = i54 * (-167);
            int i60 = -(-(iIntValue * (-167)));
            int i61 = i59 & i60;
            int i62 = i61 + ((i59 ^ i60) | i61);
            int i63 = ~i54;
            int i64 = i63 & i21;
            int i65 = (~i64) & (i63 | i21);
            int i66 = ~((i64 & i65) | (i65 ^ i64));
            int i67 = ~iIntValue;
            int i68 = i67 & i21;
            int i69 = (i67 | i21) & (~i68);
            int i70 = ~((i69 & i68) | (i69 ^ i68));
            int i71 = i66 ^ i70;
            int i72 = i66 & i70;
            int i73 = ((i72 & i71) | (i71 ^ i72)) * 168;
            int i74 = ((((~i73) & i62) | ((~i62) & i73)) - (~((i73 & i62) << 1))) - 1;
            int i75 = i63 ^ i21;
            int i76 = i63 & i21;
            int i77 = (i75 & i76) | (i75 ^ i76);
            int i78 = -(-((~((i77 & iIntValue) | (i77 ^ iIntValue))) * 168));
            int i79 = i74 ^ i78;
            int i80 = (i78 & i74) << 1;
            int i81 = (i79 & i80) + (i80 | i79);
            int i82 = ~i54;
            int i83 = (~iIntValue) & (i21 | iIntValue);
            int i84 = i82 ^ i83;
            int i85 = i82 & i83;
            int i86 = ~((i85 & i84) | (i84 ^ i85));
            int i87 = ~(i63 | iIntValue);
            int i88 = ((~i87) & i86) | ((~i86) & i87);
            int i89 = i87 & i86;
            int i90 = (i89 & i88) | (i88 ^ i89);
            int i91 = i21 ^ i54;
            int i92 = i21 & i54;
            int i93 = (i91 & i92) | (i91 ^ i92);
            int i94 = i93 ^ iIntValue;
            int i95 = i93 & iIntValue;
            int i96 = (i95 & i94) | (i94 ^ i95);
            int i97 = (i96 | (~i96)) & (~i96);
            int i98 = i90 & i97;
            int i99 = (((i90 | i97) & (~i98)) | i98) * 168;
            int i100 = i81 ^ i99;
            int i101 = -(-((i99 & i81) << 1));
            bArr2[i54] = bArr[((i100 | i101) << 1) - (i101 ^ i100)];
            int i102 = i54 ^ 1;
            int i103 = -(-((i54 & 1) << 1));
            i54 = ((i103 & i102) << 1) + (i102 ^ i103);
            int i104 = i55 + 87;
            f54433a = i104 % 128;
            int i105 = i104 % 2;
        }
        int i106 = f54434b;
        int i107 = (i106 ^ 83) + ((i106 & 83) << 1);
        f54433a = i107 % 128;
        if (i107 % 2 != 0) {
            int i108 = 40 / 0;
        }
        return bArr2;
    }

    public static long setCompoundDrawableTintBlendMode(long j10, int i10) {
        return ((Long) setOnFocusChangeListener(new Object[]{Long.valueOf(j10), Integer.valueOf(i10)}, -1482845641, 1482845646, i10)).longValue();
    }

    public static boolean setDividerPadding(long j10, int i10, int i11) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{Long.valueOf(j10), Integer.valueOf(i10), Integer.valueOf(i11)}, -1485478524, 1485478535, i10)).booleanValue();
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int i13;
        int i14;
        Object objValueOf;
        int y7;
        int i15;
        byte[] bArr;
        int i16 = ~i10;
        int i17 = ~i11;
        int i18 = ~(i16 | i17);
        int i19 = i16 | (~i12);
        int i20 = (((~(i10 | i17)) | (~(i11 | i19))) * 241) + ((i10 | i11) * (-482)) + ((i18 | (~i19)) * (-241)) + (i11 * 242) + (i10 * 483);
        long j10 = 0;
        int i21 = 0;
        switch (i20) {
            case 1:
                e(objArr);
                return null;
            case 2:
                return b(objArr);
            case 3:
                return g(objArr);
            case 4:
                return f(objArr);
            case 5:
                return c(objArr);
            case 6:
                long jLongValue = ((Number) objArr[0]).longValue();
                int iIntValue = ((Number) objArr[1]).intValue();
                int i22 = f54433a;
                int i23 = (i22 | 69) << 1;
                int i24 = -(((~i22) & 69) | (i22 & (-70)));
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                int i26 = i25 % 128;
                f54434b = i26;
                int i27 = i25 % 2;
                int i28 = (int) (jLongValue & ((1 << iIntValue) - 1));
                int i29 = (i26 & (-72)) | ((~i26) & 71);
                int i30 = (i26 & 71) << 1;
                int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
                f54433a = i31 % 128;
                int i32 = i31 % 2;
                return Integer.valueOf(i28);
            case 7:
                int iIntValue2 = ((Number) objArr[0]).intValue();
                int iIntValue3 = ((Number) objArr[1]).intValue();
                int i33 = f54434b;
                int i34 = ((i33 ^ 8) + ((i33 & 8) << 1)) - 1;
                f54433a = i34 % 128;
                if (i34 % 2 != 0) {
                    i13 = 1;
                    i14 = 1;
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                while (i13 < iIntValue3) {
                    int i35 = f54434b;
                    int i36 = ((i35 ^ 35) | (i35 & 35)) << 1;
                    int i37 = -((i35 & (-36)) | ((~i35) & 35));
                    int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
                    f54433a = i38 % 128;
                    if (i38 % 2 != 0 || ((iIntValue2 >> i13) & 1) == 0) {
                        int i39 = (i35 ^ 105) + ((i35 & 105) << 1);
                        f54433a = i39 % 128;
                        int i40 = i39 % 2;
                        i14 = i13;
                        int i41 = f54434b;
                        int i42 = (i41 & (-66)) | ((~i41) & 65);
                        int i43 = (i41 & 65) << 1;
                        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                        f54433a = i44 % 128;
                        int i45 = i44 % 2;
                        return Integer.valueOf(i14);
                    }
                    i13 = ((i13 | 1) << 1) - (i13 ^ 1);
                    int i46 = i35 & 23;
                    int i47 = -(-((i35 ^ 23) | i46));
                    int i48 = (i46 & i47) + (i47 | i46);
                    f54433a = i48 % 128;
                    int i49 = i48 % 2;
                }
                int i410 = f54434b;
                int i411 = (i410 & (-66)) | ((~i410) & 65);
                int i412 = (i410 & 65) << 1;
                int i413 = ((i411 | i412) << 1) - (i412 ^ i411);
                f54433a = i413 % 128;
                int i414 = i413 % 2;
                return Integer.valueOf(i14);
            case 8:
                byte[][] bArr2 = (byte[][]) objArr[0];
                int i50 = f54433a;
                int i51 = ((i50 | 27) << 1) - (i50 ^ 27);
                int i52 = i51 % 128;
                f54434b = i52;
                int i53 = i51 % 2;
                if (bArr2 != null) {
                    int i54 = ((i52 | 43) << 1) - (i52 ^ 43);
                    f54433a = i54 % 128;
                    int i55 = i54 % 2;
                    int i56 = 0;
                    while (true) {
                        if (i56 >= bArr2.length) {
                            int i57 = f54434b;
                            int i58 = i57 & 95;
                            int i59 = ((i57 | 95) & (~i58)) + (i58 << 1);
                            f54433a = i59 % 128;
                            int i60 = i59 % 2;
                            objValueOf = Boolean.FALSE;
                            break;
                        } else {
                            int i61 = f54434b;
                            int i62 = i61 & 63;
                            int i63 = (((i61 ^ 63) | i62) << 1) - ((~i62) & (i61 | 63));
                            f54433a = i63 % 128;
                            int i64 = i63 % 2;
                            if (bArr2[i56] == null) {
                                int i65 = i61 & 65;
                                int i66 = -(-((i61 ^ 65) | i65));
                                int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                                int i68 = i67 % 128;
                                f54433a = i68;
                                int i69 = i67 % 2;
                                int i70 = (i68 | 53) << 1;
                                int i71 = -(i68 ^ 53);
                                int i72 = (i70 & i71) + (i71 | i70);
                                f54434b = i72 % 128;
                                int i73 = i72 % 2;
                            } else {
                                i56 = (((i56 ^ 1) | (i56 & 1)) << 1) - ((i56 & (-2)) | ((~i56) & 1));
                                int i74 = (-2) - ((((i61 | 108) << 1) - (i61 ^ 108)) ^ (-1));
                                f54433a = i74 % 128;
                                int i75 = i74 % 2;
                            }
                        }
                    }
                } else {
                    int i76 = (i52 & 59) + (i52 | 59);
                    f54433a = i76 % 128;
                    int i77 = i76 % 2;
                    int i78 = i52 + 99;
                    f54433a = i78 % 128;
                    int i79 = i78 % 2;
                }
                objValueOf = Boolean.TRUE;
                break;
            case 9:
                return a(objArr);
            case 10:
                return d(objArr);
            case 11:
                long jLongValue2 = ((Number) objArr[0]).longValue();
                int iIntValue4 = ((Number) objArr[1]).intValue();
                int iIntValue5 = ((Number) objArr[2]).intValue();
                int i80 = f54434b;
                int i81 = i80 ^ 105;
                int i82 = (i80 & 105) << 1;
                int i83 = (i81 & i82) + (i81 | i82);
                f54433a = i83 % 128;
                int i84 = i83 % 2;
                if (jLongValue2 != 0) {
                    double d2 = 1 << iIntValue4;
                    int i85 = iIntValue5 * 334;
                    int i86 = (-665) & i85;
                    int i87 = (i86 - (~(-(-((i85 ^ (-665)) | i86))))) - 1;
                    int i88 = i87 ^ 666;
                    int i89 = ((((i87 & 666) | i88) << 1) - (~(-i88))) - 1;
                    int i90 = ~iIntValue4;
                    int i91 = (-2) & i90;
                    int i92 = ~(i91 | ((~i91) & ((-2) | i90)));
                    int i93 = iIntValue5 ^ iIntValue4;
                    int i94 = iIntValue5 & iIntValue4;
                    int i95 = ~((i93 ^ i94) | (i93 & i94));
                    int i96 = i92 ^ i95;
                    int i97 = i92 & i95;
                    int i98 = -(~(-(-(((i96 & i97) | (i96 ^ i97)) * 333))));
                    int i99 = ((i89 & i98) + (i98 | i89)) - 1;
                    int i100 = ~((iIntValue4 & (-2)) | ((-2) ^ iIntValue4));
                    int i101 = ((~iIntValue5) & i90) | ((~i90) & iIntValue5);
                    int i102 = i90 & iIntValue5;
                    int i103 = ~((i101 & i102) | (i101 ^ i102));
                    int i104 = i100 ^ i103;
                    int i105 = i100 & i103;
                    int i106 = ((i105 & i104) | (i104 ^ i105)) * 333;
                    int i107 = i99 & i106;
                    if (jLongValue2 % ((long) Math.pow(d2, ((i106 | i99) & (~i107)) + (i107 << 1))) != 0) {
                        int i108 = f54433a;
                        int i109 = (i108 | 75) << 1;
                        int i110 = -(((~i108) & 75) | (i108 & (-76)));
                        int i111 = (i109 & i110) + (i110 | i109);
                        f54434b = i111 % 128;
                        if (i111 % 2 == 0) {
                            int i112 = 27 / 0;
                        }
                        objValueOf = Boolean.FALSE;
                    } else {
                        int i113 = f54434b;
                        int i114 = (i113 & 107) + (i113 | 107);
                        int i115 = i114 % 128;
                        f54433a = i115;
                        int i116 = i114 % 2;
                        int i117 = (i115 & (-122)) | ((~i115) & 121);
                        int i118 = (i115 & 121) << 1;
                        int i119 = (i117 ^ i118) + ((i118 & i117) << 1);
                        f54434b = i119 % 128;
                        if (i119 % 2 == 0) {
                            throw null;
                        }
                        objValueOf = Boolean.TRUE;
                    }
                } else {
                    int i120 = i80 + 63;
                    f54433a = i120 % 128;
                    objValueOf = Boolean.valueOf(i120 % 2 != 0);
                }
                break;
            case 12:
                byte[] bArr3 = (byte[]) objArr[0];
                int iIntValue6 = ((Number) objArr[1]).intValue();
                int i121 = f54433a;
                int i122 = (i121 & (-126)) | ((~i121) & 125);
                int i123 = -(-((i121 & 125) << 1));
                int i124 = (i122 ^ i123) + ((i123 & i122) << 1);
                int i125 = i124 % 128;
                f54434b = i125;
                if (i124 % 2 == 0) {
                    throw null;
                }
                if (bArr3 == null) {
                    throw new NullPointerException("in == null");
                }
                int i126 = i125 & 67;
                int i127 = -(-(i125 | 67));
                int i128 = (i126 ^ i127) + ((i127 & i126) << 1);
                f54433a = i128 % 128;
                int i129 = i128 % 2;
                while (i21 < iIntValue6) {
                    int i130 = f54433a;
                    int i131 = ((i130 | 30) << 1) - (i130 ^ 30);
                    int i132 = (i131 ^ (-1)) + (i131 << 1);
                    f54434b = i132 % 128;
                    int i133 = i132 % 2;
                    j10 = (j10 << 8) | ((long) (bArr3[i21] & 255));
                    int i134 = ((i21 | (-42)) << 1) - (i21 ^ (-42));
                    i21 = (i134 & 43) + (i134 | 43);
                    int i135 = (i130 & 89) + (i130 | 89);
                    f54434b = i135 % 128;
                    int i136 = i135 % 2;
                }
                int i137 = f54433a + 27;
                f54434b = i137 % 128;
                int i138 = i137 % 2;
                return Long.valueOf(j10);
            case 13:
                aky akyVar = (aky) objArr[0];
                int i139 = f54433a;
                int i140 = (i139 ^ 17) + ((i139 & 17) << 1);
                f54434b = i140 % 128;
                int i141 = i140 % 2;
                if (akyVar == null) {
                    throw new NullPointerException("digest == null");
                }
                String x4 = akyVar.setX();
                if (x4.equals("SHAKE128")) {
                    int i142 = f54434b;
                    int i143 = i142 + 119;
                    f54433a = i143 % 128;
                    int i144 = i143 % 2;
                    int i145 = i142 & 39;
                    int i146 = (i142 | 39) & (~i145);
                    int i147 = i145 << 1;
                    int i148 = (i146 & i147) + (i146 | i147);
                    f54433a = i148 % 128;
                    if (i148 % 2 != 0) {
                        throw null;
                    }
                    y7 = 32;
                } else if (x4.equals("SHAKE256")) {
                    int i149 = f54434b;
                    int i150 = i149 & 89;
                    int i151 = (i149 ^ 89) | i150;
                    int i152 = (i150 ^ i151) + ((i151 & i150) << 1);
                    int i153 = i152 % 128;
                    f54433a = i153;
                    int i154 = i152 % 2;
                    int i155 = i153 & 13;
                    int i156 = (i155 - (~(-(-((i153 ^ 13) | i155))))) - 1;
                    f54434b = i156 % 128;
                    y7 = 64;
                    if (i156 % 2 == 0) {
                        int i157 = 78 / 0;
                    }
                } else {
                    y7 = akyVar.setY();
                    int i158 = f54433a + 107;
                    f54434b = i158 % 128;
                    if (i158 % 2 == 0) {
                        throw null;
                    }
                }
                objValueOf = Integer.valueOf(y7);
                break;
                break;
            case 14:
                long jLongValue3 = ((Number) objArr[0]).longValue();
                int iIntValue7 = ((Number) objArr[1]).intValue();
                int iIntValue8 = ((Number) objArr[2]).intValue();
                int i159 = f54434b;
                int i160 = ((i159 & 110) + (i159 | 110)) - 1;
                int i161 = i160 % 128;
                f54433a = i161;
                int i162 = i160 % 2;
                if (jLongValue3 == 0) {
                    int i163 = (i161 | 63) << 1;
                    int i164 = -(i161 ^ 63);
                    int i165 = (i163 ^ i164) + ((i163 & i164) << 1);
                    f54434b = i165 % 128;
                    objValueOf = Boolean.valueOf(!(i165 % 2 != 0));
                } else if ((jLongValue3 + 1) % ((long) Math.pow(1 << iIntValue7, iIntValue8)) == 0) {
                    int i166 = f54434b + 15;
                    int i167 = i166 % 128;
                    f54433a = i167;
                    int i168 = i166 % 2;
                    int i169 = i167 & 13;
                    int i170 = -(-(i167 | 13));
                    int i171 = ((i169 | i170) << 1) - (i169 ^ i170);
                    f54434b = i171 % 128;
                    int i172 = i171 % 2;
                    objValueOf = Boolean.TRUE;
                } else {
                    int i173 = f54434b;
                    int i174 = (((i173 ^ 47) | (i173 & 47)) << 1) - (((~i173) & 47) | (i173 & (-48)));
                    f54433a = i174 % 128;
                    if (i174 % 2 != 0) {
                        throw null;
                    }
                    objValueOf = Boolean.FALSE;
                }
                break;
            case 15:
                Object obj = objArr[0];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(obj);
                objectOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int i175 = f54434b;
                int i176 = i175 & 45;
                int i177 = (i175 ^ 45) | i176;
                int i178 = ((i176 | i177) << 1) - (i177 ^ i176);
                f54433a = i178 % 128;
                int i179 = i178 % 2;
                return byteArray;
            case 16:
                int iIntValue9 = ((Number) objArr[0]).intValue();
                long jLongValue4 = ((Number) objArr[1]).longValue();
                int i180 = f54434b;
                int i181 = (i180 & 113) + (i180 | 113);
                int i182 = i181 % 128;
                f54433a = i182;
                if (i181 % 2 == 0 ? jLongValue4 < 0 : jLongValue4 < 1) {
                    throw new IllegalStateException("index must not be negative");
                }
                if (jLongValue4 >= (1 << iIntValue9)) {
                    int i183 = i180 & 107;
                    int i184 = i183 + ((i180 ^ 107) | i183);
                    f54433a = i184 % 128;
                    int i185 = i184 % 2;
                    objValueOf = Boolean.FALSE;
                } else {
                    int i186 = i182 & 13;
                    int i187 = -(-((i182 ^ 13) | i186));
                    int i188 = (i186 & i187) + (i186 | i187);
                    int i189 = i188 % 128;
                    f54434b = i189;
                    boolean z10 = i188 % 2 != 0;
                    int i190 = ((i189 | 35) << 1) - (i189 ^ 35);
                    f54433a = i190 % 128;
                    int i191 = i190 % 2;
                    objValueOf = Boolean.valueOf(z10);
                }
                break;
            default:
                long jLongValue5 = ((Number) objArr[0]).longValue();
                int iIntValue10 = ((Number) objArr[1]).intValue();
                int i192 = f54434b;
                int i193 = (i192 ^ 33) + ((i192 & 33) << 1);
                int i194 = i193 % 128;
                f54433a = i194;
                if (i193 % 2 != 0) {
                    bArr = new byte[iIntValue10];
                    int i195 = (-2) - ((((iIntValue10 | 94) << 1) - (iIntValue10 ^ 94)) ^ (-1));
                    i15 = ((i195 ^ (-25)) + ((i195 & (-25)) << 1)) - 1;
                } else {
                    byte[] bArr4 = new byte[iIntValue10];
                    i15 = iIntValue10 - 1;
                    bArr = bArr4;
                }
                int i196 = i194 + 107;
                while (true) {
                    f54434b = i196 % 128;
                    int i197 = i196 % 2;
                    if (i15 < 0) {
                        int i198 = f54434b + 117;
                        f54433a = i198 % 128;
                        int i199 = i198 % 2;
                        return bArr;
                    }
                    int i200 = f54434b;
                    int i201 = (((i200 & (-66)) | ((~i200) & 65)) - (~((i200 & 65) << 1))) - 1;
                    int i202 = i201 % 128;
                    f54433a = i202;
                    int i203 = i201 % 2;
                    bArr[i15] = (byte) jLongValue5;
                    jLongValue5 >>>= 8;
                    int i204 = ~i15;
                    int i205 = i15 << 1;
                    i15 = (i205 | i204) + (i204 & i205);
                    i196 = ((i202 | 71) << 1) - (i202 ^ 71);
                }
                break;
        }
        return objValueOf;
    }

    public static byte[] setX(Object obj) throws IOException {
        return (byte[]) setOnFocusChangeListener(new Object[]{obj}, 258321496, -258321481, (int) System.currentTimeMillis());
    }

    public static byte[] setY(byte[] bArr, int i10, int i11) {
        return (byte[]) setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, 427617211, -427617208, i10);
    }

    public static byte[] setCompoundDrawableTintBlendMode(byte[] bArr) {
        return (byte[]) setOnFocusChangeListener(new Object[]{bArr}, -759448087, 759448096, (int) System.currentTimeMillis());
    }

    public static Object setDividerPadding(byte[] bArr, Class cls) throws IOException, ClassNotFoundException {
        return setOnFocusChangeListener(new Object[]{bArr, cls}, -145577911, 145577915, (int) System.currentTimeMillis());
    }

    public static int setX(aky akyVar) {
        return ((Integer) setOnFocusChangeListener(new Object[]{akyVar}, 1100642384, -1100642371, (int) System.currentTimeMillis())).intValue();
    }

    public static void setY(byte[] bArr, byte[] bArr2, int i10) throws IOException {
        setOnFocusChangeListener(new Object[]{bArr, bArr2, Integer.valueOf(i10)}, -2011745549, 2011745550, i10);
    }

    public static long setCompoundDrawableTintBlendMode(byte[] bArr, int i10) {
        return ((Long) setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i10)}, 1947653658, -1947653646, i10)).longValue();
    }

    public static int setDividerPadding(long j10, int i10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Long.valueOf(j10), Integer.valueOf(i10)}, 281444677, -281444671, i10)).intValue();
    }

    public static byte[] setX(long j10, int i10) {
        return (byte[]) setOnFocusChangeListener(new Object[]{Long.valueOf(j10), Integer.valueOf(i10)}, 450291415, -450291415, i10);
    }

    public static int setY(int i10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10)}, -641546869, 641546871, i10)).intValue();
    }

    public static boolean setDividerPadding(byte[][] bArr) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{bArr}, -1436239977, 1436239985, (int) System.currentTimeMillis())).booleanValue();
    }

    public static boolean setOnFocusChangeListener(long j10, int i10, int i11) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{Long.valueOf(j10), Integer.valueOf(i10), Integer.valueOf(i11)}, 1596777573, -1596777559, i10)).booleanValue();
    }

    public static int setOnFocusChangeListener(int i10, int i11) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}, -1556004709, 1556004716, i10)).intValue();
    }

    public static boolean setOnFocusChangeListener(int i10, long j10) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), Long.valueOf(j10)}, -1829337202, 1829337218, i10)).booleanValue();
    }

    public static byte[][] setOnFocusChangeListener(byte[][] bArr) {
        return (byte[][]) setOnFocusChangeListener(new Object[]{bArr}, 9598254, -9598244, (int) System.currentTimeMillis());
    }
}
