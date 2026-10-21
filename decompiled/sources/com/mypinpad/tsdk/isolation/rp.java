package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rp extends ru {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final sg f58145p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp(@NotNull sg sgVar) {
        super(null);
        Intrinsics.checkNotNullParameter(sgVar, "");
        this.f58145p0 = sgVar;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        return ((rp) objArr[0]).f58145p0;
    }

    @NotNull
    public final sg setY() {
        return (sg) setY(new Object[]{this}, -1859324063, 1859324063, System.identityHashCode(this));
    }
}
