package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class bj extends w<bo> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(@NotNull getBeepOnFailure getbeeponfailure) {
        super(getbeeponfailure, setAnimation.setOnGroupClickListener(), new bo());
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        super(setscrollbardefaultdelaybeforefade, setAnimation.setOnGroupClickListener(), new bo());
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
    }
}
