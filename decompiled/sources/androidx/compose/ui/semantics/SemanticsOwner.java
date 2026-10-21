package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SemanticsOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\f"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsOwner;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "getRootSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "rootSemanticsNode", "getUnmergedRootSemanticsNode", "unmergedRootSemanticsNode", "Landroidx/compose/ui/node/LayoutNode;", "rootNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSemanticsOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwner\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,82:1\n76#2:83\n769#3:84\n700#3,8:85\n723#3,3:93\n708#3,2:96\n701#3:98\n770#3:104\n702#3,11:143\n726#3,3:154\n713#3:157\n703#3:158\n772#3:159\n383#4,5:99\n388#4:105\n393#4,2:107\n395#4,8:112\n403#4,9:123\n412#4,8:135\n261#5:106\n234#6,3:109\n237#6,3:132\n1182#7:120\n1161#7,2:121\n*S KotlinDebug\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwner\n*L\n42#1:83\n42#1:84\n42#1:85,8\n42#1:93,3\n42#1:96,2\n42#1:98\n42#1:104\n42#1:143,11\n42#1:154,3\n42#1:157\n42#1:158\n42#1:159\n42#1:99,5\n42#1:105\n42#1:107,2\n42#1:112,8\n42#1:123,9\n42#1:135,8\n42#1:106\n42#1:109,3\n42#1:132,3\n42#1:120\n42#1:121,2\n*E\n"})
public final class SemanticsOwner {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LayoutNode f17530a;

    public SemanticsOwner(@NotNull LayoutNode rootNode) {
        Intrinsics.checkNotNullParameter(rootNode, "rootNode");
        this.f17530a = rootNode;
    }

    @NotNull
    public final SemanticsNode getRootSemanticsNode() {
        return SemanticsNodeKt.SemanticsNode(this.f17530a, true);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0077 A[LOOP:0: B:5:0x0019->B:36:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x007c A[EDGE_INSN: B:41:0x007c->B:37:0x007c BREAK  A[LOOP:0: B:5:0x0019->B:36:0x0077], SYNTHETIC] */
    @NotNull
    public final SemanticsNode getUnmergedRootSemanticsNode() {
        LayoutNode layoutNode = this.f17530a;
        NodeChain nodes = layoutNode.getNodes();
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(8);
        Object obj = null;
        if ((NodeChain.access$getAggregateChildKindSet(nodes) & iM3725constructorimpl) != 0) {
            loop0: for (Modifier.Node head = nodes.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM3725constructorimpl) == 0) {
                    if ((head.getAggregateChildKindSet() & iM3725constructorimpl) != 0) {
                        break;
                        break;
                    }
                } else {
                    Modifier.Node nodeAccess$pop = head;
                    MutableVector mutableVector = null;
                    while (nodeAccess$pop != null) {
                        if (nodeAccess$pop instanceof SemanticsModifierNode) {
                            obj = nodeAccess$pop;
                            break loop0;
                        }
                        if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                            int i10 = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                                if ((delegate$ui_release.getKindSet() & iM3725constructorimpl) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        nodeAccess$pop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodeAccess$pop != null) {
                                            mutableVector.add(nodeAccess$pop);
                                            nodeAccess$pop = null;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        nodeAccess$pop = DelegatableNodeKt.access$pop(mutableVector);
                    }
                    if ((head.getAggregateChildKindSet() & iM3725constructorimpl) != 0) {
                        break;
                    }
                }
            }
        }
        Intrinsics.checkNotNull(obj);
        return new SemanticsNode(((SemanticsModifierNode) obj).getNode(), false, layoutNode, new SemanticsConfiguration());
    }
}
