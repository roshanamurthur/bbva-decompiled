package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class is extends ec<im, iu> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is(@NotNull im imVar, @NotNull setTextKeepState settextkeepstate, @NotNull iu iuVar) {
        super(imVar, settextkeepstate, iuVar);
        Intrinsics.checkNotNullParameter(imVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(iuVar, "");
    }
}
