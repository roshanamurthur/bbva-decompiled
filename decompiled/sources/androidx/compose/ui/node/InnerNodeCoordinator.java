package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InnerNodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 C2\u00020\u0001:\u0002CDB\u000f\u0012\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016J@\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015¢\u0006\u0002\b\u0017H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J=\u0010-\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,R \u00105\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102R.\u0010>\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u0001068\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006E"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "ensureLookaheadDelegateCreated", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "height", "minIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "calculateAlignmentLine", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "performDraw", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestSource", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "", "isTouchEvent", "isInLayer", "hitTestChild-YqVAtuI", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestChild", "Landroidx/compose/ui/node/TailModifierNode;", "a1", "Landroidx/compose/ui/node/TailModifierNode;", "getTail", "()Landroidx/compose/ui/node/TailModifierNode;", "getTail$annotations", "()V", "tail", "Landroidx/compose/ui/node/LookaheadDelegate;", "<set-?>", "b1", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "lookaheadDelegate", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Companion", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n+ 2 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n1#1,246:1\n287#2,2:247\n197#3:249\n460#4,11:250\n460#4,11:261\n222#4,11:274\n179#5,2:272\n181#5,2:285\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n*L\n119#1:247,2\n121#1:249\n121#1:250,11\n172#1:261,11\n208#1:274,11\n205#1:272,2\n205#1:285,2\n*E\n"})
public final class InnerNodeCoordinator extends NodeCoordinator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    @NotNull
    public static final Paint f16783c1;

    /* JADX INFO: renamed from: a1, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TailModifierNode tail;

    /* JADX INFO: renamed from: b1, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LookaheadDelegate lookaheadDelegate;

    /* JADX INFO: compiled from: InnerNodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$Companion;", "", "()V", "innerBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getInnerBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Paint getInnerBoundsPaint() {
            return InnerNodeCoordinator.f16783c1;
        }
    }

    /* JADX INFO: compiled from: InnerNodeCoordinator.kt */
    @SourceDebugExtension({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,246:1\n178#2,2:247\n180#2:261\n197#3:249\n460#4,11:250\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n*L\n74#1:247,2\n74#1:261\n76#1:249\n76#1:250,11\n*E\n"})
    public final class a extends LookaheadDelegate {
        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public final int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicHeight(int i10) {
            return getLayoutNode().getIntrinsicsPolicy().maxLookaheadIntrinsicHeight(i10);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicWidth(int i10) {
            return getLayoutNode().getIntrinsicsPolicy().maxLookaheadIntrinsicWidth(i10);
        }

        @Override // androidx.compose.ui.layout.Measurable
        @NotNull
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public final Placeable mo3575measureBRTryo0(long j10) {
            m3610setMeasurementConstraintsBRTryo0(j10);
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i10 = 0;
                do {
                    LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i10].getLookaheadPassDelegate$ui_release();
                    Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                    lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                    i10++;
                } while (i10 < size);
            }
            LookaheadDelegate.access$set_measureResult(this, getLayoutNode().getMeasurePolicy().mo113measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui_release(), j10));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicHeight(int i10) {
            return getLayoutNode().getIntrinsicsPolicy().minLookaheadIntrinsicHeight(i10);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicWidth(int i10) {
            return getLayoutNode().getIntrinsicsPolicy().minLookaheadIntrinsicWidth(i10);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate
        public final void placeChildren() {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLookaheadPassDelegate$ui_release();
            Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.onNodePlaced$ui_release();
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo2396setColor8_81llA(Color.INSTANCE.m2542getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo2400setStylek9PVt8s(PaintingStyle.INSTANCE.m2736getStrokeTiuSbCo());
        f16783c1 = Paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InnerNodeCoordinator(@NotNull LayoutNode layoutNode) {
        super(layoutNode);
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.tail = new TailModifierNode();
        getTail().updateCoordinator$ui_release(this);
        this.lookaheadDelegate = layoutNode.getLookaheadRoot() != null ? new a(this) : null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.calculateAlignmentLine(alignmentLine);
        }
        Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new a(this));
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @Nullable
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: hitTestChild-YqVAtuI, reason: not valid java name */
    public void mo3663hitTestChildYqVAtuI(@NotNull NodeCoordinator.HitTestSource hitTestSource, long pointerPosition, @NotNull HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        boolean z10;
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        boolean z11 = false;
        if (hitTestSource.shouldHitTestChildren(getLayoutNode())) {
            if (m3720withinLayerBoundsk4lQ0M(pointerPosition)) {
                z10 = isInLayer;
            } else {
                if (isTouchEvent) {
                    float fM3708distanceInMinimumTouchTargettz77jQw = m3708distanceInMinimumTouchTargettz77jQw(pointerPosition, m3711getMinimumTouchTargetSizeNHjbRc());
                    if (!Float.isInfinite(fM3708distanceInMinimumTouchTargettz77jQw) && !Float.isNaN(fM3708distanceInMinimumTouchTargettz77jQw)) {
                        z10 = false;
                    }
                }
                z10 = isInLayer;
            }
            z11 = true;
        } else {
            z10 = isInLayer;
        }
        if (z11) {
            int i10 = hitTestResult.f16774r0;
            MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
            int size = zSortedChildren.getSize();
            if (size > 0) {
                LayoutNode[] content = zSortedChildren.getContent();
                int i11 = size - 1;
                do {
                    LayoutNode layoutNode = content[i11];
                    if (layoutNode.isPlaced()) {
                        hitTestSource.mo3721childHitTestYqVAtuI(layoutNode, pointerPosition, hitTestResult, isTouchEvent, z10);
                        if (!hitTestResult.hasHit()) {
                            i11--;
                        } else {
                            if (!layoutNode.getOuterCoordinator$ui_release().shouldSharePointerInputWithSiblings()) {
                                break;
                            }
                            hitTestResult.acceptHits();
                            i11--;
                        }
                    } else {
                        i11--;
                    }
                } while (i11 >= 0);
            }
            hitTestResult.f16774r0 = i10;
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        return getLayoutNode().getIntrinsicsPolicy().maxIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        return getLayoutNode().getIntrinsicsPolicy().maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @NotNull
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public Placeable mo3575measureBRTryo0(long constraints) {
        m3610setMeasurementConstraintsBRTryo0(constraints);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                content[i10].getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                i10++;
            } while (i10 < size);
        }
        setMeasureResult$ui_release(getLayoutNode().getMeasurePolicy().mo113measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui_release(), constraints));
        onMeasured();
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        return getLayoutNode().getIntrinsicsPolicy().minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        return getLayoutNode().getIntrinsicsPolicy().minIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            LayoutNode[] content = zSortedChildren.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode = content[i10];
                if (layoutNode.isPlaced()) {
                    layoutNode.draw$ui_release(canvas);
                }
                i10++;
            } while (i10 < size);
        }
        if (ownerRequireOwner.getShowLayoutBounds()) {
            drawBorder(canvas, f16783c1);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo3579placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        super.mo3579placeAtf8xVGno(position, zIndex, layerBlock);
        if (getIsShallowPlacing()) {
            return;
        }
        onPlaced();
        getLayoutNode().getMeasurePassDelegate$ui_release().onNodePlaced$ui_release();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void setLookaheadDelegate(@Nullable LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @NotNull
    public TailModifierNode getTail() {
        return this.tail;
    }

    public static /* synthetic */ void getTail$annotations() {
    }
}
