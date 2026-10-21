package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class PinViewports extends setStateListAnimator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f51799b = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setFastScrollAlwaysVisible f51800a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinViewports(@NotNull setFastScrollAlwaysVisible setfastscrollalwaysvisible) {
        super(null);
        Intrinsics.checkNotNullParameter(setfastscrollalwaysvisible, "");
        this.f51800a = setfastscrollalwaysvisible;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        PinViewports pinViewports = (PinViewports) objArr[0];
        int i13 = (-2) - ((f51799b + 96) ^ (-1));
        int i14 = i13 % 128;
        int i15 = i13 % 2;
        setFastScrollAlwaysVisible setfastscrollalwaysvisible = pinViewports.f51800a;
        if (i15 != 0) {
            throw null;
        }
        int i16 = i14 & 67;
        int i17 = (((i14 | 67) & (~i16)) - (~(i16 << 1))) - 1;
        f51799b = i17 % 128;
        int i18 = i17 % 2;
        return setfastscrollalwaysvisible;
    }

    @NotNull
    public final setFastScrollAlwaysVisible setOnFocusChangeListener() {
        return (setFastScrollAlwaysVisible) setOnFocusChangeListener(new Object[]{this}, -237980738, 237980738, System.identityHashCode(this));
    }
}
