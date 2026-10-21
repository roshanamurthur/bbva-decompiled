package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ae extends w<af> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(@NotNull getBeepOnFailure getbeeponfailure) {
        super(getbeeponfailure, setAnimation.setEnabled(), new af());
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        super(setscrollbardefaultdelaybeforefade, setAnimation.setEnabled(), new af());
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
    }
}
