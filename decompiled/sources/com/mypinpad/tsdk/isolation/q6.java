package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class q6 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final q6 f57808p0 = new q6();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f57809q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57810r0 = 1;

    static {
        int i10 = f57809q0;
        int i11 = ((i10 & (-32)) | ((~i10) & 31)) + ((i10 & 31) << 1);
        f57810r0 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 15 / 0;
        }
    }

    public q6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i10 * (-519));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~i12;
        int i17 = (((~(i11 | i12)) | (~(i14 | i15 | i16))) * 520) + i13;
        int i18 = ~(i15 | i16);
        int i19 = ~(i12 | i10);
        if ((((~(i10 | i15)) | (~(i14 | i16)) | i19) * 520) + ((i18 | i19) * (-1040)) + i17 != 1) {
            cv cvVar = (cv) objArr[1];
            int i20 = f57810r0;
            int i21 = ((i20 ^ 96) + ((i20 & 96) << 1)) - 1;
            f57809q0 = i21 % 128;
            if (i21 % 2 != 0) {
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar, Boolean.FALSE}, -1728527861, 1728527862, System.identityHashCode(cvVar));
                return null;
            }
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -1728527861, 1728527862, System.identityHashCode(cvVar));
            return null;
        }
        q6 q6Var = (q6) objArr[0];
        Object obj = objArr[1];
        int i22 = f57809q0;
        int i23 = (((i22 & (-32)) | ((~i22) & 31)) - (~(-(-((i22 & 31) << 1))))) - 1;
        f57810r0 = i23 % 128;
        cv cvVar2 = (cv) obj;
        if (i23 % 2 != 0) {
            a(new Object[]{q6Var, cvVar2}, 689978184, -689978184, System.identityHashCode(q6Var));
            return Unit.INSTANCE;
        }
        a(new Object[]{q6Var, cvVar2}, 689978184, -689978184, System.identityHashCode(q6Var));
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, -1320510999, 1320511000, System.identityHashCode(this));
    }
}
