package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setDividerPadding", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class m7 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f57050s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f57051t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ oh f57052p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ float f57053q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ float f57054r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(oh ohVar, float f6, float f10) {
        super(0);
        this.f57052p0 = ohVar;
        this.f57053q0 = f6;
        this.f57054r0 = f10;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        Unit unit;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = ~i12;
        int i17 = (~(i13 | i16)) | i15 | (~(i14 | i16));
        int i18 = i10 | i11;
        int i19 = ((i17 | (~(i18 | i12))) * (-84)) + (i11 * 85) + (i10 * 85);
        int i20 = i10 | (~(i12 | i14));
        int i21 = ~(i11 | i16);
        if (((i21 | (~i18)) * 84) + ((i20 | i21) * (-84)) + i19 != 1) {
            m7 m7Var = (m7) objArr[0];
            int i22 = f57050s0;
            int i23 = i22 | 83;
            int i24 = (i23 << 1) - ((~(i22 & 83)) & i23);
            f57051t0 = i24 % 128;
            int i25 = i24 % 2;
            oh.setOnFocusChangeListener(m7Var.f57052p0, m7Var.f57053q0, m7Var.f57054r0);
            int i26 = f57051t0;
            int i27 = ((i26 & (-90)) | ((~i26) & 89)) + ((i26 & 89) << 1);
            f57050s0 = i27 % 128;
            int i28 = i27 % 2;
            return null;
        }
        m7 m7Var2 = (m7) objArr[0];
        int i29 = f57050s0 + 47;
        f57051t0 = i29 % 128;
        if (i29 % 2 == 0) {
            a(new Object[]{m7Var2}, -581795045, 581795045, System.identityHashCode(m7Var2));
            unit = Unit.INSTANCE;
            int i30 = 79 / 0;
        } else {
            a(new Object[]{m7Var2}, -581795045, 581795045, System.identityHashCode(m7Var2));
            unit = Unit.INSTANCE;
        }
        int i31 = f57050s0;
        int i32 = (i31 & 89) + (i31 | 89);
        f57051t0 = i32 % 128;
        int i33 = i32 % 2;
        return unit;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        return a(new Object[]{this}, -2011989076, 2011989077, System.identityHashCode(this));
    }
}
