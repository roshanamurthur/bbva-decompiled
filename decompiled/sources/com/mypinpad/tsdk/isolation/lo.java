package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class lo extends eb<lq, mc> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo(@NotNull lq lqVar, @NotNull setTextKeepState settextkeepstate, @NotNull mc mcVar, @NotNull getValue getvalue) {
        super(lqVar, settextkeepstate, mcVar, getvalue);
        Intrinsics.checkNotNullParameter(lqVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(mcVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
    }
}
