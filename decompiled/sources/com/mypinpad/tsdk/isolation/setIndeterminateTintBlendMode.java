package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setIndeterminateTintBlendMode {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f59877e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f59878f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setEnabled f59879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setEnabled f59880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final setEnabled f59881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final setEnabled f59882d;

    public setIndeterminateTintBlendMode(@NotNull setEnabled setenabled, @NotNull setEnabled setenabled2, @NotNull setEnabled setenabled3, @NotNull setEnabled setenabled4) {
        Intrinsics.checkNotNullParameter(setenabled, "");
        Intrinsics.checkNotNullParameter(setenabled2, "");
        Intrinsics.checkNotNullParameter(setenabled3, "");
        Intrinsics.checkNotNullParameter(setenabled4, "");
        this.f59879a = setenabled;
        this.f59880b = setenabled2;
        this.f59881c = setenabled3;
        this.f59882d = setenabled4;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        setEnabled setenabled;
        int i13 = ~i11;
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ((~(i10 | i11)) * 933) + (((~(i15 | i13)) | (~(i13 | i10))) * 933) + (((~(i14 | i15)) | i13) * (-933)) + (i11 * (-932)) + (i10 * 934);
        if (i16 == 1) {
            setIndeterminateTintBlendMode setindeterminatetintblendmode = (setIndeterminateTintBlendMode) objArr[0];
            int i17 = f59878f;
            int i18 = i17 & 83;
            int i19 = (((i17 | 83) & (~i18)) - (~(i18 << 1))) - 1;
            f59877e = i19 % 128;
            int i20 = i19 % 2;
            setenabled = setindeterminatetintblendmode.f59882d;
            if (i20 != 0) {
                throw null;
            }
        } else if (i16 == 2) {
            setIndeterminateTintBlendMode setindeterminatetintblendmode2 = (setIndeterminateTintBlendMode) objArr[0];
            int i21 = f59878f;
            int i22 = i21 ^ 43;
            int i23 = (i21 & 43) << 1;
            int i24 = (i22 & i23) + (i23 | i22);
            f59877e = i24 % 128;
            int i25 = i24 % 2;
            setenabled = setindeterminatetintblendmode2.f59880b;
            if (i25 != 0) {
                throw null;
            }
        } else if (i16 != 3) {
            setIndeterminateTintBlendMode setindeterminatetintblendmode3 = (setIndeterminateTintBlendMode) objArr[0];
            int i26 = f59878f;
            int i27 = i26 & 21;
            int i28 = ((i26 ^ 21) | i27) << 1;
            int i29 = -((i26 | 21) & (~i27));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            f59877e = i30 % 128;
            int i31 = i30 % 2;
            setenabled = setindeterminatetintblendmode3.f59881c;
            if (i31 != 0) {
                throw null;
            }
        } else {
            setIndeterminateTintBlendMode setindeterminatetintblendmode4 = (setIndeterminateTintBlendMode) objArr[0];
            int i32 = f59877e;
            int i33 = i32 & 21;
            int i34 = (i33 - (~((i32 ^ 21) | i33))) - 1;
            f59878f = i34 % 128;
            int i35 = i34 % 2;
            setenabled = setindeterminatetintblendmode4.f59879a;
            if (i35 == 0) {
                throw null;
            }
            int i36 = ((i32 ^ 105) | (i32 & 105)) << 1;
            int i37 = -(((~i32) & 105) | (i32 & (-106)));
            int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
            f59878f = i38 % 128;
            int i39 = i38 % 2;
        }
        return setenabled;
    }

    @NotNull
    public final setEnabled setDividerPadding() {
        return (setEnabled) setCompoundDrawableTintBlendMode(new Object[]{this}, 169008367, -169008365, System.identityHashCode(this));
    }

    @NotNull
    public final setEnabled setOnFocusChangeListener() {
        return (setEnabled) setCompoundDrawableTintBlendMode(new Object[]{this}, 1192711893, -1192711893, System.identityHashCode(this));
    }

    @NotNull
    public final setEnabled setY() {
        return (setEnabled) setCompoundDrawableTintBlendMode(new Object[]{this}, -1166597743, 1166597744, System.identityHashCode(this));
    }

    @NotNull
    public final setEnabled setCompoundDrawableTintBlendMode() {
        return (setEnabled) setCompoundDrawableTintBlendMode(new Object[]{this}, 1683462130, -1683462127, System.identityHashCode(this));
    }
}
