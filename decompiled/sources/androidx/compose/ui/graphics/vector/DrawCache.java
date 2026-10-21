package androidx.compose.ui.graphics.vector;

import a1.b;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DrawCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010\u001eJD\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013R*\u0010\u001f\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/vector/DrawCache;", "", "Landroidx/compose/ui/unit/IntSize;", "size", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "block", "drawCachedImage-CJJAR-o", "(JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Lkotlin/jvm/functions/Function1;)V", "drawCachedImage", "target", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "drawInto", "Landroidx/compose/ui/graphics/ImageBitmap;", "a", "Landroidx/compose/ui/graphics/ImageBitmap;", "getMCachedImage", "()Landroidx/compose/ui/graphics/ImageBitmap;", "setMCachedImage", "(Landroidx/compose/ui/graphics/ImageBitmap;)V", "getMCachedImage$annotations", "()V", "mCachedImage", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDrawCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,106:1\n558#2,17:107\n*S KotlinDebug\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n*L\n76#1:107,17\n*E\n"})
public final class DrawCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ImageBitmap mCachedImage;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Canvas f15892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Density f15893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15894d = IntSize.INSTANCE.m4554getZeroYbymL2g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CanvasDrawScope f15895e = new CanvasDrawScope();

    public static /* synthetic */ void drawInto$default(DrawCache drawCache, DrawScope drawScope, float f6, ColorFilter colorFilter, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f6 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            colorFilter = null;
        }
        drawCache.drawInto(drawScope, f6, colorFilter);
    }

    /* JADX INFO: renamed from: drawCachedImage-CJJAR-o, reason: not valid java name */
    public final void m3008drawCachedImageCJJARo(long size, @NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f15893c = density;
        ImageBitmap imageBitmapM2697ImageBitmapx__hDU$default = this.mCachedImage;
        Canvas Canvas = this.f15892b;
        if (imageBitmapM2697ImageBitmapx__hDU$default == null || Canvas == null || IntSize.m4549getWidthimpl(size) > imageBitmapM2697ImageBitmapx__hDU$default.getWidth() || IntSize.m4548getHeightimpl(size) > imageBitmapM2697ImageBitmapx__hDU$default.getHeight()) {
            imageBitmapM2697ImageBitmapx__hDU$default = ImageBitmapKt.m2697ImageBitmapx__hDU$default(IntSize.m4549getWidthimpl(size), IntSize.m4548getHeightimpl(size), 0, false, null, 28, null);
            Canvas = CanvasKt.Canvas(imageBitmapM2697ImageBitmapx__hDU$default);
            this.mCachedImage = imageBitmapM2697ImageBitmapx__hDU$default;
            this.f15892b = Canvas;
        }
        this.f15894d = size;
        long jM4559toSizeozmzZPI = IntSizeKt.m4559toSizeozmzZPI(size);
        CanvasDrawScope canvasDrawScope = this.f15895e;
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density density2 = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas = drawParams.getCanvas();
        long size2 = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(Canvas);
        drawParams2.m2914setSizeuvyYCjk(jM4559toSizeozmzZPI);
        Canvas.save();
        b.K(canvasDrawScope, Color.INSTANCE.m2534getBlack0d7_KjU(), 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m2432getClear0nO6VwU(), 62, null);
        block.invoke(canvasDrawScope);
        Canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(density2);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas);
        drawParams3.m2914setSizeuvyYCjk(size2);
        imageBitmapM2697ImageBitmapx__hDU$default.prepareToDraw();
    }

    public final void drawInto(@NotNull DrawScope target, float alpha, @Nullable ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(target, "target");
        ImageBitmap imageBitmap = this.mCachedImage;
        if (imageBitmap == null) {
            throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
        }
        b.z(target, imageBitmap, 0L, this.f15894d, 0L, 0L, alpha, null, colorFilter, 0, 0, 858, null);
    }

    @Nullable
    public final ImageBitmap getMCachedImage() {
        return this.mCachedImage;
    }

    public final void setMCachedImage(@Nullable ImageBitmap imageBitmap) {
        this.mCachedImage = imageBitmap;
    }

    @PublishedApi
    public static /* synthetic */ void getMCachedImage$annotations() {
    }
}
