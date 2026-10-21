package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FocusRequesterModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0005"}, d2 = {"captureFocus", "", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "freeFocus", "requestFocus", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFocusRequesterModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifierNode.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,97:1\n90#2:98\n90#2:208\n90#2:318\n282#3:99\n383#3,6:100\n393#3,2:107\n395#3,8:112\n403#3,9:123\n412#3,8:135\n283#3:143\n133#3:144\n134#3,8:146\n142#3,9:155\n383#3,37:164\n151#3,6:201\n284#3:207\n282#3:209\n383#3,6:210\n393#3,2:217\n395#3,8:222\n403#3,9:233\n412#3,8:245\n283#3:253\n133#3:254\n134#3,8:256\n142#3,9:265\n383#3,37:274\n151#3,6:311\n284#3:317\n282#3:319\n383#3,6:320\n393#3,2:327\n395#3,8:332\n403#3,9:343\n412#3,8:355\n283#3:363\n133#3:364\n134#3,8:366\n142#3,9:375\n383#3,37:384\n151#3,6:421\n284#3:427\n261#4:106\n261#4:216\n261#4:326\n234#5,3:109\n237#5,3:132\n234#5,3:219\n237#5,3:242\n234#5,3:329\n237#5,3:352\n1182#6:120\n1161#6,2:121\n1182#6:230\n1161#6,2:231\n1182#6:340\n1161#6,2:341\n1#7:145\n1#7:255\n1#7:365\n48#8:154\n48#8:264\n48#8:374\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifierNode.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeKt\n*L\n40#1:98\n69#1:208\n92#1:318\n40#1:99\n40#1:100,6\n40#1:107,2\n40#1:112,8\n40#1:123,9\n40#1:135,8\n40#1:143\n40#1:144\n40#1:146,8\n40#1:155,9\n40#1:164,37\n40#1:201,6\n40#1:207\n69#1:209\n69#1:210,6\n69#1:217,2\n69#1:222,8\n69#1:233,9\n69#1:245,8\n69#1:253\n69#1:254\n69#1:256,8\n69#1:265,9\n69#1:274,37\n69#1:311,6\n69#1:317\n92#1:319\n92#1:320,6\n92#1:327,2\n92#1:332,8\n92#1:343,9\n92#1:355,8\n92#1:363\n92#1:364\n92#1:366,8\n92#1:375,9\n92#1:384,37\n92#1:421,6\n92#1:427\n40#1:106\n69#1:216\n92#1:326\n40#1:109,3\n40#1:132,3\n69#1:219,3\n69#1:242,3\n92#1:329,3\n92#1:352,3\n40#1:120\n40#1:121,2\n69#1:230\n69#1:231,2\n92#1:340\n92#1:341,2\n40#1:145\n69#1:255\n92#1:365\n40#1:154\n69#1:264\n92#1:374\n*E\n"})
public final class FocusRequesterModifierNodeKt {

