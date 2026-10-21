package com.mypinpad.tsdk.isolation;

import androidx.appcompat.widget.o1;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@JvmName(name = "Utf8")
public final class acu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f52427a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52428b = 1;

    /* JADX WARN: Code duplicated, block: B:26:0x012f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0131  */
    /* JADX WARN: Code duplicated, block: B:37:0x016a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0181  */
    /* JADX WARN: Code duplicated, block: B:40:0x0185  */
    /* JADX WARN: Code duplicated, block: B:42:0x0230  */
    /* JADX WARN: Code duplicated, block: B:43:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x02de  */
    /* JADX WARN: Code duplicated, block: B:48:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x030a  */
    /* JADX WARN: Code duplicated, block: B:51:0x030d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0148 A[SYNTHETIC] */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        char cCharAt;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j10;
        int i20;
        int i21;
        int i22;
        char cCharAt2;
        int i23;
        int i24;
        int i25 = (~i10) | (~i12);
        int i26 = ((i10 | (~(i11 | i12))) * 519) + (((~(i25 | i11)) | (~(i10 | i11 | i12))) * (-519)) + (((~i25) | i11) * 519) + (i11 * (-518)) + (i10 * (-518));
        int i27 = 2;
        int i28 = 1;
        if (i26 != 1) {
            String str = (String) objArr[0];
            int i29 = f52428b;
            int i30 = (((i29 ^ 69) | (i29 & 69)) << 1) - (((~i29) & 69) | (i29 & (-70)));
            f52427a = i30 % 128;
            int i31 = i30 % 2;
            long jLongValue = ((Long) setX(new Object[]{str, 0, Integer.valueOf(str.length())}, 64090556, -64090555, 0)).longValue();
            int i32 = f52428b + 119;
            f52427a = i32 % 128;
            int i33 = i32 % 2;
            return Long.valueOf(jLongValue);
        }
        String str2 = (String) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i34 = f52428b;
        int i35 = i34 & 83;
        int i36 = (i34 ^ 83) | i35;
        int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
        f52427a = i37 % 128;
        int i38 = i37 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        if (iIntValue2 < 0) {
            int i39 = f52427a;
            int i40 = i39 & 23;
            int i41 = (i39 ^ 23) | i40;
            int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
            f52428b = i42 % 128;
            int i43 = i42 % 2;
            StringBuilder sb2 = new StringBuilder("endIndex < beginIndex: ");
            sb2.append(iIntValue2);
            sb2.append(" < 0");
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        int i44 = f52427a;
        int i45 = (i44 & 47) + (i44 | 47);
        f52428b = i45 % 128;
        int i46 = i45 % 2;
        int i47 = i44 & 53;
        int i48 = ((i44 | 53) & (~i47)) + (i47 << 1);
        f52428b = i48 % 128;
        int i49 = i48 % 2;
        if (iIntValue2 <= str2.length()) {
            int i50 = f52427a;
            int i51 = i50 + 45;
            f52428b = i51 % 128;
            boolean z10 = i51 % 2 != 0;
            int i52 = i50 + 73;
            int i53 = i52 % 128;
            f52428b = i53;
            int i54 = i52 % 2;
            if (z10) {
                int i55 = (((i53 & (-84)) | ((~i53) & 83)) - (~((i53 & 83) << 1))) - 1;
                f52427a = i55 % 128;
                int i56 = i55 % 2;
                long j11 = 0;
                int i57 = 0;
                while (i57 < iIntValue2) {
                    int i58 = f52427a;
                    int i59 = i58 & 47;
                    int i60 = -(-((i58 ^ 47) | i59));
                    int i61 = ((i59 | i60) << i28) - (i60 ^ i59);
                    f52428b = i61 % 128;
                    if (i61 % i27 == 0) {
                        cCharAt = str2.charAt(i57);
                        if (cCharAt < 32480) {
                            int i62 = f52428b;
                            i24 = ((((i62 ^ 75) | (i62 & 75)) << i28) - (~(-((i62 & (-76)) | ((~i62) & 75))))) - i28;
                            f52427a = i24 % 128;
                            if (i24 % i27 != 0) {
                                j11 |= 1;
                            } else {
                                j11++;
                                i57++;
                            }
                            int i63 = i62 & 45;
                            int i64 = (i62 ^ 45) | i63;
                            int i65 = ((i63 | i64) << i28) - (i63 ^ i64);
                            f52427a = i65 % 128;
                            int i66 = i65 % i27;
                        } else if (cCharAt < 2048) {
                            int i67 = f52428b;
                            int i68 = i67 ^ 47;
                            int i69 = (i67 & 47) << i28;
                            i13 = ((i68 | i69) << i28) - (i69 ^ i68);
                            f52427a = i13 % 128;
                            if (i13 % i27 != 0) {
                                j11 %= 2;
                                i57 >>>= 1;
                            } else {
                                j11 += 2;
                                i57++;
                            }
                        } else {
                            if (cCharAt >= 55296) {
                                i14 = f52428b;
                                int i70 = i14 & 97;
                                int i71 = (~i70) & (i14 | 97);
                                int i72 = i70 << i28;
                                int i73 = (i71 & i72) + (i72 | i71);
                                i15 = i73 % 128;
                                f52427a = i15;
                                int i74 = i73 % i27;
                                if (cCharAt > 57343) {
                                    j11 += 3;
                                    int i75 = ((i57 ^ 1) | (i57 & 1)) << 1;
                                    int i76 = -((i57 & (-2)) | ((~i57) & 1));
                                    i57 = (i75 ^ i76) + ((i75 & i76) << 1);
                                    int i77 = f52427a;
                                    int i78 = i77 & 43;
                                    int i79 = -(-((i77 ^ 43) | i78));
                                    int i80 = (i78 ^ i79) + ((i79 & i78) << 1);
                                    f52428b = i80 % 128;
                                    int i81 = i80 % 2;
                                } else {
                                    int i82 = -(-(i57 * (-183)));
                                    int i83 = (-183) ^ i82;
                                    int i84 = (((-183) & i82) | i83) << i28;
                                    int i85 = -i83;
                                    int i86 = (i84 ^ i85) + ((i85 & i84) << i28);
                                    i16 = ~iIntValue;
                                    int i87 = ((-2) ^ i16) | ((-2) & i16);
                                    i17 = ~i57;
                                    int i88 = (i87 & i17) | ((~i87) & i57);
                                    int i89 = i87 & i57;
                                    int i90 = ~((i88 ^ i89) | (i89 & i88));
                                    int i91 = (i16 | iIntValue) & i16;
                                    int i92 = (i17 ^ i91) | (i17 & i91);
                                    int i93 = i92 & 1;
                                    int i94 = (~i93) & (i92 | 1);
                                    int i95 = ~((i94 ^ i93) | (i93 & i94));
                                    int i96 = -(-(((i95 & i90) | (i90 ^ i95)) * (-184)));
                                    int i97 = i86 ^ i96;
                                    int i98 = (((i86 & i96) | i97) << i28) - i97;
                                    i18 = (i17 | i57) & i17;
                                    int i99 = ((-2) & (~i18)) | (i18 & 1);
                                    i19 = (-2) & i18;
                                    int i100 = ~((i99 ^ i19) | (i99 & i19));
                                    int i101 = ~(((-2) ^ i91) | ((-2) & i91));
                                    j10 = j11;
                                    int i102 = ((~i101) & i100) | ((~i100) & i101);
                                    int i103 = i100 & i101;
                                    int i104 = (i102 & i103) | (i102 ^ i103);
                                    int i105 = i17 ^ i16;
                                    int i106 = i17 & i16;
                                    int i107 = ~((i105 & i106) | (i105 ^ i106));
                                    int i108 = -(-(((i104 & i107) | ((~i107) & i104) | ((~i104) & i107)) * 184));
                                    int i109 = i98 ^ i108;
                                    int i110 = ((i98 & i108) | i109) << 1;
                                    int i111 = -i109;
                                    int i112 = (i110 ^ i111) + ((i110 & i111) << 1);
                                    i20 = (i57 ^ 1) | (i57 & 1);
                                    int i113 = i20 * 184;
                                    int i114 = i112 ^ i113;
                                    i21 = ((i113 & i112) | i114) << 1;
                                    i22 = -i114;
                                    if ((i21 ^ i22) + ((i21 & i22) << 1) < iIntValue2) {
                                        int i115 = (i15 ^ 59) + ((i15 & 59) << 1);
                                        f52428b = i115 % 128;
                                        int i116 = i115 % 2;
                                        int i117 = -(-(i57 * (-195)));
                                        int i118 = (-391) & i117;
                                        int i119 = -(-((i117 ^ (-391)) | i118));
                                        int i120 = ((i118 | i119) << 1) - (i119 ^ i118);
                                        int i121 = i17 & 1;
                                        int i122 = (~i121) & (i17 | 1);
                                        int i123 = ~((i121 & i122) | (i122 ^ i121));
                                        int i124 = i57 & iIntValue;
                                        int i125 = (~i124) & (i57 | iIntValue);
                                        int i126 = ~((i125 & i124) | (i125 ^ i124));
                                        int i127 = i123 & i126;
                                        int i128 = (i123 | i126) & (~i127);
                                        int i129 = (i120 - (~(-(~(-(-(((i128 & i127) | (i128 ^ i127)) * (-196)))))))) - 1;
                                        int i130 = (((i129 ^ (-1)) + (i129 << 1)) - (~(-(-(i20 * 392))))) - 1;
                                        int i131 = (~i19) & ((-2) | i18);
                                        int i132 = ~((i19 & i131) | (i131 ^ i19));
                                        int i133 = (i57 & i16) | (iIntValue & i17);
                                        int i134 = (i133 & i124) | (i133 ^ i124);
                                        int i135 = ~i134;
                                        int i136 = (i134 | i135) & i135;
                                        int i137 = ((~i136) & i132) | ((~i132) & i136);
                                        int i138 = i132 & i136;
                                        int i139 = -(-(((i138 & i137) | (i137 ^ i138)) * 196));
                                        cCharAt2 = str2.charAt(((i130 | i139) << 1) - (i139 ^ i130));
                                        int i140 = f52427a;
                                        int i141 = i140 & 7;
                                        int i142 = (i140 | 7) & (~i141);
                                        int i143 = -(-(i141 << 1));
                                        int i144 = (i142 ^ i143) + ((i142 & i143) << 1);
                                        f52428b = i144 % 128;
                                        int i145 = i144 % 2;
                                    } else {
                                        int i146 = i14 ^ 59;
                                        int i147 = ((((i14 & 59) | i146) << 1) - (~(-i146))) - 1;
                                        f52427a = i147 % 128;
                                        int i148 = i147 % 2;
                                        cCharAt2 = 0;
                                    }
                                    if (cCharAt <= 56319) {
                                        int i149 = f52427a;
                                        int i150 = (i149 ^ 125) + ((i149 & 125) << 1);
                                        i23 = i150 % 128;
                                        f52428b = i23;
                                        int i151 = i150 % 2;
                                        if (cCharAt2 >= 56320) {
                                            int i152 = i23 ^ 57;
                                            int i153 = ((i23 & 57) | i152) << 1;
                                            int i154 = -i152;
                                            int i155 = (i153 ^ i154) + ((i154 & i153) << 1);
                                            f52427a = i155 % 128;
                                            int i156 = i155 % 2;
                                            if (cCharAt2 > 57343) {
                                                j11 = j10 + 1;
                                                int i157 = (i57 * (-55)) - 55;
                                                int i158 = (i16 & 1) | (iIntValue & (-2));
                                                int i159 = iIntValue & 1;
                                                int i160 = ~((i158 & i159) | (i158 ^ i159));
                                                int i161 = -(-(((i160 & i57) | (i57 ^ i160)) * 56));
                                                int i162 = i157 & i161;
                                                int i163 = i157 | i161;
                                                int i164 = (i162 & i163) + (i163 | i162);
                                                int i165 = -(-((~i20) * (-56)));
                                                int i166 = ((i164 | i165) << 1) - (i165 ^ i164);
                                                int i167 = i16 | i57;
                                                int i168 = ~i167;
                                                int i169 = (i167 | i168) & i168;
                                                int i170 = ((i169 & 1) | (i169 ^ 1)) * 56;
                                                int i171 = (i166 | i170) << 1;
                                                int i172 = -((i170 & (~i166)) | ((~i170) & i166));
                                                i57 = ((i171 | i172) << 1) - (i172 ^ i171);
                                                int i173 = f52427a;
                                                int i174 = i173 & 63;
                                                int i175 = (((i173 | 63) & (~i174)) - (~(-(-(i174 << 1))))) - 1;
                                                f52428b = i175 % 128;
                                                int i176 = i175 % 2;
                                            } else {
                                                int i177 = ((i57 | 35) << 1) - (i57 ^ 35);
                                                i57 = (i177 & (-33)) + (i177 | (-33));
                                                int i178 = (i23 & 31) + (i23 | 31);
                                                f52427a = i178 % 128;
                                                int i179 = i178 % 2;
                                                j11 = j10 + 4;
                                            }
                                        } else {
                                            j11 = j10 + 1;
                                            int i1510 = (i57 * (-55)) - 55;
                                            int i1511 = (i16 & 1) | (iIntValue & (-2));
                                            int i1512 = iIntValue & 1;
                                            int i1610 = ~((i1511 & i1512) | (i1511 ^ i1512));
                                            int i1611 = -(-(((i1610 & i57) | (i57 ^ i1610)) * 56));
                                            int i1612 = i1510 & i1611;
                                            int i1613 = i1510 | i1611;
                                            int i1614 = (i1612 & i1613) + (i1613 | i1612);
                                            int i1615 = -(-((~i20) * (-56)));
                                            int i1616 = ((i1614 | i1615) << 1) - (i1615 ^ i1614);
                                            int i1617 = i16 | i57;
                                            int i1618 = ~i1617;
                                            int i1619 = (i1617 | i1618) & i1618;
                                            int i1710 = ((i1619 & 1) | (i1619 ^ 1)) * 56;
                                            int i1711 = (i1616 | i1710) << 1;
                                            int i1712 = -((i1710 & (~i1616)) | ((~i1710) & i1616));
                                            i57 = ((i1711 | i1712) << 1) - (i1712 ^ i1711);
                                            int i1713 = f52427a;
                                            int i1714 = i1713 & 63;
                                            int i1715 = (((i1713 | 63) & (~i1714)) - (~(-(-(i1714 << 1))))) - 1;
                                            f52428b = i1715 % 128;
                                            int i1716 = i1715 % 2;
                                        }
                                    } else {
                                        j11 = j10 + 1;
                                        int i1513 = (i57 * (-55)) - 55;
                                        int i1514 = (i16 & 1) | (iIntValue & (-2));
                                        int i1515 = iIntValue & 1;
                                        int i16110 = ~((i1514 & i1515) | (i1514 ^ i1515));
                                        int i16111 = -(-(((i16110 & i57) | (i57 ^ i16110)) * 56));
                                        int i16112 = i1513 & i16111;
                                        int i16113 = i1513 | i16111;
                                        int i16114 = (i16112 & i16113) + (i16113 | i16112);
                                        int i16115 = -(-((~i20) * (-56)));
                                        int i16116 = ((i16114 | i16115) << 1) - (i16115 ^ i16114);
                                        int i16117 = i16 | i57;
                                        int i16118 = ~i16117;
                                        int i16119 = (i16117 | i16118) & i16118;
                                        int i1717 = ((i16119 & 1) | (i16119 ^ 1)) * 56;
                                        int i1718 = (i16116 | i1717) << 1;
                                        int i1719 = -((i1717 & (~i16116)) | ((~i1717) & i16116));
                                        i57 = ((i1718 | i1719) << 1) - (i1719 ^ i1718);
                                        int i17110 = f52427a;
                                        int i17111 = i17110 & 63;
                                        int i17112 = (((i17110 | 63) & (~i17111)) - (~(-(-(i17111 << 1))))) - 1;
                                        f52428b = i17112 % 128;
                                        int i17113 = i17112 % 2;
                                    }
                                }
                            } else {
                                j11 += 3;
                                int i710 = ((i57 ^ 1) | (i57 & 1)) << 1;
                                int i711 = -((i57 & (-2)) | ((~i57) & 1));
                                i57 = (i710 ^ i711) + ((i710 & i711) << 1);
                                int i712 = f52427a;
                                int i713 = i712 & 43;
                                int i714 = -(-((i712 ^ 43) | i713));
                                int i810 = (i713 ^ i714) + ((i714 & i713) << 1);
                                f52428b = i810 % 128;
                                int i811 = i810 % 2;
                            }
                            i27 = 2;
                            i28 = 1;
                        }
                    } else {
                        cCharAt = str2.charAt(i57);
                        if (cCharAt < 128) {
                            int i610 = f52428b;
                            i24 = ((((i610 ^ 75) | (i610 & 75)) << i28) - (~(-((i610 & (-76)) | ((~i610) & 75))))) - i28;
                            f52427a = i24 % 128;
                            if (i24 % i27 != 0) {
                                j11 |= 1;
                            } else {
                                j11++;
                                i57++;
                            }
                            int i611 = i610 & 45;
                            int i612 = (i610 ^ 45) | i611;
                            int i613 = ((i611 | i612) << i28) - (i611 ^ i612);
                            f52427a = i613 % 128;
                            int i614 = i613 % i27;
                        } else if (cCharAt < 2048) {
                            int i615 = f52428b;
                            int i616 = i615 ^ 47;
                            int i617 = (i615 & 47) << i28;
                            i13 = ((i616 | i617) << i28) - (i617 ^ i616);
                            f52427a = i13 % 128;
                            if (i13 % i27 != 0) {
                                j11 %= 2;
                                i57 >>>= 1;
                            } else {
                                j11 += 2;
                                i57++;
                            }
                        } else {
                            if (cCharAt >= 55296) {
                                i14 = f52428b;
                                int i715 = i14 & 97;
                                int i716 = (~i715) & (i14 | 97);
                                int i717 = i715 << i28;
                                int i718 = (i716 & i717) + (i717 | i716);
                                i15 = i718 % 128;
                                f52427a = i15;
                                int i719 = i718 % i27;
                                if (cCharAt > 57343) {
                                    j11 += 3;
                                    int i7110 = ((i57 ^ 1) | (i57 & 1)) << 1;
                                    int i7111 = -((i57 & (-2)) | ((~i57) & 1));
                                    i57 = (i7110 ^ i7111) + ((i7110 & i7111) << 1);
                                    int i7112 = f52427a;
                                    int i7113 = i7112 & 43;
                                    int i7114 = -(-((i7112 ^ 43) | i7113));
                                    int i812 = (i7113 ^ i7114) + ((i7114 & i7113) << 1);
                                    f52428b = i812 % 128;
                                    int i813 = i812 % 2;
                                } else {
                                    int i814 = -(-(i57 * (-183)));
                                    int i815 = (-183) ^ i814;
                                    int i816 = (((-183) & i814) | i815) << i28;
                                    int i817 = -i815;
                                    int i818 = (i816 ^ i817) + ((i817 & i816) << i28);
                                    i16 = ~iIntValue;
                                    int i819 = ((-2) ^ i16) | ((-2) & i16);
                                    i17 = ~i57;
                                    int i820 = (i819 & i17) | ((~i819) & i57);
                                    int i821 = i819 & i57;
                                    int i910 = ~((i820 ^ i821) | (i821 & i820));
                                    int i911 = (i16 | iIntValue) & i16;
                                    int i912 = (i17 ^ i911) | (i17 & i911);
                                    int i913 = i912 & 1;
                                    int i914 = (~i913) & (i912 | 1);
                                    int i915 = ~((i914 ^ i913) | (i913 & i914));
                                    int i916 = -(-(((i915 & i910) | (i910 ^ i915)) * (-184)));
                                    int i917 = i818 ^ i916;
                                    int i918 = (((i818 & i916) | i917) << i28) - i917;
                                    i18 = (i17 | i57) & i17;
                                    int i919 = ((-2) & (~i18)) | (i18 & 1);
                                    i19 = (-2) & i18;
                                    int i1010 = ~((i919 ^ i19) | (i919 & i19));
                                    int i1011 = ~(((-2) ^ i911) | ((-2) & i911));
                                    j10 = j11;
                                    int i1012 = ((~i1011) & i1010) | ((~i1010) & i1011);
                                    int i1013 = i1010 & i1011;
                                    int i1014 = (i1012 & i1013) | (i1012 ^ i1013);
                                    int i1015 = i17 ^ i16;
                                    int i1016 = i17 & i16;
                                    int i1017 = ~((i1015 & i1016) | (i1015 ^ i1016));
                                    int i1018 = -(-(((i1014 & i1017) | ((~i1017) & i1014) | ((~i1014) & i1017)) * 184));
                                    int i1019 = i918 ^ i1018;
                                    int i1110 = ((i918 & i1018) | i1019) << 1;
                                    int i1111 = -i1019;
                                    int i1112 = (i1110 ^ i1111) + ((i1110 & i1111) << 1);
                                    i20 = (i57 ^ 1) | (i57 & 1);
                                    int i1113 = i20 * 184;
                                    int i1114 = i1112 ^ i1113;
                                    i21 = ((i1113 & i1112) | i1114) << 1;
                                    i22 = -i1114;
                                    if ((i21 ^ i22) + ((i21 & i22) << 1) < iIntValue2) {
                                        int i1115 = (i15 ^ 59) + ((i15 & 59) << 1);
                                        f52428b = i1115 % 128;
                                        int i1116 = i1115 % 2;
                                        int i1117 = -(-(i57 * (-195)));
                                        int i1118 = (-391) & i1117;
                                        int i1119 = -(-((i1117 ^ (-391)) | i1118));
                                        int i1210 = ((i1118 | i1119) << 1) - (i1119 ^ i1118);
                                        int i1211 = i17 & 1;
                                        int i1212 = (~i1211) & (i17 | 1);
                                        int i1213 = ~((i1211 & i1212) | (i1212 ^ i1211));
                                        int i1214 = i57 & iIntValue;
                                        int i1215 = (~i1214) & (i57 | iIntValue);
                                        int i1216 = ~((i1215 & i1214) | (i1215 ^ i1214));
                                        int i1217 = i1213 & i1216;
                                        int i1218 = (i1213 | i1216) & (~i1217);
                                        int i1219 = (i1210 - (~(-(~(-(-(((i1218 & i1217) | (i1218 ^ i1217)) * (-196)))))))) - 1;
                                        int i1310 = (((i1219 ^ (-1)) + (i1219 << 1)) - (~(-(-(i20 * 392))))) - 1;
                                        int i1311 = (~i19) & ((-2) | i18);
                                        int i1312 = ~((i19 & i1311) | (i1311 ^ i19));
                                        int i1313 = (i57 & i16) | (iIntValue & i17);
                                        int i1314 = (i1313 & i1214) | (i1313 ^ i1214);
                                        int i1315 = ~i1314;
                                        int i1316 = (i1314 | i1315) & i1315;
                                        int i1317 = ((~i1316) & i1312) | ((~i1312) & i1316);
                                        int i1318 = i1312 & i1316;
                                        int i1319 = -(-(((i1318 & i1317) | (i1317 ^ i1318)) * 196));
                                        cCharAt2 = str2.charAt(((i1310 | i1319) << 1) - (i1319 ^ i1310));
                                        int i1410 = f52427a;
                                        int i1411 = i1410 & 7;
                                        int i1412 = (i1410 | 7) & (~i1411);
                                        int i1413 = -(-(i1411 << 1));
                                        int i1414 = (i1412 ^ i1413) + ((i1412 & i1413) << 1);
                                        f52428b = i1414 % 128;
                                        int i1415 = i1414 % 2;
                                    } else {
                                        int i1416 = i14 ^ 59;
                                        int i1417 = ((((i14 & 59) | i1416) << 1) - (~(-i1416))) - 1;
                                        f52427a = i1417 % 128;
                                        int i1418 = i1417 % 2;
                                        cCharAt2 = 0;
                                    }
                                    if (cCharAt <= 56319) {
                                        int i1419 = f52427a;
                                        int i1516 = (i1419 ^ 125) + ((i1419 & 125) << 1);
                                        i23 = i1516 % 128;
                                        f52428b = i23;
                                        int i1517 = i1516 % 2;
                                        if (cCharAt2 >= 56320) {
                                            int i1518 = i23 ^ 57;
                                            int i1519 = ((i23 & 57) | i1518) << 1;
                                            int i1520 = -i1518;
                                            int i1521 = (i1519 ^ i1520) + ((i1520 & i1519) << 1);
                                            f52427a = i1521 % 128;
                                            int i1522 = i1521 % 2;
                                            if (cCharAt2 > 57343) {
                                                j11 = j10 + 1;
                                                int i15110 = (i57 * (-55)) - 55;
                                                int i15111 = (i16 & 1) | (iIntValue & (-2));
                                                int i15112 = iIntValue & 1;
                                                int i161110 = ~((i15111 & i15112) | (i15111 ^ i15112));
                                                int i161111 = -(-(((i161110 & i57) | (i57 ^ i161110)) * 56));
                                                int i161112 = i15110 & i161111;
                                                int i161113 = i15110 | i161111;
                                                int i161114 = (i161112 & i161113) + (i161113 | i161112);
                                                int i161115 = -(-((~i20) * (-56)));
                                                int i161116 = ((i161114 | i161115) << 1) - (i161115 ^ i161114);
                                                int i161117 = i16 | i57;
                                                int i161118 = ~i161117;
                                                int i161119 = (i161117 | i161118) & i161118;
                                                int i17114 = ((i161119 & 1) | (i161119 ^ 1)) * 56;
                                                int i17115 = (i161116 | i17114) << 1;
                                                int i17116 = -((i17114 & (~i161116)) | ((~i17114) & i161116));
                                                i57 = ((i17115 | i17116) << 1) - (i17116 ^ i17115);
                                                int i17117 = f52427a;
                                                int i17118 = i17117 & 63;
                                                int i17119 = (((i17117 | 63) & (~i17118)) - (~(-(-(i17118 << 1))))) - 1;
                                                f52428b = i17119 % 128;
                                                int i171110 = i17119 % 2;
                                            } else {
                                                int i1720 = ((i57 | 35) << 1) - (i57 ^ 35);
                                                i57 = (i1720 & (-33)) + (i1720 | (-33));
                                                int i1721 = (i23 & 31) + (i23 | 31);
                                                f52427a = i1721 % 128;
                                                int i1722 = i1721 % 2;
                                                j11 = j10 + 4;
                                            }
                                        } else {
                                            j11 = j10 + 1;
                                            int i15113 = (i57 * (-55)) - 55;
                                            int i15114 = (i16 & 1) | (iIntValue & (-2));
                                            int i15115 = iIntValue & 1;
                                            int i1611110 = ~((i15114 & i15115) | (i15114 ^ i15115));
                                            int i1611111 = -(-(((i1611110 & i57) | (i57 ^ i1611110)) * 56));
                                            int i1611112 = i15113 & i1611111;
                                            int i1611113 = i15113 | i1611111;
                                            int i1611114 = (i1611112 & i1611113) + (i1611113 | i1611112);
                                            int i1611115 = -(-((~i20) * (-56)));
                                            int i1611116 = ((i1611114 | i1611115) << 1) - (i1611115 ^ i1611114);
                                            int i1611117 = i16 | i57;
                                            int i1611118 = ~i1611117;
                                            int i1611119 = (i1611117 | i1611118) & i1611118;
                                            int i171111 = ((i1611119 & 1) | (i1611119 ^ 1)) * 56;
                                            int i171112 = (i1611116 | i171111) << 1;
                                            int i171113 = -((i171111 & (~i1611116)) | ((~i171111) & i1611116));
                                            i57 = ((i171112 | i171113) << 1) - (i171113 ^ i171112);
                                            int i171114 = f52427a;
                                            int i171115 = i171114 & 63;
                                            int i171116 = (((i171114 | 63) & (~i171115)) - (~(-(-(i171115 << 1))))) - 1;
                                            f52428b = i171116 % 128;
                                            int i171117 = i171116 % 2;
                                        }
                                    } else {
                                        j11 = j10 + 1;
                                        int i15116 = (i57 * (-55)) - 55;
                                        int i15117 = (i16 & 1) | (iIntValue & (-2));
                                        int i15118 = iIntValue & 1;
                                        int i16111110 = ~((i15117 & i15118) | (i15117 ^ i15118));
                                        int i16111111 = -(-(((i16111110 & i57) | (i57 ^ i16111110)) * 56));
                                        int i16111112 = i15116 & i16111111;
                                        int i16111113 = i15116 | i16111111;
                                        int i16111114 = (i16111112 & i16111113) + (i16111113 | i16111112);
                                        int i16111115 = -(-((~i20) * (-56)));
                                        int i16111116 = ((i16111114 | i16111115) << 1) - (i16111115 ^ i16111114);
                                        int i16111117 = i16 | i57;
                                        int i16111118 = ~i16111117;
                                        int i16111119 = (i16111117 | i16111118) & i16111118;
                                        int i171118 = ((i16111119 & 1) | (i16111119 ^ 1)) * 56;
                                        int i171119 = (i16111116 | i171118) << 1;
                                        int i1711110 = -((i171118 & (~i16111116)) | ((~i171118) & i16111116));
                                        i57 = ((i171119 | i1711110) << 1) - (i1711110 ^ i171119);
                                        int i1711111 = f52427a;
                                        int i1711112 = i1711111 & 63;
                                        int i1711113 = (((i1711111 | 63) & (~i1711112)) - (~(-(-(i1711112 << 1))))) - 1;
                                        f52428b = i1711113 % 128;
                                        int i1711114 = i1711113 % 2;
                                    }
                                }
                            } else {
                                j11 += 3;
                                int i7115 = ((i57 ^ 1) | (i57 & 1)) << 1;
                                int i7116 = -((i57 & (-2)) | ((~i57) & 1));
                                i57 = (i7115 ^ i7116) + ((i7115 & i7116) << 1);
                                int i7117 = f52427a;
                                int i7118 = i7117 & 43;
                                int i7119 = -(-((i7117 ^ 43) | i7118));
                                int i8110 = (i7118 ^ i7119) + ((i7119 & i7118) << 1);
                                f52428b = i8110 % 128;
                                int i8111 = i8110 % 2;
                            }
                            i27 = 2;
                            i28 = 1;
                        }
                    }
                }
                long j12 = j11;
                int i180 = f52427a;
                int i181 = (((i180 & (-58)) | ((~i180) & 57)) - (~((i180 & 57) << 1))) - 1;
                f52428b = i181 % 128;
                if (i181 % 2 != 0) {
                    return Long.valueOf(j12);
                }
                throw null;
            }
        } else {
            int i182 = f52427a;
            int i183 = i182 & 87;
            int i184 = ((i182 ^ 87) | i183) << 1;
            int i185 = -((i182 | 87) & (~i183));
            int i186 = (i184 ^ i185) + ((i185 & i184) << 1);
            f52428b = i186 % 128;
            int i187 = i186 % 2;
        }
        StringBuilder sbC = o1.c("endIndex > string.length: ", iIntValue2, " > ");
        sbC.append(str2.length());
        throw new IllegalArgumentException(sbC.toString().toString());
    }
}
