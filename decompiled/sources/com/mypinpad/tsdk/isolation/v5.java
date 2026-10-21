package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/jf;", "", "setY", "(Lcom/mypinpad/tsdk/i/jf;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class v5 extends Lambda implements Function1<jf, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61458q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61459r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ jm f61460p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(jm jmVar) {
        super(1);
        this.f61460p0 = jmVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ((i11 | i13) * (-1434)) + (i11 * 1435) + (i10 * (-716));
        int i15 = ~i12;
        int i16 = ~(i15 | i11);
        int i17 = ~(i10 | i11);
        int i18 = i13 | (~i11);
        if (((i17 | (~(i18 | i15)) | (~(i11 | i12))) * 717) + ((i16 | i17 | (~(i18 | i12))) * 717) + i14 != 1) {
            v5 v5Var = (v5) objArr[0];
            Object obj = objArr[1];
            int i19 = f61458q0 + 95;
            f61459r0 = i19 % 128;
            jf jfVar = (jf) obj;
            if (i19 % 2 != 0) {
                a(new Object[]{v5Var, jfVar}, 1412866581, -1412866580, System.identityHashCode(v5Var));
                return Unit.INSTANCE;
            }
            a(new Object[]{v5Var, jfVar}, 1412866581, -1412866580, System.identityHashCode(v5Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        v5 v5Var2 = (v5) objArr[0];
        jf jfVar2 = (jf) objArr[1];
        int i20 = f61458q0;
        int i21 = (-2) - ((((i20 | 84) << 1) - (i20 ^ 84)) ^ (-1));
        f61459r0 = i21 % 128;
        int i22 = i21 % 2;
        Intrinsics.checkNotNullParameter(jfVar2, "");
        jf.setDividerPadding(new Object[]{jfVar2, Boolean.FALSE}, 1781419836, -1781419836, System.identityHashCode(jfVar2));
        setFontFeatureSettings setfontfeaturesettings = (setFontFeatureSettings) jm.setDividerPadding(new Object[]{v5Var2.f61460p0}, 201210026, -201210025, (int) System.currentTimeMillis());
        if (((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings}, -2133249192, 2133249203, System.identityHashCode(setfontfeaturesettings))).booleanValue()) {
            jf.setDividerPadding(new Object[]{jfVar2, Boolean.TRUE}, 1781419836, -1781419836, System.identityHashCode(jfVar2));
            je jeVar = new je(jm.setOnFocusChangeListener(v5Var2.f61460p0));
            int i23 = f61459r0;
            int i24 = ((i23 ^ 121) - (~((i23 & 121) << 1))) - 1;
            f61458q0 = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = f61458q0;
        int i27 = i26 | 51;
        int i28 = i27 << 1;
        int i29 = -((~(i26 & 51)) & i27);
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        f61459r0 = i30 % 128;
        int i31 = i30 % 2;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(jf jfVar) {
        return a(new Object[]{this, jfVar}, 542325390, -542325390, System.identityHashCode(this));
    }
}
