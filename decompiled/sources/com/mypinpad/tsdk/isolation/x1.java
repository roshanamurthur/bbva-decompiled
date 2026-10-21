package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f61710a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61711b = 1;

    public x1(int i10) {
        HashMap map = new HashMap();
        if (((-65535) & i10) != 1) {
            throw new IllegalArgumentException();
        }
        a(new Object[]{map, Integer.valueOf(i10)}, 1035240011, -1035240010, i10);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0363  */
    public static /* synthetic */ Integer a(Object[] objArr, int i10, int i11, int i12) {
        boolean z10;
        int i13 = (i11 * (-520)) + (i10 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY);
        int i14 = ~i12;
        int i15 = ((i11 | i12) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (((~(i14 | i11)) | i10) * (-1042)) + i13;
        int i16 = ~i10;
        int i17 = (((~(i10 | i14 | i11)) | (~(i12 | i16)) | (~((~i11) | i16))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i15;
        int i18 = 2;
        int i19 = -1;
        if (i17 != 1) {
            int iIntValue = ((Number) objArr[0]).intValue();
            int iIntValue2 = ((Number) objArr[1]).intValue();
            int iIntValue3 = ((Number) objArr[2]).intValue();
            int i20 = f61710a;
            int i21 = i20 & 71;
            int i22 = (i20 | 71) & (~i21);
            int i23 = i21 << 1;
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            f61711b = i24 % 128;
            int i25 = i24 % 2;
            int i26 = 1;
            while (iIntValue3 >= 32) {
                int i27 = f61710a;
                int i28 = i27 & 113;
                int i29 = -(-((i27 ^ 113) | i28));
                int i30 = (i28 & i29) + (i28 | i29);
                f61711b = i30 % 128;
                int i31 = i30 % 2;
                i26 = (int) ((((4294967295L & ((long) (iIntValue2 * i26))) * ((long) iIntValue)) + ((long) i26)) >>> 32);
                int i32 = iIntValue3 & (-112);
                int i33 = -(-((iIntValue3 ^ (-112)) | i32));
                iIntValue3 = (i32 & i33) + (i33 | i32) + 80;
                int i34 = i27 + 117;
                f61711b = i34 % 128;
                int i35 = i34 % 2;
            }
            if (iIntValue3 > 0) {
                int i36 = f61710a;
                int i37 = i36 & 91;
                int i38 = (~i37) & (i36 | 91);
                int i39 = i37 << 1;
                int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                f61711b = i40 % 128;
                int i41 = i40 % 2;
                i26 = (int) ((((((long) (((-1) >>> (-iIntValue3)) & (iIntValue2 * i26))) & 4294967295L) * ((long) iIntValue)) + ((long) i26)) >>> iIntValue3);
                int i42 = (i36 & 31) + (i36 | 31);
                f61711b = i42 % 128;
                int i43 = i42 % 2;
            }
            int i44 = f61711b + 17;
            f61710a = i44 % 128;
            if (i44 % 2 != 0) {
                int i45 = 13 / 0;
            }
            return Integer.valueOf(i26);
        }
        Map map = (Map) objArr[0];
        int iIntValue4 = ((Number) objArr[1]).intValue();
        int i46 = f61711b;
        int i47 = i46 & 59;
        int i48 = ((i46 ^ 59) | i47) << 1;
        int i49 = -((i46 | 59) & (~i47));
        int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
        f61710a = i50 % 128;
        int i51 = i50 % 2;
        int i52 = ~iIntValue4;
        int i53 = (iIntValue4 & 1) | ((-2) & i52);
        int i54 = -(-((iIntValue4 & (-2)) << 1));
        int i55 = (i53 ^ i54) + ((i53 & i54) << 1);
        int i56 = -((Integer) beq.setY(new Object[]{Integer.valueOf(i55)}, 339562877, -339562877, i55)).intValue();
        int i57 = (i56 * 367) + 11744;
        int i58 = i56 & 32;
        int i59 = (~i58) & (i56 | 32);
        int i60 = -(-(((i58 & i59) | (i59 ^ i58)) * (-366)));
        int i61 = ((~i60) & i57) | ((~i57) & i60);
        int i62 = -(-((i57 & i60) << 1));
        int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
        int i64 = ~(((-33) ^ iIntValue4) | ((-33) & iIntValue4));
        int i65 = i56 ^ i64;
        int i66 = i64 & i56;
        int i67 = (i63 - (~(-(~(((i66 & i65) | (i65 ^ i66)) * (-366)))))) - 1;
        int i68 = (i67 ^ (-1)) + (i67 << 1);
        int i69 = ~i56;
        int i70 = i69 & 32;
        int i71 = (32 | i69) & (~i70);
        int i72 = (i71 & i70) | (i71 ^ i70);
        int i73 = ~i72;
        int i74 = (i72 | i73) & i73;
        int i75 = (i56 & (-33)) | ((-33) ^ i56);
        int i76 = (i75 & i52) | ((~i75) & iIntValue4);
        int i77 = i75 & iIntValue4;
        int i78 = (i77 & i76) | (i76 ^ i77);
        int i79 = ~i78;
        int i80 = (i78 | i79) & i79;
        int i81 = ((~i80) & i74) | ((~i74) & i80);
        int i82 = i74 & i80;
        int i83 = -(-(((i82 & i81) | (i81 ^ i82)) * 366));
        int i84 = (i68 & i83) + (i83 | i68);
        int i85 = -iIntValue4;
        int iIntValue5 = ((Integer) ava.setOnFocusChangeListener(new Object[]{Integer.valueOf(i85)}, -1352100494, 1352100499, i85)).intValue();
        int i86 = f61710a + 57;
        f61711b = i86 % 128;
        int i87 = i86 % 2;
        int i88 = 1;
        while (i88 < i84) {
            int i89 = f61711b;
            int i90 = (i89 ^ 94) + ((i89 & 94) << 1) + i19;
            int i91 = i90 % 128;
            f61710a = i91;
            int i92 = i90 % i18;
            int i93 = i88 * (-764);
            int i94 = (1529 | i93) << 1;
            int i95 = -(i93 ^ 1529);
            int i96 = (i94 ^ i95) + ((i94 & i95) << 1);
            int i97 = ~i88;
            int i98 = (~i52) & i97;
            int i99 = ~i97;
            int i100 = i98 | (i52 & i99);
            int i101 = i97 & i52;
            int i102 = ~((i100 ^ i101) | (i100 & i101));
            int i103 = ~((i88 ^ iIntValue4) | (i88 & iIntValue4));
            int i104 = (i102 ^ i103) | (i103 & i102);
            int i105 = i97 ^ (-1);
            int i106 = (i105 ^ i97) | (i105 & i97);
            int i107 = ~((i106 ^ iIntValue4) | (i106 & iIntValue4));
            int i108 = i104 & i107;
            int i109 = (i104 | i107) & (~i108);
            int i110 = -(-(((i109 & i108) | (i109 ^ i108)) * 765));
            int i111 = i96 ^ i110;
            int i112 = (((i110 & i96) | i111) << 1) - i111;
            int i113 = ~((i52 | iIntValue4) & i52);
            int i114 = i99 ^ i113;
            int i115 = i99 & i113;
            int i116 = -(-(((i115 & i114) | (i114 ^ i115)) * 1530));
            int i117 = (((~i116) & i112) | ((~i112) & i116)) + ((i112 & i116) << 1);
            int i118 = i97 ^ i52;
            int i119 = (i118 & i101) | (i118 ^ i101);
            int i120 = ~i119;
            int i121 = ~((i119 & i120) | (i120 ^ i119));
            int i122 = i52 & i121;
            int i123 = (i121 | i52) & (~i122);
            int i124 = 1 << ((-2) - ((i117 - (~(((i123 & i122) | (i123 ^ i122)) * 765))) ^ (-1)));
            if (i124 >= 64) {
                int i125 = i91 + 32;
                int i126 = (i125 ^ (-1)) + (i125 << 1);
                f61711b = i126 % 128;
                if (i126 % 2 == 0) {
                    map.containsKey((Integer) beq.setY(new Object[]{Integer.valueOf(i124)}, 843618426, -843618423, i124));
                    throw null;
                }
                if (!map.containsKey((Integer) beq.setY(new Object[]{Integer.valueOf(i124)}, 843618426, -843618423, i124))) {
                    int i127 = f61711b;
                    int i128 = (i127 & 49) + (i127 | 49);
                    f61710a = i128 % 128;
                    if (i128 % 2 != 0) {
                        Integer num = (Integer) beq.setY(new Object[]{Integer.valueOf(i124)}, 843618426, -843618423, i124);
                        int iIntValue6 = a(new Object[]{Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(i124)}, 1043229511, -1043229511, iIntValue4).intValue();
                        map.put(num, (Integer) beq.setY(new Object[]{Integer.valueOf(iIntValue6)}, 843618426, -843618423, iIntValue6));
                        throw null;
                    }
                    Integer num2 = (Integer) beq.setY(new Object[]{Integer.valueOf(i124)}, 843618426, -843618423, i124);
                    int iIntValue7 = a(new Object[]{Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(i124)}, 1043229511, -1043229511, iIntValue4).intValue();
                    map.put(num2, (Integer) beq.setY(new Object[]{Integer.valueOf(iIntValue7)}, 843618426, -843618423, iIntValue7));
                }
            }
            int i129 = 1 << i88;
            if ((i55 & i129) != 0) {
                int i130 = f61710a;
                int i131 = ((i130 | 122) << 1) - (i130 ^ 122);
                int i132 = (i131 ^ (-1)) + (i131 << 1);
                f61711b = i132 % 128;
                int i133 = i132 % 2;
                int i134 = (i129 - 1) & i55;
                if (i134 >= 64) {
                    int i135 = i130 & 101;
                    int i136 = (i130 ^ 101) | i135;
                    int i137 = (i135 & i136) + (i136 | i135);
                    f61711b = i137 % 128;
                    int i138 = i137 % 2;
                    if (!(!map.containsKey((Integer) beq.setY(new Object[]{Integer.valueOf(i134)}, 843618426, -843618423, i134)))) {
                        z10 = false;
                    } else {
                        int i139 = f61710a;
                        int i140 = i139 & 93;
                        int i141 = i140 + ((i139 ^ 93) | i140);
                        f61711b = i141 % 128;
                        int i142 = i141 % 2;
                        z10 = false;
                        Integer num3 = (Integer) beq.setY(new Object[]{Integer.valueOf(i134)}, 843618426, -843618423, i134);
                        int iIntValue8 = a(new Object[]{Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(i134)}, 1043229511, -1043229511, iIntValue4).intValue();
                        map.put(num3, (Integer) beq.setY(new Object[]{Integer.valueOf(iIntValue8)}, 843618426, -843618423, iIntValue8));
                        int i143 = f61710a;
                        int i144 = (i143 ^ 1) + ((i143 & 1) << 1);
                        f61711b = i144 % 128;
                        int i145 = i144 % 2;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            int i146 = i88 | 1;
            int i147 = i146 << 1;
            int i148 = -(i146 & (~(i88 & 1)));
            i88 = ((i147 | i148) << 1) - (i148 ^ i147);
            int i149 = f61710a;
            int i150 = (i149 ^ 29) + ((i149 & 29) << 1);
            f61711b = i150 % 128;
            int i151 = i150 % 2;
            i18 = 2;
            i19 = -1;
        }
        int i152 = f61711b;
        int i153 = (((i152 | 78) << 1) - (i152 ^ 78)) - 1;
        f61710a = i153 % 128;
        if (i153 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
