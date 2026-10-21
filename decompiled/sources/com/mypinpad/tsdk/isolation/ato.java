package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ato {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53837a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53838b = 1;

    public static /* synthetic */ void a(Object[] objArr) {
        int i10;
        int i11;
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i12 = f53837a;
        int i13 = ((i12 & (-124)) | ((~i12) & 123)) + ((i12 & 123) << 1);
        f53838b = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((i12 ^ 89) - (~((i12 & 89) << 1))) - 1;
        f53838b = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 0;
        while (i17 < 13) {
            int i18 = f53837a;
            int i19 = i18 + 27;
            f53838b = i19 % 128;
            if (i19 % 2 == 0) {
                jArr3[i17] = jArr[i17] & jArr2[i17];
                i10 = (i17 & (-30)) | ((~i17) & 29);
                i11 = (i17 & 29) << 1;
            } else {
                jArr3[i17] = jArr[i17] ^ jArr2[i17];
                int i20 = i17 | 125;
                int i21 = i20 << 1;
                int i22 = -((~(i17 & 125)) & i20);
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                int i24 = i23 & (-124);
                i10 = (i23 | (-124)) & (~i24);
                i11 = -(-(i24 << 1));
            }
            i17 = (i10 ^ i11) + ((i11 & i10) << 1);
            int i25 = (i18 & 81) + (i18 | 81);
            f53838b = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = f53837a;
        int i28 = i27 & 105;
        int i29 = (i27 ^ 105) | i28;
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        f53838b = i30 % 128;
        if (i30 % 2 == 0) {
            int i31 = 9 / 0;
        }
    }

    public static /* synthetic */ void b(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53838b + 23;
        f53837a = i10 % 128;
        if (i10 % 2 == 0) {
            long[] jArr4 = (long[]) ave.setX(new Object[0], 576198305, -576198302, (int) System.currentTimeMillis());
            setY(new Object[]{jArr, jArr2, jArr4}, -1940093008, 1940093020, (int) System.currentTimeMillis());
            setY(new Object[]{jArr3, jArr4, jArr3}, -1272788524, 1272788538, (int) System.currentTimeMillis());
        } else {
            long[] jArr5 = (long[]) ave.setX(new Object[0], 576198305, -576198302, (int) System.currentTimeMillis());
            setY(new Object[]{jArr, jArr2, jArr5}, -1940093008, 1940093020, (int) System.currentTimeMillis());
            setY(new Object[]{jArr3, jArr5, jArr3}, -1272788524, 1272788538, (int) System.currentTimeMillis());
            throw null;
        }
    }

    public static /* synthetic */ void c(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53837a + 51;
        f53838b = i10 % 128;
        int i11 = i10 % 2;
        long[] jArr3 = (long[]) auy.setOnFocusChangeListener(new Object[]{13}, 1783230509, -1783230493, 13);
        setY(new Object[]{jArr, jArr3}, -1305833082, 1305833089, (int) System.currentTimeMillis());
        setY(new Object[]{jArr3, jArr2}, -323449892, 323449909, (int) System.currentTimeMillis());
        int i12 = f53838b;
        int i13 = (i12 & (-116)) | ((~i12) & 115);
        int i14 = (i12 & 115) << 1;
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        f53837a = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void d(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        long[] jArr2 = (long[]) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i10 = f53837a;
        int i11 = i10 & 11;
        int i12 = -(-((i10 ^ 11) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        f53838b = i14;
        int i15 = i13 % 2;
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
        long j14 = jLongValue2 ^ j13;
        int i16 = 7;
        jArr[7] = j14;
        int i17 = (int) jLongValue;
        long j15 = (jArr[(i17 >>> 3) & 7] << 3) ^ jArr[i17 & 7];
        int i18 = i14 & 99;
        int i19 = (i14 ^ 99) | i18;
        int i20 = (i18 & i19) + (i19 | i18);
        f53837a = i20 % 128;
        int i21 = i20 % 2;
        long j16 = 0;
        int i22 = 54;
        while (true) {
            int i23 = (int) (jLongValue >>> i22);
            long j17 = jArr[i23 & 7] ^ (jArr[(i23 >>> 3) & i16] << 3);
            j15 ^= j17 << i22;
            j16 ^= j17 >>> (-i22);
            int i24 = i22 & (-45);
            int i25 = (~i24) & (i22 | (-45));
            int i26 = i24 << 1;
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            int i28 = ((i27 | 40) << 1) - (i27 ^ 40);
            i22 = (i28 ^ (-1)) + (i28 << 1);
            if (i22 <= 0) {
                break;
            } else {
                i16 = 7;
            }
        }
        int i29 = f53838b;
        int i30 = i29 + 45;
        f53837a = i30 % 128;
        if (i30 % 2 != 0) {
            long j18 = jArr2[iIntValue] - (576460752303423487L + j15);
            jArr2[iIntValue] = j18;
            jArr2[iIntValue] = j18 - ((j15 << 70) | (j16 << 3));
        } else {
            jArr2[iIntValue] = (j15 & 576460752303423487L) ^ jArr2[iIntValue];
            int i31 = iIntValue + 1;
            jArr2[i31] = jArr2[i31] ^ ((j15 >>> 59) ^ (j16 << 5));
        }
        int i32 = i29 + 75;
        f53837a = i32 % 128;
        if (i32 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void e(Object[] objArr) {
        long[] jArr;
        int i10;
        long[] jArr2 = (long[]) objArr[0];
        long[] jArr3 = (long[]) objArr[1];
        int i11 = f53837a;
        int i12 = (i11 & 79) + (i11 | 79);
        f53838b = i12 % 128;
        if (i12 % 2 == 0) {
            jArr = (long[]) auy.setOnFocusChangeListener(new Object[]{55}, 1783230509, -1783230493, 55);
            ave.setX(new Object[]{jArr2, jArr3}, -1864536113, 1864536119, (int) System.currentTimeMillis());
            i10 = 0;
        } else {
            jArr = (long[]) auy.setOnFocusChangeListener(new Object[]{13}, 1783230509, -1783230493, 13);
            ave.setX(new Object[]{jArr2, jArr3}, -1864536113, 1864536119, (int) System.currentTimeMillis());
            i10 = 1;
        }
        while (i10 < 409) {
            int i13 = f53838b;
            int i14 = i13 & 65;
            int i15 = (((i13 ^ 65) | i14) << 1) - ((i13 | 65) & (~i14));
            f53837a = i15 % 128;
            if (i15 % 2 != 0) {
                setY(new Object[]{jArr3, jArr}, -1305833082, 1305833089, (int) System.currentTimeMillis());
                setY(new Object[]{jArr, jArr3}, -323449892, 323449909, (int) System.currentTimeMillis());
                setY(new Object[]{jArr3, jArr}, -1305833082, 1305833089, (int) System.currentTimeMillis());
                setY(new Object[]{jArr, jArr3}, -323449892, 323449909, (int) System.currentTimeMillis());
                setY(new Object[]{jArr2, jArr3}, -440392241, 440392243, (int) System.currentTimeMillis());
                int i16 = i10 + 23;
                i10 = (i16 ^ (-1)) + (i16 << 1);
            } else {
                setY(new Object[]{jArr3, jArr}, -1305833082, 1305833089, (int) System.currentTimeMillis());
                setY(new Object[]{jArr, jArr3}, -323449892, 323449909, (int) System.currentTimeMillis());
                setY(new Object[]{jArr3, jArr}, -1305833082, 1305833089, (int) System.currentTimeMillis());
                setY(new Object[]{jArr, jArr3}, -323449892, 323449909, (int) System.currentTimeMillis());
                setY(new Object[]{jArr2, jArr3}, -440392241, 440392243, (int) System.currentTimeMillis());
                int i17 = ((i10 ^ 1) | (i10 & 1)) << 1;
                int i18 = -(((~i10) & 1) | (i10 & (-2)));
                int i19 = (i17 & i18) + (i18 | i17);
                int i20 = i19 & 1;
                i10 = i20 + ((i19 ^ 1) | i20);
            }
            int i21 = f53838b;
            int i22 = (i21 & (-64)) | ((~i21) & 63);
            int i23 = (i21 & 63) << 1;
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            f53837a = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = f53838b + 83;
        f53837a = i26 % 128;
        if (i26 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void f(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        long[] jArr2 = (long[]) objArr[2];
        int i10 = f53837a;
        int i11 = i10 & 1;
        int i12 = (i11 - (~(-(-((i10 ^ 1) | i11))))) - 1;
        f53838b = i12 % 128;
        int i13 = i12 % 2;
        long[] jArr3 = (long[]) auy.setOnFocusChangeListener(new Object[]{13}, 1783230509, -1783230493, 13);
        setY(new Object[]{jArr, jArr3}, -1305833082, 1305833089, (int) System.currentTimeMillis());
        setY(new Object[]{jArr3, jArr2}, -323449892, 323449909, (int) System.currentTimeMillis());
        int i14 = f53837a;
        int i15 = ((i14 & 56) + (i14 | 56)) - 1;
        while (true) {
            f53838b = i15 % 128;
            int i16 = i15 % 2;
            int i17 = (iIntValue & 123) | ((~iIntValue) & (-124));
            int i18 = -(-((iIntValue & (-124)) << 1));
            int i19 = (i17 & i18) + (i17 | i18);
            int i20 = i19 & 123;
            iIntValue = ((((i19 ^ 123) | i20) << 1) - (~(-((~i20) & (i19 | 123))))) - 1;
            if (iIntValue <= 0) {
                int i21 = f53837a + 15;
                f53838b = i21 % 128;
                int i22 = i21 % 2;
                return;
            }
            int i23 = f53837a;
            int i24 = (i23 & 19) + (i23 | 19);
            f53838b = i24 % 128;
            Object[] objArr2 = new Object[2];
            if (i24 % 2 == 0) {
                objArr2[0] = jArr2;
                objArr2[1] = jArr3;
                setY(objArr2, -1305833082, 1305833089, (int) System.currentTimeMillis());
                setY(new Object[]{jArr3, jArr2}, -323449892, 323449909, (int) System.currentTimeMillis());
                int i25 = 78 / 0;
            } else {
                objArr2[0] = jArr2;
                objArr2[1] = jArr3;
                setY(objArr2, -1305833082, 1305833089, (int) System.currentTimeMillis());
                setY(new Object[]{jArr3, jArr2}, -323449892, 323449909, (int) System.currentTimeMillis());
            }
            int i26 = f53837a;
            i15 = (i26 & 49) + (i26 | 49);
        }
    }

    public static /* synthetic */ void g(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53837a;
        int i11 = i10 & 7;
        int i12 = (~i11) & (i10 | 7);
        int i13 = i11 << 1;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f53838b = i14 % 128;
        int i15 = i14 % 2;
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
        jArr2[4] = jArr2[4] ^ jArr[4];
        jArr2[5] = jArr2[5] ^ jArr[5];
        jArr2[6] = jArr2[6] ^ jArr[6];
        int i16 = i10 & 97;
        int i17 = (((~i16) & (i10 | 97)) - (~(-(-(i16 << 1))))) - 1;
        f53838b = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
    }

    public static void getNavBarTitleString(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, 864873324, -864873323, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ void h(Object[] objArr) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4 = (long[]) objArr[0];
        long[] jArr5 = (long[]) objArr[1];
        long[] jArr6 = (long[]) objArr[2];
        int i10 = f53837a;
        int i11 = (((i10 | 10) << 1) - (i10 ^ 10)) - 1;
        f53838b = i11 % 128;
        if (i11 % 2 == 0) {
            jArr3 = new long[14];
            jArr = new long[18];
            setY(new Object[]{jArr4, jArr3}, -281669208, 281669224, (int) System.currentTimeMillis());
            setY(new Object[]{jArr5, jArr}, -281669208, 281669224, (int) System.currentTimeMillis());
            jArr2 = new long[11];
        } else {
            long[] jArr7 = new long[7];
            jArr = new long[7];
            setY(new Object[]{jArr4, jArr7}, -281669208, 281669224, (int) System.currentTimeMillis());
            setY(new Object[]{jArr5, jArr}, -281669208, 281669224, (int) System.currentTimeMillis());
            jArr2 = new long[8];
            jArr3 = jArr7;
        }
        int i12 = 0;
        while (i12 < 7) {
            int i13 = f53838b;
            int i14 = (i13 & 105) + (i13 | 105);
            f53837a = i14 % 128;
            if (i14 % 2 != 0) {
                setY(new Object[]{jArr2, Long.valueOf(jArr3[i12]), Long.valueOf(jArr[i12]), jArr6, 0}, -1270648198, 1270648209, 0);
                i12 = ((i12 & 61) - (~(-(-(i12 | 61))))) - 1;
            } else {
                int i15 = i12 << 1;
                setY(new Object[]{jArr2, Long.valueOf(jArr3[i12]), Long.valueOf(jArr[i12]), jArr6, Integer.valueOf(i15)}, -1270648198, 1270648209, i15);
                i12++;
            }
        }
        long j10 = jArr6[0];
        long j11 = jArr6[1];
        long j12 = j10 ^ jArr6[2];
        long j13 = j12 ^ j11;
        jArr6[1] = j13;
        long j14 = j11 ^ jArr6[3];
        long j15 = j12 ^ jArr6[4];
        long j16 = j15 ^ j14;
        jArr6[2] = j16;
        long j17 = j14 ^ jArr6[5];
        long j18 = j15 ^ jArr6[6];
        long j19 = j18 ^ j17;
        jArr6[3] = j19;
        long j20 = j17 ^ jArr6[7];
        long j21 = j18 ^ jArr6[8];
        long j22 = j21 ^ j20;
        jArr6[4] = j22;
        long j23 = j20 ^ jArr6[9];
        long j24 = j21 ^ jArr6[10];
        long j25 = j24 ^ j23;
        jArr6[5] = j25;
        long j26 = j23 ^ jArr6[11];
        long j27 = j24 ^ jArr6[12];
        long j28 = j27 ^ j26;
        jArr6[6] = j28;
        long j29 = j27 ^ (j26 ^ jArr6[13]);
        jArr6[7] = j10 ^ j29;
        jArr6[8] = j13 ^ j29;
        jArr6[9] = j16 ^ j29;
        jArr6[10] = j19 ^ j29;
        jArr6[11] = j22 ^ j29;
        jArr6[12] = j25 ^ j29;
        jArr6[13] = j28 ^ j29;
        setY(new Object[]{jArr2, Long.valueOf(jArr3[0] ^ jArr3[1]), Long.valueOf(jArr[0] ^ jArr[1]), jArr6, 1}, -1270648198, 1270648209, 1);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[0] ^ jArr3[2]), Long.valueOf(jArr[0] ^ jArr[2]), jArr6, 2}, -1270648198, 1270648209, 2);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[0] ^ jArr3[3]), Long.valueOf(jArr[0] ^ jArr[3]), jArr6, 3}, -1270648198, 1270648209, 3);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[1] ^ jArr3[2]), Long.valueOf(jArr[1] ^ jArr[2]), jArr6, 3}, -1270648198, 1270648209, 3);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[0] ^ jArr3[4]), Long.valueOf(jArr[0] ^ jArr[4]), jArr6, 4}, -1270648198, 1270648209, 4);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[1] ^ jArr3[3]), Long.valueOf(jArr[1] ^ jArr[3]), jArr6, 4}, -1270648198, 1270648209, 4);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[0] ^ jArr3[5]), Long.valueOf(jArr[0] ^ jArr[5]), jArr6, 5}, -1270648198, 1270648209, 5);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[1] ^ jArr3[4]), Long.valueOf(jArr[1] ^ jArr[4]), jArr6, 5}, -1270648198, 1270648209, 5);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[2] ^ jArr3[3]), Long.valueOf(jArr[2] ^ jArr[3]), jArr6, 5}, -1270648198, 1270648209, 5);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[0] ^ jArr3[6]), Long.valueOf(jArr[0] ^ jArr[6]), jArr6, 6}, -1270648198, 1270648209, 6);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[1] ^ jArr3[5]), Long.valueOf(jArr[1] ^ jArr[5]), jArr6, 6}, -1270648198, 1270648209, 6);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[2] ^ jArr3[4]), Long.valueOf(jArr[2] ^ jArr[4]), jArr6, 6}, -1270648198, 1270648209, 6);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[1] ^ jArr3[6]), Long.valueOf(jArr[1] ^ jArr[6]), jArr6, 7}, -1270648198, 1270648209, 7);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[2] ^ jArr3[5]), Long.valueOf(jArr[2] ^ jArr[5]), jArr6, 7}, -1270648198, 1270648209, 7);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[3] ^ jArr3[4]), Long.valueOf(jArr[3] ^ jArr[4]), jArr6, 7}, -1270648198, 1270648209, 7);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[2] ^ jArr3[6]), Long.valueOf(jArr[2] ^ jArr[6]), jArr6, 8}, -1270648198, 1270648209, 8);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[3] ^ jArr3[5]), Long.valueOf(jArr[3] ^ jArr[5]), jArr6, 8}, -1270648198, 1270648209, 8);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[3] ^ jArr3[6]), Long.valueOf(jArr[3] ^ jArr[6]), jArr6, 9}, -1270648198, 1270648209, 9);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[4] ^ jArr3[5]), Long.valueOf(jArr[4] ^ jArr[5]), jArr6, 9}, -1270648198, 1270648209, 9);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[4] ^ jArr3[6]), Long.valueOf(jArr[4] ^ jArr[6]), jArr6, 10}, -1270648198, 1270648209, 10);
        setY(new Object[]{jArr2, Long.valueOf(jArr3[5] ^ jArr3[6]), Long.valueOf(jArr[5] ^ jArr[6]), jArr6, 11}, -1270648198, 1270648209, 11);
        setY(new Object[]{jArr6}, -1470158355, 1470158355, (int) System.currentTimeMillis());
        int i16 = f53837a;
        int i17 = (i16 & 51) + (i16 | 51);
        f53838b = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void i(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53837a;
        int i11 = i10 & 25;
        int i12 = (((i10 ^ 25) | i11) << 1) - ((i10 | 25) & (~i11));
        f53838b = i12 % 128;
        int i13 = i12 % 2;
        long[] jArr3 = (long[]) auy.setOnFocusChangeListener(new Object[]{13}, 1783230509, -1783230493, 13);
        setY(new Object[]{jArr, jArr3}, -1305833082, 1305833089, (int) System.currentTimeMillis());
        setY(new Object[]{jArr2, jArr3, jArr2}, -1272788524, 1272788538, (int) System.currentTimeMillis());
        int i14 = f53837a;
        int i15 = ((i14 ^ 99) | (i14 & 99)) << 1;
        int i16 = -(((~i14) & 99) | (i14 & (-100)));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        f53838b = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void j(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int i10 = f53838b + 83;
        int i11 = i10 % 128;
        f53837a = i11;
        int i12 = i10 % 2;
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = jArr[8];
        long j19 = jArr[9];
        long j20 = jArr[10];
        long j21 = jArr[11];
        long j22 = jArr[12];
        long j23 = jArr[13];
        jArr[0] = j10 ^ (j11 << 59);
        jArr[1] = (j11 >>> 5) ^ (j12 << 54);
        jArr[2] = (j12 >>> 10) ^ (j13 << 49);
        jArr[3] = (j13 >>> 15) ^ (j14 << 44);
        jArr[4] = (j14 >>> 20) ^ (j15 << 39);
        jArr[5] = (j15 >>> 25) ^ (j16 << 34);
        jArr[6] = (j16 >>> 30) ^ (j17 << 29);
        jArr[7] = (j17 >>> 35) ^ (j18 << 24);
        jArr[8] = (j18 >>> 40) ^ (j19 << 19);
        jArr[9] = (j19 >>> 45) ^ (j20 << 14);
        jArr[10] = (j20 >>> 50) ^ (j21 << 9);
        jArr[11] = ((j21 >>> 55) ^ (j22 << 4)) ^ (j23 << 63);
        jArr[12] = j23 >>> 1;
        int i13 = i11 & 121;
        int i14 = i11 | 121;
        int i15 = (i13 & i14) + (i13 | i14);
        f53838b = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 77 / 0;
        }
    }

    public static /* synthetic */ void k(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53838b + 21;
        f53837a = i10 % 128;
        if (i10 % 2 == 0) {
            long[] jArr4 = (long[]) ave.setX(new Object[0], 576198305, -576198302, (int) System.currentTimeMillis());
            setY(new Object[]{jArr, jArr2, jArr4}, -1940093008, 1940093020, (int) System.currentTimeMillis());
            setY(new Object[]{jArr4, jArr3}, -323449892, 323449909, (int) System.currentTimeMillis());
        } else {
            long[] jArr5 = (long[]) ave.setX(new Object[0], 576198305, -576198302, (int) System.currentTimeMillis());
            setY(new Object[]{jArr, jArr2, jArr5}, -1940093008, 1940093020, (int) System.currentTimeMillis());
            setY(new Object[]{jArr5, jArr3}, -323449892, 323449909, (int) System.currentTimeMillis());
            throw null;
        }
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, int i10, long[] jArr2) {
        setY(new Object[]{jArr, Integer.valueOf(i10), jArr2}, 1815178923, -1815178917, i10);
    }

    public static void setDividerPadding(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, 1725909959, -1725909951, (int) System.currentTimeMillis());
    }

    public static void setNavigationOnClickListener(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, -506185616, 506185635, (int) System.currentTimeMillis());
    }

    public static int setOnFocusChangeListener(long[] jArr) {
        return ((Integer) setY(new Object[]{jArr}, 1232052216, -1232052206, (int) System.currentTimeMillis())).intValue();
    }

    public static void setX(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, -323449892, 323449909, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-755)) + (i10 * (-755));
        int i14 = ~((~i10) | (~i11));
        int i15 = i10 | i11;
        switch (((i15 | (~i12)) * 756) + (((~(i15 | i12)) | i14) * (-756)) + (i14 * 1512) + i13) {
            case 1:
                c(objArr);
                return null;
            case 2:
                g(objArr);
                return null;
            case 3:
                k(objArr);
                return null;
            case 4:
                long[] jArr = (long[]) objArr[0];
                long[] jArr2 = (long[]) objArr[1];
                long[] jArr3 = (long[]) objArr[2];
                int i16 = f53837a;
                int i17 = i16 + 33;
                f53838b = i17 % 128;
                int i18 = i17 % 2;
                jArr3[0] = jArr[0] ^ jArr2[0];
                jArr3[1] = jArr[1] ^ jArr2[1];
                jArr3[2] = jArr[2] ^ jArr2[2];
                jArr3[3] = jArr[3] ^ jArr2[3];
                jArr3[4] = jArr[4] ^ jArr2[4];
                jArr3[5] = jArr[5] ^ jArr2[5];
                jArr3[6] = jArr[6] ^ jArr2[6];
                int i19 = (i16 & (-42)) | ((~i16) & 41);
                int i20 = -(-((i16 & 41) << 1));
                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                f53838b = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 5:
                b(objArr);
                return null;
            case 6:
                f(objArr);
                return null;
            case 7:
                long[] jArr4 = (long[]) objArr[0];
                long[] jArr5 = (long[]) objArr[1];
                int i23 = f53837a;
                int i24 = (((i23 & (-82)) | ((~i23) & 81)) - (~((i23 & 81) << 1))) - 1;
                f53838b = i24 % 128;
                if (i24 % 2 == 0) {
                    auu.setCompoundDrawableTintBlendMode(new Object[]{jArr4, 45, jArr5, 1}, 1056168849, -1056168849, 45);
                    int i25 = (int) jArr4[85];
                    jArr5[35] = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i25)}, -1062202087, 1062202091, i25)).longValue();
                } else {
                    auu.setCompoundDrawableTintBlendMode(new Object[]{jArr4, 6, jArr5, 0}, 1056168849, -1056168849, 6);
                    int i26 = (int) jArr4[6];
                    jArr5[12] = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i26)}, -1062202087, 1062202091, i26)).longValue();
                }
                int i27 = f53837a;
                int i28 = i27 & 51;
                int i29 = (i27 ^ 51) | i28;
                int i30 = (i28 & i29) + (i29 | i28);
                f53838b = i30 % 128;
                int i31 = i30 % 2;
                return null;
            case 8:
                long[] jArr6 = (long[]) objArr[0];
                long[] jArr7 = (long[]) objArr[1];
                int i32 = f53838b;
                int i33 = ((i32 & 4) + (i32 | 4)) - 1;
                f53837a = i33 % 128;
                if (i33 % 2 != 0) {
                    jArr7[0] = jArr6[0] & 1;
                    jArr7[0] = jArr6[0];
                    jArr7[4] = jArr6[3];
                    jArr7[5] = jArr6[5];
                    jArr7[3] = jArr6[4];
                    jArr7[5] = jArr6[3];
                    jArr7[20] = jArr6[21];
                } else {
                    jArr7[0] = 1 ^ jArr6[0];
                    jArr7[1] = jArr6[1];
                    jArr7[2] = jArr6[2];
                    jArr7[3] = jArr6[3];
                    jArr7[4] = jArr6[4];
                    jArr7[5] = jArr6[5];
                    jArr7[6] = jArr6[6];
                }
                return null;
            case 9:
                long[] jArr8 = (long[]) objArr[0];
                long[] jArr9 = (long[]) objArr[1];
                int i34 = f53837a;
                int i35 = (i34 & 44) + (i34 | 44);
                int i36 = (i35 ^ (-1)) + (i35 << 1);
                f53838b = i36 % 128;
                int i37 = i36 % 2;
                if (((Boolean) ave.setX(new Object[]{jArr8}, 13321272, -13321271, (int) System.currentTimeMillis())).booleanValue()) {
                    throw new IllegalStateException();
                }
                long[] jArr10 = (long[]) ave.setX(new Object[0], 1520214409, -1520214407, (int) System.currentTimeMillis());
                long[] jArr11 = (long[]) ave.setX(new Object[0], 1520214409, -1520214407, (int) System.currentTimeMillis());
                long[] jArr12 = (long[]) ave.setX(new Object[0], 1520214409, -1520214407, (int) System.currentTimeMillis());
                setY(new Object[]{jArr8, jArr10}, 864873324, -864873323, (int) System.currentTimeMillis());
                setY(new Object[]{jArr10, 1, jArr11}, 1815178923, -1815178917, 1);
                setY(new Object[]{jArr10, jArr11, jArr10}, -1226536224, 1226536227, (int) System.currentTimeMillis());
                setY(new Object[]{jArr11, 1, jArr11}, 1815178923, -1815178917, 1);
                setY(new Object[]{jArr10, jArr11, jArr10}, -1226536224, 1226536227, (int) System.currentTimeMillis());
                setY(new Object[]{jArr10, 3, jArr11}, 1815178923, -1815178917, 3);
                setY(new Object[]{jArr10, jArr11, jArr10}, -1226536224, 1226536227, (int) System.currentTimeMillis());
                setY(new Object[]{jArr10, 6, jArr11}, 1815178923, -1815178917, 6);
                setY(new Object[]{jArr10, jArr11, jArr10}, -1226536224, 1226536227, (int) System.currentTimeMillis());
                setY(new Object[]{jArr10, 12, jArr11}, 1815178923, -1815178917, 12);
                setY(new Object[]{jArr10, jArr11, jArr12}, -1226536224, 1226536227, (int) System.currentTimeMillis());
                setY(new Object[]{jArr12, 24, jArr10}, 1815178923, -1815178917, 24);
                setY(new Object[]{jArr10, 24, jArr11}, 1815178923, -1815178917, 24);
                setY(new Object[]{jArr10, jArr11, jArr10}, -1226536224, 1226536227, (int) System.currentTimeMillis());
                setY(new Object[]{jArr10, 48, jArr11}, 1815178923, -1815178917, 48);
                setY(new Object[]{jArr10, jArr11, jArr10}, -1226536224, 1226536227, (int) System.currentTimeMillis());
                setY(new Object[]{jArr10, 96, jArr11}, 1815178923, -1815178917, 96);
                setY(new Object[]{jArr10, jArr11, jArr10}, -1226536224, 1226536227, (int) System.currentTimeMillis());
                setY(new Object[]{jArr10, 192, jArr11}, 1815178923, -1815178917, 192);
                setY(new Object[]{jArr10, jArr11, jArr10}, -1226536224, 1226536227, (int) System.currentTimeMillis());
                setY(new Object[]{jArr10, jArr12, jArr9}, -1226536224, 1226536227, (int) System.currentTimeMillis());
                int i38 = f53837a;
                int i39 = i38 ^ 67;
                int i40 = ((i38 & 67) | i39) << 1;
                int i41 = -i39;
                int i42 = (i40 & i41) + (i40 | i41);
                f53838b = i42 % 128;
                int i43 = i42 % 2;
                return null;
            case 10:
                long[] jArr13 = (long[]) objArr[0];
                int i44 = f53838b;
                int i45 = (i44 & 49) + (i44 | 49);
                f53837a = i45 % 128;
                int i46 = ((int) (i45 % 2 != 0 ? jArr13[0] : jArr13[0])) & 1;
                int i47 = ((i44 ^ 113) | (i44 & 113)) << 1;
                int i48 = -(((~i44) & 113) | (i44 & (-114)));
                int i49 = (i47 & i48) + (i48 | i47);
                f53837a = i49 % 128;
                int i50 = i49 % 2;
                return Integer.valueOf(i46);
            case 11:
                d(objArr);
                return null;
            case 12:
                h(objArr);
                return null;
            case 13:
                BigInteger bigInteger = (BigInteger) objArr[0];
                int i51 = f53838b + 3;
                f53837a = i51 % 128;
                int i52 = i51 % 2;
                long[] jArr14 = (long[]) auy.setOnFocusChangeListener(new Object[]{409, bigInteger}, 1678029135, -1678029124, 409);
                int i53 = f53837a;
                int i54 = ((i53 & (-48)) | ((~i53) & 47)) + ((i53 & 47) << 1);
                f53838b = i54 % 128;
                int i55 = i54 % 2;
                return jArr14;
            case 14:
                a(objArr);
                return null;
            case 15:
                e(objArr);
                return null;
            case 16:
                long[] jArr15 = (long[]) objArr[0];
                long[] jArr16 = (long[]) objArr[1];
                int i56 = f53838b;
                int i57 = (i56 & (-32)) | ((~i56) & 31);
                int i58 = (i56 & 31) << 1;
                int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                int i60 = i59 % 128;
                f53837a = i60;
                int i61 = i59 % 2;
                long j10 = jArr15[0];
                long j11 = jArr15[1];
                long j12 = jArr15[2];
                long j13 = jArr15[3];
                long j14 = jArr15[4];
                long j15 = jArr15[5];
                long j16 = jArr15[6];
                jArr16[0] = j10 & 576460752303423487L;
                jArr16[1] = ((j10 >>> 59) ^ (j11 << 5)) & 576460752303423487L;
                jArr16[2] = ((j11 >>> 54) ^ (j12 << 10)) & 576460752303423487L;
                jArr16[3] = ((j12 >>> 49) ^ (j13 << 15)) & 576460752303423487L;
                jArr16[4] = ((j13 >>> 44) ^ (j14 << 20)) & 576460752303423487L;
                jArr16[5] = ((j14 >>> 39) ^ (j15 << 25)) & 576460752303423487L;
                jArr16[6] = (j15 >>> 34) ^ (j16 << 30);
                int i62 = i60 + 85;
                f53838b = i62 % 128;
                int i63 = i62 % 2;
                return null;
            case 17:
                long[] jArr17 = (long[]) objArr[0];
                long[] jArr18 = (long[]) objArr[1];
                int i64 = f53838b + 99;
                int i65 = i64 % 128;
                f53837a = i65;
                int i66 = i64 % 2;
                long j17 = jArr17[0];
                long j18 = jArr17[1];
                long j19 = jArr17[2];
                long j20 = jArr17[3];
                long j21 = jArr17[4];
                long j22 = jArr17[5];
                long j23 = jArr17[6];
                long j24 = jArr17[7];
                long j25 = jArr17[12];
                long j26 = j22 ^ (j25 << 39);
                long j27 = j23 ^ ((j25 >>> 25) ^ (j25 << 62));
                long j28 = j24 ^ (j25 >>> 2);
                long j29 = jArr17[11];
                long j30 = j21 ^ (j29 << 39);
                long j31 = j26 ^ ((j29 >>> 25) ^ (j29 << 62));
                long j32 = j27 ^ (j29 >>> 2);
                long j33 = jArr17[10];
                long j34 = j20 ^ (j33 << 39);
                long j35 = j30 ^ ((j33 >>> 25) ^ (j33 << 62));
                long j36 = j31 ^ (j33 >>> 2);
                long j37 = jArr17[9];
                long j38 = j19 ^ (j37 << 39);
                long j39 = j34 ^ ((j37 >>> 25) ^ (j37 << 62));
                long j40 = j35 ^ (j37 >>> 2);
                long j41 = jArr17[8];
                long j42 = j32 >>> 25;
                jArr18[0] = ((j28 << 39) ^ j17) ^ j42;
                jArr18[1] = ((j18 ^ (j41 << 39)) ^ ((j28 << 62) ^ (j28 >>> 25))) ^ (j42 << 23);
                jArr18[2] = (j38 ^ ((j41 >>> 25) ^ (j41 << 62))) ^ (j28 >>> 2);
                jArr18[3] = j39 ^ (j41 >>> 2);
                jArr18[4] = j40;
                jArr18[5] = j36;
                jArr18[6] = j32 & 33554431;
                int i67 = i65 + 101;
                f53838b = i67 % 128;
                int i68 = i67 % 2;
                return null;
            case 18:
                long[] jArr19 = (long[]) objArr[0];
                long[] jArr20 = (long[]) objArr[1];
                int i69 = f53838b;
                int i70 = (((i69 ^ 109) | (i69 & 109)) << 1) - (((~i69) & 109) | (i69 & (-110)));
                f53837a = i70 % 128;
                int i71 = i70 % 2;
                long jLongValue = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr19[0])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long jLongValue2 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr19[1])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long j43 = (jLongValue & 4294967295L) | (jLongValue2 << 32);
                long j44 = (jLongValue >>> 32) | (jLongValue2 & (-4294967296L));
                long jLongValue3 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr19[2])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long jLongValue4 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr19[3])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long j45 = (jLongValue3 & 4294967295L) | (jLongValue4 << 32);
                long j46 = (jLongValue3 >>> 32) | (jLongValue4 & (-4294967296L));
                long jLongValue5 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr19[4])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long jLongValue6 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr19[5])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long j47 = (jLongValue5 & 4294967295L) | (jLongValue6 << 32);
                long j48 = (jLongValue6 & (-4294967296L)) | (jLongValue5 >>> 32);
                long jLongValue7 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr19[6])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long j49 = jLongValue7 >>> 32;
                jArr20[0] = j43 ^ (j44 << 44);
                jArr20[1] = (j45 ^ (j46 << 44)) ^ (j44 >>> 20);
                jArr20[2] = (j47 ^ (j48 << 44)) ^ (j46 >>> 20);
                jArr20[3] = (((jLongValue7 & 4294967295L) ^ (j49 << 44)) ^ (j48 >>> 20)) ^ (j44 << 13);
                jArr20[4] = (j44 >>> 51) ^ ((jLongValue7 >>> 52) ^ (j46 << 13));
                jArr20[5] = (j46 >>> 51) ^ (j48 << 13);
                jArr20[6] = (j49 << 13) ^ (j48 >>> 51);
                int i72 = f53838b;
                int i73 = i72 & 61;
                int i74 = ((((i72 ^ 61) | i73) << 1) - (~(-((i72 | 61) & (~i73))))) - 1;
                f53837a = i74 % 128;
                int i75 = i74 % 2;
                return null;
            case 19:
                i(objArr);
                return null;
            default:
                j(objArr);
                return null;
        }
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, -663813650, 663813668, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, 339830776, -339830761, (int) System.currentTimeMillis());
    }

    public static long[] setX(BigInteger bigInteger) {
        return (long[]) setY(new Object[]{bigInteger}, -1455580171, 1455580184, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, long[] jArr2, long[] jArr3) {
        setY(new Object[]{jArr, jArr2, jArr3}, -1226536224, 1226536227, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2, long[] jArr3) {
        setY(new Object[]{jArr, jArr2, jArr3}, 266129494, -266129490, (int) System.currentTimeMillis());
    }

    public static void setY(long[] jArr, long[] jArr2, long[] jArr3) {
        setY(new Object[]{jArr, jArr2, jArr3}, 234880743, -234880738, (int) System.currentTimeMillis());
    }

    public static void setY(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, 749935379, -749935370, (int) System.currentTimeMillis());
    }
}
