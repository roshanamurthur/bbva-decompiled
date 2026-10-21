package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/VerticalAlignNode;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/unit/Density;", "", "parentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "modifyParentData", "Landroidx/compose/ui/Alignment$Vertical;", "H0", "Landroidx/compose/ui/Alignment$Vertical;", "getVertical", "()Landroidx/compose/ui/Alignment$Vertical;", "setVertical", "(Landroidx/compose/ui/Alignment$Vertical;)V", "vertical", "<init>", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
public final class VerticalAlignNode extends Modifier.Node implements ParentDataModifierNode {

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @NotNull
    public Alignment.Vertical vertical;

    public VerticalAlignNode(@NotNull Alignment.Vertical vertical) {
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        this.vertical = vertical;
    }

    @NotNull
    public final Alignment.Vertical getVertical() {
        return this.vertical;
    }

    public final void setVertical(@NotNull Alignment.Vertical vertical) {
        Intrinsics.checkNotNullParameter(vertical, "<set-?>");
        this.vertical = vertical;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    @NotNull
    public RowColumnParentData modifyParentData(@NotNull Density density, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
        }
        rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.INSTANCE.vertical$foundation_layout_release(this.vertical));
        return rowColumnParentData;
    }
}
