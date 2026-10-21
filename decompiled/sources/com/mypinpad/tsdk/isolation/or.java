package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class or extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(@NotNull Throwable th2) {
        super(th2);
        Intrinsics.checkNotNullParameter(th2, "");
    }
}
