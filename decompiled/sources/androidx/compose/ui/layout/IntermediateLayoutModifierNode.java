package androidx.compose.ui.layout;

import androidx.collection.k;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IntermediateLayoutModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u000267BM\u0012A\u0010-\u001a=\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\"¢\u0006\u0002\b&ø\u0001\u0001¢\u0006\u0004\b5\u0010,J\b\u0010\u0004\u001a\u00020\u0003H\u0016J)\u0010\r\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0013\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u001a\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001d\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001c\u0010\u0019J#\u0010\u001f\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001e\u0010\u0019J#\u0010!\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0016H\u0000¢\u0006\u0004\b \u0010\u0019R`\u0010-\u001a=\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\"¢\u0006\u0002\b&8\u0000@\u0000X\u0080\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00101\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00068"}, d2 = {"Landroidx/compose/ui/layout/IntermediateLayoutModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "", "onAttach", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/unit/IntSize;", "lookaheadSize", "lookaheadConstraints", "intermediateMeasure-Te-uZzU", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;JJJ)Landroidx/compose/ui/layout/MeasureResult;", "intermediateMeasure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntermediateIntrinsicWidth$ui_release", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "minIntermediateIntrinsicWidth", "width", "minIntermediateIntrinsicHeight$ui_release", "minIntermediateIntrinsicHeight", "maxIntermediateIntrinsicWidth$ui_release", "maxIntermediateIntrinsicWidth", "maxIntermediateIntrinsicHeight$ui_release", "maxIntermediateIntrinsicHeight", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/IntermediateMeasureScope;", "Lkotlin/ParameterName;", "name", "Lkotlin/ExtensionFunctionType;", "H0", "Lkotlin/jvm/functions/Function3;", "getMeasureBlock$ui_release", "()Lkotlin/jvm/functions/Function3;", "setMeasureBlock$ui_release", "(Lkotlin/jvm/functions/Function3;)V", "measureBlock", "", "L0", "Z", "isIntermediateChangeActive", "()Z", "setIntermediateChangeActive", "(Z)V", "<init>", "a", "IntermediateMeasureScopeImpl", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIntermediateLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntermediateLayoutModifierNode.kt\nandroidx/compose/ui/layout/IntermediateLayoutModifierNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,333:1\n88#2:334\n230#3,5:335\n58#3:340\n59#3,8:342\n383#3,6:350\n393#3,2:357\n395#3,8:362\n403#3,9:373\n412#3,8:385\n68#3,7:393\n1#4:341\n261#5:356\n234#6,3:359\n237#6,3:382\n1182#7:370\n1161#7,2:371\n*S KotlinDebug\n*F\n+ 1 IntermediateLayoutModifierNode.kt\nandroidx/compose/ui/layout/IntermediateLayoutModifierNode\n*L\n101#1:334\n101#1:335,5\n101#1:340\n101#1:342,8\n101#1:350,6\n101#1:357,2\n101#1:362,8\n101#1:373,9\n101#1:385,8\n101#1:393,7\n101#1:341\n101#1:356\n101#1:359,3\n101#1:382,3\n101#1:370\n101#1:371,2\n*E\n"})
public final class IntermediateLayoutModifierNode extends Modifier.Node implements LayoutModifierNode {

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @NotNull
    public Function3<? super IntermediateMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measureBlock;

    @NotNull
    public final IntermediateMeasureScopeImpl I0;

    @NotNull
    public final LookaheadScopeImpl J0;

    @NotNull
    public LookaheadScopeImpl K0;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public boolean isIntermediateChangeActive;

    @Nullable
    public Constraints M0;

    @Nullable
    public a N0;

