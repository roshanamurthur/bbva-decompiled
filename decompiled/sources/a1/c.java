package a1;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawTransform;

/* JADX INFO: compiled from: DrawTransform.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c {
    public static long a(DrawTransform drawTransform) {
        float f6 = 2;
        return OffsetKt.Offset(Size.m2344getWidthimpl(drawTransform.mo2920getSizeNHjbRc()) / f6, Size.m2341getHeightimpl(drawTransform.mo2920getSizeNHjbRc()) / f6);
    }

    public static /* synthetic */ void c(DrawTransform drawTransform, Path path, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = ClipOp.INSTANCE.m2497getIntersectrtfAjoo();
        }
        drawTransform.mo2917clipPathmtrdDE(path, i10);
    }

    public static /* synthetic */ void d(DrawTransform drawTransform, float f6, float f10, float f11, float f12, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 1) != 0) {
            f6 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f11 = Size.m2344getWidthimpl(drawTransform.mo2920getSizeNHjbRc());
        }
        if ((i11 & 8) != 0) {
            f12 = Size.m2341getHeightimpl(drawTransform.mo2920getSizeNHjbRc());
        }
        if ((i11 & 16) != 0) {
            i10 = ClipOp.INSTANCE.m2497getIntersectrtfAjoo();
        }
        drawTransform.mo2918clipRectN_I0leg(f6, f10, f11, f12, i10);
    }

    public static /* synthetic */ void e(DrawTransform drawTransform, float f6, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if ((i10 & 2) != 0) {
            j10 = drawTransform.mo2919getCenterF1C5BW0();
        }
        drawTransform.mo2921rotateUv8p0NA(f6, j10);
    }

    public static /* synthetic */ void f(DrawTransform drawTransform, float f6, float f10, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if ((i10 & 4) != 0) {
            j10 = drawTransform.mo2919getCenterF1C5BW0();
        }
        drawTransform.mo2922scale0AR0LA0(f6, f10, j10);
    }

    public static /* synthetic */ void g(DrawTransform drawTransform, float f6, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i10 & 1) != 0) {
            f6 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        drawTransform.translate(f6, f10);
    }
}
