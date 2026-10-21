package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setY", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class p6 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final p6 f57630p0 = new p6();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f57631q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57632r0 = 1;

    static {
        int i10 = ((-1) << 1) - ((f57632r0 + 44) ^ (-1));
        f57631q0 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 2 / 0;
        }
    }

    public p6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        if ((((~(i10 | i12)) | (~(i11 | i14))) * 950) + (((~(i14 | i10)) | (~(i11 | i12))) * (-950)) + (((~(i13 | i14)) | (~((~i10) | i12))) * ReturnCode.ERR_REPOSITORY) + (i11 * (-949)) + (i10 * (-949)) == 1) {
            cv cvVar = (cv) objArr[1];
            int i15 = f57631q0;
            int i16 = i15 & 111;
            int i17 = -(-((i15 ^ 111) | i16));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            f57632r0 = i18 % 128;
            if (i18 % 2 == 0) {
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -243948838, 243948846, System.identityHashCode(cvVar));
            } else {
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -243948838, 243948846, System.identityHashCode(cvVar));
            }
            return null;
        }
        p6 p6Var = (p6) objArr[0];
        Object obj = objArr[1];
        int i19 = f57632r0 + 81;
        f57631q0 = i19 % 128;
        cv cvVar2 = (cv) obj;
        Object[] objArr2 = new Object[2];
        if (i19 % 2 == 0) {
            objArr2[0] = p6Var;
            objArr2[1] = cvVar2;
            a(objArr2, -834139905, 834139906, System.identityHashCode(p6Var));
            return Unit.INSTANCE;
        }
        objArr2[0] = p6Var;
        objArr2[1] = cvVar2;
        a(objArr2, -834139905, 834139906, System.identityHashCode(p6Var));
        int i20 = 14 / 0;
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, -1154733800, 1154733800, System.identityHashCode(this));
    }
}
