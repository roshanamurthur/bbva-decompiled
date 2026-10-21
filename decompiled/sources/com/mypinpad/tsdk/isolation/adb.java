package com.mypinpad.tsdk.isolation;

import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class adb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f52452a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52453b = 1;

    public static final int setCompoundDrawableTintBlendMode(@NotNull acr acrVar, int i10) {
        return ((Integer) setY(new Object[]{acrVar, Integer.valueOf(i10)}, 1111134270, -1111134270, i10)).intValue();
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException {
        int i13;
        int i14 = ~i10;
        int i15 = ~((~i12) | i14);
        int i16 = 0;
        if ((((~(i10 | i11 | i12)) | i15) * 338) + ((~(i14 | i11)) * 338) + (((~((~i11) | i10)) | i15 | (~(i10 | i12))) * (-338)) + (i11 * 339) + (i10 * (-337)) != 1) {
            acr acrVar = (acr) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i17 = f52452a;
            int i18 = i17 ^ 115;
            int i19 = ((i17 & 115) | i18) << 1;
            int i20 = -i18;
            int i21 = (i19 & i20) + (i19 | i20);
            f52453b = i21 % 128;
            int i22 = i21 % 2;
            Intrinsics.checkNotNullParameter(acrVar, "");
            int[] iArr = (int[]) acr.setY(new Object[]{acrVar}, 1797316966, -1797316954, System.identityHashCode(acrVar));
            int i23 = ((iIntValue & (-2)) | ((~iIntValue) & 1)) + ((iIntValue & 1) << 1);
            int iIntValue2 = ((Integer) setY(new Object[]{iArr, Integer.valueOf(i23), Integer.valueOf(((byte[][]) acr.setY(new Object[]{acrVar}, 202881993, -202881986, System.identityHashCode(acrVar))).length)}, 1095338637, -1095338636, i23)).intValue();
            if (iIntValue2 >= 0) {
                int i24 = f52453b;
                int i25 = (i24 ^ 17) + ((i24 & 17) << 1);
                int i26 = i25 % 128;
                f52452a = i26;
                int i27 = i25 % 2;
                int i28 = ((i26 & (-8)) | ((~i26) & 7)) + ((i26 & 7) << 1);
                f52453b = i28 % 128;
                if (i28 % 2 == 0) {
                    throw null;
                }
            } else {
                int i29 = ~iIntValue2;
                iIntValue2 = (iIntValue2 | i29) & i29;
                int i30 = f52453b;
                int i31 = i30 & 53;
                int i32 = (i31 - (~((i30 ^ 53) | i31))) - 1;
                f52452a = i32 % 128;
                if (i32 % 2 != 0) {
                    int i33 = 26 / 0;
                }
            }
            return Integer.valueOf(iIntValue2);
        }
        int[] iArr2 = (int[]) objArr[0];
        int iIntValue3 = ((Number) objArr[1]).intValue();
        int iIntValue4 = ((Number) objArr[2]).intValue();
        int i34 = f52453b;
        int i35 = i34 ^ 43;
        int i36 = (i34 & 43) << 1;
        int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
        f52452a = i37 % 128;
        int i38 = -1;
        if (i37 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iArr2, "");
            int i39 = ((iIntValue4 | (-30)) << 1) - (iIntValue4 ^ (-30));
            i13 = (i39 & 76) + (i39 | 76);
        } else {
            Intrinsics.checkNotNullParameter(iArr2, "");
            i13 = iIntValue4 - 1;
        }
        int i40 = f52452a;
        int i41 = (i40 ^ 79) + ((i40 & 79) << 1);
        f52453b = i41 % 128;
        int i42 = i41 % 2;
        while (i16 <= i13) {
            int i43 = f52452a;
            int i44 = (-2) - ((i43 + 48) ^ i38);
            int i45 = i44 % 128;
            f52453b = i45;
            int i46 = i44 % 2;
            int i47 = i13 * 592;
            int i48 = -(~(i16 * (-590)));
            int i49 = (((i47 | i48) << 1) - (i47 ^ i48)) - 1;
            int i50 = ~i13;
            int i51 = (i50 | i13) & i50;
            int i52 = i51 & i16;
            int i53 = (i51 | i16) & (~i52);
            int i54 = ~i16;
            int i55 = -(-((~((i53 ^ i52) | (i53 & i52))) * (-1182)));
            int i56 = i49 & i55;
            int i57 = (i56 - (~((i55 ^ i49) | i56))) - 1;
            int i58 = (i50 ^ i54) | (i50 & i54);
            int i59 = ~iIntValue3;
            int i60 = ((~i59) & i58) | ((~i58) & i59) | (i58 & i59);
            int i61 = ~i60;
            int i62 = (i60 | i61) & i61;
            int i63 = (i13 & i54) | (i16 & i50);
            int i64 = i13 & i16;
            int i65 = ~((i63 ^ i64) | (i63 & i64));
            int i66 = ((~i62) & i65) | ((~i65) & i62);
            int i67 = i62 & i65;
            int i68 = -(-(((i67 & i66) | (i66 ^ i67)) * (-591)));
            int i69 = ((((i57 ^ i68) | (i57 & i68)) << 1) - (~(-((i68 & (~i57)) | ((~i68) & i57))))) - 1;
            int i70 = (iIntValue3 ^ i50) | (iIntValue3 & i50);
            int i71 = -(-(((i70 & i54) | ((~i54) & i70) | ((~i70) & i54)) * 591));
            int i72 = (((((i69 ^ i71) | (i69 & i71)) << 1) - (~(-((i71 & (~i69)) | ((~i71) & i69))))) - 1) >>> 1;
            int i73 = iArr2[i72];
            if (i73 < iIntValue3) {
                int i74 = i43 & 79;
                int i75 = -(-((i43 ^ 79) | i74));
                int i76 = (i74 ^ i75) + ((i74 & i75) << 1);
                int i77 = i76 % 128;
                f52453b = i77;
                int i78 = i76 % 2;
                int i79 = i72 * (-987);
                int i80 = (989 ^ i79) + ((i79 & 989) << 1);
                int i81 = ~i72;
                int i82 = (i81 | i72) & i81;
                int i83 = (i59 | iIntValue3) & i59;
                int i84 = ~i83;
                int i85 = (i82 & i84) | ((~i82) & i83);
                int i86 = i82 & i83;
                int i87 = (i85 & i86) | (i85 ^ i86);
                int i88 = (i87 & (-2)) | ((~i87) & 1);
                int i89 = i87 & 1;
                int i90 = ~((i89 & i88) | (i88 ^ i89));
                int i91 = i72 & 1;
                int i92 = (~i91) & (i72 | 1);
                int i93 = ~((i92 ^ i91) | (i91 & i92) | iIntValue3);
                int i94 = i90 ^ i93;
                int i95 = i90 & i93;
                int i96 = ((i95 & i94) | (i94 ^ i95)) * 988;
                int i97 = (((i80 & i96) + (i80 | i96)) - (~(((i82 & 1) | (i82 ^ 1)) * (-988)))) - 1;
                int i98 = ~i81;
                int i99 = ((-2) & i81) | ((-2) & i98) | (i81 & 1);
                int i100 = ~i99;
                int i101 = (i99 | i100) & i100;
                int i102 = (i98 & iIntValue3) | (i81 & i59);
                int i103 = i81 & iIntValue3;
                int i104 = ~((i103 & i102) | (i102 ^ i103));
                int i105 = ((~i104) & i101) | ((~i101) & i104);
                int i106 = i104 & i101;
                int i107 = (i106 & i105) | (i105 ^ i106);
                int i108 = (i83 & (-2)) | (i84 & 1);
                int i109 = i83 & 1;
                int i110 = (i108 & i109) | (i108 ^ i109);
                int i111 = i110 ^ i72;
                int i112 = i72 & i110;
                int i113 = (i112 & i111) | (i111 ^ i112);
                int i114 = ~i113;
                int i115 = (i113 | i114) & i114;
                int i116 = -(-(((i115 & i107) | ((~i115) & i107) | ((~i107) & i115)) * 988));
                int i117 = i97 & i116;
                i16 = ((((i97 ^ i116) | i117) << 1) - (~(-((i116 | i97) & (~i117))))) - 1;
                int i118 = (i77 & 121) + (i77 | 121);
                f52452a = i118 % 128;
                int i119 = i118 % 2;
            } else {
                if (i73 <= iIntValue3) {
                    int i120 = i45 & 85;
                    int i121 = (~i120) & (i45 | 85);
                    int i122 = i120 << 1;
                    int i123 = (i121 ^ i122) + ((i122 & i121) << 1);
                    f52452a = i123 % 128;
                    int i124 = i123 % 2;
                    return Integer.valueOf(i72);
                }
                int i125 = (i43 ^ 66) + ((i43 & 66) << 1);
                int i126 = (i125 ^ (-1)) + (i125 << 1);
                f52453b = i126 % 128;
                int i127 = i126 % 2;
                i13 = i72 - 1;
                int i128 = i43 & 105;
                int i129 = -(-((i43 ^ 105) | i128));
                int i130 = (i128 ^ i129) + ((i128 & i129) << 1);
                f52453b = i130 % 128;
                int i131 = i130 % 2;
            }
            i38 = -1;
        }
        int i132 = -i16;
        int i133 = -(-(i132 * 339));
        int i134 = 337 ^ i133;
        int i135 = (i133 & 337) << 1;
        int i136 = ((i134 | i135) << 1) - (i135 ^ i134);
        int i137 = ~iIntValue3;
        int i138 = ~i137;
        int i139 = ~i132;
        int i140 = (i139 | i132) & i139;
        int i141 = ~i140;
        int i142 = ~((i141 & i140) | (i141 ^ i140));
        int i143 = ((~i142) & i138) | ((~i138) & i142);
        int i144 = i138 & i142;
        int i145 = (i144 & i143) | (i143 ^ i144);
        int i146 = (-1) ^ iIntValue3;
        int i147 = (i146 ^ iIntValue3) | (i146 & iIntValue3);
        int i148 = ~i147;
        int i149 = (i147 | i148) & i148;
        int i150 = i145 & i149;
        int i151 = (i145 | i149) & (~i150);
        int i152 = -(~(((i151 & i150) | (i151 ^ i150)) * (-338)));
        int i153 = (((-2) - ((-1) ^ ((i136 & i152) + (i136 | i152)))) - (~(-(~(i140 * 338))))) - 2;
        int i154 = ~(i137 & (i137 | iIntValue3));
        int i155 = (i132 & i139) | (i139 ^ i132);
        int i156 = i155 & iIntValue3;
        int i157 = (i155 | iIntValue3) & (~i156);
        int i158 = (i157 & i156) | (i157 ^ i156);
        int i159 = ~i158;
        int i160 = (i158 | i159) & i159;
        int i161 = i154 & i160;
        int i162 = (i160 | i154) & (~i161);
        int i163 = ((i162 & i161) | (i162 ^ i161)) * 338;
        int i164 = i153 & i163;
        int i165 = (i163 | i153) & (~i164);
        int i166 = -(-(i164 << 1));
        int i167 = (i165 & i166) + (i165 | i166);
        int i168 = f52452a;
        int i169 = i168 & 125;
        int i170 = (i168 ^ 125) | i169;
        int i171 = ((i169 | i170) << 1) - (i170 ^ i169);
        f52453b = i171 % 128;
        if (i171 % 2 != 0) {
            return Integer.valueOf(i167);
        }
        throw null;
    }
}