    /* JADX INFO: compiled from: IntermediateLayoutModifierNode.kt */
    @ExperimentalComposeUiApi
    @SourceDebugExtension({"SMAP\nIntermediateLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntermediateLayoutModifierNode.kt\nandroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
    public final class IntermediateMeasureScopeImpl implements IntermediateMeasureScope, CoroutineScope {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public long f16544p0 = IntSize.INSTANCE.m4554getZeroYbymL2g();

        public IntermediateMeasureScopeImpl() {
        }

        @Override // kotlinx.coroutines.CoroutineScope
        @NotNull
        public final CoroutineContext getCoroutineContext() {
            return IntermediateLayoutModifierNode.this.getCoroutineScope().getCoroutineContext();
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getDensity() {
            NodeCoordinator coordinator = IntermediateLayoutModifierNode.this.getCoordinator();
            Intrinsics.checkNotNull(coordinator);
            return coordinator.getDensity();
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getFontScale() {
            NodeCoordinator coordinator = IntermediateLayoutModifierNode.this.getCoordinator();
            Intrinsics.checkNotNull(coordinator);
            return coordinator.getFontScale();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        @NotNull
        public final LayoutDirection getLayoutDirection() {
            NodeCoordinator coordinator = IntermediateLayoutModifierNode.this.getCoordinator();
            Intrinsics.checkNotNull(coordinator);
            return coordinator.getLayoutDirection();
        }

        @Override // androidx.compose.ui.layout.LookaheadScope
        @NotNull
        public final LayoutCoordinates getLookaheadScopeCoordinates(@NotNull Placeable.PlacementScope placementScope) {
            Intrinsics.checkNotNullParameter(placementScope, "<this>");
            return IntermediateLayoutModifierNode.this.K0.getLookaheadScopeCoordinates(placementScope);
        }

        @Override // androidx.compose.ui.layout.IntermediateMeasureScope
        /* JADX INFO: renamed from: getLookaheadSize-YbymL2g, reason: not valid java name */
        public final long mo3577getLookaheadSizeYbymL2g() {
            return this.f16544p0;
        }

        @Override // androidx.compose.ui.layout.LookaheadScope
        public final /* synthetic */ Modifier intermediateLayout(Modifier modifier, Function4 function4) {
            return androidx.compose.ui.layout.c.a(this, modifier, function4);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public final boolean isLookingAhead() {
            return false;
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        @NotNull
        public final MeasureResult layout(final int i10, final int i11, @NotNull final Map<AlignmentLine, Integer> alignmentLines, @NotNull final Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            final IntermediateLayoutModifierNode intermediateLayoutModifierNode = IntermediateLayoutModifierNode.this;
            return new MeasureResult(i10, i11, alignmentLines, this, intermediateLayoutModifierNode, placementBlock) { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl$layout$1

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final int width;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final int height;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                @NotNull
                public final Map<AlignmentLine, Integer> alignmentLines;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f16549d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ IntermediateLayoutModifierNode.IntermediateMeasureScopeImpl f16550e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ IntermediateLayoutModifierNode f16551f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Function1<Placeable.PlacementScope, Unit> f16552g;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f16549d = i10;
                    this.f16550e = this;
                    this.f16551f = intermediateLayoutModifierNode;
                    this.f16552g = placementBlock;
                    this.width = i10;
                    this.height = i11;
                    this.alignmentLines = alignmentLines;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                @NotNull
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return this.alignmentLines;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return this.height;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return this.width;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
                    LayoutDirection layoutDirection = this.f16550e.getLayoutDirection();
                    NodeCoordinator coordinator = this.f16551f.getCoordinator();
                    LayoutCoordinates layoutCoordinates = Placeable.PlacementScope.f16651c;
                    int parentWidth = companion.getParentWidth();
                    LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.f16652d;
                    Placeable.PlacementScope.f16650b = this.f16549d;
                    Placeable.PlacementScope.f16649a = layoutDirection;
                    boolean zAccess$configureForPlacingForAlignment = Placeable.PlacementScope.Companion.access$configureForPlacingForAlignment(companion, coordinator);
                    this.f16552g.invoke(companion);
                    if (coordinator != null) {
                        coordinator.setPlacingForAlignment$ui_release(zAccess$configureForPlacingForAlignment);
                    }
                    Placeable.PlacementScope.f16650b = parentWidth;
                    Placeable.PlacementScope.f16649a = parentLayoutDirection;
                    Placeable.PlacementScope.f16651c = layoutCoordinates;
                    Placeable.PlacementScope.f16652d = layoutNodeLayoutDelegate;
                }
            };
        }

        @Override // androidx.compose.ui.layout.LookaheadScope
        /* JADX INFO: renamed from: localLookaheadPositionOf-dBAh8RU, reason: not valid java name */
        public final /* synthetic */ long mo3578localLookaheadPositionOfdBAh8RU(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
            return androidx.compose.ui.layout.c.b(this, layoutCoordinates, layoutCoordinates2);
        }

        @Override // androidx.compose.ui.layout.LookaheadScope
        @Deprecated(message = "onPlaced in LookaheadLayoutScope has been deprecated. It's replaced with reading LookaheadLayoutCoordinates directly during placement inIntermediateMeasureScope")
        @NotNull
        public final Modifier onPlaced(@NotNull Modifier modifier, @NotNull Function2<? super LookaheadLayoutCoordinates, ? super LookaheadLayoutCoordinates, Unit> onPlaced) {
            Intrinsics.checkNotNullParameter(modifier, "<this>");
            Intrinsics.checkNotNullParameter(onPlaced, "onPlaced");
            return IntermediateLayoutModifierNode.this.K0.onPlaced(modifier, onPlaced);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public final /* synthetic */ int mo412roundToPxR2X_6o(long j10) {
            return x1.a.a(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public final /* synthetic */ int mo413roundToPx0680j_4(float f6) {
            return x1.a.b(this, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public final /* synthetic */ float mo404toDpGaN1DYA(long j10) {
            return x1.a.c(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public final /* synthetic */ float mo405toDpu2uoSUM(float f6) {
            return x1.a.d(this, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public final /* synthetic */ long mo407toDpSizekrfVVM(long j10) {
            return x1.a.f(this, j10);
        }

        @Override // androidx.compose.ui.layout.LookaheadScope
        @NotNull
        public final LayoutCoordinates toLookaheadCoordinates(@NotNull LayoutCoordinates layoutCoordinates) {
            Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
            return IntermediateLayoutModifierNode.this.K0.toLookaheadCoordinates(layoutCoordinates);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public final /* synthetic */ float mo414toPxR2X_6o(long j10) {
            return x1.a.g(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public final /* synthetic */ float mo415toPx0680j_4(float f6) {
            return x1.a.h(this, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        public final /* synthetic */ Rect toRect(DpRect dpRect) {
            return x1.a.i(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public final /* synthetic */ long mo408toSizeXkaWNTQ(long j10) {
            return x1.a.j(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public final /* synthetic */ long mo409toSp0xMU5do(float f6) {
            return x1.a.k(this, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public final /* synthetic */ long mo410toSpkPz2Gy4(float f6) {
            return x1.a.l(this, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public final /* synthetic */ float mo406toDpu2uoSUM(int i10) {
            return x1.a.e(this, i10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public final /* synthetic */ long mo411toSpkPz2Gy4(int i10) {
            return x1.a.m(this, i10);
        }
    }

    /* JADX INFO: compiled from: IntermediateLayoutModifierNode.kt */
    public final class a extends Placeable implements Measurable {

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        @NotNull
        public Measurable f16553u0;

        @Nullable
        public Placeable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ IntermediateLayoutModifierNode f16554w0;

        public a(@NotNull IntermediateLayoutModifierNode intermediateLayoutModifierNode, Measurable wrappedMeasurable) {
            Intrinsics.checkNotNullParameter(wrappedMeasurable, "wrappedMeasurable");
            this.f16554w0 = intermediateLayoutModifierNode;
            this.f16553u0 = wrappedMeasurable;
        }

        @Override // androidx.compose.ui.layout.Measured
        public final int get(@NotNull AlignmentLine alignmentLine) {
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            Placeable placeable = this.v0;
            Intrinsics.checkNotNull(placeable);
            return placeable.get(alignmentLine);
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        @Nullable
        public final Object getParentData() {
            return this.f16553u0.getParentData();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicHeight(int i10) {
            return this.f16553u0.maxIntrinsicHeight(i10);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicWidth(int i10) {
            return this.f16553u0.maxIntrinsicWidth(i10);
        }

        @Override // androidx.compose.ui.layout.Measurable
        @NotNull
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public final Placeable mo3575measureBRTryo0(long j10) {
            Placeable placeableMo3575measureBRTryo0;
            IntermediateLayoutModifierNode intermediateLayoutModifierNode = this.f16554w0;
            if (intermediateLayoutModifierNode.getIsIntermediateChangeActive()) {
                placeableMo3575measureBRTryo0 = this.f16553u0.mo3575measureBRTryo0(j10);
                m3610setMeasurementConstraintsBRTryo0(j10);
                m3609setMeasuredSizeozmzZPI(IntSizeKt.IntSize(placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight()));
            } else {
                Measurable measurable = this.f16553u0;
                Constraints constraints = intermediateLayoutModifierNode.M0;
                Intrinsics.checkNotNull(constraints);
                Placeable placeableMo3575measureBRTryo1 = measurable.mo3575measureBRTryo0(constraints.getF18296a());
                Constraints constraints2 = intermediateLayoutModifierNode.M0;
                Intrinsics.checkNotNull(constraints2);
                m3610setMeasurementConstraintsBRTryo0(constraints2.getF18296a());
                m3609setMeasuredSizeozmzZPI(intermediateLayoutModifierNode.getIsIntermediateChangeActive() ? IntSizeKt.IntSize(placeableMo3575measureBRTryo1.getWidth(), placeableMo3575measureBRTryo1.getHeight()) : intermediateLayoutModifierNode.I0.f16544p0);
                placeableMo3575measureBRTryo0 = placeableMo3575measureBRTryo1;
            }
            this.v0 = placeableMo3575measureBRTryo0;
            return this;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicHeight(int i10) {
            return this.f16553u0.minIntrinsicHeight(i10);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicWidth(int i10) {
            return this.f16553u0.minIntrinsicWidth(i10);
        }

        @Override // androidx.compose.ui.layout.Placeable
        /* JADX INFO: renamed from: placeAt-f8xVGno, reason: not valid java name */
        public final void mo3579placeAtf8xVGno(long j10, float f6, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            Unit unit;
            if (!this.f16554w0.getIsIntermediateChangeActive()) {
                j10 = IntOffset.INSTANCE.m4517getZeronOccac();
            }
            if (function1 != null) {
                Placeable placeable = this.v0;
                if (placeable != null) {
                    Placeable.PlacementScope.INSTANCE.m3620placeWithLayeraW9wM(placeable, j10, f6, function1);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit != null) {
                    return;
                }
            }
            Placeable placeable2 = this.v0;
            if (placeable2 != null) {
                Placeable.PlacementScope.INSTANCE.m3615place70tqf50(placeable2, j10, f6);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: compiled from: IntermediateLayoutModifierNode.kt */
    public static final class b extends Lambda implements Function0<LayoutCoordinates> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LayoutCoordinates invoke() {
            NodeCoordinator coordinator = IntermediateLayoutModifierNode.this.getCoordinator();
            Intrinsics.checkNotNull(coordinator);
            return coordinator;
        }
    }

    /* JADX INFO: compiled from: IntermediateLayoutModifierNode.kt */
    public static final class c implements NodeMeasuringIntrinsics.MeasureBlock {
        public c() {
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
        public final MeasureResult mo3580measure3p2s80s(@NotNull MeasureScope maxHeight, @NotNull Measurable intrinsicMeasurable, long j10) {
            Intrinsics.checkNotNullParameter(maxHeight, "$this$maxHeight");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            IntermediateLayoutModifierNode intermediateLayoutModifierNode = IntermediateLayoutModifierNode.this;
            return intermediateLayoutModifierNode.getMeasureBlock$ui_release().invoke(intermediateLayoutModifierNode.I0, intrinsicMeasurable, Constraints.m4346boximpl(j10));
        }
    }

    /* JADX INFO: compiled from: IntermediateLayoutModifierNode.kt */
    public static final class d implements NodeMeasuringIntrinsics.MeasureBlock {
        public d() {
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo3580measure3p2s80s(@NotNull MeasureScope maxWidth, @NotNull Measurable intrinsicMeasurable, long j10) {
            Intrinsics.checkNotNullParameter(maxWidth, "$this$maxWidth");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            IntermediateLayoutModifierNode intermediateLayoutModifierNode = IntermediateLayoutModifierNode.this;
            return intermediateLayoutModifierNode.getMeasureBlock$ui_release().invoke(intermediateLayoutModifierNode.I0, intrinsicMeasurable, Constraints.m4346boximpl(j10));
        }
    }

    /* JADX INFO: compiled from: IntermediateLayoutModifierNode.kt */
    public static final class e extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f16558p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Placeable placeable) {
            super(1);
            this.f16558p0 = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.place$default(layout, this.f16558p0, 0, 0, 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: IntermediateLayoutModifierNode.kt */
    public static final class f implements NodeMeasuringIntrinsics.MeasureBlock {
        public f() {
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo3580measure3p2s80s(@NotNull MeasureScope minHeight, @NotNull Measurable intrinsicMeasurable, long j10) {
            Intrinsics.checkNotNullParameter(minHeight, "$this$minHeight");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            IntermediateLayoutModifierNode intermediateLayoutModifierNode = IntermediateLayoutModifierNode.this;
            return intermediateLayoutModifierNode.getMeasureBlock$ui_release().invoke(intermediateLayoutModifierNode.I0, intrinsicMeasurable, Constraints.m4346boximpl(j10));
        }
    }

    /* JADX INFO: compiled from: IntermediateLayoutModifierNode.kt */
    public static final class g implements NodeMeasuringIntrinsics.MeasureBlock {
        public g() {
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo3580measure3p2s80s(@NotNull MeasureScope minWidth, @NotNull Measurable intrinsicMeasurable, long j10) {
            Intrinsics.checkNotNullParameter(minWidth, "$this$minWidth");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            IntermediateLayoutModifierNode intermediateLayoutModifierNode = IntermediateLayoutModifierNode.this;
            return intermediateLayoutModifierNode.getMeasureBlock$ui_release().invoke(intermediateLayoutModifierNode.I0, intrinsicMeasurable, Constraints.m4346boximpl(j10));
        }
    }

    /* JADX INFO: compiled from: IntermediateLayoutModifierNode.kt */
    public static final class h extends Lambda implements Function0<LayoutCoordinates> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LayoutNode f16561p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LayoutNode layoutNode) {
            super(0);
            this.f16561p0 = layoutNode;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LayoutCoordinates invoke() {
            LayoutNode parent$ui_release = this.f16561p0.getParent$ui_release();
            Intrinsics.checkNotNull(parent$ui_release);
            return parent$ui_release.getInnerCoordinator$ui_release().getCoordinates();
        }
    }

    public IntermediateLayoutModifierNode(@NotNull Function3<? super IntermediateMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measureBlock) {
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        this.measureBlock = measureBlock;
        this.I0 = new IntermediateMeasureScopeImpl();
        LookaheadScopeImpl lookaheadScopeImpl = new LookaheadScopeImpl(new b());
        this.J0 = lookaheadScopeImpl;
        this.K0 = lookaheadScopeImpl;
        this.isIntermediateChangeActive = true;
    }

    @NotNull
    public final Function3<IntermediateMeasureScope, Measurable, Constraints, MeasureResult> getMeasureBlock$ui_release() {
        return this.measureBlock;
    }

    @NotNull
    /* JADX INFO: renamed from: intermediateMeasure-Te-uZzU, reason: not valid java name */
    public final MeasureResult m3576intermediateMeasureTeuZzU(@NotNull MeasureScope intermediateMeasure, @NotNull Measurable measurable, long j10, long j11, long j12) {
        Intrinsics.checkNotNullParameter(intermediateMeasure, "$this$intermediateMeasure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        IntermediateMeasureScopeImpl intermediateMeasureScopeImpl = this.I0;
        intermediateMeasureScopeImpl.f16544p0 = j11;
        this.M0 = Constraints.m4346boximpl(j12);
        a aVar = this.N0;
        if (aVar == null) {
            aVar = new a(this, measurable);
        }
        this.N0 = aVar;
        Intrinsics.checkNotNullParameter(measurable, "<set-?>");
        aVar.f16553u0 = measurable;
        return this.measureBlock.invoke(intermediateMeasureScopeImpl, aVar, Constraints.m4346boximpl(j10));
    }

    /* JADX INFO: renamed from: isIntermediateChangeActive, reason: from getter */
    public final boolean getIsIntermediateChangeActive() {
        return this.isIntermediateChangeActive;
    }

    public final int maxIntermediateIntrinsicHeight$ui_release(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new c(), intrinsicMeasureScope, measurable, i10);
    }

    public final int maxIntermediateIntrinsicWidth$ui_release(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new d(), intrinsicMeasureScope, measurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.node.a.a(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.node.a.b(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo172measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(j10);
        return MeasureScope.CC.q(measure, placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight(), null, new e(placeableMo3575measureBRTryo0), 4, null);
    }

    public final int minIntermediateIntrinsicHeight$ui_release(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new f(), intrinsicMeasureScope, measurable, i10);
    }

    public final int minIntermediateIntrinsicWidth$ui_release(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new g(), intrinsicMeasureScope, measurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.node.a.c(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.node.a.d(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        LookaheadScopeImpl lookaheadScopeImpl;
        LookaheadScopeImpl lookaheadScopeImpl2;
        NodeChain nodes;
        NodeCoordinator coordinator = getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        LayoutNode layoutNode = coordinator.getLayoutNode();
        NodeCoordinator coordinator2 = getCoordinator();
        Intrinsics.checkNotNull(coordinator2);
        LookaheadDelegate lookaheadDelegate = coordinator2.getLookaheadDelegate();
        if ((lookaheadDelegate != null ? lookaheadDelegate.getLookaheadLayoutCoordinates() : null) == null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        LayoutNode lookaheadRoot = layoutNode.getLookaheadRoot();
        if (lookaheadRoot == null || !lookaheadRoot.getIsVirtualLookaheadRoot()) {
            int iM3725constructorimpl = NodeKind.m3725constructorimpl(512);
            if (!getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent = getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
            IntermediateLayoutModifierNode intermediateLayoutModifierNode = null;
            while (layoutNodeRequireLayoutNode != null) {
                if ((k.a(layoutNodeRequireLayoutNode) & iM3725constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iM3725constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            Modifier.Node nodeAccess$pop = parent;
                            while (nodeAccess$pop != null) {
                                if (nodeAccess$pop instanceof IntermediateLayoutModifierNode) {
                                    intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) nodeAccess$pop;
                                } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                    int i10 = 0;
                                    for (Modifier.Node delegate = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & iM3725constructorimpl) != 0) {
                                            i10++;
                                            if (i10 == 1) {
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
                parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail$ui_release();
            }
            if (intermediateLayoutModifierNode == null || (lookaheadScopeImpl = intermediateLayoutModifierNode.J0) == null) {
                lookaheadScopeImpl = this.J0;
            }
            lookaheadScopeImpl2 = lookaheadScopeImpl;
        } else {
            lookaheadScopeImpl2 = new LookaheadScopeImpl(new h(lookaheadRoot));
        }
        this.K0 = lookaheadScopeImpl2;
    }

    public final void setIntermediateChangeActive(boolean z10) {
        this.isIntermediateChangeActive = z10;
    }

    public final void setMeasureBlock$ui_release(@NotNull Function3<? super IntermediateMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.measureBlock = function3;
    }
}
