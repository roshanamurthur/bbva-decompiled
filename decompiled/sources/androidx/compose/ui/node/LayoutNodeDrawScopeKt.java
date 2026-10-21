package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LayoutNodeDrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,127:1\n74#2:128\n72#2:129\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n*L\n114#1:128\n115#1:129\n*E\n"})
public final class LayoutNodeDrawScopeKt {
    public static final Modifier.Node access$nextDrawNode(DelegatableNode delegatableNode) {
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(4);
        int iM3725constructorimpl2 = NodeKind.m3725constructorimpl(2);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & iM3725constructorimpl) == 0) {
            return null;
        }
        while (child != null && (child.getKindSet() & iM3725constructorimpl2) == 0) {
            if ((child.getKindSet() & iM3725constructorimpl) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
