package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

/* JADX INFO: compiled from: FocusedBounds.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lt/z;", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class FocusedBoundsObserverElement extends ModifierNodeElement<z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<LayoutCoordinates, Unit> f3375b;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusedBoundsObserverElement(@NotNull Function1<? super LayoutCoordinates, Unit> onPositioned) {
        Intrinsics.checkNotNullParameter(onPositioned, "onPositioned");
        this.f3375b = onPositioned;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new z(this.f3375b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        FocusedBoundsObserverElement focusedBoundsObserverElement = obj instanceof FocusedBoundsObserverElement ? (FocusedBoundsObserverElement) obj : null;
        if (focusedBoundsObserverElement == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f3375b, focusedBoundsObserverElement.f3375b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f3375b.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", "onFocusedBoundsChanged").set("onPositioned", this.f3375b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        z node2 = (z) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        Function1<LayoutCoordinates, Unit> function1 = this.f3375b;
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        node2.H0 = function1;
    }
}
