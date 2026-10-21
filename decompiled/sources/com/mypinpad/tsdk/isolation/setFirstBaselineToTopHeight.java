package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setFirstBaselineToTopHeight {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f59708e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f59709f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f59710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<getAmount> f59711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<getDynamicButtonTextSizeSp> f59712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f59713d;

    public setFirstBaselineToTopHeight(@NotNull String str, @NotNull List<getAmount> list, @NotNull List<getDynamicButtonTextSizeSp> list2, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.f59710a = str;
        this.f59711b = list;
        this.f59712c = list2;
        this.f59713d = str2;
        component2.setX(new Object[]{str}, -474673326, 474673336, (int) System.currentTimeMillis());
        component2.setX(new Object[]{list2}, 1124287968, -1124287945, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = ~i10;
        int i15 = (((~(i14 | i11)) | (~(i14 | i12))) * (-566)) + (i11 * (-565)) + (i10 * 567);
        int i16 = ~i11;
        int i17 = ((~(i16 | i14 | i12)) * 566) + ((~(i10 | i16)) * 566) + i15;
        int iHashCode = 0;
        boolean z10 = false;
        switch (i17) {
            case 1:
                setFirstBaselineToTopHeight setfirstbaselinetotopheight = (setFirstBaselineToTopHeight) objArr[0];
                int i18 = f59708e + 17;
                f59709f = i18 % 128;
                int i19 = i18 % 2;
                List<getDynamicButtonTextSizeSp> list = setfirstbaselinetotopheight.f59712c;
                if (i19 != 0) {
                    return list;
                }
                throw null;
            case 2:
                setFirstBaselineToTopHeight setfirstbaselinetotopheight2 = (setFirstBaselineToTopHeight) objArr[0];
                int i20 = f59708e;
                int i21 = (i20 & 61) + (i20 | 61);
                f59709f = i21 % 128;
                int i22 = i21 % 2;
                String str = setfirstbaselinetotopheight2.f59713d;
                if (i22 == 0) {
                    throw null;
                }
                int i23 = (-2) - (((i20 & 34) + (i20 | 34)) ^ (-1));
                f59709f = i23 % 128;
                if (i23 % 2 != 0) {
                    return str;
                }
                throw null;
            case 3:
                setFirstBaselineToTopHeight setfirstbaselinetotopheight3 = (setFirstBaselineToTopHeight) objArr[0];
                int i24 = f59709f + 114;
                int i25 = (i24 ^ (-1)) + (i24 << 1);
                f59708e = i25 % 128;
                int i26 = i25 % 2;
                int iHashCode2 = setfirstbaselinetotopheight3.f59710a.hashCode() * 31;
                int i27 = -(-setfirstbaselinetotopheight3.f59711b.hashCode());
                int i28 = (iHashCode2 ^ i27) + ((iHashCode2 & i27) << 1);
                int i29 = i28 * 31;
                int iHashCode3 = setfirstbaselinetotopheight3.f59712c.hashCode();
                int iIdentityHashCode = System.identityHashCode(setfirstbaselinetotopheight3);
                int i30 = iHashCode3 * (-1965);
                int i31 = -(-(i28 * 30504));
                int i32 = i30 & i31;
                int i33 = (i32 - (~(-(-((i31 ^ i30) | i32))))) - 1;
                int i34 = ~i29;
                int i35 = ((i34 & iHashCode3) | (iHashCode3 ^ i34)) * 983;
                int i36 = (i33 ^ i35) + ((i35 & i33) << 1);
                int i37 = ~iHashCode3;
                int i38 = ~iHashCode3;
                int i39 = (iHashCode3 | i38) & i37;
                int i40 = ~i29;
                int i41 = ~iIdentityHashCode;
                int i42 = ~iIdentityHashCode;
                int i43 = (iIdentityHashCode | i42) & i41;
                int i44 = i40 & i43;
                int i45 = (i40 | i43) & (~i44);
                int i46 = ~((i45 & i44) | (i45 ^ i44));
                int i47 = i39 & i46;
                int i48 = (i39 | i46) & (~i47);
                int i49 = (((i48 & i47) | (i48 ^ i47)) * (-983)) + i36;
                int i50 = (i38 ^ i42) | (i38 & i42);
                int i51 = (i50 | (~i50)) & (~i50);
                int i52 = i38 & i29;
                int i53 = (i29 | i38) & (~i52);
                int i54 = ~((i53 & i52) | (i53 ^ i52));
                int i55 = -(-(((i54 & i51) | (i51 ^ i54)) * 983));
                int i56 = (((i49 ^ i55) | (i49 & i55)) << 1) - ((i55 & (~i49)) | ((~i55) & i49));
                int i57 = i56 * 31;
                String str2 = setfirstbaselinetotopheight3.f59713d;
                if (str2 == null) {
                    int i58 = ((-1) << 1) - ((f59709f + 12) ^ (-1));
                    int i59 = i58 % 128;
                    f59708e = i59;
                    int i60 = i58 % 2;
                    int i61 = ((i59 & 106) + (i59 | 106)) - 1;
                    f59709f = i61 % 128;
                    int i62 = i61 % 2;
                } else {
                    iHashCode = str2.hashCode();
                    int i63 = f59708e + 67;
                    f59709f = i63 % 128;
                    int i64 = i63 % 2;
                }
                int iIdentityHashCode2 = System.identityHashCode(setfirstbaselinetotopheight3);
                int i65 = iHashCode * 758;
                int i66 = -(-(i56 * (-23436)));
                int i67 = ((~i66) & i65) | ((~i65) & i66);
                int i68 = -(-((i65 & i66) << 1));
                int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
                int i70 = ~iIdentityHashCode2;
                int i71 = (~i70) & iHashCode;
                int i72 = ~iHashCode;
                int i73 = i71 | (i70 & i72);
                int i74 = i70 & iHashCode;
                int i75 = (i69 - (~(((i74 & i73) | (i73 ^ i74)) * (-757)))) - 1;
                int i76 = ~i57;
                int i77 = i76 & iHashCode;
                int i78 = (i76 | iHashCode) & (~i77);
                int i79 = (i78 & i77) | (i78 ^ i77);
                int i80 = ~iIdentityHashCode2;
                int i81 = (i79 & i80) | ((~i79) & iIdentityHashCode2);
                int i82 = i79 & iIdentityHashCode2;
                int i83 = -(-((~((i82 & i81) | (i81 ^ i82))) * 1514));
                int i84 = i75 ^ i83;
                int i85 = ((i83 & i75) | i84) << 1;
                int i86 = -i84;
                int i87 = ((i85 | i86) << 1) - (i85 ^ i86);
                int i88 = (~iHashCode) & (i72 | iHashCode);
                int i89 = ~i57;
                int i90 = ~((i88 & i89) | (i88 ^ i89));
                int i91 = ((~i80) & i89) | ((~i89) & i80);
                int i92 = i89 & i80;
                int i93 = ~((i92 & i91) | (i91 ^ i92));
                int i94 = i90 & i93;
                int i95 = (i90 | i93) & (~i94);
                int i96 = (i95 & i94) | (i95 ^ i94);
                int i97 = (i57 & iHashCode) | (iHashCode ^ i57);
                int i98 = i97 & iIdentityHashCode2;
                int i99 = (iIdentityHashCode2 | i97) & (~i98);
                int i100 = (i99 & i98) | (i99 ^ i98);
                int i101 = (i100 | (~i100)) & (~i100);
                int i102 = i96 & i101;
                int i103 = (i101 | i96) & (~i102);
                int i104 = (i87 - (~(((i103 & i102) | (i103 ^ i102)) * 757))) - 1;
                int i105 = f59708e;
                int i106 = i105 ^ 63;
                int i107 = ((i105 & 63) | i106) << 1;
                int i108 = -i106;
                int i109 = (i107 & i108) + (i107 | i108);
                f59709f = i109 % 128;
                int i110 = i109 % 2;
                return Integer.valueOf(i104);
            case 4:
                setFirstBaselineToTopHeight setfirstbaselinetotopheight4 = (setFirstBaselineToTopHeight) objArr[0];
                int i111 = f59709f;
                int i112 = ((i111 ^ 47) - (~(-(-((i111 & 47) << 1))))) - 1;
                int i113 = i112 % 128;
                f59708e = i113;
                int i114 = i112 % 2;
                String str3 = setfirstbaselinetotopheight4.f59710a;
                int i115 = (i113 ^ 21) + ((i113 & 21) << 1);
                f59709f = i115 % 128;
                if (i115 % 2 != 0) {
                    return str3;
                }
                throw null;
            case 5:
                setFirstBaselineToTopHeight setfirstbaselinetotopheight5 = (setFirstBaselineToTopHeight) objArr[0];
                Object obj = objArr[1];
                int i116 = f59708e;
                int i117 = ((i116 | 117) << 1) - (i116 ^ 117);
                int i118 = i117 % 128;
                f59709f = i118;
                if (i117 % 2 == 0) {
                    throw null;
                }
                if (setfirstbaselinetotopheight5 != obj) {
                    if (obj instanceof setFirstBaselineToTopHeight) {
                        setFirstBaselineToTopHeight setfirstbaselinetotopheight6 = (setFirstBaselineToTopHeight) obj;
                        if (Intrinsics.areEqual(setfirstbaselinetotopheight5.f59710a, setfirstbaselinetotopheight6.f59710a)) {
                            if (!Intrinsics.areEqual(setfirstbaselinetotopheight5.f59711b, setfirstbaselinetotopheight6.f59711b)) {
                                int i119 = f59708e + 63;
                                f59709f = i119 % 128;
                                if (i119 % 2 == 0) {
                                    z10 = true;
                                }
                            } else if (!Intrinsics.areEqual(setfirstbaselinetotopheight5.f59712c, setfirstbaselinetotopheight6.f59712c)) {
                                System.identityHashCode(setfirstbaselinetotopheight5);
                                System.identityHashCode(setfirstbaselinetotopheight5);
                                int i120 = f59708e;
                                int i121 = ((i120 ^ 121) | (i120 & 121)) << 1;
                                int i122 = -(((~i120) & 121) | (i120 & (-122)));
                                i13 = (i121 ^ i122) + ((i122 & i121) << 1);
                            } else if (!(!Intrinsics.areEqual(setfirstbaselinetotopheight5.f59713d, setfirstbaselinetotopheight6.f59713d))) {
                                int i123 = f59709f + 43;
                                f59708e = i123 % 128;
                                int i124 = i123 % 2;
                            } else {
                                int i125 = f59709f;
                                int i126 = (((i125 | 50) << 1) - (i125 ^ 50)) - 1;
                                int i127 = i126 % 128;
                                f59708e = i127;
                                z10 = i126 % 2 != 0;
                                int i128 = (i127 & (-38)) | ((~i127) & 37);
                                int i129 = (i127 & 37) << 1;
                                int i130 = ((i128 | i129) << 1) - (i129 ^ i128);
                                f59709f = i130 % 128;
                                int i131 = i130 % 2;
                            }
                            return Boolean.valueOf(z10);
                        }
                        int i132 = f59709f;
                        int i133 = i132 & 81;
                        int i134 = ((i132 | 81) & (~i133)) + (i133 << 1);
                        int i135 = i134 % 128;
                        f59708e = i135;
                        int i136 = i134 % 2;
                        int i137 = (i135 & (-68)) | ((~i135) & 67);
                        int i138 = -(-((i135 & 67) << 1));
                        int i139 = ((i137 | i138) << 1) - (i137 ^ i138);
                        f59709f = i139 % 128;
                        if (i139 % 2 == 0) {
                            int i140 = 5 / 0;
                        }
                        return Boolean.FALSE;
                    }
                    int i141 = (i118 & (-94)) | ((~i118) & 93);
                    int i142 = -(-((i118 & 93) << 1));
                    int i143 = (i141 ^ i142) + ((i141 & i142) << 1);
                    int i144 = i143 % 128;
                    f59708e = i144;
                    int i145 = i143 % 2;
                    int i146 = (i144 | 25) << 1;
                    int i147 = -(i144 ^ 25);
                    i13 = ((i146 | i147) << 1) - (i147 ^ i146);
                    f59709f = i13 % 128;
                    int i148 = i13 % 2;
                    return Boolean.FALSE;
                }
                int i149 = ((i116 ^ 56) + ((i116 & 56) << 1)) - 1;
                f59709f = i149 % 128;
                if (i149 % 2 == 0) {
                    throw null;
                }
                return Boolean.TRUE;
            case 6:
                int i150 = f59708e + 97;
                int i151 = i150 % 128;
                f59709f = i151;
                int i152 = i150 % 2;
                int i153 = (((i151 | 124) << 1) - (i151 ^ 124)) - 1;
                f59708e = i153 % 128;
                if (i153 % 2 == 0) {
                    return "ACD";
                }
                throw null;
            default:
                setFirstBaselineToTopHeight setfirstbaselinetotopheight7 = (setFirstBaselineToTopHeight) objArr[0];
                int i154 = f59708e;
                int i155 = (i154 ^ 73) + ((i154 & 73) << 1);
                int i156 = i155 % 128;
                f59709f = i156;
                int i157 = i155 % 2;
                List<getAmount> list2 = setfirstbaselinetotopheight7.f59711b;
                if (i157 == 0) {
                    throw null;
                }
                int i158 = (((i156 | 44) << 1) - (i156 ^ 44)) - 1;
                f59708e = i158 % 128;
                if (i158 % 2 == 0) {
                    return list2;
                }
                throw null;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, obj}, 2082649436, -2082649431, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -1166107108, 1166107111, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final List<getAmount> setOnFocusChangeListener() {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this}, -800879525, 800879525, System.identityHashCode(this));
    }

    @NotNull
    public final List<getDynamicButtonTextSizeSp> setX() {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this}, 659906534, -659906533, System.identityHashCode(this));
    }

    @Nullable
    public final String setY() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 1248954874, -1248954872, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 1462353341, -1462353335, System.identityHashCode(this));
    }

    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -1591877885, 1591877889, System.identityHashCode(this));
    }
}
