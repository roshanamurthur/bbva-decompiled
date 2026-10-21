package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class zr extends yn {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f62437u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public final String f62438r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final long f62439s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final aby f62440t0;

    public zr(@Nullable String str, long j10, @NotNull aby abyVar) {
        Intrinsics.checkNotNullParameter(abyVar, "");
        this.f62438r0 = str;
        this.f62439s0 = j10;
        this.f62440t0 = abyVar;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-1917)) + (i10 * 960);
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (((~(i10 | i15)) | (~(i14 | i12))) * 959) + (i14 * (-959)) + (((~(i14 | i15)) | (~(i10 | i12))) * 959) + i13;
        yj yjVar = null;
        if (i16 != 1) {
            if (i16 == 2) {
                zr zrVar = (zr) objArr[0];
                int i17 = v0;
                int i18 = i17 & 67;
                int i19 = (i18 - (~(-(-((i17 ^ 67) | i18))))) - 1;
                f62437u0 = i19 % 128;
                int i20 = i19 % 2;
                long j10 = zrVar.f62439s0;
                if (i20 == 0) {
                    return Long.valueOf(j10);
                }
                throw null;
            }
            zr zrVar2 = (zr) objArr[0];
            int i21 = f62437u0;
            int i22 = (i21 & (-126)) | ((~i21) & 125);
            int i23 = -(-((i21 & 125) << 1));
            int i24 = (i22 & i23) + (i23 | i22);
            int i25 = i24 % 128;
            v0 = i25;
            int i26 = i24 % 2;
            aby abyVar = zrVar2.f62440t0;
            int i27 = ((i25 & (-60)) | ((~i25) & 59)) + ((i25 & 59) << 1);
            f62437u0 = i27 % 128;
            int i28 = i27 % 2;
            return abyVar;
        }
        zr zrVar3 = (zr) objArr[0];
        int i29 = f62437u0;
        int i30 = i29 & 117;
        int i31 = (i29 ^ 117) | i30;
        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
        int i33 = i32 % 128;
        v0 = i33;
        int i34 = i32 % 2;
        String str = zrVar3.f62438r0;
        if (str == null) {
            int i35 = i33 & 87;
            int i36 = (i33 | 87) & (~i35);
            int i37 = -(-(i35 << 1));
            int i38 = (i36 & i37) + (i37 | i36);
            f62437u0 = i38 % 128;
            if (i38 % 2 != 0) {
                throw null;
            }
        } else {
            yj.setX setx = yj.setOnFocusChangeListener;
            yjVar = (yj) yj.setX.setDividerPadding(new Object[]{str}, 2075813311, -2075813311, (int) System.currentTimeMillis());
            int i39 = v0;
            int i40 = i39 & 75;
            int i41 = i39 | 75;
            int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
            f62437u0 = i42 % 128;
            int i43 = i42 % 2;
        }
        return yjVar;
    }

    @Override // com.mypinpad.tsdk.isolation.yn
    public final long setOnFocusChangeListener() {
        return ((Long) setCompoundDrawableTintBlendMode(new Object[]{this}, -254135087, 254135089, System.identityHashCode(this))).longValue();
    }

    @Override // com.mypinpad.tsdk.isolation.yn
    @Nullable
    public final yj setX() {
        return (yj) setCompoundDrawableTintBlendMode(new Object[]{this}, -886990116, 886990117, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.yn
    @NotNull
    public final aby setY() {
        return (aby) setCompoundDrawableTintBlendMode(new Object[]{this}, -547990358, 547990358, System.identityHashCode(this));
    }
}
