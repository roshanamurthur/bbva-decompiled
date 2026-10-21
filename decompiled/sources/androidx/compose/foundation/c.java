package androidx.compose.foundation;

import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidOverscroll.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Placeable f3488p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f3489q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10, Placeable placeable) {
        super(1);
        this.f3488p0 = placeable;
        this.f3489q0 = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable placeable = this.f3488p0;
        int i10 = this.f3489q0 / 2;
        Placeable.PlacementScope.place$default(layout, placeable, i10, i10, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
