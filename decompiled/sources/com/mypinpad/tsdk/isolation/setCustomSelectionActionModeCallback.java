package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setCustomSelectionActionModeCallback extends setStateListAnimator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59613b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setInterpolator f59614a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setCustomSelectionActionModeCallback(@NotNull setInterpolator setinterpolator) {
        super(null);
        Intrinsics.checkNotNullParameter(setinterpolator, "");
        this.f59614a = setinterpolator;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        setCustomSelectionActionModeCallback setcustomselectionactionmodecallback = (setCustomSelectionActionModeCallback) objArr[0];
        int i13 = f59613b;
        int i14 = i13 & 21;
        int i15 = (((i13 | 21) & (~i14)) - (~(i14 << 1))) - 1;
        int i16 = i15 % 128;
        int i17 = i15 % 2;
        setInterpolator setinterpolator = setcustomselectionactionmodecallback.f59614a;
        int i18 = i16 & 59;
        int i19 = (i16 | 59) & (~i18);
        int i20 = i18 << 1;
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        f59613b = i21 % 128;
        int i22 = i21 % 2;
        return setinterpolator;
    }

    @NotNull
    public final setInterpolator setOnFocusChangeListener() {
        return (setInterpolator) setX(new Object[]{this}, -282972840, 282972840, System.identityHashCode(this));
    }
}
