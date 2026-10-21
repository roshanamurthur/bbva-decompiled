package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setVerticalScrollbarThumbDrawable extends setForeground {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final byte[] f60814p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setVerticalScrollbarThumbDrawable(@NotNull byte[] bArr) {
        super(null);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f60814p0 = bArr;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        return ((setVerticalScrollbarThumbDrawable) objArr[0]).f60814p0;
    }

    @NotNull
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setX(new Object[]{this}, 1652741037, -1652741037, System.identityHashCode(this));
    }
}
