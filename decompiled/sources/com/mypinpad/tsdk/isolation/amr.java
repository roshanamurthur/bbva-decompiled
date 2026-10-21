package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes10.dex */
public final class amr extends alh implements alg {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f53230l = 0;
    public static int m = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final aki f53231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f53232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f53233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f53234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f53235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f53236k;

    public amr(aki akiVar) {
        super(akiVar);
        this.f53231f = akiVar;
        int y7 = akiVar.setY();
        this.f53232g = y7;
        this.f53233h = new byte[y7];
        this.f53234i = new byte[y7];
        this.f53235j = new byte[y7];
        this.f53236k = 0;
    }

    public static /* synthetic */ Byte a(Object[] objArr) {
        amr amrVar = (amr) objArr[0];
        byte bByteValue = ((Byte) objArr[1]).byteValue();
        int i10 = f53230l;
        int i11 = (i10 & 105) + (i10 | 105);
        m = i11 % 128;
        int i12 = i11 % 2;
        int i13 = amrVar.f53236k;
        byte[] bArr = amrVar.f53234i;
        byte[] bArr2 = amrVar.f53235j;
        if (i13 == 0) {
            int i14 = i10 + 55;
            m = i14 % 128;
            int i15 = i14 % 2;
            setOnFocusChangeListener(new Object[]{amrVar}, -2048932705, 2048932705, System.identityHashCode(amrVar));
            amrVar.f53231f.setDividerPadding(bArr, 0, bArr2, 0);
            int i16 = amrVar.f53236k;
            int iIdentityHashCode = System.identityHashCode(amrVar);
            int i17 = -(-(i16 * 253));
            int i18 = 253 & i17;
            int i19 = i18 + ((i17 ^ 253) | i18);
            int i20 = ~i16;
            int i21 = (-2) & i20;
            int i22 = i21 | (((-2) | i20) & (~i21));
            int i23 = ~i22;
            int i24 = (i22 | i23) & i23;
            int i25 = (i20 | i16) & i20;
            int i26 = ~iIdentityHashCode;
            int i27 = ~(i25 | i26);
            int i28 = (i24 & i27) | ((~i27) & i24) | ((~i24) & i27);
            int i29 = i16 ^ 1;
            int i30 = i16 & 1;
            int i31 = i29 | i30;
            int i32 = i31 & iIdentityHashCode;
            int i33 = (i31 | iIdentityHashCode) & (~i32);
            int i34 = ~((i33 & i32) | (i33 ^ i32));
            int i35 = ((~i34) & i28) | ((~i28) & i34);
            int i36 = i28 & i34;
            int i37 = ((i36 & i35) | (i35 ^ i36)) * (-252);
            int i38 = (i19 ^ i37) + ((i37 & i19) << 1);
            int i39 = ((i29 ^ i30) | (i29 & i30)) * (-252);
            int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
            int i41 = ((~i26) & i25) | ((~i25) & i26) | (i25 & i26);
            int i42 = i41 & 1;
            int i43 = (i41 | 1) & (~i42);
            int i44 = ~((i43 & i42) | (i43 ^ i42));
            int i45 = (i20 & 1) | (i16 & (-2));
            int i46 = ~(iIdentityHashCode | (i45 & i30) | (i45 ^ i30));
            int i47 = ((i46 & i44) | (i44 ^ i46)) * 252;
            int i48 = (i40 | i47) << 1;
            int i49 = -((i47 & (~i40)) | ((~i47) & i40));
            amrVar.f53236k = ((i48 | i49) << 1) - (i49 ^ i48);
            byte b10 = bArr2[i16];
            byte b11 = (byte) ((bByteValue | b10) & (~(b10 & bByteValue)));
            int i50 = f53230l + 41;
            m = i50 % 128;
            int i51 = i50 % 2;
            return Byte.valueOf(b11);
        }
        int iIdentityHashCode2 = System.identityHashCode(amrVar);
        int i52 = i13 * TypedValues.MotionType.TYPE_EASING;
        int i53 = 302 & i52;
        int i54 = (i52 ^ 302) | i53;
        int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
        int i56 = ~iIdentityHashCode2;
        int i57 = (i56 | iIdentityHashCode2) & i56;
        int i58 = (-2) & i57;
        int i59 = ~(((i57 | (-2)) & (~i58)) | i58);
        int i60 = (~i59) & i13;
        int i61 = ~i13;
        int i62 = i60 | (i59 & i61);
        int i63 = i59 & i13;
        int i64 = ((i63 & i62) | (i62 ^ i63)) * (-602);
        int i65 = i55 & i64;
        int i66 = (i55 | i64) & (~i65);
        int i67 = -(-(i65 << 1));
        int i68 = (i66 ^ i67) + ((i66 & i67) << 1);
        int i69 = (i61 | i13) & i61;
        int i70 = (-2) & i69;
        int i71 = (i69 | (-2)) & (~i70);
        int i72 = ~((i71 & i70) | (i71 ^ i70));
        int i73 = (iIdentityHashCode2 & (-2)) | ((-2) ^ iIdentityHashCode2);
        int i74 = ~i73;
        int i75 = (i73 | i74) & i74;
        int i76 = (i75 & i72) | (i72 ^ i75);
        int i77 = i56 & 1;
        int i78 = (~i77) & (i56 | 1);
        int i79 = (i77 & i78) | (i78 ^ i77);
        int i80 = (i79 & i61) | ((~i79) & i13);
        int i81 = i79 & i13;
        int i82 = ~((i81 & i80) | (i80 ^ i81));
        int i83 = i76 & i82;
        int i84 = (i76 | i82) & (~i83);
        int i85 = ((i84 & i83) | (i84 ^ i83)) * (-301);
        int i86 = i68 ^ i85;
        int i87 = (((i85 & i68) | i86) << 1) - i86;
        int i88 = (i56 ^ i13) | (i56 & i13);
        int i89 = ~i88;
        int i90 = (i87 - (~(-(-(((i88 | i89) & i89) * 301))))) - 1;
        amrVar.f53236k = i90;
        byte b12 = bArr2[i13];
        byte b13 = (byte) ((bByteValue & (~b12)) | ((~bByteValue) & b12));
        if (i90 == bArr.length) {
            int i91 = m;
            int i92 = i91 & 49;
            int i93 = -(-((i91 ^ 49) | i92));
            int i94 = (i92 & i93) + (i93 | i92);
            f53230l = i94 % 128;
            int i95 = i94 % 2;
            amrVar.f53236k = 0;
            setOnFocusChangeListener(new Object[]{amrVar}, 1097460478, -1097460473, System.identityHashCode(amrVar));
            int i96 = m;
            int i97 = i96 & 125;
            int i98 = (i96 ^ 125) | i97;
            int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
            f53230l = i99 % 128;
            int i100 = i99 % 2;
        }
        int i101 = m + 11;
        f53230l = i101 % 128;
        if (i101 % 2 == 0) {
            return Byte.valueOf(b13);
        }
        throw null;
    }

