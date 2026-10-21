package l0;

import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NavigationRail.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Placeable f82786p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Placeable f82787q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f82788r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f82789s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Placeable f82790t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f82791u0;
    public final /* synthetic */ int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f82792w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f82793x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(int i10, int i11, int i12, int i13, int i14, int i15, Placeable placeable, Placeable placeable2, Placeable placeable3) {
        super(1);
        this.f82786p0 = placeable;
        this.f82787q0 = placeable2;
        this.f82788r0 = i10;
        this.f82789s0 = i11;
        this.f82790t0 = placeable3;
        this.f82791u0 = i12;
        this.v0 = i13;
        this.f82792w0 = i14;
        this.f82793x0 = i15;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable placeable = this.f82786p0;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(layout, placeable, (this.f82792w0 - placeable.getWidth()) / 2, (this.f82793x0 - placeable.getHeight()) / 2, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(layout, this.f82787q0, this.f82788r0, this.f82789s0, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, this.f82790t0, this.f82791u0, this.v0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
