package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MeasureAndLayoutDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010,\u001a\u00020\b¢\u0006\u0004\b-\u0010.J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\u0013\u001a\u00020\n2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011J\u0006\u0010\u0014\u001a\u00020\u0004J#\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\nJ\u0010\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\nJ\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\bR$\u0010&\u001a\u00020 2\u0006\u0010!\u001a\u00020 8F@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0011\u0010)\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b*\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "updateRootConstraints-BRTryo0", "(J)V", "updateRootConstraints", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "forced", "requestLookaheadRemeasure", "requestRemeasure", "requestLookaheadRelayout", "requestRelayout", "requestOnPositionedCallback", "Lkotlin/Function0;", "onLayout", "measureAndLayout", "measureOnly", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerOnLayoutCompletedListener", "affectsLookahead", "forceMeasureTheSubtree", "forceDispatch", "dispatchOnPositionedCallbacks", "node", "onNodeDetached", "", "<set-?>", "f", "J", "getMeasureIteration", "()J", "measureIteration", "getHasPendingMeasureOrLayout", "()Z", "hasPendingMeasureOrLayout", "getHasPendingOnPositionedCallbacks", "hasPendingOnPositionedCallbacks", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "PostponedRequest", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMeasureAndLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 4 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 5 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,592:1\n404#1,8:599\n413#1,5:614\n404#1,14:619\n404#1,14:645\n1182#2:593\n1161#2,2:594\n1182#2:596\n1161#2,2:597\n175#3,2:607\n177#3,4:610\n100#4:609\n197#5:633\n197#5:683\n460#6,11:634\n728#6,2:659\n460#6,11:661\n460#6,11:672\n460#6,11:684\n*S KotlinDebug\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n*L\n341#1:599,8\n341#1:614,5\n361#1:619,14\n384#1:645,14\n68#1:593\n68#1:594,2\n89#1:596\n89#1:597,2\n343#1:607,2\n343#1:610,4\n343#1:609\n373#1:633\n531#1:683\n373#1:634,11\n420#1:659,2\n424#1:661,11\n476#1:672,11\n531#1:684,11\n*E\n"})
public final class MeasureAndLayoutDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LayoutNode f16858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DepthSortedSetsForDifferentPasses f16859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OnPositionedDispatcher f16861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableVector<Owner.OnLayoutCompletedListener> f16862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long measureIteration;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableVector<PostponedRequest> f16864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Constraints f16865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final LayoutTreeConsistencyChecker f16866i;

    /* JADX INFO: compiled from: MeasureAndLayoutDelegate.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "", "Landroidx/compose/ui/node/LayoutNode;", "a", "Landroidx/compose/ui/node/LayoutNode;", "getNode", "()Landroidx/compose/ui/node/LayoutNode;", "node", "", "b", "Z", "isLookahead", "()Z", "c", "isForced", "<init>", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class PostponedRequest {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final LayoutNode node;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final boolean isLookahead;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final boolean isForced;

        public PostponedRequest(@NotNull LayoutNode node, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.node = node;
            this.isLookahead = z10;
            this.isForced = z11;
        }

        @NotNull
        public final LayoutNode getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: isForced, reason: from getter */
        public final boolean getIsForced() {
            return this.isForced;
        }

        /* JADX INFO: renamed from: isLookahead, reason: from getter */
        public final boolean getIsLookahead() {
            return this.isLookahead;
        }
    }

    /* JADX INFO: compiled from: MeasureAndLayoutDelegate.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: MeasureAndLayoutDelegate.kt */
    public static final class a extends Lambda implements Function1<LayoutNode, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f16870p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10) {
            super(1);
            this.f16870p0 = z10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(LayoutNode layoutNode) {
            LayoutNode it = layoutNode;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(this.f16870p0 ? it.getLookaheadMeasurePending$ui_release() : it.getMeasurePending$ui_release());
        }
    }

    public MeasureAndLayoutDelegate(@NotNull LayoutNode root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f16858a = root;
        Owner.Companion companion = Owner.INSTANCE;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = new DepthSortedSetsForDifferentPasses(companion.getEnableExtraAssertions());
        this.f16859b = depthSortedSetsForDifferentPasses;
        this.f16861d = new OnPositionedDispatcher();
        this.f16862e = new MutableVector<>(new Owner.OnLayoutCompletedListener[16], 0);
        this.measureIteration = 1L;
        MutableVector<PostponedRequest> mutableVector = new MutableVector<>(new PostponedRequest[16], 0);
        this.f16864g = mutableVector;
        this.f16866i = companion.getEnableExtraAssertions() ? new LayoutTreeConsistencyChecker(root, depthSortedSetsForDifferentPasses, mutableVector.asMutableList()) : null;
    }

    public static boolean d(LayoutNode layoutNode) {
        AlignmentLines alignmentLines;
        if (layoutNode.getLookaheadMeasurePending$ui_release()) {
            if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                return true;
            }
            AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNode.getLayoutDelegate().getLookaheadAlignmentLinesOwner$ui_release();
            if (lookaheadAlignmentLinesOwner$ui_release != null && (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) != null && alignmentLines.getRequired$ui_release()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean measureAndLayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = null;
        }
        return measureAndLayoutDelegate.measureAndLayout(function0);
    }

    public static /* synthetic */ boolean requestLookaheadRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z10);
    }

    public static /* synthetic */ boolean requestLookaheadRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z10);
    }

    public static /* synthetic */ boolean requestRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return measureAndLayoutDelegate.requestRelayout(layoutNode, z10);
    }

    public static /* synthetic */ boolean requestRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return measureAndLayoutDelegate.requestRemeasure(layoutNode, z10);
    }

    public final void a() {
        MutableVector<Owner.OnLayoutCompletedListener> mutableVector = this.f16862e;
        int size = mutableVector.getSize();
        if (size > 0) {
            Owner.OnLayoutCompletedListener[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                content[i10].onLayoutComplete();
                i10++;
            } while (i10 < size);
        }
        mutableVector.clear();
    }

    public final boolean b(LayoutNode layoutNode, Constraints constraints) {
        if (layoutNode.getLookaheadRoot() == null) {
            return false;
        }
        boolean zM3670lookaheadRemeasure_Sx5XlM$ui_release = constraints != null ? layoutNode.m3670lookaheadRemeasure_Sx5XlM$ui_release(constraints) : LayoutNode.m3666lookaheadRemeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (zM3670lookaheadRemeasure_Sx5XlM$ui_release && parent$ui_release != null) {
            if (parent$ui_release.getLookaheadRoot() == null) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestLookaheadRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestLookaheadRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return zM3670lookaheadRemeasure_Sx5XlM$ui_release;
    }

    public final boolean c(LayoutNode layoutNode, Constraints constraints) {
        boolean zM3671remeasure_Sx5XlM$ui_release = constraints != null ? layoutNode.m3671remeasure_Sx5XlM$ui_release(constraints) : LayoutNode.m3667remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (zM3671remeasure_Sx5XlM$ui_release && parent$ui_release != null) {
            if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return zM3671remeasure_Sx5XlM$ui_release;
    }

    public final void dispatchOnPositionedCallbacks(boolean forceDispatch) {
        OnPositionedDispatcher onPositionedDispatcher = this.f16861d;
        if (forceDispatch) {
            onPositionedDispatcher.onRootNodePositioned(this.f16858a);
        }
        onPositionedDispatcher.dispatch();
    }

    public final void e(LayoutNode layoutNode) {
        g(layoutNode);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode2 = content[i10];
                if (layoutNode2.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode2.getLayoutDelegate().getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release()) {
                    e(layoutNode2);
                }
                i10++;
            } while (i10 < size);
        }
        g(layoutNode);
    }

    public final boolean f(LayoutNode layoutNode, boolean z10) {
        Constraints constraints;
        boolean zB;
        boolean zC;
        int i10 = 0;
        if (!layoutNode.isPlaced() && ((!layoutNode.getMeasurePending$ui_release() || (layoutNode.getMeasuredByParent$ui_release() != LayoutNode.UsageByParent.InMeasureBlock && !layoutNode.getLayoutDelegate().getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release())) && !Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && !d(layoutNode) && !layoutNode.getAlignmentLinesRequired$ui_release())) {
            return false;
        }
        boolean lookaheadMeasurePending$ui_release = layoutNode.getLookaheadMeasurePending$ui_release();
        LayoutNode layoutNode2 = this.f16858a;
        if (lookaheadMeasurePending$ui_release || layoutNode.getMeasurePending$ui_release()) {
            if (layoutNode == layoutNode2) {
                constraints = this.f16865h;
                Intrinsics.checkNotNull(constraints);
            } else {
                constraints = null;
            }
            zB = (layoutNode.getLookaheadMeasurePending$ui_release() && z10) ? b(layoutNode, constraints) : false;
            zC = c(layoutNode, constraints);
        } else {
            zC = false;
            zB = false;
        }
        if ((zB || layoutNode.getLookaheadLayoutPending$ui_release()) && Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && z10) {
            layoutNode.lookaheadReplace$ui_release();
        }
        if (layoutNode.getLayoutPending$ui_release() && layoutNode.isPlaced()) {
            if (layoutNode == layoutNode2) {
                layoutNode.place$ui_release(0, 0);
            } else {
                layoutNode.replace$ui_release();
            }
            this.f16861d.onNodePositioned(layoutNode);
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f16866i;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
        MutableVector<PostponedRequest> mutableVector = this.f16864g;
        if (mutableVector.isNotEmpty()) {
            int size = mutableVector.getSize();
            if (size > 0) {
                PostponedRequest[] content = mutableVector.getContent();
                do {
                    PostponedRequest postponedRequest = content[i10];
                    if (postponedRequest.getNode().isAttached()) {
                        if (postponedRequest.getIsLookahead()) {
                            requestLookaheadRemeasure(postponedRequest.getNode(), postponedRequest.getIsForced());
                        } else {
                            requestRemeasure(postponedRequest.getNode(), postponedRequest.getIsForced());
                        }
                    }
                    i10++;
                } while (i10 < size);
            }
            mutableVector.clear();
        }
        return zC;
    }

    public final void forceMeasureTheSubtree(@NotNull LayoutNode layoutNode, boolean affectsLookahead) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.f16859b;
        if (depthSortedSetsForDifferentPasses.isEmpty()) {
            return;
        }
        if (!this.f16860c) {
            throw new IllegalStateException("Check failed.".toString());
        }
        a aVar = new a(affectsLookahead);
        if (!(!aVar.invoke(layoutNode).booleanValue())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode2 = content[i10];
                if (aVar.invoke(layoutNode2).booleanValue() && depthSortedSetsForDifferentPasses.remove(layoutNode2, affectsLookahead)) {
                    f(layoutNode2, affectsLookahead);
                }
                if (!aVar.invoke(layoutNode2).booleanValue()) {
                    forceMeasureTheSubtree(layoutNode2, affectsLookahead);
                }
                i10++;
            } while (i10 < size);
        }
        if (aVar.invoke(layoutNode).booleanValue() && depthSortedSetsForDifferentPasses.remove(layoutNode, affectsLookahead)) {
            f(layoutNode, true);
        }
    }

    public final void g(LayoutNode layoutNode) {
        Constraints constraints;
        if (layoutNode.getMeasurePending$ui_release() || layoutNode.getLookaheadMeasurePending$ui_release()) {
            if (layoutNode == this.f16858a) {
                constraints = this.f16865h;
                Intrinsics.checkNotNull(constraints);
            } else {
                constraints = null;
            }
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                b(layoutNode, constraints);
            }
            c(layoutNode, constraints);
        }
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return this.f16859b.isNotEmpty();
    }

    public final boolean getHasPendingOnPositionedCallbacks() {
        return this.f16861d.isNotEmpty();
    }

    public final long getMeasureIteration() {
        if (this.f16860c) {
            return this.measureIteration;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    public final boolean measureAndLayout(@Nullable Function0<Unit> onLayout) {
        boolean z10;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.f16859b;
        LayoutNode layoutNode = this.f16858a;
        if (!layoutNode.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!layoutNode.isPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.f16860c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        boolean z11 = false;
        if (this.f16865h != null) {
            this.f16860c = true;
            try {
                if (depthSortedSetsForDifferentPasses.isNotEmpty()) {
                    z10 = false;
                    while (depthSortedSetsForDifferentPasses.isNotEmpty()) {
                        boolean z12 = !depthSortedSetsForDifferentPasses.f16769a.isEmpty();
                        LayoutNode layoutNodePop = (z12 ? depthSortedSetsForDifferentPasses.f16769a : depthSortedSetsForDifferentPasses.f16770b).pop();
                        boolean zF = f(layoutNodePop, z12);
                        if (layoutNodePop == this.f16858a && zF) {
                            z10 = true;
                        }
                    }
                    if (onLayout != null) {
                        onLayout.invoke();
                    }
                } else {
                    z10 = false;
                }
                this.f16860c = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f16866i;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
                z11 = z10;
            } catch (Throwable th2) {
                this.f16860c = false;
                throw th2;
            }
        }
        a();
        return z11;
    }

    /* JADX INFO: renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    public final void m3694measureAndLayout0kLqBqw(@NotNull LayoutNode layoutNode, long constraints) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        LayoutNode layoutNode2 = this.f16858a;
        if (!(!Intrinsics.areEqual(layoutNode, layoutNode2))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!layoutNode2.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!layoutNode2.isPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.f16860c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f16865h != null) {
            this.f16860c = true;
            try {
                this.f16859b.remove(layoutNode);
                boolean zB = b(layoutNode, Constraints.m4346boximpl(constraints));
                c(layoutNode, Constraints.m4346boximpl(constraints));
                if (zB || layoutNode.getLookaheadLayoutPending$ui_release()) {
                    if (Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
                        layoutNode.lookaheadReplace$ui_release();
                    }
                }
                if (layoutNode.getLayoutPending$ui_release() && layoutNode.isPlaced()) {
                    layoutNode.replace$ui_release();
                    this.f16861d.onNodePositioned(layoutNode);
                }
                this.f16860c = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f16866i;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th2) {
                this.f16860c = false;
                throw th2;
            }
        }
        a();
    }

    public final void measureOnly() {
        LayoutNode layoutNode = this.f16858a;
        if (!layoutNode.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!layoutNode.isPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.f16860c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f16865h != null) {
            this.f16860c = true;
            try {
                e(layoutNode);
                this.f16860c = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f16866i;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th2) {
                this.f16860c = false;
                throw th2;
            }
        }
    }

    public final void onNodeDetached(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f16859b.remove(node);
    }

    public final void registerOnLayoutCompletedListener(@NotNull Owner.OnLayoutCompletedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f16862e.add(listener);
    }

    public final boolean requestLookaheadRelayout(@NotNull LayoutNode layoutNode, boolean forced) {
        LayoutNode parent$ui_release;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f16866i;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 && i10 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.getLookaheadMeasurePending$ui_release() || layoutNode.getLookaheadLayoutPending$ui_release()) && !forced) {
                if (layoutTreeConsistencyChecker == null) {
                    return false;
                }
                layoutTreeConsistencyChecker.assertConsistent();
                return false;
            }
            layoutNode.markLookaheadLayoutPending$ui_release();
            layoutNode.markLayoutPending$ui_release();
            if (Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && (((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLookaheadMeasurePending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getLookaheadLayoutPending$ui_release()))) {
                this.f16859b.add(layoutNode, true);
            }
            return !this.f16860c;
        }
        if (layoutTreeConsistencyChecker == null) {
            return false;
        }
        layoutTreeConsistencyChecker.assertConsistent();
        return false;
    }

    public final boolean requestLookaheadRemeasure(@NotNull LayoutNode layoutNode, boolean forced) {
        LayoutNode parent$ui_release;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (layoutNode.getLookaheadRoot() == null) {
            throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString());
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            this.f16864g.add(new PostponedRequest(layoutNode, true, forced));
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f16866i;
            if (layoutTreeConsistencyChecker == null) {
                return false;
            }
            layoutTreeConsistencyChecker.assertConsistent();
            return false;
        }
        if (i10 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (layoutNode.getLookaheadMeasurePending$ui_release() && !forced) {
            return false;
        }
        layoutNode.markLookaheadMeasurePending$ui_release();
        layoutNode.markMeasurePending$ui_release();
        if ((Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE) || d(layoutNode)) && ((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLookaheadMeasurePending$ui_release())) {
            this.f16859b.add(layoutNode, true);
        }
        return !this.f16860c;
    }

    public final void requestOnPositionedCallback(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f16861d.onNodePositioned(layoutNode);
    }

    public final boolean requestRelayout(@NotNull LayoutNode layoutNode, boolean forced) {
        LayoutNode parent$ui_release;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f16866i;
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            if (layoutTreeConsistencyChecker == null) {
                return false;
            }
            layoutTreeConsistencyChecker.assertConsistent();
            return false;
        }
        if (i10 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (!forced && (layoutNode.getMeasurePending$ui_release() || layoutNode.getLayoutPending$ui_release())) {
            if (layoutTreeConsistencyChecker == null) {
                return false;
            }
            layoutTreeConsistencyChecker.assertConsistent();
            return false;
        }
        layoutNode.markLayoutPending$ui_release();
        if (layoutNode.isPlaced() && (((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLayoutPending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()))) {
            this.f16859b.add(layoutNode, false);
        }
        return !this.f16860c;
    }

    public final boolean requestRemeasure(@NotNull LayoutNode layoutNode, boolean forced) {
        LayoutNode parent$ui_release;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                this.f16864g.add(new PostponedRequest(layoutNode, false, forced));
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f16866i;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } else {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!layoutNode.getMeasurePending$ui_release() || forced) {
                    layoutNode.markMeasurePending$ui_release();
                    if ((layoutNode.isPlaced() || (layoutNode.getMeasurePending$ui_release() && (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getLayoutDelegate().getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release()))) && ((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getMeasurePending$ui_release())) {
                        this.f16859b.add(layoutNode, false);
                    }
                    if (!this.f16860c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: updateRootConstraints-BRTryo0, reason: not valid java name */
    public final void m3695updateRootConstraintsBRTryo0(long constraints) {
        Constraints constraints2 = this.f16865h;
        if (constraints2 != null && Constraints.m4351equalsimpl0(constraints2.getF18296a(), constraints)) {
            return;
        }
        if (!(!this.f16860c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.f16865h = Constraints.m4346boximpl(constraints);
        LayoutNode layoutNode = this.f16858a;
        if (layoutNode.getLookaheadRoot() != null) {
            layoutNode.markLookaheadMeasurePending$ui_release();
        }
        layoutNode.markMeasurePending$ui_release();
        this.f16859b.add(layoutNode, layoutNode.getLookaheadRoot() != null);
    }
}