    public static /* synthetic */ Integer b(Object[] objArr) {
        amr amrVar = (amr) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        byte[] bArr2 = (byte[]) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i10 = m;
        int i11 = i10 & 13;
        int i12 = -(-((i10 ^ 13) | i11));
        int i13 = (i11 & i12) + (i11 | i12);
        f53230l = i13 % 128;
        int i14 = i13 % 2;
        int i15 = amrVar.f53236k;
        int i16 = amrVar.f53232g;
        if (i15 != 0) {
            int i17 = ((i10 ^ 80) + ((i10 & 80) << 1)) - 1;
            f53230l = i17 % 128;
            int i18 = i17 % 2;
            amrVar.setDividerPadding(bArr, iIntValue, i16, bArr2, iIntValue2);
            int i19 = f53230l;
            int i20 = i19 & 37;
            int i21 = (i19 | 37) & (~i20);
            int i22 = -(-(i20 << 1));
            int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
            m = i23 % 128;
            int i24 = i23 % 2;
            return Integer.valueOf(i16);
        }
        int i25 = i16 * 253;
        int i26 = -(-(iIntValue * 253));
        int i27 = i25 & i26;
        int i28 = (i25 | i26) & (~i27);
        int i29 = -(-(i27 << 1));
        int i30 = (i28 & i29) + (i28 | i29);
        int i31 = ~i16;
        int i32 = ~iIntValue;
        int i33 = i31 & i32;
        int i34 = (~i33) & (i31 | i32);
        int i35 = ~((i33 & i34) | (i34 ^ i33));
        int i36 = ~i32;
        int i37 = i32 & i32;
        int i38 = (~i37) & (i32 | i32);
        int i39 = ~((i38 ^ i37) | (i38 & i37));
        int i40 = (i35 ^ i39) | (i39 & i35);
        int i41 = i16 ^ iIntValue;
        int i42 = i16 & iIntValue;
        int i43 = (i41 ^ i42) | (i41 & i42);
        int i44 = (i43 & i32) | ((~i43) & iIntValue) | (i43 & iIntValue);
        int i45 = ~i44;
        int i46 = (i44 | i45) & i45;
        int i47 = ((~i46) & i40) | ((~i40) & i46);
        int i48 = i40 & i46;
        int i49 = (i30 - (~(((i48 & i47) | (i47 ^ i48)) * (-252)))) - 1;
        int i50 = (i16 & i32) | (iIntValue & i31) | i42;
        int i51 = i50 * (-252);
        int i52 = (((i49 | i51) << 1) - (~(-(((~i51) & i49) | ((~i49) & i51))))) - 1;
        int i53 = (i32 | iIntValue) & i32;
        int i54 = (i53 & i32) | (i32 ^ i53);
        int i55 = i54 ^ i16;
        int i56 = i54 & i16;
        int i57 = ~((i56 & i55) | (i55 ^ i56));
        int i58 = i50 & iIntValue;
        int i59 = (i50 | iIntValue) & (~i58);
        int i60 = ~((i59 & i58) | (i59 ^ i58));
        int i61 = i57 ^ i60;
        int i62 = i57 & i60;
        int i63 = -(-(((i62 & i61) | (i61 ^ i62)) * 252));
        if (((((~i63) & i52) | ((~i52) & i63)) - (~((i63 & i52) << 1))) - 1 > bArr.length) {
            throw new akr("input buffer too small");
        }
        int i64 = i16 * 71;
        int i65 = iIntValue2 * (-69);
        int i66 = ((i64 ^ i65) | (i64 & i65)) << 1;
        int i67 = -(((~i64) & i65) | ((~i65) & i64));
        int i68 = (i66 & i67) + (i67 | i66);
        int i69 = i31 ^ iIntValue2;
        int i70 = i31 & iIntValue2;
        int i71 = ~((i69 & i70) | (i69 ^ i70));
        int i72 = ~iIntValue2;
        int i73 = (iIntValue2 & i32) | (iIntValue & i72);
        int i74 = iIntValue2 & iIntValue;
        int i75 = (i71 | (~((i73 ^ i74) | (i73 & i74)))) * (-140);
        int i76 = (i68 ^ i75) + ((i75 & i68) << 1);
        int i77 = (i16 & i72) | i70;
        int i78 = i16 & iIntValue2;
        int i79 = (i77 ^ i78) | (i77 & i78);
        int i80 = (~((i79 & iIntValue) | (i79 ^ iIntValue))) * 70;
        int i81 = (i76 & i80) + (i80 | i76);
        int i82 = (~i70) & (i31 | iIntValue2);
        int i83 = ~((i82 & i70) | (i82 ^ i70));
        int i84 = (i72 | iIntValue2) & i72;
        int i85 = i84 & i16;
        int i86 = (i84 | i16) & (~i85);
        int i87 = ~((i86 & i85) | (i86 ^ i85));
        int i88 = (i83 & i87) | (i83 ^ i87);
        int i89 = (~i42) & (i16 | iIntValue);
        int i90 = ~((i42 & i89) | (i89 ^ i42));
        int i91 = -(-(((i88 & i90) | (i88 ^ i90)) * 70));
        int i92 = i81 & i91;
        int i93 = (i91 ^ i81) | i92;
        if ((i92 ^ i93) + ((i93 & i92) << 1) > bArr2.length) {
            throw new ald("output buffer too short");
        }
        byte[] bArr3 = amrVar.f53234i;
        byte[] bArr4 = amrVar.f53235j;
        amrVar.f53231f.setDividerPadding(bArr3, 0, bArr4, 0);
        int i94 = f53230l;
        int i95 = i94 & 45;
        int i96 = (i94 | 45) & (~i95);
        int i97 = i95 << 1;
        int i98 = (i96 & i97) + (i96 | i97);
        m = i98 % 128;
        int i99 = 2;
        int i100 = i98 % 2;
        int i101 = 0;
        while (i101 < i16) {
            int i102 = m;
            int i103 = (-2) - ((((i102 | 2) << 1) - (i102 ^ i99)) ^ (-1));
            int i104 = i103 % 128;
            f53230l = i104;
            int i105 = i103 % i99;
            int i106 = (iIntValue2 - (~(-(~(-(-i101)))))) - i99;
            int i107 = i101 * 253;
            int i108 = i107 ^ i26;
            int i109 = ((i107 & i26) | i108) << 1;
            int i110 = -i108;
            int i111 = (i109 ^ i110) + ((i109 & i110) << 1);
            int i112 = ~i101;
            int i113 = (i112 & i32) | (i112 ^ i32);
            int i114 = ~i113;
            int i115 = (i113 | i114) & i114;
            int i116 = i32 & i36;
            int i117 = i116 | i116;
            int i118 = ~((i117 & i37) | (i117 ^ i37));
            int i119 = iIntValue2;
            int i120 = ((~i115) & i118) | ((~i118) & i115);
            int i121 = i115 & i118;
            int i122 = (i121 & i120) | (i120 ^ i121);
            int i123 = (i101 ^ iIntValue) | (i101 & iIntValue);
            int i124 = (i123 & i32) | ((~i123) & iIntValue);
            int i125 = i123 & iIntValue;
            int i126 = ~(i124 | i125);
            int i127 = i26;
            int i128 = i122 & i126;
            int i129 = (i122 | i126) & (~i128);
            int i130 = ((i129 & i128) | (i129 ^ i128)) * (-252);
            int i131 = i111 & i130;
            int i132 = (i111 | i130) & (~i131);
            int i133 = -(-(i131 << 1));
            int i134 = (i132 ^ i133) + ((i132 & i133) << 1);
            int i135 = (i101 | iIntValue) * (-252);
            int i136 = i134 ^ i135;
            int i137 = (i135 & i134) << 1;
            int i138 = (i136 ^ i137) + ((i137 & i136) << 1);
            int i139 = i38 | i37;
            int i140 = i139 ^ i101;
            int i141 = i139 & i101;
            int i142 = ~((i141 & i140) | (i140 ^ i141));
            int i143 = (i125 & i124) | (i124 ^ i125);
            int i144 = ~i143;
            int i145 = (i143 | i144) & i144;
            int i146 = -(-(((i142 & i145) | (i142 ^ i145)) * 252));
            int i147 = i138 ^ i146;
            byte b10 = bArr[(((i146 & i138) | i147) << 1) - i147];
            byte b11 = bArr4[i101];
            bArr2[i106] = (byte) (((~b10) & b11) | ((~b11) & b10));
            int i148 = i101 & 1;
            i101 = (i148 - (~((i101 ^ 1) | i148))) - 1;
            int i149 = ((((i104 ^ 53) | (i104 & 53)) << 1) - (~(-((i104 & (-54)) | ((~i104) & 53))))) - 1;
            m = i149 % 128;
            int i150 = i149 % 2;
            iIntValue2 = i119;
            i26 = i127;
            i32 = i32;
            i99 = 2;
        }
        setOnFocusChangeListener(new Object[]{amrVar}, 1097460478, -1097460473, System.identityHashCode(amrVar));
        int i151 = m;
        int i152 = (i151 ^ 9) + ((i151 & 9) << 1);
        f53230l = i152 % 128;
        if (i152 % 2 == 0) {
            return Integer.valueOf(i16);
        }
        throw null;
    }

