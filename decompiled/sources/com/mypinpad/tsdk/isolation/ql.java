package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ql implements setVerticalScrollbarPosition {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f57885p0;

    public ql(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f57885p0 = str;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        return ((ql) objArr[0]).f57885p0;
    }

    @NotNull
    public final String setX() {
        return (String) setY(new Object[]{this}, 644790750, -644790750, System.identityHashCode(this));
    }
}
