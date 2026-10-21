package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class vf extends vj {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61547r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61548s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final rk f61549p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final qw f61550q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(@NotNull rk rkVar, @Nullable qw qwVar) {
        super(null);
        Intrinsics.checkNotNullParameter(rkVar, "");
        this.f61549p0 = rkVar;
        this.f61550q0 = qwVar;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = ((i10 | i12) * (-50)) + (i11 * (-49)) + (i10 * 51);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~(i14 | i15 | i12);
        int i17 = ~i12;
        int i18 = i15 | i17;
        if ((((~(i10 | i17)) | (~(i15 | i10)) | (~i18)) * 50) + ((i16 | (~(i18 | i10))) * 50) + i13 != 1) {
            vf vfVar = (vf) objArr[0];
            int i19 = f61548s0;
            int i20 = (((i19 | 48) << 1) - (i19 ^ 48)) - 1;
            int i21 = i20 % 128;
            f61547r0 = i21;
            int i22 = i20 % 2;
            obj = vfVar.f61550q0;
            int i23 = i21 + 35;
            f61548s0 = i23 % 128;
            if (i23 % 2 == 0) {
                throw null;
            }
        } else {
            vf vfVar2 = (vf) objArr[0];
            int i24 = f61547r0;
            int i25 = (i24 & (-124)) | ((~i24) & 123);
            int i26 = -(-((i24 & 123) << 1));
            int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
            f61548s0 = i27 % 128;
            int i28 = i27 % 2;
            obj = vfVar2.f61549p0;
            if (i28 == 0) {
                throw null;
            }
            int i29 = i24 & 3;
            int i30 = i29 + ((i24 ^ 3) | i29);
            f61548s0 = i30 % 128;
            if (i30 % 2 == 0) {
                int i31 = 49 / 0;
            }
        }
        return obj;
    }

    @NotNull
    public final rk setDividerPadding() {
        return (rk) setY(new Object[]{this}, 2080870193, -2080870192, System.identityHashCode(this));
    }

    @Nullable
    public final qw setX() {
        return (qw) setY(new Object[]{this}, -1667014550, 1667014550, System.identityHashCode(this));
    }
}
