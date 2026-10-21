package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setFadingEdgeLength {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f59654f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f59655g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final mv f59656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final mv f59657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final mv f59658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final mv f59659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f59660e;

    public setFadingEdgeLength(@NotNull mv mvVar, @NotNull mv mvVar2, @NotNull mv mvVar3, @NotNull mv mvVar4, float f6) {
        Intrinsics.checkNotNullParameter(mvVar, "");
        Intrinsics.checkNotNullParameter(mvVar2, "");
        Intrinsics.checkNotNullParameter(mvVar3, "");
        Intrinsics.checkNotNullParameter(mvVar4, "");
        this.f59656a = mvVar;
        this.f59657b = mvVar2;
        this.f59658c = mvVar3;
        this.f59659d = mvVar4;
        this.f59660e = f6;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i12;
        int i15 = ~(i13 | i14);
        int i16 = ~i11;
        int i17 = i13 | i16;
        int i18 = (((~(i10 | i16 | i12)) | (~(i11 | i13 | i12)) | (~(i17 | i14))) * 867) + (((~i17) | (~(i13 | i12)) | (~(i16 | i12))) * (-1734)) + ((i15 | (~(i16 | i14))) * (-867)) + (i11 * 868) + (i10 * 868);
        if (i18 == 1) {
            setFadingEdgeLength setfadingedgelength = (setFadingEdgeLength) objArr[0];
            int i19 = f59654f;
            int i20 = ((i19 ^ 87) | (i19 & 87)) << 1;
            int i21 = -(((~i19) & 87) | (i19 & (-88)));
            int i22 = (i20 & i21) + (i21 | i20);
            int i23 = i22 % 128;
            f59655g = i23;
            int i24 = i22 % 2;
            mv mvVar = setfadingedgelength.f59656a;
            int i25 = ((i23 ^ 18) + ((i23 & 18) << 1)) - 1;
            f59654f = i25 % 128;
            if (i25 % 2 == 0) {
                return mvVar;
            }
            int i26 = 45 / 0;
            return mvVar;
        }
        if (i18 == 2) {
            setFadingEdgeLength setfadingedgelength2 = (setFadingEdgeLength) objArr[0];
            int i27 = f59655g;
            int i28 = i27 + 121;
            f59654f = i28 % 128;
            int i29 = i28 % 2;
            mv mvVar2 = setfadingedgelength2.f59659d;
            int i30 = ((i27 ^ 79) | (i27 & 79)) << 1;
            int i31 = -(((~i27) & 79) | (i27 & (-80)));
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            f59654f = i32 % 128;
            int i33 = i32 % 2;
            return mvVar2;
        }
        if (i18 == 3) {
            setFadingEdgeLength setfadingedgelength3 = (setFadingEdgeLength) objArr[0];
            int i34 = f59654f;
            int i35 = ((i34 & (-30)) | ((~i34) & 29)) + ((i34 & 29) << 1);
            f59655g = i35 % 128;
            int i36 = i35 % 2;
            float f6 = setfadingedgelength3.f59660e;
            if (i36 == 0) {
                int i37 = 74 / 0;
            }
            return Float.valueOf(f6);
        }
        if (i18 != 4) {
            setFadingEdgeLength setfadingedgelength4 = (setFadingEdgeLength) objArr[0];
            int i38 = f59654f;
            int i39 = (i38 & 5) + (i38 | 5);
            f59655g = i39 % 128;
            int i40 = i39 % 2;
            mv mvVar3 = setfadingedgelength4.f59658c;
            if (i40 != 0) {
                return mvVar3;
            }
            int i41 = 34 / 0;
            return mvVar3;
        }
        setFadingEdgeLength setfadingedgelength5 = (setFadingEdgeLength) objArr[0];
        int i42 = f59654f;
        int i43 = i42 ^ 105;
        int i44 = ((i42 & 105) | i43) << 1;
        int i45 = -i43;
        int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
        f59655g = i46 % 128;
        int i47 = i46 % 2;
        mv mvVar4 = setfadingedgelength5.f59657b;
        if (i47 == 0) {
            throw null;
        }
        int i48 = i42 + 109;
        f59655g = i48 % 128;
        int i49 = i48 % 2;
        return mvVar4;
    }

    @NotNull
    public final mv setCompoundDrawableTintBlendMode() {
        return (mv) setX(new Object[]{this}, -1692182872, 1692182873, System.identityHashCode(this));
    }

    public final float setDividerPadding() {
        return ((Float) setX(new Object[]{this}, -1840230925, 1840230928, System.identityHashCode(this))).floatValue();
    }

    @NotNull
    public final mv setOnFocusChangeListener() {
        return (mv) setX(new Object[]{this}, 1433135746, -1433135742, System.identityHashCode(this));
    }

    @NotNull
    public final mv setY() {
        return (mv) setX(new Object[]{this}, 877070512, -877070512, System.identityHashCode(this));
    }

    @NotNull
    public final mv setX() {
        return (mv) setX(new Object[]{this}, 561997970, -561997968, System.identityHashCode(this));
    }
}
