package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.s;

/* JADX INFO: compiled from: GraphicsLayerModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nGraphicsLayerModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,672:1\n72#2:673\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n*L\n636#1:673\n*E\n"})
public final class a extends Modifier.Node implements LayoutModifierNode {
    public float H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public float P0;
    public float Q0;
    public long R0;

    @NotNull
    public Shape S0;
    public boolean T0;

    @Nullable
    public RenderEffect U0;
    public long V0;
    public long W0;
    public int X0;

    @NotNull
    public s Y0;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GraphicsLayerModifier.kt */
    public static final class C0060a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f15756p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ a f15757q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0060a(Placeable placeable, a aVar) {
            super(1);
            this.f15756p0 = placeable;
            this.f15757q0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeWithLayer$default(layout, this.f15756p0, 0, 0, 0.0f, this.f15757q0.Y0, 4, null);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.node.a.a(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.node.a.b(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo172measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(j10);
        return MeasureScope.CC.q(measure, placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight(), null, new C0060a(placeableMo3575measureBRTryo0, this), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.node.a.c(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.node.a.d(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @NotNull
    public final String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.H0 + ", scaleY=" + this.I0 + ", alpha = " + this.J0 + ", translationX=" + this.K0 + ", translationY=" + this.L0 + ", shadowElevation=" + this.M0 + ", rotationX=" + this.N0 + ", rotationY=" + this.O0 + ", rotationZ=" + this.P0 + ", cameraDistance=" + this.Q0 + ", transformOrigin=" + ((Object) TransformOrigin.m2843toStringimpl(this.R0)) + ", shape=" + this.S0 + ", clip=" + this.T0 + ", renderEffect=" + this.U0 + ", ambientShadowColor=" + ((Object) Color.m2516toStringimpl(this.V0)) + ", spotShadowColor=" + ((Object) Color.m2516toStringimpl(this.W0)) + ", compositingStrategy=" + ((Object) CompositingStrategy.m2587toStringimpl(this.X0)) + RootService.CLOSE_BRACKET;
    }
}
