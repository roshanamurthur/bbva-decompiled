package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;

/* JADX INFO: loaded from: classes10.dex */
public final class bfh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54697a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54698b = 1;

    /* JADX WARN: Code duplicated, block: B:34:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:37:0x01e9  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        Object objValueOf;
        int i15;
        int i16 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i10 * (-519));
        int i17 = ~i10;
        int i18 = ~i11;
        int i19 = ~i12;
        int i20 = (((~(i11 | i12)) | (~(i17 | i18 | i19))) * 520) + i16;
        int i21 = ~(i18 | i19);
        int i22 = ~(i12 | i10);
        int i23 = (((~(i10 | i18)) | (~(i17 | i19)) | i22) * 520) + ((i21 | i22) * (-1040)) + i20;
        if (i23 == 1) {
            bfh bfhVar = (bfh) objArr[0];
            int i24 = f54697a;
            int i25 = ((i24 ^ 29) - (~((i24 & 29) << 1))) - 1;
            f54698b = i25 % 128;
            int i26 = i25 % 2;
            bfhVar.getClass();
            int i27 = f54697a;
            int i28 = i27 ^ 55;
            int i29 = (((i27 & 55) | i28) << 1) - i28;
            f54698b = i29 % 128;
            if (i29 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (i23 == 2) {
            bfh bfhVar2 = (bfh) objArr[0];
            Object obj = objArr[1];
            int i30 = f54698b;
            int i31 = ((3 & (~i30)) | (i30 & (-4))) + ((i30 & 3) << 1);
            int i32 = i31 % 128;
            f54697a = i32;
            int i33 = i31 % 2;
            if (!(!(obj instanceof bfh))) {
                bfh bfhVar3 = (bfh) obj;
                if (bfhVar3 != bfhVar2) {
                    int i34 = i32 + 109;
                    f54698b = i34 % 128;
                    int i35 = i34 % 2;
                    bfhVar2.getClass();
                    bfhVar3.getClass();
                    Object[] objArr2 = new Object[2];
                    if (i35 == 0) {
                        objArr2[0] = null;
                        objArr2[1] = null;
                        ((Boolean) setX(objArr2, 680986937, -680986933, (int) System.currentTimeMillis())).booleanValue();
                        throw null;
                    }
                    objArr2[0] = null;
                    objArr2[1] = null;
                    if (!(!((Boolean) setX(objArr2, 680986937, -680986933, (int) System.currentTimeMillis())).booleanValue())) {
                        int i36 = f54697a;
                        int i37 = (i36 & 2) + (i36 | 2);
                        int i38 = (i37 ^ (-1)) + (i37 << 1);
                        f54698b = i38 % 128;
                        int i39 = i38 % 2;
                        if (((Boolean) setX(new Object[]{null, null}, 680986937, -680986933, (int) System.currentTimeMillis())).booleanValue()) {
                        }
                    }
                    int i40 = f54697a;
                    i13 = (i40 & (-22)) | ((~i40) & 21);
                    i14 = (i40 & 21) << 1;
                }
                int i41 = f54698b + 49;
                f54697a = i41 % 128;
                if (i41 % 2 != 0) {
                    int i42 = 40 / 0;
                }
                objValueOf = Boolean.TRUE;
            } else {
                int i43 = i30 + 59;
                int i44 = i43 % 128;
                f54697a = i44;
                int i45 = i43 % 2;
                i13 = i44 & 89;
                i14 = i44 | 89;
            }
            int i46 = i13 + i14;
            f54698b = i46 % 128;
            int i47 = i46 % 2;
            objValueOf = Boolean.FALSE;
        } else {
            if (i23 == 3) {
                bfh bfhVar4 = (bfh) objArr[0];
                int i48 = f54697a + 23;
                f54698b = i48 % 128;
                int i49 = i48 % 2;
                bfhVar4.getClass();
                if (i49 == 0) {
                    throw null;
                }
                int i50 = f54697a + 70;
                int i51 = (i50 ^ (-1)) + (i50 << 1);
                f54698b = i51 % 128;
                if (i51 % 2 != 0) {
                    return null;
                }
                int i52 = 37 / 0;
                return null;
            }
            if (i23 == 4) {
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                int i53 = f54698b;
                int i54 = i53 + 1;
                f54697a = i54 % 128;
                if (i54 % 2 != 0) {
                    throw null;
                }
                if (str == str2) {
                    int i55 = i53 & 35;
                    int i56 = (((~i55) & (i53 | 35)) - (~(i55 << 1))) - 1;
                    f54697a = i56 % 128;
                    int i57 = i56 % 2;
                    objValueOf = Boolean.TRUE;
                } else if (str != null) {
                    int i58 = i53 & 75;
                    int i59 = -(-((i53 ^ 75) | i58));
                    int i60 = (i58 & i59) + (i59 | i58);
                    f54697a = i60 % 128;
                    if (i60 % 2 != 0) {
                        throw null;
                    }
                    if (str2 == null) {
                        int i61 = f54697a;
                        int i62 = i61 & 9;
                        int i63 = (i61 | 9) & (~i62);
                        int i64 = i62 << 1;
                        i15 = ((i63 | i64) << 1) - (i63 ^ i64);
                        f54698b = i15 % 128;
                        if (i15 % 2 != 0) {
                            throw null;
                        }
                        objValueOf = Boolean.FALSE;
                    } else {
                        boolean zEquals = str.equals(str2);
                        int i65 = f54698b + 63;
                        f54697a = i65 % 128;
                        if (i65 % 2 != 0) {
                            int i66 = 21 / 0;
                        }
                        objValueOf = Boolean.valueOf(zEquals);
                    }
                } else {
                    int i67 = f54697a;
                    int i68 = i67 & 9;
                    int i69 = (i67 | 9) & (~i68);
                    int i610 = i68 << 1;
                    i15 = ((i69 | i610) << 1) - (i69 ^ i610);
                    f54698b = i15 % 128;
                    if (i15 % 2 != 0) {
                        throw null;
                    }
                    objValueOf = Boolean.FALSE;
                }
            } else {
                if (i23 != 5) {
                    bfh bfhVar5 = (bfh) objArr[0];
                    int i70 = f54698b;
                    int i71 = (((i70 | 102) << 1) - (i70 ^ 102)) - 1;
                    f54697a = i71 % 128;
                    int i72 = i71 % 2;
                    bfhVar5.getClass();
                    int iIntValue = ((Integer) setX(new Object[]{null}, -54002356, 54002361, (int) System.currentTimeMillis())).intValue();
                    int iIntValue2 = ((Integer) setX(new Object[]{null}, -54002356, 54002361, (int) System.currentTimeMillis())).intValue();
                    int i73 = iIntValue2 * 31;
                    int iIdentityHashCode = System.identityHashCode(bfhVar5);
                    int i74 = iIntValue2 * 5115;
                    int i75 = -(-(iIntValue * (-163)));
                    int i76 = i74 & i75;
                    int i77 = -(-((i74 ^ i75) | i76));
                    int i78 = (i76 & i77) + (i77 | i76);
                    int i79 = ~iIdentityHashCode;
                    int i80 = ~iIdentityHashCode;
                    int i81 = i80 | iIdentityHashCode;
                    int i82 = i79 & i81;
                    int i83 = i82 & iIntValue;
                    int i84 = (i82 | iIntValue) & (~i83);
                    int i85 = ~iIntValue;
                    int i86 = ~((i84 & i83) | (i84 ^ i83));
                    int i87 = (~i86) & i73;
                    int i88 = ~i73;
                    int i89 = ((i86 & i73) | i87 | (i86 & i88)) * (-328);
                    int i90 = i78 & i89;
                    int i91 = -(-((i89 ^ i78) | i90));
                    int i92 = (i90 ^ i91) + ((i91 & i90) << 1);
                    int i93 = -(-(((i73 & i80) | (iIdentityHashCode & i88) | (i73 & iIdentityHashCode)) * 164));
                    int i94 = i92 & i93;
                    int i95 = ((i92 ^ i93) | i94) << 1;
                    int i96 = -((i93 | i92) & (~i94));
                    int i97 = (i95 & i96) + (i96 | i95);
                    int i98 = ~i73;
                    int i99 = ~iIntValue;
                    int i100 = (i98 & i99) | (i98 ^ i99);
                    int i101 = (i100 | (~i100)) & (~i100);
                    int i102 = i99 & (i85 | iIntValue);
                    int i103 = ~((i102 & iIdentityHashCode) | (i102 ^ iIdentityHashCode));
                    int i104 = i101 & i103;
                    int i105 = ((i101 | i103) & (~i104)) | i104;
                    int i106 = (~iIdentityHashCode) & i81;
                    int i107 = (i106 & i88) | ((~i106) & i73);
                    int i108 = i106 & i73;
                    int i109 = (i108 & i107) | (i107 ^ i108);
                    int i110 = i109 ^ iIntValue;
                    int i111 = i109 & iIntValue;
                    int i112 = ~((i111 & i110) | (i110 ^ i111));
                    int i113 = i105 & i112;
                    int i114 = (i112 | i105) & (~i113);
                    int i115 = -(-(((i114 & i113) | (i114 ^ i113)) * 164));
                    int i116 = i97 & i115;
                    int i117 = (((i97 ^ i115) | i116) << 1) - ((i115 | i97) & (~i116));
                    int i118 = f54698b;
                    int i119 = i118 ^ 91;
                    int i120 = (i118 & 91) << 1;
                    int i121 = ((i119 | i120) << 1) - (i120 ^ i119);
                    f54697a = i121 % 128;
                    int i122 = i121 % 2;
                    return Integer.valueOf(i117);
                }
                String str3 = (String) objArr[0];
                int i123 = f54698b;
                int i124 = i123 & 37;
                int i125 = -(-((i123 ^ 37) | i124));
                int i126 = ((i124 | i125) << 1) - (i124 ^ i125);
                f54697a = i126 % 128;
                int i127 = i126 % 2;
                if (str3 == null) {
                    int i128 = i123 & 101;
                    int i129 = ((i123 ^ 101) | i128) << 1;
                    int i130 = -((i123 | 101) & (~i128));
                    int i131 = (i129 & i130) + (i129 | i130);
                    f54697a = i131 % 128;
                    int i132 = i131 % 2;
                    objValueOf = 1;
                } else {
                    int iHashCode = str3.hashCode();
                    int i133 = f54697a;
                    int i134 = (((i133 & (-118)) | ((~i133) & 117)) - (~((i133 & 117) << 1))) - 1;
                    f54698b = i134 % 128;
                    if (i134 % 2 == 0) {
                        throw null;
                    }
                    objValueOf = Integer.valueOf(iHashCode);
                }
            }
        }
        return objValueOf;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, 1640933602, -1640933600, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, -1214097146, 1214097146, System.identityHashCode(this))).intValue();
    }

    public final String setDividerPadding() {
        return (String) setX(new Object[]{this}, 167897119, -167897118, System.identityHashCode(this));
    }

    public final String setOnFocusChangeListener() {
        return (String) setX(new Object[]{this}, 1190698516, -1190698513, System.identityHashCode(this));
    }
}
