package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class p3 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final p3 f57624p0 = new p3();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f57625q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57626r0 = 1;

    static {
        int i10 = f57625q0;
        int i11 = (((i10 ^ 33) | (i10 & 33)) << 1) - (((~i10) & 33) | (i10 & (-34)));
        f57626r0 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public p3() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ((~((~i12) | i13 | i10)) * 130) + (i11 * 131) + (i10 * (-129));
        int i15 = i13 | i10;
        if ((((~((~i10) | i11)) | (~(i15 | i12))) * 130) + ((~i15) * (-260)) + i14 != 1) {
            cv cvVar = (cv) objArr[1];
            int i16 = f57626r0;
            int i17 = ((i16 & (-118)) | ((~i16) & 117)) + ((i16 & 117) << 1);
            f57625q0 = i17 % 128;
            if (i17 % 2 != 0) {
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -2106531481, 2106531485, System.identityHashCode(cvVar));
            } else {
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -2106531481, 2106531485, System.identityHashCode(cvVar));
            }
            int i18 = f57625q0;
            int i19 = i18 & 91;
            int i20 = i19 + ((i18 ^ 91) | i19);
            f57626r0 = i20 % 128;
            int i21 = i20 % 2;
            return null;
        }
        p3 p3Var = (p3) objArr[0];
        Object obj = objArr[1];
        int i22 = f57625q0 + 57;
        f57626r0 = i22 % 128;
        cv cvVar2 = (cv) obj;
        Object[] objArr2 = new Object[2];
        if (i22 % 2 != 0) {
            objArr2[0] = p3Var;
            objArr2[1] = cvVar2;
            a(objArr2, -1321334595, 1321334595, System.identityHashCode(p3Var));
            return Unit.INSTANCE;
        }
        objArr2[0] = p3Var;
        objArr2[1] = cvVar2;
        a(objArr2, -1321334595, 1321334595, System.identityHashCode(p3Var));
        int i23 = 29 / 0;
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 325830994, -325830993, System.identityHashCode(this));
    }
}
