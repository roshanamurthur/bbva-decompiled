package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setHasTransientState extends setImeActionLabel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setHasTransientState(@NotNull byte[] bArr) {
        super(xs.EXCHANGE_RELAY_RESISTANCE_DATA, bArr, 0);
        Intrinsics.checkNotNullParameter(bArr, "");
    }
}
