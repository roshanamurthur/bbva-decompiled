package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/af;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/af;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class e4 extends Lambda implements Function1<af, Unit> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f55303s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f55304t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ l f55305p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ byte[] f55306q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ byte[] f55307r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(l lVar, byte[] bArr, byte[] bArr2) {
        super(1);
        this.f55305p0 = lVar;
        this.f55306q0 = bArr;
        this.f55307r0 = bArr2;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | i11);
        if ((((~(i10 | i12)) | (~((~i11) | i10)) | i13) * 70) + ((~(i10 | i11 | i12)) * 70) + (((~(i11 | i12)) | i13) * (-140)) + (i11 * (-69)) + (i10 * 71) == 1) {
            e4 e4Var = (e4) objArr[0];
            Object obj = objArr[1];
            int i14 = f55303s0;
            int i15 = (i14 & 93) + (i14 | 93);
            f55304t0 = i15 % 128;
            int i16 = i15 % 2;
            a(new Object[]{e4Var, (af) obj}, -2131673239, 2131673239, System.identityHashCode(e4Var));
            Unit unit = Unit.INSTANCE;
            System.identityHashCode(e4Var);
            System.identityHashCode(e4Var);
            return unit;
        }
        e4 e4Var2 = (e4) objArr[0];
        af afVar = (af) objArr[1];
        int i17 = f55304t0;
        int i18 = i17 & 81;
        int i19 = (i17 | 81) & (~i18);
        int i20 = -(-(i18 << 1));
        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
        f55303s0 = i21 % 128;
        int i22 = i21 % 2;
        Intrinsics.checkNotNullParameter(afVar, "");
        l lVar = e4Var2.f55305p0;
        af.setDividerPadding(new Object[]{afVar, (ValueQualifier) l.setX(new Object[]{lVar}, 854075334, -854075329, System.identityHashCode(lVar))}, 1991488095, -1991488092, System.identityHashCode(afVar));
        l lVar2 = e4Var2.f55305p0;
        af.setDividerPadding(new Object[]{afVar, (activateSession) l.setX(new Object[]{lVar2}, 1218780914, -1218780912, System.identityHashCode(lVar2))}, 1583481674, -1583481662, System.identityHashCode(afVar));
        af.setDividerPadding(new Object[]{afVar, (byte[]) l.setX(new Object[]{lVar2}, -1193387599, 1193387606, System.identityHashCode(lVar2))}, -730300567, 730300574, System.identityHashCode(afVar));
        byte[] bArr = e4Var2.f55306q0;
        if (bArr != null) {
            int i23 = f55303s0;
            int i24 = (-2) - (((i23 ^ 16) + ((i23 & 16) << 1)) ^ (-1));
            f55304t0 = i24 % 128;
            if (i24 % 2 == 0) {
                af.setDividerPadding(new Object[]{afVar, bArr}, 1964512517, -1964512513, System.identityHashCode(afVar));
                throw null;
            }
            af.setDividerPadding(new Object[]{afVar, bArr}, 1964512517, -1964512513, System.identityHashCode(afVar));
        }
        byte[] bArr2 = e4Var2.f55307r0;
        if (bArr2 != null) {
            int i25 = f55304t0;
            int i26 = i25 & 37;
            int i27 = (i25 ^ 37) | i26;
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            f55303s0 = i28 % 128;
            if (i28 % 2 != 0) {
                af.setDividerPadding(new Object[]{afVar, bArr2}, -1405137347, 1405137361, System.identityHashCode(afVar));
                throw null;
            }
            af.setDividerPadding(new Object[]{afVar, bArr2}, -1405137347, 1405137361, System.identityHashCode(afVar));
        }
        af.setDividerPadding(new Object[]{afVar, (setSelector) l.setX(new Object[]{lVar2}, -971999203, 971999203, System.identityHashCode(lVar2))}, -1098788825, 1098788826, System.identityHashCode(afVar));
        byte[] bArr3 = (byte[]) l.setX(new Object[]{lVar2}, 1618171821, -1618171812, System.identityHashCode(lVar2));
        if (bArr3 != null) {
            int i29 = f55304t0;
            int i30 = ((i29 ^ 111) | (i29 & 111)) << 1;
            int i31 = -(((~i29) & 111) | (i29 & (-112)));
            int i32 = (i30 & i31) + (i31 | i30);
            f55303s0 = i32 % 128;
            int i33 = i32 % 2;
            af.setDividerPadding(new Object[]{afVar, bArr3}, 2106657059, -2106657053, System.identityHashCode(afVar));
            int i34 = f55303s0;
            int i35 = ((i34 & 98) + (i34 | 98)) - 1;
            f55304t0 = i35 % 128;
            int i36 = i35 % 2;
        }
        int i37 = f55303s0;
        int i38 = i37 & 111;
        int i39 = i37 | 111;
        int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
        f55304t0 = i40 % 128;
        if (i40 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(af afVar) {
        return a(new Object[]{this, afVar}, 1984727699, -1984727698, System.identityHashCode(this));
    }
}
