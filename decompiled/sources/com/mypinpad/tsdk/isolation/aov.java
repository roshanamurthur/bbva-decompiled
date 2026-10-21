package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.mastercard.sonic.androidsvg.SVGParser;
import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes10.dex */
public final class aov extends BasicPermission {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f53435r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f53436s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f53437p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f53438q0;

    public aov(String str, String str2) {
        super(str, str2);
        this.f53437p0 = str2;
        this.f53438q0 = ((Integer) setY(new Object[]{str2}, 556994400, -556994396, (int) System.currentTimeMillis())).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d8 A[PHI: r2
      0x00d8: PHI (r2v67 java.lang.String) = (r2v55 java.lang.String), (r2v105 java.lang.String) binds: [B:22:0x00ab, B:19:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:41:0x0149  */
    /* JADX WARN: Code duplicated, block: B:42:0x0152  */
    /* JADX WARN: Code duplicated, block: B:44:0x0165  */
    /* JADX WARN: Code duplicated, block: B:48:0x0185  */
    /* JADX WARN: Code duplicated, block: B:50:0x0190  */
    /* JADX WARN: Code duplicated, block: B:55:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x01be  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c7  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        String strNextToken;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25 = (i11 * (-448)) + (i10 * 450);
        int i26 = ~((~i10) | i11);
        int i27 = ~i11;
        int i28 = (((~(i10 | i27 | (~i12))) | i26) * 449) + (i26 * (-1347)) + (((~(i27 | i10 | i12)) | i26) * 449) + i25;
        boolean z10 = false;
        if (i28 == 1) {
            aov aovVar = (aov) objArr[0];
            Object obj = objArr[1];
            int i29 = f53436s0;
            int i30 = i29 + 33;
            int i31 = i30 % 128;
            f53435r0 = i31;
            int i32 = i30 % 2;
            if (obj != aovVar) {
                if (obj instanceof aov) {
                    int i33 = i31 & 61;
                    int i34 = ((~i33) & (i31 | 61)) + (i33 << 1);
                    int i35 = i34 % 128;
                    f53436s0 = i35;
                    aov aovVar2 = (aov) obj;
                    if (i34 % 2 == 0) {
                        int i36 = aovVar.f53438q0;
                        int i37 = aovVar2.f53438q0;
                        throw null;
                    }
                    if (aovVar.f53438q0 == aovVar2.f53438q0) {
                        int i38 = i35 & 85;
                        int i39 = (i38 - (~(-(-((i35 ^ 85) | i38))))) - 1;
                        f53435r0 = i39 % 128;
                        int i40 = i39 % 2;
                        if (aovVar.getName().equals(aovVar2.getName())) {
                            int i41 = (-2) - ((f53435r0 + 14) ^ (-1));
                            f53436s0 = i41 % 128;
                            if (i41 % 2 != 0) {
                                z10 = true;
                            }
                        }
                    }
                    int i42 = f53436s0;
                    int i43 = i42 & 75;
                    int i44 = (i42 ^ 75) | i43;
                    int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                    f53435r0 = i45 % 128;
                    int i46 = i45 % 2;
                } else {
                    int i47 = i29 & 53;
                    int i48 = -(-((i29 ^ 53) | i47));
                    int i49 = ((i47 | i48) << 1) - (i47 ^ i48);
                    f53435r0 = i49 % 128;
                    if (i49 % 2 != 0) {
                        throw null;
                    }
                }
                return Boolean.FALSE;
            }
            int i50 = i31 | 71;
            int i51 = (i50 << 1) - (i50 & (~(i31 & 71)));
            int i52 = i51 % 128;
            f53436s0 = i52;
            z10 = i51 % 2 != 0;
            int i53 = i52 & 59;
            int i54 = (i52 | 59) & (~i53);
            int i55 = -(-(i53 << 1));
            int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
            f53435r0 = i56 % 128;
            int i57 = i56 % 2;
            return Boolean.valueOf(z10);
        }
        if (i28 == 2) {
            aov aovVar3 = (aov) objArr[0];
            int i58 = f53435r0;
            int i59 = (((i58 ^ 31) | (i58 & 31)) << 1) - (((~i58) & 31) | (i58 & (-32)));
            f53436s0 = i59 % 128;
            int i60 = i59 % 2;
            int iHashCode = aovVar3.getName().hashCode();
            int iIdentityHashCode = System.identityHashCode(aovVar3);
            int i61 = aovVar3.f53438q0;
            int i62 = ((i61 * (-949)) - (~(iHashCode * (-949)))) - 1;
            int i63 = ~iHashCode;
            int i64 = ~iIdentityHashCode;
            int i65 = ~((i63 ^ i64) | (i63 & i64));
            int i66 = ~i61;
            int i67 = i66 & i64;
            int i68 = ((~i66) & iIdentityHashCode) | i67;
            int i69 = i66 & iIdentityHashCode;
            int i70 = ~((i68 & i69) | (i68 ^ i69));
            int i71 = ((~i70) & i65) | ((~i65) & i70);
            int i72 = i65 & i70;
            int i73 = ((i72 & i71) | (i71 ^ i72)) * ReturnCode.ERR_REPOSITORY;
            int i74 = i62 & i73;
            int i75 = (i62 | i73) & (~i74);
            int i76 = i74 << 1;
            int i77 = (i75 & i76) + (i75 | i76);
            int i78 = ((~i64) & i61) | i67;
            int i79 = i64 & i61;
            int i80 = (i78 & i79) | (i78 ^ i79);
            int i81 = ~i80;
            int i82 = (i80 | i81) & i81;
            int i83 = iHashCode & iIdentityHashCode;
            int i84 = i83 | ((~i83) & (iHashCode | iIdentityHashCode));
            int i85 = ~i84;
            int i86 = -(~((i82 | ((i84 | i85) & i85)) * (-950)));
            int i87 = (((i77 | i86) << 1) - (i86 ^ i77)) - 1;
            int i88 = (i64 | iIdentityHashCode) & i64;
            int i89 = (i63 & i88) | ((~i88) & iHashCode);
            int i90 = iHashCode & i88;
            int i91 = ~((i90 & i89) | (i89 ^ i90));
            int i92 = i79 | i69;
            int i93 = i61 & iIdentityHashCode;
            int i94 = (i93 & i92) | (i92 ^ i93);
            int i95 = ~i94;
            int i96 = (((i94 | i95) & i95) | i91) * 950;
            int i97 = (i87 & i96) + (i96 | i87);
            int i98 = f53436s0;
            int i99 = ((i98 | 113) << 1) - (i98 ^ 113);
            f53435r0 = i99 % 128;
            if (i99 % 2 == 0) {
                return Integer.valueOf(i97);
            }
            throw null;
        }
        if (i28 == 3) {
            aov aovVar4 = (aov) objArr[0];
            Permission permission = (Permission) objArr[1];
            int i100 = f53436s0;
            int i101 = i100 ^ 111;
            int i102 = ((i100 & 111) | i101) << 1;
            int i103 = -i101;
            int i104 = ((i102 | i103) << 1) - (i103 ^ i102);
            f53435r0 = i104 % 128;
            int i105 = i104 % 2;
            if (!(!(permission instanceof aov))) {
                if (aovVar4.getName().equals(permission.getName())) {
                    int i106 = aovVar4.f53438q0;
                    int i107 = ((aov) permission).f53438q0;
                    if ((i106 & i107) == i107) {
                        System.identityHashCode(aovVar4);
                        System.identityHashCode(aovVar4);
                        int i108 = f53436s0;
                        int i109 = i108 & 77;
                        int i110 = -(-((i108 ^ 77) | i109));
                        int i111 = ((i109 | i110) << 1) - (i110 ^ i109);
                        f53435r0 = i111 % 128;
                        if (i111 % 2 == 0) {
                            return Boolean.TRUE;
                        }
                        throw null;
                    }
                    i13 = f53435r0 + 11;
                    f53436s0 = i13 % 128;
                } else {
                    int i112 = f53435r0;
                    int i113 = ((i112 | 103) << 1) - (i112 ^ 103);
                    f53436s0 = i113 % 128;
                    int i114 = i113 % 2;
                }
                return Boolean.FALSE;
            }
            int i115 = i100 ^ 31;
            int i116 = ((i100 & 31) | i115) << 1;
            int i117 = -i115;
            int i118 = (i116 & i117) + (i117 | i116);
            f53435r0 = i118 % 128;
            int i119 = i118 % 2;
            int i120 = i100 & 63;
            i13 = ((((i100 ^ 63) | i120) << 1) - (~(-((~i120) & (i100 | 63))))) - 1;
            f53435r0 = i13 % 128;
            int i121 = i13 % 2;
            return Boolean.FALSE;
        }
        if (i28 != 4) {
            aov aovVar5 = (aov) objArr[0];
            int i122 = f53435r0;
            int i123 = i122 & 19;
            int i124 = -(-(i122 | 19));
            int i125 = (i123 ^ i124) + ((i124 & i123) << 1);
            f53436s0 = i125 % 128;
            int i126 = i125 % 2;
            String str = aovVar5.f53437p0;
            if (i126 != 0) {
                return str;
            }
            throw null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer((String) bez.setX(new Object[]{(String) objArr[0]}, 2131988623, -2131988618, (int) System.currentTimeMillis()), " ,");
        int i127 = f53436s0;
        int i128 = i127 & 3;
        int i129 = (i127 | 3) & (~i128);
        int i130 = -(-(i128 << 1));
        int i131 = (i129 ^ i130) + ((i129 & i130) << 1);
        f53435r0 = i131 % 128;
        int i132 = i131 % 2;
        int i133 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            int i134 = f53436s0;
            int i135 = ((i134 | 27) << 1) - (i134 ^ 27);
            f53435r0 = i135 % 128;
            if (i135 % 2 != 0) {
                strNextToken = stringTokenizer.nextToken();
                int i136 = 38 / 0;
                if (!(!strNextToken.equals("threadlocalecimplicitlyca"))) {
                    int i137 = f53435r0;
                    int i138 = (((i137 | 27) << 1) - (~(-((27 & (~i137)) | (i137 & (-28)))))) - 1;
                    f53436s0 = i138 % 128;
                    int i139 = i138 % 2;
                    int i140 = i133 ^ 1;
                    int i141 = i133 & 1;
                    i133 = (i141 & i140) | (i140 ^ i141);
                    int i142 = ((i137 | 26) << 1) - (i137 ^ 26);
                    i14 = (i142 ^ (-1)) + (i142 << 1);
                    f53436s0 = i14 % 128;
                    int i143 = i14 % 2;
                } else {
                    if (!strNextToken.equals("ecimplicitlyca")) {
                        int i144 = f53436s0;
                        int i145 = ((i144 ^ 97) | (i144 & 97)) << 1;
                        int i146 = -((i144 & (-98)) | ((~i144) & 97));
                        int i147 = ((i145 | i146) << 1) - (i145 ^ i146);
                        f53435r0 = i147 % 128;
                        int i148 = i147 % 2;
                        int i149 = i133 & 2;
                        int i150 = (i133 | 2) & (~i149);
                        i133 = (i150 & i149) | (i150 ^ i149);
                        i15 = ((i144 ^ 102) + ((i144 & 102) << 1)) - 1;
                    } else if (strNextToken.equals("threadlocaldhdefaultparams")) {
                        int i151 = f53436s0;
                        int i152 = i151 & 43;
                        int i153 = i151 | 43;
                        i16 = ((i152 | i153) << 1) - (i153 ^ i152);
                        f53435r0 = i16 % 128;
                        if (i16 % 2 != 0) {
                            i133 = (i133 & 5) | (i133 ^ 5);
                        } else {
                            int i154 = i133 & 4;
                            int i155 = (i133 | 4) & (~i154);
                            i133 = (i155 & i154) | (i155 ^ i154);
                        }
                    } else if (!(!strNextToken.equals("dhdefaultparams"))) {
                        int i156 = f53436s0;
                        int i157 = i156 + 9;
                        f53435r0 = i157 % 128;
                        int i158 = i157 % 2;
                        i133 |= 8;
                        int i159 = (i156 & (-124)) | ((~i156) & 123);
                        int i160 = (i156 & 123) << 1;
                        int i161 = (i159 & i160) + (i160 | i159);
                        f53435r0 = i161 % 128;
                        int i162 = i161 % 2;
                    } else {
                        if (strNextToken.equals("acceptableeccurves")) {
                            i17 = f53436s0 + 115;
                            int i163 = i17 % 128;
                            f53435r0 = i163;
                            if (i17 % 2 != 0) {
                                int i164 = i133 ^ 121;
                                int i165 = i133 & 121;
                                i133 = (i165 & i164) | (i164 ^ i165);
                            } else {
                                int i166 = i133 & 16;
                                i133 = ((i133 | 16) & (~i166)) | i166;
                            }
                            i14 = (-2) - ((((i163 | 66) << 1) - (i163 ^ 66)) ^ (-1));
                            f53436s0 = i14 % 128;
                        } else if (strNextToken.equals("additionalecparameters")) {
                            int i167 = f53436s0;
                            i21 = (((i167 & (-66)) | ((~i167) & 65)) - (~(-(-((i167 & 65) << 1))))) - 1;
                            f53435r0 = i21 % 128;
                            if (i21 % 2 != 0) {
                                i22 = i133 & 33;
                                i23 = ~i22;
                                i24 = i133 | 33;
                            } else {
                                i22 = i133 & 32;
                                i23 = ~i22;
                                i24 = i133 | 32;
                            }
                            int i168 = i24 & i23;
                            i133 = (i168 & i22) | (i168 ^ i22);
                            i15 = (i167 & 25) + (i167 | 25);
                        } else {
                            if (strNextToken.equals(SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL)) {
                                int i169 = f53435r0;
                                int i170 = i169 & 33;
                                int i171 = (i169 | 33) & (~i170);
                                int i172 = i170 << 1;
                                i18 = (i171 & i172) + (i171 | i172);
                                f53436s0 = i18 % 128;
                                if (i18 % 2 == 0) {
                                    int i173 = i133 ^ 27;
                                    int i174 = i133 & 27;
                                    i19 = i173 ^ i174;
                                    i20 = i174 & i173;
                                } else {
                                    int i175 = i133 & 63;
                                    int i176 = (i133 | 63) & (~i175);
                                    i19 = i176 ^ i175;
                                    i20 = i176 & i175;
                                }
                                i133 = i20 | i19;
                            }
                            i14 = f53436s0 + 9;
                            f53435r0 = i14 % 128;
                        }
                        int i1410 = i14 % 2;
                    }
                    f53435r0 = i15 % 128;
                    int i177 = i15 % 2;
                }
            } else {
                strNextToken = stringTokenizer.nextToken();
                if (strNextToken.equals("threadlocalecimplicitlyca")) {
                    int i1310 = f53435r0;
                    int i1311 = (((i1310 | 27) << 1) - (~(-((27 & (~i1310)) | (i1310 & (-28)))))) - 1;
                    f53436s0 = i1311 % 128;
                    int i1312 = i1311 % 2;
                    int i1411 = i133 ^ 1;
                    int i1412 = i133 & 1;
                    i133 = (i1412 & i1411) | (i1411 ^ i1412);
                    int i1413 = ((i1310 | 26) << 1) - (i1310 ^ 26);
                    i14 = (i1413 ^ (-1)) + (i1413 << 1);
                    f53436s0 = i14 % 128;
                    int i1414 = i14 % 2;
                } else {
                    if (!strNextToken.equals("ecimplicitlyca")) {
                        int i1415 = f53436s0;
                        int i1416 = ((i1415 ^ 97) | (i1415 & 97)) << 1;
                        int i1417 = -((i1415 & (-98)) | ((~i1415) & 97));
                        int i1418 = ((i1416 | i1417) << 1) - (i1416 ^ i1417);
                        f53435r0 = i1418 % 128;
                        int i1419 = i1418 % 2;
                        int i1420 = i133 & 2;
                        int i1510 = (i133 | 2) & (~i1420);
                        i133 = (i1510 & i1420) | (i1510 ^ i1420);
                        i15 = ((i1415 ^ 102) + ((i1415 & 102) << 1)) - 1;
                    } else if (strNextToken.equals("threadlocaldhdefaultparams")) {
                        int i1511 = f53436s0;
                        int i1512 = i1511 & 43;
                        int i1513 = i1511 | 43;
                        i16 = ((i1512 | i1513) << 1) - (i1513 ^ i1512);
                        f53435r0 = i16 % 128;
                        if (i16 % 2 != 0) {
                            i133 = (i133 & 5) | (i133 ^ 5);
                        } else {
                            int i1514 = i133 & 4;
                            int i1515 = (i133 | 4) & (~i1514);
                            i133 = (i1515 & i1514) | (i1515 ^ i1514);
                        }
                    } else if (!(!strNextToken.equals("dhdefaultparams"))) {
                        int i1516 = f53436s0;
                        int i1517 = i1516 + 9;
                        f53435r0 = i1517 % 128;
                        int i1518 = i1517 % 2;
                        i133 |= 8;
                        int i1519 = (i1516 & (-124)) | ((~i1516) & 123);
                        int i1610 = (i1516 & 123) << 1;
                        int i1611 = (i1519 & i1610) + (i1610 | i1519);
                        f53435r0 = i1611 % 128;
                        int i1612 = i1611 % 2;
                    } else {
                        if (strNextToken.equals("acceptableeccurves")) {
                            i17 = f53436s0 + 115;
                            int i1613 = i17 % 128;
                            f53435r0 = i1613;
                            if (i17 % 2 != 0) {
                                int i1614 = i133 ^ 121;
                                int i1615 = i133 & 121;
                                i133 = (i1615 & i1614) | (i1614 ^ i1615);
                            } else {
                                int i1616 = i133 & 16;
                                i133 = ((i133 | 16) & (~i1616)) | i1616;
                            }
                            i14 = (-2) - ((((i1613 | 66) << 1) - (i1613 ^ 66)) ^ (-1));
                            f53436s0 = i14 % 128;
                        } else if (strNextToken.equals("additionalecparameters")) {
                            int i1617 = f53436s0;
                            i21 = (((i1617 & (-66)) | ((~i1617) & 65)) - (~(-(-((i1617 & 65) << 1))))) - 1;
                            f53435r0 = i21 % 128;
                            if (i21 % 2 != 0) {
                                i22 = i133 & 33;
                                i23 = ~i22;
                                i24 = i133 | 33;
                            } else {
                                i22 = i133 & 32;
                                i23 = ~i22;
                                i24 = i133 | 32;
                            }
                            int i1618 = i24 & i23;
                            i133 = (i1618 & i22) | (i1618 ^ i22);
                            i15 = (i1617 & 25) + (i1617 | 25);
                        } else {
                            if (strNextToken.equals(SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL)) {
                                int i1619 = f53435r0;
                                int i178 = i1619 & 33;
                                int i179 = (i1619 | 33) & (~i178);
                                int i1710 = i178 << 1;
                                i18 = (i179 & i1710) + (i179 | i1710);
                                f53436s0 = i18 % 128;
                                if (i18 % 2 == 0) {
                                    int i1711 = i133 ^ 27;
                                    int i1712 = i133 & 27;
                                    i19 = i1711 ^ i1712;
                                    i20 = i1712 & i1711;
                                } else {
                                    int i1713 = i133 & 63;
                                    int i1714 = (i133 | 63) & (~i1713);
                                    i19 = i1714 ^ i1713;
                                    i20 = i1714 & i1713;
                                }
                                i133 = i20 | i19;
                            }
                            i14 = f53436s0 + 9;
                            f53435r0 = i14 % 128;
                        }
                        int i14110 = i14 % 2;
                    }
                    f53435r0 = i15 % 128;
                    int i1715 = i15 % 2;
                }
            }
        }
        if (i133 == 0) {
            throw new IllegalArgumentException("unknown permissions passed to mask");
        }
        int i180 = f53435r0;
        int i181 = (-2) - (((i180 ^ 46) + ((i180 & 46) << 1)) ^ (-1));
        f53436s0 = i181 % 128;
        if (i181 % 2 == 0) {
            int i182 = 28 / 0;
        }
        return Integer.valueOf(i133);
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setY(new Object[]{this, obj}, -1312458497, 1312458498, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final String getActions() {
        return (String) setY(new Object[]{this}, 1845146495, -1845146495, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, 1681670573, -1681670571, System.identityHashCode(this))).intValue();
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final boolean implies(Permission permission) {
        return ((Boolean) setY(new Object[]{this, permission}, 1978275028, -1978275025, System.identityHashCode(this))).booleanValue();
    }
}
