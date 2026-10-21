package androidx.compose.ui.focus;

import androidx.collection.k;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FocusTraversal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a)\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\u000e\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a\f\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0000\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000\"\u0018\u0010\u0012\u001a\u00020\n*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch", "Lkotlin/Function1;", "", "onFound", "focusSearch-sMXa3k8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;Lkotlin/jvm/functions/Function1;)Z", "focusSearch", "Landroidx/compose/ui/geometry/Rect;", "focusRect", "findActiveFocusNode", "isEligibleForFocusSearch", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "getActiveChild", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "activeChild", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusTraversal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,169:1\n1#2:170\n1#2:174\n1#2:245\n1#2:320\n90#3:171\n90#3:242\n90#3:313\n276#4:172\n133#4:173\n134#4:175\n135#4,7:179\n142#4,9:187\n383#4,6:196\n393#4,2:203\n395#4,17:208\n412#4,8:228\n151#4,6:236\n276#4:243\n133#4:244\n134#4:246\n135#4,7:250\n142#4,9:258\n383#4,6:267\n393#4,2:274\n395#4,17:279\n412#4,8:299\n151#4,6:307\n230#4,5:314\n58#4:319\n59#4,8:321\n383#4,6:329\n393#4,2:336\n395#4,8:341\n403#4,9:352\n412#4,8:364\n68#4,7:372\n1182#5:176\n1161#5,2:177\n1182#5:247\n1161#5,2:248\n1182#5:349\n1161#5,2:350\n48#6:186\n48#6:257\n261#7:202\n261#7:273\n261#7:335\n234#8,3:205\n237#8,3:225\n234#8,3:276\n237#8,3:296\n234#8,3:338\n237#8,3:361\n*S KotlinDebug\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n*L\n140#1:174\n153#1:245\n164#1:320\n140#1:171\n153#1:242\n164#1:313\n140#1:172\n140#1:173\n140#1:175\n140#1:179,7\n140#1:187,9\n140#1:196,6\n140#1:203,2\n140#1:208,17\n140#1:228,8\n140#1:236,6\n153#1:243\n153#1:244\n153#1:246\n153#1:250,7\n153#1:258,9\n153#1:267,6\n153#1:274,2\n153#1:279,17\n153#1:299,8\n153#1:307,6\n164#1:314,5\n164#1:319\n164#1:321,8\n164#1:329,6\n164#1:336,2\n164#1:341,8\n164#1:352,9\n164#1:364,8\n164#1:372,7\n140#1:176\n140#1:177,2\n153#1:247\n153#1:248,2\n164#1:349\n164#1:350,2\n140#1:186\n153#1:257\n140#1:202\n153#1:273\n164#1:335\n140#1:205,3\n140#1:225,3\n153#1:276,3\n153#1:296,3\n164#1:338,3\n164#1:361,3\n*E\n"})
public final class FocusTraversalKt {

