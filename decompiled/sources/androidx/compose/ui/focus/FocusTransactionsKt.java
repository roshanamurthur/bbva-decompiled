package androidx.compose.ui.focus;

import androidx.collection.k;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import x0.j;

/* JADX INFO: compiled from: FocusTransactions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u001e\u0010\b\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a!\u0010\u000e\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "requestFocus", "performRequestFocus", "captureFocus", "freeFocus", "forced", "refreshFocusEvents", "clearFocus", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/focus/CustomDestinationResult;", "performCustomRequestFocus-Mxy_nc0", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;", "performCustomRequestFocus", "performCustomClearFocus-Mxy_nc0", "performCustomClearFocus", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusTransactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n1#1,299:1\n90#2:300\n90#2:369\n90#2:438\n90#2:507\n262#3:301\n230#3,5:302\n58#3:307\n59#3,8:309\n383#3,5:317\n263#3:322\n388#3:323\n393#3,2:325\n395#3,8:330\n403#3,9:341\n412#3,8:353\n68#3,7:361\n265#3:368\n262#3:370\n230#3,5:371\n58#3:376\n59#3,8:378\n383#3,5:386\n263#3:391\n388#3:392\n393#3,2:394\n395#3,8:399\n403#3,9:410\n412#3,8:422\n68#3,7:430\n265#3:437\n262#3:439\n230#3,5:440\n58#3:445\n59#3,8:447\n383#3,5:455\n263#3:460\n388#3:461\n393#3,2:463\n395#3,8:468\n403#3,9:479\n412#3,8:491\n68#3,7:499\n265#3:506\n262#3:508\n230#3,5:509\n58#3:514\n59#3,8:516\n383#3,5:524\n263#3:529\n388#3:530\n393#3,2:532\n395#3,8:537\n403#3,9:548\n412#3,8:560\n68#3,7:568\n265#3:575\n1#4:308\n1#4:377\n1#4:446\n1#4:515\n1#4:576\n261#5:324\n261#5:393\n261#5:462\n261#5:531\n234#6,3:327\n237#6,3:350\n234#6,3:396\n237#6,3:419\n234#6,3:465\n237#6,3:488\n234#6,3:534\n237#6,3:557\n1182#7:338\n1161#7,2:339\n1182#7:407\n1161#7,2:408\n1182#7:476\n1161#7,2:477\n1182#7:545\n1161#7,2:546\n105#8,12:577\n132#8,12:589\n*S KotlinDebug\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n*L\n67#1:300\n188#1:369\n212#1:438\n255#1:507\n67#1:301\n67#1:302,5\n67#1:307\n67#1:309,8\n67#1:317,5\n67#1:322\n67#1:323\n67#1:325,2\n67#1:330,8\n67#1:341,9\n67#1:353,8\n67#1:361,7\n67#1:368\n188#1:370\n188#1:371,5\n188#1:376\n188#1:378,8\n188#1:386,5\n188#1:391\n188#1:392\n188#1:394,2\n188#1:399,8\n188#1:410,9\n188#1:422,8\n188#1:430,7\n188#1:437\n212#1:439\n212#1:440,5\n212#1:445\n212#1:447,8\n212#1:455,5\n212#1:460\n212#1:461\n212#1:463,2\n212#1:468,8\n212#1:479,9\n212#1:491,8\n212#1:499,7\n212#1:506\n255#1:508\n255#1:509,5\n255#1:514\n255#1:516,8\n255#1:524,5\n255#1:529\n255#1:530\n255#1:532,2\n255#1:537,8\n255#1:548,9\n255#1:560,8\n255#1:568,7\n255#1:575\n67#1:308\n188#1:377\n212#1:446\n255#1:515\n67#1:324\n188#1:393\n212#1:462\n255#1:531\n67#1:327,3\n67#1:350,3\n188#1:396,3\n188#1:419,3\n212#1:465,3\n212#1:488,3\n255#1:534,3\n255#1:557,3\n67#1:338\n67#1:339,2\n188#1:407\n188#1:408,2\n212#1:476\n212#1:477,2\n255#1:545\n255#1:546,2\n282#1:577,12\n293#1:589,12\n*E\n"})
public final class FocusTransactionsKt {

    /* JADX INFO: compiled from: FocusTransactions.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void a(FocusTargetNode focusTargetNode) {
        ObserverModifierNodeKt.observeReads(focusTargetNode, new j(focusTargetNode));
        int i10 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i10 == 3 || i10 == 4) {
            focusTargetNode.setFocusState(FocusStateImpl.Active);
        }
    }

    public static final CustomDestinationResult b(FocusTargetNode focusTargetNode, int i10) {
        if (!focusTargetNode.I0) {
            focusTargetNode.I0 = true;
            try {
                FocusRequester focusRequesterInvoke = focusTargetNode.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m2206boximpl(i10));
                FocusRequester.Companion companion = FocusRequester.INSTANCE;
                if (focusRequesterInvoke != companion.getDefault()) {
                    if (focusRequesterInvoke == companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    return focusRequesterInvoke.focus$ui_release() ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.I0 = false;
            }
        }
        return CustomDestinationResult.None;
    }

    public static final boolean c(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        boolean z10;
        Modifier.Node node;
        Modifier.Node nodeAccess$pop;
        NodeChain nodes;
        NodeChain nodes2;
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent = focusTargetNode2.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        loop0: while (true) {
            z10 = false;
            node = null;
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
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes2 = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes2.getTail$ui_release();
        }
        if (!Intrinsics.areEqual(nodeAccess$pop, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        int i11 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i11 == 1) {
            a(focusTargetNode2);
            focusTargetNode.setFocusState(FocusStateImpl.ActiveParent);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode2);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            return true;
        }
        if (i11 == 2) {
            return false;
        }
        if (i11 == 3) {
            if (FocusTraversalKt.getActiveChild(focusTargetNode) == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
            if (activeChild == null || clearFocus(activeChild, false, true)) {
                a(focusTargetNode2);
                z10 = true;
            }
            if (!z10) {
                return z10;
            }
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode2);
            return z10;
        }
        if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int iM3725constructorimpl2 = NodeKind.m3725constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent2 = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop4: while (layoutNodeRequireLayoutNode2 != null) {
            if ((k.a(layoutNodeRequireLayoutNode2) & iM3725constructorimpl2) != 0) {
                while (parent2 != null) {
                    if ((parent2.getKindSet() & iM3725constructorimpl2) != 0) {
                        Modifier.Node nodeAccess$pop2 = parent2;
                        MutableVector mutableVector2 = null;
                        while (nodeAccess$pop2 != null) {
                            if (nodeAccess$pop2 instanceof FocusTargetNode) {
                                node = nodeAccess$pop2;
                                break loop4;
                            }
                            if ((nodeAccess$pop2.getKindSet() & iM3725constructorimpl2) != 0 && (nodeAccess$pop2 instanceof DelegatingNode)) {
                                int i12 = 0;
                                for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) nodeAccess$pop2).getDelegate(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild()) {
                                    if ((delegate$ui_release2.getKindSet() & iM3725constructorimpl2) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            nodeAccess$pop2 = delegate$ui_release2;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeAccess$pop2 != null) {
                                                mutableVector2.add(nodeAccess$pop2);
                                                nodeAccess$pop2 = null;
                                            }
                                            mutableVector2.add(delegate$ui_release2);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            nodeAccess$pop2 = DelegatableNodeKt.access$pop(mutableVector2);
                        }
                    }
                    parent2 = parent2.getParent();
                }
            }
            layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
            parent2 = (layoutNodeRequireLayoutNode2 == null || (nodes = layoutNodeRequireLayoutNode2.getNodes()) == null) ? null : nodes.getTail$ui_release();
        }
        FocusTargetNode focusTargetNode3 = (FocusTargetNode) node;
        if (focusTargetNode3 == null && d(focusTargetNode)) {
            focusTargetNode.setFocusState(FocusStateImpl.Active);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            return c(focusTargetNode, focusTargetNode2);
        }
        if (focusTargetNode3 == null || !c(focusTargetNode3, focusTargetNode)) {
            return false;
        }
        boolean zC = c(focusTargetNode, focusTargetNode2);
        if (focusTargetNode.getFocusState() == FocusStateImpl.ActiveParent) {
            return zC;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final boolean captureFocus(@NotNull FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i10 == 1) {
            focusTargetNode.setFocusState(FocusStateImpl.Captured);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            return true;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean clearFocus(@NotNull FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i10 == 1) {
            focusTargetNode.setFocusState(FocusStateImpl.Inactive);
            if (z11) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            }
        } else {
            if (i10 == 2) {
                if (!z10) {
                    return z10;
                }
                focusTargetNode.setFocusState(FocusStateImpl.Inactive);
                if (!z11) {
                    return z10;
                }
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                return z10;
            }
            if (i10 == 3) {
                FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
                if (activeChild != null && !clearFocus(activeChild, z10, z11)) {
                    return false;
                }
                focusTargetNode.setFocusState(FocusStateImpl.Inactive);
                if (z11) {
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                }
            } else if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetNode focusTargetNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return clearFocus(focusTargetNode, z10, z11);
    }

    public static final boolean d(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        Owner owner;
        NodeCoordinator coordinator = focusTargetNode.getCoordinator();
        if (coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null || (owner = layoutNode.getOwner()) == null) {
            throw new IllegalStateException("Owner not initialized.".toString());
        }
        return owner.requestFocus();
    }

    public static final boolean freeFocus(@NotNull FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            focusTargetNode.setFocusState(FocusStateImpl.Active);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* JADX INFO: renamed from: performCustomClearFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m2232performCustomClearFocusMxy_nc0(@NotNull FocusTargetNode performCustomClearFocus, int i10) {
        Intrinsics.checkNotNullParameter(performCustomClearFocus, "$this$performCustomClearFocus");
        int i11 = WhenMappings.$EnumSwitchMapping$1[performCustomClearFocus.getFocusState().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i11 == 3) {
                FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(performCustomClearFocus);
                if (activeChild == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                CustomDestinationResult customDestinationResultM2232performCustomClearFocusMxy_nc0 = m2232performCustomClearFocusMxy_nc0(activeChild, i10);
                CustomDestinationResult customDestinationResult = CustomDestinationResult.None;
                if (customDestinationResultM2232performCustomClearFocusMxy_nc0 == customDestinationResult) {
                    customDestinationResultM2232performCustomClearFocusMxy_nc0 = null;
                }
                if (customDestinationResultM2232performCustomClearFocusMxy_nc0 != null) {
                    return customDestinationResultM2232performCustomClearFocusMxy_nc0;
                }
                if (!performCustomClearFocus.H0) {
                    performCustomClearFocus.H0 = true;
                    try {
                        FocusRequester focusRequesterInvoke = performCustomClearFocus.fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m2206boximpl(i10));
                        FocusRequester.Companion companion = FocusRequester.INSTANCE;
                        if (focusRequesterInvoke != companion.getDefault()) {
                            if (focusRequesterInvoke == companion.getCancel()) {
                                customDestinationResult = CustomDestinationResult.Cancelled;
                            } else {
                                customDestinationResult = focusRequesterInvoke.focus$ui_release() ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                            }
                        }
                    } finally {
                        performCustomClearFocus.H0 = false;
                    }
                }
                return customDestinationResult;
            }
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CustomDestinationResult.None;
    }

    @NotNull
    /* JADX INFO: renamed from: performCustomRequestFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m2233performCustomRequestFocusMxy_nc0(@NotNull FocusTargetNode performCustomRequestFocus, int i10) {
        Modifier.Node nodeAccess$pop;
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(performCustomRequestFocus, "$this$performCustomRequestFocus");
        int i11 = WhenMappings.$EnumSwitchMapping$1[performCustomRequestFocus.getFocusState().ordinal()];
        if (i11 == 1 || i11 == 2) {
            return CustomDestinationResult.None;
        }
        if (i11 == 3) {
            FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(performCustomRequestFocus);
            if (activeChild != null) {
                return m2232performCustomClearFocusMxy_nc0(activeChild, i10);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
        if (!performCustomRequestFocus.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent = performCustomRequestFocus.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(performCustomRequestFocus);
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
                                int i12 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                                    if ((delegate$ui_release.getKindSet() & iM3725constructorimpl) != 0) {
                                        i12++;
                                        if (i12 == 1) {
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
        FocusTargetNode focusTargetNode = (FocusTargetNode) nodeAccess$pop;
        if (focusTargetNode == null) {
            return CustomDestinationResult.None;
        }
        int i13 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i13 == 1) {
            return b(focusTargetNode, i10);
        }
        if (i13 == 2) {
            return CustomDestinationResult.Cancelled;
        }
        if (i13 == 3) {
            return m2233performCustomRequestFocusMxy_nc0(focusTargetNode, i10);
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        CustomDestinationResult customDestinationResultM2233performCustomRequestFocusMxy_nc0 = m2233performCustomRequestFocusMxy_nc0(focusTargetNode, i10);
        CustomDestinationResult customDestinationResult = customDestinationResultM2233performCustomRequestFocusMxy_nc0 != CustomDestinationResult.None ? customDestinationResultM2233performCustomRequestFocusMxy_nc0 : null;
        return customDestinationResult == null ? b(focusTargetNode, i10) : customDestinationResult;
    }

    public static final boolean performRequestFocus(@NotNull FocusTargetNode focusTargetNode) {
        Modifier.Node node;
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        boolean z10 = true;
        if (i10 == 1 || i10 == 2) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            return true;
        }
        if (i10 == 3) {
            FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
            if (activeChild == null || clearFocus(activeChild, false, true)) {
                a(focusTargetNode);
            } else {
                z10 = false;
            }
            if (!z10) {
                return z10;
            }
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            return z10;
        }
        if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (true) {
            node = null;
            if (layoutNodeRequireLayoutNode == null) {
                break;
            }
            if ((k.a(layoutNodeRequireLayoutNode) & iM3725constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM3725constructorimpl) != 0) {
                        Modifier.Node nodeAccess$pop = parent;
                        MutableVector mutableVector = null;
                        while (nodeAccess$pop != null) {
                            if (nodeAccess$pop instanceof FocusTargetNode) {
                                node = nodeAccess$pop;
                                break loop0;
                            }
                            if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                                    if ((delegate$ui_release.getKindSet() & iM3725constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
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
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
        if (focusTargetNode2 != null) {
            return c(focusTargetNode2, focusTargetNode);
        }
        if (d(focusTargetNode)) {
            a(focusTargetNode);
        } else {
            z10 = false;
        }
        if (!z10) {
            return z10;
        }
        FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
        return z10;
    }

    public static final boolean requestFocus(@NotNull FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[m2233performCustomRequestFocusMxy_nc0(focusTargetNode, FocusDirection.INSTANCE.m2218getEnterdhqQ8s()).ordinal()];
        if (i10 == 1) {
            return performRequestFocus(focusTargetNode);
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
