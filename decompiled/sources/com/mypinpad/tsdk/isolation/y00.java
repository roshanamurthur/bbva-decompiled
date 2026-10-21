package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.TerminalSession;
import com.mypinpad.tsdk.api.callbacks.SessionActivationFailure;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setOnFocusChangeListener", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class y00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f61969t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f61970u0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ vj f61971p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<TerminalSession, rh, Unit> f61972q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ xf f61973r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function2<TerminalSession, SessionActivationFailure, Unit> f61974s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y00(vj vjVar, Function2<? super TerminalSession, ? super rh, Unit> function2, xf xfVar, Function2<? super TerminalSession, ? super SessionActivationFailure, Unit> function3) {
        super(0);
        this.f61971p0 = vjVar;
        this.f61972q0 = function2;
        this.f61973r0 = xfVar;
        this.f61974s0 = function3;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13 = ~i10;
        int i14 = ~(i12 | i11);
        if ((((~(i10 | (~i11))) | (~(i13 | i11))) * 110) + ((i14 | (~(i10 | i11))) * 220) + ((i13 | i14) * (-220)) + (i11 * 111) + (i10 * (-109)) != 1) {
            y00 y00Var = (y00) objArr[0];
            int i15 = f61969t0;
            int i16 = (i15 & 115) + (i15 | 115);
            f61970u0 = i16 % 128;
            int i17 = i16 % 2;
            a(new Object[]{y00Var}, 1449959052, -1449959051, System.identityHashCode(y00Var));
            Unit unit = Unit.INSTANCE;
            int i18 = f61970u0;
            int i19 = i18 & 17;
            int i20 = -(-((i18 ^ 17) | i19));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            f61969t0 = i21 % 128;
            int i22 = i21 % 2;
            return unit;
        }
        y00 y00Var2 = (y00) objArr[0];
        int i23 = f61969t0 + 103;
        f61970u0 = i23 % 128;
        int i24 = i23 % 2;
        vj vjVar = y00Var2.f61971p0;
        if (vjVar instanceof vl) {
            vl vlVar = (vl) vjVar;
            long x4 = vlVar.setX();
            String string = vlVar.setDividerPadding().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            xc xcVar = new xc(x4, string, null, null, 12, null);
            xf.setCompoundDrawableTintBlendMode(new Object[]{y00Var2.f61973r0, new WeakReference(xcVar)}, -72641444, 72641444, (int) System.currentTimeMillis());
            y00Var2.f61974s0.invoke(xcVar, null);
            int i25 = f61969t0 + 107;
            f61970u0 = i25 % 128;
            int i26 = i25 % 2;
        } else {
            if (vjVar instanceof vf) {
                vf vfVar = (vf) vjVar;
                y00Var2.f61972q0.invoke(null, new to((rk) vf.setY(new Object[]{vfVar}, 2080870193, -2080870192, System.identityHashCode(vfVar)), (qw) vf.setY(new Object[]{vfVar}, -1667014550, 1667014550, System.identityHashCode(vfVar))));
                int i27 = f61969t0;
                int i28 = i27 ^ 59;
                int i29 = ((i27 & 59) | i28) << 1;
                int i30 = -i28;
                int i31 = (i29 & i30) + (i29 | i30);
                f61970u0 = i31 % 128;
                int i32 = i31 % 2;
            }
            int i33 = f61969t0 + 49;
            f61970u0 = i33 % 128;
            if (i33 % 2 == 0) {
                throw null;
            }
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        return a(new Object[]{this}, 1966096431, -1966096431, System.identityHashCode(this));
    }
}
