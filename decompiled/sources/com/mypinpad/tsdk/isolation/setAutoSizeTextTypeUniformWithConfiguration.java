package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class setAutoSizeTextTypeUniformWithConfiguration extends setSystemGestureExclusionRects {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final byte[] f59467b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setAutoSizeTextTypeUniformWithConfiguration(int i10, @Nullable component16 component16Var, @NotNull byte[] bArr, @NotNull byte[] bArr2) {
        super(i10);
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        this.f59467b = bArr2;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return ((setAutoSizeTextTypeUniformWithConfiguration) objArr[0]).f59467b;
    }

    @NotNull
    public String toString() {
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        return "";
    }

    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -1212975506, 1212975506, System.identityHashCode(this));
    }
}
