package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.DegreesKt;
import androidx.compose.ui.graphics.Path;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aH\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000b\u001ah\u0010\f\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a$\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\bH\u0086\bø\u0001\u0000\u001a1\u0010\u0016\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u001a=\u0010\u0016\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u001aI\u0010\u0016\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u001aH\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001aH\u0010\u001f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\u001e\u001aH\u0010\"\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b#\u0010\u001e\u001aP\u0010\"\u001a\u00020\u0001*\u00020\u00022\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b&\u0010'\u001a=\u0010(\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u001aB\u0010)\u001a\u00020\u0001*\u00020\u00022\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\t2\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"clipPath", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "clipPath-KD09W0M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;ILkotlin/jvm/functions/Function1;)V", "clipRect", Parameters.DIRECTION.LEFT, "", "top", Parameters.DIRECTION.RIGHT, "bottom", "clipRect-rOu3jXo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFILkotlin/jvm/functions/Function1;)V", "drawIntoCanvas", "Landroidx/compose/ui/graphics/Canvas;", "inset", "horizontal", "vertical", "rotate", "degrees", "pivot", "Landroidx/compose/ui/geometry/Offset;", "rotate-Rg1IO4c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJLkotlin/jvm/functions/Function1;)V", "rotateRad", "radians", "rotateRad-Rg1IO4c", ImageScaleTypeHandler.ID, "scale-Rg1IO4c", "scaleX", "scaleY", "scale-Fgt4K4Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLkotlin/jvm/functions/Function1;)V", "translate", "withTransform", "transformBlock", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "drawBlock", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,971:1\n66#1,4:972\n261#1,11:976\n261#1,11:987\n261#1,11:998\n261#1,11:1009\n261#1,11:1020\n261#1,11:1031\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n104#1:972,4\n140#1:976,11\n157#1:987,11\n178#1:998,11\n195#1:1009,11\n221#1:1020,11\n237#1:1031,11\n*E\n"})
public final class DrawScopeKt {
    /* JADX INFO: renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m2975clipPathKD09W0M(@NotNull DrawScope clipPath, @NotNull Path path, int i10, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(clipPath, "$this$clipPath");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = clipPath.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2917clipPathmtrdDE(path, i10);
        block.invoke(clipPath);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m2976clipPathKD09W0M$default(DrawScope clipPath, Path path, int i10, Function1 block, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = ClipOp.INSTANCE.m2497getIntersectrtfAjoo();
        }
        Intrinsics.checkNotNullParameter(clipPath, "$this$clipPath");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = clipPath.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2917clipPathmtrdDE(path, i10);
        block.invoke(clipPath);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m2977clipRectrOu3jXo(@NotNull DrawScope clipRect, float f6, float f10, float f11, float f12, int i10, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(clipRect, "$this$clipRect");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = clipRect.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2918clipRectN_I0leg(f6, f10, f11, f12, i10);
        block.invoke(clipRect);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m2978clipRectrOu3jXo$default(DrawScope clipRect, float f6, float f10, float f11, float f12, int i10, Function1 block, int i11, Object obj) {
        float f13 = (i11 & 1) != 0 ? 0.0f : f6;
        float f14 = (i11 & 2) != 0 ? 0.0f : f10;
        if ((i11 & 4) != 0) {
            f11 = Size.m2344getWidthimpl(clipRect.mo2909getSizeNHjbRc());
        }
        float f15 = f11;
        if ((i11 & 8) != 0) {
            f12 = Size.m2341getHeightimpl(clipRect.mo2909getSizeNHjbRc());
        }
        float f16 = f12;
        if ((i11 & 16) != 0) {
            i10 = ClipOp.INSTANCE.m2497getIntersectrtfAjoo();
        }
        Intrinsics.checkNotNullParameter(clipRect, "$this$clipRect");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = clipRect.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2918clipRectN_I0leg(f13, f14, f15, f16, i10);
        block.invoke(clipRect);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    public static final void drawIntoCanvas(@NotNull DrawScope drawScope, @NotNull Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void inset(@NotNull DrawScope drawScope, float f6, float f10, float f11, float f12, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        drawScope.getDrawContext().getTransform().inset(f6, f10, f11, f12);
        block.invoke(drawScope);
        drawScope.getDrawContext().getTransform().inset(-f6, -f10, -f11, -f12);
    }

    public static /* synthetic */ void inset$default(DrawScope drawScope, float f6, float f10, Function1 block, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        drawScope.getDrawContext().getTransform().inset(f6, f10, f6, f10);
        block.invoke(drawScope);
        float f11 = -f6;
        float f12 = -f10;
        drawScope.getDrawContext().getTransform().inset(f11, f12, f11, f12);
    }

