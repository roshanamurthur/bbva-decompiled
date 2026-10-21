package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightNode;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/unit/Density;", "", "parentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "modifyParentData", "", "H0", "F", "getWeight", "()F", "setWeight", "(F)V", "weight", "", "I0", "Z", "getFill", "()Z", "setFill", "(Z)V", "fill", "<init>", "(FZ)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
public final class LayoutWeightNode extends Modifier.Node implements ParentDataModifierNode {

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public float weight;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    public boolean fill;

    public LayoutWeightNode(float f6, boolean z10) {
        this.weight = f6;
        this.fill = z10;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final void setFill(boolean z10) {
        this.fill = z10;
    }

    public final void setWeight(float f6) {
        this.weight = f6;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    @NotNull
    public RowColumnParentData modifyParentData(@NotNull Density density, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
        }
        rowColumnParentData.setWeight(this.weight);
        rowColumnParentData.setFill(this.fill);
        return rowColumnParentData;
    }
}
