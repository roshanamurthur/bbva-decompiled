package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class hm extends ec<gv, ex> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate, @NotNull ex exVar) {
        super(gvVar, settextkeepstate, exVar);
        Intrinsics.checkNotNullParameter(gvVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(exVar, "");
    }
}
