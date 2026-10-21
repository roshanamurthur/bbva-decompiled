package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setX", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class t3 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final t3 f60971p0 = new t3();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f60972q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f60973r0 = 1;

    static {
        int i10 = ((-1) << 1) - ((f60972q0 + 66) ^ (-1));
        f60973r0 = i10 % 128;
        int i11 = i10 % 2;
    }

    public t3() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ((i11 | i13) * (-368)) + (i11 * 185) + (i10 * (-183));
        int i15 = ~i11;
        int i16 = ~i12;
        if ((((~(i10 | i11)) | (~(i16 | i10)) | (~(i13 | i15))) * 184) + ((i10 | i15 | i16) * 184) + i14 == 1) {
            cv cvVar = (cv) objArr[1];
            int i17 = f60973r0;
            int i18 = (i17 ^ 97) + ((i17 & 97) << 1);
            f60972q0 = i18 % 128;
            int i19 = i18 % 2;
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -243948838, 243948846, System.identityHashCode(cvVar));
            int i20 = f60973r0 + 55;
            f60972q0 = i20 % 128;
            int i21 = i20 % 2;
            return null;
        }
        t3 t3Var = (t3) objArr[0];
        Object obj = objArr[1];
        int i22 = f60972q0;
        int i23 = (i22 & (-106)) | ((~i22) & 105);
        int i24 = (i22 & 105) << 1;
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        f60973r0 = i25 % 128;
        cv cvVar2 = (cv) obj;
        if (i25 % 2 == 0) {
            a(new Object[]{t3Var, cvVar2}, -2063367871, 2063367872, System.identityHashCode(t3Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        a(new Object[]{t3Var, cvVar2}, -2063367871, 2063367872, System.identityHashCode(t3Var));
        Unit unit2 = Unit.INSTANCE;
        int i26 = f60973r0;
        int i27 = i26 & 37;
        int i28 = (((i26 ^ 37) | i27) << 1) - ((i26 | 37) & (~i27));
        f60972q0 = i28 % 128;
        if (i28 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 1171383358, -1171383358, System.identityHashCode(this));
    }
}
