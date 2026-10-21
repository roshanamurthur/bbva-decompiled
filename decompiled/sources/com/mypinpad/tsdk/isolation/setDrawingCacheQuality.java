package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setDrawingCacheQuality extends setImeActionLabel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setDrawingCacheQuality(@NotNull byte[] bArr) {
        super(xs.GET_DATA, bArr[0], bArr[1], null, 0, 8, null);
        Intrinsics.checkNotNullParameter(bArr, "");
    }
}
