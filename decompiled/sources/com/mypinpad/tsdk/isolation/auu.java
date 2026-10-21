package com.mypinpad.tsdk.isolation;

import androidx.core.view.MotionEventCompat;

/* JADX INFO: loaded from: classes10.dex */
public final class auu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53925a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53926b = 1;

    public static /* synthetic */ Long a(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int i10 = f53925a;
        int i11 = ((i10 ^ 81) | (i10 & 81)) << 1;
        int i12 = -(((~i10) & 81) | (i10 & (-82)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53926b = i13 % 128;
        int i14 = i13 % 2;
        int iIntValue2 = ((Integer) aus.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(MotionEventCompat.ACTION_POINTER_INDEX_MASK), 8}, -795789696, 795789696, iIntValue)).intValue();
        int iIntValue3 = ((Integer) aus.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(iIntValue2), 15728880, 4}, -795789696, 795789696, iIntValue2)).intValue();
        int iIntValue4 = ((Integer) aus.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(iIntValue3), 202116108, 2}, -795789696, 795789696, iIntValue3)).intValue();
        int iIntValue5 = ((Integer) aus.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(iIntValue4), 572662306, 1}, -795789696, 795789696, iIntValue4)).intValue();
        long j10 = ((((long) (iIntValue5 >>> 1)) & 1431655765) << 32) | (1431655765 & ((long) iIntValue5));
        int i15 = f53926b + 119;
        f53925a = i15 % 128;
        if (i15 % 2 == 0) {
            return Long.valueOf(j10);
        }
        throw null;
    }

    public static /* synthetic */ Integer b(Object[] objArr) {
        int i10;
        int iIntValue = ((Number) objArr[0]).intValue();
        int i11 = f53926b;
        int i12 = i11 + 84;
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        f53925a = i13 % 128;
        int i14 = iIntValue & 65535;
        if (i13 % 2 != 0) {
            int i15 = i14 * 74;
            int i16 = ((i14 & i15) | (i14 ^ i15)) & 16711935;
            int i17 = i16 * 5;
            int i18 = i16 & i17;
            int i19 = ((i16 | i17) & (~i18)) | i18;
            int i20 = i19 & 252645135;
            int i21 = i19 & 4;
            int i22 = i21 + ((i20 ^ 4) | i21);
            int i23 = ((i22 & i20) | (i20 ^ i22)) & 858993459;
            i10 = i23 | ((i23 << 1) - i23);
        } else {
            int i24 = i14 << 8;
            int i25 = ((i14 & i24) | (i14 ^ i24)) & 16711935;
            int i26 = i25 << 4;
            int i27 = i25 & i26;
            int i28 = (i25 | i26) & (~i27);
            int i29 = ((i28 & i27) | (i28 ^ i27)) & 252645135;
            int i30 = i29 << 2;
            int i31 = ((~i30) & i29) | ((~i29) & i30);
            int i32 = i29 & i30;
            int i33 = ((i32 & i31) | (i31 ^ i32)) & 858993459;
            int i34 = i33 << 1;
            i10 = (i33 & i34) | (i33 ^ i34);
        }
        int i35 = i10 & 1431655765;
        int i36 = i11 + 121;
        f53925a = i36 % 128;
        if (i36 % 2 == 0) {
            return Integer.valueOf(i35);
        }
        int i37 = 74 / 0;
        return Integer.valueOf(i35);
    }

    public static /* synthetic */ Integer c(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Integer) aus.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(iIntValue), 11141290, 7}, -795789696, 795789696, iIntValue)).intValue();
        int iIntValue3 = ((Integer) aus.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(iIntValue2), 52428, 14}, -795789696, 795789696, iIntValue2)).intValue();
        int iIntValue4 = ((Integer) aus.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(iIntValue3), 15728880, 4}, -795789696, 795789696, iIntValue3)).intValue();
        int iIntValue5 = ((Integer) aus.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(iIntValue4), Integer.valueOf(MotionEventCompat.ACTION_POINTER_INDEX_MASK), 8}, -795789696, 795789696, iIntValue4)).intValue();
        int i10 = f53926b;
        int i11 = (i10 & (-70)) | ((~i10) & 69);
        int i12 = (i10 & 69) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53925a = i13 % 128;
        if (i13 % 2 == 0) {
            return Integer.valueOf(iIntValue5);
        }
        int i14 = 32 / 0;
        return Integer.valueOf(iIntValue5);
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        int i16 = ~(i15 | i10 | i12);
        switch (((~(i10 | i15 | (~i12))) * 476) + (i16 * 952) + ((i14 | i16) * (-476)) + (i11 * (-475)) + (i10 * 477)) {
            case 1:
                long jLongValue = ((Number) objArr[0]).longValue();
                long[] jArr = (long[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i17 = f53926b + 85;
                f53925a = i17 % 128;
                int i18 = i17 % 2;
                long jLongValue2 = ((Long) aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(((Long) aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(((Long) aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(((Long) aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(((Long) aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jLongValue), 4294901760L, 16}, 474490917, -474490916, 16)).longValue()), 280375465148160L, 8}, 474490917, -474490916, 8)).longValue()), 67555025218437360L, 4}, 474490917, -474490916, 4)).longValue()), 868082074056920076L, 2}, 474490917, -474490916, 2)).longValue()), 2459565876494606882L, 1}, 474490917, -474490916, 1)).longValue();
                jArr[iIntValue] = jLongValue2 & (-6148914691236517206L);
                int i19 = iIntValue * (-279);
                int i20 = 141 & i19;
                int i21 = ((i19 | 141) & (~i20)) + (i20 << 1);
                int i22 = ~iIntValue;
                int i23 = iIntValue & i22;
                int i24 = i23 | i23;
                int i25 = iIntValue & iIntValue;
                int i26 = -(-(((i24 & i25) | (i24 ^ i25)) * 140));
                int i27 = i21 & i26;
                int i28 = (((i21 | i26) & (~i27)) - (~(i27 << 1))) - 1;
                int i29 = (-2) & iIntValue;
                int i30 = (~i29) & ((-2) | iIntValue);
                int i31 = i30 | i29;
                int i32 = ~i31;
                int i33 = (((~(i23 | (i22 ^ iIntValue))) | ((i31 | i32) & i32)) * (-280)) + i28;
                int i34 = i22 ^ 1;
                int i35 = i22 & 1;
                int i36 = (i34 & i35) | (i34 ^ i35);
                int i37 = ~i36;
                int i38 = (i36 | i37) & i37;
                int i39 = ~((i22 & (i22 | iIntValue)) | 1);
                int i40 = (i38 & i39) | ((~i39) & i38) | ((~i38) & i39);
                int i41 = (i30 ^ i29) | (i29 & i30);
                int i42 = i41 ^ iIntValue;
                int i43 = i41 & iIntValue;
                int i44 = ~((i43 & i42) | (i42 ^ i43));
                int i45 = i40 & i44;
                int i46 = (i40 | i44) & (~i45);
                int i47 = -(-(((i46 & i45) | (i46 ^ i45)) * 140));
                jArr[(i33 ^ i47) + ((i47 & i33) << 1)] = (jLongValue2 << 1) & (-6148914691236517206L);
                int i48 = f53925a;
                int i49 = i48 & 55;
                int i50 = (i48 ^ 55) | i49;
                int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
                f53926b = i51 % 128;
                int i52 = i51 % 2;
                return null;
            case 2:
                long jLongValue3 = ((Number) objArr[0]).longValue();
                int i53 = f53926b;
                int i54 = (i53 & 75) + (i53 | 75);
                f53925a = i54 % 128;
                return Long.valueOf(((Long) (i54 % 2 != 0 ? aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(((Long) aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(((Long) aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(((Long) aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(((Long) aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jLongValue3), 2459565876494606882L, 0}, 474490917, -474490916, 0)).longValue()), 868082074056920076L, 2}, 474490917, -474490916, 2)).longValue()), 67555025218437360L, 3}, 474490917, -474490916, 3)).longValue()), 280375465148160L, 27}, 474490917, -474490916, 27)).longValue()), 4294901760L, 80}, 474490917, -474490916, 80) : aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(((Long) aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(((Long) aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(((Long) aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(((Long) aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jLongValue3), 2459565876494606882L, 1}, 474490917, -474490916, 1)).longValue()), 868082074056920076L, 2}, 474490917, -474490916, 2)).longValue()), 67555025218437360L, 4}, 474490917, -474490916, 4)).longValue()), 280375465148160L, 8}, 474490917, -474490916, 8)).longValue()), 4294901760L, 16}, 474490917, -474490916, 16))).longValue());
            case 3:
                return c(objArr);
            case 4:
                return a(objArr);
            case 5:
                long jLongValue4 = ((Number) objArr[0]).longValue();
                long[] jArr2 = (long[]) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i55 = f53925a;
                int i56 = ((i55 ^ 107) | (i55 & 107)) << 1;
                int i57 = -((i55 & (-108)) | ((~i55) & 107));
                int i58 = (i56 ^ i57) + ((i56 & i57) << 1);
                f53926b = i58 % 128;
                int i59 = i58 % 2;
                long jLongValue5 = ((Long) aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(((Long) aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(((Long) aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(((Long) aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(((Long) aus.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jLongValue4), 4294901760L, 16}, 474490917, -474490916, 16)).longValue()), 280375465148160L, 8}, 474490917, -474490916, 8)).longValue()), 67555025218437360L, 4}, 474490917, -474490916, 4)).longValue()), 868082074056920076L, 2}, 474490917, -474490916, 2)).longValue()), 2459565876494606882L, 1}, 474490917, -474490916, 1)).longValue();
                jArr2[iIntValue2] = jLongValue5 & 6148914691236517205L;
                int i60 = -(~(-(-(iIntValue2 * 111))));
                int i61 = iIntValue2 & iIntValue2;
                int i62 = (~i61) & (iIntValue2 | iIntValue2);
                int i63 = ~iIntValue2;
                int i64 = i62 | i61;
                int i65 = ~i64;
                int i66 = (i64 | i65) & i65;
                int i67 = ((((-2) & i66) | ((-2) & (~i66)) | (i66 & 1)) * (-220)) + ((-2) - (((((-109) | i60) << 1) - (i60 ^ (-109))) ^ (-1)));
                int i68 = iIntValue2 & 1;
                int i69 = (~i68) & (iIntValue2 | 1);
                int i70 = ~((i68 & i69) | (i69 ^ i68));
                int i71 = i61 | (iIntValue2 ^ iIntValue2);
                int i72 = ~i71;
                int i73 = (i71 | i72) & i72;
                int i74 = i70 & i73;
                int i75 = -(-((((i70 | i73) & (~i74)) | i74) * 220));
                int i76 = i67 & i75;
                int i77 = ((i67 ^ i75) | i76) << 1;
                int i78 = -((i75 | i67) & (~i76));
                int i79 = ((i77 | i78) << 1) - (i78 ^ i77);
                int i80 = ((~(((-2) ^ iIntValue2) | ((-2) & iIntValue2))) | (~((i63 ^ 1) | (i63 & 1)))) * 110;
                jArr2[(i79 & i80) + (i80 | i79)] = (jLongValue5 >>> 1) & 6148914691236517205L;
                int i81 = f53925a;
                int i82 = i81 & 43;
                int i83 = ((i81 ^ 43) | i82) << 1;
                int i84 = -((i81 | 43) & (~i82));
                int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                f53926b = i85 % 128;
                int i86 = i85 % 2;
                return null;
            case 6:
                return b(objArr);
            case 7:
                int iIntValue3 = ((Number) objArr[0]).intValue();
                int i87 = f53926b;
                int i88 = i87 & 13;
                int i89 = i87 | 13;
                int i90 = (i88 & i89) + (i89 | i88);
                f53925a = i90 % 128;
                if (i90 % 2 != 0) {
                    int i91 = iIntValue3 & 7302;
                    int i92 = i91 * 4;
                    int i93 = i91 & i92;
                    int i94 = (i91 | i92) & (~i93);
                    int i95 = ((i94 & i93) | (i94 ^ i93)) & 24162;
                    int i96 = i95 * 2;
                    int i97 = i95 & i96;
                    int i98 = (((i95 | i96) & (~i97)) | i97) & 23404;
                    int i99 = i98 >> 1;
                    int i100 = i98 & i99;
                    int i101 = (i98 | i99) & (~i100);
                    i13 = ((i101 & i100) | (i101 ^ i100)) & 12516;
                } else {
                    int i102 = iIntValue3 & 255;
                    int i103 = i102 << 4;
                    int i104 = i102 ^ i103;
                    int i105 = i102 & i103;
                    int i106 = ((i105 & i104) | (i104 ^ i105)) & 3855;
                    int i107 = i106 << 2;
                    int i108 = i106 & i107;
                    int i109 = (((i106 | i107) & (~i108)) | i108) & 13107;
                    int i110 = i109 << 1;
                    i13 = ((i109 & i110) | ((~i110) & i109) | ((~i109) & i110)) & 21845;
                }
                return Integer.valueOf(i13);
            default:
                long[] jArr3 = (long[]) objArr[0];
                int iIntValue4 = ((Number) objArr[1]).intValue();
                long[] jArr4 = (long[]) objArr[2];
                int iIntValue5 = ((Number) objArr[3]).intValue();
                int i111 = f53926b + 71;
                int i112 = i111 % 128;
                f53925a = i112;
                int i113 = i111 % 2;
                int i114 = ((i112 & 34) + (i112 | 34)) - 1;
                f53926b = i114 % 128;
                int i115 = i114 % 2;
                int i116 = 0;
                while (i116 < iIntValue4) {
                    int i117 = f53925a;
                    int i118 = i117 & 45;
                    int i119 = i118 + ((i117 ^ 45) | i118);
                    f53926b = i119 % 128;
                    int i120 = i119 % 2;
                    setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr3[i116]), jArr4, Integer.valueOf(iIntValue5)}, 2124853572, -2124853567, iIntValue5);
                    int i121 = iIntValue5 & 2;
                    int i122 = -(-((iIntValue5 ^ 2) | i121));
                    iIntValue5 = (i122 | i121) + (i121 & i122);
                    int i123 = (i116 & (-100)) + (i116 | (-100));
                    i116 = ((i123 | 101) << 1) - (i123 ^ 101);
                    int i124 = f53926b;
                    int i125 = i124 & 81;
                    int i126 = ((i124 | 81) & (~i125)) + (i125 << 1);
                    f53925a = i126 % 128;
                    int i127 = i126 % 2;
                }
                int i128 = f53926b;
                int i129 = i128 ^ 43;
                int i130 = ((i128 & 43) | i129) << 1;
                int i131 = -i129;
                int i132 = ((i130 | i131) << 1) - (i130 ^ i131);
                f53925a = i132 % 128;
                if (i132 % 2 == 0) {
                    return null;
                }
                throw null;
        }
    }

    public static int setDividerPadding(int i10) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i10)}, -183025508, 183025515, i10)).intValue();
    }

    public static int setOnFocusChangeListener(int i10) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i10)}, 140457422, -140457419, i10)).intValue();
    }

    public static long setX(long j10) {
        return ((Long) setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(j10)}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
    }

    public static void setOnFocusChangeListener(long j10, long[] jArr, int i10) {
        setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(j10), jArr, Integer.valueOf(i10)}, 391891282, -391891281, i10);
    }

    public static int setX(int i10) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i10)}, 1256499076, -1256499070, i10)).intValue();
    }

    public static void setOnFocusChangeListener(long[] jArr, int i10, long[] jArr2, int i11) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, Integer.valueOf(i10), jArr2, Integer.valueOf(i11)}, 1056168849, -1056168849, i10);
    }

    public static long setCompoundDrawableTintBlendMode(int i10) {
        return ((Long) setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i10)}, -1062202087, 1062202091, i10)).longValue();
    }
}
