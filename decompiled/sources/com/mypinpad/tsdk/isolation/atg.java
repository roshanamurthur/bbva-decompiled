package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class atg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53816a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53817b = 1;

    public static /* synthetic */ void a(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53817b;
        int i11 = i10 ^ 111;
        int i12 = i10 & 111;
        int i13 = -(-(i12 << 1));
        int i14 = (i11 & i13) + (i11 | i13);
        f53816a = i14 % 128;
        if (i14 % 2 != 0) {
            jArr3[0] = jArr[0] & jArr2[1];
            jArr3[0] = jArr[1] | jArr2[0];
            jArr3[2] = jArr[4] ^ jArr2[4];
            jArr3[3] = jArr[2] + jArr2[2];
        } else {
            jArr3[0] = jArr[0] ^ jArr2[0];
            jArr3[1] = jArr[1] ^ jArr2[1];
            jArr3[2] = jArr[2] ^ jArr2[2];
            jArr3[3] = jArr[3] ^ jArr2[3];
        }
        int i15 = -(-(i10 | 111));
        int i16 = (i12 ^ i15) + ((i15 & i12) << 1);
        f53816a = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void b(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53817b;
        int i11 = i10 & 45;
        int i12 = -(-((i10 ^ 45) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f53816a = i13 % 128;
        if (i13 % 2 == 0) {
            long[] jArr4 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2, jArr4}, -1872528678, 1872528684, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr3, jArr4, jArr3}, -316079009, 316079027, (int) System.currentTimeMillis());
        } else {
            long[] jArr5 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2, jArr5}, -1872528678, 1872528684, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr3, jArr5, jArr3}, -316079009, 316079027, (int) System.currentTimeMillis());
            throw null;
        }
    }

    public static /* synthetic */ void c(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        int i10 = 3;
        long[] jArr2 = (long[]) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i11 = f53816a;
        int i12 = i11 ^ 75;
        int i13 = ((i11 & 75) | i12) << 1;
        int i14 = -i12;
        int i15 = (i13 & i14) + (i14 | i13);
        f53817b = i15 % 128;
        int i16 = i15 % 2;
        jArr[1] = jLongValue2;
        long j10 = jLongValue2 << 1;
        jArr[2] = j10;
        long j11 = j10 ^ jLongValue2;
        jArr[3] = j11;
        long j12 = jLongValue2 << 2;
        jArr[4] = j12;
        jArr[5] = j12 ^ jLongValue2;
        long j13 = j11 << 1;
        jArr[6] = j13;
        jArr[7] = j13 ^ jLongValue2;
        int i17 = (int) jLongValue;
        long j14 = jArr[i17 & 7] ^ (jArr[(i17 >>> 3) & 7] << 3);
        int i18 = ((i11 ^ 36) + ((i11 & 36) << 1)) - 1;
        f53817b = i18 % 128;
        int i19 = i18 % 2;
        long j15 = 0;
        int i20 = 54;
        while (true) {
            int i21 = (int) (jLongValue >>> i20);
            long j16 = jArr[i21 & 7] ^ (jArr[(i21 >>> i10) & 7] << i10);
            j14 ^= j16 << i20;
            j15 ^= j16 >>> (-i20);
            i20 -= 6;
            if (i20 <= 0) {
                break;
            } else {
                i10 = 3;
            }
        }
        int i22 = f53816a;
        int i23 = i22 & 69;
        int i24 = i23 + ((i22 ^ 69) | i23);
        f53817b = i24 % 128;
        int i25 = i24 % 2;
        long j17 = j15 ^ (((jLongValue & 585610922974906400L) & ((jLongValue2 << 4) >> 63)) >>> 5);
        jArr2[iIntValue] = jArr2[iIntValue] ^ (1152921504606846975L & j14);
        int i26 = iIntValue & 1;
        int i27 = ((iIntValue ^ 1) | i26) << 1;
        int i28 = -((~i26) & (iIntValue | 1));
        int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
        jArr2[i29] = ((j17 << 4) ^ (j14 >>> 60)) ^ jArr2[i29];
        int i30 = (i22 & 45) + (i22 | 45);
        f53817b = i30 % 128;
        if (i30 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void d(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53816a;
        int i11 = (((i10 | 41) << 1) - (~(-(i10 ^ 41)))) - 1;
        f53817b = i11 % 128;
        if (i11 % 2 == 0) {
            long[] jArr3 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr3}, 1876881071, -1876881063, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr3, jArr2}, 558413775, -558413772, (int) System.currentTimeMillis());
            throw null;
        }
        long[] jArr4 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr4}, 1876881071, -1876881063, (int) System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new Object[]{jArr4, jArr2}, 558413775, -558413772, (int) System.currentTimeMillis());
        int i12 = f53817b + 29;
        f53816a = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0230, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0236, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.avf.setX(new java.lang.Object[]{r1}, -1422980310, 1422980335, (int) java.lang.System.currentTimeMillis())).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.avf.setX(new java.lang.Object[]{r1}, -1422980310, 1422980335, (int) java.lang.System.currentTimeMillis())).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0057, code lost:
    
        r5 = (long[]) com.mypinpad.tsdk.isolation.avf.setX(new java.lang.Object[0], 261521621, -261521615, (int) java.lang.System.currentTimeMillis());
        r6 = (long[]) com.mypinpad.tsdk.isolation.avf.setX(new java.lang.Object[0], 261521621, -261521615, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1, r5}, 1087566092, -1087566076, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5, r1, r5}, -107110555, 107110559, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5, r5}, 1087566092, -1087566076, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5, r1, r5}, -107110555, 107110559, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5, 3, r6}, 2140407636, -2140407635, 3);
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r6, r5, r6}, -107110555, 107110559, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r6, r6}, 1087566092, -1087566076, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r6, r1, r6}, -107110555, 107110559, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r6, 7, r5}, 2140407636, -2140407635, 7);
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5, r6, r5}, -107110555, 107110559, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5, 14, r6}, 2140407636, -2140407635, 14);
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r6, r5, r6}, -107110555, 107110559, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r6, r6}, 1087566092, -1087566076, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r6, r1, r6}, -107110555, 107110559, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r6, 29, r5}, 2140407636, -2140407635, 29);
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5, r6, r5}, -107110555, 107110559, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5, r5}, 1087566092, -1087566076, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5, r1, r5}, -107110555, 107110559, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5, 59, r6}, 2140407636, -2140407635, 59);
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r6, r5, r6}, -107110555, 107110559, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r6, r6}, 1087566092, -1087566076, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r6, r1, r6}, -107110555, 107110559, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r6, 119, r5}, 2140407636, -2140407635, 119);
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5, r6, r5}, -107110555, 107110559, (int) java.lang.System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5, r3}, 1087566092, -1087566076, (int) java.lang.System.currentTimeMillis());
        r0 = com.mypinpad.tsdk.isolation.atg.f53817b;
        r1 = r0 & 31;
        r0 = (r0 | 31) & (~r1);
        r1 = r1 << 1;
        r2 = (r0 & r1) + (r0 | r1);
        com.mypinpad.tsdk.isolation.atg.f53816a = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void e(java.lang.Object[] r16) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.atg.e(java.lang.Object[]):void");
    }

    public static /* synthetic */ void f(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53817b;
        int i11 = i10 & 21;
        int i12 = (~i11) & (i10 | 21);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i13 | i12);
        f53816a = i14 % 128;
        int i15 = i14 % 2;
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        int i16 = i10 ^ 69;
        int i17 = -(-((i10 & 69) << 1));
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        f53816a = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void g(Object[] objArr) {
        long[] jArr;
        long[] jArr2 = (long[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53816a + 115;
        f53817b = i10 % 128;
        if (i10 % 2 == 0) {
            jArr = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr2, jArr}, 1876881071, -1876881063, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr3}, 558413775, -558413772, (int) System.currentTimeMillis());
            int i11 = 95 / 0;
        } else {
            jArr = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr2, jArr}, 1876881071, -1876881063, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr3}, 558413775, -558413772, (int) System.currentTimeMillis());
        }
        while (true) {
            iIntValue--;
            if (iIntValue <= 0) {
                break;
            }
            int i12 = f53816a;
            int i13 = ((i12 & 24) + (i12 | 24)) - 1;
            f53817b = i13 % 128;
            int i14 = i13 % 2;
            setCompoundDrawableTintBlendMode(new Object[]{jArr3, jArr}, 1876881071, -1876881063, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr3}, 558413775, -558413772, (int) System.currentTimeMillis());
            int i15 = f53817b;
            int i16 = ((i15 ^ 88) + ((i15 & 88) << 1)) - 1;
            f53816a = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = f53817b;
        int i19 = i18 & 85;
        int i20 = (i18 | 85) & (~i19);
        int i21 = i19 << 1;
        int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
        f53816a = i22 % 128;
        if (i22 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void h(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53816a;
        int i11 = (i10 ^ 33) + ((i10 & 33) << 1);
        f53817b = i11 % 128;
        if (i11 % 2 != 0) {
            long[] jArr3 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr3}, 1876881071, -1876881063, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr2, jArr3, jArr2}, -316079009, 316079027, (int) System.currentTimeMillis());
        } else {
            long[] jArr4 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr4}, 1876881071, -1876881063, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr2, jArr4, jArr2}, -316079009, 316079027, (int) System.currentTimeMillis());
            throw null;
        }
    }

    public static /* synthetic */ void i(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53816a;
        int i11 = (i10 ^ 5) + ((i10 & 5) << 1);
        int i12 = i11 % 128;
        f53817b = i12;
        int i13 = i11 % 2;
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = j16 ^ (j17 >>> 17);
        long j19 = (j15 ^ (j17 << 47)) ^ (j18 >>> 17);
        long j20 = ((j14 ^ (j17 >>> 47)) ^ (j18 << 47)) ^ (j19 >>> 17);
        long j21 = j10 ^ (j20 << 17);
        long j22 = (j11 ^ (j19 << 17)) ^ (j20 >>> 47);
        long j23 = ((j12 ^ (j18 << 17)) ^ (j19 >>> 47)) ^ (j20 << 47);
        long j24 = (((j13 ^ (j17 << 17)) ^ (j18 >>> 47)) ^ (j19 << 47)) ^ (j20 >>> 17);
        long j25 = j24 >>> 47;
        jArr2[0] = j21 ^ j25;
        jArr2[1] = j22;
        jArr2[2] = (j25 << 30) ^ j23;
        jArr2[3] = 140737488355327L & j24;
        int i14 = i12 + 59;
        f53816a = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void j(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = ~iCurrentTimeMillis;
        int i11 = ~(((-436672634) & i10) | ((-436672634) ^ i10));
        int i12 = (-345272466) & i11;
        int i13 = (i11 | (-345272466)) & (~i12);
        int i14 = -(-(((i13 & i12) | (i13 ^ i12)) * (-933)));
        int i15 = 158955922 & i14;
        int i16 = ((i14 | 158955922) & (~i15)) + (i15 << 1);
        int i17 = (iCurrentTimeMillis | i10) & i10;
        int i18 = (i17 & (-345272466)) | ((-345272466) ^ i17);
        int i19 = ~i18;
        int i20 = (i18 | i19) & i19;
        int i21 = i20 & 76570752;
        int i22 = -(~((((i20 | 76570752) & (~i21)) | i21) * 933));
        int i23 = ((i16 ^ i22) + ((i22 & i16) << 1)) - 1;
        int i24 = (((2114709281 & i23) | ((~i23) & (-2114709282))) - (~((i23 & (-2114709282)) << 1))) - 1;
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i25 = ~iCurrentTimeMillis2;
        int i26 = (iCurrentTimeMillis2 | i25) & i25;
        int i27 = ~i26;
        int i28 = ((-1655911164) & i27) | (1655911163 & i26);
        int i29 = (-1655911164) & i26;
        int i30 = (i28 & i29) | (i28 ^ i29);
        int i31 = (i30 & 618308869) | ((~i30) & (-618308870));
        int i32 = i30 & (-618308870);
        int i33 = -(-((~((i32 & i31) | (i31 ^ i32))) * (-783)));
        int i34 = 535920313 & i33;
        int i35 = ((i33 | 535920313) & (~i34)) + (i34 << 1);
        int i36 = ~((i26 & (-618308870)) | (i27 & (-618308870)) | (618308869 & i26));
        int i37 = (-1655911164) ^ i36;
        int i38 = i36 & (-1655911164);
        int i39 = -(-(((i38 & i37) | (i37 ^ i38)) * 783));
        int i40 = i35 & i39;
        int i41 = (i39 ^ i35) | i40;
        if (i24 > (i40 ^ i41) + ((i41 & i40) << 1)) {
            long[] jArr4 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2, jArr4}, -1872528678, 1872528684, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr4, jArr3}, 558413775, -558413772, (int) System.currentTimeMillis());
            int i42 = 53 / 0;
        } else {
            long[] jArr5 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2, jArr5}, -1872528678, 1872528684, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr5, jArr3}, 558413775, -558413772, (int) System.currentTimeMillis());
        }
        int i43 = f53816a + 51;
        f53817b = i43 % 128;
        if (i43 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        long[] jArr;
        int i13 = ~i10;
        int i14 = ~((~i12) | i13);
        int i15 = (((~(i10 | i11 | i12)) | i14) * 338) + ((~(i13 | i11)) * 338) + (((~((~i11) | i10)) | i14 | (~(i10 | i12))) * (-338)) + (i11 * 339) + (i10 * (-337));
        Integer num = 3;
        Integer num2 = 0;
        int i16 = 1;
        Integer num3 = 1;
        switch (i15) {
            case 1:
                g(objArr);
                return null;
            case 2:
                long[] jArr2 = (long[]) objArr[0];
                System.currentTimeMillis();
                System.currentTimeMillis();
                long j10 = jArr2[0];
                long j11 = jArr2[1];
                long j12 = jArr2[2];
                long j13 = jArr2[3];
                long j14 = jArr2[4];
                long j15 = jArr2[5];
                long j16 = jArr2[6];
                long j17 = jArr2[7];
                jArr2[0] = j10 ^ (j11 << 60);
                jArr2[1] = (j11 >>> 4) ^ (j12 << 56);
                jArr2[2] = (j12 >>> 8) ^ (j13 << 52);
                jArr2[3] = (j13 >>> 12) ^ (j14 << 48);
                jArr2[4] = (j14 >>> 16) ^ (j15 << 44);
                jArr2[5] = (j15 >>> 20) ^ (j16 << 40);
                jArr2[6] = (j16 >>> 24) ^ (j17 << 36);
                jArr2[7] = j17 >>> 28;
                int i17 = f53816a;
                int i18 = i17 & 19;
                int i19 = (i17 | 19) & (~i18);
                int i20 = -(-(i18 << 1));
                int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                f53817b = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 3:
                i(objArr);
                return null;
            case 4:
                j(objArr);
                return null;
            case 5:
                long[] jArr3 = (long[]) objArr[0];
                long[] jArr4 = (long[]) objArr[1];
                int i23 = f53817b;
                int i24 = ((i23 | 67) << 1) - (i23 ^ 67);
                int i25 = i24 % 128;
                f53816a = i25;
                int i26 = i24 % 2;
                long j18 = jArr3[0];
                long j19 = jArr3[1];
                long j20 = jArr3[2];
                long j21 = jArr3[3];
                jArr4[0] = j18 & 1152921504606846975L;
                jArr4[1] = ((j18 >>> 60) ^ (j19 << 4)) & 1152921504606846975L;
                jArr4[2] = ((j19 >>> 56) ^ (j20 << 8)) & 1152921504606846975L;
                jArr4[3] = (j20 >>> 52) ^ (j21 << 12);
                int i27 = (i25 ^ 91) + ((i25 & 91) << 1);
                f53817b = i27 % 128;
                int i28 = i27 % 2;
                return null;
            case 6:
                long[] jArr5 = (long[]) objArr[0];
                long[] jArr6 = (long[]) objArr[1];
                long[] jArr7 = (long[]) objArr[2];
                int i29 = f53817b;
                int i30 = ((i29 & 21) - (~(-(-(i29 | 21))))) - 1;
                f53816a = i30 % 128;
                int i31 = i30 % 2;
                long[] jArr8 = new long[4];
                long[] jArr9 = new long[4];
                setCompoundDrawableTintBlendMode(new Object[]{jArr5, jArr8}, 249451358, -249451353, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr6, jArr9}, 249451358, -249451353, (int) System.currentTimeMillis());
                long[] jArr10 = new long[8];
                setCompoundDrawableTintBlendMode(new Object[]{jArr10, Long.valueOf(jArr8[0]), Long.valueOf(jArr9[0]), jArr7, num2}, -902999066, 902999066, 0);
                setCompoundDrawableTintBlendMode(new Object[]{jArr10, Long.valueOf(jArr8[1]), Long.valueOf(jArr9[1]), jArr7, num3}, -902999066, 902999066, 1);
                setCompoundDrawableTintBlendMode(new Object[]{jArr10, Long.valueOf(jArr8[2]), Long.valueOf(jArr9[2]), jArr7, 2}, -902999066, 902999066, 2);
                setCompoundDrawableTintBlendMode(new Object[]{jArr10, Long.valueOf(jArr8[3]), Long.valueOf(jArr9[3]), jArr7, num}, -902999066, 902999066, 3);
                int i32 = f53817b;
                int i33 = (((i32 & (-124)) | ((~i32) & 123)) - (~((i32 & 123) << 1))) - 1;
                f53816a = i33 % 128;
                int i34 = i33 % 2;
                int i35 = 5;
                while (i35 > 0) {
                    int i36 = f53816a;
                    int i37 = i36 & 41;
                    int i38 = ((i36 ^ 41) | i37) << 1;
                    int i39 = -((i36 | 41) & (~i37));
                    int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                    f53817b = i40 % 128;
                    int i41 = i40 % 2;
                    long j22 = jArr7[i35];
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i42 = -(-(i35 * 85));
                    int i43 = (-85) & i42;
                    int i44 = i43 + ((i42 ^ (-85)) | i43);
                    int i45 = ~i35;
                    int i46 = ~i45;
                    int i47 = i46 & (i46 | i45);
                    int i48 = ~iCurrentTimeMillis;
                    int i49 = i48 & (i48 | iCurrentTimeMillis);
                    Integer num4 = num2;
                    int i50 = ~i49;
                    int i51 = i50 & (i50 | i49);
                    Integer num5 = num;
                    int i52 = i47 & i51;
                    Integer num6 = num3;
                    int i53 = (i51 | i47) & (~i52);
                    int i54 = (i52 & i53) | (i53 ^ i52);
                    int i55 = (i45 | i35) & i45;
                    int i56 = i55 & i48;
                    int i57 = (i55 | i48) & (~i56);
                    int i58 = ~((i57 & i56) | (i57 ^ i56));
                    int i59 = i54 ^ i58;
                    int i60 = i54 & i58;
                    int i61 = (i60 & i59) | (i59 ^ i60);
                    int i62 = (i45 ^ i35) | (i45 & i35);
                    int i63 = ~i62;
                    int i64 = (i62 & i48) | (iCurrentTimeMillis & i63);
                    int i65 = i62 & iCurrentTimeMillis;
                    int i66 = ~((i64 ^ i65) | (i65 & i64));
                    int i67 = i61 ^ i66;
                    int i68 = i61 & i66;
                    int i69 = -(-(((i68 & i67) | (i67 ^ i68)) * (-84)));
                    int i70 = (((i44 ^ i69) | (i44 & i69)) << 1) - ((i69 & (~i44)) | ((~i69) & i44));
                    int i71 = i45 ^ iCurrentTimeMillis;
                    int i72 = iCurrentTimeMillis & i45;
                    int i73 = ~((i71 & i72) | (i71 ^ i72));
                    int i74 = ~i73;
                    int i75 = (i73 & i74) | (i74 ^ i73);
                    int i76 = (i48 & i45) | ((~i48) & i35) | (i48 & i35);
                    int i77 = ~i76;
                    int i78 = (i76 | i77) & i77;
                    int i79 = i75 & i78;
                    int i80 = (i75 | i78) & (~i79);
                    int i81 = ((i80 & i79) | (i80 ^ i79)) * (-84);
                    int i82 = i70 & i81;
                    int i83 = i81 | i70;
                    int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                    int i85 = i49 & i35;
                    int i86 = (~i85) & (i49 | i35);
                    int i87 = ~((i85 & i86) | (i86 ^ i85));
                    int i88 = i87 & i63;
                    int i89 = (i87 | i63) & (~i88);
                    int i90 = ((i89 & i88) | (i89 ^ i88)) * 84;
                    int i91 = i84 & i90;
                    int i92 = ((i84 ^ i90) | i91) << 1;
                    int i93 = -((i90 | i84) & (~i91));
                    jArr7[i35] = jArr7[((i92 | i93) << 1) - (i93 ^ i92)] ^ j22;
                    int i94 = ((i35 & (-105)) + (i35 | (-105))) - 1;
                    int i95 = i94 & 105;
                    i35 = (i95 - (~(-(-((i94 ^ 105) | i95))))) - 1;
                    int i96 = f53816a;
                    int i97 = ((i96 ^ 87) | (i96 & 87)) << 1;
                    int i98 = -((i96 & (-88)) | ((~i96) & 87));
                    int i99 = (i97 & i98) + (i98 | i97);
                    f53817b = i99 % 128;
                    int i100 = i99 % 2;
                    num2 = num4;
                    num = num5;
                    num3 = num6;
                }
                Integer num7 = num;
                Integer num8 = num2;
                Integer num9 = num3;
                setCompoundDrawableTintBlendMode(new Object[]{jArr10, Long.valueOf(jArr8[0] ^ jArr8[1]), Long.valueOf(jArr9[0] ^ jArr9[1]), jArr7, num9}, -902999066, 902999066, 1);
                setCompoundDrawableTintBlendMode(new Object[]{jArr10, Long.valueOf(jArr8[2] ^ jArr8[3]), Long.valueOf(jArr9[2] ^ jArr9[3]), jArr7, num7}, -902999066, 902999066, 3);
                int i101 = f53817b;
                int i102 = i101 & 61;
                int i103 = (i101 ^ 61) | i102;
                int i104 = 1;
                int i105 = ((i102 | i103) << 1) - (i103 ^ i102);
                f53816a = i105 % 128;
                int i106 = i105 % 2;
                int i107 = 7;
                while (i107 > i104) {
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                    long j23 = jArr7[i107];
                    int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                    int i108 = i107 * (-958);
                    int i109 = 1916 & i108;
                    int i110 = (i108 ^ 1916) | i109;
                    int i111 = ((i109 | i110) << 1) - (i110 ^ i109);
                    int i112 = ~i107;
                    int i113 = ~iCurrentTimeMillis2;
                    int i114 = i112 ^ i113;
                    int i115 = i112 & i113;
                    int i116 = ~((i114 & i115) | (i114 ^ i115));
                    int i117 = 1 & iCurrentTimeMillis2;
                    int i118 = ~((1 ^ iCurrentTimeMillis2) | i117);
                    int i119 = i116 & i118;
                    int i120 = ((i118 | i116) & (~i119)) | i119;
                    int i121 = i113 ^ (-2);
                    int i122 = i113 & (-2);
                    int i123 = ~((i121 & i122) | (i121 ^ i122));
                    int i124 = i120 & i123;
                    long[] jArr11 = jArr10;
                    int i125 = -(~(-(-((((~i124) & (i120 | i123)) | i124) * 959))));
                    int i126 = ((i111 & i125) + (i125 | i111)) - 1;
                    int i127 = ((-2) & i112) | (i107 & 1) | ((-2) & i107);
                    int i128 = ~i127;
                    int i129 = ((i127 | i128) & i128) * (-959);
                    int i130 = ((i126 ^ i129) - (~(-(-((i129 & i126) << 1))))) - 1;
                    int i131 = ~(((i113 | iCurrentTimeMillis2) & i113) | 1);
                    int i132 = i112 & iCurrentTimeMillis2;
                    int i133 = (i112 | iCurrentTimeMillis2) & (~i132);
                    int i134 = ~((i133 & i132) | (i133 ^ i132));
                    int i135 = (i131 & i134) | (i131 ^ i134);
                    int i136 = i122 | i117;
                    int i137 = iCurrentTimeMillis2 & (-2);
                    int i138 = ~((i137 & i136) | (i136 ^ i137));
                    int i139 = i135 & i138;
                    int i140 = (i135 | i138) & (~i139);
                    int i141 = -(-(((i140 & i139) | (i140 ^ i139)) * 959));
                    jArr7[i107] = j23 ^ jArr7[(i130 & i141) + (i141 | i130)];
                    int i142 = i107 & (-97);
                    int i143 = i142 + ((i107 ^ (-97)) | i142);
                    i107 = ((i143 & 97) + (i143 | 97)) - 1;
                    int i144 = f53816a;
                    int i145 = i144 & 91;
                    int i146 = (i145 - (~((i144 ^ 91) | i145))) - 1;
                    f53817b = i146 % 128;
                    int i147 = i146 % 2;
                    i104 = 1;
                    jArr10 = jArr11;
                }
                long[] jArr12 = jArr10;
                int i148 = i104;
                long j24 = jArr8[0] ^ jArr8[2];
                long j25 = jArr8[i148] ^ jArr8[3];
                long j26 = jArr9[0] ^ jArr9[2];
                long j27 = jArr9[3] ^ jArr9[i148];
                Object[] objArr2 = new Object[5];
                objArr2[0] = jArr12;
                objArr2[i148] = Long.valueOf(j24 ^ j25);
                objArr2[2] = Long.valueOf(j26 ^ j27);
                objArr2[3] = jArr7;
                objArr2[4] = num7;
                setCompoundDrawableTintBlendMode(objArr2, -902999066, 902999066, 3);
                long[] jArr13 = new long[3];
                Object[] objArr3 = new Object[5];
                objArr3[0] = jArr12;
                objArr3[i148] = Long.valueOf(j24);
                objArr3[2] = Long.valueOf(j26);
                objArr3[3] = jArr13;
                objArr3[4] = num8;
                setCompoundDrawableTintBlendMode(objArr3, -902999066, 902999066, 0);
                Object[] objArr4 = new Object[5];
                objArr4[0] = jArr12;
                objArr4[i148] = Long.valueOf(j25);
                objArr4[2] = Long.valueOf(j27);
                objArr4[3] = jArr13;
                objArr4[4] = num9;
                setCompoundDrawableTintBlendMode(objArr4, -902999066, 902999066, i148);
                long j28 = jArr13[0];
                long j29 = jArr13[i148];
                long j30 = jArr13[2];
                jArr7[2] = jArr7[2] ^ j28;
                jArr7[3] = jArr7[3] ^ (j28 ^ j29);
                jArr7[4] = (j29 ^ j30) ^ jArr7[4];
                jArr7[5] = jArr7[5] ^ j30;
                setCompoundDrawableTintBlendMode(new Object[]{jArr7}, -1119307604, 1119307606, (int) System.currentTimeMillis());
                int i149 = f53816a;
                int i150 = ((i149 ^ 84) + ((i149 & 84) << 1)) - 1;
                f53817b = i150 % 128;
                int i151 = i150 % 2;
                return null;
            case 7:
                long[] jArr14 = (long[]) objArr[0];
                int i152 = f53816a;
                int i153 = ((i152 | 21) << 1) - (i152 ^ 21);
                f53817b = i153 % 128;
                return Integer.valueOf((i153 % 2 == 0 ? (int) (jArr14[0] * (jArr14[1] >> 120) * (jArr14[2] >>> 79)) : (int) ((jArr14[2] >>> 34) ^ (jArr14[0] ^ (jArr14[1] >>> 17)))) & 1);
            case 8:
                long[] jArr15 = (long[]) objArr[0];
                long[] jArr16 = (long[]) objArr[1];
                int i154 = f53817b;
                int i155 = (i154 ^ 33) + ((i154 & 33) << 1);
                f53816a = i155 % 128;
                if (i155 % 2 != 0) {
                    auu.setCompoundDrawableTintBlendMode(new Object[]{jArr15, num, jArr16, num2}, 1056168849, -1056168849, 3);
                } else {
                    auu.setCompoundDrawableTintBlendMode(new Object[]{jArr15, 4, jArr16, num2}, 1056168849, -1056168849, 4);
                }
                int i156 = f53817b;
                int i157 = i156 & 5;
                int i158 = (((i156 | 5) & (~i157)) - (~(-(-(i157 << 1))))) - 1;
                f53816a = i158 % 128;
                int i159 = i158 % 2;
                return null;
            case 9:
                long[] jArr17 = (long[]) objArr[0];
                long[] jArr18 = (long[]) objArr[1];
                int i160 = f53817b;
                int i161 = (i160 | 27) << 1;
                int i162 = -(i160 ^ 27);
                int i163 = (i161 & i162) + (i162 | i161);
                f53816a = i163 % 128;
                if (i163 % 2 != 0) {
                    jArr = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
                    avf.setX(new Object[]{jArr17, jArr18}, -2094914201, 2094914215, (int) System.currentTimeMillis());
                } else {
                    jArr = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
                    avf.setX(new Object[]{jArr17, jArr18}, -2094914201, 2094914215, (int) System.currentTimeMillis());
                }
                int i164 = f53816a;
                int i165 = i164 & 67;
                int i166 = i164 | 67;
                int i167 = ((i165 | i166) << 1) - (i166 ^ i165);
                f53817b = i167 % 128;
                int i168 = i167 % 2;
                int i169 = 1;
                while (i169 < 239) {
                    int i170 = f53817b;
                    int i171 = ((((i170 ^ 111) | (i170 & 111)) << 1) - (~(-(((~i170) & 111) | (i170 & (-112)))))) - 1;
                    f53816a = i171 % 128;
                    if (i171 % 2 != 0) {
                        setCompoundDrawableTintBlendMode(new Object[]{jArr18, jArr}, 1876881071, -1876881063, (int) System.currentTimeMillis());
                        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr18}, 558413775, -558413772, (int) System.currentTimeMillis());
                        setCompoundDrawableTintBlendMode(new Object[]{jArr18, jArr}, 1876881071, -1876881063, (int) System.currentTimeMillis());
                        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr18}, 558413775, -558413772, (int) System.currentTimeMillis());
                        setCompoundDrawableTintBlendMode(new Object[]{jArr17, jArr18}, -438672021, 438672036, (int) System.currentTimeMillis());
                        i169 = (i169 ^ 11) + ((i169 & 11) << 1);
                    } else {
                        setCompoundDrawableTintBlendMode(new Object[]{jArr18, jArr}, 1876881071, -1876881063, (int) System.currentTimeMillis());
                        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr18}, 558413775, -558413772, (int) System.currentTimeMillis());
                        setCompoundDrawableTintBlendMode(new Object[]{jArr18, jArr}, 1876881071, -1876881063, (int) System.currentTimeMillis());
                        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr18}, 558413775, -558413772, (int) System.currentTimeMillis());
                        setCompoundDrawableTintBlendMode(new Object[]{jArr17, jArr18}, -438672021, 438672036, (int) System.currentTimeMillis());
                        int i172 = (-2) - ((i169 - 82) ^ (-1));
                        i169 = (i172 ^ 85) + ((i172 & 85) << 1);
                    }
                }
                int i173 = f53817b;
                int i174 = (i173 & 109) + (i173 | 109);
                f53816a = i174 % 128;
                int i175 = i174 % 2;
                return null;
            case 10:
                long[] jArr19 = (long[]) objArr[0];
                long[] jArr20 = (long[]) objArr[1];
                int i176 = f53817b;
                int i177 = i176 & 65;
                int i178 = (i176 ^ 65) | i177;
                int i179 = (i177 & i178) + (i178 | i177);
                f53816a = i179 % 128;
                int i180 = i179 % 2;
                long jLongValue = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr19[0])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long jLongValue2 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr19[1])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long j31 = (jLongValue & 4294967295L) | (jLongValue2 << 32);
                long j32 = (jLongValue >>> 32) | (jLongValue2 & (-4294967296L));
                long jLongValue3 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr19[2])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long jLongValue4 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr19[3])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long j33 = (jLongValue3 & 4294967295L) | (jLongValue4 << 32);
                long j34 = (jLongValue4 & (-4294967296L)) | (jLongValue3 >>> 32);
                long j35 = j34 >>> 49;
                long j36 = (j32 >>> 49) | (j34 << 15);
                long j37 = j34 ^ (j32 << 15);
                long[] jArr21 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
                int[] iArr = {39, 120};
                int i181 = f53817b + 103;
                f53816a = i181 % 128;
                int i182 = 2;
                int i183 = i181 % 2;
                int i184 = 0;
                while (i184 < i182) {
                    int i185 = f53816a;
                    int i186 = i185 & 77;
                    int i187 = (i185 | 77) & (~i186);
                    int i188 = i186 << i16;
                    int i189 = ((i187 | i188) << i16) - (i187 ^ i188);
                    f53817b = i189 % 128;
                    int i190 = i189 % 2;
                    int i191 = iArr[i184];
                    int i192 = i191 >>> 6;
                    int i193 = i191 & 63;
                    jArr21[i192] = jArr21[i192] ^ (j32 << i193);
                    int i194 = i192 & 1;
                    int i195 = -(-(i192 | 1));
                    int i196 = (i194 & i195) + (i195 | i194);
                    int i197 = -i193;
                    jArr21[i196] = jArr21[i196] ^ ((j37 << i193) | (j32 >>> i197));
                    long j38 = j33;
                    int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                    int i198 = i192 * (-68);
                    int i199 = ((140 & i198) - (~(-(-(i198 | 140))))) - 1;
                    int i200 = ~i192;
                    int i201 = (i200 | i192) & i200;
                    int i202 = (-3) ^ i201;
                    int i203 = (-3) & i201;
                    int i204 = (i202 ^ i203) | (i202 & i203);
                    int[] iArr2 = iArr;
                    int i205 = i204 & iCurrentTimeMillis3;
                    long j39 = j32;
                    int i206 = (~i205) & (i204 | iCurrentTimeMillis3);
                    int i207 = ~((i205 & i206) | (i206 ^ i205));
                    int i208 = (i192 ^ 2) | (i192 & 2);
                    int i209 = (i208 & iCurrentTimeMillis3) | (i208 ^ iCurrentTimeMillis3);
                    int i210 = ~i209;
                    int i211 = (i209 | i210) & i210;
                    int i212 = i207 & i211;
                    int i213 = i184;
                    int i214 = (i207 | i211) & (~i212);
                    int i215 = ((i214 & i212) | (i214 ^ i212)) * 69;
                    int i216 = ((i199 & i215) - (~(i215 | i199))) - 1;
                    int i217 = ~(((-3) ^ i192) | ((-3) & i192));
                    int i218 = (-3) ^ iCurrentTimeMillis3;
                    int i219 = (-3) & iCurrentTimeMillis3;
                    int i220 = ~((i218 & i219) | (i218 ^ i219));
                    int i221 = ((~i220) & i217) | ((~i217) & i220);
                    int i222 = i217 & i220;
                    int i223 = (i222 & i221) | (i221 ^ i222);
                    int i224 = i192 & iCurrentTimeMillis3;
                    int i225 = (iCurrentTimeMillis3 | i192) & (~i224);
                    int i226 = ~((i225 & i224) | (i225 ^ i224));
                    int i227 = -(~(-(-(((i223 & i226) | (i223 ^ i226)) * (-69)))));
                    int i228 = ((i216 & i227) + (i227 | i216)) - 1;
                    int i229 = i201 & 2;
                    int i230 = (~i229) & (i201 | 2);
                    int i231 = -(-((~((i229 & i230) | (i230 ^ i229))) * 69));
                    int i232 = i228 & i231;
                    int i233 = i231 | i228;
                    int i234 = (i232 ^ i233) + ((i233 & i232) << 1);
                    jArr21[i234] = jArr21[i234] ^ ((j36 << i193) | (j37 >>> i197));
                    int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
                    int i235 = (i192 * (-103)) - 309;
                    int i236 = ((~i201) & (-4)) | (i201 & 3);
                    int i237 = i201 & (-4);
                    int i238 = ~((i236 & i237) | (i236 ^ i237));
                    int i239 = ~iCurrentTimeMillis4;
                    int i240 = (i200 & i239) | ((~i200) & iCurrentTimeMillis4);
                    int i241 = i200 & iCurrentTimeMillis4;
                    int i242 = ~((i241 & i240) | (i240 ^ i241));
                    int i243 = -(-(((i238 & i242) | ((~i242) & i238) | ((~i238) & i242)) * 104));
                    int i244 = i235 & i243;
                    int i245 = -(-((i235 ^ i243) | i244));
                    int i246 = (i244 ^ i245) + ((i245 & i244) << 1);
                    int i247 = i239 | 3;
                    int i248 = i247 ^ i192;
                    int i249 = i247 & i192;
                    int i250 = (~((i249 & i248) | (i248 ^ i249))) * (-104);
                    int i251 = ((~i250) & i246) | ((~i246) & i250);
                    int i252 = (i250 & i246) << 1;
                    int i253 = (((iCurrentTimeMillis4 & 3) | (i239 & 3) | (iCurrentTimeMillis4 & (-4))) * 104) + (i251 ^ i252) + ((i252 & i251) << 1);
                    jArr21[i253] = jArr21[i253] ^ ((j35 << i193) | (j36 >>> i197));
                    int i254 = ((i192 & 4) - (~(i192 | 4))) - 1;
                    jArr21[i254] = jArr21[i254] ^ (j35 >>> i197);
                    int i255 = i213 & 1;
                    int i256 = (~i255) & (i213 | 1);
                    int i257 = i255 << 1;
                    i184 = (i256 ^ i257) + ((i257 & i256) << 1);
                    int i258 = f53817b;
                    int i259 = (i258 & 111) + (i258 | 111);
                    f53816a = i259 % 128;
                    int i260 = i259 % 2;
                    i182 = 2;
                    j33 = j38;
                    j32 = j39;
                    i16 = 1;
                    iArr = iArr2;
                }
                Object[] objArr5 = new Object[i182];
                objArr5[0] = jArr21;
                objArr5[1] = jArr20;
                setCompoundDrawableTintBlendMode(objArr5, 558413775, -558413772, (int) System.currentTimeMillis());
                jArr20[0] = jArr20[0] ^ j31;
                jArr20[1] = jArr20[1] ^ j33;
                int i261 = f53816a;
                int i262 = i261 & 81;
                int i263 = (i261 ^ 81) | i262;
                int i264 = (i262 ^ i263) + ((i263 & i262) << 1);
                f53817b = i264 % 128;
                int i265 = i264 % 2;
                return null;
            case 11:
                long[] jArr22 = (long[]) objArr[0];
                long[] jArr23 = (long[]) objArr[1];
                int i266 = f53817b;
                int i267 = ((i266 | 11) << 1) - (((~i266) & 11) | (i266 & (-12)));
                f53816a = i267 % 128;
                if (i267 % 2 != 0) {
                    jArr23[1] = jArr22[1];
                    jArr23[1] = jArr22[1];
                    jArr23[5] = jArr22[5];
                    jArr23[2] = jArr22[3];
                    return null;
                }
                jArr23[0] = jArr22[0] ^ 1;
                jArr23[1] = jArr22[1];
                jArr23[2] = jArr22[2];
                jArr23[3] = jArr22[3];
                return null;
            case 12:
                b(objArr);
                return null;
            case 13:
                e(objArr);
                return null;
            case 14:
                h(objArr);
                return null;
            case 15:
                long[] jArr24 = (long[]) objArr[0];
                long[] jArr25 = (long[]) objArr[1];
                int i268 = f53817b;
                int i269 = (i268 & 119) + (i268 | 119);
                int i270 = i269 % 128;
                f53816a = i270;
                int i271 = i269 % 2;
                jArr25[0] = jArr25[0] ^ jArr24[0];
                jArr25[1] = jArr25[1] ^ jArr24[1];
                jArr25[2] = jArr25[2] ^ jArr24[2];
                jArr25[3] = jArr25[3] ^ jArr24[3];
                int i272 = i270 & 91;
                int i273 = -(-((i270 ^ 91) | i272));
                int i274 = ((i272 | i273) << 1) - (i272 ^ i273);
                f53817b = i274 % 128;
                int i275 = i274 % 2;
                return null;
            case 16:
                d(objArr);
                return null;
            case 17:
                a(objArr);
                return null;
            case 18:
                f(objArr);
                return null;
            case 19:
                BigInteger bigInteger = (BigInteger) objArr[0];
                int i276 = f53817b + 3;
                f53816a = i276 % 128;
                return (long[]) (i276 % 2 != 0 ? auy.setOnFocusChangeListener(new Object[]{1792, bigInteger}, 1678029135, -1678029124, 1792) : auy.setOnFocusChangeListener(new Object[]{239, bigInteger}, 1678029135, -1678029124, 239));
            default:
                c(objArr);
                return null;
        }
    }

    public static int setDividerPadding(long[] jArr) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{jArr}, -1533714022, 1533714029, (int) System.currentTimeMillis())).intValue();
    }

    public static void setLayoutAnimation(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, -943814066, 943814080, (int) System.currentTimeMillis());
    }

    public static void setOnDragListener(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, 1087566092, -1087566076, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2, long[] jArr3) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2, jArr3}, -1128112406, 1128112418, (int) System.currentTimeMillis());
    }

    public static void setX(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, 558413775, -558413772, (int) System.currentTimeMillis());
    }

    public static void setY(long[] jArr, int i10, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, Integer.valueOf(i10), jArr2}, 2140407636, -2140407635, i10);
    }

    public static void setDividerPadding(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, 59301668, -59301658, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, 2127439901, -2127439888, (int) System.currentTimeMillis());
    }

    public static void setY(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, 1669919721, -1669919710, (int) System.currentTimeMillis());
    }

    public static long[] setOnFocusChangeListener(BigInteger bigInteger) {
        return (long[]) setCompoundDrawableTintBlendMode(new Object[]{bigInteger}, 1236138735, -1236138716, (int) System.currentTimeMillis());
    }

    public static void setY(long[] jArr, long[] jArr2, long[] jArr3) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2, jArr3}, 354064377, -354064360, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, long[] jArr2, long[] jArr3) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2, jArr3}, -107110555, 107110559, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, -472943092, 472943101, (int) System.currentTimeMillis());
    }
}
