package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class component27 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f54871a;

    public component27(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f54871a = str;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return ((component27) objArr[0]).f54871a;
    }

    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 1232690187, -1232690187, System.identityHashCode(this));
    }
}
