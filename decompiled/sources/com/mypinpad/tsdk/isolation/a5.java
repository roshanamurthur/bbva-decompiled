package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cq;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/cq;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class a5 extends Lambda implements Function1<cq, Unit> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f51993r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f51994s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ byte f51995p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ byte f51996q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(byte b10, byte b11) {
        super(1);
        this.f51995p0 = b10;
        this.f51996q0 = b11;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~(i13 | i12);
        int i16 = ~i11;
        int i17 = ((i15 | (~(i16 | i12))) * 140) + ((i14 | i15) * (-280)) + (i11 * (-139)) + (i10 * 141);
        int i18 = ~(i13 | i16 | i12);
        int i19 = ~i12;
        if ((((~(i10 | i19 | i16)) | (~(i11 | i13 | i19)) | i18) * 140) + i17 != 1) {
            a5 a5Var = (a5) objArr[0];
            Object obj = objArr[1];
            int i20 = f51994s0;
            int i21 = i20 ^ 83;
            int i22 = (((i20 & 83) | i21) << 1) - i21;
            f51993r0 = i22 % 128;
            int i23 = i22 % 2;
            a(new Object[]{a5Var, (cq) obj}, -1381797767, 1381797768, System.identityHashCode(a5Var));
            Unit unit = Unit.INSTANCE;
            int i24 = f51993r0 + 5;
            f51994s0 = i24 % 128;
            if (i24 % 2 != 0) {
                return unit;
            }
            int i25 = 68 / 0;
            return unit;
        }
        a5 a5Var2 = (a5) objArr[0];
        cq cqVar = (cq) objArr[1];
        int i26 = f51993r0;
        int i27 = i26 & 33;
        int i28 = -(-(i26 | 33));
        int i29 = (i27 & i28) + (i28 | i27);
        f51994s0 = i29 % 128;
        if (i29 % 2 != 0) {
            Intrinsics.checkNotNullParameter(cqVar, "");
            cq.setOnFocusChangeListener(new Object[]{cqVar, Byte.valueOf(a5Var2.f51995p0)}, 1204488733, -1204488722, System.identityHashCode(cqVar));
            cq.setOnFocusChangeListener(new Object[]{cqVar, Byte.valueOf(a5Var2.f51996q0)}, 704875818, -704875814, System.identityHashCode(cqVar));
            return null;
        }
        Intrinsics.checkNotNullParameter(cqVar, "");
        cq.setOnFocusChangeListener(new Object[]{cqVar, Byte.valueOf(a5Var2.f51995p0)}, 1204488733, -1204488722, System.identityHashCode(cqVar));
        cq.setOnFocusChangeListener(new Object[]{cqVar, Byte.valueOf(a5Var2.f51996q0)}, 704875818, -704875814, System.identityHashCode(cqVar));
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cq cqVar) {
        return a(new Object[]{this, cqVar}, -1793359968, 1793359968, System.identityHashCode(this));
    }
}
