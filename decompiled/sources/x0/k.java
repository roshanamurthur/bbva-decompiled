package x0;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,265:1\n48#2:266\n523#2:267\n523#2:268\n1182#3:269\n1161#3,2:270\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n*L\n244#1:266\n248#1:267\n249#1:268\n256#1:269\n256#1:270,2\n*E\n"})
public final class k implements Comparator<FocusTargetNode> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final k f94477p0 = new k();

    @Override // java.util.Comparator
    public final int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        FocusTargetNode focusTargetNode3 = focusTargetNode;
        FocusTargetNode focusTargetNode4 = focusTargetNode2;
        if (focusTargetNode3 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (focusTargetNode4 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        int i10 = 0;
        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode4)) {
            NodeCoordinator coordinator = focusTargetNode3.getCoordinator();
            LayoutNode layoutNode = coordinator != null ? coordinator.getLayoutNode() : null;
            if (layoutNode == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            NodeCoordinator coordinator2 = focusTargetNode4.getCoordinator();
            LayoutNode layoutNode2 = coordinator2 != null ? coordinator2.getLayoutNode() : null;
            if (layoutNode2 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            if (!Intrinsics.areEqual(layoutNode, layoutNode2)) {
                MutableVector mutableVector = new MutableVector(new LayoutNode[16], 0);
                while (layoutNode != null) {
                    mutableVector.add(0, layoutNode);
                    layoutNode = layoutNode.getParent$ui_release();
                }
                MutableVector mutableVector2 = new MutableVector(new LayoutNode[16], 0);
                while (layoutNode2 != null) {
                    mutableVector2.add(0, layoutNode2);
                    layoutNode2 = layoutNode2.getParent$ui_release();
                }
                int iMin = Math.min(mutableVector.getSize() - 1, mutableVector2.getSize() - 1);
                if (iMin >= 0) {
                    while (Intrinsics.areEqual(mutableVector.getContent()[i10], mutableVector2.getContent()[i10])) {
                        if (i10 != iMin) {
                            i10++;
                        }
                    }
                    return Intrinsics.compare(((LayoutNode) mutableVector.getContent()[i10]).getPlaceOrder$ui_release(), ((LayoutNode) mutableVector2.getContent()[i10]).getPlaceOrder$ui_release());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
            }
        } else {
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3)) {
                return -1;
            }
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode4)) {
                return 1;
            }
        }
        return 0;
    }
}
