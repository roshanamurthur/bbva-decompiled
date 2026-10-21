package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNodeKt;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusPropertiesModifierNodeKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTargetNodeKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.layout.IntermediateLayoutModifierNode;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NodeKind.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u001a&\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0080\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\n\u001a\u00020\u0007*\u00020\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0080\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u001a\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u001a \u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\"\u001f\u0010\u001a\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u00018@X\u0080\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"", "Landroidx/compose/ui/node/NodeKind;", "other", "or-64DMado", "(II)I", "or", "value", "", "contains-64DMado", "(II)Z", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "Landroidx/compose/ui/Modifier$Element;", "element", "calculateNodeKindSetFrom", "Landroidx/compose/ui/Modifier$Node;", "node", "", "autoInvalidateRemovedNode", "autoInvalidateInsertedNode", "autoInvalidateUpdatedNode", "remainingSet", TypedValues.CycleType.S_WAVE_PHASE, "autoInvalidateNodeIncludingDelegates", "calculateNodeKindSetFromIncludingDelegates", "getIncludeSelfInTraversal-H91voCI", "(I)Z", "includeSelfInTraversal", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,336:1\n52#1:340\n52#1:342\n52#1:344\n52#1:346\n52#1:348\n52#1:350\n52#1:352\n52#1:354\n52#1:356\n52#1:358\n52#1:361\n52#1:363\n52#1:365\n52#1:367\n52#1:369\n52#1:371\n52#1:373\n52#1:375\n52#1:377\n52#1:379\n52#1:381\n52#1:383\n52#1:385\n52#1:387\n52#1:389\n52#1:391\n55#1:399\n55#1:402\n55#1:404\n55#1:406\n55#1:408\n55#1:410\n55#1:412\n55#1:414\n84#2:337\n70#2:338\n72#2:339\n74#2:341\n76#2:343\n78#2:345\n80#2:347\n94#2:349\n92#2:351\n86#2:353\n82#2:355\n84#2:357\n70#2:359\n72#2:360\n74#2:362\n76#2:364\n78#2:366\n80#2:368\n82#2:370\n84#2:372\n86#2:374\n88#2:376\n90#2:378\n92#2:380\n94#2:382\n96#2:384\n98#2:386\n101#2:388\n104#2:390\n72#2:398\n72#2:400\n86#2:401\n74#2:403\n76#2:405\n82#2:407\n90#2:409\n92#2:411\n94#2:413\n90#2:415\n234#3,6:392\n234#3,3:449\n237#3,3:469\n234#3,6:486\n276#4:416\n133#4:417\n134#4:419\n135#4,7:423\n142#4,9:431\n383#4,6:440\n393#4,2:447\n395#4,17:452\n412#4,8:472\n151#4,6:480\n1#5:418\n1182#6:420\n1161#6,2:421\n48#7:430\n261#8:446\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n111#1:340\n114#1:342\n117#1:344\n120#1:346\n126#1:348\n130#1:350\n134#1:352\n137#1:354\n140#1:356\n146#1:358\n159#1:361\n162#1:363\n165#1:365\n168#1:367\n171#1:369\n174#1:371\n177#1:373\n180#1:375\n183#1:377\n186#1:379\n189#1:381\n192#1:383\n195#1:385\n198#1:387\n201#1:389\n204#1:391\n252#1:399\n259#1:402\n262#1:404\n265#1:406\n268#1:408\n271#1:410\n280#1:412\n289#1:414\n62#1:337\n109#1:338\n111#1:339\n114#1:341\n117#1:343\n120#1:345\n126#1:347\n130#1:349\n134#1:351\n137#1:353\n140#1:355\n146#1:357\n157#1:359\n159#1:360\n162#1:362\n165#1:364\n168#1:366\n171#1:368\n174#1:370\n177#1:372\n180#1:374\n183#1:376\n186#1:378\n189#1:380\n192#1:382\n195#1:384\n198#1:386\n201#1:388\n204#1:390\n252#1:398\n255#1:400\n259#1:401\n262#1:403\n265#1:405\n268#1:407\n271#1:409\n280#1:411\n289#1:413\n295#1:415\n239#1:392,6\n295#1:449,3\n295#1:469,3\n329#1:486,6\n295#1:416\n295#1:417\n295#1:419\n295#1:423,7\n295#1:431,9\n295#1:440,6\n295#1:447,2\n295#1:452,17\n295#1:472,8\n295#1:480,6\n295#1:418\n295#1:420\n295#1:421,2\n295#1:430\n295#1:446\n*E\n"})
public final class NodeKindKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Modifier.Node node, int i10, int i11) {
        if (i11 != 0 || node.getShouldAutoInvalidate()) {
            if ((NodeKind.m3725constructorimpl(2) & i10) != 0 && (node instanceof LayoutModifierNode)) {
                LayoutModifierNodeKt.invalidateMeasurement((LayoutModifierNode) node);
                if (i11 == 2) {
                    DelegatableNodeKt.m3653requireCoordinator64DMado(node, NodeKind.m3725constructorimpl(2)).onRelease();
                }
            }
            if ((NodeKind.m3725constructorimpl(256) & i10) != 0 && (node instanceof GlobalPositionAwareModifierNode)) {
                DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui_release();
            }
            if ((NodeKind.m3725constructorimpl(4) & i10) != 0 && (node instanceof DrawModifierNode)) {
                DrawModifierNodeKt.invalidateDraw((DrawModifierNode) node);
            }
            if ((NodeKind.m3725constructorimpl(8) & i10) != 0 && (node instanceof SemanticsModifierNode)) {
                SemanticsModifierNodeKt.invalidateSemantics((SemanticsModifierNode) node);
            }
            if ((NodeKind.m3725constructorimpl(64) & i10) != 0 && (node instanceof ParentDataModifierNode)) {
                ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) node);
            }
            if ((NodeKind.m3725constructorimpl(1024) & i10) != 0 && (node instanceof FocusTargetNode)) {
                if (i11 == 2) {
                    node.onReset();
                } else {
                    DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation((FocusTargetNode) node);
                }
            }
            if ((NodeKind.m3725constructorimpl(2048) & i10) != 0 && (node instanceof FocusPropertiesModifierNode)) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
                i1.b.f69479b = null;
                focusPropertiesModifierNode.applyFocusProperties(i1.b.f69478a);
                if (i1.b.f69479b != null) {
                    if (i11 == 2) {
                        int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
                        if (!focusPropertiesModifierNode.getNode().getIsAttached()) {
                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                        }
                        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
                        Modifier.Node child = focusPropertiesModifierNode.getNode().getChild();
                        if (child == null) {
                            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector, focusPropertiesModifierNode.getNode());
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
                                                FocusTargetNodeKt.invalidateFocusTarget((FocusTargetNode) nodeAccess$pop);
                                            } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                                int i12 = 0;
                                                for (Modifier.Node delegate = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                                    if ((delegate.getKindSet() & iM3725constructorimpl) != 0) {
                                                        i12++;
                                                        if (i12 == 1) {
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
                                                if (i12 == 1) {
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
                    } else {
                        FocusPropertiesModifierNodeKt.invalidateFocusProperties(focusPropertiesModifierNode);
                    }
                }
            }
            if ((i10 & NodeKind.m3725constructorimpl(4096)) == 0 || !(node instanceof FocusEventModifierNode)) {
                return;
            }
            FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node);
        }
    }

    public static final void autoInvalidateInsertedNode(@NotNull Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (!node.getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 1);
    }

    public static final void autoInvalidateNodeIncludingDelegates(@NotNull Modifier.Node node, int i10, int i11) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (!(node instanceof DelegatingNode)) {
            a(node, i10 & node.getKindSet(), i11);
            return;
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        a(node, delegatingNode.getSelfKindSet() & i10, i11);
        int i12 = (~delegatingNode.getSelfKindSet()) & i10;
        for (Modifier.Node delegate = delegatingNode.getDelegate(); delegate != null; delegate = delegate.getChild()) {
            autoInvalidateNodeIncludingDelegates(delegate, i12, i11);
        }
    }

    public static final void autoInvalidateRemovedNode(@NotNull Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (!node.getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 2);
    }

    public static final void autoInvalidateUpdatedNode(@NotNull Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (!node.getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 0);
    }

    public static final int calculateNodeKindSetFrom(@NotNull Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (node.getKindSet() != 0) {
            return node.getKindSet();
        }
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(1);
        if (node instanceof LayoutModifierNode) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(2);
        }
        if (node instanceof DrawModifierNode) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(4);
        }
        if (node instanceof SemanticsModifierNode) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(8);
        }
        if (node instanceof PointerInputModifierNode) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(16);
        }
        if (node instanceof ModifierLocalModifierNode) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(32);
        }
        if (node instanceof ParentDataModifierNode) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(64);
        }
        if (node instanceof LayoutAwareModifierNode) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(128);
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(256);
        }
        if (node instanceof IntermediateLayoutModifierNode) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(512);
        }
        if (node instanceof FocusTargetNode) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(1024);
        }
        if (node instanceof FocusPropertiesModifierNode) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(2048);
        }
        if (node instanceof FocusEventModifierNode) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(4096);
        }
        if (node instanceof KeyInputModifierNode) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(8192);
        }
        if (node instanceof RotaryInputModifierNode) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(16384);
        }
        if (node instanceof CompositionLocalConsumerModifierNode) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(32768);
        }
        return node instanceof SoftKeyboardInterceptionModifierNode ? iM3725constructorimpl | NodeKind.m3725constructorimpl(131072) : iM3725constructorimpl;
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(@NotNull Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (!(node instanceof DelegatingNode)) {
            return calculateNodeKindSetFrom(node);
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        int selfKindSet = delegatingNode.getSelfKindSet();
        for (Modifier.Node delegate = delegatingNode.getDelegate(); delegate != null; delegate = delegate.getChild()) {
            selfKindSet |= calculateNodeKindSetFromIncludingDelegates(delegate);
        }
        return selfKindSet;
    }

    /* JADX INFO: renamed from: contains-64DMado, reason: not valid java name */
    public static final boolean m3733contains64DMado(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* JADX INFO: renamed from: getIncludeSelfInTraversal-H91voCI, reason: not valid java name */
    public static final boolean m3734getIncludeSelfInTraversalH91voCI(int i10) {
        return (i10 & NodeKind.m3725constructorimpl(128)) != 0;
    }

    /* JADX INFO: renamed from: or-64DMado, reason: not valid java name */
    public static final int m3735or64DMado(int i10, int i11) {
        return i10 | i11;
    }

    public static final int calculateNodeKindSetFrom(@NotNull Modifier.Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(1);
        if (element instanceof LayoutModifier) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(2);
        }
        if (element instanceof DrawModifier) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(32);
        }
        if (element instanceof FocusEventModifier) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(4096);
        }
        if (element instanceof FocusOrderModifier) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(256);
        }
        if (element instanceof ParentDataModifier) {
            iM3725constructorimpl |= NodeKind.m3725constructorimpl(64);
        }
        return ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier)) ? iM3725constructorimpl | NodeKind.m3725constructorimpl(128) : iM3725constructorimpl;
    }
}
