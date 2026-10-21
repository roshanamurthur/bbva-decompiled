package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class lp extends ec<lq, mc> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp(@NotNull lq lqVar, @NotNull setTextKeepState settextkeepstate, @NotNull mc mcVar) {
        super(lqVar, settextkeepstate, mcVar);
        Intrinsics.checkNotNullParameter(lqVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(mcVar, "");
    }
}
