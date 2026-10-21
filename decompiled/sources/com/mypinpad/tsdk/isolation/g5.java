package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/bz;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/bz;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class g5 extends Lambda implements Function1<bz, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f55626q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55627r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ca f55628p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(ca caVar) {
        super(1);
        this.f55628p0 = caVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | i11);
        int i14 = ~((~i11) | i10);
        int i15 = ~(i10 | i12);
        if (((i15 | i14) * 658) + (i14 * 658) + ((i13 | i14 | i15) * (-658)) + (i11 * (-657)) + (i10 * 659) == 1) {
            g5 g5Var = (g5) objArr[0];
            Object obj = objArr[1];
            int i16 = f55626q0;
            int i17 = (i16 & (-68)) | ((~i16) & 67);
            int i18 = (i16 & 67) << 1;
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            f55627r0 = i19 % 128;
            int i20 = i19 % 2;
            a(new Object[]{g5Var, (bz) obj}, 1918103488, -1918103488, System.identityHashCode(g5Var));
            Unit unit = Unit.INSTANCE;
            int i21 = f55626q0;
            int i22 = (i21 ^ 119) + ((i21 & 119) << 1);
            f55627r0 = i22 % 128;
            int i23 = i22 % 2;
            return unit;
        }
        g5 g5Var2 = (g5) objArr[0];
        bz bzVar = (bz) objArr[1];
        int i24 = f55626q0;
        int i25 = i24 & 77;
        int i26 = ((i24 ^ 77) | i25) << 1;
        int i27 = -((i24 | 77) & (~i25));
        int i28 = (i26 & i27) + (i27 | i26);
        f55627r0 = i28 % 128;
        if (i28 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bzVar, "");
            ca caVar = g5Var2.f55628p0;
            by.Companion companion = by.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(bzVar, "");
        ca caVar2 = g5Var2.f55628p0;
        if (((by) ca.setOnFocusChangeListener(new Object[]{caVar2}, 1299031735, -1299031735, System.identityHashCode(caVar2))) == by.FAIL_CVM_PROCESSING) {
            int i29 = f55627r0;
            int i30 = i29 & 93;
            int i31 = (i29 ^ 93) | i30;
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            f55626q0 = i32 % 128;
            int i33 = i32 % 2;
            ca caVar3 = g5Var2.f55628p0;
            if (i33 != 0) {
                bz.setY(new Object[]{bzVar, Byte.valueOf(((Byte) ca.setOnFocusChangeListener(new Object[]{caVar3}, -453853430, 453853437, System.identityHashCode(caVar3))).byteValue())}, 881254746, -881254746, System.identityHashCode(bzVar));
                bz.setY(new Object[]{bzVar, (cb) ca.setOnFocusChangeListener(new Object[]{caVar3}, 115119597, -115119594, System.identityHashCode(caVar3))}, -478987183, 478987185, System.identityHashCode(bzVar));
                bz.setY(new Object[]{bzVar, ce.setDividerPadding}, 2141338749, -2141338746, System.identityHashCode(bzVar));
                throw null;
            }
            bz.setY(new Object[]{bzVar, Byte.valueOf(((Byte) ca.setOnFocusChangeListener(new Object[]{caVar3}, -453853430, 453853437, System.identityHashCode(caVar3))).byteValue())}, 881254746, -881254746, System.identityHashCode(bzVar));
            bz.setY(new Object[]{bzVar, (cb) ca.setOnFocusChangeListener(new Object[]{caVar3}, 115119597, -115119594, System.identityHashCode(caVar3))}, -478987183, 478987185, System.identityHashCode(bzVar));
            bz.setY(new Object[]{bzVar, ce.setDividerPadding}, 2141338749, -2141338746, System.identityHashCode(bzVar));
            int i34 = f55627r0;
            int i35 = (i34 & 7) + (i34 | 7);
            f55626q0 = i35 % 128;
            int i36 = i35 % 2;
        } else {
            bz.setY(new Object[]{bzVar, (byte) 63}, 881254746, -881254746, System.identityHashCode(bzVar));
            bz.setY(new Object[]{bzVar, cb.ALWAYS}, -478987183, 478987185, System.identityHashCode(bzVar));
            bz.setY(new Object[]{bzVar, ce.setDividerPadding}, 2141338749, -2141338746, System.identityHashCode(bzVar));
            int i37 = f55626q0;
            int i38 = i37 & 33;
            int i39 = (i37 ^ 33) | i38;
            int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
            f55627r0 = i40 % 128;
            int i41 = i40 % 2;
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(bz bzVar) {
        return a(new Object[]{this, bzVar}, 1519944006, -1519944005, System.identityHashCode(this));
    }
}
