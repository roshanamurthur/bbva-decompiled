package h0;

import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: BottomNavigation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Placeable f68920p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f68921q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i10, Placeable placeable) {
        super(1);
        this.f68920p0 = placeable;
        this.f68921q0 = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, this.f68920p0, 0, this.f68921q0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