    public static /* synthetic */ Integer c(Object[] objArr) {
        int i10;
        byte[] bArr;
        int i11;
        byte[] bArr2;
        byte b10;
        amr amrVar = (amr) objArr[0];
        byte[] bArr3 = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        byte[] bArr4 = (byte[]) objArr[4];
        int iIntValue3 = ((Number) objArr[5]).intValue();
        int i12 = m;
        int i13 = ((i12 ^ 111) | (i12 & 111)) << 1;
        int i14 = -(((~i12) & 111) | (i12 & (-112)));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        int i16 = i15 % 128;
        f53230l = i16;
        if (i15 % 2 == 0 ? iIntValue + iIntValue2 > bArr3.length : (iIntValue >>> iIntValue2) > bArr3.length) {
            throw new akr("input buffer too small");
        }
        int i17 = ((iIntValue2 * 569) - (~(iIntValue3 * 569))) - 1;
        int i18 = ~iIntValue2;
        int i19 = (i18 | iIntValue2) & i18;
        int i20 = ~iIntValue3;
        int i21 = i19 ^ i20;
        int i22 = i19 & i20;
        int i23 = ~((i22 & i21) | (i21 ^ i22));
        int i24 = ~iIntValue;
        int i25 = i18 & i24;
        int i26 = ((~i25) & (i18 | i24)) | i25;
        int i27 = ~i26;
        int i28 = (i26 | i27) & i27;
        int i29 = ((~i23) & i28) | ((~i28) & i23);
        int i30 = i28 & i23;
        int i31 = (i30 & i29) | (i29 ^ i30);
        int i32 = ~(i20 | i24);
        int i33 = ((~i32) & i31) | ((~i31) & i32);
        int i34 = i31 & i32;
        int i35 = (i17 - (~(((i34 & i33) | (i33 ^ i34)) * (-1136)))) - 1;
        int i36 = ((~i18) & iIntValue) | i25;
        int i37 = i18 & iIntValue;
        int i38 = ~((i36 & i37) | (i36 ^ i37));
        int i39 = (i20 ^ iIntValue) | (i20 & iIntValue);
        int i40 = ~i39;
        int i41 = (i39 | i40) & i40;
        int i42 = ((~i41) & i38) | ((~i38) & i41);
        int i43 = i38 & i41;
        int i44 = (i43 & i42) | (i42 ^ i43);
        int i45 = ~i24;
        int i46 = (iIntValue2 & i45) | i25;
        int i47 = i24 & iIntValue2;
        int i48 = (i46 & i47) | (i46 ^ i47);
        int i49 = (i48 & i20) | ((~i48) & iIntValue3);
        int i50 = i48 & iIntValue3;
        int i51 = (i50 & i49) | (i49 ^ i50);
        int i52 = ~i51;
        int i53 = (i51 | i52) & i52;
        int i54 = -(~(-(-(((i44 & i53) | (i44 ^ i53)) * (-568)))));
        int i55 = ((i35 ^ i54) + ((i54 & i35) << 1)) - 1;
        int i56 = i24 | iIntValue;
        int i57 = i24 & i56;
        int i58 = ~((i57 ^ iIntValue2) | (i57 & iIntValue2));
        int i59 = ~((i24 & i20) | (iIntValue3 & i45) | (i24 & iIntValue3));
        int i60 = i58 & i59;
        int i61 = (~i60) & (i58 | i59);
        int i62 = (i61 & i60) | (i61 ^ i60);
        int i63 = i18 ^ i20;
        int i64 = i18 & i20;
        int i65 = (i63 & i64) | (i63 ^ i64);
        int i66 = (i65 & i24) | ((~i65) & iIntValue);
        int i67 = i65 & iIntValue;
        int i68 = (i67 & i66) | (i66 ^ i67);
        int i69 = ~i68;
        int i70 = (i68 | i69) & i69;
        int i71 = ((~i70) & i62) | ((~i62) & i70);
        int i72 = i62 & i70;
        int i73 = ((i72 & i71) | (i71 ^ i72)) * 568;
        int i74 = i55 & i73;
        int i75 = (i73 | i55) & (~i74);
        int i76 = -(-(i74 << 1));
        if (((i75 | i76) << 1) - (i75 ^ i76) > bArr4.length) {
            throw new ald("output buffer too short");
        }
        int i77 = i16 ^ 61;
        int i78 = ((i16 & 61) | i77) << 1;
        int i79 = -i77;
        int i80 = (i78 & i79) + (i79 | i78);
        m = i80 % 128;
        int i81 = i80 % 2;
        int i82 = 0;
        while (i82 < iIntValue2) {
            int i83 = m;
            int i84 = i83 & 91;
            int i85 = ((i83 | 91) & (~i84)) + (i84 << 1);
            int i86 = i85 % 128;
            f53230l = i86;
            if (i85 % 2 != 0) {
                int i87 = amrVar.f53236k;
                throw null;
            }
            int i88 = amrVar.f53236k;
            if (i88 == 0) {
                int i89 = (-2) - (((i86 ^ 4) + ((i86 & 4) << 1)) ^ (-1));
                m = i89 % 128;
                int i90 = i89 % 2;
                setOnFocusChangeListener(new Object[]{amrVar}, -2048932705, 2048932705, System.identityHashCode(amrVar));
                byte[] bArr5 = amrVar.f53234i;
                byte[] bArr6 = amrVar.f53235j;
                amrVar.f53231f.setDividerPadding(bArr5, 0, bArr6, 0);
                int i91 = i82 * 398;
                int i92 = iIntValue * (-396);
                int i93 = i91 & i92;
                int i94 = (i93 - (~(-(-((i91 ^ i92) | i93))))) - 1;
                int i95 = ~i82;
                int i96 = ~i95;
                int i97 = i95 & i24;
                int i98 = (~i97) & (i95 | i24);
                int i99 = ~((i98 & i97) | (i98 ^ i97));
                int i100 = i95 & iIntValue;
                int i101 = ~((i95 ^ iIntValue) | i100);
                i10 = iIntValue2;
                bArr = bArr4;
                int i102 = ((~i101) & i99) | ((~i99) & i101);
                int i103 = i99 & i101;
                int i104 = (i102 & i103) | (i102 ^ i103);
                int i105 = i57 & iIntValue;
                int i106 = (~i105) & (i57 | iIntValue);
                int i107 = (i105 & i106) | (i106 ^ i105);
                int i108 = ~i107;
                int i109 = (i107 | i108) & i108;
                int i110 = ((~i109) & i104) | ((~i104) & i109);
                int i111 = i104 & i109;
                int i112 = -(-(((i111 & i110) | (i110 ^ i111)) * (-397)));
                int i113 = i94 ^ i112;
                int i114 = -(-((i112 & i94) << 1));
                int i115 = ((i113 | i114) << 1) - (i114 ^ i113);
                int i116 = i95 & (i95 | i82);
                int i117 = i116 ^ iIntValue;
                int i118 = i116 & iIntValue;
                int i119 = -(-((~((i118 & i117) | (i117 ^ i118))) * (-397)));
                int i120 = (i115 & i119) + (i119 | i115);
                int i121 = (iIntValue & i96) | i97;
                int i122 = ~((i121 & i100) | (i121 ^ i100));
                int i123 = ((~i122) & iIntValue) | (i122 & i24);
                int i124 = i122 & iIntValue;
                int i125 = (i124 & i123) | (i123 ^ i124);
                int i126 = ~((i57 ^ i82) | (i57 & i82));
                int i127 = ((~i126) & i125) | ((~i125) & i126);
                int i128 = i125 & i126;
                int i129 = -(-(((i128 & i127) | (i127 ^ i128)) * 397));
                int i130 = i120 ^ i129;
                int i131 = ((i129 & i120) | i130) << 1;
                int i132 = -i130;
                byte b11 = bArr3[(i131 ^ i132) + ((i131 & i132) << 1)];
                int i133 = amrVar.f53236k;
                int i134 = (i133 & 2) + (i133 | 2);
                amrVar.f53236k = (i134 ^ (-1)) + (i134 << 1);
                b10 = (byte) (b11 ^ bArr6[i133]);
                int i135 = f53230l;
                int i136 = (i135 ^ 115) + ((i135 & 115) << 1);
                m = i136 % 128;
                int i137 = i136 % 2;
                i11 = i56;
                bArr2 = bArr3;
            } else {
                i10 = iIntValue2;
                bArr = bArr4;
                int i138 = i82 * 367;
                int i139 = iIntValue * 367;
                int i140 = i138 & i139;
                int i141 = ((i138 ^ i139) | i140) << 1;
                int i142 = -((i138 | i139) & (~i140));
                int i143 = (i141 & i142) + (i142 | i141);
                int i144 = i82 & i24;
                int i145 = ~i82;
                int i146 = iIntValue & i145;
                int i147 = i144 | i146;
                int i148 = i82 & iIntValue;
                int i149 = (i143 - (~(-(~(((i147 ^ i148) | (i147 & i148)) * (-366)))))) - 2;
                int i150 = i24 & iIntValue;
                int i151 = i150 | ((~i150) & i56);
                int i152 = ~i151;
                int i153 = (i151 | i152) & i152;
                int i154 = -(-(((i153 & i82) | (i82 ^ i153)) * (-366)));
                int i155 = i149 & i154;
                int i156 = ((i149 | i154) & (~i155)) + (i155 << 1);
                int i157 = (~i146) & (i145 | iIntValue);
                int i158 = ~((i157 & i146) | (i157 ^ i146));
                int i159 = (~i144) & (i24 | i82);
                int i160 = (i144 & i159) | (i159 ^ i144);
                int i161 = (i160 & i24) | ((~i160) & iIntValue);
                int i162 = i160 & iIntValue;
                int i163 = (i162 & i161) | (i161 ^ i162);
                int i164 = ~i163;
                int i165 = (i163 | i164) & i164;
                int i166 = i158 ^ i165;
                int i167 = i165 & i158;
                int i168 = -(-(((i167 & i166) | (i166 ^ i167)) * 366));
                byte b12 = bArr3[(i156 & i168) + (i168 | i156)];
                byte[] bArr7 = amrVar.f53235j;
                int i169 = (i88 * 971) - 1939;
                int i170 = ~i88;
                int i171 = i170 & 1;
                int i172 = ~(((~i171) & (i170 | 1)) | i171);
                int i173 = i57 & i88;
                i11 = i56;
                int i174 = (~i173) & (i57 | i88);
                int i175 = ~((i174 ^ i173) | (i174 & i173));
                bArr2 = bArr3;
                int i176 = -(~(-(-(((i175 & i172) | ((~i172) & i175) | ((~i175) & i172)) * (-970)))));
                int i177 = ((i169 & i176) + (i176 | i169)) - 1;
                int i178 = (-2) & i170;
                int i179 = (~((i88 & 1) | i178 | ((-2) & i88))) * 1940;
                int i180 = i177 & i179;
                int i181 = (i179 | i177) & (~i180);
                int i182 = i180 << 1;
                int i183 = (i181 ^ i182) + ((i181 & i182) << 1);
                int i184 = ~(((~i170) & (-2)) | i171 | i178);
                int i185 = (i24 & i170) | (i88 & i45);
                int i186 = i24 & i88;
                int i187 = (i185 & i186) | (i185 ^ i186);
                int i188 = ~i187;
                int i189 = (i187 | i188) & i188;
                int i190 = ((~i189) & i184) | ((~i184) & i189);
                int i191 = i184 & i189;
                int i192 = -(-(((i191 & i190) | (i190 ^ i191)) * 970));
                int i193 = ((i183 | i192) << 1) - (i192 ^ i183);
                amrVar.f53236k = i193;
                byte b13 = bArr7[i88];
                b10 = (byte) ((b13 & (~b12)) | ((~b13) & b12));
                if (i193 == amrVar.f53234i.length) {
                    int i194 = (i86 & (-30)) | ((~i86) & 29);
                    int i195 = (i86 & 29) << 1;
                    int i196 = ((i194 | i195) << 1) - (i194 ^ i195);
                    m = i196 % 128;
                    int i197 = i196 % 2;
                    amrVar.f53236k = 0;
                    setOnFocusChangeListener(new Object[]{amrVar}, 1097460478, -1097460473, System.identityHashCode(amrVar));
                    int i198 = f53230l + 15;
                    m = i198 % 128;
                    int i199 = i198 % 2;
                }
                int i200 = iIntValue3 & i82;
                bArr[i200 + ((iIntValue3 ^ i82) | i200)] = b10;
                int i201 = i82 + 54;
                i82 = ((i201 ^ (-52)) + ((i201 & (-52)) << 1)) - 1;
                int i202 = m + 29;
                f53230l = i202 % 128;
                int i203 = i202 % 2;
                iIntValue2 = i10;
                bArr4 = bArr;
                i56 = i11;
                bArr3 = bArr2;
            }
            int i204 = iIntValue3 & i82;
            bArr[i204 + ((iIntValue3 ^ i82) | i204)] = b10;
            int i205 = i82 + 54;
            i82 = ((i205 ^ (-52)) + ((i205 & (-52)) << 1)) - 1;
            int i206 = m + 29;
            f53230l = i206 % 128;
            int i207 = i206 % 2;
            iIntValue2 = i10;
            bArr4 = bArr;
            i56 = i11;
            bArr3 = bArr2;
        }
        int i208 = f53230l + 65;
        m = i208 % 128;
        int i209 = i208 % 2;
        return Integer.valueOf(iIntValue2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0156, code lost:
    
        if (r0.f53232g >= r6.length) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x017b, code lost:
    
        if (r0.f53232g >= r6.length) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x017d, code lost:
    
        r6 = r0.f53232g;
        r7 = r6 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0183, code lost:
    
        if (8 <= r7) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0185, code lost:
    
        r8 = com.mypinpad.tsdk.isolation.amr.m;
        r10 = r8 & 61;
        r9 = ((r8 ^ 61) | r10) << 1;
        r8 = -((r8 | 61) & (~r10));
        r10 = ((r9 | r8) << 1) - (r8 ^ r9);
        r8 = r10 % 128;
        com.mypinpad.tsdk.isolation.amr.f53230l = r8;
        r10 = r10 % 2;
        r8 = r8 + 23;
        com.mypinpad.tsdk.isolation.amr.m = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01a6, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.amr.f53230l;
        r9 = ((r7 | 39) << 1) - (r7 ^ 39);
        com.mypinpad.tsdk.isolation.amr.m = r9 % 128;
        r9 = r9 % 2;
        r7 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01b5, code lost:
    
        r8 = -r0.f53233h.length;
        r9 = java.lang.System.identityHashCode(r0);
        r10 = r8 * 477;
        r11 = -(-(r6 * (-475)));
        r12 = r10 & r11;
        r12 = (r12 - (~((r10 ^ r11) | r12))) - 1;
        r10 = ~r8;
        r11 = r10 & r6;
        r13 = (~r11) & (r10 | r6);
        r14 = ~r6;
        r11 = ~((r11 & r13) | (r13 ^ r11));
        r13 = (r14 & r10) | ((~r14) & r8);
        r15 = r14 & r8;
        r13 = (r13 ^ r15) | (r13 & r15);
        r15 = r13 & r9;
        r1 = (~r15) & (r13 | r9);
        r13 = ~r9;
        r1 = ~(r1 | r15);
        r15 = r11 & r1;
        r1 = (r1 | r11) & (~r15);
        r1 = -(-(((r1 & r15) | (r1 ^ r15)) * (-476)));
        r11 = r12 & r1;
        r2 = ((r12 ^ r1) | r11) << 1;
        r1 = -((r1 | r12) & (~r11));
        r11 = (r2 & r1) + (r1 | r2);
        r1 = (r14 | r6) & r14;
        r2 = r1 | r8;
        r6 = r2 ^ r9;
        r2 = r2 & r9;
        r11 = (r11 - (~((~((r2 & r6) | (r6 ^ r2))) * 952))) - 1;
        r2 = r1 ^ r13;
        r1 = r1 & r13;
        r1 = (r1 & r2) | (r2 ^ r1);
        r1 = (~((r1 & r8) | ((r1 & r10) | ((~r1) & r8)))) * 476;
        r2 = r11 & r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x022f, code lost:
    
        if ((r2 + ((r1 ^ r11) | r2)) > r7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0246, code lost:
    
        if (((com.mypinpad.tsdk.isolation.akk) com.mypinpad.tsdk.isolation.anv.setOnFocusChangeListener(new java.lang.Object[]{r4}, -169256387, 169256388, java.lang.System.identityHashCode(r4))) == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0248, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.amr.m;
        r2 = r1 | 23;
        r7 = r2 << 1;
        r1 = -((~(r1 & 23)) & r2);
        r2 = (r7 ^ r1) + ((r1 & r7) << 1);
        com.mypinpad.tsdk.isolation.amr.f53230l = r2 % 128;
        r2 = r2 % 2;
        r0.f53231f.setDividerPadding((com.mypinpad.tsdk.isolation.akk) com.mypinpad.tsdk.isolation.anv.setOnFocusChangeListener(new java.lang.Object[]{r4}, -169256387, 169256388, java.lang.System.identityHashCode(r4)));
        r1 = com.mypinpad.tsdk.isolation.amr.m;
        r2 = ((r1 | 11) << 1) - (r1 ^ 11);
        com.mypinpad.tsdk.isolation.amr.f53230l = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0280, code lost:
    
        setOnFocusChangeListener(new java.lang.Object[]{r0}, 606493073, -606493070, java.lang.System.identityHashCode(r0));
        r0 = com.mypinpad.tsdk.isolation.amr.f53230l;
        r1 = r0 & 39;
        r1 = r1 + ((r0 ^ 39) | r1);
        com.mypinpad.tsdk.isolation.amr.m = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x02a0, code lost:
    
        if ((r1 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02a5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x02a6, code lost:
    
        r2 = new java.lang.StringBuilder("CTR/SIC mode requires IV of at least: ");
        r4 = -r7;
        r6 = java.lang.System.identityHashCode(r0);
        r7 = r4 * (-721);
        r0 = r0.f53232g;
        r8 = -(-(r0 * (-721)));
        r9 = r7 ^ r8;
        r7 = -(-((r7 & r8) << 1));
        r8 = (r9 & r7) + (r7 | r9);
        r7 = ~r6;
        r9 = ~r4;
        r10 = ~r0;
        r11 = ~((r9 ^ r10) | (r9 & r10));
        r12 = ((~r11) & r7) | ((~r7) & r11);
        r7 = r7 & r11;
        r7 = (r7 & r12) | (r12 ^ r7);
        r11 = r4 ^ r0;
        r12 = r4 & r0;
        r11 = ~((r11 & r12) | (r11 ^ r12));
        r7 = -(-(((r7 & r11) | (((~r11) & r7) | ((~r7) & r11))) * 1444));
        r11 = r8 & r7;
        r7 = -(-((r7 ^ r8) | r11));
        r8 = ((r11 | r7) << 1) - (r7 ^ r11);
        r11 = r0 & r9;
        r7 = ((r4 & r10) | r11) | r12;
        r12 = ~r7;
        r7 = (r7 | r12) & r12;
        r12 = r4 ^ r6;
        r13 = r4 & r6;
        r12 = ~((r12 & r13) | (r12 ^ r13));
        r7 = (r7 & r12) | (r7 ^ r12);
        r6 = (r6 & r0) | (r0 ^ r6);
        r12 = ~r6;
        r6 = (r6 | r12) & r12;
        r12 = r7 ^ r6;
        r6 = r6 & r7;
        r6 = -(~(((r6 & r12) | (r12 ^ r6)) * (-1444)));
        r7 = ((r8 ^ r6) + ((r6 & r8) << 1)) - 1;
        r0 = r0 ^ r9;
        r0 = ~((r0 & r11) | (r0 ^ r11));
        r4 = ~(r4 | r10);
        r6 = ((~r4) & r0) | ((~r0) & r4);
        r0 = r0 & r4;
        r0 = -(~(((r0 & r6) | (r6 ^ r0)) * com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes.STORAGE_PERMISSION));
        r4 = (r7 & r0) + (r0 | r7);
        r2.append((r4 ^ (-1)) + (r4 << 1));
        r2.append(" bytes.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0353, code lost:
    
        throw new java.lang.IllegalArgumentException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0354, code lost:
    
        r2 = new java.lang.StringBuilder("CTR/SIC mode requires IV no greater than: ");
        r2.append(r0.f53232g);
        r2.append(" bytes.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x036c, code lost:
    
        throw new java.lang.IllegalArgumentException(r2.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setOnFocusChangeListener(java.lang.Object[] r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.amr.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.alh
    public final byte setCompoundDrawableTintBlendMode(byte b10) throws IllegalStateException, akr {
        return ((Byte) setOnFocusChangeListener(new Object[]{this, Byte.valueOf(b10)}, 978509673, -978509671, System.identityHashCode(this))).byteValue();
    }

    @Override // com.mypinpad.tsdk.isolation.alh
    public final int setDividerPadding(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws akr {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11), bArr2, Integer.valueOf(i12)}, 1438724020, -1438724013, i10)).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aki
    public final int setY() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -919875563, 919875569, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aki
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setOnFocusChangeListener(new Object[]{this}, 805475124, -805475120, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aki
    public final int setDividerPadding(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, akr {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, bArr, Integer.valueOf(i10), bArr2, Integer.valueOf(i11)}, 731741850, -731741849, i10)).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aki
    public final void setDividerPadding(akk akkVar) throws IllegalArgumentException {
        setOnFocusChangeListener(new Object[]{this, akkVar}, 1244645420, -1244645412, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aki
    public final void setOnFocusChangeListener() {
        setOnFocusChangeListener(new Object[]{this}, 606493073, -606493070, System.identityHashCode(this));
    }
}
