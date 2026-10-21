package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class hh extends eb<gv, ex> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate, @NotNull ex exVar, @NotNull getValue getvalue) {
        super(gvVar, settextkeepstate, exVar, getvalue);
        Intrinsics.checkNotNullParameter(gvVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(exVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
    }
}
