package androidx.compose.ui;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ZIndexModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/ZIndexElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/ZIndexNode;", "create", "node", "", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", "component1", "zIndex", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "F", "getZIndex", "()F", "<init>", "(F)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ZIndexElement extends ModifierNodeElement<ZIndexNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float zIndex;

    public ZIndexElement(float f6) {
        this.zIndex = f6;
    }

    public static /* synthetic */ ZIndexElement copy$default(ZIndexElement zIndexElement, float f6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = zIndexElement.zIndex;
        }
        return zIndexElement.copy(f6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    @NotNull
    public final ZIndexElement copy(float zIndex) {
        return new ZIndexElement(zIndex);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ZIndexElement) && Float.compare(this.zIndex, ((ZIndexElement) other).zIndex) == 0;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Float.floatToIntBits(this.zIndex);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", "zIndex").set("zIndex", Float.valueOf(this.zIndex));
    }

    @NotNull
    public String toString() {
        return u.i(new StringBuilder("ZIndexElement(zIndex="), this.zIndex, RootService.CLOSE_BRACKET);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public ZIndexNode create() {
        return new ZIndexNode(this.zIndex);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@NotNull ZIndexNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setZIndex(this.zIndex);
    }
}
