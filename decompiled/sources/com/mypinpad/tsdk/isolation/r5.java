package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/ct;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/ct;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class r5 extends Lambda implements Function1<ct, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final r5 f58061p0 = new r5();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f58062q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f58063r0 = 1;

    static {
        int i10 = f58062q0;
        int i11 = i10 & 53;
        int i12 = i11 + ((i10 ^ 53) | i11);
        f58063r0 = i12 % 128;
        int i13 = i12 % 2;
    }

    public r5() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~i12;
        if ((((~(i14 | i15)) | i13) * 68) + ((~(i11 | i13 | i15)) * (-68)) + (((~(i10 | i11)) | (~(i13 | i14 | i15)) | (~(i12 | i11))) * (-68)) + (i11 * (-67)) + (i10 * 69) == 1) {
            r5 r5Var = (r5) objArr[0];
            Object obj = objArr[1];
            int i16 = f58063r0 + 91;
            f58062q0 = i16 % 128;
            ct ctVar = (ct) obj;
            if (i16 % 2 == 0) {
                a(new Object[]{r5Var, ctVar}, -1597534770, 1597534770, System.identityHashCode(r5Var));
                return Unit.INSTANCE;
            }
            a(new Object[]{r5Var, ctVar}, -1597534770, 1597534770, System.identityHashCode(r5Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        ct ctVar2 = (ct) objArr[1];
        int i17 = f58063r0;
        int i18 = i17 & 55;
        int i19 = (i18 - (~(-(-((i17 ^ 55) | i18))))) - 1;
        f58062q0 = i19 % 128;
        int i20 = i19 % 2;
        Intrinsics.checkNotNullParameter(ctVar2, "");
        ct.setY(new Object[]{ctVar2}, -2015936104, 2015936105, System.identityHashCode(ctVar2));
        int i21 = f58062q0;
        int i22 = ((i21 & (-18)) | ((~i21) & 17)) + ((i21 & 17) << 1);
        f58063r0 = i22 % 128;
        int i23 = i22 % 2;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ct ctVar) {
        return a(new Object[]{this, ctVar}, 840597451, -840597450, System.identityHashCode(this));
    }
}
