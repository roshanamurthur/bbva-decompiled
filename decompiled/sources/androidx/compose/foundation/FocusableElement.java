package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.u;
import t.v;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lt/v;", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class FocusableElement extends ModifierNodeElement<v> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final MutableInteractionSource f3367b;

    public FocusableElement(@Nullable MutableInteractionSource mutableInteractionSource) {
        this.f3367b = mutableInteractionSource;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new v(this.f3367b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return Intrinsics.areEqual(this.f3367b, ((FocusableElement) obj).f3367b);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        MutableInteractionSource mutableInteractionSource = this.f3367b;
        if (mutableInteractionSource != null) {
            return mutableInteractionSource.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", "focusable").set("enabled", Boolean.TRUE);
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("interactionSource", this.f3367b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        FocusInteraction.Focus focus;
        v node2 = (v) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        u uVar = node2.L0;
        MutableInteractionSource mutableInteractionSource = uVar.H0;
        MutableInteractionSource mutableInteractionSource2 = this.f3367b;
        if (Intrinsics.areEqual(mutableInteractionSource, mutableInteractionSource2)) {
            return;
        }
        MutableInteractionSource mutableInteractionSource3 = uVar.H0;
        if (mutableInteractionSource3 != null && (focus = uVar.I0) != null) {
            mutableInteractionSource3.tryEmit(new FocusInteraction.Unfocus(focus));
        }
        uVar.I0 = null;
        uVar.H0 = mutableInteractionSource2;
    }
}
