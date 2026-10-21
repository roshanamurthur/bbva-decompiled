package com.mypinpad.tsdk.isolation;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class xw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final zl f61961a;

    public xw() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(timeUnit, "");
        zl zlVar = new zl(zd.setY, 5, 5L, timeUnit);
        Intrinsics.checkNotNullParameter(zlVar, "");
        this.f61961a = zlVar;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        return ((xw) objArr[0]).f61961a;
    }

    @NotNull
    public final zl setOnFocusChangeListener() {
        return (zl) setX(new Object[]{this}, -225198590, 225198590, System.identityHashCode(this));
    }
}
