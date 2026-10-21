package x;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ AlignmentLine f94305p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ float f94306q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f94307r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f94308s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f94309t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Placeable f94310u0;
    public final /* synthetic */ int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AlignmentLine alignmentLine, float f6, int i10, int i11, int i12, Placeable placeable, int i13) {
        super(1);
        this.f94305p0 = alignmentLine;
        this.f94306q0 = f6;
        this.f94307r0 = i10;
        this.f94308s0 = i11;
        this.f94309t0 = i12;
        this.f94310u0 = placeable;
        this.v0 = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        int width;
        int height;
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        AlignmentLine alignmentLine = this.f94305p0;
        boolean zAccess$getHorizontal = AlignmentLineKt.access$getHorizontal(alignmentLine);
        Placeable placeable = this.f94310u0;
        int i10 = this.f94309t0;
        int i11 = this.f94307r0;
        float f6 = this.f94306q0;
        if (zAccess$getHorizontal) {
            width = 0;
        } else {
            width = !Dp.m4394equalsimpl0(f6, Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM()) ? i11 : (this.f94308s0 - i10) - placeable.getWidth();
        }
        if (AlignmentLineKt.access$getHorizontal(alignmentLine)) {
            height = !Dp.m4394equalsimpl0(f6, Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM()) ? i11 : (this.v0 - i10) - placeable.getHeight();
        } else {
            height = 0;
        }
        Placeable.PlacementScope.placeRelative$default(layout, this.f94310u0, width, height, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
