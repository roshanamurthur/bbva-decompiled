package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class setHovered extends setSystemGestureExclusionRects {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setHovered(int i10, @NotNull byte[] bArr) {
        super(i10);
        Intrinsics.checkNotNullParameter(bArr, "");
    }

    @NotNull
    public String toString() {
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        return "";
    }
}
