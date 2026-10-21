package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

/* JADX INFO: compiled from: NodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 8, 0})
public final class NodeCoordinatorKt {
    /* JADX INFO: renamed from: access$nextUntil-hw7D004, reason: not valid java name */
    public static final Modifier.Node m3723access$nextUntilhw7D004(DelegatableNode delegatableNode, int i10, int i11) {
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & i10) == 0) {
            return null;
        }
        while (child != null) {
            int kindSet = child.getKindSet();
            if ((kindSet & i11) != 0) {
                return null;
            }
            if ((kindSet & i10) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
