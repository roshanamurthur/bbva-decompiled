package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setOnReceiveContentListener implements onPinPadLaunchRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setOverScrollMode[] f60255a;

    public setOnReceiveContentListener(@NotNull setOverScrollMode[] setoverscrollmodeArr) {
        Intrinsics.checkNotNullParameter(setoverscrollmodeArr, "");
        this.f60255a = setoverscrollmodeArr;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        return ((setOnReceiveContentListener) objArr[0]).f60255a;
    }

    @NotNull
    public final setOverScrollMode[] setY() {
        return (setOverScrollMode[]) setOnFocusChangeListener(new Object[]{this}, 1138677152, -1138677152, System.identityHashCode(this));
    }
}
