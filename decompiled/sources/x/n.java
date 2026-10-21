package x;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowInsetsSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@SourceDebugExtension({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedWidthModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,213:1\n81#2:214\n107#2,2:215\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedWidthModifier\n*L\n135#1:214\n135#1:215,2\n*E\n"})
public final class n extends InspectorValueInfo implements LayoutModifier, ModifierLocalConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final WindowInsets f94373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function3<WindowInsets, LayoutDirection, Density, Integer> f94374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableState f94375e;

    /* JADX INFO: compiled from: WindowInsetsSize.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f94376p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsSize.kt */
    public static final class b extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f94377p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Placeable placeable) {
            super(1);
            this.f94377p0 = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.f94377p0, 0, 0, 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(@NotNull WindowInsets insets, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @NotNull Function3<? super WindowInsets, ? super LayoutDirection, ? super Density, Integer> widthCalc) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(widthCalc, "widthCalc");
        this.f94373c = insets;
        this.f94374d = widthCalc;
        this.f94375e = SnapshotStateKt.mutableStateOf$default(insets, null, 2, null);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return u0.f.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return u0.f.b(this, function1);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f94373c, nVar.f94373c) && Intrinsics.areEqual(this.f94374d, nVar.f94374d);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return u0.f.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return u0.f.d(this, obj, function2);
    }

    public final int hashCode() {
        return this.f94374d.hashCode() + (this.f94373c.hashCode() * 31);
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
        int iIntValue = this.f94374d.invoke((WindowInsets) this.f94375e.getValue(), measure.getLayoutDirection(), measure).intValue();
        if (iIntValue == 0) {
            return MeasureScope.CC.q(measure, 0, 0, null, a.f94376p0, 4, null);
        }
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, iIntValue, iIntValue, 0, 0, 12, null));
        return MeasureScope.CC.q(measure, iIntValue, placeableMo3575measureBRTryo0.getHeight(), null, new b(placeableMo3575measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return g1.e.c(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return g1.e.d(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f94375e.setValue(WindowInsetsKt.exclude(this.f94373c, (WindowInsets) scope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets())));
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return u0.e.a(this, modifier);
    }
}
