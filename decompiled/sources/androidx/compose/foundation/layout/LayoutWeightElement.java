package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/LayoutWeightNode;", "create", "node", "", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "", "b", "F", "getWeight", "()F", "weight", "c", "Z", "getFill", "()Z", "fill", "<init>", "(FZ)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
public final class LayoutWeightElement extends ModifierNodeElement<LayoutWeightNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float weight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean fill;

    public LayoutWeightElement(float f6, boolean z10) {
        this.weight = f6;
        this.fill = z10;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = other instanceof LayoutWeightElement ? (LayoutWeightElement) other : null;
        if (layoutWeightElement == null) {
            return false;
        }
        return this.weight == layoutWeightElement.weight && this.fill == layoutWeightElement.fill;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final float getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (Float.floatToIntBits(this.weight) * 31) + (this.fill ? 1231 : 1237);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("weight");
        float f6 = this.weight;
        inspectorInfo.setValue(Float.valueOf(f6));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("weight", Float.valueOf(f6));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("fill", Boolean.valueOf(this.fill));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public LayoutWeightNode create() {
        return new LayoutWeightNode(this.weight, this.fill);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@NotNull LayoutWeightNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setWeight(this.weight);
        node.setFill(this.fill);
    }
}
