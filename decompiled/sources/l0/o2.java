package l0;

import androidx.compose.material3.NavigationBarKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NavigationBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ Placeable E0;
    public final /* synthetic */ int F0;
    public final /* synthetic */ int G0;
    public final /* synthetic */ int H0;
    public final /* synthetic */ MeasureScope I0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Placeable f82752p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f82753q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ float f82754r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Placeable f82755s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f82756t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f82757u0;
    public final /* synthetic */ int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Placeable f82758w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f82759x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ int f82760y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(Placeable placeable, boolean z10, float f6, Placeable placeable2, int i10, int i11, int i12, Placeable placeable3, int i13, int i14, Placeable placeable4, int i15, int i16, int i17, MeasureScope measureScope) {
        super(1);
        this.f82752p0 = placeable;
        this.f82753q0 = z10;
        this.f82754r0 = f6;
        this.f82755s0 = placeable2;
        this.f82756t0 = i10;
        this.f82757u0 = i11;
        this.v0 = i12;
        this.f82758w0 = placeable3;
        this.f82759x0 = i13;
        this.f82760y0 = i14;
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
        int i10 = this.f82760y0;
        int i11 = this.v0;
        Placeable placeable = this.f82752p0;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(layout, placeable, (this.H0 - placeable.getWidth()) / 2, (i10 - this.I0.mo413roundToPx0680j_4(NavigationBarKt.f10714e)) + i11, 0.0f, 4, null);
        }
        if (this.f82753q0 || this.f82754r0 != 0.0f) {
            Placeable.PlacementScope.placeRelative$default(layout, this.f82755s0, this.f82756t0, this.f82757u0 + i11, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(layout, this.f82758w0, this.f82759x0, i10 + i11, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, this.E0, this.F0, this.G0 + i11, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
