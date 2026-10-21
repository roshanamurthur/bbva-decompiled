package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.l;

/* JADX INFO: compiled from: Outline.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001aQ\u0010\u0012\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001aQ\u0010\u0012\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001a\u0010\u0012\u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/Outline;", "outline", "", "addOutline", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "color", "", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "style", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawOutline-wDX37Ww", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOutline", "Landroidx/compose/ui/graphics/Brush;", "brush", "drawOutline-hn5TExg", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Canvas;", "Landroidx/compose/ui/graphics/Paint;", "paint", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n1#1,307:1\n245#1,16:308\n245#1,16:324\n*S KotlinDebug\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n155#1:308,16\n195#1:324,16\n*E\n"})
public final class OutlineKt {
    public static final boolean access$hasSameCornerRadius(RoundRect roundRect) {
        return ((CornerRadius.m2250getXimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs()) > CornerRadius.m2250getXimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m2250getXimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs()) == CornerRadius.m2250getXimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (CornerRadius.m2250getXimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()) > CornerRadius.m2250getXimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m2250getXimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m2250getXimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (CornerRadius.m2250getXimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()) > CornerRadius.m2250getXimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m2250getXimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m2250getXimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) ? 0 : -1)) == 0) && ((CornerRadius.m2251getYimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs()) > CornerRadius.m2251getYimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m2251getYimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs()) == CornerRadius.m2251getYimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (CornerRadius.m2251getYimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()) > CornerRadius.m2251getYimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m2251getYimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m2251getYimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (CornerRadius.m2251getYimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()) > CornerRadius.m2251getYimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m2251getYimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m2251getYimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) ? 0 : -1)) == 0);
    }

    public static final void addOutline(@NotNull Path path, @NotNull Outline outline) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(outline, "outline");
        if (outline instanceof Outline.Rectangle) {
            path.addRect(((Outline.Rectangle) outline).getRect());
        } else if (outline instanceof Outline.Rounded) {
            path.addRoundRect(((Outline.Rounded) outline).getRoundRect());
        } else {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            l.g(path, ((Outline.Generic) outline).getPath(), 0L, 2, null);
        }
    }

    public static final void drawOutline(@NotNull Canvas canvas, @NotNull Outline outline, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (outline instanceof Outline.Rectangle) {
            canvas.drawRect(((Outline.Rectangle) outline).getRect(), paint);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            canvas.drawPath(((Outline.Generic) outline).getPath(), paint);
        } else {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath = rounded.getRoundRectPath();
            if (roundRectPath != null) {
                canvas.drawPath(roundRectPath, paint);
            } else {
                canvas.drawRoundRect(rounded.getRoundRect().getLeft(), rounded.getRoundRect().getTop(), rounded.getRoundRect().getRight(), rounded.getRoundRect().getBottom(), CornerRadius.m2250getXimpl(rounded.getRoundRect().m2323getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m2251getYimpl(rounded.getRoundRect().m2323getBottomLeftCornerRadiuskKHJgLs()), paint);
            }
        }
    }

    /* JADX INFO: renamed from: drawOutline-hn5TExg, reason: not valid java name */
    public static final void m2724drawOutlinehn5TExg(@NotNull DrawScope drawOutline, @NotNull Outline outline, @NotNull Brush brush, float f6, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i10) {
        Path path;
        Intrinsics.checkNotNullParameter(drawOutline, "$this$drawOutline");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawOutline.mo2904drawRectAsUm42w(brush, OffsetKt.Offset(rect.getLeft(), rect.getTop()), SizeKt.Size(rect.getWidth(), rect.getHeight()), f6, style, colorFilter, i10);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            path = rounded.getRoundRectPath();
            if (path == null) {
                RoundRect roundRect = rounded.getRoundRect();
                drawOutline.mo2906drawRoundRectZuiqVtQ(brush, OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop()), SizeKt.Size(roundRect.getWidth(), roundRect.getHeight()), CornerRadiusKt.CornerRadius$default(CornerRadius.m2250getXimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), f6, style, colorFilter, i10);
                return;
            }
        } else {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            path = ((Outline.Generic) outline).getPath();
        }
        drawOutline.mo2900drawPathGBMwjPU(path, brush, f6, style, colorFilter, i10);
    }

    /* JADX INFO: renamed from: drawOutline-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m2725drawOutlinehn5TExg$default(DrawScope drawScope, Outline outline, Brush brush, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
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
        m2724drawOutlinehn5TExg(drawScope, outline, brush, f10, drawStyle2, colorFilter2, i10);
    }

    /* JADX INFO: renamed from: drawOutline-wDX37Ww, reason: not valid java name */
    public static final void m2726drawOutlinewDX37Ww(@NotNull DrawScope drawOutline, @NotNull Outline outline, long j10, float f6, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i10) {
        Path path;
        Intrinsics.checkNotNullParameter(drawOutline, "$this$drawOutline");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(style, "style");
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawOutline.mo2905drawRectnJ9OG0(j10, OffsetKt.Offset(rect.getLeft(), rect.getTop()), SizeKt.Size(rect.getWidth(), rect.getHeight()), f6, style, colorFilter, i10);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            path = rounded.getRoundRectPath();
            if (path == null) {
                RoundRect roundRect = rounded.getRoundRect();
                drawOutline.mo2907drawRoundRectuAw5IA(j10, OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop()), SizeKt.Size(roundRect.getWidth(), roundRect.getHeight()), CornerRadiusKt.CornerRadius$default(CornerRadius.m2250getXimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), style, f6, colorFilter, i10);
                return;
            }
        } else {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            path = ((Outline.Generic) outline).getPath();
        }
        drawOutline.mo2901drawPathLG529CI(path, j10, f6, style, colorFilter, i10);
    }
}
