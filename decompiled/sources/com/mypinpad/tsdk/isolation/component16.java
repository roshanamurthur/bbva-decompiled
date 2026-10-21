package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class component16 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f54861a;

    public component16(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        this.f54861a = bArr2;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        return ((component16) objArr[0]).f54861a;
    }

    @NotNull
    public final byte[] setY() {
        return (byte[]) setX(new Object[]{this}, 1060578903, -1060578903, System.identityHashCode(this));
    }
}
