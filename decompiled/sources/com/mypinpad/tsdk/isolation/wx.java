package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class wx extends wi {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final sq f61695r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx(@NotNull sq sqVar) {
        super(wm.setOnLongClickListener, null);
        Intrinsics.checkNotNullParameter(sqVar, "");
        this.f61695r0 = sqVar;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        return ((wx) objArr[0]).f61695r0;
    }

    @NotNull
    public final sq setX() {
        return (sq) setOnFocusChangeListener(new Object[]{this}, 1875100269, -1875100269, System.identityHashCode(this));
    }
}