    /* JADX INFO: compiled from: FocusRequesterModifierNode.kt */
    public static final class a extends Lambda implements Function1<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f15511p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            FocusTargetNode it = focusTargetNode;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(FocusTransactionsKt.requestFocus(it));
        }
    }

    public static final boolean captureFocus(@NotNull FocusRequesterModifierNode focusRequesterModifierNode) {
        Intrinsics.checkNotNullParameter(focusRequesterModifierNode, "<this>");
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
        Modifier.Node node = focusRequesterModifierNode.getNode();
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof FocusTargetNode) {
                if (FocusTransactionsKt.captureFocus((FocusTargetNode) node)) {
                    return true;
                }
            } else if ((node.getKindSet() & iM3725constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                int i10 = 0;
                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                    if ((delegate$ui_release.getKindSet() & iM3725constructorimpl) != 0) {
                        i10++;
                        if (i10 == 1) {
                            node = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                mutableVector.add(node);
                                node = null;
                            }
                            mutableVector.add(delegate$ui_release);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            node = DelegatableNodeKt.access$pop(mutableVector);
        }
        if (!focusRequesterModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusRequesterModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode.getNode());
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
                                if (FocusTransactionsKt.captureFocus((FocusTargetNode) nodeAccess$pop)) {
                                    return true;
                                }
                            } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild()) {
                                    if ((delegate$ui_release2.getKindSet() & iM3725constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            nodeAccess$pop = delegate$ui_release2;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeAccess$pop != null) {
                                                mutableVector3.add(nodeAccess$pop);
                                                nodeAccess$pop = null;
                                            }
                                            mutableVector3.add(delegate$ui_release2);
                                        }
                                    }
                                }
                                if (i11 == 1) {
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
        return false;
    }

    public static final boolean freeFocus(@NotNull FocusRequesterModifierNode focusRequesterModifierNode) {
        Intrinsics.checkNotNullParameter(focusRequesterModifierNode, "<this>");
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
        Modifier.Node node = focusRequesterModifierNode.getNode();
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof FocusTargetNode) {
                if (FocusTransactionsKt.freeFocus((FocusTargetNode) node)) {
                    return true;
                }
            } else if ((node.getKindSet() & iM3725constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                int i10 = 0;
                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                    if ((delegate$ui_release.getKindSet() & iM3725constructorimpl) != 0) {
                        i10++;
                        if (i10 == 1) {
                            node = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                mutableVector.add(node);
                                node = null;
                            }
                            mutableVector.add(delegate$ui_release);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            node = DelegatableNodeKt.access$pop(mutableVector);
        }
        if (!focusRequesterModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusRequesterModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode.getNode());
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
                                if (FocusTransactionsKt.freeFocus((FocusTargetNode) nodeAccess$pop)) {
                                    return true;
                                }
                            } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild()) {
                                    if ((delegate$ui_release2.getKindSet() & iM3725constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            nodeAccess$pop = delegate$ui_release2;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeAccess$pop != null) {
                                                mutableVector3.add(nodeAccess$pop);
                                                nodeAccess$pop = null;
                                            }
                                            mutableVector3.add(delegate$ui_release2);
                                        }
                                    }
                                }
                                if (i11 == 1) {
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
        return false;
    }

    public static final boolean requestFocus(@NotNull FocusRequesterModifierNode focusRequesterModifierNode) {
        Intrinsics.checkNotNullParameter(focusRequesterModifierNode, "<this>");
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
        Modifier.Node node = focusRequesterModifierNode.getNode();
        MutableVector mutableVector = null;
        while (true) {
            a aVar = a.f15511p0;
            if (node == null) {
                if (!focusRequesterModifierNode.getNode().getIsAttached()) {
                    throw new IllegalStateException("visitChildren called on an unattached node".toString());
                }
                MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                Modifier.Node child = focusRequesterModifierNode.getNode().getChild();
                if (child == null) {
                    DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode.getNode());
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
                                        FocusTargetNode focusTargetNode = (FocusTargetNode) nodeAccess$pop;
                                        return focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() ? FocusTransactionsKt.requestFocus(focusTargetNode) : TwoDimensionalFocusSearchKt.m2239findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, FocusDirection.INSTANCE.m2218getEnterdhqQ8s(), aVar);
                                    }
                                    if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                        int i10 = 0;
                                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                                            if ((delegate$ui_release.getKindSet() & iM3725constructorimpl) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    nodeAccess$pop = delegate$ui_release;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodeAccess$pop != null) {
                                                        mutableVector3.add(nodeAccess$pop);
                                                        nodeAccess$pop = null;
                                                    }
                                                    mutableVector3.add(delegate$ui_release);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
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
                return false;
            }
            if (node instanceof FocusTargetNode) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                return focusTargetNode2.fetchFocusProperties$ui_release().getCanFocus() ? FocusTransactionsKt.requestFocus(focusTargetNode2) : TwoDimensionalFocusSearchKt.m2239findChildCorrespondingToFocusEnterOMvw8(focusTargetNode2, FocusDirection.INSTANCE.m2218getEnterdhqQ8s(), aVar);
            }
            if ((node.getKindSet() & iM3725constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                int i11 = 0;
                for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node).getDelegate(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild()) {
                    if ((delegate$ui_release2.getKindSet() & iM3725constructorimpl) != 0) {
                        i11++;
                        if (i11 == 1) {
                            node = delegate$ui_release2;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                mutableVector.add(node);
                                node = null;
                            }
                            mutableVector.add(delegate$ui_release2);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            node = DelegatableNodeKt.access$pop(mutableVector);
        }
    }
}
