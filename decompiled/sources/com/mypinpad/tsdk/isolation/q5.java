package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setX", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class q5 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f57807p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(boolean z10) {
        super(1);
        this.f57807p0 = z10;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        if ((((~(i10 | i11)) | (~(i12 | i13))) * 433) + (((~((~i11) | i12)) | i13) * (-433)) + ((~((~i12) | i13 | i11)) * 433) + (i11 * 434) + (i10 * (-432)) == 1) {
            q5 q5Var = (q5) objArr[0];
            a(new Object[]{q5Var, (cv) objArr[1]}, 872404535, -872404535, System.identityHashCode(q5Var));
            return Unit.INSTANCE;
        }
        q5 q5Var2 = (q5) objArr[0];
        cv cvVar = (cv) objArr[1];
        Intrinsics.checkNotNullParameter(cvVar, "");
        cv.setDividerPadding(new Object[]{cvVar, Boolean.valueOf(q5Var2.f57807p0)}, -1217412403, 1217412419, System.identityHashCode(cvVar));
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, -1374574502, 1374574503, System.identityHashCode(this));
    }
}
