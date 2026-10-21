package y0;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.DegreesKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c {
    public static void a(Canvas canvas, @NotNull Rect rect, int i10) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        canvas.mo2370clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i10);
    }

    public static void b(Canvas canvas, @NotNull Rect rect, float f6, float f10, boolean z10, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f6, f10, z10, paint);
    }

    public static void c(Canvas canvas, @NotNull Rect rect, float f6, float f10, boolean z10, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawArc(rect, DegreesKt.degrees(f6), DegreesKt.degrees(f10), z10, paint);
    }

    public static void d(Canvas canvas, @NotNull Rect rect, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    public static void e(Canvas canvas, @NotNull Rect rect, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    public static void f(Canvas canvas, float f6, float f10) {
        canvas.skew(DegreesKt.degrees(f6), DegreesKt.degrees(f10));
    }

    public static /* synthetic */ void m(Canvas canvas, Path path, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = ClipOp.INSTANCE.m2497getIntersectrtfAjoo();
        }
        canvas.mo2369clipPathmtrdDE(path, i10);
    }

    public static /* synthetic */ void n(Canvas canvas, float f6, float f10, float f11, float f12, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 16) != 0) {
            i10 = ClipOp.INSTANCE.m2497getIntersectrtfAjoo();
        }
        canvas.mo2370clipRectN_I0leg(f6, f10, f11, f12, i10);
    }

    public static /* synthetic */ void o(Canvas canvas, Rect rect, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = ClipOp.INSTANCE.m2497getIntersectrtfAjoo();
        }
        canvas.mo2371clipRectmtrdDE(rect, i10);
    }

    public static /* synthetic */ void p(Canvas canvas, ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, Paint paint, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
        }
        long jM4517getZeronOccac = (i10 & 2) != 0 ? IntOffset.INSTANCE.m4517getZeronOccac() : j10;
        long jIntSize = (i10 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j11;
        canvas.mo2375drawImageRectHPBpro0(imageBitmap, jM4517getZeronOccac, jIntSize, (i10 & 8) != 0 ? IntOffset.INSTANCE.m4517getZeronOccac() : j12, (i10 & 16) != 0 ? jIntSize : j13, paint);
    }

    public static /* synthetic */ void q(Canvas canvas, float f6, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
        }
        if ((i10 & 2) != 0) {
            f10 = f6;
        }
        canvas.scale(f6, f10);
    }
}
