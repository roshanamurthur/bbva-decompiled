package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/bz;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/bz;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class v3 extends Lambda implements Function1<bz, Unit> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61451r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61452s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ca f61453p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ce f61454q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(ca caVar, ce ceVar) {
        super(1);
        this.f61453p0 = caVar;
        this.f61454q0 = ceVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        if ((((~(i10 | (~i12))) | i14) * 168) + (((~(i11 | i10)) | (~(i10 | i12))) * (-168)) + (((~(i13 | i14)) | (~(i14 | i12))) * 336) + (i11 * (-167)) + (i10 * (-167)) == 1) {
            v3 v3Var = (v3) objArr[0];
            Object obj = objArr[1];
            int i15 = f61452s0 + 49;
            f61451r0 = i15 % 128;
            bz bzVar = (bz) obj;
            Object[] objArr2 = new Object[2];
            if (i15 % 2 == 0) {
                objArr2[0] = v3Var;
                objArr2[1] = bzVar;
                a(objArr2, 1956854665, -1956854665, System.identityHashCode(v3Var));
                return Unit.INSTANCE;
            }
            objArr2[0] = v3Var;
            objArr2[1] = bzVar;
            a(objArr2, 1956854665, -1956854665, System.identityHashCode(v3Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        v3 v3Var2 = (v3) objArr[0];
        bz bzVar2 = (bz) objArr[1];
        int i16 = f61451r0;
        int i17 = i16 & 123;
        int i18 = (i17 - (~(-(-((i16 ^ 123) | i17))))) - 1;
        f61452s0 = i18 % 128;
        if (i18 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bzVar2, "");
            ca caVar = v3Var2.f61453p0;
            bz.setY(new Object[]{bzVar2, Byte.valueOf(((Byte) ca.setOnFocusChangeListener(new Object[]{caVar}, -453853430, 453853437, System.identityHashCode(caVar))).byteValue())}, 881254746, -881254746, System.identityHashCode(bzVar2));
            ca caVar2 = v3Var2.f61453p0;
            bz.setY(new Object[]{bzVar2, (cb) ca.setOnFocusChangeListener(new Object[]{caVar2}, 115119597, -115119594, System.identityHashCode(caVar2))}, -478987183, 478987185, System.identityHashCode(bzVar2));
            bz.setY(new Object[]{bzVar2, v3Var2.f61454q0}, 2141338749, -2141338746, System.identityHashCode(bzVar2));
            return null;
        }
        Intrinsics.checkNotNullParameter(bzVar2, "");
        ca caVar3 = v3Var2.f61453p0;
        bz.setY(new Object[]{bzVar2, Byte.valueOf(((Byte) ca.setOnFocusChangeListener(new Object[]{caVar3}, -453853430, 453853437, System.identityHashCode(caVar3))).byteValue())}, 881254746, -881254746, System.identityHashCode(bzVar2));
        ca caVar4 = v3Var2.f61453p0;
        bz.setY(new Object[]{bzVar2, (cb) ca.setOnFocusChangeListener(new Object[]{caVar4}, 115119597, -115119594, System.identityHashCode(caVar4))}, -478987183, 478987185, System.identityHashCode(bzVar2));
        bz.setY(new Object[]{bzVar2, v3Var2.f61454q0}, 2141338749, -2141338746, System.identityHashCode(bzVar2));
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(bz bzVar) {
        return a(new Object[]{this, bzVar}, 1613107979, -1613107978, System.identityHashCode(this));
    }
}
