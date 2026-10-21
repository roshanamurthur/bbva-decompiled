package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cr;", "", "setX", "(Lcom/mypinpad/tsdk/i/cr;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class j9 extends Lambda implements Function1<cr, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j9 f56620p0 = new j9();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f56621q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f56622r0 = 1;

    static {
        int i10 = f56621q0;
        int i11 = i10 & 27;
        int i12 = (i10 ^ 27) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        f56622r0 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public j9() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~(i10 | i11)) * (-495)) + (i11 * (-494)) + (i10 * (-494));
        int i14 = (~i12) | i10;
        if ((((~((~i10) | (~i11))) | (~i14)) * 495) + (i14 * 495) + i13 == 1) {
            cr crVar = (cr) objArr[1];
            int i15 = f56622r0;
            int i16 = i15 & 81;
            int i17 = i16 + ((i15 ^ 81) | i16);
            f56621q0 = i17 % 128;
            if (i17 % 2 != 0) {
                Intrinsics.checkNotNullParameter(crVar, "");
                cr.setDividerPadding(new Object[]{crVar, Boolean.TRUE}, 1459052326, -1459052324, System.identityHashCode(crVar));
                cr.setDividerPadding(new Object[]{crVar, Boolean.FALSE}, -2146251303, 2146251306, System.identityHashCode(crVar));
                return null;
            }
            Intrinsics.checkNotNullParameter(crVar, "");
            Boolean bool = Boolean.FALSE;
            cr.setDividerPadding(new Object[]{crVar, bool}, 1459052326, -1459052324, System.identityHashCode(crVar));
            cr.setDividerPadding(new Object[]{crVar, bool}, -2146251303, 2146251306, System.identityHashCode(crVar));
            return null;
        }
        j9 j9Var = (j9) objArr[0];
        Object obj = objArr[1];
        int i18 = f56622r0;
        int i19 = i18 & 81;
        int i20 = (i19 - (~((i18 ^ 81) | i19))) - 1;
        f56621q0 = i20 % 128;
        int i21 = i20 % 2;
        a(new Object[]{j9Var, (cr) obj}, -1633343683, 1633343684, System.identityHashCode(j9Var));
        Unit unit = Unit.INSTANCE;
        int i22 = f56621q0;
        int i23 = (i22 & (-60)) | ((~i22) & 59);
        int i24 = -(-((i22 & 59) << 1));
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        f56622r0 = i25 % 128;
        if (i25 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cr crVar) {
        return a(new Object[]{this, crVar}, 766192276, -766192276, System.identityHashCode(this));
    }
}
