package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Painter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H$J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0014J5\u0010\u0013\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\u00020\u000f8&X¦\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/graphics/painter/Painter;", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "", "alpha", "", "applyAlpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "applyLayoutDirection", "Landroidx/compose/ui/geometry/Size;", "size", "draw-x_KDEd0", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/ui/graphics/ColorFilter;)V", "draw", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,217:1\n66#2,2:218\n245#2:220\n68#2,2:228\n111#3,7:221\n*S KotlinDebug\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n*L\n195#1:218,2\n206#1:220\n195#1:228,2\n207#1:221,7\n*E\n"})
public abstract class Painter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Paint f15885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ColorFilter f15887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15888d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public LayoutDirection f15889e = LayoutDirection.Ltr;

    /* JADX INFO: compiled from: Painter.kt */
    public static final class a extends Lambda implements Function1<DrawScope, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope drawScope2 = drawScope;
            Intrinsics.checkNotNullParameter(drawScope2, "$this$null");
            Painter.this.onDraw(drawScope2);
            return Unit.INSTANCE;
        }
    }

    public Painter() {
        new a();
    }

    /* JADX INFO: renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m3006drawx_KDEd0$default(Painter painter, DrawScope drawScope, long j10, float f6, ColorFilter colorFilter, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i10 & 2) != 0) {
            f6 = 1.0f;
        }
        float f10 = f6;
        if ((i10 & 4) != 0) {
            colorFilter = null;
        }
        painter.m3007drawx_KDEd0(drawScope, j10, f10, colorFilter);
    }

    public boolean applyAlpha(float alpha) {
        return false;
    }

    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        return false;
    }

    public boolean applyLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return false;
    }

    /* JADX INFO: renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m3007drawx_KDEd0(@NotNull DrawScope draw, long j10, float f6, @Nullable ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(draw, "$this$draw");
        if (this.f15888d != f6) {
            if (!applyAlpha(f6)) {
                if (f6 == 1.0f) {
                    Paint paint = this.f15885a;
                    if (paint != null) {
                        paint.setAlpha(f6);
                    }
                    this.f15886b = false;
                } else {
                    Paint Paint = this.f15885a;
                    if (Paint == null) {
                        Paint = AndroidPaint_androidKt.Paint();
                        this.f15885a = Paint;
                    }
                    Paint.setAlpha(f6);
                    this.f15886b = true;
                }
            }
            this.f15888d = f6;
        }
        if (!Intrinsics.areEqual(this.f15887c, colorFilter)) {
            if (!applyColorFilter(colorFilter)) {
                if (colorFilter == null) {
                    Paint paint2 = this.f15885a;
                    if (paint2 != null) {
                        paint2.setColorFilter(null);
                    }
                    this.f15886b = false;
                } else {
                    Paint Paint2 = this.f15885a;
                    if (Paint2 == null) {
                        Paint2 = AndroidPaint_androidKt.Paint();
                        this.f15885a = Paint2;
                    }
                    Paint2.setColorFilter(colorFilter);
                    this.f15886b = true;
                }
            }
            this.f15887c = colorFilter;
        }
        LayoutDirection layoutDirection = draw.getLayoutDirection();
        if (this.f15889e != layoutDirection) {
            applyLayoutDirection(layoutDirection);
            this.f15889e = layoutDirection;
        }
        float fM2344getWidthimpl = Size.m2344getWidthimpl(draw.mo2909getSizeNHjbRc()) - Size.m2344getWidthimpl(j10);
        float fM2341getHeightimpl = Size.m2341getHeightimpl(draw.mo2909getSizeNHjbRc()) - Size.m2341getHeightimpl(j10);
        draw.getDrawContext().getTransform().inset(0.0f, 0.0f, fM2344getWidthimpl, fM2341getHeightimpl);
        if (f6 > 0.0f && Size.m2344getWidthimpl(j10) > 0.0f && Size.m2341getHeightimpl(j10) > 0.0f) {
            if (this.f15886b) {
                Rect rectM2315Recttz77jQw = RectKt.m2315Recttz77jQw(Offset.INSTANCE.m2291getZeroF1C5BW0(), SizeKt.Size(Size.m2344getWidthimpl(j10), Size.m2341getHeightimpl(j10)));
                Canvas canvas = draw.getDrawContext().getCanvas();
                Paint Paint3 = this.f15885a;
                if (Paint3 == null) {
                    Paint3 = AndroidPaint_androidKt.Paint();
                    this.f15885a = Paint3;
                }
                try {
                    canvas.saveLayer(rectM2315Recttz77jQw, Paint3);
                    onDraw(draw);
                    canvas.restore();
                } catch (Throwable th2) {
                    canvas.restore();
                    throw th2;
                }
            } else {
                onDraw(draw);
            }
        }
        draw.getDrawContext().getTransform().inset(-0.0f, -0.0f, -fM2344getWidthimpl, -fM2341getHeightimpl);
    }

    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo3001getIntrinsicSizeNHjbRc();

    public abstract void onDraw(@NotNull DrawScope drawScope);
}
