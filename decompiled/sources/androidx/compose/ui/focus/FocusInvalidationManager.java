package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FocusInvalidationManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "Landroidx/compose/ui/focus/FocusTargetNode;", "node", "", "scheduleInvalidation", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Lkotlin/Function1;", "Lkotlin/Function0;", "onRequestApplyChangesListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class FocusInvalidationManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<Function0<Unit>, Unit> f15477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet f15478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet f15479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet f15480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f15481e;

    /* JADX INFO: compiled from: FocusInvalidationManager.kt */
    @SourceDebugExtension({"SMAP\nFocusInvalidationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager$invalidateNodes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,140:1\n1855#2:141\n1856#2:252\n1855#2:253\n1856#2:364\n1855#2,2:365\n90#3:142\n90#3:254\n282#4:143\n383#4,6:144\n393#4,2:151\n395#4,8:156\n403#4,9:167\n412#4,8:179\n283#4:187\n133#4:188\n134#4,8:190\n142#4,9:199\n383#4,37:208\n151#4,6:245\n284#4:251\n282#4:255\n383#4,6:256\n393#4,2:263\n395#4,8:268\n403#4,9:279\n412#4,8:291\n283#4:299\n133#4:300\n134#4,8:302\n142#4,9:311\n383#4,37:320\n151#4,6:357\n284#4:363\n261#5:150\n261#5:262\n234#6,3:153\n237#6,3:176\n234#6,3:265\n237#6,3:288\n1182#7:164\n1161#7,2:165\n1182#7:276\n1161#7,2:277\n1#8:189\n1#8:301\n1#8:367\n48#9:198\n48#9:310\n*S KotlinDebug\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager$invalidateNodes$1\n*L\n59#1:141\n59#1:252\n72#1:253\n72#1:364\n120#1:365,2\n64#1:142\n86#1:254\n64#1:143\n64#1:144,6\n64#1:151,2\n64#1:156,8\n64#1:167,9\n64#1:179,8\n64#1:187\n64#1:188\n64#1:190,8\n64#1:199,9\n64#1:208,37\n64#1:245,6\n64#1:251\n86#1:255\n86#1:256,6\n86#1:263,2\n86#1:268,8\n86#1:279,9\n86#1:291,8\n86#1:299\n86#1:300\n86#1:302,8\n86#1:311,9\n86#1:320,37\n86#1:357,6\n86#1:363\n64#1:150\n86#1:262\n64#1:153,3\n64#1:176,3\n86#1:265,3\n86#1:288,3\n64#1:164\n64#1:165,2\n86#1:276\n86#1:277,2\n64#1:189\n86#1:301\n64#1:198\n86#1:310\n*E\n"})
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i10;
            int i11;
            FocusState focusState;
            int i12;
            int i13;
            FocusInvalidationManager focusInvalidationManager = FocusInvalidationManager.this;
            Iterator it = focusInvalidationManager.f15480d.iterator();
            while (true) {
                int i14 = 1;
                int i15 = 1024;
                int i16 = 16;
                int i17 = 0;
                if (!it.hasNext()) {
                    focusInvalidationManager.f15480d.clear();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (FocusEventModifierNode focusEventModifierNode : focusInvalidationManager.f15479c) {
                        if (focusEventModifierNode.getNode().getIsAttached()) {
                            int iM3725constructorimpl = NodeKind.m3725constructorimpl(i15);
                            Modifier.Node node = focusEventModifierNode.getNode();
                            int i18 = i14;
                            int i19 = i17;
                            FocusTargetNode focusTargetNode = null;
                            MutableVector mutableVector = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                    if (focusTargetNode != null) {
                                        i19 = i14;
                                    }
                                    if (focusInvalidationManager.f15478b.contains(focusTargetNode2)) {
                                        linkedHashSet.add(focusTargetNode2);
                                        i18 = i17;
                                    }
                                    focusTargetNode = focusTargetNode2;
                                } else if ((node.getKindSet() & iM3725constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                    Modifier.Node delegate = ((DelegatingNode) node).getDelegate();
                                    int i20 = i17;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iM3725constructorimpl) != 0) {
                                            i20++;
                                            if (i20 == i14) {
                                                node = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[i16], i17);
                                                }
                                                if (node != null) {
                                                    mutableVector.add(node);
                                                    node = null;
                                                }
                                                mutableVector.add(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        i14 = 1;
                                    }
                                    if (i20 == i14) {
                                    }
                                }
                                node = DelegatableNodeKt.access$pop(mutableVector);
                                i14 = 1;
                            }
                            if (!focusEventModifierNode.getNode().getIsAttached()) {
                                throw new IllegalStateException("visitChildren called on an unattached node".toString());
                            }
                            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[i16], i17);
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
                                    while (true) {
                                        if (nodeAccess$pop != null) {
                                            if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0) {
                                                MutableVector mutableVector3 = null;
                                                while (nodeAccess$pop != null) {
                                                    if (nodeAccess$pop instanceof FocusTargetNode) {
                                                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) nodeAccess$pop;
                                                        if (focusTargetNode != null) {
                                                            i19 = 1;
                                                        }
                                                        if (focusInvalidationManager.f15478b.contains(focusTargetNode3)) {
                                                            linkedHashSet.add(focusTargetNode3);
                                                            i18 = i17;
                                                        }
                                                        focusTargetNode = focusTargetNode3;
                                                    } else {
                                                        if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                                            Modifier.Node delegate2 = ((DelegatingNode) nodeAccess$pop).getDelegate();
                                                            int i21 = i17;
                                                            while (delegate2 != null) {
                                                                if ((delegate2.getKindSet() & iM3725constructorimpl) != 0) {
                                                                    i21++;
                                                                    if (i21 == 1) {
                                                                        nodeAccess$pop = delegate2;
                                                                        i13 = 0;
                                                                    } else {
                                                                        if (mutableVector3 == null) {
                                                                            Modifier.Node[] nodeArr = new Modifier.Node[i16];
                                                                            i13 = 0;
                                                                            mutableVector3 = new MutableVector(nodeArr, 0);
                                                                        } else {
                                                                            i13 = 0;
                                                                        }
                                                                        if (nodeAccess$pop != null) {
                                                                            mutableVector3.add(nodeAccess$pop);
                                                                            nodeAccess$pop = null;
                                                                        }
                                                                        mutableVector3.add(delegate2);
                                                                    }
                                                                } else {
                                                                    i13 = i17;
                                                                }
                                                                delegate2 = delegate2.getChild();
                                                                i17 = i13;
                                                                i16 = 16;
                                                            }
                                                            i12 = i17;
                                                            if (i21 == 1) {
                                                            }
                                                            i17 = i12;
                                                            i16 = 16;
                                                        }
                                                        nodeAccess$pop = DelegatableNodeKt.access$pop(mutableVector3);
                                                        i17 = i12;
                                                        i16 = 16;
                                                    }
                                                    i12 = i17;
                                                    nodeAccess$pop = DelegatableNodeKt.access$pop(mutableVector3);
                                                    i17 = i12;
                                                    i16 = 16;
                                                }
                                            } else {
                                                nodeAccess$pop = nodeAccess$pop.getChild();
                                                i17 = i17;
                                                i16 = 16;
                                            }
                                        }
                                    }
                                }
                                i17 = i17;
                                i16 = 16;
                            }
                            i10 = i17;
                            i11 = 1;
                            if (i18 != 0) {
                                if (i19 != 0) {
                                    focusState = FocusEventModifierNodeKt.getFocusState(focusEventModifierNode);
                                } else if (focusTargetNode == null || (focusState = focusTargetNode.getFocusState()) == null) {
                                    focusState = FocusStateImpl.Inactive;
                                }
                                focusEventModifierNode.onFocusEvent(focusState);
                            }
                        } else {
                            focusEventModifierNode.onFocusEvent(FocusStateImpl.Inactive);
                            i10 = i17;
                            i11 = i14;
                        }
                        i14 = i11;
                        i15 = 1024;
                        i17 = i10;
                        i16 = 16;
                    }
                    focusInvalidationManager.f15479c.clear();
                    for (FocusTargetNode focusTargetNode4 : focusInvalidationManager.f15478b) {
                        if (focusTargetNode4.getIsAttached()) {
                            FocusStateImpl focusState2 = focusTargetNode4.getFocusState();
                            focusTargetNode4.invalidateFocus$ui_release();
                            if (focusState2 != focusTargetNode4.getFocusState() || linkedHashSet.contains(focusTargetNode4)) {
                                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode4);
                            }
                        }
                    }
                    focusInvalidationManager.f15478b.clear();
                    linkedHashSet.clear();
                    if (!focusInvalidationManager.f15480d.isEmpty()) {
                        throw new IllegalStateException("Unprocessed FocusProperties nodes".toString());
                    }
                    if (!focusInvalidationManager.f15479c.isEmpty()) {
                        throw new IllegalStateException("Unprocessed FocusEvent nodes".toString());
                    }
                    if (focusInvalidationManager.f15478b.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("Unprocessed FocusTarget nodes".toString());
                }
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) it.next();
                if (focusPropertiesModifierNode.getNode().getIsAttached()) {
                    int iM3725constructorimpl2 = NodeKind.m3725constructorimpl(1024);
                    Modifier.Node node2 = focusPropertiesModifierNode.getNode();
                    MutableVector mutableVector4 = null;
                    while (node2 != null) {
                        if (node2 instanceof FocusTargetNode) {
                            focusInvalidationManager.f15478b.add((FocusTargetNode) node2);
                        } else if ((node2.getKindSet() & iM3725constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                            int i22 = 0;
                            for (Modifier.Node delegate3 = ((DelegatingNode) node2).getDelegate(); delegate3 != null; delegate3 = delegate3.getChild()) {
                                if ((delegate3.getKindSet() & iM3725constructorimpl2) != 0) {
                                    i22++;
                                    if (i22 == 1) {
                                        node2 = delegate3;
                                    } else {
                                        if (mutableVector4 == null) {
                                            mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node2 != null) {
                                            mutableVector4.add(node2);
                                            node2 = null;
                                        }
                                        mutableVector4.add(delegate3);
                                    }
                                }
                            }
                            if (i22 == 1) {
                            }
                        }
                        node2 = DelegatableNodeKt.access$pop(mutableVector4);
                    }
                    if (!focusPropertiesModifierNode.getNode().getIsAttached()) {
                        throw new IllegalStateException("visitChildren called on an unattached node".toString());
                    }
                    MutableVector mutableVector5 = new MutableVector(new Modifier.Node[16], 0);
                    Modifier.Node child2 = focusPropertiesModifierNode.getNode().getChild();
                    if (child2 == null) {
                        DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector5, focusPropertiesModifierNode.getNode());
                    } else {
                        mutableVector5.add(child2);
                    }
                    while (mutableVector5.isNotEmpty()) {
                        Modifier.Node nodeAccess$pop2 = (Modifier.Node) androidx.constraintlayout.core.parser.a.a(mutableVector5, 1);
                        if ((nodeAccess$pop2.getAggregateChildKindSet() & iM3725constructorimpl2) == 0) {
                            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector5, nodeAccess$pop2);
                        } else {
                            while (nodeAccess$pop2 != null) {
                                if ((nodeAccess$pop2.getKindSet() & iM3725constructorimpl2) != 0) {
                                    MutableVector mutableVector6 = null;
                                    while (nodeAccess$pop2 != null) {
                                        if (nodeAccess$pop2 instanceof FocusTargetNode) {
                                            focusInvalidationManager.f15478b.add((FocusTargetNode) nodeAccess$pop2);
                                        } else if ((nodeAccess$pop2.getKindSet() & iM3725constructorimpl2) != 0 && (nodeAccess$pop2 instanceof DelegatingNode)) {
                                            int i23 = 0;
                                            for (Modifier.Node delegate4 = ((DelegatingNode) nodeAccess$pop2).getDelegate(); delegate4 != null; delegate4 = delegate4.getChild()) {
                                                if ((delegate4.getKindSet() & iM3725constructorimpl2) != 0) {
                                                    i23++;
                                                    if (i23 == 1) {
                                                        nodeAccess$pop2 = delegate4;
                                                    } else {
                                                        if (mutableVector6 == null) {
                                                            mutableVector6 = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (nodeAccess$pop2 != null) {
                                                            mutableVector6.add(nodeAccess$pop2);
                                                            nodeAccess$pop2 = null;
                                                        }
                                                        mutableVector6.add(delegate4);
                                                    }
                                                }
                                            }
                                            if (i23 == 1) {
                                            }
                                        }
                                        nodeAccess$pop2 = DelegatableNodeKt.access$pop(mutableVector6);
                                    }
                                    break;
                                }
                                nodeAccess$pop2 = nodeAccess$pop2.getChild();
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusInvalidationManager(@NotNull Function1<? super Function0<Unit>, Unit> onRequestApplyChangesListener) {
        Intrinsics.checkNotNullParameter(onRequestApplyChangesListener, "onRequestApplyChangesListener");
        this.f15477a = onRequestApplyChangesListener;
        this.f15478b = new LinkedHashSet();
        this.f15479c = new LinkedHashSet();
        this.f15480d = new LinkedHashSet();
        this.f15481e = new a();
    }

    public final void a(LinkedHashSet linkedHashSet, Object obj) {
        if (linkedHashSet.add(obj)) {
            if (this.f15480d.size() + this.f15479c.size() + this.f15478b.size() == 1) {
                this.f15477a.invoke(this.f15481e);
            }
        }
    }

    public final void scheduleInvalidation(@NotNull FocusTargetNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        a(this.f15478b, node);
    }

    public final void scheduleInvalidation(@NotNull FocusEventModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        a(this.f15479c, node);
    }

    public final void scheduleInvalidation(@NotNull FocusPropertiesModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        a(this.f15480d, node);
    }
}
