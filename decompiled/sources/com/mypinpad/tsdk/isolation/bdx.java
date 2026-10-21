package com.mypinpad.tsdk.isolation;

import androidx.camera.core.processing.f;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public final class bdx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54605b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54606c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f54607a;

    public bdx(byte[] bArr) {
        if (bArr.length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int iIntValue = ((Integer) bea.setCompoundDrawableTintBlendMode(new Object[]{bArr, 0}, -1589824718, 1589824722, 0)).intValue();
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = -(-(iIntValue * (-282)));
        int i11 = (-284) ^ i10;
        int i12 = (i10 & (-284)) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = ~iIntValue;
        int i15 = (~iIntValue) & ((~iIntValue) | iIntValue);
        int i16 = (~0) & iCurrentTimeMillis;
        int i17 = ~iCurrentTimeMillis;
        int i18 = ~i16;
        int i19 = i15 ^ i18;
        int i20 = i15 & i18;
        int i21 = -(-(((i20 & i19) | (i19 ^ i20)) * (-283)));
        int i22 = i13 & i21;
        int i23 = -(-((i13 ^ i21) | i22));
        int i24 = (i22 & i23) + (i23 | i22);
        int i25 = ~i14;
        int i26 = (~((i25 & i14) | (i25 ^ i14))) * 283;
        int i27 = i24 & i26;
        int i28 = (i26 | i24) & (~i27);
        int i29 = i27 << 1;
        int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
        int i31 = (i14 & i17) | ((~i14) & iCurrentTimeMillis);
        int i32 = iCurrentTimeMillis & i14;
        int i33 = (~((i32 & i31) | (i31 ^ i32))) * 283;
        int i34 = i30 & i33;
        int i35 = ((i30 ^ i33) | i34) << 1;
        int i36 = -((i33 | i30) & (~i34));
        int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
        int iIntValue2 = ((Integer) beb.setX(new Object[]{Integer.valueOf(i37)}, -1794478525, 1794478525, i37)).intValue();
        int i38 = iIntValue * iIntValue2;
        int i39 = i38 ^ 4;
        int i40 = ((i38 & 4) | i39) << 1;
        int i41 = -i39;
        if (bArr.length != ((i40 | i41) << 1) - (i40 ^ i41)) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.f54607a = new int[iIntValue];
        int i42 = 0;
        while (i42 < iIntValue) {
            int i43 = (i42 * iIntValue2) + 4;
            this.f54607a[i42] = ((Integer) bea.setCompoundDrawableTintBlendMode(new Object[]{bArr, Integer.valueOf(i43), Integer.valueOf(iIntValue2)}, 546359863, -546359861, i43)).intValue();
            int i44 = i42 & (-5);
            i42 = (((i42 | (-5)) & (~i44)) - (~(-(-(i44 << 1))))) + 5;
        }
        if (!((Boolean) setY(new Object[]{this.f54607a}, -1043666672, 1043666674, (int) System.currentTimeMillis())).booleanValue()) {
            throw new IllegalArgumentException("invalid encoding");
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:21:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:42:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:44:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:46:0x0307  */
    /* JADX WARN: Code duplicated, block: B:49:0x0310  */
    /* JADX WARN: Code duplicated, block: B:70:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0315 A[SYNTHETIC] */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        boolean[] zArr;
        int i13;
        int i14;
        Boolean boolValueOf;
        int i15;
        int i16;
        int i17 = (i11 * Constant.ERROR_CODE_408) + (i10 * (-813));
        int i18 = ~i11;
        int i19 = ~(i18 | i10);
        int i20 = ~(i10 | i12);
        int i21 = ((i19 | i20) * (-814)) + i17;
        int i22 = ~(i18 | (~i12));
        int i23 = ~i10;
        int i24 = ~(i23 | i11);
        int i25 = (((~(i23 | i12)) | i24 | (~(i11 | i12))) * 407) + ((i22 | i24 | i20) * 407) + i21;
        if (i25 == 1) {
            bdx bdxVar = (bdx) objArr[0];
            StringBuilder sb2 = new StringBuilder(Constant.BRACKET_OPEN);
            sb2.append(bdxVar.f54607a[0]);
            String string = sb2.toString();
            int i26 = f54606c;
            int i27 = i26 & 71;
            int i28 = (i26 | 71) & (~i27);
            int i29 = i27 << 1;
            int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
            f54605b = i30 % 128;
            int i31 = i30 % 2;
            int i32 = 1;
            while (true) {
                int[] iArr = bdxVar.f54607a;
                if (i32 >= iArr.length) {
                    break;
                }
                StringBuilder sbE = f.e(string, ", ");
                sbE.append(iArr[i32]);
                string = sbE.toString();
                i32++;
                int i33 = f54605b;
                int i34 = (i33 & (-46)) | ((~i33) & 45);
                int i35 = -(-((i33 & 45) << 1));
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                f54606c = i36 % 128;
                int i37 = i36 % 2;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append(Constant.BRACKET_CLOSE);
            String string2 = sb3.toString();
            int i38 = f54606c;
            int i39 = (i38 & 65) + (i38 | 65);
            f54605b = i39 % 128;
            if (i39 % 2 == 0) {
                return string2;
            }
            int i40 = 99 / 0;
            return string2;
        }
        if (i25 == 2) {
            int[] iArr2 = (int[]) objArr[0];
            int i41 = f54605b;
            int i42 = (((i41 | 12) << 1) - (i41 ^ 12)) - 1;
            f54606c = i42 % 128;
            if (i42 % 2 == 0) {
                int length = iArr2.length;
                zArr = new boolean[length];
                i13 = length;
                i14 = 1;
            } else {
                int length2 = iArr2.length;
                zArr = new boolean[length2];
                i13 = length2;
                i14 = 0;
            }
            int i43 = (((i41 ^ 17) | (i41 & 17)) << 1) - (((~i41) & 17) | (i41 & (-18)));
            f54606c = i43 % 128;
            int i44 = i43 % 2;
            while (true) {
                if (i14 >= i13) {
                    int i45 = f54605b;
                    int i46 = i45 & 89;
                    int i47 = i46 + ((i45 ^ 89) | i46);
                    f54606c = i47 % 128;
                    if (i47 % 2 == 0) {
                        throw null;
                    }
                    boolValueOf = Boolean.TRUE;
                    break;
                }
                int i48 = f54606c;
                int i49 = i48 & 31;
                int i50 = -(-((i48 ^ 31) | i49));
                int i51 = ((i49 | i50) << 1) - (i49 ^ i50);
                f54605b = i51 % 128;
                if (i51 % 2 != 0) {
                    int i52 = 93 / 0;
                    if (iArr2[i14] >= 0) {
                        i15 = iArr2[i14];
                        if (i15 < i13) {
                            int i53 = i48 ^ 79;
                            int i54 = -(-((i48 & 79) << 1));
                            i16 = ((i53 | i54) << 1) - (i53 ^ i54);
                            f54605b = i16 % 128;
                            if (i16 % 2 != 0) {
                                int i55 = 65 / 0;
                                if (zArr[i15]) {
                                    zArr[i15] = true;
                                    int i56 = i14 & 1;
                                    i14 = ((i14 | 1) & (~i56)) + (i56 << 1);
                                    int i57 = i48 & 69;
                                    int i58 = -(-((i48 ^ 69) | i57));
                                    int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                                    f54605b = i59 % 128;
                                    int i60 = i59 % 2;
                                }
                            } else if (zArr[i15]) {
                                zArr[i15] = true;
                                int i510 = i14 & 1;
                                i14 = ((i14 | 1) & (~i510)) + (i510 << 1);
                                int i511 = i48 & 69;
                                int i512 = -(-((i48 ^ 69) | i511));
                                int i513 = (i511 ^ i512) + ((i512 & i511) << 1);
                                f54605b = i513 % 128;
                                int i61 = i513 % 2;
                            }
                        }
                    }
                } else if (iArr2[i14] >= 0) {
                    i15 = iArr2[i14];
                    if (i15 < i13) {
                        int i514 = i48 ^ 79;
                        int i515 = -(-((i48 & 79) << 1));
                        i16 = ((i514 | i515) << 1) - (i514 ^ i515);
                        f54605b = i16 % 128;
                        if (i16 % 2 != 0) {
                            int i516 = 65 / 0;
                            if (zArr[i15]) {
                                zArr[i15] = true;
                                int i517 = i14 & 1;
                                i14 = ((i14 | 1) & (~i517)) + (i517 << 1);
                                int i518 = i48 & 69;
                                int i519 = -(-((i48 ^ 69) | i518));
                                int i5110 = (i518 ^ i519) + ((i519 & i518) << 1);
                                f54605b = i5110 % 128;
                                int i62 = i5110 % 2;
                            }
                        } else if (zArr[i15]) {
                            zArr[i15] = true;
                            int i5111 = i14 & 1;
                            i14 = ((i14 | 1) & (~i5111)) + (i5111 << 1);
                            int i5112 = i48 & 69;
                            int i5113 = -(-((i48 ^ 69) | i5112));
                            int i5114 = (i5112 ^ i5113) + ((i5113 & i5112) << 1);
                            f54605b = i5114 % 128;
                            int i63 = i5114 % 2;
                        }
                    }
                }
                int i64 = f54605b;
                int i65 = ((i64 | 11) << 1) - (i64 ^ 11);
                f54606c = i65 % 128;
                int i66 = i65 % 2;
                boolValueOf = Boolean.FALSE;
                break;
            }
        }
        if (i25 == 3) {
            bdx bdxVar2 = (bdx) objArr[0];
            int i67 = f54606c;
            int i68 = i67 & 107;
            int i69 = (i67 ^ 107) | i68;
            int i70 = (i68 & i69) + (i69 | i68);
            f54605b = i70 % 128;
            int i71 = i70 % 2;
            int[] iArr3 = bdxVar2.f54607a;
            Object[] objArr2 = new Object[1];
            if (i71 == 0) {
                objArr2[0] = iArr3;
                return Integer.valueOf(((Integer) bek.setOnFocusChangeListener(objArr2, 2105780221, -2105780203, (int) System.currentTimeMillis())).intValue());
            }
            objArr2[0] = iArr3;
            ((Integer) bek.setOnFocusChangeListener(objArr2, 2105780221, -2105780203, (int) System.currentTimeMillis())).intValue();
            throw null;
        }
        if (i25 != 4) {
            bdx bdxVar3 = (bdx) objArr[0];
            int i72 = f54605b;
            int i73 = i72 ^ 19;
            int i74 = (((i72 & 19) | i73) << 1) - i73;
            f54606c = i74 % 128;
            int i75 = i74 % 2;
            int length3 = bdxVar3.f54607a.length;
            int i76 = ((length3 ^ (-1)) | length3) << 1;
            int i77 = -(~length3);
            int i78 = (i76 ^ i77) + ((i76 & i77) << 1);
            int iIntValue = ((Integer) beb.setX(new Object[]{Integer.valueOf(i78)}, -1794478525, 1794478525, i78)).intValue();
            int i79 = length3 * iIntValue;
            int iIdentityHashCode = System.identityHashCode(bdxVar3);
            int i80 = i79 * 483;
            int i81 = i80 & 968;
            int i82 = i81 + ((i80 ^ 968) | i81);
            int i83 = ~i79;
            int i84 = ~i79;
            int i85 = i84 | i79;
            int i86 = i83 & i85;
            int i87 = -5;
            int i88 = (i86 & (-5)) | (i86 ^ (-5));
            int i89 = ((~i88) | i88) & (~i88);
            int i90 = (~i79) & i85;
            int i91 = ~iIdentityHashCode;
            int i92 = i90 & i91;
            int i93 = (~i92) & (i90 | i91);
            int i94 = ~((i93 & i92) | (i93 ^ i92));
            int i95 = (i82 - (~(-(-(((i94 & i89) | (i89 ^ i94)) * (-241)))))) - 1;
            int i96 = i79 ^ 4;
            int i97 = i79 & 4;
            int i98 = -(-(((i96 & i97) | (i96 ^ i97)) * (-482)));
            int i99 = (i95 & i98) + (i98 | i95);
            int i100 = ((-5) & i84) | (i79 & 4);
            int i101 = i79 & (-5);
            int i102 = ~((i100 & i101) | (i100 ^ i101));
            int i103 = (~iIdentityHashCode) & (iIdentityHashCode | i91);
            int i104 = (i103 & i84) | (i84 ^ i103);
            int i105 = (i104 & (-5)) | ((~i104) & 4);
            int i106 = i104 & 4;
            int i107 = ~((i106 & i105) | (i105 ^ i106));
            int i108 = i102 ^ i107;
            int i109 = i102 & i107;
            int i110 = ((i109 & i108) | (i108 ^ i109)) * 241;
            byte[] bArr = new byte[(((i99 ^ i110) | (i99 & i110)) << 1) - ((i110 & (~i99)) | ((~i110) & i99))];
            bea.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(length3), bArr, 0}, 518212810, -518212810, length3);
            int i111 = f54605b;
            int i112 = ((i111 ^ 30) + ((i111 & 30) << 1)) - 1;
            f54606c = i112 % 128;
            int i113 = i112 % 2;
            int i114 = 0;
            while (i114 < length3) {
                int i115 = f54606c;
                int i116 = ((i115 ^ 68) + ((i115 & 68) << 1)) - 1;
                f54605b = i116 % 128;
                int i117 = i116 % 2;
                int i118 = bdxVar3.f54607a[i114];
                int i119 = i114 * iIntValue;
                int iIdentityHashCode2 = System.identityHashCode(bdxVar3);
                int i120 = i119 * 491;
                int i121 = i120 ^ (-1956);
                int i122 = (((i120 & (-1956)) | i121) << 1) - i121;
                int i123 = ~i119;
                int i124 = i123 & (-5);
                int i125 = ((i123 | i87) & (~i124)) | i124;
                int i126 = ~iIdentityHashCode2;
                int i127 = (i122 - (~(-(-(((i125 & i126) | (i125 ^ i126)) * (-490)))))) - 1;
                int i128 = i87 & i119;
                int i129 = (~i128) & (i87 | i119);
                int i130 = ~i119;
                int i131 = ~((i129 ^ i128) | (i128 & i129));
                int i132 = i87 ^ iIdentityHashCode2;
                int i133 = iIdentityHashCode2 & i87;
                int i134 = (i132 ^ i133) | (i133 & i132);
                int i135 = (i134 | (~i134)) & (~i134);
                int i136 = i131 ^ i135;
                int i137 = i135 & i131;
                int i138 = ((i137 & i136) | (i136 ^ i137)) * 490;
                bea.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i118), bArr, Integer.valueOf(((-1) << 1) - ((((i127 & i138) + (i138 | i127)) - (~(((i119 | i130) & (~i119)) * 490))) ^ (-1))), Integer.valueOf(iIntValue)}, -64321997, 64322002, i118);
                int i139 = i114 | (-16);
                int i140 = (i139 << 1) - ((~(i114 & (-16))) & i139);
                int i141 = i140 | 17;
                i114 = (i141 << 1) - (i141 & (~(i140 & 17)));
                int i142 = f54606c;
                int i143 = i142 | 51;
                int i144 = i143 << 1;
                int i145 = -((~(i142 & 51)) & i143);
                int i146 = (i144 & i145) + (i145 | i144);
                f54605b = i146 % 128;
                int i147 = i146 % 2;
                i87 = -5;
            }
            int i148 = f54605b + 65;
            f54606c = i148 % 128;
            int i149 = i148 % 2;
            return bArr;
        }
        bdx bdxVar4 = (bdx) objArr[0];
        Object obj = objArr[1];
        int i150 = f54605b;
        int i151 = i150 & 63;
        int i152 = i151 + ((i150 ^ 63) | i151);
        f54606c = i152 % 128;
        if (i152 % 2 == 0) {
            int i153 = 45 / 0;
            if (!(!(obj instanceof bdx))) {
                boolean zBooleanValue = ((Boolean) bds.setCompoundDrawableTintBlendMode(new Object[]{bdxVar4.f54607a, ((bdx) obj).f54607a}, -134876455, 134876455, (int) System.currentTimeMillis())).booleanValue();
                int i154 = f54605b;
                int i155 = (i154 ^ 33) + ((i154 & 33) << 1);
                f54606c = i155 % 128;
                int i156 = i155 % 2;
                boolValueOf = Boolean.valueOf(zBooleanValue);
            } else {
                int i157 = (i150 & (-76)) | ((~i150) & 75);
                int i158 = (i150 & 75) << 1;
                int i159 = (i157 & i158) + (i157 | i158);
                f54606c = i159 % 128;
                int i160 = i159 % 2;
                boolValueOf = Boolean.FALSE;
            }
        } else if (obj instanceof bdx) {
            boolean zBooleanValue2 = ((Boolean) bds.setCompoundDrawableTintBlendMode(new Object[]{bdxVar4.f54607a, ((bdx) obj).f54607a}, -134876455, 134876455, (int) System.currentTimeMillis())).booleanValue();
            int i1510 = f54605b;
            int i1511 = (i1510 ^ 33) + ((i1510 & 33) << 1);
            f54606c = i1511 % 128;
            int i1512 = i1511 % 2;
            boolValueOf = Boolean.valueOf(zBooleanValue2);
        } else {
            int i1513 = (i150 & (-76)) | ((~i150) & 75);
            int i1514 = (i150 & 75) << 1;
            int i1515 = (i1513 & i1514) + (i1513 | i1514);
            f54606c = i1515 % 128;
            int i161 = i1515 % 2;
            boolValueOf = Boolean.FALSE;
        }
        return boolValueOf;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setY(new Object[]{this, obj}, 1967868755, -1967868751, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, -126989978, 126989981, System.identityHashCode(this))).intValue();
    }

    public final byte[] setX() {
        return (byte[]) setY(new Object[]{this}, -794480986, 794480986, System.identityHashCode(this));
    }

    public final String toString() {
        return (String) setY(new Object[]{this}, -1886685361, 1886685362, System.identityHashCode(this));
    }
}
