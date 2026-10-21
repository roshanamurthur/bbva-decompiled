package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setX", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class p5 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final p5 f57627p0 = new p5();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f57628q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57629r0 = 1;

    static {
        int i10 = f57628q0;
        int i11 = i10 & 71;
        int i12 = (((i10 | 71) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
        f57629r0 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public p5() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = ((i10 | i13) * (-757)) + (i11 * (-756)) + (i10 * 758);
        int i15 = ~i11;
        if ((((~(i10 | i11 | i12)) | (~(i13 | i15)) | (~((~i10) | i15))) * 757) + ((~(i15 | i10 | i12)) * 1514) + i14 != 1) {
            p5 p5Var = (p5) objArr[0];
            Object obj = objArr[1];
            int i16 = f57629r0;
            int i17 = (i16 ^ 122) + ((i16 & 122) << 1);
            int i18 = (i17 ^ (-1)) + (i17 << 1);
            f57628q0 = i18 % 128;
            int i19 = i18 % 2;
            a(new Object[]{p5Var, (cv) obj}, -1468576136, 1468576137, System.identityHashCode(p5Var));
            Unit unit = Unit.INSTANCE;
            int i20 = f57628q0;
            int i21 = (((i20 ^ 31) | (i20 & 31)) << 1) - (((~i20) & 31) | (i20 & (-32)));
            f57629r0 = i21 % 128;
            int i22 = i21 % 2;
            return unit;
        }
        cv cvVar = (cv) objArr[1];
        int i23 = f57629r0;
        int i24 = i23 ^ 87;
        int i25 = (((i23 & 87) | i24) << 1) - i24;
        f57628q0 = i25 % 128;
        if (i25 % 2 != 0) {
            Intrinsics.checkNotNullParameter(cvVar, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(cvVar, "");
        int i26 = f57629r0;
        int i27 = i26 & 55;
        int i28 = ((i26 ^ 55) | i27) << 1;
        int i29 = -((i26 | 55) & (~i27));
        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
        f57628q0 = i30 % 128;
        int i31 = i30 % 2;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, -497985434, 497985434, System.identityHashCode(this));
    }
}
