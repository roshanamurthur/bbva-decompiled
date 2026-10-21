package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/s;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/s;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class b5 extends Lambda implements Function1<s, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54258q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54259r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ gv f54260p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(gv gvVar) {
        super(1);
        this.f54260p0 = gvVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0115  */
    /* JADX WARN: Code duplicated, block: B:18:0x012c  */
    /* JADX WARN: Code duplicated, block: B:28:0x020d  */
    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11) {
        int i12;
        int i13 = ~i10;
        int i14 = (i13 * 677) + (i11 * (-676)) + (i10 * 678);
        int i15 = ~i11;
        if (((~(i10 | i15)) * 677) + ((i13 | i15) * (-677)) + i14 != 1) {
            b5 b5Var = (b5) objArr[0];
            Object obj = objArr[1];
            int i16 = f54258q0;
            int i17 = ((i16 ^ 19) | (i16 & 19)) << 1;
            int i18 = -(((~i16) & 19) | (i16 & (-20)));
            int i19 = (i17 & i18) + (i18 | i17);
            f54259r0 = i19 % 128;
            int i20 = i19 % 2;
            System.identityHashCode(b5Var);
            a(new Object[]{b5Var, (s) obj}, -950534800, 950534801);
            Unit unit = Unit.INSTANCE;
            int i21 = f54258q0;
            int i22 = i21 & 41;
            int i23 = (((i21 ^ 41) | i22) << 1) - ((i21 | 41) & (~i22));
            f54259r0 = i23 % 128;
            if (i23 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        b5 b5Var2 = (b5) objArr[0];
        s sVar = (s) objArr[1];
        int i24 = f54258q0;
        int i25 = i24 & 35;
        int i26 = ((i24 ^ 35) | i25) << 1;
        int i27 = -((i24 | 35) & (~i25));
        int i28 = (i26 & i27) + (i27 | i26);
        f54259r0 = i28 % 128;
        if (i28 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sVar, "");
            gv gvVar = b5Var2.f54260p0;
            setAnimation setanimation = setAnimation.INSTANCE;
            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 1910770848, -1910770837, (int) System.currentTimeMillis());
            Object[] objArr2 = {gvVar, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))};
            int i29 = 57 / 0;
            if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(objArr2, -578266812, 578266824, System.identityHashCode(gvVar))).booleanValue()) {
                int i30 = f54259r0;
                int i31 = i30 & 17;
                int i32 = (i30 | 17) & (~i31);
                int i33 = -(-(i31 << 1));
                i12 = (i32 ^ i33) + ((i32 & i33) << 1);
                f54258q0 = i12 % 128;
                if (i12 % 2 == 0) {
                    s.setDividerPadding(new Object[]{sVar, (TransactionFailed) setAnimation.setY(new Object[0], 1910770848, -1910770837, (int) System.currentTimeMillis())}, -1134783533, 1134783536, System.identityHashCode(sVar));
                    throw null;
                }
                s.setDividerPadding(new Object[]{sVar, (TransactionFailed) setAnimation.setY(new Object[0], 1910770848, -1910770837, (int) System.currentTimeMillis())}, -1134783533, 1134783536, System.identityHashCode(sVar));
                int i34 = f54259r0;
                int i35 = i34 & 57;
                int i36 = (i35 - (~(-(-((i34 ^ 57) | i35))))) - 1;
                f54258q0 = i36 % 128;
                int i37 = i36 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(sVar, "");
            gv gvVar2 = b5Var2.f54260p0;
            setAnimation setanimation2 = setAnimation.INSTANCE;
            TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 1910770848, -1910770837, (int) System.currentTimeMillis());
            if (!(!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -578266812, 578266824, System.identityHashCode(gvVar2))).booleanValue())) {
                int i38 = f54259r0;
                int i39 = i38 & 17;
                int i310 = (i38 | 17) & (~i39);
                int i311 = -(-(i39 << 1));
                i12 = (i310 ^ i311) + ((i310 & i311) << 1);
                f54258q0 = i12 % 128;
                if (i12 % 2 == 0) {
                    s.setDividerPadding(new Object[]{sVar, (TransactionFailed) setAnimation.setY(new Object[0], 1910770848, -1910770837, (int) System.currentTimeMillis())}, -1134783533, 1134783536, System.identityHashCode(sVar));
                    throw null;
                }
                s.setDividerPadding(new Object[]{sVar, (TransactionFailed) setAnimation.setY(new Object[0], 1910770848, -1910770837, (int) System.currentTimeMillis())}, -1134783533, 1134783536, System.identityHashCode(sVar));
                int i312 = f54259r0;
                int i313 = i312 & 57;
                int i314 = (i313 - (~(-(-((i312 ^ 57) | i313))))) - 1;
                f54258q0 = i314 % 128;
                int i315 = i314 % 2;
            }
        }
        gv gvVar3 = b5Var2.f54260p0;
        TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 401053082, -401052943, (int) System.currentTimeMillis());
        if (!(!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar3, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, -578266812, 578266824, System.identityHashCode(gvVar3))).booleanValue())) {
            int i40 = f54259r0;
            int i41 = (((i40 | 98) << 1) - (i40 ^ 98)) - 1;
            f54258q0 = i41 % 128;
            if (i41 % 2 != 0) {
                s.setDividerPadding(new Object[]{sVar, (TransactionFailed) setAnimation.setY(new Object[0], 401053082, -401052943, (int) System.currentTimeMillis())}, -1134783533, 1134783536, System.identityHashCode(sVar));
                int i42 = 89 / 0;
            } else {
                s.setDividerPadding(new Object[]{sVar, (TransactionFailed) setAnimation.setY(new Object[0], 401053082, -401052943, (int) System.currentTimeMillis())}, -1134783533, 1134783536, System.identityHashCode(sVar));
            }
            int i43 = f54259r0;
            int i44 = i43 & 101;
            int i45 = (i44 - (~((i43 ^ 101) | i44))) - 1;
            f54258q0 = i45 % 128;
            int i46 = i45 % 2;
        }
        int i47 = f54258q0;
        int i48 = i47 & 77;
        int i49 = (((i47 ^ 77) | i48) << 1) - ((i47 | 77) & (~i48));
        f54259r0 = i49 % 128;
        int i50 = i49 % 2;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(s sVar) {
        Object[] objArr = {this, sVar};
        System.identityHashCode(this);
        return a(objArr, 861235770, -861235770);
    }
}
