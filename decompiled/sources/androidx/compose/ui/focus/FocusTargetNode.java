package androidx.compose.ui.focus;

import androidx.collection.k;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import h1.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FocusTargetNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001)B\u0007¢\u0006\u0004\b(\u0010\u0017J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000eH\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000eH\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0019\u0010\u0017R(\u0010#\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0013\u0010'\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "", "onObservedReadsChanged", "onReset", "Landroidx/compose/ui/focus/FocusProperties;", "fetchFocusProperties$ui_release", "()Landroidx/compose/ui/focus/FocusProperties;", "fetchFocusProperties", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusRequester;", "block", "fetchCustomEnter-aToIllA$ui_release", "(ILkotlin/jvm/functions/Function1;)V", "fetchCustomEnter", "fetchCustomExit-aToIllA$ui_release", "fetchCustomExit", "invalidateFocus$ui_release", "()V", "invalidateFocus", "scheduleInvalidationForFocusEvents$ui_release", "scheduleInvalidationForFocusEvents", "Landroidx/compose/ui/focus/FocusStateImpl;", "J0", "Landroidx/compose/ui/focus/FocusStateImpl;", "getFocusState", "()Landroidx/compose/ui/focus/FocusStateImpl;", "setFocusState", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "getFocusState$annotations", "focusState", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "getBeyondBoundsLayoutParent", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "beyondBoundsLayoutParent", "<init>", "FocusTargetElement", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusTargetNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n*L\n1#1,202:1\n92#2:203\n90#2:204\n94#2:276\n94#2:320\n90#2:321\n90#2:341\n94#2:343\n241#3,2:205\n58#3:207\n59#3,8:209\n243#3:217\n244#3,2:219\n383#3,12:221\n395#3,8:236\n403#3,9:247\n412#3,8:259\n247#3:267\n68#3,7:268\n248#3:275\n383#3,6:277\n393#3,2:284\n395#3,8:289\n403#3,9:300\n412#3,8:312\n50#3,9:323\n59#3,8:333\n383#3,6:344\n393#3,2:351\n395#3,8:356\n403#3,9:367\n412#3,8:379\n68#3,7:387\n1#4:208\n1#4:332\n261#5:218\n261#5:283\n261#5:342\n261#5:350\n234#6,3:233\n237#6,3:256\n234#6,3:286\n237#6,3:309\n234#6,3:353\n237#6,3:376\n1182#7:244\n1161#7,2:245\n1182#7:297\n1161#7,2:298\n1182#7:364\n1161#7,2:365\n47#8:322\n*S KotlinDebug\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n85#1:203\n85#1:204\n167#1:276\n174#1:320\n174#1:321\n175#1:341\n178#1:343\n85#1:205,2\n85#1:207\n85#1:209,8\n85#1:217\n85#1:219,2\n85#1:221,12\n85#1:236,8\n85#1:247,9\n85#1:259,8\n85#1:267\n85#1:268,7\n85#1:275\n167#1:277,6\n167#1:284,2\n167#1:289,8\n167#1:300,9\n167#1:312,8\n174#1:323,9\n174#1:333,8\n178#1:344,6\n178#1:351,2\n178#1:356,8\n178#1:367,9\n178#1:379,8\n174#1:387,7\n85#1:208\n174#1:332\n85#1:218\n167#1:283\n175#1:342\n178#1:350\n85#1:233,3\n85#1:256,3\n167#1:286,3\n167#1:309,3\n178#1:353,3\n178#1:376,3\n85#1:244\n85#1:245,2\n167#1:297\n167#1:298,2\n178#1:364\n178#1:365,2\n174#1:322\n*E\n"})
public final class FocusTargetNode extends Modifier.Node implements FocusTargetModifierNode, ObserverModifierNode, ModifierLocalModifierNode {
    public boolean H0;
    public boolean I0;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @NotNull
    public FocusStateImpl focusState = FocusStateImpl.Inactive;

    /* JADX INFO: compiled from: FocusTargetNode.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\f\u0010\u000e\u001a\u00020\f*\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusTargetNode;", "()V", "create", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FocusTargetElement extends ModifierNodeElement<FocusTargetNode> {

        @NotNull
        public static final FocusTargetElement INSTANCE = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(@Nullable Object other) {
            return other == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
            Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
            inspectorInfo.setName("focusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(@NotNull FocusTargetNode node) {
            Intrinsics.checkNotNullParameter(node, "node");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        @NotNull
        public FocusTargetNode create() {
            return new FocusTargetNode();
        }
    }

    /* JADX INFO: compiled from: FocusTargetNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: FocusTargetNode.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<FocusProperties> f15512p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f15513q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.ObjectRef<FocusProperties> objectRef, FocusTargetNode focusTargetNode) {
            super(0);
            this.f15512p0 = objectRef;
            this.f15513q0 = focusTargetNode;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, androidx.compose.ui.focus.FocusProperties] */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f15512p0.element = this.f15513q0.fetchFocusProperties$ui_release();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: fetchCustomEnter-aToIllA$ui_release, reason: not valid java name */
    public final void m2230fetchCustomEnteraToIllA$ui_release(int focusDirection, @NotNull Function1<? super FocusRequester, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this.I0) {
            return;
        }
        this.I0 = true;
        try {
            FocusRequester focusRequesterInvoke = fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m2206boximpl(focusDirection));
            if (focusRequesterInvoke != FocusRequester.INSTANCE.getDefault()) {
                block.invoke(focusRequesterInvoke);
            }
        } finally {
            InlineMarker.finallyStart(1);
            this.I0 = false;
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: fetchCustomExit-aToIllA$ui_release, reason: not valid java name */
    public final void m2231fetchCustomExitaToIllA$ui_release(int focusDirection, @NotNull Function1<? super FocusRequester, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this.H0) {
            return;
        }
        this.H0 = true;
        try {
            FocusRequester focusRequesterInvoke = fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m2206boximpl(focusDirection));
            if (focusRequesterInvoke != FocusRequester.INSTANCE.getDefault()) {
                block.invoke(focusRequesterInvoke);
            }
        } finally {
            InlineMarker.finallyStart(1);
            this.H0 = false;
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    @NotNull
    public final FocusProperties fetchFocusProperties$ui_release() {
        NodeChain nodes;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(2048);
        int iM3725constructorimpl2 = NodeKind.m3725constructorimpl(1024);
        Modifier.Node node = getNode();
        int i10 = iM3725constructorimpl | iM3725constructorimpl2;
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node2 = getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        loop0: while (layoutNodeRequireLayoutNode != null) {
            if ((k.a(layoutNodeRequireLayoutNode) & i10) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i10) != 0) {
                        if (node2 != node && (node2.getKindSet() & iM3725constructorimpl2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet() & iM3725constructorimpl) != 0) {
                            Modifier.Node nodeAccess$pop = node2;
                            MutableVector mutableVector = null;
                            while (nodeAccess$pop != 0) {
                                if (nodeAccess$pop instanceof FocusPropertiesModifierNode) {
                                    ((FocusPropertiesModifierNode) nodeAccess$pop).applyFocusProperties(focusPropertiesImpl);
                                } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = ((DelegatingNode) nodeAccess$pop).getDelegate();
                                    int i11 = 0;
                                    nodeAccess$pop = nodeAccess$pop;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet() & iM3725constructorimpl) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                nodeAccess$pop = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodeAccess$pop != 0) {
                                                    mutableVector.add(nodeAccess$pop);
                                                    nodeAccess$pop = 0;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild();
                                        nodeAccess$pop = nodeAccess$pop;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                nodeAccess$pop = DelegatableNodeKt.access$pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail$ui_release();
        }
        return focusPropertiesImpl;
    }

    @Nullable
    public final BeyondBoundsLayout getBeyondBoundsLayoutParent() {
        return (BeyondBoundsLayout) c.a(this, androidx.compose.ui.layout.BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public final /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return c.a(this, modifierLocal);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final /* synthetic */ ModifierLocalMap getProvidedValues() {
        return c.b(this);
    }

    public final void invalidateFocus$ui_release() {
        FocusProperties focusProperties;
        int i10 = WhenMappings.$EnumSwitchMapping$0[getFocusState().ordinal()];
        if (i10 == 1 || i10 == 2) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ObserverModifierNodeKt.observeReads(this, new a(objectRef, this));
            T t10 = objectRef.element;
            if (t10 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("focusProperties");
                focusProperties = null;
            } else {
                focusProperties = (FocusProperties) t10;
            }
            if (focusProperties.getCanFocus()) {
                return;
            }
            DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        FocusStateImpl focusState = getFocusState();
        invalidateFocus$ui_release();
        if (focusState != getFocusState()) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[getFocusState().ordinal()];
        if (i10 == 1 || i10 == 2) {
            DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
            return;
        }
        if (i10 == 3) {
            scheduleInvalidationForFocusEvents$ui_release();
            setFocusState(FocusStateImpl.Inactive);
        } else {
            if (i10 != 4) {
                return;
            }
            scheduleInvalidationForFocusEvents$ui_release();
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        c.c(this, modifierLocal, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public final void scheduleInvalidationForFocusEvents$ui_release() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.scheduleInvalidationForFocusEvents$ui_release():void");
    }

    public void setFocusState(@NotNull FocusStateImpl focusStateImpl) {
        Intrinsics.checkNotNullParameter(focusStateImpl, "<set-?>");
        this.focusState = focusStateImpl;
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    @NotNull
    public FocusStateImpl getFocusState() {
        return this.focusState;
    }

    public static /* synthetic */ void getFocusState$annotations() {
    }
}
