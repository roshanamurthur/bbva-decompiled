package androidx.compose.foundation;

import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidOverscroll.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Placeable f3486p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f3487q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, Placeable placeable) {
        super(1);
        this.f3486p0 = placeable;
        this.f3487q0 = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        int i10 = (-this.f3487q0) / 2;
        Placeable placeable = this.f3486p0;
        Placeable.PlacementScope.placeWithLayer$default(layout, placeable, i10 - ((placeable.getWidth() - placeable.getMeasuredWidth()) / 2), i10 - ((placeable.getHeight() - placeable.getMeasuredHeight()) / 2), 0.0f, null, 12, null);
        return Unit.INSTANCE;
    }
}
