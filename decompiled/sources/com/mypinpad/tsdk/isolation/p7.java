package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setOnFocusChangeListener", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class p7 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f57633q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57634r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ oh f57635p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(oh ohVar) {
        super(0);
        this.f57635p0 = ohVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = ~(i13 | i10);
        int i15 = ((i11 | i14) * 764) + (i11 * (-1527)) + (i10 * 765);
        int i16 = ~((~i10) | i11);
        if ((((~(i10 | (~i11))) | i16 | i14) * 764) + (((~(i13 | i11)) | i16) * (-1528)) + i15 != 1) {
            p7 p7Var = (p7) objArr[0];
            int i17 = f57634r0;
            int i18 = ((i17 | 95) << 1) - (i17 ^ 95);
            f57633q0 = i18 % 128;
            int i19 = i18 % 2;
            oh.setDividerPadding(p7Var.f57635p0);
            int i20 = f57634r0;
            int i21 = i20 & 113;
            int i22 = ((i20 | 113) & (~i21)) + (i21 << 1);
            f57633q0 = i22 % 128;
            int i23 = i22 % 2;
            return null;
        }
        p7 p7Var2 = (p7) objArr[0];
        int i24 = f57633q0;
        int i25 = i24 ^ 29;
        int i26 = ((i24 & 29) | i25) << 1;
        int i27 = -i25;
        int i28 = (i26 & i27) + (i26 | i27);
        f57634r0 = i28 % 128;
        if (i28 % 2 == 0) {
            a(new Object[]{p7Var2}, -667768011, 667768011, System.identityHashCode(p7Var2));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        a(new Object[]{p7Var2}, -667768011, 667768011, System.identityHashCode(p7Var2));
        Unit unit2 = Unit.INSTANCE;
        int i29 = f57634r0 + 109;
        f57633q0 = i29 % 128;
        int i30 = i29 % 2;
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        return a(new Object[]{this}, -1716065418, 1716065419, System.identityHashCode(this));
    }
}
