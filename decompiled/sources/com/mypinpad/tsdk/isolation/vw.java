package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class vw extends we {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final String f61583q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(@NotNull String str) {
        super(wf.setOnFocusChangeListener, null);
        Intrinsics.checkNotNullParameter(str, "");
        this.f61583q0 = str;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return ((vw) objArr[0]).f61583q0;
    }

    @NotNull
    public final String setX() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 950787359, -950787359, System.identityHashCode(this));
    }
}