    /* JADX INFO: renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m2979rotateRg1IO4c(@NotNull DrawScope rotate, float f6, long j10, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(rotate, "$this$rotate");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = rotate.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2921rotateUv8p0NA(f6, j10);
        block.invoke(rotate);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m2980rotateRg1IO4c$default(DrawScope rotate, float f6, long j10, Function1 block, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = rotate.mo2908getCenterF1C5BW0();
        }
        Intrinsics.checkNotNullParameter(rotate, "$this$rotate");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = rotate.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2921rotateUv8p0NA(f6, j10);
        block.invoke(rotate);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m2981rotateRadRg1IO4c(@NotNull DrawScope rotateRad, float f6, long j10, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(rotateRad, "$this$rotateRad");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = rotateRad.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2921rotateUv8p0NA(DegreesKt.degrees(f6), j10);
        block.invoke(rotateRad);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m2982rotateRadRg1IO4c$default(DrawScope rotateRad, float f6, long j10, Function1 block, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = rotateRad.mo2908getCenterF1C5BW0();
        }
        Intrinsics.checkNotNullParameter(rotateRad, "$this$rotateRad");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = rotateRad.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2921rotateUv8p0NA(DegreesKt.degrees(f6), j10);
        block.invoke(rotateRad);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m2983scaleFgt4K4Q(@NotNull DrawScope scale, float f6, float f10, long j10, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = scale.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2922scale0AR0LA0(f6, f10, j10);
        block.invoke(scale);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m2984scaleFgt4K4Q$default(DrawScope scale, float f6, float f10, long j10, Function1 block, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = scale.mo2908getCenterF1C5BW0();
        }
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = scale.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2922scale0AR0LA0(f6, f10, j10);
        block.invoke(scale);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m2985scaleRg1IO4c(@NotNull DrawScope scale, float f6, long j10, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = scale.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2922scale0AR0LA0(f6, f6, j10);
        block.invoke(scale);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m2986scaleRg1IO4c$default(DrawScope scale, float f6, long j10, Function1 block, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = scale.mo2908getCenterF1C5BW0();
        }
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = scale.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2922scale0AR0LA0(f6, f6, j10);
        block.invoke(scale);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    public static final void translate(@NotNull DrawScope drawScope, float f6, float f10, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        drawScope.getDrawContext().getTransform().translate(f6, f10);
        block.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f6, -f10);
    }

    public static /* synthetic */ void translate$default(DrawScope drawScope, float f6, float f10, Function1 block, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        drawScope.getDrawContext().getTransform().translate(f6, f10);
        block.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f6, -f10);
    }

    public static final void withTransform(@NotNull DrawScope drawScope, @NotNull Function1<? super DrawTransform, Unit> transformBlock, @NotNull Function1<? super DrawScope, Unit> drawBlock) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(transformBlock, "transformBlock");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        transformBlock.invoke(drawContext.getTransform());
        drawBlock.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    public static final void inset(@NotNull DrawScope drawScope, float f6, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        drawScope.getDrawContext().getTransform().inset(f6, f6, f6, f6);
        block.invoke(drawScope);
        float f10 = -f6;
        drawScope.getDrawContext().getTransform().inset(f10, f10, f10, f10);
    }

    public static final void inset(@NotNull DrawScope drawScope, float f6, float f10, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        drawScope.getDrawContext().getTransform().inset(f6, f10, f6, f10);
        block.invoke(drawScope);
        float f11 = -f6;
        float f12 = -f10;
        drawScope.getDrawContext().getTransform().inset(f11, f12, f11, f12);
    }
}
