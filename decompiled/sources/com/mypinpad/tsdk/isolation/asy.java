package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class asy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53791a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53792b = 1;

    public static /* synthetic */ void a(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53792b;
        int i11 = i10 & 39;
        int i12 = i10 | 39;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f53791a = i13 % 128;
        if (i13 % 2 == 0) {
            long[] jArr3 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
            setY(new Object[]{jArr, jArr3}, 1716859949, -1716859942, (int) System.currentTimeMillis());
            setY(new Object[]{jArr2, jArr3, jArr2}, -1037377022, 1037377022, (int) System.currentTimeMillis());
        } else {
            long[] jArr4 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
            setY(new Object[]{jArr, jArr4}, 1716859949, -1716859942, (int) System.currentTimeMillis());
            setY(new Object[]{jArr2, jArr4, jArr2}, -1037377022, 1037377022, (int) System.currentTimeMillis());
            int i14 = 1 / 0;
        }
    }

    public static /* synthetic */ void b(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53792b;
        int i11 = (i10 ^ 19) + ((i10 & 19) << 1);
        f53791a = i11 % 128;
        int i12 = i11 % 2;
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        jArr2[0] = j10 & 576460752303423487L;
        jArr2[1] = ((j10 >>> 59) ^ (j11 << 5)) & 576460752303423487L;
        jArr2[2] = ((j11 >>> 54) ^ (j12 << 10)) & 576460752303423487L;
        jArr2[3] = (j12 >>> 49) ^ (j13 << 15);
        int i13 = i10 + 101;
        f53791a = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 3 / 0;
        }
    }

    public static /* synthetic */ void c(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53791a;
        int i11 = i10 & 91;
        int i12 = i10 | 91;
        int i13 = (i11 & i12) + (i12 | i11);
        f53792b = i13 % 128;
        int i14 = i13 % 2;
        auu.setCompoundDrawableTintBlendMode(new Object[]{jArr, 4, jArr2, 0}, 1056168849, -1056168849, 4);
        int i15 = f53792b + 47;
        f53791a = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 69 / 0;
        }
    }

    public static /* synthetic */ void d(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53791a + 77;
        f53792b = i10 % 128;
        int i11 = i10 % 2;
        if (((Boolean) avf.setX(new Object[]{jArr}, -1422980310, 1422980335, (int) System.currentTimeMillis())).booleanValue()) {
            throw new IllegalStateException();
        }
        long[] jArr3 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
        long[] jArr4 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
        setY(new Object[]{jArr, jArr3}, 10248962, -10248960, (int) System.currentTimeMillis());
        setY(new Object[]{jArr3, jArr, jArr3}, 1760454700, -1760454686, (int) System.currentTimeMillis());
        setY(new Object[]{jArr3, jArr3}, 10248962, -10248960, (int) System.currentTimeMillis());
        setY(new Object[]{jArr3, jArr, jArr3}, 1760454700, -1760454686, (int) System.currentTimeMillis());
        setY(new Object[]{jArr3, 3, jArr4}, 886665907, -886665892, 3);
        setY(new Object[]{jArr4, jArr3, jArr4}, 1760454700, -1760454686, (int) System.currentTimeMillis());
        setY(new Object[]{jArr4, jArr4}, 10248962, -10248960, (int) System.currentTimeMillis());
        setY(new Object[]{jArr4, jArr, jArr4}, 1760454700, -1760454686, (int) System.currentTimeMillis());
        setY(new Object[]{jArr4, 7, jArr3}, 886665907, -886665892, 7);
        setY(new Object[]{jArr3, jArr4, jArr3}, 1760454700, -1760454686, (int) System.currentTimeMillis());
        setY(new Object[]{jArr3, 14, jArr4}, 886665907, -886665892, 14);
        setY(new Object[]{jArr4, jArr3, jArr4}, 1760454700, -1760454686, (int) System.currentTimeMillis());
        setY(new Object[]{jArr4, jArr4}, 10248962, -10248960, (int) System.currentTimeMillis());
        setY(new Object[]{jArr4, jArr, jArr4}, 1760454700, -1760454686, (int) System.currentTimeMillis());
        setY(new Object[]{jArr4, 29, jArr3}, 886665907, -886665892, 29);
        setY(new Object[]{jArr3, jArr4, jArr3}, 1760454700, -1760454686, (int) System.currentTimeMillis());
        setY(new Object[]{jArr3, 58, jArr4}, 886665907, -886665892, 58);
        setY(new Object[]{jArr4, jArr3, jArr4}, 1760454700, -1760454686, (int) System.currentTimeMillis());
        setY(new Object[]{jArr4, 116, jArr3}, 886665907, -886665892, 116);
        setY(new Object[]{jArr3, jArr4, jArr3}, 1760454700, -1760454686, (int) System.currentTimeMillis());
        setY(new Object[]{jArr3, jArr2}, 10248962, -10248960, (int) System.currentTimeMillis());
        int i12 = f53792b;
        int i13 = (((i12 ^ 39) | (i12 & 39)) << 1) - (((~i12) & 39) | (i12 & (-40)));
        f53791a = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void e(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53792b;
        int i11 = i10 & 17;
        int i12 = (i10 | 17) & (~i11);
        int i13 = i11 << 1;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f53791a = i14 % 128;
        if (i14 % 2 == 0) {
            long[] jArr4 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
            setY(new Object[]{jArr, jArr2, jArr4}, 1456298347, -1456298341, (int) System.currentTimeMillis());
            setY(new Object[]{jArr3, jArr4, jArr3}, -1037377022, 1037377022, (int) System.currentTimeMillis());
        } else {
            long[] jArr5 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
            setY(new Object[]{jArr, jArr2, jArr5}, 1456298347, -1456298341, (int) System.currentTimeMillis());
            setY(new Object[]{jArr3, jArr5, jArr3}, -1037377022, 1037377022, (int) System.currentTimeMillis());
            throw null;
        }
    }

    public static /* synthetic */ void f(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53791a;
        int i11 = (-2) - ((i10 + 48) ^ (-1));
        f53792b = i11 % 128;
        int i12 = i11 % 2;
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        int i13 = i10 & 37;
        int i14 = (((i10 ^ 37) | i13) << 1) - ((~i13) & (i10 | 37));
        f53792b = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object g(Object[] objArr) {
        BigInteger bigInteger = (BigInteger) objArr[0];
        int i10 = f53791a + 77;
        f53792b = i10 % 128;
        int i11 = i10 % 2;
        long[] jArr = (long[]) auy.setOnFocusChangeListener(new Object[]{233, bigInteger}, 1678029135, -1678029124, 233);
        int i12 = f53792b;
        int i13 = i12 & 121;
        int i14 = -(-((i12 ^ 121) | i13));
        int i15 = (i13 & i14) + (i14 | i13);
        f53791a = i15 % 128;
        if (i15 % 2 == 0) {
            return jArr;
        }
        throw null;
    }

    public static void getNavBarTitleString(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, 10248962, -10248960, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ void h(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53792b;
        int i11 = (((i10 ^ 27) | (i10 & 27)) << 1) - ((i10 & (-28)) | ((~i10) & 27));
        f53791a = i11 % 128;
        int i12 = i11 % 2;
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        int i13 = (i10 | 25) << 1;
        int i14 = -(i10 ^ 25);
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        f53791a = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 54 / 0;
        }
    }

    public static /* synthetic */ void i(Object[] objArr) {
        long[] jArr;
        int i10;
        long[] jArr2 = (long[]) objArr[0];
        long[] jArr3 = (long[]) objArr[1];
        int i11 = f53792b;
        int i12 = (i11 & 15) + (i11 | 15);
        f53791a = i12 % 128;
        if (i12 % 2 != 0) {
            jArr = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
            avf.setX(new Object[]{jArr2, jArr3}, -2094914201, 2094914215, (int) System.currentTimeMillis());
            i10 = 0;
        } else {
            jArr = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
            avf.setX(new Object[]{jArr2, jArr3}, -2094914201, 2094914215, (int) System.currentTimeMillis());
            i10 = 1;
        }
        int i13 = f53792b;
        int i14 = (i13 & 29) + (i13 | 29);
        while (true) {
            f53791a = i14 % 128;
            int i15 = i14 % 2;
            if (i10 >= 233) {
                break;
            }
            int i16 = f53791a + 115;
            f53792b = i16 % 128;
            if (i16 % 2 == 0) {
                setY(new Object[]{jArr3, jArr}, 1716859949, -1716859942, (int) System.currentTimeMillis());
                setY(new Object[]{jArr, jArr3}, -31475590, 31475607, (int) System.currentTimeMillis());
                setY(new Object[]{jArr3, jArr}, 1716859949, -1716859942, (int) System.currentTimeMillis());
                setY(new Object[]{jArr, jArr3}, -31475590, 31475607, (int) System.currentTimeMillis());
                setY(new Object[]{jArr2, jArr3}, 1232687006, -1232686990, (int) System.currentTimeMillis());
                int i17 = i10 & 125;
                int i18 = (((i10 | 125) & (~i17)) - (~(i17 << 1))) - 1;
                int i19 = i18 ^ (-89);
                i10 = ((((i18 & (-89)) | i19) << 1) - (~(-i19))) - 1;
            } else {
                setY(new Object[]{jArr3, jArr}, 1716859949, -1716859942, (int) System.currentTimeMillis());
                setY(new Object[]{jArr, jArr3}, -31475590, 31475607, (int) System.currentTimeMillis());
                setY(new Object[]{jArr3, jArr}, 1716859949, -1716859942, (int) System.currentTimeMillis());
                setY(new Object[]{jArr, jArr3}, -31475590, 31475607, (int) System.currentTimeMillis());
                setY(new Object[]{jArr2, jArr3}, 1232687006, -1232686990, (int) System.currentTimeMillis());
                int i20 = i10 ^ 2;
                int i21 = ((i10 & 2) | i20) << 1;
                int i22 = -i20;
                i10 = ((i21 | i22) << 1) - (i21 ^ i22);
            }
            int i23 = f53792b;
            int i24 = i23 & 87;
            i14 = ((((i23 ^ 87) | i24) << 1) - (~(-((i23 | 87) & (~i24))))) - 1;
        }
        int i25 = f53792b + 121;
        f53791a = i25 % 128;
        if (i25 % 2 != 0) {
            int i26 = 98 / 0;
        }
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, -31475590, 31475607, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(long[] jArr, int i10, long[] jArr2) {
        setY(new Object[]{jArr, Integer.valueOf(i10), jArr2}, 886665907, -886665892, i10);
    }

    public static void setNavigationOnClickListener(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, 1306010535, -1306010523, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, 192912033, -192912024, (int) System.currentTimeMillis());
    }

    public static int setX(long[] jArr) {
        return ((Integer) setY(new Object[]{jArr}, 194119420, -194119415, (int) System.currentTimeMillis())).intValue();
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = ~(i13 | i10);
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = (((~(i10 | i16)) | (~(i16 | i13))) * 859) + (((~(i12 | i15 | i16)) | i14) * 859) + ((i10 | i12) * (-859)) + (i11 * (-858)) + (i10 * 860);
        int i18 = 3;
        switch (i17) {
            case 1:
                h(objArr);
                return null;
            case 2:
                long[] jArr = (long[]) objArr[0];
                long[] jArr2 = (long[]) objArr[1];
                int i19 = f53792b;
                int i20 = ((((i19 ^ 15) | (i19 & 15)) << 1) - (~(-(((~i19) & 15) | (i19 & (-16)))))) - 1;
                f53791a = i20 % 128;
                int i21 = i20 % 2;
                long[] jArr3 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
                setY(new Object[]{jArr, jArr3}, 1716859949, -1716859942, (int) System.currentTimeMillis());
                setY(new Object[]{jArr3, jArr2}, -31475590, 31475607, (int) System.currentTimeMillis());
                int i22 = f53791a;
                int i23 = ((i22 ^ 2) + ((i22 & 2) << 1)) - 1;
                f53792b = i23 % 128;
                int i24 = i23 % 2;
                return null;
            case 3:
                i(objArr);
                return null;
            case 4:
                long[] jArr4 = (long[]) objArr[0];
                long[] jArr5 = (long[]) objArr[1];
                int i25 = f53792b + 7;
                f53791a = i25 % 128;
                int i26 = i25 % 2;
                long jLongValue = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr4[0])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long jLongValue2 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr4[1])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long j10 = (4294967295L & jLongValue) | (jLongValue2 << 32);
                long j11 = (jLongValue2 & (-4294967296L)) | (jLongValue >>> 32);
                long jLongValue3 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr4[2])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long jLongValue4 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr4[3])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long j12 = (4294967295L & jLongValue3) | (jLongValue4 << 32);
                long j13 = (jLongValue4 & (-4294967296L)) | (jLongValue3 >>> 32);
                long j14 = j13 >>> 27;
                long j15 = j13 ^ ((j11 >>> 27) | (j13 << 37));
                long j16 = j11 ^ (j11 << 37);
                long[] jArr6 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
                int[] iArr = {32, 117, Opcodes.ATHROW};
                int i27 = f53792b;
                int i28 = (i27 ^ 85) + ((i27 & 85) << 1);
                f53791a = i28 % 128;
                int i29 = i28 % 2;
                int i30 = 0;
                int i31 = 3;
                while (i30 < i31) {
                    int i32 = f53792b;
                    int i33 = i32 & 27;
                    int i34 = i33 + ((i32 ^ 27) | i33);
                    f53791a = i34 % 128;
                    int i35 = i34 % 2;
                    int i36 = iArr[i30];
                    int i37 = i36 >>> 6;
                    int i38 = i36 & 63;
                    jArr6[i37] = jArr6[i37] ^ (j16 << i38);
                    long j17 = j10;
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i39 = i37 * (-978);
                    int[] iArr2 = iArr;
                    int i40 = (((i39 & (-981)) | (980 & (~i39))) - (~((980 & i39) << 1))) - 1;
                    int i41 = ~i37;
                    int i42 = ~iCurrentTimeMillis;
                    int i43 = i42 & (i42 | iCurrentTimeMillis);
                    long j18 = j12;
                    int i44 = i41 & i43;
                    int i45 = (~i44) & (i41 | i43);
                    int i46 = (~((i45 ^ i44) | (i44 & i45))) * 979;
                    int i47 = ((((i40 | i46) << 1) - (i40 ^ i46)) - (~(-(~(((iCurrentTimeMillis ^ 1) | (iCurrentTimeMillis & 1)) * (-979)))))) - 2;
                    int i48 = (i41 | i37) & i41;
                    int i49 = (i48 & i42) | ((~i48) & iCurrentTimeMillis);
                    int i50 = i48 & iCurrentTimeMillis;
                    int i51 = ~((i50 & i49) | (i49 ^ i50));
                    int i52 = (i42 ^ 1) | (i42 & 1);
                    int i53 = ~i52;
                    int i54 = (i52 | i53) & i53;
                    int i55 = (((i51 & i54) | (i51 ^ i54)) * 979) + i47;
                    int i56 = -i38;
                    jArr6[i55] = jArr6[i55] ^ ((j15 << i38) | (j16 >>> i56));
                    int i57 = ((i37 ^ 3) + ((i37 & 3) << 1)) - 1;
                    jArr6[i57] = jArr6[i57] ^ ((j14 << i38) | (j15 >>> i56));
                    int i58 = i37 + 3;
                    jArr6[i58] = jArr6[i58] ^ (j14 >>> i56);
                    int i59 = i30 & (-95);
                    int i60 = -(-(i30 | (-95)));
                    int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
                    int i62 = i61 | 96;
                    i30 = (i62 << 1) - (i62 & (~(i61 & 96)));
                    int i63 = f53791a;
                    int i64 = (i63 ^ 19) + ((i63 & 19) << 1);
                    f53792b = i64 % 128;
                    int i65 = i64 % 2;
                    i31 = 3;
                    iArr = iArr2;
                    j10 = j17;
                    j12 = j18;
                }
                setY(new Object[]{jArr6, jArr5}, -31475590, 31475607, (int) System.currentTimeMillis());
                jArr5[0] = jArr5[0] ^ j10;
                jArr5[1] = jArr5[1] ^ j12;
                int i66 = f53792b;
                int i67 = ((((i66 ^ 77) | (i66 & 77)) << 1) - (~(-(((~i66) & 77) | (i66 & (-78)))))) - 1;
                f53791a = i67 % 128;
                int i68 = i67 % 2;
                return null;
            case 5:
                long[] jArr7 = (long[]) objArr[0];
                int i69 = f53791a;
                int i70 = i69 & 115;
                int i71 = -(-((i69 ^ 115) | i70));
                int i72 = (i70 & i71) + (i70 | i71);
                f53792b = i72 % 128;
                int i73 = i72 % 2;
                int i74 = ((int) ((jArr7[2] >>> 31) ^ jArr7[0])) & 1;
                int i75 = (i69 ^ 93) + ((i69 & 93) << 1);
                f53792b = i75 % 128;
                int i76 = i75 % 2;
                return Integer.valueOf(i74);
            case 6:
                long[] jArr8 = (long[]) objArr[0];
                long[] jArr9 = (long[]) objArr[1];
                long[] jArr10 = (long[]) objArr[2];
                int i77 = f53792b;
                int i78 = ((i77 | 77) << 1) - (i77 ^ 77);
                f53791a = i78 % 128;
                int i79 = i78 % 2;
                long[] jArr11 = new long[4];
                long[] jArr12 = new long[4];
                setY(new Object[]{jArr8, jArr11}, -828957965, 828957973, (int) System.currentTimeMillis());
                setY(new Object[]{jArr9, jArr12}, -828957965, 828957973, (int) System.currentTimeMillis());
                long[] jArr13 = new long[8];
                setY(new Object[]{jArr13, Long.valueOf(jArr11[0]), Long.valueOf(jArr12[0]), jArr10, 0}, -301676198, 301676217, 0);
                setY(new Object[]{jArr13, Long.valueOf(jArr11[1]), Long.valueOf(jArr12[1]), jArr10, 1}, -301676198, 301676217, 1);
                setY(new Object[]{jArr13, Long.valueOf(jArr11[2]), Long.valueOf(jArr12[2]), jArr10, 2}, -301676198, 301676217, 2);
                setY(new Object[]{jArr13, Long.valueOf(jArr11[3]), Long.valueOf(jArr12[3]), jArr10, 3}, -301676198, 301676217, 3);
                int i80 = f53792b;
                int i81 = i80 & 33;
                int i82 = (i80 ^ 33) | i81;
                int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                f53791a = i83 % 128;
                int i84 = i83 % 2;
                int i85 = 5;
                while (i85 > 0) {
                    int i86 = f53792b;
                    int i87 = (i86 | 97) << 1;
                    int i88 = -(((~i86) & 97) | (i86 & (-98)));
                    int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                    f53791a = i89 % 128;
                    if (i89 % 2 != 0) {
                        long j19 = jArr10[i85];
                        int i90 = ((i85 ^ 1) | (i85 & 1)) << 1;
                        int i91 = -(((~i85) & 1) | (i85 & (-2)));
                        jArr10[i85] = j19 / jArr10[((i90 | i91) << 1) - (i90 ^ i91)];
                        int i92 = i85 & 85;
                        int i93 = (i85 | 85) & (~i92);
                        int i94 = -(-(i92 << 1));
                        i85 = (i93 ^ i94) + ((i93 & i94) << 1);
                    } else {
                        jArr10[i85] = jArr10[i85] ^ jArr10[i85 - 1];
                        int i95 = i85 & 93;
                        int i96 = (i85 | 93) & (~i95);
                        int i97 = i95 << 1;
                        int i98 = (i96 & i97) + (i96 | i97);
                        int i99 = i98 & (-94);
                        i85 = ((((i98 ^ (-94)) | i99) << 1) - (~(-((~i99) & (i98 | (-94)))))) - 1;
                    }
                }
                setY(new Object[]{jArr13, Long.valueOf(jArr11[0] ^ jArr11[1]), Long.valueOf(jArr12[0] ^ jArr12[1]), jArr10, 1}, -301676198, 301676217, 1);
                setY(new Object[]{jArr13, Long.valueOf(jArr11[2] ^ jArr11[3]), Long.valueOf(jArr12[2] ^ jArr12[3]), jArr10, 3}, -301676198, 301676217, 3);
                int i100 = f53792b;
                int i101 = (i100 & 75) + (i100 | 75);
                f53791a = i101 % 128;
                int i102 = i101 % 2;
                int i103 = 7;
                while (i103 > 1) {
                    int i104 = f53792b;
                    int i105 = i104 | 109;
                    int i106 = i105 << 1;
                    int i107 = -((~(i104 & 109)) & i105);
                    int i108 = (i106 & i107) + (i107 | i106);
                    int i109 = i108 % 128;
                    f53791a = i109;
                    int i110 = i108 % 2;
                    jArr10[i103] = jArr10[i103] ^ jArr10[((i103 | (-2)) << 1) - (i103 ^ (-2))];
                    i103--;
                    int i111 = (i109 & 67) + (i109 | 67);
                    f53792b = i111 % 128;
                    int i112 = i111 % 2;
                }
                long j20 = jArr11[0] ^ jArr11[2];
                long j21 = jArr11[1] ^ jArr11[3];
                long j22 = jArr12[0] ^ jArr12[2];
                long j23 = jArr12[1] ^ jArr12[3];
                setY(new Object[]{jArr13, Long.valueOf(j20 ^ j21), Long.valueOf(j22 ^ j23), jArr10, 3}, -301676198, 301676217, 3);
                long[] jArr14 = new long[3];
                setY(new Object[]{jArr13, Long.valueOf(j20), Long.valueOf(j22), jArr14, 0}, -301676198, 301676217, 0);
                setY(new Object[]{jArr13, Long.valueOf(j21), Long.valueOf(j23), jArr14, 1}, -301676198, 301676217, 1);
                long j24 = jArr14[0];
                long j25 = jArr14[1];
                long j26 = jArr14[2];
                jArr10[2] = jArr10[2] ^ j24;
                jArr10[3] = (j24 ^ j25) ^ jArr10[3];
                jArr10[4] = (j25 ^ j26) ^ jArr10[4];
                jArr10[5] = jArr10[5] ^ j26;
                setY(new Object[]{jArr10}, -550486332, 550486342, (int) System.currentTimeMillis());
                int i113 = f53791a;
                int i114 = (i113 & 85) + (i113 | 85);
                f53792b = i114 % 128;
                int i115 = i114 % 2;
                return null;
            case 7:
                c(objArr);
                return null;
            case 8:
                b(objArr);
                return null;
            case 9:
                d(objArr);
                return null;
            case 10:
                long[] jArr15 = (long[]) objArr[0];
                int i116 = f53791a;
                int i117 = i116 ^ 45;
                int i118 = -(-((i116 & 45) << 1));
                int i119 = ((i117 | i118) << 1) - (i118 ^ i117);
                int i120 = i119 % 128;
                f53792b = i120;
                int i121 = i119 % 2;
                long j27 = jArr15[0];
                long j28 = jArr15[1];
                long j29 = jArr15[2];
                long j30 = jArr15[3];
                long j31 = jArr15[4];
                long j32 = jArr15[5];
                long j33 = jArr15[6];
                long j34 = jArr15[7];
                jArr15[0] = j27 ^ (j28 << 59);
                jArr15[1] = (j28 >>> 5) ^ (j29 << 54);
                jArr15[2] = (j29 >>> 10) ^ (j30 << 49);
                jArr15[3] = (j30 >>> 15) ^ (j31 << 44);
                jArr15[4] = (j31 >>> 20) ^ (j32 << 39);
                jArr15[5] = (j32 >>> 25) ^ (j33 << 34);
                jArr15[6] = (j33 >>> 30) ^ (j34 << 29);
                jArr15[7] = j34 >>> 35;
                int i122 = (i120 & (-122)) | ((~i120) & 121);
                int i123 = -(-((i120 & 121) << 1));
                int i124 = (i122 & i123) + (i122 | i123);
                f53791a = i124 % 128;
                int i125 = i124 % 2;
                return null;
            case 11:
                e(objArr);
                return null;
            case 12:
                a(objArr);
                return null;
            case 13:
                long[] jArr16 = (long[]) objArr[0];
                long[] jArr17 = (long[]) objArr[1];
                int i126 = f53791a;
                int i127 = i126 & 69;
                int i128 = -(-(i126 | 69));
                int i129 = (i127 ^ i128) + ((i128 & i127) << 1);
                int i130 = i129 % 128;
                f53792b = i130;
                int i131 = i129 % 2;
                jArr17[0] = jArr16[0] ^ 1;
                jArr17[1] = jArr16[1];
                jArr17[2] = jArr16[2];
                jArr17[3] = jArr16[3];
                int i132 = i130 & 121;
                int i133 = ((~i132) & (i130 | 121)) + (i132 << 1);
                f53791a = i133 % 128;
                int i134 = i133 % 2;
                return null;
            case 14:
                long[] jArr18 = (long[]) objArr[0];
                long[] jArr19 = (long[]) objArr[1];
                long[] jArr20 = (long[]) objArr[2];
                int i135 = f53792b;
                int i136 = i135 & 81;
                int i137 = (i136 - (~((i135 ^ 81) | i136))) - 1;
                f53791a = i137 % 128;
                int i138 = i137 % 2;
                long[] jArr21 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
                setY(new Object[]{jArr18, jArr19, jArr21}, 1456298347, -1456298341, (int) System.currentTimeMillis());
                setY(new Object[]{jArr21, jArr20}, -31475590, 31475607, (int) System.currentTimeMillis());
                int i139 = f53792b;
                int i140 = ((i139 ^ 7) | (i139 & 7)) << 1;
                int i141 = -(((~i139) & 7) | (i139 & (-8)));
                int i142 = (i140 & i141) + (i141 | i140);
                f53791a = i142 % 128;
                int i143 = i142 % 2;
                return null;
            case 15:
                long[] jArr22 = (long[]) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                long[] jArr23 = (long[]) objArr[2];
                int i144 = f53792b;
                int i145 = (i144 & 80) + (i144 | 80);
                int i146 = (i145 ^ (-1)) + (i145 << 1);
                f53791a = i146 % 128;
                int i147 = i146 % 2;
                long[] jArr24 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
                setY(new Object[]{jArr22, jArr24}, 1716859949, -1716859942, (int) System.currentTimeMillis());
                setY(new Object[]{jArr24, jArr23}, -31475590, 31475607, (int) System.currentTimeMillis());
                int i148 = f53791a;
                int i149 = (i148 ^ 61) + ((i148 & 61) << 1);
                f53792b = i149 % 128;
                int i150 = i149 % 2;
                while (true) {
                    int i151 = iIntValue & (-125);
                    int i152 = (iIntValue | (-125)) & (~i151);
                    int i153 = i151 << 1;
                    int i154 = (i152 ^ i153) + ((i153 & i152) << 1);
                    int i155 = (i154 & (-125)) | ((~i154) & 124);
                    int i156 = (i154 & 124) << 1;
                    iIntValue = (i155 & i156) + (i155 | i156);
                    if (iIntValue <= 0) {
                        int i157 = f53791a;
                        int i158 = (((i157 & (-70)) | ((~i157) & 69)) - (~((i157 & 69) << 1))) - 1;
                        f53792b = i158 % 128;
                        int i159 = i158 % 2;
                        return null;
                    }
                    int i160 = f53792b;
                    int i161 = i160 & 123;
                    int i162 = (((i160 ^ 123) | i161) << 1) - ((i160 | 123) & (~i161));
                    f53791a = i162 % 128;
                    int i163 = i162 % 2;
                    setY(new Object[]{jArr23, jArr24}, 1716859949, -1716859942, (int) System.currentTimeMillis());
                    setY(new Object[]{jArr24, jArr23}, -31475590, 31475607, (int) System.currentTimeMillis());
                    int i164 = f53791a;
                    int i165 = ((i164 ^ 31) | (i164 & 31)) << 1;
                    int i166 = -((31 & (~i164)) | (i164 & (-32)));
                    int i167 = (i165 & i166) + (i166 | i165);
                    f53792b = i167 % 128;
                    int i168 = i167 % 2;
                }
                break;
            case 16:
                long[] jArr25 = (long[]) objArr[0];
                long[] jArr26 = (long[]) objArr[1];
                int i169 = f53792b;
                int i170 = i169 & 85;
                int i171 = -(-((i169 ^ 85) | i170));
                int i172 = (i170 ^ i171) + ((i171 & i170) << 1);
                int i173 = i172 % 128;
                f53791a = i173;
                int i174 = i172 % 2;
                jArr26[0] = jArr26[0] ^ jArr25[0];
                jArr26[1] = jArr26[1] ^ jArr25[1];
                jArr26[2] = jArr26[2] ^ jArr25[2];
                jArr26[3] = jArr26[3] ^ jArr25[3];
                int i175 = i173 & 57;
                int i176 = (~i175) & (i173 | 57);
                int i177 = -(-(i175 << 1));
                int i178 = (i176 & i177) + (i177 | i176);
                f53792b = i178 % 128;
                int i179 = i178 % 2;
                return null;
            case 17:
                long[] jArr27 = (long[]) objArr[0];
                long[] jArr28 = (long[]) objArr[1];
                int i180 = f53791a;
                int i181 = i180 & 97;
                int i182 = i181 + ((i180 ^ 97) | i181);
                f53792b = i182 % 128;
                int i183 = i182 % 2;
                long j35 = jArr27[0];
                long j36 = jArr27[1];
                long j37 = jArr27[2];
                long j38 = jArr27[3];
                long j39 = jArr27[4];
                long j40 = jArr27[5];
                long j41 = jArr27[6];
                long j42 = jArr27[7];
                long j43 = j40 ^ (j42 >>> 31);
                long j44 = (j39 ^ ((j42 >>> 41) ^ (j42 << 33))) ^ (j41 >>> 31);
                long j45 = j36 ^ (j43 << 23);
                long j46 = (j37 ^ (j41 << 23)) ^ ((j43 >>> 41) ^ (j43 << 33));
                long j47 = ((j38 ^ (j42 << 23)) ^ ((j41 >>> 41) ^ (j41 << 33))) ^ (j43 >>> 31);
                long j48 = j47 >>> 41;
                jArr28[0] = (j35 ^ (j44 << 23)) ^ j48;
                jArr28[1] = (j48 << 10) ^ (j45 ^ ((j44 >>> 41) ^ (j44 << 33)));
                jArr28[2] = j46 ^ (j44 >>> 31);
                jArr28[3] = j47 & 2199023255551L;
                int i184 = i180 & 115;
                int i185 = -(-(i180 | 115));
                int i186 = ((i184 | i185) << 1) - (i184 ^ i185);
                f53792b = i186 % 128;
                int i187 = i186 % 2;
                return null;
            case 18:
                return g(objArr);
            case 19:
                long[] jArr29 = (long[]) objArr[0];
                long jLongValue5 = ((Number) objArr[1]).longValue();
                long jLongValue6 = ((Number) objArr[2]).longValue();
                long[] jArr30 = (long[]) objArr[3];
                int iIntValue2 = ((Number) objArr[4]).intValue();
                jArr29[1] = jLongValue6;
                long j49 = jLongValue6 << 1;
                jArr29[2] = j49;
                long j50 = j49 ^ jLongValue6;
                jArr29[3] = j50;
                long j51 = jLongValue6 << 2;
                jArr29[4] = j51;
                jArr29[5] = j51 ^ jLongValue6;
                long j52 = j50 << 1;
                jArr29[6] = j52;
                jArr29[7] = jLongValue6 ^ j52;
                int i188 = (int) jLongValue5;
                long j53 = jArr29[i188 & 7] ^ (jArr29[(i188 >>> 3) & 7] << 3);
                int i189 = f53791a + 51;
                f53792b = i189 % 128;
                int i190 = i189 % 2;
                long j54 = 0;
                int i191 = 54;
                while (true) {
                    int i192 = (int) (jLongValue5 >>> i191);
                    long j55 = jArr29[i192 & 7] ^ (jArr29[(i192 >>> i18) & 7] << i18);
                    j53 ^= j55 << i191;
                    j54 ^= j55 >>> (-i191);
                    i191 = ((i191 | (-6)) << 1) - (i191 ^ (-6));
                    if (i191 <= 0) {
                        int i193 = f53792b;
                        int i194 = (i193 | 29) << 1;
                        int i195 = -(((~i193) & 29) | (i193 & (-30)));
                        int i196 = (i194 ^ i195) + ((i195 & i194) << 1);
                        int i197 = i196 % 128;
                        f53791a = i197;
                        int i198 = i196 % 2;
                        jArr30[iIntValue2] = jArr30[iIntValue2] ^ (576460752303423487L & j53);
                        int i199 = iIntValue2 & 1;
                        int i200 = ((iIntValue2 ^ 1) | i199) << 1;
                        int i201 = -((~i199) & (iIntValue2 | 1));
                        int i202 = (i200 ^ i201) + ((i200 & i201) << 1);
                        jArr30[i202] = jArr30[i202] ^ ((j53 >>> 59) ^ (j54 << 5));
                        int i203 = i197 & 97;
                        int i204 = i203 + ((i197 ^ 97) | i203);
                        f53792b = i204 % 128;
                        int i205 = i204 % 2;
                        return null;
                    }
                    i18 = 3;
                }
                break;
            default:
                f(objArr);
                return null;
        }
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, long[] jArr2, long[] jArr3) {
        setY(new Object[]{jArr, jArr2, jArr3}, -2109571802, 2109571813, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(long[] jArr, long[] jArr2, long[] jArr3) {
        setY(new Object[]{jArr, jArr2, jArr3}, 1760454700, -1760454686, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2, long[] jArr3) {
        setY(new Object[]{jArr, jArr2, jArr3}, -1576375366, 1576375367, (int) System.currentTimeMillis());
    }

    public static void setX(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, -1708277463, 1708277466, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, 1499764271, -1499764258, (int) System.currentTimeMillis());
    }

    public static long[] setX(BigInteger bigInteger) {
        return (long[]) setY(new Object[]{bigInteger}, -1412860296, 1412860314, (int) System.currentTimeMillis());
    }

    public static void setY(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, -488663456, 488663460, (int) System.currentTimeMillis());
    }
}
