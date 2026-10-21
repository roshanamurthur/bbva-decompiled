package androidx.compose.ui.node;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.layout.MeasurePolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntrinsicsPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/node/IntrinsicsPolicy;", "", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "", "updateFrom", "", "height", "minIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "minLookaheadIntrinsicWidth", "minLookaheadIntrinsicHeight", "maxLookaheadIntrinsicWidth", "maxLookaheadIntrinsicHeight", "Landroidx/compose/ui/node/LayoutNode;", "a", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIntrinsicsPolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,89:1\n81#2:90\n107#2,2:91\n*S KotlinDebug\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n*L\n30#1:90\n30#1:91,2\n*E\n"})
public final class IntrinsicsPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LayoutNode layoutNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableState f16787b;

    public IntrinsicsPolicy(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        this.f16787b = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public final MeasurePolicy a() {
        MeasurePolicy measurePolicy = (MeasurePolicy) this.f16787b.getValue();
        if (measurePolicy != null) {
            return measurePolicy;
        }
        throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final int maxIntrinsicHeight(int width) {
        MeasurePolicy measurePolicyA = a();
        LayoutNode layoutNode = this.layoutNode;
        return measurePolicyA.maxIntrinsicHeight(layoutNode.getOuterCoordinator$ui_release(), layoutNode.getChildMeasurables$ui_release(), width);
    }

    public final int maxIntrinsicWidth(int height) {
        MeasurePolicy measurePolicyA = a();
        LayoutNode layoutNode = this.layoutNode;
        return measurePolicyA.maxIntrinsicWidth(layoutNode.getOuterCoordinator$ui_release(), layoutNode.getChildMeasurables$ui_release(), height);
    }

    public final int maxLookaheadIntrinsicHeight(int width) {
        MeasurePolicy measurePolicyA = a();
        LayoutNode layoutNode = this.layoutNode;
        return measurePolicyA.maxIntrinsicHeight(layoutNode.getOuterCoordinator$ui_release(), layoutNode.getChildLookaheadMeasurables$ui_release(), width);
    }

    public final int maxLookaheadIntrinsicWidth(int height) {
        MeasurePolicy measurePolicyA = a();
        LayoutNode layoutNode = this.layoutNode;
        return measurePolicyA.maxIntrinsicWidth(layoutNode.getOuterCoordinator$ui_release(), layoutNode.getChildLookaheadMeasurables$ui_release(), height);
    }

    public final int minIntrinsicHeight(int width) {
        MeasurePolicy measurePolicyA = a();
        LayoutNode layoutNode = this.layoutNode;
        return measurePolicyA.minIntrinsicHeight(layoutNode.getOuterCoordinator$ui_release(), layoutNode.getChildMeasurables$ui_release(), width);
    }

    public final int minIntrinsicWidth(int height) {
        MeasurePolicy measurePolicyA = a();
        LayoutNode layoutNode = this.layoutNode;
        return measurePolicyA.minIntrinsicWidth(layoutNode.getOuterCoordinator$ui_release(), layoutNode.getChildMeasurables$ui_release(), height);
    }

    public final int minLookaheadIntrinsicHeight(int width) {
        MeasurePolicy measurePolicyA = a();
        LayoutNode layoutNode = this.layoutNode;
        return measurePolicyA.minIntrinsicHeight(layoutNode.getOuterCoordinator$ui_release(), layoutNode.getChildLookaheadMeasurables$ui_release(), width);
    }

    public final int minLookaheadIntrinsicWidth(int height) {
        MeasurePolicy measurePolicyA = a();
        LayoutNode layoutNode = this.layoutNode;
        return measurePolicyA.minIntrinsicWidth(layoutNode.getOuterCoordinator$ui_release(), layoutNode.getChildLookaheadMeasurables$ui_release(), height);
    }

    public final void updateFrom(@NotNull MeasurePolicy measurePolicy) {
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        this.f16787b.setValue(measurePolicy);
    }
}
