package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class atl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f53829a = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53830b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53831c = 1;

    static {
        int i10 = (1 - (-79)) - 2;
        f53830b = i10 % 128;
        int i11 = i10 % 2;
    }

    public static /* synthetic */ void a(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53831c;
        int i11 = i10 & 113;
        int i12 = (~i11) & (i10 | 113);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i13 | i12);
        f53830b = i14 % 128;
        int i15 = i14 % 2;
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        jArr2[0] = j10 & 144115188075855871L;
        jArr2[1] = ((j10 >>> 57) ^ (j11 << 7)) & 144115188075855871L;
        jArr2[2] = ((j11 >>> 50) ^ (j12 << 14)) & 144115188075855871L;
        jArr2[3] = ((j12 >>> 43) ^ (j13 << 21)) & 144115188075855871L;
        jArr2[4] = (j13 >>> 36) ^ (j14 << 28);
        int i16 = ((i10 | 70) << 1) - (i10 ^ 70);
        int i17 = (i16 ^ (-1)) + (i16 << 1);
        f53830b = i17 % 128;
        if (i17 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void b(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53830b;
        int i11 = i10 & 107;
        int i12 = (i10 ^ 107) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        f53831c = i13 % 128;
        int i14 = i13 % 2;
        auu.setCompoundDrawableTintBlendMode(new Object[]{jArr, 4, jArr2, 0}, 1056168849, -1056168849, 4);
        int i15 = (int) jArr[4];
        jArr2[8] = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i15)}, -1062202087, 1062202091, i15)).longValue();
        int i16 = f53831c + 109;
        f53830b = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 92 / 0;
        }
    }

    public static /* synthetic */ void c(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53831c + 97;
        f53830b = i10 % 128;
        if (i10 % 2 == 0) {
            long[] jArr4 = (long[]) avc.setDividerPadding(new Object[0], 1500667029, -1500667028, (int) System.currentTimeMillis());
            setDividerPadding(new Object[]{jArr, jArr2, jArr4}, 1975961724, -1975961720, (int) System.currentTimeMillis());
            setDividerPadding(new Object[]{jArr3, jArr4, jArr3}, 330478027, -330478017, (int) System.currentTimeMillis());
        } else {
            long[] jArr5 = (long[]) avc.setDividerPadding(new Object[0], 1500667029, -1500667028, (int) System.currentTimeMillis());
            setDividerPadding(new Object[]{jArr, jArr2, jArr5}, 1975961724, -1975961720, (int) System.currentTimeMillis());
            setDividerPadding(new Object[]{jArr3, jArr5, jArr3}, 330478027, -330478017, (int) System.currentTimeMillis());
            throw null;
        }
    }

    public static /* synthetic */ void d(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int i10 = f53831c;
        int i11 = ((i10 ^ 118) + ((i10 & 118) << 1)) - 1;
        f53830b = i11 % 128;
        int i12 = i11 % 2;
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
        jArr[0] = j10 ^ (j11 << 57);
        jArr[1] = (j11 >>> 7) ^ (j12 << 50);
        jArr[2] = (j12 >>> 14) ^ (j13 << 43);
        jArr[3] = (j13 >>> 21) ^ (j14 << 36);
        jArr[4] = (j14 >>> 28) ^ (j15 << 29);
        jArr[5] = (j15 >>> 35) ^ (j16 << 22);
        jArr[6] = (j16 >>> 42) ^ (j17 << 15);
        jArr[7] = (j17 >>> 49) ^ (j18 << 8);
        jArr[8] = (j18 >>> 56) ^ (j19 << 1);
        jArr[9] = j19 >>> 63;
        int i13 = i10 & 61;
        int i14 = -(-((i10 ^ 61) | i13));
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        f53830b = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void e(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53831c;
        int i11 = (((i10 & (-14)) | ((~i10) & 13)) - (~((i10 & 13) << 1))) - 1;
        f53830b = i11 % 128;
        if (i11 % 2 != 0) {
            long[] jArr3 = (long[]) auy.setOnFocusChangeListener(new Object[]{35}, 1783230509, -1783230493, 35);
            setDividerPadding(new Object[]{jArr, jArr3}, 70173265, -70173260, (int) System.currentTimeMillis());
            setDividerPadding(new Object[]{jArr3, jArr2}, -1362515053, 1362515072, (int) System.currentTimeMillis());
        } else {
            long[] jArr4 = (long[]) auy.setOnFocusChangeListener(new Object[]{9}, 1783230509, -1783230493, 9);
            setDividerPadding(new Object[]{jArr, jArr4}, 70173265, -70173260, (int) System.currentTimeMillis());
            setDividerPadding(new Object[]{jArr4, jArr2}, -1362515053, 1362515072, (int) System.currentTimeMillis());
        }
        int i12 = f53831c;
        int i13 = (i12 | 121) << 1;
        int i14 = -(((~i12) & 121) | (i12 & (-122)));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        f53830b = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void f(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53831c;
        int i11 = i10 & 7;
        int i12 = (i11 - (~(-(-((i10 ^ 7) | i11))))) - 1;
        f53830b = i12 % 128;
        if (i12 % 2 != 0) {
            long[] jArr4 = (long[]) avc.setDividerPadding(new Object[0], 1500667029, -1500667028, (int) System.currentTimeMillis());
            setDividerPadding(new Object[]{jArr, jArr2, jArr4}, 1975961724, -1975961720, (int) System.currentTimeMillis());
            setDividerPadding(new Object[]{jArr4, jArr3}, -1362515053, 1362515072, (int) System.currentTimeMillis());
            throw null;
        }
        long[] jArr5 = (long[]) avc.setDividerPadding(new Object[0], 1500667029, -1500667028, (int) System.currentTimeMillis());
        setDividerPadding(new Object[]{jArr, jArr2, jArr5}, 1975961724, -1975961720, (int) System.currentTimeMillis());
        setDividerPadding(new Object[]{jArr5, jArr3}, -1362515053, 1362515072, (int) System.currentTimeMillis());
        int i13 = f53831c;
        int i14 = (i13 ^ 9) + ((i13 & 9) << 1);
        f53830b = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void g(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53831c;
        int i11 = i10 + 47;
        f53830b = i11 % 128;
        int i12 = i11 % 2;
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        int i13 = (((i10 & (-18)) | ((~i10) & 17)) - (~((i10 & 17) << 1))) - 1;
        f53830b = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 55 / 0;
        }
    }

    public static /* synthetic */ void h(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53830b;
        int i11 = ((i10 | 115) << 1) - (i10 ^ 115);
        f53831c = i11 % 128;
        int i12 = i11 % 2;
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        setDividerPadding(new Object[]{jArr, jArr4}, 1909921637, -1909921621, (int) System.currentTimeMillis());
        setDividerPadding(new Object[]{jArr2, jArr5}, 1909921637, -1909921621, (int) System.currentTimeMillis());
        long[] jArr6 = new long[26];
        setDividerPadding(new Object[]{jArr3, Long.valueOf(jArr4[0]), Long.valueOf(jArr5[0]), jArr6, 0}, -1105422190, 1105422196, 0);
        setDividerPadding(new Object[]{jArr3, Long.valueOf(jArr4[1]), Long.valueOf(jArr5[1]), jArr6, 2}, -1105422190, 1105422196, 2);
        setDividerPadding(new Object[]{jArr3, Long.valueOf(jArr4[2]), Long.valueOf(jArr5[2]), jArr6, 4}, -1105422190, 1105422196, 4);
        setDividerPadding(new Object[]{jArr3, Long.valueOf(jArr4[3]), Long.valueOf(jArr5[3]), jArr6, 6}, -1105422190, 1105422196, 6);
        setDividerPadding(new Object[]{jArr3, Long.valueOf(jArr4[4]), Long.valueOf(jArr5[4]), jArr6, 8}, -1105422190, 1105422196, 8);
        long j10 = jArr4[0];
        long j11 = j10 ^ jArr4[1];
        long j12 = jArr5[0];
        long j13 = j12 ^ jArr5[1];
        long j14 = jArr4[2];
        long j15 = j10 ^ j14;
        long j16 = jArr5[2];
        long j17 = j12 ^ j16;
        long j18 = jArr4[4];
        long j19 = j14 ^ j18;
        long j20 = jArr5[4];
        long j21 = j16 ^ j20;
        long j22 = jArr4[3];
        long j23 = j22 ^ j18;
        long j24 = jArr5[3];
        long j25 = j24 ^ j20;
        setDividerPadding(new Object[]{jArr3, Long.valueOf(j15 ^ j22), Long.valueOf(j17 ^ j24), jArr6, 18}, -1105422190, 1105422196, 18);
        setDividerPadding(new Object[]{jArr3, Long.valueOf(j19 ^ jArr4[1]), Long.valueOf(j21 ^ jArr5[1]), jArr6, 20}, -1105422190, 1105422196, 20);
        long j26 = j11 ^ j23;
        long j27 = j13 ^ j25;
        long j28 = j26 ^ jArr4[2];
        long j29 = j27 ^ jArr5[2];
        setDividerPadding(new Object[]{jArr3, Long.valueOf(j26), Long.valueOf(j27), jArr6, 22}, -1105422190, 1105422196, 22);
        setDividerPadding(new Object[]{jArr3, Long.valueOf(j28), Long.valueOf(j29), jArr6, 24}, -1105422190, 1105422196, 24);
        setDividerPadding(new Object[]{jArr3, Long.valueOf(j11), Long.valueOf(j13), jArr6, 10}, -1105422190, 1105422196, 10);
        setDividerPadding(new Object[]{jArr3, Long.valueOf(j15), Long.valueOf(j17), jArr6, 12}, -1105422190, 1105422196, 12);
        setDividerPadding(new Object[]{jArr3, Long.valueOf(j19), Long.valueOf(j21), jArr6, 14}, -1105422190, 1105422196, 14);
        setDividerPadding(new Object[]{jArr3, Long.valueOf(j23), Long.valueOf(j25), jArr6, 16}, -1105422190, 1105422196, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j30 = jArr6[0];
        long j31 = j30 ^ jArr6[1];
        long j32 = j31 ^ jArr6[2];
        long j33 = j32 ^ jArr6[10];
        jArr3[1] = j33;
        long j34 = jArr6[3] ^ jArr6[4];
        long j35 = j32 ^ (j34 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j35;
        long j36 = j31 ^ j34;
        long j37 = jArr6[5] ^ jArr6[6];
        long j38 = jArr6[8];
        long j39 = (j36 ^ j37) ^ j38;
        long j40 = jArr6[13] ^ jArr6[14];
        long j41 = jArr6[18];
        long j42 = jArr6[22];
        long j43 = jArr6[24];
        jArr3[3] = (j39 ^ j40) ^ ((j41 ^ j42) ^ j43);
        long j44 = jArr6[7] ^ j38;
        long j45 = jArr6[9];
        long j46 = j44 ^ j45;
        long j47 = j46 ^ jArr6[17];
        jArr3[8] = j47;
        long j48 = (j46 ^ j37) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j48;
        long j49 = j48 ^ j33;
        long j50 = jArr6[19] ^ jArr6[20];
        long j51 = jArr6[25];
        long j52 = jArr6[23];
        long j53 = j50 ^ (j51 ^ j43);
        jArr3[4] = (j53 ^ (j41 ^ j52)) ^ j49;
        long j54 = jArr6[21];
        jArr3[5] = ((j35 ^ j47) ^ j53) ^ (j54 ^ j42);
        jArr3[6] = (((((j39 ^ j30) ^ j45) ^ j40) ^ j54) ^ j52) ^ j51;
        setDividerPadding(new Object[]{jArr3}, 159042663, -159042645, (int) System.currentTimeMillis());
        int i13 = f53830b;
        int i14 = (((i13 | 8) << 1) - (i13 ^ 8)) - 1;
        f53831c = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void i(Object[] objArr) {
        long[] jArr;
        long[] jArr2 = (long[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53830b;
        int i11 = i10 & 87;
        int i12 = ((i10 ^ 87) | i11) << 1;
        int i13 = -((i10 | 87) & (~i11));
        int i14 = (i12 & i13) + (i13 | i12);
        f53831c = i14 % 128;
        if (i14 % 2 == 0) {
            jArr = (long[]) auy.setOnFocusChangeListener(new Object[]{116}, 1783230509, -1783230493, 116);
            setDividerPadding(new Object[]{jArr2, jArr}, 70173265, -70173260, (int) System.currentTimeMillis());
            setDividerPadding(new Object[]{jArr, jArr3}, -1362515053, 1362515072, (int) System.currentTimeMillis());
        } else {
            jArr = (long[]) auy.setOnFocusChangeListener(new Object[]{9}, 1783230509, -1783230493, 9);
            setDividerPadding(new Object[]{jArr2, jArr}, 70173265, -70173260, (int) System.currentTimeMillis());
            setDividerPadding(new Object[]{jArr, jArr3}, -1362515053, 1362515072, (int) System.currentTimeMillis());
        }
        while (true) {
            int i15 = ~iIntValue;
            int i16 = -(-(iIntValue << 1));
            iIntValue = (i15 ^ i16) + ((i15 & i16) << 1);
            if (iIntValue <= 0) {
                break;
            }
            int i17 = f53831c + 95;
            f53830b = i17 % 128;
            int i18 = i17 % 2;
            setDividerPadding(new Object[]{jArr3, jArr}, 70173265, -70173260, (int) System.currentTimeMillis());
            setDividerPadding(new Object[]{jArr, jArr3}, -1362515053, 1362515072, (int) System.currentTimeMillis());
            int i19 = f53830b + 39;
            f53831c = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = f53831c;
        int i22 = i21 ^ 47;
        int i23 = (i21 & 47) << 1;
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        f53830b = i24 % 128;
        if (i24 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void j(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53830b;
        int i11 = (-2) - (((i10 & 32) + (i10 | 32)) ^ (-1));
        f53831c = i11 % 128;
        int i12 = i11 % 2;
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = jArr[8];
        long j19 = j14 ^ ((((j18 >>> 27) ^ (j18 >>> 22)) ^ (j18 >>> 20)) ^ (j18 >>> 15));
        long j20 = j10 ^ ((((j15 << 37) ^ (j15 << 42)) ^ (j15 << 44)) ^ (j15 << 49));
        long j21 = (j11 ^ ((((j16 << 37) ^ (j16 << 42)) ^ (j16 << 44)) ^ (j16 << 49))) ^ ((((j15 >>> 27) ^ (j15 >>> 22)) ^ (j15 >>> 20)) ^ (j15 >>> 15));
        long j22 = j19 >>> 27;
        jArr2[0] = (((j20 ^ j22) ^ (j22 << 5)) ^ (j22 << 7)) ^ (j22 << 12);
        jArr2[1] = j21;
        jArr2[2] = (j12 ^ ((((j17 << 37) ^ (j17 << 42)) ^ (j17 << 44)) ^ (j17 << 49))) ^ ((((j16 >>> 27) ^ (j16 >>> 22)) ^ (j16 >>> 20)) ^ (j16 >>> 15));
        jArr2[3] = (j13 ^ ((((j18 << 37) ^ (j18 << 42)) ^ (j18 << 44)) ^ (j18 << 49))) ^ ((((j17 >>> 27) ^ (j17 >>> 22)) ^ (j17 >>> 20)) ^ (j17 >>> 15));
        jArr2[4] = j19 & 134217727;
        int i13 = (i10 ^ 31) + ((i10 & 31) << 1);
        f53831c = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void k(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53831c;
        int i11 = ((i10 ^ 33) | (i10 & 33)) << 1;
        int i12 = -(((~i10) & 33) | (i10 & (-34)));
        int i13 = (i11 & i12) + (i12 | i11);
        f53830b = i13 % 128;
        int i14 = i13 % 2;
        long[] jArr3 = (long[]) auy.setOnFocusChangeListener(new Object[]{9}, 1783230509, -1783230493, 9);
        setDividerPadding(new Object[]{jArr, jArr3}, 70173265, -70173260, (int) System.currentTimeMillis());
        setDividerPadding(new Object[]{jArr2, jArr3, jArr2}, 330478027, -330478017, (int) System.currentTimeMillis());
        int i15 = f53831c;
        int i16 = i15 & 17;
        int i17 = -(-((i15 ^ 17) | i16));
        int i18 = (i16 & i17) + (i17 | i16);
        f53830b = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void l(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53830b;
        int i11 = i10 & 1;
        int i12 = -(-((i10 ^ 1) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f53831c = i13 % 128;
        int i14 = i13 % 2;
        long[] jArr3 = (long[]) avc.setDividerPadding(new Object[0], 961547691, -961547687, (int) System.currentTimeMillis());
        long jLongValue = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr[0])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
        long jLongValue2 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr[1])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
        long j10 = (jLongValue & 4294967295L) | (jLongValue2 << 32);
        jArr3[0] = (jLongValue >>> 32) | (jLongValue2 & (-4294967296L));
        long jLongValue3 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr[2])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
        long jLongValue4 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr[3])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
        jArr3[1] = (jLongValue3 >>> 32) | (jLongValue4 & (-4294967296L));
        long jLongValue5 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr[4])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
        jArr3[2] = jLongValue5 >>> 32;
        setDividerPadding(new Object[]{jArr3, f53829a, jArr2}, 1293892445, -1293892430, (int) System.currentTimeMillis());
        jArr2[0] = jArr2[0] ^ j10;
        jArr2[1] = jArr2[1] ^ ((jLongValue3 & 4294967295L) | (jLongValue4 << 32));
        jArr2[2] = jArr2[2] ^ (jLongValue5 & 4294967295L);
        int i15 = f53831c;
        int i16 = i15 ^ 107;
        int i17 = (((i15 & 107) | i16) << 1) - i16;
        f53830b = i17 % 128;
        if (i17 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void m(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53831c;
        int i11 = (i10 & 45) + (i10 | 45);
        int i12 = i11 % 128;
        f53830b = i12;
        if (i11 % 2 != 0) {
            jArr2[0] = jArr[0] / 0;
            jArr2[1] = jArr[1];
            long j10 = jArr[4];
            jArr2[5] = j10;
            jArr2[3] = jArr[2];
            jArr2[2] = j10;
        } else {
            jArr2[0] = jArr[0] ^ 1;
            jArr2[1] = jArr[1];
            jArr2[2] = jArr[2];
            jArr2[3] = jArr[3];
            jArr2[4] = jArr[4];
        }
        int i13 = (i12 & 69) + (i12 | 69);
        f53831c = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, long[] jArr2) {
        setDividerPadding(new Object[]{jArr, jArr2}, -31002354, 31002354, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = (i11 * (-520)) + (i10 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY);
        int i15 = ~i12;
        int i16 = ((i11 | i12) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (((~(i15 | i11)) | i10) * (-1042)) + i14;
        int i17 = ~i10;
        int i18 = (((~(i10 | i15 | i11)) | (~(i12 | i17)) | (~((~i11) | i17))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i16;
        switch (i18) {
            case 1:
                long[] jArr = (long[]) objArr[0];
                long[] jArr2 = (long[]) objArr[1];
                int i19 = f53830b;
                int i20 = (i19 | 19) << 1;
                int i21 = -((i19 & (-20)) | ((~i19) & 19));
                int i22 = (i20 & i21) + (i21 | i20);
                int i23 = i22 % 128;
                f53831c = i23;
                if (i22 % 2 == 0) {
                    long j10 = jArr2[0];
                    long j11 = jArr[1];
                    long j12 = j10 % j11;
                    jArr2[0] = j12;
                    jArr2[0] = j12 & j11;
                    long j13 = jArr2[2] / jArr[4];
                    jArr2[2] = j13;
                    long j14 = jArr2[4];
                    long j15 = jArr[2];
                    jArr2[4] = j14 - j15;
                    jArr2[2] = j13 & j15;
                } else {
                    jArr2[0] = jArr2[0] ^ jArr[0];
                    jArr2[1] = jArr2[1] ^ jArr[1];
                    jArr2[2] = jArr2[2] ^ jArr[2];
                    jArr2[3] = jArr2[3] ^ jArr[3];
                    jArr2[4] = jArr2[4] ^ jArr[4];
                }
                int i24 = i23 & 33;
                int i25 = (i23 | 33) & (~i24);
                int i26 = i24 << 1;
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                f53830b = i27 % 128;
                int i28 = i27 % 2;
                return null;
            case 2:
                k(objArr);
                return null;
            case 3:
                long[] jArr3 = (long[]) objArr[0];
                long[] jArr4 = (long[]) objArr[1];
                int i29 = f53830b + 57;
                f53831c = i29 % 128;
                int i30 = i29 % 2;
                long[] jArr5 = (long[]) auy.setOnFocusChangeListener(new Object[]{9}, 1783230509, -1783230493, 9);
                avc.setDividerPadding(new Object[]{jArr3, jArr4}, -1373809177, 1373809180, (int) System.currentTimeMillis());
                int i31 = f53830b;
                int i32 = i31 ^ 65;
                int i33 = ((i31 & 65) | i32) << 1;
                int i34 = -i32;
                int i35 = (i33 & i34) + (i33 | i34);
                f53831c = i35 % 128;
                int i36 = i35 % 2;
                int i37 = 1;
                for (int i38 = 283; i37 < i38; i38 = 283) {
                    int i39 = f53831c;
                    int i40 = i39 ^ 95;
                    int i41 = ((i39 & 95) | i40) << 1;
                    int i42 = -i40;
                    int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
                    f53830b = i43 % 128;
                    if (i43 % 2 != 0) {
                        int i44 = i37;
                        setDividerPadding(new Object[]{jArr4, jArr5}, 70173265, -70173260, (int) System.currentTimeMillis());
                        setDividerPadding(new Object[]{jArr5, jArr4}, -1362515053, 1362515072, (int) System.currentTimeMillis());
                        setDividerPadding(new Object[]{jArr4, jArr5}, 70173265, -70173260, (int) System.currentTimeMillis());
                        setDividerPadding(new Object[]{jArr5, jArr4}, -1362515053, 1362515072, (int) System.currentTimeMillis());
                        setDividerPadding(new Object[]{jArr3, jArr4}, -1865476179, 1865476180, (int) System.currentTimeMillis());
                        i13 = (((i44 | 80) << 1) - (~(-((i44 & (-81)) | ((~i44) & 80))))) - 1;
                    } else {
                        int i45 = i37;
                        setDividerPadding(new Object[]{jArr4, jArr5}, 70173265, -70173260, (int) System.currentTimeMillis());
                        setDividerPadding(new Object[]{jArr5, jArr4}, -1362515053, 1362515072, (int) System.currentTimeMillis());
                        setDividerPadding(new Object[]{jArr4, jArr5}, 70173265, -70173260, (int) System.currentTimeMillis());
                        setDividerPadding(new Object[]{jArr5, jArr4}, -1362515053, 1362515072, (int) System.currentTimeMillis());
                        setDividerPadding(new Object[]{jArr3, jArr4}, -1865476179, 1865476180, (int) System.currentTimeMillis());
                        i13 = ((i45 & 3) + (i45 | 3)) - 1;
                    }
                    i37 = i13;
                }
                int i46 = f53831c;
                int i47 = i46 & 91;
                int i48 = -(-((i46 ^ 91) | i47));
                int i49 = (i47 & i48) + (i48 | i47);
                f53830b = i49 % 128;
                int i50 = i49 % 2;
                return null;
            case 4:
                h(objArr);
                return null;
            case 5:
                b(objArr);
                return null;
            case 6:
                long[] jArr6 = (long[]) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                long jLongValue2 = ((Number) objArr[2]).longValue();
                long[] jArr7 = (long[]) objArr[3];
                int iIntValue = ((Number) objArr[4]).intValue();
                int i51 = f53831c + 101;
                int i52 = i51 % 128;
                f53830b = i52;
                int i53 = i51 % 2;
                jArr6[1] = jLongValue2;
                long j16 = jLongValue2 << 1;
                jArr6[2] = j16;
                long j17 = j16 ^ jLongValue2;
                jArr6[3] = j17;
                long j18 = jLongValue2 << 2;
                jArr6[4] = j18;
                jArr6[5] = j18 ^ jLongValue2;
                long j19 = j17 << 1;
                jArr6[6] = j19;
                jArr6[7] = j19 ^ jLongValue2;
                long j20 = jArr6[((int) jLongValue) & 7];
                int i54 = i52 + 43;
                f53831c = i54 % 128;
                int i55 = i54 % 2;
                long j21 = 0;
                int i56 = 48;
                do {
                    int i57 = (int) (jLongValue >>> i56);
                    long j22 = (jArr6[i57 & 7] ^ (jArr6[(i57 >>> 3) & 7] << 3)) ^ (jArr6[(i57 >>> 6) & 7] << 6);
                    j20 ^= j22 << i56;
                    j21 ^= j22 >>> (-i56);
                    int i58 = i56 & (-89);
                    int i59 = i58 + ((i56 ^ (-89)) | i58);
                    i56 = ((i59 & 81) + (i59 | 81)) - 1;
                } while (i56 > 0);
                int i60 = f53830b;
                int i61 = (i60 ^ 9) + ((i60 & 9) << 1);
                int i62 = i61 % 128;
                f53831c = i62;
                int i63 = i61 % 2;
                jArr7[iIntValue] = 144115188075855871L & j20;
                int i64 = (iIntValue ^ 2) + ((iIntValue & 2) << 1);
                jArr7[(i64 ^ (-1)) + (i64 << 1)] = ((j21 ^ (((72198606942111744L & jLongValue) & ((jLongValue2 << 7) >> 63)) >>> 8)) << 7) ^ (j20 >>> 57);
                int i65 = ((((i62 ^ 91) | (i62 & 91)) << 1) - (~(-(((~i62) & 91) | (i62 & (-92)))))) - 1;
                f53830b = i65 % 128;
                int i66 = i65 % 2;
                return null;
            case 7:
                c(objArr);
                return null;
            case 8:
                long[] jArr8 = (long[]) objArr[0];
                long[] jArr9 = (long[]) objArr[1];
                int i67 = f53831c;
                int i68 = i67 & 3;
                int i69 = (((i67 ^ 3) | i68) << 1) - ((i67 | 3) & (~i68));
                f53830b = i69 % 128;
                int i70 = i69 % 2;
                if (((Boolean) avc.setDividerPadding(new Object[]{jArr8}, 263394784, -263394778, (int) System.currentTimeMillis())).booleanValue()) {
                    throw new IllegalStateException();
                }
                long[] jArr10 = (long[]) avc.setDividerPadding(new Object[0], 961547691, -961547687, (int) System.currentTimeMillis());
                long[] jArr11 = (long[]) avc.setDividerPadding(new Object[0], 961547691, -961547687, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{jArr8, jArr10}, -1235691421, 1235691435, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{jArr10, jArr8, jArr10}, 1293892445, -1293892430, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{jArr10, 2, jArr11}, -607892194, 607892207, 2);
                setDividerPadding(new Object[]{jArr11, jArr10, jArr11}, 1293892445, -1293892430, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{jArr11, 4, jArr10}, -607892194, 607892207, 4);
                setDividerPadding(new Object[]{jArr10, jArr11, jArr10}, 1293892445, -1293892430, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{jArr10, 8, jArr11}, -607892194, 607892207, 8);
                setDividerPadding(new Object[]{jArr11, jArr10, jArr11}, 1293892445, -1293892430, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{jArr11, jArr11}, -1235691421, 1235691435, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{jArr11, jArr8, jArr11}, 1293892445, -1293892430, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{jArr11, 17, jArr10}, -607892194, 607892207, 17);
                setDividerPadding(new Object[]{jArr10, jArr11, jArr10}, 1293892445, -1293892430, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{jArr10, jArr10}, -1235691421, 1235691435, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{jArr10, jArr8, jArr10}, 1293892445, -1293892430, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{jArr10, 35, jArr11}, -607892194, 607892207, 35);
                setDividerPadding(new Object[]{jArr11, jArr10, jArr11}, 1293892445, -1293892430, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{jArr11, 70, jArr10}, -607892194, 607892207, 70);
                setDividerPadding(new Object[]{jArr10, jArr11, jArr10}, 1293892445, -1293892430, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{jArr10, jArr10}, -1235691421, 1235691435, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{jArr10, jArr8, jArr10}, 1293892445, -1293892430, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{jArr10, 141, jArr11}, -607892194, 607892207, 141);
                setDividerPadding(new Object[]{jArr11, jArr10, jArr11}, 1293892445, -1293892430, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{jArr11, jArr9}, -1235691421, 1235691435, (int) System.currentTimeMillis());
                int i71 = f53830b;
                int i72 = i71 & 35;
                int i73 = (i72 - (~(-(-((i71 ^ 35) | i72))))) - 1;
                f53831c = i73 % 128;
                int i74 = i73 % 2;
                return null;
            case 9:
                g(objArr);
                return null;
            case 10:
                long[] jArr12 = (long[]) objArr[0];
                long[] jArr13 = (long[]) objArr[1];
                long[] jArr14 = (long[]) objArr[2];
                int i75 = f53831c;
                int i76 = i75 + 119;
                f53830b = i76 % 128;
                int i77 = i76 % 2;
                jArr14[0] = jArr12[0] ^ jArr13[0];
                jArr14[1] = jArr12[1] ^ jArr13[1];
                jArr14[2] = jArr12[2] ^ jArr13[2];
                jArr14[3] = jArr12[3] ^ jArr13[3];
                jArr14[4] = jArr12[4] ^ jArr13[4];
                jArr14[5] = jArr12[5] ^ jArr13[5];
                jArr14[6] = jArr12[6] ^ jArr13[6];
                jArr14[7] = jArr12[7] ^ jArr13[7];
                jArr14[8] = jArr13[8] ^ jArr12[8];
                int i78 = ((i75 ^ 52) + ((i75 & 52) << 1)) - 1;
                f53830b = i78 % 128;
                int i79 = i78 % 2;
                return null;
            case 11:
                BigInteger bigInteger = (BigInteger) objArr[0];
                int i80 = f53831c;
                int i81 = (i80 ^ 117) + ((i80 & 117) << 1);
                f53830b = i81 % 128;
                long[] jArr15 = (long[]) (i81 % 2 != 0 ? auy.setOnFocusChangeListener(new Object[]{816, bigInteger}, 1678029135, -1678029124, 816) : auy.setOnFocusChangeListener(new Object[]{283, bigInteger}, 1678029135, -1678029124, 283));
                int i82 = f53830b;
                int i83 = (i82 & 103) + (i82 | 103);
                f53831c = i83 % 128;
                int i84 = i83 % 2;
                return jArr15;
            case 12:
                long[] jArr16 = (long[]) objArr[0];
                int i85 = f53831c;
                int i86 = i85 | 53;
                int i87 = i86 << 1;
                int i88 = -((~(i85 & 53)) & i86);
                int i89 = (i87 ^ i88) + ((i88 & i87) << 1);
                int i90 = i89 % 128;
                f53830b = i90;
                int i91 = i89 % 2;
                int i92 = ((int) (jArr16[0] ^ (jArr16[4] >>> 15))) & 1;
                int i93 = ((((i90 ^ 3) | (i90 & 3)) << 1) - (~(-(((~i90) & 3) | (i90 & (-4)))))) - 1;
                f53831c = i93 % 128;
                int i94 = i93 % 2;
                return Integer.valueOf(i92);
            case 13:
                i(objArr);
                return null;
            case 14:
                e(objArr);
                return null;
            case 15:
                f(objArr);
                return null;
            case 16:
                a(objArr);
                return null;
            case 17:
                m(objArr);
                return null;
            case 18:
                d(objArr);
                return null;
            case 19:
                j(objArr);
                return null;
            default:
                l(objArr);
                return null;
        }
    }

    public static void setNavigationOnClickListener(long[] jArr, long[] jArr2) {
        setDividerPadding(new Object[]{jArr, jArr2}, -1243331134, 1243331136, (int) System.currentTimeMillis());
    }

    public static void setOnDragListener(long[] jArr, long[] jArr2) {
        setDividerPadding(new Object[]{jArr, jArr2}, -1235691421, 1235691435, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2, long[] jArr3) {
        setDividerPadding(new Object[]{jArr, jArr2, jArr3}, -467707813, 467707820, (int) System.currentTimeMillis());
    }

    public static int setX(long[] jArr) {
        return ((Integer) setDividerPadding(new Object[]{jArr}, -476509198, 476509210, (int) System.currentTimeMillis())).intValue();
    }

    public static void setY(long[] jArr, int i10, long[] jArr2) {
        setDividerPadding(new Object[]{jArr, Integer.valueOf(i10), jArr2}, -607892194, 607892207, i10);
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2) {
        setDividerPadding(new Object[]{jArr, jArr2}, 2062523667, -2062523659, (int) System.currentTimeMillis());
    }

    public static void setX(long[] jArr, long[] jArr2, long[] jArr3) {
        setDividerPadding(new Object[]{jArr, jArr2, jArr3}, 1293892445, -1293892430, (int) System.currentTimeMillis());
    }

    public static void setY(long[] jArr, long[] jArr2) {
        setDividerPadding(new Object[]{jArr, jArr2}, -1362515053, 1362515072, (int) System.currentTimeMillis());
    }

    public static long[] setX(BigInteger bigInteger) {
        return (long[]) setDividerPadding(new Object[]{bigInteger}, 32757687, -32757676, (int) System.currentTimeMillis());
    }

    public static void setX(long[] jArr, long[] jArr2) {
        setDividerPadding(new Object[]{jArr, jArr2}, -2111260361, 2111260378, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(long[] jArr, long[] jArr2) {
        setDividerPadding(new Object[]{jArr, jArr2}, 438276371, -438276368, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(long[] jArr, long[] jArr2, long[] jArr3) {
        setDividerPadding(new Object[]{jArr, jArr2, jArr3}, 312716252, -312716243, (int) System.currentTimeMillis());
    }
}
