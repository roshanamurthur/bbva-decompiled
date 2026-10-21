package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OnPositionedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0006¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher;", "", "", "isNotEmpty", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "onNodePositioned", "rootNode", "onRootNodePositioned", "dispatch", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnPositionedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,75:1\n1182#2:76\n1161#2,2:77\n728#3,2:79\n728#3,2:81\n492#3,11:83\n460#3,11:95\n197#4:94\n*S KotlinDebug\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n*L\n26#1:76\n26#1:77,2\n31#1:79,2\n37#1:81,2\n44#1:83,11\n58#1:95,11\n58#1:94\n*E\n"})
public final class OnPositionedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableVector<LayoutNode> f16918a = new MutableVector<>(new LayoutNode[16], 0);

    public static void a(LayoutNode layoutNode) {
        layoutNode.dispatchOnPositionedCallbacks$ui_release();
        int i10 = 0;
        layoutNode.setNeedsOnPositionedDispatch$ui_release(false);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            do {
                a(content[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    public final void dispatch() {
        Companion.a aVar = Companion.a.f16919p0;
        MutableVector<LayoutNode> mutableVector = this.f16918a;
        mutableVector.sortWith(aVar);
        int size = mutableVector.getSize();
        if (size > 0) {
            int i10 = size - 1;
            LayoutNode[] content = mutableVector.getContent();
            do {
                LayoutNode layoutNode = content[i10];
                if (layoutNode.getNeedsOnPositionedDispatch()) {
                    a(layoutNode);
                }
                i10--;
            } while (i10 >= 0);
        }
        mutableVector.clear();
    }

    public final boolean isNotEmpty() {
        return this.f16918a.isNotEmpty();
    }

    public final void onNodePositioned(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f16918a.add(node);
        node.setNeedsOnPositionedDispatch$ui_release(true);
    }

    public final void onRootNodePositioned(@NotNull LayoutNode rootNode) {
        Intrinsics.checkNotNullParameter(rootNode, "rootNode");
        MutableVector<LayoutNode> mutableVector = this.f16918a;
        mutableVector.clear();
        mutableVector.add(rootNode);
        rootNode.setNeedsOnPositionedDispatch$ui_release(true);
    }
}
