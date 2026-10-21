package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class vs extends wi {
    public static int E0 = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f61576y0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final String f61577r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final String[] f61578s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final String f61579t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final String[] f61580u0;

    @NotNull
    public final um.setX v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final sd f61581w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final st f61582x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs(@NotNull String str, @NotNull String[] strArr, @NotNull String str2, @NotNull String[] strArr2, @NotNull um.setX setx, @NotNull sd sdVar, @NotNull st stVar) {
        super(wm.setY, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(strArr2, "");
        Intrinsics.checkNotNullParameter(setx, "");
        Intrinsics.checkNotNullParameter(sdVar, "");
        Intrinsics.checkNotNullParameter(stVar, "");
        this.f61577r0 = str;
        this.f61578s0 = strArr;
        this.f61579t0 = str2;
        this.f61580u0 = strArr2;
        this.v0 = setx;
        this.f61581w0 = sdVar;
        this.f61582x0 = stVar;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~i11) * (-783)) + (i11 * (-782)) + (i10 * 784);
        int i14 = ~i10;
        int i15 = ~i12;
        switch (((i14 | (~(i11 | i15))) * 783) + ((~(i14 | i15 | i11)) * (-783)) + i13) {
            case 1:
                vs vsVar = (vs) objArr[0];
                int i16 = E0;
                int i17 = i16 & 103;
                int i18 = ((i16 ^ 103) | i17) << 1;
                int i19 = -((i16 | 103) & (~i17));
                int i20 = (i18 & i19) + (i19 | i18);
                f61576y0 = i20 % 128;
                int i21 = i20 % 2;
                um.setX setx = vsVar.v0;
                if (i21 == 0) {
                    return setx;
                }
                throw null;
            case 2:
                vs vsVar2 = (vs) objArr[0];
                int i22 = f61576y0;
                int i23 = i22 + 2;
                int i24 = (i23 ^ (-1)) + (i23 << 1);
                E0 = i24 % 128;
                int i25 = i24 % 2;
                String str = vsVar2.f61579t0;
                int i26 = (i22 ^ 41) + ((i22 & 41) << 1);
                E0 = i26 % 128;
                int i27 = i26 % 2;
                return str;
            case 3:
                vs vsVar3 = (vs) objArr[0];
                int i28 = E0;
                int i29 = (i28 ^ 75) + ((i28 & 75) << 1);
                f61576y0 = i29 % 128;
                int i30 = i29 % 2;
                String[] strArr = vsVar3.f61580u0;
                if (i30 == 0) {
                    return strArr;
                }
                int i31 = 39 / 0;
                return strArr;
            case 4:
                vs vsVar4 = (vs) objArr[0];
                int i32 = f61576y0;
                int i33 = i32 & 3;
                int i34 = (i33 - (~(-(-((i32 ^ 3) | i33))))) - 1;
                int i35 = i34 % 128;
                E0 = i35;
                int i36 = i34 % 2;
                String str2 = vsVar4.f61577r0;
                int i37 = ((i35 ^ 117) | (i35 & 117)) << 1;
                int i38 = -(((~i35) & 117) | (i35 & (-118)));
                int i39 = (i37 & i38) + (i38 | i37);
                f61576y0 = i39 % 128;
                if (i39 % 2 == 0) {
                    return str2;
                }
                throw null;
            case 5:
                vs vsVar5 = (vs) objArr[0];
                int i40 = f61576y0;
                int i41 = (-2) - ((((i40 | 90) << 1) - (i40 ^ 90)) ^ (-1));
                int i42 = i41 % 128;
                E0 = i42;
                int i43 = i41 % 2;
                st stVar = vsVar5.f61582x0;
                if (i43 == 0) {
                    int i44 = 32 / 0;
                }
                int i45 = (i42 & 23) + (i42 | 23);
                f61576y0 = i45 % 128;
                if (i45 % 2 == 0) {
                    return stVar;
                }
                throw null;
            case 6:
                vs vsVar6 = (vs) objArr[0];
                int i46 = E0;
                int i47 = i46 & 51;
                int i48 = (((i46 ^ 51) | i47) << 1) - ((i46 | 51) & (~i47));
                f61576y0 = i48 % 128;
                int i49 = i48 % 2;
                sd sdVar = vsVar6.f61581w0;
                if (i49 == 0) {
                    return sdVar;
                }
                throw null;
            default:
                vs vsVar7 = (vs) objArr[0];
                int i50 = E0;
                int i51 = i50 & 65;
                int i52 = -(-((i50 ^ 65) | i51));
                int i53 = (i51 & i52) + (i51 | i52);
                f61576y0 = i53 % 128;
                int i54 = i53 % 2;
                String[] strArr2 = vsVar7.f61578s0;
                if (i54 != 0) {
                    throw null;
                }
                int i55 = (i50 & 82) + (i50 | 82);
                int i56 = (i55 ^ (-1)) + (i55 << 1);
                f61576y0 = i56 % 128;
                if (i56 % 2 == 0) {
                    return strArr2;
                }
                int i57 = 16 / 0;
                return strArr2;
        }
    }

    @NotNull
    public final String[] setCompoundDrawableTintBlendMode() {
        return (String[]) setX(new Object[]{this}, -802446644, 802446647, System.identityHashCode(this));
    }

    @NotNull
    public final um.setX setDividerPadding() {
        return (um.setX) setX(new Object[]{this}, 1160331990, -1160331989, System.identityHashCode(this));
    }

    @NotNull
    public final sd setNavigationOnClickListener() {
        return (sd) setX(new Object[]{this}, 1014675131, -1014675125, System.identityHashCode(this));
    }

    @NotNull
    public final String setOnFocusChangeListener() {
        return (String) setX(new Object[]{this}, 973147160, -973147156, System.identityHashCode(this));
    }

    @NotNull
    public final st setOnLongClickListener() {
        return (st) setX(new Object[]{this}, -1593807951, 1593807956, System.identityHashCode(this));
    }

    @NotNull
    public final String[] setY() {
        return (String[]) setX(new Object[]{this}, 1491282488, -1491282488, System.identityHashCode(this));
    }

    @NotNull
    public final String setX() {
        return (String) setX(new Object[]{this}, -1993161647, 1993161649, System.identityHashCode(this));
    }
}
