package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class gn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56045d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f56046e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final fi f56047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final component10 f56048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final setFontFeatureSettings f56049c;

    public gn(@NotNull fi fiVar, @NotNull component10 component10Var, @NotNull setFontFeatureSettings setfontfeaturesettings) {
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        this.f56047a = fiVar;
        this.f56048b = component10Var;
        this.f56049c = setfontfeaturesettings;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Exception {
        gn gnVar = (gn) objArr[0];
        int i13 = f56046e;
        int i14 = ((i13 & 4) + (i13 | 4)) - 1;
        f56045d = i14 % 128;
        if (i14 % 2 != 0) {
            ee eeVar = ee.setDividerPadding;
            ee.setOnFocusChangeListener(new Object[]{gnVar.f56047a, gnVar.f56048b, gnVar.f56049c, Boolean.FALSE}, 844101167, -844101167, (int) System.currentTimeMillis());
        } else {
            ee eeVar2 = ee.setDividerPadding;
            ee.setOnFocusChangeListener(new Object[]{gnVar.f56047a, gnVar.f56048b, gnVar.f56049c, Boolean.FALSE}, 844101167, -844101167, (int) System.currentTimeMillis());
        }
        int i15 = f56045d;
        int i16 = ((i15 | 3) << 1) - (i15 ^ 3);
        f56046e = i16 % 128;
        int i17 = i16 % 2;
        return null;
    }

    public final void setOnFocusChangeListener() throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this}, 210093159, -210093159, System.identityHashCode(this));
    }
}
