package y0;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: GraphicsLayerModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.a f94723p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.compose.ui.graphics.a aVar) {
        super(1);
        this.f94723p0 = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        GraphicsLayerScope graphicsLayerScope2 = graphicsLayerScope;
        Intrinsics.checkNotNullParameter(graphicsLayerScope2, "$this$null");
        androidx.compose.ui.graphics.a aVar = this.f94723p0;
        graphicsLayerScope2.setScaleX(aVar.H0);
        graphicsLayerScope2.setScaleY(aVar.I0);
        graphicsLayerScope2.setAlpha(aVar.J0);
        graphicsLayerScope2.setTranslationX(aVar.K0);
        graphicsLayerScope2.setTranslationY(aVar.L0);
        graphicsLayerScope2.setShadowElevation(aVar.M0);
        graphicsLayerScope2.setRotationX(aVar.N0);
        graphicsLayerScope2.setRotationY(aVar.O0);
        graphicsLayerScope2.setRotationZ(aVar.P0);
        graphicsLayerScope2.setCameraDistance(aVar.Q0);
        graphicsLayerScope2.mo2664setTransformOrigin__ExYCQ(aVar.R0);
        graphicsLayerScope2.setShape(aVar.S0);
        graphicsLayerScope2.setClip(aVar.T0);
        graphicsLayerScope2.setRenderEffect(aVar.U0);
        graphicsLayerScope2.mo2661setAmbientShadowColor8_81llA(aVar.V0);
        graphicsLayerScope2.mo2663setSpotShadowColor8_81llA(aVar.W0);
        graphicsLayerScope2.mo2662setCompositingStrategyaDBOjCE(aVar.X0);
        return Unit.INSTANCE;
    }
}
