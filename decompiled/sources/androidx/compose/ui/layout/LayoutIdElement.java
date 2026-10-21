package androidx.compose.ui.layout;

import androidx.camera.core.impl.v;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LayoutId.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/LayoutIdModifier;", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class LayoutIdElement extends ModifierNodeElement<LayoutIdModifier> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object f16565b;

    public LayoutIdElement(@NotNull Object layoutId) {
        Intrinsics.checkNotNullParameter(layoutId, "layoutId");
        this.f16565b = layoutId;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new LayoutIdModifier(this.f16565b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && Intrinsics.areEqual(this.f16565b, ((LayoutIdElement) obj).f16565b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f16565b.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("layoutId");
        inspectorInfo.setValue(this.f16565b);
    }

    @NotNull
    public final String toString() {
        return v.d(new StringBuilder("LayoutIdElement(layoutId="), this.f16565b, RootService.CLOSE_BRACKET);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        LayoutIdModifier node2 = (LayoutIdModifier) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.setLayoutId$ui_release(this.f16565b);
    }
}
