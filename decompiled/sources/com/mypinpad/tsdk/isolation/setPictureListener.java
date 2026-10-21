package com.mypinpad.tsdk.isolation;

import com.bbva.cellscore.web.model.page.components.ComponentDTO;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setPictureListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60305f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60306g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final md f60307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f60308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final setTitleMarginTop f60309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final byte[] f60310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final byte[] f60311e;

    public setPictureListener(@NotNull md mdVar, boolean z10, @NotNull setTitleMarginTop settitlemargintop) {
        Intrinsics.checkNotNullParameter(mdVar, "");
        Intrinsics.checkNotNullParameter(settitlemargintop, "");
        this.f60307a = mdVar;
        this.f60308b = z10;
        this.f60309c = settitlemargintop;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop}, 19241490, -19241481, System.identityHashCode(settitlemargintop));
        this.f60310d = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop}, -1426887016, 1426887024, System.identityHashCode(settitlemargintop));
        this.f60311e = getbeeponfailure2 == null ? null : (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2));
    }

    /* JADX WARN: Code duplicated, block: B:73:0x02e7 A[PHI: r7
      0x02e7: PHI (r7v17 int) = (r7v16 int), (r7v46 int) binds: [B:72:0x02e5, B:69:0x02de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [int] */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        boolean z10;
        ?? r10;
        boolean z11;
        int i14;
        boolean z12;
        boolean z13;
        int i15 = ~i11;
        int i16 = ~i12;
        int i17 = ~(i15 | i16);
        int i18 = ~i10;
        switch ((((~(i10 | i12)) | (~(i15 | i12)) | (~(i18 | i16))) * 959) + ((~(i11 | i10)) * (-959)) + ((i17 | (~(i18 | i12)) | (~(i16 | i10))) * 959) + (i11 * (-958)) + (i10 * (-958))) {
            case 1:
                setPictureListener setpicturelistener = (setPictureListener) objArr[0];
                int i19 = f60305f;
                int i20 = (i19 & (-108)) | ((~i19) & 107);
                int i21 = -(-((i19 & 107) << 1));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                f60306g = i22 % 128;
                int i23 = i22 % 2;
                int iHashCode = setpicturelistener.f60307a.hashCode();
                if (i23 == 0) {
                    i13 = iHashCode / 117;
                    z11 = setpicturelistener.f60308b;
                    if (z11) {
                        r10 = z10;
                        r10 = z11;
                        int i24 = f60305f + 105;
                        f60306g = i24 % 128;
                        int i25 = i24 % 2;
                        r10 = 1;
                    }
                } else {
                    i13 = iHashCode * 31;
                    z10 = setpicturelistener.f60308b;
                    if (z10) {
                        r10 = z10;
                        r10 = z11;
                        int i26 = f60305f + 105;
                        f60306g = i26 % 128;
                        int i27 = i26 % 2;
                        r10 = 1;
                    }
                }
                r10 = z10;
                r10 = z11;
                int i28 = (-2) - (((i13 - (~(-(~r10)))) - 1) ^ (-1));
                int i29 = i28 * 31;
                int iHashCode2 = setpicturelistener.f60309c.hashCode();
                int iIdentityHashCode = System.identityHashCode(setpicturelistener);
                int i30 = iHashCode2 * 784;
                int i31 = -(~(-(-(i28 * (-24242)))));
                int i32 = ((i30 ^ i31) + ((i31 & i30) << 1)) - 1;
                int i33 = -(-((~i29) * (-783)));
                int i34 = i32 & i33;
                int i35 = -(-((i33 ^ i32) | i34));
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                int i37 = ~iHashCode2;
                int i38 = ~iIdentityHashCode;
                int i39 = ((iHashCode2 | i37) & i37) | i38;
                int i40 = i39 & i29;
                int i41 = (~(((i39 | i29) & (~i40)) | i40)) * (-783);
                int i42 = i36 & i41;
                int i43 = i42 + ((i41 ^ i36) | i42);
                int i44 = i38 ^ i29;
                int i45 = i38 & i29;
                int i46 = (i45 & i44) | (i44 ^ i45);
                int i47 = ~i46;
                int i48 = (i46 | i47) & i47;
                int i49 = ((i48 & i37) | (i37 ^ i48)) * 783;
                int i50 = i43 & i49;
                int i51 = (i49 | i43) & (~i50);
                int i52 = -(-(i50 << 1));
                int i53 = (i51 & i52) + (i51 | i52);
                int i54 = f60305f;
                int i55 = i54 | 47;
                int i56 = (i55 << 1) - ((~(i54 & 47)) & i55);
                f60306g = i56 % 128;
                if (i56 % 2 != 0) {
                    return Integer.valueOf(i53);
                }
                throw null;
            case 2:
                setPictureListener setpicturelistener2 = (setPictureListener) objArr[0];
                int i57 = f60306g;
                int i58 = (i57 & (-72)) | ((~i57) & 71);
                int i59 = (i57 & 71) << 1;
                int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                int i61 = i60 % 128;
                f60305f = i61;
                int i62 = i60 % 2;
                setTitleMarginTop settitlemargintop = setpicturelistener2.f60309c;
                int i63 = i61 + 13;
                f60306g = i63 % 128;
                if (i63 % 2 != 0) {
                    return settitlemargintop;
                }
                throw null;
            case 3:
                setPictureListener setpicturelistener3 = (setPictureListener) objArr[0];
                Object obj = objArr[1];
                int i64 = f60305f;
                int i65 = ((i64 & 32) + (i64 | 32)) - 1;
                int i66 = i65 % 128;
                f60306g = i66;
                int i67 = i65 % 2;
                if (setpicturelistener3 != obj) {
                    if (!(!(obj instanceof setPictureListener))) {
                        setPictureListener setpicturelistener4 = (setPictureListener) obj;
                        if (setpicturelistener3.f60307a != setpicturelistener4.f60307a) {
                            int i68 = (((i66 & (-8)) | ((~i66) & 7)) - (~(-(-((i66 & 7) << 1))))) - 1;
                            f60305f = i68 % 128;
                            z12 = i68 % 2 != 0;
                            System.identityHashCode(setpicturelistener3);
                            System.identityHashCode(setpicturelistener3);
                        } else if (setpicturelistener3.f60308b != setpicturelistener4.f60308b) {
                            int i69 = (i66 ^ 87) + ((i66 & 87) << 1);
                            int i70 = i69 % 128;
                            f60305f = i70;
                            int i71 = i69 % 2;
                            i14 = (-2) - (((i70 & 92) + (i70 | 92)) ^ (-1));
                        } else if (Intrinsics.areEqual(setpicturelistener3.f60309c, setpicturelistener4.f60309c)) {
                            int i72 = f60305f;
                            int i73 = ((i72 ^ 94) + ((i72 & 94) << 1)) - 1;
                            f60306g = i73 % 128;
                            int i74 = i73 % 2;
                        } else {
                            int i75 = f60306g;
                            int i76 = i75 ^ 9;
                            int i77 = (i75 & 9) << 1;
                            int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
                            int i79 = i78 % 128;
                            f60305f = i79;
                            z12 = i78 % 2 != 0;
                            int i80 = i79 ^ 53;
                            int i81 = ((i79 & 53) | i80) << 1;
                            int i82 = -i80;
                            int i83 = (i81 ^ i82) + ((i81 & i82) << 1);
                            f60306g = i83 % 128;
                            if (i83 % 2 == 0) {
                                throw null;
                            }
                        }
                        return Boolean.valueOf(z12);
                    }
                    i14 = (i64 & 103) + (i64 | 103);
                    f60306g = i14 % 128;
                    int i84 = i14 % 2;
                    return Boolean.FALSE;
                }
                int i85 = i64 & 13;
                int i86 = i85 + ((i64 ^ 13) | i85);
                f60306g = i86 % 128;
                int i87 = i86 % 2;
                int i88 = i64 + 103;
                f60306g = i88 % 128;
                int i89 = i88 % 2;
                return Boolean.TRUE;
            case 4:
                setPictureListener setpicturelistener5 = (setPictureListener) objArr[0];
                int i90 = f60305f;
                int i91 = ((i90 | 81) << 1) - (i90 ^ 81);
                int i92 = i91 % 128;
                f60306g = i92;
                int i93 = i91 % 2;
                md mdVar = setpicturelistener5.f60307a;
                int i94 = i92 & 81;
                int i95 = ((i92 | 81) & (~i94)) + (i94 << 1);
                f60305f = i95 % 128;
                int i96 = i95 % 2;
                return mdVar;
            case 5:
                setPictureListener setpicturelistener6 = (setPictureListener) objArr[0];
                int i97 = f60305f;
                int i98 = i97 & 107;
                int i99 = -(-((i97 ^ 107) | i98));
                int i100 = (i98 & i99) + (i99 | i98);
                f60306g = i100 % 128;
                int i101 = i100 % 2;
                setTitleMarginTop settitlemargintop2 = setpicturelistener6.f60309c;
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop2}, -876128602, 876128604, System.identityHashCode(settitlemargintop2));
                byte[] bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                if (bArr.length == 0) {
                    int i102 = f60306g;
                    int i103 = (i102 ^ 11) + ((i102 & 11) << 1);
                    f60305f = i103 % 128;
                    int i104 = i103 % 2;
                    int i105 = (-2) - (((i102 ^ 68) + ((i102 & 68) << 1)) ^ (-1));
                    f60305f = i105 % 128;
                    int i106 = i105 % 2;
                    z13 = true;
                } else {
                    int i107 = f60305f;
                    int i108 = i107 & 79;
                    int i109 = -(-((i107 ^ 79) | i108));
                    int i110 = ((i108 | i109) << 1) - (i109 ^ i108);
                    f60306g = i110 % 128;
                    int i111 = i110 % 2;
                    z13 = false;
                }
                if (!z13) {
                    int iIntValue = ((Integer) setInputExtras.setDividerPadding(new Object[]{bArr}, -1792313771, 1792313778, (int) System.currentTimeMillis())).intValue();
                    int i112 = f60305f + 59;
                    f60306g = i112 % 128;
                    if (i112 % 2 != 0) {
                        return Integer.valueOf(iIntValue);
                    }
                    throw null;
                }
                int i113 = f60306g;
                int i114 = (-2) - (((i113 ^ 52) + ((i113 & 52) << 1)) ^ (-1));
                int i115 = i114 % 128;
                f60305f = i115;
                int i116 = i114 % 2;
                int i117 = i115 + 59;
                f60306g = i117 % 128;
                if (i117 % 2 != 0) {
                    return 0;
                }
                throw null;
            case 6:
                setPictureListener setpicturelistener7 = (setPictureListener) objArr[0];
                int i118 = f60306g;
                int i119 = i118 & 113;
                int i120 = (i118 ^ 113) | i119;
                int i121 = (i119 & i120) + (i120 | i119);
                int i122 = i121 % 128;
                f60305f = i122;
                int i123 = i121 % 2;
                byte[] bArr2 = setpicturelistener7.f60310d;
                int i124 = i122 & 109;
                int i125 = (i122 | 109) & (~i124);
                int i126 = i124 << 1;
                int i127 = (i125 & i126) + (i125 | i126);
                f60306g = i127 % 128;
                if (i127 % 2 != 0) {
                    return bArr2;
                }
                throw null;
            case 7:
                setPictureListener setpicturelistener8 = (setPictureListener) objArr[0];
                int i128 = f60306g;
                int i129 = (i128 & (-122)) | ((~i128) & 121);
                int i130 = -(-((i128 & 121) << 1));
                int i131 = ((i129 | i130) << 1) - (i130 ^ i129);
                f60305f = i131 % 128;
                int i132 = i131 % 2;
                byte[] bArr3 = setpicturelistener8.f60311e;
                if (i132 == 0) {
                    return bArr3;
                }
                throw null;
            case 8:
                setPictureListener setpicturelistener9 = (setPictureListener) objArr[0];
                int i133 = f60306g;
                int i134 = i133 ^ 125;
                int i135 = ((i133 & 125) | i134) << 1;
                int i136 = -i134;
                int i137 = ((i135 | i136) << 1) - (i135 ^ i136);
                f60305f = i137 % 128;
                int i138 = i137 % 2;
                boolean z14 = setpicturelistener9.f60308b;
                if (i138 == 0) {
                    return Boolean.valueOf(z14);
                }
                throw null;
            default:
                int i139 = f60305f;
                int i140 = (((i139 | 76) << 1) - (i139 ^ 76)) - 1;
                f60306g = i140 % 128;
                int i141 = i140 % 2;
                int i142 = ((i139 ^ 120) + ((i139 & 120) << 1)) - 1;
                f60306g = i142 % 128;
                if (i142 % 2 == 0) {
                    int i143 = 18 / 0;
                }
                return ComponentDTO.CROSS_COMPONENT;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setY(new Object[]{this, obj}, 548161616, -548161613, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, -1367627539, 1367627540, System.identityHashCode(this))).intValue();
    }

    public final boolean setCompoundDrawableTintBlendMode() {
        return ((Boolean) setY(new Object[]{this}, -800777879, 800777887, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setY(new Object[]{this}, -87887370, 87887376, System.identityHashCode(this));
    }

    @Nullable
    public final byte[] setOnDragListener() {
        return (byte[]) setY(new Object[]{this}, 2106619938, -2106619931, System.identityHashCode(this));
    }

    @NotNull
    public final setTitleMarginTop setOnFocusChangeListener() {
        return (setTitleMarginTop) setY(new Object[]{this}, 1835080131, -1835080129, System.identityHashCode(this));
    }

    @NotNull
    public final md setX() {
        return (md) setY(new Object[]{this}, 1661100660, -1661100656, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setY(new Object[]{this}, 2050261435, -2050261435, System.identityHashCode(this));
    }

    public final int setY() {
        return ((Integer) setY(new Object[]{this}, 1071875703, -1071875698, System.identityHashCode(this))).intValue();
    }
}
