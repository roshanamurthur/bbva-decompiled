package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public abstract class x0 extends InputStream {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61702r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61703s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final InputStream f61704p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f61705q0;

    public x0(InputStream inputStream, int i10) {
        this.f61704p0 = inputStream;
        this.f61705q0 = i10;
    }

    public static /* synthetic */ Integer a(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int i13 = ((~(i11 | i12)) * TypedValues.CycleType.TYPE_EASING) + (i11 * 421) + (i10 * (-419));
        int i14 = ~i10;
        if ((((~(i14 | (~i11))) | (~(i11 | (~i12)))) * TypedValues.CycleType.TYPE_EASING) + ((i11 | i14) * (-420)) + i13 == 1) {
            x0 x0Var = (x0) objArr[0];
            int i15 = f61703s0;
            int i16 = i15 & 39;
            int i17 = i15 | 39;
            int i18 = (~i16) & i17;
            int i19 = i16 << 1;
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            f61702r0 = i20 % 128;
            int i21 = i20 % 2;
            int i22 = x0Var.f61705q0;
            if (i21 != 0) {
                int i23 = 18 / 0;
            }
            int i24 = (i17 << 1) - (i15 ^ 39);
            f61702r0 = i24 % 128;
            if (i24 % 2 == 0) {
                return Integer.valueOf(i22);
            }
            throw null;
        }
        x0 x0Var2 = (x0) objArr[0];
        int i25 = f61702r0 + 35;
        f61703s0 = i25 % 128;
        int i26 = i25 % 2;
        InputStream inputStream = x0Var2.f61704p0;
        if (i26 == 0) {
            boolean z10 = inputStream instanceof v0;
            throw null;
        }
        if (inputStream instanceof v0) {
            v0 v0Var = (v0) inputStream;
            v0.b(new Object[]{v0Var, Boolean.TRUE}, -2023474583, 2023474585, System.identityHashCode(v0Var));
            int i27 = f61702r0;
            int i28 = i27 ^ 5;
            int i29 = -(-((i27 & 5) << 1));
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            f61703s0 = i30 % 128;
            int i31 = i30 % 2;
        }
        int i32 = f61702r0 + 103;
        f61703s0 = i32 % 128;
        if (i32 % 2 != 0) {
            return null;
        }
        int i33 = 49 / 0;
        return null;
    }
}
