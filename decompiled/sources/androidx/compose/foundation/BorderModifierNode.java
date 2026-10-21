package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001d\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR3\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/unit/Dp;", "value", "K0", "F", "getWidth-D9Ej5fM", "()F", "setWidth-0680j_4", "(F)V", "width", "Landroidx/compose/ui/graphics/Brush;", "L0", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "brush", "Landroidx/compose/ui/graphics/Shape;", "M0", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "shape", "widthParameter", "brushParameter", "shapeParameter", "<init>", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n+ 2 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,512:1\n382#2,26:513\n408#2,4:540\n417#2,6:553\n423#2:580\n424#2,2:589\n1#3:539\n558#4,9:544\n567#4,8:581\n120#5,2:559\n173#5,6:561\n261#5,11:567\n122#5,2:578\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n*L\n259#1:513,26\n259#1:540,4\n259#1:553,6\n259#1:580\n259#1:589,2\n259#1:539\n259#1:544,9\n259#1:581,8\n265#1:559,2\n277#1:561,6\n277#1:567,11\n265#1:578,2\n*E\n"})
public final class BorderModifierNode extends DelegatingNode {

    @Nullable
    public t.c J0;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public float width;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @NotNull
    public Brush brush;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @NotNull
    public Shape shape;

    @NotNull
    public final CacheDrawModifierNode N0;

