package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setBreakStrategy extends setHorizontalScrollBarEnabled {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f59518e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final byte[] f59519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final byte[] f59520d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setBreakStrategy(@NotNull String str, @NotNull byte[] bArr, @NotNull byte[] bArr2) {
        super(str, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        this.f59519c = bArr;
        this.f59520d = bArr2;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-344)) + (i10 * (-344));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i14 | i15;
        if (((~(i16 | i12)) * 345) + (((~(i10 | i15)) | (~(i14 | (~i12)))) * 345) + (((~i16) | (~(i14 | i12))) * 345) + i13 != 1) {
            setBreakStrategy setbreakstrategy = (setBreakStrategy) objArr[0];
            int i17 = f59518e;
            int i18 = i17 ^ 75;
            int i19 = ((((i17 & 75) | i18) << 1) - (~(-i18))) - 1;
            int i20 = i19 % 128;
            int i21 = i19 % 2;
            byte[] bArr = setbreakstrategy.f59519c;
            int i22 = (i20 & (-86)) | ((~i20) & 85);
            int i23 = (i20 & 85) << 1;
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            f59518e = i24 % 128;
            int i25 = i24 % 2;
            return bArr;
        }
        setBreakStrategy setbreakstrategy2 = (setBreakStrategy) objArr[0];
        int i26 = f59518e;
        int i27 = i26 & 119;
        int i28 = (i27 - (~((i26 ^ 119) | i27))) - 1;
        int i29 = i28 % 128;
        int i30 = i28 % 2;
        byte[] bArr2 = setbreakstrategy2.f59520d;
        if (i30 == 0) {
            throw null;
        }
        int i31 = i26 & 105;
        int i32 = ((((i26 ^ 105) | i31) << 1) - (~(-((i26 | 105) & (~i31))))) - 1;
        int i33 = i32 % 128;
        int i34 = i32 % 2;
        return bArr2;
    }

    @NotNull
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setY(new Object[]{this}, -1690322503, 1690322504, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setX() {
        return (byte[]) setY(new Object[]{this}, -1496220400, 1496220400, System.identityHashCode(this));
    }
}
