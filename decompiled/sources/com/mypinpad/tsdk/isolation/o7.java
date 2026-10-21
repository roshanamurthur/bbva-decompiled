package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setX", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class o7 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f57424q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57425r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ oh f57426p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(oh ohVar) {
        super(0);
        this.f57426p0 = ohVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        if ((((~(i10 | i12)) | (~(i11 | (~i12)))) * 627) + (((~((~i11) | i12)) | i10) * (-627)) + ((i11 | i12 | (~i10)) * (-627)) + (i11 * 628) + (i10 * 628) == 1) {
            o7 o7Var = (o7) objArr[0];
            int i13 = f57425r0;
            int i14 = (i13 & (-116)) | ((~i13) & 115);
            int i15 = -(-((i13 & 115) << 1));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            f57424q0 = i16 % 128;
            int i17 = i16 % 2;
            oh.setY(o7Var.f57426p0);
            int i18 = f57425r0 + 59;
            f57424q0 = i18 % 128;
            if (i18 % 2 == 0) {
                return null;
            }
            throw null;
        }
        o7 o7Var2 = (o7) objArr[0];
        int i19 = f57425r0;
        int i20 = i19 ^ 65;
        int i21 = (((i19 & 65) | i20) << 1) - i20;
        f57424q0 = i21 % 128;
        int i22 = i21 % 2;
        a(new Object[]{o7Var2}, -1780521938, 1780521939, System.identityHashCode(o7Var2));
        Unit unit = Unit.INSTANCE;
        int i23 = f57424q0;
        int i24 = (i23 ^ 2) + ((i23 & 2) << 1);
        int i25 = (i24 ^ (-1)) + (i24 << 1);
        f57425r0 = i25 % 128;
        if (i25 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        return a(new Object[]{this}, 1568100709, -1568100709, System.identityHashCode(this));
    }
}
