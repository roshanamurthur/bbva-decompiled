package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setLogoDescription extends setHorizontalScrollBarEnabled {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final byte[] f60044c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setLogoDescription(@NotNull String str, @NotNull byte[] bArr) {
        super(str, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f60044c = bArr;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        return ((setLogoDescription) objArr[0]).f60044c;
    }

    @NotNull
    public final byte[] setY() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1494206688, 1494206688, System.identityHashCode(this));
    }
}
