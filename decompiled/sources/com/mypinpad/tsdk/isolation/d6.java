package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setX", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class d6 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d6 f55111p0 = new d6();

    static {
        int i10 = ((((1 ^ 59) | (1 & 59)) << 1) - (~(-((1 & (-60)) | ((~1) & 59))))) - 1;
        int i11 = i10 % 128;
        if (i10 % 2 != 0) {
            int i12 = 59 / 0;
        }
    }

    public d6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        if ((i15 * 576) + (((~(i10 | (~i12) | i14)) | (~(i11 | i13))) * 576) + (((~(i14 | i12)) | i15) * 576) + (i11 * (-575)) + (i10 * (-575)) != 1) {
            d6 d6Var = (d6) objArr[0];
            a(new Object[]{d6Var, (cv) objArr[1]}, 1599857215, -1599857214, System.identityHashCode(d6Var));
            return Unit.INSTANCE;
        }
        cv cvVar = (cv) objArr[1];
        Intrinsics.checkNotNullParameter(cvVar, "");
        cv.setDividerPadding(new Object[]{cvVar}, -756210758, 756210779, System.identityHashCode(cvVar));
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 652199042, -652199042, System.identityHashCode(this));
    }
}
