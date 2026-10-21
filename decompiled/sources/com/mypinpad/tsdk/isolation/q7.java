package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setCompoundDrawableTintBlendMode", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class q7 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57811r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f57812s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ oh f57813p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f57814q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(oh ohVar, Function0<Unit> function0) {
        super(0);
        this.f57813p0 = ohVar;
        this.f57814q0 = function0;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((i11 | i12) * 140) + (i11 * (-279)) + (i10 * 141);
        int i14 = (~i10) | i11;
        int i15 = ~i14;
        int i16 = ~i12;
        if ((((~(i10 | i16)) | (~((~i11) | i10)) | (~(i14 | i12))) * 140) + ((i15 | (~(i16 | i11))) * (-280)) + i13 != 1) {
            q7 q7Var = (q7) objArr[0];
            int i17 = f57811r0;
            int i18 = (((i17 & (-40)) | ((~i17) & 39)) - (~((i17 & 39) << 1))) - 1;
            f57812s0 = i18 % 128;
            Object[] objArr2 = new Object[1];
            if (i18 % 2 == 0) {
                objArr2[0] = q7Var;
                a(objArr2, -125316042, 125316043, System.identityHashCode(q7Var));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            objArr2[0] = q7Var;
            a(objArr2, -125316042, 125316043, System.identityHashCode(q7Var));
            Unit unit2 = Unit.INSTANCE;
            int i19 = f57811r0;
            int i20 = i19 & 105;
            int i21 = i20 + ((i19 ^ 105) | i20);
            f57812s0 = i21 % 128;
            if (i21 % 2 != 0) {
                return unit2;
            }
            throw null;
        }
        q7 q7Var2 = (q7) objArr[0];
        int i22 = f57812s0;
        int i23 = i22 ^ 107;
        int i24 = ((i22 & 107) | i23) << 1;
        int i25 = -i23;
        int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
        f57811r0 = i26 % 128;
        int i27 = i26 % 2;
        if (!oh.setX(q7Var2.f57813p0).get()) {
            q7Var2.f57814q0.invoke();
            int i28 = f57811r0;
            int i29 = ((i28 & 50) + (i28 | 50)) - 1;
            f57812s0 = i29 % 128;
            int i30 = i29 % 2;
            return null;
        }
        int i31 = f57811r0;
        int i32 = i31 ^ 97;
        int i33 = (i31 & 97) << 1;
        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
        f57812s0 = i34 % 128;
        int i35 = i34 % 2;
        return null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        return a(new Object[]{this}, 773978874, -773978874, System.identityHashCode(this));
    }
}
