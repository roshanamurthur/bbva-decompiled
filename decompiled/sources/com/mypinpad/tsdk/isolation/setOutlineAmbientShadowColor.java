package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setOutlineAmbientShadowColor extends setOnCapturedPointerListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f60268p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setOutlineAmbientShadowColor(@NotNull Throwable th2, int i10) {
        super(th2, null);
        Intrinsics.checkNotNullParameter(th2, "");
        this.f60268p0 = i10;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        return Integer.valueOf(((setOutlineAmbientShadowColor) objArr[0]).f60268p0);
    }

    public final int setOnFocusChangeListener() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 958029167, -958029167, System.identityHashCode(this))).intValue();
    }
}
