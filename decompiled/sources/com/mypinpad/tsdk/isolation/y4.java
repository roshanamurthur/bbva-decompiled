package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setX", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class y4 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final y4 f61990p0 = new y4();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61991q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61992r0 = 1;

    static {
        int i10 = f61991q0;
        int i11 = ((i10 | 21) << 1) - (i10 ^ 21);
        f61992r0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public y4() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        Unit unit;
        int i13 = ~i12;
        int i14 = ~i10;
        int i15 = ~i11;
        if ((((~(i10 | i15)) | (~(i11 | i14))) * 662) + (((~(i12 | i11)) | (~(i10 | i12))) * (-1324)) + ((i13 | (~(i14 | i15))) * 1324) + (i11 * (-661)) + (i10 * (-661)) != 1) {
            cv cvVar = (cv) objArr[1];
            int i16 = f61992r0 + 13;
            f61991q0 = i16 % 128;
            int i17 = i16 % 2;
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar, cl.RRP_NOT_PERFORMED}, 1192679248, -1192679220, System.identityHashCode(cvVar));
            int i18 = f61992r0;
            int i19 = i18 & 105;
            int i20 = (i18 ^ 105) | i19;
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f61991q0 = i21 % 128;
            int i22 = i21 % 2;
            return null;
        }
        y4 y4Var = (y4) objArr[0];
        Object obj = objArr[1];
        int i23 = f61991q0;
        int i24 = (i23 ^ 7) + ((i23 & 7) << 1);
        f61992r0 = i24 % 128;
        cv cvVar2 = (cv) obj;
        if (i24 % 2 == 0) {
            a(new Object[]{y4Var, cvVar2}, 282680839, -282680839, System.identityHashCode(y4Var));
            unit = Unit.INSTANCE;
            int i25 = 18 / 0;
        } else {
            a(new Object[]{y4Var, cvVar2}, 282680839, -282680839, System.identityHashCode(y4Var));
            unit = Unit.INSTANCE;
        }
        int i26 = f61991q0;
        int i27 = ((i26 | 53) << 1) - (i26 ^ 53);
        f61992r0 = i27 % 128;
        if (i27 % 2 != 0) {
            return unit;
        }
        int i28 = 6 / 0;
        return unit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 724001768, -724001767, System.identityHashCode(this));
    }
}
