package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setY", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class h6 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h6 f56148p0 = new h6();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f56149q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f56150r0 = 1;

    static {
        int i10 = f56149q0;
        int i11 = ((i10 & 78) + (i10 | 78)) - 1;
        f56150r0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public h6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ((~(i13 | i11)) * (-1182)) + (i11 * (-590)) + (i10 * 592);
        int i15 = ~i11;
        if (((i12 | i13 | i15) * 591) + (((~(i10 | i11)) | (~(i13 | i15 | (~i12)))) * (-591)) + i14 == 1) {
            h6 h6Var = (h6) objArr[0];
            Object obj = objArr[1];
            int i16 = f56150r0;
            int i17 = (i16 & 63) + (i16 | 63);
            f56149q0 = i17 % 128;
            cv cvVar = (cv) obj;
            if (i17 % 2 == 0) {
                a(new Object[]{h6Var, cvVar}, -382425426, 382425426, System.identityHashCode(h6Var));
                return Unit.INSTANCE;
            }
            a(new Object[]{h6Var, cvVar}, -382425426, 382425426, System.identityHashCode(h6Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        cv cvVar2 = (cv) objArr[1];
        int i18 = f56149q0;
        int i19 = ((i18 ^ 97) | (i18 & 97)) << 1;
        int i20 = -(((~i18) & 97) | (i18 & (-98)));
        int i21 = (i19 & i20) + (i20 | i19);
        f56150r0 = i21 % 128;
        int i22 = i21 % 2;
        Intrinsics.checkNotNullParameter(cvVar2, "");
        cv.setDividerPadding(new Object[]{cvVar2, Boolean.TRUE}, -243948838, 243948846, System.identityHashCode(cvVar2));
        int i23 = f56149q0;
        int i24 = ((i23 | 39) << 1) - (i23 ^ 39);
        f56150r0 = i24 % 128;
        int i25 = i24 % 2;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, -746844936, 746844937, System.identityHashCode(this));
    }
}
