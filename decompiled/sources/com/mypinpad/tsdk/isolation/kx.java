package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class kx extends eb<kz, lj> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(@NotNull kz kzVar, @NotNull setTextKeepState settextkeepstate, @NotNull lj ljVar, @NotNull getValue getvalue) {
        super(kzVar, settextkeepstate, ljVar, getvalue);
        Intrinsics.checkNotNullParameter(kzVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(ljVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
    }
}
