package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DelegatingNode.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000e\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b1\u0010\u001aJ\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0004J'\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0014H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010!\u001a\u00020\u0004H\u0010¢\u0006\u0004\b \u0010\u001aJ\u000f\u0010#\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\"\u0010\u001aR \u0010*\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010\u001a\u001a\u0004\b'\u0010(R$\u0010\u0012\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00062"}, d2 = {"Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "", "updateCoordinator$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "updateCoordinator", "Landroidx/compose/ui/node/DelegatableNode;", ExifInterface.GPS_DIRECTION_TRUE, "delegatableNode", "delegateUnprotected$ui_release", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;", "delegateUnprotected", "instance", "undelegateUnprotected$ui_release", "(Landroidx/compose/ui/node/DelegatableNode;)V", "undelegateUnprotected", "delegate", "undelegate", "Lkotlin/Function1;", "block", "forEachImmediateDelegate$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "forEachImmediateDelegate", "markAsAttached$ui_release", "()V", "markAsAttached", "runAttachLifecycle$ui_release", "runAttachLifecycle", "runDetachLifecycle$ui_release", "runDetachLifecycle", "markAsDetached$ui_release", "markAsDetached", "reset$ui_release", "reset", "", "H0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSelfKindSet$ui_release", "()I", "getSelfKindSet$ui_release$annotations", "selfKindSet", "I0", "Landroidx/compose/ui/Modifier$Node;", "getDelegate$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "setDelegate$ui_release", "(Landroidx/compose/ui/Modifier$Node;)V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDelegatingNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n1#1,277:1\n234#1,6:278\n234#1,6:290\n234#1,6:296\n234#1,6:302\n234#1,6:308\n234#1,6:314\n72#2:284\n72#2:286\n72#2:288\n55#3:285\n55#3:287\n55#3:289\n*S KotlinDebug\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n45#1:278,6\n243#1:290,6\n254#1:296,6\n262#1:302,6\n268#1:308,6\n274#1:314,6\n106#1:284\n162#1:286\n176#1:288\n106#1:285\n162#1:287\n176#1:289\n*E\n"})
public abstract class DelegatingNode extends Modifier.Node {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public final int selfKindSet = NodeKindKt.calculateNodeKindSetFrom(this);

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @Nullable
    public Modifier.Node delegate;

    public final void a(int i10, boolean z10) {
        Modifier.Node child;
        int kindSet = getKindSet();
        setKindSet$ui_release(i10);
        if (kindSet != i10) {
            if (DelegatableNodeKt.isDelegationRoot(this)) {
                setAggregateChildKindSet$ui_release(i10);
            }
            if (getIsAttached()) {
                Modifier.Node node = getNode();
                Modifier.Node parent = this;
                while (parent != null) {
                    i10 |= parent.getKindSet();
                    parent.setKindSet$ui_release(i10);
                    if (parent == node) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (z10 && parent == node) {
                    i10 = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node);
                    node.setKindSet$ui_release(i10);
                }
                int aggregateChildKindSet = i10 | ((parent == null || (child = parent.getChild()) == null) ? 0 : child.getAggregateChildKindSet());
                while (parent != null) {
                    aggregateChildKindSet |= parent.getKindSet();
                    parent.setAggregateChildKindSet$ui_release(aggregateChildKindSet);
                    parent = parent.getParent();
                }
            }
        }
    }

