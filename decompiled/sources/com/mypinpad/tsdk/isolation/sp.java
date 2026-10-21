package com.mypinpad.tsdk.isolation;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sp implements Serializable {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f60899t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f60900u0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final sn f60901p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final sn f60902q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final sn f60903r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final sn f60904s0;

    public sp(@NotNull sn snVar, @NotNull sn snVar2, @NotNull sn snVar3, @NotNull sn snVar4) {
        Intrinsics.checkNotNullParameter(snVar, "");
        Intrinsics.checkNotNullParameter(snVar2, "");
        Intrinsics.checkNotNullParameter(snVar3, "");
        Intrinsics.checkNotNullParameter(snVar4, "");
        this.f60901p0 = snVar;
        this.f60902q0 = snVar2;
        this.f60903r0 = snVar3;
        this.f60904s0 = snVar4;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (((~(i10 | i12)) | (~((~i10) | i14)) | (~(i11 | i12))) * 831) + ((~(i13 | i10 | i12)) * (-1662)) + (((~(i13 | i14)) | (~(i10 | i11 | i12))) * (-831)) + (i11 * 832) + (i10 * (-830));
        if (i15 == 1) {
            sp spVar = (sp) objArr[0];
            int i16 = f60899t0;
            int i17 = ((i16 | 99) << 1) - (i16 ^ 99);
            int i18 = i17 % 128;
            f60900u0 = i18;
            int i19 = i17 % 2;
            sn snVar = spVar.f60901p0;
            int i20 = (((i18 ^ 119) | (i18 & 119)) << 1) - (((~i18) & 119) | (i18 & (-120)));
            f60899t0 = i20 % 128;
            int i21 = i20 % 2;
            return snVar;
        }
        if (i15 == 2) {
            sp spVar2 = (sp) objArr[0];
            int i22 = f60899t0 + 31;
            int i23 = i22 % 128;
            f60900u0 = i23;
            int i24 = i22 % 2;
            sn snVar2 = spVar2.f60903r0;
            int i25 = ((i23 ^ 23) - (~((i23 & 23) << 1))) - 1;
            f60899t0 = i25 % 128;
            int i26 = i25 % 2;
            return snVar2;
        }
        if (i15 == 3) {
            sp spVar3 = (sp) objArr[0];
            int i27 = f60900u0;
            int i28 = i27 & 111;
            int i29 = (i28 - (~(-(-((i27 ^ 111) | i28))))) - 1;
            int i30 = i29 % 128;
            f60899t0 = i30;
            int i31 = i29 % 2;
            sn snVar3 = spVar3.f60902q0;
            int i32 = i30 & 87;
            int i33 = i30 | 87;
            int i34 = (i32 & i33) + (i33 | i32);
            f60900u0 = i34 % 128;
            int i35 = i34 % 2;
            return snVar3;
        }
        sp spVar4 = (sp) objArr[0];
        int i36 = f60900u0;
        int i37 = (i36 | 67) << 1;
        int i38 = -((i36 & (-68)) | ((~i36) & 67));
        int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
        f60899t0 = i39 % 128;
        int i40 = i39 % 2;
        sn snVar4 = spVar4.f60904s0;
        int i41 = (i36 | 43) << 1;
        int i42 = -(i36 ^ 43);
        int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
        f60899t0 = i43 % 128;
        if (i43 % 2 == 0) {
            return snVar4;
        }
        throw null;
    }

    @NotNull
    public final sn setCompoundDrawableTintBlendMode() {
        return (sn) setOnFocusChangeListener(new Object[]{this}, -1512237302, 1512237304, System.identityHashCode(this));
    }

    @NotNull
    public final sn setX() {
        return (sn) setOnFocusChangeListener(new Object[]{this}, -2011261309, 2011261312, System.identityHashCode(this));
    }

    @NotNull
    public final sn setY() {
        return (sn) setOnFocusChangeListener(new Object[]{this}, 373650272, -373650271, System.identityHashCode(this));
    }

    @NotNull
    public final sn setOnFocusChangeListener() {
        return (sn) setOnFocusChangeListener(new Object[]{this}, -840796711, 840796711, System.identityHashCode(this));
    }
}
