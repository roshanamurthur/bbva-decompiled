package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class setImageTintList extends setLeftTopRightBottom {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f59833d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f59834e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setFindListener f59835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public byte[] f59836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public setFocusable f59837c;

    public /* synthetic */ class setY {
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;

        static {
            int[] iArr = new int[PinViewportDp.values().length];
            iArr[PinViewportDp.setLayoutAnimation.ordinal()] = 1;
            iArr[PinViewportDp.setOnLongClickListener.ordinal()] = 2;
            iArr[PinViewportDp.setDividerPadding.ordinal()] = 3;
            iArr[PinViewportDp.getNavBarTitleString.ordinal()] = 4;
            iArr[PinViewportDp.setNavigationOnClickListener.ordinal()] = 5;
            iArr[PinViewportDp.setOnDragListener.ordinal()] = 6;
            iArr[PinViewportDp.setOnFocusChangeListener.ordinal()] = 7;
            iArr[PinViewportDp.setY.ordinal()] = 8;
            iArr[PinViewportDp.setCompoundDrawableTintBlendMode.ordinal()] = 9;
            iArr[PinViewportDp.setX.ordinal()] = 10;
            setCompoundDrawableTintBlendMode = iArr;
            int i10 = -(-61);
            int i11 = (i10 << 1) - i10;
            int i12 = i11 % 128;
            int i13 = i11 % 2;
        }
    }

    public setImageTintList(@NotNull setFindListener setfindlistener, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(setfindlistener, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f59835a = setfindlistener;
        this.f59836b = bArr;
        this.f59837c = new setFocusable(bArr.length);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0248 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0249  */
    /* JADX WARN: Code duplicated, block: B:35:0x0394 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0395  */
    public static /* synthetic */ Object a(Object[] objArr) {
        byte[] bArr;
        byte[] bArrSliceArray;
        int i10;
        byte[] bArrSliceArray2;
        int i11;
        int i12 = 0;
        setImageTintList setimagetintlist = (setImageTintList) objArr[0];
        int i13 = f59833d;
        int i14 = ((i13 ^ 59) | (i13 & 59)) << 1;
        int i15 = -((i13 & (-60)) | ((~i13) & 59));
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        int i17 = i16 % 128;
        f59834e = i17;
        if (i16 % 2 == 0) {
            int length = setimagetintlist.f59836b.length;
            throw null;
        }
        byte[] bArr2 = setimagetintlist.f59836b;
        if (bArr2.length == 0) {
            int i18 = i17 + 85;
            f59833d = i18 % 128;
            int i19 = i18 % 2;
            int i20 = (i17 ^ 23) + ((i17 & 23) << 1);
            f59833d = i20 % 128;
            int i21 = i20 % 2;
            int iIdentityHashCode = System.identityHashCode(setimagetintlist);
            int i22 = ~iIdentityHashCode;
            int i23 = (1984136621 & i22) | (iIdentityHashCode & (-1984136622));
            int i24 = 1984136621 & iIdentityHashCode;
            int i25 = ~((i23 & i24) | (i23 ^ i24));
            int i26 = ((~i25) & 1888091329) | (i25 & (-1888091330));
            int i27 = i25 & 1888091329;
            int i28 = (-54892442) - (~(-(~(-(-(((i27 & i26) | (i26 ^ i27)) * (-318)))))));
            int i29 = 1888091329 ^ iIdentityHashCode;
            int i30 = 1888091329 & iIdentityHashCode;
            int i31 = ~((i29 & i30) | (i29 ^ i30));
            int i32 = ~iIdentityHashCode;
            int i33 = (i32 | (-1984136622)) & (-1888091330);
            int i34 = (i32 | (-1879147650)) & (~i33);
            int i35 = ~((i34 & i33) | (i34 ^ i33));
            int i36 = i31 ^ i35;
            int i37 = i31 & i35;
            int i38 = (((i37 & i36) | (i36 ^ i37)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + i28;
            int i39 = ((~i22) & 1888091329) | ((-1888091330) & i22);
            int i40 = i22 & 1888091329;
            int i41 = (i40 & i39) | (i39 ^ i40);
            int i42 = (1984136621 & i41) | ((~i41) & (-1984136622));
            int i43 = i41 & (-1984136622);
            int i44 = ~((i43 & i42) | (i42 ^ i43));
            int i45 = (-1879147650) & iIdentityHashCode;
            int i46 = ~(((iIdentityHashCode | (-1879147650)) & (~i45)) | i45);
            int i47 = i44 & i46;
            int i48 = (i46 | i44) & (~i47);
            int i49 = -(-(((i48 & i47) | (i48 ^ i47)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
            int i50 = ((i38 | i49) << 1) - (i49 ^ i38);
            int iIdentityHashCode2 = System.identityHashCode(setimagetintlist);
            int i51 = ~((508693589 ^ iIdentityHashCode2) | (508693589 & iIdentityHashCode2));
            int i52 = 1082999210 & i51;
            int i53 = (i51 | 1082999210) & (~i52);
            int i54 = -(~(((i53 & i52) | (i53 ^ i52)) * 992));
            int i55 = (((-404373067) & i54) + (i54 | (-404373067))) - 1;
            int i56 = 508693589 & iIdentityHashCode2;
            int i57 = (508693589 | iIdentityHashCode2) & (~i56);
            int i58 = ~((i57 & i56) | (i57 ^ i56));
            int i59 = 1082999210 & i58;
            int i60 = ((i58 | 1082999210) & (~i59)) | i59;
            int i61 = ~iIdentityHashCode2;
            int i62 = ~iIdentityHashCode2;
            int i63 = i61 & (i62 | iIdentityHashCode2);
            int i64 = i63 & (-508693590);
            int i65 = (i63 | (-508693590)) & (~i64);
            int i66 = (i65 & i64) | (i65 ^ i64);
            int i67 = ~((i66 & 1489977787) | (i66 ^ 1489977787));
            int i68 = i60 ^ i67;
            int i69 = i60 & i67;
            int i70 = ((i69 & i68) | (i68 ^ i69)) * (-496);
            int i71 = (((~i70) & i55) | ((~i55) & i70)) + ((i70 & i55) << 1);
            int i72 = (1489977787 & i62) | ((-1489977788) & iIdentityHashCode2);
            int i73 = iIdentityHashCode2 & 1489977787;
            if (i50 > (i71 - (~(-(~(((i73 & i72) | (i72 ^ i73)) * 496))))) - 2) {
                int i74 = 93 / 0;
            }
            return bArr2;
        }
        int i75 = (i13 ^ 7) + ((i13 & 7) << 1);
        f59834e = i75 % 128;
        int i76 = i75 % 2;
        setFindListener setfindlistener = setimagetintlist.f59835a;
        switch (setY.setCompoundDrawableTintBlendMode[((PinViewportDp) setFindListener.setY(new Object[]{setfindlistener}, -1552351757, 1552351757, System.identityHashCode(setfindlistener))).ordinal()]) {
            case 1:
            case 2:
            case 3:
                int i77 = f59833d;
                int i78 = (i77 | 83) << 1;
                int i79 = -(((~i77) & 83) | (i77 & (-84)));
                int i80 = (i78 & i79) + (i79 | i78);
                f59834e = i80 % 128;
                while (true) {
                    int i81 = i80 % 2;
                    bArr = setimagetintlist.f59836b;
                    if (i12 < bArr.length) {
                        int i82 = f59834e;
                        int i83 = i82 & 27;
                        int i84 = ((((i82 ^ 27) | i83) << 1) - (~(-((i82 | 27) & (~i83))))) - 1;
                        f59833d = i84 % 128;
                        if (i84 % 2 != 0) {
                            byte b10 = bArr[i12];
                            throw null;
                        }
                        if (bArr[i12] == 0) {
                            int iIdentityHashCode3 = System.identityHashCode(setimagetintlist);
                            int i85 = -(-(i12 * 371));
                            int i86 = ((371 & i85) - (~(i85 | 371))) - 1;
                            int i87 = (~i12) & ((~i12) | i12);
                            int i88 = ~iIdentityHashCode3;
                            int i89 = (~iIdentityHashCode3) | iIdentityHashCode3;
                            int i90 = i88 & i89;
                            int i91 = ((~i90) & i87) | ((~i87) & i90);
                            int i92 = i90 & i87;
                            int i93 = ~((i92 & i91) | (i91 ^ i92));
                            int i94 = ((-2) ^ iIdentityHashCode3) | ((-2) & iIdentityHashCode3);
                            int i95 = (i94 | (~i94)) & (~i94);
                            int i96 = ((~i95) & i93) | ((~i93) & i95);
                            int i97 = i93 & i95;
                            int i98 = (i86 - (~(-(-(((i97 & i96) | (i96 ^ i97)) * (-370)))))) - 1;
                            int i99 = (~iIdentityHashCode3) & i89;
                            int i100 = (-2) ^ i99;
                            int i101 = i99 & (-2);
                            int i102 = ~((i101 & i100) | (i100 ^ i101));
                            int i103 = i87 & iIdentityHashCode3;
                            int i104 = ~(((iIdentityHashCode3 | i87) & (~i103)) | i103);
                            int i105 = (i104 & i102) | (i102 ^ i104);
                            int i106 = i12 ^ 1;
                            int i107 = i12 & 1;
                            int i108 = ~((i106 ^ i107) | (i106 & i107));
                            int i109 = -(-(((i105 & i108) | (i105 ^ i108)) * (-370)));
                            int i110 = i98 & i109;
                            int i111 = i109 | i98;
                            int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
                            int i113 = (~(i107 | i106)) * 370;
                            i12 = ((i113 & i112) << 1) + (i112 ^ i113);
                            int i114 = f59833d;
                            int i115 = i114 & 99;
                            int i116 = i114 | 99;
                            i80 = ((i115 | i116) << 1) - (i116 ^ i115);
                            f59834e = i80 % 128;
                        }
                    }
                }
                byte[] bArrSliceArray3 = ArraysKt___ArraysKt.sliceArray(bArr, c.until(i12, bArr.length));
                int i117 = f59834e + 5;
                f59833d = i117 % 128;
                int i118 = i117 % 2;
                return bArrSliceArray3;
            case 4:
                int length2 = setimagetintlist.f59836b.length;
                int iIdentityHashCode4 = System.identityHashCode(setimagetintlist);
                int i119 = (-756) - (~(-(-(length2 * (-753)))));
                int i120 = ~((~0) & length2);
                int i121 = ~iIdentityHashCode4;
                int i122 = ((~i121) & i120) | ((~i120) & i121);
                int i123 = i120 & i121;
                int i124 = (i123 & i122) | (i122 ^ i123);
                int i125 = ~((length2 ^ iIdentityHashCode4) | (length2 & iIdentityHashCode4));
                int i126 = ((~i125) & i124) | ((~i124) & i125);
                int i127 = i124 & i125;
                int i128 = -(-(((i127 & i126) | (i126 ^ i127)) * (-754)));
                int i129 = i119 & i128;
                int i130 = (i119 | i128) & (~i129);
                int i131 = -(-(i129 << 1));
                int i132 = ((i130 | i131) << 1) - (i130 ^ i131);
                int i133 = length2 & iIdentityHashCode4;
                int i134 = (~i133) & (length2 | iIdentityHashCode4);
                int i135 = ~((i133 & i134) | (i134 ^ i133));
                int i136 = ~iIdentityHashCode4;
                int i137 = ~i136;
                int i138 = (i137 & i136) | (i137 ^ i136);
                int i139 = i138 & length2;
                int i140 = (length2 | i138) & (~i139);
                int i141 = (i140 & i139) | (i140 ^ i139);
                int i142 = (i141 | (~i141)) & (~i141);
                int i143 = i135 & i142;
                int i144 = -(~(-(-((((i142 | i135) & (~i143)) | i143) * (-754)))));
                int i145 = (i132 ^ i144) + ((i144 & i132) << 1);
                int i146 = (i145 ^ (-1)) + (i145 << 1);
                int i147 = -(-(i136 * 754));
                int i148 = i146 & i147;
                int i149 = (i146 | i147) & (~i148);
                int i150 = -(-(i148 << 1));
                int i151 = (i149 ^ i150) + ((i149 & i150) << 1);
                int i152 = f59833d;
                int i153 = i152 ^ 95;
                int i154 = ((((i152 & 95) | i153) << 1) - (~(-i153))) - 1;
                f59834e = i154 % 128;
                int i155 = i154 % 2;
                while (i151 > 0) {
                    int i156 = f59834e + 5;
                    f59833d = i156 % 128;
                    if (i156 % 2 != 0) {
                        int i157 = 68 / 0;
                        if (setimagetintlist.f59836b[i151] != -1) {
                            bArrSliceArray = ArraysKt___ArraysKt.sliceArray(setimagetintlist.f59836b, new IntRange(0, i151));
                            i10 = f59833d + 107;
                            f59834e = i10 % 128;
                            if (i10 % 2 != 0) {
                                return bArrSliceArray;
                            }
                            throw null;
                        }
                        System.identityHashCode(setimagetintlist);
                        System.identityHashCode(setimagetintlist);
                        int iIdentityHashCode5 = System.identityHashCode(setimagetintlist);
                        int i158 = -(-(i151 * 565));
                        int i159 = 563 & i158;
                        int i160 = (i158 | 563) & (~i159);
                        int i161 = -(-(i159 << 1));
                        int i162 = (i160 & i161) + (i160 | i161);
                        int i163 = ~i151;
                        int i164 = ~i151;
                        int i165 = (i164 | i151) & i163;
                        int i166 = ~iIdentityHashCode5;
                        int i167 = (i165 & i166) | (i165 ^ i166);
                        int i168 = (i167 | (~i167)) & (~i167);
                        int i169 = ~iIdentityHashCode5;
                        int i170 = (i164 & iIdentityHashCode5) | (i151 & i169);
                        int i171 = i151 & iIdentityHashCode5;
                        int i172 = (i162 - (~(-(-(((~((i170 & i171) | (i170 ^ i171))) | i168) * (-564)))))) - 1;
                        int i173 = (i151 & i169) | ((~i151) & iIdentityHashCode5);
                        int i174 = iIdentityHashCode5 & i151;
                        int i175 = (i174 & i173) | (i173 ^ i174);
                        int i176 = -(~(((i175 | (~i175)) & (~i175)) * 1128));
                        int i177 = ((i172 & i176) + (i176 | i172)) - 1;
                        int i178 = ~i169;
                        int i179 = ~(i163 | i151);
                        int i180 = i178 & i179;
                        int i181 = (i178 | i179) & (~i180);
                        int i182 = ((i181 & i180) | (i181 ^ i180)) * 564;
                        int i183 = i177 & i182;
                        int i184 = (i182 ^ i177) | i183;
                        i151 = ((i183 | i184) << 1) - (i184 ^ i183);
                        int i185 = f59833d;
                        int i186 = i185 & 29;
                        int i187 = ((i185 | 29) & (~i186)) + (i186 << 1);
                        f59834e = i187 % 128;
                        int i188 = i187 % 2;
                    } else {
                        if (setimagetintlist.f59836b[i151] != -1) {
                            bArrSliceArray = ArraysKt___ArraysKt.sliceArray(setimagetintlist.f59836b, new IntRange(0, i151));
                            i10 = f59833d + 107;
                            f59834e = i10 % 128;
                            if (i10 % 2 != 0) {
                                return bArrSliceArray;
                            }
                            throw null;
                        }
                        System.identityHashCode(setimagetintlist);
                        System.identityHashCode(setimagetintlist);
                        int iIdentityHashCode6 = System.identityHashCode(setimagetintlist);
                        int i1510 = -(-(i151 * 565));
                        int i1511 = 563 & i1510;
                        int i1610 = (i1510 | 563) & (~i1511);
                        int i1611 = -(-(i1511 << 1));
                        int i1612 = (i1610 & i1611) + (i1610 | i1611);
                        int i1613 = ~i151;
                        int i1614 = ~i151;
                        int i1615 = (i1614 | i151) & i1613;
                        int i1616 = ~iIdentityHashCode6;
                        int i1617 = (i1615 & i1616) | (i1615 ^ i1616);
                        int i1618 = (i1617 | (~i1617)) & (~i1617);
                        int i1619 = ~iIdentityHashCode6;
                        int i1710 = (i1614 & iIdentityHashCode6) | (i151 & i1619);
                        int i1711 = i151 & iIdentityHashCode6;
                        int i1712 = (i1612 - (~(-(-(((~((i1710 & i1711) | (i1710 ^ i1711))) | i1618) * (-564)))))) - 1;
                        int i1713 = (i151 & i1619) | ((~i151) & iIdentityHashCode6);
                        int i1714 = iIdentityHashCode6 & i151;
                        int i1715 = (i1714 & i1713) | (i1713 ^ i1714);
                        int i1716 = -(~(((i1715 | (~i1715)) & (~i1715)) * 1128));
                        int i1717 = ((i1712 & i1716) + (i1716 | i1712)) - 1;
                        int i1718 = ~i1619;
                        int i1719 = ~(i1613 | i151);
                        int i189 = i1718 & i1719;
                        int i1810 = (i1718 | i1719) & (~i189);
                        int i1811 = ((i1810 & i189) | (i1810 ^ i189)) * 564;
                        int i1812 = i1717 & i1811;
                        int i1813 = (i1811 ^ i1717) | i1812;
                        i151 = ((i1812 | i1813) << 1) - (i1813 ^ i1812);
                        int i1814 = f59833d;
                        int i1815 = i1814 & 29;
                        int i1816 = ((i1814 | 29) & (~i1815)) + (i1815 << 1);
                        f59834e = i1816 % 128;
                        int i1817 = i1816 % 2;
                    }
                }
                bArrSliceArray = ArraysKt___ArraysKt.sliceArray(setimagetintlist.f59836b, new IntRange(0, i151));
                i10 = f59833d + 107;
                f59834e = i10 % 128;
                if (i10 % 2 != 0) {
                    return bArrSliceArray;
                }
                throw null;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                int length3 = setimagetintlist.f59836b.length;
                int i190 = ((length3 ^ (-1)) | length3) << 1;
                int i191 = -(~length3);
                int i192 = (i190 & i191) + (i191 | i190);
                int i193 = f59833d;
                int i194 = (i193 & (-14)) | ((~i193) & 13);
                int i195 = -(-((i193 & 13) << 1));
                int i196 = (i194 ^ i195) + ((i195 & i194) << 1);
                f59834e = i196 % 128;
                int i197 = i196 % 2;
                while (i192 > 0) {
                    int i198 = f59833d;
                    int i199 = i198 & 33;
                    int i200 = ((i198 ^ 33) | i199) << 1;
                    int i201 = -((~i199) & (i198 | 33));
                    int i202 = (i200 ^ i201) + ((i200 & i201) << 1);
                    f59834e = i202 % 128;
                    int i203 = i202 % 2;
                    if (setimagetintlist.f59836b[i192] != 0) {
                        bArrSliceArray2 = ArraysKt___ArraysKt.sliceArray(setimagetintlist.f59836b, new IntRange(0, i192));
                        int i204 = f59834e;
                        int i205 = (i204 & (-66)) | ((~i204) & 65);
                        int i206 = (i204 & 65) << 1;
                        i11 = (i205 ^ i206) + ((i206 & i205) << 1);
                        f59833d = i11 % 128;
                        if (i11 % 2 == 0) {
                            return bArrSliceArray2;
                        }
                        throw null;
                    }
                    int i207 = ((((i198 ^ 29) | (i198 & 29)) << 1) - (~(-(((~i198) & 29) | (i198 & (-30)))))) - 1;
                    f59834e = i207 % 128;
                    int i208 = i207 % 2;
                    int iIdentityHashCode7 = System.identityHashCode(setimagetintlist);
                    int i209 = -(-(i192 * 949));
                    int i210 = ((~i209) & 947) | (i209 & (-948));
                    int i211 = -(-((i209 & 947) << 1));
                    int i212 = (i210 ^ i211) + ((i211 & i210) << 1);
                    int i213 = ~i192;
                    int i214 = ~iIdentityHashCode7;
                    int i215 = (i213 & i214) | ((~i213) & iIdentityHashCode7);
                    int i216 = i213 & iIdentityHashCode7;
                    int i217 = (~((i215 & i216) | (i215 ^ i216))) * (-948);
                    int i218 = i212 & i217;
                    int i219 = ((i212 | i217) & (~i218)) + (i218 << 1);
                    int i220 = (i192 | i213) & (~i192);
                    int i221 = (iIdentityHashCode7 | i214) & (~iIdentityHashCode7);
                    int i222 = i220 & i221;
                    int i223 = (i221 | i220) & (~i222);
                    int i224 = (~((i223 & i222) | (i223 ^ i222))) * (-948);
                    int i225 = i219 & i224;
                    int i226 = ((i224 | i219) & (~i225)) + (i225 << 1);
                    int i227 = -(~((i213 | (i213 ^ (-1))) * 948));
                    i192 = (((i226 | i227) << 1) - (i226 ^ i227)) - 1;
                    int i228 = f59833d + 111;
                    f59834e = i228 % 128;
                    int i229 = i228 % 2;
                }
                bArrSliceArray2 = ArraysKt___ArraysKt.sliceArray(setimagetintlist.f59836b, new IntRange(0, i192));
                int i2010 = f59834e;
                int i2011 = (i2010 & (-66)) | ((~i2010) & 65);
                int i2012 = (i2010 & 65) << 1;
                i11 = (i2011 ^ i2012) + ((i2012 & i2011) << 1);
                f59833d = i11 % 128;
                if (i11 % 2 == 0) {
                    return bArrSliceArray2;
                }
                throw null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x059b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x059e  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        boolean x4;
        char c10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = ~i11;
        int i20 = ~i10;
        int i21 = ~i12;
        switch (((~(i10 | i11)) * 933) + (((~(i19 | i10)) | (~(i19 | i21))) * 933) + (((~(i20 | i21)) | i19) * (-933)) + (i11 * (-932)) + (i10 * 934)) {
            case 1:
                objValueOf = null;
                setImageTintList setimagetintlist = (setImageTintList) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                Intrinsics.checkNotNullParameter(bArr, "");
                setimagetintlist.f59836b = bArr;
                setimagetintlist.f59837c = new setFocusable(bArr.length);
                int i22 = f59834e;
                int i23 = (i22 & (-48)) | ((~i22) & 47);
                int i24 = -(-((i22 & 47) << 1));
                int i25 = (i23 & i24) + (i24 | i23);
                f59833d = i25 % 128;
                int i26 = i25 % 2;
                break;
            case 2:
                setImageTintList setimagetintlist2 = (setImageTintList) objArr[0];
                int i27 = f59833d;
                int i28 = i27 & 15;
                int i29 = i27 | 15;
                int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                f59834e = i30 % 128;
                int i31 = i30 % 2;
                setFocusable setfocusable = setimagetintlist2.f59837c;
                int iIntValue = ((Integer) setFocusable.setOnFocusChangeListener(new Object[]{setfocusable}, -1668155176, 1668155184, System.identityHashCode(setfocusable))).intValue();
                int i32 = f59834e;
                int i33 = i32 & 25;
                int i34 = -(-((i32 ^ 25) | i33));
                int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                f59833d = i35 % 128;
                int i36 = i35 % 2;
                return Integer.valueOf(iIntValue);
            case 3:
                return a(objArr);
            case 4:
                setImageTintList setimagetintlist3 = (setImageTintList) objArr[0];
                int i37 = f59834e;
                int i38 = (i37 ^ 99) + ((i37 & 99) << 1);
                f59833d = i38 % 128;
                int i39 = i38 % 2;
                setFindListener setfindlistener = setimagetintlist3.f59835a;
                byte[] bArr2 = setimagetintlist3.f59836b;
                if (i39 != 0) {
                    x4 = setfindlistener.setX(bArr2);
                    int i40 = 14 / 0;
                } else {
                    x4 = setfindlistener.setX(bArr2);
                }
                int i41 = f59834e;
                int i42 = i41 & 21;
                int i43 = -(-((i41 ^ 21) | i42));
                int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                f59833d = i44 % 128;
                if (i44 % 2 != 0) {
                    int i45 = 84 / 0;
                }
                objValueOf = Boolean.valueOf(x4);
                break;
            case 5:
                setImageTintList setimagetintlist4 = (setImageTintList) objArr[0];
                int i46 = f59834e;
                int i47 = i46 + 111;
                f59833d = i47 % 128;
                int i48 = i47 % 2;
                objValueOf = setimagetintlist4.f59835a;
                int i49 = i46 + 121;
                f59833d = i49 % 128;
                int i50 = i49 % 2;
                break;
            case 6:
                setImageTintList setimagetintlist5 = (setImageTintList) objArr[0];
                int i51 = f59834e + 123;
                int i52 = i51 % 128;
                f59833d = i52;
                int i53 = i51 % 2;
                byte[] bArr3 = setimagetintlist5.f59836b;
                int i54 = i52 ^ 17;
                int i55 = ((i52 & 17) | i54) << 1;
                int i56 = -i54;
                int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                f59834e = i57 % 128;
                int i58 = i57 % 2;
                return bArr3;
            case 7:
                setImageTintList setimagetintlist6 = (setImageTintList) objArr[0];
                int i59 = f59833d + 65;
                f59834e = i59 % 128;
                int i60 = i59 % 2;
                setFindListener setfindlistener2 = setimagetintlist6.f59835a;
                boolean zBooleanValue = ((Boolean) setFindListener.setY(new Object[]{setfindlistener2, (byte[]) setX(new Object[]{setimagetintlist6}, 827029685, -827029682, System.identityHashCode(setimagetintlist6))}, -2109739487, 2109739489, System.identityHashCode(setfindlistener2))).booleanValue();
                int i61 = f59834e;
                int i62 = i61 & 117;
                int i63 = i62 + ((i61 ^ 117) | i62);
                f59833d = i63 % 128;
                int i64 = i63 % 2;
                return Boolean.valueOf(zBooleanValue);
            case 8:
                setImageTintList setimagetintlist7 = (setImageTintList) objArr[0];
                int i65 = f59834e;
                int i66 = i65 ^ 69;
                int i67 = -(-((i65 & 69) << 1));
                int i68 = ((i66 | i67) << 1) - (i66 ^ i67);
                f59833d = i68 % 128;
                int i69 = i68 % 2;
                setFocusable setfocusable2 = setimagetintlist7.f59837c;
                int i70 = i65 & 59;
                int i71 = ((i65 ^ 59) | i70) << 1;
                int i72 = -((i65 | 59) & (~i70));
                int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
                f59833d = i73 % 128;
                if (i73 % 2 == 0) {
                    return setfocusable2;
                }
                int i74 = 14 / 0;
                return setfocusable2;
            default:
                setImageTintList setimagetintlist8 = (setImageTintList) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i75 = f59834e + 28;
                int i76 = (i75 ^ (-1)) + (i75 << 1);
                f59833d = i76 % 128;
                int i77 = i76 % 2;
                int iIntValue3 = ((Integer) setX(new Object[]{setimagetintlist8}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist8))).intValue();
                byte[] bArrSliceArray = setimagetintlist8.f59836b;
                if (bArrSliceArray.length > iIntValue3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(setimagetintlist8.f59836b.length);
                    sb2.append(" > ");
                    sb2.append(iIntValue3);
                    throw new setOnHierarchyChangeListener(2004, sb2.toString());
                }
                int length = bArrSliceArray.length;
                setFindListener setfindlistener3 = setimagetintlist8.f59835a;
                if (length >= iIntValue2) {
                    if (bArrSliceArray.length > iIntValue2) {
                        int i78 = f59834e;
                        int i79 = i78 ^ 123;
                        int i80 = ((i78 & 123) | i79) << 1;
                        int i81 = -i79;
                        int i82 = (i80 ^ i81) + ((i80 & i81) << 1);
                        f59833d = i82 % 128;
                        if (i82 % 2 != 0) {
                            int i83 = setY.setCompoundDrawableTintBlendMode[((PinViewportDp) setFindListener.setY(new Object[]{setfindlistener3}, -1552351757, 1552351757, System.identityHashCode(setfindlistener3))).ordinal()];
                            throw null;
                        }
                        switch (setY.setCompoundDrawableTintBlendMode[((PinViewportDp) setFindListener.setY(new Object[]{setfindlistener3}, -1552351757, 1552351757, System.identityHashCode(setfindlistener3))).ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                                byte[] bArr4 = setimagetintlist8.f59836b;
                                int length2 = bArr4.length;
                                int i84 = -iIntValue2;
                                int i85 = i84 * (-958);
                                int i86 = length2 * (-958);
                                int i87 = i85 & i86;
                                int i88 = -(-((i85 ^ i86) | i87));
                                int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                                int i90 = ~length2;
                                int i91 = ~iIntValue2;
                                int i92 = i90 ^ i91;
                                int i93 = i90 & i91;
                                int i94 = (i92 & i93) | (i92 ^ i93);
                                int i95 = ~i94;
                                int i96 = (i94 | i95) & i95;
                                int i97 = ~i84;
                                int i98 = (i97 | i84) & i97;
                                int i99 = i98 & i91;
                                int i100 = ~i98;
                                int i101 = i99 | (iIntValue2 & i100);
                                int i102 = i98 & iIntValue2;
                                int i103 = (i101 ^ i102) | (i101 & i102);
                                int i104 = ~i103;
                                int i105 = (i103 | i104) & i104;
                                int i106 = (i105 & i96) | ((~i105) & i96) | ((~i96) & i105);
                                int i107 = i91 & i84;
                                int i108 = ~((i91 ^ i84) | i107);
                                int i109 = ((~i106) & i108) | ((~i108) & i106);
                                int i110 = i106 & i108;
                                int i111 = -(~(-(-(((i109 & i110) | (i109 ^ i110)) * 959))));
                                int i112 = (i89 ^ i111) + ((i111 & i89) << 1);
                                int i113 = (i112 ^ (-1)) + (i112 << 1);
                                int i114 = (i84 & i90) | (length2 & i97);
                                int i115 = i84 & length2;
                                int i116 = (~((i114 & i115) | (i114 ^ i115))) * (-959);
                                int i117 = i113 & i116;
                                int i118 = (((i113 | i116) & (~i117)) - (~(i117 << 1))) - 1;
                                int i119 = ((~i91) & i98) | (i91 & i100);
                                int i120 = (i119 & i99) | (i119 ^ i99);
                                int i121 = ~i120;
                                int i122 = (i120 | i121) & i121;
                                int i123 = (i90 | length2) & i90;
                                int i124 = (i123 & i91) | ((~i123) & iIntValue2);
                                int i125 = i123 & iIntValue2;
                                int i126 = ~((i125 & i124) | (i124 ^ i125));
                                int i127 = (i122 & i126) | (i122 ^ i126);
                                int i128 = (iIntValue2 & i97) | i107;
                                int i129 = i84 & iIntValue2;
                                int i130 = (i128 & i129) | (i128 ^ i129);
                                int i131 = ~i130;
                                int i132 = (i130 | i131) & i131;
                                int i133 = ((~i132) & i127) | ((~i127) & i132);
                                int i134 = i127 & i132;
                                int i135 = -(-(((i134 & i133) | (i133 ^ i134)) * 959));
                                int i136 = i118 & i135;
                                int i137 = (i118 ^ i135) | i136;
                                bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bArr4, c.until((i136 ^ i137) + ((i137 & i136) << 1), bArr4.length));
                                int i138 = f59833d;
                                int i139 = (i138 ^ 73) + ((i138 & 73) << 1);
                                f59834e = i139 % 128;
                                int i140 = i139 % 2;
                                c10 = 1;
                                i13 = 2;
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                bArrSliceArray = ArraysKt___ArraysKt.sliceArray(setimagetintlist8.f59836b, c.until(0, iIntValue2));
                                int i141 = f59833d;
                                i14 = ((i141 ^ 72) + ((i141 & 72) << 1)) - 1;
                                f59834e = i14 % 128;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        int i142 = f59834e;
                        c10 = 1;
                        int i143 = (i142 ^ 51) + ((i142 & 51) << 1);
                        f59833d = i143 % 128;
                        i13 = 2;
                        int i144 = i143 % 2;
                    }
                    Object[] objArr2 = new Object[i13];
                    objArr2[0] = setimagetintlist8;
                    objArr2[c10] = bArrSliceArray;
                    setX(objArr2, -1398236510, 1398236511, System.identityHashCode(setimagetintlist8));
                    int i145 = ~iIntValue2;
                    int i146 = 1462422015 & i145;
                    int i147 = (1462422015 | i145) & (~i146);
                    int i148 = ~((i147 & i146) | (i147 ^ i146));
                    int i149 = (-1834204196) & i145;
                    int i150 = (iIntValue2 & 1834204195) | i149;
                    int i151 = (-1834204196) & iIntValue2;
                    int i152 = ~((i150 & i151) | (i150 ^ i151));
                    int i153 = i148 & i152;
                    int i154 = (i148 | i152) & (~i153);
                    int i155 = ((i154 & i153) | (i154 ^ i153)) * ErrorCodes.ERR_CRY_IO_PROPERTIES;
                    int i156 = (-80807571) ^ i155;
                    int i157 = ((((i155 & (-80807571)) | i156) << 1) - (~(-i156))) - 1;
                    int i158 = ((-1834204196) & (~i145)) | (1834204195 & i145);
                    int i159 = (i158 & i149) | (i158 ^ i149);
                    int i160 = i159 & (-1462422016);
                    int i161 = (i159 | (-1462422016)) & (~i160);
                    int i162 = (i161 & i160) | (i161 ^ i160);
                    int i163 = ~i162;
                    int i164 = (i162 | i163) & i163;
                    int i165 = ~((2138832383 & iIntValue2) | (2138832383 ^ iIntValue2));
                    int i166 = i164 & i165;
                    int i167 = -(-((((i164 | i165) & (~i166)) | i166) * ErrorCodes.ERR_CRY_IO_PROPERTIES));
                    int i168 = ((i157 ^ i167) | (i157 & i167)) << 1;
                    int i169 = -(((~i157) & i167) | ((~i167) & i157));
                    i15 = ((i168 | i169) << 1) - (i169 ^ i168);
                    int i170 = (-537397003) ^ i145;
                    int i171 = (-537397003) & i145;
                    int i172 = ((i171 & i170) | (i170 ^ i171)) * (-369);
                    int i173 = (1421728090 | i172) << 1;
                    int i174 = -((i172 & (-1421728091)) | (1421728090 & (~i172)));
                    int i175 = (i173 & i174) + (i174 | i173);
                    int i176 = (i145 | iIntValue2) & i145;
                    int i177 = ((~i176) & 2051852111) | (i176 & (-2051852112));
                    int i178 = i176 & 2051852111;
                    int i179 = ~((i178 & i177) | (i177 ^ i178));
                    int i180 = 1533333733 & i179;
                    int i181 = (i179 | 1533333733) & (~i180);
                    int i182 = ((i181 & i180) | (i181 ^ i180)) * (-369);
                    i16 = ((i175 | i182) << 1) - (i182 ^ i175);
                    int i183 = ((-2051852112) & i145) | (iIntValue2 & 2051852111);
                    int i184 = (-2051852112) & iIntValue2;
                    int i185 = (i183 & i184) | (i183 ^ i184);
                    int i186 = ~i185;
                    int i187 = (i185 | i186) & i186;
                    int i188 = 1514455109 & i187;
                    int i189 = (i187 | 1514455109) & (~i188);
                    int i190 = (i189 & i188) | (i189 ^ i188);
                    int i191 = 2051852111 ^ i145;
                    int i192 = i145 & 2051852111;
                    int i193 = (i192 & i191) | (i191 ^ i192);
                    int i194 = i193 ^ 1533333733;
                    int i195 = i193 & 1533333733;
                    int i196 = ~((i195 & i194) | (i194 ^ i195));
                    i17 = ((i196 & i190) | ((~i196) & i190) | ((~i190) & i196)) * 369;
                    i18 = i16 & i17;
                    if (i15 > (((i16 ^ i17) | i18) << 1) - ((i17 | i16) & (~i18))) {
                        return null;
                    }
                    throw null;
                }
                int i197 = f59833d;
                int i198 = (i197 & 12) + (i197 | 12);
                byte b10 = -1;
                int i199 = (-2) - (i198 ^ (-1));
                f59834e = i199 % 128;
                int i200 = i199 % 2;
                switch (setY.setCompoundDrawableTintBlendMode[((PinViewportDp) setFindListener.setY(new Object[]{setfindlistener3}, -1552351757, 1552351757, System.identityHashCode(setfindlistener3))).ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        int i201 = -setimagetintlist8.f59836b.length;
                        int i202 = ((iIntValue2 | i201) << 1) - (i201 ^ iIntValue2);
                        byte[] bArr5 = new byte[i202];
                        int i203 = f59833d;
                        int i204 = i203 & 55;
                        int i205 = -(-(i203 | 55));
                        int i206 = ((i204 | i205) << 1) - (i205 ^ i204);
                        f59834e = i206 % 128;
                        int i207 = i206 % 2;
                        int i208 = 0;
                        while (i208 < i202) {
                            int i209 = f59834e;
                            int i210 = i209 & 91;
                            int i211 = (~i210) & (i209 | 91);
                            int i212 = -(-(i210 << 1));
                            int i213 = (i211 & i212) + (i212 | i211);
                            f59833d = i213 % 128;
                            int i214 = i213 % 2;
                            bArr5[i208] = 0;
                            int i215 = i208 * (-622);
                            int i216 = (((624 ^ i215) | (624 & i215)) << 1) - ((i215 & (-625)) | (624 & (~i215)));
                            int i217 = ~i208;
                            int i218 = (i217 & (-2)) | ((~i217) & 1) | (i217 & 1);
                            int i219 = i218 ^ iIntValue2;
                            int i220 = ~iIntValue2;
                            int i221 = i218 & iIntValue2;
                            int i222 = -(-((~((i221 & i219) | (i219 ^ i221))) * 623));
                            int i223 = ((i216 ^ i222) | (i216 & i222)) << 1;
                            int i224 = -((i222 & (~i216)) | ((~i222) & i216));
                            int i225 = (i223 ^ i224) + ((i224 & i223) << 1);
                            int i226 = (i220 | iIntValue2) & i220;
                            int i227 = ((-2) ^ i208) | ((-2) & i208);
                            int i228 = ~i227;
                            int i229 = (i227 | i228) & i228;
                            int i230 = i226 & i229;
                            int i231 = (i226 | i229) & (~i230);
                            int i232 = -(~(-(-(((i231 & i230) | (i231 ^ i230)) * (-623)))));
                            int i233 = (-2) - (((i225 ^ i232) + ((i232 & i225) << 1)) ^ (-1));
                            int i234 = (i208 | i217) & i217;
                            int i235 = i234 & 1;
                            int i236 = (~i235) & (i234 | 1);
                            int i237 = ~((i235 & i236) | (i236 ^ i235));
                            int i238 = ~((i234 & iIntValue2) | (i234 ^ iIntValue2));
                            int i239 = (i238 & i237) | (i237 ^ i238);
                            int i240 = (iIntValue2 ^ 1) | (iIntValue2 & 1);
                            int i241 = ~i240;
                            int i242 = (i240 | i241) & i241;
                            int i243 = ((~i242) & i239) | ((~i239) & i242);
                            int i244 = i239 & i242;
                            int i245 = -(-(((i244 & i243) | (i243 ^ i244)) * 623));
                            int i246 = ((~i245) & i233) | ((~i233) & i245);
                            int i247 = -(-((i245 & i233) << 1));
                            i208 = (i247 | i246) + (i246 & i247);
                            int i248 = (((i209 | 122) << 1) - (i209 ^ 122)) - 1;
                            f59833d = i248 % 128;
                            int i249 = i248 % 2;
                        }
                        bArrSliceArray = ArraysKt___ArraysJvmKt.plus(bArr5, setimagetintlist8.f59836b);
                        i13 = 2;
                        c10 = 1;
                        Object[] objArr3 = new Object[i13];
                        objArr3[0] = setimagetintlist8;
                        objArr3[c10] = bArrSliceArray;
                        setX(objArr3, -1398236510, 1398236511, System.identityHashCode(setimagetintlist8));
                        int i1410 = ~iIntValue2;
                        int i1411 = 1462422015 & i1410;
                        int i1412 = (1462422015 | i1410) & (~i1411);
                        int i1413 = ~((i1412 & i1411) | (i1412 ^ i1411));
                        int i1414 = (-1834204196) & i1410;
                        int i1510 = (iIntValue2 & 1834204195) | i1414;
                        int i1511 = (-1834204196) & iIntValue2;
                        int i1512 = ~((i1510 & i1511) | (i1510 ^ i1511));
                        int i1513 = i1413 & i1512;
                        int i1514 = (i1413 | i1512) & (~i1513);
                        int i1515 = ((i1514 & i1513) | (i1514 ^ i1513)) * ErrorCodes.ERR_CRY_IO_PROPERTIES;
                        int i1516 = (-80807571) ^ i1515;
                        int i1517 = ((((i1515 & (-80807571)) | i1516) << 1) - (~(-i1516))) - 1;
                        int i1518 = ((-1834204196) & (~i1410)) | (1834204195 & i1410);
                        int i1519 = (i1518 & i1414) | (i1518 ^ i1414);
                        int i1610 = i1519 & (-1462422016);
                        int i1611 = (i1519 | (-1462422016)) & (~i1610);
                        int i1612 = (i1611 & i1610) | (i1611 ^ i1610);
                        int i1613 = ~i1612;
                        int i1614 = (i1612 | i1613) & i1613;
                        int i1615 = ~((2138832383 & iIntValue2) | (2138832383 ^ iIntValue2));
                        int i1616 = i1614 & i1615;
                        int i1617 = -(-((((i1614 | i1615) & (~i1616)) | i1616) * ErrorCodes.ERR_CRY_IO_PROPERTIES));
                        int i1618 = ((i1517 ^ i1617) | (i1517 & i1617)) << 1;
                        int i1619 = -(((~i1517) & i1617) | ((~i1617) & i1517));
                        i15 = ((i1618 | i1619) << 1) - (i1619 ^ i1618);
                        int i1710 = (-537397003) ^ i1410;
                        int i1711 = (-537397003) & i1410;
                        int i1712 = ((i1711 & i1710) | (i1710 ^ i1711)) * (-369);
                        int i1713 = (1421728090 | i1712) << 1;
                        int i1714 = -((i1712 & (-1421728091)) | (1421728090 & (~i1712)));
                        int i1715 = (i1713 & i1714) + (i1714 | i1713);
                        int i1716 = (i1410 | iIntValue2) & i1410;
                        int i1717 = ((~i1716) & 2051852111) | (i1716 & (-2051852112));
                        int i1718 = i1716 & 2051852111;
                        int i1719 = ~((i1718 & i1717) | (i1717 ^ i1718));
                        int i1810 = 1533333733 & i1719;
                        int i1811 = (i1719 | 1533333733) & (~i1810);
                        int i1812 = ((i1811 & i1810) | (i1811 ^ i1810)) * (-369);
                        i16 = ((i1715 | i1812) << 1) - (i1812 ^ i1715);
                        int i1813 = ((-2051852112) & i1410) | (iIntValue2 & 2051852111);
                        int i1814 = (-2051852112) & iIntValue2;
                        int i1815 = (i1813 & i1814) | (i1813 ^ i1814);
                        int i1816 = ~i1815;
                        int i1817 = (i1815 | i1816) & i1816;
                        int i1818 = 1514455109 & i1817;
                        int i1819 = (i1817 | 1514455109) & (~i1818);
                        int i1910 = (i1819 & i1818) | (i1819 ^ i1818);
                        int i1911 = 2051852111 ^ i1410;
                        int i1912 = i1410 & 2051852111;
                        int i1913 = (i1912 & i1911) | (i1911 ^ i1912);
                        int i1914 = i1913 ^ 1533333733;
                        int i1915 = i1913 & 1533333733;
                        int i1916 = ~((i1915 & i1914) | (i1914 ^ i1915));
                        i17 = ((i1916 & i1910) | ((~i1916) & i1910) | ((~i1910) & i1916)) * 369;
                        i18 = i16 & i17;
                        if (i15 > (((i16 ^ i17) | i18) << 1) - ((i17 | i16) & (~i18))) {
                            return null;
                        }
                        throw null;
                    case 4:
                        byte[] bArr6 = setimagetintlist8.f59836b;
                        int i250 = -bArr6.length;
                        int i251 = iIntValue2 & i250;
                        int i252 = (i250 | iIntValue2) & (~i251);
                        int i253 = i251 << 1;
                        int i254 = (i252 ^ i253) + ((i252 & i253) << 1);
                        byte[] bArr7 = new byte[i254];
                        int i255 = f59834e;
                        int i256 = (i255 ^ 70) + ((i255 & 70) << 1);
                        int i257 = (i256 ^ (-1)) + (i256 << 1);
                        f59833d = i257 % 128;
                        int i258 = i257 % 2;
                        int i259 = 0;
                        while (i259 < i254) {
                            int i260 = f59834e;
                            int i261 = (i260 & (-42)) | ((~i260) & 41);
                            int i262 = -(-((i260 & 41) << 1));
                            int i263 = (i261 & i262) + (i262 | i261);
                            int i264 = i263 % 128;
                            f59833d = i264;
                            int i265 = i263 % 2;
                            bArr7[i259] = b10;
                            int i266 = -(~(-(-(i259 * 503))));
                            int i267 = (((-501) & i266) + (i266 | (-501))) - 1;
                            int i268 = ~i259;
                            int i269 = (i268 ^ iIntValue2) | (i268 & iIntValue2);
                            int i270 = ~i269;
                            int i271 = (i269 | i270) & i270;
                            int i272 = (i268 & 1) | (i259 & (-2));
                            int i273 = i259 & 1;
                            int i274 = ~((i272 ^ i273) | (i272 & i273));
                            int i275 = i271 ^ i274;
                            int i276 = i271 & i274;
                            int i277 = -(-(((i275 & i276) | (i275 ^ i276)) * (-502)));
                            int i278 = i267 & i277;
                            int i279 = ((i267 ^ i277) | i278) << 1;
                            int i280 = -((~i278) & (i277 | i267));
                            int i281 = (i279 & i280) + (i280 | i279);
                            int i282 = (i268 | i259) & i268;
                            int i283 = ~iIntValue2;
                            int i284 = i283 & (i283 | iIntValue2);
                            int i285 = i282 ^ i284;
                            int i286 = i282 & i284;
                            int i287 = (i286 & i285) | (i285 ^ i286);
                            int i288 = (i287 & (-2)) | ((~i287) & 1);
                            int i289 = i287 & 1;
                            int i290 = -(-((~((i289 & i288) | (i288 ^ i289))) * (-502)));
                            int i291 = ((((i281 ^ i290) | (i281 & i290)) << 1) - (~(-((i290 & (~i281)) | ((~i290) & i281))))) - 1;
                            int i292 = (-2) ^ iIntValue2;
                            int i293 = (-2) & iIntValue2;
                            int i294 = ~((i292 & i293) | (i292 ^ i293));
                            int i295 = -(-(((i294 & i268) | ((~i294) & i268) | ((~i268) & i294)) * 502));
                            int i296 = (i291 | i295) << 1;
                            int i297 = -((i295 & (~i291)) | ((~i295) & i291));
                            i259 = ((i296 | i297) << 1) - (i297 ^ i296);
                            int i298 = (i264 ^ 115) + ((i264 & 115) << 1);
                            f59834e = i298 % 128;
                            int i299 = i298 % 2;
                            b10 = -1;
                        }
                        bArrSliceArray = ArraysKt___ArraysJvmKt.plus(bArr6, bArr7);
                        int i300 = f59834e;
                        i14 = ((i300 | 121) << 1) - (i300 ^ 121);
                        f59833d = i14 % 128;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        byte[] bArr8 = setimagetintlist8.f59836b;
                        int i301 = -bArr8.length;
                        int i302 = i301 * 615;
                        int i303 = iIntValue2 * (-613);
                        int i304 = ((i302 | i303) << 1) - (i302 ^ i303);
                        int i305 = ~i301;
                        int i306 = i305 & iIntValue2;
                        int i307 = (~i306) & (i305 | iIntValue2);
                        int i308 = ~iIntValue2;
                        int i309 = ~((i307 & i306) | (i307 ^ i306));
                        int i310 = ((~i309) & iIntValue2) | (i309 & i308);
                        int i311 = i309 & iIntValue2;
                        int i312 = (i311 & i310) | (i310 ^ i311);
                        int i313 = i308 & i305;
                        int i314 = ~(((~i308) & i301) | i313 | (i308 & i301));
                        int i315 = ((~i312) & i314) | ((~i314) & i312);
                        int i316 = i312 & i314;
                        int i317 = -(-(((i315 & i316) | (i315 ^ i316)) * 614));
                        int i318 = i304 & i317;
                        int i319 = ((i317 | i304) & (~i318)) + (i318 << 1);
                        int i320 = ~((i305 ^ i308) | i313);
                        int i321 = ~(i306 | (i305 ^ iIntValue2));
                        int i322 = ((~i321) & i320) | ((~i320) & i321);
                        int i323 = i321 & i320;
                        int i324 = (i323 & i322) | (i322 ^ i323);
                        int i325 = ~((i308 ^ iIntValue2) | (i308 & iIntValue2));
                        int i326 = (i319 - (~(-(-(((i324 & i325) | (i324 ^ i325)) * (-1228)))))) - 1;
                        int i327 = (i308 | iIntValue2) & i308;
                        int i328 = i305 & i327;
                        int i329 = (i305 | i327) & (~i328);
                        int i330 = (i329 & i328) | (i329 ^ i328) | i308;
                        int i331 = ~i330;
                        int i332 = (i330 | i331) & i331;
                        int i333 = (i301 & i327) | (i327 ^ i301);
                        int i334 = ~((i333 & iIntValue2) | (i333 ^ iIntValue2));
                        int i335 = ((i334 & i332) | (i332 ^ i334)) * 614;
                        int i336 = (((i326 ^ i335) | (i326 & i335)) << 1) - (((~i326) & i335) | ((~i335) & i326));
                        byte[] bArr9 = new byte[i336];
                        int i337 = f59834e;
                        int i338 = ((i337 | 79) << 1) - (i337 ^ 79);
                        f59833d = i338 % 128;
                        int i339 = i338 % 2;
                        int i340 = 0;
                        while (i340 < i336) {
                            int i341 = f59833d;
                            int i342 = i341 & 51;
                            int i343 = -(-((i341 ^ 51) | i342));
                            int i344 = ((i342 | i343) << 1) - (i343 ^ i342);
                            f59834e = i344 % 128;
                            if (i344 % 2 == 0) {
                                bArr9[i340] = 0;
                            } else {
                                bArr9[i340] = 0;
                                i340 = ((i340 & 1) - (~(-(-(i340 | 1))))) - 1;
                            }
                        }
                        bArrSliceArray = ArraysKt___ArraysJvmKt.plus(bArr8, bArr9);
                        int i345 = f59833d + 97;
                        f59834e = i345 % 128;
                        int i346 = i345 % 2;
                        i13 = 2;
                        c10 = 1;
                        Object[] objArr4 = new Object[i13];
                        objArr4[0] = setimagetintlist8;
                        objArr4[c10] = bArrSliceArray;
                        setX(objArr4, -1398236510, 1398236511, System.identityHashCode(setimagetintlist8));
                        int i1415 = ~iIntValue2;
                        int i1416 = 1462422015 & i1415;
                        int i1417 = (1462422015 | i1415) & (~i1416);
                        int i1418 = ~((i1417 & i1416) | (i1417 ^ i1416));
                        int i1419 = (-1834204196) & i1415;
                        int i15110 = (iIntValue2 & 1834204195) | i1419;
                        int i15111 = (-1834204196) & iIntValue2;
                        int i15112 = ~((i15110 & i15111) | (i15110 ^ i15111));
                        int i15113 = i1418 & i15112;
                        int i15114 = (i1418 | i15112) & (~i15113);
                        int i15115 = ((i15114 & i15113) | (i15114 ^ i15113)) * ErrorCodes.ERR_CRY_IO_PROPERTIES;
                        int i15116 = (-80807571) ^ i15115;
                        int i15117 = ((((i15115 & (-80807571)) | i15116) << 1) - (~(-i15116))) - 1;
                        int i15118 = ((-1834204196) & (~i1415)) | (1834204195 & i1415);
                        int i15119 = (i15118 & i1419) | (i15118 ^ i1419);
                        int i16110 = i15119 & (-1462422016);
                        int i16111 = (i15119 | (-1462422016)) & (~i16110);
                        int i16112 = (i16111 & i16110) | (i16111 ^ i16110);
                        int i16113 = ~i16112;
                        int i16114 = (i16112 | i16113) & i16113;
                        int i16115 = ~((2138832383 & iIntValue2) | (2138832383 ^ iIntValue2));
                        int i16116 = i16114 & i16115;
                        int i16117 = -(-((((i16114 | i16115) & (~i16116)) | i16116) * ErrorCodes.ERR_CRY_IO_PROPERTIES));
                        int i16118 = ((i15117 ^ i16117) | (i15117 & i16117)) << 1;
                        int i16119 = -(((~i15117) & i16117) | ((~i16117) & i15117));
                        i15 = ((i16118 | i16119) << 1) - (i16119 ^ i16118);
                        int i17110 = (-537397003) ^ i1415;
                        int i17111 = (-537397003) & i1415;
                        int i17112 = ((i17111 & i17110) | (i17110 ^ i17111)) * (-369);
                        int i17113 = (1421728090 | i17112) << 1;
                        int i17114 = -((i17112 & (-1421728091)) | (1421728090 & (~i17112)));
                        int i17115 = (i17113 & i17114) + (i17114 | i17113);
                        int i17116 = (i1415 | iIntValue2) & i1415;
                        int i17117 = ((~i17116) & 2051852111) | (i17116 & (-2051852112));
                        int i17118 = i17116 & 2051852111;
                        int i17119 = ~((i17118 & i17117) | (i17117 ^ i17118));
                        int i18110 = 1533333733 & i17119;
                        int i18111 = (i17119 | 1533333733) & (~i18110);
                        int i18112 = ((i18111 & i18110) | (i18111 ^ i18110)) * (-369);
                        i16 = ((i17115 | i18112) << 1) - (i18112 ^ i17115);
                        int i18113 = ((-2051852112) & i1415) | (iIntValue2 & 2051852111);
                        int i18114 = (-2051852112) & iIntValue2;
                        int i18115 = (i18113 & i18114) | (i18113 ^ i18114);
                        int i18116 = ~i18115;
                        int i18117 = (i18115 | i18116) & i18116;
                        int i18118 = 1514455109 & i18117;
                        int i18119 = (i18117 | 1514455109) & (~i18118);
                        int i1917 = (i18119 & i18118) | (i18119 ^ i18118);
                        int i1918 = 2051852111 ^ i1415;
                        int i1919 = i1415 & 2051852111;
                        int i19110 = (i1919 & i1918) | (i1918 ^ i1919);
                        int i19111 = i19110 ^ 1533333733;
                        int i19112 = i19110 & 1533333733;
                        int i19113 = ~((i19112 & i19111) | (i19111 ^ i19112));
                        i17 = ((i19113 & i1917) | ((~i19113) & i1917) | ((~i1917) & i19113)) * 369;
                        i18 = i16 & i17;
                        if (i15 > (((i16 ^ i17) | i18) << 1) - ((i17 | i16) & (~i18))) {
                            return null;
                        }
                        throw null;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                int i347 = i14 % 2;
                i13 = 2;
                c10 = 1;
                Object[] objArr5 = new Object[i13];
                objArr5[0] = setimagetintlist8;
                objArr5[c10] = bArrSliceArray;
                setX(objArr5, -1398236510, 1398236511, System.identityHashCode(setimagetintlist8));
                int i14110 = ~iIntValue2;
                int i14111 = 1462422015 & i14110;
                int i14112 = (1462422015 | i14110) & (~i14111);
                int i14113 = ~((i14112 & i14111) | (i14112 ^ i14111));
                int i14114 = (-1834204196) & i14110;
                int i151110 = (iIntValue2 & 1834204195) | i14114;
                int i151111 = (-1834204196) & iIntValue2;
                int i151112 = ~((i151110 & i151111) | (i151110 ^ i151111));
                int i151113 = i14113 & i151112;
                int i151114 = (i14113 | i151112) & (~i151113);
                int i151115 = ((i151114 & i151113) | (i151114 ^ i151113)) * ErrorCodes.ERR_CRY_IO_PROPERTIES;
                int i151116 = (-80807571) ^ i151115;
                int i151117 = ((((i151115 & (-80807571)) | i151116) << 1) - (~(-i151116))) - 1;
                int i151118 = ((-1834204196) & (~i14110)) | (1834204195 & i14110);
                int i151119 = (i151118 & i14114) | (i151118 ^ i14114);
                int i161110 = i151119 & (-1462422016);
                int i161111 = (i151119 | (-1462422016)) & (~i161110);
                int i161112 = (i161111 & i161110) | (i161111 ^ i161110);
                int i161113 = ~i161112;
                int i161114 = (i161112 | i161113) & i161113;
                int i161115 = ~((2138832383 & iIntValue2) | (2138832383 ^ iIntValue2));
                int i161116 = i161114 & i161115;
                int i161117 = -(-((((i161114 | i161115) & (~i161116)) | i161116) * ErrorCodes.ERR_CRY_IO_PROPERTIES));
                int i161118 = ((i151117 ^ i161117) | (i151117 & i161117)) << 1;
                int i161119 = -(((~i151117) & i161117) | ((~i161117) & i151117));
                i15 = ((i161118 | i161119) << 1) - (i161119 ^ i161118);
                int i171110 = (-537397003) ^ i14110;
                int i171111 = (-537397003) & i14110;
                int i171112 = ((i171111 & i171110) | (i171110 ^ i171111)) * (-369);
                int i171113 = (1421728090 | i171112) << 1;
                int i171114 = -((i171112 & (-1421728091)) | (1421728090 & (~i171112)));
                int i171115 = (i171113 & i171114) + (i171114 | i171113);
                int i171116 = (i14110 | iIntValue2) & i14110;
                int i171117 = ((~i171116) & 2051852111) | (i171116 & (-2051852112));
                int i171118 = i171116 & 2051852111;
                int i171119 = ~((i171118 & i171117) | (i171117 ^ i171118));
                int i181110 = 1533333733 & i171119;
                int i181111 = (i171119 | 1533333733) & (~i181110);
                int i181112 = ((i181111 & i181110) | (i181111 ^ i181110)) * (-369);
                i16 = ((i171115 | i181112) << 1) - (i181112 ^ i171115);
                int i181113 = ((-2051852112) & i14110) | (iIntValue2 & 2051852111);
                int i181114 = (-2051852112) & iIntValue2;
                int i181115 = (i181113 & i181114) | (i181113 ^ i181114);
                int i181116 = ~i181115;
                int i181117 = (i181115 | i181116) & i181116;
                int i181118 = 1514455109 & i181117;
                int i181119 = (i181117 | 1514455109) & (~i181118);
                int i19114 = (i181119 & i181118) | (i181119 ^ i181118);
                int i19115 = 2051852111 ^ i14110;
                int i19116 = i14110 & 2051852111;
                int i19117 = (i19116 & i19115) | (i19115 ^ i19116);
                int i19118 = i19117 ^ 1533333733;
                int i19119 = i19117 & 1533333733;
                int i191110 = ~((i19119 & i19118) | (i19118 ^ i19119));
                i17 = ((i191110 & i19114) | ((~i191110) & i19114) | ((~i19114) & i191110)) * 369;
                i18 = i16 & i17;
                if (i15 > (((i16 ^ i17) | i18) << 1) - ((i17 | i16) & (~i18))) {
                    return null;
                }
                throw null;
        }
        return objValueOf;
    }

    public final void setCompoundDrawableTintBlendMode(int i10) {
        setX(new Object[]{this, Integer.valueOf(i10)}, -2003004454, 2003004454, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public byte[] setDividerPadding() {
        int i10 = f59833d;
        int i11 = i10 | 109;
        int i12 = (i11 << 1) - ((~(i10 & 109)) & i11);
        f59834e = i12 % 128;
        int i13 = 2;
        int i14 = i12 % 2;
        byte[] bArr = (byte[]) setX(new Object[]{this}, 827029685, -827029682, System.identityHashCode(this));
        setFindListener setfindlistener = this.f59835a;
        if (!((Boolean) setFindListener.setY(new Object[]{setfindlistener, bArr}, -2109739487, 2109739489, System.identityHashCode(setfindlistener))).booleanValue()) {
            new setOnHierarchyChangeListener(2005, null, i13, 0 == true ? 1 : 0);
            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
            StringBuilder sb2 = new StringBuilder("Failed to validate data format ");
            sb2.append((PinViewportDp) setFindListener.setY(new Object[]{setfindlistener}, -1552351757, 1552351757, System.identityHashCode(setfindlistener)));
            sb2.append(" with data = ");
            sb2.append((String) setInputExtras.setDividerPadding(new Object[]{this.f59836b}, 1609250238, -1609250236, (int) System.currentTimeMillis()));
            SouthPacificEndpoint.setX(new Object[]{sb2.toString()}, -1166612213, 1166612217, (int) System.currentTimeMillis());
            int i15 = f59833d + 97;
            f59834e = i15 % 128;
            int i16 = i15 % 2;
        }
        setFocusable setfocusable = this.f59837c;
        int length = this.f59836b.length;
        setFocusable.setOnFocusChangeListener(new Object[]{setfocusable, Integer.valueOf(length)}, 1283315027, -1283315018, length);
        ArrayList arrayList = new ArrayList();
        setFocusable setfocusable2 = this.f59837c;
        arrayList.add((byte[]) setFocusable.setOnFocusChangeListener(new Object[]{setfocusable2}, 1803955216, -1803955212, System.identityHashCode(setfocusable2)));
        arrayList.add((byte[]) setX(new Object[]{this}, -1317873722, 1317873728, System.identityHashCode(this)));
        byte[] bArr2 = (byte[]) setInputExtras.setDividerPadding(new Object[]{arrayList}, -822524174, 822524177, (int) System.currentTimeMillis());
        int i17 = f59834e;
        int i18 = i17 | 103;
        int i19 = (i18 << 1) - ((~(i17 & 103)) & i18);
        f59833d = i19 % 128;
        int i20 = i19 % 2;
        return bArr2;
    }

    public final boolean setOnDragListener() {
        return ((Boolean) setX(new Object[]{this}, -941568259, 941568266, System.identityHashCode(this))).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if ((r3 % 2 != 0) != false) goto L21;
     */
    @Override // com.mypinpad.tsdk.isolation.setLeftTopRightBottom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int setOnFocusChangeListener(@org.jetbrains.annotations.Nullable byte[] r10, int r11) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setImageTintList.setOnFocusChangeListener(byte[], int):int");
    }

    public final boolean setOnLongClickListener() {
        return ((Boolean) setX(new Object[]{this}, -146487729, 146487733, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final setFocusable setY() {
        return (setFocusable) setX(new Object[]{this}, 290021075, -290021067, System.identityHashCode(this));
    }

    @NotNull
    public String toString() {
        int i10 = f59833d;
        int i11 = ((i10 ^ 43) | (i10 & 43)) << 1;
        int i12 = -(((~i10) & 43) | (i10 & (-44)));
        int i13 = (i11 & i12) + (i12 | i11);
        f59834e = i13 % 128;
        int i14 = i13 % 2;
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i15 = f59833d + 75;
        f59834e = i15 % 128;
        if (i15 % 2 != 0) {
            return "";
        }
        throw null;
    }

    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setX(new Object[]{this}, -1317873722, 1317873728, System.identityHashCode(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setImageTintList(@NotNull setFindListener setfindlistener) {
        this(setfindlistener, new byte[0]);
        Intrinsics.checkNotNullParameter(setfindlistener, "");
    }

    @NotNull
    public final setFindListener setOnFocusChangeListener() {
        return (setFindListener) setX(new Object[]{this}, -352851471, 352851476, System.identityHashCode(this));
    }

    public final int setX() {
        return ((Integer) setX(new Object[]{this}, 1174276769, -1174276767, System.identityHashCode(this))).intValue();
    }

    public final void setX(@NotNull byte[] bArr) {
        setX(new Object[]{this, bArr}, -1398236510, 1398236511, System.identityHashCode(this));
    }
}
