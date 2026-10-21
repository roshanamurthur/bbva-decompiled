package com.mypinpad.tsdk.isolation;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.math.BigInteger;
import java.security.SecureRandom;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes10.dex */
public final class apw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f53542a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f53543b = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53544c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53545d = 1;

    static {
        int i10 = ((1 & 44) + (1 | 44)) - 1;
        f53544c = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 7 / 0;
        }
    }

    public static /* synthetic */ void a(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53544c;
        int i11 = (-2) - (((i10 ^ 114) + ((i10 & 114) << 1)) ^ (-1));
        f53545d = i11 % 128;
        int i12 = i11 % 2;
        int[] iArr3 = f53542a;
        if (i12 != 0 ? ((Integer) setOnFocusChangeListener(new Object[]{iArr}, -1211725060, 1211725074, (int) System.currentTimeMillis())).intValue() == 0 : ((Integer) setOnFocusChangeListener(new Object[]{iArr}, -1211725060, 1211725074, (int) System.currentTimeMillis())).intValue() == 0) {
            ((Integer) avf.setX(new Object[]{iArr3, iArr, iArr2}, -854306397, 854306423, (int) System.currentTimeMillis())).intValue();
            int i13 = f53544c;
            int i14 = ((((i13 ^ 1) | (i13 & 1)) << 1) - (~(-(((~i13) & 1) | (i13 & (-2)))))) - 1;
            f53545d = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 45 / 0;
                return;
            }
            return;
        }
        ((Integer) avf.setX(new Object[]{iArr3, iArr3, iArr2}, -854306397, 854306423, (int) System.currentTimeMillis())).intValue();
        int i16 = f53545d;
        int i17 = i16 ^ 87;
        int i18 = ((i16 & 87) | i17) << 1;
        int i19 = -i17;
        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
        f53544c = i20 % 128;
        if (i20 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void b(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53544c;
        int i11 = i10 & 53;
        int i12 = i11 + ((i10 ^ 53) | i11);
        f53545d = i12 % 128;
        if (i12 % 2 != 0) {
            int[] iArr3 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
            avf.setX(new Object[]{iArr, iArr3}, -44054691, 44054719, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{iArr3, iArr2}, -761961495, 761961499, (int) System.currentTimeMillis());
        } else {
            int[] iArr4 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
            avf.setX(new Object[]{iArr, iArr4}, -44054691, 44054719, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{iArr4, iArr2}, -761961495, 761961499, (int) System.currentTimeMillis());
            throw null;
        }
    }

    public static /* synthetic */ void c(Object[] objArr) {
        int[] iArr;
        int[] iArr2 = (int[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53544c;
        int i11 = (i10 & 43) + (i10 | 43);
        f53545d = i11 % 128;
        if (i11 % 2 == 0) {
            iArr = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
            avf.setX(new Object[]{iArr2, iArr}, -44054691, 44054719, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{iArr, iArr3}, -761961495, 761961499, (int) System.currentTimeMillis());
            int i12 = 11 / 0;
        } else {
            iArr = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
            avf.setX(new Object[]{iArr2, iArr}, -44054691, 44054719, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{iArr, iArr3}, -761961495, 761961499, (int) System.currentTimeMillis());
        }
        while (true) {
            int i13 = iIntValue + 52;
            iIntValue = ((i13 | (-53)) << 1) - (i13 ^ (-53));
            if (iIntValue <= 0) {
                break;
            }
            int i14 = f53544c;
            int i15 = (((i14 ^ 51) | (i14 & 51)) << 1) - (((~i14) & 51) | (i14 & (-52)));
            f53545d = i15 % 128;
            int i16 = i15 % 2;
            avf.setX(new Object[]{iArr3, iArr}, -44054691, 44054719, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{iArr, iArr3}, -761961495, 761961499, (int) System.currentTimeMillis());
            int i17 = f53545d;
            int i18 = i17 & 123;
            int i19 = (i17 ^ 123) | i18;
            int i20 = (i18 & i19) + (i19 | i18);
            f53544c = i20 % 128;
            int i21 = i20 % 2;
        }
        int i22 = f53544c + 47;
        f53545d = i22 % 128;
        if (i22 % 2 == 0) {
            int i23 = 24 / 0;
        }
    }

    public static /* synthetic */ void d(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53544c;
        int i11 = i10 ^ 35;
        int i12 = (((i10 & 35) | i11) << 1) - i11;
        f53545d = i12 % 128;
        int i13 = i12 % 2;
        int[] iArr3 = f53542a;
        if (i13 == 0) {
            ava.setOnFocusChangeListener(new Object[]{iArr3, iArr, iArr2}, 1200653283, -1200653275, (int) System.currentTimeMillis());
            throw null;
        }
        ava.setOnFocusChangeListener(new Object[]{iArr3, iArr, iArr2}, 1200653283, -1200653275, (int) System.currentTimeMillis());
        int i14 = f53545d;
        int i15 = ((i14 & 50) + (i14 | 50)) - 1;
        f53544c = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void e(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53544c;
        int i11 = (i10 & (-78)) | ((~i10) & 77);
        int i12 = -(-((i10 & 77) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53545d = i13 % 128;
        int i14 = i13 % 2;
        ((Integer) avf.setX(new Object[]{iArr, iArr2, iArr3}, -993304868, 993304870, (int) System.currentTimeMillis())).intValue();
        if (!(!((Boolean) avf.setX(new Object[]{iArr3, f53542a}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue())) {
            int i15 = f53545d + 85;
            f53544c = i15 % 128;
            int i16 = i15 % 2;
            ((Integer) setOnFocusChangeListener(new Object[]{iArr3}, -1072390212, 1072390229, (int) System.currentTimeMillis())).intValue();
            int i17 = f53545d;
            int i18 = (((i17 | 10) << 1) - (i17 ^ 10)) - 1;
            f53544c = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = f53544c;
        int i21 = i20 & 79;
        int i22 = (i20 ^ 79) | i21;
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        f53545d = i23 % 128;
        if (i23 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void f(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53544c;
        int i11 = i10 & 51;
        int i12 = (i10 | 51) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        f53545d = i14 % 128;
        if (i14 % 2 != 0) {
            int[] iArr4 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
            avf.setX(new Object[]{iArr, iArr2, iArr4}, -701222223, 701222256, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{iArr4, iArr3}, -761961495, 761961499, (int) System.currentTimeMillis());
        } else {
            int[] iArr5 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
            avf.setX(new Object[]{iArr, iArr2, iArr5}, -701222223, 701222256, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{iArr5, iArr3}, -761961495, 761961499, (int) System.currentTimeMillis());
            int i15 = 35 / 0;
        }
    }

    public static /* synthetic */ void g(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53544c + 113;
        f53545d = i10 % 128;
        int i11 = i10 % 2;
        ((Integer) auy.setOnFocusChangeListener(new Object[]{8, iArr, 0, iArr2}, -1008052683, 1008052691, 8)).intValue();
        if (!(!((Boolean) avf.setX(new Object[]{iArr2, f53542a}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue())) {
            int i12 = f53544c;
            int i13 = i12 ^ 93;
            int i14 = ((i12 & 93) | i13) << 1;
            int i15 = -i13;
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            f53545d = i16 % 128;
            Object[] objArr2 = new Object[1];
            if (i16 % 2 == 0) {
                objArr2[0] = iArr2;
                ((Integer) setOnFocusChangeListener(objArr2, -1072390212, 1072390229, (int) System.currentTimeMillis())).intValue();
                throw null;
            }
            objArr2[0] = iArr2;
            ((Integer) setOnFocusChangeListener(objArr2, -1072390212, 1072390229, (int) System.currentTimeMillis())).intValue();
        }
        int i17 = f53545d + 93;
        f53544c = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 70 / 0;
        }
    }

    public static void getNavBarTitleString(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, 2137965383, -2137965376, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ void h(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53544c;
        int i11 = ((i10 & (-52)) | ((~i10) & 51)) + ((i10 & 51) << 1);
        f53545d = i11 % 128;
        int i12 = i11 % 2;
        ((Integer) avf.setX(new Object[]{iArr, iArr2, iArr3}, 340994627, -340994605, (int) System.currentTimeMillis())).intValue();
        if (((Boolean) auy.setOnFocusChangeListener(new Object[]{16, iArr3, f53543b}, 280624047, -280624046, 16)).booleanValue()) {
            int i13 = f53544c;
            int i14 = (i13 ^ 19) + ((i13 & 19) << 1);
            f53545d = i14 % 128;
            if (i14 % 2 == 0) {
                ((Integer) setOnFocusChangeListener(new Object[]{iArr3}, 1086664959, -1086664956, (int) System.currentTimeMillis())).intValue();
                throw null;
            }
            ((Integer) setOnFocusChangeListener(new Object[]{iArr3}, 1086664959, -1086664956, (int) System.currentTimeMillis())).intValue();
        }
        int i15 = f53544c;
        int i16 = (i15 ^ 117) + ((i15 & 117) << 1);
        f53545d = i16 % 128;
        int i17 = i16 % 2;
    }

    public static /* synthetic */ void i(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53545d;
        int i11 = (i10 & (-122)) | ((~i10) & 121);
        int i12 = (i10 & 121) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        f53544c = i13 % 128;
        int i14 = i13 % 2;
        if (((Integer) avf.setX(new Object[]{iArr, iArr2, iArr3}, -854306397, 854306423, (int) System.currentTimeMillis())).intValue() != 0) {
            int i15 = f53544c;
            int i16 = (i15 ^ 37) + ((i15 & 37) << 1);
            f53545d = i16 % 128;
            Object[] objArr2 = new Object[1];
            if (i16 % 2 == 0) {
                objArr2[0] = iArr3;
                ((Integer) setOnFocusChangeListener(objArr2, 1132624320, -1132624314, (int) System.currentTimeMillis())).intValue();
                throw null;
            }
            objArr2[0] = iArr3;
            ((Integer) setOnFocusChangeListener(objArr2, 1132624320, -1132624314, (int) System.currentTimeMillis())).intValue();
        }
        int i17 = f53544c + 79;
        f53545d = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void j(Object[] objArr) {
        SecureRandom secureRandom = (SecureRandom) objArr[0];
        int[] iArr = (int[]) objArr[1];
        int i10 = f53544c;
        int i11 = (-2) - ((i10 + 126) ^ (-1));
        f53545d = i11 % 128;
        byte[] bArr = new byte[i11 % 2 == 0 ? 29 : 32];
        int i12 = i10 | 77;
        int i13 = ((i12 << 1) - (~(-((~(i10 & 77)) & i12)))) - 1;
        f53545d = i13 % 128;
        int i14 = i13 % 2;
        do {
            secureRandom.nextBytes(bArr);
            ber.setDividerPadding(new Object[]{bArr, 0, iArr, 8}, 1570947064, -1570947056, 0);
            iArr[7] = iArr[7] & Integer.MAX_VALUE;
        } while (((Integer) auy.setOnFocusChangeListener(new Object[]{8, iArr, f53542a}, -188447753, 188447787, 8)).intValue() == 0);
        int i15 = f53545d;
        int i16 = i15 & 85;
        int i17 = -(-((i15 ^ 85) | i16));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        f53544c = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = 1 / 0;
        }
    }

    public static /* synthetic */ Integer k(Object[] objArr) {
        int i10 = 0;
        int[] iArr = (int[]) objArr[0];
        int i11 = f53544c;
        int i12 = (-2) - (((i11 ^ 78) + ((i11 & 78) << 1)) ^ (-1));
        f53545d = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i11 & 31;
        int i15 = ((i11 ^ 31) | i14) << 1;
        int i16 = -((i11 | 31) & (~i14));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        f53545d = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 0;
        while (i10 < 8) {
            int i20 = f53544c;
            int i21 = (i20 & (-16)) | ((~i20) & 15);
            int i22 = -(-((i20 & 15) << 1));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            int i24 = i23 % 128;
            f53545d = i24;
            int i25 = i23 % 2;
            int i26 = iArr[i10];
            int i27 = ((~i26) & i19) | ((~i19) & i26);
            int i28 = i19 & i26;
            i19 = (i28 & i27) | (i27 ^ i28);
            i10++;
            int i29 = ((i24 & 68) + (i24 | 68)) - 1;
            f53544c = i29 % 128;
            int i30 = i29 % 2;
        }
        int i31 = i19 >>> 1;
        int i32 = i19 & 1;
        int i33 = ((~i32) & i31) | ((~i31) & i32);
        int i34 = i31 & i32;
        int i35 = (i34 & i33) | (i33 ^ i34);
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i36 = i35 * 868;
        int i37 = ((-868) ^ i36) + ((i36 & (-868)) << 1);
        int i38 = ~iCurrentTimeMillis;
        int i39 = ~i38;
        int i40 = (i39 | i38) & i39;
        int i41 = ~i35;
        int i42 = ~i41;
        int i43 = (i39 & i41) | (i38 & i42);
        int i44 = i41 & i38;
        int i45 = ~((i43 & i44) | (i43 ^ i44));
        int i46 = i40 ^ i45;
        int i47 = i45 & i40;
        int i48 = ((i47 & i46) | (i46 ^ i47)) * (-867);
        int i49 = i37 & i48;
        int i50 = -(-((i48 ^ i37) | i49));
        int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
        int i52 = ~iCurrentTimeMillis;
        int i53 = i52 & (i52 | iCurrentTimeMillis);
        int i54 = i42 & i53;
        int i55 = (i53 | i42) & (~i54);
        int i56 = (i55 & i54) | (i55 ^ i54);
        int i57 = (i41 ^ iCurrentTimeMillis) | (i41 & iCurrentTimeMillis);
        int i58 = ~i57;
        int i59 = (i57 | i58) & i58;
        int i60 = (i51 - (~(-(-(((i56 & i59) | (i56 ^ i59)) * (-1734)))))) - 1;
        int i61 = i38 | i41;
        int i62 = ~i61;
        int i63 = (~((i35 & iCurrentTimeMillis) | (i35 ^ iCurrentTimeMillis))) | ((i61 | i62) & i62);
        int i64 = (-1) ^ iCurrentTimeMillis;
        int i65 = ~((iCurrentTimeMillis & i64) | (i64 ^ iCurrentTimeMillis));
        int i66 = i63 & i65;
        int i67 = (i63 | i65) & (~i66);
        int i68 = ((-2) - (((i60 - (~(-(~(((i67 & i66) | (i67 ^ i66)) * 867))))) - 1) ^ (-1))) >> 31;
        int i69 = f53545d;
        int i70 = ((i69 ^ 17) | (i69 & 17)) << 1;
        int i71 = -(((~i69) & 17) | (i69 & (-18)));
        int i72 = ((i70 | i71) << 1) - (i71 ^ i70);
        f53544c = i72 % 128;
        if (i72 % 2 == 0) {
            return Integer.valueOf(i68);
        }
        throw null;
    }

    public static /* synthetic */ void l(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53544c;
        int i11 = (i10 ^ 123) + ((i10 & 123) << 1);
        f53545d = i11 % 128;
        int i12 = i11 % 2;
        int i13 = iArr[7];
        ((Integer) auy.setOnFocusChangeListener(new Object[]{iArr, Integer.valueOf(i13), iArr2}, -864775696, 864775701, i13)).intValue();
        int iIntValue = ((Integer) avf.setX(new Object[]{iArr, iArr2}, -1398444665, 1398444675, (int) System.currentTimeMillis())).intValue() << 1;
        int i14 = iArr2[7];
        int i15 = i14 >>> 31;
        int i16 = -(i13 >>> 31);
        int i17 = (iIntValue - (~((i15 ^ i16) + ((i16 & i15) << 1)))) - 1;
        int i18 = Integer.MAX_VALUE & i14;
        int iIntValue2 = ((Integer) auy.setOnFocusChangeListener(new Object[]{7, Integer.valueOf(i17 * 19), iArr2}, -675302000, 675302004, 7)).intValue();
        int i19 = i18 & iIntValue2;
        int i20 = (iIntValue2 ^ i18) | i19;
        iArr2[7] = (i19 ^ i20) + ((i20 & i19) << 1);
        if (((Boolean) avf.setX(new Object[]{iArr2, f53542a}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue()) {
            int i21 = f53544c + 53;
            f53545d = i21 % 128;
            int i22 = i21 % 2;
            ((Integer) setOnFocusChangeListener(new Object[]{iArr2}, -1072390212, 1072390229, (int) System.currentTimeMillis())).intValue();
            int i23 = f53544c;
            int i24 = i23 & 71;
            int i25 = i24 + ((i23 ^ 71) | i24);
            f53545d = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = f53545d;
        int i28 = i27 & 15;
        int i29 = (i27 ^ 15) | i28;
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        f53544c = i30 % 128;
        if (i30 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void m(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int i10 = f53544c;
        int i11 = (i10 & 45) + (i10 | 45);
        f53545d = i11 % 128;
        int i12 = i11 % 2;
        int i13 = iArr[7];
        int i14 = iIntValue << 1;
        int i15 = i13 >>> 31;
        int i16 = i13 & Integer.MAX_VALUE;
        int iIntValue2 = ((Integer) auy.setOnFocusChangeListener(new Object[]{7, Integer.valueOf(((i14 & i15) | (i14 ^ i15)) * 19), iArr}, -675302000, 675302004, 7)).intValue();
        int i17 = iIntValue2 * (-575);
        int i18 = i16 * (-575);
        int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
        int i20 = ~iIntValue2;
        int i21 = (i20 | iIntValue2) & i20;
        int i22 = ~i16;
        int i23 = i21 & i22;
        int i24 = (~i23) & (i21 | i22);
        int i25 = (i23 & i24) | (i24 ^ i23);
        int i26 = ~i25;
        int i27 = (i25 | i26) & i26;
        int i28 = (i22 | i16) & i22;
        int i29 = i28 & iIntValue;
        int i30 = (~i29) & (i28 | iIntValue);
        int i31 = ~iIntValue;
        int i32 = (i30 ^ i29) | (i29 & i30);
        int i33 = ~i32;
        int i34 = (i32 | i33) & i33;
        int i35 = i27 & i34;
        int i36 = (((~i35) & (i27 | i34)) | i35) * 576;
        int i37 = i19 | i36;
        int i38 = (i37 << 1) - ((~(i36 & i19)) & i37);
        int i39 = i21 & i16;
        int i40 = (i16 | i21) & (~i39);
        int i41 = ~((i39 & i40) | (i40 ^ i39));
        int i42 = i31 & (iIntValue | i31);
        int i43 = i22 & i42;
        int i44 = (i42 | i22) & (~i43);
        int i45 = (i44 & i43) | (i44 ^ i43);
        int i46 = (i45 & i20) | ((~i45) & iIntValue2);
        int i47 = i45 & iIntValue2;
        int i48 = ~((i47 & i46) | (i46 ^ i47));
        int i49 = ((~i48) & i41) | ((~i41) & i48);
        int i50 = i48 & i41;
        int i51 = -(~(-(-(((i50 & i49) | (i49 ^ i50)) * 576))));
        int i52 = (-2) - (((i38 ^ i51) + ((i51 & i38) << 1)) ^ (-1));
        int i53 = i20 & i28;
        int i54 = (~i53) & (i20 | i28);
        int i55 = (~((i53 & i54) | (i54 ^ i53))) * 576;
        iArr[7] = (i52 & i55) + (i52 | i55);
        if (((Boolean) avf.setX(new Object[]{iArr, f53542a}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue()) {
            int i56 = f53545d + 53;
            f53544c = i56 % 128;
            if (i56 % 2 != 0) {
                ((Integer) setOnFocusChangeListener(new Object[]{iArr}, -1072390212, 1072390229, (int) System.currentTimeMillis())).intValue();
                int i57 = 11 / 0;
            } else {
                ((Integer) setOnFocusChangeListener(new Object[]{iArr}, -1072390212, 1072390229, (int) System.currentTimeMillis())).intValue();
            }
        }
        int i58 = f53544c + 77;
        f53545d = i58 % 128;
        int i59 = i58 % 2;
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, -761961495, 761961499, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, -1179246970, 1179246978, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0235  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i12;
        int i15 = (~(i13 | i11)) | (~(i13 | i14));
        int i16 = ~i11;
        int i17 = ~(i10 | i16 | i12);
        int i18 = ((~(i16 | i14)) * 713) + (i17 * 1426) + ((i15 | i17) * (-713)) + (i11 * (-712)) + (i10 * 714);
        int[] iArr = f53542a;
        switch (i18) {
            case 1:
                m(objArr);
                return null;
            case 2:
                c(objArr);
                return null;
            case 3:
                int[] iArr2 = (int[]) objArr[0];
                int i19 = f53545d + 126;
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                int i21 = i20 % 128;
                f53544c = i21;
                int i22 = i20 % 2;
                long j10 = ((long) iArr2[0]) & 4294967295L;
                int[] iArr3 = f53543b;
                long j11 = j10 - (((long) iArr3[0]) & 4294967295L);
                iArr2[0] = (int) j11;
                long jIntValue = j11 >> 32;
                if (jIntValue != 0) {
                    int i23 = (i21 | 55) << 1;
                    int i24 = -(((~i21) & 55) | (i21 & (-56)));
                    int i25 = (i23 & i24) + (i24 | i23);
                    f53545d = i25 % 128;
                    jIntValue = ((Integer) (i25 % 2 == 0 ? auy.setOnFocusChangeListener(new Object[]{18, iArr2, 0}, -115920179, 115920214, 18) : auy.setOnFocusChangeListener(new Object[]{8, iArr2, 1}, -115920179, 115920214, 8))).intValue();
                    int i26 = f53545d;
                    int i27 = i26 & 87;
                    int i28 = (i26 ^ 87) | i27;
                    int i29 = (i27 & i28) + (i28 | i27);
                    f53544c = i29 % 128;
                    int i30 = i29 % 2;
                }
                long j12 = (((long) iArr2[8]) & 4294967295L) + 19 + jIntValue;
                iArr2[8] = (int) j12;
                long jIntValue2 = j12 >> 32;
                if (jIntValue2 != 0) {
                    int i31 = f53544c + 34;
                    int i32 = (i31 ^ (-1)) + (i31 << 1);
                    f53545d = i32 % 128;
                    int i33 = i32 % 2;
                    jIntValue2 = ((Integer) auy.setOnFocusChangeListener(new Object[]{15, iArr2, 9}, -668114120, 668114158, 15)).intValue();
                    int i34 = f53544c;
                    int i35 = i34 & 11;
                    int i36 = -(-((i34 ^ 11) | i35));
                    int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                    f53545d = i37 % 128;
                    int i38 = i37 % 2;
                }
                long j13 = ((long) iArr2[15]) & 4294967295L;
                int i39 = iArr3[15];
                int i40 = i39 & 1;
                long j14 = (j13 - (((long) ((((i39 ^ 1) | i40) << 1) - ((i39 | 1) & (~i40)))) & 4294967295L)) + jIntValue2;
                iArr2[15] = (int) j14;
                int i41 = f53545d;
                int i42 = i41 & 71;
                int i43 = (i41 ^ 71) | i42;
                int i44 = (i42 & i43) + (i43 | i42);
                f53544c = i44 % 128;
                int i45 = i44 % 2;
                return Integer.valueOf((int) (j14 >> 32));
            case 4:
                l(objArr);
                return null;
            case 5:
                i(objArr);
                return null;
            case 6:
                int[] iArr4 = (int[]) objArr[0];
                int i46 = f53545d;
                int i47 = (i46 | 115) << 1;
                int i48 = ~i46;
                int i49 = -((i46 & (-116)) | (i48 & 115));
                int i50 = (i47 ^ i49) + ((i47 & i49) << 1);
                f53544c = i50 % 128;
                int i51 = i50 % 2;
                long j15 = (((long) iArr4[0]) & 4294967295L) - 19;
                iArr4[0] = (int) j15;
                long jIntValue3 = j15 >> 32;
                if (jIntValue3 != 0) {
                    int i52 = (i46 | 3) << 1;
                    int i53 = -((i46 & (-4)) | (3 & i48));
                    int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                    f53544c = i54 % 128;
                    jIntValue3 = ((Integer) (i54 % 2 != 0 ? auy.setOnFocusChangeListener(new Object[]{105, iArr4, 1}, -115920179, 115920214, 105) : auy.setOnFocusChangeListener(new Object[]{7, iArr4, 1}, -115920179, 115920214, 7))).intValue();
                    int i55 = f53545d;
                    int i56 = i55 & 89;
                    int i57 = i56 + ((i55 ^ 89) | i56);
                    f53544c = i57 % 128;
                    int i58 = i57 % 2;
                }
                long j16 = (((long) iArr4[7]) & 4294967295L) + SvgConstantsKt.SPECIFIED_SOLID_COLOR + jIntValue3;
                iArr4[7] = (int) j16;
                int i59 = f53544c;
                int i60 = ((i59 | 53) << 1) - (i59 ^ 53);
                f53545d = i60 % 128;
                int i61 = i60 % 2;
                return Integer.valueOf((int) (j16 >> 32));
            case 7:
                g(objArr);
                return null;
            case 8:
                a(objArr);
                return null;
            case 9:
                j(objArr);
                return null;
            case 10:
                h(objArr);
                return null;
            case 11:
                f(objArr);
                return null;
            case 12:
                b(objArr);
                return null;
            case 13:
                int[] iArr5 = (int[]) objArr[0];
                int[] iArr6 = (int[]) objArr[1];
                int i62 = f53545d + 37;
                f53544c = i62 % 128;
                if (i62 % 2 != 0) {
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{112, iArr5, iArr6}, 1108035559, -1108035515, 112)).intValue();
                    if (((Boolean) avf.setX(new Object[]{iArr6, iArr}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue()) {
                        int i63 = f53544c;
                        int i64 = i63 ^ 83;
                        int i65 = ((((i63 & 83) | i64) << 1) - (~(-i64))) - 1;
                        f53545d = i65 % 128;
                        int i66 = i65 % 2;
                        ((Integer) setOnFocusChangeListener(new Object[]{iArr6}, -1072390212, 1072390229, (int) System.currentTimeMillis())).intValue();
                        int i67 = f53545d;
                        int i68 = i67 & 5;
                        int i69 = i67 | 5;
                        int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
                        f53544c = i70 % 128;
                        int i71 = i70 % 2;
                    }
                } else {
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{8, iArr5, iArr6}, 1108035559, -1108035515, 8)).intValue();
                    if (((Boolean) avf.setX(new Object[]{iArr6, iArr}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue()) {
                        int i610 = f53544c;
                        int i611 = i610 ^ 83;
                        int i612 = ((((i610 & 83) | i611) << 1) - (~(-i611))) - 1;
                        f53545d = i612 % 128;
                        int i613 = i612 % 2;
                        ((Integer) setOnFocusChangeListener(new Object[]{iArr6}, -1072390212, 1072390229, (int) System.currentTimeMillis())).intValue();
                        int i614 = f53545d;
                        int i615 = i614 & 5;
                        int i616 = i614 | 5;
                        int i72 = ((i615 | i616) << 1) - (i616 ^ i615);
                        f53544c = i72 % 128;
                        int i73 = i72 % 2;
                    }
                }
                int i74 = f53544c;
                int i75 = (((i74 | 45) << 1) - (~(-(((~i74) & 45) | (i74 & (-46)))))) - 1;
                f53545d = i75 % 128;
                int i76 = i75 % 2;
                return null;
            case 14:
                return k(objArr);
            case 15:
                e(objArr);
                return null;
            case 16:
                SecureRandom secureRandom = (SecureRandom) objArr[0];
                int[] iArr7 = (int[]) objArr[1];
                do {
                    setOnFocusChangeListener(new Object[]{secureRandom, iArr7}, 952635350, -952635341, (int) System.currentTimeMillis());
                } while (((Integer) setOnFocusChangeListener(new Object[]{iArr7}, -1211725060, 1211725074, (int) System.currentTimeMillis())).intValue() != 0);
                int i77 = f53544c;
                int i78 = ((((i77 ^ 105) | (i77 & 105)) << 1) - (~(-(((~i77) & 105) | (i77 & (-106)))))) - 1;
                f53545d = i78 % 128;
                int i79 = i78 % 2;
                return null;
            case 17:
                int[] iArr8 = (int[]) objArr[0];
                int i80 = f53545d + 17;
                int i81 = i80 % 128;
                f53544c = i81;
                int i82 = i80 % 2;
                long j17 = (((long) iArr8[0]) & 4294967295L) + 19;
                iArr8[0] = (int) j17;
                long jIntValue4 = j17 >> 32;
                if (jIntValue4 != 0) {
                    int i83 = ((i81 | 5) << 1) - (i81 ^ 5);
                    f53545d = i83 % 128;
                    int i84 = i83 % 2;
                    jIntValue4 = ((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr8, 1}, -668114120, 668114158, 7)).intValue();
                    int i85 = f53545d;
                    int i86 = ((i85 | 93) << 1) - (((~i85) & 93) | (i85 & (-94)));
                    f53544c = i86 % 128;
                    int i87 = i86 % 2;
                }
                long j18 = ((((long) iArr8[7]) & 4294967295L) - SvgConstantsKt.SPECIFIED_SOLID_COLOR) + jIntValue4;
                iArr8[7] = (int) j18;
                System.currentTimeMillis();
                System.currentTimeMillis();
                return Integer.valueOf((int) (j18 >> 32));
            case 18:
                BigInteger bigInteger = (BigInteger) objArr[0];
                int i88 = f53545d;
                int i89 = ((i88 & 40) + (i88 | 40)) - 1;
                f53544c = i89 % 128;
                int i90 = i89 % 2;
                int[] iArr9 = (int[]) avf.setX(new Object[]{bigInteger}, -1818387099, 1818387099, (int) System.currentTimeMillis());
                int i91 = f53544c;
                int i92 = (i91 ^ 57) + ((i91 & 57) << 1);
                f53545d = i92 % 128;
                int i93 = i92 % 2;
                while (!(!((Boolean) avf.setX(new Object[]{iArr9, iArr}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue())) {
                    int i94 = f53544c + 55;
                    f53545d = i94 % 128;
                    int i95 = i94 % 2;
                    ((Integer) avf.setX(new Object[]{iArr, iArr9}, 1877956622, -1877956593, (int) System.currentTimeMillis())).intValue();
                    int i96 = f53544c;
                    int i97 = ((i96 ^ 19) | (i96 & 19)) << 1;
                    int i98 = -(((~i96) & 19) | (i96 & (-20)));
                    int i99 = (i97 ^ i98) + ((i98 & i97) << 1);
                    f53545d = i99 % 128;
                    int i100 = i99 % 2;
                }
                int i101 = f53544c;
                int i102 = i101 & 55;
                int i103 = ((i101 ^ 55) | i102) << 1;
                int i104 = -((i101 | 55) & (~i102));
                int i105 = (i103 & i104) + (i104 | i103);
                f53545d = i105 % 128;
                int i106 = i105 % 2;
                return iArr9;
            default:
                d(objArr);
                return null;
        }
    }

    public static void setX(int[] iArr, int[] iArr2, int[] iArr3) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, 2077163775, -2077163765, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2, int[] iArr3) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, 1022739355, -1022739350, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2, int[] iArr3) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, -1896380356, 1896380367, (int) System.currentTimeMillis());
    }

    public static int[] setDividerPadding(BigInteger bigInteger) {
        return (int[]) setOnFocusChangeListener(new Object[]{bigInteger}, 1791299722, -1791299704, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, 1538062715, -1538062702, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, -650561249, 650561261, (int) System.currentTimeMillis());
    }

    public static void setY(int i10, int[] iArr) {
        setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr}, 1288032085, -1288032084, i10);
    }

    public static void setOnFocusChangeListener(int[] iArr, int i10, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, Integer.valueOf(i10), iArr2}, -1060570579, 1060570581, i10);
    }

    public static void setOnFocusChangeListener(SecureRandom secureRandom, int[] iArr) {
        setOnFocusChangeListener(new Object[]{secureRandom, iArr}, -697595785, 697595801, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, -836784304, 836784304, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, 275338608, -275338593, (int) System.currentTimeMillis());
    }
}
