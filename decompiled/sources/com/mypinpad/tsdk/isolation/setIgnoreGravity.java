package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setIgnoreGravity extends setFastScrollAlwaysVisible {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final byte[] f59822p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setIgnoreGravity(@NotNull byte[] bArr) {
        super(null);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f59822p0 = bArr;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        return ((setIgnoreGravity) objArr[0]).f59822p0;
    }

    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setY(new Object[]{this}, -956454107, 956454107, System.identityHashCode(this));
    }
}
