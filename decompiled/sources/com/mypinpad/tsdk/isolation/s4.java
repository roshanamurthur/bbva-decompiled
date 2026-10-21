package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/dc;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class s4 extends Lambda implements Function1<dc, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final s4 f58187p0 = new s4();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f58188q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f58189r0 = 1;

    static {
        int i10 = f58189r0;
        int i11 = (i10 & (-88)) | ((~i10) & 87);
        int i12 = -(-((i10 & 87) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        f58188q0 = i13 % 128;
        int i14 = i13 % 2;
    }

    public s4() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = ~i10;
        int i15 = ~i11;
        if ((((~(i10 | i15)) | (~(i11 | i14))) * 662) + (((~(i12 | i11)) | (~(i10 | i12))) * (-1324)) + ((i13 | (~(i14 | i15))) * 1324) + (i11 * (-661)) + (i10 * (-661)) == 1) {
            s4 s4Var = (s4) objArr[0];
            Object obj = objArr[1];
            int i16 = f58188q0;
            int i17 = i16 & 71;
            int i18 = (((i16 | 71) & (~i17)) - (~(i17 << 1))) - 1;
            f58189r0 = i18 % 128;
            int i19 = i18 % 2;
            a(new Object[]{s4Var, (dc) obj}, 1607213239, -1607213239, System.identityHashCode(s4Var));
            Unit unit = Unit.INSTANCE;
            int i20 = f58189r0 + 87;
            f58188q0 = i20 % 128;
            int i21 = i20 % 2;
            return unit;
        }
        dc dcVar = (dc) objArr[1];
        int i22 = f58188q0;
        int i23 = ((i22 & 120) + (i22 | 120)) - 1;
        f58189r0 = i23 % 128;
        int i24 = i23 % 2;
        Intrinsics.checkNotNullParameter(dcVar, "");
        dc.setDividerPadding(new Object[]{dcVar}, -1928700375, 1928700378, System.identityHashCode(dcVar));
        int i25 = f58189r0;
        int i26 = ((i25 | 51) << 1) - (i25 ^ 51);
        f58188q0 = i26 % 128;
        if (i26 % 2 != 0) {
            int i27 = 27 / 0;
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(dc dcVar) {
        return a(new Object[]{this, dcVar}, -1253997029, 1253997030, System.identityHashCode(this));
    }
}
