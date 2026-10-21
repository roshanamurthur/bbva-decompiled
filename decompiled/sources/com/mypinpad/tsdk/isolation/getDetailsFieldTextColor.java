package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class getDetailsFieldTextColor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55770d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55771e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setScreenReaderFocusable f55772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final md f55773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final setTitleMarginTop f55774c;

    public getDetailsFieldTextColor(@NotNull setScreenReaderFocusable setscreenreaderfocusable, @NotNull md mdVar, @NotNull setTitleMarginTop settitlemargintop) {
        Intrinsics.checkNotNullParameter(setscreenreaderfocusable, "");
        Intrinsics.checkNotNullParameter(mdVar, "");
        Intrinsics.checkNotNullParameter(settitlemargintop, "");
        this.f55772a = setscreenreaderfocusable;
        this.f55773b = mdVar;
        this.f55774c = settitlemargintop;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 334) + (i10 * (-665));
        int i14 = ~i10;
        int i15 = (i14 * (-333)) + i13;
        int i16 = ~i12;
        int i17 = (((~(i14 | i12)) | (~(i11 | i16))) * 333) + (((~(i14 | i16)) | (~(i11 | i12))) * 333) + i15;
        boolean z10 = false;
        if (i17 == 1) {
            getDetailsFieldTextColor getdetailsfieldtextcolor = (getDetailsFieldTextColor) objArr[0];
            int i18 = f55771e + 73;
            f55770d = i18 % 128;
            int i19 = i18 % 2;
            setScreenReaderFocusable setscreenreaderfocusable = getdetailsfieldtextcolor.f55772a;
            if (i19 == 0) {
                return setscreenreaderfocusable;
            }
            int i20 = 38 / 0;
            return setscreenreaderfocusable;
        }
        if (i17 == 2) {
            getDetailsFieldTextColor getdetailsfieldtextcolor2 = (getDetailsFieldTextColor) objArr[0];
            int i21 = f55770d;
            int i22 = i21 & 53;
            int i23 = ((((i21 ^ 53) | i22) << 1) - (~(-((i21 | 53) & (~i22))))) - 1;
            f55771e = i23 % 128;
            int i24 = i23 % 2;
            int iHashCode = getdetailsfieldtextcolor2.f55772a.hashCode();
            int i25 = iHashCode * 31;
            int iHashCode2 = getdetailsfieldtextcolor2.f55773b.hashCode();
            int iIdentityHashCode = System.identityHashCode(getdetailsfieldtextcolor2);
            int i26 = (iHashCode * 9889) + (iHashCode2 * (-317));
            int i27 = ~iHashCode2;
            int i28 = ~i25;
            int i29 = ~i25;
            int i30 = (i29 | i25) & i28;
            int i31 = i27 & i30;
            int i32 = (i30 | i27) & (~i31);
            int i33 = (i32 & i31) | (i32 ^ i31);
            int i34 = ~((i33 & iIdentityHashCode) | (i33 ^ iIdentityHashCode));
            int i35 = (~iIdentityHashCode) & ((~iIdentityHashCode) | iIdentityHashCode);
            int i36 = i35 & iHashCode2;
            int i37 = (i35 | iHashCode2) & (~i36);
            int i38 = (i37 & i36) | (i37 ^ i36);
            int i39 = i38 & i25;
            int i40 = (i25 | i38) & (~i39);
            int i41 = (i40 & i39) | (i40 ^ i39);
            int i42 = (i41 | (~i41)) & (~i41);
            int i43 = ((~i42) & i34) | ((~i34) & i42);
            int i44 = i42 & i34;
            int i45 = ((i44 & i43) | (i43 ^ i44)) * (-318);
            int i46 = i26 & i45;
            int i47 = ((((i26 ^ i45) | i46) << 1) - (~(-((i26 | i45) & (~i46))))) - 1;
            int i48 = i28 ^ iHashCode2;
            int i49 = i28 & iHashCode2;
            int i50 = ~((i48 & i49) | (i48 ^ i49));
            int i51 = iHashCode2 & iIdentityHashCode;
            int i52 = (~i51) & (iHashCode2 | iIdentityHashCode);
            int i53 = ~((i51 & i52) | (i52 ^ i51));
            int i54 = -(-(((i50 & i53) | ((~i53) & i50) | ((~i50) & i53)) * (-318)));
            int i55 = (((~i54) & i47) | ((~i47) & i54)) + ((i54 & i47) << 1);
            int i56 = (~iHashCode2) & (iHashCode2 | i27);
            int i57 = i56 & iIdentityHashCode;
            int i58 = (i56 | iIdentityHashCode) & (~i57);
            int i59 = ~((i58 & i57) | (i58 ^ i57));
            int i60 = i29 ^ i59;
            int i61 = i59 & i29;
            int i62 = (i55 - (~(-(-(((i61 & i60) | (i60 ^ i61)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))))) - 1;
            int i63 = i62 * 31;
            int iHashCode3 = getdetailsfieldtextcolor2.f55774c.hashCode();
            int iIdentityHashCode2 = System.identityHashCode(getdetailsfieldtextcolor2);
            int i64 = iHashCode3 * (-300);
            int i65 = -(-(i62 * 9362));
            int i66 = i64 & i65;
            int i67 = ((i65 | i64) & (~i66)) + (i66 << 1);
            int i68 = (iHashCode3 ^ i63) | (iHashCode3 & i63);
            int i69 = (i68 & iIdentityHashCode2) | (i68 ^ iIdentityHashCode2);
            int i70 = ((i69 | (~i69)) & (~i69)) * (-301);
            int i71 = i67 ^ i70;
            int i72 = ((((i67 & i70) | i71) << 1) - (~(-i71))) - 1;
            int i73 = ~i63;
            int i74 = (~i63) | i63;
            int i75 = i73 & i74;
            int i76 = i75 & iIdentityHashCode2;
            int i77 = (i75 | iIdentityHashCode2) & (~i76);
            int i78 = ~((i77 & i76) | (i77 ^ i76));
            int i79 = ~iIdentityHashCode2;
            int i80 = ~iHashCode3;
            int i81 = (i79 & i80) | ((~i79) & iHashCode3);
            int i82 = i79 & iHashCode3;
            int i83 = ~((i82 & i81) | (i81 ^ i82));
            int i84 = i78 & i83;
            int i85 = (i78 | i83) & (~i84);
            int i86 = -(~(((i85 & i84) | (i85 ^ i84)) * (-301)));
            int i87 = ((i72 ^ i86) + ((i72 & i86) << 1)) - 1;
            int i88 = (~i63) & i74;
            int i89 = (~iHashCode3) & (i80 | iHashCode3);
            int i90 = ~((iIdentityHashCode2 & i89) | (i89 ^ iIdentityHashCode2));
            int i91 = i88 & i90;
            int i92 = (i90 | i88) & (~i91);
            int i93 = -(-(((i92 & i91) | (i92 ^ i91)) * 301));
            int i94 = (i87 & i93) + (i93 | i87);
            int i95 = f55771e + 125;
            f55770d = i95 % 128;
            int i96 = i95 % 2;
            return Integer.valueOf(i94);
        }
        if (i17 == 3) {
            getDetailsFieldTextColor getdetailsfieldtextcolor3 = (getDetailsFieldTextColor) objArr[0];
            int i97 = f55771e;
            int i98 = (i97 ^ 115) + ((i97 & 115) << 1);
            f55770d = i98 % 128;
            int i99 = i98 % 2;
            setTitleMarginTop settitlemargintop = getdetailsfieldtextcolor3.f55774c;
            if (i99 != 0) {
                throw null;
            }
            int i100 = (-2) - (((i97 ^ 18) + ((i97 & 18) << 1)) ^ (-1));
            f55770d = i100 % 128;
            int i101 = i100 % 2;
            return settitlemargintop;
        }
        if (i17 == 4) {
            int i102 = f55771e;
            int i103 = i102 | 105;
            int i104 = i103 << 1;
            int i105 = -(i103 & (~(i102 & 105)));
            int i106 = (i104 ^ i105) + ((i105 & i104) << 1);
            f55770d = i106 % 128;
            int i107 = i106 % 2;
            int i108 = (i102 ^ 47) + ((i102 & 47) << 1);
            f55770d = i108 % 128;
            int i109 = i108 % 2;
            return "CSR";
        }
        if (i17 != 5) {
            getDetailsFieldTextColor getdetailsfieldtextcolor4 = (getDetailsFieldTextColor) objArr[0];
            int i110 = f55770d;
            int i111 = i110 & 37;
            int i112 = ((i110 ^ 37) | i111) << 1;
            int i113 = -((i110 | 37) & (~i111));
            int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
            f55771e = i114 % 128;
            int i115 = i114 % 2;
            md mdVar = getdetailsfieldtextcolor4.f55773b;
            if (i115 != 0) {
                return mdVar;
            }
            throw null;
        }
        Boolean bool = Boolean.FALSE;
        getDetailsFieldTextColor getdetailsfieldtextcolor5 = (getDetailsFieldTextColor) objArr[0];
        Object obj = objArr[1];
        int i116 = f55770d;
        int i117 = i116 & 29;
        int i118 = ((i116 ^ 29) | i117) << 1;
        int i119 = -((~i117) & (i116 | 29));
        int i120 = (i118 & i119) + (i118 | i119);
        int i121 = i120 % 128;
        f55771e = i121;
        if (i120 % 2 == 0) {
            throw null;
        }
        if (getdetailsfieldtextcolor5 != obj) {
            if (obj instanceof getDetailsFieldTextColor) {
                getDetailsFieldTextColor getdetailsfieldtextcolor6 = (getDetailsFieldTextColor) obj;
                if (!Intrinsics.areEqual(getdetailsfieldtextcolor5.f55772a, getdetailsfieldtextcolor6.f55772a)) {
                    int i122 = f55771e;
                    int i123 = i122 & 79;
                    int i124 = -(-((i122 ^ 79) | i123));
                    int i125 = ((i123 | i124) << 1) - (i124 ^ i123);
                    int i126 = i125 % 128;
                    f55770d = i126;
                    z10 = i125 % 2 != 0;
                    int i127 = i126 & 45;
                    int i128 = -(-((i126 ^ 45) | i127));
                    int i129 = ((i127 | i128) << 1) - (i128 ^ i127);
                    f55771e = i129 % 128;
                    if (i129 % 2 == 0) {
                        throw null;
                    }
                } else if (getdetailsfieldtextcolor5.f55773b != getdetailsfieldtextcolor6.f55773b) {
                    int i130 = f55771e;
                    int i131 = i130 & 103;
                    int i132 = -(-((i130 ^ 103) | i131));
                    int i133 = (i131 ^ i132) + ((i132 & i131) << 1);
                    f55770d = i133 % 128;
                    int i134 = i133 % 2;
                } else if (Intrinsics.areEqual(getdetailsfieldtextcolor5.f55774c, getdetailsfieldtextcolor6.f55774c)) {
                    int i135 = f55771e;
                    int i136 = ((i135 | 89) << 1) - (i135 ^ 89);
                    f55770d = i136 % 128;
                    if (i136 % 2 != 0) {
                        int i137 = 7 / 0;
                    }
                } else {
                    int i138 = f55770d + 33;
                    f55771e = i138 % 128;
                    if (i138 % 2 == 0) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            }
            int i139 = i116 + 69;
            f55771e = i139 % 128;
            int i140 = i139 % 2;
            int i141 = i116 & 125;
            int i142 = ((~i141) & (i116 | 125)) + (i141 << 1);
            f55771e = i142 % 128;
            int i143 = i142 % 2;
            return bool;
        }
        int i144 = (i121 ^ 83) + ((i121 & 83) << 1);
        int i145 = i144 % 128;
        f55770d = i145;
        int i146 = i144 % 2;
        int i147 = i145 & 113;
        int i148 = ((((i145 ^ 113) | i147) << 1) - (~(-((i145 | 113) & (~i147))))) - 1;
        f55771e = i148 % 128;
        int i149 = i148 % 2;
        return Boolean.TRUE;
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, 689378298, -689378293, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, 782571335, -782571333, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final md setDividerPadding() {
        return (md) setX(new Object[]{this}, 1592202006, -1592202006, System.identityHashCode(this));
    }

    @NotNull
    public final setScreenReaderFocusable setOnFocusChangeListener() {
        return (setScreenReaderFocusable) setX(new Object[]{this}, -321474626, 321474627, System.identityHashCode(this));
    }

    @NotNull
    public final setTitleMarginTop setY() {
        return (setTitleMarginTop) setX(new Object[]{this}, 870510485, -870510482, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, -1376221536, 1376221540, System.identityHashCode(this));
    }
}
