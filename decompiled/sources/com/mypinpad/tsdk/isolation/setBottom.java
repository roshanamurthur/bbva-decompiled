package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setBottom implements onPinPadLaunchRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59501b = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f59502a;

    public setBottom(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f59502a = bArr;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        setBottom setbottom = (setBottom) objArr[0];
        int i13 = f59501b;
        int i14 = ((i13 ^ 83) | (i13 & 83)) << 1;
        int i15 = -(((~i13) & 83) | (i13 & (-84)));
        int i16 = (i14 & i15) + (i15 | i14);
        int i17 = i16 % 128;
        int i18 = i16 % 2;
        byte[] bArr = setbottom.f59502a;
        int i19 = (((i17 | 8) << 1) - (i17 ^ 8)) - 1;
        f59501b = i19 % 128;
        int i20 = i19 % 2;
        return bArr;
    }

    @NotNull
    public final byte[] setX() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -635582197, 635582197, System.identityHashCode(this));
    }
}
