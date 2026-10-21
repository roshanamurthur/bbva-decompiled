package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x.s1;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lx/s1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
final class UnspecifiedConstraintsElement extends ModifierNodeElement<s1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4406c;

    public UnspecifiedConstraintsElement(float f6, float f10) {
        this.f4405b = f6;
        this.f4406c = f10;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        s1 s1Var = new s1();
        s1Var.H0 = this.f4405b;
        s1Var.I0 = this.f4406c;
        return s1Var;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return Dp.m4394equalsimpl0(this.f4405b, unspecifiedConstraintsElement.f4405b) && Dp.m4394equalsimpl0(this.f4406c, unspecifiedConstraintsElement.f4406c);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Dp.m4395hashCodeimpl(this.f4406c) + (Dp.m4395hashCodeimpl(this.f4405b) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.b(this.f4405b, androidx.activity.a.c(inspectorInfo, "<this>", "defaultMinSize"), "minWidth", inspectorInfo).set("minHeight", Dp.m4387boximpl(this.f4406c));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        s1 node2 = (s1) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.H0 = this.f4405b;
        node2.I0 = this.f4406c;
    }
}
