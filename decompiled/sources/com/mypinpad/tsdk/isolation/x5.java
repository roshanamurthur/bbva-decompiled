package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class x5 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final x5 f61741p0 = new x5();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61742q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f61743r0;

    static {
        int i10 = f61742q0;
        int i11 = i10 & 7;
        int i12 = (i10 | 7) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f61743r0 = i14 % 128;
        int i15 = i14 % 2;
    }

    public x5() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i13 | i12);
        int i15 = ~i12;
        int i16 = ((i14 | (~(i15 | i11))) * (-1808)) + (i11 * (-903)) + (i10 * 905);
        int i17 = ~i11;
        int i18 = i10 | i15;
        int i19 = (((~i18) | (~(i11 | i13)) | (~(i12 | i17))) * 904) + (((~(i18 | i11)) | (~(i13 | i17 | i12))) * 904) + i16;
        int i20 = f61743r0;
        if (i19 != 1) {
            x5 x5Var = (x5) objArr[0];
            Object obj = objArr[1];
            int i21 = i20 + 111;
            f61742q0 = i21 % 128;
            cv cvVar = (cv) obj;
            if (i21 % 2 == 0) {
                a(new Object[]{x5Var, cvVar}, 620235495, -620235494, System.identityHashCode(x5Var));
                return Unit.INSTANCE;
            }
            a(new Object[]{x5Var, cvVar}, 620235495, -620235494, System.identityHashCode(x5Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        cv cvVar2 = (cv) objArr[1];
        int i22 = i20 & 21;
        int i23 = (i20 ^ 21) | i22;
        int i24 = (i22 & i23) + (i22 | i23);
        f61742q0 = i24 % 128;
        if (i24 % 2 == 0) {
            Intrinsics.checkNotNullParameter(cvVar2, "");
            cv.setDividerPadding(new Object[]{cvVar2}, -193104396, 193104406, System.identityHashCode(cvVar2));
            return null;
        }
        Intrinsics.checkNotNullParameter(cvVar2, "");
        cv.setDividerPadding(new Object[]{cvVar2}, -193104396, 193104406, System.identityHashCode(cvVar2));
        int i25 = 41 / 0;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, -695602422, 695602422, System.identityHashCode(this));
    }
}
