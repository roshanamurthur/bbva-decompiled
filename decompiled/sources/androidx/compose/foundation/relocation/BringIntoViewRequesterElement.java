package androidx.compose.foundation.relocation;

import androidx.activity.a;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BringIntoViewRequester.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class BringIntoViewRequesterElement extends ModifierNodeElement<BringIntoViewRequesterNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BringIntoViewRequester f5577b;

    public BringIntoViewRequesterElement(@NotNull BringIntoViewRequester requester) {
        Intrinsics.checkNotNullParameter(requester, "requester");
        this.f5577b = requester;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new BringIntoViewRequesterNode(this.f5577b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewRequesterElement) {
                if (Intrinsics.areEqual(this.f5577b, ((BringIntoViewRequesterElement) obj).f5577b)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f5577b.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        a.c(inspectorInfo, "<this>", "bringIntoViewRequester").set("bringIntoViewRequester", this.f5577b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        BringIntoViewRequesterNode node2 = (BringIntoViewRequesterNode) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.updateRequester(this.f5577b);
    }
}
