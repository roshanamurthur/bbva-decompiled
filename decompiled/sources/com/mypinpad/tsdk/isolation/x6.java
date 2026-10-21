package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/dc;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class x6 extends Lambda implements Function1<dc, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final x6 f61744p0 = new x6();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61745q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61746r0 = 1;

    static {
        int i10 = f61745q0 + 57;
        f61746r0 = i10 % 128;
        int i11 = i10 % 2;
    }

    public x6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ((i11 | i13) * (-1434)) + (i11 * 1435) + (i10 * (-716));
        int i15 = ~i12;
        int i16 = ~(i15 | i11);
        int i17 = ~(i10 | i11);
        int i18 = i13 | (~i11);
        if (((i17 | (~(i18 | i15)) | (~(i11 | i12))) * 717) + ((i16 | i17 | (~(i18 | i12))) * 717) + i14 != 1) {
            x6 x6Var = (x6) objArr[0];
            Object obj = objArr[1];
            int i19 = f61746r0 + 77;
            f61745q0 = i19 % 128;
            dc dcVar = (dc) obj;
            if (i19 % 2 == 0) {
                a(new Object[]{x6Var, dcVar}, -1501002494, 1501002495, System.identityHashCode(x6Var));
                return Unit.INSTANCE;
            }
            a(new Object[]{x6Var, dcVar}, -1501002494, 1501002495, System.identityHashCode(x6Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        dc dcVar2 = (dc) objArr[1];
        int i20 = f61746r0;
        int i21 = (i20 & (-82)) | ((~i20) & 81);
        int i22 = -(-((i20 & 81) << 1));
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        f61745q0 = i23 % 128;
        int i24 = i23 % 2;
        Intrinsics.checkNotNullParameter(dcVar2, "");
        dc.setDividerPadding(new Object[]{dcVar2}, -1087540522, 1087540523, System.identityHashCode(dcVar2));
        int i25 = f61745q0 + 31;
        f61746r0 = i25 % 128;
        if (i25 % 2 != 0) {
            return null;
        }
        int i26 = 65 / 0;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(dc dcVar) {
        return a(new Object[]{this, dcVar}, 146547666, -146547666, System.identityHashCode(this));
    }
}
