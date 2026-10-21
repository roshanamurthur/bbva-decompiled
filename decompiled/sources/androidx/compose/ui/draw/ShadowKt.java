package androidx.compose.ui.draw;

import androidx.activity.a;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Shadow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001aI\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"shadow", "Landroidx/compose/ui/Modifier;", "elevation", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "shadow-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "ambientColor", "Landroidx/compose/ui/graphics/Color;", "spotColor", "shadow-s4CzXII", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,123:1\n154#2:124\n154#2:125\n154#2:128\n135#3:126\n146#3:127\n*S KotlinDebug\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n*L\n64#1:124\n101#1:125\n98#1:128\n103#1:126\n102#1:127\n*E\n"})
public final class ShadowKt {

    /* JADX INFO: compiled from: Shadow.kt */
    public static final class a extends Lambda implements Function1<GraphicsLayerScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f15454p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Shape f15455q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f15456r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f15457s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f15458t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f6, Shape shape, boolean z10, long j10, long j11) {
            super(1);
            this.f15454p0 = f6;
            this.f15455q0 = shape;
            this.f15456r0 = z10;
            this.f15457s0 = j10;
            this.f15458t0 = j11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            GraphicsLayerScope graphicsLayer = graphicsLayerScope;
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setShadowElevation(graphicsLayer.mo415toPx0680j_4(this.f15454p0));
            graphicsLayer.setShape(this.f15455q0);
            graphicsLayer.setClip(this.f15456r0);
            graphicsLayer.mo2661setAmbientShadowColor8_81llA(this.f15457s0);
            graphicsLayer.mo2663setSpotShadowColor8_81llA(this.f15458t0);
            return Unit.INSTANCE;
        }
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final Modifier m2201shadows4CzXII(@NotNull Modifier shadow, final float f6, @NotNull final Shape shape, final boolean z10, final long j10, final long j11) {
        Intrinsics.checkNotNullParameter(shadow, "$this$shadow");
        Intrinsics.checkNotNullParameter(shape, "shape");
        if (Dp.m4388compareTo0680j_4(f6, Dp.m4389constructorimpl(0)) > 0 || z10) {
            return InspectableValueKt.inspectableWrapper(shadow, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                    a.b(f6, a.c(inspectorInfo, "$this$null", "shadow"), "elevation", inspectorInfo).set("shape", shape);
                    com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(z10, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "clip", inspectorInfo).set("ambientColor", Color.m2498boximpl(j10));
                    inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("spotColor", Color.m2498boximpl(j11));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    invoke2(inspectorInfo);
                    return Unit.INSTANCE;
                }
            } : InspectableValueKt.getNoInspectorInfo(), GraphicsLayerModifierKt.graphicsLayer(Modifier.INSTANCE, new a(f6, shape, z10, j10, j11)));
        }
        return shadow;
    }

    /* JADX INFO: renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2202shadows4CzXII$default(Modifier modifier, float f6, Shape shape, boolean z10, long j10, long j11, int i10, Object obj) {
        boolean z11;
        Shape rectangleShape = (i10 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        if ((i10 & 4) != 0) {
            z11 = false;
            if (Dp.m4388compareTo0680j_4(f6, Dp.m4389constructorimpl(0)) > 0) {
                z11 = true;
            }
        } else {
            z11 = z10;
        }
        return m2201shadows4CzXII(modifier, f6, rectangleShape, z11, (i10 & 8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j10, (i10 & 16) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j11);
    }

    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with shadow which accepts ambientColor and spotColor parameters", replaceWith = @ReplaceWith(expression = "Modifier.shadow(elevation, shape, clip, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.draw"}))
    /* JADX INFO: renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ Modifier m2203shadowziNgDLE(Modifier shadow, float f6, Shape shape, boolean z10) {
        Intrinsics.checkNotNullParameter(shadow, "$this$shadow");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m2201shadows4CzXII(shadow, f6, shape, z10, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* JADX INFO: renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2204shadowziNgDLE$default(Modifier modifier, float f6, Shape shape, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i10 & 4) != 0) {
            z10 = false;
            if (Dp.m4388compareTo0680j_4(f6, Dp.m4389constructorimpl(0)) > 0) {
                z10 = true;
            }
        }
        return m2203shadowziNgDLE(modifier, f6, shape, z10);
    }
}
