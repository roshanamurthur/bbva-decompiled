package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ah extends w<an> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        super(setscrollbardefaultdelaybeforefade, setAnimation.setMaxEms(), new an());
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(@NotNull getBeepOnFailure getbeeponfailure) {
        super(getbeeponfailure, setAnimation.setMaxEms(), new an());
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
    }
}
