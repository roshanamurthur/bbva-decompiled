package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setVerticalGravity extends setWeightSum {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60810b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f60811a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setVerticalGravity(@NotNull byte[] bArr) {
        super(null);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f60811a = bArr;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        setVerticalGravity setverticalgravity = (setVerticalGravity) objArr[0];
        int i13 = f60810b;
        int i14 = (i13 & 103) + (i13 | 103);
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        byte[] bArr = setverticalgravity.f60811a;
        int i17 = ((i15 ^ 119) - (~(-(-((i15 & 119) << 1))))) - 1;
        f60810b = i17 % 128;
        int i18 = i17 % 2;
        return bArr;
    }

    @NotNull
    public final byte[] setY() {
        return (byte[]) setX(new Object[]{this}, -757264562, 757264562, System.identityHashCode(this));
    }
}
