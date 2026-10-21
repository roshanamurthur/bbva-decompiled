package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setBackgroundTintBlendMode extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setBackgroundTintBlendMode(@NotNull initCause.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode) {
        super(String.valueOf(setcompounddrawabletintblendmode.ordinal()));
        Intrinsics.checkNotNullParameter(setcompounddrawabletintblendmode, "");
    }
}
