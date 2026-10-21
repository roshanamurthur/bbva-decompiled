package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/HorizontalAlignNode;", "create", "node", "", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "Landroidx/compose/ui/Alignment$Horizontal;", "b", "Landroidx/compose/ui/Alignment$Horizontal;", "getHorizontal", "()Landroidx/compose/ui/Alignment$Horizontal;", "horizontal", "<init>", "(Landroidx/compose/ui/Alignment$Horizontal;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
public final class HorizontalAlignElement extends ModifierNodeElement<HorizontalAlignNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Alignment.Horizontal horizontal;

    public HorizontalAlignElement(@NotNull Alignment.Horizontal horizontal) {
        Intrinsics.checkNotNullParameter(horizontal, "horizontal");
        this.horizontal = horizontal;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = other instanceof HorizontalAlignElement ? (HorizontalAlignElement) other : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return Intrinsics.areEqual(this.horizontal, horizontalAlignElement.horizontal);
    }

    @NotNull
    public final Alignment.Horizontal getHorizontal() {
        return this.horizontal;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.horizontal.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("align");
        inspectorInfo.setValue(this.horizontal);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public HorizontalAlignNode create() {
        return new HorizontalAlignNode(this.horizontal);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@NotNull HorizontalAlignNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setHorizontal(this.horizontal);
    }
}
