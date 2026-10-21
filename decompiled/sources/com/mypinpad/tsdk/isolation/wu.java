package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class wu extends we {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final String f61692q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu(@NotNull String str) {
        super(wf.setDividerPadding, null);
        Intrinsics.checkNotNullParameter(str, "");
        this.f61692q0 = str;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return ((wu) objArr[0]).f61692q0;
    }

    @NotNull
    public final String setDividerPadding() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 1357539670, -1357539670, System.identityHashCode(this));
    }
}
