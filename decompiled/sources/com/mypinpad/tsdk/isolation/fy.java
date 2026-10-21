package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class fy extends eb<fi, gr> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy(@NotNull fi fiVar, @NotNull setTextKeepState settextkeepstate, @NotNull gr grVar, @NotNull getValue getvalue) {
        super(fiVar, settextkeepstate, grVar, getvalue);
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(grVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
    }
}
