package a1;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b {
    static {
        DrawScope.Companion companion = DrawScope.INSTANCE;
    }

    public static /* synthetic */ void A(DrawScope drawScope, ImageBitmap imageBitmap, long j10, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        drawScope.mo2895drawImagegbVJVH8(imageBitmap, (i11 & 2) != 0 ? Offset.INSTANCE.m2291getZeroF1C5BW0() : j10, (i11 & 4) != 0 ? 1.0f : f6, (i11 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 16) != 0 ? null : colorFilter, (i11 & 32) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i10);
    }

    public static /* synthetic */ void B(DrawScope drawScope, Brush brush, long j10, long j11, float f6, int i10, PathEffect pathEffect, float f10, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        drawScope.mo2896drawLine1RTmtNc(brush, j10, j11, (i12 & 8) != 0 ? 0.0f : f6, (i12 & 16) != 0 ? Stroke.INSTANCE.m2998getDefaultCapKaPHkGw() : i10, (i12 & 32) != 0 ? null : pathEffect, (i12 & 64) != 0 ? 1.0f : f10, (i12 & 128) != 0 ? null : colorFilter, (i12 & 256) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i11);
    }

    public static /* synthetic */ void C(DrawScope drawScope, long j10, long j11, long j12, float f6, int i10, PathEffect pathEffect, float f10, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        drawScope.mo2897drawLineNGM6Ib0(j10, j11, j12, (i12 & 8) != 0 ? 0.0f : f6, (i12 & 16) != 0 ? Stroke.INSTANCE.m2998getDefaultCapKaPHkGw() : i10, (i12 & 32) != 0 ? null : pathEffect, (i12 & 64) != 0 ? 1.0f : f10, (i12 & 128) != 0 ? null : colorFilter, (i12 & 256) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i11);
    }

    public static /* synthetic */ void D(DrawScope drawScope, Brush brush, long j10, long j11, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
        }
        long jM2291getZeroF1C5BW0 = (i11 & 2) != 0 ? Offset.INSTANCE.m2291getZeroF1C5BW0() : j10;
        drawScope.mo2898drawOvalAsUm42w(brush, jM2291getZeroF1C5BW0, (i11 & 4) != 0 ? d(drawScope.mo2909getSizeNHjbRc(), jM2291getZeroF1C5BW0) : j11, (i11 & 8) != 0 ? 1.0f : f6, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? null : colorFilter, (i11 & 64) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i10);
    }

    public static /* synthetic */ void E(DrawScope drawScope, long j10, long j11, long j12, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        }
        long jM2291getZeroF1C5BW0 = (i11 & 2) != 0 ? Offset.INSTANCE.m2291getZeroF1C5BW0() : j11;
        drawScope.mo2899drawOvalnJ9OG0(j10, jM2291getZeroF1C5BW0, (i11 & 4) != 0 ? d(drawScope.mo2909getSizeNHjbRc(), jM2291getZeroF1C5BW0) : j12, (i11 & 8) != 0 ? 1.0f : f6, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? null : colorFilter, (i11 & 64) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i10);
    }

    public static /* synthetic */ void F(DrawScope drawScope, Path path, Brush brush, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i11 & 4) != 0) {
            f6 = 1.0f;
        }
        float f10 = f6;
        if ((i11 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i11 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i11 & 32) != 0) {
            i10 = DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU();
        }
        drawScope.mo2900drawPathGBMwjPU(path, brush, f10, drawStyle2, colorFilter2, i10);
    }

    public static /* synthetic */ void G(DrawScope drawScope, Path path, long j10, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        drawScope.mo2901drawPathLG529CI(path, j10, (i11 & 4) != 0 ? 1.0f : f6, (i11 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 16) != 0 ? null : colorFilter, (i11 & 32) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i10);
    }

    public static /* synthetic */ void H(DrawScope drawScope, List list, int i10, long j10, float f6, int i11, PathEffect pathEffect, float f10, ColorFilter colorFilter, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
        drawScope.mo2902drawPointsF8ZwMP8(list, i10, j10, (i13 & 8) != 0 ? 0.0f : f6, (i13 & 16) != 0 ? StrokeCap.INSTANCE.m2808getButtKaPHkGw() : i11, (i13 & 32) != 0 ? null : pathEffect, (i13 & 64) != 0 ? 1.0f : f10, (i13 & 128) != 0 ? null : colorFilter, (i13 & 256) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i12);
    }

    public static /* synthetic */ void I(DrawScope drawScope, List list, int i10, Brush brush, float f6, int i11, PathEffect pathEffect, float f10, ColorFilter colorFilter, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
        }
        drawScope.mo2903drawPointsGsft0Ws(list, i10, brush, (i13 & 8) != 0 ? 0.0f : f6, (i13 & 16) != 0 ? StrokeCap.INSTANCE.m2808getButtKaPHkGw() : i11, (i13 & 32) != 0 ? null : pathEffect, (i13 & 64) != 0 ? 1.0f : f10, (i13 & 128) != 0 ? null : colorFilter, (i13 & 256) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i12);
    }

    public static /* synthetic */ void J(DrawScope drawScope, Brush brush, long j10, long j11, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jM2291getZeroF1C5BW0 = (i11 & 2) != 0 ? Offset.INSTANCE.m2291getZeroF1C5BW0() : j10;
        drawScope.mo2904drawRectAsUm42w(brush, jM2291getZeroF1C5BW0, (i11 & 4) != 0 ? d(drawScope.mo2909getSizeNHjbRc(), jM2291getZeroF1C5BW0) : j11, (i11 & 8) != 0 ? 1.0f : f6, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? null : colorFilter, (i11 & 64) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i10);
    }

    public static /* synthetic */ void K(DrawScope drawScope, long j10, long j11, long j12, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jM2291getZeroF1C5BW0 = (i11 & 2) != 0 ? Offset.INSTANCE.m2291getZeroF1C5BW0() : j11;
        drawScope.mo2905drawRectnJ9OG0(j10, jM2291getZeroF1C5BW0, (i11 & 4) != 0 ? d(drawScope.mo2909getSizeNHjbRc(), jM2291getZeroF1C5BW0) : j12, (i11 & 8) != 0 ? 1.0f : f6, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? null : colorFilter, (i11 & 64) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i10);
    }

    public static /* synthetic */ void L(DrawScope drawScope, Brush brush, long j10, long j11, long j12, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jM2291getZeroF1C5BW0 = (i11 & 2) != 0 ? Offset.INSTANCE.m2291getZeroF1C5BW0() : j10;
        drawScope.mo2906drawRoundRectZuiqVtQ(brush, jM2291getZeroF1C5BW0, (i11 & 4) != 0 ? d(drawScope.mo2909getSizeNHjbRc(), jM2291getZeroF1C5BW0) : j11, (i11 & 8) != 0 ? CornerRadius.INSTANCE.m2260getZerokKHJgLs() : j12, (i11 & 16) != 0 ? 1.0f : f6, (i11 & 32) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 64) != 0 ? null : colorFilter, (i11 & 128) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i10);
    }

    public static /* synthetic */ void M(DrawScope drawScope, long j10, long j11, long j12, long j13, DrawStyle drawStyle, float f6, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long jM2291getZeroF1C5BW0 = (i11 & 2) != 0 ? Offset.INSTANCE.m2291getZeroF1C5BW0() : j11;
        drawScope.mo2907drawRoundRectuAw5IA(j10, jM2291getZeroF1C5BW0, (i11 & 4) != 0 ? d(drawScope.mo2909getSizeNHjbRc(), jM2291getZeroF1C5BW0) : j12, (i11 & 8) != 0 ? CornerRadius.INSTANCE.m2260getZerokKHJgLs() : j13, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? 1.0f : f6, (i11 & 64) != 0 ? null : colorFilter, (i11 & 128) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i10);
    }

    public static void a(DrawScope drawScope, @NotNull ImageBitmap image, long j10, long j11, long j12, long j13, float f6, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i10, int i11) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        z(drawScope, image, j10, j11, j12, j13, f6, style, colorFilter, i10, 0, 512, null);
    }

    public static long b(DrawScope drawScope) {
        return SizeKt.m2354getCenteruvyYCjk(drawScope.getDrawContext().mo2915getSizeNHjbRc());
    }

    public static long c(DrawScope drawScope) {
        return drawScope.getDrawContext().mo2915getSizeNHjbRc();
    }

    public static long d(long j10, long j11) {
        return SizeKt.Size(Size.m2344getWidthimpl(j10) - Offset.m2275getXimpl(j11), Size.m2341getHeightimpl(j10) - Offset.m2276getYimpl(j11));
    }

    public static /* synthetic */ void u(DrawScope drawScope, Brush brush, float f6, float f10, boolean z10, long j10, long j11, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
        }
        long jM2291getZeroF1C5BW0 = (i11 & 16) != 0 ? Offset.INSTANCE.m2291getZeroF1C5BW0() : j10;
        drawScope.mo2889drawArcillE91I(brush, f6, f10, z10, jM2291getZeroF1C5BW0, (i11 & 32) != 0 ? d(drawScope.mo2909getSizeNHjbRc(), jM2291getZeroF1C5BW0) : j11, (i11 & 64) != 0 ? 1.0f : f11, (i11 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 256) != 0 ? null : colorFilter, (i11 & 512) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i10);
    }

    public static /* synthetic */ void v(DrawScope drawScope, long j10, float f6, float f10, boolean z10, long j11, long j12, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jM2291getZeroF1C5BW0 = (i11 & 16) != 0 ? Offset.INSTANCE.m2291getZeroF1C5BW0() : j11;
        drawScope.mo2890drawArcyD3GUKo(j10, f6, f10, z10, jM2291getZeroF1C5BW0, (i11 & 32) != 0 ? d(drawScope.mo2909getSizeNHjbRc(), jM2291getZeroF1C5BW0) : j12, (i11 & 64) != 0 ? 1.0f : f11, (i11 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 256) != 0 ? null : colorFilter, (i11 & 512) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i10);
    }

    public static /* synthetic */ void w(DrawScope drawScope, Brush brush, float f6, long j10, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
        drawScope.mo2891drawCircleV9BoPsw(brush, (i11 & 2) != 0 ? Size.m2343getMinDimensionimpl(drawScope.mo2909getSizeNHjbRc()) / 2.0f : f6, (i11 & 4) != 0 ? drawScope.mo2908getCenterF1C5BW0() : j10, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? null : colorFilter, (i11 & 64) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i10);
    }

    public static /* synthetic */ void x(DrawScope drawScope, long j10, float f6, long j11, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        drawScope.mo2892drawCircleVaOC9Bg(j10, (i11 & 2) != 0 ? Size.m2343getMinDimensionimpl(drawScope.mo2909getSizeNHjbRc()) / 2.0f : f6, (i11 & 4) != 0 ? drawScope.mo2908getCenterF1C5BW0() : j11, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 32) != 0 ? null : colorFilter, (i11 & 64) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i10);
    }

    public static /* synthetic */ void y(DrawScope drawScope, ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
        }
        long jM4517getZeronOccac = (i11 & 2) != 0 ? IntOffset.INSTANCE.m4517getZeronOccac() : j10;
        long jIntSize = (i11 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j11;
        drawScope.mo2893drawImage9jGpkUE(imageBitmap, jM4517getZeronOccac, jIntSize, (i11 & 8) != 0 ? IntOffset.INSTANCE.m4517getZeronOccac() : j12, (i11 & 16) != 0 ? jIntSize : j13, (i11 & 32) != 0 ? 1.0f : f6, (i11 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 128) != 0 ? null : colorFilter, (i11 & 256) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i10);
    }

    public static /* synthetic */ void z(DrawScope drawScope, ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jM4517getZeronOccac = (i12 & 2) != 0 ? IntOffset.INSTANCE.m4517getZeronOccac() : j10;
        long jIntSize = (i12 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j11;
        drawScope.mo2894drawImageAZ2fEMs(imageBitmap, jM4517getZeronOccac, jIntSize, (i12 & 8) != 0 ? IntOffset.INSTANCE.m4517getZeronOccac() : j12, (i12 & 16) != 0 ? jIntSize : j13, (i12 & 32) != 0 ? 1.0f : f6, (i12 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i12 & 128) != 0 ? null : colorFilter, (i12 & 256) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i10, (i12 & 512) != 0 ? DrawScope.INSTANCE.m2940getDefaultFilterQualityfv9h1I() : i11);
    }
}
