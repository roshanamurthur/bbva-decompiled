package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class y6 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final y6 f61996p0 = new y6();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61997q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61998r0 = 1;

    static {
        int i10 = f61998r0 + 1;
        f61997q0 = i10 % 128;
        int i11 = i10 % 2;
    }

    public y6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ((~i15) * 497) + (i11 * (-496)) + (i10 * (-496));
        int i17 = ~(i15 | i12);
        int i18 = ~i12;
        if ((((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i18 | i13))) * 497) + ((i17 | (~(i14 | i18 | i10))) * 497) + i16 == 1) {
            cv cvVar = (cv) objArr[1];
            int i19 = f61998r0 + 6;
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            f61997q0 = i20 % 128;
            if (i20 % 2 != 0) {
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar}, -299997872, 299997898, System.identityHashCode(cvVar));
                int i21 = 4 / 0;
            } else {
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar}, -299997872, 299997898, System.identityHashCode(cvVar));
            }
            return null;
        }
        y6 y6Var = (y6) objArr[0];
        Object obj = objArr[1];
        int i22 = f61997q0 + 33;
        f61998r0 = i22 % 128;
        int i23 = i22 % 2;
        a(new Object[]{y6Var, (cv) obj}, 809626796, -809626795, System.identityHashCode(y6Var));
        Unit unit = Unit.INSTANCE;
        int i24 = f61997q0;
        int i25 = i24 & 75;
        int i26 = (i24 ^ 75) | i25;
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        f61998r0 = i27 % 128;
        int i28 = i27 % 2;
        return unit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, -565032573, 565032573, System.identityHashCode(this));
    }
}
