package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyStaggeredGridItemScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/AnimateItemPlacementElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "La0/a;", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class AnimateItemPlacementElement extends ModifierNodeElement<a0.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FiniteAnimationSpec<IntOffset> f5114b;

    public AnimateItemPlacementElement(@NotNull FiniteAnimationSpec<IntOffset> animationSpec) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.f5114b = animationSpec;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new a0.a(this.f5114b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimateItemPlacementElement)) {
            return false;
        }
        return !Intrinsics.areEqual(this.f5114b, ((AnimateItemPlacementElement) obj).f5114b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f5114b.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("animateItemPlacement");
        inspectorInfo.setValue(this.f5114b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        a0.a node2 = (a0.a) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.J0.setPlacementAnimationSpec(this.f5114b);
    }
}
