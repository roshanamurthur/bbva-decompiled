package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import g1.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OnGloballyPositionedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lg1/n;", "ui_release"}, k = 1, mv = {1, 8, 0})
final class OnGloballyPositionedElement extends ModifierNodeElement<n> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<LayoutCoordinates, Unit> f16639b;

    /* JADX WARN: Multi-variable type inference failed */
    public OnGloballyPositionedElement(@NotNull Function1<? super LayoutCoordinates, Unit> onGloballyPositioned) {
        Intrinsics.checkNotNullParameter(onGloballyPositioned, "onGloballyPositioned");
        this.f16639b = onGloballyPositioned;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        Function1<LayoutCoordinates, Unit> callback = this.f16639b;
        Intrinsics.checkNotNullParameter(callback, "callback");
        n nVar = new n();
        nVar.H0 = callback;
        return nVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnGloballyPositionedElement)) {
            return false;
        }
        return Intrinsics.areEqual(this.f16639b, ((OnGloballyPositionedElement) obj).f16639b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f16639b.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", "onGloballyPositioned").set("onGloballyPositioned", this.f16639b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        n node2 = (n) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        Function1<LayoutCoordinates, Unit> function1 = this.f16639b;
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        node2.H0 = function1;
    }
}
