package androidx.compose.foundation;

import androidx.annotation.RequiresApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SystemGestureExclusion.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ExcludeFromSystemGestureElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lt/q;", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class ExcludeFromSystemGestureElement extends ModifierNodeElement<t.q> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Function1<LayoutCoordinates, Rect> f3366b;

    /* JADX WARN: Multi-variable type inference failed */
    public ExcludeFromSystemGestureElement(@Nullable Function1<? super LayoutCoordinates, Rect> function1) {
        this.f3366b = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        t.q qVar = new t.q();
        qVar.H0 = this.f3366b;
        return qVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ExcludeFromSystemGestureElement)) {
            return false;
        }
        return Intrinsics.areEqual(this.f3366b, ((ExcludeFromSystemGestureElement) obj).f3366b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        Function1<LayoutCoordinates, Rect> function1 = this.f3366b;
        if (function1 != null) {
            return function1.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("systemGestureExclusion");
        Function1<LayoutCoordinates, Rect> function1 = this.f3366b;
        if (function1 != null) {
            inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("exclusion", function1);
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        t.q node2 = (t.q) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.H0 = this.f3366b;
    }
}
