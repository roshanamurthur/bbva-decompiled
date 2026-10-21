package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LayoutId.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u000eJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R*\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdModifier;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/layout/LayoutIdParentData;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "<set-?>", "H0", "Ljava/lang/Object;", "getLayoutId", "()Ljava/lang/Object;", "setLayoutId$ui_release", "(Ljava/lang/Object;)V", "layoutId", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class LayoutIdModifier extends Modifier.Node implements ParentDataModifierNode, LayoutIdParentData {

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @NotNull
    public Object layoutId;

    public LayoutIdModifier(@NotNull Object layoutId) {
        Intrinsics.checkNotNullParameter(layoutId, "layoutId");
        this.layoutId = layoutId;
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    @NotNull
    public Object getLayoutId() {
        return this.layoutId;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    @Nullable
    public Object modifyParentData(@NotNull Density density, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        return this;
    }

    public void setLayoutId$ui_release(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.layoutId = obj;
    }
}
