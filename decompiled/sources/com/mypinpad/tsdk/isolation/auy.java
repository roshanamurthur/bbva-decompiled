package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.esotericsoftware.asm.Opcodes;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class auy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53931a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53932b = 1;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0066, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        r12 = ((java.lang.Integer) setOnFocusChangeListener(new java.lang.Object[]{java.lang.Integer.valueOf(r1), r12, 1}, -668114120, 668114158, r1)).intValue();
        r0 = com.mypinpad.tsdk.isolation.auy.f53931a;
        r1 = (r0 & 96) + (r0 | 96);
        r0 = (r1 ^ (-1)) + (r1 << 1);
        com.mypinpad.tsdk.isolation.auy.f53932b = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0098, code lost:
    
        if ((r0 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009e, code lost:
    
        return java.lang.Integer.valueOf(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0041, code lost:
    
        if ((r6 >> 51) == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
    
        if ((r6 >>> 32) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0057, code lost:
    
        r12 = ((r5 | 117) << 1) - (r5 ^ 117);
        com.mypinpad.tsdk.isolation.auy.f53932b = r12 % 128;
        r12 = r12 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Integer A(java.lang.Object[] r12) {
        /*
            r0 = 0
            r1 = r12[r0]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = 1
            r3 = r12[r2]
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4 = 2
            r12 = r12[r4]
            int[] r12 = (int[]) r12
            int r5 = com.mypinpad.tsdk.isolation.auy.f53932b
            r6 = r5 & 37
            r5 = r5 | 37
            int r5 = -r5
            int r5 = -r5
            r7 = r6 | r5
            int r7 = r7 << r2
            r5 = r5 ^ r6
            int r7 = r7 - r5
            int r5 = r7 % 128
            com.mypinpad.tsdk.isolation.auy.f53931a = r5
            int r7 = r7 % r4
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r7 == 0) goto L44
            long r6 = (long) r3
            long r6 = r6 / r8
            r3 = r12[r0]
            long r10 = (long) r3
            long r10 = r10 / r8
            long r6 = r6 ^ r10
            int r3 = (int) r6
            r12[r0] = r3
            r3 = 51
            long r6 = r6 >> r3
            r8 = 1
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L67
            goto L57
        L44:
            long r6 = (long) r3
            long r6 = r6 & r8
            r3 = r12[r0]
            long r10 = (long) r3
            long r8 = r8 & r10
            long r6 = r6 + r8
            int r3 = (int) r6
            r12[r0] = r3
            r3 = 32
            long r6 = r6 >>> r3
            r8 = 0
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L67
        L57:
            r12 = r5 | 117(0x75, float:1.64E-43)
            int r12 = r12 << r2
            r1 = r5 ^ 117(0x75, float:1.64E-43)
            int r12 = r12 - r1
            int r1 = r12 % 128
            com.mypinpad.tsdk.isolation.auy.f53932b = r1
            int r12 = r12 % r4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            return r12
        L67:
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r3[r0] = r5
            r3[r2] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r3[r4] = r12
            r12 = -668114120(0xffffffffd82d6338, float:-7.625666E14)
            r0 = 668114158(0x27d29cee, float:5.8456852E-15)
            java.lang.Object r12 = setOnFocusChangeListener(r3, r12, r0, r1)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            int r0 = com.mypinpad.tsdk.isolation.auy.f53931a
            r1 = r0 & 96
            r0 = r0 | 96
            int r1 = r1 + r0
            r0 = r1 ^ (-1)
            int r1 = r1 << r2
            int r0 = r0 + r1
            int r1 = r0 % 128
            com.mypinpad.tsdk.isolation.auy.f53932b = r1
            int r0 = r0 % r4
            if (r0 == 0) goto L9f
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
        L9f:
            r12 = 0
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.auy.A(java.lang.Object[]):java.lang.Integer");
    }

    public static /* synthetic */ Object B(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int i10 = f53932b;
        int i11 = (i10 ^ 64) + ((i10 & 64) << 1);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f53931a = i12 % 128;
        int i13 = i12 % 2;
        long[] jArr = new long[iIntValue];
        int i14 = i10 & 31;
        int i15 = (i10 | 31) & (~i14);
        int i16 = i14 << 1;
        int i17 = (i15 & i16) + (i15 | i16);
        f53931a = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 26 / 0;
        }
        return jArr;
    }

    public static /* synthetic */ void a(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int i10 = f53932b;
        int i11 = i10 ^ 75;
        int i12 = ((i10 & 75) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 & i13) + (i13 | i12);
        f53931a = i14 % 128;
        int i15 = i14 % 2;
        int i16 = ((i10 ^ 5) | (i10 & 5)) << 1;
        int i17 = -(((~i10) & 5) | (i10 & (-6)));
        int i18 = (i16 & i17) + (i17 | i16);
        f53931a = i18 % 128;
        int i19 = i18 % 2;
        int i20 = 0;
        while (i20 < 17) {
            int i21 = f53931a;
            int i22 = ((i21 ^ 45) - (~((i21 & 45) << 1))) - 1;
            f53932b = i22 % 128;
            int i23 = i22 % 2;
            iArr[i20] = 0;
            i20 = (((i20 & (-2)) | ((~i20) & 1)) - (~(-(-((i20 & 1) << 1))))) - 1;
            int i24 = (-2) - ((((i21 | 104) << 1) - (i21 ^ 104)) ^ (-1));
            f53932b = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = f53932b;
        int i27 = ((i26 ^ 3) | (i26 & 3)) << 1;
        int i28 = -(((~i26) & 3) | (i26 & (-4)));
        int i29 = (i27 & i28) + (i28 | i27);
        f53931a = i29 % 128;
        if (i29 % 2 != 0) {
            int i30 = 56 / 0;
        }
    }

    public static /* synthetic */ Integer b(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int i10 = f53931a;
        int i11 = i10 + 29;
        f53932b = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 & 77;
        int i14 = (i10 | 77) & (~i13);
        int i15 = -(-(i13 << 1));
        int i16 = (i14 & i15) + (i14 | i15);
        f53932b = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 0;
        while (i18 < 16) {
            int i19 = f53931a;
            int i20 = (i19 | 51) << 1;
            int i21 = -(((~i19) & 51) | (i19 & (-52)));
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            f53932b = i22 % 128;
            int i23 = i22 % 2;
            int i24 = iArr[i18];
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i25 = -(-(i24 * 965));
            int i26 = (((-1927) ^ i25) - (~(-(-((i25 & (-1927)) << 1))))) - 1;
            int i27 = ~i24;
            int i28 = ~((i27 ^ iCurrentTimeMillis) | (i27 & iCurrentTimeMillis));
            int i29 = -(-(((i28 & (-2)) | ((~i28) & (-2)) | (i28 & 1)) * (-964)));
            int i30 = ((i26 ^ i29) | (i26 & i29)) << 1;
            int i31 = -((i29 & (~i26)) | ((~i29) & i26));
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            int i33 = ~iCurrentTimeMillis;
            int i34 = i27 & i33;
            int i35 = (i33 | i27) & (~i34);
            int i36 = ~((i35 & i34) | (i35 ^ i34));
            int i37 = i27 & 1;
            int i38 = (i27 | 1) & (~i37);
            int i39 = (i38 & i37) | (i38 ^ i37);
            int i40 = ~i39;
            int i41 = (i39 | i40) & i40;
            int i42 = i36 ^ i41;
            int i43 = i41 & i36;
            int i44 = ((i43 & i42) | (i42 ^ i43)) * (-964);
            int i45 = i32 & i44;
            int i46 = (i44 | i32) & (~i45);
            int i47 = i45 << 1;
            int i48 = (i46 ^ i47) + ((i46 & i47) << 1);
            iArr[i18] = i48;
            if (i48 != 0) {
                int i49 = f53932b;
                int i50 = ((i49 | 10) << 1) - (i49 ^ 10);
                int i51 = (i50 ^ (-1)) + (i50 << 1);
                f53931a = i51 % 128;
                int i52 = i51 % 2;
                int i53 = i49 ^ 25;
                int i54 = (i49 & 25) << 1;
                int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                f53931a = i55 % 128;
                if (i55 % 2 == 0) {
                    return 0;
                }
                throw null;
            }
            int i56 = (i18 & (-13)) + (i18 | (-13));
            int i57 = (i56 ^ (-1)) + (i56 << 1);
            int i58 = i57 & 15;
            i18 = ((i57 | 15) & (~i58)) + (i58 << 1);
            int i59 = f53931a;
            int i60 = i59 & 39;
            int i61 = (((i59 ^ 39) | i60) << 1) - ((i59 | 39) & (~i60));
            f53932b = i61 % 128;
            int i62 = i61 % 2;
        }
        int i63 = f53931a;
        int i64 = ((i63 | 7) << 1) - (i63 ^ 7);
        f53932b = i64 % 128;
        int i65 = i64 % 2;
        return 1;
    }

    public static /* synthetic */ Object c(Object[] objArr) {
        int i10 = 0;
        int iIntValue = ((Number) objArr[0]).intValue();
        BigInteger bigIntegerShiftRight = (BigInteger) objArr[1];
        int i11 = f53932b;
        int i12 = ((i11 | 61) << 1) - (i11 ^ 61);
        f53931a = i12 % 128;
        int i13 = i12 % 2;
        if (bigIntegerShiftRight.signum() >= 0) {
            int i14 = f53932b;
            int i15 = i14 & 29;
            int i16 = ((((i14 ^ 29) | i15) << 1) - (~(-((i14 | 29) & (~i15))))) - 1;
            f53931a = i16 % 128;
            if (i16 % 2 != 0) {
                bigIntegerShiftRight.bitLength();
                throw null;
            }
            if (bigIntegerShiftRight.bitLength() <= iIntValue) {
                int i17 = iIntValue & 63;
                int i18 = -(-((iIntValue ^ 63) | i17));
                int i19 = ((i17 ^ i18) + ((i18 & i17) << 1)) >> 6;
                long[] jArr = (long[]) setOnFocusChangeListener(new Object[]{Integer.valueOf(i19)}, 1783230509, -1783230493, i19);
                int i20 = f53931a;
                int i21 = ((-1) << 1) - (((i20 ^ 32) + ((i20 & 32) << 1)) ^ (-1));
                f53932b = i21 % 128;
                int i22 = i21 % 2;
                while (i10 < i19) {
                    int i23 = f53931a;
                    int i24 = (i23 | 43) << 1;
                    int i25 = -(((~i23) & 43) | (i23 & (-44)));
                    int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                    f53932b = i26 % 128;
                    int i27 = i26 % 2;
                    jArr[i10] = bigIntegerShiftRight.longValue();
                    bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(64);
                    int i28 = i10 + 2;
                    i10 = (i28 << 1) + (i28 ^ (-1));
                    int i29 = f53932b;
                    int i30 = i29 & 113;
                    int i31 = -(-((i29 ^ 113) | i30));
                    int i32 = (i30 & i31) + (i31 | i30);
                    f53931a = i32 % 128;
                    int i33 = i32 % 2;
                }
                int i34 = f53932b;
                int i35 = i34 & 107;
                int i36 = i35 + ((i34 ^ 107) | i35);
                f53931a = i36 % 128;
                int i37 = i36 % 2;
                return jArr;
            }
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ Integer d(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i10 = f53932b;
        int i11 = ((((i10 ^ 97) | (i10 & 97)) << 1) - (~(-(((~i10) & 97) | (i10 & (-98)))))) - 1;
        int i12 = i11 % 128;
        f53931a = i12;
        int i13 = i11 % 2;
        int i14 = (i12 | 23) << 1;
        int i15 = -(((~i12) & 23) | (i12 & (-24)));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        while (true) {
            f53932b = i16 % 128;
            int i17 = i16 % 2;
            if (iIntValue2 >= iIntValue) {
                int i18 = f53931a;
                int i19 = i18 & 123;
                int i20 = ((i18 | 123) & (~i19)) + (i19 << 1);
                f53932b = i20 % 128;
                int i21 = i20 % 2;
                return -1;
            }
            int i22 = f53931a;
            int i23 = (i22 & 5) << 1;
            int i24 = (i22 ^ 5) + i23;
            f53932b = i24 % 128;
            int i25 = i24 % 2;
            int i26 = iArr[iIntValue2];
            int i27 = (i26 * 192) + 381;
            int i28 = ((i27 << 1) - (~(-i27))) - 1;
            int i29 = ~((i26 ^ iIntValue) | (i26 & iIntValue));
            int i30 = ~i29;
            int i31 = ((i29 & i30) | (i30 ^ i29)) * Opcodes.ATHROW;
            int i32 = i28 ^ i31;
            int i33 = ((((i31 & i28) | i32) << 1) - (~(-i32))) - 1;
            int i34 = ~i26;
            int i35 = ~iIntValue;
            int i36 = i26 | (i35 & (i35 | iIntValue));
            int i37 = ~i36;
            int i38 = (i36 | i37) & i37;
            int i39 = i34 ^ i38;
            int i40 = i38 & i34;
            int i41 = -(~(-(-(((i40 & i39) | (i39 ^ i40)) * Opcodes.ATHROW))));
            int i42 = (i33 ^ i41) + ((i41 & i33) << 1);
            int i43 = (i42 ^ (-1)) + (i42 << 1);
            iArr[iIntValue2] = i43;
            if (i43 != -1) {
                int i44 = ((i22 & (-6)) | ((~i22) & 5)) + i23;
                int i45 = i44 % 128;
                f53932b = i45;
                int i46 = i44 % 2;
                int i47 = (i45 | 123) << 1;
                int i48 = -(i45 ^ 123);
                int i49 = (i47 ^ i48) + ((i47 & i48) << 1);
                f53931a = i49 % 128;
                if (i49 % 2 != 0) {
                    int i50 = 6 / 0;
                }
                return 0;
            }
            iIntValue2++;
            int i51 = i22 ^ 115;
            int i52 = -(-((i22 & 115) << 1));
            i16 = (i51 ^ i52) + ((i51 & i52) << 1);
        }
    }

    public static /* synthetic */ Integer e(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int i10 = 2;
        int[] iArr2 = (int[]) objArr[2];
        int i11 = f53931a;
        int i12 = (((i11 | 63) << 1) - (~(-(i11 ^ 63)))) - 1;
        int i13 = i12 % 128;
        f53932b = i13;
        int i14 = i12 % 2;
        int i15 = ((i13 & 83) - (~(-(-(i13 | 83))))) - 1;
        f53931a = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 0;
        while (i17 < iIntValue) {
            int i18 = f53931a;
            int i19 = (i18 ^ 35) + ((i18 & 35) << 1);
            int i20 = i19 % 128;
            f53932b = i20;
            int i21 = i19 % i10;
            int i22 = iArr[i17];
            int i23 = 568 - (~(-(-(i22 * 569))));
            int i24 = ~i22;
            int i25 = (-2) ^ i24;
            int i26 = (-2) & i24;
            int i27 = (i25 & i26) | (i25 ^ i26);
            int i28 = ~i27;
            int i29 = (i27 | i28) & i28;
            int i30 = ~iIntValue;
            int i31 = (i30 | iIntValue) & i30;
            int i32 = ~(((~i31) & (-2)) | (i31 & 1) | ((-2) & i31));
            int i33 = (i29 ^ i32) | (i29 & i32);
            int i34 = i24 & i31;
            int i35 = (~i34) & (i31 | i24);
            int i36 = ~((i35 & i34) | (i35 ^ i34));
            int i37 = ((~i36) & i33) | ((~i33) & i36);
            int i38 = i36 & i33;
            int i39 = -(-(((i38 & i37) | (i37 ^ i38)) * (-1136)));
            int i40 = ((i23 | i39) << 1) - (i39 ^ i23);
            int i41 = (-2) & iIntValue;
            int i42 = (~i41) & ((-2) | iIntValue);
            int i43 = ~((i41 & i42) | (i42 ^ i41));
            int i44 = i24 & iIntValue;
            int i45 = (~i44) & (i24 | iIntValue);
            int i46 = (i44 & i45) | (i45 ^ i44);
            int i47 = ~i46;
            int i48 = (i46 | i47) & i47;
            int i49 = i43 ^ i48;
            int i50 = i43 & i48;
            int i51 = (i50 & i49) | (i49 ^ i50);
            int i52 = (i30 & (-2)) | ((~i30) & 1);
            int i53 = i30 & 1;
            int i54 = (i52 & i53) | (i52 ^ i53);
            int i55 = i54 & i22;
            int i56 = (~i55) & (i54 | i22);
            int i57 = ~((i56 ^ i55) | (i55 & i56));
            int i58 = i51 & i57;
            int i59 = (i40 - (~(-(-((((i51 | i57) & (~i58)) | i58) * (-568)))))) - 1;
            int i60 = ~i54;
            int i61 = i60 & (i60 | i54);
            int i62 = ~((i30 ^ i22) | (i30 & i22));
            int i63 = i61 & i62;
            int i64 = ((i61 | i62) & (~i63)) | i63;
            int i65 = (i24 | i22) & i24;
            int i66 = (i65 & (-2)) | ((-2) ^ i65) | iIntValue;
            int i67 = ~i66;
            int i68 = (i66 | i67) & i67;
            int i69 = i64 & i68;
            int i70 = (i64 | i68) & (~i69);
            int i71 = -(-(((i70 & i69) | (i70 ^ i69)) * 568));
            int i72 = ((i59 | i71) << 1) - (i71 ^ i59);
            iArr2[i17] = i72;
            int i73 = i17 - 42;
            int i74 = i73 & 43;
            int i75 = ((i73 ^ 43) | i74) << 1;
            int i76 = -((i73 | 43) & (~i74));
            i17 = (i75 & i76) + (i75 | i76);
            if (i72 != 0) {
                while (i17 < iIntValue) {
                    int i77 = f53931a;
                    int i78 = i77 & 111;
                    int i79 = i77 | 111;
                    int i80 = (i78 ^ i79) + ((i79 & i78) << 1);
                    f53932b = i80 % 128;
                    if (i80 % 2 == 0) {
                        iArr2[i17] = iArr[i17];
                        int i81 = (i17 & (-59)) | ((~i17) & 58);
                        int i82 = -(-((i17 & 58) << 1));
                        i17 = ((i81 | i82) << 1) - (i81 ^ i82);
                    } else {
                        iArr2[i17] = iArr[i17];
                        i17 = (-96) - ((i17 + 96) ^ (-1));
                    }
                }
                int i83 = (-2) - ((f53932b + 40) ^ (-1));
                f53931a = i83 % 128;
                int i84 = i83 % 2;
                return 0;
            }
            int i85 = (i20 ^ 123) + ((i20 & 123) << 1);
            f53931a = i85 % 128;
            int i86 = i85 % 2;
            i10 = 2;
        }
        int i87 = f53931a + 126;
        int i88 = (i87 ^ (-1)) + (i87 << 1);
        f53932b = i88 % 128;
        if (i88 % 2 != 0) {
            return 1;
        }
        throw null;
    }

    public static /* synthetic */ Integer f(Object[] objArr) {
        int i10 = 0;
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int[] iArr2 = (int[]) objArr[2];
        int i11 = f53931a;
        int i12 = i11 & 53;
        int i13 = (i11 | 53) & (~i12);
        int i14 = i12 << 1;
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        int i16 = i15 % 128;
        f53932b = i16;
        int i17 = i15 % 2;
        int i18 = (i16 | 57) << 1;
        int i19 = -(i16 ^ 57);
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        f53931a = i20 % 128;
        int i21 = i20 % 2;
        long j10 = 0;
        while (i10 < iIntValue) {
            int i22 = f53931a;
            int i23 = i22 & 123;
            int i24 = (((i22 ^ 123) | i23) << 1) - ((i22 | 123) & (~i23));
            int i25 = i24 % 128;
            f53932b = i25;
            if (i24 % 2 == 0) {
                long j11 = j10 / ((((long) iArr[i10]) - 4294967295L) + (((long) iArr2[i10]) - 4294967295L));
                iArr2[i10] = (int) j11;
                j10 = j11 >> 85;
                i10 = (-2) - ((((((i10 ^ 154) | (i10 & 154)) << 1) - (~(-(((~i10) & 154) | (i10 & (-155)))))) - 43) ^ (-1));
            } else {
                long j12 = ((((long) iArr2[i10]) & 4294967295L) - (((long) iArr[i10]) & 4294967295L)) + j10;
                iArr2[i10] = (int) j12;
                j10 = j12 >> 32;
                i10++;
            }
            int i26 = i25 | 97;
            int i27 = ((i26 << 1) - (~(-((~(i25 & 97)) & i26)))) - 1;
            f53931a = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = (int) j10;
        int i30 = f53932b;
        int i31 = ((i30 & 122) + (i30 | 122)) - 1;
        f53931a = i31 % 128;
        if (i31 % 2 == 0) {
            return Integer.valueOf(i29);
        }
        throw null;
    }

    public static /* synthetic */ Integer g(Object[] objArr) {
        int i10;
        int[] iArr = (int[]) objArr[0];
        int i11 = f53932b;
        int i12 = i11 & 53;
        int i13 = i12 + ((i11 ^ 53) | i12);
        int i14 = i13 % 128;
        f53931a = i14;
        int i15 = i13 % 2;
        int i16 = (i14 | 87) << 1;
        int i17 = -(((~i14) & 87) | (i14 & (-88)));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        f53932b = i18 % 128;
        int i19 = i18 % 2;
        int i20 = 0;
        while (true) {
            if (i20 >= 16) {
                int i21 = f53932b;
                int i22 = i21 & 49;
                int i23 = (i21 ^ 49) | i22;
                int i24 = (i22 & i23) + (i23 | i22);
                f53931a = i24 % 128;
                if (i24 % 2 == 0) {
                    return -1;
                }
                throw null;
            }
            int i25 = f53932b;
            int i26 = i25 & 39;
            int i27 = (((i25 ^ 39) | i26) << 1) - ((~i26) & (i25 | 39));
            i10 = i27 % 128;
            f53931a = i10;
            if (i27 % 2 != 0) {
                int i28 = iArr[i20];
                int i29 = ((i28 << 1) - i28) - 1;
                iArr[i20] = i29;
                if (i29 != -1) {
                    break;
                }
                int i30 = i20 - 27;
                i20 = (i30 ^ (-1)) + (i30 << 1) + 29;
                int i31 = i25 & 63;
                int i32 = ((i25 ^ 63) | i31) << 1;
                int i33 = -((i25 | 63) & (~i31));
                int i34 = (i32 & i33) + (i33 | i32);
                f53931a = i34 % 128;
                int i35 = i34 % 2;
            } else {
                int i36 = iArr[i20] - 1;
                iArr[i20] = i36;
                if (i36 != -1) {
                    break;
                }
                int i37 = i20 - 27;
                i20 = (i37 ^ (-1)) + (i37 << 1) + 29;
                int i38 = i25 & 63;
                int i39 = ((i25 ^ 63) | i38) << 1;
                int i310 = -((i25 | 63) & (~i38));
                int i311 = (i39 & i310) + (i310 | i39);
                f53931a = i311 % 128;
                int i312 = i311 % 2;
            }
        }
        int i40 = i10 & 21;
        int i41 = i10 | 21;
        int i42 = ((i40 | i41) << 1) - (i40 ^ i41);
        f53932b = i42 % 128;
        return Integer.valueOf(i42 % 2 == 0 ? 1 : 0);
    }

    public static int getNavBarTitleString(int i10, int[] iArr, int[] iArr2) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, iArr2}, -188447753, 188447787, i10)).intValue();
    }

    public static /* synthetic */ Long h(Object[] objArr) {
        long j10;
        int i10;
        int i11 = 0;
        int iIntValue = ((Number) objArr[0]).intValue();
        long[] jArr = (long[]) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i12 = f53932b;
        int i13 = (-2) - ((i12 + 92) ^ (-1));
        f53931a = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i12 & 63;
        int i16 = -(-((i12 ^ 63) | i15));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        f53931a = i17 % 128;
        int i18 = i17 % 2;
        while (i11 < iIntValue) {
            int i19 = f53932b;
            int i20 = i19 & 33;
            int i21 = (i19 ^ 33) | i20;
            int i22 = (i20 & i21) + (i20 | i21);
            f53931a = i22 % 128;
            if (i22 % 2 != 0) {
                j10 = jArr[i11];
                jArr[i11] = (j10 << 11) % (jLongValue << 45);
                i10 = (i11 & 58) + (i11 | 58);
            } else {
                j10 = jArr[i11];
                jArr[i11] = (jLongValue >>> (-8)) | (j10 << 8);
                int i23 = i11 & 1;
                i10 = ((((i11 ^ 1) | i23) << 1) - (~(-((i11 | 1) & (~i23))))) - 1;
            }
            i11 = i10;
            jLongValue = j10;
            int i24 = i19 + 57;
            f53931a = i24 % 128;
            int i25 = i24 % 2;
        }
        long j11 = jLongValue >>> (-8);
        int i26 = f53932b;
        int i27 = i26 & 15;
        int i28 = (i26 | 15) & (~i27);
        int i29 = -(-(i27 << 1));
        int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
        f53931a = i30 % 128;
        if (i30 % 2 == 0) {
            return Long.valueOf(j11);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0098 A[LOOP:0: B:6:0x002c->B:23:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0082 A[SYNTHETIC] */
    public static /* synthetic */ Boolean i(Object[] objArr) {
        int i10;
        int i11;
        int i12;
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int[] iArr2 = (int[]) objArr[2];
        int i13 = f53932b;
        int i14 = (i13 ^ 49) + ((i13 & 49) << 1);
        f53931a = i14 % 128;
        int i15 = i14 % 2 != 0 ? iIntValue + 100 : ((iIntValue & 81) + (iIntValue | 81)) - 82;
        while (true) {
            if (i15 < 0) {
                int i16 = f53932b;
                int i17 = i16 & 57;
                int i18 = ((i16 ^ 57) | i17) << 1;
                int i19 = -((i16 | 57) & (~i17));
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                f53931a = i20 % 128;
                int i21 = i20 % 2;
                return Boolean.TRUE;
            }
            i10 = f53931a;
            int i22 = i10 + 35;
            f53932b = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = iArr[i15];
                i11 = ((~i23) & Integer.MIN_VALUE) | (i23 & Integer.MAX_VALUE);
                int i24 = iArr2[i15];
                int i25 = Integer.MAX_VALUE & i24;
                int i26 = Integer.MIN_VALUE & (~i24);
                i12 = (i25 & i26) | (i25 ^ i26);
                int i27 = 67 / 0;
                if (i11 < i12) {
                    break;
                }
                if (i11 > i12) {
                    int i28 = (((i10 ^ 61) | (i10 & 61)) << 1) - ((i10 & (-62)) | ((~i10) & 61));
                    f53932b = i28 % 128;
                    int i29 = i28 % 2;
                    return Boolean.TRUE;
                }
                int i30 = (((i15 | (-19)) << 1) - (i15 ^ (-19))) - 1;
                int i31 = (i30 & (-20)) | ((~i30) & 19);
                int i32 = (i30 & 19) << 1;
                i15 = (i31 | i32) + (i31 & i32);
                int i33 = i10 + 125;
                f53932b = i33 % 128;
                int i34 = i33 % 2;
            } else {
                int i35 = iArr[i15];
                int i36 = i35 & Integer.MIN_VALUE;
                i11 = ((i35 ^ Integer.MIN_VALUE) | i36) & (~i36);
                int i37 = iArr2[i15];
                int i38 = Integer.MAX_VALUE & i37;
                int i39 = Integer.MIN_VALUE & (~i37);
                i12 = (i38 & i39) | (i38 ^ i39);
                if (i11 < i12) {
                    break;
                }
                if (i11 > i12) {
                    int i210 = (((i10 ^ 61) | (i10 & 61)) << 1) - ((i10 & (-62)) | ((~i10) & 61));
                    f53932b = i210 % 128;
                    int i211 = i210 % 2;
                    return Boolean.TRUE;
                }
                int i310 = (((i15 | (-19)) << 1) - (i15 ^ (-19))) - 1;
                int i311 = (i310 & (-20)) | ((~i310) & 19);
                int i312 = (i310 & 19) << 1;
                i15 = (i311 | i312) + (i311 & i312);
                int i313 = i10 + 125;
                f53932b = i313 % 128;
                int i314 = i313 % 2;
            }
        }
        int i40 = i10 & 79;
        int i41 = (~i40) & (i10 | 79);
        int i42 = -(-(i40 << 1));
        int i43 = (i41 & i42) + (i42 | i41);
        f53932b = i43 % 128;
        if (i43 % 2 != 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    public static /* synthetic */ Integer j(Object[] objArr) {
        int i10;
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int[] iArr2 = (int[]) objArr[2];
        int i11 = f53931a;
        int i12 = i11 & 27;
        int i13 = i12 + ((i11 ^ 27) | i12);
        f53932b = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = iIntValue ^ (-9);
            int i15 = (iIntValue & (-9)) << 1;
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            i10 = (-2) - ((((i16 | 49) << 1) - (i16 ^ 49)) ^ (-1));
        } else {
            int i17 = ((iIntValue | (-122)) << 1) - (iIntValue ^ (-122));
            int i18 = i17 | 121;
            int i19 = i18 << 1;
            int i20 = -(i18 & (~(i17 & 121)));
            i10 = ((i20 & i19) << 1) + (i19 ^ i20);
        }
        int i21 = ((i11 ^ 1) | (i11 & 1)) << 1;
        int i22 = -(((~i11) & 1) | (i11 & (-2)));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        f53932b = i23 % 128;
        int i24 = i23 % 2;
        while (i10 >= 0) {
            int i25 = f53932b;
            int i26 = ((i25 ^ 54) + ((i25 & 54) << 1)) - 1;
            int i27 = i26 % 128;
            f53931a = i27;
            if (i26 % 2 != 0) {
                int i28 = iArr[i10];
                int i29 = iArr2[i10];
                throw null;
            }
            int i30 = iArr[i10];
            int i31 = (i30 | Integer.MIN_VALUE) & (~(i30 & Integer.MIN_VALUE));
            int i32 = iArr2[i10];
            int i33 = Integer.MAX_VALUE & i32;
            int i34 = Integer.MIN_VALUE & (~i32);
            int i35 = (i34 & i33) | (i33 ^ i34);
            if (i31 < i35) {
                int i36 = i25 & 113;
                int i37 = (i25 ^ 113) | i36;
                int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
                f53931a = i38 % 128;
                int i39 = i38 % 2;
                return -1;
            }
            if (i31 > i35) {
                int i40 = i27 & 39;
                int i41 = (i27 ^ 39) | i40;
                int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
                f53932b = i42 % 128;
                int i43 = i42 % 2;
                return 1;
            }
            int i44 = i10 + 68;
            int i45 = i44 & (-69);
            int i46 = -(-((i44 ^ (-69)) | i45));
            i10 = (i46 | i45) + (i45 & i46);
            int i47 = ((i27 & 7) - (~(-(-(i27 | 7))))) - 1;
            f53932b = i47 % 128;
            int i48 = i47 % 2;
        }
        int i49 = f53931a;
        int i50 = i49 & 43;
        int i51 = (i50 - (~(-(-((i49 ^ 43) | i50))))) - 1;
        f53932b = i51 % 128;
        if (i51 % 2 == 0) {
            int i52 = 69 / 0;
        }
        return 0;
    }

    public static /* synthetic */ Integer k(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i10 = f53932b;
        int i11 = i10 + 65;
        f53931a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = (i10 & 115) + (i10 | 115);
        while (true) {
            f53931a = i13 % 128;
            int i14 = i13 % 2;
            if (iIntValue2 >= iIntValue) {
                int i15 = f53931a;
                int i16 = (i15 & 30) + (i15 | 30);
                int i17 = (i16 ^ (-1)) + (i16 << 1);
                f53932b = i17 % 128;
                if (i17 % 2 != 0) {
                    return 1;
                }
                throw null;
            }
            int i18 = f53932b;
            int i19 = i18 + 3;
            f53931a = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = (-2) - (iArr[iIntValue2] ^ (-1));
                iArr[iIntValue2] = i20;
                if (i20 != 0) {
                    int i21 = (i18 & 5) + (i18 | 5);
                    f53931a = i21 % 128;
                    int i22 = i21 % 2;
                    return 0;
                }
                int i23 = iIntValue2 ^ (-105);
                int i24 = ((iIntValue2 & (-105)) | i23) << 1;
                int i25 = -i23;
                iIntValue2 = (((i24 | i25) << 1) - (i24 ^ i25)) + 106;
                i13 = ((((i18 ^ 83) | (i18 & 83)) << 1) - (~(-(((~i18) & 83) | (i18 & (-84)))))) - 1;
            } else {
                int i26 = iArr[iIntValue2];
                int i27 = (i26 ^ 1) + ((i26 & 1) << 1);
                iArr[iIntValue2] = i27;
                if (i27 != 0) {
                    int i28 = (i18 & 5) + (i18 | 5);
                    f53931a = i28 % 128;
                    int i29 = i28 % 2;
                    return 0;
                }
                int i210 = iIntValue2 ^ (-105);
                int i211 = ((iIntValue2 & (-105)) | i210) << 1;
                int i212 = -i210;
                iIntValue2 = (((i211 | i212) << 1) - (i211 ^ i212)) + 106;
                i13 = ((((i18 ^ 83) | (i18 & 83)) << 1) - (~(-(((~i18) & 83) | (i18 & (-84)))))) - 1;
            }
        }
    }

    public static /* synthetic */ Integer l(Object[] objArr) {
        int i10 = 0;
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int i11 = f53932b + 1;
        f53931a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        while (i10 < iIntValue) {
            int i14 = f53932b;
            int i15 = i14 & 61;
            int i16 = (((i14 ^ 61) | i15) << 1) - ((i14 | 61) & (~i15));
            f53931a = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = iArr[i10];
                int i18 = ((~i17) & i13) | ((~i13) & i17);
                int i19 = i13 & i17;
                i13 = (i19 & i18) | (i18 ^ i19);
                int i20 = i10 ^ 85;
                int i21 = ((i10 & 85) | i20) << 1;
                int i22 = -i20;
                int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
                i10 = (i23 & (-80)) + (i23 | (-80));
            } else {
                int i24 = iArr[i10];
                int i25 = i13 ^ i24;
                int i26 = i13 & i24;
                i13 = (i26 & i25) | (i25 ^ i26);
                int i27 = i10 & 1;
                int i28 = i10 | 1;
                i10 = ((i27 | i28) << 1) - (i28 ^ i27);
            }
        }
        int i29 = i13 >>> 1;
        int i30 = i13 & 1;
        int i31 = (i29 & i30) | (i29 ^ i30);
        int i32 = (((i31 << 1) - i31) - 1) >> 31;
        int i33 = f53931a;
        int i34 = i33 & 7;
        int i35 = i34 + ((i33 ^ 7) | i34);
        f53932b = i35 % 128;
        if (i35 % 2 != 0) {
            return Integer.valueOf(i32);
        }
        throw null;
    }

    public static /* synthetic */ Integer m(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i10 = f53931a;
        int i11 = ((i10 & (-50)) | ((~i10) & 49)) + ((i10 & 49) << 1);
        f53932b = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        while (iIntValue2 < iIntValue) {
            int i12 = f53931a;
            int i13 = (i12 & 126) + (i12 | 126);
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            int i15 = i14 % 128;
            f53932b = i15;
            int i16 = i14 % 2;
            int i17 = -(-(iIntValue2 * 832));
            int i18 = ~iIntValue2;
            int i19 = ~iIntValue;
            int i20 = i18 & i19;
            int i21 = ~(i20 | ((~i20) & (i18 | i19)));
            int i22 = iIntValue2 & iIntValue;
            int i23 = ((~i22) & (iIntValue2 | iIntValue)) | i22;
            int i24 = ~i23;
            int i25 = -(-((i21 | ((i23 | i24) & i24)) * (-831)));
            int i26 = (i17 & i25) + (i17 | i25);
            int i27 = i18 & iIntValue;
            int i28 = -(~((~(((~i27) & (i18 | iIntValue)) | i27)) * (-1662)));
            int i29 = ((i26 ^ i28) + ((i28 & i26) << 1)) - 1;
            int i30 = (i19 | iIntValue) & i19;
            int i31 = ~i30;
            int i32 = ~((i30 & i31) | (i31 ^ i30));
            int i33 = ~iIntValue;
            int i34 = (i32 & i33) | (i32 ^ i33);
            int i35 = i27 | (i19 & iIntValue2);
            int i36 = ~((i35 & i22) | (i35 ^ i22));
            int i37 = ((~i36) & i34) | ((~i34) & i36);
            int i38 = i36 & i34;
            int i39 = -(-(((i38 & i37) | (i37 ^ i38)) * 831));
            int i40 = ((~i39) & i29) | ((~i29) & i39);
            int i41 = -(-((i39 & i29) << 1));
            int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
            int i43 = iArr[i42];
            int i44 = (i43 ^ 2) + ((i43 & 2) << 1);
            int i45 = (i44 ^ (-1)) + (i44 << 1);
            iArr[i42] = i45;
            if (i45 != 0) {
                int i46 = (i15 & (-30)) | ((~i15) & 29);
                int i47 = -(-((i15 & 29) << 1));
                int i48 = (i46 & i47) + (i46 | i47);
                f53931a = i48 % 128;
                return Integer.valueOf(i48 % 2 != 0 ? 1 : 0);
            }
            iIntValue2 = ((iIntValue2 & 1) << 1) + ((iIntValue2 & (-2)) | (i18 & 1));
            int i49 = (i15 ^ 57) + ((i15 & 57) << 1);
            f53931a = i49 % 128;
            int i50 = i49 % 2;
        }
        int i51 = f53931a;
        int i52 = i51 & 101;
        int i53 = ((i51 ^ 101) | i52) << 1;
        int i54 = -((i51 | 101) & (~i52));
        int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
        f53932b = i55 % 128;
        int i56 = i55 % 2;
        return 1;
    }

    public static /* synthetic */ Boolean n(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int i10 = f53932b;
        int i11 = i10 ^ 3;
        int i12 = ((i10 & 3) | i11) << 1;
        int i13 = -i11;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        int i15 = i14 % 128;
        f53931a = i15;
        int i16 = i14 % 2 != 0 ? 1 : 0;
        int i17 = ((i15 | 21) << 1) - (i15 ^ 21);
        f53932b = i17 % 128;
        int i18 = i17 % 2;
        while (i16 < iIntValue) {
            int i19 = f53932b;
            int i20 = i19 + 15;
            int i21 = i20 % 128;
            f53931a = i21;
            int i22 = i20 % 2;
            if (iArr[i16] != 0) {
                int i23 = (-2) - (((i19 & 114) + (i19 | 114)) ^ (-1));
                int i24 = i23 % 128;
                f53931a = i24;
                boolean z10 = i23 % 2 != 0;
                int i25 = ((i24 | 83) << 1) - (i24 ^ 83);
                f53932b = i25 % 128;
                if (i25 % 2 != 0) {
                    return Boolean.valueOf(z10);
                }
                int i26 = 7 / 0;
                return Boolean.valueOf(z10);
            }
            i16 = (-2) - (((i16 ^ 2) + ((i16 & 2) << 1)) ^ (-1));
            int i27 = ((i21 & 102) + (i21 | 102)) - 1;
            f53932b = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = f53932b;
        int i30 = ((i29 | 107) << 1) - (i29 ^ 107);
        f53931a = i30 % 128;
        int i31 = i30 % 2;
        return Boolean.TRUE;
    }

    public static /* synthetic */ Integer o(Object[] objArr) {
        long j10;
        long j11;
        int i10 = 0;
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int[] iArr2 = (int[]) objArr[3];
        int[] iArr3 = (int[]) objArr[4];
        int i11 = f53931a;
        int i12 = i11 & 23;
        int i13 = (i12 - (~(-(-((i11 ^ 23) | i12))))) - 1;
        f53932b = i13 % 128;
        long j12 = 4294967295L;
        if (i13 % 2 == 0) {
            j10 = ((long) iIntValue) % 4294967295L;
            j11 = ((long) iIntValue2) | 4294967295L;
        } else {
            j10 = ((long) iIntValue) & 4294967295L;
            j11 = ((long) iIntValue2) & 4294967295L;
        }
        long j13 = 0;
        while (true) {
            int[] iArr4 = iArr;
            long j14 = ((((long) iArr2[i10]) & j12) * j11) + ((((long) iArr[i10]) & j12) * j10);
            int i14 = 12239 - (~(i10 * (-1527)));
            int i15 = ~iIntValue;
            int i16 = i15 ^ 16;
            int i17 = i15 & 16;
            int i18 = ~(i16 | i17);
            int i19 = i10 & i18;
            int[] iArr5 = iArr2;
            int i20 = -(-((((~i19) & (i18 | i10)) | i19) * 764));
            int i21 = i14 & i20;
            int i22 = (((i14 | i20) & (~i21)) - (~(i21 << 1))) - 1;
            int i23 = ~i10;
            int i24 = (-17) & i23;
            int i25 = i10 & 16;
            int i26 = i24 | i25;
            int i27 = (-17) & i10;
            int i28 = ~((i26 ^ i27) | (i26 & i27));
            long j15 = j10;
            int i29 = i15 & i10;
            int i30 = (~i29) & (i15 | i10);
            int i31 = ~((i30 ^ i29) | (i29 & i30));
            int i32 = i28 & i31;
            long j16 = j11;
            int i33 = (i31 | i28) & (~i32);
            int i34 = -(-(((i33 & i32) | (i33 ^ i32)) * (-1528)));
            int i35 = (i22 ^ i34) + ((i22 & i34) << 1);
            int i36 = (-17) ^ i10;
            int i37 = ~((i36 ^ i27) | (i36 & i27));
            int i38 = i23 & 16;
            int i39 = (~i38) & (i23 | 16);
            int i40 = (i39 & i38) | (i39 ^ i38);
            int i41 = ~i40;
            int i42 = i41 & (i41 | i40);
            int i43 = (i37 ^ i42) | (i37 & i42);
            int i44 = ~((i16 ^ i17) | (i16 & i17));
            int i45 = i43 ^ i44;
            int i46 = i43 & i44;
            int i47 = ((i45 & i46) | (i45 ^ i46)) * 764;
            int i48 = i35 & i47;
            int i49 = -(-((i47 ^ i35) | i48));
            long j17 = j14 + (((long) iArr3[(i48 ^ i49) + ((i49 & i48) << 1)]) & 4294967295L) + j13;
            int i50 = -(-(i10 * (-493)));
            int i51 = 7920 & i50;
            int i52 = -(-(i50 | 7920));
            int i53 = (i40 * (-988)) + (i51 & i52) + (i52 | i51);
            int i54 = i36 | i27;
            int i55 = -(-(((i54 & i15) | ((~i15) & i54) | ((~i54) & i15)) * 494));
            int i56 = i53 | i55;
            int i57 = i56 << 1;
            int i58 = -((~(i55 & i53)) & i56);
            int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
            int i60 = (-17) ^ i23;
            int i61 = ~((i60 & i24) | (i60 ^ i24));
            int i62 = i15 & (i15 | iIntValue);
            int i63 = i62 ^ i10;
            int i64 = i62 & i10;
            int i65 = ~((i64 & i63) | (i63 ^ i64));
            int i66 = i61 & i65;
            int i67 = (i61 | i65) & (~i66);
            int i68 = (i67 & i66) | (i67 ^ i66);
            int i69 = ~(i38 | i27 | i25);
            int i70 = ((~i69) & i68) | ((~i68) & i69);
            int i71 = i68 & i69;
            int i72 = ((i71 & i70) | (i70 ^ i71)) * 494;
            int i73 = i59 & i72;
            int i74 = (i72 | i59) & (~i73);
            int i75 = i73 << 1;
            iArr3[(i74 & i75) + (i74 | i75)] = (int) j17;
            j13 = j17 >>> 32;
            int i76 = (i10 ^ (-105)) + ((i10 & (-105)) << 1);
            i10 = (i76 ^ 106) + ((i76 & 106) << 1);
            if (i10 >= 16) {
                break;
            }
            iArr = iArr4;
            j12 = 4294967295L;
            iArr2 = iArr5;
            j10 = j15;
            j11 = j16;
        }
        int i77 = f53932b;
        int i78 = (((i77 | 82) << 1) - (i77 ^ 82)) - 1;
        int i79 = i78 % 128;
        f53931a = i79;
        int i80 = i78 % 2;
        int i81 = (int) j13;
        int i82 = i79 & 119;
        int i83 = (i82 - (~(-(-((i79 ^ 119) | i82))))) - 1;
        f53932b = i83 % 128;
        if (i83 % 2 != 0) {
            return Integer.valueOf(i81);
        }
        throw null;
    }

    public static /* synthetic */ Boolean p(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int[] iArr2 = (int[]) objArr[2];
        int i10 = f53931a + 63;
        int i11 = i10 % 128;
        f53932b = i11;
        int i12 = i10 % 2;
        int i13 = ~iIntValue;
        int i14 = -(-(iIntValue << 1));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        int i16 = (i11 & (-76)) | ((~i11) & 75);
        int i17 = (i11 & 75) << 1;
        int i18 = (i16 & i17) + (i16 | i17);
        f53931a = i18 % 128;
        int i19 = i18 % 2;
        while (i15 >= 0) {
            int i20 = f53931a;
            int i21 = i20 + 19;
            int i22 = i21 % 128;
            f53932b = i22;
            int i23 = i21 % 2;
            if (iArr[i15] != iArr2[i15]) {
                int i24 = i20 & 33;
                int i25 = i24 + ((i20 ^ 33) | i24);
                int i26 = i25 % 128;
                f53932b = i26;
                int i27 = i25 % 2;
                int i28 = i26 & 113;
                int i29 = (i26 | 113) & (~i28);
                int i30 = i28 << 1;
                int i31 = (i29 & i30) + (i30 | i29);
                f53931a = i31 % 128;
                int i32 = i31 % 2;
                return Boolean.FALSE;
            }
            i15--;
            int i33 = (i22 ^ 29) + ((i22 & 29) << 1);
            f53931a = i33 % 128;
            int i34 = i33 % 2;
        }
        int i35 = f53932b;
        int i36 = ((i35 | 115) << 1) - (i35 ^ 115);
        f53931a = i36 % 128;
        if (i36 % 2 == 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    public static /* synthetic */ Object q(Object[] objArr) {
        int i10 = 0;
        int iIntValue = ((Number) objArr[0]).intValue();
        BigInteger bigIntegerShiftRight = (BigInteger) objArr[1];
        int i11 = f53932b;
        int i12 = i11 & 21;
        int i13 = ((i11 | 21) & (~i12)) + (i12 << 1);
        f53931a = i13 % 128;
        if (i13 % 2 != 0) {
            bigIntegerShiftRight.signum();
            throw null;
        }
        if (bigIntegerShiftRight.signum() < 0 || bigIntegerShiftRight.bitLength() > iIntValue) {
            throw new IllegalArgumentException();
        }
        int i14 = (((-1) << 1) - ((((iIntValue | 32) << 1) - (iIntValue ^ 32)) ^ (-1))) >> 5;
        int[] iArr = (int[]) setOnFocusChangeListener(new Object[]{Integer.valueOf(i14)}, 1950542281, -1950542250, i14);
        int i15 = f53932b;
        int i16 = i15 & 47;
        int i17 = ((i15 ^ 47) | i16) << 1;
        int i18 = -((i15 | 47) & (~i16));
        int i19 = (i17 & i18) + (i18 | i17);
        f53931a = i19 % 128;
        int i20 = i19 % 2;
        while (i10 < i14) {
            int i21 = f53931a;
            int i22 = ((i21 ^ 6) + ((i21 & 6) << 1)) - 1;
            f53932b = i22 % 128;
            int i23 = i22 % 2;
            int iIntValue2 = bigIntegerShiftRight.intValue();
            if (i23 == 0) {
                iArr[i10] = iIntValue2;
                bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(36);
                int i24 = i10 & 202;
                int i25 = ((((i10 ^ 202) | i24) << 1) - (~(-((i10 | 202) & (~i24))))) - 1;
                int i26 = i25 & (-100);
                i10 = (((i25 | (-100)) & (~i26)) - (~(i26 << 1))) - 1;
            } else {
                iArr[i10] = iIntValue2;
                bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(32);
                i10++;
            }
            int i27 = f53931a;
            int i28 = ((i27 & (-24)) | ((~i27) & 23)) + ((i27 & 23) << 1);
            f53932b = i28 % 128;
            int i29 = i28 % 2;
        }
        int i30 = f53931a;
        int i31 = i30 & 25;
        int i32 = (((i30 ^ 25) | i31) << 1) - ((i30 | 25) & (~i31));
        f53932b = i32 % 128;
        if (i32 % 2 != 0) {
            return iArr;
        }
        throw null;
    }

    public static /* synthetic */ Boolean r(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int i10 = f53932b;
        int i11 = i10 & 63;
        int i12 = (i11 - (~((i10 ^ 63) | i11))) - 1;
        int i13 = i12 % 128;
        f53931a = i13;
        int i14 = i12 % 2;
        if (iArr[0] != 1) {
            int i15 = i13 + 119;
            int i16 = i15 % 128;
            f53932b = i16;
            int i17 = i15 % 2;
            int i18 = (-2) - (((i16 & 102) + (i16 | 102)) ^ (-1));
            f53931a = i18 % 128;
            int i19 = i18 % 2;
            return Boolean.FALSE;
        }
        int i20 = i13 & 55;
        int i21 = (i20 - (~(-(-((i13 ^ 55) | i20))))) - 1;
        f53932b = i21 % 128;
        int i22 = i21 % 2;
        int i23 = 1;
        while (i23 < iIntValue) {
            int i24 = f53932b;
            int i25 = i24 + 79;
            f53931a = i25 % 128;
            if (i25 % 2 != 0) {
                int i26 = iArr[i23];
                throw null;
            }
            if (iArr[i23] != 0) {
                int i27 = i24 & 97;
                int i28 = (i27 - (~((i24 ^ 97) | i27))) - 1;
                f53931a = i28 % 128;
                int i29 = i28 % 2;
                int i30 = i24 ^ 31;
                int i31 = ((i24 & 31) | i30) << 1;
                int i32 = -i30;
                int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                f53931a = i33 % 128;
                int i34 = i33 % 2;
                return Boolean.FALSE;
            }
            i23++;
            int i35 = i24 & 125;
            int i36 = (i24 | 125) & (~i35);
            int i37 = -(-(i35 << 1));
            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
            f53931a = i38 % 128;
            int i39 = i38 % 2;
        }
        int i40 = f53932b;
        int i41 = i40 & 95;
        int i42 = (i40 | 95) & (~i41);
        int i43 = i41 << 1;
        int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
        f53931a = i44 % 128;
        if (i44 % 2 == 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    public static /* synthetic */ Integer s(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        while (true) {
            int i10 = -(-((~iIntValue) | iIntValue));
            iIntValue = ((iIntValue | i10) << 1) - (iIntValue ^ i10);
            if (iIntValue < 0) {
                break;
            }
            int i11 = f53931a;
            int i12 = i11 & 7;
            int i13 = ((i11 | 7) & (~i12)) + (i12 << 1);
            int i14 = i13 % 128;
            f53932b = i14;
            int i15 = i13 % 2;
            int i16 = iArr[iIntValue];
            int i17 = i16 >>> iIntValue2;
            int i18 = iIntValue3 << (-iIntValue2);
            iArr[iIntValue] = (i18 & i17) | ((~i18) & i17) | ((~i17) & i18);
            int i19 = i14 & 87;
            int i20 = ((i14 ^ 87) | i19) << 1;
            int i21 = -((i14 | 87) & (~i19));
            int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
            f53931a = i22 % 128;
            int i23 = i22 % 2;
            iIntValue3 = i16;
        }
        int i24 = iIntValue3 << (-iIntValue2);
        int i25 = f53932b;
        int i26 = i25 ^ 59;
        int i27 = (((i25 & 59) | i26) << 1) - i26;
        f53931a = i27 % 128;
        if (i27 % 2 == 0) {
            return Integer.valueOf(i24);
        }
        throw null;
    }

    public static int setCompoundDrawableTintBlendMode(int[] iArr) {
        return ((Integer) setOnFocusChangeListener(new Object[]{iArr}, -41416356, 41416368, (int) System.currentTimeMillis())).intValue();
    }

    public static void setDividerPadding(int[] iArr) {
        setOnFocusChangeListener(new Object[]{iArr}, 202868287, -202868267, (int) System.currentTimeMillis());
    }

    public static int setLayoutAnimation(int i10, int[] iArr, int[] iArr2) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, iArr2}, 1689404169, -1689404133, i10)).intValue();
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = ~i11;
        int i18 = ~(i17 | i10);
        int i19 = ~i10;
        int i20 = ((~(i19 | (~i12) | i11)) * 501) + ((~(i17 | i19)) * 1002) + ((i18 | (~(i19 | i11 | i12))) * 501) + (i11 * (-500)) + (i10 * (-500));
        int i21 = 0;
        int iValueOf = 0;
        int i22 = 2;
        int i23 = 16;
        long j10 = 1;
        long j11 = 4294967295L;
        switch (i20) {
            case 1:
                return i(objArr);
            case 2:
                int iIntValue = ((Number) objArr[0]).intValue();
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int[] iArr = (int[]) objArr[2];
                int iIntValue3 = ((Number) objArr[3]).intValue();
                int i24 = f53932b;
                int i25 = (i24 & 105) + (i24 | 105);
                f53931a = i25 % 128;
                int i26 = i25 % 2;
                long j12 = (((long) iIntValue2) & 4294967295L) + (4294967295L & ((long) iArr[iIntValue3]));
                iArr[iIntValue3] = (int) j12;
                if ((j12 >>> 32) != 0) {
                    int iIntValue4 = ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue), iArr, Integer.valueOf(iIntValue3 + 1)}, -668114120, 668114158, iIntValue)).intValue();
                    int i27 = f53932b + 57;
                    f53931a = i27 % 128;
                    int i28 = i27 % 2;
                    iValueOf = Integer.valueOf(iIntValue4);
                } else {
                    int i29 = (i24 ^ 111) + ((i24 & 111) << 1);
                    f53931a = i29 % 128;
                    int i30 = i29 % 2;
                }
                break;
            case 3:
                int iIntValue5 = ((Number) objArr[0]).intValue();
                int[] iArr2 = (int[]) objArr[1];
                int iIntValue6 = ((Number) objArr[2]).intValue();
                int[] iArr3 = (int[]) objArr[3];
                int i31 = f53931a + 103;
                f53932b = i31 % 128;
                int i32 = 2;
                i21 = i31 % 2 == 0 ? 1 : 0;
                while (i21 < iIntValue5) {
                    int i33 = f53931a + 21;
                    int i34 = i33 % 128;
                    f53932b = i34;
                    int i35 = i33 % i32;
                    int i36 = iArr2[i21];
                    int i37 = i36 << 3;
                    int i38 = iIntValue6 >>> (-3);
                    int i39 = i37 ^ i38;
                    int i40 = i38 & i37;
                    iArr3[i21] = (i40 & i39) | (i39 ^ i40);
                    int i41 = i21 & 1;
                    i21 = ((i21 | 1) & (~i41)) + (i41 << 1);
                    int i42 = i34 & 45;
                    int i43 = i34 | 45;
                    int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
                    f53931a = i44 % 128;
                    int i45 = i44 % 2;
                    iIntValue6 = i36;
                    i32 = 2;
                }
                int i46 = iIntValue6 >>> (-3);
                int i47 = f53931a + 43;
                f53932b = i47 % 128;
                int i48 = i47 % 2;
                return Integer.valueOf(i46);
            case 4:
                return A(objArr);
            case 5:
                return z(objArr);
            case 6:
                int[] iArr4 = (int[]) objArr[0];
                int iIntValue7 = ((Number) objArr[1]).intValue();
                int[] iArr5 = (int[]) objArr[2];
                int i49 = f53931a;
                int i50 = (i49 ^ 93) + ((i49 & 93) << 1);
                while (true) {
                    f53932b = i50 % 128;
                    int i51 = i50 % 2;
                    int i52 = (i23 << 1) - i23;
                    i23 = i52 - 1;
                    if (i23 < 0) {
                        int i53 = iIntValue7 << (-9);
                        int i54 = f53932b;
                        int i55 = ((i54 ^ 81) | (i54 & 81)) << 1;
                        int i56 = -(((~i54) & 81) | (i54 & (-82)));
                        int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                        f53931a = i57 % 128;
                        int i58 = i57 % 2;
                        return Integer.valueOf(i53);
                    }
                    int i59 = f53932b;
                    int i60 = i59 & 113;
                    int i61 = (i60 - (~((i59 ^ 113) | i60))) - 1;
                    int i62 = i61 % 128;
                    f53931a = i62;
                    if (i61 % 2 != 0) {
                        i13 = iArr4[i23 >>> 30];
                        int i63 = i13 >> 96;
                        int i64 = iIntValue7 << 127;
                        int i65 = ((~i64) & i63) | ((~i63) & i64);
                        int i66 = i64 & i63;
                        iArr5[i23] = (i66 & i65) | (i65 ^ i66);
                    } else {
                        i13 = iArr4[i52 + 15];
                        int i67 = i13 >>> 9;
                        int i68 = iIntValue7 << (-9);
                        int i69 = ((~i68) & i67) | ((~i67) & i68);
                        int i70 = i68 & i67;
                        iArr5[i23] = (i70 & i69) | (i69 ^ i70);
                    }
                    iIntValue7 = i13;
                    int i71 = i62 & 71;
                    int i72 = (i62 ^ 71) | i71;
                    i50 = (i71 & i72) + (i71 | i72);
                }
                break;
            case 7:
                return j(objArr);
            case 8:
                return t(objArr);
            case 9:
                int iIntValue8 = ((Number) objArr[0]).intValue();
                int[] iArr6 = (int[]) objArr[1];
                int[] iArr7 = (int[]) objArr[2];
                int[] iArr8 = (int[]) objArr[3];
                int i73 = f53932b;
                int i74 = (((i73 ^ 107) | (i73 & 107)) << 1) - (((~i73) & 107) | (i73 & (-108)));
                f53931a = i74 % 128;
                if (i74 % 2 != 0) {
                    i21 = 1;
                } else {
                    j10 = 0;
                }
                while (i21 < iIntValue8) {
                    int i75 = f53931a + 83;
                    f53932b = i75 % 128;
                    if (i75 % 2 == 0) {
                        long j13 = j10 % ((((long) iArr6[i21]) - 4294967295L) / (((long) iArr7[i21]) & 4294967295L));
                        iArr8[i21] = (int) j13;
                        long j14 = j13 << 22;
                        int i76 = ((i21 & 144) + (i21 | 144)) - 1;
                        int i77 = i76 & (-58);
                        i21 = i77 + ((i76 ^ (-58)) | i77);
                        j10 = j14;
                    } else {
                        long j15 = ((((long) iArr6[i21]) & 4294967295L) - (((long) iArr7[i21]) & 4294967295L)) + j10;
                        iArr8[i21] = (int) j15;
                        int i78 = (i21 ^ 128) + ((i21 & 128) << 1);
                        int i79 = (i78 ^ (-1)) + (i78 << 1);
                        i21 = ((i79 & 125) | ((~i79) & (-126))) + ((i79 & (-126)) << 1);
                        j10 = j15 >> 32;
                    }
                }
                int i80 = f53932b;
                int i81 = ((i80 ^ 5) - (~((i80 & 5) << 1))) - 1;
                f53931a = i81 % 128;
                int i82 = i81 % 2;
                return Integer.valueOf((int) j10);
            case 10:
                return q(objArr);
            case 11:
                return c(objArr);
            case 12:
                int[] iArr9 = (int[]) objArr[0];
                int i83 = f53931a;
                int i84 = ((i83 & (-50)) | ((~i83) & 49)) + ((i83 & 49) << 1);
                int i85 = i84 % 128;
                f53932b = i85;
                int i86 = i84 % 2;
                long j16 = (((long) iArr9[0]) & 4294967295L) - 2147483649L;
                iArr9[0] = (int) j16;
                if ((j16 >> 32) != 0) {
                    int iIntValue9 = ((Integer) setOnFocusChangeListener(new Object[]{5, iArr9, 1}, -115920179, 115920214, 5)).intValue();
                    int i87 = f53931a + 61;
                    f53932b = i87 % 128;
                    int i88 = i87 % 2;
                    iValueOf = Integer.valueOf(iIntValue9);
                } else {
                    int i89 = i85 + 37;
                    f53931a = i89 % 128;
                    int i90 = i89 % 2;
                }
                break;
            case 13:
                return r(objArr);
            case 14:
                return u(objArr);
            case 15:
                return m(objArr);
            case 16:
                return B(objArr);
            case 17:
                int iIntValue10 = ((Number) objArr[0]).intValue();
                int iIntValue11 = ((Number) objArr[1]).intValue();
                int[] iArr10 = (int[]) objArr[2];
                int i91 = f53932b;
                int i92 = i91 + 37;
                f53931a = i92 % 128;
                int i93 = i92 % 2;
                long j17 = (((long) iArr10[0]) & 4294967295L) + (((long) iIntValue11) & 4294967295L);
                iArr10[0] = (int) j17;
                long j18 = (4294967295L & ((long) iArr10[1])) + 1 + (j17 >>> 32);
                iArr10[1] = (int) j18;
                if ((j18 >>> 32) != 0) {
                    int iIntValue12 = ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue10), iArr10, 2}, -668114120, 668114158, iIntValue10)).intValue();
                    int i94 = f53932b;
                    int i95 = ((i94 ^ 8) + ((i94 & 8) << 1)) - 1;
                    f53931a = i95 % 128;
                    int i96 = i95 % 2;
                    iValueOf = Integer.valueOf(iIntValue12);
                } else {
                    int i97 = i91 & 113;
                    int i98 = (i91 ^ 113) | i97;
                    int i99 = (i97 & i98) + (i97 | i98);
                    f53931a = i99 % 128;
                    int i100 = i99 % 2;
                }
                break;
            case 18:
                return l(objArr);
            case 19:
                int[] iArr11 = (int[]) objArr[0];
                int i101 = f53931a;
                int i102 = i101 & 109;
                int i103 = ((i101 ^ 109) | i102) << 1;
                int i104 = -((i101 | 109) & (~i102));
                int i105 = ((i103 | i104) << 1) - (i104 ^ i103);
                int i106 = i105 % 128;
                f53932b = i106;
                int i107 = i105 % 2;
                int i108 = iArr11[0] & 1;
                int i109 = (((i106 | 50) << 1) - (i106 ^ 50)) - 1;
                f53931a = i109 % 128;
                int i110 = i109 % 2;
                return Integer.valueOf(i108);
            case 20:
                a(objArr);
                return null;
            case 21:
                return f(objArr);
            case 22:
                int iIntValue13 = ((Number) objArr[0]).intValue();
                int[] iArr12 = (int[]) objArr[1];
                int[] iArr13 = (int[]) objArr[2];
                int[] iArr14 = (int[]) objArr[3];
                int i111 = f53931a;
                int i112 = (i111 & 107) + (i111 | 107);
                f53932b = i112 % 128;
                int i113 = i112 % 2;
                long j19 = 0;
                while (i21 < iIntValue13) {
                    long j20 = (((long) iArr12[i21]) & 4294967295L) + (((long) iArr13[i21]) & 4294967295L) + (((long) iArr14[i21]) & 4294967295L) + j19;
                    iArr14[i21] = (int) j20;
                    j19 = j20 >>> 32;
                    i21 = (((i21 | 2) << 1) - (i21 ^ 2)) - 1;
                    int i114 = f53931a;
                    int i115 = (i114 ^ 59) + ((i114 & 59) << 1);
                    f53932b = i115 % 128;
                    int i116 = i115 % 2;
                }
                int i117 = f53932b + 125;
                f53931a = i117 % 128;
                int i118 = i117 % 2;
                return Integer.valueOf((int) j19);
            case 23:
                return v(objArr);
            case 24:
                int iIntValue14 = ((Number) objArr[0]).intValue();
                int iIntValue15 = ((Number) objArr[1]).intValue();
                int[] iArr15 = (int[]) objArr[2];
                int i119 = f53932b;
                int i120 = ((i119 & (-34)) | ((~i119) & 33)) + ((i119 & 33) << 1);
                f53931a = i120 % 128;
                int i121 = i120 % 2;
                long j21 = (((long) iArr15[0]) & 4294967295L) - (((long) iIntValue15) & 4294967295L);
                iArr15[0] = (int) j21;
                long j22 = ((4294967295L & ((long) iArr15[1])) - 1) + (j21 >> 32);
                iArr15[1] = (int) j22;
                if ((j22 >> 32) != 0) {
                    int iIntValue16 = ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue14), iArr15, 2}, -115920179, 115920214, iIntValue14)).intValue();
                    int i122 = f53932b;
                    int i123 = i122 & 55;
                    int i124 = (((i122 | 55) & (~i123)) - (~(i123 << 1))) - 1;
                    f53931a = i124 % 128;
                    int i125 = i124 % 2;
                    iValueOf = Integer.valueOf(iIntValue16);
                } else {
                    int i126 = i119 + 121;
                    f53931a = i126 % 128;
                    int i127 = i126 % 2;
                    int i128 = i119 & 119;
                    int i129 = (i128 - (~(-(-((i119 ^ 119) | i128))))) - 1;
                    f53931a = i129 % 128;
                    int i130 = i129 % 2;
                }
                break;
            case 25:
                int iIntValue17 = ((Number) objArr[0]).intValue();
                int[] iArr16 = (int[]) objArr[1];
                int[] iArr17 = (int[]) objArr[2];
                int iIntValue18 = ((Number) objArr[3]).intValue();
                int i131 = f53932b;
                int i132 = (i131 ^ 77) + ((i131 & 77) << 1);
                f53931a = i132 % 128;
                j10 = i132 % 2 == 0 ? 0L : 1L;
                while (i21 < iIntValue17) {
                    int i133 = f53931a;
                    int i134 = ((i133 | 61) << 1) - (i133 ^ 61);
                    int i135 = i134 % 128;
                    f53932b = i135;
                    if (i134 % 2 == 0) {
                        long j23 = j10 ^ ((((long) iArr17[iIntValue18 >>> i21]) ^ 4294967295L) ^ (((long) iArr16[i21]) * 4294967295L));
                        iArr17[iIntValue18 >> i21] = (int) j23;
                        j10 = j23 >>> 89;
                        i21 += 126;
                    } else {
                        int i136 = -(-i21);
                        long j24 = ((((long) iArr17[(iIntValue18 & i136) + (i136 | iIntValue18)]) & 4294967295L) - (((long) iArr16[i21]) & 4294967295L)) + j10;
                        iArr17[(iIntValue18 & i21) + (iIntValue18 | i21)] = (int) j24;
                        int i137 = ((i21 ^ 1) | (i21 & 1)) << 1;
                        int i138 = -(((~i21) & 1) | (i21 & (-2)));
                        int i139 = ((i137 | i138) << 1) - (i138 ^ i137);
                        j10 = j24 >> 32;
                        i21 = i139;
                    }
                    int i140 = (-2) - ((i135 + 68) ^ (-1));
                    f53931a = i140 % 128;
                    int i141 = i140 % 2;
                }
                int i142 = f53932b + 40;
                int i143 = (i142 ^ (-1)) + (i142 << 1);
                f53931a = i143 % 128;
                int i144 = i143 % 2;
                return Integer.valueOf((int) j10);
            case 26:
                int iIntValue19 = ((Number) objArr[0]).intValue();
                int[] iArr18 = (int[]) objArr[1];
                int i145 = f53931a;
                int i146 = (((i145 ^ 1) | (i145 & 1)) << 1) - ((i145 & (-2)) | ((~i145) & 1));
                f53932b = i146 % 128;
                if (i146 % 2 == 0) {
                    i14 = iArr18[1];
                } else {
                    int i147 = iArr18[0];
                    i14 = (i147 | 1) & (~(i147 & 1));
                }
                int i148 = ((i145 & 111) - (~(-(-(i145 | 111))))) - 1;
                f53932b = i148 % 128;
                int i149 = i148 % 2;
                int i150 = 1;
                while (i150 < iIntValue19) {
                    int i151 = f53931a;
                    int i152 = (((i151 & (-56)) | ((~i151) & 55)) - (~((i151 & 55) << 1))) - 1;
                    int i153 = i152 % 128;
                    f53932b = i153;
                    if (i152 % 2 == 0) {
                        int i154 = iArr18[i150];
                        int i155 = ((~i154) & i14) | ((~i14) & i154);
                        int i156 = i14 & i154;
                        i14 = (i156 & i155) | (i155 ^ i156);
                        int i157 = i150 & 43;
                        int i158 = ((i150 ^ 43) | i157) << 1;
                        int i159 = -((i150 | 43) & (~i157));
                        i150 = (i158 ^ i159) + ((i159 & i158) << 1);
                        i15 = 1;
                    } else {
                        int i160 = iArr18[i150];
                        i14 = (i14 & i160) | (i14 ^ i160);
                        int i161 = i150 & 116;
                        int i162 = -(-((i150 ^ 116) | i161));
                        int i163 = i161 ^ i162;
                        int i164 = i162 & i161;
                        i15 = 1;
                        int i165 = i163 + (i164 << 1);
                        int i166 = i165 & (-115);
                        int i167 = (i165 ^ (-115)) | i166;
                        i150 = (i166 ^ i167) + ((i166 & i167) << 1);
                    }
                    int i168 = ((i153 & (-16)) | ((~i153) & 15)) + ((i153 & 15) << i15);
                    f53931a = i168 % 128;
                    int i169 = i168 % 2;
                }
                int i170 = i14 >>> 1;
                int i171 = i14 & 1;
                int i172 = i170 ^ i171;
                int i173 = i171 & i170;
                int i174 = (i173 & i172) | (i172 ^ i173);
                int i175 = -(-(i174 * (-195)));
                int i176 = ((391 ^ i175) - (~(-(-((i175 & 391) << 1))))) - 1;
                int i177 = ~i174;
                int i178 = ~i177;
                int i179 = ~((i178 & i177) | (i178 ^ i177));
                int i180 = i174 & iIntValue19;
                int i181 = (~i180) & (i174 | iIntValue19);
                int i182 = ~((i181 & i180) | (i181 ^ i180));
                int i183 = ((~i182) & i179) | ((~i179) & i182);
                int i184 = i179 & i182;
                int i185 = -(-(((i184 & i183) | (i183 ^ i184)) * (-196)));
                int i186 = ((~i185) & i176) | ((~i176) & i185);
                int i187 = -(-((i185 & i176) << 1));
                int i188 = ((i186 | i187) << 1) - (i187 ^ i186);
                int i189 = -(-(((i177 ^ i174) | (i177 & i174)) * 392));
                int i190 = i188 & i189;
                int i191 = -(-((i189 ^ i188) | i190));
                int i192 = (((((i190 | i191) << 1) - (i191 ^ i190)) - (~(-(-(((~((iIntValue19 ^ i174) | i180)) | (~i177)) * 196))))) - 1) >> 31;
                int i193 = f53932b;
                int i194 = i193 & 109;
                int i195 = (i193 ^ 109) | i194;
                int i196 = (i194 & i195) + (i195 | i194);
                f53931a = i196 % 128;
                int i197 = i196 % 2;
                return Integer.valueOf(i192);
            case 27:
                return w(objArr);
            case 28:
                return g(objArr);
            case 29:
                long[] jArr = (long[]) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                long[] jArr2 = (long[]) objArr[2];
                int i198 = f53931a;
                int i199 = (i198 ^ 63) + ((i198 & 63) << 1);
                f53932b = i199 % 128;
                i21 = i199 % 2 == 0 ? 1 : 0;
                while (i21 < 144) {
                    int i200 = f53932b;
                    int i201 = i200 ^ 77;
                    int i202 = (((i200 & 77) | i201) << 1) - i201;
                    f53931a = i202 % 128;
                    int i203 = i202 % 2;
                    long j25 = jArr[i21];
                    jArr2[(i21 & 144) + (i21 | 144)] = (jLongValue >>> (-4)) | (j25 << 4);
                    i21 = ((i21 & 1) << 1) + (i21 ^ 1);
                    int i204 = i200 & 125;
                    int i205 = (i204 - (~(-(-((i200 ^ 125) | i204))))) - 1;
                    f53931a = i205 % 128;
                    int i206 = i205 % 2;
                    jLongValue = j25;
                }
                long j26 = jLongValue >>> (-4);
                int i207 = f53931a;
                int i208 = i207 & 109;
                int i209 = ((i207 | 109) & (~i208)) + (i208 << 1);
                f53932b = i209 % 128;
                int i210 = i209 % 2;
                return Long.valueOf(j26);
            case 30:
                return s(objArr);
            case 31:
                int iIntValue20 = ((Number) objArr[0]).intValue();
                int i211 = f53931a;
                int i212 = ((i211 | 45) << 1) - (i211 ^ 45);
                int i213 = i212 % 128;
                f53932b = i213;
                int i214 = i212 % 2;
                int[] iArr19 = new int[iIntValue20];
                int i215 = i213 + 21;
                f53931a = i215 % 128;
                int i216 = i215 % 2;
                return iArr19;
            case 32:
                return b(objArr);
            case 33:
                return h(objArr);
            case 34:
                int iIntValue21 = ((Number) objArr[0]).intValue();
                int[] iArr20 = (int[]) objArr[1];
                int[] iArr21 = (int[]) objArr[2];
                int i217 = f53931a;
                int i218 = (i217 & (-122)) | ((~i217) & 121);
                int i219 = -(-((i217 & 121) << 1));
                int i220 = (i218 & i219) + (i219 | i218);
                int i221 = i220 % 128;
                f53932b = i221;
                j10 = i220 % 2 != 0 ? 0L : 1L;
                int i222 = ((i221 | 19) << 1) - (i221 ^ 19);
                f53931a = i222 % 128;
                int i223 = i222 % 2;
                while (i21 < iIntValue21) {
                    int i224 = f53931a;
                    int i225 = ((i224 | 32) << 1) - (i224 ^ 32);
                    int i226 = (i225 ^ (-1)) + (i225 << 1);
                    f53932b = i226 % 128;
                    if (i226 % 2 == 0) {
                        long j27 = (j10 ^ ((((long) iArr20[i21]) ^ 4294967295L) % (((long) iArr21[i21]) | 4294967295L))) >> 94;
                        int i227 = i21 & 89;
                        int i228 = (i21 ^ 89) | i227;
                        j10 = j27;
                        i21 = (i227 ^ i228) + ((i228 & i227) << 1);
                        i16 = 1;
                    } else {
                        j10 = (((((long) iArr20[i21]) & 4294967295L) - (((long) iArr21[i21]) & 4294967295L)) + j10) >> 32;
                        i16 = 1;
                        i21 = (((i21 | 1) << 1) - (~(-(i21 ^ 1)))) - 1;
                    }
                    int i229 = ((i224 ^ 89) | (i224 & 89)) << i16;
                    int i230 = -(((~i224) & 89) | (i224 & (-90)));
                    int i231 = ((i229 | i230) << i16) - (i230 ^ i229);
                    f53932b = i231 % 128;
                    int i232 = i231 % 2;
                }
                int i233 = f53931a;
                int i234 = ((i233 & (-70)) | ((~i233) & 69)) + ((i233 & 69) << 1);
                f53932b = i234 % 128;
                int i235 = i234 % 2;
                return Integer.valueOf((int) j10);
            case 35:
                return d(objArr);
            case 36:
                int iIntValue22 = ((Number) objArr[0]).intValue();
                int[] iArr22 = (int[]) objArr[1];
                int[] iArr23 = (int[]) objArr[2];
                int i236 = f53931a;
                int i237 = i236 + 91;
                f53932b = i237 % 128;
                int i238 = i237 % 2;
                long j28 = ((long) iIntValue22) & 4294967295L;
                int i239 = (i236 | 91) << 1;
                int i240 = -((i236 & (-92)) | ((~i236) & 91));
                int i241 = (i239 & i240) + (i239 | i240);
                f53932b = i241 % 128;
                int i242 = i241 % 2;
                long j29 = 0;
                do {
                    int i243 = (i21 | 16) << 1;
                    long j30 = ((((long) iArr22[i21]) & 4294967295L) * j28) + (((long) iArr23[i243 - ((i21 & (-17)) | ((~i21) & 16))]) & 4294967295L) + j29;
                    iArr23[i243 - (i21 ^ 16)] = (int) j30;
                    j29 = j30 >>> 32;
                    int i244 = (((i21 | 38) << 1) - (i21 ^ 38)) - 1;
                    int i245 = i244 & (-36);
                    int i246 = (i244 ^ (-36)) | i245;
                    i21 = (i245 ^ i246) + ((i246 & i245) << 1);
                } while (i21 < 16);
                int i247 = f53932b;
                int i248 = i247 & 123;
                int i249 = (i247 ^ 123) | i248;
                int i250 = (i248 ^ i249) + ((i248 & i249) << 1);
                f53931a = i250 % 128;
                int i251 = i250 % 2;
                int i252 = i247 ^ 87;
                int i253 = (((i247 & 87) | i252) << 1) - i252;
                f53931a = i253 % 128;
                int i254 = i253 % 2;
                return Integer.valueOf((int) j29);
            case 37:
                return n(objArr);
            case 38:
                return k(objArr);
            case 39:
                return o(objArr);
            case 40:
                int iIntValue23 = ((Number) objArr[0]).intValue();
                int[] iArr24 = (int[]) objArr[1];
                int[] iArr25 = (int[]) objArr[2];
                int iIntValue24 = ((Number) objArr[3]).intValue();
                int i255 = f53932b;
                int i256 = (i255 ^ 21) + ((i255 & 21) << 1);
                int i257 = i256 % 128;
                f53931a = i257;
                int i258 = i256 % 2;
                int i259 = i257 + 83;
                f53932b = i259 % 128;
                int i260 = i259 % 2;
                long j31 = 0;
                while (i21 < iIntValue23) {
                    int i261 = f53932b;
                    int i262 = (i261 & 23) + (i261 | 23);
                    int i263 = i262 % 128;
                    f53931a = i263;
                    int i264 = i262 % 2;
                    long j32 = ((long) iArr24[i21]) & j11;
                    int i265 = i21 * 465;
                    int i266 = iIntValue24 * (-463);
                    int i267 = i265 & i266;
                    int i268 = (i265 | i266) & (~i267);
                    int i269 = i267 << 1;
                    int i270 = (i268 & i269) + (i268 | i269);
                    int i271 = ~iIntValue24;
                    int i272 = ~iIntValue23;
                    int i273 = i271 ^ i272;
                    int i274 = i271 & i272;
                    int i275 = ~(i273 | i274);
                    int i276 = i271 & i21;
                    int[] iArr26 = iArr24;
                    int i277 = ~((i271 ^ i21) | i276);
                    int i278 = ((~i277) & i275) | ((~i275) & i277);
                    int i279 = i277 & i275;
                    int i280 = (i279 & i278) | (i278 ^ i279);
                    int i281 = (i272 ^ i21) | (i272 & i21);
                    int i282 = ~i281;
                    int i283 = (i281 | i282) & i282;
                    int i284 = i280 & i283;
                    int i285 = (i280 | i283) & (~i284);
                    int i286 = -(-(((i285 & i284) | (i285 ^ i284)) * 464));
                    int i287 = (i270 ^ i286) + ((i286 & i270) << 1);
                    int i288 = ~i21;
                    int i289 = (i288 | i21) & i288;
                    int i290 = iIntValue23 ^ i289;
                    int i291 = i289 & iIntValue23;
                    int i292 = (i291 & i290) | (i290 ^ i291);
                    int i293 = -(-(((i292 & i271) | (i292 ^ i271)) * (-464)));
                    int i294 = ((i287 & i293) - (~(-(-(i287 | i293))))) - 1;
                    int i295 = ~i271;
                    int i296 = i271 & i288;
                    int i297 = (i21 & i295) | i296;
                    int i298 = (i297 ^ i276) | (i297 & i276);
                    int i299 = ~i298;
                    int i300 = i299 & (i298 | i299);
                    int i301 = ~((i21 ^ iIntValue23) | (i21 & iIntValue23));
                    int i302 = iIntValue23;
                    int i303 = i300 & i301;
                    int i304 = (~i303) & (i300 | i301);
                    long j33 = j32 + (((long) iArr25[(i294 - (~(((i303 & i304) | (i304 ^ i303)) * 464))) - 1]) & 4294967295L) + j31;
                    int i305 = i21 * Opcodes.INSTANCEOF;
                    int i306 = -(-(iIntValue24 * Opcodes.INSTANCEOF));
                    int i307 = (i305 | i306) << 1;
                    int i308 = -(((~i305) & i306) | ((~i306) & i305));
                    int i309 = ((i307 | i308) << 1) - (i308 ^ i307);
                    int i310 = i288 & iIntValue24;
                    int i311 = ~((i288 ^ iIntValue24) | i310);
                    int i312 = (i309 - (~(-(-(((i311 & i272) | (i272 ^ i311)) * (-192)))))) - 1;
                    int i313 = (i288 & i295) | ((~i288) & i271);
                    int i314 = ~((i313 & i296) | (i313 ^ i296));
                    int i315 = ~((i273 ^ i274) | (i273 & i274));
                    int i316 = i314 & i315;
                    int i317 = (i314 | i315) & (~i316);
                    int i318 = (i312 - (~(-(-(((i317 & i316) | (i317 ^ i316)) * (-384)))))) - 1;
                    int i319 = (i271 | iIntValue24) & i271;
                    int i320 = i288 & i319;
                    int i321 = (i288 | i319) & (~i320);
                    int i322 = ~i319;
                    int i323 = (i321 & i320) | (i321 ^ i320);
                    int i324 = (i323 & i302) | (i323 ^ i302);
                    int i325 = ~i324;
                    int i326 = (i324 | i325) & i325;
                    int i327 = ((~i272) & i319) | (i322 & i272);
                    int i328 = i319 & i272;
                    int i329 = (i328 & i327) | (i327 ^ i328);
                    int i330 = i329 & i21;
                    int i331 = (i329 | i21) & (~i330);
                    int i332 = ~((i331 & i330) | (i331 ^ i330));
                    int i333 = (i332 & i326) | (i326 ^ i332);
                    int i334 = i276 | i310;
                    int i335 = i21 & iIntValue24;
                    int i336 = (i334 & i335) | (i334 ^ i335);
                    int i337 = ~((i336 & i302) | (i336 & i272) | (i302 & (~i336)));
                    int i338 = -(-(((i333 & i337) | (i333 ^ i337)) * 192));
                    int i339 = i318 ^ i338;
                    iArr25[(((i338 & i318) | i339) << 1) - i339] = (int) j33;
                    j31 = j33 >>> 32;
                    i21++;
                    int i340 = (i263 | 9) << 1;
                    int i341 = -((i263 & (-10)) | ((~i263) & 9));
                    int i342 = ((i340 | i341) << 1) - (i340 ^ i341);
                    f53932b = i342 % 128;
                    int i343 = i342 % 2;
                    iArr24 = iArr26;
                    iIntValue23 = i302;
                    j11 = 4294967295L;
                }
                int i344 = f53932b;
                int i345 = (i344 & 59) + (i344 | 59);
                f53931a = i345 % 128;
                int i346 = i345 % 2;
                return Integer.valueOf((int) j31);
            case 41:
                int iIntValue25 = ((Number) objArr[0]).intValue();
                int[] iArr27 = (int[]) objArr[1];
                int iIntValue26 = ((Number) objArr[2]).intValue();
                int i347 = f53931a;
                int i348 = (i347 ^ 93) + ((i347 & 93) << 1);
                f53932b = i348 % 128;
                i21 = i348 % 2 == 0 ? 1 : 0;
                int i349 = i347 + 23;
                f53932b = i349 % 128;
                int i350 = i349 % 2;
                while (i21 < iIntValue25) {
                    int i351 = iArr27[i21];
                    int i352 = i351 << 2;
                    int i353 = iIntValue26 >>> (-2);
                    int i354 = i352 & i353;
                    int i355 = (i353 | i352) & (~i354);
                    iArr27[i21] = (i355 & i354) | (i355 ^ i354);
                    i21++;
                    int i356 = f53931a;
                    int i357 = i356 & 53;
                    int i358 = ((i356 | 53) & (~i357)) + (i357 << 1);
                    f53932b = i358 % 128;
                    int i359 = i358 % 2;
                    iIntValue26 = i351;
                }
                int i360 = f53932b + 63;
                f53931a = i360 % 128;
                int i361 = i360 % 2;
                return Integer.valueOf(iIntValue26 >>> (-2));
            case 42:
                return p(objArr);
            case 43:
                return y(objArr);
            case 44:
                return e(objArr);
            case 45:
                return x(objArr);
            case 46:
                int iIntValue27 = ((Number) objArr[0]).intValue();
                int[] iArr28 = (int[]) objArr[1];
                int[] iArr29 = (int[]) objArr[2];
                int i362 = f53932b;
                int i363 = i362 & 113;
                int i364 = -(-((i362 ^ 113) | i363));
                int i365 = (i363 & i364) + (i363 | i364);
                f53931a = i365 % 128;
                int i366 = i365 % 2;
                int i367 = (i362 & (-66)) | ((~i362) & 65);
                int i368 = (i362 & 65) << 1;
                int i369 = (i367 ^ i368) + ((i368 & i367) << 1);
                f53931a = i369 % 128;
                int i370 = i369 % 2;
                long j34 = 0;
                while (i21 < iIntValue27) {
                    int i371 = f53932b;
                    int i372 = i371 & 25;
                    int i373 = ((((i371 ^ 25) | i372) << 1) - (~(-((~i372) & (i371 | 25))))) - 1;
                    f53931a = i373 % 128;
                    int i374 = i373 % 2;
                    long j35 = (((long) iArr28[i21]) & 4294967295L) + (((long) iArr29[i21]) & 4294967295L) + j34;
                    iArr29[i21] = (int) j35;
                    j34 = j35 >>> 32;
                    i21 = (i21 ^ (-113)) + ((i21 & (-113)) << 1) + 114;
                    int i375 = i371 & 113;
                    int i376 = ((i371 ^ 113) | i375) << 1;
                    int i377 = -((i371 | 113) & (~i375));
                    int i378 = (i376 ^ i377) + ((i377 & i376) << 1);
                    f53931a = i378 % 128;
                    int i379 = i378 % 2;
                }
                int i380 = f53931a;
                int i381 = i380 ^ 109;
                int i382 = ((i380 & 109) | i381) << 1;
                int i383 = -i381;
                int i384 = (i382 ^ i383) + ((i382 & i383) << 1);
                f53932b = i384 % 128;
                int i385 = i384 % 2;
                return Integer.valueOf((int) j34);
            default:
                int iIntValue28 = ((Number) objArr[0]).intValue();
                int[] iArr30 = (int[]) objArr[1];
                int[] iArr31 = (int[]) objArr[2];
                int[] iArr32 = (int[]) objArr[3];
                int i386 = f53931a;
                int i387 = i386 ^ 105;
                int i388 = ((i386 & 105) | i387) << 1;
                int i389 = -i387;
                int i390 = ((i388 | i389) << 1) - (i389 ^ i388);
                f53932b = i390 % 128;
                if (i390 % 2 == 0) {
                    i21 = 1;
                } else {
                    j10 = 0;
                }
                int i391 = i386 & 89;
                int i392 = (((i386 ^ 89) | i391) << 1) - ((i386 | 89) & (~i391));
                f53932b = i392 % 128;
                int i393 = i392 % 2;
                while (i21 < iIntValue28) {
                    int i394 = f53931a;
                    int i395 = i394 + 103;
                    f53932b = i395 % 128;
                    int i396 = i395 % i22;
                    long j36 = (((long) iArr30[i21]) & 4294967295L) + (((long) iArr31[i21]) & 4294967295L) + j10;
                    iArr32[i21] = (int) j36;
                    j10 = j36 >>> 32;
                    int i397 = i21 & 1;
                    int i398 = ((i21 ^ 1) | i397) << 1;
                    int i399 = -((i21 | 1) & (~i397));
                    i21 = ((i398 | i399) << 1) - (i399 ^ i398);
                    int i400 = ((((i394 ^ 3) | (i394 & 3)) << 1) - (~(-(((~i394) & 3) | (i394 & (-4)))))) - 1;
                    f53932b = i400 % 128;
                    int i401 = i400 % 2;
                    i22 = 2;
                }
                int i402 = f53932b + 11;
                f53931a = i402 % 128;
                int i403 = i402 % i22;
                return Integer.valueOf((int) j10);
        }
        return iValueOf;
    }

    public static int setOnLongClickListener(int i10, int[] iArr, int[] iArr2) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, iArr2}, 562472640, -562472619, i10)).intValue();
    }

    public static int setX(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, iArr2, iArr3}, 324288195, -324288186, i10)).intValue();
    }

    public static int setY(int i10, int[] iArr, int i11) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, Integer.valueOf(i11)}, 2010229097, -2010229052, i10)).intValue();
    }

    public static /* synthetic */ Integer t(Object[] objArr) {
        int i10 = 0;
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int[] iArr2 = (int[]) objArr[3];
        int i11 = f53932b;
        int i12 = ((i11 | 65) << 1) - ((i11 & (-66)) | ((~i11) & 65));
        f53931a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i11 & 11;
        int i15 = (i11 ^ 11) | i14;
        int i16 = (i14 & i15) + (i15 | i14);
        f53931a = i16 % 128;
        int i17 = i16 % 2;
        while (i10 < iIntValue) {
            int i18 = f53931a + 20;
            int i19 = (i18 ^ (-1)) + (i18 << 1);
            int i20 = i19 % 128;
            f53932b = i20;
            int i21 = i19 % 2;
            int i22 = iArr[i10];
            int i23 = i22 << 1;
            int i24 = iIntValue2 >>> 31;
            int i25 = i23 & i24;
            iArr2[i10] = ((i24 | i23) & (~i25)) | i25;
            int i26 = i10 & 1;
            int i27 = ((i10 ^ 1) | i26) << 1;
            int i28 = -((i10 | 1) & (~i26));
            i10 = ((i28 & i27) << 1) + (i27 ^ i28);
            int i29 = (i20 & 43) + (i20 | 43);
            f53931a = i29 % 128;
            int i30 = i29 % 2;
            iIntValue2 = i22;
        }
        int i31 = iIntValue2 >>> 31;
        int i32 = ~iIntValue;
        int i33 = i32 & (-1003321150);
        int i34 = ~(((~i32) & 1003321149) | i33 | (1003321149 & i32));
        int i35 = (((i34 & (-1369890238)) | ((-1369890238) ^ i34)) * (-865)) + 533086820;
        int i36 = (-1003321150) & iIntValue;
        int i37 = (~i36) & ((-1003321150) | iIntValue);
        int i38 = -(~((~((i36 & i37) | (i37 ^ i36))) * 865));
        int i39 = ((i35 ^ i38) + ((i35 & i38) << 1)) - 1;
        int i40 = (iIntValue | i32) & i32;
        int i41 = ~((i40 & (-1369890238)) | ((~i40) & (-1369890238)) | (1369890237 & i40));
        int i42 = i32 ^ (-1003321150);
        int i43 = (i41 | (~((i42 & i33) | (i42 ^ i33)))) * 865;
        int i44 = i39 & i43;
        int i45 = (i43 ^ i39) | i44;
        int i46 = (i44 & i45) + (i45 | i44);
        int i47 = i32 & (-1961563229);
        int i48 = ((-1961563229) | i32) & (~i47);
        int i49 = (i48 & i47) | (i48 ^ i47);
        int i50 = ((-1002718511) & i49) | ((~i49) & 1002718510);
        int i51 = i49 & 1002718510;
        int i52 = ~((i51 & i50) | (i50 ^ i51));
        int i53 = (-313322292) - (~(-(-(((i52 & 184828194) | (184828194 ^ i52)) * (-828)))));
        int i54 = (-1143672913) & i32;
        int i55 = (i32 | (-1143672913)) & (~i54);
        int i56 = ((i55 & i54) | (i55 ^ i54)) * (-828);
        int i57 = i53 & i56;
        int i58 = ((i53 ^ i56) | i57) << 1;
        int i59 = -((i56 | i53) & (~i57));
        int i60 = (i58 ^ i59) + ((i59 & i58) << 1);
        int i61 = ((i60 ^ 2068366016) | (i60 & 2068366016)) << 1;
        int i62 = -((2068366016 & (~i60)) | ((-2068366017) & i60));
        if (i46 > (i61 & i62) + (i62 | i61)) {
            return Integer.valueOf(i31);
        }
        throw null;
    }

    public static /* synthetic */ Long u(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int i10 = 1;
        int iIntValue = ((Number) objArr[1]).intValue();
        int i11 = 2;
        long jLongValue = ((Number) objArr[2]).longValue();
        long[] jArr2 = (long[]) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i12 = f53931a + 69;
        f53932b = i12 % 128;
        int i13 = i12 % 2 == 0 ? 1 : 0;
        while (i13 < 9) {
            int i14 = f53931a;
            int i15 = i14 & 43;
            int i16 = (i14 ^ 43) | i15;
            int i17 = (i15 & i16) + (i16 | i15);
            int i18 = i17 % 128;
            f53932b = i18;
            int i19 = i17 % i11;
            int i20 = ~i13;
            int i21 = ~iIntValue;
            int i22 = i13 & i21;
            long j10 = jArr[((iIntValue & i20) | i22) + ((iIntValue & i13) << i10)];
            int i23 = i13 * 141;
            int i24 = -(-(iIntValue2 * (-279)));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            int i26 = -(-(((iIntValue2 ^ iIntValue) | (iIntValue2 & iIntValue)) * 140));
            int i27 = ((~i25) & i26) | ((~i26) & i25);
            int i28 = (i25 & i26) << 1;
            int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
            int i30 = (i20 | i13) & i20;
            int i31 = i30 & iIntValue2;
            int i32 = (i30 | iIntValue2) & (~i31);
            int i33 = ~((i32 & i31) | (i32 ^ i31));
            int i34 = i21 ^ iIntValue2;
            int i35 = i21 & iIntValue2;
            int i36 = ~((i34 ^ i35) | (i34 & i35));
            long[] jArr3 = jArr;
            int i37 = ((~i33) & i36) | ((~i36) & i33);
            int i38 = i33 & i36;
            int i39 = (i29 - (~(((i37 & i38) | (i37 ^ i38)) * (-280)))) - 1;
            int i40 = ~iIntValue2;
            int i41 = i40 & i13;
            int i42 = (i40 | i13) & (~i41);
            int i43 = (i42 & i41) | (i42 ^ i41);
            int i44 = ~i43;
            int i45 = (i43 | i44) & i44;
            int i46 = (~i22) & (i21 | i13);
            int i47 = ~((i46 & i22) | (i46 ^ i22));
            int i48 = i45 & i47;
            int i49 = ((i45 | i47) & (~i48)) | i48;
            int i50 = (i20 ^ iIntValue2) | (i20 & iIntValue2);
            int i51 = (i50 & i21) | ((~i50) & iIntValue);
            int i52 = i50 & iIntValue;
            int i53 = ~((i52 & i51) | (i51 ^ i52));
            int i54 = ((~i53) & i49) | ((~i49) & i53);
            int i55 = i49 & i53;
            int i56 = -(-(((i55 & i54) | (i54 ^ i55)) * 140));
            int i57 = i39 & i56;
            int i58 = -(-((i56 ^ i39) | i57));
            jArr2[(i57 & i58) + (i58 | i57)] = (jLongValue >>> 63) | (j10 << 1);
            int i59 = i13 & 1;
            int i60 = ((i13 ^ 1) | i59) << 1;
            int i61 = -((i13 | 1) & (~i59));
            i13 = (i61 | i60) + (i60 & i61);
            int i62 = (i18 & 9) + (i18 | 9);
            f53931a = i62 % 128;
            i11 = 2;
            int i63 = i62 % 2;
            i10 = 1;
            jLongValue = j10;
            jArr = jArr3;
        }
        long j11 = jLongValue >>> 63;
        int i64 = f53931a + 33;
        f53932b = i64 % 128;
        if (i64 % i11 != 0) {
            return Long.valueOf(j11);
        }
        throw null;
    }

    public static /* synthetic */ BigInteger v(Object[] objArr) {
        boolean z10;
        boolean z11 = false;
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int i10 = f53932b + 36;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        int i12 = i11 % 128;
        f53931a = i12;
        int i13 = i11 % 2;
        byte[] bArr = new byte[iIntValue << 2];
        int i14 = (i12 & (-18)) | ((~i12) & 17);
        int i15 = (i12 & 17) << 1;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        f53932b = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 0;
        while (i18 < iIntValue) {
            int i19 = f53931a;
            int i20 = ((i19 ^ 32) + ((i19 & 32) << 1)) - 1;
            int i21 = i20 % 128;
            f53932b = i21;
            if (i20 % 2 == 0) {
                int i22 = iArr[i18];
                throw null;
            }
            int i23 = iArr[i18];
            if (i23 != 0) {
                int i24 = i21 ^ 65;
                int i25 = ((i21 & 65) | i24) << 1;
                int i26 = -i24;
                int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                f53931a = i27 % 128;
                int i28 = i27 % 2;
                int i29 = -(-(iIntValue * (-661)));
                int i30 = (661 | i29) << 1;
                int i31 = -(i29 ^ 661);
                int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                int i33 = ~iIntValue;
                int i34 = (i33 | iIntValue) & i33;
                int i35 = ~i33;
                int i36 = i34 & i35;
                int i37 = (~i36) & (i34 | i35);
                int i38 = (((i36 & i37) | (i37 ^ i36)) * 1324) + i32;
                int i39 = (-1) ^ iIntValue;
                int i40 = ~((i39 & iIntValue) | (i39 ^ iIntValue));
                int i41 = iIntValue & i33;
                int i42 = i41 | i41;
                int i43 = iIntValue & iIntValue;
                int i44 = ~((i42 & i43) | (i42 ^ i43));
                int i45 = i40 & i44;
                int i46 = (i40 | i44) & (~i45);
                int i47 = (i38 - (~(-(-(((i46 & i45) | (i46 ^ i45)) * (-1324)))))) - 1;
                int i48 = ~i34;
                int i49 = ~((i48 ^ i34) | (i48 & i34));
                int i50 = (i35 & i49) | ((~i49) & i33);
                int i51 = i49 & i33;
                int i52 = -(-(((i51 & i50) | (i50 ^ i51)) * 662));
                int i53 = i47 ^ i52;
                int i54 = ((((i52 & i47) | i53) << 1) - (~(-i53))) - 1;
                int i55 = -i18;
                int i56 = i55 * 980;
                int i57 = i54 * (-978);
                int i58 = i56 & i57;
                int i59 = ((i56 ^ i57) | i58) << 1;
                int i60 = -((~i58) & (i56 | i57));
                int i61 = (i59 & i60) + (i60 | i59);
                int i62 = ~i54;
                int i63 = (~((i33 & i62) | (i62 ^ i33))) * 979;
                int i64 = i61 & i63;
                int i65 = (i63 ^ i61) | i64;
                int i66 = (i64 & i65) + (i65 | i64);
                int i67 = i55 & iIntValue;
                int i68 = (~i67) & (i55 | iIntValue);
                int i69 = (((i67 & i68) | (i68 ^ i67)) * (-979)) + i66;
                int i70 = (i62 & iIntValue) | (i62 ^ iIntValue);
                int i71 = ~i70;
                int i72 = (i70 | i71) & i71;
                int i73 = ~((i48 & i55) | ((~i55) & i34) | (i34 & i55));
                int i74 = i72 ^ i73;
                int i75 = i72 & i73;
                int i76 = -(-(((i75 & i74) | (i74 ^ i75)) * 979));
                int i77 = i69 & i76;
                z10 = false;
                ber.setDividerPadding(new Object[]{Integer.valueOf(i23), bArr, Integer.valueOf((((i76 | i69) & (~i77)) + (i77 << 1)) << 2)}, -2092293587, 2092293591, i23);
                int i78 = f53931a;
                int i79 = (i78 & 43) + (i78 | 43);
                f53932b = i79 % 128;
                int i80 = i79 % 2;
            } else {
                z10 = z11;
            }
            int i81 = (i18 & 69) + (i18 | 69);
            i18 = (i81 & (-68)) + (i81 | (-68));
            int i82 = f53932b;
            int i83 = i82 & 49;
            int i84 = (i82 ^ 49) | i83;
            int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
            f53931a = i85 % 128;
            int i86 = i85 % 2;
            z11 = z10;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        int i87 = f53931a;
        int i88 = i87 ^ 45;
        int i89 = (i87 & 45) << 1;
        int i90 = (i88 & i89) + (i89 | i88);
        f53932b = i90 % 128;
        if (i90 % 2 != 0) {
            return bigInteger;
        }
        throw null;
    }

    public static /* synthetic */ Integer w(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int[] iArr2 = (int[]) objArr[2];
        int[] iArr3 = (int[]) objArr[3];
        int i10 = f53931a + 123;
        int i11 = i10 % 128;
        f53932b = i11;
        int i12 = i10 % 2;
        long j10 = 4294967295L;
        long j11 = ((long) (-(iIntValue & 1))) & 4294967295L;
        int i13 = i11 + 69;
        f53931a = i13 % 128;
        int i14 = i13 % 2;
        long j12 = 0;
        int i15 = 0;
        while (i15 < 8) {
            int i16 = f53931a;
            int i17 = i16 & 97;
            int i18 = -(-((i16 ^ 97) | i17));
            int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
            f53932b = i19 % 128;
            int i20 = i19 % 2;
            long j13 = (((long) iArr[i15]) & j10) + (((long) iArr2[i15]) & j11) + j12;
            iArr3[i15] = (int) j13;
            j12 = j13 >>> 32;
            i15 = ((i15 ^ 2) + ((i15 & 2) << 1)) - 1;
            int i21 = i16 & 25;
            int i22 = (i16 ^ 25) | i21;
            int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
            f53932b = i23 % 128;
            int i24 = i23 % 2;
            j10 = 4294967295L;
        }
        int i25 = (int) j12;
        int i26 = f53931a;
        int i27 = i26 & 117;
        int i28 = -(-((i26 ^ 117) | i27));
        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
        f53932b = i29 % 128;
        if (i29 % 2 != 0) {
            return Integer.valueOf(i25);
        }
        int i30 = 87 / 0;
        return Integer.valueOf(i25);
    }

    public static /* synthetic */ Integer x(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        while (true) {
            int i10 = ~iIntValue;
            int i11 = (iIntValue | i10) << 1;
            int i12 = -i10;
            iIntValue = (i11 | i12) + (i11 & i12);
            if (iIntValue < 0) {
                int i13 = f53931a;
                int i14 = ((i13 ^ 55) | (i13 & 55)) << 1;
                int i15 = -(((~i13) & 55) | (i13 & (-56)));
                int i16 = (i14 & i15) + (i15 | i14);
                f53932b = i16 % 128;
                if (i16 % 2 != 0) {
                    return Integer.valueOf(iIntValue2);
                }
                throw null;
            }
            int i17 = f53931a;
            int i18 = ((i17 & (-56)) | ((~i17) & 55)) + ((55 & i17) << 1);
            int i19 = i18 % 128;
            f53932b = i19;
            if (i18 % 2 == 0) {
                int i20 = iArr[iIntValue];
                iArr[iIntValue] = iIntValue2;
                throw null;
            }
            int i21 = iArr[iIntValue];
            iArr[iIntValue] = iIntValue2;
            int i22 = (i19 ^ 89) + ((i19 & 89) << 1);
            f53931a = i22 % 128;
            int i23 = i22 % 2;
            iIntValue2 = i21;
        }
    }

    public static /* synthetic */ Integer y(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f53932b;
        int i11 = (i10 ^ 111) + ((i10 & 111) << 1);
        f53931a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 & 97;
        int i14 = (i13 - (~(-(-((i10 ^ 97) | i13))))) - 1;
        f53931a = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 8;
        while (true) {
            int i17 = ~i16;
            int i18 = (i16 | i17) << 1;
            int i19 = -i17;
            i16 = ((i18 | i19) << 1) - (i18 ^ i19);
            if (i16 < 0) {
                break;
            }
            int i20 = f53931a;
            int i21 = i20 & 47;
            int i22 = i21 + ((i20 ^ 47) | i21);
            int i23 = i22 % 128;
            f53932b = i23;
            int i24 = i22 % 2;
            int i25 = iArr[i16];
            int i26 = i25 >>> 1;
            int i27 = iIntValue << 31;
            iArr[i16] = (i27 & i26) | (i26 ^ i27);
            int i28 = i23 & 41;
            int i29 = i23 | 41;
            int i30 = (i28 & i29) + (i28 | i29);
            f53931a = i30 % 128;
            int i31 = i30 % 2;
            iIntValue = i25;
        }
        int i32 = iIntValue << 31;
        int i33 = f53932b;
        int i34 = (-2) - ((((i33 | 36) << 1) - (i33 ^ 36)) ^ (-1));
        f53931a = i34 % 128;
        if (i34 % 2 == 0) {
            return Integer.valueOf(i32);
        }
        throw null;
    }

    public static /* synthetic */ Integer z(Object[] objArr) {
        int i10 = 0;
        int[] iArr = (int[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int[] iArr2 = (int[]) objArr[2];
        int i11 = f53932b;
        int i12 = (((i11 | 116) << 1) - (i11 ^ 116)) - 1;
        f53931a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i11 ^ 119;
        int i15 = (i11 & 119) << 1;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        f53931a = i16 % 128;
        int i17 = i16 % 2;
        int i18 = iIntValue;
        while (i10 < 8) {
            int i19 = f53932b;
            int i20 = ((i19 & 102) + (i19 | 102)) - 1;
            int i21 = i20 % 128;
            f53931a = i21;
            int i22 = i20 % 2;
            int i23 = -(-(i10 * (-520)));
            int i24 = ((4176 ^ i23) | (4176 & i23)) << 1;
            int i25 = -((i23 & (-4177)) | (4176 & (~i23)));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            int i27 = ~iIntValue;
            int i28 = ~i10;
            int i29 = i27 & i10;
            int i30 = ~((i27 ^ i10) | i29);
            int i31 = i30 & 8;
            int i32 = (i30 | 8) & (~i31);
            int i33 = -(-(((i32 & i31) | (i32 ^ i31)) * (-1042)));
            int i34 = i26 & i33;
            int i35 = ((i34 + ((i26 ^ i33) | i34)) - (~((((iIntValue & i28) | i29) | (i10 & iIntValue)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY))) - 1;
            int i36 = ~(((-9) ^ i28) | (i28 & (-9)));
            int i37 = (-9) & iIntValue;
            int i38 = ((-9) | iIntValue) & (~i37);
            int i39 = ~((i38 & i37) | (i38 ^ i37));
            int i40 = i36 & i39;
            int i41 = (i39 | i36) & (~i40);
            int i42 = (i41 & i40) | (i41 ^ i40);
            int i43 = (8 & i27) | (i27 ^ 8);
            int i44 = i43 ^ i10;
            int i45 = i43 & i10;
            int i46 = (i45 & i44) | (i44 ^ i45);
            int i47 = ~i46;
            int i48 = (i46 | i47) & i47;
            int i49 = ((~i48) & i42) | ((~i42) & i48);
            int i50 = i48 & i42;
            int i51 = i35 - (~(((i50 & i49) | (i49 ^ i50)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
            int i52 = iArr[(i51 ^ (-1)) + (i51 << 1)];
            int i53 = i52 << 1;
            int i54 = i18 >>> 31;
            int i55 = ((~i54) & i53) | ((~i53) & i54);
            int i56 = i54 & i53;
            iArr2[i10] = (i56 & i55) | (i55 ^ i56);
            i10 = (((i10 | 103) << 1) - (i10 ^ 103)) - 102;
            int i57 = i21 + 53;
            f53932b = i57 % 128;
            int i58 = i57 % 2;
            i18 = i52;
        }
        int i59 = i18 >>> 31;
        int i60 = f53931a;
        int i61 = i60 & 19;
        int i62 = (i60 | 19) & (~i61);
        int i63 = -(-(i61 << 1));
        int i64 = (i62 ^ i63) + ((i62 & i63) << 1);
        f53932b = i64 % 128;
        if (i64 % 2 != 0) {
            return Integer.valueOf(i59);
        }
        throw null;
    }

    public static int setCompoundDrawableTintBlendMode(int i10, int i11, int[] iArr) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), iArr}, -380025688, 380025712, i10)).intValue();
    }

    public static BigInteger setDividerPadding(int i10, int[] iArr) {
        return (BigInteger) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr}, 218333483, -218333460, i10);
    }

    public static int setX(int i10, int[] iArr, int i11, int[] iArr2) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, Integer.valueOf(i11), iArr2}, -1850727291, 1850727294, i10)).intValue();
    }

    public static boolean setY(int i10, int[] iArr) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr}, -358164445, 358164482, i10)).booleanValue();
    }

    public static long setCompoundDrawableTintBlendMode(long[] jArr, long j10, long[] jArr2) {
        return ((Long) setOnFocusChangeListener(new Object[]{jArr, Long.valueOf(j10), jArr2}, -1779800300, 1779800329, (int) System.currentTimeMillis())).longValue();
    }

    public static int setDividerPadding(int i10, int[] iArr, int[] iArr2, int i11) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, iArr2, Integer.valueOf(i11)}, -1170765211, 1170765236, i10)).intValue();
    }

    public static long setX(int i10, long[] jArr, long j10) {
        return ((Long) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), jArr, Long.valueOf(j10)}, 1596686284, -1596686251, i10)).longValue();
    }

    public static int setY(int i10, int[] iArr, int[] iArr2) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, iArr2}, 1108035559, -1108035515, i10)).intValue();
    }

    public static int setCompoundDrawableTintBlendMode(int[] iArr, int i10, int[] iArr2) {
        return ((Integer) setOnFocusChangeListener(new Object[]{iArr, Integer.valueOf(i10), iArr2}, -1540922287, 1540922293, i10)).intValue();
    }

    public static int setDividerPadding(int[] iArr, int i10, int[] iArr2) {
        return ((Integer) setOnFocusChangeListener(new Object[]{iArr, Integer.valueOf(i10), iArr2}, -864775696, 864775701, i10)).intValue();
    }

    public static int setX(int i10, int[] iArr, int i11) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, Integer.valueOf(i11)}, -841558252, 841558293, i10)).intValue();
    }

    public static int setY(int[] iArr) {
        return ((Integer) setOnFocusChangeListener(new Object[]{iArr}, -521763818, 521763837, (int) System.currentTimeMillis())).intValue();
    }

    public static int setCompoundDrawableTintBlendMode(int i10, int[] iArr, int i11, int[] iArr2, int[] iArr3) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, Integer.valueOf(i11), iArr2, iArr3}, -1222891668, 1222891707, i10)).intValue();
    }

    public static int setDividerPadding(int i10, int[] iArr, int i11, int[] iArr2) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, Integer.valueOf(i11), iArr2}, -1008052683, 1008052691, i10)).intValue();
    }

    public static int setX(int i10, int[] iArr, int i11, int i12) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, Integer.valueOf(i11), Integer.valueOf(i12)}, 694514911, -694514881, i10)).intValue();
    }

    public static int[] setY(int i10, BigInteger bigInteger) {
        return (int[]) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), bigInteger}, 1842671690, -1842671680, i10);
    }

    public static int setCompoundDrawableTintBlendMode(int i10, int[] iArr, int i11, int i12) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, Integer.valueOf(i11), Integer.valueOf(i12)}, 716282167, -716282152, i10)).intValue();
    }

    public static boolean setDividerPadding(int i10, int[] iArr, int[] iArr2) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, iArr2}, 280624047, -280624046, i10)).booleanValue();
    }

    public static int setX(int[] iArr, int i10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{iArr, Integer.valueOf(i10)}, 214036312, -214036269, i10)).intValue();
    }

    public static long[] setY(int i10) {
        return (long[]) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10)}, 1783230509, -1783230493, i10);
    }

    public static int setCompoundDrawableTintBlendMode(int i10, int[] iArr, int i11) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, Integer.valueOf(i11)}, -668114120, 668114158, i10)).intValue();
    }

    public static int setDividerPadding(int i10, int[] iArr, int i11) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, Integer.valueOf(i11)}, -115920179, 115920214, i10)).intValue();
    }

    public static int setX(int[] iArr) {
        return ((Integer) setOnFocusChangeListener(new Object[]{iArr}, -826911596, 826911628, (int) System.currentTimeMillis())).intValue();
    }

    public static int setY(int i10, int[] iArr, int[] iArr2, int i11) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, iArr2, Integer.valueOf(i11)}, -1551455300, 1551455340, i10)).intValue();
    }

    public static long[] setCompoundDrawableTintBlendMode(int i10, BigInteger bigInteger) {
        return (long[]) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), bigInteger}, 1678029135, -1678029124, i10);
    }

    public static int setDividerPadding(int i10, int i11, int[] iArr, int i12) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), iArr, Integer.valueOf(i12)}, 167310318, -167310316, i10)).intValue();
    }

    public static int setX(int i10, int[] iArr) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr}, -703169174, 703169192, i10)).intValue();
    }

    public static int setCompoundDrawableTintBlendMode(int i10, int[] iArr) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr}, -1349612348, 1349612374, i10)).intValue();
    }

    public static int setDividerPadding(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, iArr2, iArr3}, 2040461132, -2040461110, i10)).intValue();
    }

    public static int[] setX(int i10) {
        return (int[]) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10)}, 1950542281, -1950542250, i10);
    }

    public static boolean setCompoundDrawableTintBlendMode(int i10, int[] iArr, int[] iArr2) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, iArr2}, -1279176983, 1279177025, i10)).booleanValue();
    }

    public static int setX(int i10, int[] iArr, int[] iArr2) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, iArr2}, -938296209, 938296216, i10)).intValue();
    }

    public static int setCompoundDrawableTintBlendMode(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, iArr2, iArr3}, -729001745, 729001745, i10)).intValue();
    }

    public static int setX(int i10, int i11, int[] iArr) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), iArr}, -675302000, 675302004, i10)).intValue();
    }

    public static long setOnFocusChangeListener(long[] jArr, int i10, long j10, long[] jArr2, int i11) {
        return ((Long) setOnFocusChangeListener(new Object[]{jArr, Integer.valueOf(i10), Long.valueOf(j10), jArr2, Integer.valueOf(i11)}, 965229704, -965229690, i10)).longValue();
    }

    public static boolean setOnFocusChangeListener(int i10, int[] iArr) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr}, -2060581098, 2060581111, i10)).booleanValue();
    }

    public static int setOnFocusChangeListener(int[] iArr) {
        return ((Integer) setOnFocusChangeListener(new Object[]{iArr}, -860593134, 860593162, (int) System.currentTimeMillis())).intValue();
    }

    public static int setOnFocusChangeListener(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, iArr2, iArr3}, -1557277485, 1557277512, i10)).intValue();
    }

    public static int setOnFocusChangeListener(int i10, int[] iArr, int[] iArr2) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr, iArr2}, -1807856331, 1807856377, i10)).intValue();
    }

    public static int setOnFocusChangeListener(int i10, int i11, int[] iArr) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), iArr}, 1777683852, -1777683835, i10)).intValue();
    }
}
