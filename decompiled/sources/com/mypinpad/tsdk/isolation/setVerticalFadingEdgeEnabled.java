package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setVerticalFadingEdgeEnabled extends Endpoint {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final getPinPadPortrait f60809p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setVerticalFadingEdgeEnabled(@NotNull getPinPadPortrait getpinpadportrait) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(getpinpadportrait, "");
        this.f60809p0 = getpinpadportrait;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        return ((setVerticalFadingEdgeEnabled) objArr[0]).f60809p0;
    }

    @NotNull
    public final getPinPadPortrait setX() {
        return (getPinPadPortrait) setDividerPadding(new Object[]{this}, -1284781652, 1284781652, System.identityHashCode(this));
    }
}
