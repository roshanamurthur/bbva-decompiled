package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class k6 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final k6 f56753p0 = new k6();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f56754q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f56755r0 = 1;

    static {
        int i10 = f56755r0;
        int i11 = i10 & 89;
        int i12 = -(-((i10 ^ 89) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        f56754q0 = i13 % 128;
        int i14 = i13 % 2;
    }

    public k6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i12;
        if ((((~(i10 | i14 | i16)) | (~(i13 | i12))) * 765) + (((~i15) | (~(i13 | i16))) * 1530) + (((~(i11 | i13 | i12)) | (~(i15 | i16)) | (~(i14 | i10 | i12))) * 765) + (i11 * (-764)) + (i10 * (-1529)) == 1) {
            cv cvVar = (cv) objArr[1];
            int i17 = f56755r0;
            int i18 = i17 ^ 107;
            int i19 = ((((i17 & 107) | i18) << 1) - (~(-i18))) - 1;
            f56754q0 = i19 % 128;
            int i20 = i19 % 2;
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar}, -299997872, 299997898, System.identityHashCode(cvVar));
            int i21 = f56755r0;
            int i22 = ((i21 & 74) + (i21 | 74)) - 1;
            f56754q0 = i22 % 128;
            int i23 = i22 % 2;
            return null;
        }
        k6 k6Var = (k6) objArr[0];
        Object obj = objArr[1];
        int i24 = f56755r0;
        int i25 = (((i24 | 14) << 1) - (i24 ^ 14)) - 1;
        f56754q0 = i25 % 128;
        int i26 = i25 % 2;
        a(new Object[]{k6Var, (cv) obj}, -318624878, 318624879, System.identityHashCode(k6Var));
        Unit unit = Unit.INSTANCE;
        int i27 = f56754q0;
        int i28 = (i27 | 83) << 1;
        int i29 = -(((~i27) & 83) | (i27 & (-84)));
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        f56755r0 = i30 % 128;
        int i31 = i30 % 2;
        return unit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 1502040583, -1502040583, System.identityHashCode(this));
    }
}
