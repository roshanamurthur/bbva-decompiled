package androidx.compose.foundation.layout;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x.o1;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lx/o1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
final class SizeElement extends ModifierNodeElement<o1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Function1<InspectorInfo, Unit> f4369g;

    public SizeElement() {
        throw null;
    }

    public SizeElement(float f6, float f10, float f11, float f12, boolean z10, Function1 inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f4364b = f6;
        this.f4365c = f10;
        this.f4366d = f11;
        this.f4367e = f12;
        this.f4368f = z10;
        this.f4369g = inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        o1 o1Var = new o1();
        o1Var.H0 = this.f4364b;
        o1Var.I0 = this.f4365c;
        o1Var.J0 = this.f4366d;
        o1Var.K0 = this.f4367e;
        o1Var.L0 = this.f4368f;
        return o1Var;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return Dp.m4394equalsimpl0(this.f4364b, sizeElement.f4364b) && Dp.m4394equalsimpl0(this.f4365c, sizeElement.f4365c) && Dp.m4394equalsimpl0(this.f4366d, sizeElement.f4366d) && Dp.m4394equalsimpl0(this.f4367e, sizeElement.f4367e) && this.f4368f == sizeElement.f4368f;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return u.a(this.f4367e, u.a(this.f4366d, u.a(this.f4365c, Dp.m4395hashCodeimpl(this.f4364b) * 31, 31), 31), 31) + (this.f4368f ? 1231 : 1237);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        this.f4369g.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        o1 node2 = (o1) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.H0 = this.f4364b;
        node2.I0 = this.f4365c;
        node2.J0 = this.f4366d;
        node2.K0 = this.f4367e;
        node2.L0 = this.f4368f;
    }

    public /* synthetic */ SizeElement(float f6, float f10, float f11, float f12, boolean z10, Function1 function1, int i10) {
        this((i10 & 1) != 0 ? Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM() : f6, (i10 & 2) != 0 ? Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM() : f10, (i10 & 4) != 0 ? Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM() : f11, (i10 & 8) != 0 ? Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM() : f12, z10, function1);
    }
}
