package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class addSuppressed extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addSuppressed(@NotNull Throwable th2) {
        super(th2);
        Intrinsics.checkNotNullParameter(th2, "");
    }
}
