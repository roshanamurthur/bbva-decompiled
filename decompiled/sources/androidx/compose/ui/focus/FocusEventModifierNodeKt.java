package androidx.compose.ui.focus;

import androidx.collection.k;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FocusEventModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"getFocusState", "Landroidx/compose/ui/focus/FocusState;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "invalidateFocusEvent", "", "refreshFocusEventNodes", "Landroidx/compose/ui/focus/FocusTargetNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFocusEventModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,71:1\n90#2:72\n94#2:182\n90#2:183\n282#3:73\n383#3,6:74\n393#3,2:81\n395#3,8:86\n403#3,9:97\n412#3,8:109\n283#3:117\n133#3:118\n134#3,8:120\n142#3,9:129\n383#3,37:138\n151#3,6:175\n284#3:181\n241#3,2:184\n58#3:186\n59#3,8:188\n243#3:196\n244#3,2:198\n383#3,12:200\n395#3,8:215\n403#3,9:226\n412#3,8:238\n247#3:246\n68#3,7:247\n248#3:254\n261#4:80\n261#4:197\n234#5,3:83\n237#5,3:106\n234#5,3:212\n237#5,3:235\n1182#6:94\n1161#6,2:95\n1182#6:223\n1161#6,2:224\n1#7:119\n1#7:187\n48#8:128\n*S KotlinDebug\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n*L\n47#1:72\n66#1:182\n66#1:183\n47#1:73\n47#1:74,6\n47#1:81,2\n47#1:86,8\n47#1:97,9\n47#1:109,8\n47#1:117\n47#1:118\n47#1:120,8\n47#1:129,9\n47#1:138,37\n47#1:175,6\n47#1:181\n66#1:184,2\n66#1:186\n66#1:188,8\n66#1:196\n66#1:198,2\n66#1:200,12\n66#1:215,8\n66#1:226,9\n66#1:238,8\n66#1:246\n66#1:247,7\n66#1:254\n47#1:80\n66#1:197\n47#1:83,3\n47#1:106,3\n66#1:212,3\n66#1:235,3\n47#1:94\n47#1:95,2\n66#1:223\n66#1:224,2\n47#1:119\n66#1:187\n47#1:128\n*E\n"})
public final class FocusEventModifierNodeKt {

    /* JADX INFO: compiled from: FocusEventModifierNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final FocusState getFocusState(@NotNull FocusEventModifierNode focusEventModifierNode) {
        Intrinsics.checkNotNullParameter(focusEventModifierNode, "<this>");
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
        Modifier.Node node = focusEventModifierNode.getNode();
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof FocusTargetNode) {
                FocusStateImpl focusState = ((FocusTargetNode) node).getFocusState();
                int i10 = WhenMappings.$EnumSwitchMapping$0[focusState.ordinal()];
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return focusState;
                }
            } else if ((node.getKindSet() & iM3725constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                int i11 = 0;
                for (Modifier.Node delegate = ((DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & iM3725constructorimpl) != 0) {
                        i11++;
                        if (i11 == 1) {
                            node = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                mutableVector.add(node);
                                node = null;
                            }
                            mutableVector.add(delegate);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            node = DelegatableNodeKt.access$pop(mutableVector);
        }
        if (!focusEventModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusEventModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector2, focusEventModifierNode.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node nodeAccess$pop = (Modifier.Node) androidx.constraintlayout.core.parser.a.a(mutableVector2, 1);
            if ((nodeAccess$pop.getAggregateChildKindSet() & iM3725constructorimpl) == 0) {
                DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector2, nodeAccess$pop);
            } else {
                while (nodeAccess$pop != null) {
                    if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodeAccess$pop != null) {
                            if (nodeAccess$pop instanceof FocusTargetNode) {
                                FocusStateImpl focusState2 = ((FocusTargetNode) nodeAccess$pop).getFocusState();
                                int i12 = WhenMappings.$EnumSwitchMapping$0[focusState2.ordinal()];
                                if (i12 == 1 || i12 == 2 || i12 == 3) {
                                    return focusState2;
                                }
                            } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                int i13 = 0;
                                for (Modifier.Node delegate2 = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & iM3725constructorimpl) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            nodeAccess$pop = delegate2;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeAccess$pop != null) {
                                                mutableVector3.add(nodeAccess$pop);
                                                nodeAccess$pop = null;
                                            }
                                            mutableVector3.add(delegate2);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            nodeAccess$pop = DelegatableNodeKt.access$pop(mutableVector3);
                        }
                        break;
                    }
                    nodeAccess$pop = nodeAccess$pop.getChild();
                }
            }
        }
        return FocusStateImpl.Inactive;
    }

    public static final void invalidateFocusEvent(@NotNull FocusEventModifierNode focusEventModifierNode) {
        Intrinsics.checkNotNullParameter(focusEventModifierNode, "<this>");
        DelegatableNodeKt.requireOwner(focusEventModifierNode).getFocusOwner().scheduleInvalidation(focusEventModifierNode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    public static final void refreshFocusEventNodes(@NotNull FocusTargetNode focusTargetNode) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(4096);
        int iM3725constructorimpl2 = NodeKind.m3725constructorimpl(1024);
        Modifier.Node node = focusTargetNode.getNode();
        int i10 = iM3725constructorimpl | iM3725constructorimpl2;
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node2 = focusTargetNode.getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((k.a(layoutNodeRequireLayoutNode) & i10) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i10) != 0) {
                        if (node2 != node && (node2.getKindSet() & iM3725constructorimpl2) != 0) {
                            return;
                        }
                        if ((node2.getKindSet() & iM3725constructorimpl) != 0) {
                            Modifier.Node nodeAccess$pop = node2;
                            MutableVector mutableVector = null;
                            while (nodeAccess$pop != 0) {
                                if (nodeAccess$pop instanceof FocusEventModifierNode) {
                                    FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) nodeAccess$pop;
                                    focusEventModifierNode.onFocusEvent(getFocusState(focusEventModifierNode));
                                } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                    Modifier.Node delegate = ((DelegatingNode) nodeAccess$pop).getDelegate();
                                    int i11 = 0;
                                    nodeAccess$pop = nodeAccess$pop;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iM3725constructorimpl) != 0) {
                                            i11++;
                                            if (i11 == 1) {
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
                                    if (i11 == 1) {
                                    }
                                }
                                nodeAccess$pop = DelegatableNodeKt.access$pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail$ui_release();
        }
    }
}
