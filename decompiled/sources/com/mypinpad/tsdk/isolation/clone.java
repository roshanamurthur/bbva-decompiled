package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class clone implements onPinPadLaunchRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final getTotalElapsedTimeout[] f54828a;

    public clone(@NotNull getTotalElapsedTimeout[] gettotalelapsedtimeoutArr) {
        Intrinsics.checkNotNullParameter(gettotalelapsedtimeoutArr, "");
        this.f54828a = gettotalelapsedtimeoutArr;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        return ((clone) objArr[0]).f54828a;
    }

    @NotNull
    public final getTotalElapsedTimeout[] setDividerPadding() {
        return (getTotalElapsedTimeout[]) setX(new Object[]{this}, -415546477, 415546477, System.identityHashCode(this));
    }
}
