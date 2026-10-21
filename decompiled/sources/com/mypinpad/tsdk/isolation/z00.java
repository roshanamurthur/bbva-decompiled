package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setY", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class z00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f62260q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f62261r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f62262p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z00(Function0<Unit> function0) {
        super(0);
        this.f62262p0 = function0;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        Unit unit;
        int i13 = ~i10;
        int i14 = ((~(i13 | i11)) * (-1182)) + (i11 * (-590)) + (i10 * 592);
        int i15 = ~i11;
        if (((i12 | i13 | i15) * 591) + (((~(i10 | i11)) | (~(i13 | i15 | (~i12)))) * (-591)) + i14 == 1) {
            z00 z00Var = (z00) objArr[0];
            int i16 = f62261r0;
            int i17 = (-2) - (((i16 ^ 88) + ((i16 & 88) << 1)) ^ (-1));
            f62260q0 = i17 % 128;
            if (i17 % 2 != 0) {
                z00Var.f62262p0.invoke();
                throw null;
            }
            z00Var.f62262p0.invoke();
            int i18 = f62261r0;
            int i19 = (i18 & (-126)) | ((~i18) & 125);
            int i20 = -(-((i18 & 125) << 1));
            int i21 = (i19 & i20) + (i20 | i19);
            f62260q0 = i21 % 128;
            if (i21 % 2 == 0) {
                return null;
            }
            throw null;
        }
        z00 z00Var2 = (z00) objArr[0];
        int i22 = f62260q0;
        int i23 = i22 & 23;
        int i24 = ((i22 | 23) & (~i23)) + (i23 << 1);
        f62261r0 = i24 % 128;
        if (i24 % 2 == 0) {
            a(new Object[]{z00Var2}, -969476499, 969476500, System.identityHashCode(z00Var2));
            unit = Unit.INSTANCE;
            int i25 = 75 / 0;
        } else {
            a(new Object[]{z00Var2}, -969476499, 969476500, System.identityHashCode(z00Var2));
            unit = Unit.INSTANCE;
        }
        int i26 = f62261r0 + 42;
        int i27 = (i26 ^ (-1)) + (i26 << 1);
        f62260q0 = i27 % 128;
        if (i27 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        return a(new Object[]{this}, 302611997, -302611997, System.identityHashCode(this));
    }
}