    public BorderModifierNode(float f6, Brush brushParameter, Shape shapeParameter, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(brushParameter, "brushParameter");
        Intrinsics.checkNotNullParameter(shapeParameter, "shapeParameter");
        this.width = f6;
        this.brush = brushParameter;
        this.shape = shapeParameter;
        this.N0 = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new t.j(this)));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d1  */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /* JADX WARN: Type inference failed for: r12v7 */
    public static final DrawResult access$drawGenericBorder(BorderModifierNode borderModifierNode, CacheDrawScope cacheDrawScope, Brush brush, Outline.Generic generic, boolean z10, float f6) {
        int iM2692getArgb8888_sVssgQ;
        ColorFilter colorFilterM2549tintxETnrds$default;
        boolean z11;
        ?? r12;
        Canvas canvas;
        borderModifierNode.getClass();
        if (z10) {
            return cacheDrawScope.onDrawWithContent(new t.f(generic, brush));
        }
        if (brush instanceof SolidColor) {
            iM2692getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m2691getAlpha8_sVssgQ();
            colorFilterM2549tintxETnrds$default = ColorFilter.Companion.m2549tintxETnrds$default(ColorFilter.INSTANCE, ((SolidColor) brush).getValue(), 0, 2, null);
        } else {
            iM2692getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m2692getArgb8888_sVssgQ();
            colorFilterM2549tintxETnrds$default = null;
        }
        Rect bounds = generic.getPath().getBounds();
        if (borderModifierNode.J0 == null) {
            borderModifierNode.J0 = new t.c(0);
        }
        t.c cVar = borderModifierNode.J0;
        Intrinsics.checkNotNull(cVar);
        Path Path = cVar.f93365d;
        if (Path == null) {
            Path = AndroidPath_androidKt.Path();
            cVar.f93365d = Path;
        }
        Path path = Path;
        path.reset();
        path.addRect(bounds);
        path.mo2409opN5in7k0(path, generic.getPath(), PathOperation.INSTANCE.m2757getDifferenceb3I0S0c());
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        long jIntSize = IntSizeKt.IntSize((int) Math.ceil(bounds.getWidth()), (int) Math.ceil(bounds.getHeight()));
        t.c cVar2 = borderModifierNode.J0;
        Intrinsics.checkNotNull(cVar2);
        ImageBitmap imageBitmap = cVar2.f93362a;
        Canvas canvas2 = cVar2.f93363b;
        ImageBitmapConfig imageBitmapConfigM2684boximpl = imageBitmap != null ? ImageBitmapConfig.m2684boximpl(imageBitmap.mo2384getConfig_sVssgQ()) : null;
        int iM2692getArgb8888_sVssgQ2 = ImageBitmapConfig.INSTANCE.m2692getArgb8888_sVssgQ();
        if (imageBitmapConfigM2684boximpl == null || !ImageBitmapConfig.m2687equalsimpl0(imageBitmapConfigM2684boximpl.m2690unboximpl(), iM2692getArgb8888_sVssgQ2)) {
            z11 = ImageBitmapConfig.m2686equalsimpl(iM2692getArgb8888_sVssgQ, imageBitmap != null ? ImageBitmapConfig.m2684boximpl(imageBitmap.mo2384getConfig_sVssgQ()) : null);
        }
        if (imageBitmap == null || canvas2 == null || Size.m2344getWidthimpl(cacheDrawScope.m2200getSizeNHjbRc()) > imageBitmap.getWidth() || Size.m2341getHeightimpl(cacheDrawScope.m2200getSizeNHjbRc()) > imageBitmap.getHeight() || !z11) {
            ImageBitmap imageBitmapM2697ImageBitmapx__hDU$default = ImageBitmapKt.m2697ImageBitmapx__hDU$default(IntSize.m4549getWidthimpl(jIntSize), IntSize.m4548getHeightimpl(jIntSize), iM2692getArgb8888_sVssgQ, false, null, 24, null);
            cVar2.f93362a = imageBitmapM2697ImageBitmapx__hDU$default;
            Canvas Canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(imageBitmapM2697ImageBitmapx__hDU$default);
            cVar2.f93363b = Canvas;
            r12 = imageBitmapM2697ImageBitmapx__hDU$default;
            canvas = Canvas;
        } else {
            r12 = imageBitmap;
            canvas = canvas2;
        }
        CanvasDrawScope canvasDrawScope = cVar2.f93364c;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            cVar2.f93364c = canvasDrawScope;
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        long jM4559toSizeozmzZPI = IntSizeKt.m4559toSizeozmzZPI(jIntSize);
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas3 = drawParams.getCanvas();
        long size = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m2914setSizeuvyYCjk(jM4559toSizeozmzZPI);
        canvas.save();
        long jM2534getBlack0d7_KjU = Color.INSTANCE.m2534getBlack0d7_KjU();
        BlendMode.Companion companion = BlendMode.INSTANCE;
        a1.b.K(canvasDrawScope2, jM2534getBlack0d7_KjU, 0L, jM4559toSizeozmzZPI, 0.0f, null, null, companion.m2432getClear0nO6VwU(), 58, null);
        float f10 = -bounds.getLeft();
        float f11 = -bounds.getTop();
        canvasDrawScope2.getDrawContext().getTransform().translate(f10, f11);
        a1.b.F(canvasDrawScope2, generic.getPath(), brush, 0.0f, new Stroke(f6 * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        float f12 = 1;
        float fM2344getWidthimpl = (Size.m2344getWidthimpl(a1.b.c(canvasDrawScope2)) + f12) / Size.m2344getWidthimpl(a1.b.c(canvasDrawScope2));
        float fM2341getHeightimpl = (Size.m2341getHeightimpl(a1.b.c(canvasDrawScope2)) + f12) / Size.m2341getHeightimpl(a1.b.c(canvasDrawScope2));
        long jB = a1.b.b(canvasDrawScope2);
        DrawContext drawContext = canvasDrawScope2.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2922scale0AR0LA0(fM2344getWidthimpl, fM2341getHeightimpl, jB);
        a1.b.F(canvasDrawScope2, path, brush, 0.0f, null, null, companion.m2432getClear0nO6VwU(), 28, null);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
        canvasDrawScope2.getDrawContext().getTransform().translate(-f10, -f11);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(density);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas3);
        drawParams3.m2914setSizeuvyYCjk(size);
        r12.prepareToDraw();
        objectRef.element = r12;
        return cacheDrawScope.onDrawWithContent(new t.g(bounds, objectRef, jIntSize, colorFilterM2549tintxETnrds$default));
    }

    /* JADX INFO: renamed from: access$drawRoundRectBorder-JqoCqck, reason: not valid java name */
    public static final DrawResult m132access$drawRoundRectBorderJqoCqck(BorderModifierNode borderModifierNode, CacheDrawScope cacheDrawScope, Brush brush, Outline.Rounded rounded, long j10, long j11, boolean z10, float f6) {
        borderModifierNode.getClass();
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            return cacheDrawScope.onDrawWithContent(new t.h(z10, brush, rounded.getRoundRect().m2325getTopLeftCornerRadiuskKHJgLs(), f6 / 2, f6, j10, j11, new Stroke(f6, 0.0f, 0, 0, null, 30, null)));
        }
        if (borderModifierNode.J0 == null) {
            borderModifierNode.J0 = new t.c(0);
        }
        t.c cVar = borderModifierNode.J0;
        Intrinsics.checkNotNull(cVar);
        Path Path = cVar.f93365d;
        if (Path == null) {
            Path = AndroidPath_androidKt.Path();
            cVar.f93365d = Path;
        }
        return cacheDrawScope.onDrawWithContent(new t.i(BorderKt.access$createRoundRectPath(Path, rounded.getRoundRect(), f6, z10), brush));
    }

    @NotNull
    public final Brush getBrush() {
        return this.brush;
    }

    @NotNull
    public final Shape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    public final void setBrush(@NotNull Brush value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.brush, value)) {
            return;
        }
        this.brush = value;
        this.N0.invalidateDrawCache();
    }

    public final void setShape(@NotNull Shape value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.shape, value)) {
            return;
        }
        this.shape = value;
        this.N0.invalidateDrawCache();
    }

    /* JADX INFO: renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m134setWidth0680j_4(float f6) {
        if (Dp.m4394equalsimpl0(this.width, f6)) {
            return;
        }
        this.width = f6;
        this.N0.invalidateDrawCache();
    }
}
