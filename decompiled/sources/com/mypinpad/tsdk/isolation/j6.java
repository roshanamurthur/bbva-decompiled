package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setY", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class j6 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j6 f56608p0 = new j6();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f56609q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f56610r0 = 1;

    static {
        int i10 = f56609q0;
        int i11 = i10 & 89;
        int i12 = ((i10 ^ 89) | i11) << 1;
        int i13 = -((i10 | 89) & (~i11));
        int i14 = (i12 & i13) + (i13 | i12);
        f56610r0 = i14 % 128;
        int i15 = i14 % 2;
    }

    public j6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~(i13 | i10);
        int i15 = ~i12;
        int i16 = ~(i15 | i10);
        if (((i13 | i16) * 712) + (((~(i10 | i11 | i12)) | (~(i13 | i15 | i10))) * (-712)) + ((i14 | i16) * (-712)) + (i11 * 713) + (i10 * (-711)) == 1) {
            cv cvVar = (cv) objArr[1];
            int i17 = f56610r0;
            int i18 = i17 & 101;
            int i19 = (i18 - (~(-(-((i17 ^ 101) | i18))))) - 1;
            f56609q0 = i19 % 128;
            int i20 = i19 % 2;
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -2106531481, 2106531485, System.identityHashCode(cvVar));
            int i21 = f56609q0;
            int i22 = ((i21 | 9) << 1) - (i21 ^ 9);
            f56610r0 = i22 % 128;
            int i23 = i22 % 2;
            return null;
        }
        j6 j6Var = (j6) objArr[0];
        Object obj = objArr[1];
        int i24 = f56610r0;
        int i25 = ((i24 ^ 99) | (i24 & 99)) << 1;
        int i26 = -(((~i24) & 99) | (i24 & (-100)));
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        f56609q0 = i27 % 128;
        cv cvVar2 = (cv) obj;
        if (i27 % 2 != 0) {
            a(new Object[]{j6Var, cvVar2}, 1314052924, -1314052923, System.identityHashCode(j6Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        a(new Object[]{j6Var, cvVar2}, 1314052924, -1314052923, System.identityHashCode(j6Var));
        Unit unit2 = Unit.INSTANCE;
        int i28 = f56610r0;
        int i29 = i28 & 35;
        int i30 = i28 | 35;
        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
        f56609q0 = i31 % 128;
        int i32 = i31 % 2;
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, -62497642, 62497642, System.identityHashCode(this));
    }
}
