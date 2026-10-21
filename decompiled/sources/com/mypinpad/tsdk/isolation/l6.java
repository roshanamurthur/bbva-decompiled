package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setX", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class l6 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f56907q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f56908r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ jw f56909p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(jw jwVar) {
        super(1);
        this.f56909p0 = jwVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Exception {
        String str;
        int i13 = (~i10) | (~i12);
        if (((i10 | (~(i11 | i12))) * 519) + (((~(i13 | i11)) | (~(i10 | i11 | i12))) * (-519)) + (((~i13) | i11) * 519) + (i11 * (-518)) + (i10 * (-518)) != 1) {
            l6 l6Var = (l6) objArr[0];
            Object obj = objArr[1];
            int i14 = f56908r0;
            int i15 = i14 & 89;
            int i16 = (i14 | 89) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            f56907q0 = i18 % 128;
            int i19 = i18 % 2;
            a(new Object[]{l6Var, (cv) obj}, 1975279003, -1975279002, System.identityHashCode(l6Var));
            Unit unit = Unit.INSTANCE;
            int i20 = f56907q0;
            int i21 = i20 & 107;
            int i22 = (i21 - (~(-(-((i20 ^ 107) | i21))))) - 1;
            f56908r0 = i22 % 128;
            if (i22 % 2 != 0) {
                return unit;
            }
            int i23 = 8 / 0;
            return unit;
        }
        l6 l6Var2 = (l6) objArr[0];
        cv cvVar = (cv) objArr[1];
        int i24 = f56908r0;
        int i25 = i24 & 7;
        int i26 = (i24 ^ 7) | i25;
        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
        f56907q0 = i27 % 128;
        int i28 = i27 % 2;
        Intrinsics.checkNotNullParameter(cvVar, "");
        setFontFeatureSettings setfontfeaturesettings = (setFontFeatureSettings) jw.setOnFocusChangeListener(new Object[]{l6Var2.f56909p0}, 395764677, -395764676, (int) System.currentTimeMillis());
        if (((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings}, 1612421959, -1612421951, System.identityHashCode(setfontfeaturesettings))).booleanValue()) {
            int i29 = f56908r0;
            int i30 = (((i29 | 58) << 1) - (i29 ^ 58)) - 1;
            f56907q0 = i30 % 128;
            int i31 = i30 % 2;
            cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, 1715041445, -1715041445, System.identityHashCode(cvVar));
            int i32 = f56907q0;
            int i33 = (i32 & 116) + (i32 | 116);
            int i34 = (i33 ^ (-1)) + (i33 << 1);
            f56908r0 = i34 % 128;
            int i35 = i34 % 2;
        }
        jw jwVar = l6Var2.f56909p0;
        byte[] imageResource = ((iv) jw.setOnFocusChangeListener(new Object[]{jwVar}, 481504288, -481504286, (int) System.currentTimeMillis())).setImageResource();
        if (imageResource == null) {
            int i36 = f56908r0;
            int i37 = i36 & 43;
            int i38 = i36 | 43;
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            int i40 = i39 % 128;
            f56907q0 = i40;
            if (i39 % 2 != 0) {
                int i41 = 27 / 0;
            }
            int i42 = ((i40 & 96) + (i40 | 96)) - 1;
            f56908r0 = i42 % 128;
            int i43 = i42 % 2;
            str = null;
        } else {
            str = (String) setInputExtras.setDividerPadding(new Object[]{imageResource}, 1609250238, -1609250236, (int) System.currentTimeMillis());
            int i44 = f56908r0 + 72;
            int i45 = (i44 ^ (-1)) + (i44 << 1);
            f56907q0 = i45 % 128;
            int i46 = i45 % 2;
        }
        if (!(!((Boolean) component10.setDividerPadding.setY(new Object[]{(component10) jw.setOnFocusChangeListener(new Object[]{jwVar}, 174138397, -174138393, (int) System.currentTimeMillis()), str}, -845226674, 845226674, (int) System.currentTimeMillis())).booleanValue())) {
            int i47 = f56908r0;
            int i48 = i47 & 115;
            int i49 = -(-((i47 ^ 115) | i48));
            int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
            f56907q0 = i50 % 128;
            if (i50 % 2 != 0) {
                cv.setDividerPadding(new Object[]{cvVar}, 310720593, -310720570, System.identityHashCode(cvVar));
                throw null;
            }
            cv.setDividerPadding(new Object[]{cvVar}, 310720593, -310720570, System.identityHashCode(cvVar));
        }
        int i51 = f56907q0;
        int i52 = i51 ^ 103;
        int i53 = -(-((i51 & 103) << 1));
        int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
        f56908r0 = i54 % 128;
        if (i54 % 2 == 0) {
            int i55 = 83 / 0;
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 558570078, -558570078, System.identityHashCode(this));
    }
}
