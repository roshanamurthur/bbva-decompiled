package l0;

import androidx.compose.material3.NavigationRailKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NavigationRail.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ Placeable E0;
    public final /* synthetic */ int F0;
    public final /* synthetic */ int G0;
    public final /* synthetic */ int H0;
    public final /* synthetic */ MeasureScope I0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Placeable f82813p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f82814q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ float f82815r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Placeable f82816s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f82817t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f82818u0;
    public final /* synthetic */ int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Placeable f82819w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f82820x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ int f82821y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(Placeable placeable, boolean z10, float f6, Placeable placeable2, int i10, int i11, int i12, Placeable placeable3, int i13, int i14, Placeable placeable4, int i15, int i16, int i17, MeasureScope measureScope) {
        super(1);
        this.f82813p0 = placeable;
        this.f82814q0 = z10;
        this.f82815r0 = f6;
        this.f82816s0 = placeable2;
        this.f82817t0 = i10;
        this.f82818u0 = i11;
        this.v0 = i12;
        this.f82819w0 = placeable3;
        this.f82820x0 = i13;
        this.f82821y0 = i14;
        this.E0 = placeable4;
        this.F0 = i15;
        this.G0 = i16;
        this.H0 = i17;
        this.I0 = measureScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        int i10 = this.f82821y0;
        int i11 = this.v0;
        Placeable placeable = this.f82813p0;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(layout, placeable, (this.H0 - placeable.getWidth()) / 2, (i10 - this.I0.mo413roundToPx0680j_4(NavigationRailKt.f10880g)) + i11, 0.0f, 4, null);
        }
        if (this.f82814q0 || this.f82815r0 != 0.0f) {
            Placeable.PlacementScope.placeRelative$default(layout, this.f82816s0, this.f82817t0, this.f82818u0 + i11, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(layout, this.f82819w0, this.f82820x0, i10 + i11, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, this.E0, this.F0, this.G0 + i11, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
