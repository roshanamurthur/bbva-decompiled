package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getPinDigitTintColor extends setStateListAnimator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55938c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55939d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f55940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final byte[] f55941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getPinDigitTintColor(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        super(null);
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        this.f55940a = bArr;
        this.f55941b = bArr2;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = ~i12;
        int i17 = (~(i13 | i16)) | i15 | (~(i14 | i16));
        int i18 = i10 | i11;
        int i19 = ((i17 | (~(i18 | i12))) * (-84)) + (i11 * 85) + (i10 * 85);
        int i20 = i10 | (~(i12 | i14));
        int i21 = ~(i11 | i16);
        if (((i21 | (~i18)) * 84) + ((i20 | i21) * (-84)) + i19 == 1) {
            getPinDigitTintColor getpindigittintcolor = (getPinDigitTintColor) objArr[0];
            int i22 = f55938c;
            int i23 = (i22 & 13) + (i22 | 13);
            f55939d = i23 % 128;
            int i24 = i23 % 2;
            byte[] bArr = getpindigittintcolor.f55941b;
            int i25 = ((i22 | 51) << 1) - (i22 ^ 51);
            f55939d = i25 % 128;
            int i26 = i25 % 2;
            return bArr;
        }
        getPinDigitTintColor getpindigittintcolor2 = (getPinDigitTintColor) objArr[0];
        int i27 = f55939d;
        int i28 = i27 & 115;
        int i29 = i27 | 115;
        int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
        f55938c = i30 % 128;
        int i31 = i30 % 2;
        byte[] bArr2 = getpindigittintcolor2.f55940a;
        int i32 = i27 & 73;
        int i33 = ((i27 | 73) & (~i32)) + (i32 << 1);
        f55938c = i33 % 128;
        int i34 = i33 % 2;
        return bArr2;
    }

    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setY(new Object[]{this}, -294745519, 294745519, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setY() {
        return (byte[]) setY(new Object[]{this}, 579785128, -579785127, System.identityHashCode(this));
    }
}
