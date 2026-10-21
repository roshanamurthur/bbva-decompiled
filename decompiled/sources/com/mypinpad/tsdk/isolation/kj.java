package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class kj extends ec<ka, kw> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(@NotNull ka kaVar, @NotNull setTextKeepState settextkeepstate, @NotNull kw kwVar) {
        super(kaVar, settextkeepstate, kwVar);
        Intrinsics.checkNotNullParameter(kaVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(kwVar, "");
    }
}
