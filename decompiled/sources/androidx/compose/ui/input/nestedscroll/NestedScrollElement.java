package androidx.compose.ui.input.nestedscroll;

import androidx.activity.a;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NestedScrollModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "ui_release"}, k = 1, mv = {1, 8, 0})
final class NestedScrollElement extends ModifierNodeElement<NestedScrollNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NestedScrollConnection f16329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final NestedScrollDispatcher f16330c;

    public NestedScrollElement(@NotNull NestedScrollConnection connection, @Nullable NestedScrollDispatcher nestedScrollDispatcher) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f16329b = connection;
        this.f16330c = nestedScrollDispatcher;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new NestedScrollNode(this.f16329b, this.f16330c);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return Intrinsics.areEqual(nestedScrollElement.f16329b, this.f16329b) && Intrinsics.areEqual(nestedScrollElement.f16330c, this.f16330c);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = this.f16329b.hashCode() * 31;
        NestedScrollDispatcher nestedScrollDispatcher = this.f16330c;
        return iHashCode + (nestedScrollDispatcher != null ? nestedScrollDispatcher.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        a.c(inspectorInfo, "<this>", "nestedScroll").set("connection", this.f16329b);
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("dispatcher", this.f16330c);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        NestedScrollNode node2 = (NestedScrollNode) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.updateNode$ui_release(this.f16329b, this.f16330c);
    }
}