    /* JADX INFO: compiled from: FocusTraversal.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: customFocusSearch--OM-vw8, reason: not valid java name */
    public static final FocusRequester m2234customFocusSearchOMvw8(@NotNull FocusTargetNode customFocusSearch, int i10, @NotNull LayoutDirection layoutDirection) {
        FocusRequester end;
        Intrinsics.checkNotNullParameter(customFocusSearch, "$this$customFocusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        FocusProperties focusPropertiesFetchFocusProperties$ui_release = customFocusSearch.fetchFocusProperties$ui_release();
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2222getNextdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getNext();
        }
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2224getPreviousdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getPrevious();
        }
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getUp();
        }
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getDown();
        }
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i11 == 1) {
                end = focusPropertiesFetchFocusProperties$ui_release.getStart();
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = focusPropertiesFetchFocusProperties$ui_release.getEnd();
            }
            if (end == FocusRequester.INSTANCE.getDefault()) {
                end = null;
            }
            if (end == null) {
                return focusPropertiesFetchFocusProperties$ui_release.getLeft();
            }
        } else {
            if (!FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
                if (FocusDirection.m2209equalsimpl0(i10, companion.m2218getEnterdhqQ8s())) {
                    return focusPropertiesFetchFocusProperties$ui_release.getEnter().invoke(FocusDirection.m2206boximpl(i10));
                }
                if (FocusDirection.m2209equalsimpl0(i10, companion.m2219getExitdhqQ8s())) {
                    return focusPropertiesFetchFocusProperties$ui_release.getExit().invoke(FocusDirection.m2206boximpl(i10));
                }
                throw new IllegalStateException("invalid FocusDirection".toString());
            }
            int i12 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i12 == 1) {
                end = focusPropertiesFetchFocusProperties$ui_release.getEnd();
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = focusPropertiesFetchFocusProperties$ui_release.getStart();
            }
            if (end == FocusRequester.INSTANCE.getDefault()) {
                end = null;
            }
            if (end == null) {
                return focusPropertiesFetchFocusProperties$ui_release.getRight();
            }
        }
        return end;
    }

    @Nullable
    public static final FocusTargetNode findActiveFocusNode(@NotNull FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
                if (!focusTargetNode.getNode().getIsAttached()) {
                    throw new IllegalStateException("visitChildren called on an unattached node".toString());
                }
                MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
                Modifier.Node child = focusTargetNode.getNode().getChild();
                if (child == null) {
                    DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector, focusTargetNode.getNode());
                } else {
                    mutableVector.add(child);
                }
                while (mutableVector.isNotEmpty()) {
                    Modifier.Node nodeAccess$pop = (Modifier.Node) androidx.constraintlayout.core.parser.a.a(mutableVector, 1);
                    if ((nodeAccess$pop.getAggregateChildKindSet() & iM3725constructorimpl) == 0) {
                        DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector, nodeAccess$pop);
                    } else {
                        while (nodeAccess$pop != null) {
                            if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0) {
                                MutableVector mutableVector2 = null;
                                while (nodeAccess$pop != null) {
                                    if (nodeAccess$pop instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNodeFindActiveFocusNode = findActiveFocusNode((FocusTargetNode) nodeAccess$pop);
                                        if (focusTargetNodeFindActiveFocusNode != null) {
                                            return focusTargetNodeFindActiveFocusNode;
                                        }
                                    } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                        int i11 = 0;
                                        for (Modifier.Node delegate = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                            if ((delegate.getKindSet() & iM3725constructorimpl) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    nodeAccess$pop = delegate;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodeAccess$pop != null) {
                                                        mutableVector2.add(nodeAccess$pop);
                                                        nodeAccess$pop = null;
                                                    }
                                                    mutableVector2.add(delegate);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    nodeAccess$pop = DelegatableNodeKt.access$pop(mutableVector2);
                                }
                                break;
                            }
                            nodeAccess$pop = nodeAccess$pop.getChild();
                        }
                    }
                }
                return null;
            }
            if (i10 != 3) {
                if (i10 == 4) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return focusTargetNode;
    }

    @NotNull
    public static final Rect focusRect(@NotNull FocusTargetNode focusTargetNode) {
        Rect rectLocalBoundingBoxOf;
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        NodeCoordinator coordinator = focusTargetNode.getCoordinator();
        return (coordinator == null || (rectLocalBoundingBoxOf = LayoutCoordinatesKt.findRootCoordinates(coordinator).localBoundingBoxOf(coordinator, false)) == null) ? Rect.INSTANCE.getZero() : rectLocalBoundingBoxOf;
    }

    /* JADX INFO: renamed from: focusSearch-sMXa3k8, reason: not valid java name */
    public static final boolean m2235focusSearchsMXa3k8(@NotNull FocusTargetNode focusSearch, int i10, @NotNull LayoutDirection layoutDirection, @NotNull Function1<? super FocusTargetNode, Boolean> onFound) {
        NodeChain nodes;
        int iM2225getRightdhqQ8s;
        Boolean boolM2240twoDimensionalFocusSearchOMvw8;
        Intrinsics.checkNotNullParameter(focusSearch, "$this$focusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2222getNextdhqQ8s()) || FocusDirection.m2209equalsimpl0(i10, companion.m2224getPreviousdhqQ8s())) {
            return OneDimensionalFocusSearchKt.m2237oneDimensionalFocusSearchOMvw8(focusSearch, i10, onFound);
        }
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s()) || FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s()) || FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s()) || FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
            Boolean boolM2240twoDimensionalFocusSearchOMvw9 = TwoDimensionalFocusSearchKt.m2240twoDimensionalFocusSearchOMvw8(focusSearch, i10, onFound);
            if (boolM2240twoDimensionalFocusSearchOMvw9 != null) {
                return boolM2240twoDimensionalFocusSearchOMvw9.booleanValue();
            }
        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2218getEnterdhqQ8s())) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i11 == 1) {
                iM2225getRightdhqQ8s = companion.m2225getRightdhqQ8s();
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iM2225getRightdhqQ8s = companion.m2221getLeftdhqQ8s();
            }
            FocusTargetNode focusTargetNodeFindActiveFocusNode = findActiveFocusNode(focusSearch);
            if (focusTargetNodeFindActiveFocusNode != null && (boolM2240twoDimensionalFocusSearchOMvw8 = TwoDimensionalFocusSearchKt.m2240twoDimensionalFocusSearchOMvw8(focusTargetNodeFindActiveFocusNode, iM2225getRightdhqQ8s, onFound)) != null) {
                return boolM2240twoDimensionalFocusSearchOMvw8.booleanValue();
            }
        } else {
            if (!FocusDirection.m2209equalsimpl0(i10, companion.m2219getExitdhqQ8s())) {
                throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) FocusDirection.m2211toStringimpl(i10))).toString());
            }
            FocusTargetNode focusTargetNodeFindActiveFocusNode2 = findActiveFocusNode(focusSearch);
            FocusTargetNode focusTargetNode = null;
            if (focusTargetNodeFindActiveFocusNode2 != null) {
                int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
                if (!focusTargetNodeFindActiveFocusNode2.getNode().getIsAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                Modifier.Node parent = focusTargetNodeFindActiveFocusNode2.getNode().getParent();
                LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNodeFindActiveFocusNode2);
                loop0: while (layoutNodeRequireLayoutNode != null) {
                    if ((k.a(layoutNodeRequireLayoutNode) & iM3725constructorimpl) != 0) {
                        while (parent != null) {
                            if ((parent.getKindSet() & iM3725constructorimpl) != 0) {
                                MutableVector mutableVector = null;
                                Modifier.Node nodeAccess$pop = parent;
                                while (nodeAccess$pop != null) {
                                    if (nodeAccess$pop instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodeAccess$pop;
                                        if (focusTargetNode2.fetchFocusProperties$ui_release().getCanFocus()) {
                                            focusTargetNode = focusTargetNode2;
                                            break loop0;
                                        }
                                    } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                        int i12 = 0;
                                        for (Modifier.Node delegate = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                            if ((delegate.getKindSet() & iM3725constructorimpl) != 0) {
                                                i12++;
                                                if (i12 == 1) {
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
                                        if (i12 == 1) {
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
            }
            if (focusTargetNode != null && !Intrinsics.areEqual(focusTargetNode, focusSearch)) {
                return onFound.invoke(focusTargetNode).booleanValue();
            }
        }
        return false;
    }

    @Nullable
    public static final FocusTargetNode getActiveChild(@NotNull FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        if (!focusTargetNode.getNode().getIsAttached()) {
            return null;
        }
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector, focusTargetNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node nodeAccess$pop = (Modifier.Node) androidx.constraintlayout.core.parser.a.a(mutableVector, 1);
            if ((nodeAccess$pop.getAggregateChildKindSet() & iM3725constructorimpl) == 0) {
                DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector, nodeAccess$pop);
            } else {
                while (nodeAccess$pop != null) {
                    if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0) {
                        MutableVector mutableVector2 = null;
                        while (nodeAccess$pop != null) {
                            if (nodeAccess$pop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodeAccess$pop;
                                int i10 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode2.getFocusState().ordinal()];
                                if (i10 == 1 || i10 == 2 || i10 == 3) {
                                    return focusTargetNode2;
                                }
                            } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM3725constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            nodeAccess$pop = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeAccess$pop != null) {
                                                mutableVector2.add(nodeAccess$pop);
                                                nodeAccess$pop = null;
                                            }
                                            mutableVector2.add(delegate);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            nodeAccess$pop = DelegatableNodeKt.access$pop(mutableVector2);
                        }
                        break;
                    }
                    nodeAccess$pop = nodeAccess$pop.getChild();
                }
            }
        }
        return null;
    }

    public static final boolean isEligibleForFocusSearch(@NotNull FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        NodeCoordinator coordinator;
        LayoutNode layoutNode2;
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        NodeCoordinator coordinator2 = focusTargetNode.getCoordinator();
        return (coordinator2 == null || (layoutNode = coordinator2.getLayoutNode()) == null || !layoutNode.isPlaced() || (coordinator = focusTargetNode.getCoordinator()) == null || (layoutNode2 = coordinator.getLayoutNode()) == null || !layoutNode2.isAttached()) ? false : true;
    }
}