    @NotNull
    public final <T extends DelegatableNode> T delegate(@NotNull T delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "delegatableNode");
        Modifier.Node node = delegatableNode.getNode();
        if (node != delegatableNode) {
            Modifier.Node node2 = delegatableNode instanceof Modifier.Node ? (Modifier.Node) delegatableNode : null;
            Modifier.Node parent = node2 != null ? node2.getParent() : null;
            if (node == getNode() && Intrinsics.areEqual(parent, this)) {
                return delegatableNode;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node".toString());
        }
        if (!(!node.getIsAttached())) {
            throw new IllegalStateException("Cannot delegate to an already attached node".toString());
        }
        node.setAsDelegateTo$ui_release(getNode());
        int kindSet = getKindSet();
        int iCalculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node);
        node.setKindSet$ui_release(iCalculateNodeKindSetFromIncludingDelegates);
        int kindSet2 = getKindSet();
        if ((NodeKind.m3725constructorimpl(2) & iCalculateNodeKindSetFromIncludingDelegates) != 0 && (kindSet2 & NodeKind.m3725constructorimpl(2)) != 0 && !(this instanceof LayoutModifierNode)) {
            throw new IllegalStateException(("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node).toString());
        }
        node.setChild$ui_release(this.delegate);
        this.delegate = node;
        node.setParent$ui_release(this);
        a(getKindSet() | iCalculateNodeKindSetFromIncludingDelegates, false);
        if (getIsAttached()) {
            if ((iCalculateNodeKindSetFromIncludingDelegates & NodeKind.m3725constructorimpl(2)) == 0 || (kindSet & NodeKind.m3725constructorimpl(2)) != 0) {
                updateCoordinator$ui_release(getCoordinator());
            } else {
                NodeChain nodes = DelegatableNodeKt.requireLayoutNode(this).getNodes();
                getNode().updateCoordinator$ui_release(null);
                nodes.syncCoordinators();
            }
            node.markAsAttached$ui_release();
            node.runAttachLifecycle$ui_release();
            NodeKindKt.autoInvalidateInsertedNode(node);
        }
        return delegatableNode;
    }

    @NotNull
    public final <T extends DelegatableNode> T delegateUnprotected$ui_release(@NotNull T delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "delegatableNode");
        return (T) delegate(delegatableNode);
    }

    public final void forEachImmediateDelegate$ui_release(@NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            block.invoke(delegate);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getDelegate$ui_release, reason: from getter */
    public final Modifier.Node getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: getSelfKindSet$ui_release, reason: from getter */
    public final int getSelfKindSet() {
        return this.selfKindSet;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void markAsAttached$ui_release() {
        super.markAsAttached$ui_release();
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.updateCoordinator$ui_release(getCoordinator());
            if (!delegate.getIsAttached()) {
                delegate.markAsAttached$ui_release();
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void markAsDetached$ui_release() {
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.markAsDetached$ui_release();
        }
        super.markAsDetached$ui_release();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void reset$ui_release() {
        super.reset$ui_release();
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.reset$ui_release();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void runAttachLifecycle$ui_release() {
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.runAttachLifecycle$ui_release();
        }
        super.runAttachLifecycle$ui_release();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void runDetachLifecycle$ui_release() {
        super.runDetachLifecycle$ui_release();
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.runDetachLifecycle$ui_release();
        }
    }

    public final void setDelegate$ui_release(@Nullable Modifier.Node node) {
        this.delegate = node;
    }

    public final void undelegate(@NotNull DelegatableNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Modifier.Node node = null;
        for (Modifier.Node child = this.delegate; child != null; child = child.getChild()) {
            if (child == instance) {
                if (child.getIsAttached()) {
                    NodeKindKt.autoInvalidateRemovedNode(child);
                    child.runDetachLifecycle$ui_release();
                    child.markAsDetached$ui_release();
                }
                child.setAsDelegateTo$ui_release(child);
                child.setAggregateChildKindSet$ui_release(0);
                if (node == null) {
                    this.delegate = child.getChild();
                } else {
                    node.setChild$ui_release(child.getChild());
                }
                child.setChild$ui_release(null);
                child.setParent$ui_release(null);
                int kindSet = getKindSet();
                int iCalculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(this);
                a(iCalculateNodeKindSetFromIncludingDelegates, true);
                if (getIsAttached() && (kindSet & NodeKind.m3725constructorimpl(2)) != 0 && (NodeKind.m3725constructorimpl(2) & iCalculateNodeKindSetFromIncludingDelegates) == 0) {
                    NodeChain nodes = DelegatableNodeKt.requireLayoutNode(this).getNodes();
                    getNode().updateCoordinator$ui_release(null);
                    nodes.syncCoordinators();
                    return;
                }
                return;
            }
            node = child;
        }
        throw new IllegalStateException(("Could not find delegate: " + instance).toString());
    }

    public final void undelegateUnprotected$ui_release(@NotNull DelegatableNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        undelegate(instance);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void updateCoordinator$ui_release(@Nullable NodeCoordinator coordinator) {
        super.updateCoordinator$ui_release(coordinator);
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.updateCoordinator$ui_release(coordinator);
        }
    }

    public static /* synthetic */ void getSelfKindSet$ui_release$annotations() {
    }
}
