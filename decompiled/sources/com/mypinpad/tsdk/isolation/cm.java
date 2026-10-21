package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class cm extends w<cn> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm(@NotNull getBeepOnFailure getbeeponfailure) {
        super(getbeeponfailure, setAnimation.getHoldTime(), new cn());
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
    }
}
