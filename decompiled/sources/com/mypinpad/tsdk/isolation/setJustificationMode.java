package com.mypinpad.tsdk.isolation;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setJustificationMode implements onPinPadLaunchRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Pair<byte[][], byte[]> f59934a;

    public setJustificationMode(@NotNull Pair<byte[][], byte[]> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        this.f59934a = pair;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return ((setJustificationMode) objArr[0]).f59934a;
    }

    @NotNull
    public final Pair<byte[][], byte[]> setY() {
        return (Pair) setCompoundDrawableTintBlendMode(new Object[]{this}, 1009725734, -1009725734, System.identityHashCode(this));
    }
}
