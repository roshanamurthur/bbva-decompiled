package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.b0;

/* JADX INFO: compiled from: Hoverable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/HoverableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lt/b0;", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class HoverableElement extends ModifierNodeElement<b0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableInteractionSource f3376b;

    public HoverableElement(@NotNull MutableInteractionSource interactionSource) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        this.f3376b = interactionSource;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        MutableInteractionSource interactionSource = this.f3376b;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        b0 b0Var = new b0();
        b0Var.H0 = interactionSource;
        return b0Var;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && Intrinsics.areEqual(((HoverableElement) obj).f3376b, this.f3376b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f3376b.hashCode() * 31;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", "hoverable").set("interactionSource", this.f3376b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        b0 node2 = (b0) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        MutableInteractionSource interactionSource = this.f3376b;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        if (Intrinsics.areEqual(node2.H0, interactionSource)) {
            return;
        }
        node2.c();
        node2.H0 = interactionSource;
    }
}
