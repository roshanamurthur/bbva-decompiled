package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final /* synthetic */ class q00 extends FunctionReferenceImpl implements Function1<ok, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static int f57797p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f57798q0 = 1;

    public q00(xc xcVar) {
        super(1, xcVar, xc.class, "setCompoundDrawableTintBlendMode", "setCompoundDrawableTintBlendMode(Lcom/mypinpad/tsdk/i/ok;)V", 0);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13 = ~i10;
        if ((((~(i11 | (~i12))) | (~(i13 | i11))) * Opcodes.ATHROW) + ((i10 | (~(i11 | i12))) * Opcodes.ATHROW) + (i13 * (-191)) + (i11 * 192) + (i10 * (-381)) == 1) {
            q00 q00Var = (q00) objArr[0];
            ok okVar = (ok) objArr[1];
            int i14 = f57797p0;
            int i15 = (i14 ^ 83) + ((i14 & 83) << 1);
            f57798q0 = i15 % 128;
            int i16 = i15 % 2;
            Intrinsics.checkNotNullParameter(okVar, "");
            xc.setX(new Object[]{(xc) q00Var.receiver, okVar}, -1498188108, 1498188113, (int) System.currentTimeMillis());
            int i17 = f57798q0;
            int i18 = (i17 ^ 3) + ((i17 & 3) << 1);
            f57797p0 = i18 % 128;
            int i19 = i18 % 2;
            return null;
        }
        q00 q00Var2 = (q00) objArr[0];
        Object obj = objArr[1];
        int i20 = f57797p0;
        int i21 = i20 | 25;
        int i22 = i21 << 1;
        int i23 = -((~(i20 & 25)) & i21);
        int i24 = (i22 & i23) + (i23 | i22);
        f57798q0 = i24 % 128;
        ok okVar2 = (ok) obj;
        if (i24 % 2 != 0) {
            a(new Object[]{q00Var2, okVar2}, -793913528, 793913529, System.identityHashCode(q00Var2));
            return Unit.INSTANCE;
        }
        a(new Object[]{q00Var2, okVar2}, -793913528, 793913529, System.identityHashCode(q00Var2));
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ok okVar) {
        return a(new Object[]{this, okVar}, -873319905, 873319905, System.identityHashCode(this));
    }
}
