package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Crossfade.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ State<Float> f3234p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(State<Float> state) {
        super(1);
        this.f3234p0 = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        GraphicsLayerScope graphicsLayer = graphicsLayerScope;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(this.f3234p0.getValue().floatValue());
        return Unit.INSTANCE;
    }
}
