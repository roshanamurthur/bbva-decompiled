package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class o3 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final o3 f57414p0 = new o3();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f57415q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57416r0 = 1;

    static {
        int i10 = f57416r0;
        int i11 = i10 & 105;
        int i12 = (((i10 ^ 105) | i11) << 1) - ((i10 | 105) & (~i11));
        f57415q0 = i12 % 128;
        int i13 = i12 % 2;
    }

    public o3() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | i11);
        int i14 = ~i12;
        int i15 = (((~(i14 | i11)) | i13) * (-1188)) + (i11 * (-1187)) + (i10 * 595);
        int i16 = ~i11;
        int i17 = (~(i12 | i16)) | i13;
        int i18 = ~(i14 | i10);
        if ((((~(i10 | i16)) | (~(i16 | i14)) | i18) * 594) + ((i17 | i18) * 594) + i15 == 1) {
            o3 o3Var = (o3) objArr[0];
            Object obj = objArr[1];
            int i19 = f57415q0;
            int i20 = (i19 | 31) << 1;
            int i21 = -(((~i19) & 31) | (i19 & (-32)));
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            f57416r0 = i22 % 128;
            int i23 = i22 % 2;
            a(new Object[]{o3Var, (cv) obj}, -597184587, 597184587, System.identityHashCode(o3Var));
            Unit unit = Unit.INSTANCE;
            int i24 = f57416r0;
            int i25 = ((i24 ^ 64) + ((i24 & 64) << 1)) - 1;
            f57415q0 = i25 % 128;
            int i26 = i25 % 2;
            return unit;
        }
        cv cvVar = (cv) objArr[1];
        int i27 = f57416r0 + 33;
        f57415q0 = i27 % 128;
        int i28 = i27 % 2;
        Intrinsics.checkNotNullParameter(cvVar, "");
        cv.setDividerPadding(new Object[]{cvVar}, -1388264608, 1388264633, System.identityHashCode(cvVar));
        int i29 = f57415q0;
        int i30 = i29 & 75;
        int i31 = ((i29 ^ 75) | i30) << 1;
        int i32 = -((i29 | 75) & (~i30));
        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
        f57416r0 = i33 % 128;
        if (i33 % 2 == 0) {
            int i34 = 96 / 0;
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 561697734, -561697733, System.identityHashCode(this));
    }
}
