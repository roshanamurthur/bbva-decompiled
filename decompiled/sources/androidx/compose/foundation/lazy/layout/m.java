package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;

/* JADX INFO: compiled from: LazyLayoutMeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m {
    @Stable
    public static float a(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j10) {
        if (!TextUnitType.m4598equalsimpl0(TextUnit.m4569getTypeUIouoOA(j10), TextUnitType.INSTANCE.m4603getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return Dp.m4389constructorimpl(lazyLayoutMeasureScope.getFontScale() * TextUnit.m4570getValueimpl(j10));
    }

    @Stable
    public static float b(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f6) {
        return Dp.m4389constructorimpl(f6 / lazyLayoutMeasureScope.getDensity());
    }

    @Stable
    public static float c(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i10) {
        return Dp.m4389constructorimpl(i10 / lazyLayoutMeasureScope.getDensity());
    }

    @Stable
    public static long d(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j10) {
        return j10 != Size.INSTANCE.m2352getUnspecifiedNHjbRc() ? DpKt.m4411DpSizeYgX7TsA(lazyLayoutMeasureScope.mo405toDpu2uoSUM(Size.m2344getWidthimpl(j10)), lazyLayoutMeasureScope.mo405toDpu2uoSUM(Size.m2341getHeightimpl(j10))) : DpSize.INSTANCE.m4496getUnspecifiedMYxV2XQ();
    }

    @Stable
    public static long e(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j10) {
        return j10 != DpSize.INSTANCE.m4496getUnspecifiedMYxV2XQ() ? SizeKt.Size(lazyLayoutMeasureScope.mo415toPx0680j_4(DpSize.m4487getWidthD9Ej5fM(j10)), lazyLayoutMeasureScope.mo415toPx0680j_4(DpSize.m4485getHeightD9Ej5fM(j10))) : Size.INSTANCE.m2352getUnspecifiedNHjbRc();
    }

    @Stable
    public static long f(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f6) {
        return TextUnitKt.getSp(f6 / lazyLayoutMeasureScope.getFontScale());
    }

    @Stable
    public static long g(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f6) {
        return TextUnitKt.getSp(f6 / (lazyLayoutMeasureScope.getDensity() * lazyLayoutMeasureScope.getFontScale()));
    }

    @Stable
    public static long h(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i10) {
        return TextUnitKt.getSp(i10 / (lazyLayoutMeasureScope.getDensity() * lazyLayoutMeasureScope.getFontScale()));
    }
}
