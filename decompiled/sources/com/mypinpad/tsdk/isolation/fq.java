package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class fq extends w<fr> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq(@NotNull fi fiVar) {
        super(fiVar, setAnimation.setWindowInsetsAnimationCallback(), new fr());
        Intrinsics.checkNotNullParameter(fiVar, "");
    }
}
