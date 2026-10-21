package com.mypinpad.tsdk.isolation;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class vl extends vj {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61563r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61564s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f61565p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final UUID f61566q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(long j10, @NotNull UUID uuid) {
        super(null);
        Intrinsics.checkNotNullParameter(uuid, "");
        this.f61565p0 = j10;
        this.f61566q0 = uuid;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = ((i10 | i11 | i13) * (-369)) + (i11 * 370) + (i10 * 370);
        int i15 = (~i10) | i13;
        if ((((~(i10 | i12)) | (~((~i11) | i10)) | (~(i11 | i15))) * 369) + (((~i15) | i11) * (-369)) + i14 == 1) {
            vl vlVar = (vl) objArr[0];
            int i16 = f61564s0;
            int i17 = i16 + 77;
            f61563r0 = i17 % 128;
            int i18 = i17 % 2;
            UUID uuid = vlVar.f61566q0;
            int i19 = i16 & 115;
            int i20 = -(-(i16 | 115));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f61563r0 = i21 % 128;
            int i22 = i21 % 2;
            return uuid;
        }
        vl vlVar2 = (vl) objArr[0];
        int i23 = f61563r0;
        int i24 = ((i23 ^ 77) | (i23 & 77)) << 1;
        int i25 = -(((~i23) & 77) | (i23 & (-78)));
        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
        int i27 = i26 % 128;
        f61564s0 = i27;
        if (i26 % 2 == 0) {
            long j10 = vlVar2.f61565p0;
            throw null;
        }
        long j11 = vlVar2.f61565p0;
        int i28 = i27 + 47;
        f61563r0 = i28 % 128;
        if (i28 % 2 == 0) {
            return Long.valueOf(j11);
        }
        throw null;
    }

    @NotNull
    public final UUID setDividerPadding() {
        return (UUID) setOnFocusChangeListener(new Object[]{this}, -824803406, 824803407, System.identityHashCode(this));
    }

    public final long setX() {
        return ((Long) setOnFocusChangeListener(new Object[]{this}, -24363090, 24363090, System.identityHashCode(this))).longValue();
    }
}
