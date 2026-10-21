package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class w5 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final w5 f61604p0 = new w5();

    static {
        int i10 = 1 + 55;
        int i11 = i10 % 128;
        if (i10 % 2 != 0) {
            int i12 = 12 / 0;
        }
    }

    public w5() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        if ((((~(i10 | i14)) | (~(i12 | (~i10))) | i13) * 45) + (((~(i11 | i10)) | (~(i13 | i12))) * (-45)) + (((~(i13 | i14)) | i10) * (-90)) + (i11 * 46) + (i10 * 46) != 1) {
            cv cvVar = (cv) objArr[1];
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar}, -826471606, 826471611, System.identityHashCode(cvVar));
            return null;
        }
        w5 w5Var = (w5) objArr[0];
        Object obj = objArr[1];
        System.identityHashCode(w5Var);
        System.identityHashCode(w5Var);
        a(new Object[]{w5Var, (cv) obj}, -938639449, 938639449, System.identityHashCode(w5Var));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 1687601992, -1687601991, System.identityHashCode(this));
    }
}
