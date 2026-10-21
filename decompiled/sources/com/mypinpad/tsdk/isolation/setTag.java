package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setTag extends setForeground {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f60628p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setTag(@NotNull String str) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.f60628p0 = str;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        return ((setTag) objArr[0]).f60628p0;
    }

    @NotNull
    public final String setX() {
        return (String) setDividerPadding(new Object[]{this}, 1271190134, -1271190134, System.identityHashCode(this));
    }
}
