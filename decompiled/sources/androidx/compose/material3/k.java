package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Placeable f12952p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f12953q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Placeable f12954r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Placeable f12955s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f12956t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f12957u0;
    public final /* synthetic */ Placeable v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f12958w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f12959x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Placeable placeable, int i10, Placeable placeable2, Placeable placeable3, int i11, int i12, Placeable placeable4, int i13, int i14) {
        super(1);
        this.f12952p0 = placeable;
        this.f12953q0 = i10;
        this.f12954r0 = placeable2;
        this.f12955s0 = placeable3;
        this.f12956t0 = i11;
        this.f12957u0 = i12;
        this.v0 = placeable4;
        this.f12958w0 = i13;
        this.f12959x0 = i14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, this.f12952p0, 0, this.f12953q0, 0.0f, 4, null);
        Placeable placeable = this.f12954r0;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(layout, placeable, 0, 0, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(layout, this.f12955s0, this.f12956t0, this.f12957u0, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, this.v0, this.f12958w0, this.f12959x0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
