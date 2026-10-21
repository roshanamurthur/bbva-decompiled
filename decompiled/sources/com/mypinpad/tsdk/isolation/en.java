package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class en extends er {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ei f55389c;

    public en(@NotNull ei eiVar) {
        Intrinsics.checkNotNullParameter(eiVar, "");
        this.f55389c = eiVar;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        return ((en) objArr[0]).f55389c;
    }

    @Override // com.mypinpad.tsdk.isolation.er
    @NotNull
    public final ei setX() {
        return (ei) setOnFocusChangeListener(new Object[]{this}, -2051800787, 2051800787, System.identityHashCode(this));
    }
}
