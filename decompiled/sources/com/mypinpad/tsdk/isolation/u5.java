package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/ji;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/ji;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class u5 extends Lambda implements Function1<ji, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final u5 f61243p0 = new u5();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61244q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61245r0 = 1;

    static {
        int i10 = f61244q0;
        int i11 = ((i10 ^ 90) + ((i10 & 90) << 1)) - 1;
        f61245r0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public u5() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 253) + (i10 * 253);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~(i14 | i15);
        int i17 = i15 | (~i12);
        int i18 = i16 | (~i17);
        int i19 = i11 | i10;
        int i20 = ~(i12 | i19);
        if ((((~(i10 | i17)) | i20) * 252) + (i19 * (-252)) + ((i18 | i20) * (-252)) + i13 == 1) {
            u5 u5Var = (u5) objArr[0];
            Object obj = objArr[1];
            int i21 = f61244q0;
            int i22 = ((i21 | 125) << 1) - (i21 ^ 125);
            f61245r0 = i22 % 128;
            int i23 = i22 % 2;
            a(new Object[]{u5Var, (ji) obj}, 676692412, -676692412, System.identityHashCode(u5Var));
            Unit unit = Unit.INSTANCE;
            int i24 = f61244q0;
            int i25 = i24 & 21;
            int i26 = (i24 ^ 21) | i25;
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            f61245r0 = i27 % 128;
            int i28 = i27 % 2;
            return unit;
        }
        ji jiVar = (ji) objArr[1];
        int i29 = f61244q0;
        int i30 = (i29 & 33) + (i29 | 33);
        f61245r0 = i30 % 128;
        if (i30 % 2 == 0) {
            Intrinsics.checkNotNullParameter(jiVar, "");
            ji.setDividerPadding(new Object[]{jiVar}, 1403259952, -1403259949, System.identityHashCode(jiVar));
            throw null;
        }
        Intrinsics.checkNotNullParameter(jiVar, "");
        ji.setDividerPadding(new Object[]{jiVar}, 1403259952, -1403259949, System.identityHashCode(jiVar));
        int i31 = f61245r0;
        int i32 = i31 & 117;
        int i33 = i32 + ((i31 ^ 117) | i32);
        f61244q0 = i33 % 128;
        int i34 = i33 % 2;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ji jiVar) {
        return a(new Object[]{this, jiVar}, -1566625406, 1566625407, System.identityHashCode(this));
    }
}
