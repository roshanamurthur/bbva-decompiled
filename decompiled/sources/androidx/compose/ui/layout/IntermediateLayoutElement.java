package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LookaheadScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/IntermediateLayoutElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/IntermediateLayoutModifierNode;", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class IntermediateLayoutElement extends ModifierNodeElement<IntermediateLayoutModifierNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function3<IntermediateMeasureScope, Measurable, Constraints, MeasureResult> f16543b;

    /* JADX WARN: Multi-variable type inference failed */
    public IntermediateLayoutElement(@NotNull Function3<? super IntermediateMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measure) {
        Intrinsics.checkNotNullParameter(measure, "measure");
        this.f16543b = measure;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new IntermediateLayoutModifierNode(this.f16543b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntermediateLayoutElement) && Intrinsics.areEqual(this.f16543b, ((IntermediateLayoutElement) obj).f16543b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f16543b.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", "intermediateLayout").set("measure", this.f16543b);
    }

    @NotNull
    public final String toString() {
        return "IntermediateLayoutElement(measure=" + this.f16543b + RootService.CLOSE_BRACKET;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        IntermediateLayoutModifierNode node2 = (IntermediateLayoutModifierNode) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.setMeasureBlock$ui_release(this.f16543b);
    }
}
