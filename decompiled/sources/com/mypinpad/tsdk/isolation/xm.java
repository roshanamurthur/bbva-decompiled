package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class xm extends we {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final rs f61862q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(@NotNull rs rsVar) {
        super(wf.setX, null);
        Intrinsics.checkNotNullParameter(rsVar, "");
        this.f61862q0 = rsVar;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return ((xm) objArr[0]).f61862q0;
    }

    @NotNull
    public final rs setY() {
        return (rs) setCompoundDrawableTintBlendMode(new Object[]{this}, -1823305834, 1823305834, System.identityHashCode(this));
    }
}
