package androidx.compose.material;

import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends Lambda implements Function1<IntSize, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ BottomDrawerState f8488p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState.AnchorChangedCallback<BottomDrawerValue> f8489q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ float f8490r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ boolean f8491s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(BottomDrawerState bottomDrawerState, AnchoredDraggableState.AnchorChangedCallback<BottomDrawerValue> anchorChangedCallback, float f6, boolean z10) {
        super(1);
        this.f8488p0 = bottomDrawerState;
        this.f8489q0 = anchorChangedCallback;
        this.f8490r0 = f6;
        this.f8491s0 = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IntSize intSize) {
        float fM4548getHeightimpl = IntSize.m4548getHeightimpl(intSize.getF18319a());
        Map mapCreateMapBuilder = bk.p.createMapBuilder();
        BottomDrawerValue bottomDrawerValue = BottomDrawerValue.Closed;
        float f6 = this.f8490r0;
        mapCreateMapBuilder.put(bottomDrawerValue, Float.valueOf(f6));
        float f10 = 0.5f * f6;
        if (fM4548getHeightimpl > f10 || this.f8491s0) {
            mapCreateMapBuilder.put(BottomDrawerValue.Open, Float.valueOf(f10));
        }
        if (fM4548getHeightimpl > 0.0f) {
            mapCreateMapBuilder.put(BottomDrawerValue.Expanded, Float.valueOf(Math.max(0.0f, f6 - fM4548getHeightimpl)));
        }
        this.f8488p0.getAnchoredDraggableState$material_release().updateAnchors$material_release(bk.p.build(mapCreateMapBuilder), this.f8489q0);
        return Unit.INSTANCE;
    }
}
