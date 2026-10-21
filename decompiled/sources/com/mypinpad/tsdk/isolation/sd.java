package com.mypinpad.tsdk.isolation;

import java.io.Serializable;
import java.util.Currency;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sd implements Serializable {
    public static int F0 = 0;
    public static int G0 = 1;
    public final boolean E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final sk f58214p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Map<Currency, sf> f58215q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f58216r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f58217s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f58218t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f58219u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final float f58220w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final boolean f58221x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final boolean f58222y0;

    public sd(@NotNull sk skVar, @NotNull Map<Currency, sf> map, boolean z10, int i10, int i11, int i12, int i13, float f6, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(skVar, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.f58214p0 = skVar;
        this.f58215q0 = map;
        this.f58216r0 = z10;
        this.f58217s0 = i10;
        this.f58218t0 = i11;
        this.f58219u0 = i12;
        this.v0 = i13;
        this.f58220w0 = f6;
        this.f58221x0 = z11;
        this.f58222y0 = z12;
        this.E0 = z13;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((i10 | i12) * (-50)) + (i11 * (-49)) + (i10 * 51);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~(i14 | i15 | i12);
        int i17 = ~i12;
        int i18 = i15 | i17;
        switch ((((~(i10 | i17)) | (~(i15 | i10)) | (~i18)) * 50) + ((i16 | (~(i18 | i10))) * 50) + i13) {
            case 1:
                sd sdVar = (sd) objArr[0];
                int i19 = G0 + 47;
                int i20 = i19 % 128;
                F0 = i20;
                int i21 = i19 % 2;
                boolean z10 = sdVar.f58221x0;
                int i22 = ((-1) << 1) - ((((i20 | 24) << 1) - (i20 ^ 24)) ^ (-1));
                G0 = i22 % 128;
                int i23 = i22 % 2;
                return Boolean.valueOf(z10);
            case 2:
                sd sdVar2 = (sd) objArr[0];
                int i24 = F0;
                int i25 = (i24 & 9) + (i24 | 9);
                int i26 = i25 % 128;
                G0 = i26;
                int i27 = i25 % 2;
                boolean z11 = sdVar2.f58216r0;
                if (i27 == 0) {
                    int i28 = 90 / 0;
                }
                int i29 = ((i26 & 78) + (i26 | 78)) - 1;
                F0 = i29 % 128;
                int i30 = i29 % 2;
                return Boolean.valueOf(z11);
            case 3:
                sd sdVar3 = (sd) objArr[0];
                int i31 = F0;
                int i32 = (i31 & (-38)) | ((~i31) & 37);
                int i33 = (i31 & 37) << 1;
                int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                int i35 = i34 % 128;
                G0 = i35;
                int i36 = i34 % 2;
                Map<Currency, sf> map = sdVar3.f58215q0;
                int i37 = i35 & 39;
                int i38 = (((i35 ^ 39) | i37) << 1) - ((i35 | 39) & (~i37));
                F0 = i38 % 128;
                int i39 = i38 % 2;
                return map;
            case 4:
                sd sdVar4 = (sd) objArr[0];
                int i40 = F0 + 49;
                int i41 = i40 % 128;
                G0 = i41;
                int i42 = i40 % 2;
                int i43 = sdVar4.f58219u0;
                if (i42 == 0) {
                    throw null;
                }
                int i44 = ((i41 | 121) << 1) - (i41 ^ 121);
                F0 = i44 % 128;
                int i45 = i44 % 2;
                return Integer.valueOf(i43);
            case 5:
                sd sdVar5 = (sd) objArr[0];
                int i46 = G0;
                int i47 = i46 & 123;
                int i48 = (i46 ^ 123) | i47;
                int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                F0 = i49 % 128;
                int i50 = i49 % 2;
                int i51 = sdVar5.f58217s0;
                if (i50 == 0) {
                    return Integer.valueOf(i51);
                }
                throw null;
            case 6:
                sd sdVar6 = (sd) objArr[0];
                int i52 = F0;
                int i53 = (i52 ^ 95) + ((i52 & 95) << 1);
                int i54 = i53 % 128;
                G0 = i54;
                int i55 = i53 % 2;
                float f6 = sdVar6.f58220w0;
                int i56 = i54 ^ 45;
                int i57 = ((i54 & 45) | i56) << 1;
                int i58 = -i56;
                int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
                F0 = i59 % 128;
                if (i59 % 2 == 0) {
                    return Float.valueOf(f6);
                }
                throw null;
            case 7:
                sd sdVar7 = (sd) objArr[0];
                int i60 = G0;
                int i61 = (i60 ^ 115) + ((i60 & 115) << 1);
                F0 = i61 % 128;
                int i62 = i61 % 2;
                int i63 = sdVar7.f58218t0;
                int i64 = i60 & 109;
                int i65 = (i60 | 109) & (~i64);
                int i66 = i64 << 1;
                int i67 = ((i65 | i66) << 1) - (i65 ^ i66);
                F0 = i67 % 128;
                if (i67 % 2 == 0) {
                    return Integer.valueOf(i63);
                }
                throw null;
            case 8:
                sd sdVar8 = (sd) objArr[0];
                int i68 = G0 + 5;
                int i69 = i68 % 128;
                F0 = i69;
                int i70 = i68 % 2;
                sk skVar = sdVar8.f58214p0;
                int i71 = ((i69 ^ 102) + ((i69 & 102) << 1)) - 1;
                G0 = i71 % 128;
                int i72 = i71 % 2;
                return skVar;
            case 9:
                sd sdVar9 = (sd) objArr[0];
                int i73 = G0;
                int i74 = i73 & 55;
                int i75 = (((~i74) & (i73 | 55)) - (~(i74 << 1))) - 1;
                F0 = i75 % 128;
                int i76 = i75 % 2;
                boolean z12 = sdVar9.E0;
                int i77 = (i73 & 85) + (i73 | 85);
                F0 = i77 % 128;
                int i78 = i77 % 2;
                return Boolean.valueOf(z12);
            case 10:
                sd sdVar10 = (sd) objArr[0];
                int i79 = G0;
                int i80 = (((i79 | 26) << 1) - (i79 ^ 26)) - 1;
                F0 = i80 % 128;
                int i81 = i80 % 2;
                boolean z13 = sdVar10.f58222y0;
                int i82 = ((i79 | 105) << 1) - (i79 ^ 105);
                F0 = i82 % 128;
                if (i82 % 2 != 0) {
                    int i83 = 41 / 0;
                }
                return Boolean.valueOf(z13);
            default:
                sd sdVar11 = (sd) objArr[0];
                int i84 = G0 + 43;
                int i85 = i84 % 128;
                F0 = i85;
                int i86 = i84 % 2;
                int i87 = sdVar11.v0;
                int i88 = (i85 ^ 39) + ((i85 & 39) << 1);
                G0 = i88 % 128;
                if (i88 % 2 != 0) {
                    return Integer.valueOf(i87);
                }
                throw null;
        }
    }

    public final float getNavBarTitleString() {
        return ((Float) setDividerPadding(new Object[]{this}, 129321580, -129321574, System.identityHashCode(this))).floatValue();
    }

    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -673618786, 673618791, System.identityHashCode(this))).intValue();
    }

    public final boolean setLayoutAnimation() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1898367054, -1898367053, System.identityHashCode(this))).booleanValue();
    }

    public final int setNavigationOnClickListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1619286018, -1619286014, System.identityHashCode(this))).intValue();
    }

    public final boolean setOnDragListener() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1629435881, 1629435891, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final sk setOnFocusChangeListener() {
        return (sk) setDividerPadding(new Object[]{this}, 152054942, -152054934, System.identityHashCode(this));
    }

    public final int setOnLongClickListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, -1463940083, 1463940083, System.identityHashCode(this))).intValue();
    }

    public final boolean setTextAlignment() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -810936633, 810936642, System.identityHashCode(this))).booleanValue();
    }

    public final int setX() {
        return ((Integer) setDividerPadding(new Object[]{this}, -1333462350, 1333462357, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final Map<Currency, sf> setY() {
        return (Map) setDividerPadding(new Object[]{this}, 1427969386, -1427969383, System.identityHashCode(this));
    }

    public final boolean setDividerPadding() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 343712990, -343712988, System.identityHashCode(this))).booleanValue();
    }
}
