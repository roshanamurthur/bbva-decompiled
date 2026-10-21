package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class h5 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h5 f56145p0 = new h5();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f56146q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f56147r0 = 1;

    static {
        int i10 = f56146q0;
        int i11 = i10 & 37;
        int i12 = -(-((i10 ^ 37) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f56147r0 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 66 / 0;
        }
    }

    public h5() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ((~((~i12) | i13 | i10)) * 130) + (i11 * 131) + (i10 * (-129));
        int i15 = i13 | i10;
        if ((((~((~i10) | i11)) | (~(i15 | i12))) * 130) + ((~i15) * (-260)) + i14 != 1) {
            h5 h5Var = (h5) objArr[0];
            Object obj = objArr[1];
            int i16 = f56146q0;
            int i17 = i16 & 21;
            int i18 = -(-(i16 | 21));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            f56147r0 = i19 % 128;
            int i20 = i19 % 2;
            a(new Object[]{h5Var, (cv) obj}, 999349020, -999349019, System.identityHashCode(h5Var));
            Unit unit = Unit.INSTANCE;
            int i21 = f56147r0;
            int i22 = i21 & 31;
            int i23 = -(-((i21 ^ 31) | i22));
            int i24 = (i22 & i23) + (i23 | i22);
            f56146q0 = i24 % 128;
            int i25 = i24 % 2;
            return unit;
        }
        cv cvVar = (cv) objArr[1];
        int i26 = f56146q0;
        int i27 = i26 & 65;
        int i28 = (i26 | 65) & (~i27);
        int i29 = i27 << 1;
        int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
        f56147r0 = i30 % 128;
        if (i30 % 2 == 0) {
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar}, -193104396, 193104406, System.identityHashCode(cvVar));
            throw null;
        }
        Intrinsics.checkNotNullParameter(cvVar, "");
        cv.setDividerPadding(new Object[]{cvVar}, -193104396, 193104406, System.identityHashCode(cvVar));
        int i31 = f56147r0 + 113;
        f56146q0 = i31 % 128;
        if (i31 % 2 != 0) {
            int i32 = 89 / 0;
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, -994278349, 994278349, System.identityHashCode(this));
    }
}
