package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/br;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/br;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class l5 extends Lambda implements Function1<br, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f56904q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f56905r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f56906p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(StringBuilder sb2) {
        super(1);
        this.f56906p0 = sb2;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = (((~(i13 | i11)) | (~(i13 | i12))) * (-566)) + (i11 * (-565)) + (i10 * 567);
        int i15 = ~i11;
        if (((~(i15 | i13 | i12)) * 566) + ((~(i10 | i15)) * 566) + i14 == 1) {
            l5 l5Var = (l5) objArr[0];
            Object obj = objArr[1];
            int i16 = f56904q0;
            int i17 = i16 & 53;
            int i18 = (i16 ^ 53) | i17;
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            f56905r0 = i19 % 128;
            int i20 = i19 % 2;
            a(new Object[]{l5Var, (br) obj}, 683498110, -683498110, System.identityHashCode(l5Var));
            Unit unit = Unit.INSTANCE;
            int i21 = f56905r0 + 1;
            f56904q0 = i21 % 128;
            int i22 = i21 % 2;
            return unit;
        }
        l5 l5Var2 = (l5) objArr[0];
        br brVar = (br) objArr[1];
        int i23 = f56904q0;
        int i24 = i23 & 11;
        int i25 = (((i23 | 11) & (~i24)) - (~(-(-(i24 << 1))))) - 1;
        f56905r0 = i25 % 128;
        int i26 = i25 % 2;
        Intrinsics.checkNotNullParameter(brVar, "");
        String string = l5Var2.f56906p0.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        brVar.setDividerPadding(string);
        int i27 = f56904q0;
        int i28 = i27 & 63;
        int i29 = ((i27 ^ 63) | i28) << 1;
        int i30 = -((i27 | 63) & (~i28));
        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
        f56905r0 = i31 % 128;
        int i32 = i31 % 2;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(br brVar) {
        return a(new Object[]{this, brVar}, -2025414110, 2025414111, System.identityHashCode(this));
    }
}
