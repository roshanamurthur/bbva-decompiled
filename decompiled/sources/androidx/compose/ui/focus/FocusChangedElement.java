package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FocusChangedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lx0/a;", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class FocusChangedElement extends ModifierNodeElement<x0.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<FocusState, Unit> f15464b;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedElement(@NotNull Function1<? super FocusState, Unit> onFocusChanged) {
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        this.f15464b = onFocusChanged;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        Function1<FocusState, Unit> onFocusChanged = this.f15464b;
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        x0.a aVar = new x0.a();
        aVar.H0 = onFocusChanged;
        return aVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && Intrinsics.areEqual(this.f15464b, ((FocusChangedElement) obj).f15464b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f15464b.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", "onFocusChanged").set("onFocusChanged", this.f15464b);
    }

    @NotNull
    public final String toString() {
        return ci.a.c(new StringBuilder("FocusChangedElement(onFocusChanged="), this.f15464b, RootService.CLOSE_BRACKET);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        x0.a node2 = (x0.a) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        Function1<FocusState, Unit> function1 = this.f15464b;
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        node2.H0 = function1;
    }
}
