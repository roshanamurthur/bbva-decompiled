package androidx.compose.foundation.layout;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x.d1;

/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lx/d1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
final class OffsetElement extends ModifierNodeElement<d1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Function1<InspectorInfo, Unit> f4291e;

    public OffsetElement() {
        throw null;
    }

    public OffsetElement(float f6, float f10, boolean z10, Function1 inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f4288b = f6;
        this.f4289c = f10;
        this.f4290d = z10;
        this.f4291e = inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        d1 d1Var = new d1();
        d1Var.H0 = this.f4288b;
        d1Var.I0 = this.f4289c;
        d1Var.J0 = this.f4290d;
        return d1Var;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        if (offsetElement == null) {
            return false;
        }
        return Dp.m4394equalsimpl0(this.f4288b, offsetElement.f4288b) && Dp.m4394equalsimpl0(this.f4289c, offsetElement.f4289c) && this.f4290d == offsetElement.f4290d;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return u.a(this.f4289c, Dp.m4395hashCodeimpl(this.f4288b) * 31, 31) + (this.f4290d ? 1231 : 1237);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        this.f4291e.invoke(inspectorInfo);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OffsetModifierElement(x=");
        sb2.append((Object) Dp.m4400toStringimpl(this.f4288b));
        sb2.append(", y=");
        sb2.append((Object) Dp.m4400toStringimpl(this.f4289c));
        sb2.append(", rtlAware=");
        return bc.org.bouncycastle.math.ec.custom.sec.a.d(sb2, this.f4290d, RootService.CLOSE_BRACKET);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        d1 node2 = (d1) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.H0 = this.f4288b;
        node2.I0 = this.f4289c;
        node2.J0 = this.f4290d;
    }
}
