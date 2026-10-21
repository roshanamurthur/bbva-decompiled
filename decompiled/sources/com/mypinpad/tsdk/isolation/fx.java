package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class fx extends ec<fi, gr> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx(@NotNull fi fiVar, @NotNull setTextKeepState settextkeepstate, @NotNull gr grVar) {
        super(fiVar, settextkeepstate, grVar);
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(grVar, "");
    }
}
