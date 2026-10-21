package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Placeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 8, 0})
public final class PlaceableKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f16653a = a.f16655p0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f16654b = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

    /* JADX INFO: compiled from: Placeable.kt */
    public static final class a extends Lambda implements Function1<GraphicsLayerScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f16655p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "$this$null");
            return Unit.INSTANCE;
        }
    }
}
