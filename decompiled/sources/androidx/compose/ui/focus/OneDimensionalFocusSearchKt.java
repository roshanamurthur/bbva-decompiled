package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import x0.k;

/* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a5\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "", "onFound", "oneDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "oneDimensionalFocusSearch", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,265:1\n180#1,3:339\n183#1,2:343\n186#1,5:346\n195#1,3:351\n198#1,2:355\n201#1,5:358\n1161#2,2:266\n1182#2:273\n1161#2,2:274\n1161#2,2:363\n1182#2:370\n1161#2,2:371\n1161#2,2:447\n1182#2:454\n1161#2,2:455\n1182#2:569\n1161#2,2:570\n90#3:268\n90#3:365\n90#3:449\n90#3:531\n276#4:269\n133#4:270\n134#4:272\n135#4,7:276\n142#4,9:284\n383#4,6:293\n393#4,2:300\n395#4,17:305\n412#4,8:325\n151#4,6:333\n276#4:366\n133#4:367\n134#4:369\n135#4,7:373\n142#4,9:381\n383#4,6:390\n393#4,2:397\n395#4,17:402\n412#4,8:422\n151#4,6:430\n276#4:450\n133#4:451\n134#4:453\n135#4,7:457\n142#4,9:465\n383#4,6:474\n393#4,2:481\n395#4,17:486\n412#4,8:506\n151#4,6:514\n262#4:532\n230#4,5:533\n58#4:538\n59#4,8:540\n383#4,5:548\n263#4:553\n388#4:554\n393#4,2:556\n395#4,8:561\n403#4,9:572\n412#4,8:584\n68#4,7:592\n265#4:599\n1#5:271\n1#5:368\n1#5:452\n1#5:539\n48#6:283\n53#6:342\n523#6:345\n53#6:354\n523#6:357\n48#6:380\n204#6,11:436\n48#6:464\n492#6,11:520\n53#6:600\n523#6:601\n523#6:602\n53#6:603\n523#6:604\n523#6:605\n261#7:299\n261#7:396\n261#7:480\n261#7:555\n234#8,3:302\n237#8,3:322\n234#8,3:399\n237#8,3:419\n234#8,3:483\n237#8,3:503\n234#8,3:558\n237#8,3:581\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n*L\n132#1:339,3\n132#1:343,2\n132#1:346,5\n135#1:351,3\n135#1:355,2\n135#1:358,5\n127#1:266,2\n128#1:273\n128#1:274,2\n153#1:363,2\n154#1:370\n154#1:371,2\n163#1:447,2\n164#1:454\n164#1:455,2\n175#1:569\n175#1:570,2\n128#1:268\n154#1:365\n164#1:449\n175#1:531\n128#1:269\n128#1:270\n128#1:272\n128#1:276,7\n128#1:284,9\n128#1:293,6\n128#1:300,2\n128#1:305,17\n128#1:325,8\n128#1:333,6\n154#1:366\n154#1:367\n154#1:369\n154#1:373,7\n154#1:381,9\n154#1:390,6\n154#1:397,2\n154#1:402,17\n154#1:422,8\n154#1:430,6\n164#1:450\n164#1:451\n164#1:453\n164#1:457,7\n164#1:465,9\n164#1:474,6\n164#1:481,2\n164#1:486,17\n164#1:506,8\n164#1:514,6\n175#1:532\n175#1:533,5\n175#1:538\n175#1:540,8\n175#1:548,5\n175#1:553\n175#1:554\n175#1:556,2\n175#1:561,8\n175#1:572,9\n175#1:584,8\n175#1:592,7\n175#1:599\n128#1:271\n154#1:368\n164#1:452\n175#1:539\n128#1:283\n132#1:342\n132#1:345\n135#1:354\n135#1:357\n154#1:380\n157#1:436,11\n164#1:464\n167#1:520,11\n182#1:600\n184#1:601\n186#1:602\n197#1:603\n199#1:604\n201#1:605\n128#1:299\n154#1:396\n164#1:480\n175#1:555\n128#1:302,3\n128#1:322,3\n154#1:399,3\n154#1:419,3\n164#1:483,3\n164#1:503,3\n175#1:558,3\n175#1:581,3\n*E\n"})
public final class OneDimensionalFocusSearchKt {

    /* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
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

    /* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
    public static final class a extends Lambda implements Function1<BeyondBoundsLayout.BeyondBoundsScope, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f15514p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f15515q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f15516r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<FocusTargetNode, Boolean> f15517s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, Function1<? super FocusTargetNode, Boolean> function1) {
            super(1);
            this.f15514p0 = focusTargetNode;
            this.f15515q0 = focusTargetNode2;
            this.f15516r0 = i10;
            this.f15517s0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
            BeyondBoundsLayout.BeyondBoundsScope searchBeyondBounds = beyondBoundsScope;
            Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
            Boolean boolValueOf = Boolean.valueOf(OneDimensionalFocusSearchKt.f(this.f15514p0, this.f15515q0, this.f15516r0, this.f15517s0));
            if (boolValueOf.booleanValue() || !searchBeyondBounds.getHasMoreContent()) {
                return boolValueOf;
            }
            return null;
        }
    }

    public static final boolean a(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i10 = iArr[focusState.ordinal()];
        if (i10 == 1) {
            FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
            if (activeChild == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            int i11 = iArr[activeChild.getFocusState().ordinal()];
            if (i11 != 1) {
                if (i11 == 2 || i11 == 3) {
                    return c(focusTargetNode, activeChild, FocusDirection.INSTANCE.m2224getPreviousdhqQ8s(), function1);
                }
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            if (!a(activeChild, function1) && !c(focusTargetNode, activeChild, FocusDirection.INSTANCE.m2224getPreviousdhqQ8s(), function1) && (!activeChild.fetchFocusProperties$ui_release().getCanFocus() || !function1.invoke(activeChild).booleanValue())) {
                return false;
            }
        } else {
            if (i10 == 2 || i10 == 3) {
                return d(focusTargetNode, function1);
            }
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!d(focusTargetNode, function1) && (!focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() || !function1.invoke(focusTargetNode).booleanValue())) {
                return false;
            }
        }
        return true;
    }

    public static final boolean b(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i10 == 1) {
            FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
            if (activeChild != null) {
                return b(activeChild, function1) || c(focusTargetNode, activeChild, FocusDirection.INSTANCE.m2222getNextdhqQ8s(), function1);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        if (i10 == 2 || i10 == 3) {
            return e(focusTargetNode, function1);
        }
        if (i10 == 4) {
            return focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() ? function1.invoke(focusTargetNode).booleanValue() : e(focusTargetNode, function1);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean c(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, Function1<? super FocusTargetNode, Boolean> function1) {
        if (f(focusTargetNode, focusTargetNode2, i10, function1)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m2205searchBeyondBoundsOMvw8(focusTargetNode, i10, new a(focusTargetNode, focusTargetNode2, i10, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode());
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
                                mutableVector.add((FocusTargetNode) nodeAccess$pop);
                            } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                int i10 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM3725constructorimpl) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            nodeAccess$pop = delegate;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeAccess$pop != null) {
                                                mutableVector3.add(nodeAccess$pop);
                                                nodeAccess$pop = null;
                                            }
                                            mutableVector3.add(delegate);
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
        mutableVector.sortWith(k.f94477p0);
        int size = mutableVector.getSize();
        if (size > 0) {
            int i11 = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) content[i11];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && a(focusTargetNode2, function1)) {
                    return true;
                }
                i11--;
            } while (i11 >= 0);
        }
        return false;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode());
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
                                mutableVector.add((FocusTargetNode) nodeAccess$pop);
                            } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                int i10 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM3725constructorimpl) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            nodeAccess$pop = delegate;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeAccess$pop != null) {
                                                mutableVector3.add(nodeAccess$pop);
                                                nodeAccess$pop = null;
                                            }
                                            mutableVector3.add(delegate);
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
        mutableVector.sortWith(k.f94477p0);
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        Object[] content = mutableVector.getContent();
        int i11 = 0;
        do {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) content[i11];
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && b(focusTargetNode2, function1)) {
                return true;
            }
            i11++;
        } while (i11 < size);
        return false;
    }

    public static final boolean f(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, Function1<? super FocusTargetNode, Boolean> function1) {
        Modifier.Node node;
        NodeChain nodes;
        if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (true) {
            node = null;
            if (!mutableVector2.isNotEmpty()) {
                break;
            }
            Modifier.Node nodeAccess$pop = (Modifier.Node) androidx.constraintlayout.core.parser.a.a(mutableVector2, 1);
            if ((nodeAccess$pop.getAggregateChildKindSet() & iM3725constructorimpl) == 0) {
                DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector2, nodeAccess$pop);
            } else {
                while (nodeAccess$pop != null) {
                    if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodeAccess$pop != null) {
                            if (nodeAccess$pop instanceof FocusTargetNode) {
                                mutableVector.add((FocusTargetNode) nodeAccess$pop);
                            } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM3725constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            nodeAccess$pop = delegate;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeAccess$pop != null) {
                                                mutableVector3.add(nodeAccess$pop);
                                                nodeAccess$pop = null;
                                            }
                                            mutableVector3.add(delegate);
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
        mutableVector.sortWith(k.f94477p0);
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2222getNextdhqQ8s())) {
            IntRange intRange = new IntRange(0, mutableVector.getSize() - 1);
            int first = intRange.getFirst();
            int last = intRange.getLast();
            if (first <= last) {
                boolean z10 = false;
                while (true) {
                    if (z10) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) mutableVector.getContent()[first];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && b(focusTargetNode3, function1)) {
                            return true;
                        }
                    }
                    if (Intrinsics.areEqual(mutableVector.getContent()[first], focusTargetNode2)) {
                        z10 = true;
                    }
                    if (first == last) {
                        break;
                    }
                    first++;
                }
            }
        } else {
            if (!FocusDirection.m2209equalsimpl0(i10, companion.m2224getPreviousdhqQ8s())) {
                throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
            }
            IntRange intRange2 = new IntRange(0, mutableVector.getSize() - 1);
            int first2 = intRange2.getFirst();
            int last2 = intRange2.getLast();
            if (first2 <= last2) {
                boolean z11 = false;
                while (true) {
                    if (z11) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) mutableVector.getContent()[last2];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode4) && a(focusTargetNode4, function1)) {
                            return true;
                        }
                    }
                    if (Intrinsics.areEqual(mutableVector.getContent()[last2], focusTargetNode2)) {
                        z11 = true;
                    }
                    if (last2 == first2) {
                        break;
                    }
                    last2--;
                }
            }
        }
        if (!FocusDirection.m2209equalsimpl0(i10, FocusDirection.INSTANCE.m2222getNextdhqQ8s()) && focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
            int iM3725constructorimpl2 = NodeKind.m3725constructorimpl(1024);
            if (!focusTargetNode.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent = focusTargetNode.getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop5: while (layoutNodeRequireLayoutNode != null) {
                if ((androidx.collection.k.a(layoutNodeRequireLayoutNode) & iM3725constructorimpl2) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iM3725constructorimpl2) != 0) {
                            Modifier.Node nodeAccess$pop2 = parent;
                            MutableVector mutableVector4 = null;
                            while (nodeAccess$pop2 != null) {
                                if (nodeAccess$pop2 instanceof FocusTargetNode) {
                                    node = nodeAccess$pop2;
                                    break loop5;
                                }
                                if ((nodeAccess$pop2.getKindSet() & iM3725constructorimpl2) != 0 && (nodeAccess$pop2 instanceof DelegatingNode)) {
                                    int i12 = 0;
                                    for (Modifier.Node delegate2 = ((DelegatingNode) nodeAccess$pop2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & iM3725constructorimpl2) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                nodeAccess$pop2 = delegate2;
                                            } else {
                                                if (mutableVector4 == null) {
                                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodeAccess$pop2 != null) {
                                                    mutableVector4.add(nodeAccess$pop2);
                                                    nodeAccess$pop2 = null;
                                                }
                                                mutableVector4.add(delegate2);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                nodeAccess$pop2 = DelegatableNodeKt.access$pop(mutableVector4);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail$ui_release();
            }
            if (node != null) {
                return function1.invoke(focusTargetNode).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m2237oneDimensionalFocusSearchOMvw8(@NotNull FocusTargetNode oneDimensionalFocusSearch, int i10, @NotNull Function1<? super FocusTargetNode, Boolean> onFound) {
        Intrinsics.checkNotNullParameter(oneDimensionalFocusSearch, "$this$oneDimensionalFocusSearch");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2222getNextdhqQ8s())) {
            return b(oneDimensionalFocusSearch, onFound);
        }
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2224getPreviousdhqQ8s())) {
            return a(oneDimensionalFocusSearch, onFound);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
    }
}
