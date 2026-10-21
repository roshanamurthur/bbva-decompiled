package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Blur.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radius", "Landroidx/compose/ui/unit/Dp;", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radiusX", "radiusY", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,153:1\n154#2:154\n*S KotlinDebug\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n*L\n112#1:154\n*E\n"})
public final class BlurKt {

    /* JADX INFO: compiled from: Blur.kt */
    public static final class a extends Lambda implements Function1<GraphicsLayerScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f15433p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f15434q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f15435r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Shape f15436s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f15437t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f6, float f10, int i10, Shape shape, boolean z10) {
            super(1);
            this.f15433p0 = f6;
            this.f15434q0 = f10;
            this.f15435r0 = i10;
            this.f15436s0 = shape;
            this.f15437t0 = z10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            GraphicsLayerScope graphicsLayer = graphicsLayerScope;
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            float fMo415toPx0680j_4 = graphicsLayer.mo415toPx0680j_4(this.f15433p0);
            float fMo415toPx0680j_5 = graphicsLayer.mo415toPx0680j_4(this.f15434q0);
            graphicsLayer.setRenderEffect((fMo415toPx0680j_4 <= 0.0f || fMo415toPx0680j_5 <= 0.0f) ? null : RenderEffectKt.m2773BlurEffect3YTHUZs(fMo415toPx0680j_4, fMo415toPx0680j_5, this.f15435r0));
            Shape rectangleShape = this.f15436s0;
            if (rectangleShape == null) {
                rectangleShape = RectangleShapeKt.getRectangleShape();
            }
            graphicsLayer.setShape(rectangleShape);
            graphicsLayer.setClip(this.f15437t0);
            return Unit.INSTANCE;
        }
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m2186blur1fqSgw(@NotNull Modifier blur, float f6, float f10, @NotNull Shape shape) {
        boolean z10;
        int iM2829getDecal3opZhB0;
        Intrinsics.checkNotNullParameter(blur, "$this$blur");
        if (shape != null) {
            iM2829getDecal3opZhB0 = TileMode.INSTANCE.m2828getClamp3opZhB0();
            z10 = true;
        } else {
            z10 = false;
            iM2829getDecal3opZhB0 = TileMode.INSTANCE.m2829getDecal3opZhB0();
        }
        float f11 = 0;
        return ((Dp.m4388compareTo0680j_4(f6, Dp.m4389constructorimpl(f11)) <= 0 || Dp.m4388compareTo0680j_4(f10, Dp.m4389constructorimpl(f11)) <= 0) && !z10) ? blur : GraphicsLayerModifierKt.graphicsLayer(blur, new a(f6, f10, iM2829getDecal3opZhB0, shape, z10));
    }

    /* JADX INFO: renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2187blur1fqSgw$default(Modifier modifier, float f6, float f10, BlurredEdgeTreatment blurredEdgeTreatment, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m2190boximpl(BlurredEdgeTreatment.INSTANCE.m2197getRectangleGoahg());
        }
        return m2186blur1fqSgw(modifier, f6, f10, blurredEdgeTreatment.m2196unboximpl());
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m2188blurF8QBwvs(@NotNull Modifier blur, float f6, @NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(blur, "$this$blur");
        return m2186blur1fqSgw(blur, f6, f6, shape);
    }

    /* JADX INFO: renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2189blurF8QBwvs$default(Modifier modifier, float f6, BlurredEdgeTreatment blurredEdgeTreatment, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m2190boximpl(BlurredEdgeTreatment.INSTANCE.m2197getRectangleGoahg());
        }
        return m2188blurF8QBwvs(modifier, f6, blurredEdgeTreatment.m2196unboximpl());
    }
}
