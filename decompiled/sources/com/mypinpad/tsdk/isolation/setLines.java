package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setLines implements onPinPadLaunchRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f60010a;

    public setLines(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f60010a = str;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        return ((setLines) objArr[0]).f60010a;
    }

    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setDividerPadding(new Object[]{this}, -57626913, 57626913, System.identityHashCode(this));
    }
}
