package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class b6 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b6 f54261p0 = new b6();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54262q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54263r0 = 1;

    static {
        int i10 = f54263r0;
        int i11 = i10 & 87;
        int i12 = ((i10 | 87) & (~i11)) + (i11 << 1);
        f54262q0 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public b6() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        if ((((~(i13 | i12)) | i14) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i10 | i12)) | (~(i14 | i10))) * (-318)) + (((~(i11 | (~i12) | i10)) | (~(i13 | i14 | i12))) * (-318)) + (i11 * 319) + (i10 * (-317)) != 1) {
            cv cvVar = (cv) objArr[1];
            int i15 = f54262q0;
            int i16 = (i15 & 107) + (i15 | 107);
            f54263r0 = i16 % 128;
            if (i16 % 2 == 0) {
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar}, -193104396, 193104406, System.identityHashCode(cvVar));
                int i17 = 57 / 0;
            } else {
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar}, -193104396, 193104406, System.identityHashCode(cvVar));
            }
            int i18 = f54263r0;
            int i19 = (i18 | 87) << 1;
            int i20 = -(i18 ^ 87);
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            f54262q0 = i21 % 128;
            if (i21 % 2 == 0) {
                return null;
            }
            throw null;
        }
        b6 b6Var = (b6) objArr[0];
        Object obj = objArr[1];
        int i22 = f54262q0;
        int i23 = i22 & 99;
        int i24 = (i22 | 99) & (~i23);
        int i25 = -(-(i23 << 1));
        int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
        f54263r0 = i26 % 128;
        cv cvVar2 = (cv) obj;
        if (i26 % 2 == 0) {
            a(new Object[]{b6Var, cvVar2}, -1464545885, 1464545885, System.identityHashCode(b6Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        a(new Object[]{b6Var, cvVar2}, -1464545885, 1464545885, System.identityHashCode(b6Var));
        Unit unit2 = Unit.INSTANCE;
        int i27 = (-2) - ((f54262q0 + 94) ^ (-1));
        f54263r0 = i27 % 128;
        int i28 = i27 % 2;
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 1546996870, -1546996869, System.identityHashCode(this));
    }
}
