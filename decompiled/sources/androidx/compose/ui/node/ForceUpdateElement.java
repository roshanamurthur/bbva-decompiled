package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NodeChain.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/ForceUpdateElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class ForceUpdateElement extends ModifierNodeElement<Modifier.Node> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ModifierNodeElement<?> f16771b;

    public ForceUpdateElement(@NotNull ModifierNodeElement<?> original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f16771b = original;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public final Modifier.Node create() {
        throw new IllegalStateException("Shouldn't be called");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForceUpdateElement) && Intrinsics.areEqual(this.f16771b, ((ForceUpdateElement) obj).f16771b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f16771b.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ForceUpdateElement(original=" + this.f16771b + RootService.CLOSE_BRACKET;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(@NotNull Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        throw new IllegalStateException("Shouldn't be called");
    }
}
