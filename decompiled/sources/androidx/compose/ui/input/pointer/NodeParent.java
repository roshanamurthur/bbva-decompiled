package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.bbva.plugin.localstorage.command.ClearCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HitPathTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\f\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000J7\u0010\r\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0006\u0010\u0011\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000fJ\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/input/pointer/NodeParent;", "", "", "Landroidx/compose/ui/input/pointer/PointerId;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "", "isInBounds", "buildCache", "dispatchMainEventPass", "dispatchFinalEventPass", "", "dispatchCancel", ClearCommand.ID, "removeDetachedPointerInputFilters", "cleanUpHits", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/Node;", "a", "Landroidx/compose/runtime/collection/MutableVector;", "getChildren", "()Landroidx/compose/runtime/collection/MutableVector;", "children", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,557:1\n1182#2:558\n1161#2,2:559\n460#3,11:561\n460#3,11:572\n460#3,11:583\n460#3,11:594\n523#3:605\n48#3:606\n523#3:607\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n*L\n143#1:558\n143#1:559,2\n152#1:561,11\n182#1:572,11\n201#1:583,11\n212#1:594,11\n228#1:605\n240#1:606\n241#1:607\n*E\n"})
public class NodeParent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableVector<Node> children = new MutableVector<>(new Node[16], 0);

    public boolean buildCache(@NotNull Map<PointerId, PointerInputChange> changes, @NotNull LayoutCoordinates parentCoordinates, @NotNull InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        Node[] content = mutableVector.getContent();
        int i10 = 0;
        boolean z10 = false;
        do {
            z10 = content[i10].buildCache(changes, parentCoordinates, internalPointerEvent, isInBounds) || z10;
            i10++;
        } while (i10 < size);
        return z10;
    }

    public void cleanUpHits(@NotNull InternalPointerEvent internalPointerEvent) {
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (mutableVector.getContent()[size].getPointerIds().isEmpty()) {
                mutableVector.removeAt(size);
            }
        }
    }

    public final void clear() {
        this.children.clear();
    }

    public void dispatchCancel() {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size > 0) {
            Node[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                content[i10].dispatchCancel();
                i10++;
            } while (i10 < size);
        }
    }

    public boolean dispatchFinalEventPass(@NotNull InternalPointerEvent internalPointerEvent) {
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        boolean z10 = false;
        if (size > 0) {
            Node[] content = mutableVector.getContent();
            int i10 = 0;
            boolean z11 = false;
            do {
                z11 = content[i10].dispatchFinalEventPass(internalPointerEvent) || z11;
                i10++;
            } while (i10 < size);
            z10 = z11;
        }
        cleanUpHits(internalPointerEvent);
        return z10;
    }

    public boolean dispatchMainEventPass(@NotNull Map<PointerId, PointerInputChange> changes, @NotNull LayoutCoordinates parentCoordinates, @NotNull InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        Node[] content = mutableVector.getContent();
        int i10 = 0;
        boolean z10 = false;
        do {
            z10 = content[i10].dispatchMainEventPass(changes, parentCoordinates, internalPointerEvent, isInBounds) || z10;
            i10++;
        } while (i10 < size);
        return z10;
    }

    @NotNull
    public final MutableVector<Node> getChildren() {
        return this.children;
    }

    public final void removeDetachedPointerInputFilters() {
        int i10 = 0;
        while (true) {
            MutableVector<Node> mutableVector = this.children;
            if (i10 >= mutableVector.getSize()) {
                return;
            }
            Node node = mutableVector.getContent()[i10];
            if (node.getModifierNode().getIsAttached()) {
                i10++;
                node.removeDetachedPointerInputFilters();
            } else {
                mutableVector.removeAt(i10);
                node.dispatchCancel();
            }
        }
    }
}
