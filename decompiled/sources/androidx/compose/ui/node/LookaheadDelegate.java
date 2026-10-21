package androidx.compose.ui.node;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinatesImpl;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LookaheadDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u00101\u001a\u00020,¢\u0006\u0004\bj\u0010kJ\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0019\u0010\u0014\u001a\u0015\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011¢\u0006\u0002\b\u0013H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0018\u001a\u00020\tH\u0014J/\u0010!\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0086\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0016J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0016J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H\u0016J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H\u0016J \u0010+\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u0000H\u0000ø\u0001\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R+\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0003¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0017\u0010=\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050>8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0016\u0010F\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020\u001c8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010IR\u0014\u0010R\u001a\u00020O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0016\u0010Y\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010ER\u0014\u0010]\u001a\u00020Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0016\u0010i\u001a\u0004\u0018\u00010f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h\u0082\u0002\u0016\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0002\b!¨\u0006l"}, d2 = {"Landroidx/compose/ui/node/LookaheadDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "getCachedAlignmentLine$ui_release", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "getCachedAlignmentLine", "", "replace$ui_release", "()V", "replace", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "placeChildren", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/MeasureResult;", "block", "Landroidx/compose/ui/layout/Placeable;", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "performingMeasure", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "ancestor", "positionIn-Bjo55l4$ui_release", "(Landroidx/compose/ui/node/LookaheadDelegate;)J", "positionIn", "Landroidx/compose/ui/node/NodeCoordinator;", "w0", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "x0", "J", "getPosition-nOcc-ac", "()J", "setPosition--gyyYBs", "(J)V", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl;", "E0", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl;", "getLookaheadLayoutCoordinates", "()Landroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl;", "lookaheadLayoutCoordinates", "", "G0", "Ljava/util/Map;", "getCachedAlignmentLinesMap", "()Ljava/util/Map;", "cachedAlignmentLinesMap", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "child", "", "getHasMeasureResult", "()Z", "hasMeasureResult", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "measureResult", "isLookingAhead", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "()F", "density", "getFontScale", "fontScale", "getParent", "parent", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "", "getParentData", "()Ljava/lang/Object;", "parentData", "<init>", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,212:1\n1#2:213\n365#3,15:214\n86#4:229\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n165#1:214,15\n206#1:229\n*E\n"})
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @NotNull
    public final LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinates;

    @Nullable
    public MeasureResult F0;

    @NotNull
    public final LinkedHashMap G0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NodeCoordinator coordinator;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    public long position;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public LinkedHashMap f16857y0;

    public LookaheadDelegate(@NotNull NodeCoordinator coordinator) {
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        this.coordinator = coordinator;
        this.position = IntOffset.INSTANCE.m4517getZeronOccac();
        this.lookaheadLayoutCoordinates = new LookaheadLayoutCoordinatesImpl(this);
        this.G0 = new LinkedHashMap();
    }

    public static final void access$set_measureResult(LookaheadDelegate lookaheadDelegate, MeasureResult measureResult) {
        Unit unit;
        LinkedHashMap linkedHashMap;
        lookaheadDelegate.getClass();
        if (measureResult != null) {
            lookaheadDelegate.m3609setMeasuredSizeozmzZPI(IntSizeKt.IntSize(measureResult.getWidth(), measureResult.getHeight()));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            lookaheadDelegate.m3609setMeasuredSizeozmzZPI(IntSize.INSTANCE.m4554getZeroYbymL2g());
        }
        if (!Intrinsics.areEqual(lookaheadDelegate.F0, measureResult) && measureResult != null && ((((linkedHashMap = lookaheadDelegate.f16857y0) != null && !linkedHashMap.isEmpty()) || (!measureResult.getAlignmentLines().isEmpty())) && !Intrinsics.areEqual(measureResult.getAlignmentLines(), lookaheadDelegate.f16857y0))) {
            lookaheadDelegate.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            LinkedHashMap linkedHashMap2 = lookaheadDelegate.f16857y0;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                lookaheadDelegate.f16857y0 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(measureResult.getAlignmentLines());
        }
        lookaheadDelegate.F0 = measureResult;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = this.coordinator.getLayoutNode().getLayoutDelegate().getLookaheadAlignmentLinesOwner$ui_release();
        Intrinsics.checkNotNull(lookaheadAlignmentLinesOwner$ui_release);
        return lookaheadAlignmentLinesOwner$ui_release;
    }

    public final int getCachedAlignmentLine$ui_release(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        Integer num = (Integer) this.G0.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @NotNull
    public final Map<AlignmentLine, Integer> getCachedAlignmentLinesMap() {
        return this.G0;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getChild() {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        if (wrapped != null) {
            return wrapped.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @NotNull
    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this.F0 != null;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    @NotNull
    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    @NotNull
    public final LookaheadLayoutCoordinatesImpl getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this.F0;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getParent() {
        NodeCoordinator wrappedBy = this.coordinator.getWrappedBy();
        if (wrappedBy != null) {
            return wrappedBy.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: getPosition-nOcc-ac, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return true;
    }

    public int maxIntrinsicHeight(int width) {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        Intrinsics.checkNotNull(wrapped);
        LookaheadDelegate lookaheadDelegate = wrapped.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicHeight(width);
    }

    public int maxIntrinsicWidth(int height) {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        Intrinsics.checkNotNull(wrapped);
        LookaheadDelegate lookaheadDelegate = wrapped.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicWidth(height);
    }

    public int minIntrinsicHeight(int width) {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        Intrinsics.checkNotNull(wrapped);
        LookaheadDelegate lookaheadDelegate = wrapped.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicHeight(width);
    }

    public int minIntrinsicWidth(int height) {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        Intrinsics.checkNotNull(wrapped);
        LookaheadDelegate lookaheadDelegate = wrapped.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicWidth(height);
    }

    @NotNull
    /* JADX INFO: renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m3691performingMeasureK40F9xA(long constraints, @NotNull Function0<? extends MeasureResult> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        m3610setMeasurementConstraintsBRTryo0(constraints);
        access$set_measureResult(this, block.invoke());
        return this;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public final void mo3579placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        if (!IntOffset.m4506equalsimpl0(getPosition(), position)) {
            m3693setPositiongyyYBs(position);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLayoutNode().getLayoutDelegate().getLookaheadPassDelegate();
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.notifyChildrenUsingCoordinatesWhilePlacing();
            }
            invalidateAlignmentLinesFromPositionChange(this.coordinator);
        }
        if (getIsShallowPlacing()) {
            return;
        }
        placeChildren();
    }

    public void placeChildren() {
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
        int width = getMeasureResult$ui_release().getWidth();
        LayoutDirection layoutDirection = this.coordinator.getLayoutDirection();
        LayoutCoordinates layoutCoordinates = Placeable.PlacementScope.f16651c;
        int parentWidth = companion.getParentWidth();
        LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.f16652d;
        Placeable.PlacementScope.f16650b = width;
        Placeable.PlacementScope.f16649a = layoutDirection;
        boolean zAccess$configureForPlacingForAlignment = Placeable.PlacementScope.Companion.access$configureForPlacingForAlignment(companion, this);
        getMeasureResult$ui_release().placeChildren();
        setPlacingForAlignment$ui_release(zAccess$configureForPlacingForAlignment);
        Placeable.PlacementScope.f16650b = parentWidth;
        Placeable.PlacementScope.f16649a = parentLayoutDirection;
        Placeable.PlacementScope.f16651c = layoutCoordinates;
        Placeable.PlacementScope.f16652d = layoutNodeLayoutDelegate;
    }

    /* JADX INFO: renamed from: positionIn-Bjo55l4$ui_release, reason: not valid java name */
    public final long m3692positionInBjo55l4$ui_release(@NotNull LookaheadDelegate ancestor) {
        Intrinsics.checkNotNullParameter(ancestor, "ancestor");
        long jM4517getZeronOccac = IntOffset.INSTANCE.m4517getZeronOccac();
        LookaheadDelegate lookaheadDelegate = this;
        while (!Intrinsics.areEqual(lookaheadDelegate, ancestor)) {
            long position = lookaheadDelegate.getPosition();
            jM4517getZeronOccac = androidx.databinding.f.b(position, IntOffset.m4508getYimpl(jM4517getZeronOccac), IntOffset.m4507getXimpl(position) + IntOffset.m4507getXimpl(jM4517getZeronOccac));
            NodeCoordinator wrappedBy = lookaheadDelegate.coordinator.getWrappedBy();
            Intrinsics.checkNotNull(wrappedBy);
            lookaheadDelegate = wrappedBy.getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
        }
        return jM4517getZeronOccac;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo3579placeAtf8xVGno(getPosition(), 0.0f, null);
    }

    /* JADX INFO: renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m3693setPositiongyyYBs(long j10) {
        this.position = j10;
    }
}
