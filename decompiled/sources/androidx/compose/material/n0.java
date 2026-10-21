package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DrawerState f8839p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Density f8840q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ float f8841r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(DrawerState drawerState, Density density, float f6) {
        super(0);
        this.f8839p0 = drawerState;
        this.f8840q0 = density;
        this.f8841r0 = f6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Density density = this.f8840q0;
        DrawerState drawerState = this.f8839p0;
        drawerState.setDensity$material_release(density);
        AnchoredDraggableState.updateAnchors$material_release$default(drawerState.getAnchoredDraggableState$material_release(), bk.q.mapOf(TuplesKt.to(DrawerValue.Closed, Float.valueOf(this.f8841r0)), TuplesKt.to(DrawerValue.Open, Float.valueOf(0.0f))), null, 2, null);
        return Unit.INSTANCE;
    }
}
