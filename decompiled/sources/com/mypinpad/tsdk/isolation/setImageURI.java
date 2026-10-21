package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setImageURI {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59838c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f59839d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setMax f59840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setFontFeatureSettings f59841b;

    public setImageURI(@NotNull setMax setmax, @NotNull setFontFeatureSettings setfontfeaturesettings) {
        Intrinsics.checkNotNullParameter(setmax, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        this.f59840a = setmax;
        this.f59841b = setfontfeaturesettings;
    }

    public static /* synthetic */ setImageURI setOnFocusChangeListener(setImageURI setimageuri, setFontFeatureSettings setfontfeaturesettings) {
        return (setImageURI) setX(new Object[]{setimageuri, setfontfeaturesettings}, -1897769378, 1897769381, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        switch ((((~(i10 | i12)) | (~(i11 | i14))) * 950) + (((~(i14 | i10)) | (~(i11 | i12))) * (-950)) + (((~(i13 | i14)) | (~((~i10) | i12))) * ReturnCode.ERR_REPOSITORY) + (i11 * (-949)) + (i10 * (-949))) {
            case 1:
                int i15 = f59838c;
                int i16 = i15 & 67;
                int i17 = -(-((i15 ^ 67) | i16));
                int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
                f59839d = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = 70 / 0;
                }
                int i20 = i15 ^ 9;
                int i21 = -(-((i15 & 9) << 1));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                f59839d = i22 % 128;
                if (i22 % 2 == 0) {
                    int i23 = 84 / 0;
                }
                return "PPC";
            case 2:
                setImageURI setimageuri = (setImageURI) objArr[0];
                Object obj = objArr[1];
                int i24 = f59839d;
                int i25 = i24 & 71;
                int i26 = (~i25) & (i24 | 71);
                int i27 = i25 << 1;
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                int i29 = i28 % 128;
                f59838c = i29;
                if (i28 % 2 != 0) {
                    throw null;
                }
                if (setimageuri != obj) {
                    if (!(obj instanceof setImageURI)) {
                        int i30 = (i24 ^ 11) + ((i24 & 11) << 1);
                        f59838c = i30 % 128;
                        int i31 = i30 % 2;
                        int iIdentityHashCode = System.identityHashCode(setimageuri);
                        int i32 = 2051490127 & iIdentityHashCode;
                        int i33 = (~i32) & (2051490127 | iIdentityHashCode);
                        int i34 = ~((i32 & i33) | (i33 ^ i32));
                        int i35 = ~iIdentityHashCode;
                        int i36 = ~i35;
                        int i37 = (i35 & 351305228) | ((-351305229) & i36) | (i35 & (-351305229));
                        int i38 = ~i37;
                        int i39 = (i37 | i38) & i38;
                        int i40 = i34 & i39;
                        int i41 = (i34 | i39) & (~i40);
                        int i42 = ((i41 & i40) | (i41 ^ i40)) * (-1808);
                        int i43 = (-1771652085) ^ i42;
                        int i44 = ((((i42 & (-1771652085)) | i43) << 1) - (~(-i43))) - 1;
                        int i45 = (2130149199 & i35) | ((-2130149200) & iIdentityHashCode);
                        int i46 = 2130149199 & iIdentityHashCode;
                        int i47 = (i46 & i45) | (i45 ^ i46);
                        int i48 = ~i47;
                        int i49 = (i47 | i48) & i48;
                        int i50 = (2051490127 & i35) | (i36 & (-2051490128));
                        int i51 = i35 & (-2051490128);
                        int i52 = (i50 & i51) | (i50 ^ i51);
                        int i53 = i52 & (-351305229);
                        int i54 = ~(((i52 | (-351305229)) & (~i53)) | i53);
                        int i55 = ((i54 & i49) | ((~i54) & i49) | ((~i49) & i54)) * 904;
                        int i56 = i44 & i55;
                        int i57 = (i56 - (~((i55 ^ i44) | i56))) - 1;
                        int i58 = 351305228 & iIdentityHashCode;
                        int i59 = (iIdentityHashCode | 351305228) & (~i58);
                        int i60 = ~((i59 & i58) | (i59 ^ i58));
                        int i61 = 78659072 & i60;
                        int i62 = (i60 | 78659072) & (~i61);
                        int i63 = (i62 & i61) | (i62 ^ i61);
                        int i64 = ~(i35 | (-2051490128));
                        int i65 = ((~i64) & i63) | ((~i63) & i64);
                        int i66 = i63 & i64;
                        int i67 = ((i66 & i65) | (i65 ^ i66)) * 904;
                        int i68 = i57 & i67;
                        int i69 = i68 + ((i67 ^ i57) | i68);
                        System.identityHashCode(setimageuri);
                        if (i69 <= -768678472) {
                            int i70 = 96 / 0;
                        }
                    } else {
                        setImageURI setimageuri2 = (setImageURI) obj;
                        if (!Intrinsics.areEqual(setimageuri.f59840a, setimageuri2.f59840a)) {
                            int i71 = f59839d;
                            int i72 = ((i71 & 85) - (~(-(-(i71 | 85))))) - 1;
                            f59838c = i72 % 128;
                            int i73 = i72 % 2;
                            int i74 = i71 & 57;
                            int i75 = i74 + ((i71 ^ 57) | i74);
                            f59838c = i75 % 128;
                            if (i75 % 2 != 0) {
                                throw null;
                            }
                        } else if (Intrinsics.areEqual(setimageuri.f59841b, setimageuri2.f59841b)) {
                            int i76 = f59838c;
                            int i77 = i76 & 99;
                            int i78 = -(-((i76 ^ 99) | i77));
                            int i79 = (i77 & i78) + (i78 | i77);
                            f59839d = i79 % 128;
                            int i80 = i79 % 2;
                        } else {
                            int i81 = f59839d;
                            int i82 = ((i81 ^ 95) | (i81 & 95)) << 1;
                            int i83 = -(((~i81) & 95) | (i81 & (-96)));
                            int i84 = ((i82 | i83) << 1) - (i83 ^ i82);
                            int i85 = i84 % 128;
                            f59838c = i85;
                            int i86 = i84 % 2;
                            int i87 = (i85 & 85) + (i85 | 85);
                            f59839d = i87 % 128;
                            if (i87 % 2 == 0) {
                                throw null;
                            }
                        }
                    }
                    return Boolean.FALSE;
                }
                int i88 = (i29 & 31) + (i29 | 31);
                f59839d = i88 % 128;
                int i89 = i88 % 2;
                return Boolean.TRUE;
            case 3:
                setImageURI setimageuri3 = (setImageURI) objArr[0];
                setFontFeatureSettings setfontfeaturesettings = (setFontFeatureSettings) objArr[1];
                int i90 = f59839d;
                int i91 = i90 & 51;
                int i92 = -(-((i90 ^ 51) | i91));
                int i93 = (i91 & i92) + (i92 | i91);
                f59838c = i93 % 128;
                int i94 = i93 % 2;
                setImageURI setimageuri4 = (setImageURI) setX(new Object[]{setimageuri3.f59840a, setfontfeaturesettings}, 320121150, -320121145, (int) System.currentTimeMillis());
                int i95 = f59838c;
                int i96 = i95 & 1;
                int i97 = i95 | 1;
                int i98 = (i96 & i97) + (i97 | i96);
                f59839d = i98 % 128;
                int i99 = i98 % 2;
                return setimageuri4;
            case 4:
                setImageURI setimageuri5 = (setImageURI) objArr[0];
                int i100 = f59838c;
                int i101 = (i100 | 79) << 1;
                int i102 = -(((~i100) & 79) | (i100 & (-80)));
                int i103 = (i101 & i102) + (i102 | i101);
                f59839d = i103 % 128;
                int i104 = i103 % 2;
                setMax setmax = setimageuri5.f59840a;
                if (i104 != 0) {
                    return setmax;
                }
                throw null;
            case 5:
                setMax setmax2 = (setMax) objArr[0];
                setFontFeatureSettings setfontfeaturesettings2 = (setFontFeatureSettings) objArr[1];
                Intrinsics.checkNotNullParameter(setmax2, "");
                Intrinsics.checkNotNullParameter(setfontfeaturesettings2, "");
                setImageURI setimageuri6 = new setImageURI(setmax2, setfontfeaturesettings2);
                int i105 = f59839d + 60;
                int i106 = (i105 ^ (-1)) + (i105 << 1);
                f59838c = i106 % 128;
                if (i106 % 2 == 0) {
                    return setimageuri6;
                }
                throw null;
            case 6:
                setImageURI setimageuri7 = (setImageURI) objArr[0];
                int i107 = f59838c + 13;
                f59839d = i107 % 128;
                int i108 = i107 % 2;
                int iHashCode = setimageuri7.f59840a.hashCode();
                int i109 = iHashCode * 31;
                int iHashCode2 = setimageuri7.f59841b.hashCode();
                int iIdentityHashCode2 = System.identityHashCode(setimageuri7);
                int i110 = iHashCode2 * (-495);
                int i111 = iHashCode * (-15345);
                int i112 = i110 & i111;
                int i113 = (i111 | i110) & (~i112);
                int i114 = i112 << 1;
                int i115 = (i113 ^ i114) + ((i113 & i114) << 1);
                int i116 = ~iHashCode2;
                int i117 = (i116 | iHashCode2) & i116;
                int i118 = ~i109;
                int i119 = (~i118) & i117;
                int i120 = ~i117;
                int i121 = i119 | (i118 & i120);
                int i122 = i117 & i118;
                int i123 = ~((i121 & i122) | (i121 ^ i122));
                int i124 = ~iIdentityHashCode2;
                int i125 = (i120 & iIdentityHashCode2) | (i117 & i124);
                int i126 = i117 & iIdentityHashCode2;
                int i127 = (i115 - (~(-(-(((~((i126 & i125) | (i125 ^ i126))) | i123) * 992))))) - 1;
                int i128 = (i118 | i109) & i118;
                int i129 = i116 ^ i128;
                int i130 = i128 & i116;
                int i131 = (i130 & i129) | (i129 ^ i130);
                int i132 = ~i131;
                int i133 = (i131 | i132) & i132;
                int i134 = i116 | iIdentityHashCode2;
                int i135 = ~i134;
                int i136 = (i134 | i135) & i135;
                int i137 = ((~i136) & i133) | ((~i133) & i136);
                int i138 = i136 & i133;
                int i139 = (i138 & i137) | (i137 ^ i138);
                int i140 = (i124 | iIdentityHashCode2) & i124;
                int i141 = i140 & iHashCode2;
                int i142 = (iHashCode2 | i140) & (~i141);
                int i143 = (i142 & i141) | (i142 ^ i141);
                int i144 = i143 & i109;
                int i145 = (i143 | i109) & (~i144);
                int i146 = ~((i145 & i144) | (i145 ^ i144));
                int i147 = ((~i146) & i139) | ((~i139) & i146);
                int i148 = i139 & i146;
                int i149 = -(-(((i148 & i147) | (i147 ^ i148)) * (-496)));
                int i150 = (i127 ^ i149) + ((i149 & i127) << 1);
                int i151 = ((iIdentityHashCode2 & i109) | (i109 ^ iIdentityHashCode2)) * 496;
                int i152 = i150 & i151;
                int i153 = ((i150 ^ i151) | i152) << 1;
                int i154 = -((i151 | i150) & (~i152));
                int i155 = ((i153 | i154) << 1) - (i154 ^ i153);
                int i156 = f59838c;
                int i157 = (i156 | 19) << 1;
                int i158 = -(i156 ^ 19);
                int i159 = (i157 ^ i158) + ((i158 & i157) << 1);
                f59839d = i159 % 128;
                if (i159 % 2 == 0) {
                    int i160 = 50 / 0;
                }
                return Integer.valueOf(i155);
            default:
                setImageURI setimageuri8 = (setImageURI) objArr[0];
                int i161 = f59839d;
                int i162 = i161 & 39;
                int i163 = ((~i162) & (i161 | 39)) + (i162 << 1);
                f59838c = i163 % 128;
                int i164 = i163 % 2;
                setFontFeatureSettings setfontfeaturesettings3 = setimageuri8.f59841b;
                int i165 = i161 & 41;
                int i166 = (i161 | 41) & (~i165);
                int i167 = i165 << 1;
                int i168 = ((i166 | i167) << 1) - (i166 ^ i167);
                f59838c = i168 % 128;
                if (i168 % 2 == 0) {
                    return setfontfeaturesettings3;
                }
                int i169 = 92 / 0;
                return setfontfeaturesettings3;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, -500632675, 500632677, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, -1740797308, 1740797314, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, -244598364, 244598365, System.identityHashCode(this));
    }

    @NotNull
    public final setFontFeatureSettings setOnFocusChangeListener() {
        return (setFontFeatureSettings) setX(new Object[]{this}, -1838857790, 1838857790, System.identityHashCode(this));
    }

    @NotNull
    public final setMax setX() {
        return (setMax) setX(new Object[]{this}, -1896705164, 1896705168, System.identityHashCode(this));
    }
}
