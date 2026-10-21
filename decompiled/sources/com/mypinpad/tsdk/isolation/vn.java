package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class vn extends wl {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final vj f61573r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(@NotNull vj vjVar) {
        super(wm.setCompoundDrawableTintBlendMode, null);
        Intrinsics.checkNotNullParameter(vjVar, "");
        this.f61573r0 = vjVar;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        return ((vn) objArr[0]).f61573r0;
    }

    @NotNull
    public final vj setX() {
        return (vj) setY(new Object[]{this}, -467680945, 467680945, System.identityHashCode(this));
    }
}
