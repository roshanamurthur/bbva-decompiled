package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setY", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class f6 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final f6 f55490p0 = new f6();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f55491q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55492r0 = 1;

    static {
        int i10 = f55491q0;
        int i11 = i10 & 37;
        int i12 = -(-((i10 ^ 37) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        f55492r0 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public f6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        if ((((~(i10 | (~i11))) | (~(i11 | i13 | i12))) * 235) + (((~(i13 | i12)) | i11) * (-470)) + (((~((~i12) | i13)) | i11) * (-235)) + (i11 * 471) + (i10 * 236) != 1) {
            f6 f6Var = (f6) objArr[0];
            Object obj = objArr[1];
            int i14 = f55491q0;
            int i15 = (-2) - (((i14 ^ 106) + ((i14 & 106) << 1)) ^ (-1));
            f55492r0 = i15 % 128;
            int i16 = i15 % 2;
            a(new Object[]{f6Var, (cv) obj}, -1173101659, 1173101660, System.identityHashCode(f6Var));
            Unit unit = Unit.INSTANCE;
            int i17 = f55492r0;
            int i18 = ((i17 & (-58)) | ((~i17) & 57)) + ((i17 & 57) << 1);
            f55491q0 = i18 % 128;
            int i19 = i18 % 2;
            return unit;
        }
        cv cvVar = (cv) objArr[1];
        int i20 = f55492r0;
        int i21 = i20 & 97;
        int i22 = (i20 | 97) & (~i21);
        int i23 = i21 << 1;
        int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
        f55491q0 = i24 % 128;
        if (i24 % 2 != 0) {
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar}, -756210758, 756210779, System.identityHashCode(cvVar));
            int i25 = 43 / 0;
        } else {
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar}, -756210758, 756210779, System.identityHashCode(cvVar));
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 2120218030, -2120218030, System.identityHashCode(this));
    }
}
