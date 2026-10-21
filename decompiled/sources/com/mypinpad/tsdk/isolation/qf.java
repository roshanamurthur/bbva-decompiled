package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class qf extends qh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final qx f57860a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(@NotNull qx qxVar) {
        super(null);
        Intrinsics.checkNotNullParameter(qxVar, "");
        this.f57860a = qxVar;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        return ((qf) objArr[0]).f57860a;
    }

    @NotNull
    public final qx setDividerPadding() {
        return (qx) setX(new Object[]{this}, -752372192, 752372192, System.identityHashCode(this));
    }
}
