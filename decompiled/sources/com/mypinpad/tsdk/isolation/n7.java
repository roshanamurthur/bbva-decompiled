package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setX", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class n7 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f57205s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f57206t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ oh f57207p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f57208q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f57209r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(oh ohVar, int i10, int i11) {
        super(0);
        this.f57207p0 = ohVar;
        this.f57208q0 = i10;
        this.f57209r0 = i11;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | i11);
        if ((((~(i10 | i12)) | (~((~i11) | i10)) | i13) * 70) + ((~(i10 | i11 | i12)) * 70) + (((~(i11 | i12)) | i13) * (-140)) + (i11 * (-69)) + (i10 * 71) == 1) {
            n7 n7Var = (n7) objArr[0];
            System.identityHashCode(n7Var);
            System.identityHashCode(n7Var);
            oh.setX(n7Var.f57207p0, n7Var.f57208q0, n7Var.f57209r0);
            int i14 = f57205s0;
            int i15 = i14 & 87;
            int i16 = i14 | 87;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            f57206t0 = i17 % 128;
            if (i17 % 2 != 0) {
                return null;
            }
            throw null;
        }
        n7 n7Var2 = (n7) objArr[0];
        int i18 = f57205s0;
        int i19 = i18 & 27;
        int i20 = (((i18 ^ 27) | i19) << 1) - ((i18 | 27) & (~i19));
        f57206t0 = i20 % 128;
        int i21 = i20 % 2;
        a(new Object[]{n7Var2}, 780035706, -780035705, System.identityHashCode(n7Var2));
        Unit unit = Unit.INSTANCE;
        int i22 = f57206t0;
        int i23 = ((i22 | 111) << 1) - (i22 ^ 111);
        f57205s0 = i23 % 128;
        int i24 = i23 % 2;
        return unit;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        return a(new Object[]{this}, 1679437932, -1679437932, System.identityHashCode(this));
    }
}
