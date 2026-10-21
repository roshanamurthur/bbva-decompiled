package com.mypinpad.tsdk.isolation;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class adq extends FilterInputStream {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f52493s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52494t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f52495p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f52496q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[][] f52497r0;

    public adq(InputStream inputStream, int i10, boolean z10, byte[][] bArr) {
        super(inputStream);
        this.f52495p0 = i10;
        this.f52496q0 = z10;
        this.f52497r0 = bArr;
    }

    public static ady a(Object[] objArr) throws IOException {
        boolean z10;
        adq adqVar = (adq) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        s0 s0Var = new s0(adqVar, ((Number) objArr[3]).intValue(), adqVar.f52495p0);
        if ((iIntValue & 224) == 0) {
            int i10 = f52493s0;
            int i11 = (((i10 | 60) << 1) - (i10 ^ 60)) - 1;
            f52494t0 = i11 % 128;
            int i12 = i11 % 2;
            byte[][] bArr = adqVar.f52497r0;
            if (i12 == 0) {
                throw null;
            }
            ady adyVar = (ady) setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue2), s0Var, bArr}, 738499635, -738499630, iIntValue2);
            int i13 = f52494t0;
            int i14 = ((i13 ^ 14) + ((i13 & 14) << 1)) - 1;
            f52493s0 = i14 % 128;
            if (i14 % 2 == 0) {
                return adyVar;
            }
            throw null;
        }
        int i15 = iIntValue & 192;
        if (i15 != 0) {
            int i16 = f52493s0;
            int i17 = (i16 & 89) + (i16 | 89);
            int i18 = i17 % 128;
            f52494t0 = i18;
            int i19 = i17 % 2;
            if ((iIntValue & 32) != 0) {
                int i20 = i18 & 47;
                int i21 = -(-((i18 ^ 47) | i20));
                int i22 = (i20 & i21) + (i20 | i21);
                f52493s0 = i22 % 128;
                int i23 = i22 % 2;
                z10 = true;
            } else {
                int i24 = (i16 & 59) + (i16 | 59);
                f52494t0 = i24 % 128;
                int i25 = i24 % 2;
                z10 = false;
            }
            ady adyVar2 = (ady) setOnFocusChangeListener(new Object[]{adqVar, Integer.valueOf(i15), Integer.valueOf(iIntValue2), Boolean.valueOf(z10), s0Var}, -2085649771, 2085649783, i15);
            int i26 = f52494t0;
            int i27 = ((i26 ^ 13) | (i26 & 13)) << 1;
            int i28 = -(((~i26) & 13) | (i26 & (-14)));
            int i29 = (i27 & i28) + (i28 | i27);
            f52493s0 = i29 % 128;
            int i30 = i29 % 2;
            return adyVar2;
        }
        if (iIntValue2 == 3) {
            acz aczVar = (acz) setOnFocusChangeListener(new Object[]{(adh) setOnFocusChangeListener(new Object[]{adqVar, s0Var}, -1812275395, 1812275403, System.identityHashCode(adqVar))}, 380721191, -380721184, (int) System.currentTimeMillis());
            int i31 = f52494t0;
            int i32 = i31 & 45;
            int i33 = i32 + ((i31 ^ 45) | i32);
            f52493s0 = i33 % 128;
            int i34 = i33 % 2;
            return aczVar;
        }
        if (iIntValue2 == 4) {
            ads adsVar = (ads) setOnFocusChangeListener(new Object[]{(adh) setOnFocusChangeListener(new Object[]{adqVar, s0Var}, -1812275395, 1812275403, System.identityHashCode(adqVar))}, -191627666, 191627676, (int) System.currentTimeMillis());
            int i35 = f52493s0;
            int i36 = i35 ^ 55;
            int i37 = (i35 & 55) << 1;
            int i38 = (i36 & i37) + (i37 | i36);
            f52494t0 = i38 % 128;
            int i39 = i38 % 2;
            return adsVar;
        }
        if (iIntValue2 == 8) {
            agi agiVar = (agi) p0.a(new Object[]{(adh) setOnFocusChangeListener(new Object[]{adqVar, s0Var}, -1812275395, 1812275403, System.identityHashCode(adqVar))}, -1653659896, 1653659896, (int) System.currentTimeMillis());
            adl adlVar = (adl) agi.setDividerPadding(new Object[]{agiVar}, -97294246, 97294246, System.identityHashCode(agiVar));
            int i40 = f52494t0;
            int i41 = i40 & 89;
            int i42 = ((i40 ^ 89) | i41) << 1;
            int i43 = -((i40 | 89) & (~i41));
            int i44 = (i42 & i43) + (i43 | i42);
            f52493s0 = i44 % 128;
            int i45 = i44 % 2;
            return adlVar;
        }
        if (iIntValue2 != 16) {
            if (iIntValue2 != 17) {
                StringBuilder sb2 = new StringBuilder("unknown tag ");
                sb2.append(iIntValue2);
                sb2.append(" encountered");
                throw new IOException(sb2.toString());
            }
            ago agoVar = (ago) p0.a(new Object[]{(adh) setOnFocusChangeListener(new Object[]{adqVar, s0Var}, -1812275395, 1812275403, System.identityHashCode(adqVar))}, -95689853, 95689854, (int) System.currentTimeMillis());
            int i46 = f52494t0;
            int i47 = i46 & 87;
            int i48 = (i46 | 87) & (~i47);
            int i49 = i47 << 1;
            int i50 = (i48 ^ i49) + ((i48 & i49) << 1);
            f52493s0 = i50 % 128;
            if (i50 % 2 != 0) {
                int i51 = 85 / 0;
            }
            return agoVar;
        }
        if (((Integer) s0.b(new Object[]{s0Var}, -1664608674, 1664608676, System.identityHashCode(s0Var))).intValue() <= 0) {
            int i52 = f52493s0;
            int i53 = i52 & 69;
            int i54 = i53 + ((i52 ^ 69) | i53);
            f52494t0 = i54 % 128;
            if (i54 % 2 == 0) {
                agi agiVar2 = p0.f57611a;
                throw null;
            }
            agi agiVar3 = p0.f57611a;
            int i55 = f52494t0;
            int i56 = (i55 & (-12)) | ((~i55) & 11);
            int i57 = -(-((i55 & 11) << 1));
            int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
            f52493s0 = i58 % 128;
            if (i58 % 2 == 0) {
                return agiVar3;
            }
            throw null;
        }
        if (!adqVar.f52496q0) {
            agi agiVar4 = (agi) p0.a(new Object[]{(adh) setOnFocusChangeListener(new Object[]{adqVar, s0Var}, -1812275395, 1812275403, System.identityHashCode(adqVar))}, -1653659896, 1653659896, (int) System.currentTimeMillis());
            int i59 = f52494t0 + 5;
            f52493s0 = i59 % 128;
            if (i59 % 2 == 0) {
                return agiVar4;
            }
            throw null;
        }
        byte[] bArr2 = (byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var));
        u0 u0Var = new u0();
        if (bArr2 == null) {
            throw new NullPointerException("'encoded' cannot be null");
        }
        u0Var.f61222x0 = bArr2;
        int i60 = f52494t0 + 65;
        f52493s0 = i60 % 128;
        int i61 = i60 % 2;
        return u0Var;
    }

    public static /* synthetic */ Object b(Object[] objArr) throws IOException {
        int i10;
        char c10 = 0;
        s0 s0Var = (s0) objArr[0];
        int i11 = f52493s0;
        int i12 = i11 & 109;
        int i13 = ((i11 ^ 109) | i12) << 1;
        int i14 = -((i11 | 109) & (~i12));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        f52494t0 = i15 % 128;
        int i16 = i15 % 2;
        int iIntValue = ((Integer) s0.b(new Object[]{s0Var}, -1664608674, 1664608676, System.identityHashCode(s0Var))).intValue();
        if ((iIntValue & 1) != 0) {
            throw new IOException("malformed BMPString encoding encountered");
        }
        int i17 = iIntValue / 2;
        char[] cArr = new char[i17];
        byte[] bArr = new byte[8];
        int i18 = f52493s0 + 77;
        f52494t0 = i18 % 128;
        int i19 = i18 % 2;
        int i20 = 0;
        while (iIntValue >= 8) {
            int i21 = f52493s0;
            int i22 = i21 & 77;
            int i23 = (i21 ^ 77) | i22;
            int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
            f52494t0 = i24 % 128;
            if (i24 % 2 == 0) {
                Object[] objArr2 = new Object[3];
                objArr2[c10] = s0Var;
                objArr2[1] = bArr;
                objArr2[2] = 73;
                if (((Integer) bfc.setOnFocusChangeListener(objArr2, -396467491, 396467492, 73)).intValue() != 69) {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
                int i25 = bArr[c10] << 8;
                int i26 = bArr[1] & 255;
                int i27 = ((~i26) & i25) | ((~i25) & i26);
                int i28 = i25 & i26;
                cArr[i20] = (char) ((i28 & i27) | (i27 ^ i28));
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i29 = -(-(i20 * 965));
                int i30 = (-1927) & i29;
                int i31 = (((-1927) ^ i29) | i30) << 1;
                int i32 = -((i29 | (-1927)) & (~i30));
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                int i34 = ~i20;
                int i35 = i34 & iCurrentTimeMillis;
                int i36 = (~i35) & (i34 | iCurrentTimeMillis);
                int i37 = ~iCurrentTimeMillis;
                int i38 = ~(i35 | i36);
                int i39 = ((-2) & (~i38)) | (i38 & 1);
                int i40 = (-2) & i38;
                int i41 = -(-(((i39 ^ i40) | (i40 & i39)) * (-964)));
                int i42 = i33 & i41;
                int i43 = (i33 ^ i41) | i42;
                int i44 = (i42 & i43) + (i43 | i42);
                int i45 = i37 & (iCurrentTimeMillis | i37);
                int i46 = i34 & i45;
                int i47 = (i45 | i34) & (~i46);
                int i48 = ~((i47 & i46) | (i47 ^ i46));
                int i49 = (i34 & (-2)) | ((~i34) & 1);
                int i50 = i34 & 1;
                int i51 = (i49 & i50) | (i49 ^ i50);
                int i52 = ~i51;
                int i53 = (i51 | i52) & i52;
                int i54 = i48 & i53;
                int i55 = -(-((((i48 | i53) & (~i54)) | i54) * (-964)));
                int i56 = (i44 & i55) + (i55 | i44);
                int i57 = bArr[2] << 8;
                int i58 = bArr[3] & 255;
                int i59 = i57 ^ i58;
                int i60 = i57 & i58;
                cArr[i56] = (char) ((i60 & i59) | (i59 ^ i60));
                int i61 = i20 & 2;
                int i62 = ((~i61) & (i20 | 2)) + (i61 << 1);
                int i63 = bArr[4] << 8;
                int i64 = bArr[5] & 255;
                int i65 = i63 & i64;
                int i66 = (i63 | i64) & (~i65);
                cArr[i62] = (char) ((i66 & i65) | (i66 ^ i65));
                int i67 = i20 ^ 3;
                int i68 = -(-((i20 & 3) << 1));
                int i69 = ((i67 | i68) << 1) - (i67 ^ i68);
                int i70 = bArr[6] << 8;
                int i71 = bArr[7] & 255;
                cArr[i69] = (char) ((i70 & i71) | (i70 ^ i71));
                int i72 = i34 + (i20 << 1);
                int i73 = i72 & 5;
                int i74 = (~i73) & (i72 | 5);
                int i75 = -(-(i73 << 1));
                i20 = (i74 ^ i75) + ((i75 & i74) << 1);
                int i76 = iIntValue | (-93);
                int i77 = (i76 << 1) - (i76 & (~(iIntValue & (-93))));
                iIntValue = ((i77 | 85) << 1) - (i77 ^ 85);
                int i78 = f52494t0;
                int i79 = (i78 & 105) + (i78 | 105);
                f52493s0 = i79 % 128;
                int i80 = i79 % 2;
                c10 = 0;
            } else {
                Object[] objArr3 = new Object[3];
                objArr3[c10] = s0Var;
                objArr3[1] = bArr;
                objArr3[2] = 8;
                if (((Integer) bfc.setOnFocusChangeListener(objArr3, -396467491, 396467492, 8)).intValue() != 8) {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
                int i210 = bArr[c10] << 8;
                int i211 = bArr[1] & 255;
                int i212 = ((~i211) & i210) | ((~i210) & i211);
                int i213 = i210 & i211;
                cArr[i20] = (char) ((i213 & i212) | (i212 ^ i213));
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i214 = -(-(i20 * 965));
                int i310 = (-1927) & i214;
                int i311 = (((-1927) ^ i214) | i310) << 1;
                int i312 = -((i214 | (-1927)) & (~i310));
                int i313 = ((i311 | i312) << 1) - (i312 ^ i311);
                int i314 = ~i20;
                int i315 = i314 & iCurrentTimeMillis2;
                int i316 = (~i315) & (i314 | iCurrentTimeMillis2);
                int i317 = ~iCurrentTimeMillis2;
                int i318 = ~(i315 | i316);
                int i319 = ((-2) & (~i318)) | (i318 & 1);
                int i410 = (-2) & i318;
                int i411 = -(-(((i319 ^ i410) | (i410 & i319)) * (-964)));
                int i412 = i313 & i411;
                int i413 = (i313 ^ i411) | i412;
                int i414 = (i412 & i413) + (i413 | i412);
                int i415 = i317 & (iCurrentTimeMillis2 | i317);
                int i416 = i314 & i415;
                int i417 = (i415 | i314) & (~i416);
                int i418 = ~((i417 & i416) | (i417 ^ i416));
                int i419 = (i314 & (-2)) | ((~i314) & 1);
                int i510 = i314 & 1;
                int i511 = (i419 & i510) | (i419 ^ i510);
                int i512 = ~i511;
                int i513 = (i511 | i512) & i512;
                int i514 = i418 & i513;
                int i515 = -(-((((i418 | i513) & (~i514)) | i514) * (-964)));
                int i516 = (i414 & i515) + (i515 | i414);
                int i517 = bArr[2] << 8;
                int i518 = bArr[3] & 255;
                int i519 = i517 ^ i518;
                int i610 = i517 & i518;
                cArr[i516] = (char) ((i610 & i519) | (i519 ^ i610));
                int i611 = i20 & 2;
                int i612 = ((~i611) & (i20 | 2)) + (i611 << 1);
                int i613 = bArr[4] << 8;
                int i614 = bArr[5] & 255;
                int i615 = i613 & i614;
                int i616 = (i613 | i614) & (~i615);
                cArr[i612] = (char) ((i616 & i615) | (i616 ^ i615));
                int i617 = i20 ^ 3;
                int i618 = -(-((i20 & 3) << 1));
                int i619 = ((i617 | i618) << 1) - (i617 ^ i618);
                int i710 = bArr[6] << 8;
                int i711 = bArr[7] & 255;
                cArr[i619] = (char) ((i710 & i711) | (i710 ^ i711));
                int i712 = i314 + (i20 << 1);
                int i713 = i712 & 5;
                int i714 = (~i713) & (i712 | 5);
                int i715 = -(-(i713 << 1));
                i20 = (i714 ^ i715) + ((i715 & i714) << 1);
                int i716 = iIntValue | (-93);
                int i717 = (i716 << 1) - (i716 & (~(iIntValue & (-93))));
                iIntValue = ((i717 | 85) << 1) - (i717 ^ 85);
                int i718 = f52494t0;
                int i719 = (i718 & 105) + (i718 | 105);
                f52493s0 = i719 % 128;
                int i81 = i719 % 2;
                c10 = 0;
            }
        }
        if (iIntValue > 0) {
            int i82 = f52493s0;
            int i83 = i82 ^ 45;
            int i84 = (((i82 & 45) | i83) << 1) - i83;
            f52494t0 = i84 % 128;
            if (i84 % 2 == 0) {
                ((Integer) bfc.setOnFocusChangeListener(new Object[]{s0Var, bArr, Integer.valueOf(iIntValue)}, -396467491, 396467492, iIntValue)).intValue();
                throw null;
            }
            if (((Integer) bfc.setOnFocusChangeListener(new Object[]{s0Var, bArr, Integer.valueOf(iIntValue)}, -396467491, 396467492, iIntValue)).intValue() != iIntValue) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            int i85 = f52494t0;
            int i86 = (i85 & 126) + (i85 | 126);
            int i87 = (i86 ^ (-1)) + (i86 << 1);
            f52493s0 = i87 % 128;
            int i88 = i87 % 2;
            int i89 = 0;
            while (true) {
                int i90 = i89 & 1;
                int i91 = i90 + ((i89 ^ 1) | i90);
                int i92 = bArr[i89] << 8;
                int i93 = (i91 ^ 28) + ((i91 & 28) << 1);
                int i94 = (i93 | (-27)) + (i93 & (-27));
                int i95 = bArr[i91] & 255;
                int i96 = i20 & (-23);
                int i97 = ((~i96) & (i20 | (-23))) + (i96 << 1);
                int i98 = i97 & 24;
                int i99 = (i97 ^ 24) | i98;
                i10 = ((i98 | i99) << 1) - (i98 ^ i99);
                int i100 = i92 & i95;
                int i101 = (i92 | i95) & (~i100);
                cArr[i20] = (char) ((i101 & i100) | (i101 ^ i100));
                if (i94 >= iIntValue) {
                    break;
                }
                i89 = i94;
                i20 = i10;
            }
            i20 = i10;
        }
        if (((Integer) s0.b(new Object[]{s0Var}, -1664608674, 1664608676, System.identityHashCode(s0Var))).intValue() == 0) {
            int i102 = f52494t0 + 118;
            int i103 = (i102 ^ (-1)) + (i102 << 1);
            int i104 = i103 % 128;
            f52493s0 = i104;
            int i105 = i103 % 2;
            if (i17 == i20) {
                int i106 = i104 & 39;
                int i107 = i106 + ((i104 ^ 39) | i106);
                f52494t0 = i107 % 128;
                int i108 = i107 % 2;
                return cArr;
            }
        }
        throw new IllegalStateException();
    }

    public static /* synthetic */ ady c(Object[] objArr) throws IOException {
        int iIntValue = ((Number) objArr[0]).intValue();
        s0 s0Var = (s0) objArr[1];
        byte[][] bArr = (byte[][]) objArr[2];
        int i10 = f52494t0 + 29;
        f52493s0 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        try {
            switch (iIntValue) {
                case 1:
                    return (adf) adf.setDividerPadding(new Object[]{(byte[]) setOnFocusChangeListener(new Object[]{s0Var, bArr}, 455052147, -455052147, (int) System.currentTimeMillis())}, -593928223, 593928226, (int) System.currentTimeMillis());
                case 2:
                    adp adpVar = (adp) adp.setOnFocusChangeListener(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, -712381831, 712381832, (int) System.currentTimeMillis());
                    int i11 = f52493s0;
                    int i12 = (i11 | 19) << 1;
                    int i13 = -(i11 ^ 19);
                    int i14 = (i12 & i13) + (i13 | i12);
                    f52494t0 = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = 89 / 0;
                    }
                    return adpVar;
                case 3:
                    acz aczVar = (acz) acz.setDividerPadding(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, -1839471968, 1839471976, (int) System.currentTimeMillis());
                    int i16 = f52494t0;
                    int i17 = i16 ^ 63;
                    int i18 = (((i16 & 63) | i17) << 1) - i17;
                    f52493s0 = i18 % 128;
                    int i19 = i18 % 2;
                    return aczVar;
                case 4:
                    ads adsVar = (ads) ads.setDividerPadding(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, -1970144845, 1970144851, (int) System.currentTimeMillis());
                    int i20 = f52494t0 + 1;
                    f52493s0 = i20 % 128;
                    if (i20 % 2 == 0) {
                        return adsVar;
                    }
                    throw null;
                case 5:
                    return (adr) adr.setX(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, 1197965114, -1197965113, (int) System.currentTimeMillis());
                case 6:
                    adu aduVar = (adu) adu.setCompoundDrawableTintBlendMode(new Object[]{(byte[]) setOnFocusChangeListener(new Object[]{s0Var, bArr}, 455052147, -455052147, (int) System.currentTimeMillis()), Boolean.TRUE}, -1730542045, 1730542054, (int) System.currentTimeMillis());
                    int i21 = f52494t0;
                    int i22 = ((i21 & 117) - (~(i21 | 117))) - 1;
                    f52493s0 = i22 % 128;
                    if (i22 % 2 == 0) {
                        return aduVar;
                    }
                    throw null;
                case 7:
                    adv advVar = (adv) adv.setDividerPadding(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, 917670389, -917670382, (int) System.currentTimeMillis());
                    int i23 = f52494t0 + 71;
                    f52493s0 = i23 % 128;
                    int i24 = i23 % 2;
                    return advVar;
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case 17:
                case 29:
                default:
                    StringBuilder sb2 = new StringBuilder("unknown tag ");
                    sb2.append(iIntValue);
                    sb2.append(" encountered");
                    throw new IOException(sb2.toString());
                case 10:
                    ade adeVar = (ade) ade.setY(new Object[]{(byte[]) setOnFocusChangeListener(new Object[]{s0Var, bArr}, 455052147, -455052147, (int) System.currentTimeMillis()), Boolean.TRUE}, 657279853, -657279847, (int) System.currentTimeMillis());
                    int i25 = f52493s0;
                    int i26 = ((i25 | 90) << 1) - (i25 ^ 90);
                    int i27 = (i26 ^ (-1)) + (i26 << 1);
                    f52494t0 = i27 % 128;
                    if (i27 % 2 != 0) {
                        return adeVar;
                    }
                    throw null;
                case 12:
                    aen aenVar = (aen) aen.setDividerPadding(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, -2004985140, 2004985146, (int) System.currentTimeMillis());
                    int i28 = f52493s0 + 27;
                    f52494t0 = i28 % 128;
                    int i29 = i28 % 2;
                    return aenVar;
                case 13:
                    return (aeg) aeg.setX(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, -1826717762, 1826717770, (int) System.currentTimeMillis());
                case 14:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    StringBuilder sb3 = new StringBuilder("unsupported tag ");
                    sb3.append(iIntValue);
                    sb3.append(" encountered");
                    throw new IOException(sb3.toString());
                case 18:
                    adt adtVar = (adt) adt.setX(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, 1245515035, -1245515034, (int) System.currentTimeMillis());
                    int i30 = f52494t0;
                    int i31 = ((i30 & (-72)) | ((~i30) & 71)) + ((i30 & 71) << 1);
                    f52493s0 = i31 % 128;
                    if (i31 % 2 == 0) {
                        return adtVar;
                    }
                    throw null;
                case 19:
                    adz adzVar = (adz) adz.setDividerPadding(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, 1252576807, -1252576804, (int) System.currentTimeMillis());
                    int i32 = f52494t0;
                    int i33 = i32 & 31;
                    int i34 = i32 | 31;
                    int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                    f52493s0 = i35 % 128;
                    int i36 = i35 % 2;
                    return adzVar;
                case 20:
                    ael aelVar = (ael) ael.setCompoundDrawableTintBlendMode(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, 294862441, -294862435, (int) System.currentTimeMillis());
                    int i37 = f52494t0;
                    int i38 = ((i37 | 22) << 1) - (i37 ^ 22);
                    int i39 = (i38 ^ (-1)) + (i38 << 1);
                    f52493s0 = i39 % 128;
                    int i40 = i39 % 2;
                    return aelVar;
                case 21:
                    return (aet) aet.setOnFocusChangeListener(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, -1339378186, 1339378190, (int) System.currentTimeMillis());
                case 22:
                    return (adn) adn.setX(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, -1810944468, 1810944469, (int) System.currentTimeMillis());
                case 23:
                    aeq aeqVar = (aeq) aeq.setCompoundDrawableTintBlendMode(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, 1259690664, -1259690657, (int) System.currentTimeMillis());
                    int i41 = f52493s0;
                    int i42 = (((i41 ^ 97) | (i41 & 97)) << 1) - (((~i41) & 97) | (i41 & (-98)));
                    f52494t0 = i42 % 128;
                    int i43 = i42 % 2;
                    return aeqVar;
                case 24:
                    adm admVar = (adm) adm.setDividerPadding(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, 517064393, -517064383, (int) System.currentTimeMillis());
                    int i44 = f52493s0;
                    int i45 = i44 & 29;
                    int i46 = (i44 ^ 29) | i45;
                    int i47 = (i45 & i46) + (i46 | i45);
                    f52494t0 = i47 % 128;
                    if (i47 % 2 != 0) {
                        return admVar;
                    }
                    throw null;
                case 25:
                    ado adoVar = (ado) ado.setDividerPadding(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, 1819217987, -1819217981, (int) System.currentTimeMillis());
                    int i48 = f52493s0;
                    int i49 = (i48 & (-44)) | ((~i48) & 43);
                    int i50 = (i48 & 43) << 1;
                    int i51 = (i49 & i50) + (i50 | i49);
                    f52494t0 = i51 % 128;
                    if (i51 % 2 != 0) {
                        return adoVar;
                    }
                    throw null;
                case 26:
                    aer aerVar = (aer) aer.setX(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, -639832309, 639832313, (int) System.currentTimeMillis());
                    int i52 = f52493s0;
                    int i53 = ((i52 | 53) << 1) - (i52 ^ 53);
                    f52494t0 = i53 % 128;
                    if (i53 % 2 != 0) {
                        return aerVar;
                    }
                    throw null;
                case 27:
                    adj adjVar = (adj) adj.setOnFocusChangeListener(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, -1757678207, 1757678211, (int) System.currentTimeMillis());
                    int i54 = f52493s0 + 89;
                    f52494t0 = i54 % 128;
                    int i55 = i54 % 2;
                    return adjVar;
                case 28:
                    aep aepVar = (aep) aep.setX(new Object[]{(byte[]) s0.b(new Object[]{s0Var}, 1552872941, -1552872940, System.identityHashCode(s0Var))}, 1274127729, -1274127722, (int) System.currentTimeMillis());
                    int i56 = f52493s0;
                    int i57 = i56 & 61;
                    int i58 = -(-((i56 ^ 61) | i57));
                    int i59 = (i57 & i58) + (i58 | i57);
                    f52494t0 = i59 % 128;
                    if (i59 % 2 == 0) {
                        int i60 = 29 / 0;
                    }
                    return aepVar;
                case 30:
                    acy acyVar = (acy) acy.setCompoundDrawableTintBlendMode(new Object[]{(char[]) setOnFocusChangeListener(new Object[]{s0Var}, 318318734, -318318732, (int) System.currentTimeMillis())}, 411506766, -411506762, (int) System.currentTimeMillis());
                    int i61 = f52494t0;
                    int i62 = i61 & 31;
                    int i63 = (((i61 | 31) & (~i62)) - (~(i62 << 1))) - 1;
                    f52493s0 = i63 % 128;
                    if (i63 % 2 == 0) {
                        return acyVar;
                    }
                    throw null;
            }
        } catch (IllegalArgumentException e5) {
            throw new adk(e5.getMessage(), e5);
        } catch (IllegalStateException e7) {
            throw new adk(e7.getMessage(), e7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
    
        return java.lang.Integer.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
    
        if (128 != r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.adq.f52494t0;
        r3 = r1 & 1;
        r1 = -(-(r1 | 1));
        r5 = ((r3 | r1) << 1) - (r1 ^ r3);
        r1 = r5 % 128;
        com.mypinpad.tsdk.isolation.adq.f52493s0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
    
        if ((r5 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        r2 = ((r1 | 71) << 1) - (r1 ^ 71);
        com.mypinpad.tsdk.isolation.adq.f52494t0 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if ((r2 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        r2 = 17 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        if (r6 < 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        if (255 == r6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
    
        r6 = r6 & 127;
        r8 = com.mypinpad.tsdk.isolation.adq.f52493s0;
        r9 = ((r8 & 4) + (r8 | 4)) - 1;
        com.mypinpad.tsdk.isolation.adq.f52494t0 = r9 % 128;
        r9 = r9 % 2;
        r8 = 0;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bd, code lost:
    
        r10 = r1.read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        if (r10 < 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if ((r8 >>> 23) != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
    
        r8 = r8 << 8;
        r11 = r10 * 765;
        r12 = r8 * (-1527);
        r13 = ((r11 ^ r12) | (r11 & r12)) << 1;
        r11 = -(((~r11) & r12) | ((~r12) & r11));
        r12 = (r13 & r11) + (r11 | r13);
        r11 = ~r3;
        r13 = r11 & r10;
        r14 = (~r13) & (r11 | r10);
        r15 = ~r10;
        r13 = ~((r14 ^ r13) | (r13 & r14));
        r14 = (~r13) & r8;
        r7 = ~r8;
        r12 = r12 - (~(((r13 & r8) | (r14 | (r13 & r7))) * 764));
        r13 = (r12 ^ (-1)) + (r12 << 1);
        r12 = (r15 | r10) & r15;
        r0 = ((~r12) & r8) | (r12 & r7);
        r12 = r12 & r8;
        r0 = ~((r0 & r12) | (r0 ^ r12));
        r11 = r11 & (r11 | r3);
        r12 = ~((r11 ^ r8) | (r11 & r8));
        r0 = ((r0 & r12) | (r0 ^ r12)) * (-1528);
        r12 = ((~r0) & r13) | ((~r13) & r0);
        r0 = (r0 & r13) << 1;
        r13 = ((r12 | r0) << 1) - (r0 ^ r12);
        r0 = (r15 & r7) | ((~r15) & r8);
        r8 = r8 & r15;
        r0 = ~((r0 & r8) | (r0 ^ r8));
        r8 = r7 & r10;
        r7 = (r7 | r10) & (~r8);
        r7 = ~((r7 & r8) | (r7 ^ r8));
        r0 = (r0 & r7) | (r0 ^ r7);
        r7 = (r11 ^ r10) | (r11 & r10);
        r8 = ~r7;
        r7 = (r7 | r8) & r8;
        r0 = ((r0 & r7) | (r0 ^ r7)) * 764;
        r7 = r13 & r0;
        r0 = (r0 | r13) & (~r7);
        r7 = r7 << 1;
        r8 = (r0 ^ r7) + ((r0 & r7) << 1);
        r0 = r9 & 1;
        r9 = ((~r0) & (r9 | 1)) + (r0 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x015f, code lost:
    
        if (r9 < r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0161, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.adq.f52494t0;
        r1 = ((r0 & 66) + (r0 | 66)) - 1;
        com.mypinpad.tsdk.isolation.adq.f52493s0 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x016e, code lost:
    
        if ((r1 % 2) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0170, code lost:
    
        if (r8 < r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0172, code lost:
    
        if (r5 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0175, code lost:
    
        r1 = new java.lang.StringBuilder("corrupted stream - out of bounds length found: ");
        r1.append(r8);
        r1.append(" >= ");
        r1.append(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0190, code lost:
    
        throw new java.io.IOException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0191, code lost:
    
        r1 = (((r0 ^ 81) | (r0 & 81)) << 1) - (((~r0) & 81) | (r0 & (-82)));
        com.mypinpad.tsdk.isolation.adq.f52493s0 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a3, code lost:
    
        if ((r1 % 2) == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01a5, code lost:
    
        r0 = 61 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ad, code lost:
    
        return java.lang.Integer.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b2, code lost:
    
        return java.lang.Integer.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c0, code lost:
    
        throw new java.io.IOException("long form definite-length more than 31 bits");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01c8, code lost:
    
        throw new java.io.EOFException("EOF found reading length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01d0, code lost:
    
        throw new java.io.IOException("invalid long form definite-length 0xFF");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d8, code lost:
    
        throw new java.io.EOFException("EOF found when length expected");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003e, code lost:
    
        if (((r8 & r9) + (r8 | r9)) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        if ((r6 >>> 7) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.adq.f52493s0;
        r1 = ((r0 ^ 76) + ((r0 & 76) << 1)) - 1;
        com.mypinpad.tsdk.isolation.adq.f52494t0 = r1 % 128;
        r1 = r1 % 2;
        r3 = r0 & 119;
        r1 = ((((r0 ^ 119) | r3) << 1) - (~(-((r0 | 119) & (~r3))))) - 1;
        com.mypinpad.tsdk.isolation.adq.f52494t0 = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Integer d(java.lang.Object[] r17) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.adq.d(java.lang.Object[]):java.lang.Integer");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[LOOP:0: B:17:0x005a->B:28:0x0083, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1 A[SYNTHETIC] */
    public static /* synthetic */ Integer e(Object[] objArr) throws IOException {
        int i10;
        int i11;
        InputStream inputStream = (InputStream) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i12 = f52494t0;
        int i13 = i12 & 113;
        int i14 = i12 ^ 113;
        int i15 = (i13 - (~(-(-(i14 | i13))))) - 1;
        f52493s0 = i15 % 128;
        int i16 = i15 % 2;
        int i17 = iIntValue & 31;
        if (i17 == 31) {
            int i18 = i14 + (i13 << 1);
            f52493s0 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = inputStream.read();
            if (i20 < 31) {
                int i21 = f52493s0 + 29;
                f52494t0 = i21 % 128;
                if (i21 % 2 == 0) {
                    throw null;
                }
                if (i20 < 0) {
                    throw new EOFException("EOF found inside tag value.");
                }
                throw new IOException("corrupted stream - high tag number < 31 found");
            }
            int i22 = i20 & 127;
            if (i22 == 0) {
                throw new IOException("corrupted stream - invalid high tag number found");
            }
            while ((i20 & 128) != 0) {
                int i23 = f52494t0;
                int i24 = (-2) - ((((i23 | 44) << 1) - (i23 ^ 44)) ^ (-1));
                f52493s0 = i24 % 128;
                if (i24 % 2 != 0) {
                    if (i22 * 45 != 0) {
                        throw new IOException("Tag number more than 31 bits");
                    }
                    i10 = i22 << 7;
                    i11 = inputStream.read();
                    if (i11 >= 0) {
                        throw new EOFException("EOF found inside tag value.");
                    }
                    int i25 = i11 & 127;
                    int i26 = (i10 & i25) | (i10 ^ i25);
                    int i27 = f52494t0;
                    int i28 = i27 & 45;
                    int i29 = (i27 | 45) & (~i28);
                    int i30 = i28 << 1;
                    int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
                    f52493s0 = i31 % 128;
                    int i32 = i31 % 2;
                    i22 = i26;
                    i20 = i11;
                } else {
                    if ((i22 >>> 24) != 0) {
                        throw new IOException("Tag number more than 31 bits");
                    }
                    i10 = i22 << 7;
                    i11 = inputStream.read();
                    if (i11 >= 0) {
                        throw new EOFException("EOF found inside tag value.");
                    }
                    int i210 = i11 & 127;
                    int i211 = (i10 & i210) | (i10 ^ i210);
                    int i212 = f52494t0;
                    int i213 = i212 & 45;
                    int i214 = (i212 | 45) & (~i213);
                    int i33 = i213 << 1;
                    int i34 = ((i214 | i33) << 1) - (i214 ^ i33);
                    f52493s0 = i34 % 128;
                    int i35 = i34 % 2;
                    i22 = i211;
                    i20 = i11;
                }
            }
            i17 = i22;
        }
        int i36 = f52493s0;
        int i37 = (i36 ^ 15) + ((i36 & 15) << 1);
        f52494t0 = i37 % 128;
        int i38 = i37 % 2;
        return Integer.valueOf(i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x05f9, code lost:
    
        if (r14 <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x060c, code lost:
    
        if (r14 <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x060e, code lost:
    
        r12 = new com.mypinpad.tsdk.isolation.adh(0);
        r13 = com.mypinpad.tsdk.isolation.adq.f52494t0;
        r14 = (((r13 | 40) << 1) - (r13 ^ 40)) - 1;
        com.mypinpad.tsdk.isolation.adq.f52493s0 = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0624, code lost:
    
        r15 = new com.mypinpad.tsdk.isolation.adq(r12, r14, r13.f52496q0, r13.f52497r0);
        r12 = (com.mypinpad.tsdk.isolation.adh) setOnFocusChangeListener(new java.lang.Object[]{r15}, 1289812975, -1289812962, java.lang.System.identityHashCode(r15));
        r13 = com.mypinpad.tsdk.isolation.adq.f52494t0;
        r14 = ((r13 & 94) + (r13 | 94)) - 1;
        com.mypinpad.tsdk.isolation.adq.f52493s0 = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x064e, code lost:
    
        if ((r14 % 2) != 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0652, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:?, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setOnFocusChangeListener(java.lang.Object[] r12, int r13, int r14, int r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.adq.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final ady setX() throws IOException {
        return (ady) setOnFocusChangeListener(new Object[]{this}, -1818946624, 1818946633, System.identityHashCode(this));
    }

    public adq(InputStream inputStream, int i10, boolean z10) {
        this(inputStream, i10, z10, new byte[11][]);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public adq(InputStream inputStream, byte b10) {
        this(inputStream, w0.a(new Object[]{inputStream}).intValue(), true);
        System.currentTimeMillis();
    }

    public adq(byte[] bArr, byte b10) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }

    public adq(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public adq(InputStream inputStream) {
        this(inputStream, w0.a(new Object[]{inputStream}).intValue(), false);
        System.currentTimeMillis();
    }
}
