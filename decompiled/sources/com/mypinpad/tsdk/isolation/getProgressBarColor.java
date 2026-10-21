package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getProgressBarColor extends Endpoint {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f55954q0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final byte[] f55955p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getProgressBarColor(@NotNull byte[] bArr) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f55955p0 = bArr;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        getProgressBarColor getprogressbarcolor = (getProgressBarColor) objArr[0];
        int i13 = f55954q0;
        int i14 = i13 & 63;
        int i15 = -(-((i13 ^ 63) | i14));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        int i17 = i16 % 128;
        int i18 = i16 % 2;
        byte[] bArr = getprogressbarcolor.f55955p0;
        if (i18 != 0) {
            throw null;
        }
        int i19 = i17 + 123;
        f55954q0 = i19 % 128;
        if (i19 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    @NotNull
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -2055569254, 2055569254, System.identityHashCode(this));
    }
}
