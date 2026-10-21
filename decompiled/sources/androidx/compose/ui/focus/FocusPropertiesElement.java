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
import x0.f;

/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lx0/f;", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class FocusPropertiesElement extends ModifierNodeElement<f> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<FocusProperties, Unit> f15492b;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusPropertiesElement(@NotNull Function1<? super FocusProperties, Unit> scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f15492b = scope;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        Function1<FocusProperties, Unit> focusPropertiesScope = this.f15492b;
        Intrinsics.checkNotNullParameter(focusPropertiesScope, "focusPropertiesScope");
        f fVar = new f();
        fVar.H0 = focusPropertiesScope;
        return fVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && Intrinsics.areEqual(this.f15492b, ((FocusPropertiesElement) obj).f15492b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f15492b.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", "focusProperties").set("scope", this.f15492b);
    }

    @NotNull
    public final String toString() {
        return ci.a.c(new StringBuilder("FocusPropertiesElement(scope="), this.f15492b, RootService.CLOSE_BRACKET);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        f node2 = (f) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        Function1<FocusProperties, Unit> function1 = this.f15492b;
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        node2.H0 = function1;
    }
}
