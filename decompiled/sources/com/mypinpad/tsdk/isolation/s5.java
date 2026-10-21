package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/ct;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/ct;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class s5 extends Lambda implements Function1<ct, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f58190q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f58191r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f58192p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(boolean z10) {
        super(1);
        this.f58192p0 = z10;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        Unit unit;
        int i13 = ~i12;
        int i14 = ((i10 | i11 | i13) * (-369)) + (i11 * 370) + (i10 * 370);
        int i15 = (~i10) | i13;
        if ((((~(i10 | i12)) | (~((~i11) | i10)) | (~(i11 | i15))) * 369) + (((~i15) | i11) * (-369)) + i14 != 1) {
            s5 s5Var = (s5) objArr[0];
            ct ctVar = (ct) objArr[1];
            int i16 = f58190q0;
            int i17 = (-2) - (((i16 & 26) + (i16 | 26)) ^ (-1));
            f58191r0 = i17 % 128;
            int i18 = i17 % 2;
            Intrinsics.checkNotNullParameter(ctVar, "");
            ct.setY(new Object[]{ctVar, Boolean.valueOf(s5Var.f58192p0)}, -1484914280, 1484914280, System.identityHashCode(ctVar));
            int i19 = f58190q0;
            int i20 = i19 & 29;
            int i21 = (i19 ^ 29) | i20;
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            f58191r0 = i22 % 128;
            int i23 = i22 % 2;
            return null;
        }
        s5 s5Var2 = (s5) objArr[0];
        Object obj = objArr[1];
        int i24 = f58191r0 + 48;
        int i25 = (i24 ^ (-1)) + (i24 << 1);
        f58190q0 = i25 % 128;
        ct ctVar2 = (ct) obj;
        if (i25 % 2 != 0) {
            a(new Object[]{s5Var2, ctVar2}, 617407284, -617407284, System.identityHashCode(s5Var2));
            unit = Unit.INSTANCE;
            int i26 = 55 / 0;
        } else {
            a(new Object[]{s5Var2, ctVar2}, 617407284, -617407284, System.identityHashCode(s5Var2));
            unit = Unit.INSTANCE;
        }
        int i27 = f58190q0;
        int i28 = ((i27 | 5) << 1) - (i27 ^ 5);
        f58191r0 = i28 % 128;
        if (i28 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ct ctVar) {
        return a(new Object[]{this, ctVar}, 585445362, -585445361, System.identityHashCode(this));
    }
}
