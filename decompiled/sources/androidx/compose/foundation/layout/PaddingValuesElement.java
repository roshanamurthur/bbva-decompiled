package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x.i1;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lx/i1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
final class PaddingValuesElement extends ModifierNodeElement<i1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PaddingValues f4324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<InspectorInfo, Unit> f4325c;

    public PaddingValuesElement(@NotNull PaddingValues paddingValues, @NotNull PaddingKt.e inspectorInfo) {
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f4324b = paddingValues;
        this.f4325c = inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        PaddingValues paddingValues = this.f4324b;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        i1 i1Var = new i1();
        i1Var.H0 = paddingValues;
        return i1Var;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f4324b, paddingValuesElement.f4324b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f4324b.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        this.f4325c.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        i1 node2 = (i1) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        PaddingValues paddingValues = this.f4324b;
        Intrinsics.checkNotNullParameter(paddingValues, "<set-?>");
        node2.H0 = paddingValues;
    }
}
