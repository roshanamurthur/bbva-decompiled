package h0;

import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NavigationRail.kt */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ float f69239p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Placeable f69240q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f69241r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f69242s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f69243t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Placeable f69244u0;
    public final /* synthetic */ int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f69245w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(float f6, Placeable placeable, int i10, int i11, int i12, Placeable placeable2, int i13, int i14) {
        super(1);
        this.f69239p0 = f6;
        this.f69240q0 = placeable;
        this.f69241r0 = i10;
        this.f69242s0 = i11;
        this.f69243t0 = i12;
        this.f69244u0 = placeable2;
        this.v0 = i13;
        this.f69245w0 = i14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        float f6 = this.f69239p0;
        int i10 = this.f69243t0;
        if (f6 != 0.0f) {
            Placeable.PlacementScope.placeRelative$default(layout, this.f69240q0, this.f69241r0, this.f69242s0 + i10, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(layout, this.f69244u0, this.v0, this.f69245w0 + i10, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
