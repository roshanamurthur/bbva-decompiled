package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setImageBitmap implements onPinPadLaunchRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setOnTouchListener[] f59823a;

    public setImageBitmap(@NotNull setOnTouchListener[] setontouchlistenerArr) {
        Intrinsics.checkNotNullParameter(setontouchlistenerArr, "");
        this.f59823a = setontouchlistenerArr;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        return ((setImageBitmap) objArr[0]).f59823a;
    }

    @NotNull
    public final setOnTouchListener[] setY() {
        return (setOnTouchListener[]) setDividerPadding(new Object[]{this}, 1672320017, -1672320017, System.identityHashCode(this));
    }
}
