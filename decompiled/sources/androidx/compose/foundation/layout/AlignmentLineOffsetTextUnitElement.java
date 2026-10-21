package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lx/d;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
final class AlignmentLineOffsetTextUnitElement extends ModifierNodeElement<x.d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AlignmentLine f4148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Function1<InspectorInfo, Unit> f4151e;

    public AlignmentLineOffsetTextUnitElement() {
        throw null;
    }

    public AlignmentLineOffsetTextUnitElement(AlignmentLine alignmentLine, long j10, long j11, Function1 inspectorInfo) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f4148b = alignmentLine;
        this.f4149c = j10;
        this.f4150d = j11;
        this.f4151e = inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        AlignmentLine alignmentLine = this.f4148b;
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        x.d dVar = new x.d();
        dVar.H0 = alignmentLine;
        dVar.I0 = this.f4149c;
        dVar.J0 = this.f4150d;
        return dVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetTextUnitElement alignmentLineOffsetTextUnitElement = obj instanceof AlignmentLineOffsetTextUnitElement ? (AlignmentLineOffsetTextUnitElement) obj : null;
        if (alignmentLineOffsetTextUnitElement == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f4148b, alignmentLineOffsetTextUnitElement.f4148b) && TextUnit.m4567equalsimpl0(this.f4149c, alignmentLineOffsetTextUnitElement.f4149c) && TextUnit.m4567equalsimpl0(this.f4150d, alignmentLineOffsetTextUnitElement.f4150d);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return TextUnit.m4571hashCodeimpl(this.f4150d) + ((TextUnit.m4571hashCodeimpl(this.f4149c) + (this.f4148b.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        this.f4151e.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        x.d node2 = (x.d) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        AlignmentLine alignmentLine = this.f4148b;
        Intrinsics.checkNotNullParameter(alignmentLine, "<set-?>");
        node2.H0 = alignmentLine;
        node2.I0 = this.f4149c;
        node2.J0 = this.f4150d;
    }
}
