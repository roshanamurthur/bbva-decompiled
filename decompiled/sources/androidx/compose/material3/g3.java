package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SearchBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g3 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ State<Float> f12856p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(State<Float> state) {
        super(1);
        this.f12856p0 = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        GraphicsLayerScope graphicsLayer = graphicsLayerScope;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(this.f12856p0.getValue().floatValue());
        return Unit.INSTANCE;
    }
}
