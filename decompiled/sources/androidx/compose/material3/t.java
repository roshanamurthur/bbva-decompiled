package androidx.compose.material3;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ float f13105p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Shape f13106q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(float f6, Shape shape) {
        super(1);
        this.f13105p0 = f6;
        this.f13106q0 = shape;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        GraphicsLayerScope graphicsLayer = graphicsLayerScope;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(this.f13105p0);
        graphicsLayer.setShape(this.f13106q0);
        graphicsLayer.setClip(true);
        return Unit.INSTANCE;
    }
}
