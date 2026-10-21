package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setProgressBackgroundTintList extends setForeground {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final byte[] f60348p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setProgressBackgroundTintList(@NotNull byte[] bArr) {
        super(null);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f60348p0 = bArr;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return ((setProgressBackgroundTintList) objArr[0]).f60348p0;
    }

    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 467198636, -467198636, System.identityHashCode(this));
    }
}
