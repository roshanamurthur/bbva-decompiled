package h1;

import androidx.collection.k;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.EmptyMap;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ModifierLocalModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    public static Object a(ModifierLocalModifierNode modifierLocalModifierNode, @NotNull ModifierLocal modifierLocal) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(modifierLocal, "<this>");
        if (!modifierLocalModifierNode.getNode().getIsAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(32);
        if (!modifierLocalModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent = modifierLocalModifierNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(modifierLocalModifierNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((k.a(layoutNodeRequireLayoutNode) & iM3725constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM3725constructorimpl) != 0) {
                        Modifier.Node nodeAccess$pop = parent;
                        MutableVector mutableVector = null;
                        while (nodeAccess$pop != 0) {
                            if (nodeAccess$pop instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode2 = (ModifierLocalModifierNode) nodeAccess$pop;
                                if (modifierLocalModifierNode2.getProvidedValues().contains$ui_release(modifierLocal)) {
                                    return modifierLocalModifierNode2.getProvidedValues().get$ui_release(modifierLocal);
                                }
                            } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                Modifier.Node delegate = ((DelegatingNode) nodeAccess$pop).getDelegate();
                                int i10 = 0;
                                nodeAccess$pop = nodeAccess$pop;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iM3725constructorimpl) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            nodeAccess$pop = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeAccess$pop != 0) {
                                                mutableVector.add(nodeAccess$pop);
                                                nodeAccess$pop = 0;
                                            }
                                            mutableVector.add(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    nodeAccess$pop = nodeAccess$pop;
                                }
                                if (i10 == 1) {
                                }
                            }
                            nodeAccess$pop = DelegatableNodeKt.access$pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail$ui_release();
        }
        return modifierLocal.getDefaultFactory$ui_release().invoke();
    }

    @NotNull
    public static ModifierLocalMap b(ModifierLocalModifierNode modifierLocalModifierNode) {
        return EmptyMap.INSTANCE;
    }

    public static void c(ModifierLocalModifierNode modifierLocalModifierNode, @NotNull ModifierLocal key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (modifierLocalModifierNode.getProvidedValues() == EmptyMap.INSTANCE) {
            throw new IllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap".toString());
        }
        if (modifierLocalModifierNode.getProvidedValues().contains$ui_release(key)) {
            modifierLocalModifierNode.getProvidedValues().mo3647set$ui_release(key, obj);
            return;
        }
        throw new IllegalArgumentException(("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + key + " was not found.").toString());
    }
}
