package androidx.compose.ui.focus;

import androidx.collection.k;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BeyondBoundsLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0006¢\u0006\u0002\b\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"searchBeyondBounds", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/focus/FocusTargetNode;", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "searchBeyondBounds--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBeyondBoundsLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeyondBoundsLayout.kt\nandroidx/compose/ui/focus/BeyondBoundsLayoutKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,58:1\n90#2:59\n262#3:60\n230#3,5:61\n58#3:66\n59#3,8:68\n383#3,5:76\n263#3:81\n388#3:82\n393#3,2:84\n395#3,8:89\n403#3,9:100\n412#3,8:112\n68#3,7:120\n265#3:127\n1#4:67\n261#5:83\n234#6,3:86\n237#6,3:109\n1182#7:97\n1161#7,2:98\n*S KotlinDebug\n*F\n+ 1 BeyondBoundsLayout.kt\nandroidx/compose/ui/focus/BeyondBoundsLayoutKt\n*L\n39#1:59\n39#1:60\n39#1:61,5\n39#1:66\n39#1:68,8\n39#1:76,5\n39#1:81\n39#1:82\n39#1:84,2\n39#1:89,8\n39#1:100,9\n39#1:112,8\n39#1:120,7\n39#1:127\n39#1:67\n39#1:83\n39#1:86,3\n39#1:109,3\n39#1:97\n39#1:98,2\n*E\n"})
public final class BeyondBoundsLayoutKt {
    @Nullable
    /* JADX INFO: renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m2205searchBeyondBoundsOMvw8(@NotNull FocusTargetNode searchBeyondBounds, int i10, @NotNull Function1<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> block) {
        Modifier.Node nodeAccess$pop;
        BeyondBoundsLayout beyondBoundsLayoutParent;
        int iM3565getBeforehoxUOeE;
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
        Intrinsics.checkNotNullParameter(block, "block");
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
        if (!searchBeyondBounds.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent = searchBeyondBounds.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(searchBeyondBounds);
        loop0: while (true) {
            if (layoutNodeRequireLayoutNode == null) {
                nodeAccess$pop = null;
                break;
            }
            if ((k.a(layoutNodeRequireLayoutNode) & iM3725constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM3725constructorimpl) != 0) {
                        nodeAccess$pop = parent;
                        MutableVector mutableVector = null;
                        while (nodeAccess$pop != null) {
                            if (nodeAccess$pop instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM3725constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            nodeAccess$pop = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeAccess$pop != null) {
                                                mutableVector.add(nodeAccess$pop);
                                                nodeAccess$pop = null;
                                            }
                                            mutableVector.add(delegate);
                                        }
                                    }
                                }
                                if (i11 == 1) {
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
        FocusTargetNode focusTargetNode = (FocusTargetNode) nodeAccess$pop;
        if ((focusTargetNode != null && Intrinsics.areEqual(focusTargetNode.getBeyondBoundsLayoutParent(), searchBeyondBounds.getBeyondBoundsLayoutParent())) || (beyondBoundsLayoutParent = searchBeyondBounds.getBeyondBoundsLayoutParent()) == null) {
            return null;
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
            iM3565getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3563getAbovehoxUOeE();
        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
            iM3565getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3566getBelowhoxUOeE();
        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
            iM3565getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3567getLefthoxUOeE();
        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
            iM3565getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3568getRighthoxUOeE();
        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2222getNextdhqQ8s())) {
            iM3565getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3564getAfterhoxUOeE();
        } else {
            if (!FocusDirection.m2209equalsimpl0(i10, companion.m2224getPreviousdhqQ8s())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            iM3565getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3565getBeforehoxUOeE();
        }
        return (T) beyondBoundsLayoutParent.mo401layouto7g1Pn8(iM3565getBeforehoxUOeE, block);
    }
}
