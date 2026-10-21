package androidx.compose.foundation.relocation;

import androidx.activity.a;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import c0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BringIntoViewResponder.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponderElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lc0/c;", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class BringIntoViewResponderElement extends ModifierNodeElement<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BringIntoViewResponder f5580b;

    public BringIntoViewResponderElement(@NotNull BringIntoViewResponder responder) {
        Intrinsics.checkNotNullParameter(responder, "responder");
        this.f5580b = responder;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new c(this.f5580b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewResponderElement) {
                if (Intrinsics.areEqual(this.f5580b, ((BringIntoViewResponderElement) obj).f5580b)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f5580b.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        a.c(inspectorInfo, "<this>", "bringIntoViewResponder").set("responder", this.f5580b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        c node2 = (c) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        BringIntoViewResponder bringIntoViewResponder = this.f5580b;
        Intrinsics.checkNotNullParameter(bringIntoViewResponder, "<set-?>");
        node2.J0 = bringIntoViewResponder;
    }
}
