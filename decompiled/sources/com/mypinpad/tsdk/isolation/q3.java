package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setX", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class q3 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final q3 f57804p0 = new q3();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f57805q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57806r0 = 1;

    static {
        int i10 = f57805q0;
        int i11 = (((i10 ^ 49) | (i10 & 49)) << 1) - (((~i10) & 49) | (i10 & (-50)));
        f57806r0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public q3() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 246) + (i10 * (-244));
        int i14 = ~i11;
        int i15 = (((~((~i12) | i14)) | (~(i14 | i10))) * (-245)) + i13;
        int i16 = ~(i14 | i12);
        if (((i10 | i16) * 245) + (i16 * (-245)) + i15 != 1) {
            q3 q3Var = (q3) objArr[0];
            Object obj = objArr[1];
            int i17 = f57805q0;
            int i18 = (((i17 | 24) << 1) - (i17 ^ 24)) - 1;
            f57806r0 = i18 % 128;
            int i19 = i18 % 2;
            a(new Object[]{q3Var, (cv) obj}, -780489866, 780489867, System.identityHashCode(q3Var));
            Unit unit = Unit.INSTANCE;
            int i20 = f57806r0 + 53;
            f57805q0 = i20 % 128;
            int i21 = i20 % 2;
            return unit;
        }
        cv cvVar = (cv) objArr[1];
        int i22 = f57806r0 + 89;
        f57805q0 = i22 % 128;
        int i23 = i22 % 2;
        Intrinsics.checkNotNullParameter(cvVar, "");
        cv.setDividerPadding(new Object[]{cvVar}, -86802886, 86802895, System.identityHashCode(cvVar));
        int i24 = f57805q0 + 71;
        f57806r0 = i24 % 128;
        if (i24 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 1934200881, -1934200881, System.identityHashCode(this));
    }
}
