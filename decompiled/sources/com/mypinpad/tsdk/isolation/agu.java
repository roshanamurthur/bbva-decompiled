package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes10.dex */
public final class agu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52627c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f52628d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52630b = 0;

    public agu(String str) {
        this.f52629a = str;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = (((~((~i10) | i12)) | i13) * (-318)) + (i11 * (-317)) + (i10 * 319);
        int i15 = ~(i13 | i12);
        int i16 = ~i12;
        if ((((~(i10 | i11 | i12)) | (~(i13 | i16 | i10))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + ((i15 | (~(i16 | i10 | i11))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + i14 != 1) {
            agu aguVar = (agu) objArr[0];
            int i17 = f52627c + 5;
            int i18 = i17 % 128;
            f52628d = i18;
            int i19 = i17 % 2;
            if (aguVar.f52630b == -1) {
                int i20 = i18 & 39;
                int i21 = (((i18 ^ 39) | i20) << 1) - ((~i20) & (i18 | 39));
                f52627c = i21 % 128;
                int i22 = i21 % 2;
                return Boolean.FALSE;
            }
            System.identityHashCode(aguVar);
            System.identityHashCode(aguVar);
            int i23 = f52628d;
            int i24 = ((i23 & 10) + (i23 | 10)) - 1;
            f52627c = i24 % 128;
            int i25 = i24 % 2;
            return true;
        }
        agu aguVar2 = (agu) objArr[0];
        int i26 = f52628d;
        int i27 = ((i26 & 93) - (~(i26 | 93))) - 1;
        int i28 = i27 % 128;
        f52627c = i28;
        if (i27 % 2 != 0) {
            int i29 = aguVar2.f52630b;
            throw null;
        }
        int i30 = aguVar2.f52630b;
        if (i30 == -1) {
            int i31 = (i28 | 107) << 1;
            int i32 = -(i28 ^ 107);
            int i33 = (i31 & i32) + (i31 | i32);
            f52628d = i33 % 128;
            int i34 = i33 % 2;
            return null;
        }
        String str = aguVar2.f52629a;
        int iIndexOf = str.indexOf(46, i30);
        if (iIndexOf == -1) {
            int i35 = f52628d;
            int i36 = (((i35 ^ 65) | (i35 & 65)) << 1) - (((~i35) & 65) | (i35 & (-66)));
            f52627c = i36 % 128;
            int i37 = i36 % 2;
            String strSubstring = str.substring(aguVar2.f52630b);
            aguVar2.f52630b = -1;
            if (i37 != 0) {
                int i38 = 88 / 0;
            }
            int i39 = f52627c;
            int i40 = i39 & 61;
            int i41 = (((i39 | 61) & (~i40)) - (~(i40 << 1))) - 1;
            f52628d = i41 % 128;
            if (i41 % 2 == 0) {
                int i42 = 26 / 0;
            }
            return strSubstring;
        }
        String strSubstring2 = str.substring(aguVar2.f52630b, iIndexOf);
        int iIdentityHashCode = System.identityHashCode(aguVar2);
        int i43 = 613 - (~(-(~(iIndexOf * (-613)))));
        int i44 = ~((-2) | iIndexOf);
        int i45 = iIdentityHashCode ^ i44;
        int i46 = i44 & iIdentityHashCode;
        int i47 = (i46 & i45) | (i45 ^ i46);
        int i48 = ~iIndexOf;
        int i49 = (i48 | iIndexOf) & i48;
        int i50 = i49 & (-2);
        int i51 = ((~i49) & 1) | i50;
        int i52 = i49 & 1;
        int i53 = ~((i51 & i52) | (i51 ^ i52));
        int i54 = i47 & i53;
        int i55 = (i47 | i53) & (~i54);
        int i56 = (i43 - (~(-(-(((i55 & i54) | (i55 ^ i54)) * 614))))) - 1;
        int i57 = ~iIdentityHashCode;
        int i58 = ~i57;
        int i59 = i57 & 1;
        int i60 = ((-2) & i58) | i59;
        int i61 = (-2) & i57;
        int i62 = (i60 ^ i61) | (i60 & i61);
        int i63 = ~i62;
        int i64 = i63 & (i62 | i63);
        int i65 = ((-2) & i48) | (iIndexOf & 1) | ((-2) & iIndexOf);
        int i66 = ~i65;
        int i67 = i66 & (i65 | i66);
        int i68 = i64 & i67;
        int i69 = (~i68) & (i64 | i67);
        int i70 = (iIdentityHashCode | i57) & i57;
        int i71 = ((i69 & i68) | (i69 ^ i68) | (~((i70 ^ iIndexOf) | (i70 & iIndexOf)))) * (-1228);
        int i72 = i56 & i71;
        int i73 = (((i71 | i56) & (~i72)) - (~(-(-(i72 << 1))))) - 1;
        int i74 = ~(i70 | ((-2) ^ i49) | i50);
        int i75 = i61 | (i58 & 1);
        int i76 = (i75 & i59) | (i75 ^ i59);
        int i77 = (i76 & i48) | ((~i76) & iIndexOf);
        int i78 = iIndexOf & i76;
        int i79 = ~((i78 & i77) | (i77 ^ i78));
        int i80 = ((~i79) & i74) | ((~i74) & i79);
        int i81 = i74 & i79;
        int i82 = -(-(((i81 & i80) | (i80 ^ i81)) * 614));
        int i83 = ((i73 ^ i82) | (i73 & i82)) << 1;
        int i84 = -((i82 & (~i73)) | ((~i82) & i73));
        aguVar2.f52630b = ((i83 | i84) << 1) - (i84 ^ i83);
        int iIdentityHashCode2 = System.identityHashCode(aguVar2);
        int i85 = ~iIdentityHashCode2;
        int i86 = (iIdentityHashCode2 & (-771915841)) | ((-771915841) ^ iIdentityHashCode2);
        int i87 = ~i86;
        int i88 = (i86 | i87) & i87;
        int i89 = 25237042 & i88;
        int i90 = -(-((((i88 | 25237042) & (~i89)) | i89) * (-756)));
        int i91 = 605479309 & i90;
        int i92 = -(-((i90 ^ 605479309) | i91));
        int i93 = (i91 ^ i92) + ((i92 & i91) << 1);
        int i94 = (-771915841) ^ i85;
        int i95 = (-771915841) & i85;
        int i96 = ((i94 & i95) | (i94 ^ i95)) * 756;
        int i97 = i93 & i96;
        int i98 = (i96 | i93) & (~i97);
        int i99 = i97 << 1;
        int i100 = (i98 & i99) + (i98 | i99);
        int iIdentityHashCode3 = System.identityHashCode(aguVar2);
        int i101 = ~iIdentityHashCode3;
        int i102 = (-272729113) & i101;
        int i103 = (iIdentityHashCode3 & 272729112) | i102;
        int i104 = (-272729113) & iIdentityHashCode3;
        int i105 = ~((i103 & i104) | (i103 ^ i104));
        int i106 = ~i101;
        int i107 = (1740536736 & i106) | ((-1740536737) & i101);
        int i108 = 1740536736 & i101;
        int i109 = (i108 & i107) | (i107 ^ i108);
        int i110 = ~((i109 & 373943704) | (i109 ^ 373943704));
        int i111 = i105 & i110;
        int i112 = (i105 | i110) & (~i111);
        int i113 = 1768546894 - (~(((i112 & i111) | (i112 ^ i111)) * 920));
        int i114 = ~(((-373943705) & i101) | ((-373943705) ^ i101));
        int i115 = -(~(((i114 & 272729112) | (272729112 ^ i114)) * 920));
        int i116 = ((i113 ^ i115) + ((i115 & i113) << 1)) - 1;
        int i117 = ~(((-272729113) & i106) | (272729112 & i101) | i102);
        int i118 = ((-101214593) & iIdentityHashCode3) | ((-101214593) & i101) | (101214592 & iIdentityHashCode3);
        int i119 = ~i118;
        int i120 = (i118 | i119) & i119;
        int i121 = (i117 & i120) | (i117 ^ i120);
        int i122 = (i101 & 2013265848) | ((-2013265849) & iIdentityHashCode3);
        int i123 = iIdentityHashCode3 & 2013265848;
        int i124 = (i123 & i122) | (i122 ^ i123);
        int i125 = ~i124;
        int i126 = (i124 | i125) & i125;
        int i127 = i121 & i126;
        int i128 = (i126 | i121) & (~i127);
        int i129 = -(~(-(-(((i128 & i127) | (i128 ^ i127)) * 920))));
        if (i100 > (((i116 | i129) << 1) - (i129 ^ i116)) - 1) {
            return strSubstring2;
        }
        throw null;
    }

    public final String setCompoundDrawableTintBlendMode() {
        return (String) setY(new Object[]{this}, -2052331817, 2052331818, System.identityHashCode(this));
    }

    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setY(new Object[]{this}, -915170519, 915170519, System.identityHashCode(this))).booleanValue();
    }
}
