package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/bz;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/bz;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class e6 extends Lambda implements Function1<bz, Unit> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55312r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f55313s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ jo.b f55314p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ce f55315q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(jo.b bVar, ce ceVar) {
        super(1);
        this.f55314p0 = bVar;
        this.f55315q0 = ceVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11) {
        Byte bValueOf;
        byte bByteValue;
        cb cbVar;
        int i12 = ~i10;
        int i13 = (i12 * 677) + (i11 * (-676)) + (i10 * 678);
        int i14 = ~i11;
        if (((~(i10 | i14)) * 677) + ((i12 | i14) * (-677)) + i13 != 1) {
            e6 e6Var = (e6) objArr[0];
            Object obj = objArr[1];
            int i15 = f55313s0;
            int i16 = i15 & 31;
            int i17 = (((i15 ^ 31) | i16) << 1) - ((i15 | 31) & (~i16));
            f55312r0 = i17 % 128;
            int i18 = i17 % 2;
            System.identityHashCode(e6Var);
            a(new Object[]{e6Var, (bz) obj}, -463418970, 463418971);
            Unit unit = Unit.INSTANCE;
            int i19 = f55312r0;
            int i20 = i19 & 19;
            int i21 = (i19 ^ 19) | i20;
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f55313s0 = i22 % 128;
            if (i22 % 2 != 0) {
                return unit;
            }
            int i23 = 48 / 0;
            return unit;
        }
        e6 e6Var2 = (e6) objArr[0];
        bz bzVar = (bz) objArr[1];
        int i24 = f55312r0;
        int i25 = i24 & 121;
        int i26 = -(-((i24 ^ 121) | i25));
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        f55313s0 = i27 % 128;
        int i28 = i27 % 2;
        Intrinsics.checkNotNullParameter(bzVar, "");
        jo.b bVar = e6Var2.f55314p0;
        if (bVar == null) {
            int i29 = f55312r0 + 59;
            f55313s0 = i29 % 128;
            if (i29 % 2 == 0) {
                throw null;
            }
            bValueOf = null;
        } else {
            ca caVar = (ca) jo.b.a(new Object[]{bVar}, -27278032, 27278032, System.identityHashCode(bVar));
            bValueOf = Byte.valueOf(((Byte) ca.setOnFocusChangeListener(new Object[]{caVar}, -453853430, 453853437, System.identityHashCode(caVar))).byteValue());
            int i30 = f55313s0;
            int i31 = (i30 ^ 27) + ((i30 & 27) << 1);
            f55312r0 = i31 % 128;
            int i32 = i31 % 2;
        }
        if (bValueOf == null) {
            int i33 = f55313s0 + 21;
            f55312r0 = i33 % 128;
            if (i33 % 2 != 0) {
                by.UNRECOGNISED_CVM.setDividerPadding();
                throw null;
            }
            bByteValue = by.UNRECOGNISED_CVM.setDividerPadding();
        } else {
            bByteValue = bValueOf.byteValue();
            int i34 = f55312r0;
            int i35 = (i34 ^ 57) + ((i34 & 57) << 1);
            f55313s0 = i35 % 128;
            int i36 = i35 % 2;
        }
        bz.setY(new Object[]{bzVar, Byte.valueOf(bByteValue)}, 881254746, -881254746, System.identityHashCode(bzVar));
        jo.b bVar2 = e6Var2.f55314p0;
        if (bVar2 == null) {
            int i37 = f55313s0;
            int i38 = ((i37 | 87) << 1) - (i37 ^ 87);
            int i39 = i38 % 128;
            f55312r0 = i39;
            int i40 = i38 % 2;
            int i41 = (-2) - (((i39 & 2) + (i39 | 2)) ^ (-1));
            f55313s0 = i41 % 128;
            int i42 = i41 % 2;
            cbVar = null;
        } else {
            ca caVar2 = (ca) jo.b.a(new Object[]{bVar2}, -27278032, 27278032, System.identityHashCode(bVar2));
            cbVar = (cb) ca.setOnFocusChangeListener(new Object[]{caVar2}, 115119597, -115119594, System.identityHashCode(caVar2));
            System.identityHashCode(e6Var2);
            System.identityHashCode(e6Var2);
        }
        if (cbVar == null) {
            int i43 = f55313s0;
            int i44 = ((i43 ^ 17) | (i43 & 17)) << 1;
            int i45 = -(((~i43) & 17) | (i43 & (-18)));
            int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
            f55312r0 = i46 % 128;
            int i47 = i46 % 2;
            cbVar = cb.ALWAYS;
            int i48 = f55312r0;
            int i49 = ((i48 & 79) - (~(i48 | 79))) - 1;
            f55313s0 = i49 % 128;
            int i50 = i49 % 2;
        } else {
            int i51 = f55312r0;
            int i52 = (-2) - ((((i51 | 34) << 1) - (i51 ^ 34)) ^ (-1));
            f55313s0 = i52 % 128;
            int i53 = i52 % 2;
        }
        bz.setY(new Object[]{bzVar, cbVar}, -478987183, 478987185, System.identityHashCode(bzVar));
        bz.setY(new Object[]{bzVar, e6Var2.f55315q0}, 2141338749, -2141338746, System.identityHashCode(bzVar));
        int i54 = f55312r0;
        int i55 = ((i54 | 90) << 1) - (i54 ^ 90);
        int i56 = (i55 ^ (-1)) + (i55 << 1);
        f55313s0 = i56 % 128;
        if (i56 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(bz bzVar) {
        Object[] objArr = {this, bzVar};
        System.identityHashCode(this);
        return a(objArr, -389444183, 389444183);
    }
}
