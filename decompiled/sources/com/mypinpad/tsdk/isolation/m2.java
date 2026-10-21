package com.mypinpad.tsdk.isolation;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class m2 extends SecureRandom {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f57035t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f57036u0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f57037p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public byte[] f57038q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f57039r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final aky f57040s0;

    public m2(byte[] bArr, aky akyVar) {
        this.f57037p0 = bArr;
        this.f57040s0 = akyVar;
        a(new Object[]{this}, 1856870306, -1856870302, System.identityHashCode(this));
    }

    public static /* synthetic */ void a(Object[] objArr, int i10, int i11, int i12) {
        char c10;
        int i13;
        int i14 = ~i10;
        int i15 = i14 | i11;
        int i16 = (((~i15) | (~(i14 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
        int i17 = ~(i15 | i12);
        int i18 = ~i12;
        int i19 = ((i14 | i18) * 754) + (((~(i10 | i18 | i11)) | i17) * (-754)) + i16;
        if (i19 == 1) {
            m2 m2Var = (m2) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int i20 = f57036u0;
            int i21 = i20 & 99;
            int i22 = ((((i20 ^ 99) | i21) << 1) - (~(-((i20 | 99) & (~i21))))) - 1;
            f57035t0 = i22 % 128;
            if (i22 % 2 != 0) {
                byte[] bArr2 = new byte[34];
                System.arraycopy(bArr, 0, bArr2, 1, 34);
                byte[] bArr3 = new byte[118];
                m2Var.f57038q0 = bArr3;
                byte[] bArr4 = new byte[72];
                m2Var.f57039r0 = bArr4;
                a(new Object[]{bArr2, bArr3, bArr4}, 1935399963, -1935399961, (int) System.currentTimeMillis());
            } else {
                byte[] bArr5 = new byte[48];
                System.arraycopy(bArr, 0, bArr5, 0, 48);
                byte[] bArr6 = new byte[32];
                m2Var.f57038q0 = bArr6;
                byte[] bArr7 = new byte[16];
                m2Var.f57039r0 = bArr7;
                a(new Object[]{bArr5, bArr6, bArr7}, 1935399963, -1935399961, (int) System.currentTimeMillis());
            }
            int i23 = f57035t0;
            int i24 = i23 & 109;
            int i25 = (((i23 ^ 109) | i24) << 1) - ((i23 | 109) & (~i24));
            f57036u0 = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 21 / 0;
                return;
            }
            return;
        }
        if (i19 != 2) {
            if (i19 == 3) {
                b(objArr);
                return;
            }
            if (i19 != 4) {
                byte[] bArr8 = (byte[]) objArr[0];
                byte[] bArr9 = (byte[]) objArr[1];
                byte[] bArr10 = (byte[]) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                try {
                    amc amcVar = new amc();
                    amc.setDividerPadding(new Object[]{amcVar, new ann(bArr8)}, -2118815591, 2118815595, System.identityHashCode(amcVar));
                    int i27 = f57036u0 + 85;
                    f57035t0 = i27 % 128;
                    int i28 = i27 % 2;
                    int i29 = 0;
                    while (i29 != bArr9.length) {
                        int i30 = f57035t0;
                        int i31 = i30 ^ 23;
                        int i32 = ((i30 & 23) | i31) << 1;
                        int i33 = -i31;
                        int i34 = (i32 & i33) + (i32 | i33);
                        f57036u0 = i34 % 128;
                        if (i34 % 2 == 0) {
                            int i35 = -(-i29);
                            int i36 = iIntValue & i35;
                            int i37 = -(-(i35 | iIntValue));
                            ((Integer) amc.setDividerPadding(new Object[]{amcVar, bArr9, Integer.valueOf(i29), bArr10, Integer.valueOf((i36 ^ i37) + ((i37 & i36) << 1))}, 1332499646, -1332499640, i29)).intValue();
                            i13 = (i29 & 25) + (i29 | 25);
                        } else {
                            ((Integer) amc.setDividerPadding(new Object[]{amcVar, bArr9, Integer.valueOf(i29), bArr10, Integer.valueOf((iIntValue & i29) + (iIntValue | i29))}, 1332499646, -1332499640, i29)).intValue();
                            i13 = (((i29 & (-17)) | ((~i29) & 16)) - (~((i29 & 16) << 1))) - 1;
                        }
                        i29 = i13;
                        int i38 = f57036u0;
                        int i39 = (((i38 | 86) << 1) - (i38 ^ 86)) - 1;
                        f57035t0 = i39 % 128;
                        int i40 = i39 % 2;
                    }
                    int i41 = f57036u0;
                    int i42 = ((i41 ^ 16) + ((16 & i41) << 1)) - 1;
                    f57035t0 = i42 % 128;
                    int i43 = i42 % 2;
                    return;
                } catch (Throwable th2) {
                    StringBuilder sb2 = new StringBuilder("drbg failure: ");
                    sb2.append(th2.getMessage());
                    throw new IllegalStateException(sb2.toString(), th2);
                }
            }
            m2 m2Var2 = (m2) objArr[0];
            int i44 = f57035t0;
            int i45 = i44 + 41;
            f57036u0 = i45 % 128;
            if (i45 % 2 != 0 ? m2Var2.f57037p0.length >= 48 : m2Var2.f57037p0.length >= 70) {
                int i46 = (((i44 ^ 125) | (i44 & 125)) << 1) - (((~i44) & 125) | (i44 & (-126)));
                f57036u0 = i46 % 128;
                int i47 = i46 % 2;
                byte[] bArr11 = m2Var2.f57037p0;
                if (i47 != 0) {
                    a(new Object[]{m2Var2, bArr11}, -249269565, 249269566, System.identityHashCode(m2Var2));
                    return;
                } else {
                    a(new Object[]{m2Var2, bArr11}, -249269565, 249269566, System.identityHashCode(m2Var2));
                    int i48 = 95 / 0;
                    return;
                }
            }
            aky akyVar = m2Var2.f57040s0;
            byte[] bArr12 = m2Var2.f57037p0;
            int i49 = -bArr12.length;
            int iIdentityHashCode = System.identityHashCode(m2Var2);
            int i50 = i49 * 253;
            int i51 = ((i50 ^ 12145) + ((i50 & 12145) << 1)) - 1;
            int i52 = ~i49;
            int i53 = (i52 | i49) & i52;
            int i54 = ~((i53 & (-49)) | (i53 ^ (-49)));
            int i55 = ~iIdentityHashCode;
            int i56 = ((-49) & (~i55)) | (i55 & 48);
            int i57 = (-49) & i55;
            int i58 = ~((i56 ^ i57) | (i56 & i57));
            int i59 = (i54 ^ i58) | (i58 & i54);
            int i60 = i49 & 48;
            int i61 = (i49 ^ 48) | i60;
            int i62 = (i61 & i55) | ((~i61) & iIdentityHashCode);
            int i63 = i61 & iIdentityHashCode;
            int i64 = (i62 ^ i63) | (i62 & i63);
            int i65 = ~i64;
            int i66 = (i64 | i65) & i65;
            int i67 = -(-(((i66 & i59) | (i59 ^ i66)) * (-252)));
            int i68 = i51 | i67;
            int i69 = i68 << 1;
            int i70 = -((~(i67 & i51)) & i68);
            int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
            int i72 = (~i60) & (i49 | 48);
            int i73 = ((i72 & i60) | (i72 ^ i60)) * (-252);
            int i74 = (((i71 ^ i73) | (i71 & i73)) << 1) - ((i73 & (~i71)) | ((~i73) & i71));
            int i75 = ~(((~i57) & ((-49) | i55)) | i57 | i49);
            int i76 = (48 & i52) | (i49 & (-49)) | i60;
            int i77 = (i76 & i55) | ((~i76) & iIdentityHashCode);
            int i78 = i76 & iIdentityHashCode;
            int i79 = ~((i78 & i77) | (i77 ^ i78));
            int i80 = i75 & i79;
            int i81 = -(-((((i79 | i75) & (~i80)) | i80) * 252));
            int i82 = (i74 | i81) << 1;
            int i83 = -((i81 & (~i74)) | ((~i81) & i74));
            int i84 = (i82 & i83) + (i83 | i82);
            a(new Object[]{m2Var2, (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr12, (byte[]) p2.d(new Object[]{akyVar, bArr12, Integer.valueOf(i84)}, -1010146914, 1010146914, i84)}, 1396275083, -1396275074, (int) System.currentTimeMillis())}, -249269565, 249269566, System.identityHashCode(m2Var2));
            int i85 = f57036u0;
            int i86 = i85 | 27;
            int i87 = i86 << 1;
            int i88 = -((~(i85 & 27)) & i86);
            int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
            f57035t0 = i89 % 128;
            if (i89 % 2 != 0) {
                throw null;
            }
            return;
        }
        byte[] bArr13 = (byte[]) objArr[0];
        byte[] bArr14 = (byte[]) objArr[1];
        byte[] bArr15 = (byte[]) objArr[2];
        int i90 = f57035t0;
        int i91 = i90 & 97;
        int i92 = -(-((i90 ^ 97) | i91));
        int i93 = (i91 ^ i92) + ((i91 & i92) << 1);
        f57036u0 = i93 % 128;
        int i94 = i93 % 2;
        byte[] bArr16 = new byte[48];
        int i95 = i90 & 13;
        int i96 = -(-((i90 ^ 13) | i95));
        int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
        f57036u0 = i97 % 128;
        int i98 = i97 % 2;
        int i99 = 0;
        while (i99 < 3) {
            int i100 = f57035t0;
            int i101 = i100 & 71;
            int i102 = (i100 | 71) & (~i101);
            int i103 = -(-(i101 << 1));
            int i104 = (i102 & i103) + (i102 | i103);
            int i105 = i104 % 128;
            f57036u0 = i105;
            int i106 = i104 % 2;
            int i107 = i105 & 7;
            int i108 = i105 | 7;
            int i109 = (i107 & i108) + (i108 | i107);
            f57035t0 = i109 % 128;
            int i110 = i109 % 2;
            int i111 = 15;
            while (true) {
                if (i111 < 0) {
                    c10 = 2;
                    break;
                }
                int i112 = f57035t0;
                int i113 = ((i112 | 1) << 1) - (i112 ^ 1);
                f57036u0 = i113 % 128;
                if (i113 % 2 != 0) {
                    if ((bArr15[i111] & 255) != 255) {
                        byte b10 = bArr15[i111];
                        bArr15[i111] = (byte) ((b10 & 1) + (b10 | 1));
                        int i114 = i112 ^ 29;
                        int i115 = (((i112 & 29) | i114) << 1) - i114;
                        f57036u0 = i115 % 128;
                        c10 = 2;
                        int i116 = i115 % 2;
                        break;
                        break;
                    }
                    int i117 = (-2) - ((((i112 | 100) << 1) - (i112 ^ 100)) ^ (-1));
                    int i118 = i117 % 128;
                    f57036u0 = i118;
                    int i119 = i117 % 2;
                    bArr15[i111] = 0;
                    int i120 = i118 & 65;
                    int i121 = (~i120) & (i118 | 65);
                    int i122 = i120 << 1;
                    int i123 = (i121 & i122) + (i122 | i121);
                    f57035t0 = i123 % 128;
                    int i124 = i123 % 2;
                    i111 = (i111 << 1) + (~i111);
                    int i125 = i118 & 123;
                    int i126 = i125 + ((i118 ^ 123) | i125);
                    f57035t0 = i126 % 128;
                    int i127 = i126 % 2;
                } else {
                    if ((bArr15[i111] & 3165) != 31332) {
                        byte b11 = bArr15[i111];
                        bArr15[i111] = (byte) ((b11 & 1) + (b11 | 1));
                        int i1110 = i112 ^ 29;
                        int i1111 = (((i112 & 29) | i1110) << 1) - i1110;
                        f57036u0 = i1111 % 128;
                        c10 = 2;
                        int i1112 = i1111 % 2;
                        break;
                    }
                    int i1113 = (-2) - ((((i112 | 100) << 1) - (i112 ^ 100)) ^ (-1));
                    int i1114 = i1113 % 128;
                    f57036u0 = i1114;
                    int i1115 = i1113 % 2;
                    bArr15[i111] = 0;
                    int i128 = i1114 & 65;
                    int i129 = (~i128) & (i1114 | 65);
                    int i1210 = i128 << 1;
                    int i1211 = (i129 & i1210) + (i1210 | i129);
                    f57035t0 = i1211 % 128;
                    int i1212 = i1211 % 2;
                    i111 = (i111 << 1) + (~i111);
                    int i1213 = i1114 & 123;
                    int i1214 = i1213 + ((i1114 ^ 123) | i1213);
                    f57035t0 = i1214 % 128;
                    int i1215 = i1214 % 2;
                }
            }
            int i130 = i99 << 4;
            Object[] objArr2 = new Object[4];
            objArr2[0] = bArr14;
            objArr2[1] = bArr15;
            objArr2[c10] = bArr16;
            objArr2[3] = Integer.valueOf(i130);
            a(objArr2, 978420327, -978420327, i130);
            int i131 = i99 & (-6);
            int i132 = (i99 ^ (-6)) | i131;
            int i133 = (i131 & i132) + (i132 | i131);
            int i134 = i133 & 7;
            int i135 = -(-((i133 ^ 7) | i134));
            i99 = ((i134 | i135) << 1) - (i134 ^ i135);
            int i136 = f57036u0;
            int i137 = (i136 | 69) << 1;
            int i138 = -(((~i136) & 69) | (i136 & (-70)));
            int i139 = ((i137 | i138) << 1) - (i138 ^ i137);
            f57035t0 = i139 % 128;
            int i140 = i139 % 2;
        }
        if (bArr13 != null) {
            int i141 = f57036u0 + 64;
            int i142 = (i141 ^ (-1)) + (i141 << 1);
            f57035t0 = i142 % 128;
            int i143 = (i142 % 2 != 0 ? 0 : 1) ^ 1;
            while (i143 < 48) {
                int i144 = f57036u0 + 71;
                int i145 = i144 % 128;
                f57035t0 = i145;
                int i146 = i144 % 2;
                byte b12 = bArr16[i143];
                byte b13 = bArr13[i143];
                int i147 = b12 & b13;
                bArr16[i143] = (byte) (((b12 ^ b13) | i147) & (~i147));
                i143++;
                int i148 = (i145 ^ 113) + ((i145 & 113) << 1);
                f57036u0 = i148 % 128;
                int i149 = i148 % 2;
            }
        }
        System.arraycopy(bArr16, 0, bArr14, 0, bArr14.length);
        System.arraycopy(bArr16, 32, bArr15, 0, bArr15.length);
        int i150 = f57035t0;
        int i151 = i150 & 95;
        int i152 = (i150 | 95) & (~i151);
        int i153 = -(-(i151 << 1));
        int i154 = (i152 & i153) + (i152 | i153);
        f57036u0 = i154 % 128;
        int i155 = i154 % 2;
    }

    public static /* synthetic */ void b(Object[] objArr) {
        int i10;
        int i11;
        int i12;
        byte b10 = 0;
        m2 m2Var = (m2) objArr[0];
        int i13 = 1;
        byte[] bArr = (byte[]) objArr[1];
        int i14 = f57036u0 + 5;
        f57035t0 = i14 % 128;
        int i15 = 2;
        byte[] bArr2 = i14 % 2 != 0 ? new byte[59] : new byte[16];
        int length = bArr.length;
        int i16 = 0;
        while (length > 0) {
            int i17 = f57035t0;
            int i18 = i17 & 49;
            int i19 = (i17 ^ 49) | i18;
            int i20 = (i18 & i19) + (i19 | i18);
            int i21 = i20 % 128;
            f57036u0 = i21;
            int i22 = i20 % i15;
            int i23 = i21 & 53;
            int i24 = -(-((i21 ^ 53) | i23));
            int i25 = ((i23 | i24) << i13) - (i24 ^ i23);
            f57035t0 = i25 % 128;
            int i26 = i25 % i15;
            int i27 = 15;
            while (true) {
                if (i27 < 0) {
                    i10 = i15;
                    break;
                }
                int i28 = f57036u0;
                int i29 = ((i28 ^ 54) + ((i28 & 54) << i13)) - i13;
                f57035t0 = i29 % 128;
                if (i29 % i15 == 0) {
                    if ((m2Var.f57039r0[i27] & 255) != 255) {
                        byte[] bArr3 = m2Var.f57039r0;
                        byte b11 = bArr3[i27];
                        int iIdentityHashCode = System.identityHashCode(m2Var);
                        int i30 = -(-(b11 * (-987)));
                        int i31 = (989 ^ i30) + ((989 & i30) << i13);
                        int i32 = ~b11;
                        int i33 = i32 & (i32 | b11);
                        int i34 = ~iIdentityHashCode;
                        int i35 = i33 & i34;
                        int i36 = (~i35) & (i33 | i34);
                        int i37 = (i36 ^ i35) | (i36 & i35);
                        int i38 = i37 & 1;
                        int i39 = ~(((~i38) & (i37 | i13)) | i38);
                        int i40 = (b11 ^ 1) | (b11 & 1);
                        int i41 = (i40 & iIdentityHashCode) | (i40 ^ iIdentityHashCode);
                        int i42 = ~i41;
                        int i43 = (i41 | i42) & i42;
                        int i44 = ((i39 & i43) | ((~i39) & i43) | ((~i43) & i39)) * 988;
                        int i45 = i31 & i44;
                        int i46 = (((i31 ^ i44) | i45) << i13) - ((i31 | i44) & (~i45));
                        int i47 = i32 & 1;
                        int i48 = (~i47) & (i32 | 1);
                        int i49 = -(-(((i48 & i47) | (i48 ^ i47)) * (-988)));
                        int i50 = ((i46 ^ i49) | (i46 & i49)) << i13;
                        int i51 = -(((~i49) & i46) | ((~i46) & i49));
                        int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                        int i53 = i47 | ((~i32) & (-2));
                        int i54 = (-2) & i32;
                        int i55 = (i53 & i54) | (i53 ^ i54);
                        int i56 = ~i55;
                        int i57 = (i55 | i56) & i56;
                        int i58 = (i32 ^ iIdentityHashCode) | (i32 & iIdentityHashCode);
                        int i59 = ~i58;
                        int i60 = (i58 | i59) & i59;
                        int i61 = ((~i60) & i57) | ((~i57) & i60);
                        int i62 = i57 & i60;
                        int i63 = (i62 & i61) | (i61 ^ i62);
                        int i64 = i34 & 1;
                        int i65 = (i34 | 1) & (~i64);
                        int i66 = (i64 & i65) | (i65 ^ i64);
                        int i67 = i66 ^ b11;
                        int i68 = i66 & b11;
                        int i69 = (i68 & i67) | (i67 ^ i68);
                        int i70 = ~i69;
                        int i71 = (i69 | i70) & i70;
                        int i72 = ((~i71) & i63) | ((~i63) & i71);
                        int i73 = i63 & i71;
                        int i74 = -(-(((i73 & i72) | (i72 ^ i73)) * 988));
                        int i75 = i52 ^ i74;
                        bArr3[i27] = (byte) ((((i74 & i52) | i75) << 1) - i75);
                        int i76 = f57036u0;
                        int i77 = i76 ^ 71;
                        int i78 = ((i76 & 71) | i77) << 1;
                        int i79 = -i77;
                        int i80 = ((i78 | i79) << 1) - (i78 ^ i79);
                        f57035t0 = i80 % 128;
                        i10 = 2;
                        int i81 = i80 % 2;
                        break;
                    }
                    m2Var.f57039r0[i27] = b10;
                    int i82 = (i28 & 83) + (i28 | 83);
                    int i83 = i82 % 128;
                    f57035t0 = i83;
                    int i84 = i82 % i15;
                    i27 = ((i27 << 1) - i27) - 1;
                    int i85 = (i83 ^ 27) + ((i83 & 27) << i13);
                    f57036u0 = i85 % 128;
                    int i86 = i85 % i15;
                } else {
                    if ((m2Var.f57039r0[i27] & 6072) != 11771) {
                        byte[] bArr4 = m2Var.f57039r0;
                        byte b12 = bArr4[i27];
                        int iIdentityHashCode2 = System.identityHashCode(m2Var);
                        int i310 = -(-(b12 * (-987)));
                        int i311 = (989 ^ i310) + ((989 & i310) << i13);
                        int i312 = ~b12;
                        int i313 = i312 & (i312 | b12);
                        int i314 = ~iIdentityHashCode2;
                        int i315 = i313 & i314;
                        int i316 = (~i315) & (i313 | i314);
                        int i317 = (i316 ^ i315) | (i316 & i315);
                        int i318 = i317 & 1;
                        int i319 = ~(((~i318) & (i317 | i13)) | i318);
                        int i410 = (b12 ^ 1) | (b12 & 1);
                        int i411 = (i410 & iIdentityHashCode2) | (i410 ^ iIdentityHashCode2);
                        int i412 = ~i411;
                        int i413 = (i411 | i412) & i412;
                        int i414 = ((i319 & i413) | ((~i319) & i413) | ((~i413) & i319)) * 988;
                        int i415 = i311 & i414;
                        int i416 = (((i311 ^ i414) | i415) << i13) - ((i311 | i414) & (~i415));
                        int i417 = i312 & 1;
                        int i418 = (~i417) & (i312 | 1);
                        int i419 = -(-(((i418 & i417) | (i418 ^ i417)) * (-988)));
                        int i510 = ((i416 ^ i419) | (i416 & i419)) << i13;
                        int i511 = -(((~i419) & i416) | ((~i416) & i419));
                        int i512 = ((i510 | i511) << 1) - (i511 ^ i510);
                        int i513 = i417 | ((~i312) & (-2));
                        int i514 = (-2) & i312;
                        int i515 = (i513 & i514) | (i513 ^ i514);
                        int i516 = ~i515;
                        int i517 = (i515 | i516) & i516;
                        int i518 = (i312 ^ iIdentityHashCode2) | (i312 & iIdentityHashCode2);
                        int i519 = ~i518;
                        int i610 = (i518 | i519) & i519;
                        int i611 = ((~i610) & i517) | ((~i517) & i610);
                        int i612 = i517 & i610;
                        int i613 = (i612 & i611) | (i611 ^ i612);
                        int i614 = i314 & 1;
                        int i615 = (i314 | 1) & (~i614);
                        int i616 = (i614 & i615) | (i615 ^ i614);
                        int i617 = i616 ^ b12;
                        int i618 = i616 & b12;
                        int i619 = (i618 & i617) | (i617 ^ i618);
                        int i710 = ~i619;
                        int i711 = (i619 | i710) & i710;
                        int i712 = ((~i711) & i613) | ((~i613) & i711);
                        int i713 = i613 & i711;
                        int i714 = -(-(((i713 & i712) | (i712 ^ i713)) * 988));
                        int i715 = i512 ^ i714;
                        bArr4[i27] = (byte) ((((i714 & i512) | i715) << 1) - i715);
                        int i716 = f57036u0;
                        int i717 = i716 ^ 71;
                        int i718 = ((i716 & 71) | i717) << 1;
                        int i719 = -i717;
                        int i87 = ((i718 | i719) << 1) - (i718 ^ i719);
                        f57035t0 = i87 % 128;
                        i10 = 2;
                        int i88 = i87 % 2;
                        break;
                    }
                    m2Var.f57039r0[i27] = b10;
                    int i89 = (i28 & 83) + (i28 | 83);
                    int i810 = i89 % 128;
                    f57035t0 = i810;
                    int i811 = i89 % i15;
                    i27 = ((i27 << 1) - i27) - 1;
                    int i812 = (i810 ^ 27) + ((i810 & 27) << i13);
                    f57036u0 = i812 % 128;
                    int i813 = i812 % i15;
                }
            }
            byte[] bArr5 = m2Var.f57038q0;
            byte[] bArr6 = m2Var.f57039r0;
            Object[] objArr2 = new Object[4];
            objArr2[0] = bArr5;
            objArr2[1] = bArr6;
            objArr2[i10] = bArr2;
            objArr2[3] = 0;
            a(objArr2, 978420327, -978420327, 0);
            if (length > 15) {
                int i90 = f57035t0;
                int i91 = i90 ^ 59;
                int i92 = ((i90 & 59) | i91) << 1;
                int i93 = -i91;
                int i94 = ((i92 | i93) << 1) - (i92 ^ i93);
                f57036u0 = i94 % 128;
                int i95 = i94 % 2;
                int length2 = bArr2.length;
                if (i95 == 0) {
                    System.arraycopy(bArr2, 1, bArr, i16, length2);
                    int i96 = ((i16 & (-45)) + (i16 | (-45))) - 1;
                    int i97 = i96 & 125;
                    int i98 = length + 196;
                    length = (i98 & (-103)) + (i98 | (-103));
                    i16 = i97 + ((i96 ^ 125) | i97);
                    i12 = 1;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i16, length2);
                    int i99 = (i16 & 17) + (i16 | 17);
                    i12 = 1;
                    int i100 = (length & 16) | ((~length) & (-17));
                    int i101 = (length & (-17)) << 1;
                    int i102 = (i100 & i101) + (i100 | i101);
                    int i103 = (i102 & 1) + (i102 | 1);
                    i16 = i99 - 1;
                    length = i103;
                }
                int i104 = f57036u0;
                int i105 = (i104 | 95) << i12;
                int i106 = -(((~i104) & 95) | (i104 & (-96)));
                int i107 = (i105 ^ i106) + ((i106 & i105) << i12);
                f57035t0 = i107 % 128;
                i11 = 2;
                int i108 = i107 % 2;
                i13 = 1;
            } else {
                i11 = 2;
                System.arraycopy(bArr2, 0, bArr, i16, length);
                int i109 = f57036u0 + 115;
                f57035t0 = i109 % 128;
                int i110 = i109 % 2;
                i13 = 1;
                length = 0;
            }
            i15 = i11;
            b10 = 0;
        }
        byte[] bArr7 = m2Var.f57038q0;
        byte[] bArr8 = m2Var.f57039r0;
        Object[] objArr3 = new Object[3];
        objArr3[0] = null;
        objArr3[1] = bArr7;
        objArr3[i15] = bArr8;
        a(objArr3, 1935399963, -1935399961, (int) System.currentTimeMillis());
        int i111 = f57035t0;
        int i112 = (((i111 | 28) << 1) - (i111 ^ 28)) - 1;
        f57036u0 = i112 % 128;
        if (i112 % 2 == 0) {
            int i113 = 80 / 0;
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        a(new Object[]{this, bArr}, -1998906102, 1998906105, System.identityHashCode(this));
    }
}
