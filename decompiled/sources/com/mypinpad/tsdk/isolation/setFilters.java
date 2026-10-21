package com.mypinpad.tsdk.isolation;

import c2.b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setFilters {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f59691f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f59692g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f59693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Long f59694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Long f59695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Long f59696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<getAmount> f59697e;

    public setFilters(@NotNull String str, @Nullable Long l6, @Nullable Long l7, @Nullable Long l10, @NotNull List<getAmount> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.f59693a = str;
        this.f59694b = l6;
        this.f59695c = l7;
        this.f59696d = l10;
        this.f59697e = list;
        ((Boolean) component2.setX(new Object[]{str}, -1627226869, 1627226882, (int) System.currentTimeMillis())).booleanValue();
        component2.setX(new Object[]{l6}, -51788065, 51788072, (int) System.currentTimeMillis());
        component2.setX(new Object[]{l7}, -51788065, 51788072, (int) System.currentTimeMillis());
        component2.setX(new Object[]{l10}, -51788065, 51788072, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a5 A[PHI: r8
      0x00a5: PHI (r8v53 int) = (r8v52 int), (r8v77 int) binds: [B:19:0x00a3, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:23:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c1 A[PHI: r8
      0x00c1: PHI (r8v74 int) = (r8v52 int), (r8v77 int) binds: [B:19:0x00a3, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int iHashCode;
        int i14;
        int iHashCode2;
        int iHashCode3;
        int i15 = ~i11;
        int i16 = (~i12) | i15;
        int i17 = (((~i16) | i10) * 226) + (i11 * (-112)) + (i10 * (-112));
        int i18 = ~i10;
        int i19 = ((~(i15 | i12)) * 113) + (((~(i10 | i16)) | (~(i11 | i18)) | (~(i18 | i12))) * (-113)) + i17;
        int iHashCode4 = 0;
        switch (i19) {
            case 1:
                setFilters setfilters = (setFilters) objArr[0];
                Object obj = objArr[1];
                int i20 = f59691f;
                int i21 = (i20 & 65) + (i20 | 65);
                int i22 = i21 % 128;
                f59692g = i22;
                if (i21 % 2 == 0) {
                    throw null;
                }
                if (setfilters == obj) {
                    int i23 = (-2) - (((i22 & 96) + (i22 | 96)) ^ (-1));
                    f59691f = i23 % 128;
                    return Boolean.valueOf((i23 % 2 != 0 ? 1 : 0) ^ 1);
                }
                if (!(!(obj instanceof setFilters))) {
                    setFilters setfilters2 = (setFilters) obj;
                    if (!Intrinsics.areEqual(setfilters.f59693a, setfilters2.f59693a)) {
                        System.identityHashCode(setfilters);
                        System.identityHashCode(setfilters);
                        int i24 = f59692g;
                        int i25 = i24 & 89;
                        int i26 = i25 + ((i24 ^ 89) | i25);
                        f59691f = i26 % 128;
                        if (i26 % 2 != 0) {
                            throw null;
                        }
                    } else if (!Intrinsics.areEqual(setfilters.f59694b, setfilters2.f59694b)) {
                        int i27 = f59691f;
                        int i28 = i27 | 113;
                        int i29 = (i28 << 1) - ((~(i27 & 113)) & i28);
                        int i30 = i29 % 128;
                        f59692g = i30;
                        int i31 = i29 % 2;
                        int i32 = i30 & 75;
                        int i33 = (i32 - (~((i30 ^ 75) | i32))) - 1;
                        f59691f = i33 % 128;
                        int i34 = i33 % 2;
                    } else if (!(!Intrinsics.areEqual(setfilters.f59695c, setfilters2.f59695c))) {
                        if (!Intrinsics.areEqual(setfilters.f59696d, setfilters2.f59696d)) {
                            int i35 = f59691f;
                            int i36 = (i35 & 35) + (i35 | 35);
                            f59692g = i36 % 128;
                            int i37 = i36 % 2;
                            i13 = i35 + 27;
                        } else {
                            if (!(!Intrinsics.areEqual(setfilters.f59697e, setfilters2.f59697e))) {
                                int i38 = f59691f;
                                int i39 = (-2) - (((i38 & 42) + (i38 | 42)) ^ (-1));
                                f59692g = i39 % 128;
                                int i40 = i39 % 2;
                                return Boolean.TRUE;
                            }
                            int i41 = f59691f;
                            int i42 = ((i41 ^ 50) + ((i41 & 50) << 1)) - 1;
                            f59692g = i42 % 128;
                            int i43 = i42 % 2;
                            int i44 = (i41 & 40) + (i41 | 40);
                            i13 = (i44 ^ (-1)) + (i44 << 1);
                        }
                        f59692g = i13 % 128;
                        int i45 = i13 % 2;
                    } else {
                        int i46 = f59692g;
                        int i47 = i46 & 121;
                        int i48 = ((((i46 ^ 121) | i47) << 1) - (~(-((i46 | 121) & (~i47))))) - 1;
                        int i49 = i48 % 128;
                        f59691f = i49;
                        int i50 = i48 % 2;
                        int i51 = ((i49 ^ 45) | (i49 & 45)) << 1;
                        int i52 = -(((~i49) & 45) | (i49 & (-46)));
                        int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                        f59692g = i53 % 128;
                        if (i53 % 2 == 0) {
                            int i54 = 80 / 0;
                        }
                    }
                } else {
                    int i55 = i20 & 21;
                    int i56 = (~i55) & (i20 | 21);
                    int i57 = -(-(i55 << 1));
                    int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
                    f59692g = i58 % 128;
                    int i59 = i58 % 2;
                    int i60 = (((i20 ^ 121) | (i20 & 121)) << 1) - ((i20 & (-122)) | ((~i20) & 121));
                    f59692g = i60 % 128;
                    if (i60 % 2 == 0) {
                        throw null;
                    }
                }
                return Boolean.FALSE;
            case 2:
                setFilters setfilters3 = (setFilters) objArr[0];
                int i61 = f59692g;
                int i62 = (i61 & (-64)) | ((~i61) & 63);
                int i63 = -(-((i61 & 63) << 1));
                int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
                int i65 = i64 % 128;
                f59691f = i65;
                int i66 = i64 % 2;
                List<getAmount> list = setfilters3.f59697e;
                int i67 = i65 ^ 35;
                int i68 = ((i65 & 35) | i67) << 1;
                int i69 = -i67;
                int i70 = (i68 & i69) + (i68 | i69);
                f59692g = i70 % 128;
                int i71 = i70 % 2;
                return list;
            case 3:
                setFilters setfilters4 = (setFilters) objArr[0];
                int i72 = f59692g;
                int i73 = i72 & 27;
                int i74 = ((i72 | 27) & (~i73)) + (i73 << 1);
                f59691f = i74 % 128;
                int i75 = i74 % 2;
                Long l6 = setfilters4.f59694b;
                if (i75 == 0) {
                    return l6;
                }
                throw null;
            case 4:
                setFilters setfilters5 = (setFilters) objArr[0];
                int i76 = f59691f;
                int i77 = i76 & 93;
                int i78 = (i76 | 93) & (~i77);
                int i79 = i77 << 1;
                int i80 = (i78 ^ i79) + ((i78 & i79) << 1);
                int i81 = i80 % 128;
                f59692g = i81;
                int i82 = i80 % 2;
                Long l7 = setfilters5.f59696d;
                int i83 = (i81 | 117) << 1;
                int i84 = -(((~i81) & 117) | (i81 & (-118)));
                int i85 = (i83 & i84) + (i84 | i83);
                f59691f = i85 % 128;
                if (i85 % 2 == 0) {
                    return l7;
                }
                throw null;
            case 5:
                setFilters setfilters6 = (setFilters) objArr[0];
                int i86 = f59692g + 123;
                f59691f = i86 % 128;
                if (i86 % 2 != 0) {
                    iHashCode = setfilters6.f59693a.hashCode() % 21;
                    if (setfilters6.f59694b == null) {
                        int i87 = f59692g;
                        int i88 = (i87 | 1) << 1;
                        int i89 = -(((~i87) & 1) | (i87 & (-2)));
                        i14 = ((i88 | i89) << 1) - (i89 ^ i88);
                        f59691f = i14 % 128;
                        if (i14 % 2 != 0) {
                            iHashCode2 = 1;
                        } else {
                            iHashCode2 = 0;
                        }
                    } else {
                        iHashCode2 = setfilters6.f59694b.hashCode();
                        int i90 = f59691f;
                        int i91 = ((i90 & 88) + (i90 | 88)) - 1;
                        f59692g = i91 % 128;
                        int i92 = i91 % 2;
                    }
                } else {
                    iHashCode = setfilters6.f59693a.hashCode() * 31;
                    if (setfilters6.f59694b == null) {
                        int i810 = f59692g;
                        int i811 = (i810 | 1) << 1;
                        int i812 = -(((~i810) & 1) | (i810 & (-2)));
                        i14 = ((i811 | i812) << 1) - (i812 ^ i811);
                        f59691f = i14 % 128;
                        if (i14 % 2 != 0) {
                            iHashCode2 = 1;
                        } else {
                            iHashCode2 = 0;
                        }
                    } else {
                        iHashCode2 = setfilters6.f59694b.hashCode();
                        int i93 = f59691f;
                        int i94 = ((i93 & 88) + (i93 | 88)) - 1;
                        f59692g = i94 % 128;
                        int i95 = i94 % 2;
                    }
                }
                int i96 = -(-iHashCode2);
                int i97 = ((iHashCode ^ i96) + ((iHashCode & i96) << 1)) * 31;
                Long l10 = setfilters6.f59695c;
                if (l10 == null) {
                    int i98 = f59691f;
                    int i99 = ((i98 | 93) << 1) - (i98 ^ 93);
                    int i100 = i99 % 128;
                    f59692g = i100;
                    int i101 = i99 % 2;
                    int i102 = (((i100 | 62) << 1) - (i100 ^ 62)) - 1;
                    f59691f = i102 % 128;
                    int i103 = i102 % 2;
                    iHashCode3 = 0;
                } else {
                    iHashCode3 = l10.hashCode();
                    int i104 = f59691f;
                    int i105 = i104 ^ 49;
                    int i106 = ((i104 & 49) | i105) << 1;
                    int i107 = -i105;
                    int i108 = (i106 & i107) + (i106 | i107);
                    f59692g = i108 % 128;
                    int i109 = i108 % 2;
                }
                int i110 = (i97 - (~iHashCode3)) - 1;
                int i111 = i110 * 31;
                Long l11 = setfilters6.f59696d;
                if (l11 == null) {
                    int i112 = f59691f;
                    int i113 = ((-1) << 1) - ((-1) ^ ((i112 ^ 72) + ((i112 & 72) << 1)));
                    f59692g = i113 % 128;
                    int i114 = i113 % 2;
                    int i115 = i112 & 83;
                    int i116 = i115 + ((i112 ^ 83) | i115);
                    f59692g = i116 % 128;
                    int i117 = i116 % 2;
                } else {
                    iHashCode4 = l11.hashCode();
                    int i118 = f59692g;
                    int i119 = (((i118 | 96) << 1) - (i118 ^ 96)) - 1;
                    f59691f = i119 % 128;
                    int i120 = i119 % 2;
                }
                int iIdentityHashCode = System.identityHashCode(setfilters6);
                int i121 = iHashCode4 * 217;
                int i122 = i110 * (-6665);
                int i123 = (((i121 ^ i122) + ((i121 & i122) << 1)) - (~((~(iHashCode4 | iIdentityHashCode)) * 216))) - 1;
                int i124 = ~i111;
                int i125 = (i124 & iHashCode4) | (iHashCode4 ^ i124);
                int i126 = ~iIdentityHashCode;
                int i127 = (iIdentityHashCode | (~iIdentityHashCode)) & i126;
                int i128 = ((i127 & i125) | (i125 ^ i127)) * (-216);
                int i129 = ((i123 ^ i128) | (i123 & i128)) << 1;
                int i130 = -((i128 & (~i123)) | ((~i128) & i123));
                int i131 = (i129 & i130) + (i130 | i129);
                int i132 = i126 & iHashCode4;
                int i133 = (iHashCode4 | i126) & (~i132);
                int i134 = (i132 & i133) | (i133 ^ i132);
                int i135 = (i134 | (~i134)) & (~i134);
                int i136 = i111 ^ i135;
                int i137 = i135 & i111;
                int iHashCode5 = setfilters6.f59697e.hashCode() + b.e(i131, ~(((i137 & i136) | (i136 ^ i137)) * 216), 1, 31);
                int i138 = f59691f;
                int i139 = (((i138 & (-2)) | ((~i138) & 1)) - (~(-(-((i138 & 1) << 1))))) - 1;
                f59692g = i139 % 128;
                int i140 = i139 % 2;
                return Integer.valueOf(iHashCode5);
            case 6:
                setFilters setfilters7 = (setFilters) objArr[0];
                int i141 = f59691f;
                int i142 = (i141 ^ 55) + ((i141 & 55) << 1);
                f59692g = i142 % 128;
                int i143 = i142 % 2;
                String str = setfilters7.f59693a;
                if (i143 != 0) {
                    return str;
                }
                throw null;
            case 7:
                int i144 = f59692g;
                int i145 = (((i144 | 26) << 1) - (i144 ^ 26)) - 1;
                f59691f = i145 % 128;
                if (i145 % 2 == 0) {
                    return "CCD";
                }
                throw null;
            default:
                setFilters setfilters8 = (setFilters) objArr[0];
                int i146 = f59692g;
                int i147 = ((-1) << 1) - ((-1) ^ ((i146 ^ 98) + ((i146 & 98) << 1)));
                int i148 = i147 % 128;
                f59691f = i148;
                int i149 = i147 % 2;
                Long l12 = setfilters8.f59695c;
                int i150 = i148 + 119;
                f59692g = i150 % 128;
                int i151 = i150 % 2;
                return l12;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 1821970428, -1821970427, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 537243343, -537243338, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setDividerPadding(new Object[]{this}, -1761363209, 1761363215, System.identityHashCode(this));
    }

    @Nullable
    public final Long setOnFocusChangeListener() {
        return (Long) setDividerPadding(new Object[]{this}, -401665532, 401665532, System.identityHashCode(this));
    }

    @Nullable
    public final Long setX() {
        return (Long) setDividerPadding(new Object[]{this}, -208305450, 208305454, System.identityHashCode(this));
    }

    @NotNull
    public final List<getAmount> setY() {
        return (List) setDividerPadding(new Object[]{this}, 330809937, -330809935, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setDividerPadding(new Object[]{this}, -799836802, 799836809, System.identityHashCode(this));
    }

    @Nullable
    public final Long setDividerPadding() {
        return (Long) setDividerPadding(new Object[]{this}, 2033539668, -2033539665, System.identityHashCode(this));
    }
}
