package androidx.compose.foundation;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a1\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/BorderStroke;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/unit/Dp;", "width", "Landroidx/compose/ui/graphics/Color;", "color", "border-xT4_qwU", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/Brush;", "brush", "border-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class BorderKt {
    public static final long a(long j10, float f6) {
        return CornerRadiusKt.CornerRadius(Math.max(0.0f, CornerRadius.m2250getXimpl(j10) - f6), Math.max(0.0f, CornerRadius.m2251getYimpl(j10) - f6));
    }

    public static final Path access$createRoundRectPath(Path path, RoundRect roundRect, float f6, boolean z10) {
        path.reset();
        path.addRoundRect(roundRect);
        if (z10) {
            return path;
        }
        Path Path = AndroidPath_androidKt.Path();
        Path.addRoundRect(new RoundRect(f6, f6, roundRect.getWidth() - f6, roundRect.getHeight() - f6, a(roundRect.m2325getTopLeftCornerRadiuskKHJgLs(), f6), a(roundRect.m2326getTopRightCornerRadiuskKHJgLs(), f6), a(roundRect.m2324getBottomRightCornerRadiuskKHJgLs(), f6), a(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs(), f6), null));
        path.mo2409opN5in7k0(path, Path, PathOperation.INSTANCE.m2757getDifferenceb3I0S0c());
        return path;
    }

    @NotNull
    public static final Modifier border(@NotNull Modifier modifier, @NotNull BorderStroke border, @NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m131borderziNgDLE(modifier, border.getWidth(), border.getBrush(), shape);
    }

    public static /* synthetic */ Modifier border$default(Modifier modifier, BorderStroke borderStroke, Shape shape, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    @NotNull
    /* JADX INFO: renamed from: border-xT4_qwU, reason: not valid java name */
    public static final Modifier m129borderxT4_qwU(@NotNull Modifier border, float f6, long j10, @NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(border, "$this$border");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m131borderziNgDLE(border, f6, new SolidColor(j10, null), shape);
    }

    /* JADX INFO: renamed from: border-xT4_qwU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m130borderxT4_qwU$default(Modifier modifier, float f6, long j10, Shape shape, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m129borderxT4_qwU(modifier, f6, j10, shape);
    }

    @NotNull
    /* JADX INFO: renamed from: border-ziNgDLE, reason: not valid java name */
    public static final Modifier m131borderziNgDLE(@NotNull Modifier border, float f6, @NotNull Brush brush, @NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(border, "$this$border");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return border.then(new BorderModifierNodeElement(f6, brush, shape, null));
    }
}
