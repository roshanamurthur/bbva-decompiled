package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CanvasDrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 8, 0})
public final class CanvasDrawScopeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Density f15859a = DensityKt.Density(1.0f, 1.0f);

    public static final DrawTransform access$asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1
            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* JADX INFO: renamed from: clipPath-mtrdD-E, reason: not valid java name */
            public void mo2917clipPathmtrdDE(@NotNull Path path, int clipOp) {
                Intrinsics.checkNotNullParameter(path, "path");
                drawContext.getCanvas().mo2369clipPathmtrdDE(path, clipOp);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* JADX INFO: renamed from: clipRect-N_I0leg, reason: not valid java name */
            public void mo2918clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp) {
                drawContext.getCanvas().mo2370clipRectN_I0leg(left, top, right, bottom, clipOp);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
            public long mo2919getCenterF1C5BW0() {
                return SizeKt.m2354getCenteruvyYCjk(mo2920getSizeNHjbRc());
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
            public long mo2920getSizeNHjbRc() {
                return drawContext.mo2915getSizeNHjbRc();
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void inset(float left, float top, float right, float bottom) {
                DrawContext drawContext2 = drawContext;
                Canvas canvas = drawContext2.getCanvas();
                long jSize = SizeKt.Size(Size.m2344getWidthimpl(mo2920getSizeNHjbRc()) - (right + left), Size.m2341getHeightimpl(mo2920getSizeNHjbRc()) - (bottom + top));
                if (Size.m2344getWidthimpl(jSize) < 0.0f || Size.m2341getHeightimpl(jSize) < 0.0f) {
                    throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
                }
                drawContext2.mo2916setSizeuvyYCjk(jSize);
                canvas.translate(left, top);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* JADX INFO: renamed from: rotate-Uv8p0NA, reason: not valid java name */
            public void mo2921rotateUv8p0NA(float degrees, long pivot) {
                Canvas canvas = drawContext.getCanvas();
                canvas.translate(Offset.m2275getXimpl(pivot), Offset.m2276getYimpl(pivot));
                canvas.rotate(degrees);
                canvas.translate(-Offset.m2275getXimpl(pivot), -Offset.m2276getYimpl(pivot));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* JADX INFO: renamed from: scale-0AR0LA0, reason: not valid java name */
            public void mo2922scale0AR0LA0(float scaleX, float scaleY, long pivot) {
                Canvas canvas = drawContext.getCanvas();
                canvas.translate(Offset.m2275getXimpl(pivot), Offset.m2276getYimpl(pivot));
                canvas.scale(scaleX, scaleY);
                canvas.translate(-Offset.m2275getXimpl(pivot), -Offset.m2276getYimpl(pivot));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* JADX INFO: renamed from: transform-58bKbWc, reason: not valid java name */
            public void mo2923transform58bKbWc(@NotNull float[] matrix) {
                Intrinsics.checkNotNullParameter(matrix, "matrix");
                drawContext.getCanvas().mo2372concat58bKbWc(matrix);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void translate(float left, float top) {
                drawContext.getCanvas().translate(left, top);
            }
        };
    }
}
