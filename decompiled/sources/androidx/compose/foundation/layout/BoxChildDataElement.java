package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x.i;

/* JADX INFO: compiled from: Box.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lx/i;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
final class BoxChildDataElement extends ModifierNodeElement<i> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Alignment f4196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function1<InspectorInfo, Unit> f4198d;

    /* JADX WARN: Multi-variable type inference failed */
    public BoxChildDataElement(@NotNull Alignment alignment, boolean z10, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f4196b = alignment;
        this.f4197c = z10;
        this.f4198d = inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        Alignment alignment = this.f4196b;
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        i iVar = new i();
        iVar.H0 = alignment;
        iVar.I0 = this.f4197c;
        return iVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f4196b, boxChildDataElement.f4196b) && this.f4197c == boxChildDataElement.f4197c;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (this.f4196b.hashCode() * 31) + (this.f4197c ? 1231 : 1237);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        this.f4198d.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        i node2 = (i) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        Alignment alignment = this.f4196b;
        Intrinsics.checkNotNullParameter(alignment, "<set-?>");
        node2.H0 = alignment;
        node2.I0 = this.f4197c;
    }
}
