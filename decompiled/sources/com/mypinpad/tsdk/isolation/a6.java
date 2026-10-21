package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setY", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class a6 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a6 f51997p0 = new a6();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f51998q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f51999r0 = 1;

    static {
        int i10 = f51999r0 + 97;
        f51998q0 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public a6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = ~i12;
        int i17 = (~(i13 | i16)) | i15 | (~(i14 | i16));
        int i18 = i10 | i11;
        int i19 = ((i17 | (~(i18 | i12))) * (-84)) + (i11 * 85) + (i10 * 85);
        int i20 = i10 | (~(i12 | i14));
        int i21 = ~(i11 | i16);
        if (((i21 | (~i18)) * 84) + ((i20 | i21) * (-84)) + i19 == 1) {
            a6 a6Var = (a6) objArr[0];
            Object obj = objArr[1];
            int i22 = f51998q0;
            int i23 = i22 & 1;
            int i24 = i23 + ((i22 ^ 1) | i23);
            f51999r0 = i24 % 128;
            int i25 = i24 % 2;
            a(new Object[]{a6Var, (cv) obj}, -795933080, 795933080, System.identityHashCode(a6Var));
            Unit unit = Unit.INSTANCE;
            int i26 = f51998q0 + 63;
            f51999r0 = i26 % 128;
            if (i26 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        cv cvVar = (cv) objArr[1];
        int i27 = f51999r0;
        int i28 = (i27 ^ 85) + ((i27 & 85) << 1);
        f51998q0 = i28 % 128;
        int i29 = i28 % 2;
        Intrinsics.checkNotNullParameter(cvVar, "");
        cv.setDividerPadding(new Object[]{cvVar}, 1509608714, -1509608708, System.identityHashCode(cvVar));
        int i30 = f51999r0;
        int i31 = (i30 | 55) << 1;
        int i32 = -(((~i30) & 55) | (i30 & (-56)));
        int i33 = (i31 & i32) + (i32 | i31);
        f51998q0 = i33 % 128;
        if (i33 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 1316998315, -1316998314, System.identityHashCode(this));
    }
}
