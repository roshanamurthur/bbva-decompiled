package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/bz;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/bz;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class y3 extends Lambda implements Function1<bz, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61987q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61988r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ca f61989p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(ca caVar) {
        super(1);
        this.f61989p0 = caVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        Byte bValueOf;
        byte bByteValue;
        cb cbVar;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i12;
        if ((((~(i10 | i14 | i16)) | (~(i13 | i12))) * 765) + (((~i15) | (~(i13 | i16))) * 1530) + (((~(i11 | i13 | i12)) | (~(i15 | i16)) | (~(i14 | i10 | i12))) * 765) + (i11 * (-764)) + (i10 * (-1529)) != 1) {
            y3 y3Var = (y3) objArr[0];
            Object obj = objArr[1];
            int i17 = f61988r0;
            int i18 = ((((i17 ^ 85) | (i17 & 85)) << 1) - (~(-(((~i17) & 85) | (i17 & (-86)))))) - 1;
            f61987q0 = i18 % 128;
            int i19 = i18 % 2;
            a(new Object[]{y3Var, (bz) obj}, 1150478061, -1150478060, System.identityHashCode(y3Var));
            Unit unit = Unit.INSTANCE;
            int i20 = f61988r0;
            int i21 = ((i20 & 122) + (i20 | 122)) - 1;
            f61987q0 = i21 % 128;
            int i22 = i21 % 2;
            return unit;
        }
        y3 y3Var2 = (y3) objArr[0];
        bz bzVar = (bz) objArr[1];
        int i23 = f61988r0;
        int i24 = i23 & 81;
        int i25 = (i23 | 81) & (~i24);
        int i26 = -(-(i24 << 1));
        int i27 = (i25 & i26) + (i25 | i26);
        f61987q0 = i27 % 128;
        int i28 = i27 % 2;
        Intrinsics.checkNotNullParameter(bzVar, "");
        ca caVar = y3Var2.f61989p0;
        if (caVar == null) {
            int i29 = f61988r0;
            int i30 = ((i29 & 34) + (i29 | 34)) - 1;
            f61987q0 = i30 % 128;
            if (i30 % 2 != 0) {
                throw null;
            }
            int i31 = i29 & 113;
            int i32 = (i29 | 113) & (~i31);
            int i33 = i31 << 1;
            int i34 = (i32 & i33) + (i32 | i33);
            f61987q0 = i34 % 128;
            int i35 = i34 % 2;
            bValueOf = null;
        } else {
            bValueOf = Byte.valueOf(((Byte) ca.setOnFocusChangeListener(new Object[]{caVar}, -453853430, 453853437, System.identityHashCode(caVar))).byteValue());
            int i36 = f61987q0;
            int i37 = (i36 & 39) + (i36 | 39);
            f61988r0 = i37 % 128;
            int i38 = i37 % 2;
        }
        if (bValueOf == null) {
            int i39 = f61987q0;
            int i40 = (i39 & 23) + (i39 | 23);
            f61988r0 = i40 % 128;
            if (i40 % 2 == 0) {
                by.UNRECOGNISED_CVM.setDividerPadding();
                throw null;
            }
            bByteValue = by.UNRECOGNISED_CVM.setDividerPadding();
        } else {
            bByteValue = bValueOf.byteValue();
            int i41 = f61988r0 + 77;
            f61987q0 = i41 % 128;
            int i42 = i41 % 2;
        }
        bz.setY(new Object[]{bzVar, Byte.valueOf(bByteValue)}, 881254746, -881254746, System.identityHashCode(bzVar));
        ca caVar2 = y3Var2.f61989p0;
        if (caVar2 == null) {
            int i43 = f61987q0;
            int i44 = i43 + 54;
            int i45 = (i44 ^ (-1)) + (i44 << 1);
            f61988r0 = i45 % 128;
            int i46 = i45 % 2;
            int i47 = ((i43 ^ 72) + ((i43 & 72) << 1)) - 1;
            f61988r0 = i47 % 128;
            int i48 = i47 % 2;
            cbVar = null;
        } else {
            cbVar = (cb) ca.setOnFocusChangeListener(new Object[]{caVar2}, 115119597, -115119594, System.identityHashCode(caVar2));
            int i49 = f61988r0;
            int i50 = ((i49 & 76) + (i49 | 76)) - 1;
            f61987q0 = i50 % 128;
            int i51 = i50 % 2;
        }
        if (cbVar == null) {
            int i52 = f61988r0;
            int i53 = i52 & 77;
            int i54 = (i53 - (~(-(-((i52 ^ 77) | i53))))) - 1;
            f61987q0 = i54 % 128;
            int i55 = i54 % 2;
            cbVar = cb.ALWAYS;
            int i56 = f61987q0;
            int i57 = i56 & 97;
            int i58 = (i56 ^ 97) | i57;
            int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
            f61988r0 = i59 % 128;
            int i60 = i59 % 2;
        } else {
            int i61 = f61987q0;
            int i62 = (i61 ^ 87) + ((i61 & 87) << 1);
            f61988r0 = i62 % 128;
            int i63 = i62 % 2;
        }
        bz.setY(new Object[]{bzVar, cbVar}, -478987183, 478987185, System.identityHashCode(bzVar));
        bz.setY(new Object[]{bzVar, ce.setDividerPadding}, 2141338749, -2141338746, System.identityHashCode(bzVar));
        int i64 = f61988r0;
        int i65 = ((i64 & 50) + (i64 | 50)) - 1;
        f61987q0 = i65 % 128;
        int i66 = i65 % 2;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(bz bzVar) {
        return a(new Object[]{this, bzVar}, 1688036763, -1688036763, System.identityHashCode(this));
    }
}
