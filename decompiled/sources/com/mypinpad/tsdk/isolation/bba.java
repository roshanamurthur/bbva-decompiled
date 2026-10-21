package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class bba extends baq implements ben {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f54396x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f54397y0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final bbb f54398t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f54399u0;
    public final byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final byte[] f54400w0;

    /* JADX WARN: Illegal instructions before constructor call */
    public bba(setY sety) {
        bbb bbbVar = (bbb) setY.setCompoundDrawableTintBlendMode(new Object[]{sety}, -456735278, 456735282, (int) System.currentTimeMillis());
        bbbVar.getClass();
        super(false, (String) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 1692396741, -1692396740, System.identityHashCode(bbbVar)));
        bbb bbbVar2 = (bbb) setY.setCompoundDrawableTintBlendMode(new Object[]{sety}, -456735278, 456735282, (int) System.currentTimeMillis());
        this.f54398t0 = bbbVar2;
        if (bbbVar2 == null) {
            throw new NullPointerException("params == null");
        }
        int iIntValue = ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar2}, 862961959, -862961952, System.identityHashCode(bbbVar2))).intValue();
        byte[] bArr = (byte[]) setY.setCompoundDrawableTintBlendMode(new Object[]{sety}, 865929910, -865929904, (int) System.currentTimeMillis());
        if (bArr == null) {
            if (((bbd) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar2}, -1733945508, 1733945510, System.identityHashCode(bbbVar2))) != null) {
                this.f54399u0 = ((bbd) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar2}, -1733945508, 1733945510, System.identityHashCode(bbbVar2))).setDividerPadding();
            } else {
                this.f54399u0 = 0;
            }
            byte[] bArr2 = (byte[]) setY.setCompoundDrawableTintBlendMode(new Object[]{sety}, -1339676912, 1339676912, (int) System.currentTimeMillis());
            if (bArr2 == null) {
                this.v0 = new byte[iIntValue];
            } else {
                if (bArr2.length != iIntValue) {
                    throw new IllegalArgumentException("length of root must be equal to length of digest");
                }
                this.v0 = bArr2;
            }
            byte[] bArr3 = (byte[]) setY.setCompoundDrawableTintBlendMode(new Object[]{sety}, 535117105, -535117098, (int) System.currentTimeMillis());
            if (bArr3 == null) {
                this.f54400w0 = new byte[iIntValue];
                return;
            } else {
                if (bArr3.length != iIntValue) {
                    throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
                }
                this.f54400w0 = bArr3;
                return;
            }
        }
        int i10 = -(-iIntValue);
        int i11 = iIntValue & i10;
        if (bArr.length == ((i10 | iIntValue) & (~i11)) + (i11 << 1)) {
            this.f54399u0 = 0;
            this.v0 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, 0, Integer.valueOf(iIntValue)}, 427617211, -427617208, 0);
            this.f54400w0 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue)}, 427617211, -427617208, iIntValue);
            return;
        }
        int length = bArr.length;
        int i12 = iIntValue & 4;
        int i13 = ((iIntValue ^ 4) | i12) << 1;
        int i14 = -((~i12) & (iIntValue | 4));
        int i15 = (i13 & i14) + (i13 | i14);
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i16 = iIntValue * 253;
        int i17 = i15 * 253;
        int i18 = i16 & i17;
        int i19 = ((i17 | i16) & (~i18)) + (i18 << 1);
        int i20 = ~iIntValue;
        int i21 = ~i15;
        int i22 = ~((i20 ^ i21) | (i20 & i21));
        int i23 = ~iCurrentTimeMillis;
        int i24 = i21 & i23;
        int i25 = (~i24) & (i21 | i23);
        int i26 = (i25 ^ i24) | (i25 & i24);
        int i27 = ~i26;
        int i28 = (i26 | i27) & i27;
        int i29 = (i28 & i22) | ((~i22) & i28) | ((~i28) & i22);
        int i30 = iIntValue & i15;
        int i31 = (~i30) & (iIntValue | i15);
        int i32 = (i31 & i30) | (i31 ^ i30);
        int i33 = ((~i32) & iCurrentTimeMillis) | (i32 & i23);
        int i34 = i32 & iCurrentTimeMillis;
        int i35 = ~((i34 & i33) | (i33 ^ i34));
        int i36 = ((i29 & i35) | (i29 ^ i35)) * (-252);
        int i37 = i19 & i36;
        int i38 = -(-((i36 ^ i19) | i37));
        int i39 = (i37 & i38) + (i38 | i37);
        int i40 = ((iIntValue & i21) | (i15 & i20) | i30) * (-252);
        int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
        int i42 = (i23 | iCurrentTimeMillis) & i23;
        int i43 = i21 & i42;
        int i44 = (i42 | i21) & (~i43);
        int i45 = (i44 & i43) | (i44 ^ i43);
        int i46 = (i45 & i20) | ((~i45) & iIntValue);
        int i47 = i45 & iIntValue;
        int i48 = (i47 & i46) | (i46 ^ i47);
        int i49 = ~i48;
        int i50 = (i48 | i49) & i49;
        int i51 = (iIntValue ^ i15) | i30;
        int i52 = i51 & iCurrentTimeMillis;
        int i53 = (i51 | iCurrentTimeMillis) & (~i52);
        int i54 = ~((i53 & i52) | (i53 ^ i52));
        int i55 = ((~i54) & i50) | ((~i50) & i54);
        int i56 = i50 & i54;
        int i57 = ((i56 & i55) | (i55 ^ i56)) * 252;
        int i58 = i41 & i57;
        int i59 = (i57 | i41) & (~i58);
        int i60 = i58 << 1;
        if (length != ((i59 | i60) << 1) - (i59 ^ i60)) {
            throw new IllegalArgumentException("public key has wrong size");
        }
        this.f54399u0 = ((Integer) ber.setDividerPadding(new Object[]{bArr, 0}, 450133947, -450133937, 0)).intValue();
        this.v0 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, 4, Integer.valueOf(iIntValue)}, 427617211, -427617208, 4);
        int i61 = (i13 - (~i14)) - 1;
        this.f54400w0 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i61), Integer.valueOf(iIntValue)}, 427617211, -427617208, i61);
    }

    public static /* synthetic */ bbb a(Object[] objArr) {
        bba bbaVar = (bba) objArr[0];
        int i10 = f54396x0;
        int i11 = (i10 ^ 21) + ((i10 & 21) << 1);
        int i12 = i11 % 128;
        f54397y0 = i12;
        int i13 = i11 % 2;
        bbb bbbVar = bbaVar.f54398t0;
        int i14 = i12 & 3;
        int i15 = -(-((i12 ^ 3) | i14));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        f54396x0 = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 71 / 0;
        }
        return bbbVar;
    }

    public static /* synthetic */ Object b(Object[] objArr) {
        bba bbaVar = (bba) objArr[0];
        int i10 = f54397y0;
        int i11 = i10 ^ 63;
        int i12 = ((i10 & 63) | i11) << 1;
        int i13 = -i11;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f54396x0 = i14 % 128;
        int i15 = i14 % 2;
        byte[] bArr = bbaVar.v0;
        Object[] objArr2 = new Object[1];
        if (i15 == 0) {
            objArr2[0] = bArr;
            return (byte[]) bbi.setOnFocusChangeListener(objArr2, -759448087, 759448096, (int) System.currentTimeMillis());
        }
        objArr2[0] = bArr;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0079 A[PHI: r12
      0x0079: PHI (r12v34 int) = (r12v33 int), (r12v45 int) binds: [B:18:0x0077, B:14:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int iIntValue;
        byte[] bArr;
        int i13;
        int i14 = ~i10;
        int i15 = (i14 * 677) + (i11 * (-676)) + (i10 * 678);
        int i16 = ~i11;
        int i17 = ((~(i10 | i16)) * 677) + ((i14 | i16) * (-677)) + i15;
        if (i17 == 1) {
            return b(objArr);
        }
        if (i17 == 2) {
            bba bbaVar = (bba) objArr[0];
            int i18 = f54397y0;
            int i19 = i18 & 85;
            int i20 = ((i18 | 85) & (~i19)) + (i19 << 1);
            f54396x0 = i20 % 128;
            int i21 = i20 % 2;
            byte[] bArr2 = (byte[]) setX(new Object[]{bbaVar}, 254982778, -254982774, System.identityHashCode(bbaVar));
            int i22 = f54397y0;
            int i23 = i22 & 25;
            int i24 = (i22 | 25) & (~i23);
            int i25 = -(-(i23 << 1));
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            f54396x0 = i26 % 128;
            int i27 = i26 % 2;
            return bArr2;
        }
        if (i17 == 3) {
            bba bbaVar2 = (bba) objArr[0];
            int i28 = f54397y0;
            int i29 = (((i28 ^ 75) | (i28 & 75)) << 1) - (((~i28) & 75) | (i28 & (-76)));
            f54396x0 = i29 % 128;
            int i30 = i29 % 2;
            byte[] bArr3 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bbaVar2.f54400w0}, -759448087, 759448096, (int) System.currentTimeMillis());
            System.identityHashCode(bbaVar2);
            System.identityHashCode(bbaVar2);
            return bArr3;
        }
        int i31 = 4;
        if (i17 != 4) {
            return a(objArr);
        }
        bba bbaVar3 = (bba) objArr[0];
        int i32 = f54396x0;
        int i33 = (((i32 & (-76)) | ((~i32) & 75)) - (~((i32 & 75) << 1))) - 1;
        f54397y0 = i33 % 128;
        if (i33 % 2 == 0) {
            bbb bbbVar = bbaVar3.f54398t0;
            iIntValue = ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 862961959, -862961952, System.identityHashCode(bbbVar))).intValue();
            if (bbaVar3.f54399u0 != 0) {
                int iIdentityHashCode = System.identityHashCode(bbaVar3);
                int i34 = iIntValue * (-55);
                int i35 = ((-220) & i34) + (i34 | (-220));
                int i36 = iIdentityHashCode & 4;
                int i37 = (~i36) & (iIdentityHashCode | 4);
                int i38 = ~iIdentityHashCode;
                int i39 = ~((i36 & i37) | (i37 ^ i36));
                int i40 = iIntValue & i39;
                int i41 = (i39 | iIntValue) & (~i40);
                int i42 = -(-(((i41 & i40) | (i41 ^ i40)) * 56));
                int i43 = i35 & i42;
                int i44 = -(-((i42 ^ i35) | i43));
                int i45 = (i43 & i44) + (i44 | i43);
                int i46 = iIntValue ^ 4;
                int i47 = iIntValue & 4;
                int i48 = (i46 & i47) | (i46 ^ i47);
                int i49 = ~i48;
                int i50 = (i45 - (~(-(~(-(-(((i48 | i49) & i49) * (-56)))))))) - 2;
                int i51 = (iIdentityHashCode | i38) & i38;
                int i52 = -(-(((~((i51 & iIntValue) | (i51 ^ iIntValue))) | 4) * 56));
                int i53 = ((i50 ^ i52) | (i50 & i52)) << 1;
                int i54 = -((i52 & (~i50)) | ((~i52) & i50));
                int i55 = (i53 & i54) + (i54 | i53);
                int iIdentityHashCode2 = System.identityHashCode(bbaVar3);
                int i56 = iIntValue * 784;
                int i57 = -(-(i55 * (-782)));
                int i58 = i56 & i57;
                int i59 = (i56 ^ i57) | i58;
                int i60 = (i58 & i59) + (i59 | i58);
                int i61 = ~i55;
                int i62 = -(~(-(-((i61 & (i61 | i55)) * (-783)))));
                int i63 = (-2) - (((i60 ^ i62) + ((i62 & i60) << 1)) ^ (-1));
                int i64 = ~iIntValue;
                int i65 = ~iIdentityHashCode2;
                int i66 = (iIdentityHashCode2 | i65) & i65;
                int i67 = i64 & i66;
                int i68 = (~i67) & (i64 | i66);
                int i69 = (i67 & i68) | (i68 ^ i67);
                int i70 = i69 & i55;
                int i71 = ((i69 | i55) & (~i70)) | i70;
                int i72 = ~i71;
                int i73 = -(-(((i71 | i72) & i72) * (-783)));
                int i74 = i63 & i73;
                int i75 = (i74 - (~(-(-((i63 ^ i73) | i74))))) - 1;
                int i76 = (i64 | iIntValue) & i64;
                int i77 = ~((i66 & i55) | (i66 ^ i55));
                int i78 = i76 & i77;
                int i79 = (i77 | i76) & (~i78);
                int i80 = -(-(((i79 & i78) | (i79 ^ i78)) * 783));
                int i81 = i75 & i80;
                bArr = new byte[(((i80 | i75) & (~i81)) - (~(-(-(i81 << 1))))) - 1];
                int i82 = bbaVar3.f54399u0;
                ber.setDividerPadding(new Object[]{Integer.valueOf(i82), bArr, 0}, -2092293587, 2092293591, i82);
                int i83 = f54397y0;
                int i84 = ((i83 ^ 5) | (i83 & 5)) << 1;
                int i85 = -(((~i83) & 5) | (i83 & (-6)));
                i13 = (i84 ^ i85) + ((i85 & i84) << 1);
                f54396x0 = i13 % 128;
            } else {
                i31 = 1;
                int iIdentityHashCode3 = System.identityHashCode(bbaVar3);
                int i86 = iIntValue * 302;
                int i87 = -(-(iIntValue * TypedValues.MotionType.TYPE_EASING));
                int i88 = i86 & i87;
                int i89 = (i86 ^ i87) | i88;
                int i90 = (i88 ^ i89) + ((i89 & i88) << 1);
                int i91 = ~iIntValue;
                int i92 = ~iIdentityHashCode3;
                int i93 = i91 & i92;
                int i94 = (~i93) & (i91 | i92);
                int i95 = ((~((i94 & i93) | (i94 ^ i93))) | iIntValue) * (-602);
                int i96 = i90 & i95;
                int i97 = (i90 ^ i95) | i96;
                int i98 = (i96 ^ i97) + ((i97 & i96) << 1);
                int i99 = ~((i91 ^ i91) | (i91 & i91));
                int i100 = i93 | ((~i91) & iIdentityHashCode3);
                int i101 = i91 & iIdentityHashCode3;
                int i102 = ~((i100 & i101) | (i100 ^ i101));
                int i103 = (i99 & i102) | ((~i102) & i99) | ((~i99) & i102);
                int i104 = (iIdentityHashCode3 | i92) & i92;
                int i105 = i104 & iIntValue;
                int i106 = (i104 | iIntValue) & (~i105);
                int i107 = (i106 & i105) | (i106 ^ i105);
                int i108 = (i91 & i107) | ((~i107) & iIntValue);
                int i109 = i107 & iIntValue;
                int i110 = (i109 & i108) | (i108 ^ i109);
                int i111 = ~i110;
                int i112 = (i110 | i111) & i111;
                int i113 = -(-(((i112 & i103) | (i103 ^ i112)) * (-301)));
                bArr = new byte[(((((i98 ^ i113) | (i98 & i113)) << 1) - ((i113 & (~i98)) | ((~i113) & i98))) - (~((~(i92 | iIntValue)) * 301))) - 1];
                int i114 = f54396x0;
                int i115 = i114 ^ 103;
                int i116 = ((i114 & 103) | i115) << 1;
                int i117 = -i115;
                i13 = (i116 ^ i117) + ((i116 & i117) << 1);
                f54397y0 = i13 % 128;
            }
        } else {
            bbb bbbVar2 = bbaVar3.f54398t0;
            iIntValue = ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar2}, 862961959, -862961952, System.identityHashCode(bbbVar2))).intValue();
            if (bbaVar3.f54399u0 != 0) {
                int iIdentityHashCode4 = System.identityHashCode(bbaVar3);
                int i310 = iIntValue * (-55);
                int i311 = ((-220) & i310) + (i310 | (-220));
                int i312 = iIdentityHashCode4 & 4;
                int i313 = (~i312) & (iIdentityHashCode4 | 4);
                int i314 = ~iIdentityHashCode4;
                int i315 = ~((i312 & i313) | (i313 ^ i312));
                int i410 = iIntValue & i315;
                int i411 = (i315 | iIntValue) & (~i410);
                int i412 = -(-(((i411 & i410) | (i411 ^ i410)) * 56));
                int i413 = i311 & i412;
                int i414 = -(-((i412 ^ i311) | i413));
                int i415 = (i413 & i414) + (i414 | i413);
                int i416 = iIntValue ^ 4;
                int i417 = iIntValue & 4;
                int i418 = (i416 & i417) | (i416 ^ i417);
                int i419 = ~i418;
                int i510 = (i415 - (~(-(~(-(-(((i418 | i419) & i419) * (-56)))))))) - 2;
                int i511 = (iIdentityHashCode4 | i314) & i314;
                int i512 = -(-(((~((i511 & iIntValue) | (i511 ^ iIntValue))) | 4) * 56));
                int i513 = ((i510 ^ i512) | (i510 & i512)) << 1;
                int i514 = -((i512 & (~i510)) | ((~i512) & i510));
                int i515 = (i513 & i514) + (i514 | i513);
                int iIdentityHashCode5 = System.identityHashCode(bbaVar3);
                int i516 = iIntValue * 784;
                int i517 = -(-(i515 * (-782)));
                int i518 = i516 & i517;
                int i519 = (i516 ^ i517) | i518;
                int i610 = (i518 & i519) + (i519 | i518);
                int i611 = ~i515;
                int i612 = -(~(-(-((i611 & (i611 | i515)) * (-783)))));
                int i613 = (-2) - (((i610 ^ i612) + ((i612 & i610) << 1)) ^ (-1));
                int i614 = ~iIntValue;
                int i615 = ~iIdentityHashCode5;
                int i616 = (iIdentityHashCode5 | i615) & i615;
                int i617 = i614 & i616;
                int i618 = (~i617) & (i614 | i616);
                int i619 = (i617 & i618) | (i618 ^ i617);
                int i710 = i619 & i515;
                int i711 = ((i619 | i515) & (~i710)) | i710;
                int i712 = ~i711;
                int i713 = -(-(((i711 | i712) & i712) * (-783)));
                int i714 = i613 & i713;
                int i715 = (i714 - (~(-(-((i613 ^ i713) | i714))))) - 1;
                int i716 = (i614 | iIntValue) & i614;
                int i717 = ~((i616 & i515) | (i616 ^ i515));
                int i718 = i716 & i717;
                int i719 = (i717 | i716) & (~i718);
                int i810 = -(-(((i719 & i718) | (i719 ^ i718)) * 783));
                int i811 = i715 & i810;
                bArr = new byte[(((i810 | i715) & (~i811)) - (~(-(-(i811 << 1))))) - 1];
                int i812 = bbaVar3.f54399u0;
                ber.setDividerPadding(new Object[]{Integer.valueOf(i812), bArr, 0}, -2092293587, 2092293591, i812);
                int i813 = f54397y0;
                int i814 = ((i813 ^ 5) | (i813 & 5)) << 1;
                int i815 = -(((~i813) & 5) | (i813 & (-6)));
                i13 = (i814 ^ i815) + ((i815 & i814) << 1);
                f54396x0 = i13 % 128;
            } else {
                i31 = 0;
                int iIdentityHashCode6 = System.identityHashCode(bbaVar3);
                int i816 = iIntValue * 302;
                int i817 = -(-(iIntValue * TypedValues.MotionType.TYPE_EASING));
                int i818 = i816 & i817;
                int i819 = (i816 ^ i817) | i818;
                int i910 = (i818 ^ i819) + ((i819 & i818) << 1);
                int i911 = ~iIntValue;
                int i912 = ~iIdentityHashCode6;
                int i913 = i911 & i912;
                int i914 = (~i913) & (i911 | i912);
                int i915 = ((~((i914 & i913) | (i914 ^ i913))) | iIntValue) * (-602);
                int i916 = i910 & i915;
                int i917 = (i910 ^ i915) | i916;
                int i918 = (i916 ^ i917) + ((i917 & i916) << 1);
                int i919 = ~((i911 ^ i911) | (i911 & i911));
                int i1010 = i913 | ((~i911) & iIdentityHashCode6);
                int i1011 = i911 & iIdentityHashCode6;
                int i1012 = ~((i1010 & i1011) | (i1010 ^ i1011));
                int i1013 = (i919 & i1012) | ((~i1012) & i919) | ((~i919) & i1012);
                int i1014 = (iIdentityHashCode6 | i912) & i912;
                int i1015 = i1014 & iIntValue;
                int i1016 = (i1014 | iIntValue) & (~i1015);
                int i1017 = (i1016 & i1015) | (i1016 ^ i1015);
                int i1018 = (i911 & i1017) | ((~i1017) & iIntValue);
                int i1019 = i1017 & iIntValue;
                int i118 = (i1019 & i1018) | (i1018 ^ i1019);
                int i119 = ~i118;
                int i1110 = (i118 | i119) & i119;
                int i1111 = -(-(((i1110 & i1013) | (i1013 ^ i1110)) * (-301)));
                bArr = new byte[(((((i918 ^ i1111) | (i918 & i1111)) << 1) - ((i1111 & (~i918)) | ((~i1111) & i918))) - (~((~(i912 | iIntValue)) * 301))) - 1];
                int i1112 = f54396x0;
                int i1113 = i1112 ^ 103;
                int i1114 = ((i1112 & 103) | i1113) << 1;
                int i1115 = -i1113;
                i13 = (i1114 ^ i1115) + ((i1114 & i1115) << 1);
                f54397y0 = i13 % 128;
            }
        }
        int i120 = i13 % 2;
        bbi.setOnFocusChangeListener(new Object[]{bArr, bbaVar3.v0, Integer.valueOf(i31)}, -2011745549, 2011745550, i31);
        int i121 = (((~iIntValue) & i31) | ((~i31) & iIntValue)) + ((iIntValue & i31) << 1);
        bbi.setOnFocusChangeListener(new Object[]{bArr, bbaVar3.f54400w0, Integer.valueOf(i121)}, -2011745549, 2011745550, i121);
        int i122 = f54396x0;
        int i123 = (-2) - (((i122 ^ 72) + ((i122 & 72) << 1)) ^ (-1));
        f54397y0 = i123 % 128;
        int i124 = i123 % 2;
        return bArr;
    }

    @Override // com.mypinpad.tsdk.isolation.ben
    public final byte[] setAlwaysDrawnWithCacheEnabled() throws IOException {
        return (byte[]) setX(new Object[]{this}, -1381274718, 1381274720, System.identityHashCode(this));
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setX(new Object[]{this}, -165799898, 165799901, System.identityHashCode(this));
    }

    public final bbb setOnFocusChangeListener() {
        return (bbb) setX(new Object[]{this}, 879886685, -879886685, System.identityHashCode(this));
    }

    public final byte[] setY() {
        return (byte[]) setX(new Object[]{this}, -2108923165, 2108923166, System.identityHashCode(this));
    }

    public static class setY {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f54401e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f54402f = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bbb f54403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f54404b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f54405c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f54406d = null;

        public setY(bbb bbbVar) {
            this.f54403a = bbbVar;
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            Object obj;
            int i13 = ~i10;
            int i14 = ~i11;
            switch (((i10 | i12) * 104) + ((~(i11 | (~i12) | i10)) * (-104)) + (((~(i13 | i14)) | (~(i14 | i12))) * 104) + (i11 * (-103)) + (i10 * (-103))) {
                case 1:
                    setY sety = (setY) objArr[0];
                    byte[] bArr = (byte[]) objArr[1];
                    int i15 = f54401e + 33;
                    f54402f = i15 % 128;
                    if (i15 % 2 == 0) {
                        sety.f54406d = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr}, -759448087, 759448096, (int) System.currentTimeMillis());
                        int i16 = 0 / 0;
                    } else {
                        sety.f54406d = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr}, -759448087, 759448096, (int) System.currentTimeMillis());
                    }
                    int i17 = f54402f;
                    int i18 = (i17 ^ 43) + ((i17 & 43) << 1);
                    f54401e = i18 % 128;
                    int i19 = i18 % 2;
                    obj = sety;
                    break;
                case 2:
                    setY sety2 = (setY) objArr[0];
                    byte[] bArr2 = (byte[]) objArr[1];
                    int i20 = f54402f;
                    int i21 = ((i20 | 17) << 1) - (i20 ^ 17);
                    f54401e = i21 % 128;
                    int i22 = i21 % 2;
                    sety2.f54404b = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr2}, -759448087, 759448096, (int) System.currentTimeMillis());
                    int i23 = (-2) - ((f54402f + 106) ^ (-1));
                    f54401e = i23 % 128;
                    obj = sety2;
                    if (i23 % 2 != 0) {
                        int i24 = 36 / 0;
                        obj = sety2;
                    }
                    break;
                case 3:
                    bba bbaVar = new bba((setY) objArr[0]);
                    int i25 = f54402f + 1;
                    f54401e = i25 % 128;
                    obj = bbaVar;
                    if (i25 % 2 != 0) {
                        throw null;
                    }
                    break;
                case 4:
                    setY sety3 = (setY) objArr[0];
                    int i26 = f54401e;
                    int i27 = (i26 & 103) + (i26 | 103);
                    f54402f = i27 % 128;
                    int i28 = i27 % 2;
                    bbb bbbVar = sety3.f54403a;
                    int i29 = i26 & 13;
                    int i30 = -(-(i26 | 13));
                    int i31 = (i29 & i30) + (i30 | i29);
                    f54402f = i31 % 128;
                    int i32 = i31 % 2;
                    return bbbVar;
                case 5:
                    setY sety4 = (setY) objArr[0];
                    byte[] bArr3 = (byte[]) objArr[1];
                    int i33 = f54402f;
                    int i34 = ((i33 | 49) << 1) - (i33 ^ 49);
                    f54401e = i34 % 128;
                    int i35 = i34 % 2;
                    sety4.f54405c = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr3}, -759448087, 759448096, (int) System.currentTimeMillis());
                    int i36 = f54401e;
                    int i37 = (((i36 | 90) << 1) - (i36 ^ 90)) - 1;
                    f54402f = i37 % 128;
                    int i38 = i37 % 2;
                    obj = sety4;
                    break;
                case 6:
                    setY sety5 = (setY) objArr[0];
                    int i39 = f54401e;
                    int i40 = i39 ^ 17;
                    int i41 = -(-((i39 & 17) << 1));
                    int i42 = (i40 & i41) + (i41 | i40);
                    int i43 = i42 % 128;
                    f54402f = i43;
                    int i44 = i42 % 2;
                    byte[] bArr4 = sety5.f54406d;
                    int i45 = ((i43 | 93) << 1) - (i43 ^ 93);
                    f54401e = i45 % 128;
                    int i46 = i45 % 2;
                    return bArr4;
                case 7:
                    setY sety6 = (setY) objArr[0];
                    int i47 = f54401e;
                    int i48 = (i47 & (-64)) | ((~i47) & 63);
                    int i49 = (i47 & 63) << 1;
                    int i50 = (i48 & i49) + (i49 | i48);
                    f54402f = i50 % 128;
                    int i51 = i50 % 2;
                    byte[] bArr5 = sety6.f54405c;
                    if (i51 != 0) {
                        return bArr5;
                    }
                    throw null;
                default:
                    setY sety7 = (setY) objArr[0];
                    int i52 = f54401e;
                    int i53 = ((i52 | 53) << 1) - (i52 ^ 53);
                    int i54 = i53 % 128;
                    f54402f = i54;
                    int i55 = i53 % 2;
                    byte[] bArr6 = sety7.f54404b;
                    if (i55 == 0) {
                        int i56 = 98 / 0;
                    }
                    int i57 = i54 & 41;
                    int i58 = (((i54 ^ 41) | i57) << 1) - ((i54 | 41) & (~i57));
                    f54401e = i58 % 128;
                    if (i58 % 2 == 0) {
                        return bArr6;
                    }
                    throw null;
            }
            return obj;
        }

        public final setY setDividerPadding(byte[] bArr) {
            return (setY) setCompoundDrawableTintBlendMode(new Object[]{this, bArr}, -1036604683, 1036604685, System.identityHashCode(this));
        }

        public final setY setOnFocusChangeListener(byte[] bArr) {
            return (setY) setCompoundDrawableTintBlendMode(new Object[]{this, bArr}, -935944386, 935944391, System.identityHashCode(this));
        }

        public final bba setX() {
            return (bba) setCompoundDrawableTintBlendMode(new Object[]{this}, 1100475496, -1100475493, System.identityHashCode(this));
        }

        public final setY setCompoundDrawableTintBlendMode(byte[] bArr) {
            return (setY) setCompoundDrawableTintBlendMode(new Object[]{this, bArr}, 510586294, -510586293, System.identityHashCode(this));
        }
    }
}
