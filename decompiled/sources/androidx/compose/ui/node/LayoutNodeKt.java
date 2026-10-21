package androidx.compose.ui.node;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LayoutNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/Owner;", "requireOwner", "child", "", "add", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class LayoutNodeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Density f16816a = DensityKt.Density$default(1.0f, 0.0f, 2, null);

    public static final void add(@NotNull LayoutNode layoutNode, @NotNull LayoutNode child) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        layoutNode.insertAt$ui_release(layoutNode.getChildren$ui_release().size(), child);
    }

    @NotNull
    public static final Owner requireOwner(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        Owner owner = layoutNode.getOwner();
        if (owner != null) {
            return owner;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }
}
