package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.IntermediateLayoutModifierNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0002?@B\u0017\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010<\u001a\u00020\"¢\u0006\u0004\b=\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J@\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015¢\u0006\u0002\b\u0017H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016R*\u0010*\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R.\u00102\u001a\u0004\u0018\u00010+2\b\u0010#\u001a\u0004\u0018\u00010+8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00109\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b7\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "ensureLookaheadDelegateCreated", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "calculateAlignmentLine", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "performDraw", "Landroidx/compose/ui/node/LayoutModifierNode;", "<set-?>", "a1", "Landroidx/compose/ui/node/LayoutModifierNode;", "getLayoutModifierNode", "()Landroidx/compose/ui/node/LayoutModifierNode;", "setLayoutModifierNode$ui_release", "(Landroidx/compose/ui/node/LayoutModifierNode;)V", "layoutModifierNode", "Landroidx/compose/ui/node/LookaheadDelegate;", "c1", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "lookaheadDelegate", "Landroidx/compose/ui/Modifier$Node;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "tail", "getWrappedNonNull", "()Landroidx/compose/ui/node/NodeCoordinator;", "wrappedNonNull", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "measureNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutModifierNode;)V", "Companion", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n+ 2 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n*L\n1#1,223:1\n287#2,2:224\n1#3:226\n365#4,15:227\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n*L\n106#1:224,2\n167#1:227,15\n*E\n"})
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    @NotNull
    public static final Paint f16788d1;

    /* JADX INFO: renamed from: a1, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public LayoutModifierNode layoutModifierNode;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    @Nullable
    public Constraints f16790b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LookaheadDelegate lookaheadDelegate;

    /* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$Companion;", "", "()V", "modifierBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getModifierBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Paint getModifierBoundsPaint() {
            return LayoutModifierNodeCoordinator.f16788d1;
        }
    }

    /* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
    @SourceDebugExtension({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n1#1,223:1\n178#2,3:224\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n*L\n61#1:224,3\n*E\n"})
    public final class a extends LookaheadDelegate {
        public a() {
            super(LayoutModifierNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public final int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            int iAccess$calculateAlignmentAndPlaceChildAsNeeded = LayoutModifierNodeCoordinatorKt.access$calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(iAccess$calculateAlignmentAndPlaceChildAsNeeded));
            return iAccess$calculateAlignmentAndPlaceChildAsNeeded;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicHeight(int i10) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicHeight(this, lookaheadDelegate, i10);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicWidth(int i10) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicWidth(this, lookaheadDelegate, i10);
        }

        @Override // androidx.compose.ui.layout.Measurable
        @NotNull
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public final Placeable mo3575measureBRTryo0(long j10) {
            m3610setMeasurementConstraintsBRTryo0(j10);
            Constraints constraintsM4346boximpl = Constraints.m4346boximpl(j10);
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            layoutModifierNodeCoordinator.f16790b1 = constraintsM4346boximpl;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            LookaheadDelegate.access$set_measureResult(this, layoutModifierNode.mo172measure3p2s80s(this, lookaheadDelegate, j10));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicHeight(int i10) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicHeight(this, lookaheadDelegate, i10);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicWidth(int i10) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicWidth(this, lookaheadDelegate, i10);
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo2396setColor8_81llA(Color.INSTANCE.m2535getBlue0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo2400setStylek9PVt8s(PaintingStyle.INSTANCE.m2736getStrokeTiuSbCo());
        f16788d1 = Paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutModifierNodeCoordinator(@NotNull LayoutNode layoutNode, @NotNull LayoutModifierNode measureNode) {
        super(layoutNode);
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Intrinsics.checkNotNullParameter(measureNode, "measureNode");
        this.layoutModifierNode = measureNode;
        this.lookaheadDelegate = layoutNode.getLookaheadRoot() != null ? new a() : null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        return lookaheadDelegate != null ? lookaheadDelegate.getCachedAlignmentLine$ui_release(alignmentLine) : LayoutModifierNodeCoordinatorKt.access$calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new a());
        }
    }

    @NotNull
    public final LayoutModifierNode getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @Nullable
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @NotNull
    public Modifier.Node getTail() {
        return this.layoutModifierNode.getNode();
    }

    @NotNull
    public final NodeCoordinator getWrappedNonNull() {
        NodeCoordinator wrapped = getWrapped();
        Intrinsics.checkNotNull(wrapped);
        return wrapped;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
        IntermediateLayoutModifierNode intermediateLayoutModifierNode = layoutModifierNode instanceof IntermediateLayoutModifierNode ? (IntermediateLayoutModifierNode) layoutModifierNode : null;
        return intermediateLayoutModifierNode != null ? intermediateLayoutModifierNode.maxIntermediateIntrinsicHeight$ui_release(this, getWrappedNonNull(), width) : layoutModifierNode.maxIntrinsicHeight(this, getWrappedNonNull(), width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
        IntermediateLayoutModifierNode intermediateLayoutModifierNode = layoutModifierNode instanceof IntermediateLayoutModifierNode ? (IntermediateLayoutModifierNode) layoutModifierNode : null;
        return intermediateLayoutModifierNode != null ? intermediateLayoutModifierNode.maxIntermediateIntrinsicWidth$ui_release(this, getWrappedNonNull(), height) : layoutModifierNode.maxIntrinsicWidth(this, getWrappedNonNull(), height);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @NotNull
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public Placeable mo3575measureBRTryo0(long constraints) {
        MeasureResult measureResultMo172measure3p2s80s;
        m3610setMeasurementConstraintsBRTryo0(constraints);
        LayoutModifierNode layoutModifierNode = getLayoutModifierNode();
        if (layoutModifierNode instanceof IntermediateLayoutModifierNode) {
            IntermediateLayoutModifierNode intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode;
            NodeCoordinator wrappedNonNull = getWrappedNonNull();
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            MeasureResult measureResult$ui_release = lookaheadDelegate.getMeasureResult$ui_release();
            long jIntSize = IntSizeKt.IntSize(measureResult$ui_release.getWidth(), measureResult$ui_release.getHeight());
            Constraints constraints2 = this.f16790b1;
            Intrinsics.checkNotNull(constraints2);
            measureResultMo172measure3p2s80s = intermediateLayoutModifierNode.m3576intermediateMeasureTeuZzU(this, wrappedNonNull, constraints, jIntSize, constraints2.getF18296a());
        } else {
            measureResultMo172measure3p2s80s = layoutModifierNode.mo172measure3p2s80s(this, getWrappedNonNull(), constraints);
        }
        setMeasureResult$ui_release(measureResultMo172measure3p2s80s);
        onMeasured();
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
        IntermediateLayoutModifierNode intermediateLayoutModifierNode = layoutModifierNode instanceof IntermediateLayoutModifierNode ? (IntermediateLayoutModifierNode) layoutModifierNode : null;
        return intermediateLayoutModifierNode != null ? intermediateLayoutModifierNode.minIntermediateIntrinsicHeight$ui_release(this, getWrappedNonNull(), width) : layoutModifierNode.minIntrinsicHeight(this, getWrappedNonNull(), width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
        IntermediateLayoutModifierNode intermediateLayoutModifierNode = layoutModifierNode instanceof IntermediateLayoutModifierNode ? (IntermediateLayoutModifierNode) layoutModifierNode : null;
        return intermediateLayoutModifierNode != null ? intermediateLayoutModifierNode.minIntermediateIntrinsicWidth$ui_release(this, getWrappedNonNull(), height) : layoutModifierNode.minIntrinsicWidth(this, getWrappedNonNull(), height);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getWrappedNonNull().draw(canvas);
        if (LayoutNodeKt.requireOwner(getLayoutNode()).getShowLayoutBounds()) {
            drawBorder(canvas, f16788d1);
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
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
        int iM4549getWidthimpl = IntSize.m4549getWidthimpl(getMeasuredSize());
        LayoutDirection layoutDirection = getLayoutDirection();
        LayoutCoordinates layoutCoordinates = Placeable.PlacementScope.f16651c;
        int parentWidth = companion.getParentWidth();
        LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.f16652d;
        Placeable.PlacementScope.f16650b = iM4549getWidthimpl;
        Placeable.PlacementScope.f16649a = layoutDirection;
        boolean zAccess$configureForPlacingForAlignment = Placeable.PlacementScope.Companion.access$configureForPlacingForAlignment(companion, this);
        getMeasureResult$ui_release().placeChildren();
        setPlacingForAlignment$ui_release(zAccess$configureForPlacingForAlignment);
        Placeable.PlacementScope.f16650b = parentWidth;
        Placeable.PlacementScope.f16649a = parentLayoutDirection;
        Placeable.PlacementScope.f16651c = layoutCoordinates;
        Placeable.PlacementScope.f16652d = layoutNodeLayoutDelegate;
    }

    public final void setLayoutModifierNode$ui_release(@NotNull LayoutModifierNode layoutModifierNode) {
        Intrinsics.checkNotNullParameter(layoutModifierNode, "<set-?>");
        this.layoutModifierNode = layoutModifierNode;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void setLookaheadDelegate(@Nullable LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }
}
