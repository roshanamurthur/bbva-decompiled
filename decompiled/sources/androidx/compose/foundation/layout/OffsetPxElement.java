package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x.e1;

/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lx/e1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
final class OffsetPxElement extends ModifierNodeElement<e1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<Density, IntOffset> f4298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function1<InspectorInfo, Unit> f4300d;

    public OffsetPxElement(@NotNull Function1 offset, @NotNull Function1 inspectorInfo, boolean z10) {
        Intrinsics.checkNotNullParameter(offset, "offset");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f4298b = offset;
        this.f4299c = z10;
        this.f4300d = inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        Function1<Density, IntOffset> offset = this.f4298b;
        Intrinsics.checkNotNullParameter(offset, "offset");
        e1 e1Var = new e1();
        e1Var.H0 = offset;
        e1Var.I0 = this.f4299c;
        return e1Var;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        if (offsetPxElement == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f4298b, offsetPxElement.f4298b) && this.f4299c == offsetPxElement.f4299c;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (this.f4298b.hashCode() * 31) + (this.f4299c ? 1231 : 1237);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        this.f4300d.invoke(inspectorInfo);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OffsetPxModifier(offset=");
        sb2.append(this.f4298b);
        sb2.append(", rtlAware=");
        return bc.org.bouncycastle.math.ec.custom.sec.a.d(sb2, this.f4299c, RootService.CLOSE_BRACKET);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        e1 node2 = (e1) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        Function1<Density, IntOffset> function1 = this.f4298b;
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        node2.H0 = function1;
        node2.I0 = this.f4299c;
    }
}
