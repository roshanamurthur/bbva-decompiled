package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getDescription extends setFastScrollAlwaysVisible {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f55760q0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final byte[] f55761p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDescription(@NotNull byte[] bArr) {
        super(null);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f55761p0 = bArr;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        getDescription getdescription = (getDescription) objArr[0];
        int i13 = f55760q0;
        int i14 = (i13 & 111) + (i13 | 111);
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        byte[] bArr = getdescription.f55761p0;
        if (i16 == 0) {
            int i17 = 67 / 0;
        }
        int i18 = i15 & 119;
        int i19 = (i15 | 119) & (~i18);
        int i20 = -(-(i18 << 1));
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        f55760q0 = i21 % 128;
        if (i21 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setY(new Object[]{this}, 2045952693, -2045952693, System.identityHashCode(this));
    }
}
