package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class bm extends w<bp> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(@NotNull getBeepOnFailure getbeeponfailure) {
        super(getbeeponfailure, setAnimation.TransactionNotAuthorised(), new bp());
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
    }
}
