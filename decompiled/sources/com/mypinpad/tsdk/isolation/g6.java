package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setX", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class g6 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g6 f55629p0 = new g6();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f55630q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55631r0 = 1;

    static {
        int i10 = f55630q0;
        int i11 = i10 & 7;
        int i12 = (i10 | 7) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        f55631r0 = i14 % 128;
        int i15 = i14 % 2;
    }

    public g6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (~(i13 | i14)) | (~(i14 | i12));
        int i16 = ~i12;
        int i17 = i16 | i10;
        if (((~i17) * 886) + ((i10 | (~(i11 | i16))) * (-1772)) + ((i15 | (~(i17 | i11))) * 886) + (i11 * (-885)) + (i10 * 1773) != 1) {
            cv cvVar = (cv) objArr[1];
            int i18 = f55631r0 + 107;
            f55630q0 = i18 % 128;
            if (i18 % 2 != 0) {
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -1728527861, 1728527862, System.identityHashCode(cvVar));
            } else {
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -1728527861, 1728527862, System.identityHashCode(cvVar));
            }
            return null;
        }
        g6 g6Var = (g6) objArr[0];
        Object obj = objArr[1];
        int i19 = (-2) - ((f55631r0 + 106) ^ (-1));
        f55630q0 = i19 % 128;
        int i20 = i19 % 2;
        a(new Object[]{g6Var, (cv) obj}, 1574856409, -1574856409, System.identityHashCode(g6Var));
        Unit unit = Unit.INSTANCE;
        int i21 = f55630q0;
        int i22 = i21 & 37;
        int i23 = (i21 ^ 37) | i22;
        int i24 = (i22 & i23) + (i23 | i22);
        f55631r0 = i24 % 128;
        if (i24 % 2 != 0) {
            return unit;
        }
        int i25 = 48 / 0;
        return unit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, -311610327, 311610328, System.identityHashCode(this));
    }
}
