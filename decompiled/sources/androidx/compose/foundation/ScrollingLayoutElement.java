package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.l0;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lt/l0;", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class ScrollingLayoutElement extends ModifierNodeElement<l0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ScrollState f3479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3481d;

    public ScrollingLayoutElement(@NotNull ScrollState scrollState, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        this.f3479b = scrollState;
        this.f3480c = z10;
        this.f3481d = z11;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        ScrollState scrollerState = this.f3479b;
        Intrinsics.checkNotNullParameter(scrollerState, "scrollerState");
        l0 l0Var = new l0();
        l0Var.H0 = scrollerState;
        l0Var.I0 = this.f3480c;
        l0Var.J0 = this.f3481d;
        return l0Var;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return Intrinsics.areEqual(this.f3479b, scrollingLayoutElement.f3479b) && this.f3480c == scrollingLayoutElement.f3480c && this.f3481d == scrollingLayoutElement.f3481d;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (((this.f3479b.hashCode() * 31) + (this.f3480c ? 1231 : 1237)) * 31) + (this.f3481d ? 1231 : 1237);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", "layoutInScroll").set("state", this.f3479b);
        com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(this.f3480c, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "isReversed", inspectorInfo).set("isVertical", Boolean.valueOf(this.f3481d));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        l0 node2 = (l0) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        ScrollState scrollState = this.f3479b;
        Intrinsics.checkNotNullParameter(scrollState, "<set-?>");
        node2.H0 = scrollState;
        node2.I0 = this.f3480c;
        node2.J0 = this.f3481d;
    }
}
