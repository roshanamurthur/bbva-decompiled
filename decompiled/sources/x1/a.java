package x1;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.jvm.internal.Intrinsics;
import mk.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Density.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {
    @Stable
    public static int a(Density density, long j10) {
        return c.roundToInt(density.mo414toPxR2X_6o(j10));
    }

    @Stable
    public static int b(Density density, float f6) {
        float fMo415toPx0680j_4 = density.mo415toPx0680j_4(f6);
        if (Float.isInfinite(fMo415toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return c.roundToInt(fMo415toPx0680j_4);
    }

    @Stable
    public static float c(Density density, long j10) {
        if (!TextUnitType.m4598equalsimpl0(TextUnit.m4569getTypeUIouoOA(j10), TextUnitType.INSTANCE.m4603getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return Dp.m4389constructorimpl(density.getFontScale() * TextUnit.m4570getValueimpl(j10));
    }

    @Stable
    public static float d(Density density, float f6) {
        return Dp.m4389constructorimpl(f6 / density.getDensity());
    }

    @Stable
    public static float e(Density density, int i10) {
        return Dp.m4389constructorimpl(i10 / density.getDensity());
    }

    @Stable
    public static long f(Density density, long j10) {
        return j10 != Size.INSTANCE.m2352getUnspecifiedNHjbRc() ? DpKt.m4411DpSizeYgX7TsA(density.mo405toDpu2uoSUM(Size.m2344getWidthimpl(j10)), density.mo405toDpu2uoSUM(Size.m2341getHeightimpl(j10))) : DpSize.INSTANCE.m4496getUnspecifiedMYxV2XQ();
    }

    @Stable
    public static float g(Density density, long j10) {
        if (!TextUnitType.m4598equalsimpl0(TextUnit.m4569getTypeUIouoOA(j10), TextUnitType.INSTANCE.m4603getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return density.getDensity() * density.getFontScale() * TextUnit.m4570getValueimpl(j10);
    }

    @Stable
    public static float h(Density density, float f6) {
        return density.getDensity() * f6;
    }

    @Stable
    @NotNull
    public static Rect i(Density density, @NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return new Rect(density.mo415toPx0680j_4(dpRect.m4472getLeftD9Ej5fM()), density.mo415toPx0680j_4(dpRect.m4474getTopD9Ej5fM()), density.mo415toPx0680j_4(dpRect.m4473getRightD9Ej5fM()), density.mo415toPx0680j_4(dpRect.m4471getBottomD9Ej5fM()));
    }

    @Stable
    public static long j(Density density, long j10) {
        return j10 != DpSize.INSTANCE.m4496getUnspecifiedMYxV2XQ() ? SizeKt.Size(density.mo415toPx0680j_4(DpSize.m4487getWidthD9Ej5fM(j10)), density.mo415toPx0680j_4(DpSize.m4485getHeightD9Ej5fM(j10))) : Size.INSTANCE.m2352getUnspecifiedNHjbRc();
    }

    @Stable
    public static long k(Density density, float f6) {
        return TextUnitKt.getSp(f6 / density.getFontScale());
    }

    @Stable
    public static long l(Density density, float f6) {
        return TextUnitKt.getSp(f6 / (density.getDensity() * density.getFontScale()));
    }

    @Stable
    public static long m(Density density, int i10) {
        return TextUnitKt.getSp(i10 / (density.getDensity() * density.getFontScale()));
    }
}
