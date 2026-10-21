package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setGroupIndicator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f59761g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f59762h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<getAmount> f59763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<PinPadConfiguration> f59764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<component4> f59765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<setOutlineSpotShadowColor> f59766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<setTextFilterEnabled> f59767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final component7 f59768f;

    public setGroupIndicator(@NotNull List<getAmount> list, @NotNull List<PinPadConfiguration> list2, @NotNull List<component4> list3, @NotNull List<setOutlineSpotShadowColor> list4, @NotNull List<setTextFilterEnabled> list5, @NotNull component7 component7Var) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(component7Var, "");
        this.f59763a = list;
        this.f59764b = list2;
        this.f59765c = list3;
        this.f59766d = list4;
        this.f59767e = list5;
        this.f59768f = component7Var;
        component2.setX(new Object[]{list2}, 1124287968, -1124287945, (int) System.currentTimeMillis());
        component2.setX(new Object[]{component7Var}, 783066561, -783066533, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Boolean a(Object[] objArr) {
        boolean z10;
        setGroupIndicator setgroupindicator = (setGroupIndicator) objArr[0];
        Object obj = objArr[1];
        int i10 = f59761g;
        int i11 = (i10 ^ 97) + ((i10 & 97) << 1);
        int i12 = i11 % 128;
        f59762h = i12;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (setgroupindicator == obj) {
            int i13 = (i12 ^ 73) + ((i12 & 73) << 1);
            f59761g = i13 % 128;
            int i14 = i13 % 2;
            return Boolean.TRUE;
        }
        if (!(obj instanceof setGroupIndicator)) {
            int i15 = ((i10 ^ 3) - (~(-(-((i10 & 3) << 1))))) - 1;
            f59762h = i15 % 128;
            int i16 = i15 % 2;
            int i17 = i10 & 115;
            int i18 = (i10 ^ 115) | i17;
            int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
            f59762h = i19 % 128;
            if (i19 % 2 != 0) {
                return Boolean.FALSE;
            }
            throw null;
        }
        setGroupIndicator setgroupindicator2 = (setGroupIndicator) obj;
        if (!Intrinsics.areEqual(setgroupindicator.f59763a, setgroupindicator2.f59763a)) {
            int i20 = f59761g;
            int i21 = i20 + 57;
            f59762h = i21 % 128;
            int i22 = i21 % 2;
            int i23 = i20 & 57;
            int i24 = ((i20 ^ 57) | i23) << 1;
            int i25 = -((i20 | 57) & (~i23));
            int i26 = (i24 & i25) + (i25 | i24);
            f59762h = i26 % 128;
            if (i26 % 2 != 0) {
                return Boolean.FALSE;
            }
            int i27 = 95 / 0;
            return Boolean.FALSE;
        }
        if (!Intrinsics.areEqual(setgroupindicator.f59764b, setgroupindicator2.f59764b)) {
            int i28 = f59762h + 89;
            f59761g = i28 % 128;
            return Boolean.valueOf(i28 % 2 != 0);
        }
        if (!Intrinsics.areEqual(setgroupindicator.f59765c, setgroupindicator2.f59765c)) {
            int i29 = f59761g;
            int i30 = i29 & 53;
            int i31 = (((i29 ^ 53) | i30) << 1) - ((~i30) & (i29 | 53));
            f59762h = i31 % 128;
            z10 = i31 % 2 == 0;
            int i32 = (i29 ^ 63) + ((i29 & 63) << 1);
            f59762h = i32 % 128;
            if (i32 % 2 != 0) {
                return Boolean.valueOf(z10);
            }
            throw null;
        }
        if (!Intrinsics.areEqual(setgroupindicator.f59766d, setgroupindicator2.f59766d)) {
            int i33 = f59761g;
            int i34 = (i33 ^ 27) + ((i33 & 27) << 1);
            f59762h = i34 % 128;
            return Boolean.valueOf(i34 % 2 == 0);
        }
        if (!Intrinsics.areEqual(setgroupindicator.f59767e, setgroupindicator2.f59767e)) {
            int i35 = f59761g;
            int i36 = ((i35 | 49) << 1) - (i35 ^ 49);
            f59762h = i36 % 128;
            z10 = i36 % 2 == 0;
            int i37 = (i35 ^ 103) + ((i35 & 103) << 1);
            f59762h = i37 % 128;
            if (i37 % 2 != 0) {
                return Boolean.valueOf(z10);
            }
            throw null;
        }
        if (!(!Intrinsics.areEqual(setgroupindicator.f59768f, setgroupindicator2.f59768f))) {
            int i38 = f59762h;
            int i39 = (-2) - (((i38 ^ 116) + ((i38 & 116) << 1)) ^ (-1));
            f59761g = i39 % 128;
            if (i39 % 2 == 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
        int i40 = f59761g;
        int i41 = i40 & 105;
        int i42 = ((i40 | 105) & (~i41)) + (i41 << 1);
        int i43 = i42 % 128;
        f59762h = i43;
        z10 = i42 % 2 == 0;
        int i44 = i43 + 39;
        f59761g = i44 % 128;
        int i45 = i44 % 2;
        return Boolean.valueOf(z10);
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 965) + ((i10 * (-963)) - 964);
        int i14 = ~i10;
        int i15 = ~i11;
        switch ((((~(i10 | i15)) | (~((~i12) | i15))) * (-964)) + ((i14 | (~(i15 | i12))) * (-964)) + i13) {
            case 1:
                setGroupIndicator setgroupindicator = (setGroupIndicator) objArr[0];
                int i16 = f59762h + 71;
                int i17 = i16 % 128;
                f59761g = i17;
                int i18 = i16 % 2;
                List<getAmount> list = setgroupindicator.f59763a;
                int i19 = ((i17 | 1) << 1) - (i17 ^ 1);
                f59762h = i19 % 128;
                if (i19 % 2 != 0) {
                    return list;
                }
                throw null;
            case 2:
                setGroupIndicator setgroupindicator2 = (setGroupIndicator) objArr[0];
                int i20 = f59762h;
                int i21 = i20 + 39;
                f59761g = i21 % 128;
                int i22 = i21 % 2;
                List<setOutlineSpotShadowColor> list2 = setgroupindicator2.f59766d;
                if (i22 != 0) {
                    int i23 = 79 / 0;
                }
                int i24 = i20 + 9;
                f59761g = i24 % 128;
                int i25 = i24 % 2;
                return list2;
            case 3:
                setGroupIndicator setgroupindicator3 = (setGroupIndicator) objArr[0];
                int i26 = f59761g;
                int i27 = i26 ^ 107;
                int i28 = ((i26 & 107) | i27) << 1;
                int i29 = -i27;
                int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
                int i31 = i30 % 128;
                f59762h = i31;
                int i32 = i30 % 2;
                component7 component7Var = setgroupindicator3.f59768f;
                int i33 = i31 & 41;
                int i34 = i31 | 41;
                int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                f59761g = i35 % 128;
                int i36 = i35 % 2;
                return component7Var;
            case 4:
                return a(objArr);
            case 5:
                setGroupIndicator setgroupindicator4 = (setGroupIndicator) objArr[0];
                int i37 = f59762h;
                int i38 = i37 & 115;
                int i39 = (i37 | 115) & (~i38);
                int i40 = i38 << 1;
                int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
                int i42 = i41 % 128;
                f59761g = i42;
                int i43 = i41 % 2;
                List<PinPadConfiguration> list3 = setgroupindicator4.f59764b;
                if (i43 != 0) {
                    throw null;
                }
                int i44 = i42 | 69;
                int i45 = (i44 << 1) - ((~(i42 & 69)) & i44);
                f59762h = i45 % 128;
                int i46 = i45 % 2;
                return list3;
            case 6:
                int i47 = f59761g;
                int i48 = (-2) - (((i47 & 96) + (i47 | 96)) ^ (-1));
                f59762h = i48 % 128;
                int i49 = i48 % 2;
                int i50 = i47 + 93;
                f59762h = i50 % 128;
                if (i50 % 2 != 0) {
                    return "ETCD";
                }
                throw null;
            case 7:
                setGroupIndicator setgroupindicator5 = (setGroupIndicator) objArr[0];
                int i51 = f59762h;
                int i52 = (((i51 | 58) << 1) - (i51 ^ 58)) - 1;
                f59761g = i52 % 128;
                int i53 = i52 % 2;
                List<setTextFilterEnabled> list4 = setgroupindicator5.f59767e;
                int i54 = ((i51 | 105) << 1) - (i51 ^ 105);
                f59761g = i54 % 128;
                if (i54 % 2 == 0) {
                    return list4;
                }
                throw null;
            case 8:
                setGroupIndicator setgroupindicator6 = (setGroupIndicator) objArr[0];
                int i55 = f59762h;
                int i56 = ((i55 | 17) << 1) - (i55 ^ 17);
                f59761g = i56 % 128;
                int i57 = i56 % 2;
                List<component4> list5 = setgroupindicator6.f59765c;
                if (i57 == 0) {
                    return list5;
                }
                throw null;
            default:
                setGroupIndicator setgroupindicator7 = (setGroupIndicator) objArr[0];
                int i58 = f59761g;
                int i59 = ((i58 & (-64)) | ((~i58) & 63)) + ((i58 & 63) << 1);
                f59762h = i59 % 128;
                int i60 = i59 % 2;
                int iHashCode = setgroupindicator7.f59763a.hashCode();
                int i61 = iHashCode * 31;
                int iHashCode2 = setgroupindicator7.f59764b.hashCode();
                int iIdentityHashCode = System.identityHashCode(setgroupindicator7);
                int i62 = ((iHashCode2 * 253) - (~(-(~(-(-(iHashCode * 7843))))))) - 2;
                int i63 = ~iHashCode2;
                int i64 = ~i61;
                int i65 = i63 & i64;
                int i66 = (i63 | i64) & (~i65);
                int i67 = ~((i66 & i65) | (i66 ^ i65));
                int i68 = ~iIdentityHashCode;
                int i69 = i64 & i68;
                int i70 = (~i69) & (i64 | i68);
                int i71 = ~((i69 & i70) | (i70 ^ i69));
                int i72 = i67 & i71;
                int i73 = (i67 | i71) & (~i72);
                int i74 = (i73 & i72) | (i73 ^ i72);
                int i75 = iHashCode2 & i61;
                int i76 = (iHashCode2 ^ i61) | i75;
                int i77 = (i76 & i68) | ((~i76) & iIdentityHashCode);
                int i78 = i76 & iIdentityHashCode;
                int i79 = ~((i78 & i77) | (i77 ^ i78));
                int i80 = i74 ^ i79;
                int i81 = i74 & i79;
                int i82 = ((i81 & i80) | (i80 ^ i81)) * (-252);
                int i83 = (i62 & i82) + (i82 | i62);
                int i84 = (~i75) & (i61 | iHashCode2);
                int i85 = -(-(((i84 ^ i75) | (i84 & i75)) * (-252)));
                int i86 = i83 ^ i85;
                int i87 = ((i85 & i83) | i86) << 1;
                int i88 = -i86;
                int i89 = ((i87 | i88) << 1) - (i87 ^ i88);
                int i90 = (i68 | iIdentityHashCode) & i68;
                int i91 = (i90 & i64) | (i64 ^ i90);
                int i92 = ~((i91 & iHashCode2) | (i91 ^ iHashCode2));
                int i93 = i84 | i75;
                int i94 = ~((i93 & iIdentityHashCode) | (i93 ^ iIdentityHashCode));
                int i95 = i92 ^ i94;
                int i96 = i94 & i92;
                int i97 = ((i96 & i95) | (i95 ^ i96)) * 252;
                int i98 = ((i89 ^ i97) | (i89 & i97)) << 1;
                int i99 = -((i97 & (~i89)) | ((~i97) & i89));
                int i100 = ((i98 ^ i99) + ((i99 & i98) << 1)) * 31;
                int i101 = -(-setgroupindicator7.f59765c.hashCode());
                int i102 = ((i100 ^ i101) - (~(-(-((i101 & i100) << 1))))) - 1;
                int i103 = i102 * 31;
                int iHashCode3 = setgroupindicator7.f59766d.hashCode();
                int iIdentityHashCode2 = System.identityHashCode(setgroupindicator7);
                int i104 = iHashCode3 * 398;
                int i105 = i102 * (-12276);
                int i106 = i104 & i105;
                int i107 = i106 + ((i105 ^ i104) | i106);
                int i108 = ~iHashCode3;
                int i109 = (i108 | iHashCode3) & i108;
                int i110 = ~iIdentityHashCode2;
                int i111 = i110 & (i110 | iIdentityHashCode2);
                int i112 = i109 ^ i111;
                int i113 = i109 & i111;
                int i114 = (i112 & i113) | (i112 ^ i113);
                int i115 = ~i114;
                int i116 = (i114 | i115) & i115;
                int i117 = ~i103;
                int i118 = (i108 & i117) | ((~i108) & i103);
                int i119 = i108 & i103;
                int i120 = (i119 & i118) | (i118 ^ i119);
                int i121 = ~i120;
                int i122 = (i120 | i121) & i121;
                int i123 = (i122 & i116) | (i116 ^ i122);
                int i124 = i111 & i103;
                int i125 = (i111 | i103) & (~i124);
                int i126 = ~((i125 & i124) | (i125 ^ i124));
                int i127 = -(-(((i123 & i126) | (i123 ^ i126)) * (-397)));
                int i128 = (i107 ^ i127) + ((i127 & i107) << 1);
                int i129 = (i109 & i117) | ((~i109) & i103);
                int i130 = i109 & i103;
                int i131 = (i128 - (~(-(-((~((i129 & i130) | (i129 ^ i130))) * (-397)))))) - 1;
                int i132 = i103 ^ i109;
                int i133 = (i132 & i130) | (i132 ^ i130);
                int i134 = ~i133;
                int i135 = (i133 | i134) & i134;
                int i136 = iIdentityHashCode2 & i135;
                int i137 = ((i135 | iIdentityHashCode2) & (~i136)) | i136;
                int i138 = (i117 ^ iHashCode3) | (iHashCode3 & i117);
                int i139 = ~i138;
                int i140 = (i138 | i139) & i139;
                int i141 = i137 ^ i140;
                int i142 = i137 & i140;
                int i143 = -(-(((i142 & i141) | (i141 ^ i142)) * 397));
                int i144 = ((~i143) & i131) | ((~i131) & i143);
                int i145 = -(-((i143 & i131) << 1));
                int i146 = (((i144 | i145) << 1) - (i145 ^ i144)) * 31;
                int i147 = -(-setgroupindicator7.f59767e.hashCode());
                int i148 = ((i146 | i147) << 1) - (i147 ^ i146);
                int i149 = i148 * 31;
                int iHashCode4 = setgroupindicator7.f59768f.hashCode();
                int iIdentityHashCode3 = System.identityHashCode(setgroupindicator7);
                int i150 = iHashCode4 * 567;
                int i151 = i148 * (-17515);
                int i152 = i150 & i151;
                int i153 = (i151 | i150) & (~i152);
                int i154 = -(-(i152 << 1));
                int i155 = (i153 ^ i154) + ((i153 & i154) << 1);
                int i156 = ~iHashCode4;
                int i157 = ~((i156 ^ i149) | (i156 & i149));
                int i158 = i156 ^ iIdentityHashCode3;
                int i159 = i156 & iIdentityHashCode3;
                int i160 = (i158 & i159) | (i158 ^ i159);
                int i161 = ~i160;
                int i162 = (i160 | i161) & i161;
                int i163 = ((~i162) & i157) | ((~i157) & i162);
                int i164 = i157 & i162;
                int i165 = -(~(((i164 & i163) | (i163 ^ i164)) * (-566)));
                int i166 = (i155 & i165) + (i165 | i155);
                int i167 = (i166 ^ (-1)) + (i166 << 1);
                int i168 = ~i149;
                int i169 = i168 & i156;
                int i170 = ~i168;
                int i171 = (iHashCode4 & i170) | i169;
                int i172 = iHashCode4 & i168;
                int i173 = -(-((~((i172 & i171) | (i171 ^ i172))) * 566));
                int i174 = ((i167 ^ i173) | (i167 & i173)) << 1;
                int i175 = -((i173 & (~i167)) | ((~i173) & i167));
                int i176 = (i174 & i175) + (i175 | i174);
                int i177 = (i168 & (~i156)) | (i156 & i170);
                int i178 = (i177 & i169) | (i177 ^ i169);
                int i179 = (~((iIdentityHashCode3 & i178) | ((~iIdentityHashCode3) & i178) | ((~i178) & iIdentityHashCode3))) * 566;
                int i180 = ((~i179) & i176) | ((~i176) & i179);
                int i181 = (i179 & i176) << 1;
                int i182 = (i180 ^ i181) + ((i181 & i180) << 1);
                int i183 = f59762h;
                int i184 = (-2) - (((i183 & 20) + (i183 | 20)) ^ (-1));
                f59761g = i184 % 128;
                int i185 = i184 % 2;
                return Integer.valueOf(i182);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 721900884, -721900880, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1833917281, -1833917281, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final List<component4> setCompoundDrawableTintBlendMode() {
        return (List) setDividerPadding(new Object[]{this}, 28329434, -28329426, System.identityHashCode(this));
    }

    @NotNull
    public final component7 setLayoutAnimation() {
        return (component7) setDividerPadding(new Object[]{this}, 2001311321, -2001311318, System.identityHashCode(this));
    }

    @NotNull
    public final List<setTextFilterEnabled> setOnFocusChangeListener() {
        return (List) setDividerPadding(new Object[]{this}, -1229679799, 1229679806, System.identityHashCode(this));
    }

    @NotNull
    public final List<setOutlineSpotShadowColor> setX() {
        return (List) setDividerPadding(new Object[]{this}, 359911588, -359911586, System.identityHashCode(this));
    }

    @NotNull
    public final List<PinPadConfiguration> setY() {
        return (List) setDividerPadding(new Object[]{this}, 62049690, -62049685, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setDividerPadding(new Object[]{this}, -625285739, 625285745, System.identityHashCode(this));
    }

    @NotNull
    public final List<getAmount> setDividerPadding() {
        return (List) setDividerPadding(new Object[]{this}, -993618938, 993618939, System.identityHashCode(this));
    }
}
