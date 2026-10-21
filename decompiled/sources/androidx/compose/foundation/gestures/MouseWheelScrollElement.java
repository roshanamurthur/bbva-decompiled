package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.g;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lu/g;", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class MouseWheelScrollElement extends ModifierNodeElement<g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final State<ScrollingLogic> f3797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ScrollConfig f3798c;

    public MouseWheelScrollElement(@NotNull State<ScrollingLogic> scrollingLogicState, @NotNull ScrollConfig mouseWheelScrollConfig) {
        Intrinsics.checkNotNullParameter(scrollingLogicState, "scrollingLogicState");
        Intrinsics.checkNotNullParameter(mouseWheelScrollConfig, "mouseWheelScrollConfig");
        this.f3797b = scrollingLogicState;
        this.f3798c = mouseWheelScrollConfig;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new g(this.f3797b, this.f3798c);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MouseWheelScrollElement)) {
            return false;
        }
        MouseWheelScrollElement mouseWheelScrollElement = (MouseWheelScrollElement) obj;
        return Intrinsics.areEqual(this.f3797b, mouseWheelScrollElement.f3797b) && Intrinsics.areEqual(this.f3798c, mouseWheelScrollElement.f3798c);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f3798c.hashCode() + (this.f3797b.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        g node2 = (g) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        State<ScrollingLogic> state = this.f3797b;
        Intrinsics.checkNotNullParameter(state, "<set-?>");
        node2.J0 = state;
        ScrollConfig scrollConfig = this.f3798c;
        Intrinsics.checkNotNullParameter(scrollConfig, "<set-?>");
        node2.K0 = scrollConfig;
    }
}
