package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class o6 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f57421q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57422r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ kn f57423p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(kn knVar) {
        super(1);
        this.f57423p0 = knVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        if ((i15 * 576) + (((~(i10 | (~i12) | i14)) | (~(i11 | i13))) * 576) + (((~(i14 | i12)) | i15) * 576) + (i11 * (-575)) + (i10 * (-575)) == 1) {
            o6 o6Var = (o6) objArr[0];
            Object obj = objArr[1];
            int i16 = f57422r0;
            int i17 = (i16 ^ 59) + ((i16 & 59) << 1);
            f57421q0 = i17 % 128;
            int i18 = i17 % 2;
            a(new Object[]{o6Var, (cv) obj}, -113601782, 113601782, System.identityHashCode(o6Var));
            Unit unit = Unit.INSTANCE;
            int i19 = f57421q0;
            int i20 = i19 & 95;
            int i21 = -(-((i19 ^ 95) | i20));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f57422r0 = i22 % 128;
            if (i22 % 2 != 0) {
                return unit;
            }
            int i23 = 91 / 0;
            return unit;
        }
        o6 o6Var2 = (o6) objArr[0];
        cv cvVar = (cv) objArr[1];
        int i24 = f57421q0;
        int i25 = i24 & 49;
        int i26 = ((i24 ^ 49) | i25) << 1;
        int i27 = -((i24 | 49) & (~i25));
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        f57422r0 = i28 % 128;
        if (i28 % 2 == 0) {
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar, Boolean.FALSE}, -1881163515, 1881163517, System.identityHashCode(cvVar));
            setFontFeatureSettings setfontfeaturesettings = (setFontFeatureSettings) kn.setDividerPadding(new Object[]{o6Var2.f57423p0}, 2039431541, -2039431541, (int) System.currentTimeMillis());
            cv.setDividerPadding(new Object[]{cvVar, Boolean.valueOf(((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings}, 1612421959, -1612421951, System.identityHashCode(setfontfeaturesettings))).booleanValue())}, 1715041445, -1715041445, System.identityHashCode(cvVar));
        } else {
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -1881163515, 1881163517, System.identityHashCode(cvVar));
            setFontFeatureSettings setfontfeaturesettings2 = (setFontFeatureSettings) kn.setDividerPadding(new Object[]{o6Var2.f57423p0}, 2039431541, -2039431541, (int) System.currentTimeMillis());
            cv.setDividerPadding(new Object[]{cvVar, Boolean.valueOf(((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings2}, 1612421959, -1612421951, System.identityHashCode(setfontfeaturesettings2))).booleanValue())}, 1715041445, -1715041445, System.identityHashCode(cvVar));
        }
        int i29 = f57422r0;
        int i30 = i29 & 95;
        int i31 = (((i29 ^ 95) | i30) << 1) - ((i29 | 95) & (~i30));
        f57421q0 = i31 % 128;
        int i32 = i31 % 2;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 900113510, -900113509, System.identityHashCode(this));
    }
}
