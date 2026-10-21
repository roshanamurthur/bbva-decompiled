package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class description extends setSystemGestureExclusionRects {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55161c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55162d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final component16 f55163b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public description(int i10, @Nullable component16 component16Var, @NotNull byte[] bArr, @NotNull byte[] bArr2) {
        super(i10);
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        this.f55163b = component16Var;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        description descriptionVar = (description) objArr[0];
        int i13 = f55162d;
        int i14 = i13 & 125;
        int i15 = i13 | 125;
        int i16 = (i14 & i15) + (i15 | i14);
        f55161c = i16 % 128;
        int i17 = i16 % 2;
        component16 component16Var = descriptionVar.f55163b;
        if (i17 == 0) {
            return component16Var;
        }
        throw null;
    }

    @NotNull
    public String toString() {
        int i10 = f55161c;
        int i11 = (i10 & 88) + (i10 | 88);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f55162d = i12 % 128;
        int i13 = i12 % 2;
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i14 = f55161c;
        int i15 = (i14 & (-16)) | ((~i14) & 15);
        int i16 = -(-((i14 & 15) << 1));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        f55162d = i17 % 128;
        if (i17 % 2 != 0) {
            return "";
        }
        throw null;
    }

    @Nullable
    public final component16 setY() {
        return (component16) setY(new Object[]{this}, -1747010824, 1747010824, System.identityHashCode(this));
    }
}
