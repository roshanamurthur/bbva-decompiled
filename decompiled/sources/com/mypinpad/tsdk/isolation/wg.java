package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class wg extends wl {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final String f61637r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(@NotNull String str) {
        super(wm.setIncludeFontPadding, null);
        Intrinsics.checkNotNullParameter(str, "");
        this.f61637r0 = str;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return ((wg) objArr[0]).f61637r0;
    }

    @NotNull
    public final String setX() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -693116077, 693116077, System.identityHashCode(this));
    }
}
