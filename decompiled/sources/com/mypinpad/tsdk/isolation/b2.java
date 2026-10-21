package com.mypinpad.tsdk.isolation;

import com.vierge.bluetoothlibrary.BluetoothState;

/* JADX INFO: loaded from: classes10.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54249a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54250b = 1;

    public static /* synthetic */ Number a(Object[] objArr, int i10, int i11, int i12) {
        short s4;
        Number numberValueOf;
        long jLongValue;
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~i11;
        int i16 = ((i12 | i14 | (~(i15 | i10))) * 614) + (i11 * (-613)) + (i10 * 615);
        int i17 = ~i12;
        int i18 = (((~(i10 | i17 | i11)) | (~(i13 | i15 | i17))) * 614) + (((~(i13 | i17)) | i14 | (~(i17 | i11))) * (-1228)) + i16;
        if (i18 == 1) {
            short sShortValue = ((Short) objArr[0]).shortValue();
            int iIntValue = ((Number) objArr[1]).intValue();
            int i19 = f54249a;
            int i20 = i19 & 27;
            int i21 = (i20 - (~((i19 ^ 27) | i20))) - 1;
            int i22 = i21 % 128;
            f54250b = i22;
            int i23 = i21 % 2;
            short s7 = (short) (((sShortValue >> 8) & 255) | ((sShortValue & 255) << 8));
            int i24 = (s7 & 3855) << 4;
            int i25 = (s7 & 61680) >> 4;
            int i26 = i24 & i25;
            int i27 = (i25 | i24) & (~i26);
            short s9 = (short) ((i27 & i26) | (i27 ^ i26));
            int i28 = (s9 & 13107) << 2;
            int i29 = (s9 & 52428) >> 2;
            int i30 = i28 & i29;
            int i31 = (i29 | i28) & (~i30);
            short s10 = (short) ((i31 & i30) | (i31 ^ i30));
            int i32 = (s10 & 21845) << 1;
            int i33 = (s10 & 43690) >> 1;
            short s11 = (short) ((i33 & i32) | (i32 ^ i33));
            if (iIntValue == 12) {
                int i34 = ((i19 | 87) << 1) - (i19 ^ 87);
                f54250b = i34 % 128;
                int i35 = i34 % 2;
                s4 = (short) (s11 >> 4);
                int i36 = i19 + 57;
                f54250b = i36 % 128;
                if (i36 % 2 == 0) {
                    throw null;
                }
            } else {
                s4 = (short) (s11 >> 3);
                int i37 = (i22 ^ 37) + ((i22 & 37) << 1);
                f54249a = i37 % 128;
                int i38 = i37 % 2;
            }
            numberValueOf = Short.valueOf(s4);
        } else {
            if (i18 != 2) {
                if (i18 != 3) {
                    if (i18 != 4) {
                        byte[] bArr = (byte[]) objArr[0];
                        int iIntValue2 = ((Number) objArr[1]).intValue();
                        int iIntValue3 = ((Number) objArr[2]).intValue();
                        int i39 = f54250b;
                        int i40 = i39 & 107;
                        int i41 = (i40 - (~(-(-((i39 ^ 107) | i40))))) - 1;
                        f54249a = i41 % 128;
                        int i42 = i41 % 2;
                        short sShortValue2 = (short) (((Short) ber.setDividerPadding(new Object[]{bArr, Integer.valueOf(iIntValue2)}, -969353966, 969353972, iIntValue2)).shortValue() & iIntValue3);
                        int i43 = f54250b;
                        int i44 = (i43 ^ 77) + ((i43 & 77) << 1);
                        f54249a = i44 % 128;
                        if (i44 % 2 == 0) {
                            return Short.valueOf(sShortValue2);
                        }
                        throw null;
                    }
                    byte[] bArr2 = (byte[]) objArr[0];
                    int iIntValue4 = ((Number) objArr[1]).intValue();
                    int i45 = f54250b;
                    int i46 = i45 & 51;
                    int i47 = (i46 - (~(-(-((i45 ^ 51) | i46))))) - 1;
                    f54249a = i47 % 128;
                    if (i47 % 2 != 0) {
                        jLongValue = ((Long) ber.setDividerPadding(new Object[]{bArr2, Integer.valueOf(iIntValue4)}, 1511464331, -1511464319, iIntValue4)).longValue();
                        int i48 = 3 / 0;
                    } else {
                        jLongValue = ((Long) ber.setDividerPadding(new Object[]{bArr2, Integer.valueOf(iIntValue4)}, 1511464331, -1511464319, iIntValue4)).longValue();
                    }
                    int i49 = f54250b;
                    int i50 = i49 ^ 95;
                    int i51 = -(-((i49 & 95) << 1));
                    int i52 = (i50 & i51) + (i51 | i50);
                    f54249a = i52 % 128;
                    int i53 = i52 % 2;
                    return Long.valueOf(jLongValue);
                }
                byte[] bArr3 = (byte[]) objArr[0];
                int iIntValue5 = ((Number) objArr[1]).intValue();
                long jLongValue2 = ((Number) objArr[2]).longValue();
                int i54 = ~iIntValue5;
                int i55 = ~i54;
                bArr3[iIntValue5] = (byte) (jLongValue2 & 255);
                int i56 = iIntValue5 & 1;
                int i57 = (iIntValue5 ^ 1) | i56;
                bArr3[(i56 ^ i57) + ((i56 & i57) << 1)] = (byte) ((jLongValue2 >> 8) & 255);
                int i58 = -(-(iIntValue5 * 367));
                int i59 = 734 & i58;
                int i60 = (((734 ^ i58) | i59) << 1) - ((i58 | 734) & (~i59));
                int i61 = iIntValue5 & 2;
                int i62 = (i61 | ((~i61) & (iIntValue5 | 2))) * (-366);
                int i63 = i60 & i62;
                int i64 = (i62 | i60) & (~i63);
                int i65 = -(-(i63 << 1));
                int i66 = (i64 & i65) + (i64 | i65);
                int i67 = (i54 & i54) | (iIntValue5 & i55);
                int i68 = i54 & iIntValue5;
                int i69 = ~((i67 & i68) | (i67 ^ i68));
                int i70 = ((~i69) & 2) | (i69 & (-3));
                int i71 = i69 & 2;
                int i72 = -(~(((i71 & i70) | (i70 ^ i71)) * (-366)));
                int i73 = (-2) - (((i66 ^ i72) + ((i72 & i66) << 1)) ^ (-1));
                int i74 = ~((-3) | iIntValue5);
                int i75 = (i54 | iIntValue5) & i54;
                int i76 = (i75 ^ 2) | (i75 & 2);
                int i77 = ~((i76 ^ iIntValue5) | (i76 & iIntValue5));
                int i78 = ((~i77) & i74) | ((~i74) & i77);
                int i79 = i74 & i77;
                int i80 = -(~(((i78 & i79) | (i78 ^ i79)) * 366));
                bArr3[((i73 ^ i80) + ((i73 & i80) << 1)) - 1] = (byte) ((jLongValue2 >> 16) & 255);
                bArr3[((iIntValue5 | 3) << 1) - (iIntValue5 ^ 3)] = (byte) ((jLongValue2 >> 24) & 255);
                int i81 = iIntValue5 & 4;
                bArr3[((((iIntValue5 ^ 4) | i81) << 1) - (~(-((~i81) & (iIntValue5 | 4))))) - 1] = (byte) ((jLongValue2 >> 32) & 255);
                int i82 = iIntValue5 & 5;
                int i83 = (iIntValue5 ^ 5) | i82;
                bArr3[(i82 & i83) + (i82 | i83)] = (byte) ((jLongValue2 >> 40) & 255);
                int i84 = iIntValue5 & 6;
                int i85 = -(-((iIntValue5 ^ 6) | i84));
                bArr3[(i84 ^ i85) + ((i84 & i85) << 1)] = (byte) ((jLongValue2 >> 48) & 255);
                int i86 = -(~(iIntValue5 * (-107)));
                int i87 = ((385 | i86) << 1) - (i86 ^ BluetoothState.REQUEST_ENABLE_BT);
                int i88 = (i87 ^ (-1)) + (i87 << 1);
                int i89 = (-8) & iIntValue5;
                int i90 = (~i89) & ((-8) | iIntValue5);
                int i91 = ~((i90 & i89) | (i90 ^ i89));
                int i92 = ~((i75 ^ iIntValue5) | (i75 & iIntValue5));
                int i93 = ((~i92) & i91) | ((~i91) & i92);
                int i94 = i91 & i92;
                int i95 = -(-(((i93 & i94) | (i93 ^ i94)) * (-108)));
                int i96 = i88 & i95;
                int i97 = ((((i88 ^ i95) | i96) << 1) - (~(-((i95 | i88) & (~i96))))) - 1;
                int i98 = (-8) & i54;
                int i99 = (iIntValue5 & 7) | i98 | i89;
                int i100 = ~i99;
                int i101 = (~(i98 | (i55 & 7) | (i54 & 7))) | ((i99 | i100) & i100);
                int i102 = i75 & 7;
                int i103 = (~i102) & (i75 | 7);
                int i104 = (i103 & i102) | (i103 ^ i102);
                int i105 = ~i104;
                int i106 = (i104 | i105) & i105;
                int i107 = ((~i106) & i101) | ((~i101) & i106);
                int i108 = i101 & i106;
                int i109 = -(-(((i108 & i107) | (i107 ^ i108)) * 54));
                int i110 = ((i97 | i109) << 1) - (i109 ^ i97);
                int i111 = ~((i75 & (-8)) | ((~i75) & 7) | i102);
                int i112 = -(-(((iIntValue5 & i111) | (i54 & i111) | ((~i111) & iIntValue5)) * 54));
                bArr3[(((~i112) & i110) | ((~i110) & i112)) + ((i112 & i110) << 1)] = (byte) ((jLongValue2 >> 56) & 255);
                int i113 = f54250b;
                int i114 = i113 & 79;
                int i115 = ((((i113 ^ 79) | i114) << 1) - (~(-((i113 | 79) & (~i114))))) - 1;
                f54249a = i115 % 128;
                if (i115 % 2 != 0) {
                    int i116 = 71 / 0;
                }
                return null;
            }
            byte[] bArr4 = (byte[]) objArr[0];
            int iIntValue6 = ((Number) objArr[1]).intValue();
            int i117 = f54249a;
            int i118 = i117 & 51;
            int i119 = (i117 ^ 51) | i118;
            int i120 = (i118 ^ i119) + ((i119 & i118) << 1);
            f54250b = i120 % 128;
            int i121 = i120 % 2;
            int iIntValue7 = ((Integer) ber.setDividerPadding(new Object[]{bArr4, Integer.valueOf(iIntValue6)}, -40285599, 40285612, iIntValue6)).intValue();
            int i122 = f54250b + 87;
            f54249a = i122 % 128;
            if (i122 % 2 != 0) {
                int i123 = 57 / 0;
            }
            numberValueOf = Integer.valueOf(iIntValue7);
        }
        return numberValueOf;
    }
}
