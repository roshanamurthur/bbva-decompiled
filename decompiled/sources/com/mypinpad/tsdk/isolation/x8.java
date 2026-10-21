package com.mypinpad.tsdk.isolation;

import java.security.SecureRandomSpi;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class x8 extends SecureRandomSpi {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61756q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61757r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final setTextSelectHandleLeft f61758p0;

    public x8(@NotNull setTextSelectHandleLeft settextselecthandleleft) {
        Intrinsics.checkNotNullParameter(settextselecthandleleft, "");
        this.f61758p0 = settextselecthandleleft;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-463)) + (i10 * 465);
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = ~(i14 | i15);
        int i17 = ~(i14 | i10);
        int i18 = (((~(i10 | i12)) | i17) * 464) + ((i14 | (~i10) | i12) * (-464)) + (((~(i15 | i10)) | i16 | i17) * 464) + i13;
        if (i18 == 1) {
            x8 x8Var = (x8) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int i19 = f61757r0;
            int i20 = i19 ^ 99;
            int i21 = -(-((i19 & 99) << 1));
            int i22 = (i20 & i21) + (i21 | i20);
            f61756q0 = i22 % 128;
            if (i22 % 2 == 0) {
                Intrinsics.checkNotNullParameter(bArr, "");
                x8Var.f61758p0.setX(bArr);
                return null;
            }
            Intrinsics.checkNotNullParameter(bArr, "");
            x8Var.f61758p0.setX(bArr);
            throw null;
        }
        if (i18 != 2) {
            x8 x8Var2 = (x8) objArr[0];
            byte[] bArr2 = (byte[]) objArr[1];
            int i23 = f61757r0 + 121;
            f61756q0 = i23 % 128;
            if (i23 % 2 != 0) {
                Intrinsics.checkNotNullParameter(bArr2, "");
                ArraysKt___ArraysJvmKt.copyInto$default(x8Var2.f61758p0.setX(bArr2.length), bArr2, 0, 0, 0, 110, (Object) null);
                return null;
            }
            Intrinsics.checkNotNullParameter(bArr2, "");
            ArraysKt___ArraysJvmKt.copyInto$default(x8Var2.f61758p0.setX(bArr2.length), bArr2, 0, 0, 0, 14, (Object) null);
            return null;
        }
        x8 x8Var3 = (x8) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i24 = f61756q0;
        int i25 = i24 & 115;
        int i26 = ((i24 ^ 115) | i25) << 1;
        int i27 = -((i24 | 115) & (~i25));
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        f61757r0 = i28 % 128;
        int i29 = i28 % 2;
        byte[] x4 = x8Var3.f61758p0.setX(iIntValue);
        int i30 = f61757r0;
        int i31 = (i30 & (-116)) | ((~i30) & 115);
        int i32 = (i30 & 115) << 1;
        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
        f61756q0 = i33 % 128;
        int i34 = i33 % 2;
        return x4;
    }

    @Override // java.security.SecureRandomSpi
    @NotNull
    public final byte[] engineGenerateSeed(int i10) {
        return (byte[]) a(new Object[]{this, Integer.valueOf(i10)}, 298817354, -298817352, i10);
    }

    @Override // java.security.SecureRandomSpi
    public final void engineNextBytes(@NotNull byte[] bArr) {
        a(new Object[]{this, bArr}, -1292710777, 1292710777, System.identityHashCode(this));
    }

    @Override // java.security.SecureRandomSpi
    public final void engineSetSeed(@NotNull byte[] bArr) {
        a(new Object[]{this, bArr}, 1245463560, -1245463559, System.identityHashCode(this));
    }
}
