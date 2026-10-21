package androidx.compose.foundation.layout;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lx/c;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
final class AlignmentLineOffsetDpElement extends ModifierNodeElement<x.c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AlignmentLine f4144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Function1<InspectorInfo, Unit> f4147e;

    public AlignmentLineOffsetDpElement() {
        throw null;
    }

    public AlignmentLineOffsetDpElement(AlignmentLine alignmentLine, float f6, float f10, Function1 inspectorInfo) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f4144b = alignmentLine;
        this.f4145c = f6;
        this.f4146d = f10;
        this.f4147e = inspectorInfo;
        if ((f6 < 0.0f && !Dp.m4394equalsimpl0(f6, Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM())) || (f10 < 0.0f && !Dp.m4394equalsimpl0(f10, Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM()))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        AlignmentLine alignmentLine = this.f4144b;
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        x.c cVar = new x.c();
        cVar.H0 = alignmentLine;
        cVar.I0 = this.f4145c;
        cVar.J0 = this.f4146d;
        return cVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f4144b, alignmentLineOffsetDpElement.f4144b) && Dp.m4394equalsimpl0(this.f4145c, alignmentLineOffsetDpElement.f4145c) && Dp.m4394equalsimpl0(this.f4146d, alignmentLineOffsetDpElement.f4146d);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Dp.m4395hashCodeimpl(this.f4146d) + u.a(this.f4145c, this.f4144b.hashCode() * 31, 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        this.f4147e.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        x.c node2 = (x.c) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        AlignmentLine alignmentLine = this.f4144b;
        Intrinsics.checkNotNullParameter(alignmentLine, "<set-?>");
        node2.H0 = alignmentLine;
        node2.I0 = this.f4145c;
        node2.J0 = this.f4146d;
    }
}
