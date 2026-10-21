package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class u3 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final u3 f61234p0 = new u3();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61235q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61236r0 = 1;

    static {
        int i10 = f61236r0 + 101;
        f61235q0 = i10 % 128;
        int i11 = i10 % 2;
    }

    public u3() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-475)) + (i10 * 477);
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        int i16 = ~(i15 | i10 | i12);
        if (((~(i10 | i15 | (~i12))) * 476) + (i16 * 952) + ((i14 | i16) * (-476)) + i13 == 1) {
            u3 u3Var = (u3) objArr[0];
            Object obj = objArr[1];
            int i17 = f61235q0;
            int i18 = (i17 & 77) + (i17 | 77);
            f61236r0 = i18 % 128;
            int i19 = i18 % 2;
            a(new Object[]{u3Var, (cv) obj}, 496281696, -496281696, System.identityHashCode(u3Var));
            Unit unit = Unit.INSTANCE;
            int i20 = f61235q0 + 37;
            f61236r0 = i20 % 128;
            if (i20 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        cv cvVar = (cv) objArr[1];
        int i21 = f61236r0;
        int i22 = ((i21 ^ 50) + ((i21 & 50) << 1)) - 1;
        f61235q0 = i22 % 128;
        int i23 = i22 % 2;
        Intrinsics.checkNotNullParameter(cvVar, "");
        cv.setDividerPadding(new Object[]{cvVar}, -756210758, 756210779, System.identityHashCode(cvVar));
        int i24 = f61235q0;
        int i25 = (((i24 ^ 45) | (i24 & 45)) << 1) - (((~i24) & 45) | (i24 & (-46)));
        f61236r0 = i25 % 128;
        if (i25 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, -2013529859, 2013529860, System.identityHashCode(this));
    }
}
