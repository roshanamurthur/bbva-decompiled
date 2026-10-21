package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class u6 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61246q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61247r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f61248p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(boolean z10) {
        super(1);
        this.f61248p0 = z10;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = ~(i13 | i10);
        int i15 = ((i11 | i14) * 764) + (i11 * (-1527)) + (i10 * 765);
        int i16 = ~((~i10) | i11);
        if ((((~(i10 | (~i11))) | i16 | i14) * 764) + (((~(i13 | i11)) | i16) * (-1528)) + i15 == 1) {
            u6 u6Var = (u6) objArr[0];
            Object obj = objArr[1];
            int i17 = f61247r0;
            int i18 = i17 & 101;
            int i19 = (i17 | 101) & (~i18);
            int i20 = i18 << 1;
            int i21 = (i19 & i20) + (i19 | i20);
            f61246q0 = i21 % 128;
            int i22 = i21 % 2;
            a(new Object[]{u6Var, (cv) obj}, 1118365209, -1118365209, System.identityHashCode(u6Var));
            Unit unit = Unit.INSTANCE;
            int i23 = f61246q0;
            int i24 = i23 & 103;
            int i25 = (i23 ^ 103) | i24;
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            f61247r0 = i26 % 128;
            if (i26 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        u6 u6Var2 = (u6) objArr[0];
        cv cvVar = (cv) objArr[1];
        int i27 = f61247r0;
        int i28 = (((i27 | 27) << 1) - (~(-(((~i27) & 27) | (i27 & (-28)))))) - 1;
        f61246q0 = i28 % 128;
        int i29 = i28 % 2;
        Intrinsics.checkNotNullParameter(cvVar, "");
        cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -2106531481, 2106531485, System.identityHashCode(cvVar));
        boolean z10 = u6Var2.f61248p0;
        if (!(!z10)) {
            int i30 = f61247r0;
            int i31 = ((i30 ^ 45) - (~(-(-((i30 & 45) << 1))))) - 1;
            f61246q0 = i31 % 128;
            int i32 = i31 % 2;
            cv.setDividerPadding(new Object[]{cvVar, Boolean.valueOf(z10)}, -243948838, 243948846, System.identityHashCode(cvVar));
            int i33 = f61246q0;
            int i34 = ((i33 ^ 121) | (i33 & 121)) << 1;
            int i35 = -(((~i33) & 121) | (i33 & (-122)));
            int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
            f61247r0 = i36 % 128;
            int i37 = i36 % 2;
        }
        int i38 = f61247r0 + 117;
        f61246q0 = i38 % 128;
        int i39 = i38 % 2;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 1016728907, -1016728906, System.identityHashCode(this));
    }
}
