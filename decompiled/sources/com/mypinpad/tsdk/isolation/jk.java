package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class jk extends ec<iv, kc> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(@NotNull iv ivVar, @NotNull setTextKeepState settextkeepstate, @NotNull kc kcVar) {
        super(ivVar, settextkeepstate, kcVar);
        Intrinsics.checkNotNullParameter(ivVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(kcVar, "");
    }
}
