package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HitPathTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\u0007R\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/input/pointer/HitPathTracker;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "", "Landroidx/compose/ui/Modifier$Node;", "pointerInputNodes", "", "addHitPath-KNwqfcY", "(JLjava/util/List;)V", "addHitPath", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "", "isInBounds", "dispatchChanges", "processCancel", "removeDetachedPointerInputFilters", "Landroidx/compose/ui/input/pointer/NodeParent;", "b", "Landroidx/compose/ui/input/pointer/NodeParent;", "getRoot$ui_release", "()Landroidx/compose/ui/input/pointer/NodeParent;", "root", "Landroidx/compose/ui/layout/LayoutCoordinates;", "rootCoordinates", "<init>", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,557:1\n366#2,12:558\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n*L\n61#1:558,12\n*E\n"})
public final class HitPathTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LayoutCoordinates f16354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NodeParent root;

    public HitPathTracker(@NotNull LayoutCoordinates rootCoordinates) {
        Intrinsics.checkNotNullParameter(rootCoordinates, "rootCoordinates");
        this.f16354a = rootCoordinates;
        this.root = new NodeParent();
    }

    public static /* synthetic */ boolean dispatchChanges$default(HitPathTracker hitPathTracker, InternalPointerEvent internalPointerEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return hitPathTracker.dispatchChanges(internalPointerEvent, z10);
    }

    /* JADX INFO: renamed from: addHitPath-KNwqfcY, reason: not valid java name */
    public final void m3411addHitPathKNwqfcY(long pointerId, @NotNull List<? extends Modifier.Node> pointerInputNodes) {
        Node node;
        Intrinsics.checkNotNullParameter(pointerInputNodes, "pointerInputNodes");
        NodeParent nodeParent = this.root;
        int size = pointerInputNodes.size();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            Modifier.Node node2 = pointerInputNodes.get(i10);
            if (z10) {
                MutableVector<Node> children = nodeParent.getChildren();
                int size2 = children.getSize();
                if (size2 <= 0) {
                    node = null;
                    break;
                }
                Node[] content = children.getContent();
                int i11 = 0;
                while (true) {
                    node = content[i11];
                    if (Intrinsics.areEqual(node.getModifierNode(), node2)) {
                        break;
                    }
                    i11++;
                    if (i11 >= size2) {
                        node = null;
                        break;
                    }
                }
                Node node3 = node;
                if (node3 != null) {
                    node3.markIsIn();
                    if (!node3.getPointerIds().contains(PointerId.m3458boximpl(pointerId))) {
                        node3.getPointerIds().add(PointerId.m3458boximpl(pointerId));
                    }
                    nodeParent = node3;
                } else {
                    z10 = false;
                    Node node4 = new Node(node2);
                    node4.getPointerIds().add(PointerId.m3458boximpl(pointerId));
                    nodeParent.getChildren().add(node4);
                    nodeParent = node4;
                }
            } else {
                Node node5 = new Node(node2);
                node5.getPointerIds().add(PointerId.m3458boximpl(pointerId));
                nodeParent.getChildren().add(node5);
                nodeParent = node5;
            }
        }
    }

    public final boolean dispatchChanges(@NotNull InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        NodeParent nodeParent = this.root;
        Map<PointerId, PointerInputChange> changes = internalPointerEvent.getChanges();
        LayoutCoordinates layoutCoordinates = this.f16354a;
        if (nodeParent.buildCache(changes, layoutCoordinates, internalPointerEvent, isInBounds)) {
            return nodeParent.dispatchFinalEventPass(internalPointerEvent) || nodeParent.dispatchMainEventPass(internalPointerEvent.getChanges(), layoutCoordinates, internalPointerEvent, isInBounds);
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: getRoot$ui_release, reason: from getter */
    public final NodeParent getRoot() {
        return this.root;
    }

    public final void processCancel() {
        NodeParent nodeParent = this.root;
        nodeParent.dispatchCancel();
        nodeParent.clear();
    }

    public final void removeDetachedPointerInputFilters() {
        this.root.removeDetachedPointerInputFilters();
    }
}
