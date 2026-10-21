package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class writeReplace extends setImeActionLabel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public writeReplace(@NotNull byte[] bArr) {
        super(xs.SELECT, bArr, 0);
        Intrinsics.checkNotNullParameter(bArr, "");
    }
}
