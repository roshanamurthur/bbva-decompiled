package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class x extends w<z> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@NotNull getBeepOnFailure getbeeponfailure) {
        super(getbeeponfailure, setAnimation.getTransactionPortrait(), new z());
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        super(setscrollbardefaultdelaybeforefade, setAnimation.getTransactionPortrait(), new z());
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
    }
}
