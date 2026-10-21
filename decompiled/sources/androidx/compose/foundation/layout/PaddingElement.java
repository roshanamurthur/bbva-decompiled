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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x.f1;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lx/f1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingElement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingElement\n*L\n327#1:468\n328#1:469\n329#1:470\n330#1:471\n*E\n"})
final class PaddingElement extends ModifierNodeElement<f1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Function1<InspectorInfo, Unit> f4307g;

    public PaddingElement() {
        throw null;
    }

    public PaddingElement(float f6, float f10, float f11, float f12, boolean z10, Function1 inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f4302b = f6;
        this.f4303c = f10;
        this.f4304d = f11;
        this.f4305e = f12;
        this.f4306f = z10;
        this.f4307g = inspectorInfo;
        if ((f6 < 0.0f && !Dp.m4394equalsimpl0(f6, Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM())) || ((f10 < 0.0f && !Dp.m4394equalsimpl0(f10, Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM())) || ((f11 < 0.0f && !Dp.m4394equalsimpl0(f11, Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM())) || (f12 < 0.0f && !Dp.m4394equalsimpl0(f12, Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM()))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        f1 f1Var = new f1();
        f1Var.H0 = this.f4302b;
        f1Var.I0 = this.f4303c;
        f1Var.J0 = this.f4304d;
        f1Var.K0 = this.f4305e;
        f1Var.L0 = this.f4306f;
        return f1Var;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && Dp.m4394equalsimpl0(this.f4302b, paddingElement.f4302b) && Dp.m4394equalsimpl0(this.f4303c, paddingElement.f4303c) && Dp.m4394equalsimpl0(this.f4304d, paddingElement.f4304d) && Dp.m4394equalsimpl0(this.f4305e, paddingElement.f4305e) && this.f4306f == paddingElement.f4306f;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return u.a(this.f4305e, u.a(this.f4304d, u.a(this.f4303c, Dp.m4395hashCodeimpl(this.f4302b) * 31, 31), 31), 31) + (this.f4306f ? 1231 : 1237);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        this.f4307g.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        f1 node2 = (f1) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.H0 = this.f4302b;
        node2.I0 = this.f4303c;
        node2.J0 = this.f4304d;
        node2.K0 = this.f4305e;
        node2.L0 = this.f4306f;
    }
}
