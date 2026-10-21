package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setOnApplyWindowInsetsListener extends Endpoint {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final setForeground f60184p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setOnApplyWindowInsetsListener(@NotNull setForeground setforeground) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(setforeground, "");
        this.f60184p0 = setforeground;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        return ((setOnApplyWindowInsetsListener) objArr[0]).f60184p0;
    }

    @NotNull
    public final setForeground setX() {
        return (setForeground) setDividerPadding(new Object[]{this}, -2053129835, 2053129835, System.identityHashCode(this));
    }
}
