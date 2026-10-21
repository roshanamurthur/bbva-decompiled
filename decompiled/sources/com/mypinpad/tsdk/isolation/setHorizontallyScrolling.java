package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setHorizontallyScrolling extends setForeground {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final byte[] f59807p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setHorizontallyScrolling(@NotNull byte[] bArr) {
        super(null);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f59807p0 = bArr;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return ((setHorizontallyScrolling) objArr[0]).f59807p0;
    }

    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 758296987, -758296987, System.identityHashCode(this));
    }
}
