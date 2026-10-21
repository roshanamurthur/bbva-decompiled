package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class kd extends w<kh> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        super(setscrollbardefaultdelaybeforefade, setAnimation.compareTo(), new kh());
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(@NotNull getBeepOnFailure getbeeponfailure) {
        super(getbeeponfailure, setAnimation.compareTo(), new kh());
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
    }
}
