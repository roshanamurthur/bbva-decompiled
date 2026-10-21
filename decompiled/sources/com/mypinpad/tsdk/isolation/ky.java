package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ky extends ec<kz, lj> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky(@NotNull kz kzVar, @NotNull setTextKeepState settextkeepstate, @NotNull lj ljVar) {
        super(kzVar, settextkeepstate, ljVar);
        Intrinsics.checkNotNullParameter(kzVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(ljVar, "");
    }
}
