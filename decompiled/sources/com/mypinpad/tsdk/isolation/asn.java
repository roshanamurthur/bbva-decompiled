package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class asn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53763a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53764b = 1;

    public static /* synthetic */ void a(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        long[] jArr2 = (long[]) objArr[2];
        int i10 = f53763a;
        int i11 = i10 & 39;
        int i12 = -(-((i10 ^ 39) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f53764b = i13 % 128;
        if (i13 % 2 == 0) {
            long[] jArr3 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr3}, -1828537641, 1828537642, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr3, jArr2}, -1099447195, 1099447211, (int) System.currentTimeMillis());
            throw null;
        }
        long[] jArr4 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr4}, -1828537641, 1828537642, (int) System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new Object[]{jArr4, jArr2}, -1099447195, 1099447211, (int) System.currentTimeMillis());
        int i14 = f53764b + 51;
        f53763a = i14 % 128;
        while (true) {
            int i15 = i14 % 2;
            int i16 = ((iIntValue & (-116)) + (iIntValue | (-116))) - 1;
            int i17 = i16 & 116;
            iIntValue = i17 + ((i16 ^ 116) | i17);
            if (iIntValue <= 0) {
                int i18 = f53763a;
                int i19 = (i18 | 13) << 1;
                int i20 = -(((~i18) & 13) | (i18 & (-14)));
                int i21 = (i19 & i20) + (i20 | i19);
                f53764b = i21 % 128;
                int i22 = i21 % 2;
                return;
            }
            int i23 = f53763a;
            int i24 = ((i23 & 93) - (~(i23 | 93))) - 1;
            f53764b = i24 % 128;
            Object[] objArr2 = new Object[2];
            if (i24 % 2 == 0) {
                objArr2[0] = jArr2;
                objArr2[1] = jArr4;
                setCompoundDrawableTintBlendMode(objArr2, -1828537641, 1828537642, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr4, jArr2}, -1099447195, 1099447211, (int) System.currentTimeMillis());
                throw null;
            }
            objArr2[0] = jArr2;
            objArr2[1] = jArr4;
            setCompoundDrawableTintBlendMode(objArr2, -1828537641, 1828537642, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr4, jArr2}, -1099447195, 1099447211, (int) System.currentTimeMillis());
            i14 = f53763a + 57;
            f53764b = i14 % 128;
        }
    }

    public static /* synthetic */ Object b(Object[] objArr) {
        BigInteger bigInteger = (BigInteger) objArr[0];
        int i10 = f53764b;
        int i11 = ((i10 | 31) << 1) - (i10 ^ 31);
        f53763a = i11 % 128;
        int i12 = i11 % 2;
        long[] jArr = (long[]) auy.setOnFocusChangeListener(new Object[]{Integer.valueOf(Opcodes.INSTANCEOF), bigInteger}, 1678029135, -1678029124, Opcodes.INSTANCEOF);
        int i13 = f53764b;
        int i14 = ((i13 ^ 111) | (i13 & 111)) << 1;
        int i15 = -(((~i13) & 111) | (i13 & (-112)));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        f53763a = i16 % 128;
        if (i16 % 2 == 0) {
            return jArr;
        }
        throw null;
    }

    public static /* synthetic */ void c(Object[] objArr) {
        char c10 = 0;
        Integer num = 0;
        long[] jArr = (long[]) objArr[0];
        int i10 = 1;
        Integer num2 = 1;
        long[] jArr2 = (long[]) objArr[1];
        int i11 = 2;
        long[] jArr3 = (long[]) objArr[2];
        int i12 = f53764b;
        int i13 = i12 ^ 15;
        int i14 = -(-((i12 & 15) << 1));
        int i15 = (i13 & i14) + (i14 | i13);
        f53763a = i15 % 128;
        int i16 = i15 % 2;
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr4}, -426600309, 426600324, (int) System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new Object[]{jArr2, jArr5}, -426600309, 426600324, (int) System.currentTimeMillis());
        long[] jArr6 = new long[8];
        setCompoundDrawableTintBlendMode(new Object[]{jArr6, Long.valueOf(jArr4[0]), Long.valueOf(jArr5[0]), jArr3, num}, -950904696, 950904705, 0);
        setCompoundDrawableTintBlendMode(new Object[]{jArr6, Long.valueOf(jArr4[1]), Long.valueOf(jArr5[1]), jArr3, num2}, -950904696, 950904705, 1);
        setCompoundDrawableTintBlendMode(new Object[]{jArr6, Long.valueOf(jArr4[2]), Long.valueOf(jArr5[2]), jArr3, 2}, -950904696, 950904705, 2);
        setCompoundDrawableTintBlendMode(new Object[]{jArr6, Long.valueOf(jArr4[3]), Long.valueOf(jArr5[3]), jArr3, 3}, -950904696, 950904705, 3);
        int i17 = f53764b;
        int i18 = i17 & 21;
        int i19 = (i17 | 21) & (~i18);
        int i20 = -(-(i18 << 1));
        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
        f53763a = i21 % 128;
        int i22 = i21 % 2;
        int i23 = 5;
        while (i23 > 0) {
            int i24 = f53764b;
            int i25 = (i24 & 73) + (i24 | 73);
            f53763a = i25 % 128;
            int i26 = i25 % i11;
            long j10 = jArr3[i23];
            Integer num3 = num;
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i27 = (i23 * 832) + 830;
            int i28 = ~i23;
            int i29 = i28 | i23;
            int i30 = ~i29;
            int i31 = i29 & i28;
            int i32 = ~iCurrentTimeMillis;
            int i33 = ~i32;
            int i34 = (i31 & i33) | ((~i31) & i32);
            int i35 = i31 & i32;
            int i36 = ~((i34 ^ i35) | (i34 & i35));
            int i37 = ((-1) ^ i23) | i23;
            int i38 = (i37 ^ iCurrentTimeMillis) | (i37 & iCurrentTimeMillis);
            Integer num4 = num2;
            int i39 = ~i38;
            int i40 = i39 & (i38 | i39);
            int i41 = i36 & i40;
            long[] jArr7 = jArr6;
            int i42 = (~i41) & (i36 | i40);
            int i43 = ((i42 & i41) | (i42 ^ i41)) * (-831);
            int i44 = (i27 ^ i43) + ((i27 & i43) << 1);
            int i45 = ~i28;
            int i46 = (i45 & i28) | (i45 ^ i28);
            int i47 = i46 & iCurrentTimeMillis;
            int i48 = (i46 | iCurrentTimeMillis) & (~i47);
            int i49 = (~((i48 & i47) | (i48 ^ i47))) * (-1662);
            int i50 = i44 & i49;
            int i51 = -(-(i49 | i44));
            int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
            int i53 = ~(((-1) ^ iCurrentTimeMillis) | iCurrentTimeMillis);
            int i54 = (i53 & i33) | (i33 ^ i53);
            int i55 = (i23 & i32) | (iCurrentTimeMillis & i28);
            int i56 = iCurrentTimeMillis & i23;
            int i57 = ~((i56 & i55) | (i55 ^ i56));
            int i58 = ((~i57) & i54) | ((~i54) & i57);
            int i59 = i57 & i54;
            int i60 = ((i59 & i58) | (i58 ^ i59)) * 831;
            int i61 = i52 ^ i60;
            jArr3[i23] = jArr3[(((i60 & i52) | i61) << 1) - i61] ^ j10;
            i23 = (i23 - i30) - 1;
            int i62 = f53764b;
            int i63 = ((i62 ^ 63) - (~(-(-((i62 & 63) << 1))))) - 1;
            f53763a = i63 % 128;
            int i64 = i63 % 2;
            i10 = 1;
            num = num3;
            num2 = num4;
            jArr6 = jArr7;
            c10 = 0;
            i11 = 2;
        }
        Integer num5 = num;
        long[] jArr8 = jArr6;
        int i65 = i10;
        Integer num6 = num2;
        long j11 = jArr4[c10] ^ jArr4[i65];
        long j12 = jArr5[c10] ^ jArr5[i65];
        Object[] objArr2 = new Object[5];
        objArr2[c10] = jArr8;
        objArr2[i65] = Long.valueOf(j11);
        objArr2[2] = Long.valueOf(j12);
        objArr2[3] = jArr3;
        objArr2[4] = num6;
        setCompoundDrawableTintBlendMode(objArr2, -950904696, 950904705, i65);
        long j13 = jArr4[2] ^ jArr4[3];
        long j14 = jArr5[2] ^ jArr5[3];
        Object[] objArr3 = new Object[5];
        objArr3[0] = jArr8;
        objArr3[i65] = Long.valueOf(j13);
        objArr3[2] = Long.valueOf(j14);
        objArr3[3] = jArr3;
        objArr3[4] = 3;
        setCompoundDrawableTintBlendMode(objArr3, -950904696, 950904705, 3);
        int i66 = f53764b;
        int i67 = i66 & 65;
        int i68 = ((i66 ^ 65) | i67) << 1;
        int i69 = -((i66 | 65) & (~i67));
        int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
        f53763a = i70 % 128;
        int i71 = i70 % 2;
        int i72 = 7;
        for (int i73 = 1; i72 > i73; i73 = 1) {
            int i74 = f53763a;
            int i75 = ((i74 | 63) << i73) - (i74 ^ 63);
            f53764b = i75 % 128;
            int i76 = i75 % 2;
            long j15 = jArr3[i72];
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i77 = i72 * (-661);
            int i78 = (((1322 ^ i77) | (1322 & i77)) << 1) - ((i77 & (-1323)) | (1322 & (~i77)));
            int i79 = ~iCurrentTimeMillis2;
            int i80 = ~i72;
            int i81 = 1 & i80;
            int i82 = (~i81) & (1 | i80);
            int i83 = ~((i82 & i81) | (i82 ^ i81));
            int i84 = ((~i83) & i79) | ((~i79) & i83);
            int i85 = i83 & i79;
            int i86 = -(-(((i85 & i84) | (i84 ^ i85)) * 1324));
            int i87 = ((~i86) & i78) | ((~i78) & i86);
            int i88 = (i78 & i86) << 1;
            int i89 = (i87 ^ i88) + ((i88 & i87) << 1);
            int i90 = (-2) ^ iCurrentTimeMillis2;
            int i91 = (-2) & iCurrentTimeMillis2;
            int i92 = (i90 & i91) | (i90 ^ i91);
            int i93 = ~i92;
            int i94 = (i92 | i93) & i93;
            int i95 = (i79 & i72) | (iCurrentTimeMillis2 & i80);
            int i96 = iCurrentTimeMillis2 & i72;
            int i97 = ~((i96 & i95) | (i95 ^ i96));
            int i98 = i94 & i97;
            int i99 = (i97 | i94) & (~i98);
            int i100 = -(-(((i99 & i98) | (i99 ^ i98)) * (-1324)));
            int i101 = i89 & i100;
            int i102 = (((i100 | i89) & (~i101)) - (~(-(-(i101 << 1))))) - 1;
            int i103 = ~((1 ^ i72) | (1 & i72));
            int i104 = i80 ^ (-2);
            int i105 = i80 & (-2);
            int i106 = ~((i105 & i104) | (i104 ^ i105));
            int i107 = i103 ^ i106;
            int i108 = i103 & i106;
            int i109 = -(-(((i108 & i107) | (i107 ^ i108)) * 662));
            jArr3[i72] = j15 ^ jArr3[((i102 | i109) << 1) - (i102 ^ i109)];
            i72 = (i72 << 1) + (i72 ^ (-1));
            int i110 = f53763a;
            int i111 = i110 | 47;
            int i112 = (i111 << 1) - ((~(i110 & 47)) & i111);
            f53764b = i112 % 128;
            int i113 = i112 % 2;
        }
        long j16 = jArr4[0] ^ jArr4[2];
        long j17 = jArr4[1] ^ jArr4[3];
        long j18 = jArr5[0] ^ jArr5[2];
        long j19 = jArr5[3] ^ jArr5[1];
        setCompoundDrawableTintBlendMode(new Object[]{jArr8, Long.valueOf(j16 ^ j17), Long.valueOf(j18 ^ j19), jArr3, 3}, -950904696, 950904705, 3);
        long[] jArr9 = new long[3];
        setCompoundDrawableTintBlendMode(new Object[]{jArr8, Long.valueOf(j16), Long.valueOf(j18), jArr9, num5}, -950904696, 950904705, 0);
        setCompoundDrawableTintBlendMode(new Object[]{jArr8, Long.valueOf(j17), Long.valueOf(j19), jArr9, num6}, -950904696, 950904705, 1);
        long j20 = jArr9[0];
        long j21 = jArr9[1];
        long j22 = jArr9[2];
        jArr3[2] = jArr3[2] ^ j20;
        jArr3[3] = (j20 ^ j21) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j22 ^ j21);
        jArr3[5] = jArr3[5] ^ j22;
        setCompoundDrawableTintBlendMode(new Object[]{jArr3}, 1475289656, -1475289637, (int) System.currentTimeMillis());
        int i114 = f53764b;
        int i115 = i114 ^ 101;
        int i116 = (i114 & 101) << 1;
        int i117 = (i115 ^ i116) + ((i116 & i115) << 1);
        f53763a = i117 % 128;
        if (i117 % 2 != 0) {
            int i118 = 68 / 0;
        }
    }

    public static /* synthetic */ void d(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        long[] jArr2 = (long[]) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i10 = f53764b;
        int i11 = i10 & 23;
        int i12 = (i11 - (~(-(-((i10 ^ 23) | i11))))) - 1;
        f53763a = i12 % 128;
        int i13 = i12 % 2;
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
        jArr[7] = jLongValue2 ^ j13;
        int i14 = (int) jLongValue;
        long j14 = (jArr[(i14 >>> 3) & 7] << 3) ^ jArr[i14 & 7];
        int i15 = (i10 & (-14)) | (13 & (~i10));
        int i16 = -(-((i10 & 13) << 1));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        f53763a = i17 % 128;
        int i18 = i17 % 2;
        long j15 = 0;
        int i19 = 36;
        long j16 = j14;
        do {
            int i20 = (int) (jLongValue >>> i19);
            long j17 = (((jArr[i20 & 7] ^ (jArr[(i20 >>> 3) & 7] << 3)) ^ (jArr[(i20 >>> 6) & 7] << 6)) ^ (jArr[(i20 >>> 9) & 7] << 9)) ^ (jArr[(i20 >>> 12) & 7] << 12);
            j16 ^= j17 << i19;
            j15 ^= j17 >>> (-i19);
            i19 = ((i19 | (-15)) << 1) - (i19 ^ (-15));
        } while (i19 > 0);
        int i21 = f53764b;
        int i22 = ((i21 | 1) << 1) - (i21 ^ 1);
        int i23 = i22 % 128;
        f53763a = i23;
        int i24 = i22 % 2;
        jArr2[iIntValue] = jArr2[iIntValue] ^ (j16 & 562949953421311L);
        int i25 = iIntValue & 1;
        int i26 = ((iIntValue ^ 1) | i25) << 1;
        int i27 = -((~i25) & (iIntValue | 1));
        int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
        jArr2[i28] = jArr2[i28] ^ ((j16 >>> 49) ^ (j15 << 15));
        int i29 = i23 ^ 47;
        int i30 = ((i23 & 47) | i29) << 1;
        int i31 = -i29;
        int i32 = (i30 & i31) + (i30 | i31);
        f53764b = i32 % 128;
        if (i32 % 2 == 0) {
            int i33 = 6 / 0;
        }
    }

    public static /* synthetic */ void e(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53764b;
        int i11 = i10 & 13;
        int i12 = -(-(i10 | 13));
        int i13 = (i11 & i12) + (i12 | i11);
        f53763a = i13 % 128;
        if (i13 % 2 != 0) {
            long[] jArr3 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr3}, -1828537641, 1828537642, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr2, jArr3, jArr2}, 1267911035, -1267911032, (int) System.currentTimeMillis());
            throw null;
        }
        long[] jArr4 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr4}, -1828537641, 1828537642, (int) System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new Object[]{jArr2, jArr4, jArr2}, 1267911035, -1267911032, (int) System.currentTimeMillis());
        int i14 = f53763a;
        int i15 = i14 & 13;
        int i16 = (i14 ^ 13) | i15;
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        f53764b = i17 % 128;
        int i18 = i17 % 2;
    }

    public static /* synthetic */ void f(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53763a;
        int i11 = ((i10 ^ 53) | (i10 & 53)) << 1;
        int i12 = -(((~i10) & 53) | (i10 & (-54)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f53764b = i13 % 128;
        int i14 = i13 % 2;
        long[] jArr3 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
        avf.setX(new Object[]{jArr, jArr2}, -2094914201, 2094914215, (int) System.currentTimeMillis());
        int i15 = f53764b;
        int i16 = i15 & 121;
        int i17 = ((((i15 ^ 121) | i16) << 1) - (~(-((i15 | 121) & (~i16))))) - 1;
        f53763a = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 1;
        while (i19 < 193) {
            int i20 = f53764b;
            int i21 = (i20 | 109) << 1;
            int i22 = -(((~i20) & 109) | (i20 & (-110)));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            f53763a = i23 % 128;
            int i24 = i23 % 2;
            setCompoundDrawableTintBlendMode(new Object[]{jArr2, jArr3}, -1828537641, 1828537642, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr3, jArr2}, -1099447195, 1099447211, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr2, jArr3}, -1828537641, 1828537642, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr3, jArr2}, -1099447195, 1099447211, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, 1226396075, -1226396075, (int) System.currentTimeMillis());
            int i25 = (i19 ^ (-79)) + ((i19 & (-79)) << 1);
            i19 = (i25 ^ 81) + ((i25 & 81) << 1);
            int i26 = f53764b;
            int i27 = i26 & 99;
            int i28 = i27 + ((i26 ^ 99) | i27);
            f53763a = i28 % 128;
            int i29 = i28 % 2;
        }
        int i30 = f53763a + 55;
        f53764b = i30 % 128;
        if (i30 % 2 == 0) {
            throw null;
        }
    }

    public static void getNavBarTitleString(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, 1812298613, -1812298603, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        switch ((i15 * 576) + (((~(i10 | (~i12) | i14)) | (~(i11 | i13))) * 576) + (((~(i14 | i12)) | i15) * 576) + (i11 * (-575)) + (i10 * (-575))) {
            case 1:
                long[] jArr = (long[]) objArr[0];
                long[] jArr2 = (long[]) objArr[1];
                int i16 = f53763a;
                int i17 = (i16 & (-56)) | ((~i16) & 55);
                int i18 = -(-((i16 & 55) << 1));
                int i19 = (i17 & i18) + (i18 | i17);
                f53764b = i19 % 128;
                if (i19 % 2 == 0) {
                    auu.setCompoundDrawableTintBlendMode(new Object[]{jArr, 4, jArr2, 1}, 1056168849, -1056168849, 4);
                    jArr2[16] = jArr[5] & 1;
                    return null;
                }
                auu.setCompoundDrawableTintBlendMode(new Object[]{jArr, 3, jArr2, 0}, 1056168849, -1056168849, 3);
                jArr2[6] = jArr[3] & 1;
                return null;
            case 2:
                return b(objArr);
            case 3:
                long[] jArr3 = (long[]) objArr[0];
                long[] jArr4 = (long[]) objArr[1];
                long[] jArr5 = (long[]) objArr[2];
                int i20 = f53763a;
                int i21 = i20 & 111;
                int i22 = (~i21) & (i20 | 111);
                int i23 = -(-(i21 << 1));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                f53764b = i24 % 128;
                int i25 = i24 % 2;
                jArr5[0] = jArr3[0] ^ jArr4[0];
                jArr5[1] = jArr3[1] ^ jArr4[1];
                jArr5[2] = jArr3[2] ^ jArr4[2];
                jArr5[3] = jArr3[3] ^ jArr4[3];
                jArr5[4] = jArr3[4] ^ jArr4[4];
                jArr5[5] = jArr3[5] ^ jArr4[5];
                jArr5[6] = jArr3[6] ^ jArr4[6];
                int i26 = i20 & 63;
                int i27 = (((~i26) & (i20 | 63)) - (~(i26 << 1))) - 1;
                f53764b = i27 % 128;
                int i28 = i27 % 2;
                return null;
            case 4:
                f(objArr);
                return null;
            case 5:
                a(objArr);
                return null;
            case 6:
                c(objArr);
                return null;
            case 7:
                long[] jArr6 = (long[]) objArr[0];
                long[] jArr7 = (long[]) objArr[1];
                long[] jArr8 = (long[]) objArr[2];
                int i29 = f53764b;
                int i30 = i29 & 123;
                int i31 = ((i29 ^ 123) | i30) << 1;
                int i32 = -((i29 | 123) & (~i30));
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                int i34 = i33 % 128;
                f53763a = i34;
                if (i33 % 2 != 0) {
                    jArr8[1] = jArr6[1] / jArr7[1];
                    jArr8[1] = jArr6[0] | jArr7[0];
                    long j10 = jArr6[5];
                    long j11 = jArr7[5];
                    jArr8[3] = j10 & j11;
                    jArr8[3] = jArr6[2] % j11;
                } else {
                    jArr8[0] = jArr6[0] ^ jArr7[0];
                    jArr8[1] = jArr6[1] ^ jArr7[1];
                    jArr8[2] = jArr6[2] ^ jArr7[2];
                    jArr8[3] = jArr6[3] ^ jArr7[3];
                }
                int i35 = (i34 ^ 97) + ((i34 & 97) << 1);
                f53764b = i35 % 128;
                int i36 = i35 % 2;
                return null;
            case 8:
                e(objArr);
                return null;
            case 9:
                d(objArr);
                return null;
            case 10:
                long[] jArr9 = (long[]) objArr[0];
                long[] jArr10 = (long[]) objArr[1];
                int i37 = f53763a;
                int i38 = ((i37 | 34) << 1) - (i37 ^ 34);
                int i39 = (i38 ^ (-1)) + (i38 << 1);
                f53764b = i39 % 128;
                int i40 = i39 % 2;
                long[] jArr11 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr9, jArr11}, -1828537641, 1828537642, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr11, jArr10}, -1099447195, 1099447211, (int) System.currentTimeMillis());
                int i41 = f53764b + 57;
                f53763a = i41 % 128;
                int i42 = i41 % 2;
                return null;
            case 11:
                long[] jArr12 = (long[]) objArr[0];
                long[] jArr13 = (long[]) objArr[1];
                int i43 = f53764b;
                int i44 = (i43 ^ 42) + ((i43 & 42) << 1);
                int i45 = (i44 ^ (-1)) + (i44 << 1);
                f53763a = i45 % 128;
                int i46 = i45 % 2;
                long jLongValue = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr12[0])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long jLongValue2 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr12[1])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long j12 = (jLongValue & 4294967295L) | (jLongValue2 << 32);
                long j13 = (jLongValue >>> 32) | (jLongValue2 & (-4294967296L));
                long jLongValue3 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr12[2])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long j14 = (jLongValue3 & 4294967295L) ^ (jArr12[3] << 32);
                long j15 = jLongValue3 >>> 32;
                jArr13[0] = j12 ^ (j13 << 8);
                jArr13[1] = ((j14 ^ (j15 << 8)) ^ (j13 >>> 56)) ^ (j13 << 33);
                jArr13[2] = ((j15 << 33) ^ (jLongValue3 >>> 88)) ^ (j13 >>> 31);
                jArr13[3] = jLongValue3 >>> 63;
                int i47 = f53763a;
                int i48 = (i47 & 53) + (i47 | 53);
                f53764b = i48 % 128;
                if (i48 % 2 != 0) {
                    return null;
                }
                throw null;
            case 12:
                long[] jArr14 = (long[]) objArr[0];
                long[] jArr15 = (long[]) objArr[1];
                long[] jArr16 = (long[]) objArr[2];
                int i49 = f53764b;
                int i50 = i49 & 57;
                int i51 = (i49 ^ 57) | i50;
                int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                f53763a = i52 % 128;
                int i53 = i52 % 2;
                long[] jArr17 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr14, jArr15, jArr17}, -1946436019, 1946436025, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr17, jArr16}, -1099447195, 1099447211, (int) System.currentTimeMillis());
                int i54 = f53763a;
                int i55 = i54 & 69;
                int i56 = -(-((i54 ^ 69) | i55));
                int i57 = (i55 & i56) + (i56 | i55);
                f53764b = i57 % 128;
                if (i57 % 2 != 0) {
                    return null;
                }
                throw null;
            case 13:
                long[] jArr18 = (long[]) objArr[0];
                int i58 = f53763a;
                int i59 = i58 & 1;
                int i60 = i59 + ((i58 ^ 1) | i59);
                f53764b = i60 % 128;
                int i61 = i60 % 2;
                int i62 = ((int) jArr18[0]) & 1;
                int i63 = ((i58 | 121) << 1) - (i58 ^ 121);
                f53764b = i63 % 128;
                if (i63 % 2 != 0) {
                    return Integer.valueOf(i62);
                }
                throw null;
            case 14:
                long[] jArr19 = (long[]) objArr[0];
                long[] jArr20 = (long[]) objArr[1];
                long[] jArr21 = (long[]) objArr[2];
                int i64 = f53763a + 35;
                f53764b = i64 % 128;
                if (i64 % 2 != 0) {
                    long[] jArr22 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
                    setCompoundDrawableTintBlendMode(new Object[]{jArr19, jArr20, jArr22}, -1946436019, 1946436025, (int) System.currentTimeMillis());
                    setCompoundDrawableTintBlendMode(new Object[]{jArr21, jArr22, jArr21}, 1267911035, -1267911032, (int) System.currentTimeMillis());
                    return null;
                }
                long[] jArr23 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr19, jArr20, jArr23}, -1946436019, 1946436025, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr21, jArr23, jArr21}, 1267911035, -1267911032, (int) System.currentTimeMillis());
                throw null;
            case 15:
                long[] jArr24 = (long[]) objArr[0];
                long[] jArr25 = (long[]) objArr[1];
                int i65 = f53763a;
                int i66 = i65 + 81;
                f53764b = i66 % 128;
                int i67 = i66 % 2;
                long j16 = jArr24[0];
                long j17 = jArr24[1];
                long j18 = jArr24[2];
                long j19 = jArr24[3];
                jArr25[0] = j16 & 562949953421311L;
                jArr25[1] = ((j16 >>> 49) ^ (j17 << 15)) & 562949953421311L;
                jArr25[2] = ((j17 >>> 34) ^ (j18 << 30)) & 562949953421311L;
                jArr25[3] = (j18 >>> 19) ^ (j19 << 45);
                int i68 = (i65 & 97) + (i65 | 97);
                f53764b = i68 % 128;
                int i69 = i68 % 2;
                return null;
            case 16:
                long[] jArr26 = (long[]) objArr[0];
                long[] jArr27 = (long[]) objArr[1];
                int i70 = f53763a;
                int i71 = i70 & 71;
                int i72 = -(-((i70 ^ 71) | i71));
                int i73 = (i71 & i72) + (i71 | i72);
                f53764b = i73 % 128;
                int i74 = i73 % 2;
                long j20 = jArr26[0];
                long j21 = jArr26[1];
                long j22 = jArr26[2];
                long j23 = jArr26[3];
                long j24 = jArr26[4];
                long j25 = jArr26[5];
                long j26 = jArr26[6];
                long j27 = j22 ^ (j26 << 63);
                long j28 = j23 ^ ((j26 >>> 1) ^ (j26 << 14));
                long j29 = j24 ^ (j26 >>> 50);
                long j30 = j28 ^ (j25 >>> 50);
                long j31 = j20 ^ (j29 << 63);
                long j32 = (j21 ^ (j25 << 63)) ^ ((j29 >>> 1) ^ (j29 << 14));
                long j33 = (j27 ^ ((j25 >>> 1) ^ (j25 << 14))) ^ (j29 >>> 50);
                long j34 = j30 >>> 1;
                jArr27[0] = (j31 ^ j34) ^ (j34 << 15);
                jArr27[1] = (j30 >>> 50) ^ j32;
                jArr27[2] = j33;
                jArr27[3] = j30 & 1;
                int i75 = i70 & 11;
                int i76 = (~i75) & (i70 | 11);
                int i77 = -(-(i75 << 1));
                int i78 = ((i76 | i77) << 1) - (i77 ^ i76);
                f53764b = i78 % 128;
                int i79 = i78 % 2;
                return null;
            case 17:
                long[] jArr28 = (long[]) objArr[0];
                long[] jArr29 = (long[]) objArr[1];
                int i80 = f53763a + 101;
                int i81 = i80 % 128;
                f53764b = i81;
                if (i80 % 2 == 0) {
                    jArr29[0] = jArr28[0] + 1;
                    jArr29[0] = jArr28[0];
                    jArr29[2] = jArr28[3];
                    jArr29[3] = jArr28[2];
                } else {
                    jArr29[0] = jArr28[0] ^ 1;
                    jArr29[1] = jArr28[1];
                    jArr29[2] = jArr28[2];
                    jArr29[3] = jArr28[3];
                }
                int i82 = (i81 & (-92)) | ((~i81) & 91);
                int i83 = -(-((i81 & 91) << 1));
                int i84 = (i82 & i83) + (i82 | i83);
                f53763a = i84 % 128;
                int i85 = i84 % 2;
                return null;
            case 18:
                long[] jArr30 = (long[]) objArr[0];
                long[] jArr31 = (long[]) objArr[1];
                int i86 = f53764b;
                int i87 = (i86 ^ 41) + ((i86 & 41) << 1);
                f53763a = i87 % 128;
                int i88 = i87 % 2;
                if (((Boolean) avf.setX(new Object[]{jArr30}, -1422980310, 1422980335, (int) System.currentTimeMillis())).booleanValue()) {
                    throw new IllegalStateException();
                }
                long[] jArr32 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
                long[] jArr33 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr30, jArr32}, 1812298613, -1812298603, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr32, 1, jArr33}, 371706175, -371706170, 1);
                setCompoundDrawableTintBlendMode(new Object[]{jArr32, jArr33, jArr32}, 1395695768, -1395695756, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr33, 1, jArr33}, 371706175, -371706170, 1);
                setCompoundDrawableTintBlendMode(new Object[]{jArr32, jArr33, jArr32}, 1395695768, -1395695756, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr32, 3, jArr33}, 371706175, -371706170, 3);
                setCompoundDrawableTintBlendMode(new Object[]{jArr32, jArr33, jArr32}, 1395695768, -1395695756, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr32, 6, jArr33}, 371706175, -371706170, 6);
                setCompoundDrawableTintBlendMode(new Object[]{jArr32, jArr33, jArr32}, 1395695768, -1395695756, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr32, 12, jArr33}, 371706175, -371706170, 12);
                setCompoundDrawableTintBlendMode(new Object[]{jArr32, jArr33, jArr32}, 1395695768, -1395695756, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr32, 24, jArr33}, 371706175, -371706170, 24);
                setCompoundDrawableTintBlendMode(new Object[]{jArr32, jArr33, jArr32}, 1395695768, -1395695756, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr32, 48, jArr33}, 371706175, -371706170, 48);
                setCompoundDrawableTintBlendMode(new Object[]{jArr32, jArr33, jArr32}, 1395695768, -1395695756, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr32, 96, jArr33}, 371706175, -371706170, 96);
                setCompoundDrawableTintBlendMode(new Object[]{jArr32, jArr33, jArr31}, 1395695768, -1395695756, (int) System.currentTimeMillis());
                int i89 = f53763a;
                int i90 = i89 & 51;
                int i91 = (i89 | 51) & (~i90);
                int i92 = i90 << 1;
                int i93 = (i91 ^ i92) + ((i91 & i92) << 1);
                f53764b = i93 % 128;
                if (i93 % 2 != 0) {
                    return null;
                }
                throw null;
            case 19:
                long[] jArr34 = (long[]) objArr[0];
                int i94 = f53763a;
                int i95 = (i94 & 33) + (i94 | 33);
                f53764b = i95 % 128;
                int i96 = i95 % 2;
                long j35 = jArr34[0];
                long j36 = jArr34[1];
                long j37 = jArr34[2];
                long j38 = jArr34[3];
                long j39 = jArr34[4];
                long j40 = jArr34[5];
                long j41 = jArr34[6];
                long j42 = jArr34[7];
                jArr34[0] = j35 ^ (j36 << 49);
                jArr34[1] = (j36 >>> 15) ^ (j37 << 34);
                jArr34[2] = (j37 >>> 30) ^ (j38 << 19);
                jArr34[3] = ((j38 >>> 45) ^ (j39 << 4)) ^ (j40 << 53);
                jArr34[4] = ((j39 >>> 60) ^ (j41 << 38)) ^ (j40 >>> 11);
                jArr34[5] = (j41 >>> 26) ^ (j42 << 23);
                jArr34[6] = j42 >>> 41;
                jArr34[7] = 0;
                int i97 = i94 & 83;
                int i98 = -(-((i94 ^ 83) | i97));
                int i99 = ((i97 | i98) << 1) - (i97 ^ i98);
                f53764b = i99 % 128;
                if (i99 % 2 != 0) {
                    return null;
                }
                throw null;
            default:
                long[] jArr35 = (long[]) objArr[0];
                long[] jArr36 = (long[]) objArr[1];
                int i100 = f53763a;
                int i101 = i100 & 111;
                int i102 = (i100 | 111) & (~i101);
                int i103 = i101 << 1;
                int i104 = ((i102 | i103) << 1) - (i102 ^ i103);
                int i105 = i104 % 128;
                f53764b = i105;
                int i106 = i104 % 2;
                jArr36[0] = jArr36[0] ^ jArr35[0];
                jArr36[1] = jArr36[1] ^ jArr35[1];
                jArr36[2] = jArr36[2] ^ jArr35[2];
                jArr36[3] = jArr36[3] ^ jArr35[3];
                int i107 = i105 & 119;
                int i108 = -(-((i105 ^ 119) | i107));
                int i109 = ((i107 | i108) << 1) - (i107 ^ i108);
                f53763a = i109 % 128;
                int i110 = i109 % 2;
                return null;
        }
    }

    public static void setDividerPadding(long[] jArr, int i10, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, Integer.valueOf(i10), jArr2}, 371706175, -371706170, i10);
    }

    public static void setLayoutAnimation(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, 354630953, -354630945, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2, long[] jArr3) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2, jArr3}, -233805454, 233805468, (int) System.currentTimeMillis());
    }

    public static int setX(long[] jArr) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{jArr}, 1991784766, -1991784753, (int) System.currentTimeMillis())).intValue();
    }

    public static void setY(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, -1099447195, 1099447211, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, 315940187, -315940176, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, 242889764, -242889746, (int) System.currentTimeMillis());
    }

    public static void setX(long[] jArr, long[] jArr2, long[] jArr3) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2, jArr3}, 1395695768, -1395695756, (int) System.currentTimeMillis());
    }

    public static long[] setY(BigInteger bigInteger) {
        return (long[]) setCompoundDrawableTintBlendMode(new Object[]{bigInteger}, -1588076976, 1588076978, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(long[] jArr, long[] jArr2, long[] jArr3) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2, jArr3}, -676409509, 676409516, (int) System.currentTimeMillis());
    }

    public static void setX(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, 1001152148, -1001152144, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, 516104050, -516104033, (int) System.currentTimeMillis());
    }
}
