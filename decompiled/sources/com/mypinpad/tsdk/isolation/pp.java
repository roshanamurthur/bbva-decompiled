package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class pp extends px {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final pq f57735a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp(@NotNull pq pqVar) {
        super(null);
        Intrinsics.checkNotNullParameter(pqVar, "");
        this.f57735a = pqVar;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        return ((pp) objArr[0]).f57735a;
    }

    @NotNull
    public final pq setX() {
        return (pq) setX(new Object[]{this}, 1001409743, -1001409743, System.identityHashCode(this));
    }
}
