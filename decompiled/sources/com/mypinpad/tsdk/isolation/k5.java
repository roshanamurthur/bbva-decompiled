package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setX", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class k5 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final k5 f56752p0 = new k5();

    static {
        int i10 = 1 & 3;
        int i11 = (1 ^ 3) | i10;
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        int i13 = i12 % 128;
        int i14 = i12 % 2;
    }

    public k5() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        if ((((~(i10 | i12)) | i11) * 272) + (((~(i13 | i12)) | (~(i13 | i11))) * (-272)) + (((~((~i11) | i13 | (~i12))) | (~(i10 | i11 | i12))) * (-272)) + (i11 * (-271)) + (i10 * 273) != 1) {
            k5 k5Var = (k5) objArr[0];
            a(new Object[]{k5Var, (cv) objArr[1]}, 959946119, -959946118, System.identityHashCode(k5Var));
            return Unit.INSTANCE;
        }
        cv cvVar = (cv) objArr[1];
        Intrinsics.checkNotNullParameter(cvVar, "");
        cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -2106531481, 2106531485, System.identityHashCode(cvVar));
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, -241765945, 241765945, System.identityHashCode(this));
    }
}
