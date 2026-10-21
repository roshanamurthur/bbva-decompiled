package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import g1.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OnPlacedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnPlacedElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lg1/p;", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class OnPlacedElement extends ModifierNodeElement<p> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<LayoutCoordinates, Unit> f16640b;

    /* JADX WARN: Multi-variable type inference failed */
    public OnPlacedElement(@NotNull Function1<? super LayoutCoordinates, Unit> onPlaced) {
        Intrinsics.checkNotNullParameter(onPlaced, "onPlaced");
        this.f16640b = onPlaced;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        Function1<LayoutCoordinates, Unit> callback = this.f16640b;
        Intrinsics.checkNotNullParameter(callback, "callback");
        p pVar = new p();
        pVar.H0 = callback;
        return pVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnPlacedElement) && Intrinsics.areEqual(this.f16640b, ((OnPlacedElement) obj).f16640b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f16640b.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", "onPlaced").set("onPlaced", this.f16640b);
    }

    @NotNull
    public final String toString() {
        return ci.a.c(new StringBuilder("OnPlacedElement(onPlaced="), this.f16640b, RootService.CLOSE_BRACKET);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        p node2 = (p) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        Function1<LayoutCoordinates, Unit> function1 = this.f16640b;
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        node2.H0 = function1;
    }
}
