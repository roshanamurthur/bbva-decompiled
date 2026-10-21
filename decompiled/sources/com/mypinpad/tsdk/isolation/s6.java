package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class s6 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final s6 f58193p0 = new s6();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f58194q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f58195r0 = 1;

    static {
        int i10 = f58195r0;
        int i11 = ((i10 ^ 1) - (~((i10 & 1) << 1))) - 1;
        f58194q0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public s6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 334) + (i10 * (-665));
        int i14 = ~i10;
        int i15 = (i14 * (-333)) + i13;
        int i16 = ~i12;
        if ((((~(i14 | i12)) | (~(i11 | i16))) * 333) + (((~(i14 | i16)) | (~(i11 | i12))) * 333) + i15 != 1) {
            cv cvVar = (cv) objArr[1];
            int i17 = f58195r0;
            int i18 = (i17 | 39) << 1;
            int i19 = -(((~i17) & 39) | (i17 & (-40)));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            f58194q0 = i20 % 128;
            int i21 = i20 % 2;
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -2106531481, 2106531485, System.identityHashCode(cvVar));
            cv.setDividerPadding(new Object[]{cvVar, Boolean.FALSE}, -1881163515, 1881163517, System.identityHashCode(cvVar));
            int i22 = f58194q0 + 35;
            f58195r0 = i22 % 128;
            if (i22 % 2 != 0) {
                return null;
            }
            int i23 = 53 / 0;
            return null;
        }
        s6 s6Var = (s6) objArr[0];
        Object obj = objArr[1];
        int i24 = f58195r0;
        int i25 = i24 & 3;
        int i26 = ((i24 ^ 3) | i25) << 1;
        int i27 = -((i24 | 3) & (~i25));
        int i28 = (i26 & i27) + (i27 | i26);
        f58194q0 = i28 % 128;
        cv cvVar2 = (cv) obj;
        if (i28 % 2 != 0) {
            a(new Object[]{s6Var, cvVar2}, 2019790504, -2019790504, System.identityHashCode(s6Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        a(new Object[]{s6Var, cvVar2}, 2019790504, -2019790504, System.identityHashCode(s6Var));
        Unit unit2 = Unit.INSTANCE;
        int i29 = f58194q0;
        int i30 = i29 ^ 9;
        int i31 = -(-((i29 & 9) << 1));
        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
        f58195r0 = i32 % 128;
        int i33 = i32 % 2;
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, -1462437379, 1462437380, System.identityHashCode(this));
    }
}
