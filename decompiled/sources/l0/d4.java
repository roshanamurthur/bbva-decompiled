package l0;

import androidx.compose.material3.SwipeableV2Kt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntSize;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SwipeableV2.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
public final class d4 extends InspectorValueInfo implements LayoutModifier, OnRemeasuredModifier {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<Density, Unit> f82493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function1<IntSize, Unit> f82494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f82495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f82496f;

    /* JADX INFO: compiled from: SwipeableV2.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82497p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable) {
            super(1);
            this.f82497p0 = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.place$default(layout, this.f82497p0, 0, 0, 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(@NotNull SwipeableV2Kt.e onDensityChanged, @NotNull SwipeableV2Kt.f onSizeChanged, @NotNull Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(onDensityChanged, "onDensityChanged");
        Intrinsics.checkNotNullParameter(onSizeChanged, "onSizeChanged");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f82493c = onDensityChanged;
        this.f82494d = onSizeChanged;
        this.f82495e = -1.0f;
        this.f82496f = -1.0f;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return u0.f.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return u0.f.b(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return u0.f.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return u0.f.d(this, obj, function2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return g1.e.a(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return g1.e.b(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo47measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (measure.getDensity() != this.f82495e || measure.getFontScale() != this.f82496f) {
            this.f82493c.invoke(DensityKt.Density(measure.getDensity(), measure.getFontScale()));
            this.f82495e = measure.getDensity();
            this.f82496f = measure.getFontScale();
        }
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(j10);
        return MeasureScope.CC.q(measure, placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight(), null, new a(placeableMo3575measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return g1.e.c(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return g1.e.d(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.OnRemeasuredModifier
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public final void mo176onRemeasuredozmzZPI(long j10) {
        this.f82494d.invoke(IntSize.m4541boximpl(j10));
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return u0.e.a(this, modifier);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SwipeAnchorsModifierImpl(updateDensity=");
        sb2.append(this.f82493c);
        sb2.append(", onSizeChanged=");
        return ci.a.c(sb2, this.f82494d, RootService.CLOSE_BRACKET);
    }
}
