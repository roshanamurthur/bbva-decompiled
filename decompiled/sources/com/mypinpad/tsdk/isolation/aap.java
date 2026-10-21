package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class aap extends IOException {

    @JvmField
    @NotNull
    public final aac setY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aap(@NotNull aac aacVar) {
        super(Intrinsics.stringPlus("stream was reset: ", aacVar));
        Intrinsics.checkNotNullParameter(aacVar, "");
        this.setY = aacVar;
    }
}
