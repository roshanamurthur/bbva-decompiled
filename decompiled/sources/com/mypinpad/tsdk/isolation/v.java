package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class v extends w<s> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        super(setscrollbardefaultdelaybeforefade, setAnimation.setOnTouchListener(), new s());
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
    }
}
