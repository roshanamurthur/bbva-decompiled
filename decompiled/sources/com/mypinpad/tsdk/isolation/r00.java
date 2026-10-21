package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "setDividerPadding", "(Z)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class r00 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f58037q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f58038r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ xc f58039p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r00(xc xcVar) {
        super(1);
        this.f58039p0 = xcVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        if ((i15 * 576) + (((~(i10 | (~i12) | i14)) | (~(i11 | i13))) * 576) + (((~(i14 | i12)) | i15) * 576) + (i11 * (-575)) + (i10 * (-575)) == 1) {
            r00 r00Var = (r00) objArr[0];
            Object obj = objArr[1];
            int i16 = f58038r0;
            int i17 = ((i16 | 91) << 1) - (i16 ^ 91);
            f58037q0 = i17 % 128;
            int i18 = i17 % 2;
            a(new Object[]{r00Var, Boolean.valueOf(((Boolean) obj).booleanValue())}, -1676768162, 1676768162, System.identityHashCode(r00Var));
            Unit unit = Unit.INSTANCE;
            int i19 = f58037q0;
            int i20 = ((i19 | 55) << 1) - (i19 ^ 55);
            f58038r0 = i20 % 128;
            int i21 = i20 % 2;
            return unit;
        }
        r00 r00Var2 = (r00) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i22 = f58038r0;
        int i23 = i22 & 71;
        int i24 = (i22 ^ 71) | i23;
        int i25 = (i23 & i24) + (i24 | i23);
        f58037q0 = i25 % 128;
        int i26 = i25 % 2;
        if (zBooleanValue) {
            ((nu) xc.setX(new Object[]{r00Var2.f58039p0}, 902849077, -902849077, (int) System.currentTimeMillis())).setOnFocusChangeListener(new q00(r00Var2.f58039p0));
            int i27 = f58037q0;
            int i28 = (i27 & (-44)) | ((~i27) & 43);
            int i29 = -(-((i27 & 43) << 1));
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            f58038r0 = i30 % 128;
            int i31 = i30 % 2;
        } else {
            ((nu) xc.setX(new Object[]{r00Var2.f58039p0}, 902849077, -902849077, (int) System.currentTimeMillis())).setY();
            int i32 = f58038r0;
            int i33 = i32 & 109;
            int i34 = (i33 - (~(-(-((i32 ^ 109) | i33))))) - 1;
            f58037q0 = i34 % 128;
            int i35 = i34 % 2;
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        return a(new Object[]{this, bool}, -100390650, 100390651, System.identityHashCode(this));
    }
}
