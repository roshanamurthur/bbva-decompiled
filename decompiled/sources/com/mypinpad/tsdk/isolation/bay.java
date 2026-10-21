package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class bay extends bav implements ben {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f54369w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f54370x0 = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final bax f54371s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f54372t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f54373u0;
    public final byte[] v0;

    public bay(setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode) {
        super(false, ((bax) setCompoundDrawableTintBlendMode.setX(new Object[]{setcompounddrawabletintblendmode}, -1474616324, 1474616330, (int) System.currentTimeMillis())).setDividerPadding());
        bax baxVar = (bax) setCompoundDrawableTintBlendMode.setX(new Object[]{setcompounddrawabletintblendmode}, -1474616324, 1474616330, (int) System.currentTimeMillis());
        this.f54371s0 = baxVar;
        if (baxVar == null) {
            throw new NullPointerException("params == null");
        }
        int iIntValue = ((Integer) bax.setOnFocusChangeListener(new Object[]{baxVar}, -1645560145, 1645560148, System.identityHashCode(baxVar))).intValue();
        byte[] bArr = (byte[]) setCompoundDrawableTintBlendMode.setX(new Object[]{setcompounddrawabletintblendmode}, -1669341798, 1669341801, (int) System.currentTimeMillis());
        if (bArr == null) {
            if (((bbd) bax.setOnFocusChangeListener(new Object[]{baxVar}, 2012589847, -2012589846, System.identityHashCode(baxVar))) != null) {
                this.f54372t0 = ((bbd) bax.setOnFocusChangeListener(new Object[]{baxVar}, 2012589847, -2012589846, System.identityHashCode(baxVar))).setDividerPadding();
            } else {
                this.f54372t0 = 0;
            }
            byte[] bArr2 = (byte[]) setCompoundDrawableTintBlendMode.setX(new Object[]{setcompounddrawabletintblendmode}, 1632777157, -1632777152, (int) System.currentTimeMillis());
            if (bArr2 == null) {
                this.f54373u0 = new byte[iIntValue];
            } else {
                if (bArr2.length != iIntValue) {
                    throw new IllegalArgumentException("length of root must be equal to length of digest");
                }
                this.f54373u0 = bArr2;
            }
            byte[] bArr3 = (byte[]) setCompoundDrawableTintBlendMode.setX(new Object[]{setcompounddrawabletintblendmode}, -118881165, 118881167, (int) System.currentTimeMillis());
            if (bArr3 == null) {
                this.v0 = new byte[iIntValue];
                return;
            } else {
                if (bArr3.length != iIntValue) {
                    throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
                }
                this.v0 = bArr3;
                return;
            }
        }
        int length = bArr.length;
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = iIntValue * 530;
        int i11 = i10 & 1058;
        int i12 = ((i11 + ((i10 ^ 1058) | i11)) - (~(-(~i10)))) - 1;
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        int i14 = ~iCurrentTimeMillis;
        int i15 = (i14 | iCurrentTimeMillis) & i14;
        int i16 = i15 & iIntValue;
        int i17 = (i15 | iIntValue) & (~i16);
        int i18 = ~iIntValue;
        int i19 = (i17 & i16) | (i17 ^ i16);
        int i20 = ~i19;
        int i21 = (i19 | i20) & i20;
        int i22 = iIntValue ^ iIntValue;
        int i23 = iIntValue & iIntValue;
        int i24 = (i22 & i23) | (i22 ^ i23);
        int i25 = ~i24;
        int i26 = (i24 | i25) & i25;
        int i27 = ((~i26) & i21) | ((~i21) & i26);
        int i28 = i21 & i26;
        int i29 = -(-(((i28 & i27) | (i27 ^ i28)) * 529));
        int i30 = ((i13 ^ i29) - (~((i13 & i29) << 1))) - 1;
        int i31 = (i18 | iIntValue) & i18;
        int i32 = (i14 & iIntValue) | (iCurrentTimeMillis & i18);
        int i33 = iCurrentTimeMillis & iIntValue;
        int i34 = (i33 & i32) | (i32 ^ i33);
        int i35 = ~i34;
        int i36 = (i34 | i35) & i35;
        int i37 = i31 ^ i36;
        int i38 = i36 & i31;
        int i39 = ((i38 & i37) | (i37 ^ i38)) * 529;
        int i40 = ((i30 ^ i39) | (i30 & i39)) << 1;
        int i41 = -((i39 & (~i30)) | ((~i39) & i30));
        if (length == ((i40 | i41) << 1) - (i41 ^ i40)) {
            this.f54372t0 = 0;
            this.f54373u0 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, 0, Integer.valueOf(iIntValue)}, 427617211, -427617208, 0);
            this.v0 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue)}, 427617211, -427617208, iIntValue);
            return;
        }
        int length2 = bArr.length;
        int i42 = ((iIntValue ^ 4) | (iIntValue & 4)) << 1;
        int i43 = i18 & 4;
        int i44 = -((iIntValue & (-5)) | i43);
        int i45 = (i42 ^ i44) + ((i42 & i44) << 1);
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i46 = iIntValue * 371;
        int i47 = i45 * 371;
        int i48 = (i46 ^ i47) + ((i46 & i47) << 1);
        int i49 = ~i45;
        int i50 = ~iCurrentTimeMillis2;
        int i51 = i49 & i50;
        int i52 = (~i51) & (i49 | i50);
        int i53 = ~((i52 ^ i51) | (i51 & i52));
        int i54 = i18 & i50;
        int i55 = ~i18;
        int i56 = i54 | (iCurrentTimeMillis2 & i55);
        int i57 = i18 & iCurrentTimeMillis2;
        int i58 = ~((i56 ^ i57) | (i56 & i57));
        int i59 = ((i53 ^ i58) | (i53 & i58)) * (-370);
        int i60 = i48 ^ i59;
        int i61 = ((i48 & i59) | i60) << 1;
        int i62 = -i60;
        int i63 = (i61 & i62) + (i61 | i62);
        int i64 = ~(((~i50) & i18) | (i50 & i55) | i54);
        int i65 = ~(iCurrentTimeMillis2 | i49);
        int i66 = ((~i65) & i64) | ((~i64) & i65);
        int i67 = i65 & i64;
        int i68 = (i49 & iIntValue) | (i45 & i18);
        int i69 = iIntValue & i45;
        int i70 = (((i67 & i66) | (i66 ^ i67) | (~((i68 & i69) | (i68 ^ i69)))) * (-370)) + i63;
        int i71 = (iIntValue ^ i45) | i69;
        int i72 = ~i71;
        int i73 = -(~(((i71 | i72) & i72) * 370));
        if (length2 != ((i70 ^ i73) + ((i70 & i73) << 1)) - 1) {
            throw new IllegalArgumentException("public key has wrong size");
        }
        this.f54372t0 = ((Integer) ber.setDividerPadding(new Object[]{bArr, 0}, 450133947, -450133937, 0)).intValue();
        this.f54373u0 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, 4, Integer.valueOf(iIntValue)}, 427617211, -427617208, 4);
        int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
        int i74 = iIntValue * (-520);
        int i75 = ((2088 | i74) << 1) - (i74 ^ 2088);
        int i76 = ~iCurrentTimeMillis3;
        int i77 = (i76 & i18) | ((~i76) & iIntValue);
        int i78 = i76 & iIntValue;
        int i79 = (i77 & i78) | (i77 ^ i78);
        int i80 = ~i79;
        int i81 = (i79 | i80) & i80;
        int i82 = ((~i81) & 4) | (i81 & (-5));
        int i83 = i81 & 4;
        int i84 = -(-(((i83 & i82) | (i82 ^ i83)) * (-1042)));
        int i85 = i75 & i84;
        int i86 = (i84 | i75) & (~i85);
        int i87 = i85 << 1;
        int i88 = ((i86 | i87) << 1) - (i86 ^ i87);
        int i89 = (iCurrentTimeMillis3 & i18) | i78;
        int i90 = iIntValue & iCurrentTimeMillis3;
        int i91 = -(~(-(-(((i89 & i90) | (i89 ^ i90)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY))));
        int i92 = ((i88 ^ i91) + ((i91 & i88) << 1)) - 1;
        int i93 = (i55 & (-5)) | i43;
        int i94 = (-5) & i18;
        int i95 = ~((i93 & i94) | (i93 ^ i94));
        int i96 = (-5) ^ iCurrentTimeMillis3;
        int i97 = (-5) & iCurrentTimeMillis3;
        int i98 = ~((i97 & i96) | (i96 ^ i97));
        int i99 = ((~i98) & i95) | ((~i95) & i98);
        int i100 = i95 & i98;
        int i101 = (i100 & i99) | (i99 ^ i100);
        int i102 = (iCurrentTimeMillis3 | i76) & i76;
        int i103 = i102 ^ 4;
        int i104 = 4 & i102;
        int i105 = ~((i104 & i103) | (i103 ^ i104) | iIntValue);
        int i106 = (((i105 & i101) | ((~i105) & i101) | ((~i101) & i105)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i92;
        this.v0 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i106), Integer.valueOf(iIntValue)}, 427617211, -427617208, i106);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0169 A[PHI: r13
      0x0169: PHI (r13v14 int) = (r13v13 int), (r13v28 int) binds: [B:31:0x0167, B:27:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int iIntValue;
        byte[] bArr;
        int i13 = (((~i10) | i11) * 160) + (i11 * (-159)) + (i10 * (-159));
        int i14 = ~i12;
        int i15 = ((i10 | (~((~i11) | i14))) * 160) + (((~(i14 | i10)) | (~(i10 | i11))) * (-160)) + i13;
        int i16 = 4;
        if (i15 != 1) {
            if (i15 == 2) {
                bay bayVar = (bay) objArr[0];
                int i17 = f54370x0;
                int i18 = (i17 & 123) + (i17 | 123);
                f54369w0 = i18 % 128;
                int i19 = i18 % 2;
                byte[] bArr2 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bayVar.f54373u0}, -759448087, 759448096, (int) System.currentTimeMillis());
                int i20 = f54370x0;
                int i21 = (i20 & (-70)) | ((~i20) & 69);
                int i22 = -(-((i20 & 69) << 1));
                int i23 = (i21 & i22) + (i22 | i21);
                f54369w0 = i23 % 128;
                if (i23 % 2 == 0) {
                    return bArr2;
                }
                throw null;
            }
            if (i15 == 3) {
                bay bayVar2 = (bay) objArr[0];
                int i24 = f54370x0;
                int i25 = ((i24 & 32) + (i24 | 32)) - 1;
                f54369w0 = i25 % 128;
                int i26 = i25 % 2;
                byte[] bArr3 = bayVar2.v0;
                Object[] objArr2 = new Object[1];
                if (i26 != 0) {
                    objArr2[0] = bArr3;
                    throw null;
                }
                objArr2[0] = bArr3;
                byte[] bArr4 = (byte[]) bbi.setOnFocusChangeListener(objArr2, -759448087, 759448096, (int) System.currentTimeMillis());
                int i27 = f54370x0;
                int i28 = (i27 & 21) + (i27 | 21);
                f54369w0 = i28 % 128;
                if (i28 % 2 == 0) {
                    return bArr4;
                }
                int i29 = 37 / 0;
                return bArr4;
            }
            if (i15 == 4) {
                bay bayVar3 = (bay) objArr[0];
                int i30 = (-2) - ((f54369w0 + 42) ^ (-1));
                f54370x0 = i30 % 128;
                int i31 = i30 % 2;
                byte[] bArr5 = (byte[]) setX(new Object[]{bayVar3}, -678559952, 678559953, System.identityHashCode(bayVar3));
                int i32 = f54369w0;
                int i33 = (i32 ^ 65) + ((i32 & 65) << 1);
                f54370x0 = i33 % 128;
                if (i33 % 2 != 0) {
                    return bArr5;
                }
                throw null;
            }
            bay bayVar4 = (bay) objArr[0];
            int i34 = f54369w0;
            int i35 = i34 ^ 121;
            int i36 = -(-((i34 & 121) << 1));
            int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
            f54370x0 = i37 % 128;
            int i38 = i37 % 2;
            bax baxVar = bayVar4.f54371s0;
            int i39 = (((i34 & (-78)) | ((~i34) & 77)) - (~(-(-((i34 & 77) << 1))))) - 1;
            f54370x0 = i39 % 128;
            int i40 = i39 % 2;
            return baxVar;
        }
        bay bayVar5 = (bay) objArr[0];
        int i41 = f54369w0;
        int i42 = i41 & 63;
        int i43 = (i41 | 63) & (~i42);
        int i44 = i42 << 1;
        int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
        f54370x0 = i45 % 128;
        if (i45 % 2 == 0) {
            bax baxVar2 = bayVar5.f54371s0;
            iIntValue = ((Integer) bax.setOnFocusChangeListener(new Object[]{baxVar2}, -1645560145, 1645560148, System.identityHashCode(baxVar2))).intValue();
            if (bayVar5.f54372t0 != 0) {
                int iIdentityHashCode = System.identityHashCode(bayVar5);
                int i46 = iIntValue * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY;
                int i47 = ((-2080) & i46) + (i46 | (-2080));
                int i48 = ((-5) ^ iIntValue) | ((-5) & iIntValue);
                int i49 = i48 & iIdentityHashCode;
                int i50 = -(-((~(((i48 | iIdentityHashCode) & (~i49)) | i49)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                int i51 = i47 & i50;
                int i52 = (i50 ^ i47) | i51;
                int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                int i54 = ~iIntValue;
                int i55 = i54 & 4;
                int i56 = (~((i54 ^ 4) | i55)) * (-1042);
                int i57 = ((((~i56) & i53) | ((~i53) & i56)) - (~(-(-((i53 & i56) << 1))))) - 1;
                int i58 = (~i55) & (i54 | 4);
                int i59 = ~((i58 & i55) | (i58 ^ i55));
                int i60 = ~iIdentityHashCode;
                int i61 = (iIdentityHashCode | i60) & i60;
                int i62 = (-5) & i61;
                int i63 = ((i61 | (-5)) & (~i62)) | i62;
                int i64 = (i63 & i54) | ((~i63) & iIntValue);
                int i65 = i63 & iIntValue;
                int i66 = ~((i65 & i64) | (i64 ^ i65));
                int i67 = i59 ^ i66;
                int i68 = i66 & i59;
                int i69 = ((i68 & i67) | (i67 ^ i68)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                int i70 = ((~i69) & i57) | ((~i57) & i69);
                int i71 = (i69 & i57) << 1;
                int i72 = (i70 & i71) + (i71 | i70);
                int i73 = i72 & iIntValue;
                bArr = new byte[(((~i73) & (i72 | iIntValue)) - (~(-(-(i73 << 1))))) - 1];
                int i74 = bayVar5.f54372t0;
                ber.setDividerPadding(new Object[]{Integer.valueOf(i74), bArr, 0}, -2092293587, 2092293591, i74);
                int i75 = f54370x0 + 75;
                f54369w0 = i75 % 128;
                int i76 = i75 % 2;
            } else {
                i16 = 1;
                int iIdentityHashCode2 = System.identityHashCode(bayVar5);
                int i77 = ((iIntValue * 784) - (~(iIntValue * (-782)))) - 1;
                int i78 = ~iIntValue;
                int i79 = (-2) - ((i77 - (~(-(-(((i78 | iIntValue) & i78) * (-783)))))) ^ (-1));
                int i80 = ~iIdentityHashCode2;
                int i81 = i78 ^ i80;
                int i82 = i78 & i80;
                int i83 = (i81 & i82) | (i81 ^ i82);
                int i84 = i83 & iIntValue;
                int i85 = (i83 | iIntValue) & (~i84);
                int i86 = (~((i85 & i84) | (i85 ^ i84))) * (-783);
                int i87 = i79 & i86;
                int i88 = i87 + ((i79 ^ i86) | i87);
                int i89 = ~((i80 & iIntValue) | (i80 ^ iIntValue));
                int i90 = i78 ^ i89;
                int i91 = i89 & i78;
                int i92 = -(~(-(-(((i91 & i90) | (i90 ^ i91)) * 783))));
                bArr = new byte[(((i88 | i92) << 1) - (i92 ^ i88)) - 1];
                int i93 = f54370x0;
                int i94 = ((i93 ^ 63) | (i93 & 63)) << 1;
                int i95 = -(((~i93) & 63) | (i93 & (-64)));
                int i96 = (i94 & i95) + (i95 | i94);
                f54369w0 = i96 % 128;
                int i97 = i96 % 2;
            }
        } else {
            bax baxVar3 = bayVar5.f54371s0;
            iIntValue = ((Integer) bax.setOnFocusChangeListener(new Object[]{baxVar3}, -1645560145, 1645560148, System.identityHashCode(baxVar3))).intValue();
            if (bayVar5.f54372t0 != 0) {
                int iIdentityHashCode3 = System.identityHashCode(bayVar5);
                int i410 = iIntValue * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY;
                int i411 = ((-2080) & i410) + (i410 | (-2080));
                int i412 = ((-5) ^ iIntValue) | ((-5) & iIntValue);
                int i413 = i412 & iIdentityHashCode3;
                int i510 = -(-((~(((i412 | iIdentityHashCode3) & (~i413)) | i413)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                int i511 = i411 & i510;
                int i512 = (i510 ^ i411) | i511;
                int i513 = (i511 ^ i512) + ((i512 & i511) << 1);
                int i514 = ~iIntValue;
                int i515 = i514 & 4;
                int i516 = (~((i514 ^ 4) | i515)) * (-1042);
                int i517 = ((((~i516) & i513) | ((~i513) & i516)) - (~(-(-((i513 & i516) << 1))))) - 1;
                int i518 = (~i515) & (i514 | 4);
                int i519 = ~((i518 & i515) | (i518 ^ i515));
                int i610 = ~iIdentityHashCode3;
                int i611 = (iIdentityHashCode3 | i610) & i610;
                int i612 = (-5) & i611;
                int i613 = ((i611 | (-5)) & (~i612)) | i612;
                int i614 = (i613 & i514) | ((~i613) & iIntValue);
                int i615 = i613 & iIntValue;
                int i616 = ~((i615 & i614) | (i614 ^ i615));
                int i617 = i519 ^ i616;
                int i618 = i616 & i519;
                int i619 = ((i618 & i617) | (i617 ^ i618)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                int i710 = ((~i619) & i517) | ((~i517) & i619);
                int i711 = (i619 & i517) << 1;
                int i712 = (i710 & i711) + (i711 | i710);
                int i713 = i712 & iIntValue;
                bArr = new byte[(((~i713) & (i712 | iIntValue)) - (~(-(-(i713 << 1))))) - 1];
                int i714 = bayVar5.f54372t0;
                ber.setDividerPadding(new Object[]{Integer.valueOf(i714), bArr, 0}, -2092293587, 2092293591, i714);
                int i715 = f54370x0 + 75;
                f54369w0 = i715 % 128;
                int i716 = i715 % 2;
            } else {
                i16 = 0;
                int iIdentityHashCode4 = System.identityHashCode(bayVar5);
                int i717 = ((iIntValue * 784) - (~(iIntValue * (-782)))) - 1;
                int i718 = ~iIntValue;
                int i719 = (-2) - ((i717 - (~(-(-(((i718 | iIntValue) & i718) * (-783)))))) ^ (-1));
                int i810 = ~iIdentityHashCode4;
                int i811 = i718 ^ i810;
                int i812 = i718 & i810;
                int i813 = (i811 & i812) | (i811 ^ i812);
                int i814 = i813 & iIntValue;
                int i815 = (i813 | iIntValue) & (~i814);
                int i816 = (~((i815 & i814) | (i815 ^ i814))) * (-783);
                int i817 = i719 & i816;
                int i818 = i817 + ((i719 ^ i816) | i817);
                int i819 = ~((i810 & iIntValue) | (i810 ^ iIntValue));
                int i98 = i718 ^ i819;
                int i99 = i819 & i718;
                int i910 = -(~(-(-(((i99 & i98) | (i98 ^ i99)) * 783))));
                bArr = new byte[(((i818 | i910) << 1) - (i910 ^ i818)) - 1];
                int i911 = f54370x0;
                int i912 = ((i911 ^ 63) | (i911 & 63)) << 1;
                int i913 = -(((~i911) & 63) | (i911 & (-64)));
                int i914 = (i912 & i913) + (i913 | i912);
                f54369w0 = i914 % 128;
                int i915 = i914 % 2;
            }
        }
        bbi.setOnFocusChangeListener(new Object[]{bArr, bayVar5.f54373u0, Integer.valueOf(i16)}, -2011745549, 2011745550, i16);
        int i100 = -(-iIntValue);
        int i101 = i16 & i100;
        int i102 = (i100 | i16) & (~i101);
        int i103 = -(-(i101 << 1));
        int i104 = ((i102 | i103) << 1) - (i102 ^ i103);
        bbi.setOnFocusChangeListener(new Object[]{bArr, bayVar5.v0, Integer.valueOf(i104)}, -2011745549, 2011745550, i104);
        int i105 = f54370x0 + 20;
        int i106 = (i105 ^ (-1)) + (i105 << 1);
        f54369w0 = i106 % 128;
        if (i106 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.ben
    public final byte[] setAlwaysDrawnWithCacheEnabled() throws IOException {
        return (byte[]) setX(new Object[]{this}, -164340535, 164340539, System.identityHashCode(this));
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, -164165878, 164165881, System.identityHashCode(this));
    }

    public final bax setOnDragListener() {
        return (bax) setX(new Object[]{this}, 1913390279, -1913390279, System.identityHashCode(this));
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setX(new Object[]{this}, -842046804, 842046806, System.identityHashCode(this));
    }

    public final byte[] setY() {
        return (byte[]) setX(new Object[]{this}, -678559952, 678559953, System.identityHashCode(this));
    }

    public static class setCompoundDrawableTintBlendMode {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f54374e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f54375f = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bax f54376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f54377b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f54378c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f54379d = null;

        public setCompoundDrawableTintBlendMode(bax baxVar) {
            this.f54376a = baxVar;
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            Object obj;
            int i13 = ~i12;
            int i14 = i13 | i10;
            int i15 = ((~(i14 | i11)) * 52) + (i11 * 53) + (i10 * (-51));
            int i16 = ~i11;
            int i17 = (((~i14) | (~(i16 | i10)) | (~(i16 | i13))) * (-52)) + i15;
            int i18 = ~i10;
            switch ((((~(i18 | i11)) | (~(i13 | i18))) * 52) + i17) {
                case 1:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
                    byte[] bArr = (byte[]) objArr[1];
                    int i19 = f54374e + 35;
                    f54375f = i19 % 128;
                    int i20 = i19 % 2;
                    setcompounddrawabletintblendmode.f54379d = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr}, -759448087, 759448096, (int) System.currentTimeMillis());
                    int i21 = f54375f;
                    int i22 = ((i21 ^ 85) | (i21 & 85)) << 1;
                    int i23 = -(((~i21) & 85) | (i21 & (-86)));
                    int i24 = (i22 & i23) + (i23 | i22);
                    f54374e = i24 % 128;
                    int i25 = i24 % 2;
                    return setcompounddrawabletintblendmode;
                case 2:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int i26 = f54374e;
                    int i27 = i26 ^ 27;
                    int i28 = (((i26 & 27) | i27) << 1) - i27;
                    f54375f = i28 % 128;
                    int i29 = i28 % 2;
                    obj = setcompounddrawabletintblendmode2.f54378c;
                    int i30 = i26 + 63;
                    f54375f = i30 % 128;
                    if (i30 % 2 == 0) {
                        throw null;
                    }
                    break;
                case 3:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int i31 = f54375f + 22;
                    int i32 = (i31 ^ (-1)) + (i31 << 1);
                    int i33 = i32 % 128;
                    f54374e = i33;
                    int i34 = i32 % 2;
                    obj = setcompounddrawabletintblendmode3.f54379d;
                    int i35 = i33 & 23;
                    int i36 = ((((i33 ^ 23) | i35) << 1) - (~(-((i33 | 23) & (~i35))))) - 1;
                    f54375f = i36 % 128;
                    int i37 = i36 % 2;
                    break;
                case 4:
                    bay bayVar = new bay((setCompoundDrawableTintBlendMode) objArr[0]);
                    int i38 = f54374e;
                    int i39 = i38 & 109;
                    int i40 = i38 | 109;
                    int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                    f54375f = i41 % 128;
                    int i42 = i41 % 2;
                    return bayVar;
                case 5:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int i43 = f54375f;
                    int i44 = (i43 & (-12)) | ((~i43) & 11);
                    int i45 = -(-((i43 & 11) << 1));
                    int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                    int i47 = i46 % 128;
                    f54374e = i47;
                    int i48 = i46 % 2;
                    obj = setcompounddrawabletintblendmode4.f54377b;
                    int i49 = (i47 & (-56)) | ((~i47) & 55);
                    int i50 = -(-((i47 & 55) << 1));
                    int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                    f54375f = i51 % 128;
                    int i52 = i51 % 2;
                    break;
                case 6:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode5 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int i53 = f54374e;
                    int i54 = ((i53 ^ 51) | (i53 & 51)) << 1;
                    int i55 = ~i53;
                    int i56 = -((i53 & (-52)) | (i55 & 51));
                    int i57 = (i54 ^ i56) + ((i54 & i56) << 1);
                    f54375f = i57 % 128;
                    int i58 = i57 % 2;
                    obj = setcompounddrawabletintblendmode5.f54376a;
                    int i59 = ((i53 ^ 69) | (i53 & 69)) << 1;
                    int i60 = -((i53 & (-70)) | (i55 & 69));
                    int i61 = (i59 & i60) + (i60 | i59);
                    f54375f = i61 % 128;
                    int i62 = i61 % 2;
                    break;
                case 7:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode6 = (setCompoundDrawableTintBlendMode) objArr[0];
                    byte[] bArr2 = (byte[]) objArr[1];
                    int i63 = f54374e;
                    int i64 = i63 & 75;
                    int i65 = (i63 | 75) & (~i64);
                    int i66 = -(-(i64 << 1));
                    int i67 = (i65 ^ i66) + ((i65 & i66) << 1);
                    f54375f = i67 % 128;
                    int i68 = i67 % 2;
                    setcompounddrawabletintblendmode6.f54378c = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr2}, -759448087, 759448096, (int) System.currentTimeMillis());
                    int i69 = (-2) - ((f54374e + 22) ^ (-1));
                    f54375f = i69 % 128;
                    int i70 = i69 % 2;
                    return setcompounddrawabletintblendmode6;
                default:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode7 = (setCompoundDrawableTintBlendMode) objArr[0];
                    byte[] bArr3 = (byte[]) objArr[1];
                    int i71 = f54374e;
                    int i72 = i71 & 9;
                    int i73 = ((i71 ^ 9) | i72) << 1;
                    int i74 = -((i71 | 9) & (~i72));
                    int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
                    f54375f = i75 % 128;
                    int i76 = i75 % 2;
                    setcompounddrawabletintblendmode7.f54377b = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr3}, -759448087, 759448096, (int) System.currentTimeMillis());
                    int i77 = f54374e;
                    int i78 = i77 & 103;
                    int i79 = i78 + ((i77 ^ 103) | i78);
                    f54375f = i79 % 128;
                    if (i79 % 2 != 0) {
                        return setcompounddrawabletintblendmode7;
                    }
                    int i80 = 17 / 0;
                    return setcompounddrawabletintblendmode7;
            }
            return obj;
        }

        public final bay setCompoundDrawableTintBlendMode() {
            return (bay) setX(new Object[]{this}, -115769576, 115769580, System.identityHashCode(this));
        }

        public final setCompoundDrawableTintBlendMode setOnFocusChangeListener(byte[] bArr) {
            return (setCompoundDrawableTintBlendMode) setX(new Object[]{this, bArr}, -1801529851, 1801529851, System.identityHashCode(this));
        }

        public final setCompoundDrawableTintBlendMode setY(byte[] bArr) {
            return (setCompoundDrawableTintBlendMode) setX(new Object[]{this, bArr}, -817022474, 817022481, System.identityHashCode(this));
        }

        public final setCompoundDrawableTintBlendMode setX(byte[] bArr) {
            return (setCompoundDrawableTintBlendMode) setX(new Object[]{this, bArr}, -1770964303, 1770964304, System.identityHashCode(this));
        }
    }
}
