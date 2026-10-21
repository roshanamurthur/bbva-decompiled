package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LookaheadScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r¢\u0006\u0004\b\u0018\u0010\u0013J\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0016JD\u0010\f\u001a\u00020\u0004*\u00020\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005H\u0017R*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u00020\u0002*\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/layout/LookaheadScopeImpl;", "Landroidx/compose/ui/layout/LookaheadScope;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "toLookaheadCoordinates", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "Lkotlin/ParameterName;", "name", "lookaheadScopeCoordinates", "layoutCoordinates", "", "onPlaced", "Lkotlin/Function0;", "p0", "Lkotlin/jvm/functions/Function0;", "getScopeCoordinates", "()Lkotlin/jvm/functions/Function0;", "setScopeCoordinates", "(Lkotlin/jvm/functions/Function0;)V", "scopeCoordinates", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class LookaheadScopeImpl implements LookaheadScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<? extends LayoutCoordinates> scopeCoordinates;

    /* JADX INFO: compiled from: LookaheadScope.kt */
    public static final class a extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<LookaheadLayoutCoordinates, LookaheadLayoutCoordinates, Unit> f16613p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LookaheadScopeImpl f16614q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super LookaheadLayoutCoordinates, ? super LookaheadLayoutCoordinates, Unit> function2, LookaheadScopeImpl lookaheadScopeImpl) {
            super(1);
            this.f16613p0 = function2;
            this.f16614q0 = lookaheadScopeImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates coordinates = layoutCoordinates;
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            LookaheadScopeImpl lookaheadScopeImpl = this.f16614q0;
            Function0<LayoutCoordinates> scopeCoordinates = lookaheadScopeImpl.getScopeCoordinates();
            Intrinsics.checkNotNull(scopeCoordinates);
            LayoutCoordinates lookaheadCoordinates = lookaheadScopeImpl.toLookaheadCoordinates(scopeCoordinates.invoke());
            Intrinsics.checkNotNull(lookaheadCoordinates, "null cannot be cast to non-null type androidx.compose.ui.layout.LookaheadLayoutCoordinates");
            LayoutCoordinates lookaheadCoordinates2 = lookaheadScopeImpl.toLookaheadCoordinates(coordinates);
            Intrinsics.checkNotNull(lookaheadCoordinates2, "null cannot be cast to non-null type androidx.compose.ui.layout.LookaheadLayoutCoordinates");
            this.f16613p0.invoke((LookaheadLayoutCoordinates) lookaheadCoordinates, (LookaheadLayoutCoordinates) lookaheadCoordinates2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LookaheadScopeImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    @NotNull
    public LayoutCoordinates getLookaheadScopeCoordinates(@NotNull Placeable.PlacementScope placementScope) {
        Intrinsics.checkNotNullParameter(placementScope, "<this>");
        Function0<? extends LayoutCoordinates> function0 = this.scopeCoordinates;
        Intrinsics.checkNotNull(function0);
        return function0.invoke();
    }

    @Nullable
    public final Function0<LayoutCoordinates> getScopeCoordinates() {
        return this.scopeCoordinates;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public final /* synthetic */ Modifier intermediateLayout(Modifier modifier, Function4 function4) {
        return c.a(this, modifier, function4);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    /* JADX INFO: renamed from: localLookaheadPositionOf-dBAh8RU */
    public final /* synthetic */ long mo3578localLookaheadPositionOfdBAh8RU(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        return c.b(this, layoutCoordinates, layoutCoordinates2);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    @Deprecated(message = "onPlaced in LookaheadLayoutScope has been deprecated. It's replaced with reading LookaheadLayoutCoordinates directly during placement inIntermediateMeasureScope")
    @NotNull
    public Modifier onPlaced(@NotNull Modifier modifier, @NotNull Function2<? super LookaheadLayoutCoordinates, ? super LookaheadLayoutCoordinates, Unit> onPlaced) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onPlaced, "onPlaced");
        return OnPlacedModifierKt.onPlaced(modifier, new a(onPlaced, this));
    }

    public final void setScopeCoordinates(@Nullable Function0<? extends LayoutCoordinates> function0) {
        this.scopeCoordinates = function0;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    @NotNull
    public LayoutCoordinates toLookaheadCoordinates(@NotNull LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinates;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinatesImpl = layoutCoordinates instanceof LookaheadLayoutCoordinatesImpl ? (LookaheadLayoutCoordinatesImpl) layoutCoordinates : null;
        if (lookaheadLayoutCoordinatesImpl != null) {
            return lookaheadLayoutCoordinatesImpl;
        }
        NodeCoordinator nodeCoordinator = (NodeCoordinator) layoutCoordinates;
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        return (lookaheadDelegate == null || (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) ? nodeCoordinator : lookaheadLayoutCoordinates;
    }

    public LookaheadScopeImpl(@Nullable Function0<? extends LayoutCoordinates> function0) {
        this.scopeCoordinates = function0;
    }

    public /* synthetic */ LookaheadScopeImpl(Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function0);
    }
}
