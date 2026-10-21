package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class setSelectionAfterHeaderView extends description {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setSelectionAfterHeaderView(int i10, @Nullable component16 component16Var, @NotNull byte[] bArr, @NotNull byte[] bArr2) {
        super(i10, component16Var, bArr, bArr2);
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
    }

    @Override // com.mypinpad.tsdk.isolation.description
    @NotNull
    public String toString() {
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        return "";
    }
}
