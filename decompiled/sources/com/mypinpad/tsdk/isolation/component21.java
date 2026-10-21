package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class component21 extends setSystemGestureExclusionRects {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54866c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f54867d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final component16 f54868b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public component21(int i10, @Nullable component16 component16Var, @NotNull byte[] bArr, @NotNull byte[] bArr2) {
        super(i10);
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        this.f54868b = component16Var;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        component21 component21Var = (component21) objArr[0];
        int i13 = f54867d;
        int i14 = (i13 ^ 39) + ((i13 & 39) << 1);
        f54866c = i14 % 128;
        int i15 = i14 % 2;
        component16 component16Var = component21Var.f54868b;
        int i16 = ((i13 ^ 43) | (i13 & 43)) << 1;
        int i17 = -(((~i13) & 43) | (i13 & (-44)));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        f54866c = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = 81 / 0;
        }
        return component16Var;
    }

    @NotNull
    public String toString() {
        int i10 = f54866c + 55;
        f54867d = i10 % 128;
        int i11 = i10 % 2;
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i12 = f54866c;
        int i13 = ((-1) << 1) - ((-1) ^ (((i12 | 42) << 1) - (i12 ^ 42)));
        f54867d = i13 % 128;
        if (i13 % 2 != 0) {
            return "";
        }
        throw null;
    }

    @Nullable
    public final component16 setY() {
        return (component16) setY(new Object[]{this}, -730159684, 730159684, System.identityHashCode(this));
    }
}
