package com.mypinpad.tsdk.isolation;

import c2.b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class PinPadConfiguration {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f51787e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f51788f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f51789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final component9 f51790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<getAmount> f51791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<setFirstBaselineToTopHeight> f51792d;

    public PinPadConfiguration(byte b10, @Nullable component9 component9Var, @NotNull List<getAmount> list, @NotNull List<setFirstBaselineToTopHeight> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.f51789a = b10;
        this.f51790b = component9Var;
        this.f51791c = list;
        this.f51792d = list2;
        component2.setX(new Object[]{Byte.valueOf(b10)}, -534842727, 534842741, (int) System.currentTimeMillis());
        component2.setX(new Object[]{list2}, -1180415922, 1180415934, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Class<?> cls;
        int i13 = ((~i11) * (-783)) + (i11 * (-782)) + (i10 * 784);
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ((i14 | (~(i11 | i15))) * 783) + ((~(i14 | i15 | i11)) * (-783)) + i13;
        if (i16 == 1) {
            PinPadConfiguration pinPadConfiguration = (PinPadConfiguration) objArr[0];
            int i17 = ((-1) << 1) - ((f51787e + 118) ^ (-1));
            f51788f = i17 % 128;
            int i18 = i17 % 2;
            byte b10 = pinPadConfiguration.f51789a;
            int i19 = b10 * 31;
            int iHashCode = pinPadConfiguration.f51791c.hashCode();
            System.identityHashCode(pinPadConfiguration);
            int i20 = iHashCode * (-1831);
            int i21 = b10 * 28427;
            int i22 = i20 & i21;
            int i23 = (i21 ^ i20) | i22;
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            int i25 = ~iHashCode;
            int i26 = i25 & i19;
            int i27 = (~i26) & (i25 | i19);
            int i28 = ~i19;
            int i29 = (i24 - (~(-(-((~((i26 & i27) | (i27 ^ i26))) * 2748))))) - 1;
            int i30 = ~iHashCode;
            int i31 = i28 | i19;
            int i32 = (~i19) & i31;
            int i33 = (i29 - (~(-(-(((i30 & i32) | (((~i32) & i30) | ((~i30) & i32))) * (-916)))))) - 1;
            int i34 = (~i19) & i31;
            int i35 = ~((i25 & i34) | (i25 ^ i34));
            int i36 = ~((i19 & iHashCode) | (iHashCode ^ i19));
            int i37 = ((~i36) & i35) | ((~i35) & i36);
            int i38 = i35 & i36;
            int iE = b.e(i33, ~(-(-(((i38 & i37) | (i37 ^ i38)) * 916))), 1, 31);
            int i39 = -(-pinPadConfiguration.f51792d.hashCode());
            int i40 = ((iE ^ i39) | (iE & i39)) << 1;
            int i41 = -((i39 & (~iE)) | ((~i39) & iE));
            int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
            int i43 = f51787e + 111;
            f51788f = i43 % 128;
            int i44 = i43 % 2;
            return Integer.valueOf(i42);
        }
        if (i16 == 2) {
            PinPadConfiguration pinPadConfiguration2 = (PinPadConfiguration) objArr[0];
            int i45 = f51787e + 67;
            f51788f = i45 % 128;
            int i46 = i45 % 2;
            component9 component9Var = pinPadConfiguration2.f51790b;
            if (i46 != 0) {
                return component9Var;
            }
            int i47 = 50 / 0;
            return component9Var;
        }
        if (i16 == 3) {
            PinPadConfiguration pinPadConfiguration3 = (PinPadConfiguration) objArr[0];
            int i48 = f51787e + 109;
            int i49 = i48 % 128;
            f51788f = i49;
            int i50 = i48 % 2;
            byte b11 = pinPadConfiguration3.f51789a;
            int i51 = (i49 & (-36)) | ((~i49) & 35);
            int i52 = -(-((i49 & 35) << 1));
            int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
            f51787e = i53 % 128;
            if (i53 % 2 == 0) {
                return Byte.valueOf(b11);
            }
            throw null;
        }
        if (i16 != 4) {
            if (i16 != 5) {
                PinPadConfiguration pinPadConfiguration4 = (PinPadConfiguration) objArr[0];
                int i54 = f51787e + 23;
                f51788f = i54 % 128;
                int i55 = i54 % 2;
                List<setFirstBaselineToTopHeight> list = pinPadConfiguration4.f51792d;
                if (i55 != 0) {
                    return list;
                }
                int i56 = 13 / 0;
                return list;
            }
            PinPadConfiguration pinPadConfiguration5 = (PinPadConfiguration) objArr[0];
            int i57 = f51787e;
            int i58 = (-2) - (((i57 & 50) + (i57 | 50)) ^ (-1));
            f51788f = i58 % 128;
            int i59 = i58 % 2;
            List<getAmount> list2 = pinPadConfiguration5.f51791c;
            if (i59 != 0) {
                return list2;
            }
            int i60 = 25 / 0;
            return list2;
        }
        PinPadConfiguration pinPadConfiguration6 = (PinPadConfiguration) objArr[0];
        Object obj = objArr[1];
        int i61 = f51787e;
        int i62 = i61 ^ 35;
        int i63 = -(-((i61 & 35) << 1));
        int i64 = (i62 & i63) + (i63 | i62);
        int i65 = i64 % 128;
        f51788f = i65;
        if (i64 % 2 == 0) {
            throw null;
        }
        if (pinPadConfiguration6 != obj) {
            Class<?> cls2 = pinPadConfiguration6.getClass();
            if (obj == null) {
                int i66 = f51787e;
                int i67 = i66 & 51;
                int i68 = ((i66 ^ 51) | i67) << 1;
                int i69 = -((i66 | 51) & (~i67));
                int i70 = (i68 & i69) + (i69 | i68);
                f51788f = i70 % 128;
                if (i70 % 2 == 0) {
                    throw null;
                }
                cls = null;
            } else {
                cls = obj.getClass();
                int i71 = f51788f;
                int i72 = ((i71 | 14) << 1) - (i71 ^ 14);
                int i73 = (i72 ^ (-1)) + (i72 << 1);
                f51787e = i73 % 128;
                int i74 = i73 % 2;
            }
            if (!Intrinsics.areEqual(cls2, cls)) {
                int i75 = f51788f + 22;
                int i76 = (i75 ^ (-1)) + (i75 << 1);
                int i77 = i76 % 128;
                f51787e = i77;
                int i78 = i76 % 2;
                int i79 = i77 + 55;
                f51788f = i79 % 128;
                int i80 = i79 % 2;
            } else {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.mypinpad.softpos.emv.terminal.config.KernelConfigData");
                }
                PinPadConfiguration pinPadConfiguration7 = (PinPadConfiguration) obj;
                if (pinPadConfiguration6.f51789a != pinPadConfiguration7.f51789a) {
                    int i81 = f51788f;
                    int i82 = (((i81 & (-114)) | ((~i81) & 113)) - (~((i81 & 113) << 1))) - 1;
                    f51787e = i82 % 128;
                    int i83 = i82 % 2;
                    int i84 = i81 + 49;
                    f51787e = i84 % 128;
                    int i85 = i84 % 2;
                } else if (!Intrinsics.areEqual(pinPadConfiguration6.f51791c, pinPadConfiguration7.f51791c)) {
                    int i86 = f51787e;
                    int i87 = i86 & 93;
                    int i88 = (i86 ^ 93) | i87;
                    int i89 = (i87 ^ i88) + ((i88 & i87) << 1);
                    f51788f = i89 % 128;
                    int i90 = i89 % 2;
                    System.identityHashCode(pinPadConfiguration6);
                    System.identityHashCode(pinPadConfiguration6);
                } else {
                    if (!Intrinsics.areEqual(pinPadConfiguration6.f51792d, pinPadConfiguration7.f51792d)) {
                        int i91 = f51788f;
                        int i92 = i91 & 61;
                        int i93 = (i91 | 61) & (~i92);
                        int i94 = i92 << 1;
                        int i95 = ((i93 | i94) << 1) - (i93 ^ i94);
                        f51787e = i95 % 128;
                        return Boolean.valueOf(!(i95 % 2 == 0));
                    }
                    int i96 = f51787e;
                    int i97 = ((i96 ^ 61) | (i96 & 61)) << 1;
                    int i98 = -(((~i96) & 61) | (i96 & (-62)));
                    int i99 = (i97 ^ i98) + ((i98 & i97) << 1);
                    f51788f = i99 % 128;
                    if (i99 % 2 == 0) {
                        throw null;
                    }
                }
            }
            return Boolean.FALSE;
        }
        int i100 = (((i65 | 40) << 1) - (i65 ^ 40)) - 1;
        f51787e = i100 % 128;
        int i101 = i100 % 2;
        int i102 = (i65 ^ 73) + ((i65 & 73) << 1);
        f51787e = i102 % 128;
        int i103 = i102 % 2;
        return Boolean.TRUE;
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, -2003635587, 2003635591, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, -390548281, 390548282, System.identityHashCode(this))).intValue();
    }

    @Nullable
    public final component9 setDividerPadding() {
        return (component9) setX(new Object[]{this}, 1329146222, -1329146220, System.identityHashCode(this));
    }

    public final byte setOnFocusChangeListener() {
        return ((Byte) setX(new Object[]{this}, -2026598109, 2026598112, System.identityHashCode(this))).byteValue();
    }

    @NotNull
    public final List<getAmount> setY() {
        return (List) setX(new Object[]{this}, 1798210358, -1798210353, System.identityHashCode(this));
    }

    @NotNull
    public final List<setFirstBaselineToTopHeight> setX() {
        return (List) setX(new Object[]{this}, 999272966, -999272966, System.identityHashCode(this));
    }
}
