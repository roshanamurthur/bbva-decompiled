package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class f5 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final f5 f55487p0 = new f5();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f55488q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55489r0 = 1;

    static {
        int i10 = f55488q0;
        int i11 = (((i10 | 30) << 1) - (i10 ^ 30)) - 1;
        f55489r0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public f5() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((i10 | i12) * (-50)) + (i11 * (-49)) + (i10 * 51);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~(i14 | i15 | i12);
        int i17 = ~i12;
        int i18 = i15 | i17;
        if ((((~(i10 | i17)) | (~(i15 | i10)) | (~i18)) * 50) + ((i16 | (~(i18 | i10))) * 50) + i13 != 1) {
            f5 f5Var = (f5) objArr[0];
            Object obj = objArr[1];
            int i19 = f55489r0;
            int i20 = ((((i19 ^ 33) | (i19 & 33)) << 1) - (~(-(((~i19) & 33) | (i19 & (-34)))))) - 1;
            f55488q0 = i20 % 128;
            int i21 = i20 % 2;
            a(new Object[]{f5Var, (cv) obj}, -1109503535, 1109503536, System.identityHashCode(f5Var));
            Unit unit = Unit.INSTANCE;
            int i22 = f55489r0;
            int i23 = i22 & 101;
            int i24 = -(-(i22 | 101));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            f55488q0 = i25 % 128;
            int i26 = i25 % 2;
            return unit;
        }
        cv cvVar = (cv) objArr[1];
        int i27 = f55488q0;
        int i28 = i27 & 89;
        int i29 = (i28 - (~((i27 ^ 89) | i28))) - 1;
        f55489r0 = i29 % 128;
        if (i29 % 2 == 0) {
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar}, -193104396, 193104406, System.identityHashCode(cvVar));
            throw null;
        }
        Intrinsics.checkNotNullParameter(cvVar, "");
        cv.setDividerPadding(new Object[]{cvVar}, -193104396, 193104406, System.identityHashCode(cvVar));
        int i30 = f55488q0;
        int i31 = (((i30 & (-38)) | ((~i30) & 37)) - (~(-(-((i30 & 37) << 1))))) - 1;
        f55489r0 = i31 % 128;
        if (i31 % 2 == 0) {
            int i32 = 72 / 0;
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 999612325, -999612325, System.identityHashCode(this));
    }
}
