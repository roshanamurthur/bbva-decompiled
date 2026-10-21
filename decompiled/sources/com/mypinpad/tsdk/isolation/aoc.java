package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;

/* JADX INFO: loaded from: classes10.dex */
public final class aoc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f53402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53403b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53404c = 1;

    static {
        HashSet hashSet = new HashSet(5);
        f53402a = hashSet;
        hashSet.add(aha.setDividerPadding);
        hashSet.add(aha.setOnFocusChangeListener);
        hashSet.add(aha.getNavBarTitleString);
        hashSet.add(aha.setLayoutAnimation);
        hashSet.add(aha.setNavigationOnClickListener);
        int i10 = f53403b;
        int i11 = ((i10 & (-66)) | ((~i10) & 65)) + ((i10 & 65) << 1);
        f53404c = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0140  */
    /* JADX WARN: Code duplicated, block: B:27:0x0156 A[PHI: r3
      0x0156: PHI (r3v20 com.mypinpad.tsdk.i.ang) = (r3v17 com.mypinpad.tsdk.i.ang), (r3v81 com.mypinpad.tsdk.i.ang) binds: [B:25:0x013e, B:22:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x015a  */
    /* JADX WARN: Code duplicated, block: B:31:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:33:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:35:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:36:0x0308  */
    /* JADX WARN: Code duplicated, block: B:37:0x0310  */
    /* JADX WARN: Code duplicated, block: B:39:0x032e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0341  */
    /* JADX WARN: Code duplicated, block: B:42:0x0348  */
    /* JADX WARN: Code duplicated, block: B:47:0x03a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x03d1  */
    public static /* synthetic */ ajj a(Object[] objArr) throws IOException {
        ang angVar;
        ajw ajwVar;
        ane aneVar;
        BigInteger compoundDrawableTintBlendMode;
        int i10;
        int i11;
        adu aduVar;
        int i12;
        ajj ajjVar;
        int i13;
        int i14;
        int i15;
        int i16;
        amw amwVar = (amw) objArr[0];
        int i17 = f53404c;
        int i18 = (i17 ^ 69) + ((i17 & 69) << 1);
        int i19 = i18 % 128;
        f53403b = i19;
        int i20 = i18 % 2;
        if (amwVar instanceof anw) {
            anw anwVar = (anw) amwVar;
            ajj ajjVar2 = new ajj(new aiw(ahv.setX, afq.setY), new ahx((BigInteger) anw.setX(new Object[]{anwVar}, -674276868, 674276871, System.identityHashCode(anwVar)), (BigInteger) anw.setX(new Object[]{anwVar}, -782811276, 782811278, System.identityHashCode(anwVar))));
            int i21 = f53404c;
            int i22 = (-2) - ((((i21 | 106) << 1) - (i21 ^ 106)) ^ (-1));
            f53403b = i22 % 128;
            int i23 = i22 % 2;
            return ajjVar2;
        }
        aiz aizVar = null;
        if (amwVar instanceof and) {
            int i24 = (-2) - (((i19 ^ 118) + ((i19 & 118) << 1)) ^ (-1));
            f53404c = i24 % 128;
            and andVar = (and) amwVar;
            if (i24 % 2 == 0) {
                throw null;
            }
            anh anhVar = (anh) amy.setX(new Object[]{andVar}, -1790706632, 1790706632, System.identityHashCode(andVar));
            if (anhVar != null) {
                aizVar = new aiz(anhVar.setCompoundDrawableTintBlendMode(), anhVar.setOnFocusChangeListener(), anhVar.setY());
                int i25 = f53404c;
                int i26 = i25 & 119;
                int i27 = i25 | 119;
                int i28 = (i26 & i27) + (i27 | i26);
                f53403b = i28 % 128;
                int i29 = i28 % 2;
            }
            ajj ajjVar3 = new ajj(new aiw(akf.getError, aizVar), new adp((BigInteger) and.setY(new Object[]{andVar}, -1023585856, 1023585856, System.identityHashCode(andVar))));
            int i30 = f53404c;
            int i31 = (i30 | 117) << 1;
            int i32 = -(i30 ^ 117);
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            f53403b = i33 % 128;
            int i34 = i33 % 2;
            return ajjVar3;
        }
        if (!(amwVar instanceof anl)) {
            if (amwVar instanceof aob) {
                ajj ajjVar4 = new ajj(new aiw(ahe.setY), ((aob) amwVar).setOnFocusChangeListener());
                int i35 = f53403b + 91;
                f53404c = i35 % 128;
                int i36 = i35 % 2;
                return ajjVar4;
            }
            if (amwVar instanceof anx) {
                ajj ajjVar5 = new ajj(new aiw(ahe.setDividerPadding), ((anx) amwVar).setY());
                int i37 = f53404c;
                int i38 = ((i37 | 83) << 1) - (i37 ^ 83);
                f53403b = i38 % 128;
                if (i38 % 2 == 0) {
                    return ajjVar5;
                }
                throw null;
            }
            if (amwVar instanceof anj) {
                ajj ajjVar6 = new ajj(new aiw(ahe.setX), ((anj) amwVar).setCompoundDrawableTintBlendMode());
                int i39 = f53403b;
                int i40 = (i39 ^ 125) + ((i39 & 125) << 1);
                f53404c = i40 % 128;
                if (i40 % 2 != 0) {
                    return ajjVar6;
                }
                throw null;
            }
            if (!(amwVar instanceof ani)) {
                throw new IOException("key parameters not recognized");
            }
            ajj ajjVar7 = new ajj(new aiw(ahe.setOnFocusChangeListener), ((ani) amwVar).setOnFocusChangeListener());
            int i41 = f53403b;
            int i42 = i41 & 123;
            int i43 = ((i41 | 123) & (~i42)) + (i42 << 1);
            f53404c = i43 % 128;
            int i44 = i43 % 2;
            return ajjVar7;
        }
        int i45 = (i19 ^ 43) + ((i19 & 43) << 1);
        f53404c = i45 % 128;
        anl anlVar = (anl) amwVar;
        if (i45 % 2 == 0) {
            angVar = (ang) anm.setY(new Object[]{anlVar}, 393614266, -393614266, System.identityHashCode(anlVar));
            int i46 = 29 / 0;
            if (angVar == null) {
                ajwVar = new ajw(afq.setY);
                int i47 = f53403b;
                int i48 = ((i47 | 63) << 1) - (i47 ^ 63);
                f53404c = i48 % 128;
                int i49 = i48 % 2;
            } else {
                if (angVar instanceof ane) {
                    aneVar = (ane) angVar;
                    apl aplVar = (apl) anl.setX(new Object[]{anlVar}, -504564904, 504564904, System.identityHashCode(anlVar));
                    compoundDrawableTintBlendMode = ((apk) apl.setOnFocusChangeListener(new Object[]{aplVar}, 1215243068, -1215243054, System.identityHashCode(aplVar))).setCompoundDrawableTintBlendMode();
                    apl aplVar2 = (apl) anl.setX(new Object[]{anlVar}, -504564904, 504564904, System.identityHashCode(anlVar));
                    BigInteger compoundDrawableTintBlendMode2 = ((apk) apl.setOnFocusChangeListener(new Object[]{aplVar2}, -739496835, 739496844, System.identityHashCode(aplVar2))).setCompoundDrawableTintBlendMode();
                    ahh ahhVar = new ahh(aneVar.setNavigationOnClickListener(), aneVar.setOnLongClickListener());
                    i10 = 32;
                    if (!f53402a.contains((adu) ane.setY(new Object[]{aneVar}, -360397317, 360397318, System.identityHashCode(aneVar)))) {
                        int i50 = f53403b;
                        int i51 = i50 & 79;
                        i11 = (((i50 | 79) & (~i51)) - (~(i51 << 1))) - 1;
                        f53404c = i11 % 128;
                        if (i11 % 2 == 0) {
                            aduVar = aha.setCompoundDrawableTintBlendMode;
                            i12 = 22;
                            i10 = 27;
                        } else {
                            aduVar = aha.setCompoundDrawableTintBlendMode;
                            i12 = 64;
                        }
                    } else if (compoundDrawableTintBlendMode.bitLength() > 256) {
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        int i52 = f53403b;
                        int i53 = (((i52 ^ 3) | (i52 & 3)) << 1) - (((~i52) & 3) | (i52 & (-4)));
                        f53404c = i53 % 128;
                        int i54 = i53 % 2;
                        int iCurrentTimeMillis = (int) System.currentTimeMillis();
                        int i55 = ~((1538807550 ^ iCurrentTimeMillis) | (1538807550 & iCurrentTimeMillis));
                        int i56 = (-2080136959) ^ i55;
                        int i57 = i55 & (-2080136959);
                        int i58 = (-2) - ((214802634 - (~(((i57 & i56) | (i56 ^ i57)) * 305))) ^ (-1));
                        int i59 = ~iCurrentTimeMillis;
                        int i60 = i59 & 1538807550;
                        int i61 = (i59 | 1538807550) & (~i60);
                        int i62 = (i61 & i60) | (i61 ^ i60);
                        int i63 = ~i62;
                        int i64 = (i62 | i63) & i63;
                        i14 = (-2) - ((i58 - (~(-(-(((i64 & (-1760317015)) | (((~i64) & (-1760317015)) | (1760317014 & i64))) * 305))))) ^ (-1));
                        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                        int i65 = ~iCurrentTimeMillis2;
                        int i66 = (-453053352) & i65;
                        int i67 = ~(((~i66) & ((-453053352) | i65)) | i66);
                        int i68 = 150995110 ^ i67;
                        int i69 = 150995110 & i67;
                        int i70 = (i68 ^ i69) | (i68 & i69);
                        int i71 = 1377155929 & i65;
                        int i72 = ((~i71) & (1377155929 | i65)) | i71;
                        int i73 = ~i72;
                        int i74 = (i72 | i73) & i73;
                        int i75 = (-1828357340) - (~(((i74 & i70) | (i70 ^ i74)) * (-1136)));
                        int i76 = (-453053352) & iCurrentTimeMillis2;
                        int i77 = ((-453053352) | iCurrentTimeMillis2) & (~i76);
                        int i78 = ~((i76 & i77) | (i77 ^ i76));
                        int i79 = 1377155929 & iCurrentTimeMillis2;
                        int i80 = i79 | ((~i79) & (1377155929 | iCurrentTimeMillis2));
                        int i81 = ~i80;
                        int i82 = (i80 | i81) & i81;
                        int i83 = ((~i78) & i82) | ((~i82) & i78);
                        int i84 = i78 & i82;
                        int i85 = (i84 & i83) | (i83 ^ i84);
                        int i86 = ((~i65) & 453053351) | i66;
                        int i87 = i65 & 453053351;
                        int i88 = (i86 & i87) | (i86 ^ i87);
                        int i89 = (i88 & 1377155929) | ((-1377155930) & (~i88));
                        int i90 = i88 & (-1377155930);
                        int i91 = (i90 & i89) | (i89 ^ i90);
                        int i92 = ~i91;
                        int i93 = (i85 | ((i91 | i92) & i92)) * (-568);
                        int i94 = i75 & i93;
                        int i95 = (i93 | i75) & (~i94);
                        int i96 = i94 << 1;
                        int i97 = (i95 & i96) + (i95 | i96);
                        int i98 = (i65 | iCurrentTimeMillis2) & i65;
                        int i99 = i98 & 453053351;
                        int i100 = (453053351 | i98) & (~i99);
                        int i101 = ~((i99 & i100) | (i100 ^ i99));
                        int i102 = (i98 & 1377155929) | ((-1377155930) & (~i98));
                        int i103 = i98 & (-1377155930);
                        int i104 = (~((i103 & i102) | (i102 ^ i103))) | i101;
                        int i105 = ~(((-150995111) & iCurrentTimeMillis2) | (i65 & (-150995111)) | (iCurrentTimeMillis2 & 150995110));
                        int i106 = i104 & i105;
                        int i107 = (i104 | i105) & (~i106);
                        int i108 = -(-(((i107 & i106) | (i107 ^ i106)) * 568));
                        i15 = (i97 | i108) << 1;
                        i16 = -((i108 & (~i97)) | ((~i108) & i97));
                        if (i14 > (i15 & i16) + (i16 | i15)) {
                            aduVar = aia.setY;
                            i12 = 19135;
                            i10 = 99;
                        } else {
                            aduVar = aia.setY;
                            i12 = 128;
                            i10 = 64;
                        }
                    } else {
                        int i109 = f53404c;
                        int i110 = (i109 & 119) + (i109 | 119);
                        f53403b = i110 % 128;
                        int i111 = i110 % 2;
                        aduVar = aia.setX;
                        int i112 = f53403b + 46;
                        int i113 = (i112 ^ (-1)) + (i112 << 1);
                        f53404c = i113 % 128;
                        int i114 = i113 % 2;
                        i12 = 64;
                    }
                    byte[] bArr = new byte[i12];
                    int i115 = i12 / 2;
                    setY(new Object[]{bArr, Integer.valueOf(i115), 0, compoundDrawableTintBlendMode}, 2105386989, -2105386989, i115);
                    setY(new Object[]{bArr, Integer.valueOf(i115), Integer.valueOf(i10), compoundDrawableTintBlendMode2}, 2105386989, -2105386989, i115);
                    try {
                        ajjVar = new ajj(new aiw(aduVar, ahhVar), new aft(bArr));
                        int i116 = f53404c;
                        int i117 = i116 & 27;
                        int i118 = (i116 ^ 27) | i117;
                        i13 = ((i117 | i118) << 1) - (i118 ^ i117);
                        f53403b = i13 % 128;
                        if (i13 % 2 == 0) {
                            return ajjVar;
                        }
                        throw null;
                    } catch (IOException unused) {
                        return null;
                    }
                }
                if (angVar instanceof ank) {
                    ank ankVar = (ank) angVar;
                    ajw ajwVar2 = new ajw((adu) ank.setDividerPadding(new Object[]{ankVar}, -1737123400, 1737123400, System.identityHashCode(ankVar)));
                    int i119 = f53403b + 57;
                    f53404c = i119 % 128;
                    int i120 = i119 % 2;
                    ajwVar = ajwVar2;
                } else {
                    ajwVar = new ajw(new ajz(angVar.setDividerPadding(), new akb(angVar.setCompoundDrawableTintBlendMode()), angVar.setY(), angVar.setOnFocusChangeListener(), angVar.setX()));
                    int i121 = f53403b;
                    int i122 = (i121 & (-36)) | ((~i121) & 35);
                    int i123 = (i121 & 35) << 1;
                    int i124 = (i122 ^ i123) + ((i123 & i122) << 1);
                    f53404c = i124 % 128;
                    int i125 = i124 % 2;
                }
            }
        } else {
            angVar = (ang) anm.setY(new Object[]{anlVar}, 393614266, -393614266, System.identityHashCode(anlVar));
            if (angVar == null) {
                ajwVar = new ajw(afq.setY);
                int i410 = f53403b;
                int i411 = ((i410 | 63) << 1) - (i410 ^ 63);
                f53404c = i411 % 128;
                int i412 = i411 % 2;
            } else {
                if (angVar instanceof ane) {
                    aneVar = (ane) angVar;
                    apl aplVar3 = (apl) anl.setX(new Object[]{anlVar}, -504564904, 504564904, System.identityHashCode(anlVar));
                    compoundDrawableTintBlendMode = ((apk) apl.setOnFocusChangeListener(new Object[]{aplVar3}, 1215243068, -1215243054, System.identityHashCode(aplVar3))).setCompoundDrawableTintBlendMode();
                    apl aplVar4 = (apl) anl.setX(new Object[]{anlVar}, -504564904, 504564904, System.identityHashCode(anlVar));
                    BigInteger compoundDrawableTintBlendMode3 = ((apk) apl.setOnFocusChangeListener(new Object[]{aplVar4}, -739496835, 739496844, System.identityHashCode(aplVar4))).setCompoundDrawableTintBlendMode();
                    ahh ahhVar2 = new ahh(aneVar.setNavigationOnClickListener(), aneVar.setOnLongClickListener());
                    i10 = 32;
                    if (!f53402a.contains((adu) ane.setY(new Object[]{aneVar}, -360397317, 360397318, System.identityHashCode(aneVar)))) {
                        int i510 = f53403b;
                        int i511 = i510 & 79;
                        i11 = (((i510 | 79) & (~i511)) - (~(i511 << 1))) - 1;
                        f53404c = i11 % 128;
                        if (i11 % 2 == 0) {
                            aduVar = aha.setCompoundDrawableTintBlendMode;
                            i12 = 22;
                            i10 = 27;
                        } else {
                            aduVar = aha.setCompoundDrawableTintBlendMode;
                            i12 = 64;
                        }
                    } else if (compoundDrawableTintBlendMode.bitLength() > 256) {
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        int i512 = f53403b;
                        int i513 = (((i512 ^ 3) | (i512 & 3)) << 1) - (((~i512) & 3) | (i512 & (-4)));
                        f53404c = i513 % 128;
                        int i514 = i513 % 2;
                        int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                        int i515 = ~((1538807550 ^ iCurrentTimeMillis3) | (1538807550 & iCurrentTimeMillis3));
                        int i516 = (-2080136959) ^ i515;
                        int i517 = i515 & (-2080136959);
                        int i518 = (-2) - ((214802634 - (~(((i517 & i516) | (i516 ^ i517)) * 305))) ^ (-1));
                        int i519 = ~iCurrentTimeMillis3;
                        int i610 = i519 & 1538807550;
                        int i611 = (i519 | 1538807550) & (~i610);
                        int i612 = (i611 & i610) | (i611 ^ i610);
                        int i613 = ~i612;
                        int i614 = (i612 | i613) & i613;
                        i14 = (-2) - ((i518 - (~(-(-(((i614 & (-1760317015)) | (((~i614) & (-1760317015)) | (1760317014 & i614))) * 305))))) ^ (-1));
                        int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
                        int i615 = ~iCurrentTimeMillis4;
                        int i616 = (-453053352) & i615;
                        int i617 = ~(((~i616) & ((-453053352) | i615)) | i616);
                        int i618 = 150995110 ^ i617;
                        int i619 = 150995110 & i617;
                        int i710 = (i618 ^ i619) | (i618 & i619);
                        int i711 = 1377155929 & i615;
                        int i712 = ((~i711) & (1377155929 | i615)) | i711;
                        int i713 = ~i712;
                        int i714 = (i712 | i713) & i713;
                        int i715 = (-1828357340) - (~(((i714 & i710) | (i710 ^ i714)) * (-1136)));
                        int i716 = (-453053352) & iCurrentTimeMillis4;
                        int i717 = ((-453053352) | iCurrentTimeMillis4) & (~i716);
                        int i718 = ~((i716 & i717) | (i717 ^ i716));
                        int i719 = 1377155929 & iCurrentTimeMillis4;
                        int i810 = i719 | ((~i719) & (1377155929 | iCurrentTimeMillis4));
                        int i811 = ~i810;
                        int i812 = (i810 | i811) & i811;
                        int i813 = ((~i718) & i812) | ((~i812) & i718);
                        int i814 = i718 & i812;
                        int i815 = (i814 & i813) | (i813 ^ i814);
                        int i816 = ((~i615) & 453053351) | i616;
                        int i817 = i615 & 453053351;
                        int i818 = (i816 & i817) | (i816 ^ i817);
                        int i819 = (i818 & 1377155929) | ((-1377155930) & (~i818));
                        int i910 = i818 & (-1377155930);
                        int i911 = (i910 & i819) | (i819 ^ i910);
                        int i912 = ~i911;
                        int i913 = (i815 | ((i911 | i912) & i912)) * (-568);
                        int i914 = i715 & i913;
                        int i915 = (i913 | i715) & (~i914);
                        int i916 = i914 << 1;
                        int i917 = (i915 & i916) + (i915 | i916);
                        int i918 = (i615 | iCurrentTimeMillis4) & i615;
                        int i919 = i918 & 453053351;
                        int i1010 = (453053351 | i918) & (~i919);
                        int i1011 = ~((i919 & i1010) | (i1010 ^ i919));
                        int i1012 = (i918 & 1377155929) | ((-1377155930) & (~i918));
                        int i1013 = i918 & (-1377155930);
                        int i1014 = (~((i1013 & i1012) | (i1012 ^ i1013))) | i1011;
                        int i1015 = ~(((-150995111) & iCurrentTimeMillis4) | (i615 & (-150995111)) | (iCurrentTimeMillis4 & 150995110));
                        int i1016 = i1014 & i1015;
                        int i1017 = (i1014 | i1015) & (~i1016);
                        int i1018 = -(-(((i1017 & i1016) | (i1017 ^ i1016)) * 568));
                        i15 = (i917 | i1018) << 1;
                        i16 = -((i1018 & (~i917)) | ((~i1018) & i917));
                        if (i14 > (i15 & i16) + (i16 | i15)) {
                            aduVar = aia.setY;
                            i12 = 19135;
                            i10 = 99;
                        } else {
                            aduVar = aia.setY;
                            i12 = 128;
                            i10 = 64;
                        }
                    } else {
                        int i1019 = f53404c;
                        int i1110 = (i1019 & 119) + (i1019 | 119);
                        f53403b = i1110 % 128;
                        int i1111 = i1110 % 2;
                        aduVar = aia.setX;
                        int i1112 = f53403b + 46;
                        int i1113 = (i1112 ^ (-1)) + (i1112 << 1);
                        f53404c = i1113 % 128;
                        int i1114 = i1113 % 2;
                        i12 = 64;
                    }
                    byte[] bArr2 = new byte[i12];
                    int i1115 = i12 / 2;
                    setY(new Object[]{bArr2, Integer.valueOf(i1115), 0, compoundDrawableTintBlendMode}, 2105386989, -2105386989, i1115);
                    setY(new Object[]{bArr2, Integer.valueOf(i1115), Integer.valueOf(i10), compoundDrawableTintBlendMode3}, 2105386989, -2105386989, i1115);
                    ajjVar = new ajj(new aiw(aduVar, ahhVar2), new aft(bArr2));
                    int i1116 = f53404c;
                    int i1117 = i1116 & 27;
                    int i1118 = (i1116 ^ 27) | i1117;
                    i13 = ((i1117 | i1118) << 1) - (i1118 ^ i1117);
                    f53403b = i13 % 128;
                    if (i13 % 2 == 0) {
                        return ajjVar;
                    }
                    throw null;
                }
                if (angVar instanceof ank) {
                    ank ankVar2 = (ank) angVar;
                    ajw ajwVar3 = new ajw((adu) ank.setDividerPadding(new Object[]{ankVar2}, -1737123400, 1737123400, System.identityHashCode(ankVar2)));
                    int i1119 = f53403b + 57;
                    f53404c = i1119 % 128;
                    int i126 = i1119 % 2;
                    ajwVar = ajwVar3;
                } else {
                    ajwVar = new ajw(new ajz(angVar.setDividerPadding(), new akb(angVar.setCompoundDrawableTintBlendMode()), angVar.setY(), angVar.setOnFocusChangeListener(), angVar.setX()));
                    int i127 = f53403b;
                    int i128 = (i127 & (-36)) | ((~i127) & 35);
                    int i129 = (i127 & 35) << 1;
                    int i1210 = (i128 ^ i129) + ((i129 & i128) << 1);
                    f53404c = i1210 % 128;
                    int i1211 = i1210 % 2;
                }
            }
        }
        apl aplVar5 = (apl) anl.setX(new Object[]{anlVar}, -504564904, 504564904, System.identityHashCode(anlVar));
        ajj ajjVar8 = new ajj(new aiw(akf.setLayoutAnimation, ajwVar), (byte[]) apl.setOnFocusChangeListener(new Object[]{aplVar5, Boolean.FALSE}, -866502364, 866502380, System.identityHashCode(aplVar5)));
        int i130 = f53404c;
        int i131 = i130 & 7;
        int i132 = (i131 - (~(-(-((i130 ^ 7) | i131))))) - 1;
        f53403b = i132 % 128;
        int i133 = i132 % 2;
        return ajjVar8;
    }

    public static ajj setOnFocusChangeListener(amw amwVar) throws IOException {
        return (ajj) setY(new Object[]{amwVar}, -1058795250, 1058795251, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i12;
        int i15 = (~(i13 | i11)) | (~(i13 | i14));
        int i16 = ~i11;
        int i17 = ~(i10 | i16 | i12);
        int i18 = ((~(i16 | i14)) * 713) + (i17 * 1426) + ((i15 | i17) * (-713)) + (i11 * (-712)) + (i10 * 714);
        int i19 = 1;
        if (i18 == 1) {
            return a(objArr);
        }
        int i20 = 0;
        byte[] bArr = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i21 = 2;
        int iIntValue2 = ((Number) objArr[2]).intValue();
        BigInteger bigInteger = (BigInteger) objArr[3];
        int i22 = f53403b;
        int i23 = (i22 ^ 31) + ((i22 & 31) << 1);
        f53404c = i23 % 128;
        int i24 = i23 % 2;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < iIntValue) {
            int i25 = f53404c;
            int i26 = ((i25 ^ 121) | (i25 & 121)) << 1;
            int i27 = -(((~i25) & 121) | (i25 & (-122)));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            f53403b = i28 % 128;
            int i29 = i28 % 2;
            byte[] bArr2 = new byte[iIntValue];
            int length = byteArray.length;
            if (i29 != 0) {
                System.arraycopy(byteArray, 0, bArr2, iIntValue >>> length, byteArray.length);
            } else {
                int i30 = -length;
                int i31 = iIntValue | i30;
                int i32 = i31 << 1;
                int i33 = -((~(i30 & iIntValue)) & i31);
                System.arraycopy(byteArray, 0, bArr2, ((i32 | i33) << 1) - (i33 ^ i32), byteArray.length);
            }
            byteArray = bArr2;
        }
        int i34 = f53404c;
        int i35 = (i34 & 13) + (i34 | 13);
        f53403b = i35 % 128;
        int i36 = i35 % 2;
        while (i20 != iIntValue) {
            int i37 = f53404c;
            int i38 = i37 ^ 115;
            int i39 = -(-((i37 & 115) << i19));
            int i40 = (i38 ^ i39) + ((i39 & i38) << i19);
            int i41 = i40 % 128;
            f53403b = i41;
            int i42 = i40 % i21;
            int i43 = iIntValue2 + i20;
            int length2 = byteArray.length;
            int i44 = length2 * (-279);
            int i45 = (-141) ^ i44;
            int i46 = -(-((i44 & (-141)) << i19));
            int i47 = (i45 & i46) + (i46 | i45);
            int i48 = length2 ^ iIntValue;
            int i49 = ~iIntValue;
            int i50 = length2 & iIntValue;
            int i51 = ((i48 & i50) | (i48 ^ i50)) * 140;
            int i52 = i47 & i51;
            int i53 = i51 | i47;
            int i54 = ((i52 | i53) << i19) - (i53 ^ i52);
            int i55 = ~length2;
            int i56 = i55 & (i55 | length2);
            int i57 = i49 & length2;
            int i58 = (~i57) & (i49 | length2);
            int i59 = ~((i57 & i58) | (i58 ^ i57));
            int i60 = i56 & i59;
            int i61 = (i59 | i56) & (~i60);
            int i62 = ((i61 & i60) | (i61 ^ i60)) * (-280);
            int i63 = i54 ^ i62;
            int i64 = -(-((i54 & i62) << i19));
            int i65 = (i63 ^ i64) + ((i64 & i63) << i19);
            int i66 = ~i56;
            int i67 = ~((i56 & i66) | (i66 ^ i56));
            int i68 = (i49 | iIntValue) & i49;
            int i69 = ~i68;
            int i70 = ~((i69 & i68) | (i69 ^ i68));
            int i71 = ((~i67) & i70) | ((~i70) & i67) | (i67 & i70);
            int i72 = length2 & iIntValue;
            int i73 = (length2 | iIntValue) & (~i72);
            int i74 = ~((i73 & i72) | (i73 ^ i72));
            int i75 = i71 & i74;
            int i76 = (i71 | i74) & (~i75);
            int i77 = -(-(((i76 & i75) | (i76 ^ i75)) * 140));
            int i78 = ((((i65 ^ i77) | (i65 & i77)) << i19) - (~(-((i77 & (~i65)) | ((~i77) & i65))))) - i19;
            int i79 = -i20;
            int i80 = i79 * 989;
            int i81 = -(-(i78 * (-987)));
            int i82 = i80 & i81;
            int i83 = (i80 | i81) & (~i82);
            int i84 = -(-(i82 << 1));
            int i85 = (i83 & i84) + (i83 | i84);
            int i86 = ~i78;
            int i87 = i86 ^ i68;
            int i88 = i68 & i86;
            int i89 = (i88 & i87) | (i87 ^ i88);
            int i90 = i89 ^ i79;
            int i91 = i89 & i79;
            int i92 = ~((i91 & i90) | (i90 ^ i91));
            int i93 = i79 & i86;
            int i94 = ~i79;
            int i95 = i93 | (i78 & i94);
            int i96 = i79 & i78;
            int i97 = (i95 ^ i96) | (i95 & i96);
            int i98 = i97 & iIntValue;
            int i99 = iIntValue2;
            int i100 = (~i98) & (i97 | iIntValue);
            int i101 = ~((i100 ^ i98) | (i98 & i100));
            int i102 = ((i101 & i92) | ((~i101) & i92) | ((~i92) & i101)) * 988;
            int i103 = i85 & i102;
            int i104 = i103 + ((i102 ^ i85) | i103);
            int i105 = ((~i86) & i79) | (i86 & i94);
            int i106 = -(-(((i105 & i93) | (i105 ^ i93)) * (-988)));
            int i107 = i104 & i106;
            int i108 = (i106 | i104) & (~i107);
            int i109 = i107 << 1;
            int i110 = ((i108 | i109) << 1) - (i108 ^ i109);
            int i111 = (i86 | i78) & i86;
            int i112 = i94 & i111;
            int i113 = (i111 | i94) & (~i112);
            int i114 = (i113 & i112) | (i113 ^ i112);
            int i115 = ~i114;
            int i116 = (i114 | i115) & i115;
            int i117 = i86 ^ iIntValue;
            int i118 = i86 & iIntValue;
            int i119 = (i117 & i118) | (i117 ^ i118);
            int i120 = ~i119;
            int i121 = (i119 | i120) & i120;
            int i122 = ((~i121) & i116) | ((~i116) & i121);
            int i123 = i116 & i121;
            int i124 = (i123 & i122) | (i122 ^ i123);
            int i125 = i49 & i79;
            int i126 = (i79 | i49) & (~i125);
            int i127 = (i126 & i125) | (i126 ^ i125);
            int i128 = (i127 & i86) | ((~i127) & i78);
            int i129 = i127 & i78;
            int i130 = (i129 & i128) | (i128 ^ i129);
            int i131 = ~i130;
            int i132 = (i130 | i131) & i131;
            int i133 = i124 ^ i132;
            int i134 = i124 & i132;
            int i135 = ((i134 & i133) | (i133 ^ i134)) * 988;
            int i136 = i110 ^ i135;
            int i137 = ((i135 & i110) | i136) << 1;
            int i138 = -i136;
            bArr[i43] = byteArray[(i137 & i138) + (i137 | i138)];
            int i139 = i20 & 1;
            int i140 = -(-((i20 ^ 1) | i139));
            int i141 = i41 ^ 35;
            int i142 = ((i41 & 35) | i141) << 1;
            int i143 = -i141;
            int i144 = (i142 & i143) + (i143 | i142);
            f53404c = i144 % 128;
            i21 = 2;
            int i145 = i144 % 2;
            iIntValue2 = i99;
            i20 = ((i139 & i140) << 1) + (i139 ^ i140);
            i19 = 1;
        }
        int i146 = f53403b + 59;
        f53404c = i146 % 128;
        int i147 = i146 % i21;
        return null;
    }
}
