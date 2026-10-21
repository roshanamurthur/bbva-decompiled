package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends w<aa> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@NotNull getBeepOnFailure getbeeponfailure) {
        super(getbeeponfailure, setAnimation.onPinPadLaunchRequest(), new aa());
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        super(setscrollbardefaultdelaybeforefade, setAnimation.onPinPadLaunchRequest(), new aa());
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
    }
}
