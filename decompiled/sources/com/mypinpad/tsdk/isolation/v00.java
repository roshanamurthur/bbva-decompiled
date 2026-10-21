package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.callbacks.TransactionResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/rs;", "p0", "", "setX", "(Lcom/mypinpad/tsdk/i/rs;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class v00 extends Lambda implements Function1<rs, Unit> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61444r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61445s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ xc f61446p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<TransactionResult, Unit> f61447q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v00(xc xcVar, Function1<? super TransactionResult, Unit> function1) {
        super(1);
        this.f61446p0 = xcVar;
        this.f61447q0 = function1;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-667)) + (i10 * (-1335));
        int i14 = ~i11;
        int i15 = i10 | i12;
        if (((i14 | i15) * 668) + ((i10 | (~(i12 | i14))) * 1336) + (((~i15) | i14) * (-668)) + i13 != 1) {
            v00 v00Var = (v00) objArr[0];
            rs rsVar = (rs) objArr[1];
            Intrinsics.checkNotNullParameter(rsVar, "");
            ((nu) xc.setX(new Object[]{v00Var.f61446p0}, 902849077, -902849077, (int) System.currentTimeMillis())).setOnFocusChangeListener();
            vd vdVar = vd.INSTANCE;
            vd.setDividerPadding(new Object[]{new u00(v00Var.f61446p0, v00Var.f61447q0, rsVar)}, 1115627770, -1115627770, (int) System.currentTimeMillis());
            int i16 = f61445s0;
            int i17 = ((i16 & 58) + (i16 | 58)) - 1;
            f61444r0 = i17 % 128;
            if (i17 % 2 == 0) {
                return null;
            }
            throw null;
        }
        v00 v00Var2 = (v00) objArr[0];
        Object obj = objArr[1];
        int i18 = f61444r0;
        int i19 = i18 & 111;
        int i20 = -(-((i18 ^ 111) | i19));
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        f61445s0 = i21 % 128;
        int i22 = i21 % 2;
        a(new Object[]{v00Var2, (rs) obj}, 1455836398, -1455836398, System.identityHashCode(v00Var2));
        Unit unit = Unit.INSTANCE;
        int i23 = f61444r0;
        int i24 = (i23 & 19) + (i23 | 19);
        f61445s0 = i24 % 128;
        int i25 = i24 % 2;
        return unit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(rs rsVar) {
        return a(new Object[]{this, rsVar}, -1828068885, 1828068886, System.identityHashCode(this));
    }
}
