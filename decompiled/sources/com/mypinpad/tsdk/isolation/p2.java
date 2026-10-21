package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f57622a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57623b = 1;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
    
        if ((r5 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        r6 = 35 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (r5 >= r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.p2.f57623b + 49;
        com.mypinpad.tsdk.isolation.p2.f57622a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        if ((r1 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        r1 = (byte[]) com.mypinpad.tsdk.isolation.bek.setOnFocusChangeListener(new java.lang.Object[]{r3, java.lang.Integer.valueOf(r5)}, 575197588, -575197584, r5);
        r3 = 94 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        r1 = (byte[]) com.mypinpad.tsdk.isolation.bek.setOnFocusChangeListener(new java.lang.Object[]{r3, java.lang.Integer.valueOf(r5)}, 575197588, -575197584, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.p2.f57623b;
        r2 = (((r0 | 44) << 1) - (r0 ^ 44)) - 1;
        com.mypinpad.tsdk.isolation.p2.f57622a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if ((r2 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        r10 = (byte[]) com.mypinpad.tsdk.isolation.bek.setOnFocusChangeListener(new java.lang.Object[]{r3, java.lang.Integer.valueOf(r7)}, 575197588, -575197584, r7);
        r11 = -r7;
        r12 = r11 * 567;
        r13 = -(-(r5 * (-565)));
        r14 = r12 & r13;
        r14 = (r14 - (~(-(-((r12 ^ r13) | r14))))) - 1;
        r12 = ~r11;
        r13 = r12 ^ r5;
        r15 = r12 & r5;
        r13 = ~((r13 ^ r15) | (r13 & r15));
        r8 = ~r5;
        r16 = r12 & r8;
        r9 = r16 | ((~r12) & r5);
        r9 = ~((r9 ^ r15) | (r9 & r15));
        r9 = ((r9 & r13) | (r13 ^ r9)) * (-566);
        r13 = r14 & r9;
        r13 = (r13 - (~(-(-((r9 ^ r14) | r13))))) - 1;
        r9 = r16 | ((~r8) & r11);
        r11 = r11 & r8;
        r13 = (r13 - (~(-(-((~((r9 & r11) | (r9 ^ r11))) * 566))))) - 1;
        r9 = r12 ^ r8;
        r9 = (r9 & r16) | (r9 ^ r16);
        r11 = r9 & r5;
        r9 = (r9 | r5) & (~r11);
        r9 = (r9 & r11) | (r9 ^ r11);
        r11 = ~r9;
        r9 = ((r9 | r11) & r11) * 566;
        r11 = r13 & r9;
        r9 = (r9 | r13) & (~r11);
        r11 = r11 << 1;
        r13 = ((r9 | r11) << 1) - (r9 ^ r11);
        r9 = com.mypinpad.tsdk.isolation.p2.f57623b;
        r11 = r9 & 37;
        r9 = (r9 | 37) & (~r11);
        r11 = r11 << 1;
        r14 = (r9 & r11) + (r9 | r11);
        com.mypinpad.tsdk.isolation.p2.f57622a = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0134, code lost:
    
        if (r13 < r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0136, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.p2.f57622a;
        r11 = r9 & 35;
        r9 = -(-((r9 ^ 35) | r11));
        r14 = (r11 & r9) + (r9 | r11);
        com.mypinpad.tsdk.isolation.p2.f57623b = r14 % 128;
        r14 = r14 % 2;
        r1.setCompoundDrawableTintBlendMode(r3, 0, r7);
        r3 = new byte[r7];
        r1.setCompoundDrawableTintBlendMode(r3, 0);
        r10 = (byte[]) com.mypinpad.tsdk.isolation.bek.setOnFocusChangeListener(new java.lang.Object[]{r10, r3}, 1396275083, -1396275074, (int) java.lang.System.currentTimeMillis());
        r13 = r13 - r12;
        r13 = (r13 ^ (-1)) + (r13 << 1);
        r9 = com.mypinpad.tsdk.isolation.p2.f57622a;
        r11 = ((r9 | 17) << 1) - (((~r9) & 17) | (r9 & (-18)));
        com.mypinpad.tsdk.isolation.p2.f57623b = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0181, code lost:
    
        if (r13 <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0183, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.p2.f57622a;
        r9 = (((r6 ^ 15) | (r6 & 15)) << 1) - (((~r6) & 15) | (r6 & (-16)));
        com.mypinpad.tsdk.isolation.p2.f57623b = r9 % 128;
        r9 = r9 % 2;
        r1.setCompoundDrawableTintBlendMode(r3, 0, r7);
        r3 = new byte[r7];
        r1.setCompoundDrawableTintBlendMode(r3, 0);
        r1 = r10.length;
        r6 = r13 * 471;
        r7 = -(-(r1 * 471));
        r11 = r6 & r7;
        r9 = ((r6 ^ r7) | r11) << 1;
        r6 = -((r6 | r7) & (~r11));
        r7 = (r9 ^ r6) + ((r6 & r9) << 1);
        r6 = r13 & r1;
        r9 = (~r6) & (r13 | r1);
        r11 = ~r1;
        r6 = -(-((r6 | r9) * (-470)));
        r9 = ((~r6) & r7) | ((~r7) & r6);
        r6 = -(-((r6 & r7) << 1));
        r7 = (r9 ^ r6) + ((r6 & r9) << 1);
        r6 = ~r13;
        r9 = (r6 | r13) & r6;
        r12 = (r11 | r1) & r11;
        r9 = ~((r9 & r12) | (r9 ^ r12));
        r14 = ~r11;
        r12 = (r11 & r8) | (r5 & r14);
        r15 = r11 & r5;
        r12 = (r12 ^ r15) | (r12 & r15);
        r15 = ~r12;
        r12 = (r12 | r15) & r15;
        r15 = r9 & r12;
        r0 = (~r15) & (r9 | r12);
        r0 = (r0 & r15) | (r0 ^ r15);
        r9 = r8 & r13;
        r12 = (~r9) & (r8 | r13);
        r12 = (r12 & r9) | (r12 ^ r9);
        r15 = r12 ^ r1;
        r12 = r12 & r1;
        r12 = (r15 ^ r12) | (r12 & r15);
        r15 = ~r12;
        r12 = (r12 | r15) & r15;
        r15 = r0 & r12;
        r0 = (r0 | r12) & (~r15);
        r0 = ((r0 & r15) | (r0 ^ r15)) * (-470);
        r4 = (r7 | r0) << 1;
        r0 = -((r0 & (~r7)) | ((~r0) & r7));
        r7 = (r4 & r0) + (r0 | r4);
        r0 = (r11 & r6) | (r13 & r14);
        r4 = r11 & r13;
        r0 = (r0 & r4) | (r0 ^ r4);
        r4 = (r0 & r8) | ((~r0) & r5);
        r0 = r0 & r5;
        r0 = ~((r0 & r4) | (r4 ^ r0));
        r4 = (r8 ^ r13) | r9;
        r4 = ~((r4 & r1) | ((r4 & r11) | ((~r4) & r1)));
        r0 = (-2) - ((r7 - (~(((r0 & r4) | (r0 ^ r4)) * 470))) ^ (-1));
        r10 = (byte[]) com.mypinpad.tsdk.isolation.bek.setOnFocusChangeListener(new java.lang.Object[]{r10, java.lang.Integer.valueOf(r0)}, 575197588, -575197584, r0);
        java.lang.System.arraycopy(r3, 0, r10, r1, r13);
        r0 = com.mypinpad.tsdk.isolation.p2.f57623b;
        r1 = (r0 & 55) + (r0 | 55);
        com.mypinpad.tsdk.isolation.p2.f57622a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0277, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.p2.f57623b;
        r1 = (r0 ^ 87) + ((r0 & 87) << 1);
        com.mypinpad.tsdk.isolation.p2.f57622a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0285, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
    
        if (r5 == r7) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (r5 == r7) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.p2.f57623b;
        r2 = r1 & 107;
        r1 = -(-(r1 | 107));
        r5 = (r2 & r1) + (r1 | r2);
        com.mypinpad.tsdk.isolation.p2.f57622a = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(java.lang.Object[] r18) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.p2.a(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0054  */
    /* JADX WARN: Code duplicated, block: B:15:0x006d A[PHI: r5 r6
      0x006d: PHI (r5v7 int) = (r5v4 int), (r5v10 int) binds: [B:8:0x0034, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x006d: PHI (r6v7 int) = (r6v4 int), (r6v8 int) binds: [B:8:0x0034, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r5 r6
      0x0036: PHI (r5v5 int) = (r5v4 int), (r5v10 int) binds: [B:8:0x0034, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x0036: PHI (r6v5 int) = (r6v4 int), (r6v8 int) binds: [B:8:0x0034, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object b(Object[] objArr) {
        int length;
        int length2;
        int i10;
        int i11;
        int i12;
        short[][][] sArr = (short[][][]) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i13 = f57623b;
        int i14 = i13 & 37;
        int i15 = (i13 ^ 37) | i14;
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        f57622a = i16 % 128;
        int i17 = i16 % 2;
        int length3 = sArr.length;
        if (i17 != 0) {
            short[][] sArr2 = sArr[0];
            length = sArr2.length;
            length2 = sArr2[1].length;
            if (zBooleanValue) {
                int i18 = i13 & 123;
                int i19 = ((i13 ^ 123) | i18) << 1;
                int i20 = -((i13 | 123) & (~i18));
                i10 = ((i19 | i20) << 1) - (i20 ^ i19);
                int i21 = i10 % 128;
                f57622a = i21;
                if (i10 % 2 != 0) {
                    i11 = ((length >>> length) >> 2) * length3;
                } else {
                    i11 = ((((length & 1) + (length | 1)) * length) / 2) * length3;
                }
                i12 = (((i21 | 93) << 1) - (~(-(i21 ^ 93)))) - 1;
                f57623b = i12 % 128;
            } else {
                i11 = length3 * length * length2;
                i12 = (i13 & 13) + (i13 | 13);
                f57622a = i12 % 128;
            }
        } else {
            short[][] sArr3 = sArr[0];
            length = sArr3.length;
            length2 = sArr3[0].length;
            if (!(!zBooleanValue)) {
                int i110 = i13 & 123;
                int i111 = ((i13 ^ 123) | i110) << 1;
                int i22 = -((i13 | 123) & (~i110));
                i10 = ((i111 | i22) << 1) - (i22 ^ i111);
                int i23 = i10 % 128;
                f57622a = i23;
                if (i10 % 2 != 0) {
                    i11 = ((length >>> length) >> 2) * length3;
                } else {
                    i11 = ((((length & 1) + (length | 1)) * length) / 2) * length3;
                }
                i12 = (((i23 | 93) << 1) - (~(-(i23 ^ 93)))) - 1;
                f57623b = i12 % 128;
            } else {
                i11 = length3 * length * length2;
                i12 = (i13 & 13) + (i13 | 13);
                f57622a = i12 % 128;
            }
        }
        int i24 = i12 % 2;
        byte[] bArr = new byte[i11];
        int i25 = f57623b;
        int i26 = i25 | 13;
        int i27 = i26 << 1;
        int i28 = -((~(i25 & 13)) & i26);
        int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
        f57622a = i29 % 128;
        int i30 = i29 % 2;
        int i31 = 0;
        int i32 = 0;
        while (i31 < length) {
            int i33 = f57622a;
            int i34 = (i33 & (-72)) | ((~i33) & 71);
            int i35 = -(-((i33 & 71) << 1));
            int i36 = (i34 & i35) + (i35 | i34);
            f57623b = i36 % 128;
            int i37 = i36 % 2;
            int i38 = 0;
            while (i38 < length2) {
                int i39 = f57622a;
                int i40 = i39 & 91;
                int i41 = (i40 - (~(-(-((i39 ^ 91) | i40))))) - 1;
                f57623b = i41 % 128;
                int i42 = i41 % 2;
                int i43 = 0;
                while (i43 < length3) {
                    int i44 = f57623b;
                    int i45 = i44 & 109;
                    int i46 = (((i44 ^ 109) | i45) << 1) - ((i44 | 109) & (~i45));
                    int i47 = i46 % 128;
                    f57622a = i47;
                    if (i46 % 2 != 0) {
                        int i48 = 60 / 0;
                        if (zBooleanValue) {
                            if (i31 <= i38) {
                            }
                        }
                        i43++;
                        int i49 = i47 ^ 17;
                        int i50 = ((i47 & 17) | i49) << 1;
                        int i51 = -i49;
                        int i52 = (i50 & i51) + (i50 | i51);
                        f57623b = i52 % 128;
                        int i53 = i52 % 2;
                    } else {
                        if (!(!zBooleanValue)) {
                            if (i31 <= i38) {
                            }
                        }
                        i43++;
                        int i410 = i47 ^ 17;
                        int i54 = ((i47 & 17) | i410) << 1;
                        int i55 = -i410;
                        int i56 = (i54 & i55) + (i54 | i55);
                        f57623b = i56 % 128;
                        int i57 = i56 % 2;
                    }
                    bArr[i32] = (byte) sArr[i43][i31][i38];
                    int i58 = i32 & 1;
                    i32 = ((((i32 ^ 1) | i58) << 1) - (~(-((i32 | 1) & (~i58))))) - 1;
                    int i59 = (i47 ^ 17) + ((i47 & 17) << 1);
                    f57623b = i59 % 128;
                    int i60 = i59 % 2;
                    i43++;
                    int i411 = i47 ^ 17;
                    int i510 = ((i47 & 17) | i411) << 1;
                    int i511 = -i411;
                    int i512 = (i510 & i511) + (i510 | i511);
                    f57623b = i512 % 128;
                    int i513 = i512 % 2;
                }
                int i61 = (i38 & 45) | ((~i38) & (-46));
                int i62 = -(-((i38 & (-46)) << 1));
                int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                int i64 = (i63 & (-48)) | ((~i63) & 47);
                int i65 = -(-((i63 & 47) << 1));
                i38 = ((i64 & i65) << 1) + (i64 ^ i65);
                int i66 = f57623b + 121;
                f57622a = i66 % 128;
                int i67 = i66 % 2;
            }
            int i68 = (-2) - ((i31 + 39) ^ (-1));
            int i69 = (i68 & 36) | ((~i68) & (-37));
            int i70 = -(-((i68 & (-37)) << 1));
            i31 = (i70 | i69) + (i69 & i70);
            int i71 = f57622a;
            int i72 = (i71 & 83) + (i71 | 83);
            f57623b = i72 % 128;
            int i73 = i72 % 2;
        }
        int i74 = f57623b;
        int i75 = (i74 ^ 91) + ((i74 & 91) << 1);
        f57622a = i75 % 128;
        int i76 = i75 % 2;
        return bArr;
    }

    public static /* synthetic */ Integer c(Object[] objArr) {
        int i10 = 0;
        short[][][] sArr = (short[][][]) objArr[0];
        int i11 = 1;
        byte[] bArr = (byte[]) objArr[1];
        int i12 = 2;
        int iIntValue = ((Number) objArr[2]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i13 = f57623b;
        int i14 = i13 & 11;
        int i15 = i14 + ((i13 ^ 11) | i14);
        int i16 = i15 % 128;
        f57622a = i16;
        int i17 = i15 % 2;
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        int length2 = sArr2.length;
        int length3 = sArr2[0].length;
        int i18 = (((i16 ^ 53) | (i16 & 53)) << 1) - (((~i16) & 53) | (i16 & (-54)));
        f57623b = i18 % 128;
        int i19 = i18 % 2;
        int i20 = 0;
        int i21 = 0;
        while (i20 < length2) {
            int i22 = f57623b;
            int i23 = ((i22 ^ 59) | (i22 & 59)) << i11;
            int i24 = -(((~i22) & 59) | (i22 & (-60)));
            int i25 = ((i23 | i24) << i11) - (i24 ^ i23);
            int i26 = i25 % 128;
            f57622a = i26;
            int i27 = i25 % i12;
            int i28 = (((i26 ^ 25) | (i26 & 25)) << i11) - (((~i26) & 25) | (i26 & (-26)));
            f57623b = i28 % 128;
            int i29 = i28 % i12;
            int i30 = i10;
            while (i30 < length3) {
                int i31 = f57623b;
                int i32 = ((i31 ^ 119) | (i31 & 119)) << i11;
                int i33 = -(((~i31) & 119) | (i31 & (-120)));
                int i34 = (i32 ^ i33) + ((i33 & i32) << i11);
                f57622a = i34 % 128;
                int i35 = (i34 % i12 != 0 ? i10 : i11) ^ i11;
                while (i35 < length) {
                    int i36 = f57622a;
                    int i37 = i36 & 43;
                    int i38 = (i36 ^ 43) | i37;
                    int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                    int i40 = i39 % 128;
                    f57623b = i40;
                    if (i39 % i12 == 0) {
                        throw null;
                    }
                    if (!zBooleanValue || i20 <= i30) {
                        short[] sArr3 = sArr[i35][i20];
                        int i41 = ~i21;
                        int i42 = (i21 & (-94)) | (i41 & 93);
                        int i43 = (i21 & 93) << 1;
                        int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
                        int i45 = i21 * 659;
                        int i46 = -(-(iIntValue * (-657)));
                        int i47 = i45 & i46;
                        int i48 = -(-((i46 ^ i45) | i47));
                        int i49 = (i47 ^ i48) + ((i47 & i48) << 1);
                        int i50 = ~iIntValue;
                        int i51 = (i41 & i50) | ((~i41) & iIntValue);
                        int i52 = i41 & iIntValue;
                        int i53 = ~((i51 ^ i52) | (i51 & i52));
                        int i54 = i50 & i21;
                        int i55 = (i50 ^ i21) | i54;
                        int i56 = ~i55;
                        int i57 = i53 | ((i55 | i56) & i56);
                        int i58 = i54 | i52;
                        int i59 = i21 & iIntValue;
                        int i60 = ~((i58 ^ i59) | (i58 & i59));
                        int i61 = ((~i60) & i57) | ((~i57) & i60);
                        int i62 = i57 & i60;
                        int i63 = ((i62 & i61) | (i61 ^ i62)) * (-658);
                        int i64 = i49 ^ i63;
                        int i65 = (i63 & i49) << 1;
                        int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                        int i67 = (i50 | iIntValue) & i50;
                        int i68 = i67 & i21;
                        int i69 = (~i68) & (i67 | i21);
                        int i70 = ((~((i69 & i68) | (i69 ^ i68))) * 658) + i66;
                        int i71 = (i67 ^ i21) | i68;
                        int i72 = ~i71;
                        int i73 = (i71 | i72) & i72;
                        int i74 = i58 | i59;
                        int i75 = ~i74;
                        int i76 = (i74 | i75) & i75;
                        int i77 = i73 ^ i76;
                        int i78 = i76 & i73;
                        int i79 = ((i78 & i77) | (i77 ^ i78)) * 658;
                        int i80 = i70 & i79;
                        int i81 = ((i70 ^ i79) | i80) << 1;
                        int i82 = -((i79 | i70) & (~i80));
                        sArr3[i30] = (short) (bArr[(i81 & i82) + (i82 | i81)] & 255);
                        int i83 = i40 & 65;
                        int i84 = ((((i40 ^ 65) | i83) << 1) - (~(-((~i83) & (i40 | 65))))) - 1;
                        f57622a = i84 % 128;
                        int i85 = i84 % 2;
                        i21 = ((i44 | (-92)) << 1) - (i44 ^ (-92));
                    }
                    i35++;
                    int i86 = f57622a;
                    int i87 = i86 & 17;
                    int i88 = (i86 | 17) & (~i87);
                    int i89 = i87 << 1;
                    int i90 = ((i88 | i89) << 1) - (i88 ^ i89);
                    f57623b = i90 % 128;
                    int i91 = i90 % 2;
                    zBooleanValue = zBooleanValue;
                    length = length;
                    sArr = sArr;
                    length3 = length3;
                    length2 = length2;
                    i12 = 2;
                }
                short[][][] sArr4 = sArr;
                i30++;
                int i92 = f57623b;
                int i93 = (i92 & 47) + (i92 | 47);
                f57622a = i93 % 128;
                int i94 = i93 % 2;
                zBooleanValue = zBooleanValue;
                length = length;
                sArr = sArr4;
                length3 = length3;
                length2 = length2;
                i10 = 0;
                i11 = 1;
                i12 = 2;
            }
            short[][][] sArr5 = sArr;
            i20 = (i20 ^ 1) + ((i20 & 1) << 1);
            int i95 = f57623b;
            int i96 = i95 & 45;
            int i97 = i96 + ((i95 ^ 45) | i96);
            f57622a = i97 % 128;
            int i98 = i97 % 2;
            zBooleanValue = zBooleanValue;
            length = length;
            sArr = sArr5;
            length3 = length3;
            length2 = length2;
            i10 = 0;
            i11 = 1;
            i12 = 2;
        }
        int i99 = f57623b;
        int i100 = (i99 ^ 13) + ((i99 & 13) << 1);
        f57622a = i100 % 128;
        int i101 = i100 % 2;
        return Integer.valueOf(i21);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0128  */
    public static /* synthetic */ Serializable d(Object[] objArr, int i10, int i11, int i12) {
        Object objB;
        int i13;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i14 | i15;
        int i17 = ~i16;
        int i18 = ~i12;
        int i19 = (((~(i10 | i15 | i12)) | (~(i11 | i14)) | (~(i14 | i18))) * 168) + ((~(i16 | i12)) * 168) + ((i17 | (~(i15 | i18))) * 168) + (i11 * (-167)) + (i10 * (-167));
        int i20 = 0;
        int i21 = 2;
        int i22 = 1;
        switch (i19) {
            case 1:
                objB = b(objArr);
                break;
            case 2:
                objB = f(objArr);
                break;
            case 3:
                objB = g(objArr);
                break;
            case 4:
                short[][] sArr = (short[][]) objArr[0];
                int i23 = f57622a;
                int i24 = ((i23 ^ 3) | (i23 & 3)) << 1;
                int i25 = -((3 & (~i23)) | (i23 & (-4)));
                int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                f57623b = i26 % 128;
                int i27 = i26 % 2;
                int length = sArr.length;
                int length2 = sArr[0].length;
                byte[] bArr = new byte[length * length2];
                int i28 = (i23 & 63) + (i23 | 63);
                f57623b = i28 % 128;
                int i29 = 2;
                int i30 = i28 % 2;
                int i31 = 0;
                while (i31 < length2) {
                    int i32 = f57622a;
                    int i33 = i32 + 53;
                    f57623b = i33 % 128;
                    int i34 = i33 % i29;
                    int i35 = i32 + 91;
                    f57623b = i35 % 128;
                    int i36 = i35 % i29;
                    int i37 = 0;
                    while (i37 < length) {
                        int i38 = f57622a;
                        int i39 = i38 & 111;
                        int i40 = i38 | 111;
                        int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                        f57623b = i41 % 128;
                        int i42 = i41 % 2;
                        int i43 = i31 * length;
                        int iCurrentTimeMillis = (int) System.currentTimeMillis();
                        int i44 = i37 * (-1335);
                        int i45 = -(-(i43 * (-667)));
                        int i46 = i44 ^ i45;
                        int i47 = -(-((i44 & i45) << 1));
                        int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                        int i49 = ~i43;
                        int i50 = (i43 | i49) & i49;
                        int i51 = (~iCurrentTimeMillis) & i37;
                        int i52 = ~i37;
                        int i53 = i51 | (iCurrentTimeMillis & i52);
                        int i54 = i37 & iCurrentTimeMillis;
                        int i55 = (i53 & i54) | (i53 ^ i54);
                        int i56 = ~i55;
                        int i57 = i50 ^ i56;
                        int i58 = i56 & i50;
                        int i59 = -(-(((i58 & i57) | (i57 ^ i58)) * (-668)));
                        int i60 = (i48 & i59) + (i48 | i59);
                        int i61 = (iCurrentTimeMillis & i49) | (i49 ^ iCurrentTimeMillis);
                        int i62 = ~i61;
                        int i63 = (i61 | i62) & i62;
                        int i64 = ((~i63) & i37) | (i52 & i63);
                        int i65 = i63 & i37;
                        int i66 = -(-(((i65 & i64) | (i64 ^ i65)) * 1336));
                        int i67 = ((i60 ^ i66) | (i60 & i66)) << 1;
                        int i68 = -((i66 & (~i60)) | ((~i66) & i60));
                        int i69 = (i67 & i68) + (i68 | i67);
                        int i70 = -(~((i50 | i55) * 668));
                        bArr[((i69 & i70) + (i70 | i69)) - 1] = (byte) sArr[i37][i31];
                        i37 = ((i37 & 2) + (i37 | 2)) - 1;
                        int i71 = f57623b;
                        int i72 = ((i71 ^ 33) | (i71 & 33)) << 1;
                        int i73 = -(((~i71) & 33) | (i71 & (-34)));
                        int i74 = (i72 ^ i73) + ((i73 & i72) << 1);
                        f57622a = i74 % 128;
                        int i75 = i74 % 2;
                    }
                    int i76 = ((i31 & 80) | ((~i31) & (-81))) + ((i31 & (-81)) << 1);
                    int i77 = i76 & 82;
                    int i78 = (i76 | 82) & (~i77);
                    int i79 = i77 << 1;
                    i31 = (i78 ^ i79) + ((i78 & i79) << 1);
                    int i80 = f57622a;
                    int i81 = ((i80 | 117) << 1) - (i80 ^ 117);
                    f57623b = i81 % 128;
                    int i82 = i81 % 2;
                    i29 = 2;
                }
                int i83 = f57623b;
                int i84 = i83 & 37;
                int i85 = -(-((i83 ^ 37) | i84));
                int i86 = (i84 ^ i85) + ((i85 & i84) << 1);
                f57622a = i86 % 128;
                int i87 = i86 % 2;
                objB = bArr;
                break;
            case 5:
                objB = e(objArr);
                break;
            case 6:
                SecureRandom secureRandom = (SecureRandom) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i88 = f57623b;
                int i89 = i88 ^ 59;
                int i90 = (i88 & 59) << 1;
                int i91 = (i89 & i90) + (i90 | i89);
                f57622a = i91 % 128;
                int i92 = i91 % 2;
                byte[] bArr2 = new byte[iIntValue * iIntValue2];
                secureRandom.nextBytes(bArr2);
                short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, iIntValue, iIntValue2);
                int i93 = f57622a;
                int i94 = i93 ^ 45;
                int i95 = ((i93 & 45) | i94) << 1;
                int i96 = -i94;
                int i97 = (i95 & i96) + (i95 | i96);
                f57623b = i97 % 128;
                int i98 = i97 % 2;
                int i99 = 0;
                while (i99 < iIntValue2) {
                    int i100 = f57623b;
                    int i101 = ((i100 & 16) + (i100 | 16)) - 1;
                    int i102 = i101 % 128;
                    f57622a = i102;
                    int i103 = i101 % i21;
                    int i104 = ((i102 | 83) << i22) - (i102 ^ 83);
                    f57623b = i104 % 128;
                    int i105 = i104 % i21;
                    int i106 = i20;
                    while (i106 < iIntValue) {
                        int i107 = f57623b;
                        int i108 = i107 + 27;
                        f57622a = i108 % 128;
                        int i109 = i108 % i21;
                        short[] sArr3 = sArr2[i106];
                        int i110 = i99 * iIntValue;
                        int i111 = i106 * (-751);
                        int i112 = i110 * (-751);
                        int i113 = (i111 ^ i112) + ((i111 & i112) << i22);
                        int i114 = ~i106;
                        int i115 = ~i110;
                        int i116 = i114 & i115;
                        int i117 = ~((i114 ^ i115) | i116);
                        int i118 = i114 & (i114 | i106);
                        int i119 = ((~iIntValue) & i118) | ((~i118) & iIntValue);
                        int i120 = i118 & iIntValue;
                        int i121 = ~((i120 & i119) | (i119 ^ i120));
                        int i122 = i117 ^ i121;
                        int i123 = i121 & i117;
                        int i124 = -(-(((i123 & i122) | (i122 ^ i123)) * ReturnCode.ERR_CONN_IO));
                        int i125 = i113 & i124;
                        int i126 = (i124 ^ i113) | i125;
                        int i127 = (i125 ^ i126) + ((i126 & i125) << 1);
                        int i128 = i114 | i110;
                        int i129 = -(~((~((i128 & iIntValue) | (i128 ^ iIntValue))) * (-1504)));
                        int i130 = ((i127 ^ i129) + ((i129 & i127) << 1)) - 1;
                        int i131 = i116 | ((~i114) & i110);
                        int i132 = i114 & i110;
                        int i133 = (i131 & i132) | (i131 ^ i132);
                        int i134 = ~i133;
                        int i135 = (i133 | i134) & i134;
                        int i136 = ~(i116 | ((~i115) & i106) | (i115 & i106));
                        int i137 = ((~i136) & i135) | ((~i135) & i136);
                        int i138 = i135 & i136;
                        int i139 = -(~(-(-(((i138 & i137) | (i137 ^ i138)) * 752))));
                        sArr3[i99] = (short) (bArr2[((i130 ^ i139) + ((i139 & i130) << 1)) - 1] & 255);
                        i106 = ((i106 & (-2)) | (i114 & 1)) + ((i106 & 1) << 1);
                        int i140 = (i107 & 61) + (i107 | 61);
                        f57622a = i140 % 128;
                        int i141 = i140 % 2;
                        i21 = 2;
                        i22 = 1;
                    }
                    i99++;
                    int i142 = f57622a + 29;
                    f57623b = i142 % 128;
                    int i143 = i142 % 2;
                    i20 = 0;
                    i21 = 2;
                    i22 = 1;
                }
                int i144 = f57623b;
                int i145 = i144 & 41;
                int i146 = i145 + ((i144 ^ 41) | i145);
                f57622a = i146 % 128;
                int i147 = i146 % 2;
                objB = sArr2;
                break;
            case 7:
                SecureRandom secureRandom2 = (SecureRandom) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                int iIntValue4 = ((Number) objArr[2]).intValue();
                int iIntValue5 = ((Number) objArr[3]).intValue();
                boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
                if (!zBooleanValue) {
                    i13 = iIntValue3 * iIntValue4 * iIntValue5;
                    int i148 = f57623b;
                    int i149 = i148 ^ 9;
                    int i150 = ((i148 & 9) | i149) << 1;
                    int i151 = -i149;
                    int i152 = (i150 & i151) + (i150 | i151);
                    f57622a = i152 % 128;
                    int i153 = i152 % 2;
                } else {
                    int i154 = f57622a;
                    int i155 = i154 ^ 63;
                    int i156 = ((((i154 & 63) | i155) << 1) - (~(-i155))) - 1;
                    f57623b = i156 % 128;
                    int i157 = i156 % 2;
                    int i158 = (iIntValue4 & (-2)) | ((~iIntValue4) & 1);
                    int i159 = -(-((iIntValue4 & 1) << 1));
                    int i160 = i154 + 61;
                    f57623b = i160 % 128;
                    int i161 = i160 % 2;
                    i13 = ((((i158 & i159) + (i158 | i159)) * iIntValue4) / 2) * iIntValue3;
                }
                byte[] bArr3 = new byte[i13];
                secureRandom2.nextBytes(bArr3);
                short[][][] sArr4 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, iIntValue3, iIntValue4, iIntValue5);
                int i162 = f57622a + 67;
                f57623b = i162 % 128;
                int i163 = i162 % 2;
                int i164 = 0;
                int i165 = 0;
                while (i164 < iIntValue4) {
                    int i166 = f57623b;
                    int i167 = ((i166 & 62) + (i166 | 62)) - 1;
                    int i168 = i167 % 128;
                    f57622a = i168;
                    int i169 = i167 % 2;
                    int i170 = (((i168 & (-2)) | ((~i168) & 1)) - (~(-(-((i168 & 1) << 1))))) - 1;
                    f57623b = i170 % 128;
                    int i171 = i170 % 2;
                    int i172 = 0;
                    while (i172 < iIntValue5) {
                        int i173 = f57623b;
                        int i174 = i173 & 37;
                        int i175 = (i174 - (~(-(-((i173 ^ 37) | i174))))) - 1;
                        f57622a = i175 % 128;
                        int i176 = i175 % 2;
                        int i177 = i173 + 45;
                        f57622a = i177 % 128;
                        int i178 = i177 % 2;
                        int i179 = 0;
                        while (i179 < iIntValue3) {
                            int i180 = f57622a;
                            int i181 = i180 & 65;
                            int i182 = (i180 ^ 65) | i181;
                            int i183 = (i181 ^ i182) + ((i182 & i181) << 1);
                            int i184 = i183 % 128;
                            f57623b = i184;
                            int i185 = i183 % 2;
                            if (zBooleanValue) {
                                int i186 = (((i184 & (-10)) | ((~i184) & 9)) - (~((i184 & 9) << 1))) - 1;
                                f57622a = i186 % 128;
                                int i187 = i186 % 2;
                                if (i164 <= i172) {
                                    int i188 = ((i165 | 1) << 1) - (i165 ^ 1);
                                    sArr4[i179][i164][i172] = (short) (bArr3[i165] & 255);
                                    int i189 = f57622a;
                                    int i190 = ((i189 ^ 126) + ((i189 & 126) << 1)) - 1;
                                    f57623b = i190 % 128;
                                    int i191 = i190 % 2;
                                    i165 = i188;
                                }
                            } else {
                                int i1810 = ((i165 | 1) << 1) - (i165 ^ 1);
                                sArr4[i179][i164][i172] = (short) (bArr3[i165] & 255);
                                int i1811 = f57622a;
                                int i192 = ((i1811 ^ 126) + ((i1811 & 126) << 1)) - 1;
                                f57623b = i192 % 128;
                                int i193 = i192 % 2;
                                i165 = i1810;
                            }
                            int i194 = i179 + 111;
                            int i195 = (i194 | (-110)) << 1;
                            int i196 = -(i194 ^ (-110));
                            i179 = ((i196 & i195) << 1) + (i195 ^ i196);
                            int i197 = f57622a;
                            int i198 = i197 ^ 57;
                            int i199 = ((i197 & 57) | i198) << 1;
                            int i200 = -i198;
                            int i201 = (i199 ^ i200) + ((i199 & i200) << 1);
                            f57623b = i201 % 128;
                            int i202 = i201 % 2;
                        }
                        i172 = (-2) - ((((i172 | 2) << 1) - (i172 ^ 2)) ^ (-1));
                        int i203 = f57622a + 61;
                        f57623b = i203 % 128;
                        int i204 = i203 % 2;
                    }
                    int i205 = i164 + 79;
                    i164 = (((i205 | (-78)) << 1) - (~(-(((~i205) & (-78)) | (i205 & 77))))) - 1;
                    int i206 = f57623b;
                    int i207 = (i206 ^ 99) + ((i206 & 99) << 1);
                    f57622a = i207 % 128;
                    int i208 = i207 % 2;
                }
                int i209 = f57622a;
                int i210 = ((i209 | 69) << 1) - (i209 ^ 69);
                f57623b = i210 % 128;
                int i211 = i210 % 2;
                objB = sArr4;
                break;
            case 8:
                objB = c(objArr);
                break;
            default:
                objB = a(objArr);
                break;
        }
        return (Serializable) objB;
    }

    public static /* synthetic */ Object e(Object[] objArr) {
        short[][][] sArr = (short[][][]) objArr[0];
        int i10 = f57622a + 9;
        f57623b = i10 % 128;
        int i11 = i10 % 2;
        short[][][] sArr2 = (short[][][]) Array.newInstance((Class<?>) short[].class, sArr.length, sArr[0].length);
        int i12 = f57623b;
        int i13 = ((((i12 ^ 43) | (i12 & 43)) << 1) - (~(-(((~i12) & 43) | (i12 & (-44)))))) - 1;
        f57622a = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 0;
        while (i15 < sArr.length) {
            int i16 = f57623b;
            int i17 = (i16 & (-32)) | ((~i16) & 31);
            int i18 = -(-((i16 & 31) << 1));
            int i19 = (i17 & i18) + (i17 | i18);
            f57622a = i19 % 128;
            int i20 = i19 % 2;
            int i21 = i16 + 67;
            f57622a = i21 % 128;
            int i22 = i21 % 2;
            int i23 = 0;
            while (i23 < sArr[0].length) {
                int i24 = f57623b + 13;
                f57622a = i24 % 128;
                int i25 = i24 % 2;
                sArr2[i15][i23] = (short[]) bek.setOnFocusChangeListener(new Object[]{sArr[i15][i23]}, -54945966, 54945974, (int) System.currentTimeMillis());
                int i26 = i23 & (-47);
                int i27 = -(-((i23 ^ (-47)) | i26));
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                int i29 = (i28 & (-49)) | ((~i28) & 48);
                int i30 = (i28 & 48) << 1;
                i23 = (i29 | i30) + (i29 & i30);
                int i31 = f57623b;
                int i32 = (i31 | 13) << 1;
                int i33 = -(i31 ^ 13);
                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                f57622a = i34 % 128;
                int i35 = i34 % 2;
            }
            int i36 = (i15 ^ (-116)) + ((i15 & (-116)) << 1);
            int i37 = (i36 ^ (-1)) + (i36 << 1);
            i15 = ((i37 ^ 119) + ((i37 & 119) << 1)) - 1;
            int i38 = f57623b;
            int i39 = i38 & 75;
            int i40 = (i38 ^ 75) | i39;
            int i41 = (i39 & i40) + (i40 | i39);
            f57622a = i41 % 128;
            int i42 = i41 % 2;
        }
        int i43 = f57622a;
        int i44 = i43 & 105;
        int i45 = -(-(i43 | 105));
        int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
        f57623b = i46 % 128;
        if (i46 % 2 != 0) {
            return sArr2;
        }
        throw null;
    }

    public static /* synthetic */ Object f(Object[] objArr) {
        short[][] sArr = (short[][]) objArr[0];
        int i10 = f57623b + 99;
        int i11 = i10 % 128;
        f57622a = i11;
        int i12 = i10 % 2;
        short[][] sArr2 = new short[sArr.length][];
        int i13 = ((i11 | 41) << 1) - (i11 ^ 41);
        f57623b = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 0;
        while (i15 < sArr.length) {
            int i16 = f57622a + 41;
            f57623b = i16 % 128;
            int i17 = i16 % 2;
            sArr2[i15] = (short[]) bek.setOnFocusChangeListener(new Object[]{sArr[i15]}, -54945966, 54945974, (int) System.currentTimeMillis());
            int i18 = i15 - 123;
            int i19 = (i18 ^ (-1)) + (i18 << 1);
            int i20 = i19 ^ 125;
            int i21 = (i19 & 125) << 1;
            i15 = (i20 | i21) + (i20 & i21);
            int i22 = f57622a + 9;
            f57623b = i22 % 128;
            int i23 = i22 % 2;
        }
        int i24 = f57623b;
        int i25 = i24 & 65;
        int i26 = ((i24 ^ 65) | i25) << 1;
        int i27 = -((i24 | 65) & (~i25));
        int i28 = (i26 & i27) + (i27 | i26);
        f57622a = i28 % 128;
        if (i28 % 2 == 0) {
            return sArr2;
        }
        throw null;
    }

    public static /* synthetic */ Integer g(Object[] objArr) {
        int length;
        int length2;
        int i10;
        int i11 = 0;
        short[][] sArr = (short[][]) objArr[0];
        int i12 = 1;
        byte[] bArr = (byte[]) objArr[1];
        int i13 = 2;
        int iIntValue = ((Number) objArr[2]).intValue();
        int i14 = f57623b + 5;
        int i15 = i14 % 128;
        f57622a = i15;
        if (i14 % 2 != 0) {
            length = sArr.length;
            length2 = sArr[1].length;
            i10 = 1;
        } else {
            length = sArr.length;
            length2 = sArr[0].length;
            i10 = 0;
        }
        int i16 = (-2) - (((i15 & 78) + (i15 | 78)) ^ (-1));
        f57623b = i16 % 128;
        int i17 = i16 % 2;
        while (i10 < length2) {
            int i18 = f57622a + 29;
            f57623b = i18 % 128;
            int i19 = i18 % i13;
            int i20 = i11;
            while (i20 < length) {
                int i21 = f57623b;
                int i22 = ((i21 ^ 21) | (i21 & 21)) << i12;
                int i23 = -(((~i21) & 21) | (i21 & (-22)));
                int i24 = (i22 & i23) + (i23 | i22);
                int i25 = i24 % 128;
                f57622a = i25;
                int i26 = i24 % i13;
                short[] sArr2 = sArr[i20];
                int i27 = i10 * length;
                int i28 = i27 * (-500);
                int i29 = -(-(iIntValue * (-500)));
                int i30 = (i28 ^ i29) + ((i28 & i29) << i12);
                int i31 = ~iIntValue;
                int i32 = ~i27;
                int i33 = i31 & i32;
                int i34 = ~i31;
                int i35 = i33 | (i27 & i34);
                int i36 = i31 & i27;
                int i37 = ~((i35 ^ i36) | (i35 & i36));
                short[][] sArr3 = sArr;
                int i38 = i32 & iIntValue;
                int i39 = length;
                int i40 = i38 | ((~i38) & (i32 | iIntValue));
                int i41 = i40 & iIntValue;
                int i42 = length2;
                int i43 = (i40 | iIntValue) & (~i41);
                int i44 = (i43 & i41) | (i43 ^ i41);
                int i45 = ~i44;
                int i46 = (i44 | i45) & i45;
                int i47 = i37 & i46;
                int i48 = (i46 | i37) & (~i47);
                int i49 = (((i48 & i47) | (i48 ^ i47)) * 501) + i30;
                int i50 = (~i33) & (i32 | i31);
                int i51 = (~((i33 & i50) | (i50 ^ i33))) * 1002;
                int i52 = ((~i51) & i49) | ((~i49) & i51);
                int i53 = (i51 & i49) << 1;
                int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                int i55 = (i32 | i27) & i32;
                int i56 = (i55 & i34) | ((~i55) & i31);
                int i57 = i55 & i31;
                int i58 = (i57 & i56) | (i56 ^ i57);
                int i59 = (i58 & iIntValue) | (i58 ^ iIntValue);
                int i60 = ~i59;
                int i61 = ((i59 | i60) & i60) * 501;
                int i62 = i54 & i61;
                int i63 = (i61 | i54) & (~i62);
                int i64 = i62 << 1;
                int i65 = (i63 & i64) + (i63 | i64);
                int i66 = i20 * (-159);
                int i67 = i65 * (-159);
                int i68 = (i66 & i67) + (i66 | i67);
                int i69 = ~i20;
                int i70 = (i69 | i20) & i69;
                int i71 = -(-(((i70 & i65) | (i65 ^ i70)) * 160));
                int i72 = ((i68 | i71) << 1) - (i71 ^ i68);
                int i73 = (i31 | iIntValue) & i31;
                int i74 = i73 | i20;
                int i75 = ~i74;
                int i76 = (i74 | i75) & i75;
                int i77 = ~i65;
                int i78 = (i69 & i65) | (i20 & i77);
                int i79 = i65 & i20;
                int i80 = ~((i78 & i79) | (i78 ^ i79));
                int i81 = ((~i80) & i76) | ((~i76) & i80);
                int i82 = i80 & i76;
                int i83 = -(~(-(-(((i82 & i81) | (i81 ^ i82)) * (-160)))));
                int i84 = ((~i73) & i77) | ((~i77) & i73);
                int i85 = i73 & i77;
                int i86 = ~((i85 & i84) | (i84 ^ i85));
                int i87 = i20 ^ i86;
                int i88 = i86 & i20;
                sArr2[i10] = (short) (bArr[(((-2) - ((((i72 | i83) << 1) - (i83 ^ i72)) ^ (-1))) - (~(((i88 & i87) | (i87 ^ i88)) * 160))) - 1] & 255);
                int i89 = i20 + 2;
                i20 = (i89 ^ (-1)) + (i89 << 1);
                int i90 = ((i25 | 66) << 1) - (i25 ^ 66);
                int i91 = (i90 ^ (-1)) + (i90 << 1);
                f57623b = i91 % 128;
                int i92 = i91 % 2;
                sArr = sArr3;
                length = i39;
                length2 = i42;
                i12 = 1;
                i13 = 2;
            }
            int i93 = i10 & (-90);
            int i94 = (i93 - (~((i10 ^ (-90)) | i93))) - 1;
            int i95 = i94 ^ 91;
            int i96 = -(-((i94 & 91) << 1));
            i10 = ((i95 | i96) << 1) - (i96 ^ i95);
            int i97 = f57623b + 35;
            f57622a = i97 % 128;
            int i98 = i97 % 2;
            sArr = sArr;
            length = length;
            length2 = length2;
            i11 = 0;
            i12 = 1;
            i13 = 2;
        }
        int i99 = length * length2;
        int i100 = f57623b;
        int i101 = i100 & 119;
        int i102 = (i100 ^ 119) | i101;
        int i103 = (i101 ^ i102) + ((i102 & i101) << 1);
        f57622a = i103 % 128;
        if (i103 % 2 == 0) {
            return Integer.valueOf(i99);
        }
        int i104 = 36 / 0;
        return Integer.valueOf(i99);
    }
}
