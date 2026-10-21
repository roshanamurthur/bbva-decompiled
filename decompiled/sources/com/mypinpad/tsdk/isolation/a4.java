package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class a4 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a4 f51990p0 = new a4();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f51991q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f51992r0 = 1;

    static {
        int i10 = f51992r0;
        int i11 = i10 & 57;
        int i12 = (i10 | 57) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f51991q0 = i14 % 128;
        int i15 = i14 % 2;
    }

    public a4() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | i11);
        int i14 = ~i12;
        int i15 = (((~(i14 | i11)) | i13) * (-1188)) + (i11 * (-1187)) + (i10 * 595);
        int i16 = ~i11;
        int i17 = (~(i12 | i16)) | i13;
        int i18 = ~(i14 | i10);
        if ((((~(i10 | i16)) | (~(i16 | i14)) | i18) * 594) + ((i17 | i18) * 594) + i15 != 1) {
            cv cvVar = (cv) objArr[1];
            int i19 = f51992r0;
            int i20 = i19 & 53;
            int i21 = (i20 - (~(-(-((i19 ^ 53) | i20))))) - 1;
            f51991q0 = i21 % 128;
            int i22 = i21 % 2;
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar}, -193104396, 193104406, System.identityHashCode(cvVar));
            int i23 = f51992r0;
            int i24 = i23 & 115;
            int i25 = ((i23 | 115) & (~i24)) + (i24 << 1);
            f51991q0 = i25 % 128;
            int i26 = i25 % 2;
            return null;
        }
        a4 a4Var = (a4) objArr[0];
        Object obj = objArr[1];
        int i27 = f51991q0;
        int i28 = (i27 & (-104)) | ((~i27) & 103);
        int i29 = -(-((i27 & 103) << 1));
        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
        f51992r0 = i30 % 128;
        int i31 = i30 % 2;
        a(new Object[]{a4Var, (cv) obj}, 351353337, -351353337, System.identityHashCode(a4Var));
        Unit unit = Unit.INSTANCE;
        int i32 = f51991q0;
        int i33 = i32 & 77;
        int i34 = -(-(i32 | 77));
        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
        f51992r0 = i35 % 128;
        int i36 = i35 % 2;
        return unit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 1859304683, -1859304682, System.identityHashCode(this));
    }
}
